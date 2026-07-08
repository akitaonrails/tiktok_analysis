package com.ss.android.ugc.aweme.storage.clean;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class RecordStorageOptLimitInfo {
    public static final int $stable = 0;

    @C09CT("enter_record_storage_auto_clean_limit")
    public final int storageAutoCleanLimit;

    @C09CT("enter_record_storage_lower_limit")
    public final int storageLowerLimit;

    public RecordStorageOptLimitInfo(int i, int i2) {
        this.storageLowerLimit = i;
        this.storageAutoCleanLimit = i2;
    }
}
