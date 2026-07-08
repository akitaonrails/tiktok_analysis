package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class OAuthPage implements Serializable {

    @C09CT("authorized_pattern")
    public final Integer authorizedPattern;

    @C09CT("can_skip_confirm")
    public final Boolean canSkipConfirm;

    @C09CT("error")
    public final String error;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("error_description")
    public final String errorDesc;

    @C09CT("page_detail")
    public final OAuthPageDetail pageDetail;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public OAuthPage() {
        this(null, null, null, null, null, null, null, null);
    }

    public OAuthPage(Integer num, OAuthPageDetail oAuthPageDetail, Boolean bool, Integer num2, String str, String str2, Integer num3, String str3) {
        this.authorizedPattern = num;
        this.pageDetail = oAuthPageDetail;
        this.canSkipConfirm = bool;
        this.statusCode = num2;
        this.statusMsg = str;
        this.error = str2;
        this.errorCode = num3;
        this.errorDesc = str3;
    }
}
