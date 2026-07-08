package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInitiateInfo;
import com.bytedance.android.live.liveinteract.competition.model._CompetitionInitiateInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.CompetitionStart;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleComboInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._BattleEffectInfos_ProtoDecoder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionStart_ProtoDecoder implements C0IMD<CompetitionStart> {
    public static CompetitionStart LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CompetitionStart competitionStart = new CompetitionStart();
        competitionStart.comboInfoMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 100) {
                                    if (iLJI != 101) {
                                        switch (iLJI) {
                                            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                                competitionStart.effectInfos = _BattleEffectInfos_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 51:
                                                competitionStart.gameplayOption = c1516680pZS.LJIIJ();
                                                break;
                                            case 52:
                                                long jLIZJ2 = c1516680pZS.LIZJ();
                                                String strLIZLLL = null;
                                                BattleComboInfo battleComboInfoLIZLLL = null;
                                                while (true) {
                                                    int iLJI2 = c1516680pZS.LJI();
                                                    if (iLJI2 != -1) {
                                                        if (iLJI2 != 1) {
                                                            if (iLJI2 == 2) {
                                                                battleComboInfoLIZLLL = _BattleComboInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            }
                                                        } else {
                                                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                                        }
                                                    } else {
                                                        c1516680pZS.LJ(jLIZJ2);
                                                        if (strLIZLLL != null) {
                                                            if (battleComboInfoLIZLLL != null) {
                                                                competitionStart.comboInfoMap.put(strLIZLLL, battleComboInfoLIZLLL);
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
                                            default:
                                                C1516700pZU.LJ(c1516680pZS);
                                                break;
                                        }
                                    } else {
                                        competitionStart.takeTheStageBiz = _CompetitionStart_TakeTheStageBiz_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    competitionStart.beansBiz = _CompetitionStart_BeansBiz_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                competitionStart.actualEndTimestamp = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            competitionStart.endTimestamp = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        competitionStart.initiateInfo = _CompetitionInitiateInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    competitionStart.competitionStartTime = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionStart;
            }
        }
    }

    public static void LJ(CompetitionStart competitionStart) {
        CompetitionInitiateInfo competitionInitiateInfo = competitionStart.initiateInfo;
        if (competitionInitiateInfo != null) {
            _CompetitionInitiateInfo_ProtoDecoder.LJ(competitionInitiateInfo);
        }
        BattleEffectInfos battleEffectInfos = competitionStart.effectInfos;
        if (battleEffectInfos != null) {
            _BattleEffectInfos_ProtoDecoder.LJ(battleEffectInfos);
        }
        Map<String, BattleComboInfo> map = competitionStart.comboInfoMap;
        if (map == null) {
            competitionStart.comboInfoMap = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<String, BattleComboInfo>> it2 = competitionStart.comboInfoMap.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        CompetitionStart.BeansBiz beansBiz = competitionStart.beansBiz;
        if (beansBiz != null && beansBiz.systemBombIntervals == null) {
            beansBiz.systemBombIntervals = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CompetitionStart competitionStart) {
        LJ(competitionStart);
    }

    @Override // X.C0IMD
    public final CompetitionStart LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionStart competitionStart, List list) {
    }
}
