package com.bytedance.geckox.policy.meta.file;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class ChannelFileRecordSettings {

    @C09CT("enable")
    public final boolean enabled;

    @C09CT("exclude_aks")
    public final List<String> excludeAks;

    @C09CT("file_access_frequency_control_interval_seconds")
    public final long fileAccessFrequencyControlIntervalSeconds;

    @C09CT("file_record_persist_debounce_ms")
    public final long fileRecordPersistDebounceMs;

    public ChannelFileRecordSettings() {
        this(false, null, 0L, 0L, 15, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<String> getExcludeAks() {
        return this.excludeAks;
    }

    public final long getFileAccessFrequencyControlIntervalSeconds() {
        return this.fileAccessFrequencyControlIntervalSeconds;
    }

    public final long getFileRecordPersistDebounceMs() {
        return this.fileRecordPersistDebounceMs;
    }

    public ChannelFileRecordSettings(boolean z, List<String> list, long j, long j2) {
        this.enabled = z;
        this.excludeAks = list;
        this.fileAccessFrequencyControlIntervalSeconds = j;
        this.fileRecordPersistDebounceMs = j2;
    }

    public ChannelFileRecordSettings(boolean z, List list, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? 30L : j, (i & 8) != 0 ? 1000L : j2);
    }
}
