package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleTaskGiftAmountGuide_ProtoDecoder implements C0IMD<BattleTaskGiftAmountGuide> {
    public static BattleTaskGiftAmountGuide LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleTaskGiftAmountGuide battleTaskGiftAmountGuide = new BattleTaskGiftAmountGuide();
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
                                            battleTaskGiftAmountGuide.recommendGiftId = c1516680pZS.LJIIJJI();
                                            break;
                                        case 22:
                                            battleTaskGiftAmountGuide.recommendGiftCount = c1516680pZS.LJIIJ();
                                            break;
                                        case 23:
                                            battleTaskGiftAmountGuide.guideContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        default:
                                            C1516700pZU.LJ(c1516680pZS);
                                            break;
                                    }
                                } else {
                                    battleTaskGiftAmountGuide.giftImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                battleTaskGiftAmountGuide.iconImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            battleTaskGiftAmountGuide.disappearDuration = c1516680pZS.LJIIJ();
                        }
                    } else {
                        battleTaskGiftAmountGuide.promptType = c1516680pZS.LJIIJ();
                    }
                } else {
                    battleTaskGiftAmountGuide.guidePrompt = _BattlePrompt_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleTaskGiftAmountGuide;
            }
        }
    }

    public static void LJ(BattleTaskGiftAmountGuide battleTaskGiftAmountGuide) {
        BattlePrompt battlePrompt = battleTaskGiftAmountGuide.guidePrompt;
        if (battlePrompt != null) {
            _BattlePrompt_ProtoDecoder.LJ(battlePrompt);
        }
        ImageModel imageModel = battleTaskGiftAmountGuide.iconImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = battleTaskGiftAmountGuide.giftImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        Text text = battleTaskGiftAmountGuide.guideContent;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleTaskGiftAmountGuide battleTaskGiftAmountGuide) {
        LJ(battleTaskGiftAmountGuide);
    }

    @Override // X.C0IMD
    public final BattleTaskGiftAmountGuide LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleTaskGiftAmountGuide battleTaskGiftAmountGuide, List list) {
    }
}
