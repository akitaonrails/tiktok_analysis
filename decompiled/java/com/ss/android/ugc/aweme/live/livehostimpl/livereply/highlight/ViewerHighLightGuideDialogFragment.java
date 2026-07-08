package com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight;

import X.C098200Yq;
import X.C1143680frq;
import X.C1143780fs0;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20684815ws;
import X.C426750GoL;
import X.C444920HcY;
import X.C485260J1g;
import X.C497740JfY;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import irm.AkS79S0100000_7;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC836760Ws6
public final class ViewerHighLightGuideDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklPyohLTHELIOSUgMGE7ISIkJSY0IDFiHyY2PyA+ASY0IAklLicnDzAlLSoXISQgJigVOiQrJCo9PA==";
    public Function0<Unit> LL = AFwS193S0000000_7.get$arr$(151);

    public final void MR(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "live_recording");
        linkedHashMap.put("popup_type", "share_viewer");
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("click_type", str2);
        C485260J1g.LIZ.getClass();
        C20684815ws.LJIILLIIL("livesdk_live_anchor_highlight_element_popup", linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        TuxTextView tuxTextView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.onViewCreated(view, bundle);
        boolean zLIZIZ = C960203pA.LIZIZ(view.getContext());
        if (C426750GoL.LIZLLL(view.getContext()) && (tuxTextView = (TuxTextView) view.findViewById(R.id.jmw)) != null) {
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.width = (int) C497740JfY.LIZIZ(146.0f);
                marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(100.0f));
                C786410Ut5.R6(tuxTextView, marginLayoutParams);
            }
        }
        View viewFindViewById = view.findViewById(R.id.jmv);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS79S0100000_7(this, 1), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.jmz);
        if (viewFindViewById2 != null) {
            if (zLIZIZ) {
                str2 = "live_user_highlight_intro_bg_dark.png";
            } else {
                str2 = "live_user_highlight_intro_bg.png";
            }
            C1143680frq.LJI(viewFindViewById2, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_2", str2), null, true);
        }
        View viewFindViewById3 = view.findViewById(R.id.jn0);
        if (viewFindViewById3 != null) {
            if (zLIZIZ) {
                str = "live_user_highlight_intro_post_dark.png";
            } else {
                str = "live_user_highlight_intro_post.png";
            }
            C1143680frq.LJI(viewFindViewById3, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_2", str), null, true);
        }
        View viewFindViewById4 = view.findViewById(R.id.poc);
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(new AkS79S0100000_7(this, 2), viewFindViewById4);
        }
        TextView textView = (TextView) view.findViewById(R.id.jmx);
        if (textView != null) {
            String strLJIJI = C497740JfY.LJIJI(2131856926);
            int iLJJIZ = a0.LJJIZ(strLJIJI, '[', 0, false, 6);
            int iLJJIZ2 = a0.LJJIZ(strLJIJI, ']', 0, false, 6);
            SpannableString spannableString = new SpannableString(u.LJJIFFI(u.LJJIFFI(strLJIJI, e3.e, "", false), e3.f, "", false));
            C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJIZ, iLJJIZ2 - 1, 17);
            textView.setText(spannableString);
        }
        MR("show", "");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ddy, viewGroup, false);
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
