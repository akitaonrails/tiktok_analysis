package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "game_mock_aweme_list")
public final class GameMockAwemeListSetting {
    public static final GameMockAwemeListSetting INSTANCE = new GameMockAwemeListSetting();
    public static final MockAwemeListData DEFAULT = new MockAwemeListData();

    public final MockAwemeListData getValue() {
        MockAwemeListData mockAwemeListData = (MockAwemeListData) SettingsManager.INSTANCE.getValueSafely(GameMockAwemeListSetting.class);
        return mockAwemeListData == null ? DEFAULT : mockAwemeListData;
    }
}
