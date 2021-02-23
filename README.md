# step1：进入arthas项目，以以下方式打包到本地
## linux
打64位linux包(默认)：
```
mvn clean compile package -DskipTests=true -Plinux64
```
打32位linux包：
```
mvn clean compile package -DskipTests=true -Plinux32
```
## macos
打64位macos包
```
mvn clean compile package -DskipTests=true -Pmacos64
```
打32位macos包：
```
mvn clean compile package -DskipTests=true -Pmacos32
```
## windows
打64位windows包：
```
mvn clean compile package -DskipTests=true -Pwindows64
```
打32位windows包：
```
mvn clean compile package -DskipTests=true -Pwindows32
```
# step2：添加依赖
```
<dependency>
    <groupId>com.taobao.arthas</groupId>
    <artifactId>arthas-beans</artifactId>
    <version>3.4.7-SNAPSHOT</version>
    <classifier>macos-x64</classifier>
</dependency>
```
如果您是linux32位，把classifier改成`<classifier>linux-x86</classifier>`；

如果您是macos32位，把classifier改成`<classifier>macos-x86</classifier>`；

如果您是windows32位，把classifier改成`<classifier>windows-x86</classifier>`；

如果您是windows64位，把classifier改成`<classifier>windows-x64</classifier>`；

# step3：使用`JvmUtils`
```java
import com.vdian.vclub.JvmUtils;

public class JvmUtilsTest {
    public static void main(String[] args) {
        System.out.println(JvmUtils.check());
    }
}
```
