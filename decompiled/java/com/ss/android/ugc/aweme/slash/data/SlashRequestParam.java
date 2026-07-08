package com.ss.android.ugc.aweme.slash.data;

import X.C2188811AlT;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashRequestParam {
    public final Object businessBodyParam;
    public final Map<String, String> businessQueryParam;
    public final Object customBusinessQueryParam;
    public final String scene;
    public final String serviceType;
    public final Object slashParam;

    public final SlashRequestParam copy(String str, String str2, Object obj, Map<String, String> map, Object obj2, Object obj3) {
        return new SlashRequestParam(str, str2, obj, map, obj2, obj3);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashRequestParam(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", serviceType=");
        sbLIZ.append(this.serviceType);
        sbLIZ.append(", slashParam=");
        sbLIZ.append(this.slashParam);
        sbLIZ.append(", businessQueryParam=");
        sbLIZ.append(this.businessQueryParam);
        sbLIZ.append(", customBusinessQueryParam=");
        sbLIZ.append(this.customBusinessQueryParam);
        sbLIZ.append(", businessBodyParam=");
        sbLIZ.append(this.businessBodyParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SlashRequestParam(String str, String str2, Object obj, Map<String, String> map, Object obj2, Object obj3) {
        this.scene = str;
        this.serviceType = str2;
        this.slashParam = obj;
        this.businessQueryParam = map;
        this.customBusinessQueryParam = obj2;
        this.businessBodyParam = obj3;
    }
}
