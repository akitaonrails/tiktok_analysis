package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleBonusConfig_ProtoDecoder implements C0IMD<BattleBonusConfig> {
    public static BattleBonusConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleBonusConfig battleBonusConfig = new BattleBonusConfig();
        battleBonusConfig.previewPeriodConfig = new ArrayList();
        battleBonusConfig.taskGiftGuide = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleBonusConfig.previewStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        battleBonusConfig.previewPeriodConfig.add(_PreviewPeriod_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        battleBonusConfig.taskPeriodConfig = _TaskPeriodConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        battleBonusConfig.rewardPeriodConfig = _RewardPeriodConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        BattleTaskGiftAmountGuide battleTaskGiftAmountGuideLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        battleTaskGiftAmountGuideLIZLLL = _BattleTaskGiftAmountGuide_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (battleTaskGiftAmountGuideLIZLLL != null) {
                                        battleBonusConfig.taskGiftGuide.put(lValueOf, battleTaskGiftAmountGuideLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 6:
                        battleBonusConfig.previewStartTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        battleBonusConfig.previewClickActionSchemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleBonusConfig;
            }
        }
    }

    public static void LJ(BattleBonusConfig battleBonusConfig) {
        List<PreviewPeriod> list = battleBonusConfig.previewPeriodConfig;
        if (list == null) {
            battleBonusConfig.previewPeriodConfig = new ArrayList();
        } else if (!list.isEmpty()) {
            for (PreviewPeriod previewPeriod : battleBonusConfig.previewPeriodConfig) {
                if (previewPeriod != null) {
                    BattlePrompt battlePrompt = previewPeriod.promot;
                    if (battlePrompt != null) {
                        _BattlePrompt_ProtoDecoder.LJ(battlePrompt);
                    }
                    ImageModel imageModel = previewPeriod.icon;
                    if (imageModel != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel);
                    }
                }
            }
        }
        TaskPeriodConfig taskPeriodConfig = battleBonusConfig.taskPeriodConfig;
        if (taskPeriodConfig != null) {
            BattlePrompt battlePrompt2 = taskPeriodConfig.clickToastPrompt;
            if (battlePrompt2 != null) {
                _BattlePrompt_ProtoDecoder.LJ(battlePrompt2);
            }
            BattlePrompt battlePrompt3 = taskPeriodConfig.taskStaticPrompt;
            if (battlePrompt3 != null) {
                _BattlePrompt_ProtoDecoder.LJ(battlePrompt3);
            }
            ImageModel imageModel2 = taskPeriodConfig.icon;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
        RewardPeriodConfig rewardPeriodConfig = battleBonusConfig.rewardPeriodConfig;
        if (rewardPeriodConfig != null) {
            BattlePrompt battlePrompt4 = rewardPeriodConfig.rewardPraparePrompt;
            if (battlePrompt4 != null) {
                _BattlePrompt_ProtoDecoder.LJ(battlePrompt4);
            }
            BattlePrompt battlePrompt5 = rewardPeriodConfig.rewardingPrompt;
            if (battlePrompt5 != null) {
                _BattlePrompt_ProtoDecoder.LJ(battlePrompt5);
            }
            BattlePrompt battlePrompt6 = rewardPeriodConfig.clickPrompt;
            if (battlePrompt6 != null) {
                _BattlePrompt_ProtoDecoder.LJ(battlePrompt6);
            }
        }
        Map<Long, BattleTaskGiftAmountGuide> map = battleBonusConfig.taskGiftGuide;
        if (map == null) {
            battleBonusConfig.taskGiftGuide = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, BattleTaskGiftAmountGuide>> it2 = battleBonusConfig.taskGiftGuide.entrySet().iterator();
        while (it2.hasNext()) {
            BattleTaskGiftAmountGuide value = it2.next().getValue();
            if (value != null) {
                _BattleTaskGiftAmountGuide_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleBonusConfig battleBonusConfig) {
        LJ(battleBonusConfig);
    }

    @Override // X.C0IMD
    public final BattleBonusConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleBonusConfig battleBonusConfig, List list) {
    }
}
