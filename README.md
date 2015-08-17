# beach_volley

## Usage
```java
BeachVolleyRequest employeeRequest = new BeachVolleyRequest(url, Employee.class, new BeachVolleyResponseHandler<Employee>(){

            @Override
            public void success(Employee response) {
                Log.i("BeachVolley", response.name);
            }

        }) ;
        employeeRequest.run(this);
```
