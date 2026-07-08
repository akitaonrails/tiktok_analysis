package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C0IKY;
import X.C2097608Jq;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "ace_bind_phone")
public final class AceBindPhoneSetting {
    public static final AceBindPhoneSetting INSTANCE = new AceBindPhoneSetting();
    public static final AceBindPhoneScene[] DEFAULT = new AceBindPhoneScene[0];
    public static final Map<String, String> sceneMap = C2097608Jq.LJIIIIZZ(new Pair("live_take_page", "livebroadcast-preview"), new Pair("live_end_page", "livebroadcast-end"), new Pair("live_watch_end", "livewatch-end"));

    public final AceBindPhoneScene[] configs() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        AceBindPhoneScene[] aceBindPhoneSceneArr = DEFAULT;
        AceBindPhoneScene[] aceBindPhoneSceneArr2 = (AceBindPhoneScene[]) settingsManager.getValueSafely("ace_bind_phone", aceBindPhoneSceneArr);
        return aceBindPhoneSceneArr2 != null ? aceBindPhoneSceneArr2 : aceBindPhoneSceneArr;
    }

    public final Map<String, String> getSceneMap() {
        return sceneMap;
    }

    public final Classification getSceneConfig(C0IKY c0iky) {
        String str = sceneMap.get(c0iky.LIZIZ);
        for (AceBindPhoneScene aceBindPhoneScene : configs()) {
            if (aceBindPhoneScene.getEnable() && TextUtils.equals(str, aceBindPhoneScene.getScene())) {
                for (Classification classification : aceBindPhoneScene.getClassification()) {
                    if (c0iky.LIZJ == classification.getCrowd()) {
                        return classification;
                    }
                }
            }
        }
        return null;
    }
}
