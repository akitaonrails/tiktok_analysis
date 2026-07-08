package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class IconTextInfo {

    @C09CT("bg_color")
    public final String bgColor;

    @C09CT("bg_dark_color")
    public final String bgDarkColor;

    @C09CT("border_color")
    public final String borderColor;

    @C09CT("border_dark_color")
    public final String borderDarkColor;

    @C09CT("icon_frame_color")
    public final String iconFrameColor;

    @C09CT("icon_frame_dark_color")
    public final String iconFrameDarkColor;

    @C09CT("icon_info")
    public final ThemeImage iconInfo;

    @C09CT("icon_layout")
    public final Integer iconLayout;

    @C09CT("icon_rendered_height")
    public final Integer iconRenderedHeight;

    @C09CT("padding")
    public final Integer padding;

    @C09CT("query_promotion_text_priority")
    public final Integer queryPromotionTextPriority;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("text_content")
    public final String textContent;

    @C09CT("text_dark_color")
    public final String textDarkColor;

    @C09CT("text_size")
    public final Integer textSize;

    @C09CT("text_weight")
    public final Integer textWeight;

    @C09CT("track_info")
    public final Map<String, String> trackInfo;

    public IconTextInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public IconTextInfo(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, ThemeImage themeImage, Integer num3, String str6, String str7, Integer num4, String str8, String str9, Integer num5, Map<String, String> map, Integer num6) {
        this.textContent = str;
        this.textSize = num;
        this.textWeight = num2;
        this.textColor = str2;
        this.textDarkColor = str3;
        this.bgColor = str4;
        this.bgDarkColor = str5;
        this.iconInfo = themeImage;
        this.iconLayout = num3;
        this.iconFrameColor = str6;
        this.iconFrameDarkColor = str7;
        this.iconRenderedHeight = num4;
        this.borderColor = str8;
        this.borderDarkColor = str9;
        this.padding = num5;
        this.trackInfo = map;
        this.queryPromotionTextPriority = num6;
    }
}
