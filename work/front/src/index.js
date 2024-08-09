import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { applyMiddleware } from 'redux';
import { createStore } from 'redux';

//store는 객체만 받을 수 있기 때문에 promise와 function을 사용하기 위해 미들웨어를 사용한다.
const createStoreWithMiddleware = applyMiddleware(
  promiseMiddleware,
  ReduxThunk
)(createStore);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Provider>
      store={createStoreWithMiddleware(
        Reducer,
        window._REDUX_DEVTOOLS_EXTENSION__ &&
        window._REDUX_DEVTOOLS_EXTENSION__()
      )}
      <App /> 
    </Provider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
