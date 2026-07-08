package com.ss.android.ugc.aweme.amazon;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C7740030o;
import X.C828200WeI;
import Y.ARunnableS82S0200000_13;
import android.webkit.JavascriptInterface;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.amazon.model.AmazonWebMessage;

/* JADX INFO: loaded from: classes14.dex */
public final class AmazonShopWebInterfaceHandler {
    public final C828200WeI LIZ;

    public AmazonShopWebInterfaceHandler(C828200WeI c828200WeI) {
        this.LIZ = c828200WeI;
    }

    @JavascriptInterface
    public final void postMessage(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/ss/android/ugc/aweme/amazon/AmazonShopWebInterfaceHandler", "postMessage", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOulYoXB0nwCRDomivSflG/1ZtsPFw2oBS/9kz5adp+0uXuPSQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        C828200WeI c828200WeI = this.LIZ;
        if (c828200WeI != null) {
            try {
                HandlerHook.viewPost(c828200WeI.LIZ, new ARunnableS82S0200000_13((AmazonWebMessage) C7740030o.LIZ().getGson().LJII(str, AmazonWebMessage.class), c828200WeI, 110));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
