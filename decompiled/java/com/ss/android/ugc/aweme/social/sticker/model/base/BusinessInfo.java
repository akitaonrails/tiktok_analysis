package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class BusinessInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("user_id")
    public String userId;

    @C09CT("user_name")
    public String userName;

    public BusinessInfo() {
        this(null, null);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public BusinessInfo(String str, String str2) {
        this.userId = str;
        this.userName = str2;
    }
}
