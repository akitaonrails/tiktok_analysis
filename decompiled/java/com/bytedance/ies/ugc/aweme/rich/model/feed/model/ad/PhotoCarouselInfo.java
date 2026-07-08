package com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PhotoCarouselInfo implements Serializable {

    @C09CT("auto_slide")
    public Boolean autoSlide;

    @C09CT("auto_slide_interval")
    public Long autoSlideInterval;

    public final Boolean getAutoSlide() {
        return this.autoSlide;
    }

    public final Long getAutoSlideInterval() {
        return this.autoSlideInterval;
    }

    public final void setAutoSlide(Boolean bool) {
        this.autoSlide = bool;
    }

    public final void setAutoSlideInterval(Long l) {
        this.autoSlideInterval = l;
    }
}
