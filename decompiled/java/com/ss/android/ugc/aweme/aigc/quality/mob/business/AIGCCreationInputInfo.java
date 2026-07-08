package com.ss.android.ugc.aweme.aigc.quality.mob.business;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CT;
import X.C786410Ut5;
import X.EnumC549040Lg6;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationInputInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCCreationInputInfo extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIGCCreationInputInfo> CREATOR = new Parcelable.Creator<AIGCCreationInputInfo>() { // from class: X.0Lg2
        @Override // android.os.Parcelable.Creator
        public final AIGCCreationInputInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            EnumC549040Lg6 enumC549040Lg6ValueOf;
            Integer numValueOf;
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i2 = parcel.readInt();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                enumC549040Lg6ValueOf = null;
            } else {
                enumC549040Lg6ValueOf = EnumC549040Lg6.valueOf(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf = Boolean.valueOf(z3);
            }
            return new AIGCCreationInputInfo(z, string, string2, i, string3, string4, string5, string6, z2, i2, enumC549040Lg6ValueOf, numValueOf, boolValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCCreationInputInfo[] newArray(int i) {
            return new AIGCCreationInputInfo[i];
        }
    };

    @InterfaceC553020LmW
    @C09CT("cameo_id_list")
    public final String actorsCameoIdList;

    @InterfaceC553020LmW
    @C09CT("actors_cnt")
    public final int actorsCnt;

    @InterfaceC553020LmW
    @C09CT("actors_cameo_filter")
    public final String actorsFilterList;

    @InterfaceC553020LmW
    @C09CT("actors_select_list")
    public final String actorsSelectList;

    @InterfaceC553020LmW
    @C09CT("actors_ship_list")
    public final String actorsShipList;

    @InterfaceC553020LmW
    @C09CT("actors_list")
    public final String actorsUidList;

    @C040H
    public final boolean canClick;

    @C09CT("cast_face_tps")
    public final String castFaceTps;

    @InterfaceC553020LmW
    @C09CT("is_ref_image")
    public final Boolean isRefImage;

    @C09CT("last_face_id_act_chnl")
    public final String lastFaceIdActChnl;

    @C09CT("last_face_id_act_func")
    public final String lastFaceIdActFunc;

    @C040H
    public final String name;

    @InterfaceC553020LmW
    @C09CT("prompt_length")
    public final int promptLength;

    @InterfaceC553020LmW
    @C09CT("prompt_source")
    public final EnumC549040Lg6 promptSource;

    @InterfaceC553020LmW
    @C09CT("replace_actors_cnt")
    public final Integer replaceActorsCnt;

    @InterfaceC553020LmW
    @C09CT("self_cast")
    public final boolean selfCast;

    public AIGCCreationInputInfo() {
        this(false, null, null, 0, null, null, null, null, false, 0, null, 0, Boolean.FALSE, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCCreationInputInfo)) {
            return false;
        }
        AIGCCreationInputInfo aIGCCreationInputInfo = (AIGCCreationInputInfo) obj;
        return this.canClick == aIGCCreationInputInfo.canClick && Intrinsics.LJFF(this.actorsCameoIdList, aIGCCreationInputInfo.actorsCameoIdList) && Intrinsics.LJFF(this.actorsUidList, aIGCCreationInputInfo.actorsUidList) && this.actorsCnt == aIGCCreationInputInfo.actorsCnt && Intrinsics.LJFF(this.actorsShipList, aIGCCreationInputInfo.actorsShipList) && Intrinsics.LJFF(this.actorsFilterList, aIGCCreationInputInfo.actorsFilterList) && Intrinsics.LJFF(this.lastFaceIdActFunc, aIGCCreationInputInfo.lastFaceIdActFunc) && Intrinsics.LJFF(this.lastFaceIdActChnl, aIGCCreationInputInfo.lastFaceIdActChnl) && this.selfCast == aIGCCreationInputInfo.selfCast && this.promptLength == aIGCCreationInputInfo.promptLength && this.promptSource == aIGCCreationInputInfo.promptSource && Intrinsics.LJFF(this.replaceActorsCnt, aIGCCreationInputInfo.replaceActorsCnt) && Intrinsics.LJFF(this.isRefImage, aIGCCreationInputInfo.isRefImage) && Intrinsics.LJFF(this.actorsSelectList, aIGCCreationInputInfo.actorsSelectList) && Intrinsics.LJFF(this.castFaceTps, aIGCCreationInputInfo.castFaceTps);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.canClick) * 31;
        String str = this.actorsCameoIdList;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actorsUidList;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.actorsCnt) * 31;
        String str3 = this.actorsShipList;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actorsFilterList;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastFaceIdActFunc;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastFaceIdActChnl;
        int iHashCode6 = (((((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.selfCast)) * 31) + this.promptLength) * 31;
        EnumC549040Lg6 enumC549040Lg6 = this.promptSource;
        int iHashCode7 = (iHashCode6 + (enumC549040Lg6 == null ? 0 : enumC549040Lg6.hashCode())) * 31;
        Integer num = this.replaceActorsCnt;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isRefImage;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.actorsSelectList;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.castFaceTps;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "AIGCCreationInputInfo(canClick=" + this.canClick + ", actorsCameoIdList=" + this.actorsCameoIdList + ", actorsUidList=" + this.actorsUidList + ", actorsCnt=" + this.actorsCnt + ", actorsShipList=" + this.actorsShipList + ", actorsFilterList=" + this.actorsFilterList + ", lastFaceIdActFunc=" + this.lastFaceIdActFunc + ", lastFaceIdActChnl=" + this.lastFaceIdActChnl + ", selfCast=" + this.selfCast + ", promptLength=" + this.promptLength + ", promptSource=" + this.promptSource + ", replaceActorsCnt=" + this.replaceActorsCnt + ", isRefImage=" + this.isRefImage + ", actorsSelectList=" + this.actorsSelectList + ", castFaceTps=" + this.castFaceTps + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canClick ? 1 : 0);
        parcel.writeString(this.actorsCameoIdList);
        parcel.writeString(this.actorsUidList);
        parcel.writeInt(this.actorsCnt);
        parcel.writeString(this.actorsShipList);
        parcel.writeString(this.actorsFilterList);
        parcel.writeString(this.lastFaceIdActFunc);
        parcel.writeString(this.lastFaceIdActChnl);
        parcel.writeInt(this.selfCast ? 1 : 0);
        parcel.writeInt(this.promptLength);
        EnumC549040Lg6 enumC549040Lg6 = this.promptSource;
        if (enumC549040Lg6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC549040Lg6.name());
        }
        Integer num = this.replaceActorsCnt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isRefImage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.actorsSelectList);
        parcel.writeString(this.castFaceTps);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public AIGCCreationInputInfo(boolean z, String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z2, int i2, EnumC549040Lg6 enumC549040Lg6, Integer num, Boolean bool, String str7, String str8) {
        this.canClick = z;
        this.actorsCameoIdList = str;
        this.actorsUidList = str2;
        this.actorsCnt = i;
        this.actorsShipList = str3;
        this.actorsFilterList = str4;
        this.lastFaceIdActFunc = str5;
        this.lastFaceIdActChnl = str6;
        this.selfCast = z2;
        this.promptLength = i2;
        this.promptSource = enumC549040Lg6;
        this.replaceActorsCnt = num;
        this.isRefImage = bool;
        this.actorsSelectList = str7;
        this.castFaceTps = str8;
        this.name = "AIGCCreationInputInfo";
    }
}
