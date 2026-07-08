package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC434700H2u;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PromptModel implements Parcelable, InterfaceC434700H2u {
    public static final Parcelable.Creator<PromptModel> CREATOR = new Parcelable.Creator<PromptModel>() { // from class: X.0M4p
        @Override // android.os.Parcelable.Creator
        public final PromptModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            PromptType promptTypeCreateFromParcel = PromptType.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PromptModel(string, string2, promptTypeCreateFromParcel, string3, string4, string5, z);
        }

        @Override // android.os.Parcelable.Creator
        public final PromptModel[] newArray(int i) {
            return new PromptModel[i];
        }
    };

    @C09CT("algo_param")
    public final String algoParam;

    @C09CT("is_preinput_prompt")
    public final boolean isPreInputPrompt;

    @C09CT("req_key")
    public final String modelReqKey;

    @C09CT("prompt")
    public final String prompt;

    @C09CT("prompt_for_algorithm")
    public final String promptForAlgorithm;

    @C09CT("prompt_type")
    public final PromptType promptType;

    @C09CT("prompt_type_mob")
    public final String promptTypeMob;

    @Override // X.InterfaceC434700H2u
    public final int LIZ() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptModel)) {
            return false;
        }
        PromptModel promptModel = (PromptModel) obj;
        return Intrinsics.LJFF(this.prompt, promptModel.prompt) && Intrinsics.LJFF(this.promptForAlgorithm, promptModel.promptForAlgorithm) && this.promptType == promptModel.promptType && Intrinsics.LJFF(this.promptTypeMob, promptModel.promptTypeMob) && Intrinsics.LJFF(this.modelReqKey, promptModel.modelReqKey) && Intrinsics.LJFF(this.algoParam, promptModel.algoParam) && this.isPreInputPrompt == promptModel.isPreInputPrompt;
    }

    public final int hashCode() {
        return (((((((((((this.prompt.hashCode() * 31) + this.promptForAlgorithm.hashCode()) * 31) + this.promptType.hashCode()) * 31) + this.promptTypeMob.hashCode()) * 31) + this.modelReqKey.hashCode()) * 31) + this.algoParam.hashCode()) * 31) + C786410Ut5.Z2(this.isPreInputPrompt);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromptModel(prompt=");
        sbLIZ.append(this.prompt);
        sbLIZ.append(", promptForAlgorithm=");
        sbLIZ.append(this.promptForAlgorithm);
        sbLIZ.append(", promptType=");
        sbLIZ.append(this.promptType);
        sbLIZ.append(", promptTypeMob=");
        sbLIZ.append(this.promptTypeMob);
        sbLIZ.append(", modelReqKey=");
        sbLIZ.append(this.modelReqKey);
        sbLIZ.append(", algoParam=");
        sbLIZ.append(this.algoParam);
        sbLIZ.append(", isPreInputPrompt=");
        sbLIZ.append(this.isPreInputPrompt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.prompt);
        parcel.writeString(this.promptForAlgorithm);
        this.promptType.writeToParcel(parcel, i);
        parcel.writeString(this.promptTypeMob);
        parcel.writeString(this.modelReqKey);
        parcel.writeString(this.algoParam);
        parcel.writeInt(this.isPreInputPrompt ? 1 : 0);
    }

    public PromptModel() {
        this("", "", PromptType.NONE, "", "", "", false);
    }

    public final String LIZJ() {
        String str = this.promptTypeMob;
        return str.length() <= 0 ? this.promptType.getMobTag() : str;
    }

    public final boolean LIZLLL() {
        return this.promptType == PromptType.NONE;
    }

    public static PromptModel LIZIZ(PromptModel promptModel, String str) {
        String str2 = promptModel.prompt;
        String str3 = promptModel.promptForAlgorithm;
        PromptType promptType = promptModel.promptType;
        String str4 = promptModel.promptTypeMob;
        String str5 = promptModel.algoParam;
        boolean z = promptModel.isPreInputPrompt;
        promptModel.getClass();
        return new PromptModel(str2, str3, promptType, str4, str, str5, z);
    }

    public PromptModel(String str, String str2, PromptType promptType, String str3, String str4, String str5, boolean z) {
        this.prompt = str;
        this.promptForAlgorithm = str2;
        this.promptType = promptType;
        this.promptTypeMob = str3;
        this.modelReqKey = str4;
        this.algoParam = str5;
        this.isPreInputPrompt = z;
    }
}
