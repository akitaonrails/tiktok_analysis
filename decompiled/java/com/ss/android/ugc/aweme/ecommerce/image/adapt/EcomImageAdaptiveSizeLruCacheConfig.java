package com.ss.android.ugc.aweme.ecommerce.image.adapt;

import X.C09CT;
import X.C13BV;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomImageAdaptiveSizeLruCacheConfig {

    @C09CT("read")
    public List<? extends Map<String, String>> read;

    @C09CT("write")
    public List<? extends Map<String, String>> write;

    public EcomImageAdaptiveSizeLruCacheConfig() {
        C13BV c13bv = C13BV.INSTANCE;
        this.read = c13bv;
        this.write = c13bv;
    }
}
