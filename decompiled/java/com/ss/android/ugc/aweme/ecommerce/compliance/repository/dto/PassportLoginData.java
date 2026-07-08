package com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;

/* JADX INFO: loaded from: classes27.dex */
public final class PassportLoginData {

    @C09CT("description")
    public final String description;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT("gec_token")
    public final String gecToken;

    @C09CT("is_new_user")
    public final Boolean isNewUser;

    @C09CT("user_id")
    public final String userId;

    public PassportLoginData() {
        this(null, null, null, null, null, null);
    }

    public PassportLoginData(Integer num, String str, String str2, Boolean bool, String str3, ExceptionUX exceptionUX) {
        this.errorCode = num;
        this.description = str;
        this.userId = str2;
        this.isNewUser = bool;
        this.gecToken = str3;
        this.exceptionUX = exceptionUX;
    }
}
