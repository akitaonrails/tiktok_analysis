package com.ss.android.ugc.aweme.fangroup.joinpanel.scheme;

import X.C1231130i8t;
import X.C1231150i8v;
import X.EnumC1231170i8x;
import X.EnumC1993507rR;
import android.content.Context;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;

/* JADX INFO: loaded from: classes20.dex */
public final class JoinFanGroupPanelJoinGroupAction implements IJoinFanGroupPanelActionProtocol {
    @Override // com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.IJoinFanGroupPanelActionProtocol
    public final int getAction() {
        return EnumC1231170i8x.ACTION_JOIN_GROUP.getAction();
    }

    @Override // com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.IJoinFanGroupPanelActionProtocol
    public final void CR1(Context context, C1231150i8v c1231150i8v, GroupJoinResponse groupJoinResponse) {
        C1231130i8t.LJ(context, true, c1231150i8v, EnumC1993507rR.GROUP_JOIN_SCENE_DEFAULT.getValue(), "", groupJoinResponse);
    }
}
