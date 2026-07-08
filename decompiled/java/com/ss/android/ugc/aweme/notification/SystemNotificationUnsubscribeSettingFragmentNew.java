package com.ss.android.ugc.aweme.notification;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C497820Jfg;
import X.C635440OwA;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS144S0100000_9;
import Y.AObserverS213S0100000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.notification.vh.SystemNotificationInnerSettingTitleCell;
import com.ss.android.ugc.aweme.notification.vh.SystemNotificationInnerSpaceCell;
import com.ss.android.ugc.aweme.notification.vh.SystemNotificationInnerSwitchCell;
import com.ss.android.ugc.aweme.notification.vh.SystemNotificationSettingCell;
import com.ss.android.ugc.aweme.notification.vm.UnsubscribeSettingViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class SystemNotificationUnsubscribeSettingFragmentNew extends AmeBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSY8JmsfMDwnLSHELIOSgCJjs6LiwvKDs6JysZJzwmKjYvOyYxLRYpPTs6JiIKOy40JSAiPQE2Pw==";
    public ViewOnAttachStateChangeListenerC20604515jv LL;
    public TuxIconView LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1358));

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UnsubscribeSettingViewModel unsubscribeSettingViewModel = (UnsubscribeSettingViewModel) this.LLILLL.getValue();
        unsubscribeSettingViewModel.getClass();
        unsubscribeSettingViewModel.LL = C635440OwA.LIZ;
        unsubscribeSettingViewModel.LLILLJJLI = C635440OwA.LIZIZ;
        unsubscribeSettingViewModel.vQ2();
        View view2 = getView();
        if (view2 != null) {
            view2.setPadding(0, C497820Jfg.LIZJ(requireActivity()), 0, 0);
        }
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zp);
        tuxImmersionBarLIZLLL.LJ(R.attr.zp);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.bn0);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (TuxIconView) viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById, new ACListenerS144S0100000_9(this, 144));
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.rmx);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById2;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById2;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SystemNotificationInnerSettingTitleCell.class, SystemNotificationSettingCell.class, SystemNotificationInnerSpaceCell.class, SystemNotificationInnerSwitchCell.class);
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        }
        ((UnsubscribeSettingViewModel) this.LLILLL.getValue()).LLILZIL.observe(this, new AObserverS213S0100000_9(this, 8));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.abe, viewGroup, false);
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
