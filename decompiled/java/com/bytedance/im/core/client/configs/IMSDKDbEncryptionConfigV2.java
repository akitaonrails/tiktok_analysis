package com.bytedance.im.core.client.configs;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKDbEncryptionConfigV2 {

    @C09CT("enable_encryption")
    public final boolean enableEncryption;

    @C09CT("force_roll_back_encryption")
    public final boolean forceRollBackEncryption;

    @C09CT("max_keystore_failure_count")
    public final int maxKeystoreFailureCount;

    public IMSDKDbEncryptionConfigV2() {
        this(false, false, 5);
    }

    public final IMSDKDbEncryptionConfigV2 copy(boolean z, boolean z2, int i) {
        return new IMSDKDbEncryptionConfigV2(z, z2, i);
    }

    public IMSDKDbEncryptionConfigV2(boolean z, boolean z2, int i) {
        this.enableEncryption = z;
        this.forceRollBackEncryption = z2;
        this.maxKeystoreFailureCount = i;
    }
}
