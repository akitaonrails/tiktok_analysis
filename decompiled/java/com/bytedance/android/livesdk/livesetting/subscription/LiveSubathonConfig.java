package com.bytedance.android.livesdk.livesetting.subscription;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveSubathonConfig {
    public static final TypeAdapter ADAPTER = new LiveSubathonConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("anchor_timer_auto_start")
    public boolean anchorTimerAutoStart;

    @C09CT("enable_edit_title")
    public boolean enableEditTitle;

    @C09CT("enable_entrance")
    public boolean enableEntrance;

    @C09CT("time_align_interval")
    public long timeAlignInterval;

    @C09CT("time_align_max_gap")
    public long timeAlignMaxGap;

    @C09CT("time_align_min_gap")
    public long timeAlignMinGap;

    public LiveSubathonConfig() {
        this(false, false, 10L, 120L, 300L, true);
    }

    public final boolean getAnchorTimerAutoStart() {
        return this.anchorTimerAutoStart;
    }

    public final boolean getEnableEditTitle() {
        return this.enableEditTitle;
    }

    public final boolean getEnableEntrance() {
        return this.enableEntrance;
    }

    public final long getTimeAlignInterval() {
        return this.timeAlignInterval;
    }

    public final long getTimeAlignMaxGap() {
        return this.timeAlignMaxGap;
    }

    public final long getTimeAlignMinGap() {
        return this.timeAlignMinGap;
    }

    public final void setAnchorTimerAutoStart(boolean z) {
        this.anchorTimerAutoStart = z;
    }

    public final void setEnableEditTitle(boolean z) {
        this.enableEditTitle = z;
    }

    public final void setEnableEntrance(boolean z) {
        this.enableEntrance = z;
    }

    public final void setTimeAlignInterval(long j) {
        this.timeAlignInterval = j;
    }

    public final void setTimeAlignMaxGap(long j) {
        this.timeAlignMaxGap = j;
    }

    public final void setTimeAlignMinGap(long j) {
        this.timeAlignMinGap = j;
    }

    public LiveSubathonConfig(boolean z, boolean z2, long j, long j2, long j3, boolean z3) {
        this.enableEntrance = z;
        this.enableEditTitle = z2;
        this.timeAlignMinGap = j;
        this.timeAlignMaxGap = j2;
        this.timeAlignInterval = j3;
        this.anchorTimerAutoStart = z3;
    }
}
