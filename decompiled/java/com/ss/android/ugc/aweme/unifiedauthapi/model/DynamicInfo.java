package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicInfo {

    @C09CT("dynamic_text_data")
    public final Map<String, String> dynamicTextData;

    @C09CT("dynamic_text_template")
    public final DynamicTextTemplate dynamicTextTemplate;

    public DynamicInfo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicInfo)) {
            return false;
        }
        DynamicInfo dynamicInfo = (DynamicInfo) obj;
        return Intrinsics.LJFF(this.dynamicTextData, dynamicInfo.dynamicTextData) && Intrinsics.LJFF(this.dynamicTextTemplate, dynamicInfo.dynamicTextTemplate);
    }

    public final int hashCode() {
        Map<String, String> map = this.dynamicTextData;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        DynamicTextTemplate dynamicTextTemplate = this.dynamicTextTemplate;
        return iHashCode + (dynamicTextTemplate != null ? dynamicTextTemplate.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicInfo(dynamicTextData=");
        sbLIZ.append(this.dynamicTextData);
        sbLIZ.append(", dynamicTextTemplate=");
        sbLIZ.append(this.dynamicTextTemplate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DynamicInfo(Map<String, String> map, DynamicTextTemplate dynamicTextTemplate) {
        this.dynamicTextData = map;
        this.dynamicTextTemplate = dynamicTextTemplate;
    }
}
