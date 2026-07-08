package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OecLiveManagerMessage_ProtoDecoder implements C0IMD<OecLiveManagerMessage> {
    @Override // X.C0IMD
    public final void LIZ(OecLiveManagerMessage oecLiveManagerMessage) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3;
        ImageModel imageModel4;
        ImageModel imageModel5;
        User user;
        ImageModel imageModel6;
        OecLiveManagerMessage oecLiveManagerMessage2 = oecLiveManagerMessage;
        CommonMessageData commonMessageData = oecLiveManagerMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        PurchaseProductInfo purchaseProductInfo = oecLiveManagerMessage2.purchaseProductInfo;
        if (purchaseProductInfo != null) {
            User user2 = purchaseProductInfo.user;
            if (user2 != null) {
                _User_ProtoDecoder.LJ(user2);
            }
            Product product = purchaseProductInfo.product;
            if (product != null && (imageModel6 = product.cover) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel6);
            }
        }
        SubscriptionInfo subscriptionInfo = oecLiveManagerMessage2.subscriptionInfo;
        if (subscriptionInfo != null && (user = subscriptionInfo.user) != null) {
            _User_ProtoDecoder.LJ(user);
        }
        GiveawayInfo giveawayInfo = oecLiveManagerMessage2.giveawayInfo;
        if (giveawayInfo != null) {
            User user3 = giveawayInfo.winner;
            if (user3 != null) {
                _User_ProtoDecoder.LJ(user3);
            }
            Product product2 = giveawayInfo.product;
            if (product2 != null && (imageModel5 = product2.cover) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel5);
            }
        }
        AskDemoInfo askDemoInfo = oecLiveManagerMessage2.askDemoInfo;
        if (askDemoInfo != null) {
            User user4 = askDemoInfo.user;
            if (user4 != null) {
                _User_ProtoDecoder.LJ(user4);
            }
            Product product3 = askDemoInfo.product;
            if (product3 != null && (imageModel4 = product3.cover) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel4);
            }
        }
        AuctionResult auctionResult = oecLiveManagerMessage2.auctionResult;
        if (auctionResult != null) {
            User user5 = auctionResult.user;
            if (user5 != null) {
                _User_ProtoDecoder.LJ(user5);
            }
            Product product4 = auctionResult.product;
            if (product4 != null && (imageModel3 = product4.cover) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel3);
            }
        }
        AuctionActivityData auctionActivityData = oecLiveManagerMessage2.auctionActivityData;
        if (auctionActivityData != null) {
            User user6 = auctionActivityData.user;
            if (user6 != null) {
                _User_ProtoDecoder.LJ(user6);
            }
            Product product5 = auctionActivityData.product;
            if (product5 != null && (imageModel2 = product5.cover) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
            Sku sku = auctionActivityData.sku;
            if (sku != null && (imageModel = sku.cover) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final OecLiveManagerMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        OecLiveManagerMessage oecLiveManagerMessage = new OecLiveManagerMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        oecLiveManagerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        oecLiveManagerMessage.messageType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        oecLiveManagerMessage.purchaseProductInfo = _PurchaseProductInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        oecLiveManagerMessage.subscriptionInfo = _SubscriptionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        oecLiveManagerMessage.giveawayInfo = _GiveawayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        oecLiveManagerMessage.askDemoInfo = _AskDemoInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                    case 8:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        oecLiveManagerMessage.violationInfo = _ViolationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        oecLiveManagerMessage.auctionResult = _AuctionResult_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        oecLiveManagerMessage.auctionActivityData = _AuctionActivityData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return oecLiveManagerMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OecLiveManagerMessage oecLiveManagerMessage, List list) {
    }
}
