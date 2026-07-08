package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomPushMessage_ProtoDecoder implements C0IMD<RoomPushMessage> {
    @Override // X.C0IMD
    public final void LIZ(RoomPushMessage roomPushMessage) {
        RoomPushMessage roomPushMessage2 = roomPushMessage;
        CommonMessageData commonMessageData = roomPushMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = roomPushMessage2.actionIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        FlexImageModel flexImageModel = roomPushMessage2.newBackgroundImage;
        if (flexImageModel != null) {
            if (flexImageModel.urlList == null) {
                flexImageModel.urlList = new ArrayList();
            }
            if (flexImageModel.flexSetting == null) {
                flexImageModel.flexSetting = new ArrayList();
            }
        }
    }

    @Override // X.C0IMD
    public final RoomPushMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RoomPushMessage roomPushMessage = new RoomPushMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 6) {
                            if (iLJI != 7) {
                                if (iLJI != 8) {
                                    switch (iLJI) {
                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                            roomPushMessage.actionIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case BdTuring.TYPE_EMAIL /* 11 */:
                                            roomPushMessage.newBackgroundImage = _FlexImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                            break;
                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                            roomPushMessage.source = C1516700pZU.LIZLLL(c1516680pZS);
                                            break;
                                        default:
                                            C1516700pZU.LJ(c1516680pZS);
                                            break;
                                    }
                                } else {
                                    roomPushMessage.pushDisplayTime = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                roomPushMessage.actionType = String.valueOf(c1516680pZS.LJIIJJI());
                            }
                        } else {
                            roomPushMessage.actionContent = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        roomPushMessage.color = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    roomPushMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomPushMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomPushMessage roomPushMessage, List list) {
    }
}
