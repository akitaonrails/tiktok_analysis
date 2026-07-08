package com.ss.android.ugc.aweme.series.seriesdetail.fragment;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import Y.ACListenerS144S0100000_9;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.series.seriesdetail.fragment.SeriesDetailReportMenuFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class SeriesDetailReportMenuFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2s/LD06LTYoLDsyHELIOSISliLz0yLygpJzt9GyA+ICogDCA4KCY/GiA8Jj0nBSAiPAkhKSIhLCEn";
    public Aweme LL;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final String string;
        final String string2;
        final Boolean boolValueOf;
        final String string3;
        Bundle arguments = getArguments();
        final String string4 = null;
        if (arguments != null) {
            string = arguments.getString("owner_id");
        } else {
            string = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string2 = arguments2.getString("unique_id");
        } else {
            string2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            boolValueOf = Boolean.valueOf(arguments3.getBoolean("is_block"));
        } else {
            boolValueOf = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string3 = arguments4.getString("aweme_id");
        } else {
            string3 = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            string4 = arguments5.getString("enter_from");
        }
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.bn2), new ACListenerS144S0100000_9(this, 87));
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0OyH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String strLIZLLL;
                SeriesDetailReportMenuFragment seriesDetailReportMenuFragment = this.LL;
                String str = string3;
                String str2 = string;
                String str3 = string2;
                Boolean bool = boolValueOf;
                String str4 = string4;
                seriesDetailReportMenuFragment.getClass();
                try {
                    n nVar = new n();
                    if (str3 != null) {
                        nVar.LJJIIJ("unique_id", str3);
                    }
                    if (bool != null) {
                        nVar.LJJII(Boolean.valueOf(bool.booleanValue()), "is_blocked");
                    }
                    strLIZLLL = C08JS.LIZLLL(nVar);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strLIZLLL = "";
                }
                ComplianceServiceProvider.LJJ().LIZIZ(seriesDetailReportMenuFragment.getActivity(), (Uri.Builder) C1612650s4F.LIZIZ(new Uri.Builder().appendQueryParameter("report_type", "paid_video").appendQueryParameter("object_id", str).appendQueryParameter("owner_id", str2).appendQueryParameter("group_id", str).appendQueryParameter("enter_from", str4).appendQueryParameter("extra", strLIZLLL), seriesDetailReportMenuFragment.LL));
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("author_id", str2);
                c2344009Gk.LJIIIIZZ("object_id", str);
                c2344009Gk.LJIIIIZZ("group_id", str);
                c2344009Gk.LJIIIIZZ("object_type", "paid_video");
                c2344009Gk.LJIIIIZZ("enter_from", str4);
                c2344009Gk.LIZJ(1, "is_collection_item");
                C20684815ws.LJIILLIIL("click_report", ((C2344009Gk) C1612650s4F.LIZIZ(c2344009Gk, seriesDetailReportMenuFragment.LL)).LIZ);
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("author_id", str2);
                c2344009Gk2.LJIIIIZZ("enter_from", str4);
                c2344009Gk2.LJIIIIZZ("group_id", str);
                c2344009Gk2.LJIIIIZZ("panel_source", "long_press");
                c2344009Gk2.LJIIIIZZ("enter_method", "long_press");
                c2344009Gk2.LIZJ(1, "is_collection_item");
                C20684815ws.LJIILLIIL("report", c2344009Gk2.LIZ);
            }
        }, view.findViewById(R.id.t8i));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bhx, viewGroup, false);
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
