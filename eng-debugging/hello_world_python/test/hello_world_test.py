import pytest
import os
from lib.index import HelloWorld
input_folder = "input/"

def test_case_one():
    hello_world = HelloWorld(input_folder + "test_1.txt")
    assert hello_world.run() == "hello world\n"


def test_case_two():
    hello_world = HelloWorld(input_folder + "test_2.txt")
    assert hello_world.run() == "hello-world\n"
