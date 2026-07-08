package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdButtonStrategyModel implements Serializable {

    @C09CT("animation_type")
    public int animationType;

    @C09CT("show_button_color_seconds")
    public int showColorSeconds;

    @C09CT("show_button_seconds")
    public int showSeconds;

    @C09CT("trigger_condition")
    public int triggerCondition;

    public AdButtonStrategyModel() {
        this(0, 0, 0, 0);
    }

    public final int getAnimationType() {
        return this.animationType;
    }

    public final int getShowColorSeconds() {
        return this.showColorSeconds;
    }

    public final int getShowSeconds() {
        return this.showSeconds;
    }

    public final int getTriggerCondition() {
        return this.triggerCondition;
    }

    public final void setAnimationType(int i) {
        this.animationType = i;
    }

    public final void setShowColorSeconds(int i) {
        this.showColorSeconds = i;
    }

    public final void setShowSeconds(int i) {
        this.showSeconds = i;
    }

    public final void setTriggerCondition(int i) {
        this.triggerCondition = i;
    }

    public AdButtonStrategyModel(int i, int i2, int i3, int i4) {
        this.triggerCondition = i;
        this.animationType = i2;
        this.showSeconds = i3;
        this.showColorSeconds = i4;
    }
}
