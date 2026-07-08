package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class SettingsButtonData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("alias_permission_type")
    public Integer aliasPermission;

    public final Integer getAliasPermission() {
        return this.aliasPermission;
    }

    public final void setAliasPermission(Integer num) {
        this.aliasPermission = num;
    }
}
