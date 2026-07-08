package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class AvatarThumbModel implements Serializable {

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    public AvatarThumbModel(String str, List<String> list) {
        this.uri = str;
        this.urlList = list;
    }
}
