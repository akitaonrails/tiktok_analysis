package com.ss.android.ugc.aweme.account.verify;

import X.C098200Yq;
import X.C0HTI;
import X.C1685300txQ;
import X.C1720106oR;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1235570iG3;
import Y.ACListenerS154S0100000_19;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class SmsConsentPageFragment extends BaseAccountFlowFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiPyohISM1Zxw+OwYjJzw2JjEcKCg2DjctLiI2JjE=";
    public TuxTextView LLJJJJ;
    public ImageView LLJJJJJIL;
    public C197039127h LLJJJJLIIL;
    public TuxTextView LLJJL;
    public InterfaceC1235570iG3 LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("SMS_consent", "onBackPressed()");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
    }

    @Override // X.C0XYD
    public final void dk(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doAction(");
        sbLIZ.append(i);
        sbLIZ.append(')');
        C1720106oR.LJI("SMS_consent", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJJJJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.qb6);
            } else {
                viewFindViewById = null;
            }
            this.LLJJJJ = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("phone_number");
        } else {
            string = null;
        }
        textView.setText(string);
        View viewFindViewById3 = this.LLJJJJJIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.jxe);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJJJJIL = (ImageView) viewFindViewById3;
        }
        ImageView imageView = (ImageView) viewFindViewById3;
        C19EG activity = getActivity();
        if (activity != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.p4;
            imageView.setImageDrawable(c0hti.LIZ(activity));
        }
        View viewFindViewById4 = this.LLJJJJLIIL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.eoo);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJJJJLIIL = (C197039127h) viewFindViewById4;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById4, new ACListenerS154S0100000_19(this, 83));
        View view5 = this.LLJJL;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById2 = view6.findViewById(R.id.db0);
            }
            this.LLJJL = (TuxTextView) viewFindViewById2;
            view5 = viewFindViewById2;
        }
        C786410Ut5.h9((TuxTextView) view5, new ACListenerS154S0100000_19(this, 84));
    }

    @Override // X.C0XYD
    public final void pn(int i, String str) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showErrorHint(");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        sbLIZ.append(')');
        C1720106oR.LJI("SMS_consent", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.yf, viewGroup, false);
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
