package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubscriptionGuideMessage_ProtoDecoder implements C0IMD<SubscriptionGuideMessage> {
    @Override // X.C0IMD
    public final void LIZ(SubscriptionGuideMessage subscriptionGuideMessage) {
        SubscriptionGuideMessage subscriptionGuideMessage2 = subscriptionGuideMessage;
        CommonMessageData commonMessageData = subscriptionGuideMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = subscriptionGuideMessage2.description;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = subscriptionGuideMessage2.buttonName;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final SubscriptionGuideMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SubscriptionGuideMessage subscriptionGuideMessage = new SubscriptionGuideMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subscriptionGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        subscriptionGuideMessage.description = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        subscriptionGuideMessage.buttonName = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        subscriptionGuideMessage.buttonUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        subscriptionGuideMessage.capsuleScene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        subscriptionGuideMessage.from_user_id = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subscriptionGuideMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubscriptionGuideMessage subscriptionGuideMessage, List list) {
    }
}
