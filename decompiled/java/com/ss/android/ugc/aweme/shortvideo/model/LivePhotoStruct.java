package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LivePhotoStruct implements Parcelable {
    public static final Parcelable.Creator<LivePhotoStruct> CREATOR = new Creator();

    @C09CT("duration")
    public final Float duration;

    @C09CT("live_photo_type")
    public final Integer livePhotoType;

    @C09CT("video_id")
    public final String livePhotoVid;

    @C09CT("original")
    public final int original;

    public static final class Creator implements Parcelable.Creator<LivePhotoStruct> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivePhotoStruct createFromParcel(Parcel parcel) {
            return new LivePhotoStruct(parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivePhotoStruct[] newArray(int i) {
            return new LivePhotoStruct[i];
        }
    }

    public final LivePhotoStruct copy(String str, Float f, int i, Integer num) {
        return new LivePhotoStruct(str, f, i, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePhotoStruct)) {
            return false;
        }
        LivePhotoStruct livePhotoStruct = (LivePhotoStruct) obj;
        return Intrinsics.LJFF(this.livePhotoVid, livePhotoStruct.livePhotoVid) && Intrinsics.LJFF(this.duration, livePhotoStruct.duration) && this.original == livePhotoStruct.original && Intrinsics.LJFF(this.livePhotoType, livePhotoStruct.livePhotoType);
    }

    public int hashCode() {
        String str = this.livePhotoVid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.duration;
        int iHashCode2 = (((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + this.original) * 31;
        Integer num = this.livePhotoType;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePhotoStruct(livePhotoVid=");
        sbLIZ.append(this.livePhotoVid);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", original=");
        sbLIZ.append(this.original);
        sbLIZ.append(", livePhotoType=");
        sbLIZ.append(this.livePhotoType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.livePhotoVid);
        Float f = this.duration;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeInt(this.original);
        Integer num = this.livePhotoType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public final Float getDuration() {
        return this.duration;
    }

    public final Integer getLivePhotoType() {
        return this.livePhotoType;
    }

    public final String getLivePhotoVid() {
        return this.livePhotoVid;
    }

    public final int getOriginal() {
        return this.original;
    }

    public LivePhotoStruct(String str, Float f, int i, Integer num) {
        this.livePhotoVid = str;
        this.duration = f;
        this.original = i;
        this.livePhotoType = num;
    }
}
