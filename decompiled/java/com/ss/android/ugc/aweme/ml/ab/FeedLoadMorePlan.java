package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class FeedLoadMorePlan {

    @C09CT("delay")
    public int delay;

    @C09CT("preload")
    public boolean preload;

    @C09CT("preload_duration")
    public int preloadDuration;

    @C09CT("preload_plan")
    public PreloadStrategyConfig preloadPlan;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(preload=");
        sbLIZ.append(this.preload);
        sbLIZ.append(", delay=");
        sbLIZ.append(this.delay);
        sbLIZ.append(" preloadDuration=");
        sbLIZ.append(this.preloadDuration);
        sbLIZ.append(" preloadPlan=");
        sbLIZ.append(this.preloadPlan);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getDelay() {
        return this.delay;
    }

    public final boolean getPreload() {
        return this.preload;
    }

    public final int getPreloadDuration() {
        return this.preloadDuration;
    }

    public final PreloadStrategyConfig getPreloadPlan() {
        return this.preloadPlan;
    }

    public final void setDelay(int i) {
        this.delay = i;
    }

    public final void setPreload(boolean z) {
        this.preload = z;
    }

    public final void setPreloadDuration(int i) {
        this.preloadDuration = i;
    }

    public final void setPreloadPlan(PreloadStrategyConfig preloadStrategyConfig) {
        this.preloadPlan = preloadStrategyConfig;
    }
}
