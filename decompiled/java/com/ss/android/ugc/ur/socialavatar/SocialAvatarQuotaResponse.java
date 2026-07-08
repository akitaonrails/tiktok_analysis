package com.ss.android.ugc.ur.socialavatar;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarQuotaResponse implements Serializable {

    @C09CT("is_allowed")
    public final Boolean isAllowed;

    @C09CT("is_first_generation")
    public final Boolean isFirstGeneration;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public final Boolean isAllowed() {
        return this.isAllowed;
    }

    public final Boolean isFirstGeneration() {
        return this.isFirstGeneration;
    }

    public SocialAvatarQuotaResponse(Integer num, String str, Boolean bool, Boolean bool2) {
        this.statusCode = num;
        this.statusMsg = str;
        this.isAllowed = bool;
        this.isFirstGeneration = bool2;
    }
}
