package com.ss.android.ugc.aweme.prop.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class PreLoadBonusH5BannerData {

    @C09CT("banner_icon")
    public final String bannerIcon;

    @C09CT("cross_icon")
    public final String crossIcon;

    @C09CT("larger_banner_background_image_url")
    public final String largeBannerBackgroundImageUrl;

    @C09CT("large_icon_heigth")
    public final String largeIconHeight;

    @C09CT("large_icon_width")
    public final String largeIconWidth;

    @C09CT("long_starling_text_key")
    public final String longStarlingTextKey;

    @C09CT("middle_banner_background_image_url")
    public final String middleBannerBackgroundImageUrl;

    @C09CT("middle_icon_heigth")
    public final String middleIconHeight;

    @C09CT("middle_icon_width")
    public final String middleIconWidth;

    @C09CT("promo_url")
    public final String promoUrl;

    @C09CT("middle_starling_text_key")
    public final String shortStarlingTextKey;

    @C09CT("large_icon")
    public final boolean showLargeIcon;

    @C09CT("middle_icon")
    public final boolean showMiddleIcon;

    @C09CT("small_banner_background_image_url")
    public final String smallBannerBackgroundImageUrl;

    @C09CT("space_between_text_icon")
    public final String spaceBetweenTextIcon;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("text_size")
    public final String textSize;

    public PreLoadBonusH5BannerData() {
        this("", "", "", "", "", "", "", "", true, "", "", true, "", "", "", "", "");
    }

    public PreLoadBonusH5BannerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, boolean z2, String str11, String str12, String str13, String str14, String str15) {
        this.promoUrl = str;
        this.largeBannerBackgroundImageUrl = str2;
        this.middleBannerBackgroundImageUrl = str3;
        this.smallBannerBackgroundImageUrl = str4;
        this.bannerIcon = str5;
        this.crossIcon = str6;
        this.shortStarlingTextKey = str7;
        this.longStarlingTextKey = str8;
        this.showLargeIcon = z;
        this.largeIconWidth = str9;
        this.largeIconHeight = str10;
        this.showMiddleIcon = z2;
        this.middleIconWidth = str11;
        this.middleIconHeight = str12;
        this.spaceBetweenTextIcon = str13;
        this.textSize = str14;
        this.textColor = str15;
    }
}
