package com.ss.android.ugc.aweme.journey.step.trending;

import X.C01GW;
import X.C098200Yq;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1427810nG7;
import X.InterfaceC898260ZLs;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.AwS302S0300000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class FollowCreatorsFragment extends NUJComponentFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjHELIOSs2OGs4Oyo9LCwiLmEVJykgJjgQOiAtPSAhOwM+KCg+LSs4";

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ComposeView composeView = (ComposeView) view.findViewById(R.id.eoa);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 199));
        FollowCreatorsViewModel followCreatorsViewModel = (FollowCreatorsViewModel) new ViewModelProvider(this).get(FollowCreatorsViewModel.class);
        followCreatorsViewModel.getClass();
        followCreatorsViewModel.LLJIJIL = new WeakReference<>(this);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(796803817, new AwS302S0300000_25(this, (FollowCreatorsFragment) followCreatorsViewModel, (FollowCreatorsViewModel) c01gwLIZIZ, (C01GW<? extends InterfaceC898260ZLs>) 1), true));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cza, viewGroup, false);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
