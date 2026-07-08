package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedSloganInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SelfOperatedSloganInfo implements Parcelable {

    @C09CT("arrow_color")
    public final CommonColor arrowColor;

    @C09CT("background_color")
    public final CommonColor backgroundColor;

    @C09CT("background_image")
    public final Icon backgroundImage;

    @C09CT("logo_image")
    public final Image logoImage;

    @C09CT("schema")
    public final String schema;

    @C09CT("text")
    public final LinkText text;

    @C09CT("title")
    public final LinkText title;
    public static final Parcelable.Creator<SelfOperatedSloganInfo> CREATOR = new Parcelable.Creator<SelfOperatedSloganInfo>() { // from class: X.02tb
        @Override // android.os.Parcelable.Creator
        public final SelfOperatedSloganInfo createFromParcel(Parcel parcel) {
            CommonColor commonColorCreateFromParcel;
            LinkText linkTextCreateFromParcel;
            LinkText linkTextCreateFromParcel2;
            Image image = (Image) parcel.readParcelable(SelfOperatedSloganInfo.class.getClassLoader());
            Icon icon = (Icon) parcel.readParcelable(SelfOperatedSloganInfo.class.getClassLoader());
            CommonColor commonColorCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                commonColorCreateFromParcel = null;
            } else {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            CommonColor commonColor = commonColorCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkTextCreateFromParcel = null;
            } else {
                linkTextCreateFromParcel = LinkText.CREATOR.createFromParcel(parcel);
            }
            LinkText linkText = linkTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkTextCreateFromParcel2 = null;
            } else {
                linkTextCreateFromParcel2 = LinkText.CREATOR.createFromParcel(parcel);
            }
            LinkText linkText2 = linkTextCreateFromParcel2;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                commonColorCreateFromParcel2 = CommonColor.CREATOR.createFromParcel(parcel);
            }
            return new SelfOperatedSloganInfo(image, icon, commonColor, linkText, linkText2, string, commonColorCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final SelfOperatedSloganInfo[] newArray(int i) {
            return new SelfOperatedSloganInfo[i];
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
        if (!(obj instanceof SelfOperatedSloganInfo)) {
            return false;
        }
        SelfOperatedSloganInfo selfOperatedSloganInfo = (SelfOperatedSloganInfo) obj;
        return Intrinsics.LJFF(this.logoImage, selfOperatedSloganInfo.logoImage) && Intrinsics.LJFF(this.backgroundImage, selfOperatedSloganInfo.backgroundImage) && Intrinsics.LJFF(this.backgroundColor, selfOperatedSloganInfo.backgroundColor) && Intrinsics.LJFF(this.title, selfOperatedSloganInfo.title) && Intrinsics.LJFF(this.text, selfOperatedSloganInfo.text) && Intrinsics.LJFF(this.schema, selfOperatedSloganInfo.schema) && Intrinsics.LJFF(this.arrowColor, selfOperatedSloganInfo.arrowColor);
    }

    public final int hashCode() {
        Image image = this.logoImage;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Icon icon = this.backgroundImage;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        CommonColor commonColor = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        LinkText linkText = this.title;
        int iHashCode4 = (iHashCode3 + (linkText == null ? 0 : linkText.hashCode())) * 31;
        LinkText linkText2 = this.text;
        int iHashCode5 = (iHashCode4 + (linkText2 == null ? 0 : linkText2.hashCode())) * 31;
        String str = this.schema;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        CommonColor commonColor2 = this.arrowColor;
        return iHashCode6 + (commonColor2 != null ? commonColor2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelfOperatedSloganInfo(logoImage=");
        sbLIZ.append(this.logoImage);
        sbLIZ.append(", backgroundImage=");
        sbLIZ.append(this.backgroundImage);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", arrowColor=");
        sbLIZ.append(this.arrowColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.logoImage, i);
        parcel.writeParcelable(this.backgroundImage, i);
        CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
        LinkText linkText = this.title;
        if (linkText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkText.writeToParcel(parcel, i);
        }
        LinkText linkText2 = this.text;
        if (linkText2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkText2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.schema);
        CommonColor commonColor2 = this.arrowColor;
        if (commonColor2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor2.writeToParcel(parcel, i);
        }
    }

    public SelfOperatedSloganInfo(Image image, Icon icon, CommonColor commonColor, LinkText linkText, LinkText linkText2, String str, CommonColor commonColor2) {
        this.logoImage = image;
        this.backgroundImage = icon;
        this.backgroundColor = commonColor;
        this.title = linkText;
        this.text = linkText2;
        this.schema = str;
        this.arrowColor = commonColor2;
    }
}
