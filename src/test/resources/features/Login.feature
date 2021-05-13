Feature: As user I want to be able to like other users article

Scenario: Like to the article
  Given user logged in
  When  user click sign in
  Then  user enter "qaqa@qa.com" and "qaqaqa" and click sign in
  Then  user click Global Feed
  And   user click on article title
  And   user click on the favor button
  Then  user click userPage
  Then  user clicked favor article
  Then  verify user should see the favor article





