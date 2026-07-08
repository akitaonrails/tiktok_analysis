package com.ss.android.ugc.aweme.component.ctacomponent;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnolFeedCtaButtonData implements Serializable {
    public static final int $stable = 0;

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("text")
    public final String buttonText;

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("cancel_text")
    public final String cancelText;

    @C09CT("color_show_milliseconds")
    public final Float colorShowTime;

    @C09CT("corner_radius")
    public final Integer cornerRadius;

    @C09CT("have_arrow")
    public final Boolean haveArrow;

    @C09CT("inner_content_height")
    public final Integer height;

    @C09CT("icon_label_padding")
    public final Integer iconLabelPadding;

    @C09CT("icon_length")
    public final Integer iconLength;

    @C09CT("icon_name")
    public final String iconName;

    @C09CT("icon_type")
    public final Integer iconType;

    @C09CT("icon_url")
    public final String iconURL;

    @C09CT("initial_background_color")
    public final String initialBackgroundColor;

    @C09CT("is_live_left_icon")
    public final Integer isLiveLeftIcon;

    @C09CT("open_text")
    public final String openText;

    @C09CT("should_hide_when_dm_not_enabled")
    public final Integer shouldHideWhenDmNotEnabled;

    @C09CT("should_show_ad_tag")
    public final Boolean shouldShowAdTag;

    @C09CT("text_font_size")
    public final Integer textFontSize;

    public final Integer isLiveLeftIcon() {
        return this.isLiveLeftIcon;
    }

    public AnolFeedCtaButtonData(String str, String str2, String str3, Boolean bool, Float f, String str4, String str5, Integer num, Integer num2, Integer num3, Boolean bool2, Integer num4, Integer num5, String str6, String str7, Integer num6, Integer num7, Integer num8, Integer num9) {
        this.buttonText = str;
        this.initialBackgroundColor = str2;
        this.backgroundColor = str3;
        this.haveArrow = bool;
        this.colorShowTime = f;
        this.iconURL = str4;
        this.iconName = str5;
        this.iconType = num;
        this.buttonType = num2;
        this.height = num3;
        this.shouldShowAdTag = bool2;
        this.cornerRadius = num4;
        this.textFontSize = num5;
        this.cancelText = str6;
        this.openText = str7;
        this.isLiveLeftIcon = num6;
        this.iconLength = num7;
        this.iconLabelPadding = num8;
        this.shouldHideWhenDmNotEnabled = num9;
    }
}
