/**
 * An Open Source Inventory and Sales Management System
 * Copyright (C) 2019 Edward P. Legaspi (https://github.com/czetsuya)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.terawarehouse.web.application;

import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @since
 * @version
 */
@RestController
@RequestMapping(path = "/iam/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class AccountController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello world";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(value = "/authorized")
    public String authorized() {
        return "hello";
    }

    @GetMapping(value = "/promoters")
    public String promoters() {
        return "hello world";
    }

    @GetMapping(value = "/supervisors")
    public String supervisors() {
        return "hello world";
    }
}
