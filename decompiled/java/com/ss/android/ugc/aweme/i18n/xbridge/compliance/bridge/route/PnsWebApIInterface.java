package com.ss.android.ugc.aweme.i18n.xbridge.compliance.bridge.route;

import X.C085T;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class PnsWebApIInterface {
    public final Context LIZ;

    public PnsWebApIInterface(Context context) {
        this.LIZ = context;
    }

    @JavascriptInterface
    public final void historyGo(int i) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/ss/android/ugc/aweme/i18n/xbridge/compliance/bridge/route/PnsWebApIInterface", "historyGo", this, new Object[]{Integer.valueOf(i)}, "void", new C0WZW(false, "(I)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOP5O5GAxDAg0EhgGtxyBzY+9jHwgjkT6NStHnGxFV365UrYmOP1AjwG6WtQUrcwIxZB+KtTag8=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            ((Integer) obj).intValue();
        }
        Activity activityLIZ = C085T.LIZ(this.LIZ);
        if (activityLIZ != null) {
            activityLIZ.finish();
        }
    }
}
