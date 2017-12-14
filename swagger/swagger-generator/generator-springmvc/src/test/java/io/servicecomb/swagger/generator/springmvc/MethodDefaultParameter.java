/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.swagger.generator.springmvc;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(path = "MethodDefaultParameter")
public class MethodDefaultParameter {

  @RequestMapping(method = RequestMethod.PUT, path = "usingRequestMapping")
  public void usingRequestMapping(int query) {
  }

  @GetMapping(path = "usingGetMapping")
  public void usingGetMapping(int query) {
  }

  @PutMapping(path = "usingPutMapping")
  public void usingPutMapping(int query) {
  }

  @PostMapping(path = "usingPostMapping")
  public void usingPostMapping(int query) {
  }

  @PatchMapping(path = "usingPatchMapping")
  public void usingPatchMapping(int query) {
  }

  @DeleteMapping(path = "usingDeleteMapping")
  public void usingDeleteMapping(int query) {
  }
}
