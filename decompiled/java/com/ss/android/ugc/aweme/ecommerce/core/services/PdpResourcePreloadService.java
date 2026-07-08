package com.ss.android.ugc.aweme.ecommerce.core.services;

import X.C1155800gBO;
import X.C1326490kch;
import X.C1388190mED;
import X.C1546370qLL;
import X.C1546390qLN;
import X.C1546400qLO;
import X.C1756440voA;
import X.C19EG;
import X.C20161913uj;
import X.C2188811AlT;
import X.C2232408os;
import X.C23250099c;
import X.C786410Ut5;
import X.C817503Hh;
import X.EnumC1755660vmu;
import X.InterfaceC497601wk;
import Y.ARunnableS101S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpResourceService;

/* JADX INFO: loaded from: classes24.dex */
public final class PdpResourcePreloadService implements IPdpResourceService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IPdpResourceService
    public final void LIZ(Context context, int i, boolean z, Fragment fragment, Integer num) {
        InterfaceC497601wk lifecycleScope;
        LifecycleOwner lifecycleOwnerLIZLLL;
        if (C1155800gBO.LIZJ()) {
            if (num != null || (z && (num = Integer.valueOf(EnumC1755660vmu.SCENE_READY.getValue())) != null)) {
                num.intValue();
                C1546400qLO.LIZ(C1546400qLO.LIZ, context, i, num.intValue(), fragment, null, 16);
            } else {
                return;
            }
        } else {
            C1546390qLN.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("prefetchPdpResource, start, prefetchType=");
            sbLIZ.append(i);
            sbLIZ.append(", firstScreenResource=");
            sbLIZ.append(z);
            C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ));
            if (C1546390qLN.LJIIIIZZ && !C1546390qLN.LIZIZ.get() && !C1546390qLN.LIZJ.get()) {
                if (fragment != null) {
                    if (C20161913uj.LIZ) {
                        lifecycleScope = LifecycleOwnerKt.getLifecycleScope(C20161913uj.LIZJ(fragment));
                    } else {
                        lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment);
                    }
                } else if (C20161913uj.LIZ) {
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                    if (c19egLIZIZ != null && (lifecycleOwnerLIZLLL = C20161913uj.LIZLLL(c19egLIZIZ)) != null) {
                        lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZLLL);
                    }
                    lifecycleScope = C817503Hh.LL;
                    C23250099c.LIZLLL(lifecycleScope, new C2232408os(C1546390qLN.LIZJ()).plus(C1546390qLN.LJIIJJI), null, new C1546370qLL(i, context, z, null), 2);
                } else {
                    C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
                    if (c19egLIZIZ2 != null) {
                        lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ2);
                    }
                    lifecycleScope = C817503Hh.LL;
                    C23250099c.LIZLLL(lifecycleScope, new C2232408os(C1546390qLN.LIZJ()).plus(C1546390qLN.LJIIJJI), null, new C1546370qLL(i, context, z, null), 2);
                }
                if (lifecycleScope == null) {
                    lifecycleScope = C817503Hh.LL;
                }
                C23250099c.LIZLLL(lifecycleScope, new C2232408os(C1546390qLN.LIZJ()).plus(C1546390qLN.LJIIJJI), null, new C1546370qLL(i, context, z, null), 2);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("skip prefetchPdpResource, overallSwitch=");
                sbLIZ2.append(C1546390qLN.LJIIIIZZ);
                sbLIZ2.append(", isTaskRunning=");
                sbLIZ2.append(C1546390qLN.LIZIZ.get());
                sbLIZ2.append(", preloadTaskComplete=");
                sbLIZ2.append(C1546390qLN.LIZJ.get());
                C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (C1756440voA.LIZ().preemptiveViewPreloadSwitch) {
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C786410Ut5.LJLIIL(1000L, bPEAHandler, new ARunnableS101S0100000_1(activityLIZ, 31));
            }
        }
    }
}
