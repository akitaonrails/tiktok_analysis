package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CollabGiftMessage_ProtoDecoder implements C0IMD<CollabGiftMessage> {
    @Override // X.C0IMD
    public final void LIZ(CollabGiftMessage collabGiftMessage) {
        CollabGiftMessage collabGiftMessage2 = collabGiftMessage;
        CommonMessageData commonMessageData = collabGiftMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        CollabGiftActiveInfo collabGiftActiveInfo = collabGiftMessage2.activeInfo;
        if (collabGiftActiveInfo != null && collabGiftActiveInfo.contributors == null) {
            collabGiftActiveInfo.contributors = new ArrayList();
        }
        CollabGiftFullInfo collabGiftFullInfo = collabGiftMessage2.fullInfo;
        if (collabGiftFullInfo != null) {
            _CollabGiftFullInfo_ProtoDecoder.LJ(collabGiftFullInfo);
        }
        AssetsModel assetsModel = collabGiftMessage2.effect;
        if (assetsModel != null) {
            _AssetsModel_ProtoDecoder.LJ(assetsModel);
        }
    }

    @Override // X.C0IMD
    public final CollabGiftMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CollabGiftMessage collabGiftMessage = new CollabGiftMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        collabGiftMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        collabGiftMessage.baseInfo = _CollabGiftBaseInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        collabGiftMessage.activeInfo = _CollabGiftActiveInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        collabGiftMessage.fullInfo = _CollabGiftFullInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        collabGiftMessage.updateInfo = _CollabGiftUpdateInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        collabGiftMessage.effect = _AssetsModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        collabGiftMessage.finishInfo = _CollabGiftFinishInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        collabGiftMessage.msgType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return collabGiftMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CollabGiftMessage collabGiftMessage, List list) {
    }
}
