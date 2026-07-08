package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C123100dR;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RootData implements Parcelable {
    public String authorId;
    public boolean isNewUser;
    public String roomId;
    public int templateEntryType;
    public String userId;
    public static final Parcelable.Creator<RootData> CREATOR = new Parcelable.Creator<RootData>() { // from class: X.0v5x
        @Override // android.os.Parcelable.Creator
        public final RootData createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new RootData(parcel.readInt(), string, string2, parcel.readString(), z);
        }

        @Override // android.os.Parcelable.Creator
        public final RootData[] newArray(int i) {
            return new RootData[i];
        }
    };
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    public RootData() {
        String str = null;
        this(str, str, false, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RootData)) {
            return false;
        }
        RootData rootData = (RootData) obj;
        return Intrinsics.LJFF(this.authorId, rootData.authorId) && Intrinsics.LJFF(this.roomId, rootData.roomId) && this.isNewUser == rootData.isNewUser && Intrinsics.LJFF(this.userId, rootData.userId) && this.templateEntryType == rootData.templateEntryType;
    }

    public final int hashCode() {
        return (((((((this.authorId.hashCode() * 31) + this.roomId.hashCode()) * 31) + C786410Ut5.Z2(this.isNewUser)) * 31) + this.userId.hashCode()) * 31) + this.templateEntryType;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RootData(authorId=");
        sbLIZ.append(this.authorId);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", isNewUser=");
        sbLIZ.append(this.isNewUser);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", templateEntryType=");
        sbLIZ.append(this.templateEntryType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.authorId);
        parcel.writeString(this.roomId);
        parcel.writeInt(this.isNewUser ? 1 : 0);
        parcel.writeString(this.userId);
        parcel.writeInt(this.templateEntryType);
    }

    public final boolean LIZIZ() {
        return C123100dR.LIZ(this.roomId) && !Intrinsics.LJFF(this.roomId, CardStruct.IStatusCode.DEFAULT);
    }

    public final boolean LIZJ() {
        return C123100dR.LIZ(this.authorId) && C123100dR.LIZ(this.userId) && Intrinsics.LJFF(this.authorId, this.userId);
    }

    public final String LIZ() {
        if (LIZJ()) {
            return null;
        }
        return this.userId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RootData(String str, String str2, boolean z, int i) {
        boolean z2 = z;
        String str3 = str2;
        this(0, (i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str3, (i & 8) == 0 ? null : "", (i & 4) != 0 ? true : z2);
    }

    public RootData(int i, String str, String str2, String str3, boolean z) {
        this.authorId = str;
        this.roomId = str2;
        this.isNewUser = z;
        this.userId = str3;
        this.templateEntryType = i;
    }
}
