package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C0OLV;
import X.C0OPX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C13E8;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C293310Beb;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C639090P4x;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.EnumC619900OTc;
import X.InterfaceC0148002o;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC619970OTj;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinTooltipAssem extends AbstractC738140SxQ implements BulletinTooltipAbility, InterfaceC724530SbT, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public boolean LL;
    public final Map<EnumC619900OTc, InterfaceC619970OTj> LLILLJJLI = new LinkedHashMap();
    public final C13E8<InterfaceC619970OTj> LLILLL = new C13E8<>();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(135));
    public final AssemVMLazy LLILZIL;
    public final C1559260qg8 LLILZLL;
    public final C736950SvV LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinTooltipAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        if (!C293310Beb.LIZJ()) {
            WK0(EnumC619900OTc.COMMENT_ENTRY_TOOLTIP);
        }
        AssemViewModel.asyncSubscribe$default(this.LLIZ.getValue(), new C2217381BqS() { // from class: X.0OMF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILLJJLI;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 128), 28, null);
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        AssemViewModel value = assemVMLazy.getValue();
        selectSubscribe(value, new C2217381BqS() { // from class: X.0OTf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0OTg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0OTh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C619990OTl) obj).LLILLL;
            }
        }, C736820SvI.LIZIZ(value.usedInReusedScene), null, new C639090P4x(this, 2));
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 739292483) {
            return null;
        }
        return this;
    }

    public BulletinTooltipAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 322), AFwS240S0000000_9.get$arr$(194), null, true);
        this.LLILZLL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 320);
        this.LLIZ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(195), new AwS553S0100000_9((AbstractC738140SxQ) this, 323), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    public final void bo() {
        if (this.LL) {
            return;
        }
        for (EnumC619900OTc enumC619900OTc : EnumC619900OTc.values()) {
            InterfaceC619970OTj interfaceC619970OTj = (InterfaceC619970OTj) ((LinkedHashMap) this.LLILLJJLI).get(enumC619900OTc);
            if (interfaceC619970OTj == null) {
                return;
            }
            if (interfaceC619970OTj.isAvailable()) {
                this.LL = true;
                interfaceC619970OTj.q0(new AwS553S0100000_9(this, 318));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m246do() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTooltipDismissed, pending queue size: ");
        sbLIZ.append(this.LLILLL.size());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = false;
        while (!this.LLILLL.isEmpty()) {
            InterfaceC619970OTj interfaceC619970OTjRemoveFirst = this.LLILLL.removeFirst();
            if (interfaceC619970OTjRemoveFirst.isAvailable()) {
                C0OPX.LJII("showing next pending high priority tooltip");
                this.LL = true;
                interfaceC619970OTjRemoveFirst.q0(new AwS553S0100000_9(this, 319));
                return;
            }
            C0OPX.LJII("pending tooltip not available, skip");
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility
    public final void WK0(EnumC619900OTc enumC619900OTc) {
        if (this.LLILLJJLI.containsKey(enumC619900OTc)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerTooltipUnavailable ignored, type: ");
            sbLIZ.append(enumC619900OTc.getTag());
            sbLIZ.append(" already registered");
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("registerTooltipUnavailable, type: ");
        sbLIZ2.append(enumC619900OTc.getTag());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        this.LLILLJJLI.put(enumC619900OTc, (InterfaceC619970OTj) this.LLILZ.getValue());
        bo();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility
    public final void m20(InterfaceC619970OTj interfaceC619970OTj) {
        if (!interfaceC619970OTj.isAvailable()) {
            C0OPX.LJII("showTooltip ignored, tooltip not available");
            return;
        }
        if (!this.LL) {
            AssemVMLazy assemVMLazy = this.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
            if (((BulletinInputStateViewModel) assemVMLazy.getValue()).vQ2()) {
                C0OPX.LJII("showTooltip, showing immediately");
                this.LL = true;
                interfaceC619970OTj.q0(new AwS553S0100000_9(this, 321));
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showTooltip pending, added to queue, queue size: ");
        sbLIZ.append(this.LLILLL.size() + 1);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL.addLast(interfaceC619970OTj);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility
    public final void gA2(EnumC619900OTc enumC619900OTc, InterfaceC619970OTj interfaceC619970OTj) {
        if (this.LLILLJJLI.containsKey(enumC619900OTc)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerTooltip ignored, type: ");
            sbLIZ.append(enumC619900OTc.getTag());
            sbLIZ.append(" already registered");
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("registerTooltip, type: ");
        sbLIZ2.append(enumC619900OTc.getTag());
        sbLIZ2.append(", tooltip: ");
        sbLIZ2.append(interfaceC619970OTj.isAvailable());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        this.LLILLJJLI.put(enumC619900OTc, interfaceC619970OTj);
        bo();
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
