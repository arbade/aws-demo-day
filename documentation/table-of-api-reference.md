# RESTful API Methods

## API Description for Project

- It would be able to see type of controller and description to related controller for backend-system at the following content:

| Type                   | Description                                          |   |   |   |
|------------------------|------------------------------------------------------|---|---|---|
| leaderboard-controller | Operations pertaining to leaderboard in gjg backend  |   |   |   |
| score-controller       | Operations pertaining to submit score in gjg backend |   |   |   |
| user-controller        | Operations pertaining to user in gjg backend         |   |   |   |

## Local API Reference

- First of all, you would be able to see swagger-ui for local & docker `localhost:8080/swagger-ui.html`
- In addition to, you would be able to see swagger-ui for cloud `http://34.89.138.190:8080/swagger-ui.html`

| METHOD | PATH                              | DESCRIPTION                           |   |   |
|--------|-----------------------------------|---------------------------------------|---|---|
| GET    | /api/leaderboard                  | Get Global Leaderboard List           |   |   |
| GET    | /api/leaderboard/{country}        | Get Local Leaderboard List by country |   |   |
| POST   | /api/score                        | Submit new score to user by user id   |   |   |
| POST   | /api/user                         | Create new user                       |   |   |
| POST   | /api/user/profile/{amount}        | Create Random user                    |   |   |
| GET    | /api/user/profile/{userId}        | Get user by user id                   |   |   |
| DELETE | /api/user/profile/delete/{userId} | Delete user by user id                |   |   |
| DELETE | /api/user/profile/deleteAll       | Delete All User                       |   |   |
| GET    | /api/user/profile/users           | Get All User List                     |   |   |

- From local & docker, you need to use `localhost:8080/PATH`

- For Cloud, you need to use `http://34.89.138.190:8080/PATH`



