package com.ss.android.ugc.aweme.story.userpanel.ui;

import X.C098200Yq;
import X.C1220000hqw;
import X.C13LE;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public class StoryUserListPanelAssem extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4Jj0qZjA/LDHELIOS0jKSspJWEmIWsfPSAhMRA/LD0fITY4GS49LSkNOjw2JQ==";
    public final C736950SvV LLIZ;
    public final AFwS190S0000000_4 LLIZLLLIL;

    public final StoryUserListViewModel SR() {
        return (StoryUserListViewModel) this.LLIZ.getValue();
    }

    public StoryUserListPanelAssem() {
        AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(1996);
        this.LLIZ = new C736950SvV(C13LE.LIZ(StoryUserListViewModel.class), aFwS190S0000000_4, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS232S0000000_4.get$arr$(78), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLIZLLLIL = AFwS190S0000000_4.get$arr$(1995);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    @Override // X.InterfaceC344240DeY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0OM1 Sn() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.userpanel.ui.StoryUserListPanelAssem.Sn():X.0OM1");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.userpanel.ui.StoryUserListPanelAssem.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fdg, viewGroup, false);
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
