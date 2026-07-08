package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _VideoLiveGoodsRcmdMessage_ProtoDecoder implements C0IMD<VideoLiveGoodsRcmdMessage> {
    @Override // X.C0IMD
    public final void LIZ(VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage) {
        CommonMessageData commonMessageData = videoLiveGoodsRcmdMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final VideoLiveGoodsRcmdMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage = new VideoLiveGoodsRcmdMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        videoLiveGoodsRcmdMessage.rcmdGoodsId = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    videoLiveGoodsRcmdMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return videoLiveGoodsRcmdMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VideoLiveGoodsRcmdMessage videoLiveGoodsRcmdMessage, List list) {
    }
}
