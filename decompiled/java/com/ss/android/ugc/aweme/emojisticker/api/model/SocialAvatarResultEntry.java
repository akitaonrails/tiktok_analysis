package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;

/* JADX INFO: loaded from: classes29.dex */
public final class SocialAvatarResultEntry {

    @C09CT("social_avatar_sticker")
    public final SocialAvatarStickerStruct sticker;

    @C09CT("user")
    public final User user;

    public SocialAvatarResultEntry() {
        this(null, null);
    }

    public SocialAvatarResultEntry(User user, SocialAvatarStickerStruct socialAvatarStickerStruct) {
        this.user = user;
        this.sticker = socialAvatarStickerStruct;
    }
}
