package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes9.dex */
public final class UserBaseInfo {

    @C09CT("app_id")
    public final Integer appId;

    @C09CT("avatar")
    public final AvatarData avatar;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("nickname")
    public final String nickName;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("uniq_id")
    public final String uniqueId;

    public UserBaseInfo() {
        this(null, null, null, null, null, null);
    }

    public UserBaseInfo(String str, String str2, AvatarData avatarData, String str3, String str4, Integer num) {
        this.id = str;
        this.nickName = str2;
        this.avatar = avatarData;
        this.uniqueId = str3;
        this.secUid = str4;
        this.appId = num;
    }
}
