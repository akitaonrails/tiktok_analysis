package com.ss.android.ugc.ur.socialavatar;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class UpdateSocialAvatarStruct implements Serializable {

    @C09CT("avatar_choice")
    public final Integer avatarChoice;

    @C09CT("social_avatar_background_tag")
    public final Integer socialAvatarBackgroundTag;

    @C09CT("social_avatar_expression_tag")
    public final Integer socialAvatarExpressionTag;

    @C09CT("social_avatar_id")
    public final Long socialAvatarId;

    @C09CT("social_avatar_with_background_uri")
    public final String socialAvatarWithBackground;

    @C09CT("social_avatar_without_background_uri")
    public final String socialAvatarWithoutBackground;

    @C09CT("dynamic_social_avatar_uri")
    public final String socialDynamicAvatar;

    public UpdateSocialAvatarStruct() {
        this(null, null, null, null, null, null, null);
    }

    public UpdateSocialAvatarStruct(Integer num, Integer num2, Integer num3, String str, String str2, String str3, Long l) {
        this.avatarChoice = num;
        this.socialAvatarBackgroundTag = num2;
        this.socialAvatarExpressionTag = num3;
        this.socialAvatarWithBackground = str;
        this.socialAvatarWithoutBackground = str2;
        this.socialDynamicAvatar = str3;
        this.socialAvatarId = l;
    }
}
