# JPA1

Up until now we have overcome persistence by making a translate layer between the facade and the database.
This was done by taking a object from the facade and converting it into either string(varchar) boolean or int that now would fit into
our sql database.

When storing with inheritance into a table different strategies are used to help solving the different scenarios that can come from this.
Since the different classes have different tables, but their values are all based on the same "object", the values that are put in to this
one "object" will be spread out on more then one table. Using joined the values will be shown like explained. Using single.table will
gather all the information into one table, the table that is used is dependant on which object was refeered to when storing it. It will 
be stored on the same table name as the class name used.

One major difference in the way we handle databases now using jpa is that we are taking advantage of Serializable and putting the output
of that into the database, meaning we can store the actual object instead of converting the object to and from the facade to the DB.

