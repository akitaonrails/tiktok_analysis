package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model._GiftPick_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ViewerPicksGiftPickReviewMessage_ProtoDecoder implements C0IMD<ViewerPicksGiftPickReviewMessage> {
    @Override // X.C0IMD
    public final void LIZ(ViewerPicksGiftPickReviewMessage viewerPicksGiftPickReviewMessage) {
        ViewerPicksGiftPickReviewMessage viewerPicksGiftPickReviewMessage2 = viewerPicksGiftPickReviewMessage;
        CommonMessageData commonMessageData = viewerPicksGiftPickReviewMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GiftPick giftPick = viewerPicksGiftPickReviewMessage2.giftPick;
        if (giftPick != null) {
            _GiftPick_ProtoDecoder.LJ(giftPick);
        }
    }

    @Override // X.C0IMD
    public final ViewerPicksGiftPickReviewMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ViewerPicksGiftPickReviewMessage viewerPicksGiftPickReviewMessage = new ViewerPicksGiftPickReviewMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                viewerPicksGiftPickReviewMessage.rejectReason = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            viewerPicksGiftPickReviewMessage.status = c1516680pZS.LJIIJ();
                        }
                    } else {
                        viewerPicksGiftPickReviewMessage.giftPick = _GiftPick_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    viewerPicksGiftPickReviewMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return viewerPicksGiftPickReviewMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ViewerPicksGiftPickReviewMessage viewerPicksGiftPickReviewMessage, List list) {
    }
}
