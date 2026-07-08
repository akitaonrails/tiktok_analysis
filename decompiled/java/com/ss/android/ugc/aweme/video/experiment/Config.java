package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes19.dex */
public final class Config {

    @C09CT("delay_ms")
    public final int delay;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("release_player")
    public final boolean releasePlayer;

    public Config() {
        this(false, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return this.enable == config.enable && this.delay == config.delay && this.releasePlayer == config.releasePlayer;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enable) * 31) + this.delay) * 31) + C786410Ut5.Z2(this.releasePlayer);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", delay=");
        sbLIZ.append(this.delay);
        sbLIZ.append(", releasePlayer=");
        sbLIZ.append(this.releasePlayer);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Config(boolean z, int i, boolean z2) {
        this.enable = z;
        this.delay = i;
        this.releasePlayer = z2;
    }
}
