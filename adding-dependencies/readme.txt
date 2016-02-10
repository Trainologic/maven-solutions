This is a basic exercise about adding dependencies. The current version of the App.java code uses log4j

Tasks:
	- Find the artifact coordinates for log4j 1.2.17 in maven central (search.maven.org)
	- Add the dependency to the pom.
	- Build it and run it with maven man package exec:java
	- open your browser at localhost:8888 to see the server
	- Check the dependencies running the following:
		mvn dependency:list
		mvn dependency:tree
	- Add the dependency on org.slf4j:nlog4j:1.2.25
	- Analyze the dependencies using:
		mvn dependency:analyze

	

