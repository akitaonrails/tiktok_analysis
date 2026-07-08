package com.ss.android.ugc.aweme.creative.model.music;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzCompatModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicBuzCompatModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicBuzCompatModel> CREATOR = new Parcelable.Creator<MusicBuzCompatModel>() { // from class: X.0nhc
        @Override // android.os.Parcelable.Creator
        public final MusicBuzCompatModel createFromParcel(Parcel parcel) {
            return new MusicBuzCompatModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicBuzCompatModel[] newArray(int i) {
            return new MusicBuzCompatModel[i];
        }
    };

    @C040H
    public String cloudUnderstandingKey;

    @C040H
    public String musicRootPageFrom;

    public MusicBuzCompatModel() {
        this(null, null);
    }

    public final MusicBuzCompatModel copy(String str, String str2) {
        return new MusicBuzCompatModel(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicBuzCompatModel)) {
            return false;
        }
        MusicBuzCompatModel musicBuzCompatModel = (MusicBuzCompatModel) obj;
        return Intrinsics.LJFF(this.musicRootPageFrom, musicBuzCompatModel.musicRootPageFrom) && Intrinsics.LJFF(this.cloudUnderstandingKey, musicBuzCompatModel.cloudUnderstandingKey);
    }

    public int hashCode() {
        String str = this.musicRootPageFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cloudUnderstandingKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicBuzCompatModel(musicRootPageFrom=");
        sbLIZ.append(this.musicRootPageFrom);
        sbLIZ.append(", cloudUnderstandingKey=");
        sbLIZ.append(this.cloudUnderstandingKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.musicRootPageFrom);
        parcel.writeString(this.cloudUnderstandingKey);
    }

    public final String getCloudUnderstandingKey() {
        return this.cloudUnderstandingKey;
    }

    public final String getMusicRootPageFrom() {
        return this.musicRootPageFrom;
    }

    public final void setCloudUnderstandingKey(String str) {
        this.cloudUnderstandingKey = str;
    }

    public final void setMusicRootPageFrom(String str) {
        this.musicRootPageFrom = str;
    }

    public MusicBuzCompatModel(String str, String str2) {
        this.musicRootPageFrom = str;
        this.cloudUnderstandingKey = str2;
    }
}
