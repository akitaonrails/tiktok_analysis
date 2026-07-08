package com.ss.android.ugc.aweme.fangroup.fragment;

import X.C098200Yq;
import X.C1230900i8W;
import X.C1230910i8X;
import X.C1230930i8Z;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
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
import com.ss.android.ugc.aweme.fangroup.model.GroupInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS58S1300000_19;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class FanGroupListFragment extends BaseFragment {
    public static final Set<Function1<GroupInfo, Unit>> LLIZ = new LinkedHashSet();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtJyghJzHELIOSA8ZykhKSIhLCEnZgMtJwghJzA8BSYgPAM+KCg+LSs4";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LLIZ.clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityConfiguration(AFwS283S0000000_35.get$arr$(33));
        NR(AFwS283S0000000_35.get$arr$(34));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        View viewFindViewById;
        View viewFindViewById2;
        int i;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("creator_uid")) == null) {
            string = "";
        }
        C1230910i8X c1230910i8XLIZ = C1230900i8W.LIZ(getArguments());
        C723850SaN.LIZ(this, false, null, new AwS58S1300000_19(this, c1230910i8XLIZ, string, view, 1), 3);
        if (c1230910i8XLIZ.useSelectStyle()) {
            View view2 = getView();
            if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.hmv)) != null) {
                if (c1230910i8XLIZ.useAnchorSelectStyle()) {
                    i = C1230930i8Z.LIZLLL.LIZ;
                } else {
                    i = C1230930i8Z.LIZJ.LIZ;
                }
                viewFindViewById2.setBackgroundColor(i);
            }
            View view3 = getView();
            if (view3 != null && (viewFindViewById = view3.findViewById(R.id.hn4)) != null) {
                viewFindViewById.setBackground(null);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ci_, viewGroup, false);
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
