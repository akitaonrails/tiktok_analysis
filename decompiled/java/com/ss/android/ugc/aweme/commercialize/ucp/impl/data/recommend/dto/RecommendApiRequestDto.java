package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto;

import X.C09CT;
import X.C0D0I;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class RecommendApiRequestDto implements Serializable {
    public static final C0D0I Companion = new Object() { // from class: X.0D0I
    };

    @C09CT("ac_ad_type")
    public final Integer _acAdType;

    @C09CT("adv_id")
    public final String _advId;

    @C09CT("cid")
    public final String _cid;

    @C09CT("external_product_id")
    public final String _externalProductId;

    @C09CT("pid")
    public final String _pid;

    @C09CT("product_platform_id")
    public final String _productPlatformId;

    @C09CT("protocol_type")
    public final Integer _protocolType;

    @C09CT("shop_id")
    public final String _shopId;

    @C09CT("spu_id")
    public final String _spuId;

    @C09CT("url")
    public final String _url;

    public RecommendApiRequestDto() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendApiRequestDto)) {
            return false;
        }
        RecommendApiRequestDto recommendApiRequestDto = (RecommendApiRequestDto) obj;
        return Intrinsics.LJFF(this._spuId, recommendApiRequestDto._spuId) && Intrinsics.LJFF(this._shopId, recommendApiRequestDto._shopId) && Intrinsics.LJFF(this._url, recommendApiRequestDto._url) && Intrinsics.LJFF(this._advId, recommendApiRequestDto._advId) && Intrinsics.LJFF(this._cid, recommendApiRequestDto._cid) && Intrinsics.LJFF(this._pid, recommendApiRequestDto._pid) && Intrinsics.LJFF(this._productPlatformId, recommendApiRequestDto._productPlatformId) && Intrinsics.LJFF(this._acAdType, recommendApiRequestDto._acAdType) && Intrinsics.LJFF(this._externalProductId, recommendApiRequestDto._externalProductId) && Intrinsics.LJFF(this._protocolType, recommendApiRequestDto._protocolType);
    }

    public int hashCode() {
        String str = this._spuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this._shopId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this._advId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this._cid;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this._pid;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this._productPlatformId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this._acAdType;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this._externalProductId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this._protocolType;
        return iHashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendApiRequestDto(_spuId=");
        sbLIZ.append(this._spuId);
        sbLIZ.append(", _shopId=");
        sbLIZ.append(this._shopId);
        sbLIZ.append(", _url=");
        sbLIZ.append(this._url);
        sbLIZ.append(", _advId=");
        sbLIZ.append(this._advId);
        sbLIZ.append(", _cid=");
        sbLIZ.append(this._cid);
        sbLIZ.append(", _pid=");
        sbLIZ.append(this._pid);
        sbLIZ.append(", _productPlatformId=");
        sbLIZ.append(this._productPlatformId);
        sbLIZ.append(", _acAdType=");
        sbLIZ.append(this._acAdType);
        sbLIZ.append(", _externalProductId=");
        sbLIZ.append(this._externalProductId);
        sbLIZ.append(", _protocolType=");
        sbLIZ.append(this._protocolType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAdvId() {
        String str = this._advId;
        return str == null ? "" : str;
    }

    public final String getCid() {
        String str = this._cid;
        return str == null ? "" : str;
    }

    public final String getExternalProductId() {
        String str = this._externalProductId;
        return str == null ? "" : str;
    }

    public final String getPid() {
        String str = this._pid;
        return str == null ? "" : str;
    }

    public final String getProductPlatformId() {
        String str = this._productPlatformId;
        return str == null ? "" : str;
    }

    public final int getProtocolType() {
        Integer num = this._protocolType;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String getShopId() {
        String str = this._shopId;
        return str == null ? "" : str;
    }

    public final String getSpuId() {
        String str = this._spuId;
        return str == null ? "" : str;
    }

    public final String getUrl() {
        String str = this._url;
        return str == null ? "" : str;
    }

    public final Map<String, String> toQueryMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (isOpenLoopRequest()) {
            if (!a0.LJJJIL(getUrl())) {
                linkedHashMap.put("url", getUrl());
            }
            if (!a0.LJJJIL(getAdvId())) {
                linkedHashMap.put("adv_id", getAdvId());
            }
            if (!a0.LJJJIL(getCid())) {
                linkedHashMap.put("cid", getCid());
            }
            if (!a0.LJJJIL(getSpuId())) {
                linkedHashMap.put("spu_id", getSpuId());
            }
            if (!a0.LJJJIL(getShopId())) {
                linkedHashMap.put("shop_id", getShopId());
            }
            String pid = getPid();
            boolean zIsCatalogOpenLoopRequest = isCatalogOpenLoopRequest();
            String str = CardStruct.IStatusCode.DEFAULT;
            if (!zIsCatalogOpenLoopRequest || !(!a0.LJJJIL(pid)) || pid == null) {
                pid = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("pid", pid);
            String productPlatformId = getProductPlatformId();
            if (isCatalogOpenLoopRequest() && (!a0.LJJJIL(productPlatformId)) && productPlatformId != null) {
                str = productPlatformId;
            }
            linkedHashMap.put("product_platform_id", str);
        } else {
            if (!a0.LJJJIL(getSpuId())) {
                linkedHashMap.put("spu_id", getSpuId());
            }
            if (!a0.LJJJIL(getShopId())) {
                linkedHashMap.put("shop_id", getShopId());
            }
        }
        if (getAcAdType() != null) {
            linkedHashMap.put("ac_ad_type", String.valueOf(getAcAdType()));
        }
        if (getProtocolType() == 1) {
            if (!a0.LJJJIL(getSpuId())) {
                linkedHashMap.put("spu_id", getSpuId());
            }
        } else if (!a0.LJJJIL(getExternalProductId())) {
            linkedHashMap.put("external_product_id", getExternalProductId());
            return linkedHashMap;
        }
        return linkedHashMap;
    }

    public final String getProductId() {
        return getExternalProductId();
    }

    public final boolean isCatalogOpenLoopRequest() {
        Integer acAdType = getAcAdType();
        if (acAdType != null && acAdType.intValue() == 3) {
            return true;
        }
        Integer acAdType2 = getAcAdType();
        return acAdType2 != null && acAdType2.intValue() == 6;
    }

    public final boolean isOpenLoopRequest() {
        Integer acAdType = getAcAdType();
        if (acAdType != null && acAdType.intValue() == 2) {
            return true;
        }
        Integer acAdType2 = getAcAdType();
        if (acAdType2 != null && acAdType2.intValue() == 3) {
            return true;
        }
        Integer acAdType3 = getAcAdType();
        return acAdType3 != null && acAdType3.intValue() == 6;
    }

    public final Integer getAcAdType() {
        return this._acAdType;
    }

    public RecommendApiRequestDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Integer num2) {
        this._spuId = str;
        this._shopId = str2;
        this._url = str3;
        this._advId = str4;
        this._cid = str5;
        this._pid = str6;
        this._productPlatformId = str7;
        this._acAdType = num;
        this._externalProductId = str8;
        this._protocolType = num2;
    }
}
