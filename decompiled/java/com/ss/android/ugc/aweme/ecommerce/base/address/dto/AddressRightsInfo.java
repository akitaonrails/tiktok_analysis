package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressRightsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressRightsInfo implements Parcelable {

    @C09CT("icon")
    public Icon rightIcon;

    @C09CT("rights_template")
    public LinkRichText rightLinkRichText;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_dark_color")
    public String textDarkColor;
    public static final Parcelable.Creator<AddressRightsInfo> CREATOR = new Parcelable.Creator<AddressRightsInfo>() { // from class: X.02mq
        @Override // android.os.Parcelable.Creator
        public final AddressRightsInfo createFromParcel(Parcel parcel) {
            LinkRichText linkRichTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            return new AddressRightsInfo(linkRichTextCreateFromParcel, (Icon) parcel.readParcelable(AddressRightsInfo.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressRightsInfo[] newArray(int i) {
            return new AddressRightsInfo[i];
        }
    };
    public static final int $stable = 8;

    public AddressRightsInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressRightsInfo)) {
            return false;
        }
        AddressRightsInfo addressRightsInfo = (AddressRightsInfo) obj;
        return Intrinsics.LJFF(this.rightLinkRichText, addressRightsInfo.rightLinkRichText) && Intrinsics.LJFF(this.rightIcon, addressRightsInfo.rightIcon) && Intrinsics.LJFF(this.textColor, addressRightsInfo.textColor) && Intrinsics.LJFF(this.textDarkColor, addressRightsInfo.textDarkColor);
    }

    public final int hashCode() {
        LinkRichText linkRichText = this.rightLinkRichText;
        int iHashCode = (linkRichText == null ? 0 : linkRichText.hashCode()) * 31;
        Icon icon = this.rightIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str = this.textColor;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textDarkColor;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressRightsInfo(rightLinkRichText=");
        sbLIZ.append(this.rightLinkRichText);
        sbLIZ.append(", rightIcon=");
        sbLIZ.append(this.rightIcon);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", textDarkColor=");
        sbLIZ.append(this.textDarkColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkRichText linkRichText = this.rightLinkRichText;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.rightIcon, i);
        parcel.writeString(this.textColor);
        parcel.writeString(this.textDarkColor);
    }

    public AddressRightsInfo(LinkRichText linkRichText, Icon icon, String str, String str2) {
        this.rightLinkRichText = linkRichText;
        this.rightIcon = icon;
        this.textColor = str;
        this.textDarkColor = str2;
    }
}
