package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticsDescription implements Parcelable {

    @C09CT("appendix_template")
    public LogisticLinkRichText appendixTemplate;

    @C09CT("delivery_name")
    public String deliveryName;

    @C09CT("description_title")
    public String descriptionTitle;

    @C09CT("descriptions")
    public List<LogisticLinkRichText> descriptions;

    @C09CT("logistics_rich_text")
    public LogisticLinkRichText logisticsRichText;

    @C09CT("shipping_fee")
    public com.ss.android.ugc.aweme.ecommerce.base.common.model.Price shippingFee;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_dark_color")
    public String textDarkColor;
    public static final Parcelable.Creator<LogisticsDescription> CREATOR = new Parcelable.Creator<LogisticsDescription>() { // from class: X.02mS
        @Override // android.os.Parcelable.Creator
        public final LogisticsDescription createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LogisticLinkRichText logisticLinkRichTextCreateFromParcel;
            LogisticLinkRichText logisticLinkRichTextCreateFromParcel2;
            String string = parcel.readString();
            Price priceCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LogisticLinkRichText.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                logisticLinkRichTextCreateFromParcel = null;
            } else {
                logisticLinkRichTextCreateFromParcel = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
            }
            LogisticLinkRichText logisticLinkRichText = logisticLinkRichTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                logisticLinkRichTextCreateFromParcel2 = null;
            } else {
                logisticLinkRichTextCreateFromParcel2 = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
            }
            LogisticLinkRichText logisticLinkRichText2 = logisticLinkRichTextCreateFromParcel2;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                priceCreateFromParcel = Price.CREATOR.createFromParcel(parcel);
            }
            return new LogisticsDescription(string, arrayList, logisticLinkRichText, logisticLinkRichText2, string2, string3, string4, priceCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticsDescription[] newArray(int i) {
            return new LogisticsDescription[i];
        }
    };
    public static final int $stable = 8;

    public LogisticsDescription() {
        this(null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticsDescription)) {
            return false;
        }
        LogisticsDescription logisticsDescription = (LogisticsDescription) obj;
        return Intrinsics.LJFF(this.descriptionTitle, logisticsDescription.descriptionTitle) && Intrinsics.LJFF(this.descriptions, logisticsDescription.descriptions) && Intrinsics.LJFF(this.appendixTemplate, logisticsDescription.appendixTemplate) && Intrinsics.LJFF(this.logisticsRichText, logisticsDescription.logisticsRichText) && Intrinsics.LJFF(this.textColor, logisticsDescription.textColor) && Intrinsics.LJFF(this.textDarkColor, logisticsDescription.textDarkColor) && Intrinsics.LJFF(this.deliveryName, logisticsDescription.deliveryName) && Intrinsics.LJFF(this.shippingFee, logisticsDescription.shippingFee);
    }

    public final int hashCode() {
        String str = this.descriptionTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<LogisticLinkRichText> list = this.descriptions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        LogisticLinkRichText logisticLinkRichText = this.appendixTemplate;
        int iHashCode3 = (iHashCode2 + (logisticLinkRichText == null ? 0 : logisticLinkRichText.hashCode())) * 31;
        LogisticLinkRichText logisticLinkRichText2 = this.logisticsRichText;
        int iHashCode4 = (iHashCode3 + (logisticLinkRichText2 == null ? 0 : logisticLinkRichText2.hashCode())) * 31;
        String str2 = this.textColor;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textDarkColor;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deliveryName;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price = this.shippingFee;
        return iHashCode7 + (price != null ? price.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticsDescription(descriptionTitle=");
        sbLIZ.append(this.descriptionTitle);
        sbLIZ.append(", descriptions=");
        sbLIZ.append(this.descriptions);
        sbLIZ.append(", appendixTemplate=");
        sbLIZ.append(this.appendixTemplate);
        sbLIZ.append(", logisticsRichText=");
        sbLIZ.append(this.logisticsRichText);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", textDarkColor=");
        sbLIZ.append(this.textDarkColor);
        sbLIZ.append(", deliveryName=");
        sbLIZ.append(this.deliveryName);
        sbLIZ.append(", shippingFee=");
        sbLIZ.append(this.shippingFee);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.descriptionTitle);
        List<LogisticLinkRichText> list = this.descriptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LogisticLinkRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        LogisticLinkRichText logisticLinkRichText = this.appendixTemplate;
        if (logisticLinkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticLinkRichText.writeToParcel(parcel, i);
        }
        LogisticLinkRichText logisticLinkRichText2 = this.logisticsRichText;
        if (logisticLinkRichText2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticLinkRichText2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.textColor);
        parcel.writeString(this.textDarkColor);
        parcel.writeString(this.deliveryName);
        com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price = this.shippingFee;
        if (price == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price.writeToParcel(parcel, i);
        }
    }

    public LogisticsDescription(String str, List<LogisticLinkRichText> list, LogisticLinkRichText logisticLinkRichText, LogisticLinkRichText logisticLinkRichText2, String str2, String str3, String str4, com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price) {
        this.descriptionTitle = str;
        this.descriptions = list;
        this.appendixTemplate = logisticLinkRichText;
        this.logisticsRichText = logisticLinkRichText2;
        this.textColor = str2;
        this.textDarkColor = str3;
        this.deliveryName = str4;
        this.shippingFee = price;
    }
}
