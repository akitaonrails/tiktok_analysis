package com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public final class SpeedSegment {
    public static final int $stable = 8;
    public float from;
    public float speed;
    public float to;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeedSegment)) {
            return false;
        }
        SpeedSegment speedSegment = (SpeedSegment) obj;
        return Float.compare(this.from, speedSegment.from) == 0 && Float.compare(this.to, speedSegment.to) == 0 && Float.compare(this.speed, speedSegment.speed) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeedSegment(from=");
        sbLIZ.append(this.from);
        sbLIZ.append(", to=");
        sbLIZ.append(this.to);
        sbLIZ.append(", speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.from) * 31) + Float.floatToIntBits(this.to)) * 31) + Float.floatToIntBits(this.speed);
    }

    public final void setFrom(float f) {
        this.from = f;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setTo(float f) {
        this.to = f;
    }

    public SpeedSegment(float f, float f2, float f3) {
        this.from = f;
        this.to = f2;
        this.speed = f3;
    }
}
