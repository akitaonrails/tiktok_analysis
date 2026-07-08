package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C0DMM;
import X.C0S4U;
import X.C1213230hg1;
import X.C1440005kM;
import X.C1584320rKY;
import X.C19EG;
import X.C20690815xq;
import X.C20690915xr;
import X.C20691015xs;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC1585190rLx;
import X.InterfaceC1616070s9l;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.live.LivePreCreatePlayerComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* JADX INFO: loaded from: classes32.dex */
public final class LivePreCreatePlayerComponent extends BasePanelComponent {
    public static boolean LLILLL;
    public static volatile String LLILZ = "";
    public final C01GW LL = C452501pT.LIZIZ(new C1213230hg1(this));
    public C20690815xq LLILLJJLI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15xq] */
    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        this.LLILLJJLI = new InterfaceC1616070s9l() { // from class: X.15xq
            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onBeforePageChange() {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageScrolledEnd(int i, float f, int i2) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageSelected(int i, boolean z) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageUnSelected(C0SZ8 c0sz8) {
            }

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onScrollToItemStart(int i) {
            }

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                String str = LivePreCreatePlayerComponent.LLILZ;
                C20691015xs.LIZJ = str;
                C20691015xs.LIZIZ.put(str, Integer.valueOf(i));
            }
        };
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this.LLILLJJLI);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        String strCt0;
        MainActivityScope mainActivityScopeLIZJ2;
        HomeTabAbility homeTabAbilityLIZ2;
        super.onResume();
        if (LLILLL) {
            return;
        }
        LLILLL = true;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19egLIZ)) != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ2)) != null) {
            homeTabAbilityLIZ2.Ss2(new InterfaceC1585190rLx() { // from class: X.15xp
                @Override // X.InterfaceC1585190rLx
                public final void p1(String str, String str2) {
                    C1584320rKY.LIZ.getClass();
                    C1584320rKY.LJI(str);
                    String strLJI = C1584320rKY.LJI(str2);
                    C1440005kM.LIZ(new C20690915xr(strLJI));
                    C20691015xs.LIZJ = strLJI;
                    boolean z = LivePreCreatePlayerComponent.LLILLL;
                    LivePreCreatePlayerComponent.LLILZ = strLJI;
                }
            });
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZ2)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null && (strCt0 = homeTabAbilityLIZ.Ct0()) != null && strCt0.length() != 0) {
            C1584320rKY.LIZ.getClass();
            LLILZ = C1584320rKY.LJI(strCt0);
            String str = LLILZ;
            C20691015xs.LIZJ = str;
            C20691015xs.LIZIZ.put(str, 0);
        }
        C1440005kM.LIZ(new C20690915xr(LLILZ));
    }
}
