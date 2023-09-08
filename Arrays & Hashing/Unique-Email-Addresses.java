class Solution {
    private String formattedEmail(String email)
    {
        String[] arr = email.split("@");
        String localName = arr[0];
        String DomainName = arr[1];
        String[] localWithPlus = localName.split("\\+");
        localName = localWithPlus[0].replace(".","");
        return localName +"@"+DomainName;
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for(String s: emails)   {
            String formatted = formattedEmail(s);
            uniqueEmails.add(formatted);
        }   return uniqueEmails.size();
    }
}