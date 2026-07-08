package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveGameDrawLoadOptModel {
    public static final TypeAdapter ADAPTER = new LiveGameDrawLoadOptModel_OptTypeAdapter(NormalGson.singleton());

    @C09CT("gaussian_hide_timing_opt")
    public boolean gaussianHideTimingOpt;

    @C09CT("horizontal_canvas_stable")
    public boolean horizontalCanvasStable;

    @C09CT("loading_stable")
    public boolean loadingStable;

    public LiveGameDrawLoadOptModel() {
        this(false, false, false);
    }

    public final boolean getGaussianHideTimingOpt() {
        return this.gaussianHideTimingOpt;
    }

    public final boolean getHorizontalCanvasStable() {
        return this.horizontalCanvasStable;
    }

    public final boolean getLoadingStable() {
        return this.loadingStable;
    }

    public final void setGaussianHideTimingOpt(boolean z) {
        this.gaussianHideTimingOpt = z;
    }

    public final void setHorizontalCanvasStable(boolean z) {
        this.horizontalCanvasStable = z;
    }

    public final void setLoadingStable(boolean z) {
        this.loadingStable = z;
    }

    public LiveGameDrawLoadOptModel(boolean z, boolean z2, boolean z3) {
        this.horizontalCanvasStable = z;
        this.loadingStable = z2;
        this.gaussianHideTimingOpt = z3;
    }
}
