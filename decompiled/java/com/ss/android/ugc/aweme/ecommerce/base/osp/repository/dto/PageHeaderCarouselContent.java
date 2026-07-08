package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PageHeaderCarouselContent {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("page_header_carousel_desc")
    public PageHeaderCarouselDesc pageHeaderCarouselDesc;

    @C09CT("page_header_carousel_icon")
    public Icon pageHeaderCarouselIcon;

    public PageHeaderCarouselContent() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageHeaderCarouselContent)) {
            return false;
        }
        PageHeaderCarouselContent pageHeaderCarouselContent = (PageHeaderCarouselContent) obj;
        return Intrinsics.LJFF(this.pageHeaderCarouselIcon, pageHeaderCarouselContent.pageHeaderCarouselIcon) && Intrinsics.LJFF(this.pageHeaderCarouselDesc, pageHeaderCarouselContent.pageHeaderCarouselDesc) && Intrinsics.LJFF(this.daInfo, pageHeaderCarouselContent.daInfo);
    }

    public PageHeaderCarouselContent(Icon icon, PageHeaderCarouselDesc pageHeaderCarouselDesc, String str) {
        this.pageHeaderCarouselIcon = icon;
        this.pageHeaderCarouselDesc = pageHeaderCarouselDesc;
        this.daInfo = str;
    }
}
