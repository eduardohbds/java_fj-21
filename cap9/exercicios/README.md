## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

### 8.7	EXERCÍCIOS:	IMPORTANDO	UM	JAR
1.	 Importemos	um	JAR	que	contém	a	interface	gráfica	do	usuário	para	o	nosso	sistema	de	contas.
No vscode siga esse [link](https://stackoverflow.com/questions/56618264/import-jar-in-visual-studio-code-classpath) ou esse para projetos [maven](https://pt.stackoverflow.com/questions/356661/adicionar-biblioteca-externa-jar-para-projeto-maven-usando-vscode)

2.	 Para	verificarmos	se	a	importação	deu	certo,	chamaremos	uma	classe	da	biblioteca	importada	para
exibir	uma	janela	de	boas-vindas.
Crie	uma	classe		TestaJar		no	pacote		br.com.caelum.contas.main	.
Crie	também	o	método		main	.
3.	 Dentro	do	método	criado,	invocaremos	o	método		main		da	classe		OlaMundo	,	que	existe	no	JAR
importado.	Seu	código	deve	ficar	dessa	maneira:
package	br.com.caelum.contas.main;
```java
import	br.com.caelum.javafx.api.main.OlaMundo;
public class TestaJar	{
public	static	void	main(String[]	args) {
					OlaMundo.main(args);
	}
}
```

4.	 Execute	a	sua	aplicação	e	veja	se	apareceu	uma	janela	de	boas-vindas	como	a	seguinte:
