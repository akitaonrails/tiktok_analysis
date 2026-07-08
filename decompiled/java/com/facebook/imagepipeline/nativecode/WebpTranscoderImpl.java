package com.facebook.imagepipeline.nativecode;

import X.C1328580kg4;
import X.C1328690kgF;
import X.C1330000kiM;
import X.C1330450kj5;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes21.dex */
public class WebpTranscoderImpl {
    public static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i);

    public static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream);

    public boolean isWebpNativelySupported(C1330000kiM c1330000kiM) {
        if (c1330000kiM == C1328580kg4.LJFF) {
            return true;
        }
        if (c1330000kiM != C1328580kg4.LJI && c1330000kiM != C1328580kg4.LJII && c1330000kiM != C1328580kg4.LJIIIIZZ) {
            if (c1330000kiM == C1328580kg4.LJIIIZ) {
                return false;
            }
            throw new IllegalArgumentException("Image format is not a WebP.");
        }
        boolean z = C1328690kgF.LIZ;
        return true;
    }

    public void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) {
        C1330450kj5.LIZ();
        inputStream.getClass();
        outputStream.getClass();
        nativeTranscodeWebpToPng(inputStream, outputStream);
    }

    public void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) {
        C1330450kj5.LIZ();
        inputStream.getClass();
        outputStream.getClass();
        nativeTranscodeWebpToJpeg(inputStream, outputStream, i);
    }
}
