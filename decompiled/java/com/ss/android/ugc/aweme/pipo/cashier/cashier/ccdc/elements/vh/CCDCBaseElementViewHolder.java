package com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh;

import X.AbstractC1710370ubr;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1710770ucV;
import X.C1711910ueL;
import X.C1712070ueb;
import X.C1722120uuo;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C21569319b9;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public abstract class CCDCBaseElementViewHolder<T extends AbstractC1710370ubr, V extends C1711910ueL> extends PowerCell<T> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final AssemVMLazy LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCBaseElementViewHolder.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/pipo/cashier/cashier/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract V I5(ViewGroup viewGroup);

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

    public CCDCBaseElementViewHolder() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 991);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(402);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 1002), awS570S0100000_26, AFwS215S0000000_26.get$arr$(227), new AwS570S0100000_26((C03K6) this, 977), new AwS570S0100000_26((C03K6) this, 979), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 981), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 983), null, new AwS570S0100000_26((C03K6) this, 984));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 978);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 980);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 982);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 50));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 985);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 986);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 987);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 988);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 989);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 990), awS570S0100000_26, AFwS215S0000000_26.get$arr$(225), new AwS570S0100000_26((C03K6) this, 992), new AwS570S0100000_26((C03K6) this, 993), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 994), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 995), null, new AwS570S0100000_26((C03K6) this, 996));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 997), awS570S0100000_26, AFwS215S0000000_26.get$arr$(226), new AwS570S0100000_26((C03K6) this, 998), new AwS570S0100000_26((C03K6) this, 999), new AwS570S0100000_26((C03K6) this, LSPassThroughRecordSizeConfig.DEFAULT), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 1001));
        }
        this.LL = assemVMLazy;
    }

    public final CCDCAddCardViewModel N5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        if (r3.length() != 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String L5(T r8) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.elements.vh.CCDCBaseElementViewHolder.L5(X.0ubr):java.lang.String");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return I5(viewGroup);
    }

    public final void P5(T t, V v) {
        v.LIZIZ();
        C1712070ueb c1712070ueb = new Object() { // from class: X.0ueb
        };
        CCDCAddCardViewModel cCDCAddCardViewModelN5 = N5();
        c1712070ueb.getClass();
        v.LIZJ(t.LIZ().LJFF);
        cCDCAddCardViewModelN5.LLJILJILJ.put(t.LIZIZ(), new AwS605S0100000_26(v, 537));
    }

    public static void R5(CCDCBaseElementViewHolder cCDCBaseElementViewHolder, int i, int i2, int i3) {
        int iLIZJ = i2;
        int iLIZJ2 = i;
        if ((i3 & 1) != 0) {
            iLIZJ2 = C1722120uuo.LIZJ(16);
        }
        if ((i3 & 2) != 0) {
            iLIZJ = C1722120uuo.LIZJ(16);
        }
        cCDCBaseElementViewHolder.getClass();
        C1710770ucV.LIZ(cCDCBaseElementViewHolder.itemView, new C21569319b9(C1722120uuo.LIZJ(24), iLIZJ, iLIZJ2, 48, true, 232));
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
