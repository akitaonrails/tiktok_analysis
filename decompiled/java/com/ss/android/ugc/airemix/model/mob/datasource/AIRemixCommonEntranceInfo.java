package com.ss.android.ugc.airemix.model.mob.datasource;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCommonEntranceInfo;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixCommonEntranceInfo extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIRemixCommonEntranceInfo> CREATOR = new Parcelable.Creator<AIRemixCommonEntranceInfo>() { // from class: X.0LgB
        @Override // android.os.Parcelable.Creator
        public final AIRemixCommonEntranceInfo createFromParcel(Parcel parcel) {
            return new AIRemixCommonEntranceInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixCommonEntranceInfo[] newArray(int i) {
            return new AIRemixCommonEntranceInfo[i];
        }
    };

    @InterfaceC553020LmW
    @C09CT("enter_way")
    public String EnterWay;

    @InterfaceC553020LmW
    @C09CT("conversation_id")
    public String conversationId;

    @InterfaceC553020LmW
    @C09CT("creation_id")
    public String creationId;

    @C040H
    public final String name;

    @InterfaceC553020LmW
    @C09CT("recall_way")
    public final String recallWay;

    @InterfaceC553020LmW
    @C09CT("referpage_name")
    public final String refPageName;

    @InterfaceC553020LmW
    @C09CT("aicreation_scene_name")
    public final String sceneName;

    public AIRemixCommonEntranceInfo() {
        this(null, null, UUID.randomUUID().toString(), null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixCommonEntranceInfo)) {
            return false;
        }
        AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo = (AIRemixCommonEntranceInfo) obj;
        return Intrinsics.LJFF(this.EnterWay, aIRemixCommonEntranceInfo.EnterWay) && Intrinsics.LJFF(this.sceneName, aIRemixCommonEntranceInfo.sceneName) && Intrinsics.LJFF(this.creationId, aIRemixCommonEntranceInfo.creationId) && Intrinsics.LJFF(this.conversationId, aIRemixCommonEntranceInfo.conversationId) && Intrinsics.LJFF(this.refPageName, aIRemixCommonEntranceInfo.refPageName) && Intrinsics.LJFF(this.recallWay, aIRemixCommonEntranceInfo.recallWay);
    }

    public final int hashCode() {
        String str = this.EnterWay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sceneName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creationId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.conversationId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.refPageName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.recallWay;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixCommonEntranceInfo(EnterWay=");
        sbLIZ.append(this.EnterWay);
        sbLIZ.append(", sceneName=");
        sbLIZ.append(this.sceneName);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", refPageName=");
        sbLIZ.append(this.refPageName);
        sbLIZ.append(", recallWay=");
        sbLIZ.append(this.recallWay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.EnterWay);
        parcel.writeString(this.sceneName);
        parcel.writeString(this.creationId);
        parcel.writeString(this.conversationId);
        parcel.writeString(this.refPageName);
        parcel.writeString(this.recallWay);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public AIRemixCommonEntranceInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.EnterWay = str;
        this.sceneName = str2;
        this.creationId = str3;
        this.conversationId = str4;
        this.refPageName = str5;
        this.recallWay = str6;
        this.name = "AIRemixCommonEntranceInfo";
    }
}
