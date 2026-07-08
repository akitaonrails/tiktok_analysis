package com.ss.android.ugc.feed.platform.cell.interact.decision;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0RKW;
import X.C0RXA;
import X.C0RXZ;
import X.C0S9M;
import X.C452501pT;
import X.C694180RKu;
import X.C696020RRw;
import X.C697330RWx;
import X.C697440RXi;
import X.C699500RcC;
import X.C700170RdH;
import X.C700260RdQ;
import X.C700450Rdj;
import X.C700970ReZ;
import X.C701270Rf3;
import X.C701370RfD;
import X.InterfaceC1445905lJ;
import X.InterfaceC1449905lx;
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
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseFcpDecisionContainer<RECEIVER extends C03H5> extends BaseCellContentComponent<RECEIVER> implements ComponentPriorityProtocol, InterfaceC702410Rgt, InterfaceC697220RWm {
    public final /* synthetic */ C701370RfD LLJJJJLIIL = new C701370RfD();
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11((BaseFcpDecisionContainer) this, 1227));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11((BaseFcpDecisionContainer) this, 1229));
    public final C01GW LLJL;
    public C0RKW LLJLIL;
    public C0RKW LLJLILLLLZIIL;

    @Override // X.InterfaceC697220RWm
    public final void Ah(InterfaceC702410Rgt interfaceC702410Rgt) {
        this.LLJJJJLIIL.Ah(interfaceC702410Rgt);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // X.InterfaceC697220RWm
    public final C700970ReZ In() {
        return this.LLJJJJLIIL.In();
    }

    @Override // X.InterfaceC697220RWm
    public final void N7(Function1<? super C700170RdH, ? extends InterfaceC695090ROh> function1, String str, ForkJoinPool forkJoinPool, Function0<FeedComponentPriorityData> function0, InterfaceC700020Rd2<?> interfaceC700020Rd2, Function0<? extends List<String>> function02, Function1<? super FcpNodeProtocol, Boolean> function12, Executor executor, InterfaceC697640RYc interfaceC697640RYc, Function0<Boolean> function03, Function0<? extends InterfaceC699620RcO> function04, Function0<? extends InterfaceC699200Rbi<?>> function05, InterfaceC700280RdS interfaceC700280RdS, InterfaceC700270RdR interfaceC700270RdR, AbstractC738140SxQ abstractC738140SxQ, FcpNodeProtocol fcpNodeProtocol, Function0<? extends C0RXZ> function06) {
        this.LLJJJJLIIL.N7(function1, str, forkJoinPool, function0, interfaceC700020Rd2, function02, function12, executor, interfaceC697640RYc, function03, function04, function05, interfaceC700280RdS, interfaceC700270RdR, abstractC738140SxQ, fcpNodeProtocol, function06);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> Td() {
        return this.LLJJJJLIIL.Td();
    }

    @Override // X.InterfaceC697220RWm
    public final void U(Function1<? super InterfaceC1449905lx<C701270Rf3>, ? extends Function1<? super Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>, ? extends Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>>>[] function1Arr, Function1<? super InterfaceC703670Riv<C701270Rf3>, ? extends Function1<? super Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, ? extends Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>>>... function1Arr2) {
        this.LLJJJJLIIL.U(function1Arr, function1Arr2);
    }

    @Override // X.InterfaceC697220RWm
    public final void Xg(InterfaceC702410Rgt interfaceC702410Rgt) {
        this.LLJJJJLIIL.Xg(interfaceC702410Rgt);
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> Xh() {
        return this.LLJJJJLIIL.Xh();
    }

    @Override // X.InterfaceC697220RWm
    public final C0RXZ ca() {
        return this.LLJJJJLIIL.ca();
    }

    @Override // X.InterfaceC697220RWm
    public final void gg(C700260RdQ c700260RdQ) {
        this.LLJJJJLIIL.gg(c700260RdQ);
    }

    @Override // X.InterfaceC702410Rgt
    public final void hl() {
    }

    @Override // X.InterfaceC697220RWm
    public final C0RXZ li() {
        return this.LLJJJJLIIL.li();
    }

    @Override // X.InterfaceC697220RWm
    public final void lm() {
        this.LLJJJJLIIL.lm();
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // X.InterfaceC697220RWm
    public final void ol() {
        this.LLJJJJLIIL.ol();
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> q6() {
        return this.LLJJJJLIIL.q6();
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
        return this.LLJJJJLIIL.xg();
    }

    @Override // X.InterfaceC697220RWm
    public final void zf() {
        this.LLJJJJLIIL.zf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseFcpDecisionContainer() {
        N7(new C696020RRw(this, this, null), C694180RKu.LIZ(this), C0S9M.LIZ(), new AwS555S0100000_11((BaseFcpDecisionContainer) this, 1222), new C697330RWx(new AwS555S0100000_11((BaseFcpDecisionContainer) this, 1223), null), new AwS555S0100000_11((BaseFcpDecisionContainer) this, 1224), null, C0RXA.LL, this instanceof InterfaceC697640RYc ? (InterfaceC697640RYc) this : null, null, new AwS555S0100000_11((BaseFcpDecisionContainer) this, 1225), new AwS555S0100000_11((BaseFcpDecisionContainer) this, 1226), null, null, null, null, null);
        this.LLJL = C452501pT.LIZIZ(new AwS555S0100000_11((BaseFcpDecisionContainer) this, 1228));
    }

    @Override // X.InterfaceC697220RWm
    public final C700170RdH J9() {
        return this.LLJJJJLIIL.LLIZLLLIL;
    }

    @Override // X.InterfaceC697220RWm
    public final String o1() {
        return this.LLJJJJLIIL.LLILZIL;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public void unBind() {
        lm();
        ol();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public void Vo() {
        Xg(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        InterfaceC697420RXg interfaceC697420RXgRc1;
        U(null, new Function1[0]);
        Ah(this);
        Ah(new C697440RXi(new AwS555S0100000_11((BaseFcpDecisionContainer) this, 1230)));
        IFcpPolicyAbility iFcpPolicyAbility = (IFcpPolicyAbility) this.LLJJL.getValue();
        if (iFcpPolicyAbility != null && (interfaceC697420RXgRc1 = iFcpPolicyAbility.rc1()) != null) {
            interfaceC697420RXgRc1.LIZ().invoke(new AwS590S0100000_11((BaseFcpDecisionContainer) this, (BaseFcpDecisionContainer<C03H5>) 554));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
