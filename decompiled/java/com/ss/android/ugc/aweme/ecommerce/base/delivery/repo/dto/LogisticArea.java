package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C658302hZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticArea implements Parcelable {

    @C09CT("additional_areas")
    public List<ECRichText> additionalAreas;

    @C09CT("background_color")
    public CommonColor backgroundColor;

    @C09CT("click_desc")
    public ECRichText clickDesc;

    @C09CT("clickable")
    public Boolean clickable;

    @C09CT("link")
    public String link;

    @C09CT("logistic_expression_areas")
    public List<LogisticExpressionArea> logisticExpressionAreas;

    @C09CT("style")
    public Integer style;

    @C09CT("title")
    public ECRichText title;
    public static final C658302hZ Companion = new Object() { // from class: X.02hZ
    };
    public static final Parcelable.Creator<LogisticArea> CREATOR = new Parcelable.Creator<LogisticArea>() { // from class: X.02hY
        @Override // android.os.Parcelable.Creator
        public final LogisticArea createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            ArrayList arrayList2;
            CommonColor commonColorCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(LogisticArea.class.getClassLoader());
            boolean z = false;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LogisticExpressionArea.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readParcelable(LogisticArea.class.getClassLoader()));
                }
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                commonColorCreateFromParcel = null;
            } else {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            CommonColor commonColor = commonColorCreateFromParcel;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new LogisticArea(eCRichText, arrayList, numValueOf, arrayList2, string, commonColor, boolValueOf, (ECRichText) parcel.readParcelable(LogisticArea.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticArea[] newArray(int i) {
            return new LogisticArea[i];
        }
    };
    public static final int $stable = 8;

    public LogisticArea() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticArea)) {
            return false;
        }
        LogisticArea logisticArea = (LogisticArea) obj;
        return Intrinsics.LJFF(this.title, logisticArea.title) && Intrinsics.LJFF(this.logisticExpressionAreas, logisticArea.logisticExpressionAreas) && Intrinsics.LJFF(this.style, logisticArea.style) && Intrinsics.LJFF(this.additionalAreas, logisticArea.additionalAreas) && Intrinsics.LJFF(this.link, logisticArea.link) && Intrinsics.LJFF(this.backgroundColor, logisticArea.backgroundColor) && Intrinsics.LJFF(this.clickable, logisticArea.clickable) && Intrinsics.LJFF(this.clickDesc, logisticArea.clickDesc);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        List<LogisticExpressionArea> list = this.logisticExpressionAreas;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.style;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<ECRichText> list2 = this.additionalAreas;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.link;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        CommonColor commonColor = this.backgroundColor;
        int iHashCode6 = (iHashCode5 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        Boolean bool = this.clickable;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        ECRichText eCRichText2 = this.clickDesc;
        return iHashCode7 + (eCRichText2 != null ? eCRichText2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticArea(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", logisticExpressionAreas=");
        sbLIZ.append(this.logisticExpressionAreas);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", additionalAreas=");
        sbLIZ.append(this.additionalAreas);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", clickable=");
        sbLIZ.append(this.clickable);
        sbLIZ.append(", clickDesc=");
        sbLIZ.append(this.clickDesc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        List<LogisticExpressionArea> list = this.logisticExpressionAreas;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LogisticExpressionArea> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.style;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<ECRichText> list2 = this.additionalAreas;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ECRichText> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable(it3.next(), i);
            }
        }
        parcel.writeString(this.link);
        CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
        Boolean bool = this.clickable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.clickDesc, i);
    }

    public LogisticArea(ECRichText eCRichText, List<LogisticExpressionArea> list, Integer num, List<ECRichText> list2, String str, CommonColor commonColor, Boolean bool, ECRichText eCRichText2) {
        this.title = eCRichText;
        this.logisticExpressionAreas = list;
        this.style = num;
        this.additionalAreas = list2;
        this.link = str;
        this.backgroundColor = commonColor;
        this.clickable = bool;
        this.clickDesc = eCRichText2;
    }
}
