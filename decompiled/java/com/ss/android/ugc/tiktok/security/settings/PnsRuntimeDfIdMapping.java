package com.ss.android.ugc.tiktok.security.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class PnsRuntimeDfIdMapping {

    @C09CT("runtime_dfid_mapping")
    public PnsWebDfIdConfigModel config;

    public PnsRuntimeDfIdMapping() {
        this(new PnsWebDfIdConfigModel(null, null, null, null, null, 31, null));
    }

    public PnsRuntimeDfIdMapping(PnsWebDfIdConfigModel pnsWebDfIdConfigModel) {
        this.config = pnsWebDfIdConfigModel;
    }
}
