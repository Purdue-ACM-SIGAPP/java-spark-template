# Java Spark Template

# Setup

You can use Eclipse or IntelliJ pretty easily with this in theory but the simplest setup will be to just use (Visual Studio Code)[https://code.visualstudio.com/]. The initial setup steps for this are as follows:

* Install [Visual Studio Code](https://code.visualstudio.com/) from its website: https://code.visualstudio.com/
* Install [Docker Desktop](https://www.docker.com/products/docker-desktop/) from its website: https://www.docker.com/products/docker-desktop/
* Install the [Dev Containers](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) extension for Visual Studio Code: https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers

Now you have the environment so you just need to clone the repository and reopen it in a dev container:

* Run `git clone https://github.com/Purdue-ACM-SIGAPP/java-spark-template.git` in the directory you wish to develop from. It's common to develop from a place like `C:\dev` on Windows or `~\dev` on Mac or Linux. It generally doesn't matter where you do this though, just remember where it is.
* Open the cloned repository in VSCode
* There should be a pop-up for reopening in a container but if not you can do Ctrl+Shift+P on Windows or Command+Shift+P on Mac and type "Dev Containers: Reopen in Container" and run that command
* Be **patient** now. This might take ten minutes or longer if your connection and/or computer are slow. It should be fairly obvious once its done doing its thing. Feel free to watch the logs to get a sense of how Docker works.

Now you're done setting up and should be able to run maven commands and run the application easily. Run the application now by going to the "Run and Debug" menu and clicking the play button. You can also get here with Ctrl+Shift+D or Command+Shift+D. Make sure you're on the "Main" configuration that is defined in `.vscode/launch.json`. You should then be able to open the app in your browser.

# Adding dependencies

Obviously you'll want to add some additional dependencies to this project as you expand it. The most obvious one is some way to interact with a database. You can do this in the `pom.xml` file. Look into Maven documentation if you need more help with this, you'll probably be doing some research anyway to find the dependencies you need. A common one that helps reduce code verbosity is [Lombok](https://projectlombok.org/).

# Testing

# Deployment
