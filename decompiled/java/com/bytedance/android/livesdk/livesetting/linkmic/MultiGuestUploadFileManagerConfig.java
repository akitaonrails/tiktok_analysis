package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiGuestUploadFileManagerConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("file_retry_count")
    public int fileRetryCount;

    @C09CT("max_fail_time")
    public int maxFailTime;

    @C09CT("rw_timeout")
    public int rwTimeout;

    @C09CT("socket_num")
    public int socketNum;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestUploadFileManagerConfig_OptTypeAdapter();
    }

    public MultiGuestUploadFileManagerConfig() {
        this(2, 2, 10, 5);
    }

    public MultiGuestUploadFileManagerConfig(int i, int i2, int i3, int i4) {
        this.fileRetryCount = i;
        this.socketNum = i2;
        this.rwTimeout = i3;
        this.maxFailTime = i4;
    }
}
