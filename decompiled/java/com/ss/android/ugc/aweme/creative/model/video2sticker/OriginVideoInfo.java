package com.ss.android.ugc.aweme.creative.model.video2sticker;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class OriginVideoInfo implements Parcelable {
    public static final Parcelable.Creator<OriginVideoInfo> CREATOR = new Parcelable.Creator<OriginVideoInfo>() { // from class: X.0nXa
        @Override // android.os.Parcelable.Creator
        public final OriginVideoInfo createFromParcel(Parcel parcel) {
            return new OriginVideoInfo(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OriginVideoInfo[] newArray(int i) {
            return new OriginVideoInfo[i];
        }
    };

    @C040H
    public String awemeId;

    @C040H
    public long coverTsp;

    @C040H
    public long duration;

    @InterfaceC2270908v5
    @C040H
    public String filePath;

    @C09CT("height")
    public int height;

    @C040H
    public String secUserId;

    @C040H
    public String userId;

    @C040H
    public int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginVideoInfo)) {
            return false;
        }
        OriginVideoInfo originVideoInfo = (OriginVideoInfo) obj;
        return Intrinsics.LJFF(this.filePath, originVideoInfo.filePath) && this.width == originVideoInfo.width && this.duration == originVideoInfo.duration && this.height == originVideoInfo.height && Intrinsics.LJFF(this.awemeId, originVideoInfo.awemeId) && Intrinsics.LJFF(this.userId, originVideoInfo.userId) && this.coverTsp == originVideoInfo.coverTsp && Intrinsics.LJFF(this.secUserId, originVideoInfo.secUserId);
    }

    public final int hashCode() {
        return (((((((((((((this.filePath.hashCode() * 31) + this.width) * 31) + C786410Ut5.Y2(this.duration)) * 31) + this.height) * 31) + this.awemeId.hashCode()) * 31) + this.userId.hashCode()) * 31) + C786410Ut5.Y2(this.coverTsp)) * 31) + this.secUserId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OriginVideoInfo(filePath=");
        sbLIZ.append(this.filePath);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", coverTsp=");
        sbLIZ.append(this.coverTsp);
        sbLIZ.append(", secUserId=");
        sbLIZ.append(this.secUserId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filePath);
        parcel.writeInt(this.width);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.height);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.userId);
        parcel.writeLong(this.coverTsp);
        parcel.writeString(this.secUserId);
    }

    public OriginVideoInfo() {
        this("", 0, 0L, 0, "", "", 0L, "");
    }

    public OriginVideoInfo(String str, int i, long j, int i2, String str2, String str3, long j2, String str4) {
        this.filePath = str;
        this.width = i;
        this.duration = j;
        this.height = i2;
        this.awemeId = str2;
        this.userId = str3;
        this.coverTsp = j2;
        this.secUserId = str4;
    }
}
