package com.google.android.gms.common;

import X.C1C7U;
import X.C786410Ut5;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zaq;

/* JADX INFO: loaded from: classes14.dex */
public final class zac extends zaq {
    public final Context LL;
    public final /* synthetic */ GoogleApiAvailability LLILLJJLI;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("zac@3fc9.handleMessage");
        if (message.what != 1) {
            C1C7U.LIZIZ("zac@3fc9.handleMessage");
            return;
        }
        int iB4 = C786410Ut5.b4(this.LLILLJJLI, this.LL);
        if (this.LLILLJJLI.isUserResolvableError(iB4)) {
            this.LLILLJJLI.showErrorNotification(this.LL, iB4);
            C1C7U.LIZIZ("zac@3fc9.handleMessage");
        } else {
            C1C7U.LIZIZ("zac@3fc9.handleMessage");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zac(GoogleApiAvailability googleApiAvailability, Context context) {
        Looper looperMyLooper;
        this.LLILLJJLI = googleApiAvailability;
        if (Looper.myLooper() == null) {
            looperMyLooper = Looper.getMainLooper();
        } else {
            looperMyLooper = Looper.myLooper();
        }
        super(looperMyLooper);
        this.LL = C786410Ut5.N3(context);
    }
}
