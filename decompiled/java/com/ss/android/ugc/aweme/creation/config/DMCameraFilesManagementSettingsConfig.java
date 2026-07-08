package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class DMCameraFilesManagementSettingsConfig implements Serializable {

    @C09CT("enable_auto_clean_files_interval")
    public final long cleanInterval;

    @C09CT("enable_auto_clean_files_on_startup")
    public final boolean enableClean;

    public DMCameraFilesManagementSettingsConfig() {
        this(true, 86400000L);
    }

    public DMCameraFilesManagementSettingsConfig(boolean z, long j) {
        this.enableClean = z;
        this.cleanInterval = j;
    }
}
