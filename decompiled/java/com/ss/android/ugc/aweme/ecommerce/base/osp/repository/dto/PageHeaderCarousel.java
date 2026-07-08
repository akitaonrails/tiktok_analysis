package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PageHeaderCarousel {

    @C09CT("carousel_content")
    public List<PageHeaderCarouselContent> carouselContent;

    @C09CT("carousel_show_period")
    public Integer carouselShowPeriod;

    @C09CT("carousel_stay_time")
    public Integer carouselStayTime;

    @C09CT("first_carousel_show_period")
    public Integer firstCarouselShowPeriod;

    public PageHeaderCarousel() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageHeaderCarousel)) {
            return false;
        }
        PageHeaderCarousel pageHeaderCarousel = (PageHeaderCarousel) obj;
        return Intrinsics.LJFF(this.carouselContent, pageHeaderCarousel.carouselContent) && Intrinsics.LJFF(this.carouselShowPeriod, pageHeaderCarousel.carouselShowPeriod) && Intrinsics.LJFF(this.firstCarouselShowPeriod, pageHeaderCarousel.firstCarouselShowPeriod) && Intrinsics.LJFF(this.carouselStayTime, pageHeaderCarousel.carouselStayTime);
    }

    public PageHeaderCarousel(List<PageHeaderCarouselContent> list, Integer num, Integer num2, Integer num3) {
        this.carouselContent = list;
        this.carouselShowPeriod = num;
        this.firstCarouselShowPeriod = num2;
        this.carouselStayTime = num3;
    }
}
