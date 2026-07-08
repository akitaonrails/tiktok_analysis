package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C1741890vQh;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingTextInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShipFromInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpShipping implements Parcelable {

    @C09CT("logistics")
    public final List<LogisticDTO> logistics;

    @C09CT("ship_from_info")
    public final ShipFromInfo shipFromInfo;

    @C09CT("shipping_service")
    public final ShippingService shippingService;

    @C09CT("shipping_time_notice")
    public final ShippingTextInfo shippingTimeNotice;

    @C09CT("shipping_to_address_info")
    public ShippingTOAddressInfo shippingToAddressInfo;
    public static final Parcelable.Creator<PdpShipping> CREATOR = new Parcelable.Creator<PdpShipping>() { // from class: X.03FK
        @Override // android.os.Parcelable.Creator
        public final PdpShipping createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ShippingTOAddressInfo shippingTOAddressInfoCreateFromParcel;
            ShippingTextInfo shippingTextInfoCreateFromParcel;
            ShippingService shippingServiceCreateFromParcel;
            ShipFromInfo shipFromInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LogisticDTO.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                shippingTOAddressInfoCreateFromParcel = null;
            } else {
                shippingTOAddressInfoCreateFromParcel = ShippingTOAddressInfo.CREATOR.createFromParcel(parcel);
            }
            ShippingTOAddressInfo shippingTOAddressInfo = shippingTOAddressInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                shippingTextInfoCreateFromParcel = null;
            } else {
                shippingTextInfoCreateFromParcel = ShippingTextInfo.CREATOR.createFromParcel(parcel);
            }
            ShippingTextInfo shippingTextInfo = shippingTextInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                shippingServiceCreateFromParcel = null;
            } else {
                shippingServiceCreateFromParcel = ShippingService.CREATOR.createFromParcel(parcel);
            }
            ShippingService shippingService = shippingServiceCreateFromParcel;
            if (parcel.readInt() != 0) {
                shipFromInfoCreateFromParcel = ShipFromInfo.CREATOR.createFromParcel(parcel);
            }
            return new PdpShipping(arrayList, shippingTOAddressInfo, shippingTextInfo, shippingService, shipFromInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpShipping[] newArray(int i) {
            return new PdpShipping[i];
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
        if (!(obj instanceof PdpShipping)) {
            return false;
        }
        PdpShipping pdpShipping = (PdpShipping) obj;
        return Intrinsics.LJFF(this.logistics, pdpShipping.logistics) && Intrinsics.LJFF(this.shippingToAddressInfo, pdpShipping.shippingToAddressInfo) && Intrinsics.LJFF(this.shippingTimeNotice, pdpShipping.shippingTimeNotice) && Intrinsics.LJFF(this.shippingService, pdpShipping.shippingService) && Intrinsics.LJFF(this.shipFromInfo, pdpShipping.shipFromInfo);
    }

    public final int hashCode() {
        List<LogisticDTO> list = this.logistics;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
        int iHashCode2 = (iHashCode + (shippingTOAddressInfo == null ? 0 : shippingTOAddressInfo.hashCode())) * 31;
        ShippingTextInfo shippingTextInfo = this.shippingTimeNotice;
        int iHashCode3 = (iHashCode2 + (shippingTextInfo == null ? 0 : shippingTextInfo.hashCode())) * 31;
        ShippingService shippingService = this.shippingService;
        int iHashCode4 = (iHashCode3 + (shippingService == null ? 0 : shippingService.hashCode())) * 31;
        ShipFromInfo shipFromInfo = this.shipFromInfo;
        return iHashCode4 + (shipFromInfo != null ? shipFromInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpShipping(logistics=");
        sbLIZ.append(this.logistics);
        sbLIZ.append(", shippingToAddressInfo=");
        sbLIZ.append(this.shippingToAddressInfo);
        sbLIZ.append(", shippingTimeNotice=");
        sbLIZ.append(this.shippingTimeNotice);
        sbLIZ.append(", shippingService=");
        sbLIZ.append(this.shippingService);
        sbLIZ.append(", shipFromInfo=");
        sbLIZ.append(this.shipFromInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<String, Object> LIZ() {
        String currency;
        String priceVal;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        List<LogisticDTO> list = this.logistics;
        if (list != null) {
            for (LogisticDTO logisticDTO : list) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Map<String, String> map = logisticDTO.eventTrackInfo;
                if (map != null && (str = map.get("shipping_type")) != null) {
                    linkedHashMap2.put("shipping_type", str);
                }
                Integer num = logisticDTO.deliveryMinDays;
                if (num != null) {
                    linkedHashMap2.put("est_delivery_day_min", Integer.valueOf(num.intValue()));
                }
                Integer num2 = logisticDTO.deliveryMaxDays;
                if (num2 != null) {
                    linkedHashMap2.put("est_delivery_day_max", Integer.valueOf(num2.intValue()));
                }
                com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price = logisticDTO.shippingFee;
                if (price != null && (priceVal = price.getPriceVal()) != null) {
                    linkedHashMap2.put("shipping_price", priceVal);
                }
                com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price2 = logisticDTO.shippingFee;
                if (price2 != null && (currency = price2.getCurrency()) != null) {
                    linkedHashMap2.put("shipping_currency", currency);
                }
                arrayList.add(linkedHashMap2);
            }
        }
        linkedHashMap.put("delivery_info", C1741890vQh.LJIIIIZZ(arrayList));
        return linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<LogisticDTO> list = this.logistics;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LogisticDTO> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
        if (shippingTOAddressInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingTOAddressInfo.writeToParcel(parcel, i);
        }
        ShippingTextInfo shippingTextInfo = this.shippingTimeNotice;
        if (shippingTextInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingTextInfo.writeToParcel(parcel, i);
        }
        ShippingService shippingService = this.shippingService;
        if (shippingService == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(shippingService.shippingRightsContent);
        }
        ShipFromInfo shipFromInfo = this.shipFromInfo;
        if (shipFromInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(shipFromInfo.fromOverseas);
        }
    }

    public PdpShipping(List<LogisticDTO> list, ShippingTOAddressInfo shippingTOAddressInfo, ShippingTextInfo shippingTextInfo, ShippingService shippingService, ShipFromInfo shipFromInfo) {
        this.logistics = list;
        this.shippingToAddressInfo = shippingTOAddressInfo;
        this.shippingTimeNotice = shippingTextInfo;
        this.shippingService = shippingService;
        this.shipFromInfo = shipFromInfo;
    }
}
