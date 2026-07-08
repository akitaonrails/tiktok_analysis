package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C09CT;
import X.C1152740g6S;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_dedup_opt_setting")
public final class LiveDedupOptExp {
    public static final LiveDedupOptExp INSTANCE = new LiveDedupOptExp();
    public static final LiveDedupOptConfig DEFAULT = new LiveDedupOptConfig(false, false, 20, false, false);
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C1152740g6S());

    private final LiveDedupOptConfig getValue() {
        return (LiveDedupOptConfig) value$delegate.getValue();
    }

    public final boolean cacheForColdBoot() {
        return getValue().cacheForColdBoot;
    }

    public final int consumeRecordSize() {
        return getValue().consumeRecordSize;
    }

    public final boolean disableUnread() {
        return getValue().unreadDisable;
    }

    public final boolean enable() {
        return getValue().enable;
    }

    public final boolean saveFeatureWhenLeaveRoom() {
        return getValue().saveFeatureWhenLeaveRoom;
    }

    public static final class LiveDedupOptConfig {
        public static final TypeAdapter ADAPTER = new LiveDedupOptExp_LiveDedupOptConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("cacheForColdBoot")
        public boolean cacheForColdBoot;

        @C09CT("consume_record_size")
        public int consumeRecordSize;

        @C09CT("enable")
        public boolean enable;

        @C09CT("save_feature_when_leave_room")
        public boolean saveFeatureWhenLeaveRoom;

        @C09CT("unread_disable")
        public boolean unreadDisable;

        public LiveDedupOptConfig() {
            this(false, false, 20, false, false);
        }

        public LiveDedupOptConfig(boolean z, boolean z2, int i, boolean z3, boolean z4) {
            this.enable = z;
            this.unreadDisable = z2;
            this.consumeRecordSize = i;
            this.cacheForColdBoot = z3;
            this.saveFeatureWhenLeaveRoom = z4;
        }
    }
}
