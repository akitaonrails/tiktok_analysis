package com.ss.android.ugc.aweme.notice.repo.list.uitemplate;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class TextLinkConfig {

    @C09CT("need_track")
    public final boolean needTrack;

    @C09CT("schema_type")
    public final int schemaType;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final int type;

    public TextLinkConfig(int i, String str, String str2, int i2, boolean z) {
        this.type = i;
        this.text = str;
        this.schemaUrl = str2;
        this.schemaType = i2;
        this.needTrack = z;
    }
}
