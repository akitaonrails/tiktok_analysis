package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CandInputData {
    public final String LIZ;
    public int LIZIZ;

    @C09CT("shipping_address")
    public final Address address;

    @C09CT("address_valid")
    public final AddressValid addressValid;

    @C09CT("autocomplete_address_id")
    public final String autocompleteAddressId;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("item_type")
    public final Integer itemType;

    @C09CT("latitude")
    public final String latitude;

    @C09CT("longitude")
    public final String longitude;

    @C09CT("place_detail_source")
    public final String placeDetailSource;

    @C09CT("place_type")
    public final Integer placeType;

    @C09CT("rich_view")
    public final List<ShippingAddressRichInfo> richView;

    @C09CT("suggest_type")
    public final Integer suggestType;

    @C09CT("type")
    public final Integer type;

    @C09CT("view_items")
    public final List<ViewItem> viewItems;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandInputData)) {
            return false;
        }
        CandInputData candInputData = (CandInputData) obj;
        return Intrinsics.LJFF(this.type, candInputData.type) && Intrinsics.LJFF(this.itemType, candInputData.itemType) && Intrinsics.LJFF(this.viewItems, candInputData.viewItems) && Intrinsics.LJFF(this.address, candInputData.address) && Intrinsics.LJFF(this.autocompleteAddressId, candInputData.autocompleteAddressId) && Intrinsics.LJFF(this.placeType, candInputData.placeType) && Intrinsics.LJFF(this.longitude, candInputData.longitude) && Intrinsics.LJFF(this.latitude, candInputData.latitude) && Intrinsics.LJFF(this.addressValid, candInputData.addressValid) && Intrinsics.LJFF(this.suggestType, candInputData.suggestType) && Intrinsics.LJFF(this.placeDetailSource, candInputData.placeDetailSource) && Intrinsics.LJFF(this.richView, candInputData.richView) && Intrinsics.LJFF(this.daInfo, candInputData.daInfo) && Intrinsics.LJFF(this.LIZ, candInputData.LIZ);
    }

    public final ShippingAddressRichInfo LIZIZ() {
        List<ShippingAddressRichInfo> list = this.richView;
        ShippingAddressRichInfo shippingAddressRichInfo = null;
        if (list == null) {
            return null;
        }
        Iterator<ShippingAddressRichInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ShippingAddressRichInfo next = it2.next();
            Integer num = next.showType;
            if (num != null && num.intValue() == 0) {
                shippingAddressRichInfo = next;
                break;
            }
        }
        return shippingAddressRichInfo;
    }

    public static CandInputData LIZ(CandInputData candInputData, String str) {
        Integer num = candInputData.type;
        Integer num2 = candInputData.itemType;
        List<ViewItem> list = candInputData.viewItems;
        Address address = candInputData.address;
        String str2 = candInputData.autocompleteAddressId;
        Integer num3 = candInputData.placeType;
        String str3 = candInputData.longitude;
        String str4 = candInputData.latitude;
        AddressValid addressValid = candInputData.addressValid;
        Integer num4 = candInputData.suggestType;
        String str5 = candInputData.placeDetailSource;
        List<ShippingAddressRichInfo> list2 = candInputData.richView;
        String str6 = candInputData.daInfo;
        candInputData.getClass();
        return new CandInputData(num, num2, list, address, str2, num3, str3, str4, addressValid, num4, str5, list2, str6, str);
    }

    public CandInputData(Integer num, Integer num2, List<ViewItem> list, Address address, String str, Integer num3, String str2, String str3, AddressValid addressValid, Integer num4, String str4, List<ShippingAddressRichInfo> list2, String str5, String str6) {
        this.type = num;
        this.itemType = num2;
        this.viewItems = list;
        this.address = address;
        this.autocompleteAddressId = str;
        this.placeType = num3;
        this.longitude = str2;
        this.latitude = str3;
        this.addressValid = addressValid;
        this.suggestType = num4;
        this.placeDetailSource = str4;
        this.richView = list2;
        this.daInfo = str5;
        this.LIZ = str6;
    }
}
