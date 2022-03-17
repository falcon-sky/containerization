from flask import Flask
import os

app = Flask(__name__)


@app.route("/python")
def hello():
    return "Hello from python"


@app.route("/version")
def version():
    return "python version is 3.10"


@app.route("/myname")
def name():
    return "my name is rama"


if __name__ == "__main__":
    port = int(os.environ.get("PORT",5000))
    app.run(debug=True,host='0.0.0.0',port=port)
