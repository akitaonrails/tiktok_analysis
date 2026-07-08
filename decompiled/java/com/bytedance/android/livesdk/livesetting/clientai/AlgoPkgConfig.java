package com.bytedance.android.livesdk.livesetting.clientai;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class AlgoPkgConfig {
    public static final TypeAdapter ADAPTER = new AlgoPkgConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("exec_timeout")
    public long execTimeout;

    @C09CT("force_download")
    public boolean forceDownload;

    @C09CT("trigger_ignore_failure")
    public boolean triggerIgnoreFailure;

    public AlgoPkgConfig() {
        this(false, false, 1000L);
    }

    public AlgoPkgConfig(boolean z, boolean z2, long j) {
        this.forceDownload = z;
        this.triggerIgnoreFailure = z2;
        this.execTimeout = j;
    }
}
