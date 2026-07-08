package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public class LiveCapsuleStyleItemConfig {
    public static final TypeAdapter ADAPTER = new LiveCapsuleStyleItemConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("action_max_width")
    public int actionMaxWidth;

    @C09CT("balancer")
    public float balancer;

    @C09CT("capsule_min_height")
    public int capsuleMinHeight;

    @C09CT("capsule_radius")
    public int capsuleRadius;

    @C09CT("content_max_line")
    public int contentMaxLine;

    @C09CT("display_name_min_char_count")
    public int displayNameMinCharCount;

    @C09CT("display_name_truncate_type")
    public int displayNameTruncateType;

    @C09CT("ellipsis_char_count")
    public int ellipsisCharCount;

    @C09CT("margin_end")
    public int marginEnd;

    @C09CT("max_text_size")
    public int maxTextSize;

    @C09CT("min_text_size")
    public int minTextSize;

    @C09CT("shrink_mode_margin_end")
    public int shrinkModeMarginEnd;

    @C09CT("shrink_text_size_action_width_threshold")
    public int shrinkTextSizeActionWidthThreshold;

    @C09CT("shrink_text_size_line_threshold")
    public int shrinkTextSizeLineThreshold;

    @C09CT("trim_space")
    public boolean trimSpace;

    public static LiveCapsuleStyleItemConfig LIZ() {
        LiveCapsuleStyleItemConfig liveCapsuleStyleItemConfig = new LiveCapsuleStyleItemConfig();
        liveCapsuleStyleItemConfig.maxTextSize = 13;
        liveCapsuleStyleItemConfig.minTextSize = 12;
        liveCapsuleStyleItemConfig.contentMaxLine = 3;
        liveCapsuleStyleItemConfig.shrinkTextSizeLineThreshold = 2;
        liveCapsuleStyleItemConfig.actionMaxWidth = 72;
        liveCapsuleStyleItemConfig.shrinkTextSizeActionWidthThreshold = 64;
        liveCapsuleStyleItemConfig.displayNameMinCharCount = 8;
        liveCapsuleStyleItemConfig.displayNameTruncateType = 2;
        liveCapsuleStyleItemConfig.ellipsisCharCount = 1;
        liveCapsuleStyleItemConfig.capsuleMinHeight = 46;
        liveCapsuleStyleItemConfig.shrinkModeMarginEnd = 8;
        liveCapsuleStyleItemConfig.marginEnd = 32;
        liveCapsuleStyleItemConfig.capsuleRadius = 20;
        liveCapsuleStyleItemConfig.balancer = 0.6f;
        liveCapsuleStyleItemConfig.trimSpace = true;
        return liveCapsuleStyleItemConfig;
    }
}
