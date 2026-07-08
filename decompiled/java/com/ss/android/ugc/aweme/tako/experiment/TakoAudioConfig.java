package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class TakoAudioConfig {

    @C09CT("ducking")
    public final TakoAudioDuckingConfig ducking;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoAudioConfig) && Intrinsics.LJFF(this.ducking, ((TakoAudioConfig) obj).ducking);
    }

    public final int hashCode() {
        return this.ducking.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAudioConfig(ducking=");
        sbLIZ.append(this.ducking);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoAudioConfig() {
        this(new TakoAudioDuckingConfig(-20.0d, -30.0d, 1.0d, 0.001d, 1.0d, 0.01d, 1.0d, false));
    }

    public TakoAudioConfig(TakoAudioDuckingConfig takoAudioDuckingConfig) {
        this.ducking = takoAudioDuckingConfig;
    }
}
