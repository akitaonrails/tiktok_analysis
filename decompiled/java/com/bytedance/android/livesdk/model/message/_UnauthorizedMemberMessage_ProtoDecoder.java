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
public final class _UnauthorizedMemberMessage_ProtoDecoder implements C0IMD<UnauthorizedMemberMessage> {
    @Override // X.C0IMD
    public final void LIZ(UnauthorizedMemberMessage unauthorizedMemberMessage) {
        UnauthorizedMemberMessage unauthorizedMemberMessage2 = unauthorizedMemberMessage;
        CommonMessageData commonMessageData = unauthorizedMemberMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = unauthorizedMemberMessage2.nickNamePrefix;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = unauthorizedMemberMessage2.enterText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = unauthorizedMemberMessage2.publicAreaCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final UnauthorizedMemberMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UnauthorizedMemberMessage unauthorizedMemberMessage = new UnauthorizedMemberMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        unauthorizedMemberMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        unauthorizedMemberMessage.action = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        unauthorizedMemberMessage.nickNamePrefix = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        unauthorizedMemberMessage.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        unauthorizedMemberMessage.enterText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        unauthorizedMemberMessage.publicAreaCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return unauthorizedMemberMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UnauthorizedMemberMessage unauthorizedMemberMessage, List list) {
    }
}
