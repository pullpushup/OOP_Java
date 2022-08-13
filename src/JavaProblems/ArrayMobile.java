package JavaProblems;

import java.util.ArrayList;

public class ArrayMobile {
    private String myNumber;
    private ArrayList<ArrayListContact> myContacts;

    public ArrayMobile(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<ArrayListContact>();
    }
    public boolean addNewContact(ArrayListContact contact){
        if(findContact(contact.getName()) >=0){
            System.out.println("Contact is already on file ");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public boolean UpdateContact(ArrayListContact oldContact, ArrayListContact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName()+", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+",was replaced with "+newContact.getName());
        return true;
    }

    private int findContact(ArrayListContact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i=0; i<this.myContacts.size();i++){
            ArrayListContact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
}
