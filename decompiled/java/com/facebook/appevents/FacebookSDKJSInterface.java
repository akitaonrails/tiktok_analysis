package com.facebook.appevents;

import X.C0W8K;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C786410Ut5;
import X.C807660VmG;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;

/* JADX INFO: loaded from: classes14.dex */
public final class FacebookSDKJSInterface {
    public final String LIZ = "fbmq-0.1";

    @JavascriptInterface
    public final String getProtocol() throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/facebook/appevents/FacebookSDKJSInterface", "getProtocol", this, new Object[0], "java.lang.String", new C0WZW(false, "()Ljava/lang/String;", new C0WZX("dzBzEgQ7XM/eWlgqCxOUdp/2nWxWKpBDD6p1ez+mA/rX4+Fdnz5kL4Ff+Uzj", new String[]{"019e5"})));
        if (c0wsuLIZIZ.LIZ) {
            return (String) c0wsuLIZIZ.LIZIZ;
        }
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            return this.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public FacebookSDKJSInterface(Context context) {
    }

    @JavascriptInterface
    public final void sendEvent(String str, String str2, String str3) throws Throwable {
        String str4 = str;
        String str5 = str3;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/facebook/appevents/FacebookSDKJSInterface", "sendEvent", this, new Object[]{str4, str2, str5}, "void", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", new C0WZX("dzBzEgQ7XM/eWlgqCxOUdp/2nWxWKpBDD6p1ez+mA/rX4+Fdnz5kL4Ff+Uzj", new String[]{"019e5"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str4 = (String) obj;
            }
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            if (obj3 != null) {
                str5 = (String) obj3;
            }
        }
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if (str4 == null) {
                synchronized (FacebookSdk.LIZ) {
                }
            } else {
                C786410Ut5.LJJJI("_fb_pixel_referral_id", str4, C0W8K.LIZ(str5));
                throw null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
