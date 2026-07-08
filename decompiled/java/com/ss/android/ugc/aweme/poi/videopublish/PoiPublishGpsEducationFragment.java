package com.ss.android.ugc.aweme.poi.videopublish;

import X.C098200Yq;
import X.C0HTI;
import X.C1308910kAL;
import X.C1667580tUq;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20684815ws;
import X.C2097908Jt;
import X.C770750ULh;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC836760Ws6
public final class PoiPublishGpsEducationFragment extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGElISEpJj8mHELIOSKiklOid9GColGToxJCw/IQgjOwAoPCwyPCwjJwkhKSIhLCEn";

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C20684815ws.LJIILLIIL("system_location_educational_page_show", C2097908Jt.LIZJ(new Pair("enter_from", "gps_educational_page")));
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LJ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            C770750ULh c770750ULh = new C770750ULh();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.pf;
            c770750ULh.LIZ = c0hti.LIZ(context);
            c770750ULh.LIZLLL = 1;
            c770750ULh.LJ = context.getString(2131828346);
            c770750ULh.LJ(new C1667580tUq(R.raw.icon_map_pin_fill, context.getString(2131828343), context.getString(2131828339), C1308910kAL.LIZJ(R.attr.a1k, context)), new C1667580tUq(R.raw.icon_video_stack_fill, context.getString(2131828344), context.getString(2131828340), C1308910kAL.LIZJ(R.attr.a1k, context)), new C1667580tUq(R.raw.icon_gear_fill, context.getString(2131828345), context.getString(2131828341), C1308910kAL.LIZJ(R.attr.a1k, context)));
            c770750ULh.LJIILLIIL = false;
            c770750ULh.LJI(context.getString(2131828342), new AwS583S0100000_4(this, 101));
            TuxIntroFragment tuxIntroFragmentLIZ = c770750ULh.LIZ();
            if (tuxIntroFragmentLIZ != null) {
                C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZIZ(R.id.gv4, tuxIntroFragmentLIZ);
                c19ehLJIIJ.LJIIIZ();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.e6c, viewGroup, false);
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
