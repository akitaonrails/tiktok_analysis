package com.ss.android.ugc.aweme.inbox.workbench;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1720106oR;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C622600ObS;
import X.C623900OdY;
import X.C623970Odf;
import X.C624080Odq;
import X.C624090Odr;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1206390hUz;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.workbench.data.WorkBenchCardListFragmentData;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchCardListViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkBenchCardListFragment extends BaseFragment implements InterfaceC1206390hUz, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZjIjHELIOSOyQxLSsvIWEEJzcnCyo9Ky0PKD03BCw/PQkhKSIhLCEn";
    public int LLIZ;
    public String LLIZLLLIL = "";
    public long LLJ;
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(WorkBenchCardListFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/workbench/viewmodel/WorkBenchCardListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
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

    public WorkBenchCardListFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(WorkBenchCardListViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 832);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(381);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 833), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 834), aFwS240S0000000_9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 835), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJI = assemVMLazy;
    }

    public final WorkBenchCardListViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (WorkBenchCardListViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
        SR().LLIZLLLIL++;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        WorkBenchCardListFragmentData workBenchCardListFragmentData;
        super.onCreate(bundle);
        NR(AFwS240S0000000_9.get$arr$(379));
        activityConfiguration(AFwS240S0000000_9.get$arr$(380));
        Bundle arguments = getArguments();
        if (arguments != null && (workBenchCardListFragmentData = (WorkBenchCardListFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LLIZ = workBenchCardListFragmentData.tabId;
            this.LLIZLLLIL = workBenchCardListFragmentData.lastReadTime;
            this.LLJ = workBenchCardListFragmentData.wallTime;
            SR().LLIZ = workBenchCardListFragmentData.isDefaultTab;
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        String str;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("  tabid ");
        sbLIZ.append(this.LLIZ);
        C1720106oR.LJI("WorkBenchCardListFragment", C2188811AlT.LIZIZ(sbLIZ));
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", "brand_partnership_page");
        pairArr[1] = new Pair("tab_name", C623900OdY.LIZ(this.LLIZ));
        if (SR().LLIZ && !SR().LLJJ) {
            str = "go_back_tab";
        } else {
            str = "click_tab";
        }
        pairArr[2] = new Pair("enter_method", str);
        C20684815ws.LJIILLIIL("enter_brand_tab", C2097608Jq.LJIIIIZZ(pairArr));
        if (!SR().LLJJ) {
            WorkBenchCardListViewModel workBenchCardListViewModelSR = SR();
            workBenchCardListViewModelSR.LLJJ = true;
            if (workBenchCardListViewModelSR.LLJJI && workBenchCardListViewModelSR.LLJILLL) {
                workBenchCardListViewModelSR.manualListRefresh();
                C1720106oR.LIZ("wwzcc", "have entered");
            }
            if (!SR().LLIZ) {
                C622600ObS c622600ObS = C622600ObS.LJI;
                String strLIZ = C623900OdY.LIZ(this.LLIZ);
                c622600ObS.LJIIIIZZ();
                if (c622600ObS.LJFF()) {
                    C622600ObS.LJIIIZ = strLIZ;
                    C622600ObS.LJIIIIZZ.LIZJ();
                }
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onRefreshUnsubscribeEvent(C624090Odr c624090Odr) {
        WorkBenchCardListViewModel workBenchCardListViewModelSR = SR();
        workBenchCardListViewModelSR.withState(new AwS375S0200000_9(workBenchCardListViewModelSR, c624090Odr.LIZ, 120));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUpdateItemList(C624080Odq c624080Odq) {
        WorkBenchCardListViewModel workBenchCardListViewModelSR = SR();
        List<C623970Odf> list = c624080Odq.LIZ;
        if (!list.isEmpty()) {
            if (workBenchCardListViewModelSR.LLJILJILJ) {
                workBenchCardListViewModelSR.withState(new AwS375S0200000_9((List) list, (List<C623970Odf>) workBenchCardListViewModelSR, (WorkBenchCardListViewModel) 119));
                return;
            }
            for (C623970Odf c623970Odf : C13LP.LJLJJLL(list)) {
                MissionStruct missionStruct = c623970Odf.LL;
                if (missionStruct != null) {
                    if (workBenchCardListViewModelSR.wQ2(Integer.valueOf(missionStruct.statusType))) {
                        WorkBenchCardListViewModel.AQ2(workBenchCardListViewModelSR.LLJILJIL, c623970Odf, workBenchCardListViewModelSR.LLJIJIL);
                    } else {
                        WorkBenchCardListViewModel.zQ2(workBenchCardListViewModelSR.LLJILJIL, c623970Odf, workBenchCardListViewModelSR.LLJIJIL);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 235), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a9h, viewGroup, false);
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
