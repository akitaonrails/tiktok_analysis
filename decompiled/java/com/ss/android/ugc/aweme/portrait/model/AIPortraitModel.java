package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitCreationModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitSessionModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitModel implements Parcelable {
    public static final Parcelable.Creator<AIPortraitModel> CREATOR = new Parcelable.Creator<AIPortraitModel>() { // from class: X.0LfX
        @Override // android.os.Parcelable.Creator
        public final AIPortraitModel createFromParcel(Parcel parcel) {
            AIPortraitSessionModel aIPortraitSessionModelCreateFromParcel;
            AIPortraitCreationModel aIPortraitCreationModelCreateFromParcel;
            AIPortraitContextModel aIPortraitContextModelCreateFromParcel;
            AIPortraitConsumptionModel aIPortraitConsumptionModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                aIPortraitSessionModelCreateFromParcel = null;
            } else {
                aIPortraitSessionModelCreateFromParcel = AIPortraitSessionModel.CREATOR.createFromParcel(parcel);
            }
            AIPortraitSessionModel aIPortraitSessionModel = aIPortraitSessionModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                aIPortraitCreationModelCreateFromParcel = null;
            } else {
                aIPortraitCreationModelCreateFromParcel = AIPortraitCreationModel.CREATOR.createFromParcel(parcel);
            }
            AIPortraitCreationModel aIPortraitCreationModel = aIPortraitCreationModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                aIPortraitContextModelCreateFromParcel = null;
            } else {
                aIPortraitContextModelCreateFromParcel = AIPortraitContextModel.CREATOR.createFromParcel(parcel);
            }
            AIPortraitContextModel aIPortraitContextModel = aIPortraitContextModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                aIPortraitConsumptionModelCreateFromParcel = AIPortraitConsumptionModel.CREATOR.createFromParcel(parcel);
            }
            return new AIPortraitModel(aIPortraitSessionModel, aIPortraitCreationModel, aIPortraitContextModel, aIPortraitConsumptionModelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitModel[] newArray(int i) {
            return new AIPortraitModel[i];
        }
    };

    @C09CT("consumption_model")
    public AIPortraitConsumptionModel consumptionModel;

    @C09CT("context_model")
    public AIPortraitContextModel contextModel;

    @C09CT("creation_model")
    public AIPortraitCreationModel creationModel;

    @C09CT("session_model")
    public AIPortraitSessionModel sessionModel;

    public AIPortraitModel() {
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
        if (!(obj instanceof AIPortraitModel)) {
            return false;
        }
        AIPortraitModel aIPortraitModel = (AIPortraitModel) obj;
        return Intrinsics.LJFF(this.sessionModel, aIPortraitModel.sessionModel) && Intrinsics.LJFF(this.creationModel, aIPortraitModel.creationModel) && Intrinsics.LJFF(this.contextModel, aIPortraitModel.contextModel) && Intrinsics.LJFF(this.consumptionModel, aIPortraitModel.consumptionModel);
    }

    public final int hashCode() {
        AIPortraitSessionModel aIPortraitSessionModel = this.sessionModel;
        int iHashCode = (aIPortraitSessionModel == null ? 0 : aIPortraitSessionModel.hashCode()) * 31;
        AIPortraitCreationModel aIPortraitCreationModel = this.creationModel;
        int iHashCode2 = (iHashCode + (aIPortraitCreationModel == null ? 0 : aIPortraitCreationModel.hashCode())) * 31;
        AIPortraitContextModel aIPortraitContextModel = this.contextModel;
        int iHashCode3 = (iHashCode2 + (aIPortraitContextModel == null ? 0 : aIPortraitContextModel.hashCode())) * 31;
        AIPortraitConsumptionModel aIPortraitConsumptionModel = this.consumptionModel;
        return iHashCode3 + (aIPortraitConsumptionModel != null ? aIPortraitConsumptionModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitModel(sessionModel=");
        sbLIZ.append(this.sessionModel);
        sbLIZ.append(", creationModel=");
        sbLIZ.append(this.creationModel);
        sbLIZ.append(", contextModel=");
        sbLIZ.append(this.contextModel);
        sbLIZ.append(", consumptionModel=");
        sbLIZ.append(this.consumptionModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AIPortraitSessionModel aIPortraitSessionModel = this.sessionModel;
        if (aIPortraitSessionModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIPortraitSessionModel.writeToParcel(parcel, i);
        }
        AIPortraitCreationModel aIPortraitCreationModel = this.creationModel;
        if (aIPortraitCreationModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIPortraitCreationModel.writeToParcel(parcel, i);
        }
        AIPortraitContextModel aIPortraitContextModel = this.contextModel;
        if (aIPortraitContextModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIPortraitContextModel.writeToParcel(parcel, i);
        }
        AIPortraitConsumptionModel aIPortraitConsumptionModel = this.consumptionModel;
        if (aIPortraitConsumptionModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIPortraitConsumptionModel.writeToParcel(parcel, i);
        }
    }

    public AIPortraitModel(AIPortraitSessionModel aIPortraitSessionModel, AIPortraitCreationModel aIPortraitCreationModel, AIPortraitContextModel aIPortraitContextModel, AIPortraitConsumptionModel aIPortraitConsumptionModel) {
        this.sessionModel = aIPortraitSessionModel;
        this.creationModel = aIPortraitCreationModel;
        this.contextModel = aIPortraitContextModel;
        this.consumptionModel = aIPortraitConsumptionModel;
    }
}
