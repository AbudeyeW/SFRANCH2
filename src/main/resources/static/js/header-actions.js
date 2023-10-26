<!--CODE TO GET TOP NAVIGATION TO BE COLLAPSIBLE FOR MOBILE-->
function myFunction() {
      var x = document.getElementById("myTopnav");
      if (x.className === "header-right") {
            x.className += " responsive";
            document.getElementById("mySidepanel").style.width = "50vw";
      } else {
        x.className = "header-right";
        document.getElementById("mySidepanel").style.width = "0";
      }
      /*Add code for the dropdown button below*/
      var dropdown = document.getElementsByClassName("dropdown-btn-sp");
      var i;

      for (i = 0; i < dropdown.length; i++) {
        dropdown[i].addEventListener("click", function() {
          this.classList.toggle("active");
          var dropdownContent = this.nextElementSibling;
          if (dropdownContent.style.display === "block") {
            dropdownContent.style.display = "none";
          } else {
            dropdownContent.style.display = "block";
          }
        });
      }
}


<!--CODE TO GET HEADER TO BE STICKY-->
// When the user scrolls the page, execute myFunction
window.onscroll = function() {my2Function()};
// Get the header
var header = document.getElementById("myHeader");
// Get the offset position of the navbar
var sticky = header.offsetTop;
// Add the sticky class to the header when you reach its scroll position. Remove "sticky" when you leave the scroll position
function my2Function() {
  if (window.pageYOffset > sticky) {
        header.classList.add("sticky");
  } else {
        header.classList.remove("sticky");
  }
}
