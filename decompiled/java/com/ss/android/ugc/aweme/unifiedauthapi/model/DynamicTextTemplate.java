package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DynamicTextTemplate {

    @C09CT("dynamic_description")
    public final String dynamicDescription;

    @C09CT("dynamic_subtitle")
    public final String dynamicSubtitle;

    @C09CT("dynamic_title")
    public final String dynamicTitle;

    @C09CT("dynamic_values")
    public final List<String> dynamicValues;

    public DynamicTextTemplate() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicTextTemplate)) {
            return false;
        }
        DynamicTextTemplate dynamicTextTemplate = (DynamicTextTemplate) obj;
        return Intrinsics.LJFF(this.dynamicTitle, dynamicTextTemplate.dynamicTitle) && Intrinsics.LJFF(this.dynamicDescription, dynamicTextTemplate.dynamicDescription) && Intrinsics.LJFF(this.dynamicSubtitle, dynamicTextTemplate.dynamicSubtitle) && Intrinsics.LJFF(this.dynamicValues, dynamicTextTemplate.dynamicValues);
    }

    public final int hashCode() {
        String str = this.dynamicTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dynamicDescription;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dynamicSubtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.dynamicValues;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicTextTemplate(dynamicTitle=");
        sbLIZ.append(this.dynamicTitle);
        sbLIZ.append(", dynamicDescription=");
        sbLIZ.append(this.dynamicDescription);
        sbLIZ.append(", dynamicSubtitle=");
        sbLIZ.append(this.dynamicSubtitle);
        sbLIZ.append(", dynamicValues=");
        sbLIZ.append(this.dynamicValues);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DynamicTextTemplate(String str, String str2, String str3, List<String> list) {
        this.dynamicTitle = str;
        this.dynamicDescription = str2;
        this.dynamicSubtitle = str3;
        this.dynamicValues = list;
    }
}
