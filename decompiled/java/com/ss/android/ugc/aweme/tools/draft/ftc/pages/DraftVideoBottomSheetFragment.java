package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import X.C01GW;
import X.C098200Yq;
import X.C0CHQ;
import X.C0LAB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19292410dm;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS163S0100000_29;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class DraftVideoBottomSheetFragment extends BottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjJiMgZiE+KCknZiM4HELIOSKmEjKSIpOmEXOiQqPRk6LCAjCyAnPCohGic2LTEKOy40JSAiPQ==";
    public LinearLayout LL;
    public LinearLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 520));

    public final int MR() {
        if (getArguments() == null || !getArguments().containsKey("draft_selected_video_index")) {
            return -1;
        }
        return getArguments().getInt("draft_selected_video_index", -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        View view2 = getView();
        Object parent = null;
        if (view2 != null) {
            parent = view2.getParent();
        }
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.setBackgroundColor(0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String uid;
        super.onDismiss(dialogInterface);
        C0LAB c0lab = new C0LAB();
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        Object serializable = null;
        if (currentUser != null) {
            uid = currentUser.getUid();
        } else {
            uid = null;
        }
        c0lab.LJ("author_id", uid);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("draft_current_video");
        }
        c0lab.LJ("group_id", ((BaseShortVideoContext) serializable).getCreationId());
        C20684815ws.LJIILLIIL("close_more_button", c0lab.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.f767ola);
            } else {
                viewFindViewById = null;
            }
            this.LL = (LinearLayout) viewFindViewById;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById, new ACListenerS163S0100000_29(this, 225));
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.ol_);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (LinearLayout) viewFindViewById3;
        }
        C786410Ut5.R7((LinearLayout) viewFindViewById3, new ACListenerS163S0100000_29(this, 226));
        View view4 = this.LLILLL;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById2 = view5.findViewById(R.id.ol9);
            }
            this.LLILLL = (LinearLayout) viewFindViewById2;
            view4 = viewFindViewById2;
        }
        C786410Ut5.R7((LinearLayout) view4, new ACListenerS163S0100000_29(this, 227));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.czz, viewGroup, false);
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
