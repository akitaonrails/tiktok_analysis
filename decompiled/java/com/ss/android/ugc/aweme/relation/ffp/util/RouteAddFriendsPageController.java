package com.ss.android.ugc.aweme.relation.ffp.util;

import X.C1264430j0b;
import X.C1264450j0d;
import X.C1266040j3C;
import X.C14EU;
import X.C296060Bj2;
import X.C666390QBx;
import X.C848450XQd;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.RouteAddFriendsPageService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsTabActivity;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class RouteAddFriendsPageController implements RouteAddFriendsPageService {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.friends.service.RouteAddFriendsPageService
    public final void LIZ() {
        this.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.RouteAddFriendsPageService
    public final boolean LIZIZ() {
        return !this.LIZ;
    }

    public RouteAddFriendsPageController() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU
    public final void onUpdateUserEvent(C848450XQd c848450XQd) {
        if (c848450XQd.LIZ == null) {
            return;
        }
        if (TextUtils.equals(c848450XQd.LIZ.getUid(), ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getUid())) {
            this.LIZ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.RouteAddFriendsPageService
    public final void LIZJ(Context context, FindFriendsPageArg findFriendsPageArg, C1264430j0b c1264430j0b, User user, boolean z) {
        String str;
        if (C296060Bj2.LIZIZ) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//friends/ffp");
            smartRouteBuildRoute.withNavArg(findFriendsPageArg);
            smartRouteBuildRoute.withParam("ffp_event_tracking_key", c1264430j0b);
            smartRouteBuildRoute.open();
            return;
        }
        User curUser = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
        if (user == null) {
            user = curUser.m307clone();
        }
        if (z) {
            str = "muf_user";
        } else {
            str = "suggest_user";
        }
        C1264450j0d c1264450j0d = new C1264450j0d(str, false, -1);
        String str2 = FindFriendsTabActivity._pnsPageId;
        C1266040j3C c1266040j3C = new C1266040j3C(this, 0);
        C666390QBx.LIZJ = user;
        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//friends/add_friends");
        smartRouteBuildRoute2.withParam("uid", user.getUid());
        smartRouteBuildRoute2.withParam("sec_uid", user.getSecUid());
        smartRouteBuildRoute2.withParam("ffp_tab_page_arg", c1264450j0d);
        smartRouteBuildRoute2.withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "");
        smartRouteBuildRoute2.withParam("ffp_event_tracking_key", c1264430j0b);
        smartRouteBuildRoute2.withNavArg(findFriendsPageArg);
        smartRouteBuildRoute2.open(3, c1266040j3C);
    }
}
