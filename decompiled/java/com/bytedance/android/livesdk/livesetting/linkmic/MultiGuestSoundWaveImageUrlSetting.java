package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_sound_wave_image_url")
public final class MultiGuestSoundWaveImageUrlSetting {
    public static final MultiGuestSoundWaveImageUrlSetting INSTANCE = new MultiGuestSoundWaveImageUrlSetting();
    public static final ImageUrlConfig DEFAULT = new ImageUrlConfig(new LinkedHashMap());

    private final ImageUrlConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ImageUrlConfig imageUrlConfig = DEFAULT;
        ImageUrlConfig imageUrlConfig2 = (ImageUrlConfig) settingsManager.getValueSafely("multi_guest_sound_wave_image_url", imageUrlConfig);
        return imageUrlConfig2 != null ? imageUrlConfig2 : imageUrlConfig;
    }

    public static final class ImageUrlConfig {
        public static final TypeAdapter ADAPTER = new MultiGuestSoundWaveImageUrlSetting_ImageUrlConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("image_name_to_url_map")
        public Map<String, String> imageNameToUrlMap;

        public ImageUrlConfig() {
            this(null);
        }

        public ImageUrlConfig(Map<String, String> map) {
            this.imageNameToUrlMap = map;
        }
    }

    public final String getUrl(String str) {
        Map<String, String> map;
        String str2;
        ImageUrlConfig value = getValue();
        if (value == null || (map = value.imageNameToUrlMap) == null || (str2 = map.get(str)) == null) {
            return "";
        }
        return str2;
    }
}
