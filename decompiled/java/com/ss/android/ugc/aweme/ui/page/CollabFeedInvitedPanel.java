package com.ss.android.ugc.aweme.ui.page;

import X.C098200Yq;
import X.C0OM1;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1575080r5e;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C2097608Jq;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C723850SaN;
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
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.vm.feed.CollabFeedInvitedContainerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabFeedInvitedPanel extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAlZzHELIOS8yLyBiCiA/JCQuDyo2LAwiPyYnLSEcKCE2JA==";
    public final C736950SvV LLIZ;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1476));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131828922);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        return c0om1;
    }

    public CollabFeedInvitedPanel() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(391);
        this.LLIZ = new C736950SvV(C13LE.LIZ(CollabFeedInvitedContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(507), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS264S0000000_24.get$arr$(506));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            CollabFeedInvitedContainerViewModel collabFeedInvitedContainerViewModel = (CollabFeedInvitedContainerViewModel) this.LLIZ.getValue();
            Aweme aweme = (Aweme) arguments.getSerializable("bundle_aweme");
            Pair[] pairArr = new Pair[3];
            String string = arguments.getString("enter_from");
            String str = "";
            if (string == null) {
                string = "";
            }
            pairArr[0] = new Pair("enter_from", string);
            String string2 = arguments.getString("user_type");
            if (string2 == null) {
                string2 = "";
            }
            pairArr[1] = new Pair("user_type", string2);
            String string3 = arguments.getString(Scene.SCENE_SERVICE);
            if (string3 != null) {
                str = string3;
            }
            pairArr[2] = new Pair(Scene.SCENE_SERVICE, str);
            collabFeedInvitedContainerViewModel.LL = new C1575080r5e(aweme, C2097608Jq.LJIIIIZZ(pairArr));
        }
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 384), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null) {
            viewTd = C20673215v0.LIZLLL(R.layout.age, activity, viewGroup, false);
        } else {
            viewTd = null;
        }
        if (viewTd == null) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.age, viewGroup, false);
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
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
