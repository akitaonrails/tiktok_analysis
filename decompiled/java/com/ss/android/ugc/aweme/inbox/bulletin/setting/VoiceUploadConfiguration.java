package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class VoiceUploadConfiguration {
    public static final int $stable = 0;

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

    public VoiceUploadConfiguration() {
        this(2, 1, 40, 524288, 2, 30, 6, 40, 10000, 1, 1, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceUploadConfiguration)) {
            return false;
        }
        VoiceUploadConfiguration voiceUploadConfiguration = (VoiceUploadConfiguration) obj;
        return this.sliceRetryCount == voiceUploadConfiguration.sliceRetryCount && this.fileRetryCount == voiceUploadConfiguration.fileRetryCount && this.rwTimeout == voiceUploadConfiguration.rwTimeout && this.sliceSize == voiceUploadConfiguration.sliceSize && this.socketNum == voiceUploadConfiguration.socketNum && this.maxFailTimes == voiceUploadConfiguration.maxFailTimes && this.aliveMaxFailTime == voiceUploadConfiguration.aliveMaxFailTime && this.tranTimeOut == voiceUploadConfiguration.tranTimeOut && this.tcpOpenTimeout == voiceUploadConfiguration.tcpOpenTimeout && this.httpsEnable == voiceUploadConfiguration.httpsEnable && this.mainNetworkType == voiceUploadConfiguration.mainNetworkType && this.backupNetworkType == voiceUploadConfiguration.backupNetworkType;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.sliceRetryCount * 31) + this.fileRetryCount) * 31) + this.rwTimeout) * 31) + this.sliceSize) * 31) + this.socketNum) * 31) + this.maxFailTimes) * 31) + this.aliveMaxFailTime) * 31) + this.tranTimeOut) * 31) + this.tcpOpenTimeout) * 31) + this.httpsEnable) * 31) + this.mainNetworkType) * 31) + this.backupNetworkType;
    }

    public String toString() {
        return "VoiceUploadConfiguration(sliceRetryCount=" + this.sliceRetryCount + ", fileRetryCount=" + this.fileRetryCount + ", rwTimeout=" + this.rwTimeout + ", sliceSize=" + this.sliceSize + ", socketNum=" + this.socketNum + ", maxFailTimes=" + this.maxFailTimes + ", aliveMaxFailTime=" + this.aliveMaxFailTime + ", tranTimeOut=" + this.tranTimeOut + ", tcpOpenTimeout=" + this.tcpOpenTimeout + ", httpsEnable=" + this.httpsEnable + ", mainNetworkType=" + this.mainNetworkType + ", backupNetworkType=" + this.backupNetworkType + ')';
    }

    public VoiceUploadConfiguration(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
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
    }
}
