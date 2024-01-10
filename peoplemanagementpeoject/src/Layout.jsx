import React from 'react'
import "./Layout.css"
import {Link} from 'react-router-dom'

const Layout = () => {
  return (
   <section className='mainContainer'>
    <div className='Head'>
      <h1>Seclect the Below Options</h1>
      <ul>
         <li >
         <Link to="/AddPeople">Add People</Link>
         </li>

           <li>
         <Link to="/Getallpeople">Get All People</Link>
         </li>   
      </ul>
    </div>
    </section>
  )
}

export default Layout