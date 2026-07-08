package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdk.viewer_picks.model._ViewerPicksInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ViewerPicksUpdateMessage_ProtoDecoder implements C0IMD<ViewerPicksUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(ViewerPicksUpdateMessage viewerPicksUpdateMessage) {
        ViewerPicksUpdateMessage viewerPicksUpdateMessage2 = viewerPicksUpdateMessage;
        CommonMessageData commonMessageData = viewerPicksUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ViewerPicksInfo viewerPicksInfo = viewerPicksUpdateMessage2.info;
        if (viewerPicksInfo != null) {
            _ViewerPicksInfo_ProtoDecoder.LJ(viewerPicksInfo);
        }
    }

    @Override // X.C0IMD
    public final ViewerPicksUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ViewerPicksUpdateMessage viewerPicksUpdateMessage = new ViewerPicksUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            viewerPicksUpdateMessage.info = _ViewerPicksInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        viewerPicksUpdateMessage.updateType = c1516680pZS.LJIIJ();
                    }
                } else {
                    viewerPicksUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return viewerPicksUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ViewerPicksUpdateMessage viewerPicksUpdateMessage, List list) {
    }
}
