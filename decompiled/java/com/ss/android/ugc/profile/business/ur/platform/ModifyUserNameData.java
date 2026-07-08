package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class ModifyUserNameData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("username_update_reminder")
    public Boolean userNameUpdateReminder;

    public final Boolean getUserNameUpdateReminder() {
        return this.userNameUpdateReminder;
    }

    public final void setUserNameUpdateReminder(Boolean bool) {
        this.userNameUpdateReminder = bool;
    }
}
