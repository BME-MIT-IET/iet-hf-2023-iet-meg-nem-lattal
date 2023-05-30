## Implementation

[ OK ] Does this code change accomplish what it is supposed to do?

[ OK ] Can this solution be simplified?

[ OK ] Does this change add unwanted compile-time or run-time dependencies?

[ OK ] Is a framework, API, library, or service used that should not be used?

[ ? ] Could an additional framework, API, library, or service improve the solution?
  - Better GUI
 
[ OK ] Is the code at the right abstraction level?

[ OK ] Is the code modular enough?

[ OK ] Can a better solution be found in terms of maintainability, readability, performance, or security?

[ ? ] Does similar functionality already exist in the codebase? If yes, why isn’t it reused?
      - similar functionality, only differences is object type (same parent)

[ ? ] Are there any best practices, design patterns or language-specific patterns that could substantially improve this code? 
      - DRY: 
          - Cape, Bag, Axe, Gloves: simmilar code
          - Aminoacid, Nucleotide: simmilar code

[ OK ] Does this code adhere to Object-Oriented Analysis and Design Principles, like the Single Responsibility Principle, Open-Close Principle, Liskov Substitution Principle, Interface Segregation, or Dependency Injection?


## Logic Errors and Bugs

[ OK ] Can you think of any use case in which the
code does not behave as intended?

[ OK ] Can you think of any inputs or external events
that could break the code?

## Error Handling and Logging

[ OK ] Is error handling done the correct way?

[ OK ] Should any logging or debugging information
be added or removed?

[ - ] Are error messages user-friendly?
      - Error message appears only in console

[ ? ] Are there enough log events and are they
written in a way that allows for easy
debugging?
        - No logging event, but not needed

## Dependencies
[ OK ] Were updates to documentation, configuration, or readme files made as required by this change?

[ OK ] Are there any potential impacts on other parts of the system or backward compatibility?

## Security and Data Privacy
- [ ] Does the code introduce any security vulnerabilities? No.
- [ ] Are authorization and authentication handled correctly? Not needed.
- [ ] Is (user) input validated, sanitized, and escaped 
to prevent security attacks such as cross-site 
scripting or SQL injection? Not needed.
- [ ] Is sensitive data like user data or credit card
information securely handled and stored? Not needed.
- [ ] Is the right encryption used? Not needed.
- [ ] Does this code change reveal any secret
information like keys, passwords, or usernames? No.
- [ ] Is data retrieved from external APIs or libraries
checked for security issues? Not needed.

## Performance
- [ ] Do you think this code change decreases
system performance? Yes.
- [ ] Do you see any potential to improve the
performance of the code significantly? Yes.


## Usability and Accessibility
- [ ] Is the proposed solution well-designed from a
usability perspective? Yes.
- [ ] Is the API well documented? Yes.
- [ ] Is the proposed solution (UI) accessible? Yes.
- [ ] Is the API/UI intuitive to use? Yes.

## Ethics and Morality
- [ ] Does this change make use of user data in a way that 
might raise privacy concerns? No.
- [ ] Does the change exploit behavioral patterns or human
weaknesses? No.
- [ ] Might the code, or what it enables, lead to mental 
and physical harm for (some) users? No.
- [ ] If the code adds or alters ways in which people 
interact with each other, are appropriate measures
in place to prevent/limit/report harassment or abuse? No.
- [ ] Does this change lead to an exclusion of a certain
group of people or users? No.
- [ ] Does this code change introduce unjust impact on people, 
particularly those related to sensitive characteristics such as
race, ethnicity, gender, nationality, income, sexual orientation, ability, 
and political or religious belief? No.
- [ ] Does this code change introduce any algorithm, 
AI  or machine learning bias? No.


## Testing and Testability
- [ ] Is the code testable? Yes.
- [ ] Has the code change? No.
- [ ] Have automated tests been added, or have related ones been updated to cover the change? Yes.
- [ ] Do the existing tests reasonably cover the code change (unit/integration/system tests)? Yes.
- [ ] Are there some test cases, input or edge cases
that should be tested in addition? Yes.

## Readability
- [ ] Is the code easy to understand? Yes.
- [ ] Which parts were confusing to you and why? Too many classes.
- [ ] Can the readability of the code be improved by
smaller methods? Yes.
- [ ] Can the readability of the code be improved by
different function, method or variable names? Yes.
- [ ] Is the code located in the right
file/folder/package? Yes.
- [ ] Do you think certain methods should be
restructured to have a more intuitive control
flow? No.
- [ ] Is the data flow understandable? Yes.
- [ ] Are there redundant or outdated comments? No.
- [ ] Could some comments convey the message
better? Yes.
- [ ] Would more comments make the code more

understandable?
- [ ] Could some comments be removed by making the code itself more readable?
- [ ] Is there any commented-out code?

understandable? Yes.
- [ ] Could some comments be removed by making the code itself more readable? Yes.
- [ ] Is there any commented-out code? No.

