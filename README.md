<h1>Brewtiful – Coffee Customization System</h1>

<p>
The <strong>Brewtiful Coffee Customization System</strong> is a project designed to demonstrate how to build a flexible 
and scalable coffee-ordering application using the <strong>Decorator Design Pattern</strong>. This design allows customers 
to choose a base coffee and enhance it with any number of additions such as milk, sugar, caramel syrup, or whipped cream. 
All components follow a consistent interface, enabling seamless wrapping of additions around other additions or the base coffee itself.
</p>

<hr>

<h2>Project Overview</h2>

<p>
This project showcases how a coffee shop like <strong>"Brewtiful"</strong> can offer customizable drinks while keeping the 
code maintainable, modular, and easy to extend. The system is built with the idea that every coffee order starts with a 
base component, and customers can apply multiple dynamic enhancements as needed.
</p>

<hr>

<h2>Key Requirements</h2>

<h3>1. Core Component</h3>
<p>
The system must include at least one basic coffee type (e.g., <em>Black Coffee</em>, <em>Espresso</em>).  
Each base coffee has its own cost.
</p>

<hr>

<h3>2. Dynamic Enhancements</h3>
<p>
Customers can add optional ingredients to their drink, such as:
</p>

<ul>
    <li>Milk</li>
    <li>Sugar</li>
    <li>Caramel Syrup</li>
    <li>Whipped Cream</li>
</ul>

<p>
These additions must apply an extra cost and be appended to the drink’s description.
</p>

<hr>

<h3>3. Combinability</h3>
<p>
The system must support combining multiple additions in any order.
</p>

<blockquote>
    Example: <em>Espresso with Milk and Caramel Syrup</em>
</blockquote>

<p>There is no limit to how many additions can be applied.</p>

<hr>

<h3>4. Interface Consistency</h3>
<p>
All components — both the base coffee and the added ingredients — must share the same interface.  
This ensures:
</p>

<ul>
    <li>Decorators (additions) can wrap the base coffee.</li>
    <li>Decorators can also wrap <strong>other decorators</strong>.</li>
</ul>

<p>
This design enables unlimited, flexible customization of coffee orders.
</p>

