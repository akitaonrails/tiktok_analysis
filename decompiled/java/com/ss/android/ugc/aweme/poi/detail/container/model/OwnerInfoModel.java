package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class OwnerInfoModel implements Serializable {

    @C09CT("avatar_thumb")
    public final AvatarThumbModel avatarThumb;

    @C09CT("blue_icon")
    public final boolean blueIcon;

    @C09CT("nickname")
    public final String nickName;

    @C09CT("uid")
    public final String uid;

    @C09CT("uniqueId")
    public final String uniqueId;

    public OwnerInfoModel(String str, String str2, boolean z, String str3, AvatarThumbModel avatarThumbModel) {
        this.uid = str;
        this.nickName = str2;
        this.blueIcon = z;
        this.uniqueId = str3;
        this.avatarThumb = avatarThumbModel;
    }
}
