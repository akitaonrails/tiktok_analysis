package com.google.android.gms.auth.api.signin;

import X.AbstractC831380WjQ;
import X.C831500Wjc;
import X.C831630Wjp;
import X.C832010WkR;
import X.C833530Wmt;
import X.InterfaceC831720Wjy;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes14.dex */
public class GoogleSignInClient extends AbstractC831380WjQ<GoogleSignInOptions> {
    public static int LIZ = 1;

    public final synchronized int LIZLLL() {
        int i;
        i = LIZ;
        if (i == 1) {
            Context context = this.zab;
            GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
            int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context, 12451000);
            if (iIsGooglePlayServicesAvailable == 0) {
                i = 4;
                LIZ = 4;
            } else if (googleApiAvailability.getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, null) != null || DynamiteModule.LIZ(context, "com.google.android.gms.auth.api.fallback") == 0) {
                i = 2;
                LIZ = 2;
            } else {
                i = 3;
                LIZ = 3;
            }
        }
        return i;
    }

    public GoogleSignInClient(Context context, GoogleSignInOptions googleSignInOptions) {
        C832010WkR<GoogleSignInOptions> c832010WkR = C833530Wmt.LIZIZ;
        C831500Wjc c831500Wjc = new C831500Wjc();
        c831500Wjc.LIZ = new C831630Wjp();
        super(context, c832010WkR, googleSignInOptions, c831500Wjc.LIZ());
    }

    public GoogleSignInClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C833530Wmt.LIZIZ, googleSignInOptions, (InterfaceC831720Wjy) new C831630Wjp());
    }
}
