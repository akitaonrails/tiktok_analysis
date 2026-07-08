package com.ss.android.ugc.airemix.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.AIRemixExtraModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixExtraModel implements Parcelable {
    public static final Parcelable.Creator<AIRemixExtraModel> CREATOR = new Parcelable.Creator<AIRemixExtraModel>() { // from class: X.0LeP
        @Override // android.os.Parcelable.Creator
        public final AIRemixExtraModel createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            AIGCSocialModel aIGCSocialModel = (AIGCSocialModel) parcel.readParcelable(AIRemixExtraModel.class.getClassLoader());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AIRemixExtraModel(aIGCSocialModel, z, z2, string, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixExtraModel[] newArray(int i) {
            return new AIRemixExtraModel[i];
        }
    };

    @C040H
    public boolean hasSetRecallWay;

    @C040H
    public boolean noBackToDraftBox;

    @C09CT("origin_creative_id")
    public String originCreativeId;

    @C09CT("origin_creative_version")
    public Integer originCreativeVersion;

    @C09CT("social_params")
    public AIGCSocialModel socialParams;

    public AIRemixExtraModel() {
        this(null, false, false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixExtraModel)) {
            return false;
        }
        AIRemixExtraModel aIRemixExtraModel = (AIRemixExtraModel) obj;
        return Intrinsics.LJFF(this.socialParams, aIRemixExtraModel.socialParams) && this.noBackToDraftBox == aIRemixExtraModel.noBackToDraftBox && this.hasSetRecallWay == aIRemixExtraModel.hasSetRecallWay && Intrinsics.LJFF(this.originCreativeId, aIRemixExtraModel.originCreativeId) && Intrinsics.LJFF(this.originCreativeVersion, aIRemixExtraModel.originCreativeVersion);
    }

    public final int hashCode() {
        AIGCSocialModel aIGCSocialModel = this.socialParams;
        int iHashCode = (((((aIGCSocialModel == null ? 0 : aIGCSocialModel.hashCode()) * 31) + C786410Ut5.Z2(this.noBackToDraftBox)) * 31) + C786410Ut5.Z2(this.hasSetRecallWay)) * 31;
        String str = this.originCreativeId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.originCreativeVersion;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixExtraModel(socialParams=");
        sbLIZ.append(this.socialParams);
        sbLIZ.append(", noBackToDraftBox=");
        sbLIZ.append(this.noBackToDraftBox);
        sbLIZ.append(", hasSetRecallWay=");
        sbLIZ.append(this.hasSetRecallWay);
        sbLIZ.append(", originCreativeId=");
        sbLIZ.append(this.originCreativeId);
        sbLIZ.append(", originCreativeVersion=");
        sbLIZ.append(this.originCreativeVersion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeParcelable(this.socialParams, i);
        parcel.writeInt(this.noBackToDraftBox ? 1 : 0);
        parcel.writeInt(this.hasSetRecallWay ? 1 : 0);
        parcel.writeString(this.originCreativeId);
        Integer num = this.originCreativeVersion;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public AIRemixExtraModel(AIGCSocialModel aIGCSocialModel, boolean z, boolean z2, String str, Integer num) {
        this.socialParams = aIGCSocialModel;
        this.noBackToDraftBox = z;
        this.hasSetRecallWay = z2;
        this.originCreativeId = str;
        this.originCreativeVersion = num;
    }
}
