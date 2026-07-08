package com.ss.android.ugc.airemix.model.mob.datasource;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixAwemeEntranceInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixAwemeEntranceInfo extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIRemixAwemeEntranceInfo> CREATOR = new Parcelable.Creator<AIRemixAwemeEntranceInfo>() { // from class: X.0Lfy
        @Override // android.os.Parcelable.Creator
        public final AIRemixAwemeEntranceInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new AIRemixAwemeEntranceInfo(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixAwemeEntranceInfo[] newArray(int i) {
            return new AIRemixAwemeEntranceInfo[i];
        }
    };

    @InterfaceC553020LmW
    @C09CT("airemix_first_gid")
    public final String airemixFirstGid;

    @InterfaceC553020LmW
    @C09CT("airemix_follow_gid")
    public final String airemixFollowGid;

    @InterfaceC553020LmW
    @C09CT("airemix_gameplay")
    public final String airemixGameplay;

    @InterfaceC553020LmW
    @C09CT("first_enter_remix_lui")
    public final Boolean firstEnterRemixLui;

    @C040H
    public final String name;

    public AIRemixAwemeEntranceInfo() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixAwemeEntranceInfo)) {
            return false;
        }
        AIRemixAwemeEntranceInfo aIRemixAwemeEntranceInfo = (AIRemixAwemeEntranceInfo) obj;
        return Intrinsics.LJFF(this.firstEnterRemixLui, aIRemixAwemeEntranceInfo.firstEnterRemixLui) && Intrinsics.LJFF(this.airemixFollowGid, aIRemixAwemeEntranceInfo.airemixFollowGid) && Intrinsics.LJFF(this.airemixFirstGid, aIRemixAwemeEntranceInfo.airemixFirstGid) && Intrinsics.LJFF(this.airemixGameplay, aIRemixAwemeEntranceInfo.airemixGameplay);
    }

    public final int hashCode() {
        Boolean bool = this.firstEnterRemixLui;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.airemixFollowGid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.airemixFirstGid;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.airemixGameplay;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixAwemeEntranceInfo(firstEnterRemixLui=");
        sbLIZ.append(this.firstEnterRemixLui);
        sbLIZ.append(", airemixFollowGid=");
        sbLIZ.append(this.airemixFollowGid);
        sbLIZ.append(", airemixFirstGid=");
        sbLIZ.append(this.airemixFirstGid);
        sbLIZ.append(", airemixGameplay=");
        sbLIZ.append(this.airemixGameplay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.firstEnterRemixLui;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.airemixFollowGid);
        parcel.writeString(this.airemixFirstGid);
        parcel.writeString(this.airemixGameplay);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public static AIRemixAwemeEntranceInfo LIZ(AIRemixAwemeEntranceInfo aIRemixAwemeEntranceInfo, Boolean bool) {
        String str = aIRemixAwemeEntranceInfo.airemixFollowGid;
        String str2 = aIRemixAwemeEntranceInfo.airemixFirstGid;
        String str3 = aIRemixAwemeEntranceInfo.airemixGameplay;
        aIRemixAwemeEntranceInfo.getClass();
        return new AIRemixAwemeEntranceInfo(bool, str, str2, str3);
    }

    public AIRemixAwemeEntranceInfo(Boolean bool, String str, String str2, String str3) {
        this.firstEnterRemixLui = bool;
        this.airemixFollowGid = str;
        this.airemixFirstGid = str2;
        this.airemixGameplay = str3;
        this.name = "AIRemixAwemeEntranceInfo";
    }
}
