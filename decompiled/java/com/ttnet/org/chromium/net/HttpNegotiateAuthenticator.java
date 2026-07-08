package com.ttnet.org.chromium.net;

import X.C2188811AlT;
import X.C2423909ef;
import X.C786410Ut5;
import X.C787230UuP;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class HttpNegotiateAuthenticator {
    public static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator();
    }

    public void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = C787230UuP.LIZ;
        C2423909ef c2423909ef = new C2423909ef();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SPNEGO:HOSTBASED:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        AccountManager.get(context);
        Bundle bundle = new Bundle();
        c2423909ef.LIZ = bundle;
        if (str2 != null) {
            C786410Ut5.LJJJI("incomingAuthToken", str2, bundle);
        }
        c2423909ef.LIZ.putBoolean("canDelegate", z);
    }
}
