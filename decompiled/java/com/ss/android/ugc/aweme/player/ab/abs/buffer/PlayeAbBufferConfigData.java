package com.ss.android.ugc.aweme.player.ab.abs.buffer;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class PlayeAbBufferConfigData {
    public int expType;
    public int interactionBlockDurationPreloaded = 200;
    public int interactionBlockDurationNonPreloaded = LSPassThroughRecordSizeConfig.DEFAULT;
    public int netBlockDurationMax = 5000;
    public float netBlockIncFactor = 9.0f;
    public int netBlockDurationInitial = 200;

    public final int getExpType() {
        return this.expType;
    }

    public final int getInteractionBlockDurationNonPreloaded() {
        return this.interactionBlockDurationNonPreloaded;
    }

    public final int getInteractionBlockDurationPreloaded() {
        return this.interactionBlockDurationPreloaded;
    }

    public final int getNetBlockDurationInitial() {
        return this.netBlockDurationInitial;
    }

    public final int getNetBlockDurationMax() {
        return this.netBlockDurationMax;
    }

    public final float getNetBlockIncFactor() {
        return this.netBlockIncFactor;
    }

    public final void setExpType(int i) {
        this.expType = i;
    }

    public final void setInteractionBlockDurationNonPreloaded(int i) {
        this.interactionBlockDurationNonPreloaded = i;
    }

    public final void setInteractionBlockDurationPreloaded(int i) {
        this.interactionBlockDurationPreloaded = i;
    }

    public final void setNetBlockDurationInitial(int i) {
        this.netBlockDurationInitial = i;
    }

    public final void setNetBlockDurationMax(int i) {
        this.netBlockDurationMax = i;
    }

    public final void setNetBlockIncFactor(float f) {
        this.netBlockIncFactor = f;
    }
}
