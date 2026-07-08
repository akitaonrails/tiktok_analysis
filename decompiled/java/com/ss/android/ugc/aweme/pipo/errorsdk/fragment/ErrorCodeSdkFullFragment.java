package com.ss.android.ugc.aweme.pipo.errorsdk.fragment;

import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1251150ifB;
import X.C1411110mpB;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import Y.ACListenerS50S0101000_6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC836760Ws6
public final class ErrorCodeSdkFullFragment extends Fragment implements InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9LTc+Jj0gHELIOSLC5iLz0yLygpJzt9DTc+Jj0QJyEpGis4DjAgJQkhKSIhLCEn";
    public TuxNavBar LL;
    public TuxIconView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.navArg(this);

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

    public final ErrorCodeSdkFullPageArgs MR() {
        return (ErrorCodeSdkFullPageArgs) this.LLIZ.getValue();
    }

    public final TuxTextView NR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hbp) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hbr) : null;
            this.LLILZLL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxIconView PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hbs) : null;
            this.LLILLJJLI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
        this.LL = null;
        this.LLILZ = null;
        this.LLILLJJLI = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLJFF;
        String titleText;
        String contentText;
        String iconType;
        String primaryButtonText;
        super.onViewCreated(view, bundle);
        ErrorCodeSdkFullPageArgs errorCodeSdkFullPageArgsMR = MR();
        if (errorCodeSdkFullPageArgsMR != null) {
            zLJFF = Intrinsics.LJFF(errorCodeSdkFullPageArgsMR.getShowBack(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        String secondaryButtonText = null;
        if (zLJFF) {
            View viewFindViewById = this.LL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.p15);
                } else {
                    viewFindViewById = null;
                }
                this.LL = (TuxNavBar) viewFindViewById;
            }
            TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
            if (tuxNavBar != null) {
                C0OM1 c0om1 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
                c1251150ifB.LIZJ(new AwS550S0100000_6(this, 1417));
                c0om1.LJ(c1251150ifB);
                tuxNavBar.setNavActions(c0om1);
            }
        }
        ErrorCodeSdkFullPageArgs errorCodeSdkFullPageArgsMR2 = MR();
        if (errorCodeSdkFullPageArgsMR2 != null) {
            titleText = errorCodeSdkFullPageArgsMR2.getTitleText();
        } else {
            titleText = null;
        }
        ErrorCodeSdkFullPageArgs errorCodeSdkFullPageArgsMR3 = MR();
        if (errorCodeSdkFullPageArgsMR3 != null) {
            contentText = errorCodeSdkFullPageArgsMR3.getContentText();
        } else {
            contentText = null;
        }
        ErrorCodeSdkFullPageArgs errorCodeSdkFullPageArgsMR4 = MR();
        if (errorCodeSdkFullPageArgsMR4 != null) {
            iconType = errorCodeSdkFullPageArgsMR4.getIconType();
        } else {
            iconType = null;
        }
        Integer numLIZIZ = C1411110mpB.LIZIZ(iconType);
        View viewFindViewById2 = this.LLILLL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.hbv);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLL = (TuxTextView) viewFindViewById2;
        }
        TextView textView = (TextView) viewFindViewById2;
        if (textView != null) {
            textView.setText(titleText);
        }
        View viewFindViewById3 = this.LLILZ;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.hbu);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILZ = (TuxTextView) viewFindViewById3;
        }
        TextView textView2 = (TextView) viewFindViewById3;
        if (textView2 != null) {
            textView2.setText(contentText);
        }
        if (numLIZIZ == null) {
            TuxIconView tuxIconViewPR = PR();
            if (tuxIconViewPR != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewPR, 8);
            }
        } else {
            TuxIconView tuxIconViewPR2 = PR();
            if (tuxIconViewPR2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewPR2, 0);
            }
            TuxIconView tuxIconViewPR3 = PR();
            if (tuxIconViewPR3 != null) {
                tuxIconViewPR3.setIconRes(numLIZIZ.intValue());
            }
        }
        ErrorCodeSdkFullPageArgs errorCodeSdkFullPageArgsMR5 = MR();
        if (errorCodeSdkFullPageArgsMR5 != null && errorCodeSdkFullPageArgsMR5.getHasPrimaryButton()) {
            TuxTextView tuxTextViewNR = NR();
            if (tuxTextViewNR != null) {
                C786410Ut5.LLLLZLL(tuxTextViewNR, 0);
            }
            ErrorCodeSdkFullPageArgs errorCodeSdkFullPageArgsMR6 = MR();
            if (errorCodeSdkFullPageArgsMR6 != null) {
                primaryButtonText = errorCodeSdkFullPageArgsMR6.getPrimaryButtonText();
            } else {
                primaryButtonText = null;
            }
            TuxTextView tuxTextViewNR2 = NR();
            if (tuxTextViewNR2 != null) {
                tuxTextViewNR2.setText(primaryButtonText);
                C786410Ut5.h9(tuxTextViewNR2, new ACListenerS50S0101000_6(this, 1, 2));
            }
        } else {
            TuxTextView tuxTextViewNR3 = NR();
            if (tuxTextViewNR3 != null) {
                C786410Ut5.LLLLZLL(tuxTextViewNR3, 8);
            }
        }
        ErrorCodeSdkFullPageArgs errorCodeSdkFullPageArgsMR7 = MR();
        if (errorCodeSdkFullPageArgsMR7 != null && errorCodeSdkFullPageArgsMR7.getHasSecondaryButton()) {
            TuxTextView tuxTextViewOR = OR();
            if (tuxTextViewOR != null) {
                C786410Ut5.LLLLZLL(tuxTextViewOR, 0);
            }
            ErrorCodeSdkFullPageArgs errorCodeSdkFullPageArgsMR8 = MR();
            if (errorCodeSdkFullPageArgsMR8 != null) {
                secondaryButtonText = errorCodeSdkFullPageArgsMR8.getSecondaryButtonText();
            }
            TuxTextView tuxTextViewOR2 = OR();
            if (tuxTextViewOR2 != null) {
                tuxTextViewOR2.setText(secondaryButtonText);
                C786410Ut5.h9(tuxTextViewOR2, new ACListenerS50S0101000_6(this, 2, 2));
                return;
            }
            return;
        }
        TuxTextView tuxTextViewOR3 = OR();
        if (tuxTextViewOR3 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextViewOR3, 8);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(getLayoutInflater(), R.layout.dvr, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
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
