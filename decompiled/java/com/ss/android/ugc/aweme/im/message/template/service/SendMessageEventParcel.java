package com.ss.android.ugc.aweme.im.message.template.service;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SendMessageEventParcel implements Parcelable {
    public static final Parcelable.Creator<SendMessageEventParcel> CREATOR = new Parcelable.Creator<SendMessageEventParcel>() { // from class: X.0Yce
        @Override // android.os.Parcelable.Creator
        public final SendMessageEventParcel createFromParcel(Parcel parcel) {
            return new SendMessageEventParcel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SendMessageEventParcel[] newArray(int i) {
            return new SendMessageEventParcel[i];
        }
    };
    public final String authorFollowStatus;
    public final String enterFrom;
    public String enterMethod;
    public final String mobExtraStr;
    public final String panelSource;
    public final String resourceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMessageEventParcel)) {
            return false;
        }
        SendMessageEventParcel sendMessageEventParcel = (SendMessageEventParcel) obj;
        return Intrinsics.LJFF(this.enterFrom, sendMessageEventParcel.enterFrom) && Intrinsics.LJFF(this.resourceId, sendMessageEventParcel.resourceId) && Intrinsics.LJFF(this.panelSource, sendMessageEventParcel.panelSource) && Intrinsics.LJFF(this.enterMethod, sendMessageEventParcel.enterMethod) && Intrinsics.LJFF(this.authorFollowStatus, sendMessageEventParcel.authorFollowStatus) && Intrinsics.LJFF(this.mobExtraStr, sendMessageEventParcel.mobExtraStr);
    }

    public final int hashCode() {
        int iHashCode = this.enterFrom.hashCode() * 31;
        String str = this.resourceId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.panelSource;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterMethod;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.authorFollowStatus;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mobExtraStr;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessageEventParcel(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", panelSource=");
        sbLIZ.append(this.panelSource);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", authorFollowStatus=");
        sbLIZ.append(this.authorFollowStatus);
        sbLIZ.append(", mobExtraStr=");
        sbLIZ.append(this.mobExtraStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.resourceId);
        parcel.writeString(this.panelSource);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.authorFollowStatus);
        parcel.writeString(this.mobExtraStr);
    }

    public SendMessageEventParcel(String str, String str2, String str3, String str4, String str5, String str6) {
        this.enterFrom = str;
        this.resourceId = str2;
        this.panelSource = str3;
        this.enterMethod = str4;
        this.authorFollowStatus = str5;
        this.mobExtraStr = str6;
    }

    public /* synthetic */ SendMessageEventParcel(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
    }
}
