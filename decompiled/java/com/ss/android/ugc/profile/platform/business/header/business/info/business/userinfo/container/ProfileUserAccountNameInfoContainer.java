package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C13LE;
import X.C2537109wv;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.ProfileUserAccountNameInfoBaseComponent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileUserAccountNameInfoContainer extends ProfileUserAccountNameInfoBaseContainer {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("user_account_name_info_base_item", C13LE.LIZ(ProfileUserAccountNameInfoBaseComponent.class), null, -1, false);
        Ho("user_info_manage", C13LE.LIZ(ProfileUserInfoManageComponent.class), null, -1, false);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Lo() {
        if (this.LLJILLL && C2537109wv.LJFF()) {
            ((ArrayList) this.LLJI).add("user_info_manage");
        }
    }
}
