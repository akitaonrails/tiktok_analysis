package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C13LE;
import X.C268330AfP;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderAccountInfoComponent extends ProfileHeaderAccountBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility
    public final void lp1(int i, int i2) {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        if (C268330AfP.LJIIJ()) {
            Ho("user_account_name_info", C13LE.LIZ(ProfileUserAccountNameInfoLeftAlignContainer.class), null, -1, false);
        } else {
            Ho("user_account_name_info", C13LE.LIZ(ProfileUserAccountNameInfoContainer.class), null, -1, false);
        }
        Ho("user_account_base_info", C13LE.LIZ(AccountUserInfoComponent.class), null, -1, false);
        Ho("user_account_base_item", C13LE.LIZ(AccountInfoBaseUIComponent.class), null, -1, false);
    }
}
