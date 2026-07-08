package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.PudoServiceList;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticExpressionArea implements Parcelable {

    @C09CT("descriptions_icon")
    public Icon descriptionsIcon;

    @C09CT("extra_info")
    public LogisticsExpressionAreaExtraInfo extraInfo;

    @C09CT("logistic_price")
    public ECRichText logisticPrice;

    @C09CT("logistics_descriptions")
    public List<ECRichText> logisticsDescriptions;

    @C09CT("logistics_expression_sub_area")
    public List<LogisticExpressionArea> logisticsExpressionSubArea;

    @C09CT("pudo_service_list")
    public PudoServiceList pudoServiceList;

    @C09CT("selected_status")
    public Boolean selectedStatus;

    @C09CT("shipping_type")
    public Integer shippingType;

    @C09CT("title")
    public ECRichText title;

    @C09CT("title_icon")
    public Icon titleIcon;
    public static final Parcelable.Creator<LogisticExpressionArea> CREATOR = new Parcelable.Creator<LogisticExpressionArea>() { // from class: X.02hT
        @Override // android.os.Parcelable.Creator
        public final LogisticExpressionArea createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfoCreateFromParcel;
            boolean z;
            Boolean boolValueOf;
            PudoServiceList pudoServiceListCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(LogisticExpressionArea.class.getClassLoader());
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(LogisticExpressionArea.class.getClassLoader()));
                }
            }
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(LogisticExpressionArea.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                logisticsExpressionAreaExtraInfoCreateFromParcel = null;
            } else {
                logisticsExpressionAreaExtraInfoCreateFromParcel = LogisticsExpressionAreaExtraInfo.CREATOR.createFromParcel(parcel);
            }
            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = logisticsExpressionAreaExtraInfoCreateFromParcel;
            Icon icon = (Icon) parcel.readParcelable(LogisticExpressionArea.class.getClassLoader());
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
            if (parcel.readInt() == 0) {
                pudoServiceListCreateFromParcel = null;
            } else {
                pudoServiceListCreateFromParcel = PudoServiceList.CREATOR.createFromParcel(parcel);
            }
            PudoServiceList pudoServiceList = pudoServiceListCreateFromParcel;
            Icon icon2 = (Icon) parcel.readParcelable(LogisticExpressionArea.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(LogisticExpressionArea.CREATOR.createFromParcel(parcel));
                }
            }
            return new LogisticExpressionArea(eCRichText, arrayList, eCRichText2, numValueOf, logisticsExpressionAreaExtraInfo, icon, boolValueOf, pudoServiceList, icon2, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticExpressionArea[] newArray(int i) {
            return new LogisticExpressionArea[i];
        }
    };
    public static final int $stable = 8;

    public LogisticExpressionArea() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticExpressionArea)) {
            return false;
        }
        LogisticExpressionArea logisticExpressionArea = (LogisticExpressionArea) obj;
        return Intrinsics.LJFF(this.title, logisticExpressionArea.title) && Intrinsics.LJFF(this.logisticsDescriptions, logisticExpressionArea.logisticsDescriptions) && Intrinsics.LJFF(this.logisticPrice, logisticExpressionArea.logisticPrice) && Intrinsics.LJFF(this.shippingType, logisticExpressionArea.shippingType) && Intrinsics.LJFF(this.extraInfo, logisticExpressionArea.extraInfo) && Intrinsics.LJFF(this.descriptionsIcon, logisticExpressionArea.descriptionsIcon) && Intrinsics.LJFF(this.selectedStatus, logisticExpressionArea.selectedStatus) && Intrinsics.LJFF(this.pudoServiceList, logisticExpressionArea.pudoServiceList) && Intrinsics.LJFF(this.titleIcon, logisticExpressionArea.titleIcon) && Intrinsics.LJFF(this.logisticsExpressionSubArea, logisticExpressionArea.logisticsExpressionSubArea);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        List<ECRichText> list = this.logisticsDescriptions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ECRichText eCRichText2 = this.logisticPrice;
        int iHashCode3 = (iHashCode2 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        Integer num = this.shippingType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = this.extraInfo;
        int iHashCode5 = (iHashCode4 + (logisticsExpressionAreaExtraInfo == null ? 0 : logisticsExpressionAreaExtraInfo.hashCode())) * 31;
        Icon icon = this.descriptionsIcon;
        int iHashCode6 = (iHashCode5 + (icon == null ? 0 : icon.hashCode())) * 31;
        Boolean bool = this.selectedStatus;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        PudoServiceList pudoServiceList = this.pudoServiceList;
        int iHashCode8 = (iHashCode7 + (pudoServiceList == null ? 0 : pudoServiceList.hashCode())) * 31;
        Icon icon2 = this.titleIcon;
        int iHashCode9 = (iHashCode8 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        List<LogisticExpressionArea> list2 = this.logisticsExpressionSubArea;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticExpressionArea(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", logisticsDescriptions=");
        sbLIZ.append(this.logisticsDescriptions);
        sbLIZ.append(", logisticPrice=");
        sbLIZ.append(this.logisticPrice);
        sbLIZ.append(", shippingType=");
        sbLIZ.append(this.shippingType);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(", descriptionsIcon=");
        sbLIZ.append(this.descriptionsIcon);
        sbLIZ.append(", selectedStatus=");
        sbLIZ.append(this.selectedStatus);
        sbLIZ.append(", pudoServiceList=");
        sbLIZ.append(this.pudoServiceList);
        sbLIZ.append(", titleIcon=");
        sbLIZ.append(this.titleIcon);
        sbLIZ.append(", logisticsExpressionSubArea=");
        sbLIZ.append(this.logisticsExpressionSubArea);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        List<ECRichText> list = this.logisticsDescriptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ECRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeParcelable(this.logisticPrice, i);
        Integer num = this.shippingType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = this.extraInfo;
        if (logisticsExpressionAreaExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticsExpressionAreaExtraInfo.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.descriptionsIcon, i);
        Boolean bool = this.selectedStatus;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        PudoServiceList pudoServiceList = this.pudoServiceList;
        if (pudoServiceList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pudoServiceList.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.titleIcon, i);
        List<LogisticExpressionArea> list2 = this.logisticsExpressionSubArea;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<LogisticExpressionArea> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public LogisticExpressionArea(ECRichText eCRichText, List<ECRichText> list, ECRichText eCRichText2, Integer num, LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo, Icon icon, Boolean bool, PudoServiceList pudoServiceList, Icon icon2, List<LogisticExpressionArea> list2) {
        this.title = eCRichText;
        this.logisticsDescriptions = list;
        this.logisticPrice = eCRichText2;
        this.shippingType = num;
        this.extraInfo = logisticsExpressionAreaExtraInfo;
        this.descriptionsIcon = icon;
        this.selectedStatus = bool;
        this.pudoServiceList = pudoServiceList;
        this.titleIcon = icon2;
        this.logisticsExpressionSubArea = list2;
    }
}
