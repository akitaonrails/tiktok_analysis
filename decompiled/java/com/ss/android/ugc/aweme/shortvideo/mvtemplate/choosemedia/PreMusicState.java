package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PreMusicState implements C004I {
    public static final int $stable = 8;
    public final String preMusicFile;
    public final MusicModel preMusicModel;

    public PreMusicState() {
        this(null, null);
    }

    public final PreMusicState copy(MusicModel musicModel, String str) {
        return new PreMusicState(musicModel, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreMusicState)) {
            return false;
        }
        PreMusicState preMusicState = (PreMusicState) obj;
        return Intrinsics.LJFF(this.preMusicModel, preMusicState.preMusicModel) && Intrinsics.LJFF(this.preMusicFile, preMusicState.preMusicFile);
    }

    public int hashCode() {
        MusicModel musicModel = this.preMusicModel;
        int iHashCode = (musicModel == null ? 0 : musicModel.hashCode()) * 31;
        String str = this.preMusicFile;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreMusicState(preMusicModel=");
        sbLIZ.append(this.preMusicModel);
        sbLIZ.append(", preMusicFile=");
        sbLIZ.append(this.preMusicFile);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getPreMusicFile() {
        return this.preMusicFile;
    }

    public final MusicModel getPreMusicModel() {
        return this.preMusicModel;
    }

    public PreMusicState(MusicModel musicModel, String str) {
        this.preMusicModel = musicModel;
        this.preMusicFile = str;
    }
}
