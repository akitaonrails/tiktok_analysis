package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class GameLiveKeyTime {
    public static final TypeAdapter ADAPTER = new GameLiveKeyTime_OptTypeAdapter(NormalGson.singleton());

    @C09CT("cost_report_switcher")
    public boolean costReportSwitcher;

    @C09CT("enable_moment_sei_send")
    public boolean enableMomentSeiSend;

    @C09CT("function_switcher")
    public boolean functionSwitcher;

    @C09CT("model_fusion_tag_opt")
    public boolean modelFusionTagOpt;

    @C09CT("model_offload_opt")
    public boolean modelOffloadOpt;

    @C09CT("model_offload_to_cloud_inference")
    public boolean modelOffloadToCloudInference;

    @C09CT("model_opt")
    public boolean modelOpt;

    @C09CT("model_score_kill_threshold")
    public float modelScoreKillThreshold = 1.0f;

    @C09CT("model_score_victory_threshold")
    public float modelScoreVictoryThreshold = 1.0f;

    @C09CT("model_score_defeat_threshold")
    public float modelScoreDefeatThreshold = 1.0f;

    @C09CT("model_score_self_threshold")
    public float modelScoreSelfThreshold = 1.0f;

    @C09CT("model_score_teammate_threshold")
    public float modelScoreTeammateThreshold = 1.0f;

    @C09CT("model_score_enemy_threshold")
    public float modelScoreEnemyThreshold = 1.0f;

    @C09CT("screenshot_interval")
    public long screenshotInterval = 4000;

    @C09CT("max_report_task")
    public int maxReportTask = 5;

    @C09CT("screenshot_max_interval")
    public long screenshotMaxInterval = 30000;

    @C09CT("recognition_games")
    public Long[] recognitionGames = new Long[0];

    @C09CT("recognition_fusion_ids")
    public Long[] recognitionFusionIds = new Long[0];

    @C09CT("highlight_report_interval")
    public long highlightReportInterval = -1;

    @C09CT("game_keytime_get_server_result_interval")
    public long serverInferInterval = Mp4ScreenVideoLoadTimeout.CONTROL;

    @C09CT("deployment_id_list")
    public List<Integer> deploymentIdList = new ArrayList();

    public final String toString() {
        return "GameLive(modelScoreKillThreshold=" + this.modelScoreKillThreshold + ", modelScoreVictoryThreshold=" + this.modelScoreVictoryThreshold + ", modelScoreDefeatThreshold=" + this.modelScoreDefeatThreshold + ", modelScoreSelfThreshold=" + this.modelScoreSelfThreshold + ", modelScoreTeammateThreshold=" + this.modelScoreTeammateThreshold + ", modelScoreEnemyThreshold=" + this.modelScoreEnemyThreshold + ", ,screenshotInterval=" + this.screenshotInterval + ", functionSwitcher=" + this.functionSwitcher + ", maxReportTask=" + this.maxReportTask + ", screenshotMaxInterval=" + this.screenshotMaxInterval + ", costReportSwitcher=" + this.costReportSwitcher + " , recognitionGames=" + this.recognitionGames + "),recognitionFusionIds=" + this.recognitionFusionIds + ", modelOffloadOpt=" + this.modelOffloadOpt + ", modelOffloadToCloudInference=" + this.modelOffloadToCloudInference + ", modelOpt=" + this.modelOpt + ", modelFusionTagOpt=" + this.modelFusionTagOpt;
    }
}
