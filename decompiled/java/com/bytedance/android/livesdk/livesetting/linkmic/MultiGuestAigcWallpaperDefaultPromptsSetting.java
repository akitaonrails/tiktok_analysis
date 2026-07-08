package com.bytedance.android.livesdk.livesetting.linkmic;

import X.AbstractC19994813Le;
import X.C19994913Lf;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_aigc_wallpaper_default_prompts")
public final class MultiGuestAigcWallpaperDefaultPromptsSetting {
    public static final MultiGuestAigcWallpaperDefaultPromptsSetting INSTANCE = new MultiGuestAigcWallpaperDefaultPromptsSetting();
    public static final String[] DEFAULT = {"pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt1", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt2", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt3", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt4", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt5", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt6", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt7", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt8", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt9", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt10", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt11", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt12", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt13", "pm_mt_liveAiWallpaper_editScreen_halfSheet_prompt14"};

    private final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("multi_guest_aigc_wallpaper_default_prompts", DEFAULT);
    }

    public final String shufflePrompt() {
        String[] value = getValue();
        C19994913Lf c19994913Lf = AbstractC19994813Le.Default;
        if (value.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return value[c19994913Lf.nextInt(value.length)];
    }
}
