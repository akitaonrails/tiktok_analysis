package com.ss.android.ugc.aweme.notification.sysnotice;

import X.C098200Yq;
import X.C1253790ijR;
import X.C1581030rFF;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1253240iiY;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.service.IAutomaticPageStayTimeService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class SystemNotificationContainerFragment extends BaseFragment implements InterfaceC1253240iiY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSY8Jms/MDw9HELIOSJzElKip9Gzw/PSo+Bio4ICk6KyQ4ICA9CyoiPS46JiA+Dz0yLygpJzs=";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityConfiguration(AFwS257S0000000_19.get$arr$(234));
        NR(AFwS257S0000000_19.get$arr$(235));
        IAutomaticPageStayTimeService.LIZ.getClass();
        C1581030rFF.LIZIZ(this, "system_notification_page");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SystemNotificationFragment systemNotificationFragment = new SystemNotificationFragment();
        Bundle bundleLIZ = C1253790ijR.LIZIZ.LIZ(getArguments());
        if (bundleLIZ == null) {
            bundleLIZ = getArguments();
        }
        systemNotificationFragment.setArguments(bundleLIZ);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.wwb, systemNotificationFragment, null);
        c19ehLJIIJ.LJII(null);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a9f, viewGroup, false);
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
