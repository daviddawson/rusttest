require 'ffi'

module Hello
  extend FFI::Library
  ffi_lib 'target/release/libembed.so'
  attach_function :wibblemonkey, [], :void
end

Hello.wibblemonkey

puts 'done!'
