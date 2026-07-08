package com.ss.android.ugc.aweme.story.experiment.feed;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes5.dex */
public final class StoryAvatarRingVerifyConfig {

    @C09CT("cache_size")
    public final int cacheSize;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("preload_after")
    public final int preloadAfter;

    @C09CT("preload_before")
    public final int preloadBefore;

    @C09CT("verify_trigger_distance")
    public final int verifyTriggerDistance;

    public StoryAvatarRingVerifyConfig() {
        this(false, 1, 15, 100, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryAvatarRingVerifyConfig)) {
            return false;
        }
        StoryAvatarRingVerifyConfig storyAvatarRingVerifyConfig = (StoryAvatarRingVerifyConfig) obj;
        return this.enable == storyAvatarRingVerifyConfig.enable && this.preloadBefore == storyAvatarRingVerifyConfig.preloadBefore && this.preloadAfter == storyAvatarRingVerifyConfig.preloadAfter && this.cacheSize == storyAvatarRingVerifyConfig.cacheSize && this.verifyTriggerDistance == storyAvatarRingVerifyConfig.verifyTriggerDistance;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.enable) * 31) + this.preloadBefore) * 31) + this.preloadAfter) * 31) + this.cacheSize) * 31) + this.verifyTriggerDistance;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryAvatarRingVerifyConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", preloadBefore=");
        sbLIZ.append(this.preloadBefore);
        sbLIZ.append(", preloadAfter=");
        sbLIZ.append(this.preloadAfter);
        sbLIZ.append(", cacheSize=");
        sbLIZ.append(this.cacheSize);
        sbLIZ.append(", verifyTriggerDistance=");
        sbLIZ.append(this.verifyTriggerDistance);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryAvatarRingVerifyConfig(boolean z, int i, int i2, int i3, int i4) {
        this.enable = z;
        this.preloadBefore = i;
        this.preloadAfter = i2;
        this.cacheSize = i3;
        this.verifyTriggerDistance = i4;
    }
}
