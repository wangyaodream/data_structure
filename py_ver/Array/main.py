

class Array:

    def __init__(self, capacity=10):
        self._data = [0] * capacity
        self._size = 0

    def getSize(self):
        return self._size

    def getCapacity(self):
        return len(self._data)


    def add(self, index: int, e: int):
        if self._size == len(self._data):
            raise Exception("method add faild.the array is full.")

        if index < 0 or index > size:
            raise Exception("method add faild.the argument need > 0 and < size.")




