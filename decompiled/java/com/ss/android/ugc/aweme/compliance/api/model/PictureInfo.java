package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class PictureInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("picture_link")
    public final String pictureLink;

    @C09CT("picture_name")
    public final String pictureName;

    public PictureInfo() {
        this("", "");
    }

    public PictureInfo(String str, String str2) {
        this.pictureName = str;
        this.pictureLink = str2;
    }
}
