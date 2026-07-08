package com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.fundraiser;

import X.C01GW;
import X.C098200Yq;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20088213iq;
import X.C23250099c;
import X.C452501pT;
import X.C860350Xp3;
import X.EnumC1427810nG7;
import Y.AObserverS227S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.FundraiserContainerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class FundraiserPageFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2OzZiLzo9LDctHELIOSIDw2OmsiKDs6PiBiOS40LTZiLzo9LDctIDw2OmsKPCE3OiQlOiohGCQrLAkhKSIhLCEn";
    public final C01GW LL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 143));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 144));

    public final FundraiserContainerViewModel MR() {
        return (FundraiserContainerViewModel) this.LL.getValue();
    }

    public final FundraiserPageViewModel NR() {
        return (FundraiserPageViewModel) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.fundraiser.FundraiserPageFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MR().LL.observe(getViewLifecycleOwner(), new AObserverS227S0100000_25(this, 7));
        MR().LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS227S0100000_25(this, 8));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C860350Xp3(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(721285389, new AwS639S0100000_25(this, 26), true));
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
