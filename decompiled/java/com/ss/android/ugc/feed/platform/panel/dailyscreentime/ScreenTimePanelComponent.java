package com.ss.android.ugc.feed.platform.panel.dailyscreentime;

import X.C01GW;
import X.C1440005kM;
import X.C1559410qgN;
import X.C1559570qgd;
import X.C1559630qgj;
import X.C1563520qn0;
import X.C1566140qrE;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class ScreenTimePanelComponent extends BasePanelComponent implements IEmptyPanelComponent, InterfaceC1554640qYg {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1074334411) {
            return null;
        }
        return this;
    }

    public ScreenTimePanelComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1530), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559630qgj(false, this));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C452501pT.LIZIZ(new C1559570qgd(this));
        this.LLILLL = C452501pT.LIZIZ(new C1559410qgN(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0qmy
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

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    if (((Boolean) C309520CBi.LIZ.getValue()).booleanValue()) {
                        C786410Ut5.LJLIIL(100L, C799570VYd.LIZJ(), new Runnable() { // from class: X.0qmx
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ScreenTimePanelComponent@c49f.onParentViewCreated$1$onPageSelected$1");
                                try {
                                    C1440005kM.LIZ(new C1563520qn0(true));
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ScreenTimePanelComponent@c49f.onParentViewCreated$1$onPageSelected$1");
                            }
                        });
                    } else {
                        C1440005kM.LIZ(new C1563520qn0(true));
                    }
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                    if (((Boolean) C309520CBi.LIZ.getValue()).booleanValue()) {
                        C786410Ut5.LJLIIL(100L, C799570VYd.LIZJ(), RunnableC1563510qmz.LL);
                    } else {
                        C1440005kM.LIZ(new C1563520qn0(false));
                    }
                }
            });
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1440005kM.LIZ(new C1563520qn0(false));
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        IRootAbility iRootAbility;
        super.onResume();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility == null || iFeedPanelPlatformAbility.LJIIIIZZ() == null || (iRootAbility = (IRootAbility) this.LLILLL.getValue()) == null || !iRootAbility.getUserVisibleHint()) {
            return;
        }
        C1440005kM.LIZ(new C1563520qn0(true));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        super.onPagePause(i);
        C1440005kM.LIZ(new C1563520qn0(false));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        super.onPageResume(i);
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility != null && iFeedPanelPlatformAbility.LJIIIIZZ() != null) {
            C1440005kM.LIZ(new C1563520qn0(true));
        }
    }
}
