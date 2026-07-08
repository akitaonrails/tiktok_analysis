package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page;

import X.C033W;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.InterfaceC718502rH;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PageProductInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PageSaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PageSkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PageSkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpPageDataModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpPageDataModel implements Parcelable, InterfaceC718502rH {

    @C09CT("event_tracking_trigger_keys")
    public final Map<String, String> eventTrackingTriggerKeys;

    @C09CT("pdp_page_product")
    public final PageProductInfo productInfo;

    @C09CT("pdp_page_sale_props")
    public final List<PageSaleProp> saleProps;

    @C09CT("pdp_page_skc")
    public final SkcInfo skcInfo;

    @C09CT("pdp_page_sku_common_config")
    public final PageSkuCommonConfig skuCommonConfig;

    @C09CT("pdp_page_skus")
    public final List<PageSkuItem> skus;
    public static final Parcelable.Creator<PdpPageDataModel> CREATOR = new Parcelable.Creator<PdpPageDataModel>() { // from class: X.02rF
        @Override // android.os.Parcelable.Creator
        public final PdpPageDataModel createFromParcel(Parcel parcel) {
            PageProductInfo pageProductInfoCreateFromParcel;
            ArrayList arrayList;
            SkcInfo skcInfoCreateFromParcel;
            ArrayList arrayList2;
            PageSkuCommonConfig pageSkuCommonConfigCreateFromParcel;
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                pageProductInfoCreateFromParcel = null;
            } else {
                pageProductInfoCreateFromParcel = PageProductInfo.CREATOR.createFromParcel(parcel);
            }
            PageProductInfo pageProductInfo = pageProductInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PageSaleProp.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                skcInfoCreateFromParcel = null;
            } else {
                skcInfoCreateFromParcel = SkcInfo.CREATOR.createFromParcel(parcel);
            }
            SkcInfo skcInfo = skcInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(PageSkuItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                pageSkuCommonConfigCreateFromParcel = null;
            } else {
                pageSkuCommonConfigCreateFromParcel = PageSkuCommonConfig.CREATOR.createFromParcel(parcel);
            }
            PageSkuCommonConfig pageSkuCommonConfig = pageSkuCommonConfigCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new PdpPageDataModel(pageProductInfo, arrayList, skcInfo, arrayList2, pageSkuCommonConfig, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpPageDataModel[] newArray(int i) {
            return new PdpPageDataModel[i];
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
        if (!(obj instanceof PdpPageDataModel)) {
            return false;
        }
        PdpPageDataModel pdpPageDataModel = (PdpPageDataModel) obj;
        return Intrinsics.LJFF(this.productInfo, pdpPageDataModel.productInfo) && Intrinsics.LJFF(this.saleProps, pdpPageDataModel.saleProps) && Intrinsics.LJFF(this.skcInfo, pdpPageDataModel.skcInfo) && Intrinsics.LJFF(this.skus, pdpPageDataModel.skus) && Intrinsics.LJFF(this.skuCommonConfig, pdpPageDataModel.skuCommonConfig) && Intrinsics.LJFF(this.eventTrackingTriggerKeys, pdpPageDataModel.eventTrackingTriggerKeys);
    }

    public final int hashCode() {
        PageProductInfo pageProductInfo = this.productInfo;
        int iHashCode = (pageProductInfo == null ? 0 : pageProductInfo.hashCode()) * 31;
        List<PageSaleProp> list = this.saleProps;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        SkcInfo skcInfo = this.skcInfo;
        int iHashCode3 = (iHashCode2 + (skcInfo == null ? 0 : skcInfo.hashCode())) * 31;
        List<PageSkuItem> list2 = this.skus;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PageSkuCommonConfig pageSkuCommonConfig = this.skuCommonConfig;
        int iHashCode5 = (iHashCode4 + (pageSkuCommonConfig == null ? 0 : pageSkuCommonConfig.hashCode())) * 31;
        Map<String, String> map = this.eventTrackingTriggerKeys;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpPageDataModel(productInfo=");
        sbLIZ.append(this.productInfo);
        sbLIZ.append(", saleProps=");
        sbLIZ.append(this.saleProps);
        sbLIZ.append(", skcInfo=");
        sbLIZ.append(this.skcInfo);
        sbLIZ.append(", skus=");
        sbLIZ.append(this.skus);
        sbLIZ.append(", skuCommonConfig=");
        sbLIZ.append(this.skuCommonConfig);
        sbLIZ.append(", eventTrackingTriggerKeys=");
        sbLIZ.append(this.eventTrackingTriggerKeys);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PageProductInfo pageProductInfo = this.productInfo;
        if (pageProductInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pageProductInfo.writeToParcel(parcel, i);
        }
        List<PageSaleProp> list = this.saleProps;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PageSaleProp> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        SkcInfo skcInfo = this.skcInfo;
        if (skcInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skcInfo.writeToParcel(parcel, i);
        }
        List<PageSkuItem> list2 = this.skus;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PageSkuItem> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        PageSkuCommonConfig pageSkuCommonConfig = this.skuCommonConfig;
        if (pageSkuCommonConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pageSkuCommonConfig.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.eventTrackingTriggerKeys;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    @Override // X.InterfaceC718502rH
    public final List<InterfaceC746802vq> LIZ(C033W c033w) {
        return C13BV.INSTANCE;
    }

    public PdpPageDataModel(PageProductInfo pageProductInfo, List<PageSaleProp> list, SkcInfo skcInfo, List<PageSkuItem> list2, PageSkuCommonConfig pageSkuCommonConfig, Map<String, String> map) {
        this.productInfo = pageProductInfo;
        this.saleProps = list;
        this.skcInfo = skcInfo;
        this.skus = list2;
        this.skuCommonConfig = pageSkuCommonConfig;
        this.eventTrackingTriggerKeys = map;
    }
}
