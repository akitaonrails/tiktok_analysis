package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TaskPeriodConfig_ProtoDecoder implements C0IMD<TaskPeriodConfig> {
    public static TaskPeriodConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TaskPeriodConfig taskPeriodConfig = new TaskPeriodConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 11) {
                                if (iLJI != 12) {
                                    switch (iLJI) {
                                        case 21:
                                            taskPeriodConfig.promptType = c1516680pZS.LJIIJ();
                                            break;
                                        case 22:
                                            taskPeriodConfig.taskStaticPrompt = _BattlePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 23:
                                            taskPeriodConfig.progressTarget = c1516680pZS.LJIIJJI();
                                            break;
                                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                            taskPeriodConfig.targetType = c1516680pZS.LJIIJ();
                                            break;
                                        case 25:
                                            taskPeriodConfig.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case 26:
                                            taskPeriodConfig.clickActionSchemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        default:
                                            C1516700pZU.LJ(c1516680pZS);
                                            break;
                                    }
                                } else {
                                    taskPeriodConfig.clickToastPrompt = _BattlePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                taskPeriodConfig.clickAction = c1516680pZS.LJIIJ();
                            }
                        } else {
                            taskPeriodConfig.targetStartTimestamp = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        taskPeriodConfig.duration = c1516680pZS.LJIIJJI();
                    }
                } else {
                    taskPeriodConfig.taskStartTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return taskPeriodConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TaskPeriodConfig taskPeriodConfig) {
        TaskPeriodConfig taskPeriodConfig2 = taskPeriodConfig;
        BattlePrompt battlePrompt = taskPeriodConfig2.clickToastPrompt;
        if (battlePrompt != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt);
        }
        BattlePrompt battlePrompt2 = taskPeriodConfig2.taskStaticPrompt;
        if (battlePrompt2 != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt2);
        }
        ImageModel imageModel = taskPeriodConfig2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final TaskPeriodConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TaskPeriodConfig taskPeriodConfig, List list) {
    }
}
