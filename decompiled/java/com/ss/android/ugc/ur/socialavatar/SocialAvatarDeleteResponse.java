package com.ss.android.ugc.ur.socialavatar;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarDeleteResponse implements Serializable {

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public SocialAvatarDeleteResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMsg = str;
    }
}
