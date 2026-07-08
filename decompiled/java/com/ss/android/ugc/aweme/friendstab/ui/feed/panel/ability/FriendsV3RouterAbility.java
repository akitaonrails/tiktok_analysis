package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability;

import X.C0PRW;
import X.C0PS4;
import X.C0PSJ;
import X.C0PYE;
import X.C0Q8L;
import X.C0QDS;
import X.C0QEQ;
import X.C0QER;
import X.C0QJN;
import X.C1264430j0b;
import X.C1388190mED;
import X.C1595430rcT;
import X.C19EG;
import X.C1ER1;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C326380Cqq;
import X.C650940Pg4;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C664000Q2s;
import X.C664030Q2v;
import X.C669560QOc;
import X.C672110QXx;
import X.C680080Qly;
import X.EnumC666200QBe;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.RouteAddFriendsPageService;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsV3RouterAbility;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class FriendsV3RouterAbility implements IFriendsV3RouterAbility {
    public final Context LL;

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsV3RouterAbility
    public final void Az() {
        RouteAddFriendsPageService routeAddFriendsPageService;
        FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, "homepage_friends", "", EnumC666200QBe.DEFAULT, null, 0, false, -1, null);
        C1264430j0b c1264430j0b = new C1264430j0b("homepage_friends", "find_friends_page", null);
        Context context = this.LL;
        if (context != null && (routeAddFriendsPageService = (RouteAddFriendsPageService) PluggableExtentionKt.pluggableSpi$default(RouteAddFriendsPageService.class, false, false, false, 14, null)) != null) {
            routeAddFriendsPageService.LIZJ(context, findFriendsPageArg, c1264430j0b, null, false);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_friends");
        c2344009Gk.LJIIIIZZ("has_notice", CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("click_add_friends", c2344009Gk.LIZ);
    }

    public FriendsV3RouterAbility(Context context) {
        this.LL = context;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsV3RouterAbility
    public final void CD1(String str, String str2) {
        String aid;
        C19EG c19egLIZIZ;
        Aweme aweme;
        if (C1595430rcT.LIZIZ.LIZJ().checkSearchRestriction()) {
            return;
        }
        Context context = this.LL;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (aweme = C680080Qly.LIZIZ(c19egLIZIZ).LLJILJILJ) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        C0QEQ c0qeqNewBuilder = C0QER.Companion.newBuilder();
        c0qeqNewBuilder.LJIIL = aid;
        c0qeqNewBuilder.LIZ = str2;
        c0qeqNewBuilder.LJIL = true;
        c0qeqNewBuilder.LJIIJJI = str;
        C0QER c0qerLJ = c0qeqNewBuilder.LJ();
        C650950Pg5 c650950Pg5 = new C650950Pg5(new C650960Pg6(new C664000Q2s(str2, null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, aid, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(Long.valueOf(C326380Cqq.LIZ())), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)), new C0PSJ(new C0PRW(0, null, null, null, null, null, null, null, false, null, false, null, 4095, null), new C0PS4(-1, 0, "", new LinkedHashMap(), "enter", str2, "")));
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setSearchFrom(str2);
        C1ER1.LIZIZ.B(new C0QDS(this.LL, searchResultParam, c0qerLJ, c650950Pg5, str2, null));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", "enter");
        c2344009Gk.LJIIIIZZ("has_coin_task", CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("enter_search_blankpage", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", str2);
        c2344009Gk2.LJIIIIZZ("enter_method", "enter");
        C20684815ws.LJIILLIIL("enter_search", c2344009Gk2.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsV3RouterAbility
    public final void DE1(Context context, String str) {
        if (context == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://user/profile/");
        sbLIZ.append(str);
        SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
    }
}
