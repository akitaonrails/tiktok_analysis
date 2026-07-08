package com.ss.android.ugc.aweme.fangroup.joinpanel.scheme;

import X.C1231150i8v;
import X.C1252380ihA;
import X.C1388190mED;
import X.C19EG;
import X.C898270ZLt;
import X.EnumC1231170i8x;
import android.content.Context;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import kotlin.jvm.internal.AwS297S0300000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowAndJoinFanGroupPanelAction implements IJoinFanGroupPanelActionProtocol {
    @Override // com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.IJoinFanGroupPanelActionProtocol
    public final int getAction() {
        return EnumC1231170i8x.ACTION_FOLLOW_AND_JOIN.getAction();
    }

    @Override // com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.IJoinFanGroupPanelActionProtocol
    public final void CR1(Context context, C1231150i8v c1231150i8v, GroupJoinResponse groupJoinResponse) {
        Long l = groupJoinResponse.creatorId;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            IMFriendsService.LIZ.getClass();
            IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
            if (iMFriendsServiceLIZ != null) {
                C1252380ihA c1252380ihA = new C1252380ihA();
                c1252380ihA.LIZ = String.valueOf(l);
                c1252380ihA.LIZLLL = 1;
                iMFriendsServiceLIZ.LJ(c19egLIZIZ, c1252380ihA, "followers_group_join_panel", new AwS297S0300000_19(context, c1231150i8v, groupJoinResponse, 20));
            }
        }
    }
}
