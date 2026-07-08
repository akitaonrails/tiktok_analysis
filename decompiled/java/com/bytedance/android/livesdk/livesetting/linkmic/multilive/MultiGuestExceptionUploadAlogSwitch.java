package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multiguest_exception_upload_alog_switch")
public final class MultiGuestExceptionUploadAlogSwitch {
    public static final boolean DEFAULT = false;
    public static final MultiGuestExceptionUploadAlogSwitch INSTANCE = new MultiGuestExceptionUploadAlogSwitch();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multiguest_exception_upload_alog_switch", DEFAULT);
    }
}
