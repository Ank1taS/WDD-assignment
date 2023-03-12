$(document).ready(function () {
    // Define array of students
    var students = [
      { name: 'Ankita Sahoo', age: 21, gender :'Female', major: 'Computer Science' },
      { name: 'Rojalin Sahoo', age: 20, gender :'Female', major: 'Biology' },
      { name: 'Nityam Kumar', age: 25,  gender :'Male', major: 'Engineering' },
      { name: 'Priyal Das', age: 21,  gender :'Female', major: 'Engineering' },
      { name: 'Pritam Das', age: 35,  gender :'Male', major: 'Mathmatics' },
    
    ];
  
    // Loop through array of students and append rows to table
    $.each(students, function (index, student) {
      var row =
        '<tr><td>' +
        student.name +
        '</td><td>' +
        student.age +
        '</td><td>' +
        student.gender +
        '</td><td>' +
        student.major +
        '</td></tr>';
      $('#student-table').append(row);
    });
  });