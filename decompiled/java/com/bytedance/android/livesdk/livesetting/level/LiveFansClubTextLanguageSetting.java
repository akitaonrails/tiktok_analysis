package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import X.C13LP;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey("live_fans_club_text_size_language")
public final class LiveFansClubTextLanguageSetting {
    public static final LiveFansClubTextLanguageSetting INSTANCE = new LiveFansClubTextLanguageSetting();
    public static final JoinTextSizeLanguageSetting DEFAULT = new JoinTextSizeLanguageSetting(false, new ArrayList(), new ArrayList());
    public static final String[] LANGUAGETWELVE = {"az", "id-ID", "ms-MY", "jv-ID", "ca", "ceb-PH", "cs-CZ", "da", "de-DE", "es", "es-419", "fil-PH", "fr", "fr-CA", "ga", "hr", "is", "my-MM", "th-TH", "hi-IN", "it-IT", "sw", "lv", "ur", "he-IL", "uk-UA", "ru-RU", "lt", "hu-HU", "kk", "bg", "nl-NL", "tr-TR", "nl-NL", "vi-VN", "nb", "sv-SE"};
    public static final String[] LANGUAGETEN = new String[0];

    public final JoinTextSizeLanguageSetting getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        JoinTextSizeLanguageSetting joinTextSizeLanguageSetting = DEFAULT;
        JoinTextSizeLanguageSetting joinTextSizeLanguageSetting2 = (JoinTextSizeLanguageSetting) settingsManager.getValueSafely("live_fans_club_text_size_language", joinTextSizeLanguageSetting);
        return joinTextSizeLanguageSetting2 != null ? joinTextSizeLanguageSetting2 : joinTextSizeLanguageSetting;
    }

    public final boolean useTen(String str) {
        List<String> list;
        JoinTextSizeLanguageSetting value = getValue();
        if (!value.enable || (list = value.tenLanguages) == null || !C13LP.LJJJJ(str, list)) {
            return false;
        }
        return true;
    }

    public final boolean useTwelve(String str) {
        List<String> list;
        JoinTextSizeLanguageSetting value = getValue();
        if (!value.enable || (list = value.twelveLanguages) == null || !C13LP.LJJJJ(str, list)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class JoinTextSizeLanguageSetting {
        public static final TypeAdapter ADAPTER = new LiveFansClubTextLanguageSetting_JoinTextSizeLanguageSetting_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("font_size_ten_language")
        public List<String> tenLanguages;

        @C09CT("font_size_twelve_language")
        public List<String> twelveLanguages;

        public JoinTextSizeLanguageSetting() {
            this(false, null, null);
        }

        public JoinTextSizeLanguageSetting(boolean z, List<String> list, List<String> list2) {
            this.enable = z;
            this.twelveLanguages = list;
            this.tenLanguages = list2;
        }
    }
}
