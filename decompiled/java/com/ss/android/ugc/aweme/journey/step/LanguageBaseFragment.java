package com.ss.android.ugc.aweme.journey.step;

import X.AbstractC1585810rMx;
import X.C098200Yq;
import X.C10VO;
import X.C12ES;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C616540OGe;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public abstract class LanguageBaseFragment extends NUJComponentFragment {
    public ViewGroup LLJI;
    public C197039127h LLJIJIL;
    public RecyclerView LLJILJIL;
    public C197039127h LLJILJILJ;
    public TuxNavBar LLJILLL;
    public TextView LLJJ;
    public RecyclerView LLJJI;
    public AwS607S0100000_28 LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJIII = System.currentTimeMillis();
    public long LLJJJ = System.currentTimeMillis();

    public final RecyclerView VR() {
        RecyclerView recyclerView = this.LLJJI;
        if (recyclerView != null) {
            return recyclerView;
        }
        return null;
    }

    public final TuxNavBar WR() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.y08) : null;
            this.LLJILLL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        AwS607S0100000_28 awS607S0100000_28;
        this.LLJJIJIL += System.currentTimeMillis() - this.LLJJJ;
        if (!this.LLJJIJIIJIL && (awS607S0100000_28 = this.LLJJIJI) != null) {
            awS607S0100000_28.invoke(Boolean.TRUE);
        }
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJJJ = jCurrentTimeMillis;
        this.LLJJIII = jCurrentTimeMillis;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJIJIL;
        TextView textView = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.csd);
            } else {
                viewFindViewById = null;
            }
            this.LLJIJIL = (C197039127h) viewFindViewById;
        }
        this.LLJJ = (TextView) viewFindViewById;
        View viewFindViewById2 = this.LLJILJIL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.tvr);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJILJIL = (RecyclerView) viewFindViewById2;
        }
        this.LLJJI = (RecyclerView) viewFindViewById2;
        VR().setItemAnimator(null);
        TextView textView2 = this.LLJJ;
        if (textView2 == null) {
            textView2 = null;
        }
        C10VO.LIZJ(textView2, 0.75f);
        View viewFindViewById3 = this.LLJILJILJ;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.cv9);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJILJILJ = (C197039127h) viewFindViewById3;
        }
        C10VO.LIZJ(viewFindViewById3, 0.75f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) VR().getLayoutParams();
        int iLIZJ = marginLayoutParams.leftMargin - ((int) C12ES.LIZJ(4.0f, VR().getContext()));
        marginLayoutParams.leftMargin = iLIZJ;
        marginLayoutParams.rightMargin = iLIZJ;
        TextView textView3 = this.LLJJ;
        if (textView3 != null) {
            textView = textView3;
        }
        textView.setEnabled(false);
        VR().addOnScrollListener(new AbstractC1585810rMx() { // from class: X.10RA
            public int LL;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                this.LL += i2;
                if (this.LLILLJJLI.isViewValid() && this.LLILLJJLI.WR().getHeight() > 0) {
                    C786410Ut5.C5(this.LLILLJJLI.WR(), (this.LL * 1.0f) / this.LLILLJJLI.WR().getHeight());
                }
            }
        });
        C786410Ut5.C5(WR(), 0.0f);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.czb, viewGroup, false);
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
