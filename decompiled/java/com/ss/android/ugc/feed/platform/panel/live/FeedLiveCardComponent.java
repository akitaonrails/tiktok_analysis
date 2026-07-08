package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C0RUJ;
import X.C1389300mG0;
import X.C1559580qge;
import X.C1559620qgi;
import X.C1566140qrE;
import X.C1594670rbF;
import X.C1594710rbJ;
import X.C19748512Ol;
import X.C299750Boz;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C703302op;
import X.EnumC1594650rbD;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveCardComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedLiveCardComponent extends BasePanelComponent implements C0RUJ {
    public Aweme LL;
    public final C01GW LLILLJJLI;
    public final C630740Ooa LLILLL;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "live_feed_live_card_component";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    public FeedLiveCardComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1534), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559620qgi(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ;
        this.LLILLL = C628500Oky.LIZ(new C1559580qge(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new InterfaceC1616070s9l() { // from class: X.0rbC
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
                    FeedLiveCardComponent feedLiveCardComponent = this.LL;
                    IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) feedLiveCardComponent.LLILLL.getValue();
                    if (iViewPagerComponentAbility2 != null) {
                        awemeLJIIIIZZ = iViewPagerComponentAbility2.LJIIIIZZ();
                    } else {
                        awemeLJIIIIZZ = null;
                    }
                    feedLiveCardComponent.LL = awemeLJIIIIZZ;
                    Aweme aweme = this.LL.LL;
                    if (aweme != null && AwemeSaaSExtKt.isLive(aweme)) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Aweme aweme2 = this.LL.LL;
                        if (aweme2 != null) {
                            AwemeBizExtKt.setLiveCardShowTime(aweme2, jCurrentTimeMillis);
                        }
                        FeedLiveCardComponent feedLiveCardComponent2 = this.LL;
                        feedLiveCardComponent2.bo(EnumC1594650rbD.CARD_SHOW, feedLiveCardComponent2.LL, jCurrentTimeMillis);
                    }
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                    Aweme awemeLJIIIIZZ;
                    FeedLiveCardComponent feedLiveCardComponent = this.LL;
                    if (feedLiveCardComponent.LL == null) {
                        IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) feedLiveCardComponent.LLILLL.getValue();
                        if (iViewPagerComponentAbility2 != null) {
                            awemeLJIIIIZZ = iViewPagerComponentAbility2.LJIIIIZZ();
                        } else {
                            awemeLJIIIIZZ = null;
                        }
                        feedLiveCardComponent.LL = awemeLJIIIIZZ;
                    }
                    Aweme aweme = this.LL.LL;
                    if (aweme != null && AwemeSaaSExtKt.isLive(aweme)) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Aweme aweme2 = this.LL.LL;
                        if (aweme2 != null) {
                            AwemeBizExtKt.setLiveCardLeaveTime(aweme2, jCurrentTimeMillis);
                        }
                        FeedLiveCardComponent feedLiveCardComponent2 = this.LL;
                        feedLiveCardComponent2.bo(EnumC1594650rbD.CARD_LEAVE, feedLiveCardComponent2.LL, jCurrentTimeMillis);
                    }
                }
            });
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (C1389300mG0.LJIL(getPanelContext())) {
            Keva keva = C1594670rbF.LIZ;
            if (C1594710rbJ.LIZ() && C1594670rbF.LIZLLL) {
                C1594670rbF.LIZLLL = false;
                if (C1594670rbF.LIZIZ().LJI() > 0) {
                    String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, C1594670rbF.LIZIZ().LJIIIIZZ());
                    if (C703302op.LIZ(json)) {
                        C1594670rbF.LIZ.storeString("consumed_live_card_data", json);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        Aweme awemeLJIIIIZZ;
        if (this.LL == null) {
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLL.getValue();
            if (iViewPagerComponentAbility != null) {
                awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            this.LL = awemeLJIIIIZZ;
        }
        Aweme aweme = this.LL;
        if (aweme != null && AwemeSaaSExtKt.isLive(aweme)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                AwemeBizExtKt.setLiveCardLeaveTime(aweme2, jCurrentTimeMillis);
            }
            bo(EnumC1594650rbD.CARD_LEAVE, this.LL, jCurrentTimeMillis);
        }
        super.onPagePause(i);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        Aweme awemeLJIIIIZZ;
        if (this.LL == null) {
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLL.getValue();
            if (iViewPagerComponentAbility != null) {
                awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            this.LL = awemeLJIIIIZZ;
        }
        Aweme aweme = this.LL;
        if (aweme != null && AwemeSaaSExtKt.isLive(aweme)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Aweme aweme2 = this.LL;
            if (aweme2 != null) {
                AwemeBizExtKt.setLiveCardShowTime(aweme2, jCurrentTimeMillis);
            }
            bo(EnumC1594650rbD.CARD_SHOW, this.LL, jCurrentTimeMillis);
        }
        super.onPageResume(i);
    }

    public final void bo(EnumC1594650rbD enumC1594650rbD, Aweme aweme, long j) {
        if (C1389300mG0.LJIL(getPanelContext())) {
            C1594670rbF.LIZJ(enumC1594650rbD, aweme, j);
        }
    }
}
