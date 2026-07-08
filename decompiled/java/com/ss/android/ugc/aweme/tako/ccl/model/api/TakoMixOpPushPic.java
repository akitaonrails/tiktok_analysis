package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMixOpPushPic {

    @C09CT("base_info")
    public final BaseImage image;

    @C09CT("jump_url")
    public final String jumpUrl;

    public TakoMixOpPushPic() {
        this(null, "");
    }

    public TakoMixOpPushPic(BaseImage baseImage, String str) {
        this.image = baseImage;
        this.jumpUrl = str;
    }
}
