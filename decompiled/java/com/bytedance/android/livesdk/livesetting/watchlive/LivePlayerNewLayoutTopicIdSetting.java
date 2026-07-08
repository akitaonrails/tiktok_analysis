package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_player_new_layout_topic_id")
public final class LivePlayerNewLayoutTopicIdSetting {
    public static final LivePlayerNewLayoutTopicIdSetting INSTANCE = new LivePlayerNewLayoutTopicIdSetting();
    public static final long[] DEFAULT = new long[0];

    public final long[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        long[] jArr = DEFAULT;
        long[] jArr2 = (long[]) settingsManager.getValueSafely("live_player_new_layout_topic_id", jArr);
        return jArr2 != null ? jArr2 : jArr;
    }

    public final boolean isGameTopic(Room room) {
        Hashtag hashtag;
        Long l;
        if (room != null && (hashtag = room.hashtag) != null && (l = hashtag.id) != null) {
            return C13LQ.LJIILL(l.longValue(), getValue());
        }
        return false;
    }
}
