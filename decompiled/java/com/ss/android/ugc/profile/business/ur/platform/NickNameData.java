package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Icon;

/* JADX INFO: loaded from: classes20.dex */
public final class NickNameData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("alias_permission_type")
    public Integer aliasPermission;

    @C09CT("sub_describe")
    public String subTitle;

    @C09CT("verify_icon")
    public Icon verifyIcon;

    public final Integer getAliasPermission() {
        return this.aliasPermission;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final Icon getVerifyIcon() {
        return this.verifyIcon;
    }

    public final void setAliasPermission(Integer num) {
        this.aliasPermission = num;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setVerifyIcon(Icon icon) {
        this.verifyIcon = icon;
    }
}
