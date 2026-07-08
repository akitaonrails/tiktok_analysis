package com.lynx.tasm.utils;

import X.C1312880kGk;
import X.InterfaceC1312510kG9;
import android.graphics.PointF;
import com.lynx.react.bridge.mapbuffer.ReadableMapBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class GradientUtils {
    public static native ReadableMapBuffer nativeGetGradientArray(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8);

    public static native float[] nativeGetRadialRadius(int i, int i2, float f, float f2, float f3, float f4);

    public static C1312880kGk LIZ(String str, float f, float f2, float f3, float f4, float f5) {
        ReadableMapBuffer readableMapBufferNativeGetGradientArray = nativeGetGradientArray(str, f, 1.0f, 1.0f, f2, f3, 1.0f, f4, f5);
        if (readableMapBufferNativeGetGradientArray == null) {
            return null;
        }
        Iterator<InterfaceC1312510kG9> it2 = readableMapBufferNativeGetGradientArray.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        return new C1312880kGk(it2.next().LIZIZ());
    }

    public static PointF LIZIZ(float f, float f2, float f3, float f4, int i, int i2) {
        float[] fArrNativeGetRadialRadius = nativeGetRadialRadius(i, i2, f, f2, f3, f4);
        return new PointF(fArrNativeGetRadialRadius[0], fArrNativeGetRadialRadius[1]);
    }
}
