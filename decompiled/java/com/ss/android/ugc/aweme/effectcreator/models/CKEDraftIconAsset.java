package com.ss.android.ugc.aweme.effectcreator.models;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftIconAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CKEDraftIconAsset implements Parcelable {
    public static final Parcelable.Creator<CKEDraftIconAsset> CREATOR = new Parcelable.Creator<CKEDraftIconAsset>() { // from class: X.0vIb
        @Override // android.os.Parcelable.Creator
        public final CKEDraftIconAsset createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new CKEDraftIconAsset(string, string2, boolValueOf, numValueOf, z2, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CKEDraftIconAsset[] newArray(int i) {
            return new CKEDraftIconAsset[i];
        }
    };
    public final String iconAssetId;
    public final int iconEdit;
    public String iconPath;
    public final Integer iconSelectTypeValue;
    public final boolean isAutoGenIcon;
    public final Boolean isIconEffectApplied;

    public CKEDraftIconAsset() {
        this("", "", null, null, true, 0);
    }

    public final CKEDraftIconAsset copy(String str, String str2, Boolean bool, Integer num, boolean z, int i) {
        return new CKEDraftIconAsset(str, str2, bool, num, z, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CKEDraftIconAsset)) {
            return false;
        }
        CKEDraftIconAsset cKEDraftIconAsset = (CKEDraftIconAsset) obj;
        return Intrinsics.LJFF(this.iconPath, cKEDraftIconAsset.iconPath) && Intrinsics.LJFF(this.iconAssetId, cKEDraftIconAsset.iconAssetId) && Intrinsics.LJFF(this.isIconEffectApplied, cKEDraftIconAsset.isIconEffectApplied) && Intrinsics.LJFF(this.iconSelectTypeValue, cKEDraftIconAsset.iconSelectTypeValue) && this.isAutoGenIcon == cKEDraftIconAsset.isAutoGenIcon && this.iconEdit == cKEDraftIconAsset.iconEdit;
    }

    public int hashCode() {
        int iHashCode = ((this.iconPath.hashCode() * 31) + this.iconAssetId.hashCode()) * 31;
        Boolean bool = this.isIconEffectApplied;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.iconSelectTypeValue;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isAutoGenIcon)) * 31) + this.iconEdit;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CKEDraftIconAsset(iconPath=");
        sbLIZ.append(this.iconPath);
        sbLIZ.append(", iconAssetId=");
        sbLIZ.append(this.iconAssetId);
        sbLIZ.append(", isIconEffectApplied=");
        sbLIZ.append(this.isIconEffectApplied);
        sbLIZ.append(", iconSelectTypeValue=");
        sbLIZ.append(this.iconSelectTypeValue);
        sbLIZ.append(", isAutoGenIcon=");
        sbLIZ.append(this.isAutoGenIcon);
        sbLIZ.append(", iconEdit=");
        sbLIZ.append(this.iconEdit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.iconPath);
        parcel.writeString(this.iconAssetId);
        Boolean bool = this.isIconEffectApplied;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.iconSelectTypeValue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isAutoGenIcon ? 1 : 0);
        parcel.writeInt(this.iconEdit);
    }

    public final String getIconAssetId() {
        return this.iconAssetId;
    }

    public final int getIconEdit() {
        return this.iconEdit;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final Integer getIconSelectTypeValue() {
        return this.iconSelectTypeValue;
    }

    public final boolean isAutoGenIcon() {
        return this.isAutoGenIcon;
    }

    public final Boolean isIconEffectApplied() {
        return this.isIconEffectApplied;
    }

    public final void setIconPath(String str) {
        this.iconPath = str;
    }

    public CKEDraftIconAsset(String str, String str2, Boolean bool, Integer num, boolean z, int i) {
        this.iconPath = str;
        this.iconAssetId = str2;
        this.isIconEffectApplied = bool;
        this.iconSelectTypeValue = num;
        this.isAutoGenIcon = z;
        this.iconEdit = i;
    }
}
