import { type } from "os";

type Props = {
    message : String;
}

function Hello( {message} : Props) {
    return (
        <h1>Hello {message} !</h1>
    )
}

export default Hello;