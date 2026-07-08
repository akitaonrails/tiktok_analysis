package emotes.util;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("fansclub_emote_panel_width_redesign")
public final class FanClubEmotePanelSpanCountSetting {
    public static final boolean DEFAULT = false;
    public static final FanClubEmotePanelSpanCountSetting INSTANCE = new FanClubEmotePanelSpanCountSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("fansclub_emote_panel_width_redesign", DEFAULT);
    }
}
