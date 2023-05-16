package com.Portfolio.config;

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.Portfolio.security.JwtAuthenticationEntryPoint;
import com.Portfolio.security.JwtAuthenticationFilter;
import com.Portfolio.service.CustomUserDetailsService;
import jakarta.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity(debug = false)
@EnableJpaRepositories(basePackages = "com.Portfolio.repository")
@EnableMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true)
public class WebSecurityConfig {

    private final CustomUserDetailsService userDetailsService;

    private final JwtAuthenticationEntryPoint jwtEntryPoint;

    @Autowired
    public WebSecurityConfig(CustomUserDetailsService userDetailsService, JwtAuthenticationEntryPoint jwtEntryPoint) {
        this.userDetailsService = userDetailsService;
        this.jwtEntryPoint = jwtEntryPoint;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
    return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public JwtAuthenticationFilter jwtAuthenticationFilter() {
        return new JwtAuthenticationFilter();
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
/*
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers("/v3/api-docs", "/configuration/ui", "/swagger-resources/**", "/configuration/**",
                "/swagger-ui/**", "/webjars/**");
    }
*/
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors()
                .and()
                .csrf().disable()
                .authorizeHttpRequests((requests) -> requests
                .requestMatchers(
                        new AntPathRequestMatcher("/"),
                        new AntPathRequestMatcher("/new/persona"),
                        new AntPathRequestMatcher("/ver/personas"),
                        new AntPathRequestMatcher("/ver/education"),
                        new AntPathRequestMatcher("/ver/experience"),
                        new AntPathRequestMatcher("/ver/jobtype"),
                        new AntPathRequestMatcher("/ver/projects"),
                        new AntPathRequestMatcher("/ver/skills"),
                	new AntPathRequestMatcher("/favicon.ico"),
                        new AntPathRequestMatcher("/**/*.json"),
                        new AntPathRequestMatcher("/**/*.xml"),
                        new AntPathRequestMatcher("/**/*.properties"),
                        new AntPathRequestMatcher("/**/*.woff2"),
                        new AntPathRequestMatcher("/**/*.woff"),
                        new AntPathRequestMatcher("/**/*.ttf"),
                        new AntPathRequestMatcher("/**/*.ttc"),
                        new AntPathRequestMatcher("/**/*.ico"),
                        new AntPathRequestMatcher("/**/*.bmp"),
                        new AntPathRequestMatcher("/**/*.png"),
                        new AntPathRequestMatcher("/**/*.gif"),
                        new AntPathRequestMatcher("/**/*.svg"),
                        new AntPathRequestMatcher("/**/*.jpg"),
                        new AntPathRequestMatcher("/**/*.jpeg"),
                        new AntPathRequestMatcher("/**/*.html"),
                        new AntPathRequestMatcher("/**/*.css"),
                        new AntPathRequestMatcher("/**/*.js")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/**/api/auth/**")).permitAll()
                .requestMatchers(new AntPathRequestMatcher("/v3/api-docs/**"), new AntPathRequestMatcher("/swagger-ui/**")).permitAll()
                .anyRequest().authenticated())
                .httpBasic();

        http.addFilterBefore((Filter) jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
