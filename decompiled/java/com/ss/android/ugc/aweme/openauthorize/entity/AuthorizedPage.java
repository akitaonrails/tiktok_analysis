package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class AuthorizedPage implements Serializable {

    @C09CT("app_icon")
    public final String appIcon;

    @C09CT("check_result")
    public final AuthorizedCheckResult checkResult;

    @C09CT("is_lite")
    public final Boolean isLite;

    @C09CT("page_detail")
    public final AuthorizedPageDetail pageDetail;

    @C09CT("show_edit_access")
    public final boolean showEditAccess;

    @C09CT("show_switch_account")
    public final boolean showSwitchAccount;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AuthorizedPage() {
        this(null, null, null, null, null, null, false, false);
    }

    public final Boolean isLite() {
        return this.isLite;
    }

    public AuthorizedPage(Integer num, String str, AuthorizedPageDetail authorizedPageDetail, AuthorizedCheckResult authorizedCheckResult, Boolean bool, String str2, boolean z, boolean z2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.pageDetail = authorizedPageDetail;
        this.checkResult = authorizedCheckResult;
        this.isLite = bool;
        this.appIcon = str2;
        this.showSwitchAccount = z;
        this.showEditAccess = z2;
    }
}
