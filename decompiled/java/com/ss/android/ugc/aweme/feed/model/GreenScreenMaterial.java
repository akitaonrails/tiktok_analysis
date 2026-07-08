package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GreenScreenMaterial implements Parcelable, Serializable {

    @C09CT("author_name")
    public String authorName;

    @C09CT("end_time")
    public long endTime;
    public String localPath;
    public String mediasource;

    @C09CT("resource_id")
    public String resId;

    @C09CT("start_time")
    public long startTime;

    @C09CT("effect_id")
    public String stickerId;

    @C09CT("type")
    public int type;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<GreenScreenMaterial> CREATOR = new Creator();
    public static final String[] MEDIA_TYPE_STRING = {"all", "photo", "video"};

    public static final class Creator implements Parcelable.Creator<GreenScreenMaterial> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GreenScreenMaterial createFromParcel(Parcel parcel) {
            return new GreenScreenMaterial(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GreenScreenMaterial[] newArray(int i) {
            return new GreenScreenMaterial[i];
        }
    }

    public final GreenScreenMaterial copy(int i, long j, long j2, String str, String str2, String str3, String str4, String str5) {
        return new GreenScreenMaterial(i, j, j2, str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GreenScreenMaterial)) {
            return false;
        }
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) obj;
        return this.type == greenScreenMaterial.type && this.startTime == greenScreenMaterial.startTime && this.endTime == greenScreenMaterial.endTime && Intrinsics.LJFF(this.resId, greenScreenMaterial.resId) && Intrinsics.LJFF(this.authorName, greenScreenMaterial.authorName) && Intrinsics.LJFF(this.stickerId, greenScreenMaterial.stickerId) && Intrinsics.LJFF(this.localPath, greenScreenMaterial.localPath) && Intrinsics.LJFF(this.mediasource, greenScreenMaterial.mediasource);
    }

    public int hashCode() {
        return (((((((((((((this.type * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime)) * 31) + this.resId.hashCode()) * 31) + this.authorName.hashCode()) * 31) + this.stickerId.hashCode()) * 31) + this.localPath.hashCode()) * 31) + this.mediasource.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GreenScreenMaterial(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", resId=");
        sbLIZ.append(this.resId);
        sbLIZ.append(", authorName=");
        sbLIZ.append(this.authorName);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.stickerId);
        sbLIZ.append(", localPath=");
        sbLIZ.append(this.localPath);
        sbLIZ.append(", mediasource=");
        sbLIZ.append(this.mediasource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeString(this.resId);
        parcel.writeString(this.authorName);
        parcel.writeString(this.stickerId);
        parcel.writeString(this.localPath);
        parcel.writeString(this.mediasource);
    }

    public GreenScreenMaterial() {
        this(1, 0L, 0L, "", "", "", "", "");
    }

    public static final class Companion {
        public final String[] getMEDIA_TYPE_STRING() {
            return GreenScreenMaterial.MEDIA_TYPE_STRING;
        }
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getMediasource() {
        return this.mediasource;
    }

    public final String getResId() {
        return this.resId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setLocalPath(String str) {
        this.localPath = str;
    }

    public final void setMediasource(String str) {
        this.mediasource = str;
    }

    public final void setResId(String str) {
        this.resId = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public GreenScreenMaterial(int i, long j, long j2, String str, String str2, String str3, String str4, String str5) {
        this.type = i;
        this.startTime = j;
        this.endTime = j2;
        this.resId = str;
        this.authorName = str2;
        this.stickerId = str3;
        this.localPath = str4;
        this.mediasource = str5;
    }
}
