package com.bytedance.android.livesdk.chatroom.slide.v1;

import X.C486960J7u;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_animation_degrade")
public final class LiveAnimationDegradeSettings {
    public static final LiveAnimationDegrade DEFAULT;
    public static final LiveAnimationDegradeSettings INSTANCE = new LiveAnimationDegradeSettings();
    public static final LiveAnimationDegrade solidifyValue;

    static {
        TypeAdapter typeAdapter = LiveAnimationDegrade.ADAPTER;
        DEFAULT = new LiveAnimationDegrade(true, true, true);
        solidifyValue = new LiveAnimationDegrade(true, true, true);
    }

    public final boolean disableEntranceAnim() {
        return !getValue().enableEntranceAnim;
    }

    public final boolean disableGuide() {
        return !getValue().enableGuide;
    }

    public final boolean disableMiniTopLives() {
        return !getValue().enableMiniTopLives;
    }

    public final LiveAnimationDegrade getValue() {
        if (C486960J7u.LIZ()) {
            return solidifyValue;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveAnimationDegrade liveAnimationDegrade = DEFAULT;
        LiveAnimationDegrade liveAnimationDegrade2 = (LiveAnimationDegrade) settingsManager.getValueSafely("live_animation_degrade", liveAnimationDegrade);
        return liveAnimationDegrade2 == null ? liveAnimationDegrade : liveAnimationDegrade2;
    }

    public final LiveAnimationDegrade getDEFAULT() {
        return DEFAULT;
    }
}
