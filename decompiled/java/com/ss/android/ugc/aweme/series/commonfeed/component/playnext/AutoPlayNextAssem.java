package com.ss.android.ugc.aweme.series.commonfeed.component.playnext;

import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0RGG;
import X.C0SHP;
import X.C0SHR;
import X.C0SHS;
import X.C0SHT;
import X.C0SHW;
import X.C0SR4;
import X.C0SZ8;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C360660ECa;
import X.C418440Gaw;
import X.C452501pT;
import X.C586380MzE;
import X.C687700QyG;
import X.C700100RdA;
import X.C718160SFa;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C740740T3w;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC584570MwJ;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC739770T0d;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.commonfeed.component.playnext.AutoPlayNextAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes12.dex */
public class AutoPlayNextAssem extends BaseCellSlotComponent<AutoPlayNextAssem> implements IAutoPlayNextConflictAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS243S0000000_11.get$arr$(308));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(309));
    public final InterfaceC1731706qJ LLJZ;
    public View LLJZIJLIL;
    public TuxTextView LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public final C0SHR LLLIIL;
    public volatile HomePageViewPagerAbility LLLIILIL;
    public volatile HomeViewPagerAbility LLLIL;
    public InterfaceC665370Q7z LLLILZ;
    public C0QSJ LLLILZJ;

    public interface AppDiffProtocol {
        public static final C0SHP LIZ = C0SHP.LIZ;

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.aweme.series.commonfeed.component.playnext.AutoPlayNextAssem.AppDiffProtocol
            public final void LIZ() {
            }

            @Override // com.ss.android.ugc.aweme.series.commonfeed.component.playnext.AutoPlayNextAssem.AppDiffProtocol
            public final void LIZIZ() {
            }

            @Override // com.ss.android.ugc.aweme.series.commonfeed.component.playnext.AutoPlayNextAssem.AppDiffProtocol
            public final void enable() {
            }
        }

        void LIZ();

        void LIZIZ();

        void enable();
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AutoPlayNextAssem.class, "autoPlayNextVM", "getAutoPlayNextVM()Lcom/ss/android/ugc/aweme/series/commonfeed/component/playnext/AutoPlayNextVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AutoPlayNextAssem.class, "homePageViewPagerAbilityByDI", "getHomePageViewPagerAbilityByDI()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AutoPlayNextAssem.class, "homeViewPagerAbilityByDI", "getHomeViewPagerAbilityByDI()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        c09r3.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.0SHR] */
    public AutoPlayNextAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AutoPlayNextVM.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 539), null, AFwS243S0000000_11.get$arr$(307));
        this.LLLF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 538));
        this.LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 534));
        this.LLLFFI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 533));
        this.LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 535));
        this.LLLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(134));
        this.LLLII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 536));
        this.LLLIIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 537));
        this.LLLIIL = new C360660ECa() { // from class: X.0SHR
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                AutoPlayNextAssem autoPlayNextAssem = this.LL;
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                autoPlayNextAssem.LLLIIIL = z;
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bgl;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1506429533) {
            return null;
        }
        return this;
    }

    private C0QSJ Bp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLILZJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLILZ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLILZ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLLILZJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final AutoPlayNextVM Ep() {
        return (AutoPlayNextVM) this.LLJZ.getValue(this, LLLILZLLLI[0]);
    }

    public final HomePageViewPagerAbility Fp() {
        HomePageViewPagerAbility homePageViewPagerAbility = this.LLLIILIL;
        if (homePageViewPagerAbility == null) {
            synchronized (this) {
                homePageViewPagerAbility = this.LLLIILIL;
                if (homePageViewPagerAbility == null) {
                    C0QSJ c0qsjBp = Bp();
                    HomePageViewPagerAbility homePageViewPagerAbility2 = c0qsjBp != null ? (HomePageViewPagerAbility) c0qsjBp.getAbility(HomePageViewPagerAbility.class) : null;
                    this.LLLIILIL = homePageViewPagerAbility2;
                    return homePageViewPagerAbility2;
                }
            }
        }
        return homePageViewPagerAbility;
    }

    public final HomeViewPagerAbility Gp() {
        HomeViewPagerAbility homeViewPagerAbility = this.LLLIL;
        if (homeViewPagerAbility == null) {
            synchronized (this) {
                homeViewPagerAbility = this.LLLIL;
                if (homeViewPagerAbility == null) {
                    C0QSJ c0qsjBp = Bp();
                    HomeViewPagerAbility homeViewPagerAbility2 = c0qsjBp != null ? (HomeViewPagerAbility) c0qsjBp.getAbility(HomeViewPagerAbility.class) : null;
                    this.LLLIL = homeViewPagerAbility2;
                    return homeViewPagerAbility2;
                }
            }
        }
        return homeViewPagerAbility;
    }

    public final View Ip() {
        AppDiffProtocol.LIZ.getClass();
        C0SHP.LIZIZ.getValue().LIZ();
        return LJJIJL();
    }

    public final IFeedPanelPlatformAbility Jp() {
        return (IFeedPanelPlatformAbility) this.LLLF.getValue();
    }

    public final void Xp() {
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LLLII.getValue();
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.yT(this.LLLIIL);
        }
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLLIIII.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.b3(this.LLLIIL);
        }
        this.LLLIIIIL = false;
        this.LLLIIIL = false;
        AppDiffProtocol.LIZ.getClass();
        C0SHP.LIZIZ.getValue().LIZ();
    }

    public final boolean Qp() {
        C0SR4 c0sr4Zv0;
        Aweme awemeLLLJ;
        C19EG c19egLIZ;
        MutableLiveData mutableLiveDataGn0;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJp;
        if (!Tp()) {
            return true;
        }
        AppDiffProtocol.LIZ.getClass();
        C0SHP.LIZIZ.getValue().enable();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJp2 = Jp();
        if (iFeedPanelPlatformAbilityJp2 != null && (c0sr4Zv0 = iFeedPanelPlatformAbilityJp2.Zv0()) != null) {
            C0SHS c0shs = Ep().LL;
            if (c0shs == null || (awemeLLLJ = c0shs.LLLJ()) == null) {
                return true;
            }
            int iLJJLIIIJ = c0sr4Zv0.LJJLIIIJ(awemeLLLJ);
            C724270Sb3 c724270Sb3 = this.LLJI;
            int iLJJLIIIJ2 = c0sr4Zv0.LJJLIIIJ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
            if (iLJJLIIIJ >= 0 || iLJJLIIIJ2 < 0 || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
                return true;
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJp3 = Jp();
            IViewPagerComponentAbility iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityJp3 != null ? iFeedPanelPlatformAbilityJp3.Mb() : null;
            boolean z = PopupManager.LJI() || !(Jp() == null || (iFeedPanelPlatformAbilityJp = Jp()) == null || iFeedPanelPlatformAbilityJp.l41());
            C0SHT.LJJLIIIJL.getClass();
            C0SHT c0shtLIZ = C0SHW.LIZ(c19egLIZ);
            boolean zLJFF = (c0shtLIZ == null || (mutableLiveDataGn0 = c0shtLIZ.gn0()) == null) ? false : Intrinsics.LJFF(mutableLiveDataGn0.getValue(), Boolean.TRUE);
            boolean z2 = iViewPagerComponentAbilityMb != null && iViewPagerComponentAbilityMb.ic();
            EdgeSpeedupAbility edgeSpeedupAbility = (EdgeSpeedupAbility) this.LLLFZ.getValue();
            boolean z3 = edgeSpeedupAbility != null && edgeSpeedupAbility.aW1();
            boolean zLJII = ((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LJII();
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            boolean zLIZLLL = C586380MzE.LIZ().LIZLLL();
            IAutoAScrollAbility iAutoAScrollAbility = (IAutoAScrollAbility) this.LLLFFI.getValue();
            boolean z4 = (iAutoAScrollAbility != null ? iAutoAScrollAbility.xo1() : null) == EnumC584570MwJ.AUTO_SCROLL_STATE_START;
            FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) this.LLLI.getValue();
            boolean zLIZ = fypAutoScrollService != null ? fypAutoScrollService.LIZ() : false;
            FypAutoScrollService fypAutoScrollService2 = (FypAutoScrollService) this.LLLI.getValue();
            boolean zLIZIZ = fypAutoScrollService2 != null ? fypAutoScrollService2.LIZIZ() : false;
            FypAutoScrollService fypAutoScrollService3 = (FypAutoScrollService) this.LLLI.getValue();
            boolean zLIZJ = fypAutoScrollService3 != null ? fypAutoScrollService3.LIZJ() : false;
            FypAutoScrollService fypAutoScrollService4 = (FypAutoScrollService) this.LLLI.getValue();
            boolean zLJIIIIZZ = fypAutoScrollService4 != null ? fypAutoScrollService4.LJIIIIZZ() : false;
            if (!z && !z2 && !z3 && !zLJII && !this.LLLIIIL && !zLJFF && !zLIZLLL && !z4 && !zLIZ && !zLIZIZ && !zLIZJ && !zLJIIIIZZ && !this.LLLIIIIL) {
                return false;
            }
        }
        return true;
    }

    public final boolean Tp() {
        View viewLJJIJL = LJJIJL();
        Set<String> set = C700100RdA.LIZ;
        return !Intrinsics.LJFF("is_avoided", viewLJJIJL.getTag(C700100RdA.LJI));
    }

    public final void Vp() {
        Float fYQ2;
        String string;
        if (Tp() && (fYQ2 = Ep().yQ2()) != null) {
            float fFloatValue = fYQ2.floatValue();
            if (fFloatValue > 5000.0f) {
                View viewIp = Ip();
                if (viewIp != null) {
                    C786410Ut5.LJLLLLLL(8, viewIp);
                    return;
                }
                return;
            }
            C0SHS c0shs = Ep().LL;
            if (c0shs == null || c0shs.LLLJ() == null) {
                return;
            }
            AppDiffProtocol.LIZ.getClass();
            C0SHP.LIZIZ.getValue().LIZ();
            View viewIp2 = Ip();
            if (viewIp2 != null) {
                C786410Ut5.LJLLLLLL(0, viewIp2);
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ == null || (string = c19egLIZ.getString(2131847423)) == null) {
                return;
            }
            int iMax = Math.max(1, Math.min(((int) (fFloatValue / LSPassThroughRecordSizeConfig.DEFAULT)) + 1, 5));
            TuxTextView tuxTextView = this.LLL;
            if (tuxTextView != null) {
                tuxTextView.setText(u.LJJIFFI(string, "{countdown}", String.valueOf(iMax), false));
            }
        }
    }

    public final void Wp() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJp;
        C0SR4 c0sr4Zv0;
        C0SHS c0shs;
        Aweme awemeLLLJ;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C0SZ8 c0sz8LJLIL;
        InterfaceC739770T0d interfaceC739770T0dP2;
        try {
            if (Qp() || (iFeedPanelPlatformAbilityJp = Jp()) == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityJp.Zv0()) == null || (c0shs = Ep().LL) == null || (awemeLLLJ = c0shs.LLLJ()) == null) {
                return;
            }
            C724270Sb3 c724270Sb3 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJp2 = Jp();
            if (iFeedPanelPlatformAbilityJp2 != null && (interfaceC739770T0dP2 = iFeedPanelPlatformAbilityJp2.P2()) != null) {
                interfaceC739770T0dP2.LJFF(System.currentTimeMillis(), aweme.getAid(), false);
            }
            int iLJJLIIIJ = c0sr4Zv0.LJJLIIIJ(aweme);
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJp3 = Jp();
            if (iFeedPanelPlatformAbilityJp3 != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbilityJp3.Mb()) != null && (c0sz8LJLIL = iViewPagerComponentAbilityMb.LJLIL()) != null) {
                c0sz8LJLIL.h(true);
            }
            AppDiffProtocol.LIZ.getClass();
            C0SHP.LIZIZ.getValue().LIZIZ();
            c0sr4Zv0.LJJLJ(iLJJLIIIJ, awemeLLLJ);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                C740740T3w.LJII(c19egLIZ, awemeLLLJ);
            }
            HashMap<String, String> mobParams = awemeLLLJ.getMobParams();
            Ep().AQ2(awemeLLLJ, Intrinsics.LJFF(mobParams != null ? mobParams.get("preload_stage") : null, "preload_stage_success") ? "preload_has_cache" : "preload_no_cache", null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        Xp();
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Up, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        Xp();
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LLLII.getValue();
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.Jk1(this.LLLIIL);
        }
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLLIIII.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.LLJJI(this.LLLIIL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        GradientDrawable gradientDrawable;
        super.onViewCreated(view);
        this.LLJZIJLIL = view;
        this.LLL = (TuxTextView) view.findViewById(R.id.be7);
        Drawable background = view.getBackground();
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nz6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(270), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nkt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(271), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0S9C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJL;
            }
        }, C736820SvI.LJ(), AFwS294S0000000_11.get$arr$(272), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0RSq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, C736820SvI.LJ(), AFwS294S0000000_11.get$arr$(273), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0RSr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, C736820SvI.LJ(), AFwS294S0000000_11.get$arr$(268), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0SHQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJJJ;
            }
        }, C736820SvI.LJ(), AFwS294S0000000_11.get$arr$(269), 4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        int i = AutoPlayNextTriggerAssem.LLJLIL;
        return C718160SFa.LIZ(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.aweme.series.commonfeed.component.playnext.IAutoPlayNextConflictAbility
    public final void xI0(boolean z) {
        this.LLLIIIIL = z;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        C0SHS c0shs = Ep().LL;
        if (c0shs != null) {
            c0shs.LIZ();
        }
    }
}
