package com.ss.android.ugc.aweme.poi.creator;

import X.C098200Yq;
import X.C0HTI;
import X.C0TUP;
import X.C1199020hJ6;
import X.C1220000hqw;
import X.C13LE;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20684815ws;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.C770740ULg;
import X.C770750ULh;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.poi.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import wh6.AbS699S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class PoiCreatorDisclaimerFragment extends BasePage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUjIGEwOiAtHELIOSPSAhZhUjIAwhLSQ4Jj0XITYvJS46JSA+Dz0yLygpJzs=";
    public C0TUP LLIZLLLIL;
    public C197039127h LLJ;
    public final C736950SvV LLJI;

    public PoiCreatorDisclaimerFragment() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(305);
        this.LLJI = new C736950SvV(C13LE.LIZ(PoiCreatorVM.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(327), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LJ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
        C1199020hJ6.LIZ.getClass();
        C20684815ws.onEventV3("enter_promote_local_businesses_page");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EH c19ehLJIIJ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        C19EG activity = getActivity();
        FragmentManager supportFragmentManager = null;
        if (activity != null) {
            supportFragmentManager = activity.getSupportFragmentManager();
        }
        Integer numValueOf = Integer.valueOf(R.id.qz4);
        if (context != null) {
            C770750ULh c770750ULh = new C770750ULh();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.o6;
            c770750ULh.LIZ = c0hti.LIZ(context);
            c770750ULh.LIZLLL = 1;
            c770750ULh.LJ = context.getString(2131836905);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C770740ULg(context.getString(2131836911), true));
            arrayList.add(new C770740ULg(context.getString(2131836912), true));
            arrayList.add(new C770740ULg(context.getString(2131836913), true));
            c770750ULh.LIZLLL(arrayList);
            c770750ULh.LJIILLIIL = true;
            TuxIntroFragment tuxIntroFragmentLIZ = c770750ULh.LIZ();
            if (tuxIntroFragmentLIZ != null && numValueOf != null && supportFragmentManager != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LIZIZ(numValueOf.intValue(), tuxIntroFragmentLIZ);
                c19ehLJIIJ.LJIIIZ();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dz6, viewGroup, false);
        this.LLIZLLLIL = (C0TUP) viewTd.findViewById(R.id.qz3);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.cpa);
        c197039127h.setEnabled(false);
        this.LLJ = c197039127h;
        C0TUP c0tup = this.LLIZLLLIL;
        C19GS c19gs = null;
        if (c0tup == null) {
            c0tup = null;
        }
        c0tup.setCheckboxClickCallback(new AwS597S0100000_18(this, 278));
        C197039127h c197039127h2 = this.LLJ;
        if (c197039127h2 == null) {
            c197039127h2 = null;
        }
        C786410Ut5.I7(new AbS699S0100000_18(this, 16, 42), c197039127h2);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
