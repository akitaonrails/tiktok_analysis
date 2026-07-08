package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.proto._RankUserEnigmaInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankTextMessage_ProtoDecoder implements C0IMD<RankTextMessage> {
    @Override // X.C0IMD
    public final void LIZ(RankTextMessage rankTextMessage) {
        RankTextMessage rankTextMessage2 = rankTextMessage;
        CommonMessageData commonMessageData = rankTextMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = rankTextMessage2.selfGetBadgeMsg;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = rankTextMessage2.otherGetBadgeMsg;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        ImageModel imageModel = rankTextMessage2.leftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text3 = rankTextMessage2.content;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = rankTextMessage2.publicAreaMsgCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final RankTextMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RankTextMessage rankTextMessage = new RankTextMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rankTextMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        rankTextMessage.scene = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        rankTextMessage.ownerIdxBeforeUpdate = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 4:
                        rankTextMessage.ownerIdxAfterUpdate = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 5:
                        rankTextMessage.selfGetBadgeMsg = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        rankTextMessage.otherGetBadgeMsg = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        rankTextMessage.curUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        rankTextMessage.leftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        rankTextMessage.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        rankTextMessage.rankType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        rankTextMessage.userEnigmaInfo = _RankUserEnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        rankTextMessage.publicAreaMsgCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rankTextMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankTextMessage rankTextMessage, List list) {
    }
}
