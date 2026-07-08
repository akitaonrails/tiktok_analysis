package com.ss.android.ugc.aweme.friendstab.ability;

import X.C04TR;
import X.C1264430j0b;
import X.C20684815ws;
import X.C2344009Gk;
import X.EnumC666200QBe;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.RouteAddFriendsPageService;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;

/* JADX INFO: loaded from: classes11.dex */
public final class FriendsTabRouterAbility implements IFriendsTabRouterAbility {
    public final Context LL;

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility
    public final void CH2() {
        FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, "homepage_friends", "", EnumC666200QBe.DEFAULT, null, 0, false, -1, null);
        C1264430j0b c1264430j0b = new C1264430j0b("homepage_friends", "find_friends_page", null);
        Context context = this.LL;
        if (context != null) {
            ((RouteAddFriendsPageService) ServiceManager.get().getService(RouteAddFriendsPageService.class)).LIZJ(context, findFriendsPageArg, c1264430j0b, null, false);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_friends");
        c2344009Gk.LJIIIIZZ("has_notice", CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("click_add_friends", c2344009Gk.LIZ);
    }

    public FriendsTabRouterAbility(Context context) {
        this.LL = context;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility
    public final void pk0(String str, String str2) {
        C04TR.LIZIZ.LIZ(this.LL, str, str2);
    }
}
