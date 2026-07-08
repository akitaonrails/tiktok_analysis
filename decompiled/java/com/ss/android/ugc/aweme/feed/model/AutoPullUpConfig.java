package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AutoPullUpConfig implements Serializable {

    @C09CT("delay")
    public final int delay;

    @C09CT("embedded_sheet_initial_ratio")
    public final Float embeddedSheetInitialRatio;

    @C09CT("enable_drag_down")
    public final boolean enableDragDown;

    @C09CT("auto_pull_up_flag")
    public final int flag;

    @C09CT("trigger_type")
    public final int triggerType;

    @C09CT("use_embedded_sheet")
    public final Boolean useEmbeddedSheet;

    public AutoPullUpConfig() {
        this(0, 0, false, 0, null, null);
    }

    public final int getDelay() {
        return this.delay;
    }

    public final Float getEmbeddedSheetInitialRatio() {
        return this.embeddedSheetInitialRatio;
    }

    public final boolean getEnableDragDown() {
        return this.enableDragDown;
    }

    public final int getFlag() {
        return this.flag;
    }

    public final int getTriggerType() {
        return this.triggerType;
    }

    public final Boolean getUseEmbeddedSheet() {
        return this.useEmbeddedSheet;
    }

    public AutoPullUpConfig(int i, int i2, boolean z, int i3, Boolean bool, Float f) {
        this.delay = i;
        this.triggerType = i2;
        this.enableDragDown = z;
        this.flag = i3;
        this.useEmbeddedSheet = bool;
        this.embeddedSheetInitialRatio = f;
    }
}
