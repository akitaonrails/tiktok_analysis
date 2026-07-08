package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class RecommendSeedItemDto implements Serializable {

    @C09CT("ac_shop_data")
    public final AcShopDataDto acShopData;

    @C09CT("open_url")
    public final String openUrl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendSeedItemDto)) {
            return false;
        }
        RecommendSeedItemDto recommendSeedItemDto = (RecommendSeedItemDto) obj;
        return Intrinsics.LJFF(this.openUrl, recommendSeedItemDto.openUrl) && Intrinsics.LJFF(this.acShopData, recommendSeedItemDto.acShopData);
    }

    public int hashCode() {
        String str = this.openUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AcShopDataDto acShopDataDto = this.acShopData;
        return iHashCode + (acShopDataDto != null ? acShopDataDto.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendSeedItemDto(openUrl=");
        sbLIZ.append(this.openUrl);
        sbLIZ.append(", acShopData=");
        sbLIZ.append(this.acShopData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendSeedItemDto(String str, AcShopDataDto acShopDataDto) {
        this.openUrl = str;
        this.acShopData = acShopDataDto;
    }
}
