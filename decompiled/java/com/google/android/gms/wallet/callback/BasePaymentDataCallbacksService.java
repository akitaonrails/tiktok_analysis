package com.google.android.gms.wallet.callback;

import X.AbstractC812800VuY;
import X.AbstractServiceC812790VuX;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wallet.PaymentData;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BasePaymentDataCallbacksService extends AbstractServiceC812790VuX {
    public abstract AbstractC812800VuY LIZIZ();

    @Override // X.AbstractServiceC812790VuX, android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // X.AbstractServiceC812790VuX
    public final void LIZ(CallbackInput callbackInput) {
        if (callbackInput.zza != 0) {
            LIZIZ();
            int i = callbackInput.zza;
            if (i != 1) {
                if (i == 2) {
                    Parcelable.Creator<IntermediatePaymentData> creator = IntermediatePaymentData.CREATOR;
                    byte[] bArr = callbackInput.LL;
                    if (bArr != null) {
                        throw null;
                    }
                    throw null;
                }
                throw new IllegalStateException("Unknown Callback Types");
            }
            Parcelable.Creator<PaymentData> creator2 = PaymentData.CREATOR;
            byte[] bArr2 = callbackInput.LL;
            if (bArr2 != null) {
                throw null;
            }
            throw null;
        }
        throw new IllegalStateException("Callback Types must be set");
    }

    @Override // X.AbstractServiceC812790VuX, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // X.AbstractServiceC812790VuX, android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/google/android/gms/wallet/callback/BasePaymentDataCallbacksService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzrf1pHi0ACMr7D5e5PBSfkwKnDhW6HkmEtSl5jyFpDAaGvJan7WI9lBQ/2gatP+g==", new String[]{"016a9"})));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        return super.onBind(intent);
    }
}
