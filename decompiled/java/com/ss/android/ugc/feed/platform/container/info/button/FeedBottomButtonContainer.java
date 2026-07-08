package com.ss.android.ugc.feed.platform.container.info.button;

import X.AbstractC738140SxQ;
import X.AnonymousClass0557;
import X.C01GW;
import X.C0HHT;
import X.C0QSJ;
import X.C0RDX;
import X.C0RJE;
import X.C0RJN;
import X.C0RKW;
import X.C0RP6;
import X.C0RP7;
import X.C0RP8;
import X.C0RQ6;
import X.C0RQN;
import X.C0RQO;
import X.C0RR7;
import X.C0RS5;
import X.C0RS6;
import X.C0RS7;
import X.C0RUJ;
import X.C0RWZ;
import X.C0RX4;
import X.C0RX8;
import X.C0RX9;
import X.C0RXA;
import X.C0RXB;
import X.C0RXC;
import X.C0RXD;
import X.C0RXJ;
import X.C0RXO;
import X.C0RXZ;
import X.C0RY3;
import X.C0RY5;
import X.C0RYM;
import X.C0RZ5;
import X.C0RZK;
import X.C0S41;
import X.C0S4B;
import X.C0S9M;
import X.C1189904l7;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1445005lA;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C265820AbM;
import X.C2765015f;
import X.C276950AtJ;
import X.C299790Bp3;
import X.C299830Bp7;
import X.C300940Bqu;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C693650RIt;
import X.C693770RJf;
import X.C694320RLi;
import X.C695730RQt;
import X.C695740RQu;
import X.C695940RRo;
import X.C696020RRw;
import X.C697240RWo;
import X.C697280RWs;
import X.C697330RWx;
import X.C697410RXf;
import X.C697490RXn;
import X.C697500RXo;
import X.C697590RXx;
import X.C697660RYe;
import X.C697790RYr;
import X.C699500RcC;
import X.C700170RdH;
import X.C700260RdQ;
import X.C700950ReX;
import X.C700960ReY;
import X.C700970ReZ;
import X.C701040Reg;
import X.C701270Rf3;
import X.C701320Rf8;
import X.C701370RfD;
import X.C708910RrN;
import X.C715260S3w;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC697290RWt;
import X.EnumC697300RWu;
import X.EnumC697820RYu;
import X.InterfaceC1146704e9;
import X.InterfaceC1443605kw;
import X.InterfaceC1444205l2;
import X.InterfaceC1445905lJ;
import X.InterfaceC1449905lx;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC695090ROh;
import X.InterfaceC697220RWm;
import X.InterfaceC697230RWn;
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
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.adapter.FeedBottomButtonContainerScope;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig;
import com.ss.android.ugc.feed.platform.ab.FcpKmpDecisionExp;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.maker.next.assem.FcpRootContainerAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedBottomButtonContainer extends BaseContainer<PriorityProtocol, FeedBottomButtonContainer> implements PriorityAbility, FeedBottomButtonAbility, FcpRootContainerAbility, ComponentPriorityProtocol, C0RYM, C0RUJ, C0RY3, InterfaceC697220RWm, InterfaceC702410Rgt, InterfaceC697640RYc, C0RQO, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final C697590RXx LLLLIIIILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIIL;
    public static final int LLLLIILL;
    public C0RWZ LLJLLL;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public final C01GW LLLFZ;
    public final Set<String> LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C0RQ6 LLLIL;
    public C0RKW LLLILZ;
    public C0RKW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public Function0<Unit> LLLIZZ;
    public boolean LLLJ;
    public volatile InteractAreaFunnelAbility LLLJIL;
    public volatile FcpProtocolAbility LLLJL;
    public InterfaceC665370Q7z LLLL;
    public C0QSJ LLLLII;
    public final /* synthetic */ C701370RfD LLJL = new C701370RfD();
    public final /* synthetic */ C697240RWo LLJLIL = new C697240RWo();
    public final /* synthetic */ C693650RIt LLJLILLLLZIIL = new C693650RIt();
    public final C01GW LLJLL = C452501pT.LIZIZ(new C0RX4(this));
    public boolean LLJLLIL = true;
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(717));

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0RXx] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedBottomButtonContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C13LE.LIZ.getClass();
        LLLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(FeedBottomButtonContainer.class, "interactAreaFunnelAbility", "getInteractAreaFunnelAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/InteractAreaFunnelAbility;", 0), new C2217381BqS(FeedBottomButtonContainer.class, "fcpProtocolAbility", "getFcpProtocolAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/FcpProtocolAbility;", 0)};
        LLLLIIIILLL = new Object() { // from class: X.0RXx
        };
        LLLLIILL = R.id.ekp;
    }

    @Override // X.InterfaceC697220RWm
    public final void Ah(InterfaceC702410Rgt interfaceC702410Rgt) {
        this.LLJL.Ah(interfaceC702410Rgt);
    }

    @Override // com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility
    public final void Ds2() {
    }

    public final void Fp(String str, boolean z) {
        this.LLJLIL.LIZ(str, z);
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
        return "bottom_button";
    }

    @Override // X.InterfaceC697220RWm
    public final void N7(Function1<? super C700170RdH, ? extends InterfaceC695090ROh> function1, String str, ForkJoinPool forkJoinPool, Function0<FeedComponentPriorityData> function0, InterfaceC700020Rd2<?> interfaceC700020Rd2, Function0<? extends List<String>> function02, Function1<? super FcpNodeProtocol, Boolean> function12, Executor executor, InterfaceC697640RYc interfaceC697640RYc, Function0<Boolean> function03, Function0<? extends InterfaceC699620RcO> function04, Function0<? extends InterfaceC699200Rbi<?>> function05, InterfaceC700280RdS interfaceC700280RdS, InterfaceC700270RdR interfaceC700270RdR, AbstractC738140SxQ abstractC738140SxQ, FcpNodeProtocol fcpNodeProtocol, Function0<? extends C0RXZ> function06) {
        this.LLJL.N7(function1, str, forkJoinPool, function0, interfaceC700020Rd2, function02, function12, executor, interfaceC697640RYc, function03, function04, function05, interfaceC700280RdS, interfaceC700270RdR, abstractC738140SxQ, fcpNodeProtocol, function06);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Pq1(PriorityProtocol priorityProtocol) {
        throw null;
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "bottom_button";
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

    @Override // X.C0RYM
    public final void a4() {
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
        C687700QyG.LIZ(this, new Class[]{FeedBottomButtonContainerScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CellInteractAreaScope.class);
        arrayList.add(FeedBottomButtonContainerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FeedBottomButtonContainerScope.class);
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
        if (iHashCode == -87748674 || iHashCode == 229016414 || iHashCode == 1244115485) {
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

    public FeedBottomButtonContainer() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 874));
        this.LLJZIJLIL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS546S0100000_2(this, 873));
        this.LLL = c01gwLIZIZ2;
        this.LLLF = C452501pT.LIZIZ(new AwS546S0100000_2(this, 875));
        N7(new C696020RRw(this, this, new C0RXJ(this)), "bottom_button", C0S9M.LIZ(), new C0RS7(this), new C697330RWx(new C697410RXf(this), new C0RS6(this)), new C0RXD(this), null, C0RXA.LL, C299790Bp3.LIZ() ? this : null, new AwS555S0100000_11(this, 1292), new AwS546S0100000_2(this, 872), new AwS555S0100000_11(this, 1293), (InterfaceC700280RdS) c01gwLIZIZ.getValue(), (InterfaceC700270RdR) c01gwLIZIZ2.getValue(), this, this, new AwS555S0100000_11(this, 1294));
        this.LLLFF = C452501pT.LIZIZ(new C697280RWs(this));
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConstraintSizeVM.class);
        this.LLLFFI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AnonymousClass0557(c19719912DlLIZ), null, new C697490RXn());
        this.LLLFZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C697500RXo());
        this.LLLI = C1189904l7.LIZIZ;
        this.LLLII = C452501pT.LIZIZ(new C0RP7(this));
        this.LLLIIII = C452501pT.LIZIZ(new C0RP8(this));
        this.LLLIIIIL = C452501pT.LIZIZ(new C0RP6(this));
        this.LLLIIIL = C452501pT.LIZIZ(new C0RX9(this));
        this.LLLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1295));
        this.LLLIILIL = C452501pT.LIZIZ(new C0RX8(this));
        this.LLLIL = C0RQ6.FEED_BOTTOM_BTN_CONTAINER;
        this.LLLILZLLLI = C452501pT.LIZIZ(new C0RS5(this));
    }

    public final InterfaceC697230RWn Bp() {
        return (InterfaceC697230RWn) this.LLLFF.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        C1445005lA c1445005lALJIIJ;
        InterfaceC1444205l2 interfaceC1444205l2;
        InterfaceC1443605kw result;
        List<String> listLIZ;
        if (!FcpKmpDecisionExp.LIZ("bottom_button")) {
            return Bp().ns();
        }
        C0RXZ c0rxzYp = yp();
        if (c0rxzYp == null || (c1445005lALJIIJ = c0rxzYp.LJIIJ()) == null || (interfaceC1444205l2 = c1445005lALJIIJ.LIZIZ) == null || (result = interfaceC1444205l2.getResult()) == null || (listLIZ = result.LIZ()) == null) {
            return null;
        }
        return (String) C13LP.LJJJLL(listLIZ);
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

    @Override // com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility
    public final List<String> LLILL() {
        Object objNs;
        List<String> listSingletonList;
        C1445005lA c1445005lALJIIJ;
        InterfaceC1444205l2 interfaceC1444205l2;
        InterfaceC1443605kw result;
        List<String> listLIZ;
        if (FcpKmpDecisionExp.LIZ("bottom_button")) {
            C0RXZ c0rxzYp = yp();
            if (c0rxzYp != null && (c1445005lALJIIJ = c0rxzYp.LJIIJ()) != null && (interfaceC1444205l2 = c1445005lALJIIJ.LIZIZ) != null && (result = interfaceC1444205l2.getResult()) != null && (listLIZ = result.LIZ()) != null) {
                objNs = C13LP.LJJJLL(listLIZ);
            }
            return C13BV.INSTANCE;
        }
        objNs = Bp().ns();
        if (objNs != null && (listSingletonList = Collections.singletonList(objNs)) != null) {
            return listSingletonList;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        PriorityProtocol priorityProtocol;
        PriorityProtocol priorityProtocol2;
        C701040Reg c701040Reg;
        FcpNodeProtocol fcpNodeProtocolLJ = null;
        if (FcpKmpDecisionExp.LIZ("bottom_button")) {
            C700170RdH c700170RdH = this.LLJL.LLIZLLLIL;
            if (c700170RdH != null && (c701040Reg = c700170RdH.LIZ) != null) {
                fcpNodeProtocolLJ = c701040Reg.LJ(H3());
            }
            if ((fcpNodeProtocolLJ instanceof PriorityProtocol) && (priorityProtocol2 = (PriorityProtocol) fcpNodeProtocolLJ) != null) {
                return priorityProtocol2.YZ();
            }
        }
        FcpNodeProtocol fcpNodeProtocol = Bp().Aa().get(H3());
        if (!(fcpNodeProtocol instanceof PriorityProtocol) || (priorityProtocol = (PriorityProtocol) fcpNodeProtocol) == null) {
            return false;
        }
        return priorityProtocol.YZ();
    }

    @Override // X.InterfaceC697220RWm
    public final String o1() {
        return this.LLJL.LLILZIL;
    }

    public final C0QSJ op() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLLII;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CellInteractAreaScope.class});
        this.LLLLII = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final View sp() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C708910RrN c708910RrN = new C708910RrN(LJJIJL().getContext(), null);
        C786410Ut5.i7(c708910RrN, new ViewGroup.MarginLayoutParams(-1, -2));
        c708910RrN.setId(LLLLIILL);
        this.LLLFFI.getValue(this, LLLLIIL[0]).getClass();
        ViewGroup.LayoutParams layoutParams = c708910RrN.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            C01GW<Integer> c01gw = ConstraintSizeVM.LL;
            int iLIZIZ = C693770RJf.LIZIZ();
            int marginStart = marginLayoutParams.getMarginStart();
            int i = marginLayoutParams.topMargin;
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = i;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = iLIZIZ;
        }
        return c708910RrN;
    }

    public final C0RXZ yp() {
        return (C0RXZ) this.LLLF.getValue();
    }

    public final IFcpPolicyAbility zp() {
        return (IFcpPolicyAbility) this.LLJLL.getValue();
    }

    public final FeedComponentPriorityData Ap() {
        C0RKW c0rkwQR1;
        FeedComponentPriorityData feedComponentPriorityDataLIZ;
        if (!C299830Bp7.LIZ()) {
            C0RKW c0rkwLIZIZ = C697660RYe.LIZIZ(this);
            this.LLLILZJ = c0rkwLIZIZ;
            if (c0rkwLIZIZ != null) {
                return c0rkwLIZIZ.LIZ();
            }
            return null;
        }
        FcpProtocolAbility fcpProtocolAbility = this.LLLJL;
        if (fcpProtocolAbility == null) {
            synchronized (this) {
                fcpProtocolAbility = this.LLLJL;
                if (fcpProtocolAbility == null) {
                    C0QSJ c0qsjOp = op();
                    fcpProtocolAbility = c0qsjOp != null ? (FcpProtocolAbility) c0qsjOp.getAbility(FcpProtocolAbility.class) : null;
                    this.LLLJL = fcpProtocolAbility;
                    if (fcpProtocolAbility == null) {
                        c0rkwQR1 = null;
                    }
                }
            }
            c0rkwQR1 = fcpProtocolAbility.qR1();
        } else {
            c0rkwQR1 = fcpProtocolAbility.qR1();
        }
        this.LLLILZ = c0rkwQR1;
        if (c0rkwQR1 != null && (feedComponentPriorityDataLIZ = c0rkwQR1.LIZ()) != null) {
            return feedComponentPriorityDataLIZ;
        }
        C0RKW c0rkwLIZIZ2 = C697660RYe.LIZIZ(this);
        this.LLLILZJ = c0rkwLIZIZ2;
        if (c0rkwLIZIZ2 != null) {
            return c0rkwLIZIZ2.LIZ();
        }
        return null;
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

    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer.LJL():void");
    }

    @Override // com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility
    public final List<String> LLLZIIL() {
        return Bp().is();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return Qm0();
    }

    @Override // X.C0RY3
    public final C0S4B a7() {
        C701040Reg c701040Reg;
        String strH3 = H3();
        FcpNodeProtocol fcpNodeProtocol = null;
        if (strH3 == null || strH3.length() == 0) {
            return null;
        }
        if (FcpKmpDecisionExp.LIZ("bottom_button")) {
            C700170RdH c700170RdH = this.LLJL.LLIZLLLIL;
            FcpNodeProtocol fcpNodeProtocolLJ = (c700170RdH == null || (c701040Reg = c700170RdH.LIZ) == null) ? null : c701040Reg.LJ(H3());
            if (fcpNodeProtocolLJ instanceof PriorityProtocol) {
                fcpNodeProtocol = fcpNodeProtocolLJ;
            }
        } else {
            FcpNodeProtocol fcpNodeProtocol2 = Bp().Aa().get(H3());
            if (fcpNodeProtocol2 instanceof PriorityProtocol) {
                fcpNodeProtocol = fcpNodeProtocol2;
            }
        }
        return C0S41.LJI(fcpNodeProtocol);
    }

    @Override // X.C0RUJ
    public final void lj() {
        C0RY5 c0ry5;
        InterfaceC697230RWn interfaceC697230RWnBp = Bp();
        if (!(interfaceC697230RWnBp instanceof C0RY5) || (c0ry5 = (C0RY5) interfaceC697230RWnBp) == null) {
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

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp() {
        /*
            r3 = this;
            r0 = 72069(0x11985, float:1.0099E-40)
            boolean r2 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            java.lang.String r1 = "bottom_button"
            boolean r0 = com.ss.android.ugc.feed.platform.ab.FcpKmpDecisionExp.LIZ(r1)
            if (r0 != 0) goto L1a
            com.ss.android.ugc.feed.platform.ab.FcpKmpCrossValidationExp r0 = com.ss.android.ugc.feed.platform.ab.FcpKmpCrossValidationExp.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.feed.platform.ab.FcpKmpCrossValidationExp.LIZ(r1)
            if (r0 == 0) goto L23
        L1a:
            X.0RXZ r0 = r3.yp()
            if (r0 == 0) goto L23
            r0.LJIIIIZZ()
        L23:
            X.0RWw r0 = new X.0RWw
            r0.<init>()
            X.C2487409ou.LIZJ(r0)
            if (r2 == 0) goto L30
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer.tp():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unBind() {
        /*
            r6 = this;
            long r1 = X.C0RQN.LJFF()
            X.0RWn r0 = r6.Bp()
            r0.reset()
            java.lang.String r3 = "bottom_button"
            boolean r0 = com.ss.android.ugc.feed.platform.ab.FcpKmpDecisionExp.LIZ(r3)
            if (r0 != 0) goto L1e
            com.ss.android.ugc.feed.platform.ab.FcpKmpCrossValidationExp r0 = com.ss.android.ugc.feed.platform.ab.FcpKmpCrossValidationExp.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.feed.platform.ab.FcpKmpCrossValidationExp.LIZ(r3)
            if (r0 == 0) goto L30
        L1e:
            X.0RXZ r0 = r6.yp()
            if (r0 == 0) goto L27
            r0.LIZJ()
        L27:
            X.0RXZ r0 = r6.yp()
            if (r0 == 0) goto L30
            r0.reset()
        L30:
            X.0R8b r0 = r6.jm()
            X.0RJN r0 = r0.LIZIZ()
            r5 = 0
            if (r0 == 0) goto L7b
            X.19EG r4 = r0.LIZ()
        L3f:
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.LL
        L45:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r3 = r0.mEventType
            X.0Sb3 r0 = r6.LLJI
            if (r0 == 0) goto L77
            java.lang.Object r0 = r0.LL
        L4f:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = X.C0RR7.LIZIZ(r4, r0, r3)
            if (r0 == 0) goto L6b
            android.view.View r3 = r6.LJJIJL()
            r0 = 2131368232(0x7f0a1928, float:1.8356408E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L6b
            X.C694320RLi.LIZ(r0, r5)
        L6b:
            boolean r0 = X.C715260S3w.LIZJ()
            if (r0 == 0) goto L76
            X.0RWu r0 = X.EnumC697300RWu.M_UNBIND
            X.C0RQN.LIZLLL(r6, r0, r1)
        L76:
            return
        L77:
            r0 = r5
            goto L4f
        L79:
            r0 = r5
            goto L45
        L7b:
            r4 = r5
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer.unBind():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C700450Rdj vN0() {
        /*
            r4 = this;
            java.lang.String r3 = r4.H3()
            r2 = 0
            if (r3 == 0) goto L29
            java.lang.String r0 = "bottom_button"
            boolean r0 = com.ss.android.ugc.feed.platform.ab.FcpKmpDecisionExp.LIZ(r0)
            if (r0 == 0) goto L2c
            X.0RfD r0 = r4.LLJL
            X.0RdH r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L2a
            X.0Reg r0 = r0.LIZ
            if (r0 == 0) goto L2a
            com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol r1 = r0.LJ(r3)
        L1d:
            boolean r0 = r1 instanceof com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
            if (r0 == 0) goto L2c
            com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol r1 = (com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol) r1
            if (r1 == 0) goto L2c
        L25:
            X.0Rdj r2 = r1.Ke1()
        L29:
            return r2
        L2a:
            r1 = r2
            goto L1d
        L2c:
            X.0RWn r0 = r4.Bp()
            java.util.Map r0 = r0.Aa()
            java.lang.Object r1 = r0.get(r3)
            boolean r0 = r1 instanceof com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
            if (r0 == 0) goto L29
            com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol r1 = (com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol) r1
            if (r1 == 0) goto L29
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer.vN0():X.0Rdj");
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return this.LLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bh2(boolean r13) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer.Bh2(boolean):void");
    }

    public final void Ep(boolean z) {
        C700950ReX c700950ReXLIZIZ;
        if (z) {
            gg(new C700260RdQ(C0RXO.LIZ(H3(), "outreach", C2097608Jq.LJ()), C701320Rf8.LIZ, false, new InterfaceC702410Rgt() { // from class: X.0RXQ
                @Override // X.InterfaceC702410Rgt
                public final void hl() {
                }

                @Override // X.InterfaceC702410Rgt
                public final void vg(C700950ReX c700950ReX) {
                    C0RWZ c0rwz = this.LL.LLJLLL;
                    if (c0rwz != null) {
                        c0rwz.qa(c700950ReX);
                    }
                }
            }, 4));
            return;
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        C0RWZ c0rwz = this.LLJLLL;
        if (c0rwz == null) {
            return;
        }
        C700170RdH c700170RdH = this.LLJL.LLIZLLLIL;
        if (c700170RdH != null) {
            c700950ReXLIZIZ = C700960ReY.LIZIZ(c700170RdH);
        } else {
            c700950ReXLIZIZ = null;
        }
        c0rwz.qa(c700950ReXLIZIZ);
    }

    public final void Gp(View view) {
        C19EG c19egLIZ;
        Object obj;
        Object obj2;
        C19EG c19egLIZ2;
        Object obj3;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        Object obj4 = null;
        if (c0rjnLIZIZ != null) {
            c19egLIZ = c0rjnLIZIZ.LIZ();
        } else {
            c19egLIZ = null;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String str = ((VideoItemParams) obj).mEventType;
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        if (C0RR7.LIZIZ(c19egLIZ, ((VideoItemParams) obj2).getAweme(), str)) {
            C01GW c01gw = C695730RQt.LIZ;
            C0RJN c0rjnLIZIZ2 = jm().LIZIZ();
            if (c0rjnLIZIZ2 != null) {
                c19egLIZ2 = c0rjnLIZIZ2.LIZ();
            } else {
                c19egLIZ2 = null;
            }
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            } else {
                obj3 = null;
            }
            String str2 = ((VideoItemParams) obj3).mEventType;
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            }
            boolean zLIZIZ = C695730RQt.LIZIZ(c19egLIZ2, ((VideoItemParams) obj4).getAweme(), str2);
            if ((view != null && view.getId() == R.id.ekp) || (view = LJJIJL().findViewById(R.id.ekp)) != null) {
                if (zLIZIZ) {
                    ComponentMarginConfig componentMarginConfigLIZJ = C695740RQu.LIZJ(LJJIJL(), true);
                    if (componentMarginConfigLIZJ != null) {
                        C01GW c01gw2 = C694320RLi.LIZ;
                        C694320RLi.LIZJ(view, componentMarginConfigLIZJ, true);
                        return;
                    }
                    return;
                }
                C01GW c01gw3 = C694320RLi.LIZ;
                C694320RLi.LIZIZ(C694320RLi.LIZJ, view, true);
            }
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
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0RWn] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void VA2(boolean z) {
        Object obj;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), PriorityProtocol.class, false);
        ?? r3 = 0;
        if (listLIZIZ != null) {
            ?? r7 = 0;
            for (?? r5 : (ArrayList) listLIZIZ) {
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                VideoItemParams videoItemParams = (VideoItemParams) obj;
                if (Intrinsics.LJFF("bottom_button_share_info", r5.zg())) {
                    if (r5 instanceof BaseCellSlotComponent) {
                        ((BaseCellSlotComponent) r5).up(videoItemParams);
                    } else if (r5 instanceof BaseCellContentComponent) {
                        if (r5 instanceof BaseCellTriggerComponent) {
                            ((ReusedAssem) r5).LLILLJJLI = ur(videoItemParams);
                        }
                        ((BaseCellContentComponent) r5).up(videoItemParams);
                    }
                    r7 = r5;
                }
            }
            r3 = r7;
        }
        Bp().js(r3, false, true);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        Set<String> set;
        long jLJFF = C0RQN.LJFF();
        boolean z = false;
        if ((!C300940Bqu.LIZ() && !((Boolean) C276950AtJ.LIZ.getValue()).booleanValue()) || ((set = this.LLLI) != null && !set.isEmpty())) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ISACTIVE, jLJFF);
        }
        if (!(boolValueOf instanceof Boolean) || boolValueOf == null) {
            return true;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* JADX INFO: renamed from: ip */
    public final void tp(VideoItemParams videoItemParams) {
        long jLJFF = C0RQN.LJFF();
        C697790RYr c697790RYr = C697790RYr.LIZ;
        String aid = videoItemParams.getAweme().getAid();
        EnumC697290RWt enumC697290RWt = EnumC697290RWt.P_BOTTOM_BUTTON_CREATE;
        String start = enumC697290RWt.getStart();
        EnumC697820RYu enumC697820RYu = EnumC697820RYu.PUTIFABSENT;
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid, start, null, enumC697820RYu, null, null);
        C2765015f.LIZJ("FeedBottomButtonContainer.onBind", new C0RXB(videoItemParams, this));
        this.LLJJLIIIJLLLLLLLZ = videoItemParams;
        Gp(null);
        if (this.LLJLLIL) {
            C265820AbM.LIZ.getClass();
            if (C265820AbM.LIZ()) {
                this.LLJLLIL = false;
                C0RJE.LIZLLL(this, (VideoViewModel) this.LLLFZ.getValue(), new AwS555S0100000_11(this, 1298));
            }
        }
        C2765015f.LIZ("FeedBottomButtonContainer.onBind", new C0RXC(videoItemParams, this));
        String aid2 = videoItemParams.getAweme().getAid();
        String end = enumC697290RWt.getEnd();
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid2, end, null, null, null, null);
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONBIND, jLJFF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0RfF] */
    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    public final ConditionData up(String str) {
        Object obj;
        Object obj2;
        Map<String, ConditionData> map;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        StandardComponentInfo standardComponentInfo = ((VideoItemParams) obj).getAweme().getStandardComponentInfo();
        if (standardComponentInfo == null) {
            return null;
        }
        String str2 = (String) this.LLLIIII.getValue();
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        ClientStandardModel clientModel = standardComponentInfo.getClientModel(C0RZ5.LIZ(str2, AwemeExtKt.getGenreType(((VideoItemParams) obj2).getAweme())), "standardized_bottom_button");
        if (clientModel == null || (map = clientModel.componentsConditionMap) == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
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
            r4 = 0
            if (r0 == 0) goto L7b
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
            r5 = 0
            if (r6 == 0) goto L59
            X.0Sb3 r0 = r7.LLJI
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.LL
        L2e:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            r0.getAid()
            kotlin.jvm.internal.AwS96S1000000_11 r3 = new kotlin.jvm.internal.AwS96S1000000_11
            r0 = 5
            r3.<init>(r6, r0)
            X.C0T6L.LIZLLL()
            android.view.View r0 = r7.LJJIJL()
            X.C786410Ut5.LJLLLLLL(r5, r0)
            X.01GW r0 = r7.LLLII
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility r3 = (com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility) r3
            if (r3 == 0) goto L59
            r0 = 1
            r3.CL(r6, r7, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L6d
        L59:
            X.01GW r0 = r7.LLLII
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility r0 = (com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility) r0
            if (r0 == 0) goto L66
            r0.CL(r4, r7, r5)
        L66:
            X.0RWZ r0 = r7.LLJLLL
            if (r0 == 0) goto L6d
            r0.qa(r4)
        L6d:
            boolean r0 = X.C715260S3w.LIZJ()
            if (r0 == 0) goto L78
            X.0RWu r0 = X.EnumC697300RWu.M_ONFCPPOLICY
            X.C0RQN.LIZLLL(r7, r0, r1)
        L78:
            return
        L79:
            r0 = r4
            goto L2e
        L7b:
            r0 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer.vg(X.0ReX):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        InteractAreaCommonAbility interactAreaCommonAbility;
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
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
        if (iFeedDebugService != null) {
            if (aweme != null) {
                aweme.getAid();
            }
            iFeedDebugService.LJJIJ();
        }
        if (!TextUtils.isEmpty(H3()) && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLLII.getValue()) != null) {
            interactAreaCommonAbility.zB1(this);
        }
        if (C715260S3w.LIZJ()) {
            C0RQN.LIZLLL(this, EnumC697300RWu.M_ONSELECTED, jLJFF);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void MJ(PriorityProtocol priorityProtocol, Function1<? super View, Unit> function1) {
        Vx0(priorityProtocol, function1, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
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
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void nw0(PriorityProtocol priorityProtocol, boolean z) {
        Bp().ks(priorityProtocol, z, true, false);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Vx0(PriorityProtocol priorityProtocol, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12) {
        Bp().ls(priorityProtocol, new C695940RRo(function12, this, function1), Boolean.valueOf(priorityProtocol.oh()));
    }
}
