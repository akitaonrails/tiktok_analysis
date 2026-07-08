package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class GeckoResourceParam implements Serializable {
    public static final int $stable = 8;

    @C09CT("channel")
    public String channel;

    @C09CT("extension")
    public String extension;

    @C09CT("path")
    public String path;

    public GeckoResourceParam() {
        this("", "", "");
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final String getPath() {
        return this.path;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final void setExtension(String str) {
        this.extension = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public GeckoResourceParam(String str, String str2, String str3) {
        this.channel = str;
        this.path = str2;
        this.extension = str3;
    }
}
