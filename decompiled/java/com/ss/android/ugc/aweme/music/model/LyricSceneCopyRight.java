package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class LyricSceneCopyRight implements Serializable, Parcelable {
    public static final Parcelable.Creator<LyricSceneCopyRight> CREATOR = new Creator();

    @C09CT("lyric_sticker")
    public final boolean lyricSticker;

    public static final class Creator implements Parcelable.Creator<LyricSceneCopyRight> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LyricSceneCopyRight createFromParcel(Parcel parcel) {
            return new LyricSceneCopyRight(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LyricSceneCopyRight[] newArray(int i) {
            return new LyricSceneCopyRight[i];
        }
    }

    public LyricSceneCopyRight() {
        this(false);
    }

    public final LyricSceneCopyRight copy(boolean z) {
        return new LyricSceneCopyRight(z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LyricSceneCopyRight) && this.lyricSticker == ((LyricSceneCopyRight) obj).lyricSticker;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.lyricSticker);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricSceneCopyRight(lyricSticker=");
        sbLIZ.append(this.lyricSticker);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.lyricSticker ? 1 : 0);
    }

    public final boolean getLyricSticker() {
        return this.lyricSticker;
    }

    public LyricSceneCopyRight(boolean z) {
        this.lyricSticker = z;
    }
}
