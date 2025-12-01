<h1>Brewtiful – Customizing Coffee Orders</h1>

<p>
A popular coffee shop, <strong>"Brewtiful,"</strong> wants a flexible and extensible way to calculate 
the cost and list the ingredients of customized coffee orders. Customers can choose a basic coffee 
type and then add various toppings or flavor shots. The system must support any combination of 
additions while keeping all components consistent.
</p>

<hr>

<h2>Key Requirements</h2>

<h3>1. Core Component</h3>
<p>
A basic coffee (e.g., <em>Espresso</em>, <em>Black Coffee</em>) with a base cost.
</p>

<hr>

<h3>2. Dynamic Enhancements</h3>
<p>The coffee may include optional additions like:</p>

<ul>
    <li>Milk</li>
    <li>Sugar</li>
    <li>Caramel Syrup</li>
    <li>Whipped Cream</li>
</ul>

<p>
These additions must be applied <strong>on top of</strong> the basic coffee.
</p>

<hr>

<h3>3. Combinability</h3>
<p>
Customers must be able to combine multiple additions in any order.
</p>

<blockquote>
    Example: <em>Espresso with Milk and Caramel Syrup</em>
</blockquote>

<hr>

<h3>4. Interface Consistency</h3>
<p>
All components—including the basic coffee and all additions—should share a 
<strong>common interface</strong>. This allows:
</p>

<ul>
    <li>Decorators to wrap the base coffee</li>
    <li>Decorators to wrap other decorators</li>
</ul>

<p>
This ensures full flexibility and support for unlimited customization combinations.
</p>

