package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C1010340cOm;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class PhotoCarouselInfoStruct implements Serializable {
    public static final C1010340cOm Companion = new Object() { // from class: X.0cOm
    };
    public Integer LL;

    @C09CT("carousel_format_type")
    public final Integer carouselFormatType;

    @C09CT("carousel_indicator_display_mode")
    public final Integer carouselIndicatorDisplayMode;

    @C09CT("carousel_indicator_type")
    public final Integer carouselIndicatorType;

    @C09CT("carousel_live_photo_auto_play_type")
    public final Integer carouselLivePhotoAutoPlayType;

    @C09CT("carousel_photo_auto_page_slide_duration")
    public final Long carouselPhotoAutoPageSlideDuration;

    @C09CT("carousel_play_type")
    public final Integer carouselPlayType;

    @C09CT("dynamic_carousel_first_index")
    public final Integer dynamicCarouselFirstIndex;

    @C09CT("enable_label")
    public final boolean enableLabel;

    @C09CT("enable_multi_cta_jump")
    public final boolean enableMultiCTAJump;

    @C09CT("product_label_gecko_channel")
    public final List<String> geckoChannelList;

    @C09CT("product_label_lynx_scheme")
    public final String lynxScheme;

    @C09CT("native_site_config")
    public final NativeSiteConfig nativeSiteConfig;

    @C09CT("product_count")
    public final int productCount;

    @C09CT("product_list")
    public final List<PhotoCarouselProductStruct> productList;

    public final boolean enableIndicatorSlide() {
        Integer num;
        Integer num2 = this.carouselIndicatorType;
        return (num2 != null && num2.intValue() == 1) || ((num = this.carouselIndicatorType) != null && num.intValue() == 2);
    }

    public final boolean enableLivePhotoAutoPlay() {
        Integer num = this.carouselLivePhotoAutoPlayType;
        return num != null && num.intValue() == 1;
    }

    public final Integer getCarouselFormatType() {
        return this.carouselFormatType;
    }

    public final Integer getCarouselIndicatorDisplayMode() {
        return this.carouselIndicatorDisplayMode;
    }

    public final Integer getCarouselIndicatorType() {
        return this.carouselIndicatorType;
    }

    public final Integer getCarouselLivePhotoAutoPlayType() {
        return this.carouselLivePhotoAutoPlayType;
    }

    public final Long getCarouselPhotoAutoPageSlideDuration() {
        return this.carouselPhotoAutoPageSlideDuration;
    }

    public final Integer getCarouselPlayType() {
        return this.carouselPlayType;
    }

    public final Integer getDynamicCarouselFirstIndex() {
        return this.dynamicCarouselFirstIndex;
    }

    public final Integer getDynamicCarouselLastIndex() {
        return this.LL;
    }

    public final boolean getEnableLabel() {
        return this.enableLabel;
    }

    public final boolean getEnableMultiCTAJump() {
        return this.enableMultiCTAJump;
    }

    public final List<String> getGeckoChannelList() {
        return this.geckoChannelList;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public final NativeSiteConfig getNativeSiteConfig() {
        return this.nativeSiteConfig;
    }

    public final int getProductCount() {
        return this.productCount;
    }

    public final List<PhotoCarouselProductStruct> getProductList() {
        return this.productList;
    }

    public final void setDynamicCarouselLastIndex(Integer num) {
        this.LL = num;
    }

    public PhotoCarouselInfoStruct(int i, String str, List<String> list, boolean z, boolean z2, NativeSiteConfig nativeSiteConfig, List<PhotoCarouselProductStruct> list2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, Integer num6, Integer num7) {
        this.productCount = i;
        this.lynxScheme = str;
        this.geckoChannelList = list;
        this.enableLabel = z;
        this.enableMultiCTAJump = z2;
        this.nativeSiteConfig = nativeSiteConfig;
        this.productList = list2;
        this.dynamicCarouselFirstIndex = num;
        this.LL = num2;
        this.carouselFormatType = num3;
        this.carouselPlayType = num4;
        this.carouselIndicatorDisplayMode = num5;
        this.carouselPhotoAutoPageSlideDuration = l;
        this.carouselLivePhotoAutoPlayType = num6;
        this.carouselIndicatorType = num7;
    }

    public PhotoCarouselInfoStruct(int i, String str, List list, boolean z, boolean z2, NativeSiteConfig nativeSiteConfig, List list2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, Integer num6, Integer num7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : nativeSiteConfig, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : num3, (i2 & 1024) != 0 ? null : num4, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num5, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : l, (i2 & 8192) == 0 ? num6 : null, num7);
    }
}
