package com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings;

import X.C098200Yq;
import X.C0I0B;
import X.C1685300txQ;
import X.C189200o6;
import X.C19212010Ec;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
@InterfaceC836760Ws6
public final class ArchiveSettingFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZyw7KTEgIDwnZiwhOSN9LiAtHELIOSPTohLWstOyw7ITMpZzw2PDElJyggZgQ+Kic6PiAfLDsnISsrDz0yLygpJzs=";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        NR(AFwS248S0000000_14.get$arr$(76));
        activityConfiguration(AFwS248S0000000_14.get$arr$(77));
        C723850SaN.LIZ(this, false, null, new AwS593S0100000_14(this, 35), 3);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("enter_method")) != null) {
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("enter_archive_setting_page", C2097608Jq.LJIIIIZZ(new Pair("inbox_mode", C19212010Ec.LIZJ.LIZJ().getMobValue()), new Pair("enter_method", string)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d5s, viewGroup, false);
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
