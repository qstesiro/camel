/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.main;

import org.apache.camel.CamelContext;
import org.apache.camel.vault.AwsVaultConfiguration;
import org.apache.camel.vault.GcpVaultConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainVaultTest {

    @Test
    public void testMainAws() throws Exception {
        Main main = new Main();

        main.addInitialProperty("camel.vault.aws.accessKey", "myKey");
        main.addInitialProperty("camel.vault.aws.secretKey", "mySecret");
        main.addInitialProperty("camel.vault.aws.region", "myRegion");
        main.addInitialProperty("camel.vault.aws.defaultCredentialsProvider", "false");

        main.start();

        CamelContext context = main.getCamelContext();
        assertNotNull(context);

        AwsVaultConfiguration cfg = context.getVaultConfiguration().aws();
        assertNotNull(cfg);

        Assertions.assertEquals("myKey", cfg.getAccessKey());
        Assertions.assertEquals("mySecret", cfg.getSecretKey());
        Assertions.assertEquals("myRegion", cfg.getRegion());
        Assertions.assertEquals(false, cfg.isDefaultCredentialsProvider());

        main.stop();
    }

    @Test
    public void testMainAwsFluent() throws Exception {
        Main main = new Main();
        main.configure().vault().aws()
                .withAccessKey("myKey")
                .withSecretKey("mySecret")
                .withRegion("myRegion")
                .withDefaultCredentialsProvider(false)
                .end();

        main.start();

        CamelContext context = main.getCamelContext();
        assertNotNull(context);

        AwsVaultConfiguration cfg = context.getVaultConfiguration().aws();
        assertNotNull(cfg);

        Assertions.assertEquals("myKey", cfg.getAccessKey());
        Assertions.assertEquals("mySecret", cfg.getSecretKey());
        Assertions.assertEquals("myRegion", cfg.getRegion());
        Assertions.assertEquals(false, cfg.isDefaultCredentialsProvider());

        main.stop();
    }

    @Test
    public void testMainGcp() throws Exception {
        Main main = new Main();

        main.addInitialProperty("camel.vault.gcp.serviceAccountKey", "file:////myKey");
        main.addInitialProperty("camel.vault.gcp.projectId", "gcp-project");

        main.start();

        CamelContext context = main.getCamelContext();
        assertNotNull(context);

        GcpVaultConfiguration cfg = context.getVaultConfiguration().gcp();
        assertNotNull(cfg);

        Assertions.assertEquals("file:////myKey", cfg.getServiceAccountKey());
        Assertions.assertEquals("gcp-project", cfg.getProjectId());
        Assertions.assertEquals(false, cfg.isUseDefaultInstance());
        main.stop();
    }

    @Test
    public void testMainGcpFluent() throws Exception {
        Main main = new Main();
        main.configure().vault().gcp()
                .withServiceAccountKey("file:////myKey")
                .withProjectId("gcp-project")
                .end();

        main.start();

        CamelContext context = main.getCamelContext();
        assertNotNull(context);

        GcpVaultConfiguration cfg = context.getVaultConfiguration().gcp();
        assertNotNull(cfg);

        Assertions.assertEquals("file:////myKey", cfg.getServiceAccountKey());
        Assertions.assertEquals("gcp-project", cfg.getProjectId());
        Assertions.assertEquals(false, cfg.isUseDefaultInstance());
        main.stop();
    }

}
