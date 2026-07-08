package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class PhotoCarouselInfoStruct implements Serializable {
    public Integer LL;

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

    public PhotoCarouselInfoStruct() {
        this(0, null, null, false, false, null, null, null, null, 511, null);
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

    public PhotoCarouselInfoStruct(int i, String str, List<String> list, boolean z, boolean z2, NativeSiteConfig nativeSiteConfig, List<PhotoCarouselProductStruct> list2, Integer num, Integer num2) {
        this.productCount = i;
        this.lynxScheme = str;
        this.geckoChannelList = list;
        this.enableLabel = z;
        this.enableMultiCTAJump = z2;
        this.nativeSiteConfig = nativeSiteConfig;
        this.productList = list2;
        this.dynamicCarouselFirstIndex = num;
        this.LL = num2;
    }

    public PhotoCarouselInfoStruct(int i, String str, List list, boolean z, boolean z2, NativeSiteConfig nativeSiteConfig, List list2, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0 ? z2 : false, (i2 & 32) != 0 ? null : nativeSiteConfig, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : num, (i2 & 256) == 0 ? num2 : null);
    }
}
