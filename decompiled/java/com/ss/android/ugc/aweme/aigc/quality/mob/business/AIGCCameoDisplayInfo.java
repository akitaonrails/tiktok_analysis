package com.ss.android.ugc.aweme.aigc.quality.mob.business;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CT;
import X.C0LRE;
import X.C2188811AlT;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCameoDisplayInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCCameoDisplayInfo extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIGCCameoDisplayInfo> CREATOR = new Parcelable.Creator<AIGCCameoDisplayInfo>() { // from class: X.0LbI
        @Override // android.os.Parcelable.Creator
        public final AIGCCameoDisplayInfo createFromParcel(Parcel parcel) {
            return new AIGCCameoDisplayInfo(parcel.readString(), parcel.readString(), C0LRE.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCCameoDisplayInfo[] newArray(int i) {
            return new AIGCCameoDisplayInfo[i];
        }
    };

    @InterfaceC553020LmW
    @C09CT("actor_user_id")
    public final String actorUserId;

    @InterfaceC553020LmW
    @C09CT("location_area")
    public final C0LRE locationArea;

    @InterfaceC553020LmW
    @C09CT("location_num")
    public final int locationNum;

    @C040H
    public final String name;

    @InterfaceC553020LmW
    @C09CT("relationship")
    public final String relationship;

    public AIGCCameoDisplayInfo() {
        this(null, null, C0LRE.UPON_INPUT, 1);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCCameoDisplayInfo)) {
            return false;
        }
        AIGCCameoDisplayInfo aIGCCameoDisplayInfo = (AIGCCameoDisplayInfo) obj;
        return Intrinsics.LJFF(this.actorUserId, aIGCCameoDisplayInfo.actorUserId) && Intrinsics.LJFF(this.relationship, aIGCCameoDisplayInfo.relationship) && this.locationArea == aIGCCameoDisplayInfo.locationArea && this.locationNum == aIGCCameoDisplayInfo.locationNum;
    }

    public final int hashCode() {
        String str = this.actorUserId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.relationship;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.locationArea.hashCode()) * 31) + this.locationNum;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCCameoDisplayInfo(actorUserId=");
        sbLIZ.append(this.actorUserId);
        sbLIZ.append(", relationship=");
        sbLIZ.append(this.relationship);
        sbLIZ.append(", locationArea=");
        sbLIZ.append(this.locationArea);
        sbLIZ.append(", locationNum=");
        sbLIZ.append(this.locationNum);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.actorUserId);
        parcel.writeString(this.relationship);
        parcel.writeString(this.locationArea.name());
        parcel.writeInt(this.locationNum);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public AIGCCameoDisplayInfo(String str, String str2, C0LRE c0lre, int i) {
        this.actorUserId = str;
        this.relationship = str2;
        this.locationArea = c0lre;
        this.locationNum = i;
        this.name = "CameoDisplayInfo";
    }
}
