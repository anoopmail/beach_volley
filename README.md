# beach_volley

## Usage
```java
BeachVolleyRequest employeeRequest = new BeachVolleyRequest(url, Employee.class, 
new BeachVolleyResponseHandler<Employee>(){

            @Override
            public void success(Employee employee) {
                Log.i("BeachVolley", employee.name);
            }

        }).run(context) ;
        
```
