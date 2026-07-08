package com.ss.bytertc.engine.avclient;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes10.dex */
public final class LyraxAVAudioSource {
    public LyraxAVAudioMixType mixType;
    public LyraxAVAudioSourceType sourceType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyraxAVAudioSource)) {
            return false;
        }
        LyraxAVAudioSource lyraxAVAudioSource = (LyraxAVAudioSource) obj;
        return this.sourceType == lyraxAVAudioSource.sourceType && this.mixType == lyraxAVAudioSource.mixType;
    }

    public int hashCode() {
        return (this.sourceType.hashCode() * 31) + this.mixType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAVAudioSource(sourceType=");
        sbLIZ.append(this.sourceType);
        sbLIZ.append(", mixType=");
        sbLIZ.append(this.mixType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxAVAudioSource() {
        this(LyraxAVAudioSourceType.PCM, LyraxAVAudioMixType.PlayOnly);
    }

    public final void setMixType(LyraxAVAudioMixType lyraxAVAudioMixType) {
        this.mixType = lyraxAVAudioMixType;
    }

    public final void setSourceType(LyraxAVAudioSourceType lyraxAVAudioSourceType) {
        this.sourceType = lyraxAVAudioSourceType;
    }

    public LyraxAVAudioSource(LyraxAVAudioSourceType lyraxAVAudioSourceType, LyraxAVAudioMixType lyraxAVAudioMixType) {
        this.sourceType = lyraxAVAudioSourceType;
        this.mixType = lyraxAVAudioMixType;
    }
}
