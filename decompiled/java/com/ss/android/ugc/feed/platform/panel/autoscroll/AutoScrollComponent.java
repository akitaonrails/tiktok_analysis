package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C020T;
import X.C036E;
import X.C0BIE;
import X.C0BTK;
import X.C0DMM;
import X.C0HCN;
import X.C0O0L;
import X.C0QSJ;
import X.C0RD6;
import X.C0RJN;
import X.C0RUJ;
import X.C0S4U;
import X.C0SHX;
import X.C0SUC;
import X.C0SZ8;
import X.C0T12;
import X.C0T1R;
import X.C0T3B;
import X.C1017070cZd;
import X.C1048110dNh;
import X.C10IT;
import X.C1386360mBG;
import X.C1389300mG0;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C13LE;
import X.C1483410ohn;
import X.C1558520qew;
import X.C1566140qrE;
import X.C1578630rBN;
import X.C1600950rlN;
import X.C1600980rlQ;
import X.C1620830sHR;
import X.C1620930sHb;
import X.C1735430vGH;
import X.C1807670x8n;
import X.C19252910Tv;
import X.C19EG;
import X.C1AF0;
import X.C1ER1;
import X.C20684815ws;
import X.C2179771ASp;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C265690Ab9;
import X.C283180B8a;
import X.C299060Bns;
import X.C299750Boz;
import X.C418440Gaw;
import X.C452501pT;
import X.C583160Mu2;
import X.C587330N1v;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C739660Szs;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1008920cMU;
import X.EnumC452301pR;
import X.EnumC584570MwJ;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1735440vGI;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC581520MrO;
import X.InterfaceC586170Myt;
import X.InterfaceC587270N1p;
import X.InterfaceC665370Q7z;
import X.ViewOnLayoutChangeListenerC1620710sHF;
import Y.ACListenerS158S0100000_24;
import Y.AObserverS226S0100000_24;
import android.content.Context;
import android.content.res.Resources;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.detail.SearchInflowProductShopCardService;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.module.item.ISearchInflowProductShopCardService;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.commercialize.measurement.IMeasurementService;
import com.ss.android.ugc.aweme.commercialize.measurement.exposure.ExposureMeasurementConfig;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.title.TitlePanelComponentAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import com.ss.android.ugc.feed.platform.panel.pause.IPausePanelAbility;
import com.ss.android.ugc.feed.platform.panel.pause.PausePanelComponent;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS61S0001000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes25.dex */
public final class AutoScrollComponent extends BaseAutoScrollUIComponent implements InterfaceC1735440vGI, IAutoAScrollAbility, C0RUJ, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public static final int LLLIILIL;
    public static final int LLLIL;
    public C1735430vGH LLJJIJI;
    public C1735430vGH LLJJIJIIJIL;
    public int LLJJIJIL = 2;
    public EnumC584570MwJ LLJJJ;
    public int LLJJJIL;
    public final C01GW LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C630740Ooa LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final ArrayList<Function1<Boolean, Unit>> LLLF;
    public Function1<? super Boolean, Unit> LLLFF;
    public final InterfaceC581520MrO LLLFFI;
    public View LLLFZ;
    public final C01GW LLLI;
    public final Stack<Boolean> LLLII;
    public volatile HomePageViewPagerAbility LLLIIII;
    public InterfaceC665370Q7z LLLIIIIL;
    public C0QSJ LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AutoScrollComponent.class, "homePageViewPagerAbilityByDI", "getHomePageViewPagerAbilityByDI()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIILIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(98));
        LLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void HC1() {
        this.LLJLILLLLZIIL = true;
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.InterfaceC1735440vGI
    public final void LJJI(long j) {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "panel_auto_scroll";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -292136012) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final boolean AU0() {
        View view = this.LLJL;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        View view2 = this.LLJL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        return true;
    }

    public final void Bp() {
        EnumC584570MwJ enumC584570MwJ = this.LLJJJ;
        if (enumC584570MwJ == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP || enumC584570MwJ == EnumC584570MwJ.AUTO_SCROLL_STATE_PAUSE) {
            return;
        }
        Aweme awemeBp = bp();
        C1735430vGH c1735430vGH = new C1735430vGH((awemeBp == null || !AwemeSaaSExtKt.isLive(awemeBp)) ? sp(bp()) ? 15000L : Mp4ScreenVideoLoadTimeout.CONTROL : 10000L, 1000L, this);
        this.LLJJIJI = c1735430vGH;
        c1735430vGH.LJFF();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent
    public final boolean Go() {
        return this.LLJJJ != EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
    }

    public final void LJJIFFI() {
        if (this.LLJJJJJIL > 3) {
            return;
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb == null || iViewPagerComponentAbilityMb.F() == null) {
            if (C1386360mBG.LJIIJ(C1389300mG0.LIZ(getPanelContext()))) {
                this.LLJJJJJIL++;
                IDetailBaseAbility iDetailBaseAbility = (IDetailBaseAbility) this.LLL.getValue();
                if (iDetailBaseAbility != null) {
                    iDetailBaseAbility.os0();
                    return;
                }
                return;
            }
            IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedFetchDataAbility.class, null);
            if (iFeedFetchDataAbility != null) {
                this.LLJJJJJIL++;
                iFeedFetchDataAbility.LLLLL();
            }
        }
    }

    public final IViewPagerComponentAbility Mb() {
        return (IViewPagerComponentAbility) this.LLJZ.getValue();
    }

    public final IFeedPanelPlatformAbility dp() {
        return (IFeedPanelPlatformAbility) this.LLJLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final MutableLiveData dr1() {
        return (MutableLiveData) this.LLLI.getValue();
    }

    public final C1600950rlN ep() {
        return (C1600950rlN) this.LLJJJJ.getValue();
    }

    public final void ip() {
        EnumC584570MwJ enumC584570MwJ;
        EnumC584570MwJ enumC584570MwJ2 = this.LLJJJ;
        if (enumC584570MwJ2 == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP || enumC584570MwJ2 == (enumC584570MwJ = EnumC584570MwJ.AUTO_SCROLL_STATE_PAUSE)) {
            return;
        }
        PopupManager.LJIIJJI();
        C1735430vGH c1735430vGH = this.LLJJIJI;
        if (c1735430vGH != null) {
            c1735430vGH.LIZLLL();
        }
        this.LLJJJ = enumC584570MwJ;
        C1600950rlN c1600950rlNEp = ep();
        if (c1600950rlNEp != null) {
            c1600950rlNEp.LIZ();
        }
    }

    public final void kp() {
        boolean z;
        C1735430vGH c1735430vGH;
        if (this.LLJJJJLIIL && this.LLJJJ == EnumC584570MwJ.AUTO_SCROLL_STATE_PAUSE) {
            PopupManager.LJIILJJIL();
            this.LLJJJ = EnumC584570MwJ.AUTO_SCROLL_STATE_START;
            C1735430vGH c1735430vGH2 = this.LLJJIJI;
            if (c1735430vGH2 != null) {
                synchronized (c1735430vGH2) {
                    z = c1735430vGH2.LLIZLLLIL;
                }
                if (z && (c1735430vGH = this.LLJJIJI) != null) {
                    c1735430vGH.LJ();
                }
            }
            C1600950rlN c1600950rlNEp = ep();
            if (c1600950rlNEp != null && c1600950rlNEp.LIZJ == 1) {
                c1600950rlNEp.LIZIZ = System.currentTimeMillis();
                c1600950rlNEp.LIZJ = 0;
            }
        }
        yp();
    }

    public final void lp() {
        String string;
        Resources resources;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view2;
        View viewFindViewById;
        View view3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        View rootView;
        View viewFindViewById2;
        View view4;
        Integer numValueOf;
        View viewFindViewById3;
        View viewFindViewById4;
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        if (C1483410ohn.LJLJJI().isPlaying()) {
            this.LLJJIJIL = 1;
        }
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Integer numValueOf2 = null;
        if (c19egLIZ != null) {
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            C0SHX.LIZ(c19egLIZ, iDetailFeedSafService != null ? iDetailFeedSafService.LIZLLL(getPanelContext().LJ) : null).LJIIIZ("long_press_layer", new C0T3B() { // from class: X.0rlK
                @Override // X.C0T3B
                public final void LIZIZ() {
                }

                @Override // X.C0T3B
                public final void LIZ() {
                    TuxTextView tuxTextView;
                    AutoScrollComponent autoScrollComponent = this.LIZ;
                    if (autoScrollComponent.LLJJJ == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP || (tuxTextView = autoScrollComponent.LLJILJILJ) == null) {
                        return;
                    }
                    tuxTextView.setText(c19egLIZ.getResources().getString(2131826954));
                }
            });
            HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LLJZIJLIL.getValue();
            if (homePageViewPagerAbility != null) {
                homePageViewPagerAbility.Jk1(new C1620930sHb(this, 11));
            }
            IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
            if (iAccountService != null) {
                iAccountService.LJIILL(new InterfaceC586170Myt() { // from class: X.0rlO
                    @Override // X.InterfaceC586170Myt
                    public final void onAccountResult(int i, boolean z, int i2, User user) {
                    }
                });
            }
        }
        View view5 = this.LLJL;
        if (view5 != null && (viewFindViewById4 = view5.findViewById(R.id.bei)) != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 68), viewFindViewById4);
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        this.LLLFZ = c19egLIZ2 != null ? c19egLIZ2.findViewById(R.id.nk_) : null;
        if ((((Boolean) C265690Ab9.LIZ.getValue()).booleanValue()) && (view3 = this.LLLFZ) != null) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                C19EG c19egLIZ3 = C724240Sb0.LIZ(this);
                Object parent = (c19egLIZ3 == null || (viewFindViewById3 = c19egLIZ3.findViewById(R.id.tpm)) == null) ? null : viewFindViewById3.getParent();
                marginLayoutParams2.topMargin = (!(parent instanceof View) || (view4 = (View) parent) == null || (numValueOf = Integer.valueOf(view4.getBottom())) == null) ? LLLIILIL : Integer.valueOf(numValueOf.intValue() + LLLIL).intValue();
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
                if (C1386360mBG.LJIIJ(iFeedPanelPlatformAbilityDp != null ? iFeedPanelPlatformAbilityDp.cY1() : null) && (rootView = view3.getRootView()) != null && (viewFindViewById2 = rootView.findViewById(R.id.ija)) != null) {
                    if (!viewFindViewById2.isLaidOut() || viewFindViewById2.isLayoutRequested()) {
                        viewFindViewById2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1620710sHF(marginLayoutParams2, 3));
                    } else {
                        Integer numValueOf3 = Integer.valueOf(viewFindViewById2.getBottom());
                        marginLayoutParams2.topMargin = Boolean.valueOf(numValueOf3.intValue() > 0).booleanValue() ? Integer.valueOf(numValueOf3.intValue() + LLLIL).intValue() : LLLIILIL;
                    }
                }
            }
        }
        if (C0BIE.LIZ && (view = this.LLLFZ) != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                C19EG c19egLIZ4 = C724240Sb0.LIZ(this);
                Object parent2 = (c19egLIZ4 == null || (viewFindViewById = c19egLIZ4.findViewById(R.id.tpm)) == null) ? null : viewFindViewById.getParent();
                if ((parent2 instanceof View) && (view2 = (View) parent2) != null) {
                    numValueOf2 = Integer.valueOf(view2.getBottom());
                }
                if (C0HCN.LIZ()) {
                    marginLayoutParams.topMargin = numValueOf2 != null ? Integer.valueOf(numValueOf2.intValue() + PausePanelComponent.LLJL).intValue() : PausePanelComponent.LLJJL;
                } else {
                    marginLayoutParams.topMargin = numValueOf2 != null ? Integer.valueOf(numValueOf2.intValue() + PausePanelComponent.LLJLIL).intValue() : PausePanelComponent.LLJJLIIIJLLLLLLLZ;
                }
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                C786410Ut5.W5(view, marginLayoutParams);
            }
        }
        View view6 = this.LLLFZ;
        if (view6 != null) {
            view6.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1620710sHF(this, 2));
        }
        TuxTextView tuxTextView = this.LLJILJILJ;
        if (tuxTextView != null) {
            C19EG c19egLIZ5 = C724240Sb0.LIZ(this);
            if (c19egLIZ5 == null || (resources = c19egLIZ5.getResources()) == null || (string = resources.getString(2131826954)) == null) {
                string = "";
            }
            tuxTextView.setText(string);
        }
        C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJLLLLLL(R.raw.icon_auto_scroll_off_fill);
        TuxIconView tuxIconView = this.LLJILLL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_auto_scroll_off_fill);
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb != null) {
            iViewPagerComponentAbilityMb.Bv0(new C1620830sHR(this, 12));
        }
    }

    public final void tp() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        String aid;
        C2189821An6 c2189821An6;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp;
        C0SZ8 c0sz8F;
        EnumC584570MwJ enumC584570MwJ = this.LLJJJ;
        if (enumC584570MwJ == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP || enumC584570MwJ == EnumC584570MwJ.AUTO_SCROLL_STATE_PAUSE) {
            return;
        }
        if (!zp(true)) {
            if (op(bp())) {
                C1386360mBG.LIZLLL().LJIIIZ("start Timer");
                Bp();
            } else {
                C1735430vGH c1735430vGH = this.LLJJIJI;
                if (c1735430vGH != null) {
                    c1735430vGH.LIZ();
                }
            }
            this.LLJJL = false;
            return;
        }
        C1386360mBG.LIZLLL().LJIIJJI(new AwS568S0100000_24(this, 1522));
        IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = Mb();
        if ((iViewPagerComponentAbilityMb2 == null || iViewPagerComponentAbilityMb2.F() == null) && (iViewPagerComponentAbilityMb = Mb()) != null) {
            iViewPagerComponentAbilityMb.KT0();
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMb3 = Mb();
        if (iViewPagerComponentAbilityMb3 == null || iViewPagerComponentAbilityMb3.F() == null) {
            if (C036E.LIZ.LIZJ == C0O0L.AVAILABLE) {
                this.LLJJL = false;
                LJJIFFI();
            } else if (!this.LLJJL) {
                if (C299060Bns.LIZ()) {
                    C19EG c19egLIZ = C724240Sb0.LIZ(this);
                    if (c19egLIZ != null) {
                        C1389880mGw c1389880mGw = new C1389880mGw(c19egLIZ);
                        c1389880mGw.LJIIIZ(c19egLIZ.getResources().getString(2131826955));
                        c1389880mGw.LJIIJ();
                    }
                } else {
                    Fp(2131826955);
                }
                Aweme awemeBp = bp();
                String strCp = cp();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", strCp);
                c2344009Gk.LJIIIIZZ("author_id", awemeBp != null ? AwemeExtKt.getAuthorUid(awemeBp) : null);
                if (awemeBp == null || (aid = awemeBp.getAid()) == null) {
                    aid = "";
                }
                c2344009Gk.LJIIIIZZ("group_id", aid);
                if (C1386360mBG.LJIIJ(strCp)) {
                    c2344009Gk.LJII(C1386360mBG.LJFF());
                }
                C20684815ws.LJIILLIIL("auto_scroll_weak_internet_toast", c2344009Gk.LIZ);
                this.LLJJL = true;
            }
            if (op(bp())) {
                Bp();
                return;
            }
            return;
        }
        C1483410ohn.LJLJJI().LIZ();
        this.LLJJL = false;
        this.LLJJJJJIL = 0;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb4 = Mb();
        int iLJIL = iViewPagerComponentAbilityMb4 != null ? iViewPagerComponentAbilityMb4.LJIL() : 0;
        Aweme awemeBp2 = bp();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp2 = dp();
        String strCY1 = iFeedPanelPlatformAbilityDp2 != null ? iFeedPanelPlatformAbilityDp2.cY1() : null;
        LruCache<String, C739660Szs> lruCache = C0T12.LIZ;
        if (awemeBp2 != null && Intrinsics.LJFF(strCY1, "homepage_hot")) {
            String aid2 = awemeBp2.getAid();
            LruCache<String, C739660Szs> lruCache2 = C0T12.LIZ;
            C739660Szs c739660Szs = lruCache2.get(aid2);
            if (c739660Szs != null) {
                c739660Szs.LIZIZ = true;
            } else {
                lruCache2.put(aid2, new C739660Szs(false, true));
            }
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMb5 = Mb();
        Aweme aweme = (iViewPagerComponentAbilityMb5 == null || (c0sz8F = iViewPagerComponentAbilityMb5.F()) == null) ? null : c0sz8F.getAweme();
        IViewPagerComponentAbility iViewPagerComponentAbilityMb6 = Mb();
        if (iViewPagerComponentAbilityMb6 != null) {
            iViewPagerComponentAbilityMb6.t21(true);
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMb7 = Mb();
        if (Intrinsics.LJFF(iViewPagerComponentAbilityMb7 != null ? Boolean.valueOf(iViewPagerComponentAbilityMb7.to(iLJIL + 1)) : null, Boolean.TRUE) && aweme != null && aweme.isAd()) {
            try {
                SettingsManager.LIZLLL().getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
            if (SettingsManager.LIZ("auto_scroll_ad_report_show", true)) {
                String strCp2 = cp();
                C01GW c01gw = C587330N1v.LIZIZ;
                if (!((ExposureMeasurementConfig) c01gw.getValue()).exposureAll && !((ExposureMeasurementConfig) c01gw.getValue()).exposureEventTypes.contains(strCp2)) {
                    this.LLLFFI.LIZIZ(aweme, cp(), new InterfaceC587270N1p() { // from class: X.0N4x
                        @Override // X.InterfaceC587270N1p
                        public final String getValue() {
                            return "auto_scroll";
                        }
                    }, new AwS598S0100000_19(this, 283));
                }
            }
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMb8 = Mb();
        if (iViewPagerComponentAbilityMb8 != null) {
            iViewPagerComponentAbilityMb8.t21(false);
        }
        C1386360mBG.LIZLLL().LJIIJJI(new AwS61S0001000_19(iLJIL, 13));
        if (!C0BTK.LIZ() || aweme == null || (c2189821An6 = getPanelContext().LIZJ) == null || (iFeedPanelPlatformAbilityDp = dp()) == null) {
            return;
        }
        C0T12.LIZ(aweme, iFeedPanelPlatformAbilityDp.zj(), c2189821An6, C0T1R.LIZ(getPanelContext()), C724240Sb0.LIZ(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void uD2() {
        if (this.LLJJJ == EnumC584570MwJ.AUTO_SCROLL_STATE_START && this.LLLII.isEmpty()) {
            if ((LJJIJL().getAlpha() == 0.0f || LJJIJL().getVisibility() == 8) && ap(bp()) && !C19252910Tv.LIZIZ.LIZLLL().LJIILL().LLJJJJJIL()) {
                So();
            }
        }
    }

    public AutoScrollComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        C01GW c01gwLIZIZ3;
        EnumC584570MwJ enumC584570MwJ = EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
        this.LLJJJ = enumC584570MwJ;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1527));
        this.LLJJJJLIIL = true;
        this.LLJLIL = true;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1524), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 19));
        }
        this.LLJLL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1525), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 20));
        }
        this.LLJLLIL = c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa3 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1526), null);
            C1566140qrE.LIZJ(this, c630740Ooa3);
            c01gwLIZIZ3 = c630740Ooa3;
        } else {
            c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 21));
        }
        this.LLJLLL = c01gwLIZIZ3;
        C19252910Tv.LIZIZ.LIZLLL().LJIILL().LIZJ();
        this.LLJJJ = enumC584570MwJ;
        this.LLJZ = C628500Oky.LIZ(new AwS568S0100000_24(this, 1528));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1521));
        this.LLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1520));
        this.LLLF = new ArrayList<>();
        this.LLLFFI = ((IMeasurementService) ServiceManager.get().getService(IMeasurementService.class)).LJFF();
        this.LLLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(408));
        this.LLLII = new Stack<>();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent
    public final String Jo() {
        String strCY1;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
        if (iFeedPanelPlatformAbilityDp == null || (strCY1 = iFeedPanelPlatformAbilityDp.cY1()) == null) {
            return "";
        }
        int iHashCode = strCY1.hashCode();
        return iHashCode != 998835423 ? iHashCode != 1425879700 ? (iHashCode == 1691937916 && strCY1.equals("homepage_hot")) ? "first_show_auto_scroll" : "" : !strCY1.equals("search_result") ? "" : "first_show_search_auto_scroll" : !strCY1.equals("general_search") ? "" : "first_show_search_auto_scroll";
    }

    @Override // X.InterfaceC1735440vGI
    public final void LIZLLL() {
        PhotoModeImageInfo photoModeImageInfo;
        FypAutoScrollService fypAutoScrollServiceLIZJ;
        List<PhotoModeImageUrlModel> imageList;
        Aweme awemeBp = bp();
        if (awemeBp != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
            boolean z = !C1386360mBG.LJIIJ(iFeedPanelPlatformAbilityDp != null ? iFeedPanelPlatformAbilityDp.cY1() : null) && AwemeSaaSExtKt.isLive(awemeBp);
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp2 = dp();
            boolean z2 = C1386360mBG.LJIIJ(iFeedPanelPlatformAbilityDp2 != null ? iFeedPanelPlatformAbilityDp2.cY1() : null) && AwemeBizExtKt.isSubAweme(awemeBp);
            if (!z && (((photoModeImageInfo = awemeBp.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() != 1) && (C1386360mBG.LJIIL(awemeBp) || AwemeSaaSExtKt.isLive(awemeBp) || AwemeBizExtKt.isReferralFakeAweme(awemeBp)))) {
                C10IT.LIZ.getClass();
                if (!C10IT.LJIILJJIL(awemeBp) && !C10IT.LJIILIIL(awemeBp) && (!C10IT.LJIIL(awemeBp) || (fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ()) == null || !fypAutoScrollServiceLIZJ.LJIIIZ())) {
                    String aid = awemeBp.getAid();
                    if (aid != null && u.LJJIIJZLJL(aid, "ug_referral_sub_", true)) {
                        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJIII();
                    } else if (!z2) {
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp3 = dp();
                        if ((!C1386360mBG.LJIIJ(iFeedPanelPlatformAbilityDp3 != null ? iFeedPanelPlatformAbilityDp3.cY1() : null) || !C1ER1.LIZIZ.LJJII().LJFF(awemeBp)) && !sp(awemeBp)) {
                            return;
                        }
                    }
                }
            }
            tp();
        }
    }

    public final void Zo() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
        if (C1386360mBG.LJIIJ(iFeedPanelPlatformAbilityDp != null ? iFeedPanelPlatformAbilityDp.cY1() : null) && this.LLJJJ == EnumC584570MwJ.AUTO_SCROLL_STATE_START) {
            IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
            if (iViewPagerComponentAbilityMb != null) {
                IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = Mb();
                if (iViewPagerComponentAbilityMb.Rh(iViewPagerComponentAbilityMb2 != null ? iViewPagerComponentAbilityMb2.LJIIIIZZ() : null) != null) {
                    return;
                }
            }
            LJJIFFI();
        }
    }

    public final Aweme bp() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb != null) {
            return iViewPagerComponentAbilityMb.LLLLLJLJLL();
        }
        return null;
    }

    public final String cp() {
        String eventType;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        return (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) ? "" : eventType;
    }

    @Override // X.C0RUJ
    public final void lj() {
        if (C1483410ohn.LJLJJI().isPlaying()) {
            this.LLJJIJIL = 1;
        }
    }

    public final boolean mp() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
        return Intrinsics.LJFF(iFeedPanelPlatformAbilityDp != null ? iFeedPanelPlatformAbilityDp.cY1() : null, "paid_series_detail_page");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1386360mBG.LIZ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        ip();
        C1386360mBG.LIZ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        kp();
    }

    public final boolean up() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
        if (C1386360mBG.LJIIJ(iFeedPanelPlatformAbilityDp != null ? iFeedPanelPlatformAbilityDp.cY1() : null) && C1ER1.LIZIZ.LLLLZI()) {
            return true;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp2 = dp();
        return C1386360mBG.LJIIIZ(iFeedPanelPlatformAbilityDp2 != null ? iFeedPanelPlatformAbilityDp2.cY1() : null);
    }

    public final void yp() {
        EnumC584570MwJ enumC584570MwJLLILLJJLI;
        if (!C1386360mBG.LJIIJ(C0SUC.LIZ(getContext()).getEventType()) || (enumC584570MwJLLILLJJLI = C1ER1.LIZIZ.LLILLJJLI()) == this.LLJJJ) {
            return;
        }
        if (enumC584570MwJLLILLJJLI != EnumC584570MwJ.AUTO_SCROLL_STATE_START) {
            Ep("", false);
        } else {
            lp();
            Ap(this, false, false, false, 6);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final EnumC584570MwJ xo1() {
        return this.LLJJJ;
    }

    public final void Fp(int i) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ(c19egLIZ.getResources().getString(i));
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void Wa1(Function1<? super Boolean, Unit> function1) {
        this.LLLF.add(function1);
    }

    public final void Xy0(boolean z) {
        IMidAdCellAbility iMidAdCellAbilityHp0;
        IMidAdAbility iMidAdAbility = (IMidAdAbility) this.LLJLLL.getValue();
        if (iMidAdAbility != null && (iMidAdCellAbilityHp0 = iMidAdAbility.Hp0()) != null) {
            iMidAdCellAbilityHp0.Xy0(z);
        }
        Function1<? super Boolean, Unit> function1 = this.LLLFF;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        for (Function1<Boolean, Unit> function12 : this.LLLF) {
            if (function12 != null) {
                function12.invoke(Boolean.valueOf(z));
            }
        }
    }

    public final boolean ap(Aweme aweme) {
        if ((aweme == null || (!AwemeSaaSExtKt.isLive(aweme) && aweme.getAwemeType() != 4004 && !C1017070cZd.LLIZLLLIL(aweme))) && !up()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void dq1(Aweme aweme) {
        String aid;
        String aid2;
        if (this.LLJJJ == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP) {
            return;
        }
        String strCY1 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme awemeBp = bp();
        if (awemeBp != null) {
            aid2 = awemeBp.getAid();
        } else {
            aid2 = null;
        }
        if (Intrinsics.LJFF(aid, aid2)) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
            if (iFeedPanelPlatformAbilityDp != null) {
                strCY1 = iFeedPanelPlatformAbilityDp.cY1();
            }
            C0T12.LIZIZ(aweme, strCY1);
            tp();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        String strCY1;
        c0rd6.LIZIZ("event_on_play_completed", new AwS598S0100000_19(this, 281));
        c0rd6.LIZIZ("event_on_play_pause", new AwS603S0100000_24(this, 401));
        c0rd6.LIZ("event_on_playing", new AObserverS226S0100000_24(this, 12));
        c0rd6.LIZ("event_on_request_resume_play", new AObserverS226S0100000_24(this, 13));
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
        if (iFeedPanelPlatformAbilityDp != null) {
            strCY1 = iFeedPanelPlatformAbilityDp.cY1();
        } else {
            strCY1 = null;
        }
        if (C1386360mBG.LJIIJ(strCY1) && C1ER1.LIZIZ.LLLLZI()) {
            c0rd6.LIZIZ("event_on_play_progress_change", new AwS598S0100000_19(this, 282));
        }
    }

    public final void hp(boolean z) {
        C1600950rlN c1600950rlNEp;
        if (this.LLJJJ == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP) {
            return;
        }
        Aweme awemeBp = bp();
        if (!ap(awemeBp)) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
        } else if (LJJIJL().getVisibility() != 0) {
            IPausePanelAbility iPausePanelAbility = (IPausePanelAbility) this.LLJLLIL.getValue();
            if (iPausePanelAbility != null) {
                iPausePanelAbility.A42();
            }
            if (!C19252910Tv.LIZIZ.LIZLLL().LJIILL().LLJJJJJIL()) {
                So();
            }
        }
        if (op(awemeBp)) {
            C1735430vGH c1735430vGH = this.LLJJIJI;
            if (c1735430vGH != null) {
                c1735430vGH.LIZ();
            }
            Bp();
        }
        if (awemeBp != null && AwemeSaaSExtKt.isLive(awemeBp)) {
            C1600950rlN c1600950rlNEp2 = ep();
            if (c1600950rlNEp2 != null) {
                c1600950rlNEp2.LIZ();
                return;
            }
            return;
        }
        if ((z || !this.LLJLIL) && (c1600950rlNEp = ep()) != null) {
            c1600950rlNEp.LIZLLL++;
        }
        C1600950rlN c1600950rlNEp3 = ep();
        if (c1600950rlNEp3 == null || c1600950rlNEp3.LIZJ != 1) {
            return;
        }
        c1600950rlNEp3.LIZIZ = System.currentTimeMillis();
        c1600950rlNEp3.LIZJ = 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void mb1(Function1<? super Boolean, Unit> function1) {
        try {
            this.LLLF.remove(function1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        this.LLJJJJLIIL = false;
        ip();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        this.LLJJJJLIIL = true;
        kp();
    }

    public final void onPlayCompleted(String str) {
        String aid;
        boolean z;
        boolean z2;
        boolean zLJI = MethodIDManager.LJI(72021);
        EnumC584570MwJ enumC584570MwJ = this.LLJJJ;
        String aid2 = null;
        if (enumC584570MwJ != EnumC584570MwJ.AUTO_SCROLL_STATE_STOP && enumC584570MwJ != EnumC584570MwJ.AUTO_SCROLL_STATE_PAUSE) {
            Aweme awemeBp = bp();
            if (awemeBp != null) {
                aid = awemeBp.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid)) {
                Aweme awemeBp2 = bp();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPlayCompleted:  ");
                sbLIZ.append(this.LLJJJ);
                sbLIZ.append(", ");
                sbLIZ.append(!C1386360mBG.LJIIJJI(awemeBp2));
                sbLIZ.append("   ");
                if (awemeBp2 != null && awemeBp2.getAwemeType() == 40) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(!z);
                sbLIZ.append("  ");
                if (awemeBp2 != null && AwemeExtKt.isPhotoMode(awemeBp2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sbLIZ.append(!z2);
                C2188811AlT.LIZIZ(sbLIZ);
                if (!C1386360mBG.LJIIJJI(awemeBp2) && (awemeBp2 == null || (awemeBp2.getAwemeType() != 40 && !AwemeExtKt.isPhotoMode(awemeBp2)))) {
                    tp();
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onPlayCompleted: autoScrollState ");
        sbLIZ2.append(this.LLJJJ);
        sbLIZ2.append(" sourceId ");
        sbLIZ2.append(str);
        sbLIZ2.append(", aid ");
        Aweme awemeBp3 = bp();
        if (awemeBp3 != null) {
            aid2 = awemeBp3.getAid();
        }
        sbLIZ2.append(aid2);
        sbLIZ2.append(' ');
        C2188811AlT.LIZIZ(sbLIZ2);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.BaseAutoScrollUIComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayListRemove;
        super.onViewCreated(view);
        this.LLJL = view;
        this.LLJJLIIIJLLLLLLLZ = false;
        C1386360mBG.LIZ = null;
        yp();
        C19252910Tv.LIZIZ.LIZLLL().LJIILL().LIZJ();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (copyOnWriteArrayListRemove = C1386360mBG.LIZJ.remove(c19egLIZ)) != null) {
            Iterator<Function0<Unit>> it2 = copyOnWriteArrayListRemove.iterator();
            while (it2.hasNext()) {
                it2.next().invoke();
            }
        }
    }

    public final boolean op(Aweme aweme) {
        String strCY1;
        boolean z;
        String strCY12;
        boolean z2;
        PhotoModeImageInfo photoModeImageInfo;
        String aid;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme == null) {
            return false;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
        String strCY13 = null;
        if (iFeedPanelPlatformAbilityDp != null) {
            strCY1 = iFeedPanelPlatformAbilityDp.cY1();
        } else {
            strCY1 = null;
        }
        if (!C1386360mBG.LJIIJ(strCY1) && AwemeSaaSExtKt.isLive(aweme)) {
            z = true;
        } else {
            z = false;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp2 = dp();
        if (iFeedPanelPlatformAbilityDp2 != null) {
            strCY12 = iFeedPanelPlatformAbilityDp2.cY1();
        } else {
            strCY12 = null;
        }
        if (C1386360mBG.LJIIJ(strCY12) && AwemeBizExtKt.isSubAweme(aweme)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && (((photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() != 1) && (C1386360mBG.LJIIL(aweme) || AwemeSaaSExtKt.isLive(aweme)))) {
            C10IT.LIZ.getClass();
            if (!C10IT.LJIILJJIL(aweme) && !C10IT.LJIILIIL(aweme) && !C10IT.LJIIL(aweme) && (((aid = aweme.getAid()) == null || !u.LJJIIJZLJL(aid, "ug_referral_sub_", true)) && !z2)) {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp3 = dp();
                if (iFeedPanelPlatformAbilityDp3 != null) {
                    strCY13 = iFeedPanelPlatformAbilityDp3.cY1();
                }
                if ((!C1386360mBG.LJIIJ(strCY13) || !C1ER1.LIZIZ.LJJII().LJFF(aweme)) && !sp(aweme)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean sp(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        ISearchInflowProductShopCardService iSearchInflowProductShopCardServiceLJII = SearchInflowProductShopCardService.LJII();
        String strCY1 = null;
        if (iSearchInflowProductShopCardServiceLJII == null || !iSearchInflowProductShopCardServiceLJII.LJI(aweme, null)) {
            return false;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
        if (iFeedPanelPlatformAbilityDp != null) {
            strCY1 = iFeedPanelPlatformAbilityDp.cY1();
        }
        if (!C1386360mBG.LJIIJ(strCY1)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void yb0(AwS590S0100000_11 awS590S0100000_11) {
        this.LLLFF = awS590S0100000_11;
    }

    /* JADX WARN: Type inference failed for: r0v85, types: [X.0rlQ] */
    public final boolean zp(boolean z) {
        FlexibleComponentAbility flexibleComponentAbility;
        TitlePanelComponentAbility titlePanelComponentAbility;
        Aweme awemeBp;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        IFeedVideoShrinkService iFeedVideoShrinkService;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        IFeedVideoShrinkService iFeedVideoShrinkService2;
        AwemeRawAd awemeRawAd6;
        String webUrl;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        AnoleModel anoleModel2;
        Map<String, AnoleComponentModel> map2;
        if (this.LLJLILLLLZIIL) {
            this.LLJLILLLLZIIL = false;
            return false;
        }
        EnumC584570MwJ enumC584570MwJ = this.LLJJJ;
        if (enumC584570MwJ != EnumC584570MwJ.AUTO_SCROLL_STATE_STOP && enumC584570MwJ != EnumC584570MwJ.AUTO_SCROLL_STATE_PAUSE) {
            if (this.LLJJJIL == 0) {
                C0RJN panelContext = getPanelContext();
                IAutoAScrollAbility iAutoAScrollAbility = C1386360mBG.LIZ;
                C19EG c19egLIZ = panelContext.LIZ();
                if ((c19egLIZ == null || !C1386360mBG.LJIIIIZZ(c19egLIZ, z)) && !((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LJIJ() && !((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LIZ() && !((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LJII() && !((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LIZLLL() && (((flexibleComponentAbility = (FlexibleComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FlexibleComponentAbility.class, null)) == null || !flexibleComponentAbility.bU0()) && (((titlePanelComponentAbility = (TitlePanelComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TitlePanelComponentAbility.class, null)) == null || !titlePanelComponentAbility.isShowing()) && !((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LJIIJJI()))) {
                    if (((Boolean) C283180B8a.LIZ.getValue()).booleanValue() && (awemeBp = bp()) != null && AwemeExtKt.isAdTraffic(awemeBp)) {
                        C1048110dNh.LIZLLL.getClass();
                        if (C1807670x8n.LJJIIJZLJL == null) {
                            synchronized (C1600980rlQ.class) {
                                try {
                                    if (C1807670x8n.LJJIIJZLJL == null) {
                                        C1807670x8n.LJJIIJZLJL = new Object() { // from class: X.0rlQ
                                        };
                                    }
                                } finally {
                                }
                            }
                        }
                        if (awemeBp != null && AwemeExtKt.isAdTraffic(awemeBp) && (((awemeRawAd = awemeBp.getAwemeRawAd()) != null && (anoleModel2 = awemeRawAd.getAnoleModel()) != null && (map2 = anoleModel2.components) != null && map2.containsKey(EnumC1008920cMU.NATIVE_END_LAYER.getType())) || (((awemeRawAd2 = awemeBp.getAwemeRawAd()) != null && (anoleModel = awemeRawAd2.getAnoleModel()) != null && (map = anoleModel.components) != null && map.containsKey(EnumC1008920cMU.LYNX_END_LAYER.getType())) || (!AwemeExtKt.isPhotoMode(awemeBp) && (((awemeRawAd3 = awemeBp.getAwemeRawAd()) == null || (webUrl = awemeRawAd3.getWebUrl()) == null || webUrl.length() == 0) && !C1017070cZd.LLIL(awemeBp) && !C1017070cZd.LJJZZI(awemeBp) && !C1017070cZd.LJJZZIII(awemeBp) && !C1017070cZd.LLJILJIL(awemeBp) && !C1017070cZd.LLIZ(awemeBp) && !C1017070cZd.LLILLIZIL(awemeBp) ? !((iFeedVideoShrinkService = (IFeedVideoShrinkService) PluggableExtentionKt.pluggableSpi$default(IFeedVideoShrinkService.class, false, false, false, 14, null)) == null || !iFeedVideoShrinkService.LLJLILLLLZIIL()) : !(((awemeRawAd4 = awemeBp.getAwemeRawAd()) == null || !awemeRawAd4.showMaskRecycle) && !C583160Mu2.LIZIZ(awemeBp) && (((awemeRawAd5 = awemeBp.getAwemeRawAd()) == null || awemeRawAd5.getShowMaskTimes() <= 0 || ((awemeRawAd6 = awemeBp.getAwemeRawAd()) != null && awemeRawAd6.getShowMaskTimes() >= 100)) && ((iFeedVideoShrinkService2 = (IFeedVideoShrinkService) PluggableExtentionKt.pluggableSpi$default(IFeedVideoShrinkService.class, false, false, false, 14, null)) == null || !iFeedVideoShrinkService2.LLJLILLLLZIIL())))))))) {
                            C1386360mBG.LIZLLL().LJIIIZ("shouldMoveToNext: commerceAutoScrollService.interceptAutoScroll");
                            return false;
                        }
                    }
                    if (this.LLJJIJIL == 2 && !op(bp())) {
                        return false;
                    }
                    return true;
                }
            }
            if (z) {
                AbstractC1604130rqV abstractC1604130rqVLIZLLL = C1386360mBG.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shouldMoveToNext: viewPagerState ");
                sbLIZ.append(this.LLJJJIL);
                sbLIZ.append(", or dialog is showing or inPinching or draggingSeekbar");
                abstractC1604130rqVLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return false;
    }

    public final void Ep(String str, boolean z) {
        long j;
        long j2;
        String aid;
        String authorUid;
        String aid2;
        EnumC584570MwJ enumC584570MwJ = this.LLJJJ;
        EnumC584570MwJ enumC584570MwJ2 = EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
        if (enumC584570MwJ == enumC584570MwJ2) {
            return;
        }
        String authorUid2 = null;
        if (((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJLIIIJILLIZJL() && !mp()) {
            Context context = getContext();
            if (C2179771ASp.LIZLLL) {
                try {
                    C786410Ut5.LJJIFFI(context, C2179771ASp.LJ);
                    C2179771ASp.LJ = null;
                    C2179771ASp.LIZLLL = false;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C1735430vGH c1735430vGH = this.LLJJIJIIJIL;
            if (c1735430vGH != null) {
                c1735430vGH.LIZ();
            }
            this.LLJJIJIIJIL = null;
        }
        Lo();
        C1735430vGH c1735430vGH2 = this.LLJJIJI;
        if (c1735430vGH2 != null) {
            c1735430vGH2.LIZ();
        }
        C1735430vGH c1735430vGH3 = this.LLJJI;
        if (c1735430vGH3 != null) {
            c1735430vGH3.LIZ();
        }
        this.LLJJJ = enumC584570MwJ2;
        Oo(false);
        if (C1386360mBG.LJIIJ(C0SUC.LIZ(getContext()).getEventType())) {
            C1ER1.LIZIZ.LJJIJIIJI(enumC584570MwJ2);
        }
        PopupManager.LJIIJJI();
        C1600950rlN c1600950rlNEp = ep();
        if (c1600950rlNEp != null && c1600950rlNEp.LIZJ != 2) {
            long jCurrentTimeMillis = System.currentTimeMillis() - c1600950rlNEp.LIZIZ;
            if (jCurrentTimeMillis < 3600000) {
                c1600950rlNEp.LIZ += jCurrentTimeMillis;
            }
            c1600950rlNEp.LIZIZ = 0L;
            c1600950rlNEp.LIZJ = 2;
        }
        if (z) {
            Aweme awemeBp = bp();
            String strCp = cp();
            C1600950rlN c1600950rlNEp2 = ep();
            if (c1600950rlNEp2 != null) {
                j = c1600950rlNEp2.LIZLLL;
            } else {
                j = 0;
            }
            C1600950rlN c1600950rlNEp3 = ep();
            if (c1600950rlNEp3 != null) {
                j2 = c1600950rlNEp3.LIZ;
            } else {
                j2 = 0;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", strCp);
            c2344009Gk.LJIIIIZZ("enter_method", str);
            if (awemeBp != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(awemeBp);
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid2);
            c2344009Gk.LIZLLL(j, "auto_scroll_vv");
            c2344009Gk.LIZLLL(j2, "auto_scroll_duration");
            if (awemeBp != null) {
                aid = awemeBp.getAid();
            } else {
                aid = null;
            }
            String str2 = "";
            if (aid == null) {
                aid = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            if (C1386360mBG.LJIIJ(strCp)) {
                c2344009Gk.LJII(C1386360mBG.LJFF());
            }
            C20684815ws.LJIILLIIL("turn_off_auto_scroll", c2344009Gk.LIZ);
            if (!C299060Bns.LIZ()) {
                Aweme awemeBp2 = bp();
                String strCp2 = cp();
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", strCp2);
                c2344009Gk2.LJIIIIZZ("enter_method", str);
                if (awemeBp2 != null) {
                    authorUid = AwemeExtKt.getAuthorUid(awemeBp2);
                } else {
                    authorUid = null;
                }
                c2344009Gk2.LJIIIIZZ("author_id", authorUid);
                if (awemeBp2 != null && (aid2 = awemeBp2.getAid()) != null) {
                    str2 = aid2;
                }
                c2344009Gk2.LJIIIIZZ("group_id", str2);
                if (C1386360mBG.LJIIJ(strCp2)) {
                    c2344009Gk2.LJII(C1386360mBG.LJFF());
                }
                C20684815ws.LJIILLIIL("auto_scroll_turned_off_toast", c2344009Gk2.LIZ);
            }
            C1600950rlN c1600950rlNEp4 = ep();
            if (c1600950rlNEp4 != null) {
                c1600950rlNEp4.LIZLLL = 0L;
            }
        }
        Gp(true, false);
    }

    public final void Gp(boolean z, boolean z2) {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        Fragment fragmentKi;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        IDefaultAutoScrollAbility iDefaultAutoScrollAbility = null;
        if (c19egLIZ != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZ)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null && (fragmentKi = homeTabAbilityLIZ.Ki("For You")) != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragmentKi)) != null) {
            iDefaultAutoScrollAbility = (IDefaultAutoScrollAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IDefaultAutoScrollAbility.class, null);
        }
        if (z) {
            if (iDefaultAutoScrollAbility != null) {
                iDefaultAutoScrollAbility.U40();
            }
        } else {
            if (z2 || iDefaultAutoScrollAbility == null) {
                return;
            }
            iDefaultAutoScrollAbility.ZP1();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void OE(int i, int i2) {
        String strCY1;
        C1600950rlN c1600950rlNEp;
        if (this.LLJJJ == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP) {
            return;
        }
        Aweme awemeBp = bp();
        IAutoAScrollAbility iAutoAScrollAbility = C1386360mBG.LIZ;
        if (awemeBp != null && awemeBp.getAwemeType() == 40) {
            if (i == i2 - 1) {
                if (!zp(false) && (c1600950rlNEp = ep()) != null) {
                    c1600950rlNEp.LIZLLL++;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityDp = dp();
                if (iFeedPanelPlatformAbilityDp != null) {
                    strCY1 = iFeedPanelPlatformAbilityDp.cY1();
                } else {
                    strCY1 = null;
                }
                C0T12.LIZIZ(awemeBp, strCY1);
                tp();
                return;
            }
            C1600950rlN c1600950rlNEp2 = ep();
            if (c1600950rlNEp2 == null) {
                return;
            }
            c1600950rlNEp2.LIZLLL++;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void lZ(boolean z, boolean z2) {
        C1386360mBG.LIZLLL().LJIIJJI(new AwS568S0100000_24(this, 1523));
        lp();
        Ap(this, z, false, z2, 2);
        Xy0(true);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility
    public final void qt0(String str, boolean z) {
        C1386360mBG.LIZLLL().LJIIJJI(new AwS173S1100000_24(this, str, 6));
        if (z && !C299060Bns.LIZ()) {
            Fp(2131826957);
        }
        Ep(str, true);
        Xy0(false);
    }

    public static void Ap(final AutoScrollComponent autoScrollComponent, boolean z, boolean z2, boolean z3, int i) {
        C1600950rlN c1600950rlNEp;
        IPausePanelAbility iPausePanelAbility;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        EnumC584570MwJ enumC584570MwJ = autoScrollComponent.LLJJJ;
        EnumC584570MwJ enumC584570MwJ2 = EnumC584570MwJ.AUTO_SCROLL_STATE_START;
        if (enumC584570MwJ == enumC584570MwJ2 && !z2) {
            return;
        }
        if (((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJLIIIJILLIZJL() && C2179771ASp.LJIIIIZZ() == 0.0d && !autoScrollComponent.mp()) {
            autoScrollComponent.Fp(2131821731);
            return;
        }
        if (((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJLIIIJILLIZJL() && !autoScrollComponent.mp()) {
            C2179771ASp.LJIIL(autoScrollComponent.getContext());
            if (autoScrollComponent.LLJJIJIIJIL == null) {
                autoScrollComponent.LLJJIJIIJIL = new C1735430vGH(Long.MAX_VALUE, 500L, new InterfaceC1735440vGI() { // from class: X.0rlM
                    @Override // X.InterfaceC1735440vGI
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC1735440vGI
                    public final void onStart() {
                    }

                    @Override // X.InterfaceC1735440vGI
                    public final void LJJI(long j) {
                        if (C2179771ASp.LJIIIIZZ() == 0.0d) {
                            this.LL.qt0("mute", false);
                            this.LL.Fp(2131821731);
                        }
                    }
                });
            }
            C1735430vGH c1735430vGH = autoScrollComponent.LLJJIJIIJIL;
            if (c1735430vGH != null) {
                c1735430vGH.LJFF();
            }
        }
        if (z && (!autoScrollComponent.No() || autoScrollComponent.up() || z3)) {
            if (C299060Bns.LIZ()) {
                C19EG c19egLIZ = C724240Sb0.LIZ(autoScrollComponent);
                if (c19egLIZ != null) {
                    C1389880mGw c1389880mGw = new C1389880mGw(c19egLIZ);
                    c1389880mGw.LJIIIZ(c19egLIZ.getResources().getString(2131826958));
                    c1389880mGw.LJIIJ();
                }
            } else {
                autoScrollComponent.Fp(2131826958);
            }
        }
        Aweme awemeBp = autoScrollComponent.bp();
        IPausePanelAbility iPausePanelAbility2 = (IPausePanelAbility) autoScrollComponent.LLJLLIL.getValue();
        if (iPausePanelAbility2 != null) {
            iPausePanelAbility2.A42();
        }
        if (autoScrollComponent.ap(awemeBp) && ((iPausePanelAbility = (IPausePanelAbility) autoScrollComponent.LLJLLIL.getValue()) == null || !iPausePanelAbility.VA0())) {
            autoScrollComponent.Vo();
        }
        if (z) {
            C1600950rlN c1600950rlNEp2 = autoScrollComponent.ep();
            if (c1600950rlNEp2 != null) {
                c1600950rlNEp2.LIZLLL = 0L;
            }
            C1600950rlN c1600950rlNEp3 = autoScrollComponent.ep();
            if (c1600950rlNEp3 != null && c1600950rlNEp3.LIZJ != 0) {
                c1600950rlNEp3.LIZIZ = System.currentTimeMillis();
                c1600950rlNEp3.LIZ = 0L;
                c1600950rlNEp3.LIZJ = 0;
            }
        }
        autoScrollComponent.LLJJJ = enumC584570MwJ2;
        autoScrollComponent.Oo(true);
        if (C1386360mBG.LJIIJ(C0SUC.LIZ(autoScrollComponent.getContext()).getEventType())) {
            C1ER1.LIZIZ.LJJIJIIJI(enumC584570MwJ2);
        }
        PopupManager.LJIILJJIL();
        autoScrollComponent.hp(true);
        if (!C1386360mBG.LJIIJJI(autoScrollComponent.bp()) && autoScrollComponent.LLJJIJIL == 2 && (c1600950rlNEp = autoScrollComponent.ep()) != null) {
            c1600950rlNEp.LIZ();
        }
        autoScrollComponent.Gp(false, z2);
        autoScrollComponent.Zo();
        C1386360mBG.LIZLLL().LJIIJJI(new C020T(z, 4));
    }
}
