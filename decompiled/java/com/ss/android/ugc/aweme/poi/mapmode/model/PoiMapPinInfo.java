package com.ss.android.ugc.aweme.poi.mapmode.model;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC1177370gkB;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapPinInfo implements Serializable {

    @C09CT("display_text")
    public final String displayText;

    @C09CT("pin_type")
    public final Integer pinType;

    public PoiMapPinInfo() {
        this(null, null);
    }

    public int hashCode() {
        Integer num = this.pinType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.displayText;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapPinInfo(pinType=");
        sbLIZ.append(this.pinType);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC1177370gkB getPinType() {
        String str = this.displayText;
        if (str == null || str.length() == 0) {
            return EnumC1177370gkB.NONE;
        }
        Integer num = this.pinType;
        if (num != null) {
            if (num.intValue() == 1) {
                return EnumC1177370gkB.CHART;
            }
            if (num.intValue() == 2) {
                return EnumC1177370gkB.FAVORITE;
            }
            if (num.intValue() == 3) {
                return EnumC1177370gkB.HIGHLIGHT;
            }
            if (num.intValue() == 4) {
                return EnumC1177370gkB.TRUST;
            }
        }
        return EnumC1177370gkB.NONE;
    }

    public PoiMapPinInfo(Integer num, String str) {
        this.pinType = num;
        this.displayText = str;
    }
}
