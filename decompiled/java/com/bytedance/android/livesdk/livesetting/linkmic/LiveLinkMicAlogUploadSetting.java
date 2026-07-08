package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1163480gNm;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_linkmic_alog_upload_android")
public final class LiveLinkMicAlogUploadSetting {
    public static final LiveLinkMicAlogUploadSetting INSTANCE = new LiveLinkMicAlogUploadSetting();
    public static final LinkMicUploadALogConfig DEFAULT = new LinkMicUploadALogConfig(null, null, null, null, null, 1, 0, 10);
    public static final ConcurrentHashMap<Integer, Boolean> exceptionTypeHitSampleCacheMap = new ConcurrentHashMap<>();

    public final LinkMicUploadALogConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LinkMicUploadALogConfig linkMicUploadALogConfig = DEFAULT;
        LinkMicUploadALogConfig linkMicUploadALogConfig2 = (LinkMicUploadALogConfig) settingsManager.getValueSafely("live_linkmic_alog_upload_android", linkMicUploadALogConfig);
        return linkMicUploadALogConfig2 != null ? linkMicUploadALogConfig2 : linkMicUploadALogConfig;
    }

    public final boolean canUpload(int i) {
        Boolean boolPutIfAbsent;
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = exceptionTypeHitSampleCacheMap;
        Integer numValueOf = Integer.valueOf(i);
        Boolean boolValueOf = concurrentHashMap.get(numValueOf);
        if (boolValueOf == null && (boolPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (boolValueOf = Boolean.valueOf(C1163480gNm.LIZ(C1163480gNm.LIZJ(INSTANCE.getSettingValue(), i)))))) != null) {
            boolValueOf = boolPutIfAbsent;
        }
        return boolValueOf.booleanValue();
    }
}
