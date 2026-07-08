package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.XLLinkRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class XLLinkRichText implements Parcelable {

    @C09CT("li_texts")
    public final List<LogisticLinkRichText> liTexts;

    @C09CT("xl_type")
    public final Integer xlType;
    public static final Parcelable.Creator<XLLinkRichText> CREATOR = new Parcelable.Creator<XLLinkRichText>() { // from class: X.0mg0
        @Override // android.os.Parcelable.Creator
        public final XLLinkRichText createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LogisticLinkRichText.CREATOR.createFromParcel(parcel));
                }
            }
            return new XLLinkRichText(numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final XLLinkRichText[] newArray(int i) {
            return new XLLinkRichText[i];
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
        if (!(obj instanceof XLLinkRichText)) {
            return false;
        }
        XLLinkRichText xLLinkRichText = (XLLinkRichText) obj;
        return Intrinsics.LJFF(this.xlType, xLLinkRichText.xlType) && Intrinsics.LJFF(this.liTexts, xLLinkRichText.liTexts);
    }

    public final int hashCode() {
        Integer num = this.xlType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<LogisticLinkRichText> list = this.liTexts;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("XLLinkRichText(xlType=");
        sbLIZ.append(this.xlType);
        sbLIZ.append(", liTexts=");
        sbLIZ.append(this.liTexts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.xlType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<LogisticLinkRichText> list = this.liTexts;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<LogisticLinkRichText> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public XLLinkRichText(Integer num, List<LogisticLinkRichText> list) {
        this.xlType = num;
        this.liTexts = list;
    }
}
