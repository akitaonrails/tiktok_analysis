package com.ss.android.ugc.aweme.im.b2c.replies.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyPanelConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class IMQuickReplyPanelConfig implements Parcelable {
    public final String enterFrom;
    public final String enterMethod;
    public final String quickReplyBtnClickTime;
    public String toUserId;
    public final String uid;
    public static final Parcelable.Creator<IMQuickReplyPanelConfig> CREATOR = new Parcelable.Creator<IMQuickReplyPanelConfig>() { // from class: X.0wWw
        @Override // android.os.Parcelable.Creator
        public final IMQuickReplyPanelConfig createFromParcel(Parcel parcel) {
            return new IMQuickReplyPanelConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IMQuickReplyPanelConfig[] newArray(int i) {
            return new IMQuickReplyPanelConfig[i];
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
        if (!(obj instanceof IMQuickReplyPanelConfig)) {
            return false;
        }
        IMQuickReplyPanelConfig iMQuickReplyPanelConfig = (IMQuickReplyPanelConfig) obj;
        return Intrinsics.LJFF(this.uid, iMQuickReplyPanelConfig.uid) && Intrinsics.LJFF(this.toUserId, iMQuickReplyPanelConfig.toUserId) && Intrinsics.LJFF(this.enterFrom, iMQuickReplyPanelConfig.enterFrom) && Intrinsics.LJFF(this.enterMethod, iMQuickReplyPanelConfig.enterMethod) && Intrinsics.LJFF(this.quickReplyBtnClickTime, iMQuickReplyPanelConfig.quickReplyBtnClickTime);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.uid.hashCode() * 31) + this.toUserId.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.enterMethod.hashCode()) * 31;
        String str = this.quickReplyBtnClickTime;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMQuickReplyPanelConfig(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(this.toUserId);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", quickReplyBtnClickTime=");
        sbLIZ.append(this.quickReplyBtnClickTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.toUserId);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.quickReplyBtnClickTime);
    }

    public IMQuickReplyPanelConfig(String str, String str2, String str3, String str4, String str5) {
        this.uid = str;
        this.toUserId = str2;
        this.enterFrom = str3;
        this.enterMethod = str4;
        this.quickReplyBtnClickTime = str5;
    }
}
