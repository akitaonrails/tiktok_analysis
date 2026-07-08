package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiStyleConfig implements Serializable {

    @C09CT("food_header_refactor_type")
    public final Integer foodHeaderRefactorType;

    @C09CT("hotel_header_refactor_type")
    public final Integer hotelHeaderRefactorType;

    @C09CT("travel_header_refactor_type")
    public final Integer travelHeaderRefactorType;

    public PoiStyleConfig() {
        this(null, null, null);
    }

    public int hashCode() {
        Integer num = this.hotelHeaderRefactorType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.travelHeaderRefactorType;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.foodHeaderRefactorType;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiStyleConfig(hotelHeaderRefactorType=");
        sbLIZ.append(this.hotelHeaderRefactorType);
        sbLIZ.append(", travelHeaderRefactorType=");
        sbLIZ.append(this.travelHeaderRefactorType);
        sbLIZ.append(", foodHeaderRefactorType=");
        sbLIZ.append(this.foodHeaderRefactorType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiStyleConfig(Integer num, Integer num2, Integer num3) {
        this.hotelHeaderRefactorType = num;
        this.travelHeaderRefactorType = num2;
        this.foodHeaderRefactorType = num3;
    }
}
