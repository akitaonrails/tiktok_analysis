package com.bytedance.android.livesdk.livesetting.game;

import X.C13LQ;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "ttlive_game_live_enter_room_draw_load_opt")
public final class TtliveGameLiveEnterRoomDrawLoadOptSetting {
    public static final TtliveGameLiveEnterRoomDrawLoadOptSetting INSTANCE = new TtliveGameLiveEnterRoomDrawLoadOptSetting();
    public static final LiveGameDrawLoadOptModel DEFAULT = new LiveGameDrawLoadOptModel(false, false, false);

    private final LiveGameDrawLoadOptModel getValue() {
        LiveGameDrawLoadOptModel liveGameDrawLoadOptModel = (LiveGameDrawLoadOptModel) SettingsManager.INSTANCE.getValueSafely(TtliveGameLiveEnterRoomDrawLoadOptSetting.class);
        return liveGameDrawLoadOptModel == null ? DEFAULT : liveGameDrawLoadOptModel;
    }

    public final boolean isOpenHorizontalCanvasStableOpt() {
        return getValue().getHorizontalCanvasStable();
    }

    public final boolean isOpenGaussianHideTimingOpt(LiveMode liveMode) {
        if (C13LQ.LJJIJIIJI(liveMode, new LiveMode[]{LiveMode.SCREEN_RECORD, LiveMode.LIVE_STUDIO, LiveMode.THIRD_PARTY}) < 0) {
            return false;
        }
        return getValue().getGaussianHideTimingOpt();
    }

    public final boolean isOpenLoadingOpt(LiveMode liveMode) {
        if (C13LQ.LJJIJIIJI(liveMode, new LiveMode[]{LiveMode.SCREEN_RECORD, LiveMode.LIVE_STUDIO, LiveMode.THIRD_PARTY}) < 0) {
            return false;
        }
        return getValue().getLoadingStable();
    }
}
