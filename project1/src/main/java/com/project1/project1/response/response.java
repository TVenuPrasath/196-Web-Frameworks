package com.project1.project1.response;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class response {
      
      private long id;
      private String firstname;
      private String lastname;
      @JsonIgnore
      public long getId() {
            return id;
      }
      // public void setId(long id) {
      //       this.id = id;
      // }
      public String getFirstname() {
            return firstname;
      }
      public response(long id, String firstname, String lastname) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
      }
      // public void setFirstname(String firstname) {
      //       this.firstname = firstname;
      // }
      public String getLastname() {
            return lastname;
      }
      // public void setLastname(String lastname) {
      //       this.lastname = lastname;
      // }
      

}
