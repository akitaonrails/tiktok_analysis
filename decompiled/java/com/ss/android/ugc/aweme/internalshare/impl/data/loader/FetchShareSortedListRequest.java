package com.ss.android.ugc.aweme.internalshare.impl.data.loader;

import X.C0AL2;
import X.C0CO3;
import X.C1365990leP;
import X.C1366830lfl;
import X.C15504065e;
import X.C461720I8s;
import X.C799890VZj;
import X.C799900VZk;
import X.C800010VZv;
import X.EnumC1364450lbv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.ss.android.ugc.aweme.internalshare.impl.bootfinish.InternalShareInitTask;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class FetchShareSortedListRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchShareSortedListRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.BOOT_FINISH;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        if (((Boolean) C0AL2.LIZ.getValue()).booleanValue() && !z) {
            return;
        }
        if (C461720I8s.LJ()) {
            if (C15504065e.LIZ()) {
                C1365990leP c1365990leP = C1365990leP.LIZ;
                int value = EnumC1364450lbv.SOURCE_ACTION_COLD_BOOT.getValue();
                C1365990leP c1365990leP2 = C1365990leP.LIZ;
                C1365990leP.LIZJ(value, null, "default", null);
            } else {
                C1366830lfl c1366830lfl = C1366830lfl.LL;
                C1366830lfl.LJIJ();
            }
        }
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(new InternalShareInitTask());
        c799890VZj.LIZIZ();
    }
}
