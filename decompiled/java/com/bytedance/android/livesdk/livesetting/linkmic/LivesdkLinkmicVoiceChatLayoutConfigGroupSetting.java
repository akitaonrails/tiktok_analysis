package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_voice_chat_layout_group_config")
public final class LivesdkLinkmicVoiceChatLayoutConfigGroupSetting {
    public static final LayoutSettingMap DEFAULT;
    public static final LivesdkLinkmicVoiceChatLayoutConfigGroupSetting INSTANCE = new LivesdkLinkmicVoiceChatLayoutConfigGroupSetting();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final VoiceLayoutParam f33default;
    public static final VoiceLayoutParam defaultOld;

    static {
        VoiceLayoutParam voiceLayoutParam = new VoiceLayoutParam(9, "3001", 2, 0.58f);
        defaultOld = voiceLayoutParam;
        VoiceLayoutParam voiceLayoutParam2 = new VoiceLayoutParam(9, "3003", 2, 0.58f);
        f33default = voiceLayoutParam2;
        DEFAULT = new LayoutSettingMap(C2097608Jq.LJIIIIZZ(new Pair("3001", voiceLayoutParam), new Pair("3003", voiceLayoutParam2), new Pair("3004", new VoiceLayoutParam(9, "3004", 2, 0.58f))));
    }

    public final LayoutSettingMap getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LayoutSettingMap layoutSettingMap = DEFAULT;
        LayoutSettingMap layoutSettingMap2 = (LayoutSettingMap) settingsManager.getValueSafely("livesdk_linkmic_voice_chat_layout_group_config", layoutSettingMap);
        return layoutSettingMap2 != null ? layoutSettingMap2 : layoutSettingMap;
    }

    public final VoiceLayoutParam getDefault() {
        return f33default;
    }

    public final VoiceLayoutParam getDefaultOld() {
        return defaultOld;
    }

    public final float getAvatarPercentByLayoutId(String str) {
        VoiceLayoutParam layoutParams;
        if (str != null && (layoutParams = toLayoutParams(str)) != null) {
            return layoutParams.percent;
        }
        return 0.58f;
    }

    public final VoiceLayoutParam toLayoutParams(String str) {
        VoiceLayoutParam voiceLayoutParam = getValue().map.get(str);
        if (voiceLayoutParam == null) {
            if (Intrinsics.LJFF(str, "3001")) {
                return defaultOld;
            }
            return f33default;
        }
        return voiceLayoutParam;
    }
}
