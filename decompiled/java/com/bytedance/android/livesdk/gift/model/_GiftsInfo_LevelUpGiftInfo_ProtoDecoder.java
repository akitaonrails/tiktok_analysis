package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftsInfo_LevelUpGiftInfo_ProtoDecoder implements C0IMD<GiftsInfo.LevelUpGiftInfo> {
    public static GiftsInfo.LevelUpGiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftsInfo.LevelUpGiftInfo levelUpGiftInfo = new GiftsInfo.LevelUpGiftInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        levelUpGiftInfo.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        levelUpGiftInfo.leftCountToLevelUp = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        levelUpGiftInfo.levelUpCount = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        levelUpGiftInfo.currentCount = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        levelUpGiftInfo.numOfUpgradeGiftsLeft = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        levelUpGiftInfo.showId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        levelUpGiftInfo.minimumLevelGrade = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        levelUpGiftInfo.userBlastStatus = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        levelUpGiftInfo.blastEndTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return levelUpGiftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftsInfo.LevelUpGiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftsInfo.LevelUpGiftInfo levelUpGiftInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftsInfo.LevelUpGiftInfo levelUpGiftInfo, List list) {
    }
}
