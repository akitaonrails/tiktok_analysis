package com.ss.android.ugc.aweme.ug.dynamicresource;

import X.EnumC1487630oob;
import X.EnumC19356010o2;

/* JADX INFO: loaded from: classes30.dex */
public interface IDynamicFileConfig extends IDynamicResourceConfig<Integer> {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    boolean enable();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    Integer fallback();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    /* synthetic */ Integer fallback();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    String key();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    EnumC1487630oob priority();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    EnumC19356010o2 type();
}
