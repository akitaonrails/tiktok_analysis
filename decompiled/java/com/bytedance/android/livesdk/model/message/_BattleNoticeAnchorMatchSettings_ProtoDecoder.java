package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleNoticeAnchorMatchSettings_ProtoDecoder implements C0IMD<BattleNoticeAnchorMatchSettings> {
    public static BattleNoticeAnchorMatchSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleNoticeAnchorMatchSettings battleNoticeAnchorMatchSettings = new BattleNoticeAnchorMatchSettings();
        battleNoticeAnchorMatchSettings.updatedSettings = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            battleNoticeAnchorMatchSettings.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        Long lValueOf2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (lValueOf != null) {
                            if (lValueOf2 != null) {
                                battleNoticeAnchorMatchSettings.updatedSettings.put(lValueOf, lValueOf2);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    battleNoticeAnchorMatchSettings.battleId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleNoticeAnchorMatchSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleNoticeAnchorMatchSettings battleNoticeAnchorMatchSettings) {
        BattleNoticeAnchorMatchSettings battleNoticeAnchorMatchSettings2 = battleNoticeAnchorMatchSettings;
        if (battleNoticeAnchorMatchSettings2.updatedSettings == null) {
            battleNoticeAnchorMatchSettings2.updatedSettings = new HashMap();
        }
        Text text = battleNoticeAnchorMatchSettings2.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final BattleNoticeAnchorMatchSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleNoticeAnchorMatchSettings battleNoticeAnchorMatchSettings, List list) {
    }
}
