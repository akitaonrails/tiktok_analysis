package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match.VirtualTicketEnvelopeInfo;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicBattleArtifactMessage_ProtoDecoder implements C0IMD<LinkMicBattleArtifactMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicBattleArtifactMessage linkMicBattleArtifactMessage) {
        LinkMicBattleArtifactMessage linkMicBattleArtifactMessage2 = linkMicBattleArtifactMessage;
        CommonMessageData commonMessageData = linkMicBattleArtifactMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<BattleArtifact> list = linkMicBattleArtifactMessage2.artifacts;
        if (list == null) {
            linkMicBattleArtifactMessage2.artifacts = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (BattleArtifact battleArtifact : linkMicBattleArtifactMessage2.artifacts) {
            if (battleArtifact != null) {
                BattleArtifactUseVirtualTicketInfo battleArtifactUseVirtualTicketInfo = battleArtifact.useVirtualTicket;
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
                VirtualTicketEnvelopeInfo virtualTicketEnvelopeInfo = battleArtifact.virtualTicketEnvelopeSendNotice;
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
        }
    }

    @Override // X.C0IMD
    public final LinkMicBattleArtifactMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicBattleArtifactMessage linkMicBattleArtifactMessage = new LinkMicBattleArtifactMessage();
        linkMicBattleArtifactMessage.artifacts = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkMicBattleArtifactMessage.artifacts.add(_BattleArtifact_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        linkMicBattleArtifactMessage.battleId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    linkMicBattleArtifactMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicBattleArtifactMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicBattleArtifactMessage linkMicBattleArtifactMessage, List list) {
    }
}
