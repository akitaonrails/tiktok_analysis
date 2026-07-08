package com.ss.android.ugc.aweme.fangroup.joinpanel.scheme;

import X.C123100dR;
import X.C1231150i8v;
import X.EnumC1231170i8x;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;

/* JADX INFO: loaded from: classes20.dex */
public final class JoinFanGroupPanelCommonAction implements IJoinFanGroupPanelActionProtocol {
    @Override // com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.IJoinFanGroupPanelActionProtocol
    public final int getAction() {
        return EnumC1231170i8x.ACTION_COMMON_ROUTER.getAction();
    }

    @Override // com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.IJoinFanGroupPanelActionProtocol
    public final void CR1(Context context, C1231150i8v c1231150i8v, GroupJoinResponse groupJoinResponse) {
        if (C123100dR.LIZ(groupJoinResponse.actionScheme)) {
            SmartRouter.buildRoute(context, groupJoinResponse.actionScheme).open();
        }
    }
}
