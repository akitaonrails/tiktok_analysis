package com.ss.android.ugc.aweme.socialavatar.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarImageInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("gender")
    public final double gender;

    @C09CT("skin_color")
    public final String skinColor;

    @C09CT("uri")
    public final String uri;

    public SocialAvatarImageInfo() {
        this("", 0.0d, "");
    }

    public SocialAvatarImageInfo(String str, double d, String str2) {
        this.uri = str;
        this.gender = d;
        this.skinColor = str2;
    }
}
