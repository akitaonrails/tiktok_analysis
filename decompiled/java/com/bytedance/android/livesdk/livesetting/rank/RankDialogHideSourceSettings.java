package com.bytedance.android.livesdk.livesetting.rank;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_rank_dialog_hide_source_list")
public final class RankDialogHideSourceSettings {
    public static final RankDialogHideSourceSettings INSTANCE = new RankDialogHideSourceSettings();
    public static final List<String> DEFAULT = C1697810uHb.LJIIJJI("fans_club_consume_task", "fans_club_gift_month", "fans_team_rank");

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        List<String> list2 = (List) settingsManager.getValueSafely("live_rank_dialog_hide_source_list", list);
        return list2 != null ? list2 : list;
    }
}
