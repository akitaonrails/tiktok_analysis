package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C08JL;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0DOO;
import X.C1157130gDX;
import X.C1230870i8T;
import X.C1245860iWe;
import X.C1245880iWg;
import X.C1245920iWk;
import X.C1246150iX7;
import X.C1261170ivL;
import X.C20684815ws;
import X.C2252611DEt;
import X.C2286608xc;
import X.C2344009Gk;
import X.C346160Dhe;
import X.C452501pT;
import X.C627660Ojc;
import X.EnumC1231460i9Q;
import X.EnumC346100DhY;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC339430DSj;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolUsersListViewModel extends AssemListViewModel<C346160Dhe, InterfaceC339430DSj, C1245920iWk> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(511));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(510));
    public final boolean LLILLL;
    public final C08JL<String> LLILZ;
    public Long LLILZIL;
    public final C1245860iWe LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C346160Dhe(0);
    }

    public SchoolUsersListViewModel() {
        C1261170ivL.LIZ.getClass();
        this.LLILLL = C1261170ivL.LIZ();
        C1246150iX7.LIZ.getClass();
        this.LLILZ = new C08JL<>(C1246150iX7.LIZ().schoolFriendsRecImprThreshold);
        this.LLILZLL = new C1245860iWe(EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE, null, null);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC339430DSj> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 416));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1245920iWk>> interfaceC1364105Vn) {
        this.LLILZ.clear();
        this.LLILZIL = C2286608xc.LJFF(System.currentTimeMillis());
        return onLoadMore(new C1245920iWk(""), interfaceC1364105Vn);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: vQ2, reason: merged with bridge method [inline-methods] */
    public final Object onLoadMore(C1245920iWk c1245920iWk, InterfaceC1364105Vn<? super AbstractC316870CbV<C1245920iWk>> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        withState(new AwS228S0300000_19(this, c2252611DEt, c1245920iWk, 17));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void wQ2(int i, int i2, int i3, int i4) {
        String str;
        C0DOO c0doo = C0DOO.LIZ;
        C1245860iWe c1245860iWe = this.LLILZLL;
        c0doo.getClass();
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        int i5 = C1230870i8T.LIZ[c1245860iWe.internalEnterFrom.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                str = "profile_school_btn";
            }
            c2344009Gk.LJIIIIZZ("action_type", EnumC346100DhY.FETCH_DATA.getParamValue());
            c2344009Gk.LIZJ(i, "has_error");
            c2344009Gk.LIZJ(i2, "previous_list_count");
            c2344009Gk.LIZJ(i3, "response_list_count");
            c2344009Gk.LIZJ(i4, "duplicate_item_count");
            C20684815ws.LJIILLIIL("school_community_page", c2344009Gk.LIZ);
        }
        str = "view_college_profile_banner";
        c2344009Gk.LJFF("school_entrance", str);
        c2344009Gk.LJIIIIZZ("action_type", EnumC346100DhY.FETCH_DATA.getParamValue());
        c2344009Gk.LIZJ(i, "has_error");
        c2344009Gk.LIZJ(i2, "previous_list_count");
        c2344009Gk.LIZJ(i3, "response_list_count");
        c2344009Gk.LIZJ(i4, "duplicate_item_count");
        C20684815ws.LJIILLIIL("school_community_page", c2344009Gk.LIZ);
    }
}
