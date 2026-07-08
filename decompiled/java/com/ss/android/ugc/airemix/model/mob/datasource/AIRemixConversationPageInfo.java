package com.ss.android.ugc.airemix.model.mob.datasource;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixConversationPageInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixConversationPageInfo extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIRemixConversationPageInfo> CREATOR = new Parcelable.Creator<AIRemixConversationPageInfo>() { // from class: X.0Lfz
        @Override // android.os.Parcelable.Creator
        public final AIRemixConversationPageInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new AIRemixConversationPageInfo(string, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixConversationPageInfo[] newArray(int i) {
            return new AIRemixConversationPageInfo[i];
        }
    };

    @C040H
    public final String name;

    @InterfaceC553020LmW
    @C09CT("page_title")
    public final String pageTitle;

    @InterfaceC553020LmW
    @C09CT("airemix_quota_total")
    public final Integer quotaTotal;

    @InterfaceC553020LmW
    @C09CT("airemix_quota_used")
    public final Integer quotaUsed;

    public AIRemixConversationPageInfo() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixConversationPageInfo)) {
            return false;
        }
        AIRemixConversationPageInfo aIRemixConversationPageInfo = (AIRemixConversationPageInfo) obj;
        return Intrinsics.LJFF(this.pageTitle, aIRemixConversationPageInfo.pageTitle) && Intrinsics.LJFF(this.quotaUsed, aIRemixConversationPageInfo.quotaUsed) && Intrinsics.LJFF(this.quotaTotal, aIRemixConversationPageInfo.quotaTotal);
    }

    public final int hashCode() {
        String str = this.pageTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.quotaUsed;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.quotaTotal;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixConversationPageInfo(pageTitle=");
        sbLIZ.append(this.pageTitle);
        sbLIZ.append(", quotaUsed=");
        sbLIZ.append(this.quotaUsed);
        sbLIZ.append(", quotaTotal=");
        sbLIZ.append(this.quotaTotal);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pageTitle);
        Integer num = this.quotaUsed;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.quotaTotal;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public AIRemixConversationPageInfo(String str, Integer num, Integer num2) {
        this.pageTitle = str;
        this.quotaUsed = num;
        this.quotaTotal = num2;
        this.name = "AIRemixConversationPageInfo";
    }
}
