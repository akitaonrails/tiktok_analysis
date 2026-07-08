package com.bytedance.android.livesdk.setting;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class LoadMoreRetryConfig {
    public static final TypeAdapter ADAPTER = new LoadMoreRetryConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("backup_data_delay")
    public long backupDataDelay;

    @C09CT("enable")
    public boolean enable;

    @C09CT("entrances")
    public List<String> entrances;

    @C09CT("expand_params")
    public boolean expandParams;

    @C09CT("min_network_quality")
    public int minNetworkQuality;

    @C09CT("retry_count")
    public int retryCount;

    @C09CT("retry_interval")
    public long retryInterval;

    @C09CT("retry_when_timeout")
    public boolean retryWhenTimeout;

    @C09CT("timeout")
    public long timeout;

    @C09CT("use_backup_data")
    public boolean useBackupData;

    public LoadMoreRetryConfig() {
        this(false, C1697810uHb.LJIIJJI("homepage_hot_live_cell", "homepage_hot_video_head"), false, false, 0, 0L, 0, 0L, false, 0L);
    }

    public LoadMoreRetryConfig(boolean z, List<String> list, boolean z2, boolean z3, int i, long j, int i2, long j2, boolean z4, long j3) {
        this.enable = z;
        this.entrances = list;
        this.retryWhenTimeout = z2;
        this.expandParams = z3;
        this.minNetworkQuality = i;
        this.timeout = j;
        this.retryCount = i2;
        this.retryInterval = j2;
        this.useBackupData = z4;
        this.backupDataDelay = j3;
    }
}
