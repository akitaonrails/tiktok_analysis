package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.Objects;

/* JADX INFO: loaded from: classes36.dex */
public class AuthenticationInfo {

    @C09CT("authentication_badge")
    public ImageModel authenticationBadge;

    @C09CT("custom_verify")
    public String customVerify;

    @C09CT("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    @C09CT("has_cert")
    public boolean hasCert;

    public final int hashCode() {
        return Objects.hash(this.customVerify, this.enterpriseVerifyReason, this.authenticationBadge);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationInfo)) {
            return false;
        }
        AuthenticationInfo authenticationInfo = (AuthenticationInfo) obj;
        if (Objects.equals(this.customVerify, authenticationInfo.customVerify) && Objects.equals(this.enterpriseVerifyReason, authenticationInfo.enterpriseVerifyReason) && Objects.equals(this.authenticationBadge, authenticationInfo.authenticationBadge)) {
            return true;
        }
        return false;
    }
}
