package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AigcMetadataModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AigcMetadataModel implements Parcelable {
    public static final Parcelable.Creator<AigcMetadataModel> CREATOR = new Parcelable.Creator<AigcMetadataModel>() { // from class: X.0mcD
        @Override // android.os.Parcelable.Creator
        public final AigcMetadataModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new AigcMetadataModel(z, z2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AigcMetadataModel[] newArray(int i) {
            return new AigcMetadataModel[i];
        }
    };

    @C09CT("effect_sdk_extra")
    public String currentEffectSdkExtra;

    @C09CT("generation_trigger_type")
    public String generationTriggerType;

    @C040H
    public boolean isAIGCEffectRedesignEnabled;

    @C09CT("aigc_effect")
    public boolean isAigcEffect;

    public AigcMetadataModel() {
        this(false, false, "", "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AigcMetadataModel)) {
            return false;
        }
        AigcMetadataModel aigcMetadataModel = (AigcMetadataModel) obj;
        return this.isAIGCEffectRedesignEnabled == aigcMetadataModel.isAIGCEffectRedesignEnabled && this.isAigcEffect == aigcMetadataModel.isAigcEffect && Intrinsics.LJFF(this.currentEffectSdkExtra, aigcMetadataModel.currentEffectSdkExtra) && Intrinsics.LJFF(this.generationTriggerType, aigcMetadataModel.generationTriggerType);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.isAIGCEffectRedesignEnabled) * 31) + C786410Ut5.Z2(this.isAigcEffect)) * 31) + this.currentEffectSdkExtra.hashCode()) * 31) + this.generationTriggerType.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AigcMetadataModel(isAIGCEffectRedesignEnabled=");
        sbLIZ.append(this.isAIGCEffectRedesignEnabled);
        sbLIZ.append(", isAigcEffect=");
        sbLIZ.append(this.isAigcEffect);
        sbLIZ.append(", currentEffectSdkExtra=");
        sbLIZ.append(this.currentEffectSdkExtra);
        sbLIZ.append(", generationTriggerType=");
        sbLIZ.append(this.generationTriggerType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isAIGCEffectRedesignEnabled ? 1 : 0);
        parcel.writeInt(this.isAigcEffect ? 1 : 0);
        parcel.writeString(this.currentEffectSdkExtra);
        parcel.writeString(this.generationTriggerType);
    }

    public AigcMetadataModel(boolean z, boolean z2, String str, String str2) {
        this.isAIGCEffectRedesignEnabled = z;
        this.isAigcEffect = z2;
        this.currentEffectSdkExtra = str;
        this.generationTriggerType = str2;
    }
}
