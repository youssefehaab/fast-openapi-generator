/*
 * Copyright 2025 Youssef Ehab Gamaleldin
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
package com.chesterford;

import org.openapitools.codegen.languages.SpringCodegen;

public class FastSpringCodegen extends SpringCodegen {

  private final static String GENERATOR_NAME = "fast-spring";
  private final static String CUSTOM_TEMPLATE_DIRECTORY = "spring/templates";
  private final static String TEMPLATE_FILE_API_SERVICE_MUSTACHE = "apiService.mustache";
  private static final String GENERATED_FILE_SERVICE_JAVA = "Service.java";


  public FastSpringCodegen() {
    super();
    this.templateDir = CUSTOM_TEMPLATE_DIRECTORY;
    this.embeddedTemplateDir = this.templateDir;
  }

  @Override
  public String getName() {
    return GENERATOR_NAME;
  }

  @Override
  public void processOpts() {
    super.processOpts();
    apiTemplateFiles.put(TEMPLATE_FILE_API_SERVICE_MUSTACHE, GENERATED_FILE_SERVICE_JAVA);
  }

}
