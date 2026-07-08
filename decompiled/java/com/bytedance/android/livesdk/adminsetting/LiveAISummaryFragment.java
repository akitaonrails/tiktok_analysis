package com.bytedance.android.livesdk.adminsetting;

import X.C098200Yq;
import X.C0OM1;
import X.C0TZE;
import X.C0UF5;
import X.C1119920fFW;
import X.C1143680frq;
import X.C1143780fs0;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LP;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20736316Cj;
import X.C20743716Ff;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C758130ToZ;
import X.C785780Us4;
import X.C786410Ut5;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAiSummaryDesignStyleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAISummaryFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhHELIOSICEgLTE4ICE0ZgklPyoSARY5JCIyOjwKOy40JSAiPQ==";

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        boolean z = true;
        if (!LiveHostSettingsUIConfig.enable()) {
            view.setFitsSystemWindows(true);
        }
        LiveAiSummaryDesignStyleSetting liveAiSummaryDesignStyleSetting = LiveAiSummaryDesignStyleSetting.INSTANCE;
        if (liveAiSummaryDesignStyleSetting.style1()) {
            str = "ttlive_ai_summary_example_picture_style1.png";
        } else if (liveAiSummaryDesignStyleSetting.style2()) {
            str = "ttlive_ai_summary_example_picture_style2.png";
        } else {
            str = "ttlive_ai_summary_example_picture.png";
        }
        List list = null;
        C1143680frq.LJIIJ(view.findViewById(R.id.tyz), C1143780fs0.LJIIJJI("tiktok_live_broadcast_normal_1", str), ImageView.ScaleType.FIT_CENTER, null, false, null, 48);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        String str2 = null;
        if (dataChannelLJ != null && (list = (List) dataChannelLJ.gg0(C0TZE.class)) != null) {
            str2 = (String) C13LP.LJJJLL(list);
        }
        if (C500260Jjc.LJJIIZ(str2)) {
            C500260Jjc.LLFFF(view.findViewById(R.id.m6_));
            TextView textView = (TextView) view.findViewById(R.id.m6a);
            if (textView != null) {
                textView.setText(str2);
            }
            String strLJIJI = C497740JfY.LJIJI(2131851020);
            String strLJIJJ = C497740JfY.LJIJJ(2131851019, strLJIJI);
            SpannableString spannableString = new SpannableString(strLJIJJ);
            int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
            int length = strLJIJI.length() + iLJJJ;
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezs, getContext())), iLJJJ, length, 33);
            C1119920fFW.LJ(getContext(), spannableString, iLJJJ, length, 33, 6, 500);
            C786410Ut5.p2(spannableString, new C785780Us4(list, this, 0), iLJJJ, length, 33);
            TextView textView2 = (TextView) view.findViewById(R.id.t95);
            textView2.setText(spannableString);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            C500260Jjc.LLFFF(textView2);
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.arx);
        if (tuxNavBar != null) {
            tuxNavBar.LJIIZILJ(false);
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS556S0100000_12(this, 83));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = C497740JfY.LJIJI(2131851014);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZJ(0);
            tuxNavBar.setNavActions(c0om1);
        }
        C20743716Ff c20743716Ff = (C20743716Ff) view.findViewById(R.id.wtt);
        if (c20743716Ff != null) {
            C758130ToZ c758130ToZLJ = C0UF5.LJ();
            if (c758130ToZLJ == null || !c758130ToZLJ.LIZ) {
                z = false;
            }
            c20743716Ff.setChecked(z);
            C500260Jjc.LJLIIIL(500L, c20743716Ff, new AwS378S0200000_12(c20743716Ff, this, 12));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fxt, viewGroup, false);
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
