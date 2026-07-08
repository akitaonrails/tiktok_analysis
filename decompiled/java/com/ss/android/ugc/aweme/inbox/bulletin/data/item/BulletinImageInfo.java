package com.ss.android.ugc.aweme.inbox.bulletin.data.item;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinImageInfo {
    public static final int $stable = 0;

    @C09CT("format")
    public final String format;

    @C09CT("height")
    public final Integer height;

    @C09CT("local_path")
    public final String path;

    @C09CT("type")
    public final Integer type;

    @C09CT("uri")
    public final String uri;

    @C09CT("width")
    public final Integer width;

    public BulletinImageInfo() {
        this(null, null, null, null, null, null);
    }

    public BulletinImageInfo(String str, Integer num, Integer num2, String str2, String str3, Integer num3) {
        this.uri = str;
        this.width = num;
        this.height = num2;
        this.format = str2;
        this.path = str3;
        this.type = num3;
    }
}
