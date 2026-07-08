package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1736080vHK;
import X.EnumC1736950vIj;
import X.EnumC1737340vJM;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EditImageEffectImgCreatorData implements Parcelable {
    public final boolean applyEffectChecked;
    public EnumC1736950vIj iconCategoryType;
    public int iconEdited;
    public final String iconId;
    public final EnumC1737340vJM iconSelectType;
    public boolean isAutoGenIcon;
    public static final Parcelable.Creator<EditImageEffectImgCreatorData> CREATOR = new Parcelable.Creator<EditImageEffectImgCreatorData>() { // from class: X.0vIZ
        @Override // android.os.Parcelable.Creator
        public final EditImageEffectImgCreatorData createFromParcel(Parcel parcel) {
            boolean z;
            EnumC1737340vJM enumC1737340vJMValueOf;
            boolean z2;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            EnumC1736950vIj enumC1736950vIjValueOf = null;
            if (parcel.readInt() == 0) {
                enumC1737340vJMValueOf = null;
            } else {
                enumC1737340vJMValueOf = EnumC1737340vJM.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                enumC1736950vIjValueOf = EnumC1736950vIj.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new EditImageEffectImgCreatorData(string, z, enumC1737340vJMValueOf, enumC1736950vIjValueOf, z2, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EditImageEffectImgCreatorData[] newArray(int i) {
            return new EditImageEffectImgCreatorData[i];
        }
    };
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public EditImageEffectImgCreatorData() {
        this((String) null, false, (EnumC1737340vJM) (0 == true ? 1 : 0), (EnumC1736950vIj) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditImageEffectImgCreatorData)) {
            return false;
        }
        EditImageEffectImgCreatorData editImageEffectImgCreatorData = (EditImageEffectImgCreatorData) obj;
        return Intrinsics.LJFF(this.iconId, editImageEffectImgCreatorData.iconId) && this.applyEffectChecked == editImageEffectImgCreatorData.applyEffectChecked && this.iconSelectType == editImageEffectImgCreatorData.iconSelectType && this.iconCategoryType == editImageEffectImgCreatorData.iconCategoryType && this.isAutoGenIcon == editImageEffectImgCreatorData.isAutoGenIcon && this.iconEdited == editImageEffectImgCreatorData.iconEdited;
    }

    public final int hashCode() {
        String str = this.iconId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.applyEffectChecked)) * 31;
        EnumC1737340vJM enumC1737340vJM = this.iconSelectType;
        int iHashCode2 = (iHashCode + (enumC1737340vJM == null ? 0 : enumC1737340vJM.hashCode())) * 31;
        EnumC1736950vIj enumC1736950vIj = this.iconCategoryType;
        return ((((iHashCode2 + (enumC1736950vIj != null ? enumC1736950vIj.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isAutoGenIcon)) * 31) + this.iconEdited;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditImageEffectImgCreatorData(iconId=");
        sbLIZ.append(this.iconId);
        sbLIZ.append(", applyEffectChecked=");
        sbLIZ.append(this.applyEffectChecked);
        sbLIZ.append(", iconSelectType=");
        sbLIZ.append(this.iconSelectType);
        sbLIZ.append(", iconCategoryType=");
        sbLIZ.append(this.iconCategoryType);
        sbLIZ.append(", isAutoGenIcon=");
        sbLIZ.append(this.isAutoGenIcon);
        sbLIZ.append(", iconEdited=");
        sbLIZ.append(this.iconEdited);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.iconId);
        parcel.writeInt(this.applyEffectChecked ? 1 : 0);
        EnumC1737340vJM enumC1737340vJM = this.iconSelectType;
        if (enumC1737340vJM == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC1737340vJM.name());
        }
        EnumC1736950vIj enumC1736950vIj = this.iconCategoryType;
        if (enumC1736950vIj == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC1736950vIj.name());
        }
        parcel.writeInt(this.isAutoGenIcon ? 1 : 0);
        parcel.writeInt(this.iconEdited);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EditImageEffectImgCreatorData(String str, boolean z, EnumC1737340vJM enumC1737340vJM, EnumC1736950vIj enumC1736950vIj, int i, int i2) {
        boolean z2;
        int i3 = i;
        EnumC1736950vIj enumC1736950vIj2 = enumC1736950vIj;
        EnumC1737340vJM enumC1737340vJM2 = enumC1737340vJM;
        boolean z3 = z;
        String str2 = (i2 & 1) != 0 ? null : str;
        z3 = (i2 & 2) != 0 ? false : z3;
        enumC1737340vJM2 = (i2 & 4) != 0 ? EnumC1737340vJM.NOT_SET : enumC1737340vJM2;
        enumC1736950vIj2 = (i2 & 8) != 0 ? EnumC1736950vIj.EFFECT_ICON_FEMALE : enumC1736950vIj2;
        if ((i2 & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(str2, z3, enumC1737340vJM2, enumC1736950vIj2, z2, (i2 & 32) != 0 ? EnumC1736080vHK.NO_EDIT.getValue() : i3);
    }

    public EditImageEffectImgCreatorData(String str, boolean z, EnumC1737340vJM enumC1737340vJM, EnumC1736950vIj enumC1736950vIj, boolean z2, int i) {
        this.iconId = str;
        this.applyEffectChecked = z;
        this.iconSelectType = enumC1737340vJM;
        this.iconCategoryType = enumC1736950vIj;
        this.isAutoGenIcon = z2;
        this.iconEdited = i;
    }
}
