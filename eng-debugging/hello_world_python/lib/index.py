class HelloWorld:
    def __init__(self, file_path: str):
        self.file_path = file_path

    def _load_file(self):
        with open(self.file_path, "r", encoding="utf8") as f:
            return f.read()

    def run(self):
        contents = self._load_file()
        return contents.replace("_", " ")
