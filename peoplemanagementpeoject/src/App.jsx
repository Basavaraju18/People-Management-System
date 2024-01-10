import React from 'react'
import Navbar from './Navbar'
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom'
import AddPeople from './AddPeople'
import Getallpeople from './Getallpeople'
import Layout from './Layout'

// import People from './People'


   const App = () => {
  return (
    
      <section>

<section>
      <article>
         <Router>
         <Navbar/>
         <Layout/>
            <Routes>
               <Route path='Add People' element={<AddPeople/>}></Route>
               <Route path='GetAllPeople' element={<Getallpeople/>}> </Route>
               {/* <Route path='Service' element={<Service/>}></Route> */}
               {/* <Route path='ContactUs' element={<ContactUs/>}></Route> */}
            </Routes>
         </Router>
      </article>
   </section>
         
         
      </section>

  )
}

export default App






//^ localhost:8080/people/getall