package com.ss.android.ugc.feed.platform.panel.mutantcard;

import X.C01GW;
import X.C0T5M;
import X.C1389300mG0;
import X.C1559590qgf;
import X.C1559640qgk;
import X.C1566140qrE;
import X.C299750Boz;
import X.C300550BqH;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import Y.ACallableS24S2100000_31;
import Y.ACallableS75S1100000_31;
import Y.ACallableS7S1100100_31;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.mutantcard.MutantCardComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class MutantCardComponent extends BasePanelComponent {
    public long LL;
    public Aweme LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void bo() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        Aweme aweme = this.LLILLJJLI;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        String strLIZ = C1389300mG0.LIZ(getPanelContext());
        if (!C300550BqH.LIZ() || aweme == null || aweme.getCardInsertInfo() == null) {
            return;
        }
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 86400000) {
            jCurrentTimeMillis = -1;
        }
        C0T5M c0t5m = C0T5M.LIZ;
        ACallableS7S1100100_31 aCallableS7S1100100_31 = new ACallableS7S1100100_31(strLIZ, aweme, jCurrentTimeMillis, 0);
        c0t5m.getClass();
        C0T5M.LIZIZ(aCallableS7S1100100_31);
    }

    public MutantCardComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1551), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559640qgk(false, this));
        }
        this.LLILZIL = c01gwLIZIZ;
        this.LLILZLL = C452501pT.LIZIZ(new C1559590qgf(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZLL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0sAL
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
                    Aweme awemeLJIIIIZZ;
                    String strLJII;
                    String aid;
                    Aweme aweme;
                    CardInsertInfo cardInsertInfo;
                    String requestId;
                    CardInsertInfo cardInsertInfo2;
                    Aweme aweme2;
                    Aweme aweme3;
                    Aweme item;
                    InterfaceC1566480qrm interfaceC1566480qrm;
                    BaseListFragmentPanel baseListFragmentPanelOs;
                    C0SR4 c0sr4;
                    MutantCardComponent mutantCardComponent = this.LL;
                    IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) mutantCardComponent.LLILZLL.getValue();
                    String aid2 = null;
                    if (iViewPagerComponentAbility2 != null) {
                        awemeLJIIIIZZ = iViewPagerComponentAbility2.LJIIIIZZ();
                    } else {
                        awemeLJIIIIZZ = null;
                    }
                    mutantCardComponent.LLILLJJLI = awemeLJIIIIZZ;
                    MutantCardComponent mutantCardComponent2 = this.LL;
                    if (mutantCardComponent2.LLILLJJLI == null && (mutantCardComponent2.getPanelContext().LJ instanceof InterfaceC1566480qrm)) {
                        MutantCardComponent mutantCardComponent3 = this.LL;
                        C128Y c128y = mutantCardComponent3.getPanelContext().LJ;
                        if ((c128y instanceof InterfaceC1566480qrm) && (interfaceC1566480qrm = (InterfaceC1566480qrm) c128y) != null && (baseListFragmentPanelOs = interfaceC1566480qrm.Os()) != null && (c0sr4 = baseListFragmentPanelOs.LLJL) != null) {
                            item = c0sr4.getItem(i);
                        } else {
                            item = null;
                        }
                        mutantCardComponent3.LLILLJJLI = item;
                    }
                    Aweme aweme4 = this.LL.LLILLJJLI;
                    int cardType = 0;
                    if (aweme4 != null && AwemeBizExtKt.isReferralFakeAweme(aweme4) && (aweme3 = this.LL.LLILLJJLI) != null && AwemeBizExtKt.getReferralFakeAwemeType(aweme3) == 0) {
                        strLJII = C0T82.LIZLLL(C1389300mG0.LIZ(this.LL.getPanelContext()));
                    } else {
                        strLJII = null;
                    }
                    MutantCardComponent mutantCardComponent4 = this.LL;
                    Aweme aweme5 = mutantCardComponent4.LLILLJJLI;
                    String strLIZ = C1389300mG0.LIZ(mutantCardComponent4.getPanelContext());
                    if (C300550BqH.LIZ() && aweme5 != null && aweme5.getCardInsertInfo() != null) {
                        C20552315bV.LJIIL(aweme5, "show");
                        C0T5M c0t5m = C0T5M.LIZ;
                        ACallableS24S2100000_31 aCallableS24S2100000_31 = new ACallableS24S2100000_31(strLIZ, strLJII, aweme5, 0);
                        c0t5m.getClass();
                        C0T5M.LIZIZ(aCallableS24S2100000_31);
                    }
                    Aweme aweme6 = this.LL.LLILLJJLI;
                    if (aweme6 != null && aweme6.getCardInsertInfo() != null) {
                        C20647815qu c20647815qu = C20647815qu.LIZ;
                        if (strLJII == null) {
                            strLJII = C20552315bV.LJII(aweme6);
                        }
                        String aid3 = aweme6.getAid();
                        if (aid3 == null) {
                            aid3 = "";
                        }
                        String requestId2 = aweme6.getRequestId();
                        c20647815qu.getClass();
                        C20647815qu.LIZJ(strLJII, aid3, requestId2);
                    }
                    MutantCardComponent mutantCardComponent5 = this.LL;
                    mutantCardComponent5.LLILZ = false;
                    mutantCardComponent5.LL = System.currentTimeMillis();
                    C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
                    C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
                    Aweme aweme7 = this.LL.LLILLJJLI;
                    if (aweme7 != null) {
                        aid = aweme7.getAid();
                    } else {
                        aid = null;
                    }
                    if (c20285414YyLIZ.LIZLLL(C14Z5.BACKGROUND.getType(), aid)) {
                        C20552315bV.LIZ = System.currentTimeMillis();
                        MutantCardComponent mutantCardComponent6 = this.LL;
                        Aweme aweme8 = mutantCardComponent6.LLILLJJLI;
                        String strLIZ2 = C1389300mG0.LIZ(mutantCardComponent6.getPanelContext());
                        if (C300550BqH.LIZ() && aweme8 != null) {
                            C20552315bV.LIZIZ = true;
                            C0T5M c0t5m2 = C0T5M.LIZ;
                            ACallableS75S1100000_31 aCallableS75S1100000_31 = new ACallableS75S1100000_31(aweme8, strLIZ2, 3);
                            c0t5m2.getClass();
                            C0T5M.LIZIZ(aCallableS75S1100000_31);
                        }
                    }
                    if (TextUtils.equals("homepage_hot", C1389300mG0.LIZ(this.LL.getPanelContext()))) {
                        if ((C288390BSb.LIZ == 1 && (aweme2 = this.LL.LLILLJJLI) != null && aweme2.getCardInsertInfo() != null && aweme2.getCardInsertInfo().getCardType() > 0) || ((aweme = this.LL.LLILLJJLI) != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null && cardInsertInfo.getCardImplType() == 2)) {
                            C20550115b9 c20550115b9 = C20550115b9.LIZ;
                            Aweme aweme9 = this.LL.LLILLJJLI;
                            if (aweme9 != null && (cardInsertInfo2 = aweme9.getCardInsertInfo()) != null) {
                                cardType = cardInsertInfo2.getCardType();
                            }
                            Aweme aweme10 = this.LL.LLILLJJLI;
                            if (aweme10 != null) {
                                requestId = aweme10.getRequestId();
                            } else {
                                requestId = null;
                            }
                            C20550215bA c20550215bALIZIZ = C1616440sAM.LIZIZ(cardType, C1616470sAP.LIZIZ(requestId));
                            Aweme aweme11 = this.LL.LLILLJJLI;
                            if (aweme11 != null) {
                                aid2 = aweme11.getAid();
                            }
                            c20550115b9.getClass();
                            C20550115b9.LJIJ(c20550215bALIZIZ, aid2);
                        }
                    }
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                    String aid;
                    String aid2;
                    MutantCardComponent mutantCardComponent = this.LL;
                    String str = mutantCardComponent.LLILLL;
                    Aweme aweme = mutantCardComponent.LLILLJJLI;
                    String aid3 = null;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (!Intrinsics.LJFF(str, aid)) {
                        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
                        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
                        Aweme aweme2 = this.LL.LLILLJJLI;
                        if (aweme2 != null) {
                            aid2 = aweme2.getAid();
                        } else {
                            aid2 = null;
                        }
                        if (!c20285414YyLIZ.LIZLLL(C14Z5.BACKGROUND.getType(), aid2)) {
                            this.LL.bo();
                        }
                        MutantCardComponent mutantCardComponent2 = this.LL;
                        Aweme aweme3 = mutantCardComponent2.LLILLJJLI;
                        if (aweme3 != null) {
                            aid3 = aweme3.getAid();
                        }
                        mutantCardComponent2.LLILLL = aid3;
                    }
                }
            });
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        bo();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        this.LLILZ = false;
        this.LL = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        super.onPagePause(i);
        bo();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        super.onPageResume(i);
        this.LLILZ = false;
        this.LL = System.currentTimeMillis();
    }
}
