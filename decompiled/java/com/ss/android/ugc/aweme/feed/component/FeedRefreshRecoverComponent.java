package com.ss.android.ugc.aweme.feed.component;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C0BUV;
import X.C1017070cZd;
import X.C11NJ;
import X.C1216120hkg;
import X.C128Y;
import X.C1559790qgz;
import X.C1559800qh0;
import X.C1565870qqn;
import X.C1566140qrE;
import X.C1566410qrf;
import X.C1AF0;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C277500AuC;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.C739280SzG;
import X.C823050WQl;
import X.EnumC1581350rFl;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1566480qrm;
import X.InterfaceC1616070s9l;
import X.InterfaceC494301wD;
import Y.AObserverS129S0300000_24;
import Y.ARunnableS119S0100000_19;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedRefreshRecoverComponent extends BasePanelComponent implements FeedRefreshRecoverAbility, InterfaceC1554640qYg {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public Aweme LLILLL;
    public EnumC1581350rFl LLILZ;
    public boolean LLILZIL;
    public final C11NJ LLILZLL;
    public AObserverS129S0300000_24 LLIZ;
    public final C01GW LLIZLLLIL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 881880326) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.component.FeedRefreshRecoverAbility
    public final void PL2() {
        Aweme aweme;
        if (((Number) C0BUV.LIZ.getValue()).intValue() != 3 || (aweme = this.LLILLL) == null) {
            return;
        }
        if (!bo(aweme)) {
            ho(aweme, "active_refresh", false);
            return;
        }
        try {
            fo(aweme, "active_refresh");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final IFeedPanelPlatformAbility m193do() {
        return (IFeedPanelPlatformAbility) this.LL.getValue();
    }

    public FeedRefreshRecoverComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 393), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559800qh0(false, this));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 394), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C1559790qgz(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
        this.LLILZLL = new C11NJ();
        this.LLIZLLLIL = C452501pT.LIZIZ(new C1565870qqn());
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 1436);
        EventCenter eventCenter = getEventCenter();
        if (eventCenter != null) {
            if (((HashMap) eventCenter.LL).containsKey("event_on_render_first_frame")) {
                awS563S0100000_19.invoke();
                return;
            }
            AObserverS129S0300000_24 aObserverS129S0300000_24 = new AObserverS129S0300000_24(awS563S0100000_19, eventCenter, this, 1);
            this.LLIZ = aObserverS129S0300000_24;
            eventCenter.yQ2("event_on_render_first_frame", aObserverS129S0300000_24, false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        Aweme awemeLJIIIIZZ;
        super.onDestroy();
        this.LLILZLL.dispose();
        if (((Number) C277500AuC.LIZ.getValue()).intValue() <= 0 || !C2214201BlK.LJIIJJI) {
            return;
        }
        ((AbstractC1604130rqV) this.LLIZLLLIL.getValue()).LJIIJJI(AFwS213S0000000_24.get$arr$(140));
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM193do = m193do();
        if (iFeedPanelPlatformAbilityM193do == null || (awemeLJIIIIZZ = iFeedPanelPlatformAbilityM193do.LJIIIIZZ()) == null) {
            return;
        }
        C1216120hkg.LIZ.getClass();
        C823050WQl.LIZLLL().submit(new ARunnableS119S0100000_19(awemeLJIIIIZZ, 187));
    }

    public final boolean bo(Aweme aweme) {
        Aweme awemeLJIIIIZZ;
        if (aweme.isAd() || AwemeSaaSExtKt.isLive(aweme) || C1017070cZd.LLIZLLLIL(aweme) || aweme.getCardInsertInfo() != null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author != null && author.isBlock()) {
            return false;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM193do = m193do();
        if (iFeedPanelPlatformAbilityM193do != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityM193do.LJIIIIZZ()) != null && TextUtils.equals(awemeLJIIIIZZ.getAid(), aweme.getAid())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.component.FeedRefreshRecoverAbility
    public final void kj1(EnumC1581350rFl enumC1581350rFl) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM193do;
        final IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C01GW c01gw = C0BUV.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 3) {
            Aweme awemeLJIIIIZZ = null;
            if (enumC1581350rFl == EnumC1581350rFl.PULL_DOWN_REFRESH) {
                this.LLILLL = null;
                return;
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM193do2 = m193do();
            if (iFeedPanelPlatformAbilityM193do2 != null) {
                awemeLJIIIIZZ = iFeedPanelPlatformAbilityM193do2.LJIIIIZZ();
            }
            this.LLILLL = awemeLJIIIIZZ;
            this.LLILZ = enumC1581350rFl;
            if (((Number) c01gw.getValue()).intValue() == 3 && (iFeedPanelPlatformAbilityM193do = m193do()) != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityM193do.Mb()) != null) {
                iViewPagerComponentAbilityMb.Bv0(new InterfaceC1616070s9l() { // from class: X.0qrd
                    @Override // X.InterfaceC1616160s9u
                    public final /* synthetic */ void onBeforePageChange() {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageScrolled(int i, float f, int i2) {
                    }

                    @Override // X.InterfaceC1616070s9l
                    public final void onPageScrolledEnd(int i, float f, int i2) {
                    }

                    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                    public final void onPageSelected(int i) {
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
                    public final void onPageScrollStateChanged(int i) {
                        C1255920ims<?> c1255920imsKB1;
                        IRefreshAbility iRefreshAbilityAZ1;
                        T t;
                        if (i == 0) {
                            return;
                        }
                        IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) this.LL.LLILLJJLI.getValue();
                        if (iFeedFetchDataAbility != null && (c1255920imsKB1 = iFeedFetchDataAbility.KB1()) != null && c1255920imsKB1.LJIIL() && this.LL.LLILZ != EnumC1581350rFl.PULL_DOWN_REFRESH) {
                            if ((c1255920imsKB1 instanceof C1601390rm5) && c1255920imsKB1 != null && (t = c1255920imsKB1.LL) != 0) {
                                C1601380rm4 c1601380rm4 = (C1601380rm4) t;
                                if (c1601380rm4.isLoading()) {
                                    c1601380rm4.LLJILJILJ.set(true);
                                }
                            }
                            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM193do3 = this.LL.m193do();
                            if (iFeedPanelPlatformAbilityM193do3 != null && (iRefreshAbilityAZ1 = iFeedPanelPlatformAbilityM193do3.aZ1()) != null) {
                                iRefreshAbilityAZ1.setRefreshing(false);
                            }
                            C1440005kM.LIZ(new C1581940rGi("HOME"));
                        }
                        IViewPagerComponentAbility iViewPagerComponentAbility = iViewPagerComponentAbilityMb;
                        if (iViewPagerComponentAbility != null) {
                            iViewPagerComponentAbility.Xl0(this);
                        }
                    }
                });
            }
        }
    }

    public final void fo(Aweme aweme, String str) {
        BaseListFragmentPanel baseListFragmentPanelYE;
        InterfaceC1566480qrm interfaceC1566480qrm;
        C1566410qrf c1566410qrfIg;
        int i;
        int i2;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityM193do = m193do();
        if (iFeedPanelPlatformAbilityM193do != null && (baseListFragmentPanelYE = iFeedPanelPlatformAbilityM193do.yE()) != null) {
            baseListFragmentPanelYE.LLILIL(new C739280SzG<>(0, "playback_recovery_when_accident", Collections.singletonList(aweme)));
            C128Y c128y = getPanelContext().LJ;
            if ((c128y instanceof InterfaceC1566480qrm) && (interfaceC1566480qrm = (InterfaceC1566480qrm) c128y) != null && (c1566410qrfIg = interfaceC1566480qrm.Ig()) != null && (i2 = (i = c1566410qrfIg.LIZIZ) + 1) > i) {
                c1566410qrfIg.LIZIZ = i2;
            }
            AwemeBizExtKt.setRecoverReason(aweme, str);
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLIZLLLIL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("insert recover ");
            sbLIZ.append(str);
            abstractC1604130rqV.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), aweme);
            ho(aweme, str, true);
        }
    }

    public static void ho(Aweme aweme, String str, boolean z) {
        String aid;
        String str2;
        Pair[] pairArr = new Pair[4];
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        pairArr[0] = new Pair("group_id", aid);
        pairArr[1] = new Pair("recovery_reason", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("recovery_result", str2);
        pairArr[3] = new Pair("recovery_method", "to_second");
        C20684815ws.LJIILLIIL("playback_recovery_finish", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
