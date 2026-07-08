package com.ss.android.ugc.aweme.story.experiment.streak;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class StoryStreakFrameModel {
    public static final int $stable = 0;

    @C09CT("bottom_text_info_sticker_res_id")
    public final String bottomTextInfoStickerResId;

    @C09CT("fake_level_bottom_bubble_res_id")
    public final String fakeLevelBottomBubbleResId;

    @C09CT("fake_level_bottom_bubble_sub_path")
    public final String fakeLevelBottomBubbleSubPath;

    @C09CT("fake_level_bottom_text_color_angle")
    public final String fakeLevelBottomTextColorAngle;

    @C09CT("fake_level_bottom_text_end_color")
    public final String fakeLevelBottomTextEndColor;

    @C09CT("fake_level_bottom_text_font_effect_id")
    public final String fakeLevelBottomTextFontEffectId;

    @C09CT("fake_level_bottom_text_start_color")
    public final String fakeLevelBottomTextStartColor;

    @C09CT("fire_anim_info_sticker_res_id")
    public final String fireAnimInfoStickerResId;

    @C09CT("frame_rate_low_end")
    public final int frameLowEnd;

    @C09CT("frame_rate_normal")
    public final int frameNormal;

    @C09CT("is_add_first")
    public final boolean isAddFirst;

    @C09CT("is_cancel_downloading")
    public final boolean isCancelDownloading;

    @C09CT("is_use_tt_downloader")
    public final boolean isUseTTDownloader;

    @C09CT("timeout_threshold_ms")
    public final long timeoutThresholdMs;

    public final boolean isAddFirst() {
        return this.isAddFirst;
    }

    public final boolean isCancelDownloading() {
        return this.isCancelDownloading;
    }

    public final boolean isUseTTDownloader() {
        return this.isUseTTDownloader;
    }

    public StoryStreakFrameModel(int i, int i2, long j, String str, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.frameLowEnd = i;
        this.frameNormal = i2;
        this.timeoutThresholdMs = j;
        this.bottomTextInfoStickerResId = str;
        this.fireAnimInfoStickerResId = str2;
        this.isAddFirst = z;
        this.isCancelDownloading = z2;
        this.isUseTTDownloader = z3;
        this.fakeLevelBottomTextFontEffectId = str3;
        this.fakeLevelBottomTextStartColor = str4;
        this.fakeLevelBottomTextEndColor = str5;
        this.fakeLevelBottomTextColorAngle = str6;
        this.fakeLevelBottomBubbleResId = str7;
        this.fakeLevelBottomBubbleSubPath = str8;
    }
}
