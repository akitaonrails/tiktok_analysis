package com.ss.android.ugc.aweme.creative.model.music;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.MusicCompatModel;
import com.ss.android.ugc.aweme.music.model.LyricSceneCopyRight;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MusicCompatModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicCompatModel> CREATOR = new Parcelable.Creator<MusicCompatModel>() { // from class: X.0wUi
        @Override // android.os.Parcelable.Creator
        public final MusicCompatModel createFromParcel(Parcel parcel) {
            return new MusicCompatModel((LyricSceneCopyRight) parcel.readParcelable(MusicCompatModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MusicCompatModel[] newArray(int i) {
            return new MusicCompatModel[i];
        }
    };

    @C09CT("lyric_scene_copyright")
    public final LyricSceneCopyRight lyricSceneCopyRight;

    public MusicCompatModel() {
        this(null);
    }

    public final MusicCompatModel copy(LyricSceneCopyRight lyricSceneCopyRight) {
        return new MusicCompatModel(lyricSceneCopyRight);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MusicCompatModel) && Intrinsics.LJFF(this.lyricSceneCopyRight, ((MusicCompatModel) obj).lyricSceneCopyRight);
    }

    public int hashCode() {
        LyricSceneCopyRight lyricSceneCopyRight = this.lyricSceneCopyRight;
        if (lyricSceneCopyRight == null) {
            return 0;
        }
        return lyricSceneCopyRight.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicCompatModel(lyricSceneCopyRight=");
        sbLIZ.append(this.lyricSceneCopyRight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.lyricSceneCopyRight, i);
    }

    public final LyricSceneCopyRight getLyricSceneCopyRight() {
        return this.lyricSceneCopyRight;
    }

    public MusicCompatModel(LyricSceneCopyRight lyricSceneCopyRight) {
        this.lyricSceneCopyRight = lyricSceneCopyRight;
    }
}
