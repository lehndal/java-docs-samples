/*
 * Copyright 2020 Google LLC
 *
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

package functions.eventpojos

// [START functions_helloworld_pubsub_message]
class PubSubMessage { // Cloud Functions uses GSON to populate this object.
  // Field types/names are specified by Cloud Functions
  // Changing them may break your code!
  private var data : String = null
  private var attributes : Map[String, String] = null
  private var messageId : String = null
  private var publishTime : String = null
  // [END functions_helloworld_pubsub_message]

  // Manually-defined getters and setters are required for
  // inter-operation with Java files, but are not necessary
  // for pure-Scala codebases
  def getData = data

  def setData(data: String): Unit = {
    this.data = data : String;
  }
  // [END functions_helloworld_pubsub_message]
}
// [END functions_helloworld_pubsub_message]