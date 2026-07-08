package com.ss.android.ugc.playerkit.exp.model;

import X.C0NKA;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CustomProtectCacheDirExp {
    public List<String> customCacheConfig;

    public List<String> getConfig() {
        if (this.customCacheConfig == null) {
            this.customCacheConfig = Arrays.asList(C0NKA.OfflineMode.getCacheDir());
        }
        return this.customCacheConfig;
    }
}
