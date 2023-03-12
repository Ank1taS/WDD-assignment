
function validateRegistraion() {
    // phone Number validation
    let phone = document.forms["registrationForm"]["phno"].value;
    // document.getElementById("test").innerHTML = phone;
    
    let txt = phone.toString();
    if (txt.length != 10) {
        alert("Please enter 10 digit phone number");
        return false;
    }
    
    let password = document.forms["registrationForm"]["password"].value;
    if (password  == "") {
        alert("passWord filed empty. enter valid password");
        return false;
    }
    else if (password.length < 8) {
        alert("password must be 8 character long or more");
        return false;
    }
    
    var x=document.myform.email.value;  
    var atposition=x.indexOf("@");  
    var dotposition=x.lastIndexOf(".");  
    if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  
        alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);  
        return false;  
    }  
    let massage;
    if(confirm("Are you sure to submit form!!")) {
        massage = "Form submitted."
    }
    else {
        massage = "Cancled form submition."
    }

    return true;
}