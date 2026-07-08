package com.ss.android.ugc.aweme.legoImp.task;

import X.C098200Yq;
import X.C0CCZ;
import X.C0VZ0;
import X.C17980072k;
import X.C189200o6;
import X.C2188811AlT;
import X.C838280WuY;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC838350Wuf;
import android.content.Context;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC20234614Fk
public final class BPEAPreloadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "BPEAPreloadTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return ((Boolean) C17980072k.LIZLLL.getValue()).booleanValue();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Object c098200Yq;
        try {
            long jNanoTime = System.nanoTime();
            AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(506);
            Set<InterfaceC838350Wuf> set = C838280WuY.LIZ;
            aFwS189S0000000_3.invoke();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("end preload:");
            sbLIZ.append((System.nanoTime() - jNanoTime) / 1000000.0f);
            sbLIZ.append("ms");
            c098200Yq = Integer.valueOf(Log.d("BPEAPreloadTask", C2188811AlT.LIZIZ(sbLIZ)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        ComplianceServiceProvider.LJI();
    }
}
