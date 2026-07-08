package com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic;

import X.C09CT;
import X.C2188811AlT;
import X.C354300Dum;

/* JADX INFO: loaded from: classes6.dex */
public final class BeatInfo {

    @C09CT("beat_source")
    public int beatSource;

    @C09CT("energy")
    public final float energy;
    public boolean markedForRemoval;

    @C09CT("time")
    public final int timestampInMS;

    @C09CT("value")
    public final int value;
    public static final C354300Dum Companion = new Object() { // from class: X.0Dum
    };
    public static final int $stable = 8;

    public BeatInfo() {
        this(0, 0, 0.0f, 2);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeatInfo(timestampInMS=");
        sbLIZ.append(this.timestampInMS);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", energy=");
        sbLIZ.append(this.energy);
        sbLIZ.append(", beatSource=");
        sbLIZ.append(this.beatSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return this.timestampInMS;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BeatInfo) && this.timestampInMS == ((BeatInfo) obj).timestampInMS) {
            return true;
        }
        return false;
    }

    public final void setBeatSource(int i) {
        this.beatSource = i;
    }

    public final void setMarkedForRemoval(boolean z) {
        this.markedForRemoval = z;
    }

    public BeatInfo(int i, int i2, float f, int i3) {
        this.timestampInMS = i;
        this.value = i2;
        this.energy = f;
        this.beatSource = i3;
    }
}
