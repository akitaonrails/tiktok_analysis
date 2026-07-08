package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class AdCarouselColorInfo implements Serializable {

    @C09CT("change_color_seperate")
    public Integer changeColorSeparate;

    @C09CT("cta_mask_bottom_color")
    public String ctaMaskBottomColor;

    @C09CT("cta_mask_height")
    public Integer ctaMaskHeight;

    @C09CT("cta_mask_top_color")
    public String ctaMaskTopColor;

    @C09CT("images")
    public List<CarouselColorImage> images;

    @C09CT("show_cta_mask")
    public int showCtaMask = 1;

    @C09CT("show_page_control_shadow")
    public int showPageControlShadow;

    public final Integer getChangeColorSeparate() {
        return this.changeColorSeparate;
    }

    public final String getCtaMaskBottomColor() {
        return this.ctaMaskBottomColor;
    }

    public final Integer getCtaMaskHeight() {
        return this.ctaMaskHeight;
    }

    public final String getCtaMaskTopColor() {
        return this.ctaMaskTopColor;
    }

    public final List<CarouselColorImage> getImages() {
        return this.images;
    }

    public final int getShowCtaMask() {
        return this.showCtaMask;
    }

    public final int getShowPageControlShadow() {
        return this.showPageControlShadow;
    }

    public final void setChangeColorSeparate(Integer num) {
        this.changeColorSeparate = num;
    }

    public final void setCtaMaskBottomColor(String str) {
        this.ctaMaskBottomColor = str;
    }

    public final void setCtaMaskHeight(Integer num) {
        this.ctaMaskHeight = num;
    }

    public final void setCtaMaskTopColor(String str) {
        this.ctaMaskTopColor = str;
    }

    public final void setImages(List<CarouselColorImage> list) {
        this.images = list;
    }

    public final void setShowCtaMask(int i) {
        this.showCtaMask = i;
    }

    public final void setShowPageControlShadow(int i) {
        this.showPageControlShadow = i;
    }
}
