### Setup
1. If you don't have Python 3 installed, run `brew install python` (for Mac)
2. Run `pip3 install pytest` if you don't have pytest already installed.
3. Run `PYTHONPATH=. pytest test -vv` to run all tests
4. Run `PYTHONPATH=. pytest test -vv -k 'test_case_one'` to run just the first test

**Windows instructions**
If using the Command Prompt (CMD), then set the PYTHONPATH with `set PYTHONPATH=%PYTHONPATH%;.`
If using Powershell, then set the PYTHONPATH with `$env:PYTHONPATH = "."`
After setting the path, run tests with `pytest test -vv`

## Tested on
Python 3.7.4
