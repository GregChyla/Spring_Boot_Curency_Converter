import React, {Component} from 'react';

class Currencies extends Component {
    constructor(props) {
        super(props);
        this.state = {currencies: []};
    }

    componentDidMount() {
        fetch('http://localhost:8080/currencies', {headers: {"Authorization": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTU2MTM4OTMyNn0.tVF719msAK-lanUq_Joupae5K1c80EKrjWSeuALFQPP2pyHM2nTDM54dBcB40IrhwU5zIVP3aR82fb6EJqEc6Q"} })
            .then((response) => response.json())
            .then((responseData) => {
                this.setState({
                    currencies: responseData
                })
            })
            .catch(err => console.error(err))
    }

    render() {
        const tableRows = this.state.currencies.map((currency, index) =>
            <tr key={index}>
                <td>{currency.name}</td>
                <td>{currency.code}</td>
                <td>{currency.amount}</td>
                <td>{currency.rate}</td>
            </tr>
        );
        return (
            <div className="App">
                <table>
                    <tbody>{tableRows}</tbody>
                </table>
            </div>
        );
    }
}

export default Currencies;