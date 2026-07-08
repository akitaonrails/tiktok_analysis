package com.google.android.gms.common.internal;

import X.AbstractC832390Wl3;
import X.AbstractC832580WlM;
import X.C1C7U;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzi;

/* JADX INFO: loaded from: classes14.dex */
public final class zzb extends zzi {
    public final /* synthetic */ AbstractC832390Wl3 LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        C1C7U.LIZ("zzb@dabc.handleMessage");
        if (this.LL.zzd.get() != message.arg1) {
            int i = message.what;
            if (i != 2 && i != 1 && i != 7) {
                C1C7U.LIZIZ("zzb@dabc.handleMessage");
                return;
            }
            AbstractC832580WlM abstractC832580WlM = (AbstractC832580WlM) HandlerHook.getMessageObj(message.obj);
            abstractC832580WlM.LIZIZ();
            abstractC832580WlM.LIZLLL();
            C1C7U.LIZIZ("zzb@dabc.handleMessage");
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || ((i2 == 4 && !this.LL.enableLocalFallback()) || message.what == 5)) && !this.LL.isConnecting()) {
            AbstractC832580WlM abstractC832580WlM2 = (AbstractC832580WlM) HandlerHook.getMessageObj(message.obj);
            abstractC832580WlM2.LIZIZ();
            abstractC832580WlM2.LIZLLL();
            C1C7U.LIZIZ("zzb@dabc.handleMessage");
            return;
        }
        int i3 = message.what;
        PendingIntent pendingIntent = null;
        if (i3 == 4) {
            this.LL.zzB = new ConnectionResult(message.arg2);
            if (AbstractC832390Wl3.zzo(this.LL)) {
                AbstractC832390Wl3 abstractC832390Wl3 = this.LL;
                if (!abstractC832390Wl3.zzC) {
                    abstractC832390Wl3.zzp(3, null);
                    C1C7U.LIZIZ("zzb@dabc.handleMessage");
                    return;
                }
            }
            AbstractC832390Wl3 abstractC832390Wl32 = this.LL;
            if (abstractC832390Wl32.zzB != null) {
                connectionResult2 = abstractC832390Wl32.zzB;
            } else {
                connectionResult2 = new ConnectionResult(8);
            }
            this.LL.zzc.LIZ(connectionResult2);
            this.LL.onConnectionFailed(connectionResult2);
            C1C7U.LIZIZ("zzb@dabc.handleMessage");
            return;
        }
        if (i3 == 5) {
            AbstractC832390Wl3 abstractC832390Wl33 = this.LL;
            if (abstractC832390Wl33.zzB != null) {
                connectionResult = abstractC832390Wl33.zzB;
            } else {
                connectionResult = new ConnectionResult(8);
            }
            this.LL.zzc.LIZ(connectionResult);
            this.LL.onConnectionFailed(connectionResult);
            C1C7U.LIZIZ("zzb@dabc.handleMessage");
            return;
        }
        if (i3 == 3) {
            if (HandlerHook.getMessageObj(message.obj) instanceof PendingIntent) {
                pendingIntent = (PendingIntent) HandlerHook.getMessageObj(message.obj);
            }
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
            this.LL.zzc.LIZ(connectionResult3);
            this.LL.onConnectionFailed(connectionResult3);
            C1C7U.LIZIZ("zzb@dabc.handleMessage");
            return;
        }
        if (i3 == 6) {
            this.LL.zzp(5, null);
            AbstractC832390Wl3 abstractC832390Wl34 = this.LL;
            if (abstractC832390Wl34.zzw != null) {
                abstractC832390Wl34.zzw.Js(message.arg2);
            }
            this.LL.onConnectionSuspended(message.arg2);
            AbstractC832390Wl3.zzn(this.LL, 5, 1, null);
            C1C7U.LIZIZ("zzb@dabc.handleMessage");
            return;
        }
        if (i3 == 2 && !this.LL.isConnected()) {
            AbstractC832580WlM abstractC832580WlM3 = (AbstractC832580WlM) HandlerHook.getMessageObj(message.obj);
            abstractC832580WlM3.LIZIZ();
            abstractC832580WlM3.LIZLLL();
            C1C7U.LIZIZ("zzb@dabc.handleMessage");
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + i4, new Exception());
            C1C7U.LIZIZ("zzb@dabc.handleMessage");
            return;
        }
        AbstractC832580WlM abstractC832580WlM4 = (AbstractC832580WlM) HandlerHook.getMessageObj(message.obj);
        synchronized (abstractC832580WlM4) {
            try {
                obj = abstractC832580WlM4.LIZ;
                if (abstractC832580WlM4.LIZIZ) {
                    abstractC832580WlM4.toString();
                }
            } finally {
            }
        }
        if (obj != null) {
            try {
                abstractC832580WlM4.LIZ();
            } catch (RuntimeException th) {
                throw th;
            }
        }
        synchronized (abstractC832580WlM4) {
            try {
                abstractC832580WlM4.LIZIZ = true;
            } finally {
            }
        }
        abstractC832580WlM4.LIZLLL();
        C1C7U.LIZIZ("zzb@dabc.handleMessage");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(AbstractC832390Wl3 abstractC832390Wl3, Looper looper) {
        super(looper);
        this.LL = abstractC832390Wl3;
    }
}
