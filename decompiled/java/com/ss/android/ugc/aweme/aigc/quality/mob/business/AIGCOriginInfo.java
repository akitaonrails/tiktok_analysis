package com.ss.android.ugc.aweme.aigc.quality.mob.business;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.EnumC549040Lg6;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCOriginInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCOriginInfo extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIGCOriginInfo> CREATOR = new Parcelable.Creator<AIGCOriginInfo>() { // from class: X.0Lg5
        @Override // android.os.Parcelable.Creator
        public final AIGCOriginInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf2;
            EnumC549040Lg6 enumC549040Lg6ValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z2 = true;
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
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                enumC549040Lg6ValueOf = null;
            } else {
                enumC549040Lg6ValueOf = EnumC549040Lg6.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new AIGCOriginInfo(string, string2, numValueOf, string3, string4, string5, boolValueOf, numValueOf2, enumC549040Lg6ValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCOriginInfo[] newArray(int i) {
            return new AIGCOriginInfo[i];
        }
    };

    @C040H
    public final String name;

    @InterfaceC553020LmW
    @C09CT("origin_actors_cnt")
    public final Integer originActorsCnt;

    @InterfaceC553020LmW
    @C09CT("origin_actors_list")
    public final String originActorsList;

    @InterfaceC553020LmW
    @C09CT("origin_actors_select_list")
    public final String originActorsSelectList;

    @InterfaceC553020LmW
    @C09CT("origin_actors_ship_list")
    public final String originActorsShipList;

    @InterfaceC553020LmW
    @C09CT("origin_cameo_id_list")
    public final String originCameoIdList;

    @InterfaceC553020LmW
    @C09CT("origin_is_ref_image")
    public final Boolean originIsReferImage;

    @InterfaceC553020LmW
    @C09CT("origin_prompt_length")
    public final Integer originPromptLength;

    @InterfaceC553020LmW
    @C09CT("origin_prompt_source")
    public final EnumC549040Lg6 originPromptSource;

    @InterfaceC553020LmW
    @C09CT("origin_self_cast")
    public final Boolean originSelfCast;

    @InterfaceC553020LmW
    @C09CT("origin_server_task_id")
    public final String originServerTaskId;

    public AIGCOriginInfo() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCOriginInfo)) {
            return false;
        }
        AIGCOriginInfo aIGCOriginInfo = (AIGCOriginInfo) obj;
        return Intrinsics.LJFF(this.originServerTaskId, aIGCOriginInfo.originServerTaskId) && Intrinsics.LJFF(this.originActorsList, aIGCOriginInfo.originActorsList) && Intrinsics.LJFF(this.originActorsCnt, aIGCOriginInfo.originActorsCnt) && Intrinsics.LJFF(this.originActorsShipList, aIGCOriginInfo.originActorsShipList) && Intrinsics.LJFF(this.originActorsSelectList, aIGCOriginInfo.originActorsSelectList) && Intrinsics.LJFF(this.originCameoIdList, aIGCOriginInfo.originCameoIdList) && Intrinsics.LJFF(this.originSelfCast, aIGCOriginInfo.originSelfCast) && Intrinsics.LJFF(this.originPromptLength, aIGCOriginInfo.originPromptLength) && this.originPromptSource == aIGCOriginInfo.originPromptSource && Intrinsics.LJFF(this.originIsReferImage, aIGCOriginInfo.originIsReferImage);
    }

    public final int hashCode() {
        String str = this.originServerTaskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originActorsList;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.originActorsCnt;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.originActorsShipList;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originActorsSelectList;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.originCameoIdList;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.originSelfCast;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.originPromptLength;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        EnumC549040Lg6 enumC549040Lg6 = this.originPromptSource;
        int iHashCode9 = (iHashCode8 + (enumC549040Lg6 == null ? 0 : enumC549040Lg6.hashCode())) * 31;
        Boolean bool2 = this.originIsReferImage;
        return iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCOriginInfo(originServerTaskId=");
        sbLIZ.append(this.originServerTaskId);
        sbLIZ.append(", originActorsList=");
        sbLIZ.append(this.originActorsList);
        sbLIZ.append(", originActorsCnt=");
        sbLIZ.append(this.originActorsCnt);
        sbLIZ.append(", originActorsShipList=");
        sbLIZ.append(this.originActorsShipList);
        sbLIZ.append(", originActorsSelectList=");
        sbLIZ.append(this.originActorsSelectList);
        sbLIZ.append(", originCameoIdList=");
        sbLIZ.append(this.originCameoIdList);
        sbLIZ.append(", originSelfCast=");
        sbLIZ.append(this.originSelfCast);
        sbLIZ.append(", originPromptLength=");
        sbLIZ.append(this.originPromptLength);
        sbLIZ.append(", originPromptSource=");
        sbLIZ.append(this.originPromptSource);
        sbLIZ.append(", originIsReferImage=");
        sbLIZ.append(this.originIsReferImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.originServerTaskId);
        parcel.writeString(this.originActorsList);
        Integer num = this.originActorsCnt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.originActorsShipList);
        parcel.writeString(this.originActorsSelectList);
        parcel.writeString(this.originCameoIdList);
        Boolean bool = this.originSelfCast;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.originPromptLength;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        EnumC549040Lg6 enumC549040Lg6 = this.originPromptSource;
        if (enumC549040Lg6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC549040Lg6.name());
        }
        Boolean bool2 = this.originIsReferImage;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public AIGCOriginInfo(String str, String str2, Integer num, String str3, String str4, String str5, Boolean bool, Integer num2, EnumC549040Lg6 enumC549040Lg6, Boolean bool2) {
        this.originServerTaskId = str;
        this.originActorsList = str2;
        this.originActorsCnt = num;
        this.originActorsShipList = str3;
        this.originActorsSelectList = str4;
        this.originCameoIdList = str5;
        this.originSelfCast = bool;
        this.originPromptLength = num2;
        this.originPromptSource = enumC549040Lg6;
        this.originIsReferImage = bool2;
        this.name = "AIGCOriginInfo";
    }
}
