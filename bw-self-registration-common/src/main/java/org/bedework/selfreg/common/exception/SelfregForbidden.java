/* ********************************************************************
    Licensed to Jasig under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Jasig licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License. You may obtain a
    copy of the License at:

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on
    an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied. See the License for the
    specific language governing permissions and limitations
    under the License.
*/
package org.bedework.selfreg.common.exception;

import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;


/** Forbidden exception thrown by selfreg classes
 *
 *   @author Mike Douglass   douglm@bedework.edu
 */
public class SelfregForbidden extends SelfregException {
  /** Constructor
   */
  public SelfregForbidden() {
    super(HttpServletResponse.SC_FORBIDDEN);
  }

  /** Constructor
   * @param msg
   */
  public SelfregForbidden(final String msg) {
    super(HttpServletResponse.SC_FORBIDDEN, msg);
  }

  /** Constructor
   *
   * @param errorTag
   */
  public SelfregForbidden(final QName errorTag) {
    super(HttpServletResponse.SC_FORBIDDEN, errorTag);
  }

  /** Constructor
   *
   * @param errorTag
   * @param msg
   */
  public SelfregForbidden(final QName errorTag, final String msg) {
    super(HttpServletResponse.SC_FORBIDDEN, errorTag, msg);
  }
}
