package com.ss.android.ugc.aweme.ecommerce.showcase;

import X.C01GW;
import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C452501pT;
import X.InterfaceC1257980iqC;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.saas.TabCommerceFragment;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class TabShowCaseContainerFragment extends ProfileListFragment implements InterfaceC1257980iqC {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgHELIOSICo7Ki4gLWsYKC0AICo7Ci4gLQYjJzsyISspOwkhKSIhLCEn";
    public int LLILZLL = 14;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1397));

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    public final TabCommerceFragment wS() {
        return (TabCommerceFragment) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1257980iqC
    public final void LJFF() {
        TabCommerceFragment tabCommerceFragmentWS = wS();
        if (tabCommerceFragmentWS != null) {
            tabCommerceFragmentWS.LJFF();
        }
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        TabCommerceFragment tabCommerceFragmentWS = wS();
        if (tabCommerceFragmentWS != null) {
            return tabCommerceFragmentWS.LJJLIIIJILLIZJL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void MR(int i) {
        TabCommerceFragment tabCommerceFragmentWS = wS();
        if (tabCommerceFragmentWS != null) {
            tabCommerceFragmentWS.MR(i);
        }
    }

    @Override // X.InterfaceC1257980iqC
    public final void PB(String str) {
        TabCommerceFragment tabCommerceFragmentWS = wS();
        if (tabCommerceFragmentWS != null) {
            tabCommerceFragmentWS.PB(str);
        }
    }

    @Override // X.InterfaceC1257980iqC
    public final void q3(boolean z) {
        TabCommerceFragment tabCommerceFragmentWS = wS();
        if (tabCommerceFragmentWS != null) {
            tabCommerceFragmentWS.q3(z);
        }
    }

    @Override // X.InterfaceC1257980iqC
    public final void za(MiniUser miniUser) {
        TabCommerceFragment tabCommerceFragmentWS = wS();
        if (tabCommerceFragmentWS != null) {
            tabCommerceFragmentWS.za(miniUser);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(R.id.wyw);
        TabCommerceFragment tabCommerceFragmentWS = wS();
        C19GS c19gs = null;
        if (tabCommerceFragmentWS != null) {
            tabCommerceFragmentWS.setArguments(getArguments());
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.wyw, tabCommerceFragmentWS, null);
            c19ehLJIIJ.LJIIJ();
        }
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
