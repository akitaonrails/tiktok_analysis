package com.ss.android.ugc.aweme.inbox.bulletin;

import X.C098200Yq;
import X.C0OLV;
import X.C0OPQ;
import X.C0OPX;
import X.C1220000hqw;
import X.C13LE;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2344009Gk;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinMemberListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class BulletinMemberListFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZic5HELIOSJSM2PCwiZw0mJCkpPSY9BSAhKyohBCw/PQkhKSIhLCEn";
    public long LLIZ;

    public BulletinMemberListFragment() {
        new AwS553S0100000_9(this, 191);
        C13LE.LIZ(BulletinMemberListViewModel.class);
        AFwS240S0000000_9.get$arr$(138);
        new C451460Hn6(this, false);
        new C451620HnM(this, true);
        new C338520DOw(this);
        new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.LLIZ = C0OPX.LIZLLL(getArguments(), "bulletin_board_id");
        NR(AFwS240S0000000_9.get$arr$(136));
        activityConfiguration(AFwS240S0000000_9.get$arr$(137));
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        String string;
        boolean z;
        String string2;
        Integer numLJIIJJI;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("bulletin_account_status")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string2)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 1;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("previous_page")) == null) {
            string = "";
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("enter_from_create");
        } else {
            z = false;
        }
        long jLIZLLL = C0OPX.LIZLLL(getArguments(), "member_cnt");
        C723850SaN.LIZ(this, false, null, new AwS375S0200000_9(this, new C0OLV(String.valueOf(this.LLIZ), string, z, iIntValue, null, null, false, null, false, false, null, null, null, null, null, null, null, 130992), 40), 3);
        C0OPQ c0opq = C0OPQ.LIZ;
        String strValueOf = String.valueOf(this.LLIZ);
        c0opq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", string);
        c2344009Gk.LJIIIIZZ("channel_id", strValueOf);
        c2344009Gk.LIZLLL(jLIZLLL, "member_cnt");
        C20684815ws.LJIILLIIL("enter_member_list_page", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a7i, viewGroup, false);
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
