package com.ss.android.ugc.feed.platform.cell.interact.bottom;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C04VI;
import X.C0BOU;
import X.C0QSJ;
import X.C0RD6;
import X.C0RDX;
import X.C0REB;
import X.C0RGG;
import X.C0RGI;
import X.C0RJE;
import X.C0RJN;
import X.C0RK0;
import X.C0RKR;
import X.C0RKW;
import X.C0RKX;
import X.C0RL1;
import X.C0ROV;
import X.C0RQ6;
import X.C0RQN;
import X.C0RQO;
import X.C0RQQ;
import X.C0RUJ;
import X.C0RX1;
import X.C0RX2;
import X.C0RX5;
import X.C0RX7;
import X.C0RXA;
import X.C0RXO;
import X.C0RXX;
import X.C0RXZ;
import X.C0RY3;
import X.C0RY5;
import X.C0RZK;
import X.C0S4B;
import X.C0S9M;
import X.C0SFC;
import X.C0T6L;
import X.C1047660dMy;
import X.C1389300mG0;
import X.C13BV;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C1A57;
import X.C2097608Jq;
import X.C218200sm;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2765015f;
import X.C299790Bp3;
import X.C452501pT;
import X.C586380MzE;
import X.C637920P0k;
import X.C673150Qan;
import X.C687700QyG;
import X.C690870R8b;
import X.C693590RIn;
import X.C693650RIt;
import X.C696020RRw;
import X.C697270RWr;
import X.C697330RWx;
import X.C697350RWz;
import X.C697360RXa;
import X.C697370RXb;
import X.C697380RXc;
import X.C697390RXd;
import X.C697430RXh;
import X.C697440RXi;
import X.C697450RXj;
import X.C697510RXp;
import X.C697790RYr;
import X.C698830Rb7;
import X.C699500RcC;
import X.C700170RdH;
import X.C700260RdQ;
import X.C700450Rdj;
import X.C700970ReZ;
import X.C701270Rf3;
import X.C701320Rf8;
import X.C701370RfD;
import X.C705810RmN;
import X.C705820RmO;
import X.C715260S3w;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.EnumC695830RRd;
import X.EnumC697290RWt;
import X.EnumC697300RWu;
import X.EnumC697820RYu;
import X.InterfaceC1146704e9;
import X.InterfaceC1445905lJ;
import X.InterfaceC1449905lx;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC695090ROh;
import X.InterfaceC697220RWm;
import X.InterfaceC697230RWn;
import X.InterfaceC697420RXg;
import X.InterfaceC697640RYc;
import X.InterfaceC699200Rbi;
import X.InterfaceC699620RcO;
import X.InterfaceC700000Rd0;
import X.InterfaceC700020Rd2;
import X.InterfaceC700270RdR;
import X.InterfaceC700280RdS;
import X.InterfaceC700750ReD;
import X.InterfaceC701260Rf2;
import X.InterfaceC702410Rgt;
import X.InterfaceC703670Riv;
import X.InterfaceC706770Rnv;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS111S0100000_11;
import Y.ARunnableS30S0110000_11;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.addiction.AntiAddictionToastAssemTrigger;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.TnsBannerAssemTrigger;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusBarAssemTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.story.experiment.StoryNoticeTakedownBannerFixSetting;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.AdFeedSearchBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.EditCaptionBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.EngagementCountBannerAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedEcSearchBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssemTriggerV2;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssemTriggerV2;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GiftBagBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.LiveTaskBarBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PhotoModeAfterCreationFeedbackBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PhotoModeHighQualityBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PlayListBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReferralBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ReplaceMusicBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.ScheduleBottomBarAssemTrigger;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaHeightMobAbility;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.maker.next.assem.FcpRootContainerAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.scope.BottomBarComponentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class InteractBottomBannerComponent extends BaseContainer<BottomBarPriorityProtocol, InteractBottomBannerComponent> implements BottomBarPriorityAbility, InteractBottomBarAbility, ComponentPriorityProtocol, C0RUJ, FcpRootContainerAbility, InterfaceC697220RWm, InterfaceC702410Rgt, InterfaceC697640RYc, C0RQO, C0RY3, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final /* synthetic */ C701370RfD LLJL = new C701370RfD();
    public final /* synthetic */ C693650RIt LLJLIL = new C693650RIt();
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new C0RX1(this));
    public final C01GW LLJLL = C452501pT.LIZIZ(new C0RKX(this));
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public String LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C0RQ6 LLLFFI;
    public C0RKW LLLFZ;
    public C0RKW LLLI;
    public final C01GW LLLII;
    public final ConcurrentHashMap<String, Function1<Boolean, Unit>> LLLIIII;
    public volatile FcpProtocolAbility LLLIIIIL;
    public InterfaceC665370Q7z LLLIIIL;
    public C0QSJ LLLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InteractBottomBannerComponent.class, "fcpProtocolAbility", "getFcpProtocolAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/FcpProtocolAbility;", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC697220RWm
    public final void Ah(InterfaceC702410Rgt interfaceC702410Rgt) {
        this.LLJL.Ah(interfaceC702410Rgt);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.InterfaceC697220RWm
    public final C700970ReZ In() {
        return this.LLJL.In();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return "bottom_banner";
    }

    @Override // X.InterfaceC697220RWm
    public final void N7(Function1<? super C700170RdH, ? extends InterfaceC695090ROh> function1, String str, ForkJoinPool forkJoinPool, Function0<FeedComponentPriorityData> function0, InterfaceC700020Rd2<?> interfaceC700020Rd2, Function0<? extends List<String>> function02, Function1<? super FcpNodeProtocol, Boolean> function12, Executor executor, InterfaceC697640RYc interfaceC697640RYc, Function0<Boolean> function03, Function0<? extends InterfaceC699620RcO> function04, Function0<? extends InterfaceC699200Rbi<?>> function05, InterfaceC700280RdS interfaceC700280RdS, InterfaceC700270RdR interfaceC700270RdR, AbstractC738140SxQ abstractC738140SxQ, FcpNodeProtocol fcpNodeProtocol, Function0<? extends C0RXZ> function06) {
        this.LLJL.N7(function1, str, forkJoinPool, function0, interfaceC700020Rd2, function02, function12, executor, interfaceC697640RYc, function03, function04, function05, interfaceC700280RdS, interfaceC700270RdR, abstractC738140SxQ, fcpNodeProtocol, function06);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "bottom_banner";
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> Td() {
        return this.LLJL.Td();
    }

    @Override // X.InterfaceC697220RWm
    public final void U(Function1<? super InterfaceC1449905lx<C701270Rf3>, ? extends Function1<? super Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>, ? extends Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>>>[] function1Arr, Function1<? super InterfaceC703670Riv<C701270Rf3>, ? extends Function1<? super Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, ? extends Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>>>... function1Arr2) {
        this.LLJL.U(function1Arr, function1Arr2);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void VA2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Vx0(PriorityProtocol priorityProtocol, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12) {
    }

    @Override // X.InterfaceC697220RWm
    public final void Xg(InterfaceC702410Rgt interfaceC702410Rgt) {
        this.LLJL.Xg(interfaceC702410Rgt);
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> Xh() {
        return this.LLJL.Xh();
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC697220RWm
    public final C0RXZ ca() {
        return this.LLJL.ca();
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BottomBarComponentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CellInteractAreaScope.class);
        arrayList.add(BottomBarComponentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BottomBarComponentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC697220RWm
    public final void gg(C700260RdQ c700260RdQ) {
        this.LLJL.gg(c700260RdQ);
    }

    @Override // X.InterfaceC702410Rgt
    public final void hl() {
    }

    @Override // X.InterfaceC697220RWm
    public final C0RXZ li() {
        return this.LLJL.li();
    }

    @Override // X.InterfaceC697220RWm
    public final void lm() {
        this.LLJL.lm();
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // X.InterfaceC697220RWm
    public final void ol() {
        this.LLJL.ol();
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -87748674 || iHashCode == -20851065 || iHashCode == 223331207) {
            return this;
        }
        return null;
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> q6() {
        return this.LLJL.q6();
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // X.InterfaceC697220RWm
    public final String xg() {
        return this.LLJL.xg();
    }

    @Override // X.InterfaceC697220RWm
    public final void zf() {
        this.LLJL.zf();
    }

    public InteractBottomBannerComponent() {
        N7(new C696020RRw(this, this, new C0RX5(this)), "bottom_banner", C0S9M.LIZ(), new C697360RXa(this), new C697330RWx(new C697380RXc(this), new C0RXX(this)), new C697350RWz(this), null, C0RXA.LL, C299790Bp3.LIZ() ? this : null, null, new AwS555S0100000_11(this, 1196), new AwS555S0100000_11(this, 1197), null, null, null, null, null);
        this.LLJLLIL = C452501pT.LIZIZ(new C0REB(this));
        this.LLJLLL = C452501pT.LIZIZ(new C0RX2(this));
        this.LLJZ = C452501pT.LIZIZ(new C0RX7(this));
        this.LLJZIJLIL = C452501pT.LIZIZ(new C697270RWr(this));
        this.LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C697450RXj());
        this.LLLFF = C452501pT.LIZIZ(new C0RL1(this));
        this.LLLFFI = C0RQ6.INTERACT_BOTTOM_BANNER_COMPONENT;
        this.LLLII = C452501pT.LIZIZ(new C697430RXh(this));
        this.LLLIIII = new ConcurrentHashMap<>();
    }

    public final boolean Ap() {
        return ((Boolean) this.LLJLL.getValue()).booleanValue();
    }

    @Override // X.C0RQO
    public final String Ig() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C0RQN.LIZIZ(c724270Sb3 != null ? c724270Sb3.LL : null, jm());
    }

    @Override // X.InterfaceC697220RWm
    public final C700170RdH J9() {
        return this.LLJL.LLIZLLLIL;
    }

    @Override // X.InterfaceC697220RWm
    public final String o1() {
        return this.LLJL.LLILZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0RPb, android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final View op() {
        ?? r3;
        if (((Boolean) C0BOU.LIZ.getValue()).booleanValue()) {
            C705810RmN c705810RmN = new C705810RmN(LJJIJL().getContext(), null);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c705810RmN);
            c705810RmN.setLayoutParams(marginLayoutParams);
            c705810RmN.setId(R.id.eko);
            r3 = c705810RmN;
        } else {
            C705820RmO c705820RmO = new C705820RmO(LJJIJL().getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c705820RmO);
            c705820RmO.setLayoutParams(marginLayoutParams2);
            c705820RmO.setId(R.id.eko);
            r3 = c705820RmO;
        }
        r3.setOnPerfListener(new C0RQQ(r3, EnumC697290RWt.P_BANNER_FCP, new C697510RXp(this)));
        return r3;
    }

    public final InteractAreaCommonAbility up() {
        return (InteractAreaCommonAbility) this.LLJLLIL.getValue();
    }

    public final InterfaceC697230RWn yp() {
        return (InterfaceC697230RWn) this.LLJZIJLIL.getValue();
    }

    public final boolean zp() {
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        C0RGG c0rggLIZ = C586380MzE.LIZ();
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        return c0rggLIZ.LIZJ(c0rjnLIZIZ != null ? C1389300mG0.LIZ(c0rjnLIZIZ) : null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void H() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC691660RBc) it2.next()).H();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return yp().ns();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONUNSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    public final List<String> LLILL() {
        List<String> listSingletonList;
        String strNs = yp().ns();
        return (strNs == null || (listSingletonList = Collections.singletonList(strNs)) == null) ? C13BV.INSTANCE : listSingletonList;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    public final List<String> LLLZIIL() {
        return yp().is();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        PriorityProtocol priorityProtocol;
        FcpNodeProtocol fcpNodeProtocol = yp().Aa().get(H3());
        if (!(fcpNodeProtocol instanceof PriorityProtocol) || (priorityProtocol = (PriorityProtocol) fcpNodeProtocol) == null) {
            return false;
        }
        return priorityProtocol.YZ();
    }

    @Override // X.C0RY3
    public final C0S4B a7() {
        String strH3 = H3();
        if (strH3 == null || strH3.length() == 0) {
            return null;
        }
        FcpNodeProtocol fcpNodeProtocol = yp().Aa().get(H3());
        if (fcpNodeProtocol instanceof C0S4B) {
            return (C0S4B) fcpNodeProtocol;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    public final void fl1() {
        C637920P0k.LIZ(LJJIJL(), new ARunnableS30S0110000_11(this, 6));
    }

    @Override // X.C0RUJ
    public final void lj() {
        C0RY5 c0ry5;
        if (!Ap()) {
            sp(true);
            return;
        }
        InterfaceC697230RWn interfaceC697230RWnYp = yp();
        if (!(interfaceC697230RWnYp instanceof C0RY5) || (c0ry5 = (C0RY5) interfaceC697230RWnYp) == null) {
            return;
        }
        c0ry5.wa(false);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        long jLJFF = C0RQN.LJFF();
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONPARENTSET, jLJFF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[Catch: all -> 0x003c, PHI: r1
      0x0030: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:10:0x0012, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:7:0x000c, B:9:0x0010, B:11:0x0014, B:13:0x0018, B:14:0x001e, B:18:0x0038, B:19:0x003a, B:17:0x0030), top: B:42:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData tp() {
        /*
            r5 = this;
            boolean r0 = X.C299830Bp7.LIZ()
            r4 = 0
            if (r0 == 0) goto L61
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLIIIIL
            if (r0 != 0) goto L40
            monitor-enter(r5)
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLIIIIL     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3f
            X.0QSJ r1 = r5.LLLIIL     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            X.0Q7z r3 = r5.LLLIIIL     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L1e
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L3c
            r5.LLLIIIL = r3     // Catch: java.lang.Throwable -> L3c
        L1e:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope> r1 = com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3c
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3c
            r5.LLLIIL = r1     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            r0 = r4
            goto L38
        L30:
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility> r0 = com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = (com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility) r0     // Catch: java.lang.Throwable -> L3c
        L38:
            r5.LLLIIIIL = r0     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            goto L45
        L3c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L3f:
            monitor-exit(r5)
        L40:
            X.0RKW r0 = r0.qR1()
            goto L48
        L45:
            if (r0 != 0) goto L40
            r0 = r4
        L48:
            r5.LLLFZ = r0
            if (r0 == 0) goto L53
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r0 = r0.LIZ()
            if (r0 == 0) goto L53
            return r0
        L53:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLLI = r0
            if (r0 == 0) goto L60
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
            return r4
        L60:
            return r4
        L61:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLLI = r0
            if (r0 == 0) goto L6d
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent.tp():com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        long jLJFF = C0RQN.LJFF();
        if (C04VI.LIZ()) {
            this.LLL = null;
        }
        yp().reset();
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_UNBIND, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        PriorityProtocol priorityProtocol;
        String strH3 = H3();
        if (strH3 == null || strH3.length() == 0) {
            return null;
        }
        FcpNodeProtocol fcpNodeProtocol = yp().Aa().get(H3());
        if (!(fcpNodeProtocol instanceof PriorityProtocol) || (priorityProtocol = (PriorityProtocol) fcpNodeProtocol) == null) {
            return null;
        }
        return priorityProtocol.Ke1();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void xo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start bind aid=");
        C724270Sb3 c724270Sb3 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        C2765015f.LIZIZ("InteractBottomBannerComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void yo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end bind aid=");
        C724270Sb3 c724270Sb3 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        C2765015f.LIZIZ("InteractBottomBannerComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return this.LLLFFI;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
        Object obj;
        long jLJFF = C0RQN.LJFF();
        C697790RYr c697790RYr = C697790RYr.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String aid = ((VideoItemParams) obj).getAweme().getAid();
        EnumC697290RWt enumC697290RWt = EnumC697290RWt.P_BANNER_DECISION;
        String start = enumC697290RWt.getStart();
        EnumC697820RYu enumC697820RYu = EnumC697820RYu.APPEND;
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid, start, null, enumC697820RYu, null, null);
        Bp(null, z);
        if (z) {
            gg(new C700260RdQ(C0RXO.LIZ(H3(), "outreach", C2097608Jq.LJ()), C701320Rf8.LIZ, false, null, 12));
        }
        C0RQN.LIZJ(Ig(), EnumC695830RRd.BANNER_KEY, enumC697290RWt, H3());
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_DECISION_RESULT, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LJLIIIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).LLLI(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBarAbility
    public final void M40(String str) {
        Object obj;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), BottomBarPriorityProtocol.class, false);
        if (listLIZIZ != null) {
            for (BottomBarPriorityProtocol bottomBarPriorityProtocol : (ArrayList) listLIZIZ) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                VideoItemParams videoItemParams = (VideoItemParams) obj;
                if (Intrinsics.LJFF(str, bottomBarPriorityProtocol.zg())) {
                    if (bottomBarPriorityProtocol instanceof BaseCellSlotComponent) {
                        if (Intrinsics.LJFF("bottom_banner_tcm", str)) {
                            Pq1(bottomBarPriorityProtocol);
                        }
                        ((BaseCellSlotComponent) bottomBarPriorityProtocol).up(videoItemParams);
                    } else if (bottomBarPriorityProtocol instanceof BaseCellContentComponent) {
                        if (bottomBarPriorityProtocol instanceof BaseCellTriggerComponent) {
                            ((ReusedAssem) bottomBarPriorityProtocol).LLILLJJLI = ur(videoItemParams);
                            AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ((AbstractC738140SxQ) bottomBarPriorityProtocol);
                            if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
                                ArrayList arrayList = new ArrayList();
                                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                                    if (abstractC738140SxQ instanceof BaseCellSlotComponent) {
                                        arrayList.add(abstractC738140SxQ);
                                    }
                                }
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((BaseCellSlotComponent) it2.next()).ur(videoItemParams);
                                }
                            }
                        }
                        ((BaseCellContentComponent) bottomBarPriorityProtocol).up(videoItemParams);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Pq1(PriorityProtocol priorityProtocol) {
        yp().ms(priorityProtocol, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0RWn] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol, com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol] */
    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBarAbility
    public final void WG(String str) {
        Object obj;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), BottomBarPriorityProtocol.class, false);
        ?? r3 = 0;
        if (listLIZIZ != null) {
            ?? r1 = 0;
            for (?? r5 : (ArrayList) listLIZIZ) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                VideoItemParams videoItemParams = (VideoItemParams) obj;
                if (Intrinsics.LJFF(str, r5.zg())) {
                    if (r5 instanceof BaseCellSlotComponent) {
                        ((BaseCellSlotComponent) r5).up(videoItemParams);
                    } else if (r5 instanceof BaseCellContentComponent) {
                        if (r5 instanceof BaseCellTriggerComponent) {
                            ((ReusedAssem) r5).LLILLJJLI = ur(videoItemParams);
                        }
                        ((BaseCellContentComponent) r5).up(videoItemParams);
                    }
                    r1 = r5;
                }
            }
            r3 = r1;
        }
        yp().js(r3, false, true);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        long jLJFF = C0RQN.LJFF();
        Boolean bool = Boolean.TRUE;
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ISACTIVE, jLJFF);
        }
        if ((bool instanceof Boolean) && bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility
    public final void dN0(String str) {
        InteractAreaCommonAbility interactAreaCommonAbilityUp;
        String strH3 = H3();
        if (strH3 != null && strH3.length() != 0 && Intrinsics.LJFF(strH3, str) && (interactAreaCommonAbilityUp = up()) != null) {
            interactAreaCommonAbilityUp.Mr2(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_enter_clear_mode", new C0RGI(this));
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* JADX INFO: renamed from: ip */
    public final void tp(VideoItemParams videoItemParams) {
        long jLJFF = C0RQN.LJFF();
        C697790RYr c697790RYr = C697790RYr.LIZ;
        String aid = videoItemParams.getAweme().getAid();
        EnumC697290RWt enumC697290RWt = EnumC697290RWt.P_BANNER_CREATE;
        String start = enumC697290RWt.getStart();
        EnumC697820RYu enumC697820RYu = EnumC697820RYu.PUTIFABSENT;
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid, start, null, enumC697820RYu, null, null);
        InteractAreaHeightMobAbility interactAreaHeightMobAbility = (InteractAreaHeightMobAbility) this.LLJZ.getValue();
        if (interactAreaHeightMobAbility != null) {
            interactAreaHeightMobAbility.Tb1(this);
        }
        if (C04VI.LIZ()) {
            sp(false);
        }
        String aid2 = videoItemParams.getAweme().getAid();
        String end = enumC697290RWt.getEnd();
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid2, end, null, null, null, null);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONBIND, jLJFF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        ArrayList arrayList;
        C0RJN c0rjnLIZIZ;
        C2189821An6 c2189821An6;
        BottomBarPriorityProtocol poiBottomBarAssem;
        C0RJN c0rjnLIZIZ2;
        C2189821An6 c2189821An62;
        InterfaceC697420RXg interfaceC697420RXgRc1;
        ViewGroup viewGroup;
        long jLJFF = C0RQN.LJFF();
        super.onViewCreated(view);
        View viewLJJIJL = LJJIJL();
        Fragment fragment = null;
        if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
            yp().ts(viewGroup, (C697370RXb) this.LLLII.getValue(), null);
        }
        IFcpPolicyAbility iFcpPolicyAbility = (IFcpPolicyAbility) this.LLJLILLLLZIIL.getValue();
        if (iFcpPolicyAbility != null && (interfaceC697420RXgRc1 = iFcpPolicyAbility.rc1()) != null) {
            interfaceC697420RXgRc1.LIZ().invoke(new C0ROV(this));
        }
        yp().qs();
        Ah(this);
        Ah(new C697440RXi(new AwS555S0100000_11(this, 1198)));
        C637920P0k.LIZ(LJJIJL(), new ARunnableS111S0100000_11(this, 76));
        C698830Rb7.LIZ.getClass();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C690870R8b c690870R8bJm = jm();
        if (C1389300mG0.LJJI(c690870R8bJm.LIZIZ()) || ((c0rjnLIZIZ2 = c690870R8bJm.LIZIZ()) != null && (c2189821An62 = c0rjnLIZIZ2.LIZJ) != null && c2189821An62.isStoryPage())) {
            z = true;
        } else {
            z = false;
        }
        boolean zLJIILL = C1389300mG0.LJIILL(c690870R8bJm.LIZIZ());
        if (!z && !zLJIILL) {
            arrayList = new ArrayList();
            arrayList.add(new AIGCOverLabelBannerAssemTrigger());
            arrayList.add(new ReferralBottomBarAssemTrigger());
            arrayList.add(new GiftBagBottomBarAssemTrigger());
            arrayList.add(new EditCaptionBottomBarAssemTrigger());
            arrayList.add(new TnsBannerAssemTrigger());
            arrayList.add(new EngagementCountBannerAssemTrigger());
            arrayList.add(new PlayListBottomBarAssemTrigger());
            arrayList.add(new LiveTaskBarBottomBarAssemTrigger());
            C1A57.LIZ.getClass();
            arrayList.add(new GameLiveBottomBarAssemTriggerV2());
            if (((Number) C218200sm.LIZ.getValue()).intValue() == 1) {
                arrayList.add(new FeedSearchBottomBarAssemTriggerV2());
            } else {
                arrayList.add(new FeedSearchBottomBarAssemTrigger());
            }
            arrayList.add(new AdFeedSearchBottomBarAssemTrigger());
            arrayList.add(new FeedEcSearchBottomBarAssemTrigger());
            arrayList.add(new ScheduleBottomBarAssemTrigger());
            arrayList.add(new ReplaceMusicBottomBarAssemTrigger());
            arrayList.add(new VideoReviewStatusBarAssemTrigger());
            arrayList.add(new AntiAddictionToastAssemTrigger());
            arrayList.add(new PhotoModeHighQualityBottomBarAssemTrigger());
            arrayList.add(new PhotoModeAfterCreationFeedbackBottomBarAssemTrigger());
            arrayList.add(((ICommercializeFeedService) ServiceManager.get().getService(ICommercializeFeedService.class)).LIZ());
            arrayList.add(((ICommercializeFeedService) ServiceManager.get().getService(ICommercializeFeedService.class)).LJI());
            arrayList.add(((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJIIJ());
            arrayList.add(new BottomSurveyAssemTrigger());
            arrayList.add(C1047660dMy.LIZIZ.Y2());
            Object objLJIJ = C0SFC.LIZIZ.LJIJ();
            if ((objLJIJ instanceof BottomBarPriorityProtocol) && objLJIJ != null) {
                arrayList.add(objLJIJ);
            }
            ICommercializeFeedService iCommercializeFeedService = (ICommercializeFeedService) PluggableExtentionKt.pluggableSpi$default(ICommercializeFeedService.class, false, false, false, 14, null);
            if (iCommercializeFeedService != null) {
                arrayList.add(iCommercializeFeedService.LIZJ());
                arrayList.add(iCommercializeFeedService.LJ());
            }
            arrayList.add(new FeedCommonBannerTrigger());
            IPoiAnchorService iPoiAnchorService = (IPoiAnchorService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
            if (iPoiAnchorService != null && (poiBottomBarAssem = iPoiAnchorService.getPoiBottomBarAssem()) != null) {
                arrayList.add(poiBottomBarAssem);
            }
        } else {
            arrayList = new ArrayList();
            arrayList.add(new AIGCOverLabelBannerAssemTrigger());
            arrayList.add(new TnsBannerAssemTrigger());
            arrayList.add(new EngagementCountBannerAssemTrigger());
            arrayList.add(new VideoReviewStatusBarAssemTrigger());
            arrayList.add(new AntiAddictionToastAssemTrigger());
            arrayList.add(((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJIIJ());
            arrayList.add(new FeedCommonBannerTrigger());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, BottomBarPriorityProtocol.class, C1697810uHb.LJIILJJIL(it2.next()));
        }
        C693590RIn.LIZ(this, new C0RK0(this, C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), BottomBarPriorityProtocol.class, false)));
        C0RJE.LIZLLL(this, (VideoViewModel) this.LLLF.getValue(), new C697390RXd(this));
        if (StoryNoticeTakedownBannerFixSetting.isEnabled()) {
            InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
            C0RJN c0rjnLIZIZ3 = jm().LIZIZ();
            if (c0rjnLIZIZ3 != null) {
                fragment = c0rjnLIZIZ3.LJ;
            }
            if (interfaceC706770RnvLJJIIJ.LJJIIJZLJL(fragment) || ((c0rjnLIZIZ = jm().LIZIZ()) != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null && c2189821An6.isStoryPage())) {
                if (LJJIJL().isAttachedToWindow()) {
                    HandlerHook.viewPost(LJJIJL(), new ARunnableS111S0100000_11(this, 106));
                } else {
                    LJJIJL().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0RXS
                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewDetachedFromWindow(View view2) {
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewAttachedToWindow(View view2) {
                            view2.removeOnAttachStateChangeListener(this);
                            HandlerHook.viewPost(view2, new ARunnableS111S0100000_11(this, this.LL, 105));
                        }
                    });
                }
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0RXU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJLLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(207), 6);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_VIEWCREATED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    public final void sp(boolean z) {
        Object obj;
        if (C04VI.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String aid = ((VideoItemParams) obj).getAweme().getAid();
            if (aid == null) {
                return;
            }
            if (!z && Intrinsics.LJFF(this.LLL, aid)) {
                return;
            } else {
                this.LLL = aid;
            }
        }
        long jLJFF = C0RQN.LJFF();
        yp().ss(true);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_DECISION_TRIGGER, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    @Override // X.InterfaceC702410Rgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vg(X.C700950ReX r8) {
        /*
            r7 = this;
            long r1 = X.C0RQN.LJFF()
            X.0Sb3 r0 = r7.LLJI
            r5 = 0
            if (r0 == 0) goto L72
            java.lang.Object r0 = r0.LL
        Lb:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            r0.getAid()
            X.C0T6L.LIZLLL()
            java.util.Map r0 = r7.Xh()
            java.util.Set r0 = r0.keySet()
            java.lang.Object r6 = X.C13LP.LJJJLIIL(r0)
            java.lang.String r6 = (java.lang.String) r6
            r4 = 0
            if (r6 == 0) goto L5b
            X.0Sb3 r0 = r7.LLJI
            if (r0 == 0) goto L70
            java.lang.Object r0 = r0.LL
        L2e:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            r0.getAid()
            kotlin.jvm.internal.AwS96S1000000_11 r3 = new kotlin.jvm.internal.AwS96S1000000_11
            r0 = 2
            r3.<init>(r6, r0)
            X.C0T6L.LIZLLL()
            boolean r0 = r7.zp()
            if (r0 != 0) goto L4d
            android.view.View r0 = r7.LJJIJL()
            X.C786410Ut5.LJLLLLLL(r4, r0)
        L4d:
            com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility r3 = r7.up()
            if (r3 == 0) goto L5b
            r0 = 1
            r3.CL(r6, r7, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L64
        L5b:
            com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility r0 = r7.up()
            if (r0 == 0) goto L64
            r0.CL(r5, r7, r4)
        L64:
            boolean r0 = X.C715260S3w.LIZJ()
            if (r0 == 0) goto L6f
            X.0RWu r0 = X.EnumC697300RWu.M_ONFCPPOLICY
            X.C0RQN.LIZLLL(r7, r0, r1)
        L6f:
            return
        L70:
            r0 = r5
            goto L2e
        L72:
            r0 = r5
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent.vg(X.0ReX):void");
    }

    public final void Bp(String str, boolean z) {
        boolean z2;
        Iterator<Map.Entry<String, Function1<Boolean, Unit>>> it2 = this.LLLIIII.entrySet().iterator();
        while (it2.hasNext()) {
            Function1<Boolean, Unit> value = it2.next().getValue();
            if (!z) {
                z2 = true;
            } else {
                z2 = false;
            }
            value.invoke(Boolean.valueOf(z2));
        }
        this.LLLIIII.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(int r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            r6 = this;
            long r1 = X.C0RQN.LJFF()
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C724240Sb0.LJ(r6)
            if (r0 == 0) goto L3d
            java.util.concurrent.CopyOnWriteArrayList<X.0SxQ> r0 = r0.LLJILLL
            if (r0 == 0) goto L3d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        L17:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r3 = r4.next()
            boolean r0 = r3 instanceof X.InterfaceC691660RBc
            if (r0 == 0) goto L17
            r5.add(r3)
            goto L17
        L29:
            java.util.Iterator r3 = r5.iterator()
        L2d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r3.next()
            X.0RBc r0 = (X.InterfaceC691660RBc) r0
            X.C0RDX.LIZ(r0, r7, r8)
            goto L2d
        L3d:
            boolean r0 = X.C04VI.LIZ()
            if (r0 == 0) goto L69
            java.lang.String r3 = r6.LLL
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.LL
        L4b:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r0 = r0.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L69
        L5b:
            boolean r0 = X.C715260S3w.LIZJ()
            if (r0 == 0) goto L66
            X.0RWu r0 = X.EnumC697300RWu.M_ONSELECTED
            X.C0RQN.LIZLLL(r6, r0, r1)
        L66:
            return
        L67:
            r0 = 0
            goto L4b
        L69:
            java.lang.String r0 = r6.H3()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5b
            com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility r0 = r6.up()
            if (r0 == 0) goto L5b
            r0.zB1(r6)
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent.J1(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void MJ(PriorityProtocol priorityProtocol, Function1<? super View, Unit> function1) {
        yp().os(priorityProtocol, new C0RKR(function1, this), Boolean.valueOf(priorityProtocol.oh()));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        long jLJFF = C0RQN.LJFF();
        if (C04VI.LIZ()) {
            this.LLL = null;
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONREUSEDBIND, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final void ep(int i, Aweme aweme) {
        super.ep(i, aweme);
        if (!Ap()) {
            yp().reset();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void nw0(PriorityProtocol priorityProtocol, boolean z) {
        yp().ks(priorityProtocol, z, true, false);
    }

    @Override // X.InterfaceC697640RYc
    public final void rk(C0RZK c0rzk, Function1<? super Boolean, Unit> function1) {
        Object obj;
        C0RJN c0rjnLIZIZ;
        Fragment fragment;
        this.LLLIIII.put(c0rzk.LLLII(), function1);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ((VideoItemParams) obj).getAweme().getAid();
        new AwS412S0200000_11(c0rzk, this, 38);
        C0T6L.LIZLLL();
        if (up() == null && (c0rjnLIZIZ = jm().LIZIZ()) != null && (fragment = c0rjnLIZIZ.LJ) != null && C1389300mG0.LJIIJ(fragment)) {
            Bp(c0rzk.LLLII(), false);
            return;
        }
        if (C04VI.LIZ()) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            ((VideoItemParams) obj2).getAweme().getAid();
            new AwS412S0200000_11(c0rzk, this, 39);
            C0T6L.LIZLLL();
            Bp(c0rzk.LLLII(), false);
        }
    }
}
