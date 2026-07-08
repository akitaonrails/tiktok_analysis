package com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui;

import X.C098200Yq;
import X.C0I7D;
import X.C0OM1;
import X.C0R4E;
import X.C0R4H;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C21578619ce;
import X.C2188811AlT;
import X.C284310BCj;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS45S0500000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchFeedbackOptionalDetailFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDFiKiA+JSoiZyHELIOSk2LSEuKCw4ZiYjOyp9PSxiGioyOiYkDyo2LCctKiQcODElJiEyJAEpPS46JAM+KCg+LSs4";
    public C197039127h LL;
    public C0I7D LLILLJJLI;
    public TuxTextView LLILLL;
    public C21578619ce LLILZ;
    public View LLILZIL;
    public boolean LLIZ;
    public FeedbackMultipleChoice LLJ;
    public Map<String, String> LLJI;
    public C0R4E LLJILJIL;
    public AwS45S0500000_10 LLJILJILJ;
    public int LLILZLL = -1;
    public int LLIZLLLIL = -1;
    public int LLJIJIL = -1;
    public int LLJILLL = -1;

    public final C0I7D MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u_i) : null;
            this.LLILLJJLI = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final C197039127h NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u_o) : null;
            this.LL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string;
        String value;
        Resources resources;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (string = resources.getString(2131822169)) == null) {
            string = "";
        }
        FeedbackMultipleChoice feedbackMultipleChoice = this.LLJ;
        if (feedbackMultipleChoice != null && (value = feedbackMultipleChoice.getValue()) != null) {
            string = value;
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS554S0100000_10(this, 448));
        c0om1.LIZIZ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB2.LIZJ(new AwS554S0100000_10(this, 449));
        c0om1.LJ(c1251150ifB2);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View view = this.LLILZIL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.C3(view.getViewTreeObserver(), this.LLJILJIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = this.LLILZIL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.x3(view.getViewTreeObserver(), this.LLJILJIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FeedbackMultipleChoice feedbackMultipleChoice;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("param_feedback_choice");
            if (serializable instanceof FeedbackMultipleChoice) {
                feedbackMultipleChoice = (FeedbackMultipleChoice) serializable;
            } else {
                feedbackMultipleChoice = null;
            }
            this.LLJ = feedbackMultipleChoice;
            this.LLIZLLLIL = arguments.getInt("param_feedback_rank", -1);
            this.LLIZ = arguments.getBoolean("param_feedback_require_content", false);
        }
    }

    public static void OR(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = i;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        super.onViewCreated(view, bundle);
        View view2 = this.LLILZIL;
        View viewFindViewById = null;
        if (view2 == null) {
            view2 = null;
        }
        view2.getLayoutParams().height = this.LLILZLL;
        if (C284310BCj.LIZ()) {
            this.LLILZ = (C21578619ce) view.findViewById(R.id.u_j);
        }
        NR().setEnabled(!this.LLIZ);
        C786410Ut5.U8(NR(), new ACListenerS145S0100000_10(this, 21));
        MR().addTextChangedListener(new C0R4H(this, 1));
        Context context = getContext();
        if (context != null) {
            String string = context.getResources().getString(2131848275);
            View view3 = this.LLILLL;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.u_n);
                }
                this.LLILLL = (TuxTextView) viewFindViewById;
                view3 = viewFindViewById;
            }
            TextView textView = (TextView) view3;
            CharSequence charSequence = string;
            if (this.LLIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append(" *");
                SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), spannableString.length() - 1, spannableString.length(), 33);
                charSequence = spannableString;
            }
            textView.setText(charSequence);
        }
        this.LLJILJIL = new C0R4E(this, 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C284310BCj.LIZ()) {
            i = R.layout.f30;
        } else {
            i = R.layout.f2z;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        this.LLILZIL = viewTd;
        C19GS c19gs = null;
        if (viewTd == null) {
            viewTd = null;
        }
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
