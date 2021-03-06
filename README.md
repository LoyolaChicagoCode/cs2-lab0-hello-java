[![Build Status](https://travis-ci.org/LoyolaChicagoCode/cs2-lab0-hello-java.svg?branch=master)](https://travis-ci.org/LoyolaChicagoCode/cs2-lab0-hello-java)

This build will always fail because it has two examples of failing tests:
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

This is a one-time step.

1. Create a GitHub account (if you do not have one already).

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

This is a one-time preparation step for this class.

1. Use your GitHub, Visual Studio Team Services, or Google+ account to log into Codenvy.

   - If you do not have any of these accounts, create a GitHub account. Please see below for more information on GitHub.

1. Create a new workspace with the following settings:

   - New from blank …
   - Create new workspace from stack > BLANK
   - Name: luccs271course
   - RAM: 3GB

1. Wait for the workspace to become available. Now you have a persistent, cloud-based, standard Ubuntu/Linux command-line environment that you can work in and come back to from any computer.

1. Verify that your user name and email address are available to the git tool when invoked through Codenvy (IDE or terminal). 
In the horizontal top-level menu, navigate to

       Profile > Preferences > Git > Committer
	
   and enter any missing information. Use an email address that is associated with your GitHub account.
   Then press *save* and close the popup.
   
1. Create an SSH key to give Codenvy write access to your GitHub repositories. In the horizontal top-level menu, navigate to

       Profile > Preferences > VCS > SSH
	
   Press the small square *octocat* button (GitHub's logo) in the bottom right corner of the popup.
   You should now see a key labeled `github.com` on the list of keys in the right half of the popup.
   Then press *save* and close the popup.

1. For highly convenient integration of git username and email and SSH keys between IDE profile and console, enable the git agent:

       Workspaces > settings for desired workspace (gear wheel) > Agents > Git credentials > click to enable
       
   *(The switch should now turn from gray to blue and your workspace should restart.)*

# TDD with Codenvy, Maven, and JUnit

In this section, you will perform one or more iterations of the (more frequent) inner circle involving 

   - edit the source code
   - compile the source code to executable code
   - test (or run) the executable code
   
These are the steps:

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
	
1. To run the tests through the IDE, in the project explorer window, right-click on the project node `cs2-lab0-hello-java`, then choose
    
       Run Tests > Run JUnit Test
	  
   If this menu item is disabled, you probably still need to compile the project using `mvn test-compile` in the terminal (see above).
      
1. Now get the tests to pass by 

    - fixing the system under test (SUT), i.e., any incorrect method(s) in the `HelloWorld` class
    - fixing any erroneous tests
    
1. *Congratulations, you have now fixed your code!*

# Committing and pushing your code to your remote GitHub repo

In this section, you will close the (somewhat less frequent) outer circle, consisting of

   - clone a remote repo (or *pull* your own or someone else's recent changes)
   - change (edit-compile-test/run locally)
   - commit your changes (locally)
   - push your changes to the remote repo

To commit and push through the IDE, 

   - right-click on the project node `cs2-lab0-hello-java` 
   - then choose
   
         Git > Commit
   - enter a very brief description of the changes you are committing
   - check the box in the bottom left corner labeled *push committed changes*
    
Alternatively, to commit from the command line,

    cd /projects/cs2-lab0-hello-java
    git commit -asm "brief description of changes"
    git push
    
Finally, visit the web page of your remote GitHub repository and navigate to one of the source files you have changed to verify that the change is there.

*Congratulations, you have now pushed your changes to your remote GitHub repository!*

## GitHub troubleshooting

*NOTE: If you are having trouble pushing from through the IDE menu, try through the command line. 
Then look carefully at the error message.
If it talks about email privacy, then try each of the following steps in order:*

1. In your Codenvy Git settings (see above), insert your *private* GitHub email of the form `123456+userid@users.noreply.github.com` and try pushing again.

1. In your GitHub account settings, email section, uncheck the box labeled *Keep my email address private*.

# Submission

When your project is ready to grade, submit your complete cs2-lab0-hello-java repository URL including your GitHub userid on Sakai as an inline submission. 

# Grading criteria

Total 3 points:

- (1 point) submission of your GitHub repo's URL via Sakai (your repo should still show original project commit history - this automatically happens when you import this repo)
- (0.5 point) leave project structure intact
- (0.5 point) fix or remove the erroneous test(s)
- (1 point) make the other test(s) pass without modifying anything else in src/test

*To clarify, your submitted repo must include at least one commit that you made and pushed up to the GitHub server.*
