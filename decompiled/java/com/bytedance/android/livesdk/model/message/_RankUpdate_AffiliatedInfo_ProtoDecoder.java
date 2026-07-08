package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RankUpdate;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model.SettleInfo;
import com.bytedance.android.livesdk.rank.model._SettleInfo_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model._TeamRankBonusTime_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankUpdate_AffiliatedInfo_ProtoDecoder implements C0IMD<RankUpdate.AffiliatedInfo> {
    public static RankUpdate.AffiliatedInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RankUpdate.AffiliatedInfo affiliatedInfo = new RankUpdate.AffiliatedInfo();
        affiliatedInfo.stickerTrackParam = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        affiliatedInfo.textContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        affiliatedInfo.gapDesc = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        affiliatedInfo.realTimeRank = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        affiliatedInfo.teamRankBonusTime = _TeamRankBonusTime_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        affiliatedInfo.settleInfo = _SettleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        affiliatedInfo.middayPeakTimeStamp = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        affiliatedInfo.stickerShowScene = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        affiliatedInfo.stickerSettleShowDuration = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        affiliatedInfo.stickerGapDesc = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        affiliatedInfo.stickerTrackParam.put(strLIZLLL, strLIZLLL2);
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
                c1516680pZS.LJ(jLIZJ);
                return affiliatedInfo;
            }
        }
    }

    public static void LJ(RankUpdate.AffiliatedInfo affiliatedInfo) {
        Text text = affiliatedInfo.textContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = affiliatedInfo.gapDesc;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        SettleInfo settleInfo = affiliatedInfo.settleInfo;
        Text text3 = affiliatedInfo.stickerGapDesc;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        if (affiliatedInfo.stickerTrackParam == null) {
            affiliatedInfo.stickerTrackParam = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RankUpdate.AffiliatedInfo affiliatedInfo) {
        LJ(affiliatedInfo);
    }

    @Override // X.C0IMD
    public final RankUpdate.AffiliatedInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankUpdate.AffiliatedInfo affiliatedInfo, List list) {
    }
}
