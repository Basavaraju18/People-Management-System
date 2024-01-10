import React, { useState } from 'react';
// import  "./Global.css"
import "./People.css"

const People = () => {
  const [person, setPerson] = useState({
    name: '',
    gender: '',
    age: ''
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setPerson({
      ...person,
      [name]: value
    });
  };

  return (
    <div>
      <label>
        Name:
        <input
          type="text"
          name="name"
          placeholder="Enter People Name"
          value={person.name}
          onChange={handleChange}
        />
      </label>
      <br />
      <label>
        Gender:
        <input
          type="text"
          name="gender"
          placeholder="Enter People Gender"
          value={person.gender}
          onChange={handleChange}
        />
      </label>
      <br />
      <label>
        Age:
        <input
          type="number"
          name="age"
          placeholder="Enter People Age"
          value={person.age}
          onChange={handleChange}
        />
      </label>
    </div>
  );
};

export default People;
