package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleArtifactUseVirtualTicketInfo_ProtoDecoder implements C0IMD<BattleArtifactUseVirtualTicketInfo> {
    public static BattleArtifactUseVirtualTicketInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleArtifactUseVirtualTicketInfo battleArtifactUseVirtualTicketInfo = new BattleArtifactUseVirtualTicketInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        battleArtifactUseVirtualTicketInfo.itemId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        battleArtifactUseVirtualTicketInfo.ticketIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        battleArtifactUseVirtualTicketInfo.fromUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        battleArtifactUseVirtualTicketInfo.toUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        battleArtifactUseVirtualTicketInfo.toRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        battleArtifactUseVirtualTicketInfo.count = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        battleArtifactUseVirtualTicketInfo.score = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        battleArtifactUseVirtualTicketInfo.comboCount = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        battleArtifactUseVirtualTicketInfo.comboScore = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        battleArtifactUseVirtualTicketInfo.comboEnd = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        battleArtifactUseVirtualTicketInfo.publicMessage = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleArtifactUseVirtualTicketInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleArtifactUseVirtualTicketInfo battleArtifactUseVirtualTicketInfo) {
        BattleArtifactUseVirtualTicketInfo battleArtifactUseVirtualTicketInfo2 = battleArtifactUseVirtualTicketInfo;
        ImageModel imageModel = battleArtifactUseVirtualTicketInfo2.ticketIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = battleArtifactUseVirtualTicketInfo2.publicMessage;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final BattleArtifactUseVirtualTicketInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleArtifactUseVirtualTicketInfo battleArtifactUseVirtualTicketInfo, List list) {
    }
}
