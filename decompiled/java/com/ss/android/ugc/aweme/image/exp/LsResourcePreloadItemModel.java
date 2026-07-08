package com.ss.android.ugc.aweme.image.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class LsResourcePreloadItemModel {

    @C09CT("page_tag")
    public final String pageTag;

    @C09CT("path")
    public final String path;

    @C09CT("scene_tag")
    public final String sceneTag;

    public LsResourcePreloadItemModel() {
        this(null, null, null);
    }

    public LsResourcePreloadItemModel(String str, String str2, String str3) {
        this.path = str;
        this.pageTag = str2;
        this.sceneTag = str3;
    }
}
