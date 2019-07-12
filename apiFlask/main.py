from flask import Flask, jsonify, request
from service import service

app = Flask(__name__)

#
# @app.route("/")
# def hello_world():
#     symbols = service.get_all_symbol()
#     return jsonify(symbols)


@app.route("/getTicker", methods=['GET'])
def get_ticker():
    if request.method == 'GET':
        symbol = request.args.get('symbol')
        return jsonify(service.get_ticker(symbol))


@app.route("/getKline")
def get_kline():
    if request.method == 'GET':
        symbol = request.args.get('symbol')
        time = request.args.get('time')
        return jsonify(service.get_kline(symbol, time))


if __name__ == '__main__':
    app.run()