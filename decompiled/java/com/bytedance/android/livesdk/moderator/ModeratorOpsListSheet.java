package com.bytedance.android.livesdk.moderator;

import X.C01A6;
import X.C0IJT;
import X.C0UO0;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C1834150xpV;
import X.C20441214yg;
import X.C20642515q3;
import X.C474500IjA;
import X.C475510Ikn;
import X.C482260Ivg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C516201zk;
import X.C758170Tod;
import X.C786410Ut5;
import X.C800330VaR;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ModeratorOpsListSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSHELIOSooLD0yPCo+ZwI8LCA+KDs8Ogo8OgM6OzEfISo2PA==";
    public ExpandableListView LLJLLL;
    public C01A6 LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C20642515q3.LJI(2131852452));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    public final void uS() {
        C20441214yg.LIZIZ("AdminMonitor#ops", "fetch start");
        ((AdminApi) C482260Ivg.LIZJ(AdminApi.class)).getModeratorOperationRecords().LJIILIIL(new C0UO0()).LJJLL(new C516201zk(this, 84), new C516201zk(this, 85));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        uS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/moderator/ModeratorOpsListSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUk9dYxuQJJwtbWy1ZHAEMLnFWdWUw==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            uS();
        }
    }

    public final void wS(boolean z) {
        Integer numValueOf;
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_records_fold");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this))), "room_id");
        C01A6 c01a6 = this.LLJZ;
        if (c01a6 != null) {
            numValueOf = Integer.valueOf(c01a6.LIZ.size());
        } else {
            numValueOf = null;
        }
        c474500IjALIZ.LJJII(numValueOf, "record_cnt");
        if (z) {
            str = "fold";
        } else {
            str = "unfold";
        }
        c474500IjALIZ.LJJII(str, "fold_condition");
        c474500IjALIZ.LIZ();
    }

    public final void yS(int i) {
        Object objValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_records_view");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        if (C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this)) > 0) {
            objValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this)));
        } else {
            objValueOf = "";
        }
        c474500IjALIZ.LJJII(objValueOf, "room_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "record_cnt");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ExpandableListView expandableListView = (ExpandableListView) view.findViewById(R.id.oji);
        if (expandableListView != null) {
            C01A6 c01a6 = new C01A6(new ArrayList(), this);
            this.LLJZ = c01a6;
            expandableListView.setAdapter(c01a6);
            expandableListView.setGroupIndicator(null);
            expandableListView.setChildIndicator(null);
            expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() { // from class: X.01xE
                @Override // android.widget.ExpandableListView.OnGroupExpandListener
                public final void onGroupExpand(int i) {
                    this.LIZ.wS(false);
                }
            });
            expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() { // from class: X.01xF
                @Override // android.widget.ExpandableListView.OnGroupCollapseListener
                public final void onGroupCollapse(int i) {
                    this.LIZ.wS(true);
                }
            });
            expandableListView.setDivider(C800330VaR.LIZIZ(C1834150xpV.LJIIIIZZ(expandableListView.getContext()), R.drawable.f2v));
            expandableListView.setChildDivider(C800330VaR.LIZIZ(C1834150xpV.LJIIIIZZ(expandableListView.getContext()), R.drawable.f2w));
            expandableListView.addFooterView(C786410Ut5.Td(getLayoutInflater(), R.layout.h8t, expandableListView, false));
            expandableListView.setDividerHeight((int) C497740JfY.LIZIZ(1.0f));
        } else {
            expandableListView = null;
        }
        this.LLJLLL = expandableListView;
        rS(false);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h8w, viewGroup, false);
    }
}
