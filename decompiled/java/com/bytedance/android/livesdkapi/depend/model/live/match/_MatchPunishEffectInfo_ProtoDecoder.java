package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchPunishEffectInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _MatchPunishEffectInfo_ProtoDecoder implements C0IMD<MatchPunishEffectInfo> {
    public static MatchPunishEffectInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MatchPunishEffectInfo matchPunishEffectInfo = new MatchPunishEffectInfo();
        matchPunishEffectInfo.effectToEffectStructMap = new HashMap();
        matchPunishEffectInfo.userToEffectMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        MatchPunishEffectInfo.EffectStruct effectStructLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    effectStructLIZLLL = _MatchPunishEffectInfo_EffectStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (lValueOf != null) {
                            if (effectStructLIZLLL != null) {
                                matchPunishEffectInfo.effectToEffectStructMap.put(lValueOf, effectStructLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long jLIZJ3 = c1516680pZS.LIZJ();
                    Long lValueOf2 = null;
                    while (true) {
                        int iLJI3 = c1516680pZS.LJI();
                        if (iLJI3 == -1) {
                            break;
                        }
                        if (iLJI3 != 1) {
                            if (iLJI3 == 2) {
                                lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        } else {
                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ3);
                    if (lValueOf != null) {
                        if (lValueOf2 != null) {
                            matchPunishEffectInfo.userToEffectMap.put(lValueOf, lValueOf2);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchPunishEffectInfo;
            }
        }
    }

    public static void LJ(MatchPunishEffectInfo matchPunishEffectInfo) {
        if (matchPunishEffectInfo.userToEffectMap == null) {
            matchPunishEffectInfo.userToEffectMap = new HashMap();
        }
        Map<Long, MatchPunishEffectInfo.EffectStruct> map = matchPunishEffectInfo.effectToEffectStructMap;
        if (map == null) {
            matchPunishEffectInfo.effectToEffectStructMap = new HashMap();
        } else {
            if (map.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<Long, MatchPunishEffectInfo.EffectStruct>> it2 = matchPunishEffectInfo.effectToEffectStructMap.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MatchPunishEffectInfo matchPunishEffectInfo) {
        LJ(matchPunishEffectInfo);
    }

    @Override // X.C0IMD
    public final MatchPunishEffectInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MatchPunishEffectInfo matchPunishEffectInfo, List list) {
    }
}
