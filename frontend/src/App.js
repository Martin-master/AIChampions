import React, { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState("");
   const [users, setUsers] = useState([]);
   const [products, setProducts] = useState([]);

   useEffect(() => {
      fetch('http://localhost:8080/api/hello')
            .then(response => response.text())
            .then(message => {
               setMessage(message);
            });
   }, []);
   const fetchUsers = () => {
      fetch('http://localhost:8080/api/users')
            .then(response => response.json())
            .then(users => {
               setUsers(users);
            });
   }
   const fetchProducts = () => { // New function to fetch products
      fetch('http://localhost:8080/api/products')
            .then(response => response.json())
            .then(products => {
               setProducts(products);
            });
   }
   const createProduct = () => { // New function to create a product
      fetch('http://localhost:8080/api/create_product', {
         method: 'POST',
         headers: {
            'Content-Type': 'application/json',
         },
         body: JSON.stringify({
                                 productName: 'New Product',
                                 productDescription: 'This is a new product',
                                 productPrice: 99.99,
                                 productSKU: 'NP-001',
                                 productWeight: 1.0,
                                 productDimensions: '10x10x10',
                                 productStatus: 'active',
                              }),
      })
            .then(response => response.json())
            .then(product => {
               setProducts([...products, product]);
            });
   }
   const createUser = () => {
      fetch('http://localhost:8080/api/create_user', {
         method: 'POST',
         headers: {
            'Content-Type': 'application/json',
         },
         body: JSON.stringify({
                                 username: 'New User',
                                 email: 'new.user@example.com',
                                 password: 'securePassword123'
                              }),
      })
            .then(response => response.json())
            .then(user => {
               setUsers([...users, user]);
            });
   }

   return (
         <div className="App">
            <header className="App-header">
               <h1>Martin kører react</h1>
               <p>{message}</p>
               <button onClick={fetchUsers}>Show Users</button>
               <button onClick={createUser}>Create User</button>
               <button onClick={fetchProducts}>Show Products</button> {/* New button to fetch products */}
               <button onClick={createProduct}>Create Product</button> {/* New button to create a product */}
               {users.map((user, index) => (
                     <div key={index}>
                        <p>Name: {user.username}</p>
                        <p>Email: {user.email}</p>
                        <p>Email: {user.password}</p>
                     </div>
               ))}
               {products.map((product, index) => ( // New map function to display products
                     <div key={index}>
                        <p>Name: {product.productName}</p>
                        <p>Description: {product.productDescription}</p>
                        <p>Price: {product.productPrice}</p>
                     </div>
               ))}
            </header>
         </div>
   );
}

export default App;