package com.ss.android.ugc.playerkit.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes24.dex */
public class PlayerSessionThreadPriorityConfig {
    public int prepareStory;
    public int preprepareStory;
    public int recycleStory;
    public int releaseStory;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerSessionThreadPriorityConfig{preprepareStory=");
        sbLIZ.append(this.preprepareStory);
        sbLIZ.append(", prepareStory=");
        sbLIZ.append(this.prepareStory);
        sbLIZ.append(", recycleStory=");
        sbLIZ.append(this.recycleStory);
        sbLIZ.append(", releaseStory=");
        sbLIZ.append(this.releaseStory);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PlayerSessionThreadPriorityConfig() {
    }

    public PlayerSessionThreadPriorityConfig(int i, int i2, int i3, int i4) {
        this.preprepareStory = i;
        this.prepareStory = i2;
        this.recycleStory = i3;
        this.releaseStory = i4;
    }
}
