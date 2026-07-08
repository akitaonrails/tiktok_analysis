package com.bytedance.android.livesdk.model.message.redenvelope;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message._PublicAreaMessageCommon_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RedEnvelopMessage_ProtoDecoder implements C0IMD<RedEnvelopMessage> {
    @Override // X.C0IMD
    public final void LIZ(RedEnvelopMessage redEnvelopMessage) {
        ImageModel imageModel;
        RedEnvelopMessage redEnvelopMessage2 = redEnvelopMessage;
        CommonMessageData commonMessageData = redEnvelopMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        MessageRedEnvelopInfo messageRedEnvelopInfo = redEnvelopMessage2.envelopeInfo;
        if (messageRedEnvelopInfo != null && (imageModel = messageRedEnvelopInfo.sendUserAvatar) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = redEnvelopMessage2.publicAreaMsgCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final RedEnvelopMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RedEnvelopMessage redEnvelopMessage = new RedEnvelopMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                redEnvelopMessage.publicAreaMsgCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            redEnvelopMessage.display = c1516680pZS.LJIIJ();
                        }
                    } else {
                        redEnvelopMessage.envelopeInfo = _MessageRedEnvelopInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    redEnvelopMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return redEnvelopMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RedEnvelopMessage redEnvelopMessage, List list) {
    }
}
