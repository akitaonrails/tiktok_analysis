package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0ZP4;
import X.C1157110gDV;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1340820kzo;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.EnumC1342430l2P;
import X.InterfaceC0148002o;
import X.InterfaceC1342980l3I;
import X.InterfaceC1555100qZQ;
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
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class StatusFooterCell extends PowerCell<C1157110gDV> implements InterfaceC724530SbT, InterfaceC1342980l3I {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public C1749280vcc LL;
    public final AssemVMLazy LLILLJJLI;
    public CommentContextSource LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StatusFooterCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public StatusFooterCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 452);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(115);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 463), awS565S0100000_21, AFwS209S0000000_21.get$arr$(197), new AwS565S0100000_21((C03K6) this, 438), new AwS565S0100000_21((C03K6) this, 440), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 442), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 444), null, new AwS565S0100000_21((C03K6) this, 445));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 439);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 441);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 443);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 32));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 446);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 447);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 448);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 449);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 450);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 451), awS565S0100000_21, AFwS209S0000000_21.get$arr$(198), new AwS565S0100000_21((C03K6) this, 453), new AwS565S0100000_21((C03K6) this, 454), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 455), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 456), null, new AwS565S0100000_21((C03K6) this, 457));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 458), awS565S0100000_21, AFwS209S0000000_21.get$arr$(199), new AwS565S0100000_21((C03K6) this, 459), new AwS565S0100000_21((C03K6) this, 460), new AwS565S0100000_21((C03K6) this, 461), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 462));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    public final CommentContextSource I5() {
        if (this.LLILLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", CommentContextSource.class, null);
            this.LLILLL = interfaceC1555100qZQLIZIZ != null ? (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLL;
    }

    public final CommentListAssemVM L5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (CommentListAssemVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C1749280vcc) this.itemView.findViewById(R.id.w28);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0237  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r9) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.commentlist.powercell.StatusFooterCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a3d, viewGroup, false);
    }

    @Override // X.InterfaceC1342980l3I
    public final void vd(boolean z, boolean z2, C1340820kzo c1340820kzo) {
        C1749280vcc c1749280vcc = this.LL;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJIIIIZZ = L5().IQ2(this.itemView.getContext(), EnumC1342430l2P.COMMENT_EMPTY);
            c1749280vcc.setStatus(c1722300uv6);
        }
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
