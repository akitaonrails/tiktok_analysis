package com.ss.android.ugc.aweme.ecommerce.image.adapt;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class EcomImageXConfigAdaptTemplate {

    @C09CT("quality_stages")
    public final List<String> qualityStages;

    @C09CT("template")
    public final String template;

    public EcomImageXConfigAdaptTemplate() {
        this(null, null);
    }

    public final int hashCode() {
        String str = this.template;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.qualityStages;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public EcomImageXConfigAdaptTemplate(String str, List<String> list) {
        this.template = str;
        this.qualityStages = list;
    }
}
