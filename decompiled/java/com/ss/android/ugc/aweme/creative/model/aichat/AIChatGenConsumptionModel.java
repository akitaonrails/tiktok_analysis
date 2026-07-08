package com.ss.android.ugc.aweme.creative.model.aichat;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AIChatGenConsumptionModel implements Parcelable {
    public static final Parcelable.Creator<AIChatGenConsumptionModel> CREATOR = new Parcelable.Creator<AIChatGenConsumptionModel>() { // from class: X.18Sq
        @Override // android.os.Parcelable.Creator
        public final AIChatGenConsumptionModel createFromParcel(Parcel parcel) {
            AIChatGenPrompt aIChatGenPromptCreateFromParcel;
            if (parcel.readInt() == 0) {
                aIChatGenPromptCreateFromParcel = null;
            } else {
                aIChatGenPromptCreateFromParcel = AIChatGenPrompt.CREATOR.createFromParcel(parcel);
            }
            return new AIChatGenConsumptionModel(aIChatGenPromptCreateFromParcel, parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatGenConsumptionModel[] newArray(int i) {
            return new AIChatGenConsumptionModel[i];
        }
    };

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("origin_image_count")
    public final int originImageCount;

    @C09CT("prompt")
    public final AIChatGenPrompt prompt;

    public AIChatGenConsumptionModel() {
        this(null, 0, "", "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatGenConsumptionModel)) {
            return false;
        }
        AIChatGenConsumptionModel aIChatGenConsumptionModel = (AIChatGenConsumptionModel) obj;
        return Intrinsics.LJFF(this.prompt, aIChatGenConsumptionModel.prompt) && this.originImageCount == aIChatGenConsumptionModel.originImageCount && Intrinsics.LJFF(this.enterFrom, aIChatGenConsumptionModel.enterFrom) && Intrinsics.LJFF(this.enterMethod, aIChatGenConsumptionModel.enterMethod);
    }

    public final int hashCode() {
        AIChatGenPrompt aIChatGenPrompt = this.prompt;
        return ((((((aIChatGenPrompt == null ? 0 : aIChatGenPrompt.hashCode()) * 31) + this.originImageCount) * 31) + this.enterFrom.hashCode()) * 31) + this.enterMethod.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatGenConsumptionModel(prompt=");
        sbLIZ.append(this.prompt);
        sbLIZ.append(", originImageCount=");
        sbLIZ.append(this.originImageCount);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AIChatGenPrompt aIChatGenPrompt = this.prompt;
        if (aIChatGenPrompt == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIChatGenPrompt.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.originImageCount);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
    }

    public AIChatGenConsumptionModel(AIChatGenPrompt aIChatGenPrompt, int i, String str, String str2) {
        this.prompt = aIChatGenPrompt;
        this.originImageCount = i;
        this.enterFrom = str;
        this.enterMethod = str2;
    }
}
