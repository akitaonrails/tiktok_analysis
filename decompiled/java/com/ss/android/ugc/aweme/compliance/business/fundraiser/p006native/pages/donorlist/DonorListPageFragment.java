package com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.donorlist;

import X.C01GW;
import X.C098200Yq;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20088213iq;
import X.C452501pT;
import X.EnumC1427810nG7;
import Y.AObserverS230S0100000_28;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class DonorListPageFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2OzZiLzo9LDctHELIOSIDw2OmsiKDs6PiBiOS40LTZiLSA9JzcgIDwnZgEjJyAhBCw/PR8yLyAKOy40JSAiPQ==";
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 141));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 142));

    public final FundraiserContainerViewModel MR() {
        return (FundraiserContainerViewModel) this.LL.getValue();
    }

    public final DonorListPageViewModel NR() {
        return (DonorListPageViewModel) this.LLILLJJLI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (MR().LL.getValue() != null) {
            NR().getClass();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("arg_org_id");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.getString("arg_fundraiser_id");
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.getString("arg_enter_from");
        }
        NR().getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MR().LL.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 15));
        MR().LLILLJJLI.observe(getViewLifecycleOwner(), new Observer() { // from class: X.0zpb
            @Override // androidx.lifecycle.Observer
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1808872058, new AwS642S0100000_28(this, 11), true));
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
