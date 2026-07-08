package com.ss.android.ugc.trill.setting;

import X.C098200Yq;
import X.C0OM1;
import X.C11G4;
import X.C1237450iJ5;
import X.C127K;
import X.C1685300txQ;
import X.C189200o6;
import X.C19270210aC;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoLanguageFragment extends AmeBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZjYpHELIOSPTs6JiJiHyY3LSoAKCE0PSQrLAkhKSIhLCEn";
    public TuxNavBar LL;
    public C127K LLILLJJLI;
    public RecyclerView LLILLL;
    public C19270210aC LLILZ;
    public VideoLanguageActivity LLILZIL;

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.y1z);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxNavBar) viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1237450iJ5.LIZIZ(c0om1, getString(2131858130), new AwS548S0100000_4(this, 439));
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.adz);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = (C127K) viewFindViewById2;
        }
        ((C127K) viewFindViewById2).setTitle(getString(2131825146));
        View viewFindViewById3 = this.LLILLL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.afr);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLL = (RecyclerView) viewFindViewById3;
        }
        ((RecyclerView) viewFindViewById3).setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.LLILZ = new C19270210aC(requireActivity());
        View viewFindViewById4 = this.LLILLL;
        if (viewFindViewById4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById4 = view5.findViewById(R.id.afr);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLL = (RecyclerView) viewFindViewById4;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        C19270210aC c19270210aC = this.LLILZ;
        if (c19270210aC == null) {
            c19270210aC = null;
        }
        recyclerView.setAdapter(c19270210aC);
        Context context = getContext();
        if (context != null) {
            View viewFindViewById5 = this.LLILLJJLI;
            if (viewFindViewById5 == null) {
                View view6 = getView();
                if (view6 != null) {
                    viewFindViewById5 = view6.findViewById(R.id.adz);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILLJJLI = (C127K) viewFindViewById5;
            }
            C11G4 c11g4 = new C11G4(context, null);
            c11g4.LJIILL(new ACListenerS139S0100000_4(this, 76));
            ((C127K) viewFindViewById5).setAccessory(c11g4);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9x, viewGroup, false);
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
