const fs = require('fs');

class HelloWorld {
  constructor(filePath) {
    this.filePath = filePath;
  }

  loadFile(cb) {
    return fs.readFileSync(this.filePath, 'utf8');
  }

  run() {
    const contents = this.loadFile();
    // to fix test case 2, fix line below:
    return contents.replace('_', ' ');
  }
}

module.exports = HelloWorld;
