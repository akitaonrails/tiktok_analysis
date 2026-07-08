package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarImageInfo implements Serializable {

    @C09CT("gender")
    public final double gender;

    @C09CT("skin_color")
    public final double skinColor;

    @C09CT("uri")
    public final String uri;

    public SocialAvatarImageInfo() {
        this("", 0.0d, 0.0d);
    }

    public SocialAvatarImageInfo(String str, double d, double d2) {
        this.uri = str;
        this.gender = d;
        this.skinColor = d2;
    }
}
