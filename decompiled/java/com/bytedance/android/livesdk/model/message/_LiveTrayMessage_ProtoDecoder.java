package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveTrayMessage_ProtoDecoder implements C0IMD<LiveTrayMessage> {
    @Override // X.C0IMD
    public final void LIZ(LiveTrayMessage liveTrayMessage) {
        LiveTrayMessage liveTrayMessage2 = liveTrayMessage;
        CommonMessageData commonMessageData = liveTrayMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = liveTrayMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        Text text = liveTrayMessage2.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = liveTrayMessage2.describe;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        ImageModel imageModel = liveTrayMessage2.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final LiveTrayMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LiveTrayMessage liveTrayMessage = new LiveTrayMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveTrayMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        liveTrayMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveTrayMessage.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        liveTrayMessage.describe = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        liveTrayMessage.comboCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        liveTrayMessage.groupCount = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        liveTrayMessage.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveTrayMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveTrayMessage liveTrayMessage, List list) {
    }
}
