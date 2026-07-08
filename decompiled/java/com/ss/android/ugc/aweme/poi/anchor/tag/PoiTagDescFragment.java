package com.ss.android.ugc.aweme.poi.anchor.tag;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C444920HcY;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC836760Ws6
public final class PoiTagDescFragment extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEyHELIOSJiYkJj19PCQrZx88IREtLgs2OyYKOy40JSAiPQ==";

    @Override // com.ss.android.ugc.aweme.poi.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS232S0000000_4.get$arr$(52));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 186));
        c0om1.LJ(c1251150ifB);
        tuxNavBar.setNavActions(c0om1);
        Context contextRequireContext = requireContext();
        ((ImageView) view.findViewById(R.id.f59)).setImageResource(R.drawable.cvs);
        C786410Ut5.I7(new ACListenerS139S0100000_4(this, 41), view.findViewById(R.id.eoq));
        TextView textView = (TextView) view.findViewById(R.id.c83);
        String string = contextRequireContext.getString(2131835170);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new SpannableString(contextRequireContext.getString(2131835169, string)));
        int iLJJJ = a0.LJJJ(contextRequireContext.getString(2131835169), "%1$s", 0, false, 6);
        if (iLJJJ > 0) {
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(41, false), 0, iLJJJ, 33);
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(43, false), iLJJJ, string.length() + iLJJJ, 33);
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(41, false), string.length() + iLJJJ, spannableStringBuilder.length(), 33);
        }
        textView.setText(spannableStringBuilder);
        TextView textView2 = (TextView) view.findViewById(R.id.c86);
        String string2 = contextRequireContext.getString(2131835173);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(new SpannableString(contextRequireContext.getString(2131835172, string2)));
        C786410Ut5.q2(spannableStringBuilder2, new C444920HcY(43, false), 0, string2.length(), 33);
        C786410Ut5.q2(spannableStringBuilder2, new C444920HcY(41, false), string2.length(), spannableStringBuilder2.length(), 33);
        textView2.setText(spannableStringBuilder2);
        TextView textView3 = (TextView) view.findViewById(R.id.c88);
        String string3 = contextRequireContext.getString(2131835175);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(new SpannableString(contextRequireContext.getString(2131835174, string3)));
        C786410Ut5.q2(spannableStringBuilder3, new C444920HcY(43, false), 0, string3.length(), 33);
        C786410Ut5.q2(spannableStringBuilder3, new C444920HcY(41, false), string3.length(), spannableStringBuilder3.length(), 33);
        textView3.setText(spannableStringBuilder3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e45, viewGroup, false);
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
