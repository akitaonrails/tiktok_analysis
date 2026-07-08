package com.ss.android.ugc.aweme.component.ctacomponent;

import X.C098200Yq;
import X.C09CT;
import X.C1697810uHb;
import X.C189200o6;
import X.C786410Ut5;
import X.EnumC587010N0p;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleFeedCTAData implements Serializable {
    public static final int $stable = 8;

    @C09CT("cta_before_video_complete_color_time")
    public final Integer ctaBeforeVideoCompleteColorTime;

    @C09CT("background_color")
    public final String flatBackgroundColor;

    @C09CT("text")
    public final String flatButtonText;

    @C09CT("button_type")
    public final Integer flatButtonType;

    @C09CT("cancel_text")
    public final String flatCancelText;

    @C09CT("color_show_milliseconds")
    public final Float flatColorShowTime;

    @C09CT("corner_radius")
    public final Integer flatCornerRadius;

    @C09CT("have_arrow")
    public final Boolean flatHaveArrow;

    @C09CT("inner_content_height")
    public final Integer flatHeight;

    @C09CT("icon_label_padding")
    public final Integer flatIconLabelPadding;

    @C09CT("icon_length")
    public final Integer flatIconLength;

    @C09CT("icon_name")
    public final String flatIconName;

    @C09CT("icon_type")
    public final Integer flatIconType;

    @C09CT("icon_url")
    public final String flatIconURL;

    @C09CT("initial_background_color")
    public final String flatInitialBackgroundColor;

    @C09CT("is_live_left_icon")
    public final Integer flatIsLiveLeftIcon;

    @C09CT("open_text")
    public final String flatOpenText;

    @C09CT("should_hide_when_dm_not_enabled")
    public final Integer flatShouldHideWhenDmNotEnabled;

    @C09CT("should_show_ad_tag")
    public final Boolean flatShouldShowAdTag;

    @C09CT("show_guide_animation")
    public final Boolean flatShowGuideAnimation;

    @C09CT("text_font_size")
    public final Integer flatTextFontSize;

    @C09CT("log_info")
    public final AnoleLogInfo logInfo;

    @C09CT("cta_button")
    public final AnolFeedCtaButtonData rawCtaButtonData;

    public final int getBackgroundColor() {
        Object c098200Yq;
        try {
            AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
            c098200Yq = Integer.valueOf(Color.parseColor(ctaButtonData != null ? ctaButtonData.backgroundColor : null));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer num = (Integer) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (num != null) {
            return num.intValue();
        }
        return 6977122;
    }

    public final int getInitialBackgroundColor() {
        Object c098200Yq;
        try {
            AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
            c098200Yq = Integer.valueOf(Color.parseColor(ctaButtonData != null ? ctaButtonData.initialBackgroundColor : null));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer num = (Integer) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (num != null) {
            return num.intValue();
        }
        return 318767103;
    }

    public final int getBeforeVideoCompleteColorTimeSeconds() {
        Integer num = this.ctaBeforeVideoCompleteColorTime;
        if (num != null) {
            return num.intValue();
        }
        return 2;
    }

    public final AnolFeedCtaButtonData getCtaButtonData() {
        AnolFeedCtaButtonData anolFeedCtaButtonData = this.rawCtaButtonData;
        List listLJIIJJI = C1697810uHb.LJIIJJI(this.flatButtonText, this.flatInitialBackgroundColor, this.flatBackgroundColor, this.flatColorShowTime, this.flatIconURL, this.flatIconName, this.flatIconType, this.flatHaveArrow, this.flatButtonType, this.flatHeight, this.flatShouldShowAdTag, this.flatTextFontSize, this.flatCornerRadius, this.flatCancelText, this.flatOpenText, this.flatIsLiveLeftIcon, this.flatIconLength, this.flatIconLabelPadding, this.flatShouldHideWhenDmNotEnabled);
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (it2.next() != null) {
                    String str = this.flatButtonText;
                    Integer num = null;
                    if (str == null) {
                        str = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.buttonText : null;
                    }
                    String str2 = this.flatInitialBackgroundColor;
                    if (str2 == null) {
                        str2 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.initialBackgroundColor : null;
                    }
                    String str3 = this.flatBackgroundColor;
                    if (str3 == null) {
                        str3 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.backgroundColor : null;
                    }
                    Boolean bool = this.flatHaveArrow;
                    if (bool == null) {
                        bool = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.haveArrow : null;
                    }
                    Float f = this.flatColorShowTime;
                    if (f == null) {
                        f = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.colorShowTime : null;
                    }
                    String str4 = this.flatIconURL;
                    if (str4 == null) {
                        str4 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.iconURL : null;
                    }
                    String str5 = this.flatIconName;
                    if (str5 == null) {
                        str5 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.iconName : null;
                    }
                    Integer num2 = this.flatIconType;
                    if (num2 == null) {
                        num2 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.iconType : null;
                    }
                    Integer num3 = this.flatButtonType;
                    if (num3 == null) {
                        num3 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.buttonType : null;
                    }
                    Integer num4 = this.flatHeight;
                    if (num4 == null) {
                        num4 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.height : null;
                    }
                    Boolean bool2 = this.flatShouldShowAdTag;
                    if (bool2 == null) {
                        bool2 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.shouldShowAdTag : null;
                    }
                    Integer num5 = this.flatCornerRadius;
                    if (num5 == null) {
                        num5 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.cornerRadius : null;
                    }
                    Integer num6 = this.flatTextFontSize;
                    if (num6 == null) {
                        num6 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.textFontSize : null;
                    }
                    String str6 = this.flatCancelText;
                    if (str6 == null) {
                        str6 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.cancelText : null;
                    }
                    String str7 = this.flatOpenText;
                    if (str7 == null) {
                        str7 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.openText : null;
                    }
                    Integer numIsLiveLeftIcon = this.flatIsLiveLeftIcon;
                    if (numIsLiveLeftIcon == null) {
                        numIsLiveLeftIcon = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.isLiveLeftIcon() : null;
                    }
                    Integer num7 = this.flatIconLength;
                    if (num7 == null) {
                        num7 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.iconLength : null;
                    }
                    Integer num8 = this.flatIconLabelPadding;
                    if (num8 == null) {
                        num8 = anolFeedCtaButtonData != null ? anolFeedCtaButtonData.iconLabelPadding : null;
                    }
                    Integer num9 = this.flatShouldHideWhenDmNotEnabled;
                    if (num9 != null) {
                        num = num9;
                    } else if (anolFeedCtaButtonData != null) {
                        num = anolFeedCtaButtonData.shouldHideWhenDmNotEnabled;
                    }
                    return new AnolFeedCtaButtonData(str, str2, str3, bool, f, str4, str5, num2, num3, num4, bool2, num5, num6, str6, str7, numIsLiveLeftIcon, num7, num8, num);
                }
            }
        }
        return anolFeedCtaButtonData;
    }

    public final boolean getShowGuideAnimation() {
        Boolean bool = this.flatShowGuideAnimation;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String getButtonText() {
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData != null) {
            return ctaButtonData.buttonText;
        }
        return null;
    }

    public final int getButtonType() {
        Integer num;
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData == null || (num = ctaButtonData.buttonType) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final Float getColorShowTime() {
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData != null) {
            return ctaButtonData.colorShowTime;
        }
        return null;
    }

    public final int getCornerRadius() {
        Integer num;
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData == null || (num = ctaButtonData.cornerRadius) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int getHeight() {
        Integer num;
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData == null || (num = ctaButtonData.height) == null) {
            return 40;
        }
        return num.intValue();
    }

    public final int getIconLabelPadding() {
        Integer num;
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData == null || (num = ctaButtonData.iconLabelPadding) == null) {
            return 6;
        }
        return num.intValue();
    }

    public final int getIconLength() {
        Integer num;
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData == null || (num = ctaButtonData.iconLength) == null) {
            return 12;
        }
        return num.intValue();
    }

    public final String getIconName() {
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData != null) {
            return ctaButtonData.iconName;
        }
        return null;
    }

    public final int getIconType() {
        Integer num;
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        return (ctaButtonData == null || (num = ctaButtonData.iconType) == null) ? EnumC587010N0p.NONE.getValue() : num.intValue();
    }

    public final String getIconURL() {
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData != null) {
            return ctaButtonData.iconURL;
        }
        return null;
    }

    public final boolean getShouldHideWhenDmNotEnabled() {
        Integer num;
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        return (ctaButtonData == null || (num = ctaButtonData.shouldHideWhenDmNotEnabled) == null || num.intValue() != 1) ? false : true;
    }

    public final boolean getShouldShowAdTag() {
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData != null) {
            return Intrinsics.LJFF(ctaButtonData.shouldShowAdTag, Boolean.TRUE);
        }
        return false;
    }

    public final Integer getTextFontSize() {
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData != null) {
            return ctaButtonData.textFontSize;
        }
        return null;
    }

    public final boolean isLiveLeftIcon() {
        Integer numIsLiveLeftIcon;
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        return (ctaButtonData == null || (numIsLiveLeftIcon = ctaButtonData.isLiveLeftIcon()) == null || numIsLiveLeftIcon.intValue() != 1) ? false : true;
    }

    public final AnoleLogInfo getLogInfo() {
        return this.logInfo;
    }

    public final int effectiveColorShowTime(Integer num) {
        int iFloatValue;
        int iIntValue;
        Float colorShowTime = getColorShowTime();
        if (colorShowTime != null) {
            iFloatValue = (int) colorShowTime.floatValue();
        } else {
            iFloatValue = 0;
        }
        if (num != null && (iIntValue = num.intValue()) > 0 && iFloatValue > iIntValue) {
            return Math.max(iIntValue - (getBeforeVideoCompleteColorTimeSeconds() * LSPassThroughRecordSizeConfig.DEFAULT), 0);
        }
        return iFloatValue;
    }

    public final String getSafeCancelText(String str, String str2) {
        String str3;
        AnolFeedCtaButtonData ctaButtonData = getCtaButtonData();
        if (ctaButtonData != null && (str3 = ctaButtonData.cancelText) != null) {
            try {
                return C786410Ut5.j4(str3, Arrays.copyOf(new Object[]{str, str2}, 2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return null;
    }

    public AnoleFeedCTAData(AnoleLogInfo anoleLogInfo, AnolFeedCtaButtonData anolFeedCtaButtonData, String str, String str2, String str3, Float f, String str4, String str5, Integer num, Boolean bool, Integer num2, Integer num3, Boolean bool2, Integer num4, Integer num5, String str6, String str7, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Boolean bool3) {
        this.logInfo = anoleLogInfo;
        this.rawCtaButtonData = anolFeedCtaButtonData;
        this.flatButtonText = str;
        this.flatInitialBackgroundColor = str2;
        this.flatBackgroundColor = str3;
        this.flatColorShowTime = f;
        this.flatIconURL = str4;
        this.flatIconName = str5;
        this.flatIconType = num;
        this.flatHaveArrow = bool;
        this.flatButtonType = num2;
        this.flatHeight = num3;
        this.flatShouldShowAdTag = bool2;
        this.flatTextFontSize = num4;
        this.flatCornerRadius = num5;
        this.flatCancelText = str6;
        this.flatOpenText = str7;
        this.ctaBeforeVideoCompleteColorTime = num6;
        this.flatIsLiveLeftIcon = num7;
        this.flatIconLength = num8;
        this.flatIconLabelPadding = num9;
        this.flatShouldHideWhenDmNotEnabled = num10;
        this.flatShowGuideAnimation = bool3;
    }
}
