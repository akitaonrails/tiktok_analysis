package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LeadMessage;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDiscountView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticTextDTO implements Parcelable {

    @C09CT("delivery_status_text")
    public String deliveryStatusText;

    @C09CT("discount_desc_text")
    public String discountDescText;

    @C09CT("discount_views")
    public List<LogisticDiscountView> discountViews;

    @C09CT("estimated_arrival_text")
    public String estimatedArrivalText;

    @C09CT("estimated_transit_time_text")
    public String estimatedTransitTimeText;

    @C09CT("lead_message")
    public LeadMessage leadMessage;

    @C09CT("lead_time_text")
    public String leadTimeText;

    @C09CT("service_text")
    public String serviceText;

    @C09CT("threshold_text")
    public String thresholdText;

    @C09CT("threshold_text_en")
    public String thresholdTextEn;
    public static final Parcelable.Creator<LogisticTextDTO> CREATOR = new Parcelable.Creator<LogisticTextDTO>() { // from class: X.02Hi
        @Override // android.os.Parcelable.Creator
        public final LogisticTextDTO createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            LeadMessage leadMessageCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LogisticDiscountView.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                leadMessageCreateFromParcel = LeadMessage.CREATOR.createFromParcel(parcel);
            }
            return new LogisticTextDTO(string, string2, string3, string4, string5, string6, arrayList, leadMessageCreateFromParcel, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticTextDTO[] newArray(int i) {
            return new LogisticTextDTO[i];
        }
    };
    public static final int $stable = 8;

    public LogisticTextDTO() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticTextDTO)) {
            return false;
        }
        LogisticTextDTO logisticTextDTO = (LogisticTextDTO) obj;
        return Intrinsics.LJFF(this.discountDescText, logisticTextDTO.discountDescText) && Intrinsics.LJFF(this.serviceText, logisticTextDTO.serviceText) && Intrinsics.LJFF(this.leadTimeText, logisticTextDTO.leadTimeText) && Intrinsics.LJFF(this.deliveryStatusText, logisticTextDTO.deliveryStatusText) && Intrinsics.LJFF(this.thresholdText, logisticTextDTO.thresholdText) && Intrinsics.LJFF(this.thresholdTextEn, logisticTextDTO.thresholdTextEn) && Intrinsics.LJFF(this.discountViews, logisticTextDTO.discountViews) && Intrinsics.LJFF(this.leadMessage, logisticTextDTO.leadMessage) && Intrinsics.LJFF(this.estimatedArrivalText, logisticTextDTO.estimatedArrivalText) && Intrinsics.LJFF(this.estimatedTransitTimeText, logisticTextDTO.estimatedTransitTimeText);
    }

    public final int hashCode() {
        String str = this.discountDescText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serviceText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leadTimeText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deliveryStatusText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.thresholdText;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.thresholdTextEn;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<LogisticDiscountView> list = this.discountViews;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        LeadMessage leadMessage = this.leadMessage;
        int iHashCode8 = (iHashCode7 + (leadMessage == null ? 0 : leadMessage.hashCode())) * 31;
        String str7 = this.estimatedArrivalText;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.estimatedTransitTimeText;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticTextDTO(discountDescText=");
        sbLIZ.append(this.discountDescText);
        sbLIZ.append(", serviceText=");
        sbLIZ.append(this.serviceText);
        sbLIZ.append(", leadTimeText=");
        sbLIZ.append(this.leadTimeText);
        sbLIZ.append(", deliveryStatusText=");
        sbLIZ.append(this.deliveryStatusText);
        sbLIZ.append(", thresholdText=");
        sbLIZ.append(this.thresholdText);
        sbLIZ.append(", thresholdTextEn=");
        sbLIZ.append(this.thresholdTextEn);
        sbLIZ.append(", discountViews=");
        sbLIZ.append(this.discountViews);
        sbLIZ.append(", leadMessage=");
        sbLIZ.append(this.leadMessage);
        sbLIZ.append(", estimatedArrivalText=");
        sbLIZ.append(this.estimatedArrivalText);
        sbLIZ.append(", estimatedTransitTimeText=");
        sbLIZ.append(this.estimatedTransitTimeText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.discountDescText);
        parcel.writeString(this.serviceText);
        parcel.writeString(this.leadTimeText);
        parcel.writeString(this.deliveryStatusText);
        parcel.writeString(this.thresholdText);
        parcel.writeString(this.thresholdTextEn);
        List<LogisticDiscountView> list = this.discountViews;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LogisticDiscountView> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next().discountText);
            }
        }
        LeadMessage leadMessage = this.leadMessage;
        if (leadMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            leadMessage.writeToParcel(parcel, i);
        }
        parcel.writeString(this.estimatedArrivalText);
        parcel.writeString(this.estimatedTransitTimeText);
    }

    public LogisticTextDTO(String str, String str2, String str3, String str4, String str5, String str6, List<LogisticDiscountView> list, LeadMessage leadMessage, String str7, String str8) {
        this.discountDescText = str;
        this.serviceText = str2;
        this.leadTimeText = str3;
        this.deliveryStatusText = str4;
        this.thresholdText = str5;
        this.thresholdTextEn = str6;
        this.discountViews = list;
        this.leadMessage = leadMessage;
        this.estimatedArrivalText = str7;
        this.estimatedTransitTimeText = str8;
    }
}
