package com.ss.android.ugc.aweme.outreach.frequency.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class ClientLocalStorage {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("max_count")
    public final int maxCount;

    @C09CT("storage_keys")
    public final List<String> storageKeys;

    public ClientLocalStorage() {
        this(false, -1, null);
    }

    public ClientLocalStorage(boolean z, int i, List<String> list) {
        this.enable = z;
        this.maxCount = i;
        this.storageKeys = list;
    }
}
