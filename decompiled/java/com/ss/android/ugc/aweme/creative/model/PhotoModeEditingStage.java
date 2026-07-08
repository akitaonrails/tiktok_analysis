package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1413160msU;
import X.EnumC994360bz0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PhotoModeEditingStage;

/* JADX INFO: loaded from: classes23.dex */
public final class PhotoModeEditingStage implements Parcelable {
    public static final Parcelable.Creator<PhotoModeEditingStage> CREATOR = new Parcelable.Creator<PhotoModeEditingStage>() { // from class: X.0n1K
        @Override // android.os.Parcelable.Creator
        public final PhotoModeEditingStage createFromParcel(Parcel parcel) {
            EnumC994360bz0 enumC994360bz0ValueOf;
            boolean z;
            boolean z2;
            boolean z3;
            EnumC1413160msU enumC1413160msUValueOf = null;
            if (parcel.readInt() == 0) {
                enumC994360bz0ValueOf = null;
            } else {
                enumC994360bz0ValueOf = EnumC994360bz0.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                enumC1413160msUValueOf = EnumC1413160msU.valueOf(parcel.readString());
            }
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new PhotoModeEditingStage(enumC994360bz0ValueOf, enumC1413160msUValueOf, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModeEditingStage[] newArray(int i) {
            return new PhotoModeEditingStage[i];
        }
    };

    @C09CT("is_from_multi_photo_content")
    public boolean isFromMultiPhotoContent;

    @C09CT("is_from_multi_photo_special_page")
    public boolean isFromMultiPhotoSpecialPage;

    @C09CT("photo_mode_autocut_item_type")
    public EnumC1413160msU itemType;

    @C040H
    public boolean photoModeEnterAutoCut;

    @C040H
    public EnumC994360bz0 photoModeEntryMode;

    public PhotoModeEditingStage() {
        this(null, null, false, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeEditingStage)) {
            return false;
        }
        PhotoModeEditingStage photoModeEditingStage = (PhotoModeEditingStage) obj;
        return this.photoModeEntryMode == photoModeEditingStage.photoModeEntryMode && this.itemType == photoModeEditingStage.itemType && this.photoModeEnterAutoCut == photoModeEditingStage.photoModeEnterAutoCut && this.isFromMultiPhotoContent == photoModeEditingStage.isFromMultiPhotoContent && this.isFromMultiPhotoSpecialPage == photoModeEditingStage.isFromMultiPhotoSpecialPage;
    }

    public final int hashCode() {
        EnumC994360bz0 enumC994360bz0 = this.photoModeEntryMode;
        int iHashCode = (enumC994360bz0 == null ? 0 : enumC994360bz0.hashCode()) * 31;
        EnumC1413160msU enumC1413160msU = this.itemType;
        return ((((((iHashCode + (enumC1413160msU != null ? enumC1413160msU.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.photoModeEnterAutoCut)) * 31) + C786410Ut5.Z2(this.isFromMultiPhotoContent)) * 31) + C786410Ut5.Z2(this.isFromMultiPhotoSpecialPage);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeEditingStage(photoModeEntryMode=");
        sbLIZ.append(this.photoModeEntryMode);
        sbLIZ.append(", itemType=");
        sbLIZ.append(this.itemType);
        sbLIZ.append(", photoModeEnterAutoCut=");
        sbLIZ.append(this.photoModeEnterAutoCut);
        sbLIZ.append(", isFromMultiPhotoContent=");
        sbLIZ.append(this.isFromMultiPhotoContent);
        sbLIZ.append(", isFromMultiPhotoSpecialPage=");
        sbLIZ.append(this.isFromMultiPhotoSpecialPage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        EnumC994360bz0 enumC994360bz0 = this.photoModeEntryMode;
        if (enumC994360bz0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC994360bz0.name());
        }
        EnumC1413160msU enumC1413160msU = this.itemType;
        if (enumC1413160msU == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC1413160msU.name());
        }
        parcel.writeInt(this.photoModeEnterAutoCut ? 1 : 0);
        parcel.writeInt(this.isFromMultiPhotoContent ? 1 : 0);
        parcel.writeInt(this.isFromMultiPhotoSpecialPage ? 1 : 0);
    }

    public PhotoModeEditingStage(EnumC994360bz0 enumC994360bz0, EnumC1413160msU enumC1413160msU, boolean z, boolean z2, boolean z3) {
        this.photoModeEntryMode = enumC994360bz0;
        this.itemType = enumC1413160msU;
        this.photoModeEnterAutoCut = z;
        this.isFromMultiPhotoContent = z2;
        this.isFromMultiPhotoSpecialPage = z3;
    }
}
