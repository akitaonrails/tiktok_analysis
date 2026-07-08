package com.ss.android.ugc.aweme.legoImp.task.crypto;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class KeyVersion {

    @C09CT("key")
    public final String key;

    @C09CT("version")
    public final int version;

    public KeyVersion() {
        this("", 0);
    }

    public KeyVersion(String str, int i) {
        this.key = str;
        this.version = i;
    }
}
