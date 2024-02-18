
# Menu API

[![wakatime](https://wakatime.com/badge/user/018ccb12-9467-4e68-9840-5044c971aca3/project/018dba72-7f09-414f-ba71-265d10e58979.svg)](https://wakatime.com/badge/user/018ccb12-9467-4e68-9840-5044c971aca3/project/018dba72-7f09-414f-ba71-265d10e58979)

The Menu API is a web application developed using the powerful combination of Spring and Java, offering a solution for displaying the menu of a fictional restaurant.
## Technologies

[![Java](https://img.shields.io/badge/Java-orange)](https://www.oracle.com/java/)
[![Spring](https://img.shields.io/badge/Spring-brightgreen)](https://spring.io/)
[![Maven](https://img.shields.io/badge/Maven-blue)](https://maven.apache.org/)
[![MariaDB](https://img.shields.io/badge/MariaDB-yellow)](https://mariadb.org/)


## API Documentation

#### Returns all items

```http
  GET /food
```

#### Add new items

```http
  POST /food
```

- POST format:
```JSON
    {
        "title": "shrimp",
        "image": "http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcSSjDg0I-JjJSAdvOJxqO9G-vRnnQlxbS_2yfLboR_hICAJEEDkUti7yCsErGz9lPqXnLvPFwcx0y_9SlBSmj8",
        "price": 10
    }
```
## Demonstration



<table>
  <tr>
    <td>Method</td>
    <td width="750px">Example</td>
  </tr>
  <tr>
    <td>GET</td>
    <td><img src="https://github.com/Ismael-Moreira-Kt/Menu-API/assets/154206380/9f1f17de-0bd7-4a22-bc14-224b2789ae5e"></td>
  </tr>
  <tr>
    <td>POST</td>
    <td><img src="https://github.com/Ismael-Moreira-Kt/Menu-API/assets/154206380/84fff861-8fad-4207-a51a-07a3f71d234e"></td>
  </tr>
</table>
