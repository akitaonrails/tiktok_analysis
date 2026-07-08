package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailTagContent implements Serializable {

    @C09CT("common_text")
    public final String commonText;

    @C09CT("opening_time")
    public final OpeningTimeInfo openingTime;

    @C09CT("price_info")
    public final PriceInfo priceInfo;

    public PoiDetailTagContent() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDetailTagContent)) {
            return false;
        }
        PoiDetailTagContent poiDetailTagContent = (PoiDetailTagContent) obj;
        return Intrinsics.LJFF(this.commonText, poiDetailTagContent.commonText) && Intrinsics.LJFF(this.priceInfo, poiDetailTagContent.priceInfo) && Intrinsics.LJFF(this.openingTime, poiDetailTagContent.openingTime);
    }

    public int hashCode() {
        String str = this.commonText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PriceInfo priceInfo = this.priceInfo;
        int iHashCode2 = (iHashCode + (priceInfo == null ? 0 : priceInfo.hashCode())) * 31;
        OpeningTimeInfo openingTimeInfo = this.openingTime;
        return iHashCode2 + (openingTimeInfo != null ? openingTimeInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailTagContent(commonText=");
        sbLIZ.append(this.commonText);
        sbLIZ.append(", priceInfo=");
        sbLIZ.append(this.priceInfo);
        sbLIZ.append(", openingTime=");
        sbLIZ.append(this.openingTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiDetailTagContent(String str, PriceInfo priceInfo, OpeningTimeInfo openingTimeInfo) {
        this.commonText = str;
        this.priceInfo = priceInfo;
        this.openingTime = openingTimeInfo;
    }
}
