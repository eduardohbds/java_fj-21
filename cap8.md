## FERRAMENTAS: JAR E JAVADOC

### 8.1 ARQUIVOS, BIBLIOTECAS E VERSÕES

O jeito mais simples de trabalhar com um conjunto de classes é compactá-lo em um arquivo só. O
formato de compactação padrão é o  ZIP  com a extensão do arquivo compactado  JAR 
Para criar um arquivo JAR do nosso programa de banco, de nome  banco.jar , basta ir ao diretório
em que estão contidas as classes dos pacotes  br.com.caelum.util  e  br.com.caelum.banco  e usar o
comando a seguir:

```
jar -cvf banco.jar br/com/caelum/util/*.class br/com/caelum/banco/*.class
```

Com o intuito de usar esse arquivo  banco.jar  para rodar o  TesteDoBanco , basta rodar o  java 
com o arquivo  jar  como argumento:

Para adicionar mais arquivos  .jar  que podem ser bibliotecas ao programa, basta rodar o Java da
seguinte maneira:
```
java -classpath biblioteca1.jar;biblioteca2.jar NomeDaClasse
```
Lembre-se de que o ponto e vírgula utilizado só é válido em ambiente Windows. Em Linux, Mac e
outros Unix, utiliza-se os dois pontos (varia de acordo com o sistema operacional).


#### CRIANDO UM .JAR AUTOMATICAMENTE
Existem diversas ferramentas que servem para automatizar o processo de deploy, que consiste
em compilar, gerar documentação, bibliotecas, etc. As duas mais famosas são o **ANT e o MAVEN**,
ambas são projetos do grupo Apache

### 8.2 GERANDO O JAR PELO ECLIPSE
### 8.2 [Maven] Gerando um Arquivo JAR Executável

Como exemplo, vamos utilizar o archetype Quickstart para criar um projeto simples. Chamaremos esse projeto de simple-project.
```
$ mvn archetype:generate -DgroupId=org.andgomes -DartifactId=simple-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
Como sabemos, no diretório **src/main** é criado o arquivo **App.java**, uma classe de exemplo que o archetype cria quando executamos o **goal generate**. Vamos aproveitar que essa classe já possui um método *main* e iremos utilizá-la como classe principal do projeto.
```java
package org.andgomes;

public class App {  
    public static void main(String[] args) {
        System.out.println("Hello World!"); 
    }
}
```

<p>Agora vamos configurar o plugin <strong>Jar</strong> na seção build do POM para que, ao criar o arquivo distribuível, seja adicionado no MANIFEST o parâmetro de classe principal. É o plugin <strong>Jar</strong> que, através do <strong>goal jar</strong>, faz o packaging do projeto e cria todos os arquivos necessários, entre eles o próprio MANIFEST.</p>Se lembre de mudar a tag <mainclass> para o a main do seu projeto.

```xml
<project ...>
  ...
  <build>
    <plugins>
      ...
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <version>3.0.2</version>
        <configuration>
          <archive>
            <manifest>
              <mainClass>org.andgomes.App</mainClass>
            </manifest>
          </archive>
        </configuration>
      </plugin>  
      ...
    </plugins>
  </build>
  ...
</project>
```
Vamos invocar a fase package e verificar o conteúdo do arquivo MANIFEST criado pelo plugin.
```
$ mvn package
```
Para ver o conteúdo do MANIFEST, extraia o arquivo JAR e entre no diretório META-INF/.
```
Manifest-Version: 1.0
Built-By: anderson
Build-Jdk: 1.7.0_121
Created-By: Apache Maven 3.3.9
Main-Class: org.andgomes.App
```

Como esperado, o MANIFEST criado tem um parâmetro Main-Class com o nome da classe principal que definimos no arquivo POM. Quando executarmos o arquivo JAR, o método main da classe App será executado. No nosso caso, a classe apenas imprime a string “Hello World!” no terminal.

```
$ cd simple-project/target
$ java -jar simple-project-1.0-SNAPSHOT.jar
Hello World!
```
### 8.3 JAVADOC

E,  a  partir  da  internet,  você  pode  acessar  por  meio  do  link:
[http://download.java.net/jdk8/docs/api/index.html](http://download.java.net/jdk8/docs/api/index.html)
No  site  da  Oracle,  você  pode  (e  deve)  baixar  a  documentação  das  bibliotecas  do  Java,
frequentemente referida como Javadoc ou API (sendo na verdade a documentação da API)
Repare que métodos e atributos privados não estão aí. O importante é documentar o que sua classe
faz,  e  não  como  ela  o  faz: 

### 8.4 GERANDO O JAVADOC

GERANDO O JAVADOC no VSCODE
Instale o plugin que ele funciona da mesma maneira que o eclipse[Javadoc Tools](https://marketplace.visualstudio.com/items?itemName=madhavd1.javadoc-tools)

