package com.ss.android.ugc.feed.platform.panel.clearmode;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C07HB;
import X.C0B8V;
import X.C0COM;
import X.C0N0Y;
import X.C0NC0;
import X.C0OCC;
import X.C0RD6;
import X.C0RGG;
import X.C0RUJ;
import X.C0S43;
import X.C0S4J;
import X.C0SFC;
import X.C0SZ8;
import X.C0T3D;
import X.C0T3E;
import X.C0T3F;
import X.C0T3G;
import X.C1017070cZd;
import X.C1389300mG0;
import X.C1389890mGx;
import X.C1440005kM;
import X.C14EU;
import X.C1566140qrE;
import X.C1578630rBN;
import X.C1594970rbj;
import X.C1597406Ng;
import X.C1616320sAA;
import X.C1616330sAB;
import X.C1616340sAC;
import X.C1616350sAD;
import X.C1616360sAE;
import X.C1616370sAF;
import X.C1616380sAG;
import X.C1616410sAJ;
import X.C1697810uHb;
import X.C19252910Tv;
import X.C19EG;
import X.C1AV3;
import X.C1E29;
import X.C1ER1;
import X.C20285414Yy;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2269901Dsy;
import X.C269280Agw;
import X.C271430AkP;
import X.C294910BhB;
import X.C299650Bop;
import X.C299660Boq;
import X.C299750Boz;
import X.C452501pT;
import X.C487580JAe;
import X.C586380MzE;
import X.C628500Oky;
import X.C630740Ooa;
import X.C714060Rzg;
import X.C724240Sb0;
import X.C729510SjV;
import X.C737030Svd;
import X.C988000bok;
import X.EnumC1594380ram;
import X.EnumC1616310sA9;
import X.EnumC452301pR;
import X.InterfaceC1399350mWD;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import X.InterfaceC1670800ta2;
import X.InterfaceC494301wD;
import X.InterfaceC655270Pn3;
import X.InterfaceC689860R4e;
import X.InterfaceC739770T0d;
import Y.ARunnableS30S0201000_24;
import Y.ARunnableS80S0200000_11;
import android.hardware.display.DisplayManager;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.clearmode.ClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class ClearModePanelComponent extends BasePanelComponent implements IClearModePanelComponent, DisplayManager.DisplayListener, C0RUJ, InterfaceC1554640qYg {
    public final C0S4J LL = new C0S4J("ClearModePanelComponent");
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILZLL;
    public SystemComponentAbility LLIZ;
    public final C01GW LLIZLLLIL;
    public final C630740Ooa LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public C1616340sAC LLJILJIL;
    public C1616320sAA LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public long LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public String LLJJIJIL;
    public final C01GW LLJJJ;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "panel_clear_mode";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent
    public final void e21() {
        this.LLILZIL = true;
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSupportSwipeKeepImmersive: ");
        sbLIZ.append(true);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 476418352) {
            return null;
        }
        return this;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m337do() {
        this.LL.LJIIIZ("cannotOpenClearModeTip");
        C19EG c19egLIZ = getPanelContext().LIZ();
        if (c19egLIZ == null) {
            return;
        }
        int i = C299650Bop.LIZJ() ? 2131828840 : C299650Bop.LIZLLL() ? 2131828839 : 2131828855;
        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LIZLLL(2000L);
        c1389890mGx.LJIIJJI();
    }

    public final Map<String, String> ho() {
        return (Map) this.LLJJJ.getValue();
    }

    public final WeakHandler ko() {
        return (WeakHandler) this.LLJIJIL.getValue();
    }

    public final IFeedPanelPlatformAbility lo() {
        return (IFeedPanelPlatformAbility) this.LLILLJJLI.getValue();
    }

    public final IViewPagerComponentAbility mo() {
        return (IViewPagerComponentAbility) this.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        C1616320sAA c1616320sAA;
        InterfaceC655270Pn3 interfaceC655270Pn3;
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        IViewPagerComponentAbility iViewPagerComponentAbilityMo = mo();
        C0SZ8 c0sz8LJLIL = iViewPagerComponentAbilityMo != null ? iViewPagerComponentAbilityMo.LJLIL() : null;
        if (c0sz8LJLIL != null) {
            String strLIZ = C1389300mG0.LIZ(getPanelContext());
            Aweme aweme = c0sz8LJLIL.getAweme();
            long j = this.LLJJIII;
            int i = this.LLJJIJI;
            Map<String, String> mapHo = ho();
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZJ(strLIZ)) {
                long jLIZLLL = C1616410sAJ.LIZLLL(aweme);
                float fLIZ = C1616410sAJ.LIZ(j, jLIZLLL);
                float fAbs = i > C1616410sAJ.LJIIIZ ? 1 - C1616410sAJ.LJIIIIZZ : fLIZ - C1616410sAJ.LJIIIIZZ;
                if (fAbs < 0.0f) {
                    fAbs = Math.abs(1 - C1616410sAJ.LIZJ);
                }
                C1616410sAJ.LJFF(fLIZ, i, jLIZLLL, aweme, strLIZ, "others", "", mapHo, true, true);
                C1616410sAJ.LJII(true, strLIZ, "others", aweme, jLIZLLL, C1616410sAJ.LIZIZ(fAbs), i - C1616410sAJ.LJIIIZ, C1616410sAJ.LIZJ(System.currentTimeMillis(), C1616410sAJ.LJIIJ), true, "");
                C1616410sAJ.LJIIIIZZ = 0.0f;
                C1616410sAJ.LJIIIZ = 0;
                C1616410sAJ.LJIIJ = 0L;
            }
        }
        SystemComponentAbility systemComponentAbility = this.LLIZ;
        if (systemComponentAbility != null) {
            systemComponentAbility.unregisterDisplayListener(this);
        }
        this.LLJJIII = 0L;
        this.LLJJIJI = 0;
        IViewPagerComponentAbility iViewPagerComponentAbilityMo2 = mo();
        uo(iViewPagerComponentAbilityMo2 != null ? iViewPagerComponentAbilityMo2.LJLIL() : null, false);
        if (C2269901Dsy.LIZIZ()) {
            IViewPagerComponentAbility iViewPagerComponentAbilityMo3 = mo();
            uo(iViewPagerComponentAbilityMo3 != null ? iViewPagerComponentAbilityMo3.F() : null, false);
            IViewPagerComponentAbility iViewPagerComponentAbilityMo4 = mo();
            uo(iViewPagerComponentAbilityMo4 != null ? iViewPagerComponentAbilityMo4.D() : null, false);
        }
        if (!C0COM.LIZ() || (c1616320sAA = this.LLJILJILJ) == null) {
            return;
        }
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = getPanelContext().LIZ();
        if (!(interfaceC1670800ta2LIZ instanceof InterfaceC655270Pn3) || (interfaceC655270Pn3 = (InterfaceC655270Pn3) interfaceC1670800ta2LIZ) == null) {
            return;
        }
        interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(c1616320sAA);
    }

    public final IPlayerComponentAbility x32() {
        return (IPlayerComponentAbility) this.LLILZLL.getValue();
    }

    public ClearModePanelComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        C01GW c01gwLIZIZ3;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 642), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C0T3E(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 643), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C0T3F(false, this));
        }
        this.LLILLL = c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa3 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 644), null);
            C1566140qrE.LIZJ(this, c630740Ooa3);
            c01gwLIZIZ3 = c630740Ooa3;
        } else {
            c01gwLIZIZ3 = C452501pT.LIZIZ(new C0T3D(false, this));
        }
        this.LLILZ = c01gwLIZIZ3;
        this.LLILZLL = C452501pT.LIZIZ(new C1616360sAE(this));
        this.LLIZLLLIL = C452501pT.LIZIZ(new C1616350sAD(this));
        this.LLJ = C628500Oky.LIZ(new C0T3G(this));
        this.LLJI = C452501pT.LIZIZ(new C1616370sAF(this));
        this.LLJIJIL = C452501pT.LIZIZ(new C1616380sAG());
        this.LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1529));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent
    public final void Rs0() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMo = mo();
        uo(iViewPagerComponentAbilityMo != null ? iViewPagerComponentAbilityMo.LJLIL() : null, false);
        if (C2269901Dsy.LIZIZ()) {
            IViewPagerComponentAbility iViewPagerComponentAbilityMo2 = mo();
            uo(iViewPagerComponentAbilityMo2 != null ? iViewPagerComponentAbilityMo2.F() : null, false);
            IViewPagerComponentAbility iViewPagerComponentAbilityMo3 = mo();
            uo(iViewPagerComponentAbilityMo3 != null ? iViewPagerComponentAbilityMo3.D() : null, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0sAA] */
    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        if (C0COM.LIZ()) {
            this.LLJILJILJ = new InterfaceC1399350mWD() { // from class: X.0sAA
                @Override // X.InterfaceC1399350mWD
                public final /* synthetic */ boolean Fi() {
                    return false;
                }

                @Override // X.InterfaceC1399350mWD
                public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                    if (i == 4) {
                        C01GW<C0RGG> c01gw = C0RGG.LJ;
                        if (C586380MzE.LIZ().LIZIZ(C1389300mG0.LIZ(this.LL.getPanelContext()))) {
                            C1440005kM.LIZ(new C714060Rzg(false, EnumC1616310sA9.OTHER_EXIT.getType(), "", C1389300mG0.LIZ(this.LL.getPanelContext())));
                            return true;
                        }
                    }
                    return false;
                }
            };
            Object objLIZJ = C487580JAe.LIZJ(getPanelContext().LJ);
            C1616320sAA c1616320sAA = this.LLJILJILJ;
            if (c1616320sAA == null || !(objLIZJ instanceof InterfaceC655270Pn3) || (interfaceC655270Pn3 = (InterfaceC655270Pn3) objLIZJ) == null) {
                return;
            }
            interfaceC655270Pn3.registerActivityOnKeyDownListener(c1616320sAA);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0sAC] */
    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbilityMo = mo();
        if (iViewPagerComponentAbilityMo != null) {
            iViewPagerComponentAbilityMo.Bv0(new InterfaceC1616070s9l() { // from class: X.0sA7
                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
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
                public final void onPageScrollStateChanged(int i) {
                    C0SZ8 c0sz8LJLIL;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo2 = this.LL.mo();
                    if (iViewPagerComponentAbilityMo2 != null) {
                        c0sz8LJLIL = iViewPagerComponentAbilityMo2.LJLIL();
                    } else {
                        c0sz8LJLIL = null;
                    }
                    ClearModePanelComponent clearModePanelComponent = this.LL;
                    if (((Boolean) C2269901Dsy.LJFF.getValue()).booleanValue()) {
                        C786410Ut5.LJL(C799570VYd.LIZJ(), new ARunnableS30S0201000_24(i, clearModePanelComponent, c0sz8LJLIL, 7));
                    } else {
                        clearModePanelComponent.Ao(i, c0sz8LJLIL, "post_hide_false");
                    }
                }

                @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    C0SZ8 c0sz8Kq1;
                    Aweme aweme;
                    String aid;
                    Aweme aweme2;
                    C0N0Y playerManager;
                    InterfaceC739770T0d interfaceC739770T0dP2;
                    C0SZ8 c0sz8LJLIL;
                    C0SZ8 c0sz8LJLIL2;
                    boolean zY82;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo2 = this.LL.mo();
                    String aid2 = null;
                    if (iViewPagerComponentAbilityMo2 != null) {
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo = this.LL.lo();
                        if (iFeedPanelPlatformAbilityLo != null) {
                            zY82 = iFeedPanelPlatformAbilityLo.Y82();
                        } else {
                            zY82 = false;
                        }
                        c0sz8Kq1 = iViewPagerComponentAbilityMo2.kq1(zY82);
                    } else {
                        c0sz8Kq1 = null;
                    }
                    this.LL.fo(c0sz8Kq1);
                    ClearModePanelComponent clearModePanelComponent = this.LL;
                    clearModePanelComponent.LLJJIII = 0L;
                    clearModePanelComponent.LLJJIJI = 0;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo3 = clearModePanelComponent.mo();
                    if (iViewPagerComponentAbilityMo3 != null && (c0sz8LJLIL2 = iViewPagerComponentAbilityMo3.LJLIL()) != null) {
                        aweme = c0sz8LJLIL2.getAweme();
                    } else {
                        aweme = null;
                    }
                    String str = this.LL.LLJJIJIL;
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (!Intrinsics.LJFF(str, aid)) {
                        if (aweme != null && aweme.isAd()) {
                            return;
                        }
                        if (this.LL.LLILZIL) {
                            C01GW<C0RGG> c01gw = C0RGG.LJ;
                            if (C586380MzE.LIZ().LIZIZ(C1389300mG0.LIZ(this.LL.getPanelContext()))) {
                                String strLIZ = C1389300mG0.LIZ(this.LL.getPanelContext());
                                IViewPagerComponentAbility iViewPagerComponentAbilityMo4 = this.LL.mo();
                                if (iViewPagerComponentAbilityMo4 != null && (c0sz8LJLIL = iViewPagerComponentAbilityMo4.LJLIL()) != null) {
                                    aweme2 = c0sz8LJLIL.getAweme();
                                } else {
                                    aweme2 = null;
                                }
                                IPlayerComponentAbility iPlayerComponentAbilityX32 = this.LL.x32();
                                if (iPlayerComponentAbilityX32 != null) {
                                    playerManager = iPlayerComponentAbilityX32.getPlayerManager();
                                } else {
                                    playerManager = null;
                                }
                                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo2 = this.LL.lo();
                                if (iFeedPanelPlatformAbilityLo2 != null) {
                                    interfaceC739770T0dP2 = iFeedPanelPlatformAbilityLo2.P2();
                                } else {
                                    interfaceC739770T0dP2 = null;
                                }
                                C1616410sAJ.LJIIIZ(true, strLIZ, "auto_hold", aweme2, "auto_hold", playerManager, interfaceC739770T0dP2, "", this.LL.ho());
                            }
                        }
                        ClearModePanelComponent clearModePanelComponent2 = this.LL;
                        if (aweme != null) {
                            aid2 = aweme.getAid();
                        }
                        clearModePanelComponent2.LLJJIJIL = aid2;
                    }
                }

                @Override // X.InterfaceC1616070s9l
                public final void onPageUnSelected(C0SZ8 c0sz8) {
                    boolean zY82;
                    Aweme aweme;
                    long currentPosition;
                    int iS2;
                    float fAbs;
                    String str;
                    ClearModePanelComponent clearModePanelComponent = this.LL;
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo = clearModePanelComponent.lo();
                    if (iFeedPanelPlatformAbilityLo != null) {
                        zY82 = iFeedPanelPlatformAbilityLo.Y82();
                    } else {
                        zY82 = false;
                    }
                    String strLIZ = C1389300mG0.LIZ(clearModePanelComponent.getPanelContext());
                    if (c0sz8 != null) {
                        aweme = c0sz8.getAweme();
                    } else {
                        aweme = null;
                    }
                    IPlayerComponentAbility iPlayerComponentAbilityX32 = clearModePanelComponent.x32();
                    if (iPlayerComponentAbilityX32 != null) {
                        currentPosition = iPlayerComponentAbilityX32.getCurrentPosition();
                    } else {
                        currentPosition = 0;
                    }
                    IPlayerComponentAbility iPlayerComponentAbilityX322 = clearModePanelComponent.x32();
                    if (iPlayerComponentAbilityX322 != null) {
                        iS2 = iPlayerComponentAbilityX322.s2();
                    } else {
                        iS2 = 0;
                    }
                    boolean z = clearModePanelComponent.LLILZIL;
                    Map<String, String> mapHo = clearModePanelComponent.ho();
                    C01GW<C0RGG> c01gw = C0RGG.LJ;
                    if (C586380MzE.LIZ().LIZJ(strLIZ)) {
                        long jLIZLLL = C1616410sAJ.LIZLLL(aweme);
                        float fLIZ = C1616410sAJ.LIZ(currentPosition, jLIZLLL);
                        if (iS2 > C1616410sAJ.LJIIIZ) {
                            fAbs = 1 - C1616410sAJ.LJIIIIZZ;
                        } else {
                            fAbs = fLIZ - C1616410sAJ.LJIIIIZZ;
                        }
                        if (fAbs < 0.0f) {
                            fAbs = Math.abs(1 - C1616410sAJ.LIZJ);
                        }
                        if (zY82) {
                            str = "swipe_up";
                        } else {
                            str = "swipe_down";
                        }
                        if (z) {
                            C1616410sAJ.LJII(true, strLIZ, str, aweme, jLIZLLL, C1616410sAJ.LIZIZ(fAbs), iS2 - C1616410sAJ.LJIIIZ, C1616410sAJ.LIZJ(System.currentTimeMillis(), C1616410sAJ.LJIIJ), true, "");
                        } else {
                            C1616410sAJ.LJFF(fLIZ, iS2, jLIZLLL, aweme, strLIZ, str, "", mapHo, true, true);
                            C1616410sAJ.LJII(true, strLIZ, str, aweme, jLIZLLL, C1616410sAJ.LIZIZ(fAbs), iS2 - C1616410sAJ.LJIIIZ, C1616410sAJ.LIZJ(System.currentTimeMillis(), C1616410sAJ.LJIIJ), true, "");
                        }
                        C1616410sAJ.LJIIIIZZ = 0.0f;
                        C1616410sAJ.LJIIIZ = 0;
                        C1616410sAJ.LJIIJ = 0L;
                    }
                    if (!clearModePanelComponent.LLILZIL) {
                        clearModePanelComponent.uo(c0sz8, false);
                    }
                }
            });
        }
        this.LLJILJIL = new C0OCC() { // from class: X.0sAC
            @Override // X.C0OCC, X.InterfaceC1603270rp7
            public final void onHide() {
                ClearModePanelComponent clearModePanelComponent = this.LL;
                if (clearModePanelComponent.LLJJIJIIJIL) {
                    clearModePanelComponent.LLJJIJIIJIL = false;
                    clearModePanelComponent.zo("loadmore_hide", false);
                    this.LL.LL.LJIIIZ("DefaultLoadMoreUiListene onHide()");
                }
            }

            @Override // X.C0OCC, X.InterfaceC1603270rp7
            public final void onShow() {
                ClearModePanelComponent clearModePanelComponent = this.LL;
                if (clearModePanelComponent.LLJJIJIIJIL) {
                    return;
                }
                clearModePanelComponent.LLJJIJIIJIL = true;
                clearModePanelComponent.zo("loadmore_show", true);
                this.LL.LL.LJIIIZ("DefaultLoadMoreUiListene onShow()");
            }
        };
        ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LLIZLLLIL.getValue();
        if (iLoadMoreAbility != null) {
            iLoadMoreAbility.p41(this.LLJILJIL);
        }
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is loadMoreAbility null?: ");
        sbLIZ.append(this.LLIZLLLIL.getValue() == null);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (C1389300mG0.LJII(getPanelContext())) {
            return;
        }
        so();
    }

    public final void so() {
        C0N0Y playerManager;
        IPlayerComponentAbility iPlayerComponentAbilityX32 = x32();
        this.LLJJIII = (iPlayerComponentAbilityX32 == null || (playerManager = iPlayerComponentAbilityX32.getPlayerManager()) == null) ? 0L : playerManager.getCurrentPosition();
        IPlayerComponentAbility iPlayerComponentAbilityX322 = x32();
        if (iPlayerComponentAbilityX322 != null) {
            this.LLJJIJI = iPlayerComponentAbilityX322.s2();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent
    public final boolean uT1() {
        return this.LLILZIL;
    }

    public static boolean bo(C0SZ8 c0sz8) {
        if (!BaseListFragmentPanel.LLIZLLLIL(c0sz8) && !wo(c0sz8) && !C0SFC.LIZIZ.LJIIIIZZ(c0sz8.getAweme())) {
            if (!((Boolean) C271430AkP.LIZ.getValue()).booleanValue() || !C1ER1.LIZIZ.LJJII().LJFF(c0sz8.getAweme())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean wo(C0SZ8 c0sz8) {
        Aweme aweme;
        InterfaceC689860R4e interfaceC689860R4eK9;
        if (c0sz8 != null && (aweme = c0sz8.getAweme()) != null && C1017070cZd.LLJJJJJIL(aweme) && (interfaceC689860R4eK9 = c0sz8.K9()) != null && interfaceC689860R4eK9.LLJILJILJ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent
    public final void LJ1(boolean z) {
        boolean z2;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        C0N0Y playerManager;
        Fragment fragmentLJI;
        IPanelUIAbility iPanelUIAbility;
        IPanelUIAbility iPanelUIAbility2;
        Aweme awemeLJIIIIZZ;
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        C0RGG c0rggLIZ = C586380MzE.LIZ();
        String strLIZ = C1389300mG0.LIZ(getPanelContext());
        Map<String, Boolean> map = c0rggLIZ.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scene_key_");
        sbLIZ.append(strLIZ);
        map.put(C2188811AlT.LIZIZ(sbLIZ), Boolean.valueOf(z));
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo = lo();
        if (iFeedPanelPlatformAbilityLo != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityLo.LJIIIIZZ()) != null && AwemeExtKt.isPhotoMode(awemeLJIIIIZZ)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2 && (iPanelUIAbility2 = (IPanelUIAbility) this.LLJ.getValue()) != null) {
                iPanelUIAbility2.b00(false, false);
                return;
            }
            return;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo2 = lo();
        if (iFeedPanelPlatformAbilityLo2 == null || (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLo2.x32()) == null || (playerManager = iPlayerComponentAbilityX32.getPlayerManager()) == null || !playerManager.isPaused() || (fragmentLJI = C724240Sb0.LJI(this)) == null || !fragmentLJI.isResumed() || (iPanelUIAbility = (IPanelUIAbility) this.LLJ.getValue()) == null) {
            return;
        }
        iPanelUIAbility.b00(true, true);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent
    public final boolean d31(Aweme aweme) {
        if (!C0COM.LIZIZ() || aweme == null) {
            return false;
        }
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
        if ((iCommercePromoteService != null && iCommercePromoteService.LJIIJ(aweme)) || AwemeSaaSExtKt.isLive(aweme) || C0NC0.LIZ(aweme) || C729510SjV.LJJIJIL(aweme)) {
            return false;
        }
        if (AwemeExtKt.isPhotoMode(aweme) && !C294910BhB.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_render_ready", new C1594970rbj(this));
        c0rd6.LIZIZ("event_on_play_progress_change", new C1616330sAB(this));
    }

    public final void fo(C0SZ8 c0sz8) {
        WeakHandler weakHandlerKo = ko();
        if (weakHandlerKo != null && weakHandlerKo.hasMessages(1002)) {
            weakHandlerKo.removeMessages(1002);
        }
        if (c0sz8 != null && c0sz8.o1()) {
            c0sz8.LJZI(false, true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onClearModeEvent(final C714060Rzg c714060Rzg) {
        boolean z;
        final C0SZ8 c0sz8LJLIL;
        C0N0Y playerManager;
        InterfaceC739770T0d interfaceC739770T0dP2;
        C0SZ8 c0sz8D;
        C0SZ8 c0sz8F;
        View view;
        C0N0Y playerManager2;
        InterfaceC739770T0d interfaceC739770T0dP22;
        C0SZ8 c0sz8D2;
        C0SZ8 c0sz8F2;
        C0N0Y playerManager3;
        InterfaceC739770T0d interfaceC739770T0dP23;
        C0SZ8 c0sz8D3;
        C0SZ8 c0sz8F3;
        C0N0Y playerManager4;
        String str;
        C0N0Y playerManager5;
        InterfaceC739770T0d interfaceC739770T0dP24;
        C0SZ8 c0sz8D4;
        C0SZ8 c0sz8F4;
        C0SZ8 c0sz8D5;
        C0SZ8 c0sz8F5;
        C0N0Y playerManager6;
        InterfaceC739770T0d interfaceC739770T0dP25;
        C0SZ8 c0sz8D6;
        C0SZ8 c0sz8F6;
        C0N0Y playerManager7;
        InterfaceC739770T0d interfaceC739770T0dP26;
        C0SZ8 c0sz8D7;
        C0SZ8 c0sz8F7;
        String str2;
        C0N0Y playerManager8;
        InterfaceC739770T0d interfaceC739770T0dP27;
        C0SZ8 c0sz8D8;
        C0SZ8 c0sz8F8;
        C0SZ8 c0sz8LJLIL2;
        C0SZ8 c0sz8F9;
        IRootAbility iRootAbility;
        String str3;
        if (c714060Rzg == null || c714060Rzg.LIZIZ == EnumC1616310sA9.NOTIFY_EXIT.getType()) {
            return;
        }
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClearModeEvent type: ");
        sbLIZ.append(c714060Rzg.LIZIZ);
        sbLIZ.append(" eventType:");
        sbLIZ.append(c714060Rzg.LIZLLL);
        sbLIZ.append(" isClean: ");
        sbLIZ.append(c714060Rzg.LIZ);
        sbLIZ.append(" enterMethod: ");
        sbLIZ.append(c714060Rzg.LIZJ);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (((Boolean) C269280Agw.LIZ.getValue()).booleanValue() && c714060Rzg.LIZIZ == 0 && ((str3 = c714060Rzg.LIZLLL) == null || str3.length() == 0)) {
            Npth.reportBizException("ClearModePanelComponent", new Throwable("onClearModeEvent invalid call"), "onClearModeEvent invalid call", (Map<String, String>) new HashMap(), true);
            if (!this.LLJILLL) {
                this.LLJILLL = true;
                C0S4J c0s4j2 = this.LL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onClearModeEvent invalid call \n ");
                sbLIZ2.append(Log.getStackTraceString(new Throwable()));
                c0s4j2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (c714060Rzg.LIZ) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZLLL) {
                m337do();
                return;
            }
        }
        if (C1578630rBN.LJIIJ(this) && (iRootAbility = (IRootAbility) this.LLILLL.getValue()) != null && iRootAbility.getUserVisibleHint()) {
            z = true;
        } else {
            z = false;
        }
        String aid = null;
        C0SZ8 c0sz8D9 = null;
        Aweme awemeLJIIIIZZ = null;
        String aid2 = null;
        String aid3 = null;
        String aid4 = null;
        String aid5 = null;
        String aid6 = null;
        InterfaceC739770T0d interfaceC739770T0dP28 = null;
        String aid7 = null;
        String aid8 = null;
        if (!c714060Rzg.LIZ) {
            C01GW<C0RGG> c01gw2 = C0RGG.LJ;
            if (!C586380MzE.LIZ().LIZJ(C1389300mG0.LIZ(getPanelContext()))) {
                if (EnumC1616310sA9.SWITCH_PAGE.getType() == c714060Rzg.LIZIZ) {
                    C0RGG c0rggLIZ = C586380MzE.LIZ();
                    Fragment fragmentLJI = C724240Sb0.LJI(this);
                    c0rggLIZ.getClass();
                    if (fragmentLJI != null) {
                        Boolean bool = (Boolean) ((LinkedHashMap) c0rggLIZ.LIZIZ).get(Integer.valueOf(System.identityHashCode(fragmentLJI)));
                        if (bool != null && bool.booleanValue() && !z) {
                            this.LL.LJIIIZ("onClearModeEvent reset because of multiple fragment");
                            IViewPagerComponentAbility iViewPagerComponentAbilityMo = mo();
                            if (iViewPagerComponentAbilityMo != null) {
                                c0sz8LJLIL2 = iViewPagerComponentAbilityMo.LJLIL();
                            } else {
                                c0sz8LJLIL2 = null;
                            }
                            uo(c0sz8LJLIL2, true);
                            if (C2269901Dsy.LIZIZ()) {
                                IViewPagerComponentAbility iViewPagerComponentAbilityMo2 = mo();
                                if (iViewPagerComponentAbilityMo2 != null) {
                                    c0sz8F9 = iViewPagerComponentAbilityMo2.F();
                                } else {
                                    c0sz8F9 = null;
                                }
                                uo(c0sz8F9, true);
                                IViewPagerComponentAbility iViewPagerComponentAbilityMo3 = mo();
                                if (iViewPagerComponentAbilityMo3 != null) {
                                    c0sz8D9 = iViewPagerComponentAbilityMo3.D();
                                }
                                uo(c0sz8D9, true);
                                return;
                            }
                            return;
                        }
                    }
                }
                if (C586380MzE.LIZ().LIZIZ(C1389300mG0.LIZ(getPanelContext()))) {
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo = lo();
                    if (iFeedPanelPlatformAbilityLo != null) {
                        awemeLJIIIIZZ = iFeedPanelPlatformAbilityLo.LJIIIIZZ();
                    }
                    xo(awemeLJIIIIZZ, false);
                    return;
                }
                return;
            }
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMo4 = mo();
        if (iViewPagerComponentAbilityMo4 != null && (c0sz8LJLIL = iViewPagerComponentAbilityMo4.LJLIL()) != null) {
            final String str4 = c714060Rzg.LIZJ;
            EnumC1616310sA9 enumC1616310sA9 = EnumC1616310sA9.AI_AGENT;
            if (C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1616310sA9.LONG_PRESS.getType()), Integer.valueOf(enumC1616310sA9.getType())).contains(Integer.valueOf(c714060Rzg.LIZIZ)) && z) {
                if (c714060Rzg.LIZIZ == enumC1616310sA9.getType()) {
                    str2 = c714060Rzg.LIZJ;
                } else {
                    str2 = "long_press";
                }
                boolean z2 = c714060Rzg.LIZ;
                String strLIZ = C1389300mG0.LIZ(getPanelContext());
                Aweme aweme = c0sz8LJLIL.getAweme();
                IPlayerComponentAbility iPlayerComponentAbilityX32 = x32();
                if (iPlayerComponentAbilityX32 != null) {
                    playerManager8 = iPlayerComponentAbilityX32.getPlayerManager();
                } else {
                    playerManager8 = null;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo2 = lo();
                if (iFeedPanelPlatformAbilityLo2 != null) {
                    interfaceC739770T0dP27 = iFeedPanelPlatformAbilityLo2.P2();
                } else {
                    interfaceC739770T0dP27 = null;
                }
                C1616410sAJ.LJIIIZ(z2, strLIZ, str4, aweme, str2, playerManager8, interfaceC739770T0dP27, c714060Rzg.LJ, ho());
                xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
                c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, false);
                if (this.LLILZIL) {
                    Aweme aweme2 = c0sz8LJLIL.getAweme();
                    if (aweme2 != null) {
                        aid2 = aweme2.getAid();
                    }
                    this.LLJJIJIL = aid2;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo5 = mo();
                    if (iViewPagerComponentAbilityMo5 != null && (c0sz8F8 = iViewPagerComponentAbilityMo5.F()) != null) {
                        oo(c0sz8F8, c714060Rzg.LIZ, false);
                    }
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo6 = mo();
                    if (iViewPagerComponentAbilityMo6 != null && (c0sz8D8 = iViewPagerComponentAbilityMo6.D()) != null) {
                        oo(c0sz8D8, c714060Rzg.LIZ, false);
                    }
                }
                Fragment fragmentLJI2 = C724240Sb0.LJI(this);
                if (fragmentLJI2 != null) {
                    C1ER1 c1er1 = C1ER1.LIZIZ;
                    c1er1.J(fragmentLJI2, c714060Rzg.LIZ);
                    if (C07HB.LIZ() && c714060Rzg.LIZ) {
                        c1er1.LLF(EnumC1594380ram.CLEAR_SCREEN, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (EnumC1616310sA9.SCREEN_RECORD.getType() == c714060Rzg.LIZIZ && z) {
                boolean z3 = c714060Rzg.LIZ;
                String strLIZ2 = C1389300mG0.LIZ(getPanelContext());
                Aweme aweme3 = c0sz8LJLIL.getAweme();
                IPlayerComponentAbility iPlayerComponentAbilityX322 = x32();
                if (iPlayerComponentAbilityX322 != null) {
                    playerManager7 = iPlayerComponentAbilityX322.getPlayerManager();
                } else {
                    playerManager7 = null;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo3 = lo();
                if (iFeedPanelPlatformAbilityLo3 != null) {
                    interfaceC739770T0dP26 = iFeedPanelPlatformAbilityLo3.P2();
                } else {
                    interfaceC739770T0dP26 = null;
                }
                C1616410sAJ.LJIIIZ(z3, strLIZ2, str4, aweme3, "record_screen", playerManager7, interfaceC739770T0dP26, c714060Rzg.LJ, ho());
                xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
                c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, false);
                if (this.LLILZIL) {
                    Aweme aweme4 = c0sz8LJLIL.getAweme();
                    if (aweme4 != null) {
                        aid3 = aweme4.getAid();
                    }
                    this.LLJJIJIL = aid3;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo7 = mo();
                    if (iViewPagerComponentAbilityMo7 != null && (c0sz8F7 = iViewPagerComponentAbilityMo7.F()) != null) {
                        oo(c0sz8F7, c714060Rzg.LIZ, false);
                    }
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo8 = mo();
                    if (iViewPagerComponentAbilityMo8 != null && (c0sz8D7 = iViewPagerComponentAbilityMo8.D()) != null) {
                        oo(c0sz8D7, c714060Rzg.LIZ, false);
                    }
                }
                Fragment fragmentLJI3 = C724240Sb0.LJI(this);
                if (fragmentLJI3 == null) {
                    return;
                }
                C1ER1.LIZIZ.J(fragmentLJI3, c714060Rzg.LIZ);
                return;
            }
            if (EnumC1616310sA9.CLICK_EXIT.getType() == c714060Rzg.LIZIZ && z) {
                String str5 = "click_exit_icon";
                if (!Intrinsics.LJFF(c714060Rzg.LIZJ, "click_exit_icon")) {
                    str5 = "click_icon";
                }
                boolean z4 = c714060Rzg.LIZ;
                String strLIZ3 = C1389300mG0.LIZ(getPanelContext());
                Aweme aweme5 = c0sz8LJLIL.getAweme();
                IPlayerComponentAbility iPlayerComponentAbilityX323 = x32();
                if (iPlayerComponentAbilityX323 != null) {
                    playerManager6 = iPlayerComponentAbilityX323.getPlayerManager();
                } else {
                    playerManager6 = null;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo4 = lo();
                if (iFeedPanelPlatformAbilityLo4 != null) {
                    interfaceC739770T0dP25 = iFeedPanelPlatformAbilityLo4.P2();
                } else {
                    interfaceC739770T0dP25 = null;
                }
                C1616410sAJ.LJIIIZ(z4, strLIZ3, str4, aweme5, str5, playerManager6, interfaceC739770T0dP25, c714060Rzg.LJ, ho());
                xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
                c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, true);
                if (this.LLILZIL) {
                    Aweme aweme6 = c0sz8LJLIL.getAweme();
                    if (aweme6 != null) {
                        aid4 = aweme6.getAid();
                    }
                    this.LLJJIJIL = aid4;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo9 = mo();
                    if (iViewPagerComponentAbilityMo9 != null && (c0sz8F6 = iViewPagerComponentAbilityMo9.F()) != null) {
                        oo(c0sz8F6, c714060Rzg.LIZ, true);
                    }
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo10 = mo();
                    if (iViewPagerComponentAbilityMo10 != null && (c0sz8D6 = iViewPagerComponentAbilityMo10.D()) != null) {
                        oo(c0sz8D6, c714060Rzg.LIZ, true);
                    }
                }
                Fragment fragmentLJI4 = C724240Sb0.LJI(this);
                if (fragmentLJI4 != null) {
                    C1ER1.LIZIZ.J(fragmentLJI4, c714060Rzg.LIZ);
                }
                C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJLIIIJ().LIZJ();
                return;
            }
            if (EnumC1616310sA9.SWITCH_PAGE.getType() == c714060Rzg.LIZIZ && !z) {
                C1616410sAJ.LJIIIIZZ(c714060Rzg.LIZ, C1389300mG0.LIZ(getPanelContext()), str4, c0sz8LJLIL.getAweme(), "switch_page", this.LLJJIII, this.LLJJIJI, c714060Rzg.LJ, ho());
                xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
                c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, false);
                if (this.LLILZIL) {
                    Aweme aweme7 = c0sz8LJLIL.getAweme();
                    if (aweme7 != null) {
                        aid5 = aweme7.getAid();
                    }
                    this.LLJJIJIL = aid5;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo11 = mo();
                    if (iViewPagerComponentAbilityMo11 != null && (c0sz8F5 = iViewPagerComponentAbilityMo11.F()) != null) {
                        oo(c0sz8F5, c714060Rzg.LIZ, false);
                    }
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo12 = mo();
                    if (iViewPagerComponentAbilityMo12 != null && (c0sz8D5 = iViewPagerComponentAbilityMo12.D()) != null) {
                        oo(c0sz8D5, c714060Rzg.LIZ, false);
                    }
                }
                Fragment fragmentLJI5 = C724240Sb0.LJI(this);
                if (fragmentLJI5 == null) {
                    return;
                }
                C1ER1.LIZIZ.J(fragmentLJI5, c714060Rzg.LIZ);
                return;
            }
            if (EnumC1616310sA9.PINCH_ZOOM.getType() == c714060Rzg.LIZIZ && z) {
                if (!Intrinsics.LJFF(c714060Rzg.LIZJ, "swipe_up") && !Intrinsics.LJFF(c714060Rzg.LIZJ, "swipe_down")) {
                    str = "pinch";
                } else {
                    str = c714060Rzg.LIZJ;
                }
                boolean z5 = c714060Rzg.LIZ;
                String strLIZ4 = C1389300mG0.LIZ(getPanelContext());
                Aweme aweme8 = c0sz8LJLIL.getAweme();
                IPlayerComponentAbility iPlayerComponentAbilityX324 = x32();
                if (iPlayerComponentAbilityX324 != null) {
                    playerManager5 = iPlayerComponentAbilityX324.getPlayerManager();
                } else {
                    playerManager5 = null;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo5 = lo();
                if (iFeedPanelPlatformAbilityLo5 != null) {
                    interfaceC739770T0dP24 = iFeedPanelPlatformAbilityLo5.P2();
                } else {
                    interfaceC739770T0dP24 = null;
                }
                C1616410sAJ.LJIIIZ(z5, strLIZ4, str4, aweme8, str, playerManager5, interfaceC739770T0dP24, c714060Rzg.LJ, ho());
                xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
                c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, false);
                if (this.LLILZIL) {
                    Aweme aweme9 = c0sz8LJLIL.getAweme();
                    if (aweme9 != null) {
                        aid6 = aweme9.getAid();
                    }
                    this.LLJJIJIL = aid6;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo13 = mo();
                    if (iViewPagerComponentAbilityMo13 != null && (c0sz8F4 = iViewPagerComponentAbilityMo13.F()) != null) {
                        oo(c0sz8F4, c714060Rzg.LIZ, false);
                    }
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo14 = mo();
                    if (iViewPagerComponentAbilityMo14 != null && (c0sz8D4 = iViewPagerComponentAbilityMo14.D()) != null) {
                        oo(c0sz8D4, c714060Rzg.LIZ, false);
                    }
                }
                Fragment fragmentLJI6 = C724240Sb0.LJI(this);
                if (fragmentLJI6 == null) {
                    return;
                }
                C1ER1.LIZIZ.J(fragmentLJI6, c714060Rzg.LIZ);
                return;
            }
            if (EnumC1616310sA9.SWITCH_STORY.getType() == c714060Rzg.LIZIZ && z) {
                boolean z6 = c714060Rzg.LIZ;
                String strLIZ5 = C1389300mG0.LIZ(getPanelContext());
                Aweme aweme10 = c0sz8LJLIL.getAweme();
                IPlayerComponentAbility iPlayerComponentAbilityX325 = x32();
                if (iPlayerComponentAbilityX325 != null) {
                    playerManager4 = iPlayerComponentAbilityX325.getPlayerManager();
                } else {
                    playerManager4 = null;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo6 = lo();
                if (iFeedPanelPlatformAbilityLo6 != null) {
                    interfaceC739770T0dP28 = iFeedPanelPlatformAbilityLo6.P2();
                }
                C1616410sAJ.LJIIIZ(z6, strLIZ5, str4, aweme10, "story_switch", playerManager4, interfaceC739770T0dP28, c714060Rzg.LJ, ho());
                c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, false);
                Fragment fragmentLJI7 = C724240Sb0.LJI(this);
                if (fragmentLJI7 == null) {
                    return;
                }
                C1ER1.LIZIZ.J(fragmentLJI7, c714060Rzg.LIZ);
                return;
            }
            if (EnumC1616310sA9.OTHER_SWIPE.getType() == c714060Rzg.LIZIZ && z) {
                boolean z7 = c714060Rzg.LIZ;
                String strLIZ6 = C1389300mG0.LIZ(getPanelContext());
                Aweme aweme11 = c0sz8LJLIL.getAweme();
                IPlayerComponentAbility iPlayerComponentAbilityX326 = x32();
                if (iPlayerComponentAbilityX326 != null) {
                    playerManager3 = iPlayerComponentAbilityX326.getPlayerManager();
                } else {
                    playerManager3 = null;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo7 = lo();
                if (iFeedPanelPlatformAbilityLo7 != null) {
                    interfaceC739770T0dP23 = iFeedPanelPlatformAbilityLo7.P2();
                } else {
                    interfaceC739770T0dP23 = null;
                }
                C1616410sAJ.LJIIIZ(z7, strLIZ6, str4, aweme11, "other_swipe", playerManager3, interfaceC739770T0dP23, c714060Rzg.LJ, ho());
                xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
                c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, false);
                if (this.LLILZIL) {
                    Aweme aweme12 = c0sz8LJLIL.getAweme();
                    if (aweme12 != null) {
                        aid7 = aweme12.getAid();
                    }
                    this.LLJJIJIL = aid7;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo15 = mo();
                    if (iViewPagerComponentAbilityMo15 != null && (c0sz8F3 = iViewPagerComponentAbilityMo15.F()) != null) {
                        oo(c0sz8F3, c714060Rzg.LIZ, false);
                    }
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo16 = mo();
                    if (iViewPagerComponentAbilityMo16 != null && (c0sz8D3 = iViewPagerComponentAbilityMo16.D()) != null) {
                        oo(c0sz8D3, c714060Rzg.LIZ, false);
                    }
                }
                Fragment fragmentLJI8 = C724240Sb0.LJI(this);
                if (fragmentLJI8 == null) {
                    return;
                }
                C1ER1.LIZIZ.J(fragmentLJI8, c714060Rzg.LIZ);
                return;
            }
            if (EnumC1616310sA9.RESUME.getType() == c714060Rzg.LIZIZ && z) {
                xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
                Aweme aweme13 = c0sz8LJLIL.getAweme();
                if (aweme13 == null || !aweme13.isSupportDanmaku()) {
                    return;
                }
                c0sz8LJLIL.LLLILZLLLI();
                return;
            }
            if (EnumC1616310sA9.OTHER_EXIT.getType() == c714060Rzg.LIZIZ && z) {
                boolean z8 = c714060Rzg.LIZ;
                String strLIZ7 = C1389300mG0.LIZ(getPanelContext());
                Aweme aweme14 = c0sz8LJLIL.getAweme();
                IPlayerComponentAbility iPlayerComponentAbilityX327 = x32();
                if (iPlayerComponentAbilityX327 != null) {
                    playerManager2 = iPlayerComponentAbilityX327.getPlayerManager();
                } else {
                    playerManager2 = null;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo8 = lo();
                if (iFeedPanelPlatformAbilityLo8 != null) {
                    interfaceC739770T0dP22 = iFeedPanelPlatformAbilityLo8.P2();
                } else {
                    interfaceC739770T0dP22 = null;
                }
                C1616410sAJ.LJIIIZ(z8, strLIZ7, str4, aweme14, "others", playerManager2, interfaceC739770T0dP22, c714060Rzg.LJ, ho());
                xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
                c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, false);
                if (this.LLILZIL) {
                    Aweme aweme15 = c0sz8LJLIL.getAweme();
                    if (aweme15 != null) {
                        aid8 = aweme15.getAid();
                    }
                    this.LLJJIJIL = aid8;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo17 = mo();
                    if (iViewPagerComponentAbilityMo17 != null && (c0sz8F2 = iViewPagerComponentAbilityMo17.F()) != null) {
                        oo(c0sz8F2, c714060Rzg.LIZ, false);
                    }
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo18 = mo();
                    if (iViewPagerComponentAbilityMo18 != null && (c0sz8D2 = iViewPagerComponentAbilityMo18.D()) != null) {
                        oo(c0sz8D2, c714060Rzg.LIZ, false);
                    }
                }
                Fragment fragmentLJI9 = C724240Sb0.LJI(this);
                if (fragmentLJI9 == null) {
                    return;
                }
                C1ER1.LIZIZ.J(fragmentLJI9, c714060Rzg.LIZ);
                return;
            }
            if (EnumC1616310sA9.CLICK_LANDSCAPE_ENTRANCE.getType() == c714060Rzg.LIZIZ && z) {
                Runnable runnable = new Runnable() { // from class: X.0sA8
                    public final void LIZ() {
                        C0SZ8 c0sz8D10;
                        C0SZ8 c0sz8F10;
                        try {
                            boolean z9 = c714060Rzg.LIZ;
                            String strLIZ8 = C1389300mG0.LIZ(this.getPanelContext());
                            String str6 = str4;
                            Aweme aweme16 = c0sz8LJLIL.getAweme();
                            IPlayerComponentAbility iPlayerComponentAbilityX328 = this.x32();
                            C0N0Y playerManager9 = iPlayerComponentAbilityX328 != null ? iPlayerComponentAbilityX328.getPlayerManager() : null;
                            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo9 = this.lo();
                            C1616410sAJ.LJIIIZ(z9, strLIZ8, str6, aweme16, "others", playerManager9, iFeedPanelPlatformAbilityLo9 != null ? iFeedPanelPlatformAbilityLo9.P2() : null, "", this.ho());
                            this.xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
                            c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, false);
                            ClearModePanelComponent clearModePanelComponent = this;
                            if (clearModePanelComponent.LLILZIL) {
                                Aweme aweme17 = c0sz8LJLIL.getAweme();
                                clearModePanelComponent.LLJJIJIL = aweme17 != null ? aweme17.getAid() : null;
                                IViewPagerComponentAbility iViewPagerComponentAbilityMo19 = this.mo();
                                if (iViewPagerComponentAbilityMo19 != null && (c0sz8F10 = iViewPagerComponentAbilityMo19.F()) != null) {
                                    ClearModePanelComponent clearModePanelComponent2 = this;
                                    boolean z10 = c714060Rzg.LIZ;
                                    clearModePanelComponent2.getClass();
                                    ClearModePanelComponent.oo(c0sz8F10, z10, false);
                                }
                                IViewPagerComponentAbility iViewPagerComponentAbilityMo20 = this.mo();
                                if (iViewPagerComponentAbilityMo20 != null && (c0sz8D10 = iViewPagerComponentAbilityMo20.D()) != null) {
                                    ClearModePanelComponent clearModePanelComponent3 = this;
                                    boolean z11 = c714060Rzg.LIZ;
                                    clearModePanelComponent3.getClass();
                                    ClearModePanelComponent.oo(c0sz8D10, z11, false);
                                }
                            }
                            Fragment fragmentLJI10 = C724240Sb0.LJI(this);
                            if (fragmentLJI10 != null) {
                                C1ER1.LIZIZ.J(fragmentLJI10, c714060Rzg.LIZ);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            String message = e.getMessage();
                            if (message != null) {
                                this.LL.LJIIIZ(message);
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ClearModePanelComponent@24bc.onClearModeEvent$runnable$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ClearModePanelComponent@24bc.onClearModeEvent$runnable$1");
                    }
                };
                WeakReference<View> weakReference = c714060Rzg.LJFF;
                if (weakReference != null && weakReference.get() != null) {
                    WeakReference<View> weakReference2 = c714060Rzg.LJFF;
                    if (weakReference2 == null || (view = weakReference2.get()) == null) {
                        return;
                    }
                    HandlerHook.viewPost(view, runnable);
                    return;
                }
                runnable.run();
                return;
            }
            if (EnumC1616310sA9.BACK_BUTTON.getType() == c714060Rzg.LIZIZ && z) {
                boolean z9 = c714060Rzg.LIZ;
                String strLIZ8 = C1389300mG0.LIZ(getPanelContext());
                Aweme aweme16 = c0sz8LJLIL.getAweme();
                IPlayerComponentAbility iPlayerComponentAbilityX328 = x32();
                if (iPlayerComponentAbilityX328 != null) {
                    playerManager = iPlayerComponentAbilityX328.getPlayerManager();
                } else {
                    playerManager = null;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo9 = lo();
                if (iFeedPanelPlatformAbilityLo9 != null) {
                    interfaceC739770T0dP2 = iFeedPanelPlatformAbilityLo9.P2();
                } else {
                    interfaceC739770T0dP2 = null;
                }
                C1616410sAJ.LJIIIZ(z9, strLIZ8, str4, aweme16, "back_button", playerManager, interfaceC739770T0dP2, c714060Rzg.LJ, ho());
                xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
                c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, true);
                if (this.LLILZIL) {
                    Aweme aweme17 = c0sz8LJLIL.getAweme();
                    if (aweme17 != null) {
                        aid = aweme17.getAid();
                    }
                    this.LLJJIJIL = aid;
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo19 = mo();
                    if (iViewPagerComponentAbilityMo19 != null && (c0sz8F = iViewPagerComponentAbilityMo19.F()) != null) {
                        oo(c0sz8F, c714060Rzg.LIZ, true);
                    }
                    IViewPagerComponentAbility iViewPagerComponentAbilityMo20 = mo();
                    if (iViewPagerComponentAbilityMo20 != null && (c0sz8D = iViewPagerComponentAbilityMo20.D()) != null) {
                        oo(c0sz8D, c714060Rzg.LIZ, true);
                    }
                }
                Fragment fragmentLJI10 = C724240Sb0.LJI(this);
                if (fragmentLJI10 == null) {
                    return;
                }
                C1ER1.LIZIZ.J(fragmentLJI10, c714060Rzg.LIZ);
                return;
            }
            if (EnumC1616310sA9.SWITCH_AD.getType() != c714060Rzg.LIZIZ || !z) {
                return;
            }
            xo(c0sz8LJLIL.getAweme(), c714060Rzg.LIZ);
            c0sz8LJLIL.LLJJJJJIL(c714060Rzg.LIZ, true);
            Fragment fragmentLJI11 = C724240Sb0.LJI(this);
            if (fragmentLJI11 == null) {
                return;
            }
            C1ER1.LIZIZ.J(fragmentLJI11, c714060Rzg.LIZ);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        String eventType;
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        C586380MzE.LIZ().LIZLLL = true;
        if (C586380MzE.LIZ().LIZJ(C1389300mG0.LIZ(getPanelContext()))) {
            int type = EnumC1616310sA9.SCREEN_RECORD.getType();
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            if (c2189821An6 != null) {
                eventType = c2189821An6.getEventType();
            } else {
                eventType = null;
            }
            C1440005kM.LIZ(new C714060Rzg(false, type, "", eventType));
            m337do();
        }
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onDisplayAdded]");
        sbLIZ.append(i);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onDisplayChanged]");
        sbLIZ.append(i);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        C586380MzE.LIZ().LIZLLL = false;
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onDisplayRemoved]");
        sbLIZ.append(i);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        super.onPagePause(i);
        if (!C1389300mG0.LJII(getPanelContext())) {
            so();
        }
    }

    public final void uo(C0SZ8 c0sz8, boolean z) {
        String eventType;
        if (c0sz8 != null) {
            if (C729510SjV.LJJ(c0sz8.getAweme()) && !C729510SjV.LJJIIZ(c0sz8.getAweme())) {
                return;
            }
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if (C586380MzE.LIZ().LIZJ(C1389300mG0.LIZ(getPanelContext())) || z) {
                this.LL.LJIIIZ("resetClearMode");
                c0sz8.LLJJJJJIL(false, false);
                if (C299660Boq.LIZ()) {
                    int type = EnumC1616310sA9.NOTIFY_EXIT.getType();
                    C2189821An6 c2189821An6 = getPanelContext().LIZJ;
                    if (c2189821An6 != null) {
                        eventType = c2189821An6.getEventType();
                    } else {
                        eventType = null;
                    }
                    C1440005kM.LIZ(new C714060Rzg(false, type, "", eventType));
                }
                xo(c0sz8.getAweme(), false);
            }
            c0sz8.LJZI(false, false);
        }
    }

    public final void xo(Aweme aweme, boolean z) {
        String aid;
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerImmersiveClearMode   isClean: ");
        sbLIZ.append(z);
        sbLIZ.append("   aid: ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append("  isInImmersive: ");
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        sbLIZ.append(C586380MzE.LIZ().LIZIZ(C1389300mG0.LIZ(getPanelContext())));
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C586380MzE.LIZ().getClass();
        if (!C0RGG.LJ(aweme)) {
            return;
        }
        C737030Svd c737030Svd = new C737030Svd(83, new C1597406Ng(z, null));
        c737030Svd.LJIILLIIL = System.identityHashCode(C724240Sb0.LIZ(this));
        c737030Svd.LJ = C1389300mG0.LIZ(getPanelContext());
        C1440005kM.LIZ(c737030Svd);
    }

    public final void zo(String str, boolean z) {
        C0SZ8 c0sz8LJLIL;
        WeakHandler weakHandlerKo;
        long currentPosition;
        int iS2;
        IViewPagerComponentAbility iViewPagerComponentAbilityMo = mo();
        Aweme aweme = null;
        if (iViewPagerComponentAbilityMo != null) {
            c0sz8LJLIL = iViewPagerComponentAbilityMo.LJLIL();
        } else {
            c0sz8LJLIL = null;
        }
        if (!BaseListFragmentPanel.LLIZLLLIL(c0sz8LJLIL) && !wo(c0sz8LJLIL)) {
            C0SFC c0sfc = C0SFC.LIZIZ;
            if (c0sz8LJLIL != null) {
                aweme = c0sz8LJLIL.getAweme();
            }
            if (!c0sfc.LJIIIIZZ(aweme)) {
                yo(z ? 1 : 0, c0sz8LJLIL, str, z);
            }
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo = lo();
        if (iFeedPanelPlatformAbilityLo == null || (weakHandlerKo = ko()) == null || iFeedPanelPlatformAbilityLo.P2() == null || ((Boolean) C2269901Dsy.LIZLLL.getValue()).booleanValue()) {
            return;
        }
        String strLIZ = C1389300mG0.LIZ(getPanelContext());
        Aweme awemeD2 = iFeedPanelPlatformAbilityLo.d2(iFeedPanelPlatformAbilityLo.LJLJJL());
        InterfaceC739770T0d interfaceC739770T0dP2 = iFeedPanelPlatformAbilityLo.P2();
        if (interfaceC739770T0dP2 != null) {
            currentPosition = interfaceC739770T0dP2.getCurrentPosition();
        } else {
            currentPosition = 0;
        }
        InterfaceC739770T0d interfaceC739770T0dP22 = iFeedPanelPlatformAbilityLo.P2();
        if (interfaceC739770T0dP22 != null) {
            iS2 = interfaceC739770T0dP22.s2();
        } else {
            iS2 = 0;
        }
        iFeedPanelPlatformAbilityLo.LJLJJL();
        C1616410sAJ.LJIIJJI(weakHandlerKo, z, strLIZ, awemeD2, currentPosition, iS2, z ? 1 : 0);
    }

    public static void oo(C0SZ8 c0sz8, boolean z, boolean z2) {
        Aweme aweme = c0sz8.getAweme();
        if (aweme != null && aweme.isAd()) {
            return;
        }
        c0sz8.LLJJJJJIL(z, z2);
    }

    public final void Ao(int i, C0SZ8 c0sz8, String str) {
        WeakHandler weakHandlerKo;
        boolean zIc;
        long currentPosition;
        boolean zIc2;
        WeakHandler weakHandlerKo2;
        WeakHandler weakHandlerKo3;
        if (c0sz8 == null) {
            return;
        }
        int iS2 = 0;
        if (((Boolean) C0B8V.LIZ.getValue()).booleanValue() && ((BaseListFragmentPanel.LLIZLLLIL(c0sz8) || wo(c0sz8)) && (weakHandlerKo2 = ko()) != null && weakHandlerKo2.hasMessages(1001) && (weakHandlerKo3 = ko()) != null)) {
            weakHandlerKo3.removeMessages(1001);
        }
        if (bo(c0sz8)) {
            IViewPagerComponentAbility iViewPagerComponentAbilityMo = mo();
            if (iViewPagerComponentAbilityMo != null) {
                zIc2 = iViewPagerComponentAbilityMo.ic();
            } else {
                zIc2 = false;
            }
            yo(i, c0sz8, str, zIc2);
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo = lo();
        if (iFeedPanelPlatformAbilityLo == null || (weakHandlerKo = ko()) == null || iFeedPanelPlatformAbilityLo.P2() == null || ((Boolean) C2269901Dsy.LIZLLL.getValue()).booleanValue()) {
            return;
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMo2 = mo();
        if (iViewPagerComponentAbilityMo2 != null) {
            zIc = iViewPagerComponentAbilityMo2.ic();
        } else {
            zIc = false;
        }
        String strLIZ = C1389300mG0.LIZ(getPanelContext());
        Aweme awemeD2 = iFeedPanelPlatformAbilityLo.d2(iFeedPanelPlatformAbilityLo.LJLJJL());
        InterfaceC739770T0d interfaceC739770T0dP2 = iFeedPanelPlatformAbilityLo.P2();
        if (interfaceC739770T0dP2 != null) {
            currentPosition = interfaceC739770T0dP2.getCurrentPosition();
        } else {
            currentPosition = 0;
        }
        InterfaceC739770T0d interfaceC739770T0dP22 = iFeedPanelPlatformAbilityLo.P2();
        if (interfaceC739770T0dP22 != null) {
            iS2 = interfaceC739770T0dP22.s2();
        }
        iFeedPanelPlatformAbilityLo.LJLJJL();
        C1616410sAJ.LJIIJJI(weakHandlerKo, zIc, strLIZ, awemeD2, currentPosition, iS2, i);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent
    public final boolean eu0(int i, String str, boolean z) {
        String strLIZ = C1389300mG0.LIZ(getPanelContext());
        if (strLIZ.length() == 0) {
            return false;
        }
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (C586380MzE.LIZ().LIZJ(strLIZ) == z) {
            return false;
        }
        C1440005kM.LIZ(new C714060Rzg(z, i, str, strLIZ));
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request clear display from ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z2 = AbstractC1604130rqV.LIZLLL;
        c0s4j.LJIIIIZZ(null, "ClearModePanelComponent", strLIZIZ);
        return true;
    }

    public static void vo(int i, C0SZ8 c0sz8, String str, boolean z) {
        String str2;
        String str3;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str2 = "";
                } else {
                    str2 = "next_cell";
                }
            } else {
                str2 = "last_cell";
            }
        } else {
            str2 = "current_cell";
        }
        if (c0sz8 == null) {
            return;
        }
        if (i != 1 && !bo(c0sz8)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CellType: ");
        sbLIZ.append(str2);
        sbLIZ.append(", ");
        if (z) {
            str3 = "exit clear mode";
        } else {
            str3 = "enter clear mode";
        }
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str == null) {
            str = "1";
        }
        c0sz8.A(z, C1AV3.LIZ(str, "Feed", null, "clearmode"));
    }

    public final void yo(int i, C0SZ8 c0sz8, String str, boolean z) {
        String aid;
        C0SZ8 c0sz8F;
        C0SZ8 c0sz8F2;
        WeakHandler weakHandlerKo = ko();
        if (weakHandlerKo != null && c0sz8 != null) {
            if (!((Boolean) C1E29.LJI.getValue()).booleanValue() && !((Boolean) C2269901Dsy.LIZIZ.getValue()).booleanValue()) {
                if (z) {
                    Message messageObtain = Message.obtain(weakHandlerKo, new ARunnableS80S0200000_11(weakHandlerKo, c0sz8, 47));
                    messageObtain.what = 1001;
                    weakHandlerKo.sendMessageDelayed(messageObtain, 120L);
                    return;
                }
                if (weakHandlerKo.hasMessages(1001)) {
                    weakHandlerKo.removeMessages(1001);
                }
                WeakHandler weakHandlerKo2 = ko();
                if (weakHandlerKo2 == null || !c0sz8.o1()) {
                    return;
                }
                if (2 == i) {
                    Message messageObtain2 = Message.obtain(weakHandlerKo2, new ARunnableS80S0200000_11(weakHandlerKo2, c0sz8, 46));
                    messageObtain2.what = 1002;
                    weakHandlerKo2.sendMessageDelayed(messageObtain2, 20L);
                    return;
                }
                fo(c0sz8);
                return;
            }
            if (!((Boolean) C2269901Dsy.LIZLLL.getValue()).booleanValue()) {
                C0SZ8 c0sz8D = null;
                if (i == 1) {
                    if (!this.LLJJI) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append("_cur");
                        vo(0, c0sz8, C2188811AlT.LIZIZ(sbLIZ), false);
                        FeedInfraTimingSensor feedInfraTimingSensor = FeedInfraTimingSensor.LL;
                        C0S43 c0s43 = C0S43.CLEAN_MODE_OPEN;
                        feedInfraTimingSensor.getClass();
                        FeedInfraTimingSensor.LIZLLL(c0s43, str);
                        if (C2269901Dsy.LIZIZ()) {
                            IViewPagerComponentAbility iViewPagerComponentAbilityMo = mo();
                            if (iViewPagerComponentAbilityMo != null) {
                                c0sz8F2 = iViewPagerComponentAbilityMo.F();
                            } else {
                                c0sz8F2 = null;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str);
                            sbLIZ2.append("_next");
                            vo(2, c0sz8F2, C2188811AlT.LIZIZ(sbLIZ2), false);
                            IViewPagerComponentAbility iViewPagerComponentAbilityMo2 = mo();
                            if (iViewPagerComponentAbilityMo2 != null) {
                                c0sz8D = iViewPagerComponentAbilityMo2.D();
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(str);
                            sbLIZ3.append("_last");
                            vo(1, c0sz8D, C2188811AlT.LIZIZ(sbLIZ3), false);
                        }
                        this.LLJJI = true;
                        return;
                    }
                    return;
                }
                if (i == 0 && this.LLJJI) {
                    Aweme aweme = c0sz8.getAweme();
                    C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
                    C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (!c20285414YyLIZ.LIZ(aid)) {
                        if (aweme != null && AwemeBizExtKt.isSubAweme(aweme)) {
                            return;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(str);
                        sbLIZ4.append("_cur");
                        vo(0, c0sz8, C2188811AlT.LIZIZ(sbLIZ4), true);
                        if (C2269901Dsy.LIZIZ()) {
                            IViewPagerComponentAbility iViewPagerComponentAbilityMo3 = mo();
                            if (iViewPagerComponentAbilityMo3 != null) {
                                c0sz8F = iViewPagerComponentAbilityMo3.F();
                            } else {
                                c0sz8F = null;
                            }
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(str);
                            sbLIZ5.append("_next");
                            vo(2, c0sz8F, C2188811AlT.LIZIZ(sbLIZ5), true);
                            IViewPagerComponentAbility iViewPagerComponentAbilityMo4 = mo();
                            if (iViewPagerComponentAbilityMo4 != null) {
                                c0sz8D = iViewPagerComponentAbilityMo4.D();
                            }
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(str);
                            sbLIZ6.append("_last");
                            vo(1, c0sz8D, C2188811AlT.LIZIZ(sbLIZ6), true);
                        }
                        this.LLJJI = false;
                    }
                }
            }
        }
    }
}
