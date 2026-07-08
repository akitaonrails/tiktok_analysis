package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class PreviewWrapperFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9OyEnZyHELIOSw7KTE+JiA+ZjAlZx8hLTMlLDgEOiQ8OSohDjctLiI2JjE=";
    public Fragment LL;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Live.getService();
        super.onCreate(bundle);
        if (this.LL != null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.rqj, this.LL, null);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ear, viewGroup, false);
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
