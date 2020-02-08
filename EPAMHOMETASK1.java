lowerLimit = input.nextInt();
System.out.println(&quot;Enter the higherlimit of the price&quot;);
higherLimit = input.nextInt();
Set&lt;Map.Entry&lt;String, Integer&gt;&gt; candy Set = name To Price.entrySet();
Iterator&lt;Map.Entry&lt;String, Integer&gt;&gt; candy Iterator = candyS. iterator();
while (candy Iterator.hasNext()) {
Map.Entry candy Element = (Map.Entry)candy Iterator.next();
int currentPrice (int)candy Element.getValue();
if (current Price &gt;= lower Limit &amp;&amp; current Price &lt;= higherLimit)
System.out.println(candy Element.getKey();
else {
System.out.println(&quot;Enter the lowerlimit of the weight: &quot;);
lowerLimit = input.nextInt ();
System.out.println(&quot;Enter the higherlimit of the weight&quot;);
higher Limit = input.nextInt();
Set&lt;Map.Entry&lt;String, Integer&gt;&gt; candy Set = name Toweight.entrySet();
Iterator Map.Entry&lt;string, Integer&gt;&gt; candy Iterator = candyS. iterator();
while (candy Iterator.hasNext() {
Map.Entry candy Element = (Map. Entry)candy Iterator.next();
int currentWeight = (int) candy Element.getValue();
if (currentweight &gt; lower Limit &amp;&amp; current Weight &lt;= higher Limit)