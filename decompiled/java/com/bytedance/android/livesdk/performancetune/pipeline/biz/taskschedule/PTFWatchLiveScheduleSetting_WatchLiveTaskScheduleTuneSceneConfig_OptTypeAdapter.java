package com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule.PTFWatchLiveScheduleSetting;
import com.bytedance.android.livesdk.performancetune.strategy.model.CommonDecisionConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class PTFWatchLiveScheduleSetting_WatchLiveTaskScheduleTuneSceneConfig_OptTypeAdapter extends TypeAdapter<PTFWatchLiveScheduleSetting.WatchLiveTaskScheduleTuneSceneConfig> {
    public final Gson LIZ;

    public PTFWatchLiveScheduleSetting_WatchLiveTaskScheduleTuneSceneConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PTFWatchLiveScheduleSetting.WatchLiveTaskScheduleTuneSceneConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PTFWatchLiveScheduleSetting.WatchLiveTaskScheduleTuneSceneConfig watchLiveTaskScheduleTuneSceneConfig = new PTFWatchLiveScheduleSetting.WatchLiveTaskScheduleTuneSceneConfig(false, new CommonDecisionConfig(1, "", "", "", "", new ArrayList(), new ArrayList()), false, true, new LinkedHashMap(), null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1488435127:
                        if (strLJJJJ.equals("common_idle_time_post_block")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchLiveTaskScheduleTuneSceneConfig.setCommonIdleTimePostBlock(C473040Igo.LIZIZ(this.LIZ, c09cu, Long.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchLiveTaskScheduleTuneSceneConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -341767977:
                        if (strLJJJJ.equals("task_schedule_decision_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchLiveTaskScheduleTuneSceneConfig.setTaskScheduleDecisionConfig((CommonDecisionConfig) this.LIZ.LJIIJ(CommonDecisionConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 214684221:
                        if (strLJJJJ.equals("shouldBlocWhenPrePull")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchLiveTaskScheduleTuneSceneConfig.setShouldBlocWhenPrePull(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1353921842:
                        if (strLJJJJ.equals("disable_triggers")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchLiveTaskScheduleTuneSceneConfig.setDisableTriggers(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1557214585:
                        if (strLJJJJ.equals("shouldBlockWhenPreviewPullStream")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                watchLiveTaskScheduleTuneSceneConfig.setShouldBlockWhenPreviewPullStream(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return watchLiveTaskScheduleTuneSceneConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PTFWatchLiveScheduleSetting.WatchLiveTaskScheduleTuneSceneConfig watchLiveTaskScheduleTuneSceneConfig) throws IOException {
        PTFWatchLiveScheduleSetting.WatchLiveTaskScheduleTuneSceneConfig watchLiveTaskScheduleTuneSceneConfig2 = watchLiveTaskScheduleTuneSceneConfig;
        if (watchLiveTaskScheduleTuneSceneConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(watchLiveTaskScheduleTuneSceneConfig2.getEnable());
        c09dl.LJIILLIIL("task_schedule_decision_config");
        this.LIZ.LJIIJ(CommonDecisionConfig.class).write(c09dl, watchLiveTaskScheduleTuneSceneConfig2.getTaskScheduleDecisionConfig());
        c09dl.LJIILLIIL("shouldBlocWhenPrePull");
        c09dl.LJJJJJL(watchLiveTaskScheduleTuneSceneConfig2.getShouldBlocWhenPrePull());
        c09dl.LJIILLIIL("shouldBlockWhenPreviewPullStream");
        c09dl.LJJJJJL(watchLiveTaskScheduleTuneSceneConfig2.getShouldBlockWhenPreviewPullStream());
        c09dl.LJIILLIIL("common_idle_time_post_block");
        C473040Igo.LJ(this.LIZ, c09dl, watchLiveTaskScheduleTuneSceneConfig2.getCommonIdleTimePostBlock(), Long.TYPE);
        c09dl.LJIILLIIL("disable_triggers");
        C473040Igo.LIZLLL(this.LIZ, c09dl, watchLiveTaskScheduleTuneSceneConfig2.getDisableTriggers(), String.class);
        c09dl.LJII();
    }
}
