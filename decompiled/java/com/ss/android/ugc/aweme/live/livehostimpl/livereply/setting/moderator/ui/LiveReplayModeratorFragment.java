package com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.ui;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1575870r6v;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20603715jn;
import X.C2217381BqS;
import X.C338490DOt;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.moderator.data.LiveModeratorListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveReplayModeratorFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final C1575870r6v LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiklPyohLTUgHELIOSMGEgLTE4ICE0ZigjLSohKTEjO2EmIWsAIDk2GiA8JS4qBSooLD0yPCo+Dz0yLygpJzs=";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public C1749280vcc LLIZLLLIL;
    public final AssemVMLazy LLJ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0r6v] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveReplayModeratorFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/setting/moderator/data/LiveModeratorListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = new Object() { // from class: X.0r6v
        };
    }

    public final C1749280vcc SR() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.z18) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131843122);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 717));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public final LiveModeratorListViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (LiveModeratorListViewModel) assemVMLazy.getValue();
    }

    public LiveReplayModeratorFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveModeratorListViewModel.class);
        this.LLJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS568S0100000_24(c19719912DlLIZ, 718), new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 719), AFwS264S0000000_24.get$arr$(198));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AssemViewModel.asyncSubscribe$default(UR(), new C2217381BqS() { // from class: X.0r6u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C326310Cqj) obj).LL;
            }
        }, this, null, new AwS603S0100000_24(this, 602), new AwS568S0100000_24(this, 1828), new AwS591S0100000_12(this, 1076), 4, null);
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.rn0);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(LiveModeratorCell.class);
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZJ = true;
            viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
            UR().setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
            viewOnAttachStateChangeListenerC20604515jv.LJIIL(UR().getConfig());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dd4, viewGroup, false);
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
