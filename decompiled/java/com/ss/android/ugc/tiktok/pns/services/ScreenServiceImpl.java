package com.ss.android.ugc.tiktok.pns.services;

import X.C098200Yq;
import X.C15ZD;
import X.C15ZE;
import X.C15ZI;
import X.C15ZL;
import X.C189200o6;
import X.C20538115Yd;
import X.EnumC1744820vVQ;
import X.EnumC992810bwV;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.UserDetailsInfoBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.IScreenTimeService;
import com.ss.android.ugc.tiktok.pns.InitDigitalWellebingInfraSDKTask;
import com.ss.android.ugc.tiktok.pns.InitScreenTimeSDKTask;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import com.ss.android.ugc.tiktok.pns.ui.ScheduleDowntimeServerDrivenActivity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class ScreenServiceImpl implements IScreenTimeService {
    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final int LJIIIZ() {
        Object c098200Yq;
        try {
            UserDetailsInfoBean userDetailsInfoBeanLJJII = ComplianceServiceProvider.LJIL().LJJII();
            c098200Yq = Integer.valueOf(userDetailsInfoBeanLJJII != null ? userDetailsInfoBeanLJJII.todayUsageTime : 0);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        int iIntValue = num != null ? num.intValue() : 0;
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
        return iIntValue + ((int) (pnSDigitalWellbeingSDKService != null ? pnSDigitalWellbeingSDKService.LIZIZ() : 0L));
    }

    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final boolean LIZ() {
        ScheduleDowntimeServerDrivenActivity.LLJJIJIL.getClass();
        return ScheduleDowntimeServerDrivenActivity.LLJJJIL;
    }

    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final void LIZLLL() {
        C15ZI c15zi = C15ZE.LIZIZ;
        if (c15zi != null) {
            c15zi.LJIIIIZZ();
        }
        C15ZI c15zi2 = C15ZE.LIZIZ;
        if (c15zi2 != null) {
            c15zi2.LIZLLL(EnumC992810bwV.REMOVE_BY_BIZ);
            c15zi2.LIZLLL = null;
            c15zi2.LJ = null;
            c15zi2.LJFF = null;
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final InitDigitalWellebingInfraSDKTask LJ() {
        return new InitDigitalWellebingInfraSDKTask();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final void LJFF() {
        C15ZL c15zl = C15ZE.LIZ;
        if (c15zl != null) {
            c15zl.LIZLLL(EnumC992810bwV.REMOVE_BY_BIZ);
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final boolean LJIIIIZZ() {
        ScheduleDowntimeServerDrivenActivity.LLJJIJIL.getClass();
        return ScheduleDowntimeServerDrivenActivity.LLJJJIL;
    }

    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final InitScreenTimeSDKTask initialize() {
        return new InitScreenTimeSDKTask();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final boolean LIZIZ() {
        return ComplianceServiceProvider.LJIL().LJJIJIIJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            r13 = this;
            X.15Yn r0 = X.C20538115Yd.LIZ()
            java.util.List<X.15ZD> r5 = r0.weekSettings
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 7
            int r3 = r0.get(r1)
            r12 = 0
            if (r3 > 0) goto L14
            int r3 = r3 + 7
        L14:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r4 = r0.get(r1)
            r10 = 1
            int r4 = r4 - r10
            if (r4 > 0) goto L22
            int r4 = r4 + 7
        L22:
            r9 = 0
            if (r5 == 0) goto L8f
            java.util.Iterator r2 = r5.iterator()
        L29:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lbd
            java.lang.Object r11 = r2.next()
            r0 = r11
            X.15ZD r0 = (X.C15ZD) r0
            int r1 = r0.weekDay
            int r0 = r3 + (-1)
            if (r0 != 0) goto L3d
            r0 = 7
        L3d:
            if (r1 != r0) goto L29
        L3f:
            X.15ZD r11 = (X.C15ZD) r11
            java.util.Iterator r3 = r5.iterator()
        L45:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.15ZD r0 = (X.C15ZD) r0
            int r1 = r0.weekDay
            int r0 = r4 + (-1)
            if (r0 != 0) goto L59
            r0 = 7
        L59:
            if (r1 != r0) goto L45
            r9 = r2
        L5c:
            X.15ZD r9 = (X.C15ZD) r9
            if (r11 == 0) goto Lbb
            int r0 = r11.status
            if (r0 != r10) goto Lbb
            r0 = 1
        L65:
            r7 = 12
            r8 = 11
            if (r0 == 0) goto L93
            int r6 = r11.startHour
            int r5 = r11.startMinute
            int r4 = r11.endHour
            int r3 = r11.endMinute
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            int r0 = r1.get(r8)
            int r2 = r0 * 60
            int r0 = r1.get(r7)
            int r2 = r2 + r0
            int r1 = r6 * 60
            int r1 = r1 + r5
            int r0 = r4 * 60
            int r0 = r0 + r3
            if (r0 <= r1) goto L90
            if (r1 > r2) goto L93
            if (r2 > r0) goto L93
        L8e:
            r12 = 1
        L8f:
            return r12
        L90:
            if (r2 < r1) goto L93
            goto L8e
        L93:
            if (r9 == 0) goto L8f
            int r0 = r9.status
            if (r0 != r10) goto L8f
            int r6 = r9.startHour
            int r5 = r9.startMinute
            int r4 = r9.endHour
            int r3 = r9.endMinute
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            int r0 = r1.get(r8)
            int r2 = r0 * 60
            int r0 = r1.get(r7)
            int r2 = r2 + r0
            int r1 = r6 * 60
            int r1 = r1 + r5
            int r0 = r4 * 60
            int r0 = r0 + r3
            if (r0 >= r1) goto L8f
            if (r2 >= r0) goto L8f
            goto L8e
        Lbb:
            r0 = 0
            goto L65
        Lbd:
            r11 = r9
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.pns.services.ScreenServiceImpl.LIZJ():boolean");
    }

    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final boolean LJI() {
        List<C15ZD> list;
        if (C20538115Yd.LIZ().downTimeStatus != 1 || (list = C20538115Yd.LIZ().weekSettings) == null || list.isEmpty()) {
            return false;
        }
        Iterator<C15ZD> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().status == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final int LJII() {
        return ComplianceServiceProvider.LJIL().LJJJIL();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IScreenTimeService
    public final boolean LJIIJ() {
        return C20538115Yd.LIZ().skipDownTimeStatus == EnumC1744820vVQ.APPROVED.ordinal();
    }
}
