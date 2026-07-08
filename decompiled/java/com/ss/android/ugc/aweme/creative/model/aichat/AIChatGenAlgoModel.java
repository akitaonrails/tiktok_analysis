package com.ss.android.ugc.aweme.creative.model.aichat;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenAlgoModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AIChatGenAlgoModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<AIChatGenAlgoModel> CREATOR = new Parcelable.Creator<AIChatGenAlgoModel>() { // from class: X.18UY
        @Override // android.os.Parcelable.Creator
        public final AIChatGenAlgoModel createFromParcel(Parcel parcel) {
            return new AIChatGenAlgoModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatGenAlgoModel[] newArray(int i) {
            return new AIChatGenAlgoModel[i];
        }
    };

    @C09CT("generate_model")
    public String generateModel;

    @C09CT("intention_model")
    public String intentionModel;

    @C09CT("vp_model")
    public String vpModel;

    public AIChatGenAlgoModel() {
        this(null, null, null);
    }

    public final AIChatGenAlgoModel copy(String str, String str2, String str3) {
        return new AIChatGenAlgoModel(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatGenAlgoModel)) {
            return false;
        }
        AIChatGenAlgoModel aIChatGenAlgoModel = (AIChatGenAlgoModel) obj;
        return Intrinsics.LJFF(this.intentionModel, aIChatGenAlgoModel.intentionModel) && Intrinsics.LJFF(this.generateModel, aIChatGenAlgoModel.generateModel) && Intrinsics.LJFF(this.vpModel, aIChatGenAlgoModel.vpModel);
    }

    public int hashCode() {
        String str = this.intentionModel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.generateModel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vpModel;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatGenAlgoModel(intentionModel=");
        sbLIZ.append(this.intentionModel);
        sbLIZ.append(", generateModel=");
        sbLIZ.append(this.generateModel);
        sbLIZ.append(", vpModel=");
        sbLIZ.append(this.vpModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.intentionModel);
        parcel.writeString(this.generateModel);
        parcel.writeString(this.vpModel);
    }

    public final String getGenerateModel() {
        return this.generateModel;
    }

    public final String getIntentionModel() {
        return this.intentionModel;
    }

    public final String getVpModel() {
        return this.vpModel;
    }

    public final void setGenerateModel(String str) {
        this.generateModel = str;
    }

    public final void setIntentionModel(String str) {
        this.intentionModel = str;
    }

    public final void setVpModel(String str) {
        this.vpModel = str;
    }

    public AIChatGenAlgoModel(String str, String str2, String str3) {
        this.intentionModel = str;
        this.generateModel = str2;
        this.vpModel = str3;
    }
}
