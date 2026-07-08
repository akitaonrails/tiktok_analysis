package com.ss.android.ugc.aweme.topic.book.detail;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import Y.ACListenerS113S0200000_9;
import Y.ACListenerS144S0100000_9;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class BookDetailOptionsPanel extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSYwZicjHELIOSJiR9LCA4KCY/ZgcjJiQXLTEtICMcODElJiEgGCQiLCM=";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("book_id")) != null) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.h4h);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.t8i);
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "book").appendQueryParameter("object_id", string);
            C786410Ut5.a9(tuxIconView, new ACListenerS144S0100000_9(this, 88));
            C786410Ut5.R7(linearLayout, new ACListenerS113S0200000_9(this, builderAppendQueryParameter, 24));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fvv, viewGroup, false);
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
