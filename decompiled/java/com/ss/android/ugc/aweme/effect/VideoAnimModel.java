package com.ss.android.ugc.aweme.effect;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effect.VideoAnimModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoAnimModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<VideoAnimModel> CREATOR = new Parcelable.Creator<VideoAnimModel>() { // from class: X.0mt0
        @Override // android.os.Parcelable.Creator
        public final VideoAnimModel createFromParcel(Parcel parcel) {
            return new VideoAnimModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoAnimModel[] newArray(int i) {
            return new VideoAnimModel[i];
        }
    };

    @C09CT("animType")
    public final String animType;

    @C09CT("effectid")
    public final String effectId;

    @C09CT("endTIme")
    public final String endTIme;

    @C09CT("entrance")
    public final String entrance;

    @C09CT("position")
    public final String index;

    @C09CT("name")
    public final String name;

    @C09CT("startTime")
    public final String startTime;

    public VideoAnimModel() {
        this(null, null, null, null, null, "", "");
    }

    public final VideoAnimModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new VideoAnimModel(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAnimModel)) {
            return false;
        }
        VideoAnimModel videoAnimModel = (VideoAnimModel) obj;
        return Intrinsics.LJFF(this.name, videoAnimModel.name) && Intrinsics.LJFF(this.effectId, videoAnimModel.effectId) && Intrinsics.LJFF(this.animType, videoAnimModel.animType) && Intrinsics.LJFF(this.index, videoAnimModel.index) && Intrinsics.LJFF(this.entrance, videoAnimModel.entrance) && Intrinsics.LJFF(this.startTime, videoAnimModel.startTime) && Intrinsics.LJFF(this.endTIme, videoAnimModel.endTIme);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.effectId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.animType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.index;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.entrance;
        return ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.startTime.hashCode()) * 31) + this.endTIme.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoAnimModel(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", animType=");
        sbLIZ.append(this.animType);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", entrance=");
        sbLIZ.append(this.entrance);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTIme=");
        sbLIZ.append(this.endTIme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.effectId);
        parcel.writeString(this.animType);
        parcel.writeString(this.index);
        parcel.writeString(this.entrance);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTIme);
    }

    public final String getAnimType() {
        return this.animType;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEndTIme() {
        return this.endTIme;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final String getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public VideoAnimModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.name = str;
        this.effectId = str2;
        this.animType = str3;
        this.index = str4;
        this.entrance = str5;
        this.startTime = str6;
        this.endTIme = str7;
    }
}
