package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPAppendix;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPAppendix implements Parcelable {

    @C09CT("link_icon")
    public final Icon linkIcon;

    @C09CT("rich_text")
    public final LinkRichText richText;
    public static final Parcelable.Creator<PDPAppendix> CREATOR = new Parcelable.Creator<PDPAppendix>() { // from class: X.03KL
        @Override // android.os.Parcelable.Creator
        public final PDPAppendix createFromParcel(Parcel parcel) {
            LinkRichText linkRichTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            return new PDPAppendix(linkRichTextCreateFromParcel, (Icon) parcel.readParcelable(PDPAppendix.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PDPAppendix[] newArray(int i) {
            return new PDPAppendix[i];
        }
    };
    public static final int $stable = 8;

    public PDPAppendix() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPAppendix)) {
            return false;
        }
        PDPAppendix pDPAppendix = (PDPAppendix) obj;
        return Intrinsics.LJFF(this.richText, pDPAppendix.richText) && Intrinsics.LJFF(this.linkIcon, pDPAppendix.linkIcon);
    }

    public final int hashCode() {
        LinkRichText linkRichText = this.richText;
        int iHashCode = (linkRichText == null ? 0 : linkRichText.hashCode()) * 31;
        Icon icon = this.linkIcon;
        return iHashCode + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPAppendix(richText=");
        sbLIZ.append(this.richText);
        sbLIZ.append(", linkIcon=");
        sbLIZ.append(this.linkIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkRichText linkRichText = this.richText;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.linkIcon, i);
    }

    public PDPAppendix(LinkRichText linkRichText, Icon icon) {
        this.richText = linkRichText;
        this.linkIcon = icon;
    }
}
