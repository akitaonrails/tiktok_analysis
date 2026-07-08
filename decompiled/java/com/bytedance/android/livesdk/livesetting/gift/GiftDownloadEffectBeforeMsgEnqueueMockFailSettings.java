package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_download_effect_before_msg_enqueue_mock_fail_setting")
public final class GiftDownloadEffectBeforeMsgEnqueueMockFailSettings {
    public static final GiftDownloadEffectBeforeMsgEnqueueMockFailSettings INSTANCE = new GiftDownloadEffectBeforeMsgEnqueueMockFailSettings();
    public static final int MOCK_CREATE_EFFECT_FAIL = 1;
    public static final int MOCK_ASSET_MODEL_FAIL = 2;
    public static final int MOCK_DOWNLOAD_EFFECT_FAIL = 3;
    public static final int MOCK_DOWNLOAD_ALGORITHM_FAIL = 4;
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("gift_download_effect_before_msg_enqueue_mock_fail_setting", DEFAULT);

    public final boolean mockAssetModelFail() {
        return value == MOCK_ASSET_MODEL_FAIL;
    }

    public final boolean mockCreateEffectFail() {
        return value == MOCK_CREATE_EFFECT_FAIL;
    }

    public final boolean mockDownloadAlgorithmFail() {
        return value == MOCK_DOWNLOAD_ALGORITHM_FAIL;
    }

    public final boolean mockDownloadEffectFail() {
        return value == MOCK_DOWNLOAD_EFFECT_FAIL;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getMOCK_ASSET_MODEL_FAIL() {
        return MOCK_ASSET_MODEL_FAIL;
    }

    public final int getMOCK_CREATE_EFFECT_FAIL() {
        return MOCK_CREATE_EFFECT_FAIL;
    }

    public final int getMOCK_DOWNLOAD_ALGORITHM_FAIL() {
        return MOCK_DOWNLOAD_ALGORITHM_FAIL;
    }

    public final int getMOCK_DOWNLOAD_EFFECT_FAIL() {
        return MOCK_DOWNLOAD_EFFECT_FAIL;
    }
}
