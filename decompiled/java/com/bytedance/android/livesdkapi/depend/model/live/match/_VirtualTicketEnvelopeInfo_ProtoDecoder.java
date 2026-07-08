package com.bytedance.android.livesdkapi.depend.model.live.match;

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
public final class _VirtualTicketEnvelopeInfo_ProtoDecoder implements C0IMD<VirtualTicketEnvelopeInfo> {
    public static VirtualTicketEnvelopeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        VirtualTicketEnvelopeInfo virtualTicketEnvelopeInfo = new VirtualTicketEnvelopeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        virtualTicketEnvelopeInfo.envelopeId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        virtualTicketEnvelopeInfo.nameKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        virtualTicketEnvelopeInfo.envelopeIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        virtualTicketEnvelopeInfo.sendTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        virtualTicketEnvelopeInfo.displaySeconds = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        virtualTicketEnvelopeInfo.rushSeconds = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        virtualTicketEnvelopeInfo.toAnchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        virtualTicketEnvelopeInfo.toRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        virtualTicketEnvelopeInfo.crossRoomGuide = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        virtualTicketEnvelopeInfo.ticketCount = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return virtualTicketEnvelopeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(VirtualTicketEnvelopeInfo virtualTicketEnvelopeInfo) {
        VirtualTicketEnvelopeInfo virtualTicketEnvelopeInfo2 = virtualTicketEnvelopeInfo;
        ImageModel imageModel = virtualTicketEnvelopeInfo2.envelopeIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = virtualTicketEnvelopeInfo2.crossRoomGuide;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final VirtualTicketEnvelopeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VirtualTicketEnvelopeInfo virtualTicketEnvelopeInfo, List list) {
    }
}
