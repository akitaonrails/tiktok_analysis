package com.ss.android.ugc.aweme.view.hub;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C01GW;
import X.C098200Yq;
import X.C0H5A;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1389600mGU;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C189200o6;
import X.C19423210ys;
import X.C19424410z4;
import X.C19429110zp;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217371BqR;
import X.C2344009Gk;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogC1389100mFg;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.IProfileNaviService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviSwitcherBottomSheet extends BottomSheetDialogFragment implements InterfaceC1171660gay, C0H5A {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLDh9IDAuHELIOSZx8hJyMlJSodKTMlGjg6PCYkLD0RJzE4JiIAICApPQ==";
    public RecyclerView LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 595));

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final RecyclerView MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s4z) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final ProfileNaviSwitcherViewModel NR() {
        return (ProfileNaviSwitcherViewModel) this.LLILLJJLI.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Dialog dialog;
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        super.onStart();
        if (getDialog() != null && (dialog = getDialog()) != null && (viewFindViewById = dialog.findViewById(R.id.fpl)) != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
            Context context = getContext();
            if (context == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            layoutParams.height = (int) (360.0f * context.getResources().getDisplayMetrics().density);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // X.C0H5A
    public final void rd() {
        IProfileNaviService iProfileNaviServiceLJI = ProfileNaviServiceImpl.LJI();
        List<ProfileNaviDataModel> naviList = ((ProfileNaviSwitcherState) NR().hR2()).getNaviList();
        if (iProfileNaviServiceLJI.LIZIZ(naviList != null ? naviList.size() : 0, this)) {
            C19423210ys c19423210ys = C19423210ys.LIZ;
            String str = C19423210ys.LIZIZ;
            c19423210ys.getClass();
            String strValueOf = String.valueOf(new Date().getTime());
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("enter_method", "click");
            c2344009Gk.LJIIIIZZ("start_time", strValueOf);
            C20684815ws.LJIILLIIL("create_avatar", c2344009Gk.LIZ);
            dismiss();
            ProfileNaviSwitcherViewModel profileNaviSwitcherViewModelNR = NR();
            profileNaviSwitcherViewModelNR.getClass();
            profileNaviSwitcherViewModelNR.setStateImmediate(AFwS273S0000000_29.get$arr$(329));
            profileNaviSwitcherViewModelNR.setStateImmediate(AFwS273S0000000_29.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        }
    }

    @Override // X.C0H5A
    public final void Kg(ProfileNaviDataModel profileNaviDataModel) {
        C19423210ys c19423210ys = C19423210ys.LIZ;
        String str = profileNaviDataModel.navi_id;
        c19423210ys.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "avatar_switcher_page");
        c2344009Gk.LJIIIIZZ("avatar_id", str);
        C20684815ws.LJIILLIIL("choose_avatar", c2344009Gk.LIZ);
        dismiss();
        NR().getClass();
        C19424410z4 c19424410z4 = C19429110zp.LIZIZ;
        String str2 = null;
        if (c19424410z4 != null && c19424410z4.LIZ != null) {
            NR().getClass();
            C19424410z4 c19424410z42 = C19429110zp.LIZIZ;
            if (c19424410z42 != null) {
                str2 = c19424410z42.LIZ;
            }
            if (Intrinsics.LJFF(str2, profileNaviDataModel.navi_id)) {
                return;
            }
        }
        NR().mR2(profileNaviDataModel);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        DialogC1389100mFg dialogC1389100mFg = new DialogC1389100mFg(getContext(), R.style.af9);
        Window window = dialogC1389100mFg.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC1389100mFg);
        return dialogC1389100mFg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) NR().FQ2();
        profileNaviSwitcherState.setNaviList(null);
        profileNaviSwitcherState.setHasMore(true);
        C11EA.LJII(this, NR(), new C2217371BqR() { // from class: X.110F
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviSwitcherState) obj).getNaviList();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviSwitcherState) obj).setNaviList((List) obj2);
            }
        }, new AwS643S0100000_29(this, 0));
        NR().lR2();
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19423210ys.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "avatar_hub");
        C20684815ws.LJIILLIIL("enter_avatar_switch", c2344009Gk.LIZ);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ehg, viewGroup, false);
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

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
