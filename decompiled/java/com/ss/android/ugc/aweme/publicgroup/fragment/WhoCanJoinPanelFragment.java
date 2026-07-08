package com.ss.android.ugc.aweme.publicgroup.fragment;

import X.C098200Yq;
import X.C0I0B;
import X.C1163270gNR;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C723850SaN;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class WhoCanJoinPanelFragment extends BaseFragment {
    public static final Map<String, C1163270gNR> LLJ = new LinkedHashMap();
    public static final Map<String, GroupAccessCriteriaCollection> LLJI = new LinkedHashMap();
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU5KyM6KyI+JjHELIOSojZiM+KCg+LSs4Zxg7JwYtJwU8ISscKCE2JAM+KCg+LSs4";
    public String LLIZ;
    public C1163270gNR LLIZLLLIL = new C1163270gNR(null, null, null, null);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        String str = this.LLIZ;
        if (str != null) {
            LLJ.remove(str);
            LLJI.remove(this.LLIZ);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("panel_param_uuid")) == null) {
            if (bundle != null) {
                string = bundle.getString("panel_param_uuid");
            } else {
                string = null;
            }
        }
        this.LLIZ = string;
        if (string != null) {
            C1163270gNR c1163270gNR = (C1163270gNR) ((LinkedHashMap) LLJ).get(string);
            if (c1163270gNR == null) {
                c1163270gNR = new C1163270gNR(null, null, null, null);
            }
            this.LLIZLLLIL = c1163270gNR;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.LLIZ;
        if (str != null) {
            C786410Ut5.LJJJI("panel_param_uuid", str, bundle);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 1016), 3);
        Map<String, String> map = this.LLIZLLLIL.LIZLLL;
        if (map != null) {
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("group_access_criteria_selection_popup_show", map);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cif, viewGroup, false);
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
