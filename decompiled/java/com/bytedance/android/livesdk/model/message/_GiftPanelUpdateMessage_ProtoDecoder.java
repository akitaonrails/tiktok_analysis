package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPanelUpdateMessage_ProtoDecoder implements C0IMD<GiftPanelUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftPanelUpdateMessage giftPanelUpdateMessage) {
        GiftPanelUpdateMessage giftPanelUpdateMessage2 = giftPanelUpdateMessage;
        CommonMessageData commonMessageData = giftPanelUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GalleryData galleryData = giftPanelUpdateMessage2.galleryData;
        if (galleryData != null) {
            _GalleryData_ProtoDecoder.LJ(galleryData);
        }
        GoalData goalData = giftPanelUpdateMessage2.goalData;
        if (goalData != null) {
            _GoalData_ProtoDecoder.LJ(goalData);
        }
        RoomBasedGiftData roomBasedGiftData = giftPanelUpdateMessage2.roomBasedGiftData;
        if (roomBasedGiftData != null) {
            _RoomBasedGiftData_ProtoDecoder.LJ(roomBasedGiftData);
        }
    }

    @Override // X.C0IMD
    public final GiftPanelUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftPanelUpdateMessage giftPanelUpdateMessage = new GiftPanelUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 100) {
                                switch (iLJI) {
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        giftPanelUpdateMessage.galleryData = _GalleryData_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        giftPanelUpdateMessage.goalData = _GoalData_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        giftPanelUpdateMessage.roomBasedGiftData = _RoomBasedGiftData_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                            } else {
                                giftPanelUpdateMessage.strategyContext = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            giftPanelUpdateMessage.timestamp = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        giftPanelUpdateMessage.roomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftPanelUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPanelUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPanelUpdateMessage giftPanelUpdateMessage, List list) {
    }
}
