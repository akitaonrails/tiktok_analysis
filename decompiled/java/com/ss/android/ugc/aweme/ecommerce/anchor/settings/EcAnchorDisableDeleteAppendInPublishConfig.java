package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class EcAnchorDisableDeleteAppendInPublishConfig {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("source_from")
    public final List<String> sourceFrom;

    public EcAnchorDisableDeleteAppendInPublishConfig() {
        this(Boolean.FALSE, null);
    }

    public EcAnchorDisableDeleteAppendInPublishConfig(Boolean bool, List<String> list) {
        this.enable = bool;
        this.sourceFrom = list;
    }
}
