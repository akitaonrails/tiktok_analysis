package com.ss.android.ugc.aweme.cubes.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class VideoItemLinks implements Serializable {

    @C09CT("deep_link")
    public final String deepLink;

    @C09CT("one_link")
    public final String oneLink;

    @C09CT("store_link")
    public final String storeLink;

    public VideoItemLinks() {
        this("", "", "");
    }

    public VideoItemLinks(String str, String str2, String str3) {
        this.deepLink = str;
        this.oneLink = str2;
        this.storeLink = str3;
    }
}
