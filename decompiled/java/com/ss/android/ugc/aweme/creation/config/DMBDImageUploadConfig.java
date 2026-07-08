package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class DMBDImageUploadConfig implements Serializable {

    @C09CT("backup_network_type")
    public final int backupNetworkType;

    @C09CT("file_retry_count")
    public final int fileRetryCount;

    @C09CT("https_enable")
    public final int httpsEnable;

    @C09CT("main_network_type")
    public final int mainNetworkType;

    @C09CT("max_fail_times")
    public final int maxFailTimes;

    @C09CT("rw_timeout")
    public final int rwTimeout;

    @C09CT("socket_num")
    public final int socketNum;

    public DMBDImageUploadConfig() {
        this(2, 10, 1, 2, 5, 1, -1);
    }

    public DMBDImageUploadConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.fileRetryCount = i;
        this.rwTimeout = i2;
        this.httpsEnable = i3;
        this.socketNum = i4;
        this.maxFailTimes = i5;
        this.mainNetworkType = i6;
        this.backupNetworkType = i7;
    }
}
