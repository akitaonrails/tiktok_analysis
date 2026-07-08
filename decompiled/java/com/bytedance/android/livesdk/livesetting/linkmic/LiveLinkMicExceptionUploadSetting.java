package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1163480gNm;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_linkmic_exception_upload_android")
public final class LiveLinkMicExceptionUploadSetting {
    public static final LiveLinkMicExceptionUploadSetting INSTANCE = new LiveLinkMicExceptionUploadSetting();
    public static final LinkMicUploadConfig DEFAULT = new LinkMicUploadConfig(null, null, null, null, null, 1, 0);
    public static final ConcurrentHashMap<Integer, Boolean> exceptionTypeHitSampleCacheMap = new ConcurrentHashMap<>();

    public final LinkMicUploadConfig getSettingValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LinkMicUploadConfig linkMicUploadConfig = DEFAULT;
        LinkMicUploadConfig linkMicUploadConfig2 = (LinkMicUploadConfig) settingsManager.getValueSafely("live_linkmic_exception_upload_android", linkMicUploadConfig);
        return linkMicUploadConfig2 != null ? linkMicUploadConfig2 : linkMicUploadConfig;
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
