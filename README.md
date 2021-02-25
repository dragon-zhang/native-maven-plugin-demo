# step1：进入arthas项目
# step2：打64位包到本地
打包命令如下(自动识别系统)：
```
mvn clean compile package install -DskipTests=true -U
```
# step3：添加profile
```
<profiles>
    <!-- macos -->
    <profile>
        <id>macos</id>
        <activation>
            <os>
                <family>mac</family>
            </os>
        </activation>
        <properties>
            <os_family>macos</os_family>
        </properties>
    </profile>

    <!-- linux -->
    <profile>
        <id>linux</id>
        <activation>
            <os>
                <name>linux</name>
            </os>
        </activation>
        <properties>
            <os_family>linux</os_family>
        </properties>
    </profile>

    <!-- windows -->
    <profile>
        <id>windows</id>
        <activation>
            <os>
                <family>windows</family>
            </os>
        </activation>
        <properties>
            <os_family>windows</os_family>
        </properties>
    </profile>
</profiles>
```
# step4：添加依赖
```
<dependencies>
    <dependency>
        <groupId>com.taobao.arthas</groupId>
        <artifactId>arthas-beans</artifactId>
        <version>3.4.7-SNAPSHOT</version>
        <classifier>${os_family}-${os.arch}</classifier>
    </dependency>
</dependencies>
```
# step5：使用`JvmUtils`
```java
import com.vdian.vclub.JvmUtils;

public class JvmUtilsTest {
    public static void main(String[] args) {
        System.out.println(JvmUtils.check());
    }
}
```
