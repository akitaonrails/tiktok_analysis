package com.ss.pusher.core.opengl;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class VideoColorRange {
    public static int LIZ = -1;

    public static native int nativeCheckYuv2RgbFormulaColorRange(int i);

    public static native int nativeCheckYuvFrameColorRange(ByteBuffer byteBuffer, int i, int i2);
}
