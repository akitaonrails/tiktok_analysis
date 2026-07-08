package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide;

import X.AbstractC2361009My;
import X.AnonymousClass0956;
import X.C01GW;
import X.C098200Yq;
import X.C09A1;
import X.C0C18;
import X.C0DMM;
import X.C0H1U;
import X.C0H9H;
import X.C0PEM;
import X.C0S4U;
import X.C123100dR;
import X.C13LE;
import X.C1421105hJ;
import X.C1440005kM;
import X.C14EU;
import X.C1507790pL7;
import X.C1576740r8K;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1740600vOc;
import X.C1741470vQ1;
import X.C1741550vQ9;
import X.C1741890vQh;
import X.C1768390w7R;
import X.C1769330w8x;
import X.C1769480w9C;
import X.C1769570w9L;
import X.C1769630w9R;
import X.C1770090wAB;
import X.C1770110wAD;
import X.C1770150wAH;
import X.C1770210wAN;
import X.C1776090wJr;
import X.C189200o6;
import X.C19719912Dl;
import X.C1976807ok;
import X.C19EG;
import X.C1A5L;
import X.C1AF0;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2252611DEt;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2296908zH;
import X.C23118094a;
import X.C23119094b;
import X.C2487409ou;
import X.C300590BqL;
import X.C324990Cob;
import X.C446900Hfk;
import X.C452501pT;
import X.C610070NwL;
import X.C690440R6k;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C722910SXh;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736490Sul;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C7879035x;
import X.C866950Xzh;
import X.EnumC046800Ew;
import X.EnumC113600bu;
import X.EnumC1770130wAF;
import X.InterfaceC1583770rJf;
import X.InterfaceC1731706qJ;
import X.InterfaceC1770300wAW;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.ACListenerS58S0101000_26;
import Y.ARunnableS31S0201000_26;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.hox.Hox;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.VideoAnchorProduct;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes27.dex */
public final class EcVideoGuideAssem extends BaseCellSlotComponent<EcVideoGuideAssem> implements ComponentPriorityProtocol, InterfaceC1583770rJf, InterfaceC497601wk, InterfaceC1770300wAW {
    public static final C610070NwL LLLLLJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLJLJLL;
    public static final HashSet<String> LLLLLL;
    public LinearLayout LLJLLIL;
    public SmartImageView LLJLLL;
    public SmartImageView LLJZ;
    public SmartImageView LLJZIJLIL;
    public LinearLayout LLL;
    public TuxTextView LLLF;
    public TuxTextView LLLFF;
    public ConstraintLayout LLLFFI;
    public FrameLayout LLLFZ;
    public TuxTextView LLLI;
    public final C01GW LLLII = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS268S0000000_26.get$arr$(265));
    public final C01GW LLLIIII = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS268S0000000_26.get$arr$(266));
    public final C01GW LLLIIIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoFavoriteVM.class), AFwS268S0000000_26.get$arr$(267));
    public final C01GW LLLIIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoDiggVM.class), AFwS268S0000000_26.get$arr$(268));
    public final C01GW LLLIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS268S0000000_26.get$arr$(269));
    public final InterfaceC1731706qJ LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public int LLLIZZ;
    public CoroutineContext LLLJ;
    public AnonymousClass0956 LLLJIL;
    public C2252611DEt LLLJL;
    public C2252611DEt LLLL;
    public boolean LLLLII;
    public int LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public final Map<String, Object> LLLLIILLL;
    public C1770110wAD LLLLIL;
    public final boolean LLLLILI;
    public boolean LLLLJ;
    public final C1770210wAN LLLLJI;
    public final C01GW LLLLL;
    public final C01GW LLLLLIL;
    public final C01GW LLLLLILLIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0NwL] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EcVideoGuideAssem.class, "videoGuideVM", "getVideoGuideVM()Lcom/ss/android/ugc/aweme/ecommerce/mall/feedreach/ecvideoguide/EcVideoGuideVM;", 0);
        C13LE.LIZ.getClass();
        LLLLLJLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLLJIL = new Object() { // from class: X.0NwL
        };
        LLLLLL = new HashSet<>();
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.0wAN] */
    public EcVideoGuideAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcVideoGuideVM.class);
        this.LLLIILIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS570S0100000_26(c19719912DlLIZ, 628), null, AFwS268S0000000_26.get$arr$(264));
        this.LLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 626));
        this.LLLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 627));
        this.LLLLIILLL = new LinkedHashMap();
        this.LLLLILI = !C0C18.LIZ();
        this.LLLLJI = new AbstractC2361009My() { // from class: X.0wAN
            @Override // X.AbstractC2361009My
            public final boolean onShot(String str) {
                this.LL.Up(8, false);
                return super.onShot(str);
            }
        };
        this.LLLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 625));
        this.LLLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 624));
        this.LLLLLILLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 623));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "full_container_shop_video_guide";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ayp;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public final SmartImageView Ep() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.gh8) : null;
            this.LLJLLL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final SmartImageView Fp() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.gh9) : null;
            this.LLJZ = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final SmartImageView Gp() {
        View viewFindViewById = this.LLJZIJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.gh_) : null;
            this.LLJZIJLIL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final FrameLayout Ip() {
        View viewFindViewById = this.LLLFZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ghb) : null;
            this.LLLFZ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final TuxTextView Jp() {
        View viewFindViewById = this.LLLI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ghc) : null;
            this.LLLI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ConstraintLayout Qp() {
        View viewFindViewById = this.LLLFFI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ghd) : null;
            this.LLLFFI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final EcVideoGuideVM Tp() {
        return (EcVideoGuideVM) this.LLLIILIL.getValue(this, LLLLLJLJLL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        if (this.LLLILZJ) {
            dq(true);
        }
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContext = this.LLLJ;
        if (coroutineContext != null && C23118094a.LJIIIIZZ(coroutineContext)) {
            return coroutineContext;
        }
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        CoroutineContext coroutineContextLIZLLL = C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII());
        this.LLLJ = coroutineContextLIZLLL;
        return coroutineContextLIZLLL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        if (this.LLLILZJ) {
            dq(false);
        }
        if (!this.LLLILZJ || ActivityStack.isAppBackGround()) {
            return;
        }
        Bp(EnumC1770130wAF.TO_SUBPAGE, this.LLLIZZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        CoroutineContext coroutineContext = this.LLLJ;
        if (coroutineContext != null) {
            C23118094a.LIZJ(coroutineContext, null);
        }
        Tp().LL = "";
        jq(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        HomeTabAbility homeTabAbilityLIZ;
        HomeTabAbility homeTabAbilityLIZ2;
        jq(this);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        Unit unit = null;
        if (C7879035x.LIZLLL()) {
            if (c19egLIZ != null) {
                C446900Hfk c446900Hfk = Hox.LLJILJIL;
                c446900Hfk.LIZ(c19egLIZ).PQ2("page_profile", (C1770150wAH) this.LLLLL.getValue());
                c446900Hfk.LIZ(c19egLIZ).OQ2(this);
                MainActivityScope mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZ);
                if (mainActivityScopeLIZJ != null && (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                    homeTabAbilityLIZ2.Ik0((C1776090wJr) this.LLLLLIL.getValue());
                    homeTabAbilityLIZ2.tx0((C1776090wJr) this.LLLLLILLIL.getValue());
                    unit = Unit.LIZ;
                }
            }
            C189200o6.m2constructorimpl(unit);
            return;
        }
        if (c19egLIZ != null) {
            try {
                C446900Hfk c446900Hfk2 = Hox.LLJILJIL;
                c446900Hfk2.LIZ(c19egLIZ).PQ2("page_profile", (C1770150wAH) this.LLLLL.getValue());
                c446900Hfk2.LIZ(c19egLIZ).OQ2(this);
                MainActivityScope mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19egLIZ);
                if (mainActivityScopeLIZJ2 != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ2)) != null) {
                    homeTabAbilityLIZ.Ik0((C1776090wJr) this.LLLLLIL.getValue());
                    homeTabAbilityLIZ.tx0((C1776090wJr) this.LLLLLILLIL.getValue());
                    unit = Unit.LIZ;
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(unit);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return getContentView();
    }

    public static void jq(EcVideoGuideAssem ecVideoGuideAssem) {
        Unit unit = null;
        if (C7879035x.LIZLLL()) {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            if (eventBusLIZLLL.LJIIJ(ecVideoGuideAssem)) {
                eventBusLIZLLL.LJJI(ecVideoGuideAssem);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return;
        }
        try {
            EventBus eventBusLIZLLL2 = EventBus.LIZLLL();
            if (eventBusLIZLLL2.LJIIJ(ecVideoGuideAssem)) {
                eventBusLIZLLL2.LJJI(ecVideoGuideAssem);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void Wp(int i) {
        this.LLLLIILLL.put("reason", Integer.valueOf(i));
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map<String, Object> map = this.LLLLIILLL;
        c1507790pL7.getClass();
        C1507790pL7.LIZ("tiktokec_mall_feed_guide_entrance_not_show", map);
    }

    public final void dq(boolean z) {
        this.LLLILZLLLI = z;
        if (z) {
            C324990Cob.LIZIZ(this.LLLL);
        }
    }

    @Override // X.InterfaceC1770300wAW
    public final void h8(boolean z) {
        this.LLLLJ = z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:395|(8:(1:(1:(1:(1:(1:(22:14|393|16|381|327|335|(1:337)|338|339|(1:341)|342|(1:344)|345|(1:347)|348|(1:350)|351|(1:353)(1:363)|354|(3:356|(1:358)(1:362)|359)|360|361)(2:17|18))(19:321|322|335|(0)|338|339|(0)|342|(0)|345|(0)|348|(0)|351|(0)(0)|354|(0)|360|361))(3:99|100|(4:102|(1:104)(1:107)|105|106)(22:108|(3:110|(5:113|(1:120)(1:117)|(3:399|119|402)(1:401)|400|111)|398)|121|(1:123)(1:166)|124|(1:126)|127|(2:129|(38:SW:131|133|(1:135)(1:154)|136|(1:138)(1:153)|139|(1:141)(1:152)|142|(1:144)(1:151)|145|(4:147|(2:150|148)|403|168)(1:167)|169|(3:171|(1:173)(1:183)|174)|175|(3:177|(4:180|(3:405|182|408)(1:407)|406|178)|404)(1:184)|(1:186)(1:247)|(1:246)(1:190)|191|(1:245)(15:195|(3:197|(1:199)(1:244)|200)|201|(1:203)|204|(1:206)(1:243)|(1:208)(1:242)|209|(1:213)|214|(1:216)(1:241)|(1:218)(1:240)|219|(1:223)|224)|(1:226)(1:239)|227|(1:229)(1:238)|230|(1:248)(3:234|(2:237|235)|409)|249|(1:257)(3:253|(2:256|254)|410)|258|(1:266)(3:262|(2:265|263)|411)|267|(1:269)(1:315)|270|(1:278)|279|(1:314)(1:283)|(1:285)|286|(1:288)(1:313)|(8:312|298|(1:300)|301|(1:303)|304|(1:308)|(1:310)(2:316|(6:318|(1:320)|322|335|(0)|338)(9:323|387|324|(1:326)|381|327|335|(0)|338)))(10:290|(1:292)(1:311)|293|(0)(1:297)|298|(0)|301|(0)|304|(3:306|308|(0)(0))(0)))(0))(17:(2:162|(1:164)(0))(1:165)|133|(0)(0)|136|(0)(0)|139|(0)(0)|142|(0)(0)|145|(0)(0)|169|(0)|175|(0)(0)|(0)(0)|(4:188|246|191|(7:193|245|(0)(0)|227|(0)(0)|230|(4:232|248|249|(4:251|257|258|(8:260|266|267|(0)(0)|270|(4:272|274|276|278)|279|(6:281|314|(0)|286|(0)(0)|(0)(0))(0))(0))(0))(0))(0))(0))|339|(0)|342|(0)|345|(0)|348|(0)|351|(0)(0)|354|(0)|360|361)))(5:19|385|20|51|(2:53|54)(18:55|383|56|(9:58|(2:60|62)(1:61)|389|(2:64|66)(1:65)|67|(1:69)|70|75|(2:367|368)(7:79|(1:81)(1:89)|(4:83|(4:86|(3:413|88|416)(1:415)|414|84)|412|91)(1:90)|92|(3:94|(1:96)|(1:98))|100|(0)(0)))(0)|339|(0)|342|(0)|345|(0)|348|(0)|351|(0)(0)|354|(0)|360|361)))(1:35))(7:21|(1:23)(1:33)|24|(1:26)(1:32)|27|(1:29)|(1:31)(1:34))|396|47|379|48|(1:50)|51|(0)(0))|36|(4:38|(1:40)(1:45)|41|(1:43))|44|391|46) */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x08bc, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x08bd, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2  */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r34v0, types: [androidx.lifecycle.LifecycleOwner, com.bytedance.assem.arch.reused.ReusedAssem, com.bytedance.assem.arch.reused.ReusedUIAssem, com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v20, types: [X.05Vn, X.099V] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iq(X.InterfaceC1364105Vn<? super kotlin.Unit> r35) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 2274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem.iq(X.05Vn):java.lang.Object");
    }

    @C14EU(sticky = false, threadMode = ThreadMode.MAIN)
    public final void onAnchorPanelAction(C1769480w9C c1769480w9C) {
        Object obj;
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (iECommerceAnchorService.LJJJJZ(((VideoItemParams) obj).getAweme()) && C300590BqL.LIZ() && !Intrinsics.LJFF(c1769480w9C.LIZ.LIZJ, Boolean.TRUE) && this.LLLLILI) {
            String str = c1769480w9C.LIZ.LIZ;
            if (this.LLLILZLLLI && C123100dR.LIZ(str) && Intrinsics.LJFF(str, Tp().LL)) {
                int i = C1769330w8x.LIZ[c1769480w9C.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        Tp().xQ2(c1769480w9C.LIZ);
                        return;
                    }
                    return;
                }
                Tp().yQ2(c1769480w9C.LIZ);
            }
        }
    }

    @C14EU(sticky = false, threadMode = ThreadMode.MAIN)
    public final void onEcOrderSubmitEvent(C1769630w9R c1769630w9R) {
        Object obj;
        C1770090wAB c1770090wAB;
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (iECommerceAnchorService.LJJJJZ(((VideoItemParams) obj).getAweme()) && C300590BqL.LIZ()) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            if (!((VideoItemParams) obj2).getAweme().isAd() && this.LLLLILI && (c1770090wAB = Tp().LLJ) != null && c1770090wAB.LJ) {
                C1770090wAB c1770090wAB2 = Tp().LLJ;
                if (c1770090wAB2 != null) {
                    c1770090wAB2.LJFF = true;
                }
                ((IVideoGuideService) ServiceManager.get().getService(IVideoGuideService.class)).LIZ(false);
            }
        }
    }

    @C14EU
    public final void onPlayerControllerVideoStatusEvent(C722910SXh c722910SXh) {
        if (c722910SXh.LIZJ == 1) {
            Up(7, false);
        }
    }

    @C14EU
    public final void onScrolledToProfile(C736490Sul c736490Sul) {
        Up(4, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x015c  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (this.LLLLJ) {
            return false;
        }
        return super.ur(videoItemParams);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Tp().LL = videoItemParams.getAweme().getAid();
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLLIL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // X.InterfaceC1583770rJf
    public final void A4(String str, String str2) {
        if (this.LLLILZJ) {
            dq(Intrinsics.LJFF(str2, "For You"));
        }
    }

    public final void Bp(EnumC1770130wAF enumC1770130wAF, int i) {
        ConstraintLayout constraintLayoutQp = Qp();
        if (constraintLayoutQp != null && constraintLayoutQp.getVisibility() == 0) {
            C2487409ou.LIZJ(new ARunnableS31S0201000_26(i, this, enumC1770130wAF, 5));
        }
    }

    public final void Up(int i, boolean z) {
        C2252611DEt c2252611DEt = this.LLLJL;
        if (c2252611DEt != null && z && c2252611DEt.isActive()) {
            Object obj = null;
            if (1 != 0) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                if (((VideoItemParams) obj).getAweme().getProductRecallType() != 4) {
                    Pair pair = new Pair(2, Integer.valueOf(i));
                    C189200o6.m2constructorimpl(pair);
                    c2252611DEt.resumeWith(pair);
                } else {
                    if (this.LLLLIILL) {
                        return;
                    }
                    this.LLLLIILL = true;
                    Wp(3);
                }
            }
        }
    }

    public static void Vp(int i, Boolean bool, Boolean bool2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mall_request_scene", 2);
        linkedHashMap.put("type", Integer.valueOf(i));
        if (bool != null) {
            linkedHashMap.put("is_cancelled", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (bool2 != null) {
            linkedHashMap.put("has_data", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        C1421105hJ.LIZJ("rd_tiktokec_mall_feed_reach_get", linkedHashMap);
    }

    public final void aq(C1741550vQ9 c1741550vQ9, String str, C1740600vOc c1740600vOc) {
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial;
        IEcUgBtmService iEcUgBtmService;
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial2;
        IEcUgBtmService iEcUgBtmService2;
        if (C7879035x.LIZLLL()) {
            if (getContext() == null) {
                return;
            }
            if (C123100dR.LIZ(c1741550vQ9.LIZ)) {
                Uri.Builder builderLIZ = C1976807ok.LIZ(UriProtector.parse(c1741550vQ9.LIZ), new Pair("previous_page", c1741550vQ9.LIZIZ), new Pair("mall_extra_info", c1741550vQ9.LIZJ), new Pair("suggest_guide_request_params", c1741550vQ9.LJ), new Pair("diversion_config", c1741550vQ9.LJFF), new Pair("enter_method", str));
                if (this.LLLIZZ == 1 && C300590BqL.LIZIZ() && C123100dR.LIZ(c1741550vQ9.LJIIIIZZ)) {
                    C1976807ok.LIZJ(builderLIZ, new Pair("attach_products", C1741890vQh.LJIIIIZZ(C1697810uHb.LJIILJJIL(C2097608Jq.LJIIJ(new Pair("product_id", c1741550vQ9.LJIIIIZZ), new Pair("position", 1))))));
                }
                if (this.LLLIZZ != 1 || !C300590BqL.LIZIZ()) {
                    C1976807ok.LIZJ(builderLIZ, new Pair("diversion_params", c1741550vQ9.LIZLLL));
                }
                if (c1740600vOc != null && (iEcUgBtmService2 = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null)) != null) {
                    iEcUgBtmService2.LIZ(c1740600vOc, builderLIZ);
                }
                String string = builderLIZ.toString();
                IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial3 = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
                if (iEcUgBackButtonServiceOfficial3 != null) {
                    iEcUgBackButtonServiceOfficial3.releaseBackButton();
                }
                if (c1741550vQ9.LJI && (iEcUgBackButtonServiceOfficial2 = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null)) != null) {
                    iEcUgBackButtonServiceOfficial2.prepareBackButton(null, c1741550vQ9.LJII, "video");
                }
                IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
                if (iMallLandingPerfTracker != null) {
                    iMallLandingPerfTracker.onStartJumpToMall(string, null, true);
                }
                SmartRouter.buildRoute(getContext(), string).open();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            if (getContext() == null) {
                return;
            }
            if (C123100dR.LIZ(c1741550vQ9.LIZ)) {
                Uri.Builder builderLIZ2 = C1976807ok.LIZ(UriProtector.parse(c1741550vQ9.LIZ), new Pair("previous_page", c1741550vQ9.LIZIZ), new Pair("mall_extra_info", c1741550vQ9.LIZJ), new Pair("suggest_guide_request_params", c1741550vQ9.LJ), new Pair("diversion_config", c1741550vQ9.LJFF), new Pair("enter_method", str));
                if (this.LLLIZZ == 1 && C300590BqL.LIZIZ() && C123100dR.LIZ(c1741550vQ9.LJIIIIZZ)) {
                    C1976807ok.LIZJ(builderLIZ2, new Pair("attach_products", C1741890vQh.LJIIIIZZ(C1697810uHb.LJIILJJIL(C2097608Jq.LJIIJ(new Pair("product_id", c1741550vQ9.LJIIIIZZ), new Pair("position", 1))))));
                }
                if (this.LLLIZZ != 1 || !C300590BqL.LIZIZ()) {
                    C1976807ok.LIZJ(builderLIZ2, new Pair("diversion_params", c1741550vQ9.LIZLLL));
                }
                if (c1740600vOc != null && (iEcUgBtmService = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null)) != null) {
                    iEcUgBtmService.LIZ(c1740600vOc, builderLIZ2);
                }
                String string2 = builderLIZ2.toString();
                IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial4 = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
                if (iEcUgBackButtonServiceOfficial4 != null) {
                    iEcUgBackButtonServiceOfficial4.releaseBackButton();
                }
                if (c1741550vQ9.LJI && (iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null)) != null) {
                    iEcUgBackButtonServiceOfficial.prepareBackButton(null, c1741550vQ9.LJII, "video");
                }
                IMallLandingPerfTracker iMallLandingPerfTracker2 = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
                if (iMallLandingPerfTracker2 != null) {
                    iMallLandingPerfTracker2.onStartJumpToMall(string2, null, true);
                }
                SmartRouter.buildRoute(getContext(), string2).open();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void fq(final C1770110wAD c1770110wAD, final int i, final String str) {
        Pair pair;
        Map mapLJ;
        Map<String, Object> mapLJ2;
        ScreenAdaptionResult screenAdaptionResultM82;
        Pair pair2;
        boolean z;
        Map mapLJ3;
        boolean z2;
        Map<String, Object> mapLJ4;
        ScreenAdaptionResult screenAdaptionResultM822;
        Drawable drawable = null;
        Resources resources = null;
        Drawable drawable2 = null;
        Resources resources2 = null;
        if (C7879035x.LIZLLL()) {
            IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLLILZ.getValue();
            if (iScreenComponentAbility != null && (screenAdaptionResultM822 = iScreenComponentAbility.M82()) != null && screenAdaptionResultM822.getBottomSpaceHeight() == 0) {
                View viewFindViewById = this.LLL;
                if (viewFindViewById == null) {
                    View viewLJJIJL = LJJIJL();
                    if (viewLJJIJL != null) {
                        viewFindViewById = viewLJJIJL.findViewById(R.id.ghf);
                    } else {
                        viewFindViewById = null;
                    }
                    this.LLL = (LinearLayout) viewFindViewById;
                }
                C0H1U.LJII(screenAdaptionResultM822.getScreenInsetByBottom(), viewFindViewById);
            }
            C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
            if (c1576740r8KLIZ != null) {
                c1576740r8KLIZ.LIZJ(true);
            }
            View viewFindViewById2 = this.LLLF;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.ghi);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLLF = (TuxTextView) viewFindViewById2;
            }
            TextView textView = (TextView) viewFindViewById2;
            if (textView != null) {
                textView.setText(c1770110wAD.LIZ);
            }
            View viewFindViewById3 = this.LLLFF;
            if (viewFindViewById3 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById3 = viewLJJIJL3.findViewById(R.id.ghg);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLLFF = (TuxTextView) viewFindViewById3;
            }
            TextView textView2 = (TextView) viewFindViewById3;
            if (textView2 != null) {
                textView2.setText(c1770110wAD.LIZJ);
            }
            ConstraintLayout constraintLayoutQp = Qp();
            if (constraintLayoutQp != null) {
                C786410Ut5.Y7(constraintLayoutQp, new ACListenerS58S0101000_26(i, this, 0));
            }
            C2271391DvN.LIZ(Qp(), (C1A5L) C2271381DvM.LLLFF.getValue());
            if (c1770110wAD.LJI != null) {
                Ip().getLayoutParams().width = C0H9H.LIZIZ(311);
                FrameLayout frameLayoutIp = Ip();
                if (frameLayoutIp != null) {
                    Context context = getContext();
                    if (context != null) {
                        resources = context.getResources();
                    }
                    frameLayoutIp.setBackground(new BitmapDrawable(resources, c1770110wAD.LJI));
                }
                TuxTextView tuxTextViewJp = Jp();
                if (tuxTextViewJp != null) {
                    C786410Ut5.LJLLLLLL(8, tuxTextViewJp);
                }
            } else {
                Ip().getLayoutParams().width = -1;
                FrameLayout frameLayoutIp2 = Ip();
                if (frameLayoutIp2 != null) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        drawable2 = context2.getDrawable(R.drawable.b91);
                    }
                    frameLayoutIp2.setBackground(drawable2);
                }
                TuxTextView tuxTextViewJp2 = Jp();
                if (tuxTextViewJp2 != null) {
                    tuxTextViewJp2.setText(c1770110wAD.LIZIZ);
                }
                TuxTextView tuxTextViewJp3 = Jp();
                if (tuxTextViewJp3 != null) {
                    C786410Ut5.LJLLLLLL(0, tuxTextViewJp3);
                }
            }
            C1768390w7R c1768390w7R = C1768390w7R.LIZ;
            List<VideoAnchorProduct> list = c1770110wAD.LJIIJ;
            c1768390w7R.getClass();
            BcmParams bcmParamsLIZ = C1768390w7R.LIZ(list);
            C1741470vQ1 c1741470vQ1 = C1741470vQ1.LIZ;
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            c1741470vQ1.getClass();
            final C1740600vOc c1740600vOcLIZ = C1741470vQ1.LIZ(fragmentLJI, i, bcmParamsLIZ);
            IEcUgBtmService iEcUgBtmService = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null);
            if (iEcUgBtmService != null && (mapLJ4 = iEcUgBtmService.LJ(c1740600vOcLIZ)) != null) {
                c1770110wAD.LIZLLL.putAll(mapLJ4);
            }
            List<VideoAnchorProduct> list2 = c1770110wAD.LJIIJ;
            if (C866950Xzh.LIZIZ(list2)) {
                c1770110wAD.LIZLLL.putAll(C1768390w7R.LIZJ(list2));
            }
            int i2 = this.LLLIZZ;
            if (i2 != 1) {
                if (i2 != 2) {
                    pair2 = new Pair(Boolean.FALSE, "");
                } else {
                    Integer num = c1770110wAD.LJII;
                    int value = EnumC046800Ew.SEARCH_WORD.getValue();
                    if (num != null && num.intValue() == value) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    pair2 = new Pair(Boolean.valueOf(z2), "feed_mall_search_button");
                }
            } else {
                Integer num2 = c1770110wAD.LJIIIIZZ;
                int value2 = EnumC046800Ew.SEARCH_WORD.getValue();
                if (num2 != null && num2.intValue() == value2) {
                    z = true;
                } else {
                    z = false;
                }
                pair2 = new Pair(Boolean.valueOf(z), "feed_with_cart_mall_search_button");
            }
            final boolean zBooleanValue = ((Boolean) pair2.getFirst()).booleanValue();
            Object second = pair2.getSecond();
            if (zBooleanValue) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(c1770110wAD.LJIIIZ);
                linkedHashMap.put("words_source", second);
                linkedHashMap.put("words_position", 0);
                linkedHashMap.put("search_position", "homepage_hot");
                linkedHashMap.put("search_entrance", "homepage_hot");
                mapLJ3 = linkedHashMap;
            } else {
                mapLJ3 = C2097608Jq.LJ();
            }
            FrameLayout frameLayoutIp3 = Ip();
            if (frameLayoutIp3 != null) {
                final Map map = mapLJ3;
                C786410Ut5.O7(frameLayoutIp3, new View.OnClickListener() { // from class: X.0vQ8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
                        if (iMallLandingPerfTracker != null) {
                            iMallLandingPerfTracker.onClickMallEntry("homepage_hot", null);
                        }
                        this.LL.Bp(EnumC1770130wAF.CLICK_BUTTON, i);
                        this.LL.aq(c1770110wAD.LJ, str, c1740600vOcLIZ);
                        EcVideoGuideVM ecVideoGuideVMTp = this.LL.Tp();
                        ReachCfg reachCfg = c1770110wAD.LJFF;
                        int i3 = i;
                        ecVideoGuideVMTp.getClass();
                        if (reachCfg != null) {
                            C948503nH.LJI(ecVideoGuideVMTp, C0PEM.LIZJ, new C610140NwS(reachCfg, ecVideoGuideVMTp, i3, 2, null));
                        }
                        Map<String, Object> map2 = c1770110wAD.LIZLLL;
                        map2.put("enter_method", str);
                        C1421105hJ.LIZJ("tiktokec_mall_entrance_click", map2);
                        if (zBooleanValue) {
                            C1421105hJ.LIZJ("trending_words_click", map);
                        }
                    }
                });
            }
            C2271391DvN.LIZ(Ip(), (C1A5L) C2271381DvM.LLLFZ.getValue());
            ConstraintLayout constraintLayoutQp2 = Qp();
            if (constraintLayoutQp2 != null) {
                C786410Ut5.LL(0, constraintLayoutQp2);
            }
            C1421105hJ.LIZJ("tiktokec_mall_entrance_show", c1770110wAD.LIZLLL);
            if (zBooleanValue) {
                C1421105hJ.LIZJ("trending_words_show", mapLJ3);
            }
            C1440005kM.LIZ(new C1769570w9L(EnumC113600bu.SHOW));
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            IScreenComponentAbility iScreenComponentAbility2 = (IScreenComponentAbility) this.LLLILZ.getValue();
            if (iScreenComponentAbility2 != null && (screenAdaptionResultM82 = iScreenComponentAbility2.M82()) != null && screenAdaptionResultM82.getBottomSpaceHeight() == 0) {
                View viewFindViewById4 = this.LLL;
                if (viewFindViewById4 == null) {
                    View viewLJJIJL4 = LJJIJL();
                    if (viewLJJIJL4 != null) {
                        viewFindViewById4 = viewLJJIJL4.findViewById(R.id.ghf);
                    } else {
                        viewFindViewById4 = null;
                    }
                    this.LLL = (LinearLayout) viewFindViewById4;
                }
                C0H1U.LJII(screenAdaptionResultM82.getScreenInsetByBottom(), (LinearLayout) viewFindViewById4);
            }
            C1576740r8K c1576740r8KLIZ2 = C690440R6k.LIZ();
            if (c1576740r8KLIZ2 != null) {
                c1576740r8KLIZ2.LIZJ(true);
            }
            View viewFindViewById5 = this.LLLF;
            if (viewFindViewById5 == null) {
                View viewLJJIJL5 = LJJIJL();
                if (viewLJJIJL5 != null) {
                    viewFindViewById5 = viewLJJIJL5.findViewById(R.id.ghi);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLLF = (TuxTextView) viewFindViewById5;
            }
            TuxTextView tuxTextView = (TuxTextView) viewFindViewById5;
            if (tuxTextView != null) {
                tuxTextView.setText(c1770110wAD.LIZ);
            }
            View viewFindViewById6 = this.LLLFF;
            if (viewFindViewById6 == null) {
                View viewLJJIJL6 = LJJIJL();
                if (viewLJJIJL6 != null) {
                    viewFindViewById6 = viewLJJIJL6.findViewById(R.id.ghg);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLLFF = (TuxTextView) viewFindViewById6;
            }
            TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById6;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(c1770110wAD.LIZJ);
            }
            ConstraintLayout constraintLayoutQp3 = Qp();
            if (constraintLayoutQp3 != null) {
                C786410Ut5.Y7(constraintLayoutQp3, new ACListenerS58S0101000_26(i, this, 0));
            }
            C2271391DvN.LIZ(Qp(), (C1A5L) C2271381DvM.LLLFF.getValue());
            if (c1770110wAD.LJI != null) {
                Ip().getLayoutParams().width = C0H9H.LIZIZ(311);
                FrameLayout frameLayoutIp4 = Ip();
                if (frameLayoutIp4 != null) {
                    Context context3 = getContext();
                    if (context3 != null) {
                        resources2 = context3.getResources();
                    }
                    frameLayoutIp4.setBackground(new BitmapDrawable(resources2, c1770110wAD.LJI));
                }
                TuxTextView tuxTextViewJp4 = Jp();
                if (tuxTextViewJp4 != null) {
                    C786410Ut5.LJLLLLLL(8, tuxTextViewJp4);
                }
            } else {
                Ip().getLayoutParams().width = -1;
                FrameLayout frameLayoutIp5 = Ip();
                if (frameLayoutIp5 != null) {
                    Context context4 = getContext();
                    if (context4 != null) {
                        drawable = context4.getDrawable(R.drawable.b91);
                    }
                    frameLayoutIp5.setBackground(drawable);
                }
                TuxTextView tuxTextViewJp5 = Jp();
                if (tuxTextViewJp5 != null) {
                    tuxTextViewJp5.setText(c1770110wAD.LIZIZ);
                }
                TuxTextView tuxTextViewJp6 = Jp();
                if (tuxTextViewJp6 != null) {
                    C786410Ut5.LJLLLLLL(0, tuxTextViewJp6);
                }
            }
            C1768390w7R c1768390w7R2 = C1768390w7R.LIZ;
            List<VideoAnchorProduct> list3 = c1770110wAD.LJIIJ;
            c1768390w7R2.getClass();
            BcmParams bcmParamsLIZ2 = C1768390w7R.LIZ(list3);
            C1741470vQ1 c1741470vQ12 = C1741470vQ1.LIZ;
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            c1741470vQ12.getClass();
            final C1740600vOc c1740600vOcLIZ2 = C1741470vQ1.LIZ(fragmentLJI2, i, bcmParamsLIZ2);
            IEcUgBtmService iEcUgBtmService2 = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null);
            if (iEcUgBtmService2 != null && (mapLJ2 = iEcUgBtmService2.LJ(c1740600vOcLIZ2)) != null) {
                c1770110wAD.LIZLLL.putAll(mapLJ2);
            }
            List<VideoAnchorProduct> list4 = c1770110wAD.LJIIJ;
            if (C866950Xzh.LIZIZ(list4)) {
                c1770110wAD.LIZLLL.putAll(C1768390w7R.LIZJ(list4));
            }
            int i3 = this.LLLIZZ;
            boolean z3 = true;
            if (i3 != 1) {
                if (i3 != 2) {
                    pair = new Pair(Boolean.FALSE, "");
                } else {
                    Integer num3 = c1770110wAD.LJII;
                    int value3 = EnumC046800Ew.SEARCH_WORD.getValue();
                    if (num3 == null || num3.intValue() != value3) {
                        z3 = false;
                    }
                    pair = new Pair(Boolean.valueOf(z3), "feed_mall_search_button");
                }
            } else {
                Integer num4 = c1770110wAD.LJIIIIZZ;
                int value4 = EnumC046800Ew.SEARCH_WORD.getValue();
                if (num4 == null || num4.intValue() != value4) {
                    z3 = false;
                }
                pair = new Pair(Boolean.valueOf(z3), "feed_with_cart_mall_search_button");
            }
            final boolean zBooleanValue2 = ((Boolean) pair.getFirst()).booleanValue();
            String str2 = (String) pair.getSecond();
            if (zBooleanValue2) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c1770110wAD.LJIIIZ);
                linkedHashMap2.put("words_source", str2);
                linkedHashMap2.put("words_position", 0);
                linkedHashMap2.put("search_position", "homepage_hot");
                linkedHashMap2.put("search_entrance", "homepage_hot");
                mapLJ = linkedHashMap2;
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            FrameLayout frameLayoutIp6 = Ip();
            if (frameLayoutIp6 != null) {
                final Map map2 = mapLJ;
                C786410Ut5.O7(frameLayoutIp6, new View.OnClickListener() { // from class: X.0vQ8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
                        if (iMallLandingPerfTracker != null) {
                            iMallLandingPerfTracker.onClickMallEntry("homepage_hot", null);
                        }
                        this.LL.Bp(EnumC1770130wAF.CLICK_BUTTON, i);
                        this.LL.aq(c1770110wAD.LJ, str, c1740600vOcLIZ2);
                        EcVideoGuideVM ecVideoGuideVMTp = this.LL.Tp();
                        ReachCfg reachCfg = c1770110wAD.LJFF;
                        int i32 = i;
                        ecVideoGuideVMTp.getClass();
                        if (reachCfg != null) {
                            C948503nH.LJI(ecVideoGuideVMTp, C0PEM.LIZJ, new C610140NwS(reachCfg, ecVideoGuideVMTp, i32, 2, null));
                        }
                        Map<String, Object> map22 = c1770110wAD.LIZLLL;
                        map22.put("enter_method", str);
                        C1421105hJ.LIZJ("tiktokec_mall_entrance_click", map22);
                        if (zBooleanValue2) {
                            C1421105hJ.LIZJ("trending_words_click", map2);
                        }
                    }
                });
            }
            C2271391DvN.LIZ(Ip(), (C1A5L) C2271381DvM.LLLFZ.getValue());
            ConstraintLayout constraintLayoutQp4 = Qp();
            if (constraintLayoutQp4 != null) {
                C786410Ut5.LL(0, constraintLayoutQp4);
            }
            C1421105hJ.LIZJ("tiktokec_mall_entrance_show", c1770110wAD.LIZLLL);
            if (zBooleanValue2) {
                C1421105hJ.LIZJ("trending_words_show", mapLJ);
            }
            C1440005kM.LIZ(new C1769570w9L(EnumC113600bu.SHOW));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Xp(int r15, int r16, int r17, int r18, java.util.Map<java.lang.String, ? extends java.lang.Object> r19, java.lang.String r20, java.util.List<java.lang.String> r21, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg> r22) {
        /*
            r14 = this;
            r3 = r22
            boolean r0 = r3 instanceof X.C610170NwV
            r8 = r14
            if (r0 == 0) goto L5f
            r4 = r3
            X.0NwV r4 = (X.C610170NwV) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L15:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L3e
            if (r1 != r0) goto L67
            X.C155000ia.LIZIZ(r3)
        L25:
            X.0X52 r3 = (X.C0X52) r3
            if (r3 == 0) goto L65
            T r0 = r3.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L65
            T r0 = r0.data
            com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse r0 = (com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse) r0
            if (r0 == 0) goto L65
            java.util.List<com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg> r0 = r0.reachConfigList
            if (r0 == 0) goto L65
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            return r0
        L3e:
            X.C155000ia.LIZIZ(r3)
            X.0NwU r5 = new X.0NwU
            r13 = 0
            r12 = r21
            r11 = r20
            r10 = r18
            r9 = r17
            r7 = r16
            r6 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.LLILLL = r0
            java.lang.String r0 = "homepage_hot"
            r1 = r19
            java.lang.Object r3 = X.C2381909Uz.LIZJ(r0, r1, r4, r5)
            if (r3 != r2) goto L25
            return r2
        L5f:
            X.0NwV r4 = new X.0NwV
            r4.<init>(r8, r3)
            goto L15
        L65:
            r0 = 0
            return r0
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem.Xp(int, int, int, int, java.util.Map, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }
}
