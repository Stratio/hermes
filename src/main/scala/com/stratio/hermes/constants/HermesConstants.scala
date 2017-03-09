/*
 * Copyright (C) 2016 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stratio.hermes.constants

/**
 * Global constants used in the application.
 */
object HermesConstants {

  val DefaultLocale = "ALL"
  val AkkaClusterName = "hermes"
  val DecimalValue = 10
  val SupervisorStart = 5
  val SupervisorStop = 30

  val GeneratedTemplatesPrefix = "generated-templates"
  val GeneratedClassesPrefix = "generated-classes"
  val KafkaAvroSerializer = "io.confluent.kafka.serializers.KafkaAvroSerializer"

  val ZookeeperParentPath= "stratio/hermes"
  val ZookeeperConnection = "zookeeper.connection"
  val ZookeeperConnectionDefault = "master.mesos:2181"
  val ZookeeperConnectionTimeout = "zookeeper.connectionTimeout"
  val ZookeeperSessionTimeout = "zookeeper.sessionTimeout"
  val ZookeeperRetryAttempts = "zookeeper.retryAttempts"
  val ZookeeperRetryInterval = "zookeeper.retryInterval"
  val ZookeeperParentNodePath = "zookeeper.parentNodePath"

  val KafkaConfigNodePath = "kafka"
  val HermesConfigNodePath = "hermes"
  val TemplateNodePath = "template"
  val AvroConfigNodePath = "avro"
}
