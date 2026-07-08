package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.container;

import X.C13LE;
import X.C2537109wv;
import X.C268330AfP;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container.ProfileUserInfoManageComponent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderRelationInfoComponent extends ProfileHeaderRelationBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("relation_info_base_item", C13LE.LIZ(RelationInfoBaseUIComponent.class), null, -1, false);
        if (C268330AfP.LJIIJ()) {
            return;
        }
        Ho("user_info_manage", C13LE.LIZ(ProfileUserInfoManageComponent.class), null, -1, false);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Lo() {
        if (this.LLJILLL && C2537109wv.LJII()) {
            ((ArrayList) this.LLJI).add("user_info_manage");
        }
    }
}
