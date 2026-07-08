package com.ss.android.ugc.aweme;

import X.C098200Yq;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C901130ZWt;
import X.EnumC1427810nG7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS465S0200000_30;

/* JADX INFO: loaded from: classes15.dex */
public final class IMTranslationFirstTimeGuideFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZgwBHT0yHELIOSJjYgKDs6JysKID0gPBElJCoUPSwoLAkhKSIhLCEn";
    public ComposeView LLIZ;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C901130ZWt.LIZIZ.LJIIL().LJ();
        ComposeView composeView = this.LLIZ;
        if (composeView != null) {
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-681554252, new AwS465S0200000_30(view, this, 4), true));
        } else {
            "init fail".toString();
            throw new IllegalStateException("init fail");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView;
        Context context;
        C19GS c19gs = null;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            composeView = new ComposeView(context, null, 6);
            this.LLIZ = composeView;
        } else {
            composeView = null;
        }
        if (!(composeView instanceof View)) {
            composeView = null;
        }
        if (composeView != null) {
            try {
                ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(composeView, this);
                composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return composeView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return composeView;
    }
}
