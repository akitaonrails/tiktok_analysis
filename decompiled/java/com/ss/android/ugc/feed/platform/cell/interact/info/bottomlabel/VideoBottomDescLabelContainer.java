package com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C04SC;
import X.C08QT;
import X.C098300Yr;
import X.C09R3;
import X.C09RB;
import X.C09RD;
import X.C0HHT;
import X.C0QSJ;
import X.C0RDX;
import X.C0RKW;
import X.C0RPT;
import X.C0RPV;
import X.C0RPZ;
import X.C0RQ6;
import X.C0RR9;
import X.C0RU5;
import X.C0RUJ;
import X.C0RXA;
import X.C0RXK;
import X.C0RXM;
import X.C0RXZ;
import X.C0RY2;
import X.C0RZK;
import X.C0S9M;
import X.C13LE;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C299180Bo4;
import X.C330000Cwg;
import X.C418440Gaw;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C693480RIc;
import X.C694180RKu;
import X.C696020RRw;
import X.C697240RWo;
import X.C697330RWx;
import X.C697440RXi;
import X.C697460RXk;
import X.C697530RXr;
import X.C698680Ras;
import X.C698800Rb4;
import X.C699500RcC;
import X.C700170RdH;
import X.C700260RdQ;
import X.C700450Rdj;
import X.C700950ReX;
import X.C700970ReZ;
import X.C701270Rf3;
import X.C701320Rf8;
import X.C701370RfD;
import X.C701870Rg1;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
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
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.ad.feed.product.IAdAssemService;
import com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel.AdAIGCBottomLabelTriggerAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel.AdBottomLabelTriggerAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel.PaidPartnershipBottomLabelTriggerAssem;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.adapter.VideoBottomDescLabelContainerScope;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.AIGCBottomLabelTriggerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.AutoDubbingConsumptionLabelAssemV2;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.HeatingBottomLabelTriggerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.label.SeriesPurchaseBottomLabelTriggerAssem;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoBottomLabelProtocol;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoBottomDescLabelContainer extends BaseContainer<VideoBottomLabelProtocol, VideoBottomDescLabelContainer> implements VideoBottomLabelAbility, FcpContainerProtocol, VideoBottomLabelContainerAbility, InterfaceC697220RWm, ComponentPriorityProtocol, C0RUJ, InterfaceC697640RYc, InterfaceC702410Rgt, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final /* synthetic */ C701370RfD LLJL = new C701370RfD();
    public final /* synthetic */ C697240RWo LLJLIL = new C697240RWo();
    public final C0RY2 LLJLILLLLZIIL;
    public List<? extends VideoBottomLabelProtocol> LLJLL;
    public final C01GW LLJLLIL;
    public final C0RPZ LLJLLL;
    public final C01GW LLJZ;
    public int LLJZIJLIL;
    public boolean LLL;
    public final List<ReusedUIAssem<? extends C03H5>> LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public C0RKW LLLFZ;
    public C0RKW LLLI;
    public volatile InteractAreaFunnelAbility LLLII;
    public volatile IFcpPolicyAbility LLLIIII;
    public volatile FcpProtocolAbility LLLIIIIL;
    public InterfaceC665370Q7z LLLIIIL;
    public C0QSJ LLLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoBottomDescLabelContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoBottomDescLabelContainer.class, "interactAreaFunnelAbility", "getInteractAreaFunnelAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/InteractAreaFunnelAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(VideoBottomDescLabelContainer.class, "fcpPolicyAbility", "getFcpPolicyAbility()Lcom/ss/android/ugc/feed/platform/componentmanager/IFcpPolicyAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(VideoBottomDescLabelContainer.class, "fcpProtocolAbility", "getFcpProtocolAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/FcpProtocolAbility;", 0);
        c09r3.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC697220RWm
    public final void Ah(InterfaceC702410Rgt interfaceC702410Rgt) {
        this.LLJL.Ah(interfaceC702410Rgt);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_tag_container";
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

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol
    public final void Mx() {
    }

    @Override // X.InterfaceC697220RWm
    public final void N7(Function1<? super C700170RdH, ? extends InterfaceC695090ROh> function1, String str, ForkJoinPool forkJoinPool, Function0<FeedComponentPriorityData> function0, InterfaceC700020Rd2<?> interfaceC700020Rd2, Function0<? extends List<String>> function02, Function1<? super FcpNodeProtocol, Boolean> function12, Executor executor, InterfaceC697640RYc interfaceC697640RYc, Function0<Boolean> function03, Function0<? extends InterfaceC699620RcO> function04, Function0<? extends InterfaceC699200Rbi<?>> function05, InterfaceC700280RdS interfaceC700280RdS, InterfaceC700270RdR interfaceC700270RdR, AbstractC738140SxQ abstractC738140SxQ, FcpNodeProtocol fcpNodeProtocol, Function0<? extends C0RXZ> function06) {
        this.LLJL.N7(function1, str, forkJoinPool, function0, interfaceC700020Rd2, function02, function12, executor, interfaceC697640RYc, function03, function04, function05, interfaceC700280RdS, interfaceC700270RdR, abstractC738140SxQ, fcpNodeProtocol, function06);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "bottom_tag_container";
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> Td() {
        return this.LLJL.Td();
    }

    @Override // X.InterfaceC697220RWm
    public final void U(Function1<? super InterfaceC1449905lx<C701270Rf3>, ? extends Function1<? super Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>, ? extends Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>>>[] function1Arr, Function1<? super InterfaceC703670Riv<C701270Rf3>, ? extends Function1<? super Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, ? extends Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>>>... function1Arr2) {
        this.LLJL.U(function1Arr, function1Arr2);
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
        C687700QyG.LIZ(this, new Class[]{VideoBottomDescLabelContainerScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol
    public final String getContainerKey() {
        return "bottom_tag_container";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CellInteractAreaScope.class);
        arrayList.add(VideoBottomDescLabelContainerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoBottomDescLabelContainerScope.class);
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

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.InterfaceC697220RWm
    public final void lm() {
        this.LLJL.lm();
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // X.InterfaceC697220RWm
    public final void ol() {
        this.LLJL.ol();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1558520qew.LJI(this, VideoCellScope.class, this, VideoBottomLabelContainerAbility.class, null, null);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1095059851) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> q6() {
        return this.LLJL.q6();
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC697640RYc
    public final void rk(C0RZK c0rzk, Function1<? super Boolean, Unit> function1) {
        this.LLJLIL.rk(c0rzk, function1);
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public final void up(String str, boolean z) {
        this.LLJLIL.LIZ(str, z);
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

    @Override // X.InterfaceC697220RWm
    public final String xg() {
        return this.LLJL.xg();
    }

    @Override // X.InterfaceC697220RWm
    public final void zf() {
        this.LLJL.zf();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0RY2] */
    public VideoBottomDescLabelContainer() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConstraintSizeVM.class);
        C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C330000Cwg(c19719912DlLIZ), null, new C697460RXk());
        this.LLJLILLLLZIIL = new Object() { // from class: X.0RY2
        };
        this.LLJLLIL = C452501pT.LIZIZ(new C0RR9(this));
        this.LLJLLL = new C0RPZ(false, true, LowScreenOptimizeAB.LIZJ().operatorRefactor);
        this.LLJZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2147));
        this.LLJZIJLIL = -1;
        this.LLLF = new ArrayList();
        this.LLLFF = C452501pT.LIZIZ(new C0RXK());
        this.LLLFFI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1246));
        if (tp()) {
            N7(new C696020RRw(this, this, null), C694180RKu.LIZ(this), C0S9M.LIZ(), new AwS555S0100000_11(this, 1240), new C697330RWx(new AwS555S0100000_11(this, 1241), null), new AwS555S0100000_11(this, 1242), null, C0RXA.LL, this, null, new AwS555S0100000_11(this, 1243), new AwS555S0100000_11(this, 1244), null, null, null, null, null);
        }
    }

    @Override // X.InterfaceC697220RWm
    public final C700170RdH J9() {
        return this.LLJL.LLIZLLLIL;
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return C098300Yr.LIZ("bottom_tag_container");
    }

    @Override // X.InterfaceC697220RWm
    public final String o1() {
        return this.LLJL.LLILZIL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.VideoBottomLabelContainerAbility
    public final List<ComponentPriorityProtocol> o51() {
        ArrayList arrayList = new ArrayList();
        List<? extends VideoBottomLabelProtocol> list = this.LLJLL;
        if (list == null) {
            list = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (VideoBottomLabelProtocol videoBottomLabelProtocol : list) {
            if ((videoBottomLabelProtocol instanceof ComponentPriorityProtocol) && videoBottomLabelProtocol != null) {
                arrayList2.add(videoBottomLabelProtocol);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final C0QSJ op() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLIIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLIIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CellInteractAreaScope.class});
        this.LLLIIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final IFcpPolicyAbility sp() {
        IFcpPolicyAbility iFcpPolicyAbility = this.LLLIIII;
        if (iFcpPolicyAbility == null) {
            synchronized (this) {
                iFcpPolicyAbility = this.LLLIIII;
                if (iFcpPolicyAbility == null) {
                    C0QSJ c0qsjOp = op();
                    IFcpPolicyAbility iFcpPolicyAbility2 = c0qsjOp != null ? (IFcpPolicyAbility) c0qsjOp.getAbility(IFcpPolicyAbility.class) : null;
                    this.LLLIIII = iFcpPolicyAbility2;
                    return iFcpPolicyAbility2;
                }
            }
        }
        return iFcpPolicyAbility;
    }

    public final boolean tp() {
        return ((Boolean) this.LLJZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        InteractAreaCommonAbility interactAreaCommonAbility;
        super.Co();
        if (!Intrinsics.LJFF(C697530RXr.LIZ().enableBottomLabel, Boolean.TRUE) || (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLIL.getValue()) == null) {
            return;
        }
        interactAreaCommonAbility.yz(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        if (tp()) {
            Xg(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        if (tp()) {
            lm();
            ol();
        }
        if (((Boolean) C04SC.LIZ.getValue()).booleanValue()) {
            this.LLJZIJLIL = -1;
            this.LLL = false;
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            if (Intrinsics.LJFF(C697530RXr.LIZ().enableBottomLabel, Boolean.TRUE)) {
                ((ArrayList) this.LLLF).clear();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return C0RQ6.DESC_BOTTOM_LABEL_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.FcpContainerProtocol
    public final void b62(List<Pair<String, Boolean>> list) {
        if (Intrinsics.LJFF(C697530RXr.LIZ().enableBottomLabel, Boolean.TRUE)) {
            if (!tp()) {
                Iterator it2 = ((ArrayList) this.LLLF).iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    if (((ReusedUIAssem) it2.next()).LJJIJL().getVisibility() == 0) {
                        z = true;
                    }
                }
                if (z) {
                    C786410Ut5.LJLLLLLL(0, LJJIJL());
                    return;
                } else {
                    C786410Ut5.LJLLLLLL(8, LJJIJL());
                    return;
                }
            }
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            ArrayList arrayList = new ArrayList();
            for (Pair<String, Boolean> pair : list) {
                if (pair.getSecond().booleanValue()) {
                    arrayList.add(pair.getFirst());
                } else {
                    C786410Ut5.LJLLLLLL(0, LJJIJL());
                }
            }
            gg(new C700260RdQ(new C698680Ras(null, arrayList, "outreach", C2097608Jq.LJ()), C701320Rf8.LIZ, false, new InterfaceC702410Rgt() { // from class: X.0RXG
                @Override // X.InterfaceC702410Rgt
                public final void hl() {
                }

                @Override // X.InterfaceC702410Rgt
                public final void vg(C700950ReX c700950ReX) {
                    ((FcpContainerAssem) this.LL.LLLFFI.getValue()).qa(c700950ReX);
                }
            }, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* JADX INFO: renamed from: ip */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(com.ss.android.ugc.aweme.feed.model.VideoItemParams r7) {
        /*
            r6 = this;
            r6.LLJJLIIIJLLLLLLLZ = r7
            boolean r0 = r6.tp()
            if (r0 == 0) goto L25
            X.01GW r0 = r6.LLLFFI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem r0 = (com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem) r0
            r0.ep()
            r6.zf()
            X.0Rf6 r2 = X.C701300Rf6.LIZ
            X.0RdQ r0 = new X.0RdQ
            r1 = 0
            r3 = 1
            r5 = 9
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            r6.gg(r0)
        L25:
            X.01GW r0 = X.C04SC.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L84
            r0 = -1
            r6.LLJZIJLIL = r0
            r0 = 0
            r6.LLL = r0
            android.view.View r1 = r6.LJJIJL()
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
            com.ss.android.ugc.feed.platform.cell.interact.hotspot.FeedComponentSpacingBugfixConfig r0 = X.C697530RXr.LIZ()
            java.lang.Boolean r1 = r0.enableBottomLabel
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L84
            boolean r0 = X.C1157604fu.LIZ()
            if (r0 == 0) goto L69
            X.0Ruh r1 = X.C710970Ruh.LJ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getAweme()
            java.lang.String r0 = r0.getAid()
            r1.getClass()
            boolean r0 = X.C710970Ruh.LIZ(r0)
            if (r0 != 0) goto L84
        L69:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.getAweme()
            X.01GW r0 = X.C0B4Q.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9d
            r1 = 1
            if (r2 == 0) goto L9d
            boolean r0 = X.C1017070cZd.LLIZLLLIL(r2)
            if (r0 != r1) goto L9d
        L84:
            android.view.View r1 = r6.LJJIJL()
            boolean r0 = r1 instanceof X.C703950RjN
            if (r0 == 0) goto L9c
            X.0RjN r1 = (X.C703950RjN) r1
            if (r1 == 0) goto L9c
            boolean r0 = r1.LLJJIJI
            if (r0 == 0) goto L9c
            X.0RQl r0 = new X.0RQl
            r0.<init>(r1)
            X.C0CNO.LJ(r0)
        L9c:
            return
        L9d:
            java.util.List<com.bytedance.assem.arch.reused.ReusedUIAssem<? extends X.03H5>> r0 = r6.LLLF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.VideoBottomDescLabelContainer.tp(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        List<? extends VideoBottomLabelProtocol> arrayList;
        InterfaceC697420RXg interfaceC697420RXgRc1;
        Function1<Function1<? super C698680Ras, C698680Ras>, Function0<Unit>> function1LIZ;
        AdAIGCBottomLabelTriggerAssem adAIGCBottomLabelTriggerAssemLIZLLL;
        PaidPartnershipBottomLabelTriggerAssem paidPartnershipBottomLabelTriggerAssemLIZJ;
        AdBottomLabelTriggerAssem adBottomLabelTriggerAssemLJFF;
        C0RXM c0rxm = C0RXM.LIZ;
        C0RPZ c0rpz = this.LLJLLL;
        c0rxm.getClass();
        final View viewLJJIJL = LJJIJL();
        final C0RPT c0rpt = new C0RPT(new C0RU5(this));
        c0rpz.LJIIIZ = new C0RPV(viewLJJIJL, c0rpt) { // from class: X.0RPR
            @Override // X.C0RPV
            public final C695280RPa LIZIZ(String str) {
                int i = ConstraintSizeVM.LLIZ;
                return new C695280RPa(i, i, 5);
            }
        };
        boolean zLIZ = C701870Rg1.LIZ(C698800Rb4.LJ(jm()));
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        IAdAssemService iAdAssemService = (IAdAssemService) PluggableExtentionKt.pluggableSpi$default(IAdAssemService.class, false, false, false, 14, null);
        if (iAdAssemService != null && (adBottomLabelTriggerAssemLJFF = iAdAssemService.LJFF()) != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoBottomLabelProtocol.class, C1697810uHb.LJIILJJIL(adBottomLabelTriggerAssemLJFF));
        }
        IAdAssemService iAdAssemService2 = (IAdAssemService) PluggableExtentionKt.pluggableSpi$default(IAdAssemService.class, false, false, false, 14, null);
        if (iAdAssemService2 != null && (paidPartnershipBottomLabelTriggerAssemLIZJ = iAdAssemService2.LIZJ()) != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoBottomLabelProtocol.class, C1697810uHb.LJIILJJIL(paidPartnershipBottomLabelTriggerAssemLIZJ));
        }
        VideoBottomLabelProtocol poiCreatorBottomLabelTrigger = ((IPoiAnchorService) ServiceManager.get().getService(IPoiService.class)).getPoiCreatorBottomLabelTrigger();
        if (poiCreatorBottomLabelTrigger != null) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoBottomLabelProtocol.class, C1697810uHb.LJIILJJIL(poiCreatorBottomLabelTrigger));
        }
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoBottomLabelProtocol.class, C1697810uHb.LJIILJJIL(((IAdAssemService) ServiceManager.get().getService(IAdAssemService.class)).LJ()));
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoBottomLabelProtocol.class, C1697810uHb.LJIILJJIL(((IAdComponentService) ServiceManager.get().getService(IAdComponentService.class)).LIZ()));
        if (!zLIZ) {
            IAdAssemService iAdAssemService3 = (IAdAssemService) PluggableExtentionKt.pluggableSpi$default(IAdAssemService.class, false, false, false, 14, null);
            if (iAdAssemService3 != null && (adAIGCBottomLabelTriggerAssemLIZLLL = iAdAssemService3.LIZLLL(false)) != null) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoBottomLabelProtocol.class, C1697810uHb.LJIILJJIL(adAIGCBottomLabelTriggerAssemLIZLLL));
            }
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoBottomLabelProtocol.class, C1697810uHb.LJIILJJIL(new HeatingBottomLabelTriggerAssem(false)));
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoBottomLabelProtocol.class, C1697810uHb.LJIILJJIL(new AIGCBottomLabelTriggerAssem(false)));
            if (C299180Bo4.LIZ()) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoBottomLabelProtocol.class, C1697810uHb.LJIILJJIL(new AutoDubbingConsumptionLabelAssemV2(false)));
            }
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoBottomLabelProtocol.class, C1697810uHb.LJIILJJIL(new SeriesPurchaseBottomLabelTriggerAssem(false)));
            IFeedDebugService iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null);
            if (iFeedDebugService != null) {
                iFeedDebugService.LJIL();
            }
        }
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), VideoBottomLabelProtocol.class, false);
        final C0RY2 c0ry2 = this.LLJLILLLLZIIL;
        final Set set = (Set) this.LLLFF.getValue();
        c0ry2.getClass();
        if (listLIZIZ == null || (arrayList = C13LP.LJLLLL(new Comparator() { // from class: X.0RZQ
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iLJJJZ;
                PriorityProtocol priorityProtocol = (PriorityProtocol) t;
                C0RY2 c0ry22 = c0ry2;
                Set set2 = set;
                c0ry22.getClass();
                int iLJJJZ2 = Integer.MAX_VALUE;
                if (set2.contains(priorityProtocol.zg())) {
                    iLJJJZ = C13LP.LJJJZ(priorityProtocol.zg(), set2);
                } else {
                    iLJJJZ = Integer.MAX_VALUE;
                }
                Integer numValueOf = Integer.valueOf(iLJJJZ);
                PriorityProtocol priorityProtocol2 = (PriorityProtocol) t2;
                C0RY2 c0ry23 = c0ry2;
                Set set3 = set;
                c0ry23.getClass();
                if (set3.contains(priorityProtocol2.zg())) {
                    iLJJJZ2 = C13LP.LJJJZ(priorityProtocol2.zg(), set3);
                }
                return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iLJJJZ2));
            }
        }, listLIZIZ)) == null) {
            arrayList = new ArrayList<>();
        }
        this.LLJLL = arrayList;
        for (VideoBottomLabelProtocol videoBottomLabelProtocol : arrayList) {
            C0RXM.LIZ.getClass();
            ReusedUIAssem<? extends C03H5> reusedUIAssemVO = videoBottomLabelProtocol.VO();
            IFeedDebugService iFeedDebugService2 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService2 != null) {
                iFeedDebugService2.LJIJJ();
            }
            ((ArrayList) C693480RIc.LIZIZ).add(reusedUIAssemVO);
        }
        if (tp()) {
            Object value = this.LLLFFI.getValue();
            IFeedDebugService iFeedDebugService3 = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
            if (iFeedDebugService3 != null) {
                iFeedDebugService3.LJIJJ();
            }
            ((ArrayList) C693480RIc.LIZIZ).add(value);
        }
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 618));
        if (tp()) {
            U(null, new Function1[0]);
            Ah(this);
            Ah(new C697440RXi(new AwS555S0100000_11(this, 1245)));
            IFcpPolicyAbility iFcpPolicyAbilitySp = sp();
            if (iFcpPolicyAbilitySp != null && (interfaceC697420RXgRc1 = iFcpPolicyAbilitySp.rc1()) != null && (function1LIZ = interfaceC697420RXgRc1.LIZ()) != null) {
                function1LIZ.invoke(new AwS590S0100000_11(this, 619));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    @Override // X.InterfaceC702410Rgt
    public final void vg(C700950ReX c700950ReX) {
        ViewGroup viewGroup;
        Object obj;
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewLJJIJL;
        } else {
            viewGroup = null;
        }
        Collection<FcpNodeProtocol> collectionValues = Xh().values();
        ArrayList<PriorityProtocol> arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (obj2 instanceof PriorityProtocol) {
                arrayList.add(obj2);
            }
        }
        for (final PriorityProtocol priorityProtocol : arrayList) {
            final String strH3 = priorityProtocol.H3();
            if (strH3 == null) {
                strH3 = "";
            }
            if (!Intrinsics.LJFF(strH3, "bottom_tag_container") && !Intrinsics.LJFF(strH3, ((FcpContainerAssem) this.LLLFFI.getValue()).LLJL)) {
                final View viewXb = priorityProtocol.xb();
                ViewGroup.LayoutParams layoutParams = viewXb.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                    int i = ConstraintSizeVM.LLIZ;
                    int marginStart = marginLayoutParams.getMarginStart();
                    int i2 = marginLayoutParams.topMargin;
                    marginLayoutParams.setMarginStart(marginStart);
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.setMarginEnd(iLIZIZ);
                    marginLayoutParams.bottomMargin = i;
                }
                viewXb.setTag(R.id.ekq, strH3);
                InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLIL.getValue();
                if (interactAreaCommonAbility != null) {
                    interactAreaCommonAbility.zB1(new ComponentPriorityProtocol() { // from class: com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.VideoBottomDescLabelContainer$onFcpPolicyDone$1$2
                        @Override // X.C0RJL
                        public final boolean oh() {
                            return false;
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final InterfaceC701260Rf2 vk() {
                            return null;
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final InterfaceC700000Rd0 wb1() {
                            return null;
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final C699500RcC II() {
                            return priorityProtocol.II();
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
                        public final boolean Qm0() {
                            return priorityProtocol.YZ();
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
                        public final C700450Rdj vN0() {
                            Object next;
                            PriorityProtocol priorityProtocol2;
                            Iterator<T> it2 = this.Td().values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (Intrinsics.LJFF(((FcpNodeProtocol) next).H3(), strH3)) {
                                    break;
                                }
                            }
                            FcpNodeProtocol fcpNodeProtocol = (FcpNodeProtocol) next;
                            if (fcpNodeProtocol == null || !(fcpNodeProtocol instanceof PriorityProtocol) || (priorityProtocol2 = (PriorityProtocol) fcpNodeProtocol) == null) {
                                return null;
                            }
                            return priorityProtocol2.Ke1();
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final String LLLII() {
                            return C694180RKu.LIZ(this);
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
                        public final boolean PT1() {
                            return Qm0();
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final String H3() {
                            return strH3;
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
                        public final View xb() {
                            return viewXb;
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
                        public final void Bh2(boolean z) {
                            C786410Ut5.LJLLLLLL(0, viewXb);
                            this.up(strH3, z);
                        }
                    });
                }
                if (viewGroup != null) {
                    try {
                        if (viewGroup.indexOfChild(priorityProtocol.xb()) == -1 && !Intrinsics.LJFF(priorityProtocol.xb(), viewGroup)) {
                            int iLJJJZ = C13LP.LJJJZ(strH3, (Set) this.LLLFF.getValue());
                            if (iLJJJZ != 0 && viewGroup.getChildCount() != 0) {
                                if (iLJJJZ < 0) {
                                    viewGroup.addView(priorityProtocol.xb());
                                } else {
                                    int childCount = viewGroup.getChildCount();
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < childCount) {
                                            Object tag = viewGroup.getChildAt(i3).getTag(R.id.ekq);
                                            if (!(tag instanceof String) || (str = (String) tag) == null) {
                                                str = "";
                                            }
                                            int iLJJJZ2 = C13LP.LJJJZ(str, (Set) this.LLLFF.getValue());
                                            if (iLJJJZ2 < 0) {
                                                viewGroup.addView(priorityProtocol.xb(), i3);
                                                break;
                                            } else if (iLJJJZ >= iLJJJZ2) {
                                                i3++;
                                            } else {
                                                viewGroup.addView(priorityProtocol.xb(), i3);
                                                break;
                                            }
                                        } else {
                                            viewGroup.addView(priorityProtocol.xb());
                                            break;
                                        }
                                    }
                                }
                            } else {
                                viewGroup.addView(priorityProtocol.xb(), 0);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sb = new StringBuilder("aid: ");
                        C724270Sb3 c724270Sb3 = this.LLJI;
                        if (c724270Sb3 != null) {
                            obj = c724270Sb3.LL;
                        } else {
                            obj = null;
                        }
                        sb.append(((VideoItemParams) obj).getAweme().getAid());
                        sb.append(" bottom_tag add view crashed, tag to add: ");
                        sb.append(priorityProtocol.H3());
                        sb.append(", tag's current parent view: ");
                        sb.append(C13LE.LIZ(priorityProtocol.xb().getParent().getClass()).LJI());
                        Npth.reportBizException("BottomTagAddViewCrash", e, sb.toString(), C2097608Jq.LJ());
                    }
                }
            }
        }
        if (viewGroup != null) {
            C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C09RD(viewGroup), new AwS590S0100000_11(arrayList, (List<CleanModeProtocol>) 346)));
            while (c08qt.hasNext()) {
                C786410Ut5.LJLLLLLL(8, (View) c08qt.next());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void wR(int i) {
        if (((Boolean) C04SC.LIZ.getValue()).booleanValue()) {
            if (i == 0) {
                C786410Ut5.LJLLLLLL(0, LJJIJL());
                return;
            }
            return;
        }
        int i2 = this.LLJZIJLIL + 1;
        this.LLJZIJLIL = i2;
        if (i == 0) {
            this.LLL = true;
        }
        List<? extends VideoBottomLabelProtocol> list = this.LLJLL;
        if (list == null) {
            list = null;
        }
        if (i2 == list.size() - 1) {
            if (this.LLL) {
                C786410Ut5.LJLLLLLL(0, LJJIJL());
            } else {
                C786410Ut5.LJLLLLLL(8, LJJIJL());
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility
    public final void Fn1(ReusedUIAssem<? extends C03H5> reusedUIAssem, Function0<Unit> function0) {
        if (Intrinsics.LJFF(C697530RXr.LIZ().enableBottomLabel, Boolean.TRUE)) {
            ((ArrayList) this.LLLF).add(reusedUIAssem);
        }
        this.LLJLLL.LIZLLL(LJJIJL(), reusedUIAssem);
        function0.invoke();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
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
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
    }
}
