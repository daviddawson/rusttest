package io;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

/** Simple example of JNA interface mapping and usage. */
public class RustJNA {

    // This is the standard, stable way of mapping, which supports extensive
    // customization and mapping of Java to native types.

    public interface EmbedLib extends Library {
        EmbedLib INSTANCE = Native.loadLibrary((Platform.isWindows() ? "embed" : "embed"),
                        EmbedLib.class);

        void wibblemonkey();
    }
    public interface EmbedLib2 extends Library {
        EmbedLib2 INSTANCE = Native.loadLibrary((Platform.isWindows() ? "embed2" : "embed2"),
                EmbedLib2.class);

        void wibblemonkey();
    }

    public static void main(String[] args) {
        EmbedLib.INSTANCE.wibblemonkey();
        System.out.println("==================================");
        EmbedLib.INSTANCE.wibblemonkey();
    }
}
