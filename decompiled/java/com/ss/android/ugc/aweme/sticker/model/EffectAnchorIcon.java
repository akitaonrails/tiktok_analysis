package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EffectAnchorIcon implements Serializable {

    @C09CT("height")
    public final int height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final int width;

    public EffectAnchorIcon(int i, int i2, String str, List<String> list) {
        this.height = i;
        this.width = i2;
        this.uri = str;
        this.urlList = list;
    }
}
