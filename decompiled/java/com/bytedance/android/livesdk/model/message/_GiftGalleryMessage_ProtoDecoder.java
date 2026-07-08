package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.GiftGalleryMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftGalleryMessage_ProtoDecoder implements C0IMD<GiftGalleryMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftGalleryMessage giftGalleryMessage) {
        Gift gift;
        GiftGalleryMessage giftGalleryMessage2 = giftGalleryMessage;
        CommonMessageData commonMessageData = giftGalleryMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GiftGalleryMessage.GiftInfo giftInfo = giftGalleryMessage2.giftInfo;
        if (giftInfo != null && (gift = giftInfo.gift) != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
        User user = giftGalleryMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = giftGalleryMessage2.toUser;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        GiftIMPriority giftIMPriority = giftGalleryMessage2.priority;
        if (giftIMPriority != null) {
            _GiftIMPriority_ProtoDecoder.LJ(giftIMPriority);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = giftGalleryMessage2.publicAreaMsgCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final GiftGalleryMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftGalleryMessage giftGalleryMessage = new GiftGalleryMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 21) {
                                        switch (iLJI) {
                                            case 51:
                                                giftGalleryMessage.priority = _GiftIMPriority_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 52:
                                                giftGalleryMessage.logId = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case 53:
                                                giftGalleryMessage.publicAreaMsgCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            default:
                                                C1516700pZU.LJ(c1516680pZS);
                                                break;
                                        }
                                    } else {
                                        giftGalleryMessage.allSponsored = C1516700pZU.LIZ(c1516680pZS);
                                    }
                                } else {
                                    giftGalleryMessage.msgType = c1516680pZS.LJIIJ();
                                }
                            } else {
                                giftGalleryMessage.toUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            giftGalleryMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftGalleryMessage.giftInfo = _GiftGalleryMessage_GiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftGalleryMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftGalleryMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftGalleryMessage giftGalleryMessage, List list) {
    }
}
