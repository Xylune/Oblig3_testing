#Oblig 3

First I started with the "Maven starter workflow" that I found [here](
https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-maven)

I then had to change the java version to 17 to fix a mismatch that occurred upon trying to run the action.
Then I added the "run tests" step by using 
>run: mvn -B test --file pom.xml

which was recommended to me by student assistant as this one worked.

Then I had an issue where github actions found my tests, but it told me
>Running IsLeapYearTest\
Tests run: 0, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec

which I fixed by adding a maven surefire plugin to my pom.xml file