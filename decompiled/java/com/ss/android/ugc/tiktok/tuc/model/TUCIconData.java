package com.ss.android.ugc.tiktok.tuc.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class TUCIconData implements Serializable {

    @C09CT("local_image_name")
    public String localImageName;

    @C09CT("remote_image_url")
    public String remoteImageUrl;

    @C09CT("tint_color")
    public String tintColorRes;

    @C09CT("tux_icon_name")
    public String tuxIconName;

    @C09CT("type")
    public Integer type;

    public TUCIconData() {
        this(null, null, null, null, null);
    }

    public TUCIconData(Integer num, String str, String str2, String str3, String str4) {
        this.type = num;
        this.localImageName = str;
        this.remoteImageUrl = str2;
        this.tuxIconName = str3;
        this.tintColorRes = str4;
    }
}
