package com.ss.android.ugc.aweme.story.note.avatar;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class AvatarMetaInfo {

    @C09CT("ur_avatar_bg_tag")
    public final Integer avatarBgTag;

    @C09CT("avatar_choice")
    public final Integer avatarChoice;

    @C09CT("ur_avatar_emo_tag")
    public final Integer avatarEmoTag;

    @C09CT("ur_avatar_like_id")
    public final Long avatarLikeId;

    @C09CT("avatar_source")
    public final Integer avatarSource;

    @C09CT("is_default_avatar")
    public final Boolean isDefaultAvatar;

    public AvatarMetaInfo(Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Long l) {
        this.avatarChoice = num;
        this.avatarSource = num2;
        this.isDefaultAvatar = bool;
        this.avatarBgTag = num3;
        this.avatarEmoTag = num4;
        this.avatarLikeId = l;
    }
}
