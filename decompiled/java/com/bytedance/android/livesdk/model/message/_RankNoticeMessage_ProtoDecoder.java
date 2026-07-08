package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankNoticeMessage_ProtoDecoder implements C0IMD<RankNoticeMessage> {
    @Override // X.C0IMD
    public final void LIZ(RankNoticeMessage rankNoticeMessage) {
        RankNoticeMessage rankNoticeMessage2 = rankNoticeMessage;
        CommonMessageData commonMessageData = rankNoticeMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = rankNoticeMessage2.contentText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        ImageModel imageModel = rankNoticeMessage2.contentIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text2 = rankNoticeMessage2.affiliatedContentText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final RankNoticeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RankNoticeMessage rankNoticeMessage = new RankNoticeMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 20) {
                    switch (iLJI) {
                        case 1:
                            rankNoticeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            rankNoticeMessage.scene = c1516680pZS.LJIIJ();
                            break;
                        case 3:
                            rankNoticeMessage.rankType = c1516680pZS.LJIIJ();
                            break;
                        case 4:
                            rankNoticeMessage.ownerRankInfo = _OwnerRankInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            rankNoticeMessage.contentText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            rankNoticeMessage.contentIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            rankNoticeMessage.affiliatedContentText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    rankNoticeMessage.leagueMatchExtra = _LeagueMatchExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rankNoticeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankNoticeMessage rankNoticeMessage, List list) {
    }
}
