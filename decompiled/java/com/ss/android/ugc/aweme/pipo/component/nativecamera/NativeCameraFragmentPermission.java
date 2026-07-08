package com.ss.android.ugc.aweme.pipo.component.nativecamera;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import Y.ACListenerS153S0100000_18;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: loaded from: classes19.dex */
public final class NativeCameraFragmentPermission extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyohOSA9LSs4ZyEyHELIOSPCw6LCwyJSA+KGEdKTElPyoQKSgpOy4VOiQrJCo9PBUpOyI6OzYlJiE=";
    public AwS574S0100000_30 LLIZ;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.qj_);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.qj4);
        c197039127h.LJJJJLI(true);
        c197039127h.setBackgroundRadius(10);
        tuxIconView.setIconRes(R.raw.icon_chevron_left_ltr);
        tuxIconView.setTintColor(R.attr.b38);
        C786410Ut5.a9(tuxIconView, new ACListenerS153S0100000_18(this, 42));
        C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18(this, 43));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dwb, viewGroup, false);
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
