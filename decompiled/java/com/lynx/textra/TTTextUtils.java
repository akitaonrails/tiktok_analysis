package com.lynx.textra;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.textra.PlatformFontCaps;

/* JADX INFO: loaded from: classes21.dex */
public class TTTextUtils {
    public static Context context = null;
    public static float density_ = 1.0f;

    public static float Dp2Px(float f, float f2) {
        return (f * f2) / 160.0f;
    }

    public static float Px2Dp(float f, float f2) {
        return (f * 160.0f) / f2;
    }

    public static native int nativeGetSystemPropInt(String str);

    public static String SystemDefaultFamilyName() {
        Context context2 = context;
        return context2 == null ? "sans-serif" : PlatformFontCaps.Factory.getStrategy(context2).defaultFamilyName();
    }

    public static float Dp2Px(float f) {
        return f * density_;
    }

    public static float Px2Dp(float f) {
        return f / density_;
    }

    public static void SetDpi(float f) {
        synchronized (TTTextUtils.class) {
            try {
                density_ = f / 160.0f;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static byte[] SystemFontStyleAdjust(float f, short s) {
        BBufferOutputStream bBufferOutputStream = new BBufferOutputStream(6);
        bBufferOutputStream.writeFloat(f);
        Context context2 = context;
        if (context2 != null) {
            bBufferOutputStream.writeShort(PlatformFontCaps.Factory.getStrategy(context2).adjust(s));
        } else {
            bBufferOutputStream.writeShort(s);
        }
        return bBufferOutputStream.getByteArray();
    }
}
