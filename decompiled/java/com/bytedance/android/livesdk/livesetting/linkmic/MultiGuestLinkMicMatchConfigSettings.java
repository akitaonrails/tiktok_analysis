package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_recommend_rooms_config")
public final class MultiGuestLinkMicMatchConfigSettings {
    public static final MultiGuestLinkMicMatchConfigSettings INSTANCE = new MultiGuestLinkMicMatchConfigSettings();
    public static final MultiGuestRecommendRoomsConfigBean DEFAULT = new MultiGuestRecommendRoomsConfigBean(0, 5, 300, 3, 3, 10, 1);

    public static final class MultiGuestRecommendRoomsConfigBean {
        public static final TypeAdapter ADAPTER;

        @C09CT("anchor_report_time_sec")
        public long anchorReportTimeSec;

        @C09CT("audience_click_avatar_show_dialog_count")
        public int audienceClickAvatarShowDialogCount;

        @C09CT("audience_click_request_show_dialog_count")
        public int audienceClickRequestShowDialogCount;

        @C09CT("audience_panel_dismiss_sec")
        public long audiencePanelDismissSec;

        @C09CT("audience_panel_show_frequency")
        public int audiencePanelShowFrequency;

        @C09CT("audience_wait_time_auto_sec")
        public long audienceWaitTimeAutoSec;

        @C09CT("audience_wait_time_click_sec")
        public long audienceWaitTimeClickSec;

        static {
            NormalGson.singleton();
            ADAPTER = new MultiGuestLinkMicMatchConfigSettings_MultiGuestRecommendRoomsConfigBean_OptTypeAdapter();
        }

        public MultiGuestRecommendRoomsConfigBean() {
            this(0L, 5L, 300L, 3, 3, 10L, 1);
        }

        public MultiGuestRecommendRoomsConfigBean(long j, long j2, long j3, int i, int i2, long j4, int i3) {
            this.audienceWaitTimeClickSec = j;
            this.audienceWaitTimeAutoSec = j2;
            this.anchorReportTimeSec = j3;
            this.audienceClickAvatarShowDialogCount = i;
            this.audienceClickRequestShowDialogCount = i2;
            this.audiencePanelDismissSec = j4;
            this.audiencePanelShowFrequency = i3;
        }
    }

    private final MultiGuestRecommendRoomsConfigBean getValue() {
        MultiGuestRecommendRoomsConfigBean multiGuestRecommendRoomsConfigBean = (MultiGuestRecommendRoomsConfigBean) SettingsManager.INSTANCE.getValueSafely(MultiGuestLinkMicMatchConfigSettings.class);
        return multiGuestRecommendRoomsConfigBean == null ? DEFAULT : multiGuestRecommendRoomsConfigBean;
    }

    public final long getAnchorReportTimeSec() {
        return getValue().anchorReportTimeSec;
    }

    public final int getAudienceClickAvatarShowDialogCount() {
        return getValue().audienceClickAvatarShowDialogCount;
    }

    public final int getAudienceClickRequestShowDialogCount() {
        return getValue().audienceClickRequestShowDialogCount;
    }

    public final long getAudiencePanelDismissSec() {
        return getValue().audiencePanelDismissSec;
    }

    public final int getAudiencePanelShowFrequency() {
        return getValue().audiencePanelShowFrequency;
    }

    public final long getAudienceWaitTimeAutoSec() {
        return getValue().audienceWaitTimeAutoSec;
    }

    public final long getAudienceWaitTimeClickSec() {
        return getValue().audienceWaitTimeClickSec;
    }
}
