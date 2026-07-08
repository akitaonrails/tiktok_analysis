package com.bytedance.android.livesdk.livesetting.grouplive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class GroupLiveConfigModel {
    public static final TypeAdapter ADAPTER = new GroupLiveConfigModel_OptTypeAdapter(NormalGson.singleton());

    @C09CT("match_config")
    public TimedCompetitionConfigModel matchConfig;

    @C09CT("ranking_panel_config")
    public RankingPanelConfigModel rankingPanelConfig;

    public GroupLiveConfigModel() {
        this(new TimedCompetitionConfigModel(10, 2, 5, 2), new RankingPanelConfigModel(3, -1L));
    }

    public GroupLiveConfigModel(TimedCompetitionConfigModel timedCompetitionConfigModel, RankingPanelConfigModel rankingPanelConfigModel) {
        this.matchConfig = timedCompetitionConfigModel;
        this.rankingPanelConfig = rankingPanelConfigModel;
    }
}
