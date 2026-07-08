package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class SkinDrawerEntrance {

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("style")
    public long style;

    @C09CT("title")
    public String title;

    @C09CT("title_key")
    public String titleKey;

    public SkinDrawerEntrance() {
        this(null, 0L, "", "");
    }

    public SkinDrawerEntrance(ImageModel imageModel, long j, String str, String str2) {
        this.cover = imageModel;
        this.style = j;
        this.title = str;
        this.titleKey = str2;
    }
}
