import './App.css';
import Header from './components/Header/Header';
import Content from './components/Content/RegistrationForm';

function App() {
    return (
        <div>
            <div className="App">
                <Header/>
            </div>
            <div className="App">
                <Content/>
            </div>
        </div>
    );
}

export default App;
