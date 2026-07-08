package com.ss.android.ugc.aweme.compliance.business.banappeal.warninginfo;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C427690Gpr;
import X.C786410Ut5;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS154S0100000_19;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class AgsWarningInfoFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KjA/ICE2OzZiHELIOSKy49KTU8LC4/ZjItOyE6JiIlJyk8ZgQrOhgyOislJygaJiMjDz0yLygpJzs=";
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public C197039127h LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;

    public final TuxTextView MR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.e1y) : null;
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        View viewFindViewById = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("warningInfo");
        } else {
            serializable = null;
        }
        AgsWarningInfo agsWarningInfo = (AgsWarningInfo) serializable;
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.title);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (TuxTextView) viewFindViewById2;
        }
        ((TextView) viewFindViewById2).setText(agsWarningInfo.warningTitle);
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.eu1);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (TuxTextView) viewFindViewById3;
        }
        ((TextView) viewFindViewById3).setText(agsWarningInfo.warningDesc);
        View viewFindViewById4 = this.LLILLL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.eoq);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLL = (C197039127h) viewFindViewById4;
        }
        ((TextView) viewFindViewById4).setText(agsWarningInfo.buttonDetailText);
        View viewFindViewById5 = this.LLILLL;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.eoq);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILLL = (C197039127h) viewFindViewById5;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById5, new ACListenerS122S0200000_19(this, agsWarningInfo, 17));
        MR().setText(agsWarningInfo.buttonCloseText);
        C427690Gpr.LJI(MR(), null);
        C786410Ut5.h9(MR(), new ACListenerS154S0100000_19(this, 93));
        View viewFindViewById6 = this.LLILZIL;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.e1g);
            } else {
                viewFindViewById6 = null;
            }
            this.LLILZIL = (TuxIconView) viewFindViewById6;
        }
        C427690Gpr.LJI(viewFindViewById6, null);
        View view7 = this.LLILZIL;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById = view8.findViewById(R.id.e1g);
            }
            this.LLILZIL = (TuxIconView) viewFindViewById;
            view7 = viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) view7, new ACListenerS154S0100000_19(this, 94));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bf6, viewGroup, false);
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
