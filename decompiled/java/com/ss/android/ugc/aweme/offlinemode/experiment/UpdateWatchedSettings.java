package com.ss.android.ugc.aweme.offlinemode.experiment;

/* JADX INFO: loaded from: classes10.dex */
public final class UpdateWatchedSettings {
    public final boolean debug_trigger_update_when_sheet_popup;
    public final boolean debug_update_db_log_open;
    public final int max_request_interval_second;
    public final int min_request_interval_second;
    public final float min_update_watched_threshold;

    public UpdateWatchedSettings() {
        this(0.5f, 0, 10, false, false);
    }

    public UpdateWatchedSettings(float f, int i, int i2, boolean z, boolean z2) {
        this.min_update_watched_threshold = f;
        this.min_request_interval_second = i;
        this.max_request_interval_second = i2;
        this.debug_trigger_update_when_sheet_popup = z;
        this.debug_update_db_log_open = z2;
    }
}
