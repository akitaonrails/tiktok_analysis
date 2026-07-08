package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.sticker.model.NewGreenScreenEffectModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class NewGreenScreenEffectModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<NewGreenScreenEffectModel> CREATOR = new Parcelable.Creator<NewGreenScreenEffectModel>() { // from class: X.0msu
        @Override // android.os.Parcelable.Creator
        public final NewGreenScreenEffectModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3 = true;
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
            GreenScreenMaterial greenScreenMaterialCreateFromParcel = GreenScreenMaterial.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                z3 = false;
            }
            return new NewGreenScreenEffectModel(z, z2, greenScreenMaterialCreateFromParcel, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final NewGreenScreenEffectModel[] newArray(int i) {
            return new NewGreenScreenEffectModel[i];
        }
    };

    @C09CT("green_screen_material_type")
    public GreenScreenMaterial greenScreenMaterialType;

    @C09CT("need_auto_switch_mob")
    public boolean needAutoSwitchMob;

    @C09CT("has_used_green_screen")
    public boolean openGreenScreenMode;

    @C09CT("has_used_portrait")
    public boolean openPortraitMode;

    public NewGreenScreenEffectModel() {
        this(false, true, GreenScreenMaterial.DEFAULT, false);
    }

    public final NewGreenScreenEffectModel copy(boolean z, boolean z2, GreenScreenMaterial greenScreenMaterial, boolean z3) {
        return new NewGreenScreenEffectModel(z, z2, greenScreenMaterial, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewGreenScreenEffectModel)) {
            return false;
        }
        NewGreenScreenEffectModel newGreenScreenEffectModel = (NewGreenScreenEffectModel) obj;
        return this.openGreenScreenMode == newGreenScreenEffectModel.openGreenScreenMode && this.openPortraitMode == newGreenScreenEffectModel.openPortraitMode && this.greenScreenMaterialType == newGreenScreenEffectModel.greenScreenMaterialType && this.needAutoSwitchMob == newGreenScreenEffectModel.needAutoSwitchMob;
    }

    public int hashCode() {
        return (((((C786410Ut5.Z2(this.openGreenScreenMode) * 31) + C786410Ut5.Z2(this.openPortraitMode)) * 31) + this.greenScreenMaterialType.hashCode()) * 31) + C786410Ut5.Z2(this.needAutoSwitchMob);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewGreenScreenEffectModel(openGreenScreenMode=");
        sbLIZ.append(this.openGreenScreenMode);
        sbLIZ.append(", openPortraitMode=");
        sbLIZ.append(this.openPortraitMode);
        sbLIZ.append(", greenScreenMaterialType=");
        sbLIZ.append(this.greenScreenMaterialType);
        sbLIZ.append(", needAutoSwitchMob=");
        sbLIZ.append(this.needAutoSwitchMob);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.openGreenScreenMode ? 1 : 0);
        parcel.writeInt(this.openPortraitMode ? 1 : 0);
        this.greenScreenMaterialType.writeToParcel(parcel, i);
        parcel.writeInt(this.needAutoSwitchMob ? 1 : 0);
    }

    public final NewGreenScreenEffectModel deepCopy() {
        return new NewGreenScreenEffectModel(this.openGreenScreenMode, this.openPortraitMode, this.greenScreenMaterialType, this.needAutoSwitchMob);
    }

    public final GreenScreenMaterial getGreenScreenMaterialType() {
        return this.greenScreenMaterialType;
    }

    public final boolean getNeedAutoSwitchMob() {
        return this.needAutoSwitchMob;
    }

    public final boolean getOpenGreenScreenMode() {
        return this.openGreenScreenMode;
    }

    public final boolean getOpenPortraitMode() {
        return this.openPortraitMode;
    }

    public final void setGreenScreenMaterialType(GreenScreenMaterial greenScreenMaterial) {
        this.greenScreenMaterialType = greenScreenMaterial;
    }

    public final void setNeedAutoSwitchMob(boolean z) {
        this.needAutoSwitchMob = z;
    }

    public final void setOpenGreenScreenMode(boolean z) {
        this.openGreenScreenMode = z;
    }

    public final void setOpenPortraitMode(boolean z) {
        this.openPortraitMode = z;
    }

    public NewGreenScreenEffectModel(boolean z, boolean z2, GreenScreenMaterial greenScreenMaterial, boolean z3) {
        this.openGreenScreenMode = z;
        this.openPortraitMode = z2;
        this.greenScreenMaterialType = greenScreenMaterial;
        this.needAutoSwitchMob = z3;
    }
}
