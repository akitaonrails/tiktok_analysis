package com.ss.android.ugc.aweme.theater.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterExtraModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterExtraModel implements Parcelable {
    public static final Parcelable.Creator<AITheaterExtraModel> CREATOR = new Parcelable.Creator<AITheaterExtraModel>() { // from class: X.0LeQ
        @Override // android.os.Parcelable.Creator
        public final AITheaterExtraModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Integer numValueOf;
            boolean z3;
            AIGCSocialModel aIGCSocialModel = (AIGCSocialModel) parcel.readParcelable(AITheaterExtraModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new AITheaterExtraModel(aIGCSocialModel, z, z2, string, numValueOf, string2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final AITheaterExtraModel[] newArray(int i) {
            return new AITheaterExtraModel[i];
        }
    };

    @C040H
    public String aigcEditSource;

    @C040H
    public boolean aigcFirstEdit;

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

    public AITheaterExtraModel() {
        this(null, false, false, null, null, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterExtraModel)) {
            return false;
        }
        AITheaterExtraModel aITheaterExtraModel = (AITheaterExtraModel) obj;
        return Intrinsics.LJFF(this.socialParams, aITheaterExtraModel.socialParams) && this.noBackToDraftBox == aITheaterExtraModel.noBackToDraftBox && this.hasSetRecallWay == aITheaterExtraModel.hasSetRecallWay && Intrinsics.LJFF(this.originCreativeId, aITheaterExtraModel.originCreativeId) && Intrinsics.LJFF(this.originCreativeVersion, aITheaterExtraModel.originCreativeVersion) && Intrinsics.LJFF(this.aigcEditSource, aITheaterExtraModel.aigcEditSource) && this.aigcFirstEdit == aITheaterExtraModel.aigcFirstEdit;
    }

    public final int hashCode() {
        AIGCSocialModel aIGCSocialModel = this.socialParams;
        int iHashCode = (((((aIGCSocialModel == null ? 0 : aIGCSocialModel.hashCode()) * 31) + C786410Ut5.Z2(this.noBackToDraftBox)) * 31) + C786410Ut5.Z2(this.hasSetRecallWay)) * 31;
        String str = this.originCreativeId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.originCreativeVersion;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.aigcEditSource;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.aigcFirstEdit);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterExtraModel(socialParams=");
        sbLIZ.append(this.socialParams);
        sbLIZ.append(", noBackToDraftBox=");
        sbLIZ.append(this.noBackToDraftBox);
        sbLIZ.append(", hasSetRecallWay=");
        sbLIZ.append(this.hasSetRecallWay);
        sbLIZ.append(", originCreativeId=");
        sbLIZ.append(this.originCreativeId);
        sbLIZ.append(", originCreativeVersion=");
        sbLIZ.append(this.originCreativeVersion);
        sbLIZ.append(", aigcEditSource=");
        sbLIZ.append(this.aigcEditSource);
        sbLIZ.append(", aigcFirstEdit=");
        sbLIZ.append(this.aigcFirstEdit);
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
        parcel.writeString(this.aigcEditSource);
        parcel.writeInt(this.aigcFirstEdit ? 1 : 0);
    }

    public AITheaterExtraModel(AIGCSocialModel aIGCSocialModel, boolean z, boolean z2, String str, Integer num, String str2, boolean z3) {
        this.socialParams = aIGCSocialModel;
        this.noBackToDraftBox = z;
        this.hasSetRecallWay = z2;
        this.originCreativeId = str;
        this.originCreativeVersion = num;
        this.aigcEditSource = str2;
        this.aigcFirstEdit = z3;
    }
}
