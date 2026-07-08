package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressModule;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PudoAddressModule implements Parcelable {

    @C09CT("background_img")
    public final Icon bgImage;

    @C09CT("page_jump_icon")
    public final Icon jumpIcon;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("pudo_address")
    public final PudoAddress pudoAddress;

    @C09CT("title")
    public final ECRichText title;
    public static final Parcelable.Creator<PudoAddressModule> CREATOR = new Parcelable.Creator<PudoAddressModule>() { // from class: X.036w
        @Override // android.os.Parcelable.Creator
        public final PudoAddressModule createFromParcel(Parcel parcel) {
            PudoAddress pudoAddressCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(PudoAddressModule.class.getClassLoader());
            if (parcel.readInt() == 0) {
                pudoAddressCreateFromParcel = null;
            } else {
                pudoAddressCreateFromParcel = PudoAddress.CREATOR.createFromParcel(parcel);
            }
            return new PudoAddressModule(eCRichText, pudoAddressCreateFromParcel, (Icon) parcel.readParcelable(PudoAddressModule.class.getClassLoader()), parcel.readString(), (Icon) parcel.readParcelable(PudoAddressModule.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PudoAddressModule[] newArray(int i) {
            return new PudoAddressModule[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PudoAddressModule)) {
            return false;
        }
        PudoAddressModule pudoAddressModule = (PudoAddressModule) obj;
        return Intrinsics.LJFF(this.title, pudoAddressModule.title) && Intrinsics.LJFF(this.pudoAddress, pudoAddressModule.pudoAddress) && Intrinsics.LJFF(this.bgImage, pudoAddressModule.bgImage) && Intrinsics.LJFF(this.jumpSchema, pudoAddressModule.jumpSchema) && Intrinsics.LJFF(this.jumpIcon, pudoAddressModule.jumpIcon);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        PudoAddress pudoAddress = this.pudoAddress;
        int iHashCode2 = (iHashCode + (pudoAddress == null ? 0 : pudoAddress.hashCode())) * 31;
        Icon icon = this.bgImage;
        int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.jumpSchema;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon2 = this.jumpIcon;
        return iHashCode4 + (icon2 != null ? icon2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PudoAddressModule(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", pudoAddress=");
        sbLIZ.append(this.pudoAddress);
        sbLIZ.append(", bgImage=");
        sbLIZ.append(this.bgImage);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(", jumpIcon=");
        sbLIZ.append(this.jumpIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        PudoAddress pudoAddress = this.pudoAddress;
        if (pudoAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pudoAddress.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.bgImage, i);
        parcel.writeString(this.jumpSchema);
        parcel.writeParcelable(this.jumpIcon, i);
    }

    public PudoAddressModule(ECRichText eCRichText, PudoAddress pudoAddress, Icon icon, String str, Icon icon2) {
        this.title = eCRichText;
        this.pudoAddress = pudoAddress;
        this.bgImage = icon;
        this.jumpSchema = str;
        this.jumpIcon = icon2;
    }
}
