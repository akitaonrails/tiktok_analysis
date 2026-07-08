package com.ss.android.ugc.aweme.topic.trendingtopic.ui;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import Y.ACListenerS136S0100000_1;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class VideoTrendingTopicGuideFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSYwZjE+LCE3ISsrPSHELIOSAjISZiPCZ9HiwoLCAHOiAiLSY9LxEjOSYwDzAlLSoVOiQrJCo9PA==";
    public C197039127h LL;
    public TuxNavBar LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String quantityString;
        String quantityString2;
        super.onViewCreated(view, bundle);
        this.LL = (C197039127h) view.findViewById(R.id.kx3);
        this.LLILLJJLI = (TuxNavBar) view.findViewById(R.id.kxq);
        C197039127h c197039127h = this.LL;
        TuxNavBar tuxNavBar = null;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C786410Ut5.U8(c197039127h, new ACListenerS136S0100000_1(this, 14));
        this.LLILLL = (TuxTextView) view.findViewById(R.id.kx0);
        Resources resources = getResources();
        if (resources != null) {
            quantityString = resources.getQuantityString(2131755767, 3, 3);
        } else {
            quantityString = null;
        }
        SpannableString spannableString = new SpannableString(quantityString);
        C786410Ut5.p2(spannableString, new BulletSpan(15), 0, spannableString.length(), 33);
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(spannableString);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.kx1);
        Resources resources2 = getResources();
        if (resources2 != null) {
            quantityString2 = resources2.getQuantityString(2131755768, 3, 3);
        } else {
            quantityString2 = null;
        }
        SpannableString spannableString2 = new SpannableString(quantityString2);
        C786410Ut5.p2(spannableString2, new BulletSpan(15), 0, spannableString2.length(), 33);
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.setText(spannableString2);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.kx2);
        SpannableString spannableString3 = new SpannableString(getString(2131850784));
        C786410Ut5.p2(spannableString3, new BulletSpan(15), 0, spannableString3.length(), 33);
        TuxTextView tuxTextView3 = this.LLILZIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        tuxTextView3.setText(spannableString3);
        TuxNavBar tuxNavBar2 = this.LLILLJJLI;
        if (tuxNavBar2 != null) {
            tuxNavBar = tuxNavBar2;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1501));
        c0om1.LIZIZ(c1251150ifB);
        tuxNavBar.setNavActions(c0om1);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i9k, viewGroup, false);
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
