/*
 * Copyright 2017 Google Inc.
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

package com.google.cloud.tools.eclipse.appengine.validation;

import org.eclipse.core.resources.IMarker;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;

/**
 * An element that will receive an App Engine configuration error marker. 
 */
class AppEngineDeprecatedElement extends ElementProblem {
  
  AppEngineDeprecatedElement(String elementName, DocumentLocation start, int length) {
    super(
      AppEngineWebProblems.getDeprecatedElementMessage(elementName),
      AppEngineWebProblems.getMarkerId(elementName),
      IMarker.SEVERITY_WARNING,
      IMessage.NORMAL_SEVERITY,
      start,
      length,
      AppEngineWebProblems.getQuickAssistProcessor(elementName));
  }
  
}