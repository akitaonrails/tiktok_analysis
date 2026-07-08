package com.ss.android.ugc.aweme.story.note.avatar;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserBaseAvatarStruct implements Serializable {
    public static final int $stable = 8;

    @C09CT("url_info")
    public final UrlInfo urlInfo;

    @C09CT("user_base_avatar_category")
    public final Integer userBaseAvatarCategory;

    @C09CT("user_base_avatar_type_enum")
    public final Integer userBaseAvatarTypeEnum;

    public UserBaseAvatarStruct(UrlInfo urlInfo, Integer num, Integer num2) {
        this.urlInfo = urlInfo;
        this.userBaseAvatarCategory = num;
        this.userBaseAvatarTypeEnum = num2;
    }
}
