package com.ss.android.ugc.aweme.compliance.common.foundation.impl.userbehavior;

import X.C01GW;
import X.C0X52;
import X.C112500bj;
import X.C159800jM;
import X.C452501pT;
import X.InterfaceC1519070pdJ;
import X.InterfaceC160100jP;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class PNSNetworkBehaviorBystander implements NetworkPartner.Bystander {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(61));

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
        CopyOnWriteArrayList<InterfaceC160100jP> copyOnWriteArrayListLJ;
        InterfaceC1519070pdJ interfaceC1519070pdJ = (InterfaceC1519070pdJ) this.LIZ.getValue();
        if (interfaceC1519070pdJ != null && (copyOnWriteArrayListLJ = interfaceC1519070pdJ.LJ()) != null && !copyOnWriteArrayListLJ.isEmpty()) {
            String path = request.getPath();
            if (path == null) {
                path = "";
            }
            C159800jM c159800jM = new C159800jM(path);
            Iterator<InterfaceC160100jP> it2 = copyOnWriteArrayListLJ.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LIZJ(c159800jM);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        CopyOnWriteArrayList<InterfaceC160100jP> copyOnWriteArrayListLJ;
        InterfaceC1519070pdJ interfaceC1519070pdJ = (InterfaceC1519070pdJ) this.LIZ.getValue();
        C112500bj c112500bj = null;
        if (interfaceC1519070pdJ != null && (copyOnWriteArrayListLJ = interfaceC1519070pdJ.LJ()) != null && !copyOnWriteArrayListLJ.isEmpty()) {
            String path = request.getPath();
            if (path == null) {
                path = "";
            }
            C159800jM c159800jM = new C159800jM(path);
            if (c0x52 != null) {
                c112500bj = new C112500bj(c0x52.LIZ.LIZIZ);
            }
            Iterator<InterfaceC160100jP> it2 = copyOnWriteArrayListLJ.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LIZ(c159800jM, c112500bj, th);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
    }
}
