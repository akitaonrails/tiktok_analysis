package com.ss.android.ugc.profile.business.ur.socialavatar.datacenter;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarByteSyncData {
    public static final int $stable = 0;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("thumbnail_url")
    public final String thumbnailUrl;

    public SocialAvatarByteSyncData() {
        this(null, null, null);
    }

    public SocialAvatarByteSyncData(Integer num, String str, Integer num2) {
        this.status = num;
        this.thumbnailUrl = str;
        this.errorCode = num2;
    }
}
