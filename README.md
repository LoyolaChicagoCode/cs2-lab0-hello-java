[![Build Status](https://travis-ci.org/LoyolaChicagoCode/cs2-lab0-hello-java.svg?branch=master)](https://travis-ci.org/LoyolaChicagoCode/cs2-lab0-hello-java)

This build will always fail because it has 2 examples of failing tests:
one based on the source code, and one based on an incorrect test.
The status badge is here just to demonstrate continuous integration (CI).

# Loyola COMP 271 Lab 0

# Individual project

Collaborate with your classmates on a conceptual level but do not share code.
Submit individually.

# Learning Objectives

* Simple hello world example
* Get started with Git source code management
* Make sure you can access the course examples on GitHub
* Verify that you have a working development environment
* Make sure you can use your development environment to modify and update your projects on GitHub
* Use the Maven command-line build tool for Java
* Understand the basics of Test-Driven Development (TDD)
* Use JUnit for automated unit testing in Java
* Continuous integration with Travis

# GitHub account creation and repository import

1. Create a GitHub account.

1. Request the [GitHub Student Developer Pack](https://education.github.com/pack/join) using your official Loyola email address (this should give you unlimited private repositories for free).

1. Copy this existing [cs2-lab0-hello-java](https://github.com/LoyolaChicagoCode/cs2-lab0-hello-java) example in these steps:

   - Copy the repo URL https://github.com/LoyolaChicagoCode/cs2-lab0-hello-java.
   - On the GitHub page, click the big plus sign in the top right corner.
   - Select import repository.
   - Paste the URL as the old repository's URL.
   - Enter `cs2-lab0-hello-java` as the name of your new repository.
   - Be sure to mark the new repository as private. 
    If this does not work, ensure that you have properly requested the Student Developer Pack. 
    Making your repository private is not critical for this project but will be required beyond this project for the rest of the course.
  
1. Before you continue working on this project, give the TA and the instructor access to your repo by following these steps:

   - Press settings (the little gear symbol) on the right of the top menu bar.
   - Under collaborators and teams add us as collaborators with read/write privileges.
   - Notification will occur automatically.

# Codenvy workspace creation

1. Use your GitHub, Visual Studio Team Services, or Google+ account to log into Codenvy.

   - If you do not have any of these accounts, create a GitHub account. Please see below for more information on GitHub.

1. Create a new workspace with the following settings:

   - New from blank …
   - Create new workspace from stack > BLANK
   - Name: luccs271course
   - RAM: 3GB

1. Wait for the workspace to become available. Now you have a persistent, cloud-based, standard Ubuntu/Linux command-line environment that you can work in and come back to from any computer.

1. Verify that your user name and email address are available to Codenvy. In the horizontal top-level menu, navigate to

        Profile > Preferences > Git > Committer
	
   and enter any missing information. Use an email address that is associated with your GitHub account.
   Then press *save* and close the popup.
   
1. Create an SSH key to give Codenvy write access to your GitHub repositories. In the horizontal top-level menu, navigate to

        Profile > Preferences > VCS > SSH
	
   Press the small square *octocat* button (GitHub's logo) in the bottom right corner of the popup.
   You should now see a key labeled `github.com` on the list of keys in the right half of the popup.
   Then press *save* and close the popup.

1. For highly convenient integration of git username and email and SSH keys between IDE profile and console, enable the git agent (this will restart your workspace):

        Workspaces > settings for desired workspace (gear wheel) > Agents > Git credentials

# TDD with Codenvy, Maven, and JUnit

1. On the web page for your own private remote GitHub repository `cs2-lab0-hello-java`, use the green *clone or download* button to copy the SSH-based repository URL.

1. In Codenvy, choose 

        Workspace > Import project
	
   and paste the copied URL into the right field.
   Verify that the project name is also `cs2-lab0-hello-java`.
   
1. Now click in the terminal window and navigate on the command line to your project directory:

        cd /projects/cs2-lab0-hello-java
	
   (The command prompt should change accordingly.)

1. To compile the project using Maven, enter

        mvn test-compile
	
   You should see `BUILD SUCCESS` toward the end of the output.
   If not, look more closely at the output to see what exactly is wrong, e.g., syntax errors in the Java sources.
   
1. To run the main program, enter

        mvn exec:java
	
1. To run the tests on the command line, enter

        mvn test
	
   You will see the test results in the output. 
   At the end, you will see a summary telling you how many tests have any of the following results:
   
      - PASS (green): the test succeeded
      - FAIL (orange): an assertion in the test failed, meaning that the code you are testing did not behave as expected
      - ERROR (red): a more severe error occurred before any of the assertions were tried
	
1. To run the tests through the IDE

    - In the project explorer window, right-click on the project node `cs2-lab0-hello-java`, then choose
    
          Run Tests > Run JUnit Test
	  
      If this menu item is disabled, you probably still need to compile the project using `mvn test-compile` in the terminal (see above).
      
1. Now get the tests to pass by 

    - fixing the system under test (SUT), i.e., any incorrect method(s) in the `HelloWorld` class
    - fixing any erroneous tests
    
1. Congratulations, you have now fixed your code!

        

# Submission

When your project is ready to grade, submit your complete cs371f18p0 repository URL including your GitHub userid on Sakai as an inline submission. 

# Grading criteria

Total 3 points:

- (1 point) submission via GitHub repo (should still show the history before clone)
- (0.5 point) leave project structure intact
- (0.5 point) remove the two erroneous tests
- (1 point) make the other tests pass without modifying anything else in src/test
