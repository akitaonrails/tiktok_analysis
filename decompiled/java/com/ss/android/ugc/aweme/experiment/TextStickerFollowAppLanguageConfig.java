package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStickerFollowAppLanguageConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("category_suffix")
    public final String suffix;

    public TextStickerFollowAppLanguageConfig(Boolean bool, String str) {
        this.enable = bool;
        this.suffix = str;
    }
}
