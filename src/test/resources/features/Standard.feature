Feature: As a potential client i need to open a calculator and do math operations

  @Smoke @Plus
  Scenario: Plus operation
    When Seven Plus Eight
    Then Result is Fifteen

  @Smoke @Minus
  Scenario: Minus operation
    When Nine Minus Seven
    Then Result is Two

  @Smoke @Multiply
  Scenario: Multiply operation
    When Multiply Nive by Six
    Then Result is Fiftyfive

  @Smoke @Divide
  Scenario: Multiply operation
    When Six divided by Six
    Then Result is One
