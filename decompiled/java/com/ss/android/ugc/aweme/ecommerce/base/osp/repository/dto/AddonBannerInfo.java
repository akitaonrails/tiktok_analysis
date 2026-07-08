package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonBannerInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("addon_banner_info_item_type")
    public Integer addonBannerInfoItemType;

    @C09CT("banner_ratio")
    public Integer bannerRatio;

    @C09CT("content")
    public String content;

    @C09CT("has_qualified")
    public Boolean hasQualified;

    public AddonBannerInfo() {
        this(null, null, null, null);
    }

    public AddonBannerInfo(String str, Boolean bool, Integer num, Integer num2) {
        this.content = str;
        this.hasQualified = bool;
        this.bannerRatio = num;
        this.addonBannerInfoItemType = num2;
    }
}
