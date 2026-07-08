package com.ss.android.ugc.aweme.search.pages.result.common.research.core.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0BQQ;
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
import X.C19EG;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C325901Of;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C452080Ho6;
import X.C452501pT;
import X.C640160P9a;
import X.C640260P9k;
import X.C645850PUx;
import X.C679340Qkm;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
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
import Y.ACListenerS145S0100000_10;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.viewmodel.ResearchFilterVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ResearchFilterCell extends PowerCell<C645850PUx> implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public TuxTextView LL;
    public final AssemVMLazy LLILLJJLI;
    public boolean LLILLL;
    public ActivityCardThemeViewModel LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ResearchFilterCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/pages/result/common/research/core/viewmodel/ResearchFilterVM;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        LiveData liveData;
        LiveData<C640160P9a> liveDataXQ2;
        super.onItemViewCreated();
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.h9(tuxTextView, new ACListenerS145S0100000_10(this, 24));
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217371BqR() { // from class: X.0PUw
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C644980PRo) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C644980PRo) obj).LL = (ResearchFilterStruct) obj2;
            }
        }, null, new AwS624S0100000_10(this, 51), 6);
        TuxTextView tuxTextView2 = this.LL;
        C19EG c19egLIZIZ = C640260P9k.LIZIZ(tuxTextView2 != null ? tuxTextView2 : null);
        if (c19egLIZIZ != null) {
            this.LLILZ = (ActivityCardThemeViewModel) C679340Qkm.LIZIZ(C946803n0.LIZ(this.itemView), c19egLIZIZ).get(ActivityCardThemeViewModel.class);
        }
        ActivityCardThemeViewModel activityCardThemeViewModel = this.LLILZ;
        if (activityCardThemeViewModel != null && (liveDataXQ2 = activityCardThemeViewModel.xQ2()) != null) {
            C325901Of.LIZLLL(liveDataXQ2, this, new AObserverS214S0100000_10(this, 44));
        }
        ActivityCardThemeViewModel activityCardThemeViewModel2 = this.LLILZ;
        if (activityCardThemeViewModel2 == null || (liveData = (LiveData) activityCardThemeViewModel2.LLJILJILJ.getValue()) == null) {
            return;
        }
        C325901Of.LIZLLL(liveData, this, new AObserverS214S0100000_10(this, 45));
    }

    public ResearchFilterCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ResearchFilterVM.class);
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 489);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(215);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 480), awS554S0100000_10, AFwS207S0000000_19.get$arr$(312), new AwS554S0100000_10((C03K6) this, 481), new AwS554S0100000_10((C03K6) this, 483), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 485), aFwS241S0000000_10, new AwS563S0100000_19((C03K6) this, 1794), null, new AwS554S0100000_10((C03K6) this, 487));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS554S0100000_10 awS554S0100000_102 = new AwS554S0100000_10((C03K6) this, 482);
            AwS554S0100000_10 awS554S0100000_103 = new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 484);
            AwS554S0100000_10 awS554S0100000_104 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 486);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS554S0100000_102, 98));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1795);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1796);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1797);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1798);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1799);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS554S0100000_104, awS554S0100000_10, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS554S0100000_103, aFwS241S0000000_10, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 488), awS554S0100000_10, AFwS207S0000000_19.get$arr$(313), new AwS554S0100000_10((C03K6) this, 490), new AwS554S0100000_10((C03K6) this, 491), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) this, 492), aFwS241S0000000_10, new AwS563S0100000_19((C03K6) this, 1800), null, new AwS554S0100000_10((C03K6) this, 493));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 494), awS554S0100000_10, AFwS207S0000000_19.get$arr$(314), new AwS554S0100000_10((C03K6) this, 495), new AwS554S0100000_10((C03K6) this, 496), new AwS554S0100000_10((C03K6) this, 478), aFwS241S0000000_10, null, null, new AwS554S0100000_10((C03K6) this, 479));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    public final int I5() {
        Integer numLIZJ;
        ResearchFilterStruct researchFilterStruct;
        ResearchFilterStruct researchFilterStruct2;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        Context context = tuxTextView.getContext();
        if (this.LLILLL) {
            C645850PUx item = getItem();
            numLIZJ = (item == null || (researchFilterStruct2 = item.LL) == null || !researchFilterStruct2.isSelected()) ? C1308910kAL.LIZJ(R.attr.dy, context) : C1308910kAL.LIZJ(R.attr.e8, context);
        } else {
            C645850PUx item2 = getItem();
            numLIZJ = (item2 == null || (researchFilterStruct = item2.LL) == null || !researchFilterStruct.isSelected()) ? C1308910kAL.LIZJ(R.attr.c7, context) : C1308910kAL.LIZJ(R.attr.br, context);
        }
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    public final ResearchFilterVM N5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (ResearchFilterVM) assemVMLazy.getValue();
    }

    public final int L5() {
        ResearchFilterStruct researchFilterStruct;
        C645850PUx item = getItem();
        return (item == null || (researchFilterStruct = item.LL) == null || !researchFilterStruct.isSelected()) ? this.LLILLL ? R.attr.eh : R.attr.a1k : this.LLILLL ? R.attr.ee : R.attr.a1h;
    }

    public final void P5(C640160P9a c640160P9a) {
        int iIntValue;
        this.LLILLL = Intrinsics.LJFF(c640160P9a.LIZ, "activity_bg");
        TuxTextView tuxTextView = this.LL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setBackground(C1908520zlS.LIZIZ(C418440Gaw.LIZIZ(6), I5()));
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        } else {
            tuxTextView2 = tuxTextView3;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(L5(), tuxTextView2.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView3.setTextColor(iIntValue);
    }

    public final void R5(boolean z) {
        int iIntValue;
        ResearchFilterStruct researchFilterStruct;
        C645850PUx item = getItem();
        if (item != null && (researchFilterStruct = item.LL) != null) {
            researchFilterStruct.setSelected(z);
        }
        TuxTextView tuxTextView = this.LL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(L5(), tuxTextView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setTextColor(iIntValue);
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 != null) {
            tuxTextView2 = tuxTextView3;
        }
        tuxTextView2.setBackground(C1908520zlS.LIZIZ(C418440Gaw.LIZIZ(6), I5()));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ResearchFilterStruct researchFilterStruct;
        C645850PUx c645850PUx = (C645850PUx) interfaceC1891350zJl;
        super.onBindItemView(c645850PUx);
        C645850PUx item = getItem();
        TuxTextView tuxTextView = null;
        if (item != null && (researchFilterStruct = item.LL) != null) {
            float width = researchFilterStruct.getWidth();
            TuxTextView tuxTextView2 = this.LL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.getLayoutParams().width = (int) Math.ceil(width);
        }
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setText(c645850PUx.LL.getName());
        TuxTextView tuxTextView4 = this.LL;
        if (tuxTextView4 != null) {
            tuxTextView = tuxTextView4;
        }
        tuxTextView.setBackground(C1908520zlS.LIZIZ(C418440Gaw.LIZIZ(6), I5()));
        C736680Sv4.LJIJJ(N5(), new AwS589S0100000_10(this, 652));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int i;
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setGravity(17);
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
        if (((Number) C0BQQ.LIZ.getValue()).intValue() == 1) {
            i = 62;
        } else {
            i = 72;
        }
        tuxTextView.setTuxFont(i);
        tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        C427690Gpr.LJ(tuxTextView, C418440Gaw.LIZIZ(6));
        this.LL = tuxTextView;
        return tuxTextView;
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
