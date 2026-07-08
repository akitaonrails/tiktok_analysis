package com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.LinkText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkText implements Parcelable {
    public static final Parcelable.Creator<LinkText> CREATOR = new Parcelable.Creator<LinkText>() { // from class: X.02qh
        @Override // android.os.Parcelable.Creator
        public final LinkText createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            return new LinkText(string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final LinkText[] newArray(int i) {
            return new LinkText[i];
        }
    };

    @C09CT("is_third_party_link")
    public final Boolean isThirdPartyLink;

    @C09CT("link")
    public final String link;

    @C09CT("text")
    public final String text;

    public LinkText() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkText)) {
            return false;
        }
        LinkText linkText = (LinkText) obj;
        return Intrinsics.LJFF(this.text, linkText.text) && Intrinsics.LJFF(this.link, linkText.link) && Intrinsics.LJFF(this.isThirdPartyLink, linkText.isThirdPartyLink);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isThirdPartyLink;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkText(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", isThirdPartyLink=");
        sbLIZ.append(this.isThirdPartyLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.text);
        parcel.writeString(this.link);
        Boolean bool = this.isThirdPartyLink;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public LinkText(String str, String str2, Boolean bool) {
        this.text = str;
        this.link = str2;
        this.isThirdPartyLink = bool;
    }
}
