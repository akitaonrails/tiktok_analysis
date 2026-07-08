package com.bytedance.geckox.model;

import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoManifest {
    public final Map<String, GeckoMd5Check> files;

    public GeckoManifest(Map<String, GeckoMd5Check> map) {
        this.files = map;
    }
}
