package com.ss.android.ugc.aweme.setting.performance;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class EffectResourceLevelConfig {

    @C09CT("allow_list")
    public final String allowList;

    @C09CT("cleanup_threshold")
    public final long cleanupThresholdMb;

    @C09CT("enable_lru_clean")
    public final boolean enableLruClean;

    @C09CT("is_open")
    public final boolean isOpen;

    @C09CT("lru_cache_days")
    public final int lruCacheDays;

    @C09CT("retention_threshold")
    public final long retentionThresholdMb;

    public EffectResourceLevelConfig() {
        this(false, "panel_effect_value,panel_ttwatermark,panel_composer1,panel_fallbackfont,panel_voiceconversion,panel_editorpro_adjust,panel_slideshoweffect,panel_editor_pro_magic,panel_singlepiceffect,panel_infostickerv2,panel_emoji-android", 10L, 5L, false, 30);
    }

    public EffectResourceLevelConfig(boolean z, String str, long j, long j2, boolean z2, int i) {
        this.isOpen = z;
        this.allowList = str;
        this.cleanupThresholdMb = j;
        this.retentionThresholdMb = j2;
        this.enableLruClean = z2;
        this.lruCacheDays = i;
    }
}
