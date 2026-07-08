package com.ss.android.ugc.aweme.im.b2c.replies.data;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class IMQuickReplyManagePageConfig implements Parcelable {
    public final String enterFrom;
    public final String enterMethod;

    @C09CT("fetch_Latest_data")
    public final boolean fetchLatestData;
    public final boolean openAddPanel;
    public final String toUserId;
    public final String uid;
    public static final Parcelable.Creator<IMQuickReplyManagePageConfig> CREATOR = new Parcelable.Creator<IMQuickReplyManagePageConfig>() { // from class: X.0iCY
        @Override // android.os.Parcelable.Creator
        public final IMQuickReplyManagePageConfig createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new IMQuickReplyManagePageConfig(string, string2, string3, string4, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final IMQuickReplyManagePageConfig[] newArray(int i) {
            return new IMQuickReplyManagePageConfig[i];
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
        if (!(obj instanceof IMQuickReplyManagePageConfig)) {
            return false;
        }
        IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig = (IMQuickReplyManagePageConfig) obj;
        return Intrinsics.LJFF(this.uid, iMQuickReplyManagePageConfig.uid) && Intrinsics.LJFF(this.toUserId, iMQuickReplyManagePageConfig.toUserId) && Intrinsics.LJFF(this.enterFrom, iMQuickReplyManagePageConfig.enterFrom) && Intrinsics.LJFF(this.enterMethod, iMQuickReplyManagePageConfig.enterMethod) && this.openAddPanel == iMQuickReplyManagePageConfig.openAddPanel && this.fetchLatestData == iMQuickReplyManagePageConfig.fetchLatestData;
    }

    public final int hashCode() {
        return (((((((((this.uid.hashCode() * 31) + this.toUserId.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + C786410Ut5.Z2(this.openAddPanel)) * 31) + C786410Ut5.Z2(this.fetchLatestData);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMQuickReplyManagePageConfig(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", toUserId=");
        sbLIZ.append(this.toUserId);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", openAddPanel=");
        sbLIZ.append(this.openAddPanel);
        sbLIZ.append(", fetchLatestData=");
        sbLIZ.append(this.fetchLatestData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.toUserId);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeInt(this.openAddPanel ? 1 : 0);
        parcel.writeInt(this.fetchLatestData ? 1 : 0);
    }

    public IMQuickReplyManagePageConfig() {
        this("", "", "", "", false, false);
    }

    public IMQuickReplyManagePageConfig(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.uid = str;
        this.toUserId = str2;
        this.enterFrom = str3;
        this.enterMethod = str4;
        this.openAddPanel = z;
        this.fetchLatestData = z2;
    }
}
