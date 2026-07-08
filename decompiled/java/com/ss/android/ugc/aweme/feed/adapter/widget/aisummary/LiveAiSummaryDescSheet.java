package com.ss.android.ugc.aweme.feed.adapter.widget.aisummary;

import X.C098200Yq;
import X.C09JN;
import X.C0OM1;
import X.C11S5;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C20736316Cj;
import X.C444920HcY;
import X.C480460Ism;
import X.C497740JfY;
import X.C785810Us7;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS147S0100000_12;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.a0;
import tikcast.api.anchor_tool.SubmitLLMTitleFeedbackReq;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAiSummaryDescSheet extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpLCt9KSEtOTs2Oms7HELIOSICs0LTFiKCYgPSghKD0qZgklPyoSIRY5JCIyOjwILDwwGy0pLDs=";

    public final Map<String, String> NR() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("anchor_id")) == null) {
            string = "";
        }
        linkedHashMap.put("anchor_id", string);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("room_id")) == null) {
            string2 = "";
        }
        linkedHashMap.put("room_id", string2);
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString("enter_from_merge")) == null) {
            string3 = "";
        }
        linkedHashMap.put("enter_from_merge", string3);
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string4 = arguments4.getString("enter_method")) == null) {
            string4 = "";
        }
        linkedHashMap.put("enter_method", string4);
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string5 = arguments5.getString("action_type")) == null) {
            string5 = "";
        }
        linkedHashMap.put("action_type", string5);
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string6 = arguments6.getString("ai_summary_content")) != null) {
            str = string6;
        }
        linkedHashMap.put("ai_summary_content", str);
        linkedHashMap.put("on_feedback_panel", "1");
        return linkedHashMap;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C497740JfY.LJIJI(2131851014);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 443));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public final void MR(int i) {
        Object c098200Yq;
        long jLongValue;
        String string;
        String string2;
        SubmitLLMTitleFeedbackReq submitLLMTitleFeedbackReq = new SubmitLLMTitleFeedbackReq();
        Object obj = null;
        try {
            Bundle arguments = getArguments();
            if (arguments != null && (string2 = arguments.getString("room_id")) != null) {
                c098200Yq = Long.valueOf(CastLongProtector.parseLong(string2));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Long l = (Long) obj;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        submitLLMTitleFeedbackReq.roomId = jLongValue;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("result_key")) == null) {
            string = "";
        }
        submitLLMTitleFeedbackReq.resultKey = string;
        submitLLMTitleFeedbackReq.like = i;
        try {
            C480460Ism.LIZ().getClass();
            ((AiSummaryApi) C480460Ism.LIZLLL(AiSummaryApi.class)).aiSummaryFeedback(submitLLMTitleFeedbackReq).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0TL4
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("LiveAiSummaryDescSheet@a3e3.feedback$1$a$1");
                    C20441214yg.LIZIZ("LiveAiSummaryDescSheet", "feedback");
                    C1C7U.LIZIZ("LiveAiSummaryDescSheet@a3e3.feedback$1$a$1");
                }
            });
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.tv_report_content);
        String strLJIJI = C497740JfY.LJIJI(2131851020);
        String strLJIJJ = C497740JfY.LJIJJ(2131851019, strLJIJI);
        SpannableString spannableString = new SpannableString(strLJIJJ);
        int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
        int length = strLJIJI.length() + iLJJJ;
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.a1h, getContext())), iLJJJ, length, 33);
        C786410Ut5.p2(spannableString, new C444920HcY(62, true), iLJJJ, length, 33);
        C786410Ut5.p2(spannableString, new C785810Us7(this, 4), iLJJJ, length, 33);
        if (textView != null) {
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View viewFindViewById = view.findViewById(R.id.lc0);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 247), viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.lxn);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 248), viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.lxm);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 249), viewFindViewById3);
        }
        C20684815ws.LJIILLIIL("livesdk_summary_feedback_show", NR());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dci, viewGroup, false);
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
