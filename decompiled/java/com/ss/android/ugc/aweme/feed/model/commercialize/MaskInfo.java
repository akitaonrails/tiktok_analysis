package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class MaskInfo implements Serializable {

    @C09CT("bottom_mask_cover")
    public final String bottomMaskCover;

    @C09CT("text_color")
    public final String textColor;

    public MaskInfo(String str, String str2) {
        this.bottomMaskCover = str;
        this.textColor = str2;
    }
}
