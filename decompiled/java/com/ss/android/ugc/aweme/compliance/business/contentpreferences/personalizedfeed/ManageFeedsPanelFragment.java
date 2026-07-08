package com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedfeed;

import X.C098200Yq;
import X.C1361400lX0;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20088213iq;
import X.EnumC1427810nG7;
import X.InterfaceC1220300hrQ;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS157S0110000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ManageFeedsPanelFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2OzZiKiA9PCAiPTHELIOS8hLSMpOyo9KyA/Zz82OjYjJy4/IT8pLSk2LSFiBC49KSIpDyo2LDYcKCE2JAM+KCg+LSs4";
    public InterfaceC1220300hrQ LLIZ;
    public Function1<? super Boolean, Unit> LLIZLLLIL;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        Context c1361400lX0;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_in_sheet");
        } else {
            z = true;
        }
        if (z) {
            c1361400lX0 = requireContext();
        } else {
            c1361400lX0 = new C1361400lX0(getActivity(), R.style.xz);
        }
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(c1361400lX0, null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1561456577, new AwS157S0110000_19(z, this, 0), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }
}
