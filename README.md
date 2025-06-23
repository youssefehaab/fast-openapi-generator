# ⚡️ Fast OpenAPI Spring Generator

A minimal custom OpenAPI Generator extension for Spring Boot projects.  
This generator extends the official `spring` generator to introduce support for generating a `Service.java` interface using a custom `apiService.mustache` template.

---

## ✨ Features

- 🧩 Based on `SpringCodegen` from `openapi-generator`
- 🗂️ Uses a custom `templateDirectory` for override flexibility
- 🛠️ Adds `Service.java` class generation via custom `apiService.mustache`
- ⚡️ Generator name: `fast-spring`

---

## 🔧 How It Works

This custom generator:
- Extends the `SpringCodegen` class
- Overrides the `getName()` method to return `"fast-spring"`
- In the constructor, defines a new `templateDirectory`
- Overrides `processOpts()`:
    - Calls `super.processOpts()`
    - Appends `apiService.mustache` to the list of templates to render `Service.java`

---

## 📦 Usage with Maven Plugin

In your consumer project (`pom.xml`):

```xml
<plugin>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-generator-maven-plugin</artifactId>
  <version>${{OPENAPI_VERSION}}</version>
  <dependencies>
    <dependency>
      <groupId>com.chesterford</groupId>
      <artifactId>fast-openapi-generator</artifactId>
      <version>1.0.0</version
    </dependency>
  </dependencies>
  <executions>
    <execution>
      <goals>
        <goal>generate</goal>
      </goals>
    </execution>
  </executions>
  <configuration>
    <generatorName>fast-spring</generatorName>
    .
    .
    .
  </configuration>
</plugin>
```

## 📄 License

This project is licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).

