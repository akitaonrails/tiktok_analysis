package com.ss.bytertc.engine;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public class SubscribeVideoConfig {
    public int priority;
    public int videoIndex;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeVideoConfig{videoIndex=");
        sbLIZ.append(this.videoIndex);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getPriority() {
        return this.priority;
    }

    public int getVideoIndex() {
        return this.videoIndex;
    }

    public SubscribeVideoConfig(int i, int i2) {
        this.videoIndex = i;
        this.priority = i2;
    }
}
