package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C13LE;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.ProfileUserInfoManageBaseComponent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileUserInfoManageComponent extends ProfileUserInfoManageBaseContainer {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("user_info_manage_base_item", C13LE.LIZ(ProfileUserInfoManageBaseComponent.class), null, -1, false);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Lo() {
        if (this.LLJILLL) {
            ((ArrayList) this.LLJI).add("user_info_manage_edit_profile");
        }
    }
}
