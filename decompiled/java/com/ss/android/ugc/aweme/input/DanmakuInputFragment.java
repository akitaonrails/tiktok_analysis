package com.ss.android.ugc.aweme.input;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0PEM;
import X.C0RQB;
import X.C0SHX;
import X.C0ZP4;
import X.C1110404Vy;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1354910lMX;
import X.C1361010lWN;
import X.C1361150lWb;
import X.C1389600mGU;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C2237108pd;
import X.C23250099c;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C5182020e;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C785860UsC;
import X.C786410Ut5;
import X.C817503Hh;
import X.C987103tV;
import X.EnumC1361130lWZ;
import X.EnumC1361140lWa;
import X.EnumC255700yp;
import X.InterfaceC0148002o;
import X.InterfaceC1352000lHq;
import X.InterfaceC1355580lNc;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS155S0100000_21;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class DanmakuInputFragment extends BaseDialogFragment implements InterfaceC1352000lHq, InterfaceC724530SbT {
    public static final C1354910lMX LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSwiOTonZgEtJyIyIzAFJz8mPAM+KCg+LSs4";
    public final DanmakuViewModel LLILLL;
    public final C1361010lWN LLILZ;
    public final InterfaceC665370Q7z LLILZIL;
    public final AssemVMLazy LLILZLL;
    public InterfaceC1355580lNc LLIZ;
    public View LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI;
    public Window LLJIJIL;
    public final int LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0lMX] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DanmakuInputFragment.class, "inputVM", "getInputVM()Lcom/ss/android/ugc/aweme/input/DanmakuInputVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJILJ = new Object() { // from class: X.0lMX
        };
    }

    public DanmakuInputFragment() {
        this(null, null, null);
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

    public final DanmakuInputVM MR() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (DanmakuInputVM) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLILII() {
        MR().vQ2(0, false);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        this.LLJ = true;
        if (!((Boolean) this.LLJI.getValue()).booleanValue() || (window = this.LLJIJIL) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            window.getDecorView().setSystemUiVisibility(4871);
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.systemBars());
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        VideoItemParams item;
        VideoItemParams item2;
        LandscapePanelStateNotificationAbility landscapePanelStateNotificationAbility;
        super.onStop();
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZIL;
        if (interfaceC665370Q7z != null && (landscapePanelStateNotificationAbility = (LandscapePanelStateNotificationAbility) C1558520qew.LIZ(interfaceC665370Q7z, LandscapePanelStateNotificationAbility.class, null)) != null) {
            landscapePanelStateNotificationAbility.tq1(this.LLJILJIL, false);
        }
        new PthreadTimer("DanmakuInputFragment").schedule(new C785860UsC(this, 2), 1000L);
        if (this.LLJ) {
            C1361150lWb c1361150lWb = C1361150lWb.LIZ;
            DanmakuViewModel danmakuViewModel = this.LLILLL;
            Aweme aweme = (danmakuViewModel == null || (item2 = danmakuViewModel.getItem()) == null) ? null : item2.getAweme();
            DanmakuViewModel danmakuViewModel2 = this.LLILLL;
            String str = (danmakuViewModel2 == null || (item = danmakuViewModel2.getItem()) == null) ? null : item.mEventType;
            c1361150lWb.getClass();
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2237108pd(aweme, str, null), 2);
        }
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLLLZI(int i) {
        C1110404Vy.LIZ().LIZIZ(i, !((Boolean) this.LLJI.getValue()).booleanValue());
        MR().vQ2(i, true);
    }

    @Override // X.InterfaceC1352000lHq
    public final void j(int i) {
        MR().vQ2(i, true);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        LandscapePanelStateNotificationAbility landscapePanelStateNotificationAbility;
        super.onCreate(bundle);
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZIL;
        if (interfaceC665370Q7z != null && (landscapePanelStateNotificationAbility = (LandscapePanelStateNotificationAbility) C1558520qew.LIZ(interfaceC665370Q7z, LandscapePanelStateNotificationAbility.class, null)) != null) {
            landscapePanelStateNotificationAbility.tq1(this.LLJILJIL, true);
        }
        setStyle(1, R.style.abz);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        dialogOnCreateDialog.setCancelable(true);
        dialogOnCreateDialog.requestWindowFeature(1);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
            window.setSoftInputMode(48);
            window.setGravity(80);
            this.LLJIJIL = window;
        }
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        VideoItemParams item;
        Window window;
        View decorView;
        LandscapeEntrancesControlAbility landscapeEntrancesControlAbility;
        super.onViewCreated(view, bundle);
        DanmakuInputVM danmakuInputVMMR = MR();
        C1361010lWN c1361010lWN = this.LLILZ;
        DanmakuViewModel danmakuViewModel = this.LLILLL;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZIL;
        danmakuInputVMMR.LL = c1361010lWN;
        danmakuInputVMMR.LLILLJJLI = danmakuViewModel;
        danmakuInputVMMR.LLILLL = interfaceC665370Q7z;
        Aweme aweme = null;
        if (interfaceC665370Q7z != null && (landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C1558520qew.LIZ(interfaceC665370Q7z, LandscapeEntrancesControlAbility.class, null)) != null) {
            landscapeEntrancesControlAbility.Y31(false);
        }
        C19EG activity = getActivity();
        if (activity != null) {
            C0SHX.LIZ(activity, null).LJIIJJI("input_danmaku", true, null);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setPadding(0, 0, 0, 0);
        }
        C723850SaN.LIZ(this, false, null, new AwS387S0200000_21(this, view, 28), 3);
        View viewFindViewById = view.findViewById(R.id.jm0);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 78), viewFindViewById);
        }
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 79), view.findViewById(R.id.pw6));
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0lMW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1354820lMO) obj).LLILZIL;
            }
        }, null, new AwS456S0200000_21(this, view, 7), 6);
        C1361150lWb c1361150lWb = C1361150lWb.LIZ;
        C1361010lWN c1361010lWN2 = this.LLILZ;
        if (c1361010lWN2 != null) {
            aweme = c1361010lWN2.LIZ;
        }
        DanmakuViewModel danmakuViewModel2 = this.LLILLL;
        if (danmakuViewModel2 == null || (item = danmakuViewModel2.getItem()) == null || (str = item.mEventType) == null) {
            str = "";
        }
        EnumC1361140lWa enumC1361140lWa = EnumC1361140lWa.HIDE;
        EnumC1361130lWZ enumC1361130lWZ = EnumC1361130lWZ.KEYBOARD;
        EnumC255700yp enumC255700yp = EnumC255700yp.IS_NOT_LANDSCAPE;
        c1361150lWb.getClass();
        C1361150lWb.LJIIIIZZ(aweme, str, enumC1361140lWa, enumC1361130lWZ, enumC255700yp);
    }

    public DanmakuInputFragment(InterfaceC665370Q7z interfaceC665370Q7z, DanmakuViewModel danmakuViewModel, C1361010lWN c1361010lWN) {
        AssemVMLazy assemVMLazy;
        this.LLILLL = danmakuViewModel;
        this.LLILZ = c1361010lWN;
        this.LLILZIL = interfaceC665370Q7z;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DanmakuInputVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 346);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(379);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1381), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new AwS565S0100000_21((Fragment) this, 1382), aFwS259S0000000_21, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1383), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILZLL = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 854));
        this.LLJILJIL = C0RQB.AUTO_PLAY_NEXT.getValue() | C0RQB.SHOW_INTRO.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (!((Boolean) this.LLJI.getValue()).booleanValue()) {
            i = R.layout.bj2;
        } else {
            i = R.layout.bj3;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        this.LLIZLLLIL = viewTd;
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = C1110404Vy.LIZ().LIZ(getContext(), this.LLIZLLLIL);
        this.LLIZ = keyboardFakePopupWindowLIZ;
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = this;
        }
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.show();
        }
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
