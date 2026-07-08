package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_enter_room_boost_enable")
public final class LiveEnterRoomBoostExp {
    public static final LiveEnterRoomBoostExp INSTANCE = new LiveEnterRoomBoostExp();
    public static final LiveEnterRoomBoostConfig DEFAULT = new LiveEnterRoomBoostConfig(0);
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(89));

    private final LiveEnterRoomBoostConfig getValue() {
        return (LiveEnterRoomBoostConfig) value$delegate.getValue();
    }

    public final int boostType() {
        return getValue().getBoostType();
    }

    public final boolean enable() {
        return getValue().getBoostType() != 0;
    }

    public static final class LiveEnterRoomBoostConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("cacheType")
        public int boostType;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveEnterRoomBoostExp_LiveEnterRoomBoostConfig_OptTypeAdapter();
        }

        public LiveEnterRoomBoostConfig() {
            this(0);
        }

        public final int getBoostType() {
            return this.boostType;
        }

        public LiveEnterRoomBoostConfig(int i) {
            this.boostType = i;
        }

        public final void setBoostType(int i) {
            this.boostType = i;
        }
    }

    public final LiveEnterRoomBoostConfig getDEFAULT() {
        return DEFAULT;
    }
}
