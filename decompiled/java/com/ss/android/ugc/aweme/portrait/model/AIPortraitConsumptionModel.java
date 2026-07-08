package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import X.C548920Lfu;
import X.C549070Lg9;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitAnchorInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitConsumptionModel implements Parcelable {

    @C09CT("actors_ship_list")
    public final String actorsShipList;

    @C09CT("ai_portrait_anchor_info")
    public final AIPortraitAnchorInfo anchorInfo;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("follow_status")
    public final Integer followStatus;

    @C09CT("gen_type")
    public final int genType;

    @C09CT("is_ref_image")
    public final Boolean isRefImage;

    @C09CT("origin_prompt_source")
    public final String originPromptSource;

    @C09CT("prompt")
    public final String prompt;

    @C09CT("remix_video_id")
    public final String remixVideoId;

    @C09CT("server_task_id")
    public final String serverTaskId;
    public static final C549070Lg9 Companion = new Object() { // from class: X.0Lg9
    };
    public static final Parcelable.Creator<AIPortraitConsumptionModel> CREATOR = new Parcelable.Creator<AIPortraitConsumptionModel>() { // from class: X.0Lg8
        @Override // android.os.Parcelable.Creator
        public final AIPortraitConsumptionModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AIPortraitAnchorInfo aIPortraitAnchorInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
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
            String string6 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                aIPortraitAnchorInfoCreateFromParcel = AIPortraitAnchorInfo.CREATOR.createFromParcel(parcel);
            }
            return new AIPortraitConsumptionModel(string, string2, string3, numValueOf, string4, string5, boolValueOf, string6, i, aIPortraitAnchorInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitConsumptionModel[] newArray(int i) {
            return new AIPortraitConsumptionModel[i];
        }
    };

    public AIPortraitConsumptionModel() {
        this(null, null, null, null, null, null, null, null, 0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitConsumptionModel)) {
            return false;
        }
        AIPortraitConsumptionModel aIPortraitConsumptionModel = (AIPortraitConsumptionModel) obj;
        return Intrinsics.LJFF(this.serverTaskId, aIPortraitConsumptionModel.serverTaskId) && Intrinsics.LJFF(this.remixVideoId, aIPortraitConsumptionModel.remixVideoId) && Intrinsics.LJFF(this.authorId, aIPortraitConsumptionModel.authorId) && Intrinsics.LJFF(this.followStatus, aIPortraitConsumptionModel.followStatus) && Intrinsics.LJFF(this.prompt, aIPortraitConsumptionModel.prompt) && Intrinsics.LJFF(this.actorsShipList, aIPortraitConsumptionModel.actorsShipList) && Intrinsics.LJFF(this.isRefImage, aIPortraitConsumptionModel.isRefImage) && Intrinsics.LJFF(this.originPromptSource, aIPortraitConsumptionModel.originPromptSource) && this.genType == aIPortraitConsumptionModel.genType && Intrinsics.LJFF(this.anchorInfo, aIPortraitConsumptionModel.anchorInfo);
    }

    public final int hashCode() {
        String str = this.serverTaskId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.remixVideoId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authorId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.followStatus;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.prompt;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actorsShipList;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isRefImage;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.originPromptSource;
        int iHashCode8 = (((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.genType) * 31;
        AIPortraitAnchorInfo aIPortraitAnchorInfo = this.anchorInfo;
        return iHashCode8 + (aIPortraitAnchorInfo != null ? aIPortraitAnchorInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitConsumptionModel(serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(", remixVideoId=");
        sbLIZ.append(this.remixVideoId);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.authorId);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.followStatus);
        sbLIZ.append(", prompt=");
        sbLIZ.append(this.prompt);
        sbLIZ.append(", actorsShipList=");
        sbLIZ.append(this.actorsShipList);
        sbLIZ.append(", isRefImage=");
        sbLIZ.append(this.isRefImage);
        sbLIZ.append(", originPromptSource=");
        sbLIZ.append(this.originPromptSource);
        sbLIZ.append(", genType=");
        sbLIZ.append(this.genType);
        sbLIZ.append(", anchorInfo=");
        sbLIZ.append(this.anchorInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.serverTaskId);
        parcel.writeString(this.remixVideoId);
        parcel.writeString(this.authorId);
        Integer num = this.followStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.prompt);
        parcel.writeString(this.actorsShipList);
        Boolean bool = this.isRefImage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.originPromptSource);
        parcel.writeInt(this.genType);
        AIPortraitAnchorInfo aIPortraitAnchorInfo = this.anchorInfo;
        if (aIPortraitAnchorInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIPortraitAnchorInfo.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Lg9] */
    static {
        C548920Lfu.LIZ(AIPortraitConsumptionModel.class, AFwS239S0000000_8.get$arr$(54));
    }

    public AIPortraitConsumptionModel(String str, String str2, String str3, Integer num, String str4, String str5, Boolean bool, String str6, int i, AIPortraitAnchorInfo aIPortraitAnchorInfo) {
        this.serverTaskId = str;
        this.remixVideoId = str2;
        this.authorId = str3;
        this.followStatus = num;
        this.prompt = str4;
        this.actorsShipList = str5;
        this.isRefImage = bool;
        this.originPromptSource = str6;
        this.genType = i;
        this.anchorInfo = aIPortraitAnchorInfo;
    }
}
