const expect = require('chai').expect
let HelloWorld = require('../lib/index.js');

describe('HelloWorld', () => {
  it('passes case 1', () => {
    // this test is passing
    const helloWorld = new HelloWorld('./input/test_1.txt');
    expect(helloWorld.run()).to.eql("hello world\n");
  });

  it('passes case 2', () => {
    // this test is failing
    const helloWorld = new HelloWorld('./input/test_2.txt');
    expect(helloWorld.run()).to.eql("hello-world\n");
  });
});
