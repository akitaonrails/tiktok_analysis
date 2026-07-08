package com.ss.android.ugc.aweme.authorize;

import X.C098200Yq;
import X.C0JEF;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19H6;
import X.C19H7;
import X.C1B3S;
import X.C1B3X;
import X.C418730GbP;
import X.C635630OwT;
import X.C786410Ut5;
import Y.ACListenerS166S0100000_32;
import Y.AObserverS213S0100000_9;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public final class I18nScopesFragment extends Fragment implements C0JEF {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ5HELIOSPSc8Oiw2LGEaeX0iGiw8OCA/Dz0yLygpJzs=";
    public RecyclerView LL;
    public C418730GbP LLILLJJLI;
    public C1B3S LLILLL;
    public AuthCommonViewModel LLILZ;
    public AwemeAuthorizePlatformDepend LLILZIL;
    public C19H7 LLILZLL;
    public C635630OwT LLIZ;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILLL = new C1B3S(getArguments());
        this.LLILZIL = new AwemeAuthorizePlatformDepend(this);
        getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LLILZIL;
        C1B3S c1b3s = null;
        if (awemeAuthorizePlatformDepend == null) {
            awemeAuthorizePlatformDepend = null;
        }
        this.LLILZLL = new C19H7(awemeAuthorizePlatformDepend);
        Application application = requireActivity().getApplication();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.LLILZIL;
        if (awemeAuthorizePlatformDepend2 == null) {
            awemeAuthorizePlatformDepend2 = null;
        }
        C19H7 c19h7 = this.LLILZLL;
        if (c19h7 == null) {
            c19h7 = null;
        }
        C1B3S c1b3s2 = this.LLILLL;
        if (c1b3s2 != null) {
            c1b3s = c1b3s2;
        }
        this.LLILZ = (AuthCommonViewModel) ViewModelProviders.of(requireActivity(), new C19H6(application, awemeAuthorizePlatformDepend2, c19h7, c1b3s, C1B3X.LIZ(getArguments()))).get(AuthCommonViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLIZ = new C635630OwT();
        View viewFindViewById = this.LL;
        AuthCommonViewModel authCommonViewModel = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.ms6);
            } else {
                viewFindViewById = null;
            }
            this.LL = (RecyclerView) viewFindViewById;
        }
        ((RecyclerView) viewFindViewById).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.ms6);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (RecyclerView) viewFindViewById2;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        C635630OwT c635630OwT = this.LLIZ;
        if (c635630OwT == null) {
            c635630OwT = null;
        }
        recyclerView.setAdapter(c635630OwT);
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.bmz);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (C418730GbP) viewFindViewById3;
        }
        C786410Ut5.Ia((C418730GbP) viewFindViewById3, new ACListenerS166S0100000_32(this, 114));
        AuthCommonViewModel authCommonViewModel2 = this.LLILZ;
        if (authCommonViewModel2 == null) {
            authCommonViewModel2 = null;
        }
        authCommonViewModel2.LLJILJILJ.observe(this, new AObserverS213S0100000_9(this, 17));
        AuthCommonViewModel authCommonViewModel3 = this.LLILZ;
        if (authCommonViewModel3 != null) {
            authCommonViewModel = authCommonViewModel3;
        }
        authCommonViewModel.LLJJ.observe(this, new AObserverS213S0100000_9(this, 18));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        View viewSd = C786410Ut5.Sd(R.layout.c8i, layoutInflater, null);
        if (!(viewSd instanceof View)) {
            viewSd = null;
        }
        if (viewSd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewSd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewSd, this);
                viewSd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewSd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewSd;
    }
}
