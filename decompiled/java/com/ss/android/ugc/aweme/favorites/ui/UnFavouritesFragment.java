package com.ss.android.ugc.aweme.favorites.ui;

import X.C098200Yq;
import X.C1389890mGx;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C616430OFt;
import X.C786410Ut5;
import X.InterfaceC616440OFu;
import Y.ACListenerS144S0100000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class UnFavouritesFragment extends Fragment implements InterfaceC616440OFu {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhHELIOSITEpOmEmIWsZJwkyPio5OyYnLTYKOy40JSAiPQ==";
    public String LL;
    public Aweme LLILLJJLI;
    public final C616430OFt LLILLL = new C616430OFt();

    @Override // X.InterfaceC616440OFu
    public final void ZX() {
        String aid;
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            aweme.setCollectStatus(0);
        }
        Aweme aweme2 = this.LLILLJJLI;
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            return;
        }
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Br(0, aid);
    }

    @Override // X.InterfaceC616440OFu
    public final void Me1(String str) {
        if (str == null) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    @Override // X.InterfaceC616440OFu
    public final void p30(Exception exc) {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIIZ(2131828351);
        c1389890mGx.LJIIJJI();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLL.LLILLJJLI = this;
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 34), view.findViewById(R.id.unfavourite_view));
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 35), view.findViewById(R.id.unfavourite_cancel));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.b62, viewGroup, false);
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
