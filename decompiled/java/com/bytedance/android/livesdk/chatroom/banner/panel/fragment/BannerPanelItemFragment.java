package com.bytedance.android.livesdk.chatroom.banner.panel.fragment;

import X.C098200Yq;
import X.C1041990dDp;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public final class BannerPanelItemFragment extends SparkFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPT08JyhiKy49HELIOSJiA+Zz8yJiAgZykhKSIhLCEnZgctJyE2OhUtJyo/ATEpJAkhKSIhLCEn";
    public final SparkContext LLJZ;

    public BannerPanelItemFragment(SparkContext sparkContext) {
        this.LLJZ = sparkContext;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJZ.LJJJZ("click_time", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1041990dDp c1041990dDp = C1041990dDp.LIZ;
        SparkContext sparkContext = this.LLJZ;
        c1041990dDp.getClass();
        C1041990dDp.LIZJ(sparkContext);
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
