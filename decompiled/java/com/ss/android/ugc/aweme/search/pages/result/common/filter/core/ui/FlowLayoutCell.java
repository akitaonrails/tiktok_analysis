package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0Q98;
import X.C0R4U;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C1770850wBP;
import X.C1908520zlS;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C418040GaI;
import X.C427690Gpr;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
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
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS145S0100000_10;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.viewmodel.SearchFilterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowLayoutCell extends PowerCell<C0Q98> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FlowLayoutCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/pages/result/common/filter/core/viewmodel/SearchFilterViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public FlowLayoutCell() {
        AssemVMLazy assemVMLazy;
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchFilterViewModel.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 470);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(212);
        if (Intrinsics.LJFF(interfaceC724760SbqLJJJIL, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 461), awS554S0100000_10, AFwS207S0000000_19.get$arr$(311), new AwS554S0100000_10((C03K6) this, 462), new AwS554S0100000_10((C03K6) this, 464), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 466), aFwS241S0000000_10, new AwS563S0100000_19((C03K6) this, 1788), null, new AwS554S0100000_10((C03K6) this, 468));
        } else if (interfaceC724760SbqLJJJIL instanceof InterfaceC451590HnJ) {
            AwS554S0100000_10 awS554S0100000_102 = new AwS554S0100000_10((C03K6) this, 463);
            AwS554S0100000_10 awS554S0100000_103 = new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 465);
            AwS554S0100000_10 awS554S0100000_104 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 467);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) interfaceC724760SbqLJJJIL, awS554S0100000_102, 97));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1789);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1790);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1791);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1792);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1793);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS554S0100000_104, awS554S0100000_10, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS554S0100000_103, aFwS241S0000000_10, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(interfaceC724760SbqLJJJIL, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 469), awS554S0100000_10, AFwS207S0000000_19.get$arr$(309), new AwS554S0100000_10((C03K6) this, 452), new AwS554S0100000_10((C03K6) this, 453), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 454), aFwS241S0000000_10, new AwS563S0100000_19((C03K6) this, 1787), null, new AwS554S0100000_10((C03K6) this, 455));
        } else {
            if (!Intrinsics.LJFF(interfaceC724760SbqLJJJIL, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(interfaceC724760SbqLJJJIL);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 456), awS554S0100000_10, AFwS207S0000000_19.get$arr$(310), new AwS554S0100000_10((C03K6) this, 457), new AwS554S0100000_10((C03K6) this, 458), new AwS554S0100000_10((C03K6) this, 459), aFwS241S0000000_10, null, null, new AwS554S0100000_10((C03K6) this, 460));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 451));
    }

    public final TuxTextView L5() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    public final SearchFilterViewModel N5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (SearchFilterViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.h9(L5(), new ACListenerS145S0100000_10(this, 22));
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217371BqR() { // from class: X.0QAo
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q93) obj).LLILZ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0Q93) obj).LLILZ = (SubFilterOptionStruct) obj2;
            }
        }, null, new AwS624S0100000_10(this, 47), 6);
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217371BqR() { // from class: X.0QAp
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q93) obj).LLILZIL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0Q93) obj).LLILZIL = (SubFilterOptionStruct) obj2;
            }
        }, null, new AwS624S0100000_10(this, 48), 6);
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217371BqR() { // from class: X.0QAq
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q93) obj).LLILZLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0Q93) obj).LLILZLL = (SubFilterOptionStruct) obj2;
            }
        }, null, new AwS624S0100000_10(this, 49), 6);
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217371BqR() { // from class: X.0QAr
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q93) obj).LLILLJJLI;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0Q93) obj).LLILLJJLI = (SubFilterOptionStruct) obj2;
            }
        }, null, new AwS624S0100000_10(this, 50), 6);
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217371BqR() { // from class: X.0QAm
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q93) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0Q93) obj).LL = (SubFilterOptionStruct) obj2;
            }
        }, null, new AwS624S0100000_10(this, 45), 6);
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217371BqR() { // from class: X.0QAn
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0Q93) obj).LLILLL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0Q93) obj).LLILLL = (SubFilterOptionStruct) obj2;
            }
        }, null, new AwS624S0100000_10(this, 46), 6);
        float f = 16;
        float f2 = 10;
        L5().setPaddingRelative(C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics())), C814420VxA.LIZIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics())), C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics())), C814420VxA.LIZIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics())));
        TuxTextView tuxTextViewL5 = L5();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
        int iIntValue2 = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        int iLIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 1, Resources.getSystem().getDisplayMetrics()));
        float fLIZ = C418040GaI.LIZ(6);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iIntValue);
        gradientDrawable.setCornerRadius(fLIZ);
        gradientDrawable.setStroke(iLIZIZ, iIntValue2);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
        Drawable drawableLIZIZ = C1908520zlS.LIZIZ(C418040GaI.LIZ(6), numLIZJ3 != null ? numLIZJ3.intValue() : 0);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, gradientDrawable);
        stateListDrawable.addState(new int[]{-16842913}, drawableLIZIZ);
        tuxTextViewL5.setBackground(stateListDrawable);
        q0.LJIJ(L5(), new C0R4U(0));
        C427690Gpr.LJ(this.itemView, C418040GaI.LIZ(6));
    }

    public final void I5(boolean z) {
        TuxTextView tuxTextViewL5 = L5();
        tuxTextViewL5.setSelected(z);
        int iIntValue = 0;
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            tuxTextViewL5.setTextColor(iIntValue);
            tuxTextViewL5.setTuxFont(52);
            return;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, this.itemView.getContext());
        if (numLIZJ2 != null) {
            iIntValue = numLIZJ2.intValue();
        }
        tuxTextViewL5.setTextColor(iIntValue);
        tuxTextViewL5.setTuxFont(51);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0Q98 c0q98 = (C0Q98) interfaceC1891350zJl;
        super.onBindItemView(c0q98);
        L5().setText(c0q98.LL.getName());
        C736680Sv4.LJIJJ(N5(), new AwS376S0200000_10(c0q98, this, 80));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f4e, viewGroup, false);
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
