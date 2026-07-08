package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C098200Yq;
import X.C09CT;
import X.C1175120ggY;
import X.C1201190hMb;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class SkuListData extends BaseComponentData implements Serializable {

    @C09CT("poi_name")
    public final String poiName;

    @C09CT("poi_prefix")
    public final String poiPrefix;

    @C09CT("sku_list")
    public final List<SkuData> skuDataList;

    public final SkuListData copy(String str, String str2, List<SkuData> list) {
        return new SkuListData(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuListData)) {
            return false;
        }
        SkuListData skuListData = (SkuListData) obj;
        return Intrinsics.LJFF(this.poiName, skuListData.poiName) && Intrinsics.LJFF(this.poiPrefix, skuListData.poiPrefix) && Intrinsics.LJFF(this.skuDataList, skuListData.skuDataList);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public final String getSkuPriceList() {
        Object c098200Yq;
        try {
            List<SkuData> list = this.skuDataList;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (SkuData skuData : list) {
                    JSONObject jSONObject = new JSONObject();
                    SkuPrice skuPrice = skuData.price;
                    String str = skuPrice != null ? skuPrice.currency : null;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("currency", str);
                    SkuPrice skuPrice2 = skuData.price;
                    jSONObject.put("original_price_num", C1175120ggY.LIZ(skuPrice2 != null ? skuPrice2.originalPriceNum : null));
                    SkuPrice skuPrice3 = skuData.price;
                    jSONObject.put("offer_price_num", C1175120ggY.LIZ(skuPrice3 != null ? skuPrice3.offerPriceNum : null));
                    arrayList.add(jSONObject);
                }
                c098200Yq = arrayList.toString();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public int hashCode() {
        String str = this.poiName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.poiPrefix;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SkuData> list = this.skuDataList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuListData(poiName=");
        sbLIZ.append(this.poiName);
        sbLIZ.append(", poiPrefix=");
        sbLIZ.append(this.poiPrefix);
        sbLIZ.append(", skuDataList=");
        sbLIZ.append(this.skuDataList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMobMerchantIds() {
        List<SkuData> list = this.skuDataList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<SkuData> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().merchantId;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
        }
        return "";
    }

    public final String getMobProductIds() {
        List<SkuData> list = this.skuDataList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<SkuData> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().productId;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
        }
        return "";
    }

    public final String getMobProductQuantities() {
        StringBuilder sb = new StringBuilder();
        List<SkuData> list = this.skuDataList;
        if (list != null) {
            int i = 0;
            for (SkuData skuData : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                sb.append(skuData.num);
                if (i > 0) {
                    sb.append(",");
                }
                i = i2;
            }
        }
        return sb.toString();
    }

    public final String getMobSkuIds() {
        List<SkuData> list = this.skuDataList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<SkuData> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().skuId;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
        }
        return "";
    }

    public final SkuPrice getSkuPrice() {
        SkuData skuData;
        List<SkuData> list = this.skuDataList;
        if (list == null || (skuData = (SkuData) C13LP.LJJJLZIJ(0, list)) == null) {
            return null;
        }
        return skuData.price;
    }

    public final boolean isOutOfStock() {
        List<SkuData> list = this.skuDataList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<SkuData> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().isOutOfStock(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final String getPoiName() {
        return this.poiName;
    }

    public final String getPoiPrefix() {
        return this.poiPrefix;
    }

    public final List<SkuData> getSkuDataList() {
        return this.skuDataList;
    }

    public SkuListData(String str, String str2, List<SkuData> list) {
        this.poiName = str;
        this.poiPrefix = str2;
        this.skuDataList = list;
    }
}
