package com.ss.android.ugc.aweme.poi.compliance.repo.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPassportLoginData implements Serializable {

    @C09CT("description")
    public final String description;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("gec_token")
    public final String gecToken;

    @C09CT("is_new_user")
    public final Boolean isNewUser;

    @C09CT("exception_ux")
    public final ToastData toastData;

    @C09CT("user_id")
    public final String userId;

    public PoiPassportLoginData() {
        this(null, null, null, null, null, null);
    }

    public final Boolean isNewUser() {
        return this.isNewUser;
    }

    public PoiPassportLoginData(Integer num, String str, String str2, Boolean bool, String str3, ToastData toastData) {
        this.errorCode = num;
        this.description = str;
        this.userId = str2;
        this.isNewUser = bool;
        this.gecToken = str3;
        this.toastData = toastData;
    }
}
