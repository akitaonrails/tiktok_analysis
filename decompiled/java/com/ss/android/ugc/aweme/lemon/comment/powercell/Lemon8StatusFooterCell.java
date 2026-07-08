package com.ss.android.ugc.aweme.lemon.comment.powercell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0H9H;
import X.C0ZP4;
import X.C1157060gDQ;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12ES;
import X.C1343350l3t;
import X.C1388190mED;
import X.C13LE;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C1893080zMY;
import X.C1913380ztI;
import X.C19474211Gy;
import X.C1954807lC;
import X.C19719912Dl;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1343330l3r;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM;
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
public final class Lemon8StatusFooterCell extends PowerCell<C1157060gDQ> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public C1749280vcc LL;
    public final AssemVMLazy LLILLJJLI;
    public EnumC1343330l3r LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(Lemon8StatusFooterCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/lemon/comment/viewmodel/CommentListAssemVM;", 0);
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

    public Lemon8StatusFooterCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 664);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(182);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 675), awS565S0100000_21, AFwS209S0000000_21.get$arr$(285), new AwS565S0100000_21((C03K6) this, 650), new AwS565S0100000_21((C03K6) this, 652), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 654), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 656), null, new AwS565S0100000_21((C03K6) this, 657));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 651);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 653);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 655);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 43));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 658);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 659);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 660);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 661);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 662);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 663), awS565S0100000_21, AFwS209S0000000_21.get$arr$(286), new AwS565S0100000_21((C03K6) this, 665), new AwS565S0100000_21((C03K6) this, 666), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 667), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 668), null, new AwS565S0100000_21((C03K6) this, 669));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 670), awS565S0100000_21, AFwS209S0000000_21.get$arr$(287), new AwS565S0100000_21((C03K6) this, 671), new AwS565S0100000_21((C03K6) this, 672), new AwS565S0100000_21((C03K6) this, 673), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 674));
        }
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = EnumC1343330l3r.DEFAULT;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C1749280vcc) this.itemView.findViewById(R.id.w28);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1749280vcc c1749280vcc;
        super.onViewAttachedToWindow();
        if (this.LLILLL != EnumC1343330l3r.LOADING || (c1749280vcc = this.LL) == null) {
            return;
        }
        c1749280vcc.LJ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Activity activityLIZ;
        ViewGroup.LayoutParams layoutParams3;
        C1157060gDQ c1157060gDQ = (C1157060gDQ) interfaceC1891350zJl;
        this.LLILLL = c1157060gDQ.LL.LIZ;
        C1749280vcc c1749280vcc = this.LL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
        }
        switch (C1343350l3t.LIZ[c1157060gDQ.LL.LIZ.ordinal()]) {
            case 1:
                return;
            case 2:
                C1749280vcc c1749280vcc2 = this.LL;
                if (c1749280vcc2 != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc2, 8);
                    return;
                }
                return;
            case 3:
                C1749280vcc c1749280vcc3 = this.LL;
                if (c1749280vcc3 != null && (layoutParams = c1749280vcc3.getLayoutParams()) != null) {
                    layoutParams.height = (int) C12ES.LIZJ(52.0f, this.itemView.getContext());
                }
                C1749280vcc c1749280vcc4 = this.LL;
                if (c1749280vcc4 != null) {
                    c1749280vcc4.LJ();
                    return;
                }
                return;
            case 4:
                C1749280vcc c1749280vcc5 = this.LL;
                if (c1749280vcc5 != null && (layoutParams2 = c1749280vcc5.getLayoutParams()) != null) {
                    layoutParams2.height = (int) C12ES.LIZJ(52.0f, this.itemView.getContext());
                }
                C1749280vcc c1749280vcc6 = this.LL;
                if (c1749280vcc6 != null) {
                    c1749280vcc6.setTopMargin(C12ES.LIZJ(20.0f, this.itemView.getContext()));
                }
                C1749280vcc c1749280vcc7 = this.LL;
                if (c1749280vcc7 != null) {
                    C0H9H.LIZJ((int) C12ES.LIZJ(32.0f, this.itemView.getContext()), c1749280vcc7);
                }
                C1749280vcc c1749280vcc8 = this.LL;
                if (c1749280vcc8 != null) {
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    AssemVMLazy assemVMLazy = this.LLILLJJLI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
                    assemVMLazy.getValue();
                    c1722300uv6.LJIIIIZZ = CommentListAssemVM.zQ2(this.itemView.getContext(), EnumC1343330l3r.COMMENT_EMPTY);
                    c1749280vcc8.setStatus(c1722300uv6);
                    return;
                }
                return;
            case 5:
                C1749280vcc c1749280vcc9 = this.LL;
                if (c1749280vcc9 != null && (layoutParams3 = c1749280vcc9.getLayoutParams()) != null) {
                    layoutParams3.height = (int) C12ES.LIZJ(252.0f, this.itemView.getContext());
                }
                C1913380ztI c1913380ztI = C1913380ztI.LLILLJJLI;
                if (c1913380ztI.isStandardUIEnable()) {
                    C1749280vcc c1749280vcc10 = this.LL;
                    if (c1749280vcc10 != null) {
                        c1913380ztI.setStatusView(c1749280vcc10, "comment_list_page", new AwS565S0100000_21(this, 1482), c1157060gDQ.LLILLJJLI);
                    }
                    Context context = getContext();
                    if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                        c1913380ztI.triggerNetworkTips(activityLIZ, "comment_list_page", (Exception) null, this.LL);
                        return;
                    }
                    return;
                }
                C1749280vcc c1749280vcc11 = this.LL;
                if (c1749280vcc11 != null) {
                    C1722300uv6 c1722300uv62 = new C1722300uv6();
                    C1893080zMY.LIZ(c1722300uv62, new AwS565S0100000_21(this, 1483));
                    c1749280vcc11.setStatus(c1722300uv62);
                    return;
                }
                return;
            case 6:
                C1749280vcc c1749280vcc12 = this.LL;
                if (c1749280vcc12 != null) {
                    c1749280vcc12.setTopMargin(C12ES.LIZJ(18.0f, this.itemView.getContext()));
                }
                C1749280vcc c1749280vcc13 = this.LL;
                if (c1749280vcc13 != null) {
                    C1722300uv6 c1722300uv63 = new C1722300uv6();
                    AssemVMLazy assemVMLazy2 = this.LLILLJJLI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLILZ;
                    assemVMLazy2.getValue();
                    c1722300uv63.LJIIIIZZ = CommentListAssemVM.zQ2(this.itemView.getContext(), EnumC1343330l3r.LOAD_MORE_ERR);
                    c1749280vcc13.setStatus(c1722300uv63);
                    return;
                }
                return;
            default:
                throw new C1954807lC();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.da7, viewGroup, false);
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
