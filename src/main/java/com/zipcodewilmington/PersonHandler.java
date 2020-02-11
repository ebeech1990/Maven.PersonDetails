package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while(counter < personArray.length){
            if(counter == 0){
                result += "\nMy first name is " + personArray[counter].getFirstName() +  "\n" +
                        "My last name is " + personArray[counter].getLastName() +  "\n";
            }
            else if(counter == personArray.length-1){
                result += "My first name is " + personArray[counter].getFirstName() +  "\n" +
                        "My last name is " + personArray[counter].getLastName();
            }
            else {
                result += "My first name is " + personArray[counter].getFirstName() +  "\n" +
                        "My last name is " + personArray[counter].getLastName() +  "\n";
            }


            counter++;
        }
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
