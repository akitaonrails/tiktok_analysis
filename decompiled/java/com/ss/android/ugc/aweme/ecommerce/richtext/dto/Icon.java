package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Icon implements Parcelable, Serializable {
    public static final Parcelable.Creator<Icon> CREATOR = new Parcelable.Creator<Icon>() { // from class: X.02kg
        @Override // android.os.Parcelable.Creator
        public final Icon createFromParcel(Parcel parcel) {
            Image imageCreateFromParcel;
            Image imageCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                imageCreateFromParcel = null;
            } else {
                imageCreateFromParcel = Image.CREATOR.createFromParcel(parcel);
            }
            Image image = imageCreateFromParcel;
            if (parcel.readInt() != 0) {
                imageCreateFromParcel2 = Image.CREATOR.createFromParcel(parcel);
            }
            return new Icon(image, imageCreateFromParcel2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Icon[] newArray(int i) {
            return new Icon[i];
        }
    };

    @C09CT("icon")
    public Image icon;

    @C09CT("icon_dark")
    public Image iconDark;

    @C09CT("link")
    public String link;

    @C09CT("tux_token")
    public String tuxToken;

    public Icon() {
    }

    public final Icon copy(Image image, Image image2, String str, String str2) {
        return new Icon(image, image2, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return Intrinsics.LJFF(this.icon, icon.icon) && Intrinsics.LJFF(this.iconDark, icon.iconDark) && Intrinsics.LJFF(this.link, icon.link) && Intrinsics.LJFF(this.tuxToken, icon.tuxToken);
    }

    public int hashCode() {
        Image image = this.icon;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.iconDark;
        int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str = this.link;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tuxToken;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Icon(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", iconDark=");
        sbLIZ.append(this.iconDark);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", tuxToken=");
        sbLIZ.append(this.tuxToken);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Image image = this.icon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, i);
        }
        Image image2 = this.iconDark;
        if (image2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.link);
        parcel.writeString(this.tuxToken);
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final Image getIconDark() {
        return this.iconDark;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getTuxToken() {
        return this.tuxToken;
    }

    public Icon(Image image, Image image2, String str, String str2) {
        this.icon = image;
        this.iconDark = image2;
        this.link = str;
        this.tuxToken = str2;
    }
}
