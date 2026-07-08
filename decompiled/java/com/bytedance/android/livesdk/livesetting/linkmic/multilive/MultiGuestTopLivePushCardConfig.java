package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_top_live_push_card_config")
public final class MultiGuestTopLivePushCardConfig {
    public static final MultiGuestTopLivePushCardConfig INSTANCE = new MultiGuestTopLivePushCardConfig();
    public static final MultiGuestTopLivePushCardModel DEFAULT = new MultiGuestTopLivePushCardModel(false, 0, 0, null, 15, null);

    private final MultiGuestTopLivePushCardModel getValue() {
        MultiGuestTopLivePushCardModel multiGuestTopLivePushCardModel = (MultiGuestTopLivePushCardModel) SettingsManager.INSTANCE.getValueSafely(MultiGuestTopLivePushCardConfig.class);
        return multiGuestTopLivePushCardModel == null ? DEFAULT : multiGuestTopLivePushCardModel;
    }

    public final boolean enable() {
        return getValue().enable;
    }

    public final long getDelaySeconds() {
        return getValue().delaySeconds;
    }

    public final List<NotConsumeControlsModel> getNotConsumeControls() {
        return getValue().notConsumeControls;
    }

    public final long getResidenceSeconds() {
        return getValue().residenceSeconds;
    }
}
