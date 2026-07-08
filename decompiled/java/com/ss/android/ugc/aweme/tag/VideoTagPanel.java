package com.ss.android.ugc.aweme.tag;

import X.C098200Yq;
import X.C1572660r1k;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C298690BnH;
import X.C497820Jfg;
import X.C723850SaN;
import X.C737520SwQ;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoTagPanel extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7HELIOSLCI2ZjEtLmEFISEpJhsyLxUtJyo/";
    public C1572660r1k LLIZ = new C1572660r1k(null, null, 0, null, null, 31, null);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        NR(AFwS243S0000000_11.get$arr$(483));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG activity;
        super.onViewCreated(view, bundle);
        if (C298690BnH.LIZJ() && (activity = getActivity()) != null) {
            int iLIZ = (int) (((double) C497820Jfg.LIZ(activity)) * 0.73d);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = iLIZ;
            C786410Ut5.W5(view, layoutParams);
        }
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 311), 3);
        try {
            C737520SwQ.LIZ("enter_tag_mention_page", new AwS590S0100000_11(this, 268));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dlu, viewGroup, false);
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
