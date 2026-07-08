package com.ss.android.ugc.aweme.upvote.detail.reposttab;

import X.C03H5;
import X.C098200Yq;
import X.C0BNU;
import X.C0PEM;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1258210iqZ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19252910Tv;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C2200821BBo;
import X.C23250099c;
import X.C283630B9t;
import X.C323000ClO;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1257980iqC;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.upvote.ability.IRepostProfileListAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class RepostProfileListFragment extends ProfileListFragment implements InterfaceC724530SbT, InterfaceC1257980iqC, IRepostProfileListAbility {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjA8PyAnLWsoLDsyISHELIOSliOyojJzY4PS4xZhcpOSAgPBU+Jik6JCAAIDwnDjctLiI2JjE=";
    public String LLILZLL;
    public String LLJ;
    public boolean LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public String LLJILLL;
    public final C736950SvV LLJJ;
    public View LLJJI;
    public int LLIZ = -1;
    public int LLIZLLLIL = -1;
    public Integer LLJI = -1;

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC1257980iqC
    public final void PB(String str) {
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

    @Override // X.InterfaceC1257980iqC
    public final void q3(boolean z) {
    }

    public final RepostListViewModel wS() {
        return (RepostListViewModel) this.LLJJ.getValue();
    }

    public RepostProfileListFragment() {
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 1949);
        this.LLJJ = new C736950SvV(C13LE.LIZ(RepostListViewModel.class), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS257S0000000_19.get$arr$(335), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // X.InterfaceC1257980iqC
    public final void LJFF() {
        if (isViewValid()) {
            wS().KQ2();
        }
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        if (getFragmentManager() == null) {
            return false;
        }
        return wS().LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        if (isViewValid()) {
            return wS().isDataEmpty();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.upvote.ability.IRepostProfileListAbility
    public final void qE() {
        if (isViewValid() && wS().LLJILJILJ && wS().LLJJ == null && (((Number) C0BNU.LIZ.getValue()).intValue() & 4) == 4) {
            RepostListViewModel repostListViewModelWS = wS();
            if (repostListViewModelWS.LLJJ == null) {
                repostListViewModelWS.LLJJ = C23250099c.LIZIZ(ViewModelKt.getViewModelScope(repostListViewModelWS), C0PEM.LIZJ, null, new C323000ClO(repostListViewModelWS, false, null), 2);
            }
        }
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.upvote.ability.IRepostProfileListAbility
    public final boolean Vl() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.upvote.ability.IRepostProfileListAbility
    public final String getPreviousPage() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
        if (isViewValid()) {
            wS().KQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, X.InterfaceC1206550hVF
    public final void b(boolean z) {
        super.b(z);
        this.LLJIJIL = z;
        if (isViewValid()) {
            wS().LLJILLL = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
        if (!isViewValid()) {
            return;
        }
        RepostListViewModel repostListViewModelWS = wS();
        repostListViewModelWS.getClass();
        repostListViewModelWS.setStateImmediate(new AwS33S0001000_19(17));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void gS(int i) {
        this.LLIZ = i;
        if (isViewValid()) {
            wS().LLJ = i;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void hS(int i) {
        this.LLIZLLLIL = i;
        if (isViewValid()) {
            wS().LLJI = i;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJJIFFI(this.LLJILJIL, Integer.valueOf(configuration.orientation), null);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        Integer numValueOf;
        String string2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("enter_from");
        } else {
            string = null;
        }
        this.LLJ = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            numValueOf = Integer.valueOf(arguments2.getInt("bottom_bar_height"));
        } else {
            numValueOf = null;
        }
        this.LLJI = numValueOf;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            string2 = arguments3.getString("user_unique_id");
        } else {
            string2 = null;
        }
        this.LLJILLL = string2;
        Bundle arguments4 = getArguments();
        boolean z = false;
        if (arguments4 != null) {
            z = arguments4.getBoolean("private_account", false);
        }
        b(z);
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IRepostProfileListAbility.class, null, null);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/upvote/detail/reposttab/RepostProfileListFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4CoVwfjMgk8QtvM+X4i4Z0WMOsyPDI2zwQK3ejx0g1ihNR+i4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z && LJLLL()) {
            wS().KQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/upvote/detail/reposttab/RepostProfileListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+4dZDa2XyTB6kx8g4CoVwfjMgk8QtvM+X4i4Z0WMOsyPDI2zwQK3ejx0g1ihNR+i4=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (isViewValid() && z && !((Boolean) C283630B9t.LIZ.getValue()).booleanValue()) {
            RepostListViewModel repostListViewModelWS = wS();
            repostListViewModelWS.getClass();
            repostListViewModelWS.setStateImmediate(new AwS33S0001000_19(17));
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(RepostProfileListFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void uS(boolean z) {
        super.uS(z);
        if (z && wS().FQ2() && wS().LLJILJILJ) {
            wS().KQ2();
        }
    }

    @Override // X.InterfaceC1257980iqC
    public final void za(MiniUser miniUser) {
        if (isViewValid()) {
            wS().LLJ = miniUser.followStatus;
            wS().LLJI = miniUser.followerStatus;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void nS(String str, String str2) {
        this.LLILZLL = str;
        if (isViewValid()) {
            RepostListViewModel repostListViewModelWS = wS();
            if (str == null) {
                str = "";
            }
            repostListViewModelWS.JQ2(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numValueOf;
        int iIntValue;
        View view2;
        super.onViewCreated(view, bundle);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        String str = this.LLJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C19EG activity = getActivity();
        if (activity != null) {
            numValueOf = Integer.valueOf(activity.hashCode());
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        getArguments();
        C1554960qZC.LIZ(interfaceC665370Q7zLJFF, new C1258210iqZ(str, strValueOf), C1258210iqZ.class, "source_default_key");
        this.LLJILJIL = view.findViewById(R.id.ta0);
        this.LLJILJILJ = view.findViewById(R.id.t_z);
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 267), 3);
        wS().LLJ = this.LLIZ;
        wS().LLJI = this.LLIZLLLIL;
        RepostListViewModel repostListViewModelWS = wS();
        String str3 = this.LLILZLL;
        if (str3 != null) {
            str2 = str3;
        }
        repostListViewModelWS.JQ2(str2);
        wS().LLJILLL = this.LLJIJIL;
        wS().LLJJIJI = getArguments();
        Integer num = this.LLJI;
        if (num != null && (iIntValue = num.intValue()) > 0 && (view2 = this.LLJILJIL) != null) {
            view2.setPadding(0, 0, 0, iIntValue);
        }
        if (C0BNU.LIZ()) {
            RepostListViewModel repostListViewModelWS2 = wS();
            if (repostListViewModelWS2.LLJJ == null) {
                repostListViewModelWS2.LLJJ = C23250099c.LIZIZ(ViewModelKt.getViewModelScope(repostListViewModelWS2), C0PEM.LIZJ, null, new C323000ClO(repostListViewModelWS2, true, null), 2);
            }
            wS().LLJILJILJ = true;
            return;
        }
        wS().KQ2();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        ViewGroup viewGroup2;
        boolean z = true;
        if ((((Number) C0BNU.LIZ.getValue()).intValue() & 1) != 1) {
            z = false;
        }
        C19GS c19gs = null;
        if (z) {
            View view = this.LLJJI;
            if (view == null) {
                this.LLJJI = C786410Ut5.Td(layoutInflater, R.layout.i6e, viewGroup, false);
            } else {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) parent;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    C786410Ut5.LJJJLZIJ(this.LLJJI, viewGroup2);
                }
            }
            viewTd = this.LLJJI;
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.i6e, viewGroup, false);
        }
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
