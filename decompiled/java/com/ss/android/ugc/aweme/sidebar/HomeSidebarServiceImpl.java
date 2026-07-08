package com.ss.android.ugc.aweme.sidebar;

import X.C0AD1;
import X.C0CP9;
import X.C0CUK;
import X.C0DMM;
import X.C0S4U;
import X.C1154980gA4;
import X.C1570640qyU;
import X.C1571680r0A;
import X.C1580280rE2;
import X.C1580440rEI;
import X.C1584320rKY;
import X.C19EG;
import X.C2421209eE;
import X.C277650AuR;
import X.C343710Ddh;
import X.C486860J7k;
import X.C799900VZk;
import X.EnumC1570650qyV;
import android.app.Activity;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class HomeSidebarServiceImpl implements IHomeSidebarService {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.spi.IHomeSidebarService
    public final void LIZ() {
        this.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomeSidebarService
    public final boolean LIZJ() {
        if (!C1571680r0A.LIZIZ || !C277650AuR.LIZ()) {
            if (!C0AD1.LIZ()) {
                return false;
            }
            C799900VZk.LIZ.getClass();
            return C0CP9.LIZ() && C1580440rEI.LIZ.LIZJ();
        }
        if (!C0AD1.LIZ()) {
            return false;
        }
        if (!this.LIZ) {
            C799900VZk.LIZ.getClass();
            if (!C0CP9.LIZ()) {
                return false;
            }
        }
        return C1580440rEI.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomeSidebarService
    public final boolean LIZIZ(C1154980gA4 c1154980gA4) {
        C19EG c19eg;
        String str;
        HomeViewPagerAbility homeViewPagerAbilityLIZ;
        Integer numLJIL;
        HomeTabAbility homeTabAbilityLIZ;
        String str2;
        Activity activityLIZ = C2421209eE.LIZ();
        String strCt0 = null;
        if (activityLIZ instanceof C19EG) {
            c19eg = (C19EG) activityLIZ;
        } else {
            c19eg = null;
        }
        if (c19eg == null || !LJ(c19eg)) {
            return false;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        if (!c1154980gA4.LIZIZ && !c1154980gA4.LIZJ && ((str2 = c1154980gA4.LIZ) == null || a0.LJJJIL(str2))) {
            C1570640qyU.LIZ.LIZ();
        } else {
            synchronized (C1570640qyU.LIZ) {
                C1570640qyU.LIZIZ = c1154980gA4;
            }
        }
        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
        MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg);
        if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
            strCt0 = homeTabAbilityLIZ.Ct0();
        }
        c1584320rKY.getClass();
        String strLJI = C1584320rKY.LJI(strCt0);
        MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19eg);
        if (mainActivityScopeLIZJ2 != null && (homeViewPagerAbilityLIZ = C0CUK.LIZ(mainActivityScopeLIZJ2)) != null && (numLJIL = homeViewPagerAbilityLIZ.LJIL()) != null && numLJIL.intValue() == 0) {
            str = "tab_slide_right";
        } else {
            str = "slide_right";
        }
        C1580280rE2.LIZIZ = strLJI;
        C1580280rE2.LIZJ = str;
        C1580280rE2.LIZ = strValueOf;
        C486860J7k.LIZIZ(c19eg).kE0("page_sidebar", true);
        C1580280rE2.LIZ();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomeSidebarService
    public final void LIZLLL(EnumC1570650qyV enumC1570650qyV) {
        C1580280rE2.LIZJ(enumC1570650qyV);
    }

    @Override // com.ss.android.ugc.aweme.spi.IHomeSidebarService
    public final boolean LJ(Activity activity) {
        if (activity == null || !(activity instanceof C19EG) || !LIZJ() || !Intrinsics.LJFF(C343710Ddh.LIZ((C19EG) activity).CQ2(), "HOME")) {
            return false;
        }
        return true;
    }
}
