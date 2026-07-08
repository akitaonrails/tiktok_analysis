package com.ss.android.ugc.gamora.recorder.sticker.slideslip.config;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class SlideSlipBottomStickerConfig {

    @C09CT("apply_debounce_interval_ms")
    public final int applyDebounceIntervalMs;

    @C09CT("count")
    public final int count;

    @C09CT("enhanced_bottom_tab_view")
    public final int enhancedBottomTabView;

    @C09CT("fixed_effect_panel_entrance")
    public final boolean fixedEffectEntrance;

    @C09CT("panel_auto_select_first")
    public final boolean panelAutoSelectFirst;

    @C09CT("record_above_when_empty")
    public final boolean recordAboveWhenEmpty;

    @C09CT("reverse_effect_upload")
    public final boolean reverseEffectUpload;

    @C09CT("select_on_dragging")
    public final boolean selectEffectOnDragging;

    @C09CT("selected_touch_to_record_delay_ms")
    public final int selectedTouchToRecordDelayMs;

    @C09CT("support_upslide_open_effect_panel")
    public final boolean supportUpslideOpenPanel;

    public SlideSlipBottomStickerConfig() {
        this(false, 50, false, 150, 20, false, false, false, 0, false);
    }

    public SlideSlipBottomStickerConfig(boolean z, int i, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, boolean z6) {
        this.selectEffectOnDragging = z;
        this.count = i;
        this.supportUpslideOpenPanel = z2;
        this.selectedTouchToRecordDelayMs = i2;
        this.applyDebounceIntervalMs = i3;
        this.reverseEffectUpload = z3;
        this.recordAboveWhenEmpty = z4;
        this.fixedEffectEntrance = z5;
        this.enhancedBottomTabView = i4;
        this.panelAutoSelectFirst = z6;
    }
}
