package com.ss.android.ugc.aweme.account.login.auth.ui.login;

import X.AnonymousClass0951;
import X.C09IC;
import X.C1238980iLY;
import X.C1BNE;
import X.C2252321DDq;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes20.dex */
public final class SmsInputViewModel extends ViewModel {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;

    public SmsInputViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1238980iLY("", false, true, false, "", true));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public final void vQ2(String str) {
        Object value;
        C2252321DDq c2252321DDq = this.LL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1238980iLY.LIZ((C1238980iLY) value, false, str, false, null, false, 51)));
    }

    public final void wQ2(boolean z) {
        Object value;
        C2252321DDq c2252321DDq = this.LL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1238980iLY.LIZ((C1238980iLY) value, false, null, z, null, false, 55)));
    }
}
