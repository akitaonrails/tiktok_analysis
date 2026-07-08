package com.ss.android.ugc.aweme.localservice.network;

import X.C098200Yq;
import X.C0X52;
import X.C0XM9;
import X.C13LP;
import X.C1499330p7T;
import X.C189200o6;
import X.C718040SEo;
import X.C794800VFu;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class LocalServiceTraceBlocker implements NetworkPartner.Blocker {
    public final Set<String> LIZ;

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LJFF(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    public LocalServiceTraceBlocker(List<String> list) {
        this.LIZ = C13LP.LLIIJI(list);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LIZJ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        try {
            String strLIZ = c0xm9.LIZJ.LJFF.LIZ();
            if ((!this.LIZ.isEmpty()) && this.LIZ.contains(strLIZ)) {
                c0xm9.LIZLLL.LIZ("ls_traceparent", C794800VFu.LIZ());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
