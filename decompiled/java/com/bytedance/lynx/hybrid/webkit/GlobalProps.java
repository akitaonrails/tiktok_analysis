package com.bytedance.lynx.hybrid.webkit;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import android.webkit.JavascriptInterface;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class GlobalProps {
    public String LIZ;
    public Map<String, ? extends Object> LIZIZ;

    @JavascriptInterface
    public final String getGlobalProps() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/lynx/hybrid/webkit/GlobalProps", "getGlobalProps", this, new Object[0], "java.lang.String", new C0WZW(false, "()Ljava/lang/String;", new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFHyMXStAbKGXmrtGM=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        String str = this.LIZ;
        return str == null ? "" : str;
    }
}
