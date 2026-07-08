package com.ss.android.ugc.aweme.poi.mapdetail.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiFeedFilterKeyCategory implements Serializable {

    @C09CT("display_text")
    public final String displayText;

    @C09CT("icon")
    public final DynamicIcon icon;

    @C09CT("local_service_key_category")
    public final String localServiceKeyCategory;

    public PoiFeedFilterKeyCategory() {
        this(null, null, null);
    }

    public int hashCode() {
        String str = this.localServiceKeyCategory;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DynamicIcon dynamicIcon = this.icon;
        int iHashCode2 = (iHashCode + (dynamicIcon == null ? 0 : dynamicIcon.hashCode())) * 31;
        String str2 = this.displayText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiFeedFilterKeyCategory(localServiceKeyCategory=");
        sbLIZ.append(this.localServiceKeyCategory);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiFeedFilterKeyCategory(String str, DynamicIcon dynamicIcon, String str2) {
        this.localServiceKeyCategory = str;
        this.icon = dynamicIcon;
        this.displayText = str2;
    }
}
