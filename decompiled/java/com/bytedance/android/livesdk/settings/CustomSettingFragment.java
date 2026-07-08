package com.bytedance.android.livesdk.settings;

import X.C098200Yq;
import X.C1685300txQ;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class CustomSettingFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9HELIOSOyA4PSY9LzZiCjogPCohGionPCwiLgkhKSIhLCEn";

    public final void NR(Fragment fragment) {
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        if (!fragment.isAdded()) {
            c19ehLJIIJ.LIZJ(R.id.eqx, fragment, fragment.getClass().getName());
            c19ehLJIIJ.LJIIJ();
        } else {
            c19ehLJIIJ.LJJIFFI(fragment);
            c19ehLJIIJ.LJIIJ();
        }
        getChildFragmentManager().LJJJJL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C786410Ut5.h8((C16FS) view.findViewById(R.id.uvq), new ACListenerS142S0100000_7(this, 101));
        C786410Ut5.h8((C16FS) view.findViewById(R.id.m2_), new ACListenerS142S0100000_7(this, 102));
        C786410Ut5.h8((C16FS) view.findViewById(R.id.np8), new View.OnClickListener() { // from class: X.0ImC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Logger.setLogLevel(2);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d4y, viewGroup, false);
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
