package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicBeat implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicBeat> CREATOR = new Creator();

    @C09CT("man_made_beats")
    public final String manMadeBeats;

    @C09CT("max_video_num")
    public final Integer maxVideoNum;

    @C09CT("min_video_num")
    public final Integer minVideoNum;

    @C09CT("onset_cnn")
    public final String onset_cnn;

    @C09CT("type")
    public final Integer type;

    public static final class Creator implements Parcelable.Creator<MusicBeat> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MusicBeat createFromParcel(Parcel parcel) {
            return new MusicBeat(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MusicBeat[] newArray(int i) {
            return new MusicBeat[i];
        }
    }

    public final MusicBeat copy(Integer num, Integer num2, String str, Integer num3, String str2) {
        return new MusicBeat(num, num2, str, num3, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicBeat)) {
            return false;
        }
        MusicBeat musicBeat = (MusicBeat) obj;
        return Intrinsics.LJFF(this.minVideoNum, musicBeat.minVideoNum) && Intrinsics.LJFF(this.maxVideoNum, musicBeat.maxVideoNum) && Intrinsics.LJFF(this.manMadeBeats, musicBeat.manMadeBeats) && Intrinsics.LJFF(this.type, musicBeat.type) && Intrinsics.LJFF(this.onset_cnn, musicBeat.onset_cnn);
    }

    public int hashCode() {
        Integer num = this.minVideoNum;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxVideoNum;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.manMadeBeats;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.type;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.onset_cnn;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicBeat(minVideoNum=");
        sbLIZ.append(this.minVideoNum);
        sbLIZ.append(", maxVideoNum=");
        sbLIZ.append(this.maxVideoNum);
        sbLIZ.append(", manMadeBeats=");
        sbLIZ.append(this.manMadeBeats);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", onset_cnn=");
        sbLIZ.append(this.onset_cnn);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.minVideoNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.maxVideoNum;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.manMadeBeats);
        Integer num3 = this.type;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.onset_cnn);
    }

    public final String getManMadeBeats() {
        return this.manMadeBeats;
    }

    public final Integer getMaxVideoNum() {
        return this.maxVideoNum;
    }

    public final Integer getMinVideoNum() {
        return this.minVideoNum;
    }

    public final String getOnset_cnn() {
        return this.onset_cnn;
    }

    public final Integer getType() {
        return this.type;
    }

    public MusicBeat(Integer num, Integer num2, String str, Integer num3, String str2) {
        this.minVideoNum = num;
        this.maxVideoNum = num2;
        this.manMadeBeats = str;
        this.type = num3;
        this.onset_cnn = str2;
    }
}
