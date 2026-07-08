package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class RecordPresetResourceState implements C004I {
    public static final int $stable = 8;
    public final AVMusic avMusic;
    public final String musicFile;

    public RecordPresetResourceState() {
        this(null, null);
    }

    public final RecordPresetResourceState copy(AVMusic aVMusic, String str) {
        return new RecordPresetResourceState(aVMusic, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordPresetResourceState)) {
            return false;
        }
        RecordPresetResourceState recordPresetResourceState = (RecordPresetResourceState) obj;
        return Intrinsics.LJFF(this.avMusic, recordPresetResourceState.avMusic) && Intrinsics.LJFF(this.musicFile, recordPresetResourceState.musicFile);
    }

    public int hashCode() {
        AVMusic aVMusic = this.avMusic;
        int iHashCode = (aVMusic == null ? 0 : aVMusic.hashCode()) * 31;
        String str = this.musicFile;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordPresetResourceState(avMusic=");
        sbLIZ.append(this.avMusic);
        sbLIZ.append(", musicFile=");
        sbLIZ.append(this.musicFile);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AVMusic getAvMusic() {
        return this.avMusic;
    }

    public final String getMusicFile() {
        return this.musicFile;
    }

    public RecordPresetResourceState(AVMusic aVMusic, String str) {
        this.avMusic = aVMusic;
        this.musicFile = str;
    }
}
