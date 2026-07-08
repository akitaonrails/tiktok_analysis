package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherLabel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherLabel implements Parcelable, Serializable {

    @C09CT("dark_image")
    public Image darkImage;

    @C09CT("image")
    public Image image;

    @C09CT("style")
    public Integer style;

    @C09CT("text")
    public String text;
    public static final Parcelable.Creator<VoucherLabel> CREATOR = new Parcelable.Creator<VoucherLabel>() { // from class: X.02aC
        @Override // android.os.Parcelable.Creator
        public final VoucherLabel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new VoucherLabel(numValueOf, parcel.readString(), (Image) parcel.readParcelable(VoucherLabel.class.getClassLoader()), (Image) parcel.readParcelable(VoucherLabel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VoucherLabel[] newArray(int i) {
            return new VoucherLabel[i];
        }
    };
    public static final int $stable = 8;

    public VoucherLabel() {
        this(null, null, null, null);
    }

    public final VoucherLabel copy(Integer num, String str, Image image, Image image2) {
        return new VoucherLabel(num, str, image, image2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherLabel)) {
            return false;
        }
        VoucherLabel voucherLabel = (VoucherLabel) obj;
        return Intrinsics.LJFF(this.style, voucherLabel.style) && Intrinsics.LJFF(this.text, voucherLabel.text) && Intrinsics.LJFF(this.image, voucherLabel.image) && Intrinsics.LJFF(this.darkImage, voucherLabel.darkImage);
    }

    public int hashCode() {
        Integer num = this.style;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.image;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.darkImage;
        return iHashCode3 + (image2 != null ? image2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoucherLabel(style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", darkImage=");
        sbLIZ.append(this.darkImage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.style;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.image, i);
        parcel.writeParcelable(this.darkImage, i);
    }

    public final Image getDarkImage() {
        return this.darkImage;
    }

    public final Image getImage() {
        return this.image;
    }

    public final Integer getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public VoucherLabel(Integer num, String str, Image image, Image image2) {
        this.style = num;
        this.text = str;
        this.image = image;
        this.darkImage = image2;
    }
}
