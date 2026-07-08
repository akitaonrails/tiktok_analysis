package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public class SocialStickerCustomData implements Serializable {
    public static final int $stable = 8;

    @C09CT("key")
    public String key;

    @C09CT("value")
    public String value;

    public SocialStickerCustomData() {
        this(null, null);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public SocialStickerCustomData(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
