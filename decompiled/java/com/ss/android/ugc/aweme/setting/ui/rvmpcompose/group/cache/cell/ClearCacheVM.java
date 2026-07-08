package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell;

import X.C11NZ;
import X.C11S5;
import X.C1669660tYC;
import X.C1701940uOG;
import X.C2016407v8;
import X.C2016507v9;
import X.C2019307vb;
import X.InterfaceC0148002o;
import Y.AfS172S0100000_3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class ClearCacheVM extends BaseCellSettingsVM<C2016407v8> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2016407v8(C1669660tYC.M, C1669660tYC.L, 2131834888, null, null, null, new C2016507v9(this), new AwS617S0100000_3(this, 49), false);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C2019307vb.LIZ[event.ordinal()] == 1) {
            disposeOnClear(C11NZ.LJJJJI(new Callable() { // from class: X.087F
                /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        r7 = this;
                        java.lang.String r6 = "ClearCacheVM@5c77.setupYellowPointObservation$1"
                        X.C1C7U.LIZ(r6)
                        long r3 = X.C2426909f9.LIZ()
                        com.bytedance.keva.Keva r1 = X.C2016707vB.LIZ()
                        java.lang.String r0 = "has_show_disk_manager_dot"
                        r5 = 1
                        boolean r0 = r1.getBoolean(r0, r5)
                        if (r0 == 0) goto L48
                        X.0CLW r0 = X.C0CLW.LIZIZ     // Catch: java.lang.Exception -> L23
                        com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r0.LIZ     // Catch: java.lang.Exception -> L23
                        java.lang.Long r0 = r0.getShowStorageDotSize()     // Catch: java.lang.Exception -> L23
                        long r1 = r0.longValue()     // Catch: java.lang.Exception -> L23
                        goto L2a
                    L23:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        r1 = 1073741824(0x40000000, double:5.304989477E-315)
                    L2a:
                        int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                        if (r0 < 0) goto L50
                        com.bytedance.keva.Keva r3 = X.C2016707vB.LIZ()
                        java.lang.String r2 = "last_show_disk_manager_dot_time"
                        r0 = 0
                        long r0 = r3.getLong(r2, r0)
                        long r3 = java.lang.System.currentTimeMillis()
                        long r3 = r3 - r0
                        r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
                        int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                        if (r0 < 0) goto L50
                    L48:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                        X.C1C7U.LIZIZ(r6)
                        return r0
                    L50:
                        r5 = 0
                        goto L48
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C087F.call():java.lang.Object");
                }
            }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS172S0100000_3(this, 86)));
        }
    }
}
