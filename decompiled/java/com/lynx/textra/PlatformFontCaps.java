package com.lynx.textra;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes21.dex */
public interface PlatformFontCaps {
    short adjust(short s);

    short clamp(int i);

    String defaultFamilyName();

    public static class Factory {
        public static PlatformFontCaps getStrategy(Context context) {
            String str = Build.BRAND;
            if ("oppo".equalsIgnoreCase(str)) {
                return new OppoFontCaps(context);
            }
            if ("vivo".equalsIgnoreCase(str)) {
                return new VivoFontCaps();
            }
            if ("xiaomi".equalsIgnoreCase(str)) {
                return new XiaomiFontCaps(context);
            }
            if ("huawei".equalsIgnoreCase(str)) {
                return new HuaweiFontCaps(context);
            }
            if ("honor".equalsIgnoreCase(str)) {
                return new HonorFontCaps(context);
            }
            return new DefaultFontCaps();
        }
    }
}
