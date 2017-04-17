var ffi = require('ffi');

var embed = ffi.Library('../libembed', {
    'wibblemonkey': ['void', []]
});
var embed2 = ffi.Library('../libembed2', {
    'wibblemonkey': ['void', []]
});


embed.wibblemonkey()

console.log("HELLO WORLD, THIS IS AWESOME")

embed2.wibblemonkey()
