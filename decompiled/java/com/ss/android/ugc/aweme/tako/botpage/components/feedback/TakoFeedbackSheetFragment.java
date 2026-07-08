package com.ss.android.ugc.aweme.tako.botpage.components.feedback;

import X.AbstractC1250290idn;
import X.C098200Yq;
import X.C0DL2;
import X.C0DL5;
import X.C0H22;
import X.C0H23;
import X.C0I7D;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C746540TQe;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS147S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes13.dex */
public final class TakoFeedbackSheetFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9Kio4OS40LWsvJiIjHELIOSJyspJzsgZiMpLCsxKSYnZxsyIyoKLCo3KiQvIhw7LSA4Dz0yLygpJzs=";
    public C197039127h LL;
    public C0I7D LLILLJJLI;
    public RecyclerView LLILLL;
    public View LLILZ;
    public String LLILZIL;
    public C746540TQe LLILZLL;
    public AwS623S0100000_9 LLIZ;

    public final C0I7D MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hcg) : null;
            this.LLILLJJLI = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String string;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        C746540TQe c746540TQe = this.LLILZLL;
        if (c746540TQe == null || (string = getString(c746540TQe.naviTitle)) == null) {
            string = "";
        }
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
        C1251150ifB c1251150ifB = new C1251150ifB();
        C746540TQe c746540TQe2 = this.LLILZLL;
        int i = c746540TQe2 != null ? c746540TQe2.naviCloseDrawable : 0;
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = i;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 618));
        abstractC1250290idnArr[0] = c1251150ifB;
        c0om1.LIZIZ(abstractC1250290idnArr);
        c0om1.LIZLLL = true;
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
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        C746540TQe c746540TQe;
        DialogFragment dialogFragment;
        Window window;
        List<C0DL5> list;
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("tako_feedback_model");
        } else {
            serializable = null;
        }
        if (serializable instanceof C746540TQe) {
            c746540TQe = (C746540TQe) serializable;
        } else {
            c746540TQe = null;
        }
        this.LLILZLL = c746540TQe;
        this.LLILZ = view;
        C0I7D c0i7dMR = MR();
        if (c0i7dMR != null) {
            C746540TQe c746540TQe2 = this.LLILZLL;
            if (c746540TQe2 == null || (string = getString(c746540TQe2.hintTitle)) == null) {
                string = "";
            }
            c0i7dMR.setHint(string);
        }
        C746540TQe c746540TQe3 = this.LLILZLL;
        if (c746540TQe3 != null && (list = c746540TQe3.data) != null && (!list.isEmpty())) {
            View viewFindViewById = this.LLILLL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.tub);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLL = (RecyclerView) viewFindViewById;
            }
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            if (recyclerView != null) {
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
                flexboxLayoutManager.LJJII(1);
                flexboxLayoutManager.LJJIFFI(0);
                flexboxLayoutManager.LJJI(4);
                flexboxLayoutManager.LJJIII(0);
                recyclerView.setLayoutManager(flexboxLayoutManager);
                recyclerView.setAdapter(new C0DL2(getContext(), list, new AwS591S0100000_12(this, 723)));
            }
        }
        C746540TQe c746540TQe4 = this.LLILZLL;
        if (c746540TQe4 != null) {
            int i = c746540TQe4.submitTitle;
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.cm6);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (C197039127h) viewFindViewById2;
            }
            TextView textView = (TextView) viewFindViewById2;
            if (textView != null) {
                textView.setText(getString(i));
            }
        }
        View viewFindViewById3 = this.LL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.cm6);
            } else {
                viewFindViewById3 = null;
            }
            this.LL = (C197039127h) viewFindViewById3;
        }
        C197039127h c197039127h = (C197039127h) viewFindViewById3;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS147S0100000_12(this, 294));
        }
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && (dialogFragment = (DialogFragment) parentFragment) != null) {
            C19EG activity = getActivity();
            if (activity != null) {
                new C0H22(activity, activity.getWindow().getDecorView()).LIZ(new C0H23() { // from class: X.0TQf
                    @Override // X.C0H23
                    public final void LIZIZ() {
                    }

                    @Override // X.C0H23
                    public final void LIZ() {
                        View view5 = this.LIZ.LLILZ;
                        if (view5 != null) {
                            C426750GoL.LJIIL(view5, null, null, null, 0, 23);
                        }
                    }

                    @Override // X.C0H23
                    public final void LJJIIJ(int i2) {
                        View view5 = this.LIZ.LLILZ;
                        if (view5 != null) {
                            C426750GoL.LJIIL(view5, null, null, null, Integer.valueOf(i2), 23);
                        }
                    }
                });
            }
            Dialog dialog = dialogFragment.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setSoftInputMode(48);
            }
            C0I7D c0i7dMR2 = MR();
            if (c0i7dMR2 != null) {
                c0i7dMR2.setFocusable(true);
            }
            C0I7D c0i7dMR3 = MR();
            if (c0i7dMR3 != null) {
                c0i7dMR3.setFocusableInTouchMode(true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.foj, viewGroup, false);
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
