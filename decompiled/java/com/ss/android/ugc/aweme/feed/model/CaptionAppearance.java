package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CaptionAppearance implements Serializable {

    @C09CT("bg_color")
    public String bgColor;

    @C09CT("bg_corner_radius")
    public Float bgCornerRadius;

    @C09CT("caption_text_color")
    public String captionTextColor;

    @C09CT("caption_text_size")
    public Integer captionTextSize;

    @C09CT("caption_text_stroke_color")
    public String captionTextStrokeColor;

    @C09CT("caption_text_stroke_width")
    public Float captionTextStrokeWidth;

    @C09CT("expansion_direction")
    public Integer expansionDirection;

    @C09CT("instruction_text_color")
    public String instructionTextColor;

    @C09CT("instruction_text_size")
    public Integer instructionTextSize;

    @C09CT("instruction_text_stroke_color")
    public String instructionTextStrokeColor;

    @C09CT("instruction_text_stroke_width")
    public Float instructionTextStrokeWidth;

    @C09CT("should_show_caption_off")
    public Boolean shouldShowCaptionOff;

    @C09CT("should_show_caption_on")
    public Boolean shouldShowCaptionOn;

    @C09CT("should_show_control_when_collapsed")
    public Boolean shouldShowControlWhenCollapsed;

    @C09CT("should_show_control_when_expanded")
    public Boolean shouldShowControlWhenExpanded;

    @C09CT("should_show_instruction_text")
    public Boolean shouldShowInstructionText;

    @C09CT("text_label_alignment")
    public Integer textLabelAlignment;

    @C09CT("text_label_inset_info")
    public CaptionInsetInfo textLabelInsetInfo;

    @C09CT("tooltip_hide_enabled")
    public Boolean tooltipHideEnabled;

    public CaptionAppearance() {
    }

    public CaptionAppearance(String str, Float f, Integer num, CaptionInsetInfo captionInsetInfo, Integer num2, String str2, Float f2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, String str4, Float f3, String str5, Integer num4, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.bgColor = str;
        this.bgCornerRadius = f;
        this.textLabelAlignment = num;
        this.textLabelInsetInfo = captionInsetInfo;
        this.captionTextSize = num2;
        this.captionTextColor = str2;
        this.captionTextStrokeWidth = f2;
        this.captionTextStrokeColor = str3;
        this.shouldShowCaptionOn = bool;
        this.shouldShowCaptionOff = bool2;
        this.shouldShowInstructionText = bool3;
        this.instructionTextSize = num3;
        this.instructionTextColor = str4;
        this.instructionTextStrokeWidth = f3;
        this.instructionTextStrokeColor = str5;
        this.expansionDirection = num4;
        this.shouldShowControlWhenCollapsed = bool4;
        this.shouldShowControlWhenExpanded = bool5;
        this.tooltipHideEnabled = bool6;
    }
}
