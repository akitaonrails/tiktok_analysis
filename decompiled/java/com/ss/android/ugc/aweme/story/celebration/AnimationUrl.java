package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnimationUrl implements Serializable {
    public static final int $stable = 8;

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("url_prefix")
    public final String urlPrefix;

    @C09CT("width")
    public final Integer width;

    public AnimationUrl() {
        this(null, null, null, null, null);
    }

    public AnimationUrl(Integer num, Integer num2, String str, List<String> list, String str2) {
        this.height = num;
        this.width = num2;
        this.uri = str;
        this.urlList = list;
        this.urlPrefix = str2;
    }
}
