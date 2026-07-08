package com.ss.android.ugc.aweme.shortvideo.pugc;

import X.C123100dR;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PUgcSlotData implements Parcelable {
    public Bitmap cover;
    public final float extraDuration;
    public Pair<String, Long> fd;
    public int fl2vTextFlag;
    public String freezeBindOriginUUID;
    public String freezeOriginPath;
    public boolean isAISlot;
    public boolean isFixed;
    public final boolean isRecInRec;
    public final boolean isVideoType;
    public String magicOriginPath;
    public String reverseOriginPath;
    public final long slotStartTime;
    public final float startTime;
    public final String uuid;
    public final String videoPath;
    public static final Parcelable.Creator<PUgcSlotData> CREATOR = new Parcelable.Creator<PUgcSlotData>() { // from class: X.0EVN
        @Override // android.os.Parcelable.Creator
        public final PUgcSlotData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String string = parcel.readString();
            String string2 = parcel.readString();
            float f = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            long j = parcel.readLong();
            float f2 = parcel.readFloat();
            Bitmap bitmap = (Bitmap) parcel.readParcelable(PUgcSlotData.class.getClassLoader());
            String string3 = parcel.readString();
            Pair pair = (Pair) parcel.readSerializable();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new PUgcSlotData(string, string2, f, z, z2, z3, j, f2, bitmap, string3, pair, string4, string5, string6, z4, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PUgcSlotData[] newArray(int i) {
            return new PUgcSlotData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PUgcSlotData)) {
            return false;
        }
        PUgcSlotData pUgcSlotData = (PUgcSlotData) obj;
        return Intrinsics.LJFF(this.uuid, pUgcSlotData.uuid) && Intrinsics.LJFF(this.videoPath, pUgcSlotData.videoPath) && Float.compare(this.extraDuration, pUgcSlotData.extraDuration) == 0 && this.isVideoType == pUgcSlotData.isVideoType && this.isRecInRec == pUgcSlotData.isRecInRec && this.isFixed == pUgcSlotData.isFixed && this.slotStartTime == pUgcSlotData.slotStartTime && Float.compare(this.startTime, pUgcSlotData.startTime) == 0 && Intrinsics.LJFF(this.cover, pUgcSlotData.cover) && Intrinsics.LJFF(this.freezeBindOriginUUID, pUgcSlotData.freezeBindOriginUUID) && Intrinsics.LJFF(this.fd, pUgcSlotData.fd) && Intrinsics.LJFF(this.magicOriginPath, pUgcSlotData.magicOriginPath) && Intrinsics.LJFF(this.freezeOriginPath, pUgcSlotData.freezeOriginPath) && Intrinsics.LJFF(this.reverseOriginPath, pUgcSlotData.reverseOriginPath) && this.isAISlot == pUgcSlotData.isAISlot && this.fl2vTextFlag == pUgcSlotData.fl2vTextFlag;
    }

    public final String toString() {
        return "PUgcSlotData(uuid=" + this.uuid + ", videoPath=" + this.videoPath + ", extraDuration=" + this.extraDuration + ", isVideoType=" + this.isVideoType + ", isRecInRec=" + this.isRecInRec + ", isFixed=" + this.isFixed + ", slotStartTime=" + this.slotStartTime + ", startTime=" + this.startTime + ", cover=" + this.cover + ", freezeBindOriginUUID=" + this.freezeBindOriginUUID + ", fd=" + this.fd + ", magicOriginPath=" + this.magicOriginPath + ", freezeOriginPath=" + this.freezeOriginPath + ", reverseOriginPath=" + this.reverseOriginPath + ", isAISlot=" + this.isAISlot + ", fl2vTextFlag=" + this.fl2vTextFlag + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uuid);
        parcel.writeString(this.videoPath);
        parcel.writeFloat(this.extraDuration);
        parcel.writeInt(this.isVideoType ? 1 : 0);
        parcel.writeInt(this.isRecInRec ? 1 : 0);
        parcel.writeInt(this.isFixed ? 1 : 0);
        parcel.writeLong(this.slotStartTime);
        parcel.writeFloat(this.startTime);
        parcel.writeParcelable(this.cover, i);
        parcel.writeString(this.freezeBindOriginUUID);
        parcel.writeSerializable(this.fd);
        parcel.writeString(this.magicOriginPath);
        parcel.writeString(this.freezeOriginPath);
        parcel.writeString(this.reverseOriginPath);
        parcel.writeInt(this.isAISlot ? 1 : 0);
        parcel.writeInt(this.fl2vTextFlag);
    }

    public final boolean LIZ() {
        return C123100dR.LIZ(this.freezeBindOriginUUID);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.uuid.hashCode() * 31) + this.videoPath.hashCode()) * 31) + Float.floatToIntBits(this.extraDuration)) * 31) + C786410Ut5.Z2(this.isVideoType)) * 31) + C786410Ut5.Z2(this.isRecInRec)) * 31) + C786410Ut5.Z2(this.isFixed)) * 31) + C786410Ut5.Y2(this.slotStartTime)) * 31) + Float.floatToIntBits(this.startTime)) * 31;
        Bitmap bitmap = this.cover;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        String str = this.freezeBindOriginUUID;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Pair<String, Long> pair = this.fd;
        int iHashCode4 = (iHashCode3 + (pair == null ? 0 : pair.hashCode())) * 31;
        String str2 = this.magicOriginPath;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.freezeOriginPath;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reverseOriginPath;
        return ((((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isAISlot)) * 31) + this.fl2vTextFlag;
    }

    public PUgcSlotData(String str, String str2, float f, boolean z, boolean z2, boolean z3, long j, float f2, Bitmap bitmap, String str3, Pair<String, Long> pair, String str4, String str5, String str6, boolean z4, int i) {
        this.uuid = str;
        this.videoPath = str2;
        this.extraDuration = f;
        this.isVideoType = z;
        this.isRecInRec = z2;
        this.isFixed = z3;
        this.slotStartTime = j;
        this.startTime = f2;
        this.cover = bitmap;
        this.freezeBindOriginUUID = str3;
        this.fd = pair;
        this.magicOriginPath = str4;
        this.freezeOriginPath = str5;
        this.reverseOriginPath = str6;
        this.isAISlot = z4;
        this.fl2vTextFlag = i;
    }
}
