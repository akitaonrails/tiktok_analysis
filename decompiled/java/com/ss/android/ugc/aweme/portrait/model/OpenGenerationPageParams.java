package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.OpenGenerationPageParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class OpenGenerationPageParams implements Parcelable {
    public static final Parcelable.Creator<OpenGenerationPageParams> CREATOR = new Parcelable.Creator<OpenGenerationPageParams>() { // from class: X.0Le6
        @Override // android.os.Parcelable.Creator
        public final OpenGenerationPageParams createFromParcel(Parcel parcel) {
            return new OpenGenerationPageParams((CreativeInfo) parcel.readParcelable(OpenGenerationPageParams.class.getClassLoader()), (CreativeModel) parcel.readParcelable(OpenGenerationPageParams.class.getClassLoader()), (AIPortraitContextModel) parcel.readParcelable(OpenGenerationPageParams.class.getClassLoader()), (AIPortraitConsumptionModel) parcel.readParcelable(OpenGenerationPageParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OpenGenerationPageParams[] newArray(int i) {
            return new OpenGenerationPageParams[i];
        }
    };

    @C09CT("consumption_model")
    public AIPortraitConsumptionModel consumptionModel;

    @C09CT("context_model")
    public AIPortraitContextModel contextModel;

    @C09CT("creative_info")
    public CreativeInfo creativeInfo;

    @C09CT("creative_model")
    public CreativeModel creativeModel;

    public OpenGenerationPageParams() {
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
        if (!(obj instanceof OpenGenerationPageParams)) {
            return false;
        }
        OpenGenerationPageParams openGenerationPageParams = (OpenGenerationPageParams) obj;
        return Intrinsics.LJFF(this.creativeInfo, openGenerationPageParams.creativeInfo) && Intrinsics.LJFF(this.creativeModel, openGenerationPageParams.creativeModel) && Intrinsics.LJFF(this.contextModel, openGenerationPageParams.contextModel) && Intrinsics.LJFF(this.consumptionModel, openGenerationPageParams.consumptionModel);
    }

    public final int hashCode() {
        CreativeInfo creativeInfo = this.creativeInfo;
        int iHashCode = (creativeInfo == null ? 0 : creativeInfo.hashCode()) * 31;
        CreativeModel creativeModel = this.creativeModel;
        int iHashCode2 = (iHashCode + (creativeModel == null ? 0 : creativeModel.hashCode())) * 31;
        AIPortraitContextModel aIPortraitContextModel = this.contextModel;
        int iHashCode3 = (iHashCode2 + (aIPortraitContextModel == null ? 0 : aIPortraitContextModel.hashCode())) * 31;
        AIPortraitConsumptionModel aIPortraitConsumptionModel = this.consumptionModel;
        return iHashCode3 + (aIPortraitConsumptionModel != null ? aIPortraitConsumptionModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenGenerationPageParams(creativeInfo=");
        sbLIZ.append(this.creativeInfo);
        sbLIZ.append(", creativeModel=");
        sbLIZ.append(this.creativeModel);
        sbLIZ.append(", contextModel=");
        sbLIZ.append(this.contextModel);
        sbLIZ.append(", consumptionModel=");
        sbLIZ.append(this.consumptionModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.creativeInfo, i);
        parcel.writeParcelable(this.creativeModel, i);
        parcel.writeParcelable(this.contextModel, i);
        parcel.writeParcelable(this.consumptionModel, i);
    }

    public OpenGenerationPageParams(CreativeInfo creativeInfo, CreativeModel creativeModel, AIPortraitContextModel aIPortraitContextModel, AIPortraitConsumptionModel aIPortraitConsumptionModel) {
        this.creativeInfo = creativeInfo;
        this.creativeModel = creativeModel;
        this.contextModel = aIPortraitContextModel;
        this.consumptionModel = aIPortraitConsumptionModel;
    }
}
