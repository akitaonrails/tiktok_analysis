package com.tts.oecverify.methods;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C14AL;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC20220814Ac;
import Y.ARunnableS34S1100000_30;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class JsBridgeModule {
    public WebView LIZ;
    public BPEAHandler LIZIZ;

    public class AndroidJsInterface {
        public final InterfaceC20220814Ac LIZ;

        @JavascriptInterface
        public void callMethodParams(String str) throws Throwable {
            Object obj;
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/tts/oecverify/methods/JsBridgeModule$AndroidJsInterface", "callMethodParams", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPUlxvbo9h0PktE8CIHO1rcWH3S3qkpw==", null)));
            if (c0wsuLIZIZ.LIZ) {
                return;
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            if (objArr != null && (obj = objArr[0]) != null) {
                str = (String) obj;
            }
            JsBridgeModule jsBridgeModule = JsBridgeModule.this;
            BPEAHandler bPEAHandler = jsBridgeModule.LIZIZ;
            if (bPEAHandler == null) {
                new C14AL(jsBridgeModule, str).LIZLLL(-2, new JSONObject());
            } else {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS34S1100000_30(this, str, 8));
            }
        }

        @JavascriptInterface
        public void offMethodParams(String str) throws Throwable {
            Object[] objArr;
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/tts/oecverify/methods/JsBridgeModule$AndroidJsInterface", "offMethodParams", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPUlxvbo9h0PktE8CIHO1rcWH3S3qkpw==", null)));
            if (!c0wsuLIZIZ.LIZ && (objArr = c0wsuLIZIZ.LIZJ) != null) {
                Object obj = objArr[0];
            }
        }

        @JavascriptInterface
        public void onMethodParams(String str) throws Throwable {
            Object obj;
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/tts/oecverify/methods/JsBridgeModule$AndroidJsInterface", "onMethodParams", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEhYuTITTUFQ3QACNYHJPUlxvbo9h0PktE8CIHO1rcWH3S3qkpw==", null)));
            if (c0wsuLIZIZ.LIZ) {
                return;
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            if (objArr != null && (obj = objArr[0]) != null) {
                str = (String) obj;
            }
            try {
                JSONObjectProtectorUtils.getString(new JSONObject(str), "__callback_id");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        public AndroidJsInterface(InterfaceC20220814Ac interfaceC20220814Ac) {
            this.LIZ = interfaceC20220814Ac;
        }
    }

    public final void LIZ(String str) {
        BPEAHandler bPEAHandler;
        if (str != null && this.LIZ != null && (bPEAHandler = this.LIZIZ) != null) {
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS34S1100000_30(this, str, 9));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("callJsCode ====== ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public JsBridgeModule(InterfaceC20220814Ac interfaceC20220814Ac, WebView webView) {
        this.LIZ = webView;
        if (webView == null) {
            return;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        this.LIZ.addJavascriptInterface(new AndroidJsInterface(interfaceC20220814Ac), "androidJsBridge");
        this.LIZIZ = new BPEAHandler(Looper.getMainLooper());
    }
}
