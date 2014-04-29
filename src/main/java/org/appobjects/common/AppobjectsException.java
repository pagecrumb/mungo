/**
 *
 * Copyright (c) 2014 Kerby Martino and others. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.appobjects.common;

@SuppressWarnings("serial")
public class AppobjectsException extends RuntimeException {
	public AppobjectsException() {
		super();
	}
	public AppobjectsException(String message){
		super(message);
	}
	
	public AppobjectsException(String message, Throwable cause){
		super(message, cause);
	}	

	public AppobjectsException(int code, String message){
		super("Exception " + code + " " + message);
	}

    public AppobjectsException(Throwable cause) {
        super(cause);
    }
}