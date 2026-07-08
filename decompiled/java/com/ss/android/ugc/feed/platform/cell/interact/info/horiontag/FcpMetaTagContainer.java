package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0HHT;
import X.C0QSJ;
import X.C0RDX;
import X.C0RJE;
import X.C0RKW;
import X.C0RQ3;
import X.C0RQ6;
import X.C0RQR;
import X.C0RRA;
import X.C0RRS;
import X.C0RS0;
import X.C0RS1;
import X.C0RS2;
import X.C0RS3;
import X.C0RUJ;
import X.C0RWZ;
import X.C0RX0;
import X.C0RX3;
import X.C0RX6;
import X.C0RXA;
import X.C0RXO;
import X.C0RXZ;
import X.C0RY5;
import X.C0RYM;
import X.C0RYN;
import X.C0RZK;
import X.C0S9M;
import X.C0T6L;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C283290B8l;
import X.C283300B8m;
import X.C287400BOg;
import X.C299830Bp7;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C693590RIn;
import X.C695760RQw;
import X.C696020RRw;
import X.C697240RWo;
import X.C697260RWq;
import X.C697330RWx;
import X.C697400RXe;
import X.C697440RXi;
import X.C697470RXl;
import X.C697480RXm;
import X.C697660RYe;
import X.C699500RcC;
import X.C700170RdH;
import X.C700260RdQ;
import X.C700450Rdj;
import X.C700950ReX;
import X.C700960ReY;
import X.C700970ReZ;
import X.C701270Rf3;
import X.C701320Rf8;
import X.C701370RfD;
import X.C705800RmM;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
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
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS111S0100000_11;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoMetaTagProtocol;
import com.ss.android.ugc.feed.platform.container.scope.FcpMetaTagContainerScope;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS289S0300000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS96S1000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpMetaTagContainer extends BaseContainer<VideoMetaTagProtocol, FcpMetaTagContainer> implements PriorityAbility, C0RYM, ComponentPriorityProtocol, C0RUJ, FcpMetaTagAbility, InterfaceC697220RWm, InterfaceC702410Rgt, InterfaceC697640RYc, InterfaceC1554640qYg, InterfaceC737790Swr, C0QSJ, InterfaceC1146704e9 {
    public static final C695760RQw LLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZ;
    public static final int LLLILZJ;
    public final /* synthetic */ C701370RfD LLJL = new C701370RfD();
    public final /* synthetic */ C697240RWo LLJLIL = new C697240RWo();
    public final FcpMetaTagContainer LLJLILLLLZIIL = this;
    public final C01GW LLJLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C697480RXm());
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C0RRS(this));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new C0RX3(this));
    public final C01GW LLJZ = C452501pT.LIZIZ(new C0RRA(this));
    public final AtomicBoolean LLJZIJLIL = new AtomicBoolean(true);
    public boolean LLL;
    public boolean LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public C0RWZ LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public C0RKW LLLII;
    public C0RKW LLLIIII;
    public volatile InteractAreaFunnelAbility LLLIIIIL;
    public volatile FcpProtocolAbility LLLIIIL;
    public InterfaceC665370Q7z LLLIIL;
    public C0QSJ LLLIILIL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0RQw] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FcpMetaTagContainer.class, "interactAreaFunnelAbility", "getInteractAreaFunnelAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/InteractAreaFunnelAbility;", 0);
        C13LE.LIZ.getClass();
        LLLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(FcpMetaTagContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0), new C2217381BqS(FcpMetaTagContainer.class, "fcpProtocolAbility", "getFcpProtocolAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/FcpProtocolAbility;", 0)};
        LLLIL = new Object() { // from class: X.0RQw
        };
        LLLILZJ = R.id.emm;
    }

    @Override // X.InterfaceC697220RWm
    public final void Ah(InterfaceC702410Rgt interfaceC702410Rgt) {
        this.LLJL.Ah(interfaceC702410Rgt);
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
        return "meta_tag";
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
        return "meta_tag";
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
        C687700QyG.LIZ(this, new Class[]{FcpMetaTagContainerScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CellInteractAreaScope.class);
        arrayList.add(FcpMetaTagContainerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(FcpMetaTagContainerScope.class);
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
        if (str.hashCode() != -832245557) {
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

    public final void zp(String str, boolean z) {
        this.LLJLIL.LIZ(str, z);
    }

    public FcpMetaTagContainer() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConstraintSizeVM.class);
        this.LLLFF = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new C0RQR(c19719912DlLIZ), null, new C697470RXl());
        this.LLLFZ = C452501pT.LIZIZ(new C0RS1(this));
        this.LLLI = C452501pT.LIZIZ(new C697260RWq(this));
        N7(new C696020RRw(this, this, new C0RX6(this)), "meta_tag", C0S9M.LIZ(), new C0RS3(this), new C697330RWx(new C697400RXe(this), new C0RS2(this)), new C0RX0(this), null, C0RXA.LL, this, null, new AwS555S0100000_11(this, 1253), new AwS555S0100000_11(this, 1254), null, null, null, null, null);
    }

    @Override // X.InterfaceC697220RWm
    public final C700170RdH J9() {
        return this.LLJL.LLIZLLLIL;
    }

    @Override // X.InterfaceC697220RWm
    public final String o1() {
        return this.LLJL.LLILZIL;
    }

    public final C0QSJ sp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLIILIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{CellInteractAreaScope.class});
        this.LLLIILIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final View tp() {
        C705800RmM c705800RmM = new C705800RmM(LJJIJL().getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c705800RmM);
        c705800RmM.setLayoutParams(marginLayoutParams);
        c705800RmM.setId(R.id.emm);
        this.LLLFF.getValue(this, LLLILZ[1]).getClass();
        ConstraintSizeVM.zQ2(c705800RmM);
        return c705800RmM;
    }

    public final InterfaceC697230RWn yp() {
        return (InterfaceC697230RWn) this.LLLI.getValue();
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
            C0RDX.LIZIZ((InterfaceC691660RBc) it2.next());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility
    public final List<String> LLILL() {
        List<String> listSingletonList;
        String strNs = yp().ns();
        return (strNs == null || (listSingletonList = Collections.singletonList(strNs)) == null) ? C13BV.INSTANCE : listSingletonList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagAbility
    public final List<String> LLLZIIL() {
        return yp().is();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return Qm0();
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

    @Override // X.C0RUJ
    public final void lj() {
        C0RY5 c0ry5;
        InterfaceC697230RWn interfaceC697230RWnYp = yp();
        if (!(interfaceC697230RWnYp instanceof C0RY5) || (c0ry5 = (C0RY5) interfaceC697230RWnYp) == null) {
            return;
        }
        c0ry5.wa(false);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        if (!((Boolean) C283290B8l.LIZ.getValue()).booleanValue()) {
            C1558520qew.LIZLLL(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        yp().reset();
        this.LLL = false;
    }

    public final FeedComponentPriorityData up() {
        C0RKW c0rkwQR1;
        FeedComponentPriorityData feedComponentPriorityDataLIZ;
        if (!C299830Bp7.LIZ()) {
            C0RKW c0rkwLIZIZ = C697660RYe.LIZIZ(this);
            this.LLLIIII = c0rkwLIZIZ;
            if (c0rkwLIZIZ != null) {
                return c0rkwLIZIZ.LIZ();
            }
            return null;
        }
        FcpProtocolAbility fcpProtocolAbility = this.LLLIIIL;
        if (fcpProtocolAbility == null) {
            synchronized (this) {
                fcpProtocolAbility = this.LLLIIIL;
                if (fcpProtocolAbility == null) {
                    C0QSJ c0qsjSp = sp();
                    fcpProtocolAbility = c0qsjSp != null ? (FcpProtocolAbility) c0qsjSp.getAbility(FcpProtocolAbility.class) : null;
                    this.LLLIIIL = fcpProtocolAbility;
                    if (fcpProtocolAbility == null) {
                        c0rkwQR1 = null;
                    }
                }
            }
            c0rkwQR1 = fcpProtocolAbility.qR1();
        } else {
            c0rkwQR1 = fcpProtocolAbility.qR1();
        }
        this.LLLII = c0rkwQR1;
        if (c0rkwQR1 != null && (feedComponentPriorityDataLIZ = c0rkwQR1.LIZ()) != null) {
            return feedComponentPriorityDataLIZ;
        }
        C0RKW c0rkwLIZIZ2 = C697660RYe.LIZIZ(this);
        this.LLLIIII = c0rkwLIZIZ2;
        if (c0rkwLIZIZ2 != null) {
            return c0rkwLIZIZ2.LIZ();
        }
        return null;
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

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return C0RQ6.VIDEO_META_TAG_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
        C700950ReX c700950ReXLIZIZ = null;
        zp(null, z);
        if (z) {
            gg(new C700260RdQ(C0RXO.LIZ(H3(), "outreach", C2097608Jq.LJ()), C701320Rf8.LIZ, false, new InterfaceC702410Rgt() { // from class: X.0RXP
                @Override // X.InterfaceC702410Rgt
                public final void hl() {
                }

                @Override // X.InterfaceC702410Rgt
                public final void vg(C700950ReX c700950ReX) {
                    C0RWZ c0rwz = this.LL.LLLFFI;
                    if (c0rwz != null) {
                        c0rwz.qa(c700950ReX);
                    }
                }
            }, 4));
            return;
        }
        C0RWZ c0rwz = this.LLLFFI;
        if (c0rwz == null) {
            return;
        }
        C700170RdH c700170RdH = this.LLJL.LLIZLLLIL;
        if (c700170RdH != null) {
            c700950ReXLIZIZ = C700960ReY.LIZIZ(c700170RdH);
        }
        c0rwz.qa(c700950ReXLIZIZ);
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
                            ((ReusedAssem) r5).LLILLJJLI = C0RQ3.LIZ(videoItemParams);
                        }
                        ((BaseCellContentComponent) r5).up(videoItemParams);
                    }
                    r7 = r5;
                }
            }
            r3 = r7;
        }
        yp().js(r3, false, true);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).unbindAbility(this.LLJLILLLLZIIL, FcpMetaTagAbility.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C0RQ3.LIZ(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* JADX INFO: renamed from: ip */
    public final void tp(VideoItemParams videoItemParams) {
        Object obj;
        this.LLJJLIIIJLLLLLLLZ = videoItemParams;
        if (this.LLJZIJLIL.compareAndSet(true, false) && C287400BOg.LIZ() && this.LLL) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (AwemeBizExtKt.getAwemePosition(((VideoItemParams) obj).getAweme()) == 0 || ((Boolean) C283300B8m.LIZ.getValue()).booleanValue()) {
                yp().ss(true);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC697420RXg interfaceC697420RXgRc1;
        super.onViewCreated(view);
        yp().ts((ViewGroup) LJJIJL(), (C0RS0) this.LLLFZ.getValue(), null);
        IFcpPolicyAbility iFcpPolicyAbility = (IFcpPolicyAbility) this.LLJLLL.getValue();
        if (iFcpPolicyAbility != null && (interfaceC697420RXgRc1 = iFcpPolicyAbility.rc1()) != null) {
            interfaceC697420RXgRc1.LIZ().invoke(new AwS590S0100000_11(this, 9));
        }
        yp().qs();
        Ah(this);
        Ah(new C697440RXi(new AwS555S0100000_11(this, 1255)));
        HandlerHook.viewPost(LJJIJL(), new ARunnableS111S0100000_11(this, 80));
        synchronized (this) {
            if (this.LLLF) {
                return;
            }
            op(new C0RYN(this), this, new AwS555S0100000_11(this, 13));
            C693590RIn.LIZ(this, new AwS377S0200000_11(this, (FcpMetaTagContainer) C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), VideoMetaTagProtocol.class, false), (List<? extends VideoMetaTagProtocol>) 3));
            this.LLLF = true;
            C0RJE.LIZLLL(this, (VideoViewModel) this.LLJLL.getValue(), new AwS555S0100000_11(this, 14));
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{VideoCellScope.class}).bindAbility(this.LLJLILLLLZIIL, FcpMetaTagAbility.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return C0RQ3.LIZ((VideoItemParams) obj);
    }

    @Override // X.InterfaceC702410Rgt
    public final void vg(C700950ReX c700950ReX) {
        Object obj;
        Object obj2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ((VideoItemParams) obj).getAweme().getAid();
        C0T6L.LIZLLL();
        String str = (String) C13LP.LJJJLIIL(Xh().keySet());
        if (str != null) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            ((VideoItemParams) obj2).getAweme().getAid();
            new AwS96S1000000_11(str, 3);
            C0T6L.LIZLLL();
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJZ.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.CL(str, this, true);
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        InteractAreaCommonAbility interactAreaCommonAbility2 = (InteractAreaCommonAbility) this.LLJZ.getValue();
        if (interactAreaCommonAbility2 != null) {
            interactAreaCommonAbility2.CL(null, this, false);
        }
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

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void MJ(PriorityProtocol priorityProtocol, Function1<? super View, Unit> function1) {
        Vx0(priorityProtocol, function1, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
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
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
        yp().reset();
        this.LLL = false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void nw0(PriorityProtocol priorityProtocol, boolean z) {
        yp().ks(priorityProtocol, z, true, false);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Vx0(PriorityProtocol priorityProtocol, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12) {
        yp().ls(priorityProtocol, new AwS289S0300000_11((Function1) function12, (Function1<? super View, Unit>) this, (FcpMetaTagContainer) function1, (Function1<? super View, Unit>) 1), Boolean.valueOf(priorityProtocol.oh()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void op(C0RYN c0ryn, InterfaceC697220RWm interfaceC697220RWm, AwS555S0100000_11 awS555S0100000_11) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        jm();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FcpMetaTagAssem(new AwS545S0100000_1(c0ryn, 1613), interfaceC697220RWm, awS555S0100000_11));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoMetaTagProtocol.class, C1697810uHb.LJIILJJIL(it2.next()));
        }
    }
}
