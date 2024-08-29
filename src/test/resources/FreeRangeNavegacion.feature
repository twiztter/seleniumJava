@Navigation
Feature: Navigation bar
    To see the subpages
    Without loggin in
    I can click the navigation bar links

    Background: I am on the Free Range Testers web without loggin in.
        Given I navigate to www.freerangetesters.com 

    Scenario Outline: I can access the subpages through the navigation bar
        When I go to a <section> using the navigation bar
        Examples:
            | section   |
            | Cursos    |
            | Recursos  |
            | Mentorías |
            | Udemy     |

    Scenario: Courses are presented correctly to potential customers
        When I go to a Cursos using the navigation bar
        And select Introduccion al Testing

    @Plans
    Scenario: Courses are presented correctly to potential customers
        When I select Elegir Plan
        Then I can validate the options in the checkout page