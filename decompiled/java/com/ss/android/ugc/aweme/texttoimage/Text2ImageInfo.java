package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageInfo {
    public transient String LIZ;
    public transient Effect LIZIZ;
    public transient Effect LIZJ;
    public transient String LIZLLL;

    @C09CT("unique_sticker_utf8")
    public final String emoji;

    @C09CT("emphasis_center_y")
    public final String emphasisCenterY;

    @C09CT("emphasis_color")
    public String emphasisColor;

    @C09CT("emphasis_height")
    public final String emphasisHeight;

    @C09CT("emphasis_id")
    public String emphasisId;

    @C09CT("emphasis_offset_height")
    public final Float emphasisOffsetHeight;

    @C09CT("emphasis_offset_height_scale")
    public final Float emphasisOffsetHeightScale;

    @C09CT("emphasis_offset_width")
    public final Float emphasisOffsetWidth;

    @C09CT("emphasis_offset_width_scale")
    public final Float emphasisOffsetWidthScale;

    @C09CT("emphasis_repeat_style")
    public final String emphasisRepeatStyle;

    @C09CT("emphasis_scale_height")
    public final Float emphasisScaleHeight;

    @C09CT("emphasis_scale_width")
    public final Float emphasisScaleWidth;

    @C09CT("emphasis_stroke_width")
    public final Float emphasisStrokeWidth;

    @C09CT("font")
    public String font;

    @C09CT("keyword_bgcolor")
    public final String keywordBGColor;

    @C09CT("keyword_bold")
    public String keywordBold;

    @C09CT("keyword_color")
    public String keywordColor;

    @C09CT("line_spacing")
    public final Float lineSpacing;

    @C09CT("maximum_font_size")
    public final Float maxFontSize;

    @C09CT("sticker_position_x")
    public final Float stickerPositionX;

    @C09CT("sticker_position_y")
    public final Float stickerPositionY;

    @C09CT("sticker_size")
    public final Float stickerSize;

    @C09CT("emphasis_stroke_cap")
    public final String strokeCap;

    @C09CT("emphasis_stroke_join")
    public final String strokeJoin;

    @C09CT("template_ele_configs")
    public final List<TemplateEleConfig> templateEleConfig;

    @C09CT("template_id")
    public final Long templateIds;

    @C09CT("text_align")
    public final Integer textAlign;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("text_height")
    public final Float textHeight;

    @C09CT("text_position_x")
    public final Float textPositionX;

    @C09CT("text_position_y")
    public final Float textPostitionY;

    @C09CT("text_rotation")
    public final Float textRotation;

    @C09CT("text_scaling")
    public final Float textScaling;

    @C09CT("text_width")
    public final Float textWidth;

    @C09CT("background_image_url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, -1, 255, 0 == true ? 1 : 0);
    }

    public final void LIZ(Effect effect) {
        this.LIZJ = effect;
    }

    public final void LIZIZ(Effect effect) {
        this.LIZIZ = effect;
    }

    public Text2ImageInfo(Long l, String str, Float f, Float f2, Float f3, String str2, String str3, Integer num, Float f4, Float f5, Float f6, Float f7, Float f8, String str4, String str5, String str6, String str7, Float f9, Float f10, Float f11, String str8, String str9, Float f12, Float f13, Float f14, Float f15, Float f16, Float f18, Float f19, String str10, String str11, String str12, String str13, String str14, List<TemplateEleConfig> list, String str15, Effect effect, Effect effect2, boolean z, String str16) {
        this.templateIds = l;
        this.url = str;
        this.stickerPositionX = f;
        this.stickerPositionY = f2;
        this.stickerSize = f3;
        this.font = str2;
        this.textColor = str3;
        this.textAlign = num;
        this.textPositionX = f4;
        this.textPostitionY = f5;
        this.textRotation = f6;
        this.textWidth = f7;
        this.textHeight = f8;
        this.keywordColor = str4;
        this.keywordBold = str5;
        this.keywordBGColor = str6;
        this.emoji = str7;
        this.textScaling = f9;
        this.lineSpacing = f10;
        this.maxFontSize = f11;
        this.emphasisId = str8;
        this.emphasisColor = str9;
        this.emphasisStrokeWidth = f12;
        this.emphasisScaleWidth = f13;
        this.emphasisScaleHeight = f14;
        this.emphasisOffsetWidth = f15;
        this.emphasisOffsetHeight = f16;
        this.emphasisOffsetWidthScale = f18;
        this.emphasisOffsetHeightScale = f19;
        this.emphasisCenterY = str10;
        this.emphasisHeight = str11;
        this.emphasisRepeatStyle = str12;
        this.strokeCap = str13;
        this.strokeJoin = str14;
        this.templateEleConfig = list;
        this.LIZ = str15;
        this.LIZIZ = effect;
        this.LIZJ = effect2;
        this.LIZLLL = str16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Text2ImageInfo(Long l, String str, Float f, Float f2, Float f3, String str2, String str3, Integer num, Float f4, Float f5, Float f6, Float f7, Float f8, String str4, String str5, String str6, String str7, Float f9, Float f10, Float f11, String str8, String str9, Float f12, Float f13, Float f14, Float f15, Float f16, Float f18, Float f19, String str10, String str11, String str12, String str13, String str14, List list, String str15, Effect effect, Effect effect2, boolean z, String str16, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Effect effect3 = effect2;
        Effect effect4 = effect;
        l = (i & 1) != 0 ? null : l;
        str = (i & 2) != 0 ? null : str;
        f = (i & 4) != 0 ? null : f;
        f2 = (i & 8) != 0 ? null : f2;
        f3 = (i & 16) != 0 ? null : f3;
        str2 = (i & 32) != 0 ? null : str2;
        str3 = (i & 64) != 0 ? null : str3;
        num = (i & 128) != 0 ? null : num;
        f4 = (i & 256) != 0 ? null : f4;
        f5 = (i & 512) != 0 ? null : f5;
        f6 = (i & 1024) != 0 ? null : f6;
        f7 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : f7;
        f8 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : f8;
        str4 = (i & 8192) != 0 ? null : str4;
        str5 = (i & 16384) != 0 ? null : str5;
        str6 = (32768 & i) != 0 ? null : str6;
        str7 = (65536 & i) != 0 ? null : str7;
        f9 = (131072 & i) != 0 ? null : f9;
        f10 = (262144 & i) != 0 ? null : f10;
        f11 = (524288 & i) != 0 ? null : f11;
        str8 = (1048576 & i) != 0 ? null : str8;
        str9 = (2097152 & i) != 0 ? null : str9;
        f12 = (4194304 & i) != 0 ? null : f12;
        f13 = (8388608 & i) != 0 ? null : f13;
        f14 = (16777216 & i) != 0 ? null : f14;
        f15 = (33554432 & i) != 0 ? null : f15;
        f16 = (67108864 & i) != 0 ? null : f16;
        f18 = (134217728 & i) != 0 ? null : f18;
        f19 = (268435456 & i) != 0 ? null : f19;
        str10 = (536870912 & i) != 0 ? null : str10;
        str11 = (1073741824 & i) != 0 ? null : str11;
        str12 = (i & Integer.MIN_VALUE) != 0 ? null : str12;
        str13 = (i2 & 1) != 0 ? null : str13;
        str14 = (i2 & 2) != 0 ? null : str14;
        list = (i2 & 4) != 0 ? null : list;
        str15 = (i2 & 8) != 0 ? "" : str15;
        if ((i2 & 16) != 0) {
            long j = 0;
            int i3 = -1;
            effect4 = new Effect(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i3, i3, 15, 0 == true ? 1 : 0);
        }
        if ((i2 & 32) != 0) {
            long j2 = 0;
            int i4 = -1;
            effect3 = new Effect(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j2, j2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i4, i4, 15, 0 == true ? 1 : 0);
        }
        this(l, str, f, f2, f3, str2, str3, num, f4, f5, f6, f7, f8, str4, str5, str6, str7, f9, f10, f11, str8, str9, f12, f13, f14, f15, f16, f18, f19, str10, str11, str12, str13, str14, list, str15, effect4, effect3, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : str16);
    }
}
