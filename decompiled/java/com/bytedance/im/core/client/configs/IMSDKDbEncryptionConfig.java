package com.bytedance.im.core.client.configs;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKDbEncryptionConfig {

    @C09CT("enable_encryption")
    public final boolean enableEncryption;

    @C09CT("force_roll_back_encryption")
    public final boolean forceRollBackEncryption;

    @C09CT("max_keystore_failure_count")
    public final int maxKeystoreFailureCount;

    public IMSDKDbEncryptionConfig() {
        this(false, false, 5);
    }

    public IMSDKDbEncryptionConfig(boolean z, boolean z2, int i) {
        this.enableEncryption = z;
        this.forceRollBackEncryption = z2;
        this.maxKeystoreFailureCount = i;
    }
}
