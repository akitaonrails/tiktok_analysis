package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public class LiveAuthenticationInfo implements Serializable, Cloneable {

    @C09CT("authentication_badge")
    public UrlModel authenticationBadge;

    @C09CT("custom_verify")
    public String customVerify;

    @C09CT("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    public UrlModel getAuthenticationBadge() {
        return this.authenticationBadge;
    }

    public String getCustomVerify() {
        return this.customVerify;
    }

    public String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public void setAuthenticationBadge(UrlModel urlModel) {
        this.authenticationBadge = urlModel;
    }

    public void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }
}
