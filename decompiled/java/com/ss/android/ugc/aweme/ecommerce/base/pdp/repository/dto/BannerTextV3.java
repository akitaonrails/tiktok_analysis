package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerTextV3;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerTextV3 implements Parcelable {

    @C09CT("ec_rich_texts")
    public final List<ECRichText> ecRichTexts;

    @C09CT("prefix_icon")
    public final Icon prefixIcon;

    @C09CT("suffix_icon")
    public final Icon suffixIcon;
    public static final Parcelable.Creator<BannerTextV3> CREATOR = new Parcelable.Creator<BannerTextV3>() { // from class: X.036q
        @Override // android.os.Parcelable.Creator
        public final BannerTextV3 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Icon icon = (Icon) parcel.readParcelable(BannerTextV3.class.getClassLoader());
            Icon icon2 = (Icon) parcel.readParcelable(BannerTextV3.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(BannerTextV3.class.getClassLoader()));
                }
            }
            return new BannerTextV3(icon, icon2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerTextV3[] newArray(int i) {
            return new BannerTextV3[i];
        }
    };
    public static final int $stable = 8;

    public BannerTextV3() {
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
        if (!(obj instanceof BannerTextV3)) {
            return false;
        }
        BannerTextV3 bannerTextV3 = (BannerTextV3) obj;
        return Intrinsics.LJFF(this.prefixIcon, bannerTextV3.prefixIcon) && Intrinsics.LJFF(this.suffixIcon, bannerTextV3.suffixIcon) && Intrinsics.LJFF(this.ecRichTexts, bannerTextV3.ecRichTexts);
    }

    public final int hashCode() {
        Icon icon = this.prefixIcon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        Icon icon2 = this.suffixIcon;
        int iHashCode2 = (iHashCode + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        List<ECRichText> list = this.ecRichTexts;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BannerTextV3(prefixIcon=");
        sbLIZ.append(this.prefixIcon);
        sbLIZ.append(", suffixIcon=");
        sbLIZ.append(this.suffixIcon);
        sbLIZ.append(", ecRichTexts=");
        sbLIZ.append(this.ecRichTexts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.prefixIcon, i);
        parcel.writeParcelable(this.suffixIcon, i);
        List<ECRichText> list = this.ecRichTexts;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ECRichText> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public BannerTextV3(Icon icon, Icon icon2, List<ECRichText> list) {
        this.prefixIcon = icon;
        this.suffixIcon = icon2;
        this.ecRichTexts = list;
    }
}
