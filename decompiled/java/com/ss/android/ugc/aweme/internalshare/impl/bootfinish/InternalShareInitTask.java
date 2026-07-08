package com.ss.android.ugc.aweme.internalshare.impl.bootfinish;

import X.C0CCZ;
import X.C0VZ0;
import X.C596970NbD;
import X.EnumC1733330vCt;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC596980NbE;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class InternalShareInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InternalShareInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.INTERNAL_SHARE_SORT_ONLINE, new InterfaceC596980NbE() { // from class: X.0mAG
            @Override // X.InterfaceC596980NbE
            public final void LJ(C1525630pnt c1525630pnt) {
                byte[] bArr = c1525630pnt.LIZ;
                if (bArr != null) {
                    try {
                        IInternalShareApi.LIZ.getClass();
                        C1370970lmR.LIZ().LIZIZ().LJIJI(null, EnumC1364450lbv.SOURCE_ACTION_SIGNAL.getValue(), null);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        });
    }
}
