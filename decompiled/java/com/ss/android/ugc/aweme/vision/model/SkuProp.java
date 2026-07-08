package com.ss.android.ugc.aweme.vision.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuProp implements Serializable {

    @C09CT("prop_id")
    public String propId;

    @C09CT("prop_name")
    public String propName;

    @C09CT("prop_value")
    public String propValue;

    @C09CT("prop_value_id")
    public String propValueId;

    public SkuProp() {
        this(null, null, null, null);
    }

    public final void setPropId(String str) {
        this.propId = str;
    }

    public final void setPropName(String str) {
        this.propName = str;
    }

    public final void setPropValue(String str) {
        this.propValue = str;
    }

    public final void setPropValueId(String str) {
        this.propValueId = str;
    }

    public SkuProp(String str, String str2, String str3, String str4) {
        this.propId = str;
        this.propName = str2;
        this.propValueId = str3;
        this.propValue = str4;
    }
}
