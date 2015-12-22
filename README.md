# beach_volley

## Usage
```java
BeachVolleyRequest employeeRequest = new BeachVolleyRequest(BeachVolleyRequest.Method.GET, url, Employee.class, 
new BeachVolleyResponseHandler<Employee>(){

            @Override
            public void success(Employee employee) {
                Log.i("BeachVolley", employee.name);
            }

        }).run(context) ;
        
```
```java
        User user = new User();
        user.email = "bonjovi@gmail.com";
        e.key = "12345";

        BeachVolleyRequest employeeRequest = new BeachVolleyPostRequest(url, user, Employee.class, new BeachVolleyResponseHandler<Employee>() {

            @Override
            public void success(Employee response) {
                Log.i("anoop", response.name);
            }

        });
        employeeRequest.run(this);
```        
