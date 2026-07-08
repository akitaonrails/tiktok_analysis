package com.ss.android.ugc.aweme.compliance.privacy.impl;

import X.C098200Yq;
import X.C0HTI;
import X.C11NJ;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import Y.ACListenerS139S0100000_4;
import Y.ACListenerS162S0100000_28;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class FollowingAndFollowerVisibilityGuideFragment extends AmeBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODclPy4wMWslJDHELIOS8/ZgMjJSM8PywiLg49LAMjJSM8PyA+HyYgISclJSYnMQI5ICs2DjctLiI2JjE=";
    public C197039127h LL;
    public C197039127h LLILLJJLI;
    public TuxIconView LLILLL;
    public ImageView LLILZ;
    public TuxTextView LLILZIL;
    public final C11NJ LLILZLL = new C11NJ();
    public String LLIZ = "";

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLILZLL.LJ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public final void MR(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLIZ);
        c2344009Gk.LJIIIIZZ("click", str);
        C20684815ws.LJIILLIIL("click_following_fans_list_setting_guide", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLIZ);
        C20684815ws.LJIILLIIL("following_fans_list_setting_guide_show", c2344009Gk.LIZ);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.m26);
            } else {
                viewFindViewById = null;
            }
            this.LL = (C197039127h) viewFindViewById;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById, new ACListenerS139S0100000_4(this, 30));
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.nx6);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (C197039127h) viewFindViewById3;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById3, new ACListenerS162S0100000_28(this, 44));
        View viewFindViewById4 = this.LLILLL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.e1y);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLL = (TuxIconView) viewFindViewById4;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById4, new ACListenerS139S0100000_4(this, 31));
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.wk;
        Drawable drawableLIZ = c0hti.LIZ(view.getContext());
        View viewFindViewById5 = this.LLILZ;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.ruf);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILZ = (ImageView) viewFindViewById5;
        }
        ((ImageView) viewFindViewById5).setImageDrawable(drawableLIZ);
        String string = getString(2131834810);
        String strJ4 = C786410Ut5.j4(getString(2131834808), Arrays.copyOf(new Object[]{string}, 1));
        int iLJJJ = a0.LJJJ(strJ4, string, 0, false, 6);
        View view6 = this.LLILZIL;
        if (view6 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById2 = view7.findViewById(R.id.igg);
            }
            this.LLILZIL = (TuxTextView) viewFindViewById2;
            view6 = viewFindViewById2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, string.length() + iLJJJ, 17);
        ((TextView) view6).setText(spannableStringBuilder);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Bundle arguments = getArguments();
        C19GS c19gs = null;
        if (arguments != null) {
            string = arguments.getString("enter_from");
        } else {
            string = null;
        }
        this.LLIZ = String.valueOf(string);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bdo, viewGroup, false);
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
