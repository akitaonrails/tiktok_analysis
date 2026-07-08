package com.ss.android.ugc.aweme.checkout;

import X.C09CT;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1040060dAi;
import X.C1054390dXp;
import X.C1227904rF;
import X.C1AF0;
import Y.ARunnableS49S0300000_16;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.shopify.checkout.webMessage.ShopifyWebMessage;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ShopifyCheckoutMessageBridge {
    public final WebView LIZ;
    public final C1054390dXp LIZIZ;

    @JavascriptInterface
    public final void postMessage(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/ss/android/ugc/aweme/checkout/ShopifyCheckoutMessageBridge", "postMessage", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgZpzF0ye1IeW0oyFP1eNjftl9hShq+a6xitUvHcJUq1wGSio=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        try {
            C1227904rF.LIZ.getClass();
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            JSMessage jSMessage = (JSMessage) gsonLIZLLL.LJII(str, JSMessage.class);
            HandlerHook.viewPost(this.LIZ, new ARunnableS49S0300000_16(this, (ShopifyWebMessage) gsonLIZLLL.LJII(jSMessage.name, ShopifyWebMessage.class), jSMessage, 4));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public static final class JSMessage implements Serializable {

        @C09CT("body")
        public final String body;

        @C09CT("name")
        public final String name;

        public JSMessage() {
            this(null, null);
        }

        public JSMessage(String str, String str2) {
            this.name = str;
            this.body = str2;
        }
    }

    public ShopifyCheckoutMessageBridge(WebView webView, C1040060dAi c1040060dAi) {
        this.LIZ = webView;
        this.LIZIZ = new C1054390dXp(c1040060dAi);
        webView.addJavascriptInterface(this, "CheckoutSheetProtocolConsumer");
    }
}
