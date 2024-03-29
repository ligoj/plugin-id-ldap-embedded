# :link: Ligoj embedded LDAP plugin [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.ligoj.plugin/plugin-id-ldap-embedded/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.ligoj.plugin/plugin-id-ldap-embedded)
Embedded LDAP plugin ready to use with default configuration

[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=org.ligoj.plugin%3Aplugin-id-ldap-embedded&metric=coverage)](https://sonarcloud.io/dashboard?id=org.ligoj.plugin%3Aplugin-id-ldap-embedded)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?metric=alert_status&project=org.ligoj.plugin:plugin-id-ldap-embedded)](https://sonarcloud.io/dashboard/index/org.ligoj.plugin:plugin-id-ldap-embedded)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/c6b381ff12b145198058c78cf4b503fd)](https://www.codacy.com/gh/ligoj/plugin-id-ldap-embedded?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ligoj/plugin-id-ldap-embedded&amp;utm_campaign=Badge_Grade)
[![CodeFactor](https://www.codefactor.io/repository/github/ligoj/plugin-id-ldap-embedded/badge)](https://www.codefactor.io/repository/github/ligoj/plugin-id-ldap-embedded)
[![Known Vulnerabilities](https://snyk.io/test/github/ligoj/plugin-id-ldap-embedded/badge.svg)](https://snyk.io/test/github/ligoj/plugin-id-ldap-embedded)
[![License](http://img.shields.io/:license-mit-blue.svg)](http://fabdouglas.mit-license.org/)

[Ligoj](https://github.com/ligoj/ligoj) Embedded LDAP plugin, and extending [ID plugin](https://github.com/ligoj/plugin-id-ldap)

This an embedded LDAP server, started within the API container and load a customizable LDIF import. This is the more simple way to get started with LDAP.

Dev section :
When you use load plugin from your IDE and not from the `.ligoj` home, you must complete the classpath with the transitive dependencies Maven add and may not be in the classpath. Either add `plugin-id-ldap-embedded` in the `pom.xml` of the `app-api` project, either add these libraries :
- org/springframework/security/spring-security-ldap/5.0.0.RELEASE/spring-security-ldap-5.0.0.RELEASE.jar
- org/apache/directory/shared/shared-ldap/0.9.15/shared-ldap-0.9.15.jar
- org/apache/directory/server/apacheds-protocol-ldap/1.5.5/apacheds-protocol-ldap-1.5.5.jar
- org/springframework/ldap/spring-ldap-core/2.3.2.RELEASE/spring-ldap-core-2.3.2.RELEASE.jar
- org/springframework/ldap/spring-ldap-core-tiger/2.3.2.RELEASE/spring-ldap-core-tiger-2.3.2.RELEASE.jar
- org/apache/directory/server/apacheds-core-shared/1.5.5/apacheds-core-shared-1.5.5.jar
- bouncycastle/bcprov-jdk15/140/bcprov-jdk15-140.jar
- org/apache/mina/mina-core/2.0.0-M6/mina-core-2.0.0-M6.jar
- org/apache/directory/server/apacheds-core/1.5.5/apacheds-core-1.5.5.jar
- org/apache/directory/server/apacheds-core-entry/1.5.5/apacheds-core-entry-1.5.5.jar
- org/apache/directory/server/apacheds-core-constants/1.5.5/apacheds-core-constants-1.5.5.jar
- org/apache/directory/server/apacheds-utils/1.5.5/apacheds-utils-1.5.5.jar
- org/apache/directory/server/apacheds-schema-registries/1.5.5/apacheds-schema-registries-1.5.5.jar
- org/apache/directory/server/apacheds-schema-bootstrap/1.5.5/apacheds-schema-bootstrap-1.5.5.jar
- org/apache/directory/shared/shared-cursor/0.9.15/shared-cursor-0.9.15.jar
- org/apache/directory/shared/shared-ldap-constants/0.9.15/shared-ldap-constants-0.9.15.jar
- org/apache/directory/shared/shared-asn1/0.9.15/shared-asn1-0.9.15.jar
- org/apache/directory/shared/shared-asn1-codec/0.9.15/shared-asn1-codec-0.9.15.jar
- org/apache/directory/server/apacheds-jdbm/1.5.5/apacheds-jdbm-1.5.5.jar
- org/apache/directory/server/apacheds-jdbm-store/1.5.5/apacheds-jdbm-store-1.5.5.jar
- org/apache/directory/server/apacheds-xdbm-base/1.5.5/apacheds-xdbm-base-1.5.5.jar
- org/apache/directory/server/apacheds-xdbm-search/1.5.5/apacheds-xdbm-search-1.5.5.jar
- org/apache/directory/server/apacheds-xdbm-tools/1.5.5/apacheds-xdbm-tools-1.5.5.jar
- org/apache/directory/server/apacheds-protocol-shared/1.5.5/apacheds-protocol-shared-1.5.5.jar
- org/apache/directory/server/apacheds-bootstrap-partition/1.5.5/apacheds-bootstrap-partition-1.5.5.jar
- org/apache/directory/server/apacheds-bootstrap-extract/1.5.5/apacheds-bootstrap-extract-1.5.5.jar
- org/apache/directory/server/apacheds-core-avl/1.5.5/apacheds-core-avl-1.5.5.jar