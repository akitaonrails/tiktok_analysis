package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PageHeaderCarouselDesc {

    @C09CT("desc_text")
    public String descText;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_dark_color")
    public String textDarkColor;

    public PageHeaderCarouselDesc() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageHeaderCarouselDesc)) {
            return false;
        }
        PageHeaderCarouselDesc pageHeaderCarouselDesc = (PageHeaderCarouselDesc) obj;
        return Intrinsics.LJFF(this.descText, pageHeaderCarouselDesc.descText) && Intrinsics.LJFF(this.textColor, pageHeaderCarouselDesc.textColor) && Intrinsics.LJFF(this.textDarkColor, pageHeaderCarouselDesc.textDarkColor);
    }

    public PageHeaderCarouselDesc(String str, String str2, String str3) {
        this.descText = str;
        this.textColor = str2;
        this.textDarkColor = str3;
    }
}
