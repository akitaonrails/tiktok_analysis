package com.ss.android.ugc.profile.business.ur.school.findschoolfriends;

import X.C0C10;
import X.C0C11;
import X.C0DHZ;
import X.C0DOO;
import X.C0XQ7;
import X.C11JF;
import X.C11S5;
import X.C1245860iWe;
import X.C1245880iWg;
import X.C1247640iZW;
import X.C1701940uOG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C338000DMw;
import X.C338350DOf;
import X.EnumC1231460i9Q;
import X.EnumC1247210iYp;
import X.InterfaceC0148002o;
import Y.AfS42S1100000_4;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.profile.business.ur.following.repository.RelationSearchApi;
import com.ss.android.ugc.ur.school.service.UserCampusService;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchSchoolMembersViewModel extends AssemViewModel<C338350DOf> {
    public C11JF LL;
    public final AFwS287S0000000_4 LLILLJJLI = AFwS287S0000000_4.get$arr$(21);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C338350DOf(0);
    }

    public final void LJJZZIII(String str) {
        String str2;
        C338000DMw c338000DMwLJFF;
        C0DHZ c0dhz;
        if (a0.LJJJIL(str)) {
            C11JF c11jf = this.LL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            setState(AFwS232S0000000_4.get$arr$(114));
            return;
        }
        C11JF c11jf2 = this.LL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        setState(AFwS232S0000000_4.get$arr$(115));
        C0DOO c0doo = C0DOO.LIZ;
        C1245860iWe c1245860iWe = new C1245860iWe(EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE, null, null);
        c0doo.getClass();
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LJIIIIZZ("search_keyword", str);
        C20684815ws.LJIILLIIL("ttsocial_school_page_search_text_click", c2344009Gk.LIZ);
        C0XQ7.LJ();
        String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
        UserCampusService userCampusService = (UserCampusService) PluggableExtentionKt.pluggableSpi$default(UserCampusService.class, false, false, false, 14, null);
        if (userCampusService == null || (c338000DMwLJFF = userCampusService.LJFF(curUserId)) == null || (c0dhz = c338000DMwLJFF.LIZ) == null || (str2 = c0dhz.LIZIZ) == null) {
            str2 = "";
        }
        if (a0.LJJJIL(str2)) {
            setState(AFwS232S0000000_4.get$arr$(116));
        } else {
            RelationSearchApi.LIZ.getClass();
            this.LL = (C11JF) C1247640iZW.LIZIZ.getValue().queryRelationSearchList(EnumC1247210iYp.SCHOOL.getValue(), curUserId, str, C0C10.LIZ(), C0C11.LIZ(), str2, null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS42S1100000_4(str, this, 0), new AfS42S1100000_4(str, this, 1));
        }
    }
}
