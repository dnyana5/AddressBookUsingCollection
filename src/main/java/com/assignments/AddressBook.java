package com.assignments;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Problem");
        AddressMethods address=new AddressMethods();
        address.Add();
        address.Show();
        address.Edit();
        address.Show();
    }
}
