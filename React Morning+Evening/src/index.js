import { StrictMode, useState } from "react";
import ReactDOM from "react-dom";
import axios from "axios";

//import App from "./App";

function App() {
  const [book, setBook] = useState("");
  const [result, setResult] = useState([]);
  const [apiKey, setApiKey] = useState(
    "AIzaSyD4vndpGrpnUMLg6Wv_l0Wb8RuvnUUlUVg"
  );
  function handleChange(event) {
    const book = event.target.value;
    setBook(book);
  }
  function handleSubmit(event) {
    event.preventDefault();
    axios
      .get(
        "https://www.googleapis.com/books/v1/volumes?q=" +
          book +
          "&key=" +
          apiKey +
          "&maxResults=20"
      )
      .then((data) => {
        console.log(data.data.items);
        setResult(data.data.items);
      });
  }
  return (
    <div className="container">
      <h1>ACCOLITE UNIVERSITY BOOK LIBRARY</h1>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <input
            type="text"
            onChange={handleChange}
            className="form-control mt-10 "
            placeholder="Search book"
            autoComplete="off"
          />
        </div>
        <button type="submit" className="btn btn-danger ">
          Search
        </button>
      </form>
      {result.map((book, i) => (
        <div key={i}>
          <a targer="_blank" href={book.volumeInfo.previewLink}>
            {book.volumeInfo.title}
           
          </a>
        </div>
      ))}
    </div>
  );
}

const rootElement = document.getElementById("root");
ReactDOM.render(
  <StrictMode>
    <App />
  </StrictMode>,
  rootElement
);
