# JWAMillerProject1

 **This project will demonstrate my understanding of the Standard Testing Life Cycle, Quality Management, Positive & Negative Testing, as well as Test Case Automation.** 

I will display my knowledge by creating and using a map to craft and execute a set of tests to determine their validity and how it aligns with User Stories.

We have 5 user stories to complete 

    -- As a new user I want to open an account with the Planetarium so I can save my celestial findings
    -- As a user I want to securely access my account so I can interact with the Planetarium in a secure 
        environment
    -- As a user I want to see my planets and moons added to the Planetarium so I can track my findings
    -- As a user I want to add new planets and moons to the Planetarium so I can update my findings
    -- As a user I want to remove planets and moons from the Planetarium so I can correct my findings

Once we have the User Stories, we have to work on creating the Acceptance Criteria 

    -- Positive Testing (Happy Path)
        This would encompass all the passing requirements

    -- Negative Testing (Sad Path)
        This would encompass all the failing requirements

Once we have created the Acceptance Criteria, we organize them into test cases and these test cases are kept within a Feature File. These test cases are presented as "Scenarios". Each Scenario has a list of steps which are written in Gherkin language for readability. 

    -- Scenarios and Scenario Outlines can both be used for testing, however, Scenarios can only run once 
        while Scenario Outlines can run multiple tests multiple times. This is where the table data comes in.

    -- A table is created for the passing inputs as well as the failing inputs. Depending on testing needs.  

        The table is created in the following format:
            |Input|Input|Input|   

    // Creating this table allows for Cucumber to read the code and initialize the automated testing. These 
        tables can be used for both "Happy" and "Sad" path testing. 

After creating the test cases, you create a "Step Definition Class" which would link the Gherkin steps to their actual implementation in the code and give readability to your steps, allowing for concise understanding across employee departments. 

    -- You would create and implement methods to execute these steps. 

    -- The indicators or keywords for this class would be @Given, @When, @Then, @And, & @But
    
Once you have your Feature files and your Step Definition Classes, you can move on to integrate them into a Page Object Model to create a test script. It acts as an abstraction layer between the test scripts and the user interface, encapsulating the details of the web page and its elements in a dedicated class. These are also called "Glue Steps"

    -- Test scripts use methods from Page Object classes to handle UI interactions, allowing the tests to 
        focus on the "what" (test steps) rather than the "how" (UI details), making them cleaner and more 
        maintainable.

    -- Step Definition Methods within that file execute the specific actions related to each corresponding 
        step.

Now that we have all of this information and compiled into its respective files. We can run tests. 

    -- Configure a test runner, for this one we used JUnit, and make sure that you are linking your 
    Features, Glue Steps, and html file (optional) into the dedicated configuration inputs to ensure 
    that the test runner is pulling information from the right locations in order to fully run the tests. 

After running the tests, we now can determine whether there are any defects within the application and if there are, what are the priority and severity levels of fixing that defect. 


# Formal Sprint Retrospective

### Overview

The purpose of this write up is to reflect on the testing phase of the recent project, declaring what went well, identifying areas for improvement, and the consideration of elements for future implementation. This testing cycle project provided a valuable learning opportunity and offered insight into the depth and expectations of the position. One of the standout aspects of this project was its complexity and the number of components involved in the rigorous and tedious testing. The difficulty level of the project offered an insightful view into the full scope of the role, showcasing the importance of attention to detail, process-driven execution, and strategic test planning. The dynamic nature of the work made the testing both challenging and engaging.

### Strengths and Successes

A core strength throughout this project was the actual implementation of the tests. I focused on keeping the code as simple as possible, which not only minimized the chance of introducing errors or unkempt manageability but also allowed for more straightforward explanations of the logic and structure behind each test.
Additionally, I took care to condense large amounts of information and code into more digestible and manageable segments. This made documentation, explanation, and overall communication of the testing process far more efficient and clear.

### Areas for Improvement

While the testing process was largely successful, one area that needs improvement is in the pacing and structural organization of the work. I tend to jump between tasks, sometimes prematurely moving on before completing the current item thoroughly. This abrupt, non-linear workflow can sometimes disrupt continuity and lead to unnecessary backtracking.
A more methodical and step-by-step approach will improve consistency and ensure each portion of the work is fully complete before progressing further.


### Future Improvements

Moving forward, I will be integrating the use of Jira to maintain a more active and accurate workflow. I will regularly update the Jira and implement frequent progress checks as that will help ensure I stay up to date with timelines and deadlines.
Also, I plan to improve the structure of test cases by separating them based on their specific goals and requirements. Rather than grouping multiple user stories together due to step similarities, each will be treated as an individual test case. This separation will enhance clarity, maintain focus, allow for better pacing, and limit any redundancy or overlap in code to prevent errors and support better debugging and documentation.

### Conclusion

Overall, this project has been a fun and challenging experience. It highlighted both my current strengths in testing implementation and my opportunities for growth in organization and process. By incorporating better pacing strategies and structured tracking tools, I am confident future testing efforts will be even more efficient and effective.







