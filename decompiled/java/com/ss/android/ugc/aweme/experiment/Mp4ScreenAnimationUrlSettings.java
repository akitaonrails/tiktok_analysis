package com.ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes26.dex */
public final class Mp4ScreenAnimationUrlSettings {
    public static final int $stable = 0;
    public static final Mp4ScreenAnimationUrlSettings INSTANCE = new Mp4ScreenAnimationUrlSettings();
    public static final Mp4ScreenAnimationUrlModel DEFAULT_GROUP = new Mp4ScreenAnimationUrlModel("https://lf16-effectcdn-us.tiktokcdn-us.com/obj/ies-fe-effect-va/ai_effect_intro.mp4");

    public static final Mp4ScreenAnimationUrlModel getValue() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Mp4ScreenAnimationUrlModel mp4ScreenAnimationUrlModel = DEFAULT_GROUP;
        Mp4ScreenAnimationUrlModel mp4ScreenAnimationUrlModel2 = (Mp4ScreenAnimationUrlModel) settingsManagerLIZLLL.LJIIIIZZ("mp4_screen_animation_url", Mp4ScreenAnimationUrlModel.class, mp4ScreenAnimationUrlModel);
        return mp4ScreenAnimationUrlModel2 != null ? mp4ScreenAnimationUrlModel2 : mp4ScreenAnimationUrlModel;
    }
}
