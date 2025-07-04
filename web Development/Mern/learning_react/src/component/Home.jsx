import React from 'react'

const Home = () => {
  return (
    <div className="w-full h-20 bg-cyan-400 px-8 flex items-center">
      <ul className="list-none flex flex-row justify-between items-center w-full gap-x-8">
        <li className="hover:text-white cursor-pointer">Home</li>
        <li className="hover:text-white cursor-pointer">About</li>
        <li className="hover:text-white cursor-pointer">Contact us</li>
        <li className="hover:text-white cursor-pointer">Gallery</li>
      </ul>
    </div>
  )
}
export default Home;