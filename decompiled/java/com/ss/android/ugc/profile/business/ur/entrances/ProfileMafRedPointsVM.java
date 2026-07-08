package com.ss.android.ugc.profile.business.ur.entrances;

import X.C01GW;
import X.C1155440gAo;
import X.C1559950qhF;
import X.C1559960qhG;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.ss.android.ugc.profile.platform.standard.vm.IProfileMafRedPoints;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class ProfileMafRedPointsVM extends IProfileMafRedPoints {
    public final C1559960qhG LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1155440gAo(false);
    }

    public ProfileMafRedPointsVM() {
        String str = C1559960qhG.LIZJ;
        this.LL = C1559950qhF.LIZ();
        this.LLILLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(342));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(int r12) {
        /*
            r11 = this;
            r4 = 0
            if (r12 == 0) goto L4a
            X.0qhG r0 = r11.LL
            com.bytedance.keva.Keva r0 = r0.LIZ
            java.lang.String r2 = "maf_red_point_quit_times"
            int r1 = r0.getInt(r2, r4)
            r0 = 3
            r5 = 1
            if (r1 >= r0) goto L4a
            X.0qhG r0 = r11.LL
            com.bytedance.keva.Keva r0 = r0.LIZ
            int r0 = r0.getInt(r2, r4)
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= 0) goto L6f
            X.0qhG r0 = r11.LL
            com.bytedance.keva.Keva r1 = r0.LIZ
            java.lang.String r0 = "show_maf_point_not_click_times"
            int r0 = r1.getInt(r0, r4)
            if (r0 != 0) goto L6f
            long r9 = java.lang.System.currentTimeMillis()
            long r2 = (long) r6
            long r9 = r9 / r2
            X.0qhG r0 = r11.LL
            com.bytedance.keva.Keva r8 = r0.LIZ
            java.lang.String r7 = "last_not_click_time"
            r0 = 0
            long r0 = r8.getLong(r7, r0)
            long r9 = r9 - r0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.DAYS
            r0 = 14
            long r7 = r7.toMillis(r0)
            long r7 = r7 / r2
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 > 0) goto L6f
        L4a:
            X.0qhG r0 = r11.LL
            com.bytedance.keva.Keva r1 = r0.LIZ
            java.lang.String r0 = "random_maf_count"
            r1.storeInt(r0, r4)
            X.01GW r0 = r11.LLILLL
            java.lang.Object r1 = r0.getValue()
            X.11PQ r1 = (X.C11PQ) r1
            X.0ic2 r0 = new X.0ic2
            r0.<init>(r4, r4)
            r1.onNext(r0)
            r0 = 115(0x73, float:1.61E-43)
            kotlin.jvm.internal.AFwS283S0000000_35 r0 = kotlin.jvm.internal.AFwS283S0000000_35.get$arr$(r0)
            r11.setState(r0)
        L6c:
            r11.LLILLJJLI = r4
            return
        L6f:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.network.spi.INetworkStateService> r0 = com.ss.android.ugc.aweme.network.spi.INetworkStateService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.network.spi.INetworkStateService r0 = (com.ss.android.ugc.aweme.network.spi.INetworkStateService) r0
            X.0Com r1 = r0.getNetworkStatus()
            X.0Com r0 = X.EnumC325100Com.STRONG
            if (r1 != r0) goto L8d
            r1 = 1
        L84:
            boolean r0 = X.C816930W2x.LIZ()
            if (r0 == 0) goto L8f
            if (r1 != 0) goto L8f
            goto L4a
        L8d:
            r1 = 0
            goto L84
        L8f:
            X.0qhG r0 = r11.LL
            com.bytedance.keva.Keva r4 = r0.LIZ
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = (long) r6
            long r2 = r2 / r0
            java.lang.String r0 = "last_get_red_point_time"
            r4.storeLong(r0, r2)
            X.01GW r0 = r11.LLILLL
            java.lang.Object r1 = r0.getValue()
            X.11PQ r1 = (X.C11PQ) r1
            X.0ic2 r0 = new X.0ic2
            r0.<init>(r5, r12)
            r1.onNext(r0)
            r0 = 114(0x72, float:1.6E-43)
            kotlin.jvm.internal.AFwS283S0000000_35 r0 = kotlin.jvm.internal.AFwS283S0000000_35.get$arr$(r0)
            r11.setState(r0)
            r4 = 1
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.entrances.ProfileMafRedPointsVM.vQ2(int):void");
    }
}
