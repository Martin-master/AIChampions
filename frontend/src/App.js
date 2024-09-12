import React, { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState("");

   useEffect(() => {
      fetch('http://localhost:8080/api/hello')
            .then(response => response.text())
            .then(message => {
               setMessage(message);
            });
   }, []);

  return (
        <div className="App">
          <header className="App-header">
            <h1>Martin kører react</h1>
            <p>{message}</p>
          </header>
        </div>
  );
}

export default App;