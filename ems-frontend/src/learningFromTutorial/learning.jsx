const element = <h2>Hello React</h2>
function greeting(){
    return <h1>Hello React</h1>
}

let greetingReact = greeting();

function greet(message){
    const root = ReactDom.createRoot(document.getElementById('react-app'));
    root.render(message);
}

greet(<h1>Hellop React</h1>);

<script type="text/babel">
   var cTime = new Date().toTimeString();
   ReactDOM.render(
      <div><p>The current time is {cTime}</p></div>, 
      document.getElementById('react-app') );
</script>