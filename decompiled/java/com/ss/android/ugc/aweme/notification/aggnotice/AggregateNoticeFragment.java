package com.ss.android.ugc.aweme.notification.aggnotice;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1618770sE7;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1906270zhp;
import X.InterfaceC1901490za7;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.notification.aggnotice.vm.AggregateListViewModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC836760Ws6
public final class AggregateNoticeFragment extends BaseFragment implements InterfaceC1901490za7 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSY8HELIOSJmstLig9JzElKip9CSIrOyo0KTEpByAnISYpDz0yLygpJzs=";
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AggregateNoticeFragment.class, "aggregateListViewModel", "getAggregateListViewModel()Lcom/ss/android/ugc/aweme/notification/aggnotice/vm/AggregateListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AggregateNoticeFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AggregateListViewModel.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 698);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(424);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) this, 699), aFwS229S0000000_2, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new AwS546S0100000_2((Fragment) this, OppoPermissionPopupMaskDelayExp.DEFAULT), aFwS229S0000000_2, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS546S0100000_2((HasDefaultViewModelProviderFactory) this, 701), aFwS229S0000000_2, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 702));
    }

    public final AggregateListViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (AggregateListViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1901490za7
    public final EnumC1906270zhp wj() {
        return EnumC1906270zhp.AGGREGATE_PAGE;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS229S0000000_2.get$arr$(422));
        activityConfiguration(AFwS229S0000000_2.get$arr$(423));
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long lLJIILIIL;
        Long lLJIILIIL2;
        String string;
        Integer numLJIIJJI;
        Integer numLJIIJJI2;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        TuxNavBar tuxNavBar;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string6 = arguments.getString("title")) != null && (tuxNavBar = (TuxNavBar) this.LLIZLLLIL.getValue()) != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZJ(new AwS546S0100000_2(this, 26));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string6;
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavBackground(C1618770sE7.LIZ(R.attr.zm));
            tuxNavBar.setNavActions(c0om1);
        }
        AggregateListViewModel aggregateListViewModelSR = SR();
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string5 = arguments2.getString("notice_id")) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(string5);
        } else {
            lLJIILIIL = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string4 = arguments3.getString("notice_type")) != null) {
            lLJIILIIL2 = C2095008Iq.LJIILIIL(string4);
        } else {
            lLJIILIIL2 = null;
        }
        aggregateListViewModelSR.LLILLJJLI = lLJIILIIL;
        aggregateListViewModelSR.LLILLL = lLJIILIIL2;
        AggregateListViewModel aggregateListViewModelSR2 = SR();
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string = arguments4.getString("account_type");
        } else {
            string = null;
        }
        aggregateListViewModelSR2.LLILZ = string;
        AggregateListViewModel aggregateListViewModelSR3 = SR();
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string3 = arguments5.getString("inner_item_num")) != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(string3);
        } else {
            numLJIIJJI = null;
        }
        aggregateListViewModelSR3.LLILZIL = numLJIIJJI;
        AggregateListViewModel aggregateListViewModelSR4 = SR();
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string2 = arguments6.getString("from_inner_user_num")) != null) {
            numLJIIJJI2 = C2095008Iq.LJIIJJI(string2);
        } else {
            numLJIIJJI2 = null;
        }
        aggregateListViewModelSR4.LLILZLL = numLJIIJJI2;
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 273), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a8v, viewGroup, false);
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
}
