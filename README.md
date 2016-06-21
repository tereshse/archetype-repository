Maven Archetype Repository
=========================================

Summary
-------
The project is a Maven archetype for sandbox java project

Generated project characteristics
-------------------------
* Java 8
* Guava
* Maven's project layout
* JUnit/Mockito/Assertj
* JHM

Prerequisites
-------------

- JDK 8
- Maven 3

Create a project
----------------

```bash
    mvn archetype:generate \
        -DarchetypeGroupId=com.github.tereshse \
        -DarchetypeArtifactId=archetype-repository \
        -DarchetypeVersion=1.0.0 \
        -DgroupId=groupid \
        -DartifactId=artifactId \
        -Dversion=version \
        -DarchetypeRepository=http://tereshse.github.io/archetype-repository
```

Create a new project in IntelliJ
--------------------------------

TBD

Install archetype locally
-------------------------

To install the archetype in your local repository execute the following commands:

```bash
    git clone https://github.com/tereshse/archetype-repository.git
    cd archetype-repository
    mvn clean install
```

Create a project from a local repository
----------------------------------------

Create a new empty directory for your project and navigate into it and then run:

```bash
    mvn archetype:generate \
        -DarchetypeGroupId=com.github.tereshse \
        -DarchetypeArtifactId=archetype-repository \
        -DarchetypeVersion=1.0.0 \
        -DgroupId=groupid \
        -DartifactId=my-artifactId \
        -Dversion=version
```
