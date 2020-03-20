
import React, {Component} from 'react';
import './App.css';
import Currencies from "./Components/Currencies";

class App extends Component {
    render() {
        return (
            <div className="App">
                <header className="Header">
                    <h1 className="App-title">Currencies</h1>
                </header>
                <Currencies/>
            </div>
        )
    }
}

export default App;     