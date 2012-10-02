public class AccountDelete {
    public PageReference DeleteAccount() {
             
          Account drec =  [select Id from Account where id =:rowid];
          delete drec;
          return null;   
       }
    public String rowid{ get; set;}
    List<Account> lstrec = new List<Account>();

    public PageReference EditAccount() {
            pagereference ref = new pagereference('/apex/AccountPageEdit?id='+rowid);
          return ref;
    }
    public PageReference showAccount() {
            pagereference ref = new pagereference('/apex/AccountPageView?id='+rowid);
           return ref;
      }
    public List<Account> getRecords() { 
        lstrec = [select name, phone from Account LIMIT 5];
        return lstrec;
   }
}
