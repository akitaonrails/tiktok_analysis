package com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C0E1T;
import X.C0E2B;
import X.C0FU0;
import X.C118300cf;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import Y.ARunnableS14S0400000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TTResourcePanelFragment<VM extends ViewModel> extends DTResourcePanelFragment<VM> {
    public LinearLayout LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public int LLLF;
    public final C01GW LLLFF = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(236));

    public final void hT() {
        View viewFindViewById;
        View viewFindViewById2;
        C19EG activity = getActivity();
        if (activity == null || (viewFindViewById = activity.findViewById(R.id.ygy)) == null || (viewFindViewById2 = activity.findViewById(R.id.gcv)) == null) {
            return;
        }
        C118300cf c118300cf = new C118300cf();
        if (viewFindViewById.getMeasuredHeight() != 0 && viewFindViewById2.getMeasuredHeight() != 0) {
            c118300cf.element = viewFindViewById2.getMeasuredHeight();
            gT(viewFindViewById.getMeasuredHeight() + viewFindViewById2.getMeasuredHeight());
        }
        HandlerHook.viewPost(viewFindViewById2, new ARunnableS14S0400000_5(viewFindViewById2, viewFindViewById, c118300cf, this, 1));
    }

    public final void iT() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        C19EG activity = getActivity();
        if (activity == null || (viewFindViewById = activity.findViewById(R.id.gcu)) == null || (viewFindViewById2 = activity.findViewById(R.id.ygy)) == null || (viewFindViewById3 = activity.findViewById(R.id.gcv)) == null) {
            return;
        }
        if (viewFindViewById.getMeasuredHeight() == 0 || viewFindViewById2.getMeasuredHeight() == 0 || viewFindViewById3.getMeasuredHeight() == 0) {
            HandlerHook.viewPost(viewFindViewById3, new ARunnableS14S0400000_5(viewFindViewById, viewFindViewById2, viewFindViewById3, this, 2));
        } else {
            gT(viewFindViewById.getMeasuredHeight() + viewFindViewById2.getMeasuredHeight() + viewFindViewById3.getMeasuredHeight());
        }
    }

    public final LinearLayout YS() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fkb) : null;
            this.LLJZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final boolean fT() {
        return ((Boolean) this.LLLFF.getValue()).booleanValue();
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int OR() {
        return fT() ? R.layout.c21 : R.layout.c1x;
    }

    public final VideoPublishEditModel ZS() {
        if (!isAdded()) {
            return null;
        }
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLJZ = null;
    }

    public final void eT() {
        LinearLayout linearLayoutYS = YS();
        if (linearLayoutYS != null) {
            C786410Ut5.LJZL(8, linearLayoutYS);
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        View viewFindViewById;
        super.onDetach();
        C19EG activity = getActivity();
        if (activity == null || (viewFindViewById = activity.findViewById(R.id.f7k)) == null) {
            return;
        }
        viewFindViewById.setImportantForAccessibility(this.LLLF);
        this.LLLF = 0;
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final ViewGroup PR(View view) {
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.fk7);
        }
        return null;
    }

    public final void VS(int i) {
        C19EG activity;
        if (C0E2B.LIZ() && (activity = getActivity()) != null) {
            Display defaultDisplay = ScreenUtils.getDefaultDisplay(activity);
            if (ScreenUtils.getFullScreenHeight(defaultDisplay) * 9 > ScreenUtils.getScreenWidth(defaultDisplay) * 16) {
                gT(C0FU0.LIZ(i));
            }
        }
    }

    public final void gT(int i) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View view = this.LLJZIJLIL;
        if (view != null && (layoutParams3 = view.getLayoutParams()) != null) {
            this.LLJLILLLLZIIL = i;
            layoutParams3.height = i;
            View view2 = this.LLJZIJLIL;
            if (view2 != null) {
                C786410Ut5.W5(view2, layoutParams3);
            }
        }
        View view3 = this.LLL;
        ViewGroup.LayoutParams layoutParams4 = null;
        if (view3 != null) {
            layoutParams = view3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            View view4 = this.LLL;
            if (view4 != null) {
                layoutParams4 = view4.getLayoutParams();
            }
            if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) != null) {
                layoutParams2.height = 0;
                layoutParams2.weight = 1.0f;
                View view5 = this.LLL;
                if (view5 != null) {
                    C786410Ut5.W5(view5, layoutParams2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        View viewFindViewById;
        super.onAttach(context);
        C19EG activity = getActivity();
        if (activity != null && (viewFindViewById = activity.findViewById(R.id.f7k)) != null) {
            this.LLLF = viewFindViewById.getImportantForAccessibility();
            viewFindViewById.setImportantForAccessibility(4);
        }
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (viewOnCreateView != null) {
            viewFindViewById = viewOnCreateView.findViewById(R.id.fk6);
        } else {
            viewFindViewById = null;
        }
        this.LLJZIJLIL = viewFindViewById;
        if (viewOnCreateView != null) {
            viewFindViewById2 = viewOnCreateView.findViewById(R.id.fk7);
        } else {
            viewFindViewById2 = null;
        }
        this.LLL = viewFindViewById2;
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}
