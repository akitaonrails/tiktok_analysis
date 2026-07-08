package com.ss.android.ugc.aweme.foundation.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC836760Ws6
public final class CommonBlankFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMjPCE3KTElHELIOSJiF9LjctLiI2JjFiCiA+JSoiCyMyJi4KOy40JSAiPQ==";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArg(this, AFwS245S0000000_12.get$arr$(79), "real_jump_schema", String.class);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        activityConfiguration(AFwS245S0000000_12.get$arr$(77));
        NR(AFwS245S0000000_12.get$arr$(78));
        super.onCreate(bundle);
        String str = (String) this.LLIZ.getValue();
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(this, Uri.decode((String) this.LLIZ.getValue())).open();
            return;
        }
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.b4k, viewGroup, false);
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
