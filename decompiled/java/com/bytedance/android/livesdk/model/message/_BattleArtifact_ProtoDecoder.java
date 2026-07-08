package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match._VirtualTicketEnvelopeInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BattleArtifact_ProtoDecoder implements C0IMD<BattleArtifact> {
    public static BattleArtifact LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BattleArtifact battleArtifact = new BattleArtifact();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    switch (iLJI) {
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            battleArtifact.useVirtualTicket = _BattleArtifactUseVirtualTicketInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            battleArtifact.virtualTicketEnvelopeSendNotice = _VirtualTicketEnvelopeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            battleArtifact.virtualTicketEnvelopeRushOutNotice = _VirtualTicketEnvelopeRushOutNotice_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    battleArtifact.artifactType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleArtifact;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BattleArtifact battleArtifact) {
        BattleArtifact battleArtifact2 = battleArtifact;
        BattleArtifactUseVirtualTicketInfo battleArtifactUseVirtualTicketInfo = battleArtifact2.useVirtualTicket;
        if (battleArtifactUseVirtualTicketInfo != null) {
            ImageModel imageModel = battleArtifactUseVirtualTicketInfo.ticketIcon;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            Text text = battleArtifactUseVirtualTicketInfo.publicMessage;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
        }
        VirtualTicketEnvelopeInfo virtualTicketEnvelopeInfo = battleArtifact2.virtualTicketEnvelopeSendNotice;
        if (virtualTicketEnvelopeInfo != null) {
            ImageModel imageModel2 = virtualTicketEnvelopeInfo.envelopeIcon;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
            Text text2 = virtualTicketEnvelopeInfo.crossRoomGuide;
            if (text2 != null) {
                _Text_ProtoDecoder.LJ(text2);
            }
        }
    }

    @Override // X.C0IMD
    public final BattleArtifact LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BattleArtifact battleArtifact, List list) {
    }
}
