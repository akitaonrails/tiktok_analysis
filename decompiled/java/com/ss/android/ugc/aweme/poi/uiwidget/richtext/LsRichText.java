package com.ss.android.ugc.aweme.poi.uiwidget.richtext;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LsRichText implements Serializable {

    @C09CT("arguments")
    public final List<LsRichTextItem> arguments;

    @C09CT("attribute")
    public final String attribute;

    @C09CT("extra_info")
    public final Map<String, String> extraInfo;

    @C09CT("template")
    public final String template;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LsRichText)) {
            return false;
        }
        LsRichText lsRichText = (LsRichText) obj;
        return Intrinsics.LJFF(this.template, lsRichText.template) && Intrinsics.LJFF(this.arguments, lsRichText.arguments) && Intrinsics.LJFF(this.attribute, lsRichText.attribute) && Intrinsics.LJFF(this.extraInfo, lsRichText.extraInfo);
    }

    public int hashCode() {
        String str = this.template;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<LsRichTextItem> list = this.arguments;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.attribute;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.extraInfo;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LsRichText(template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(", attribute=");
        sbLIZ.append(this.attribute);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LsRichText(String str, List<LsRichTextItem> list, String str2, Map<String, String> map) {
        this.template = str;
        this.arguments = list;
        this.attribute = str2;
        this.extraInfo = map;
    }
}
