$(function() {
	//solving the active menu problem
    switch(menu) {
    
       case 'About Us':
    	   $('#about').addclass('active');
    	   break;
       case 'Contact Us':
    	   $('#contact').addclass('active');
    	   break;
       case 'All Products':
    	   $('#listProducts').addclass('active');
    	   break;
       default:
    	   if(menu == "Home") break;
    	   $('#listProducts').addclass('active');
           $('#a_'+menu).addClass('active')
    	   break;
     
    }


});