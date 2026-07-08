package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class DMBDVideoUploadConfig implements Serializable {

    @C09CT("alive_max_fail_time")
    public final int aliveMaxFailTime;

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

    @C09CT("need_vframe")
    public final boolean needVframe;

    @C09CT("rw_timeout")
    public final int rwTimeout;

    @C09CT("slice_retry_count")
    public final int sliceRetryCount;

    @C09CT("slice_size")
    public final int sliceSize;

    @C09CT("socket_num")
    public final int socketNum;

    @C09CT("tcp_open_timeout_ms")
    public final int tcpOpenTimeout;

    @C09CT("tran_time_out")
    public final int tranTimeOut;

    public DMBDVideoUploadConfig() {
        this(2, 1, 40, 524288, 2, 30, 6, 40, 10000, 1, 1, 0, true);
    }

    public DMBDVideoUploadConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z) {
        this.sliceRetryCount = i;
        this.fileRetryCount = i2;
        this.rwTimeout = i3;
        this.sliceSize = i4;
        this.socketNum = i5;
        this.maxFailTimes = i6;
        this.aliveMaxFailTime = i7;
        this.tranTimeOut = i8;
        this.tcpOpenTimeout = i9;
        this.httpsEnable = i10;
        this.mainNetworkType = i11;
        this.backupNetworkType = i12;
        this.needVframe = z;
    }
}
