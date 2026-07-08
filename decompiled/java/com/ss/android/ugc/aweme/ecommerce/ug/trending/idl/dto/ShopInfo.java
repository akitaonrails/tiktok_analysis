package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ShopInfo implements Serializable {

    @C09CT("shop_id")
    public final String id;

    @C09CT("shop_logo")
    public final Image logo;

    @C09CT("live_schema")
    public final String schema;

    @C09CT("shop_name")
    public final String shopName;

    public ShopInfo() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopInfo)) {
            return false;
        }
        ShopInfo shopInfo = (ShopInfo) obj;
        return Intrinsics.LJFF(this.id, shopInfo.id) && Intrinsics.LJFF(this.shopName, shopInfo.shopName) && Intrinsics.LJFF(this.logo, shopInfo.logo) && Intrinsics.LJFF(this.schema, shopInfo.schema);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shopName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.logo;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.schema;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopInfo(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", shopName=");
        sbLIZ.append(this.shopName);
        sbLIZ.append(", logo=");
        sbLIZ.append(this.logo);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShopInfo(String str, String str2, Image image, String str3) {
        this.id = str;
        this.shopName = str2;
        this.logo = image;
        this.schema = str3;
    }
}
