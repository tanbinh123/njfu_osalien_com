/*
 * Copyright 2020-2029 Coding实验室(https://osalien.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.osalien.njfu.framework.shiro.exception;

import com.osalien.njfu.framework.common.api.ApiCode;
import com.osalien.njfu.framework.common.exception.SpringBootPlusException;

/**
 * Shiro配置异常
 *
 * @author Coding实验室
 * @date 2019-09-29
 * @since 1.3.0.RELEASE
 **/
public class ShiroConfigException extends SpringBootPlusException {
	private static final long serialVersionUID = -4573955712491628431L;

	public ShiroConfigException(String message) {
        super(message);
    }

    public ShiroConfigException(Integer errorCode, String message) {
        super(errorCode, message);
    }

    public ShiroConfigException(ApiCode apiCode) {
        super(apiCode);
    }
}