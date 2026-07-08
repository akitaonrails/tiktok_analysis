package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SocialStickerImageList implements Serializable {
    public static final int $stable = 8;

    @C09CT("key")
    public String key;

    @C09CT("value")
    public List<? extends SocialStickerImageMetaData> value;

    public SocialStickerImageList() {
        this(null, null);
    }

    public final String getKey() {
        return this.key;
    }

    public final List<SocialStickerImageMetaData> getValue() {
        return this.value;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setValue(List<? extends SocialStickerImageMetaData> list) {
        this.value = list;
    }

    public SocialStickerImageList(String str, List<? extends SocialStickerImageMetaData> list) {
        this.key = str;
        this.value = list;
    }
}
