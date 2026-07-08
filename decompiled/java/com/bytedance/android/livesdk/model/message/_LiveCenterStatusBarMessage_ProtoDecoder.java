package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.RealtimeLiveCenterLopInfo;
import webcast.data._RealtimeLiveCenterLopInfo_ProtoDecoder;
import webcast.data._RealtimeLiveCenterTrafficToolInfoIM_ProtoDecoder;
import webcast.data._RealtimeLiveCenterWhiteBoxIM_ProtoDecoder;
import webcast.data._RealtimeLiveCenterWhiteBoxPreviewIM_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveCenterStatusBarMessage_ProtoDecoder implements C0IMD<LiveCenterStatusBarMessage> {
    @Override // X.C0IMD
    public final void LIZ(LiveCenterStatusBarMessage liveCenterStatusBarMessage) {
        LiveCenterStatusBarMessage liveCenterStatusBarMessage2 = liveCenterStatusBarMessage;
        CommonMessageData commonMessageData = liveCenterStatusBarMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        RealtimeLiveCenterLopInfo realtimeLiveCenterLopInfo = liveCenterStatusBarMessage2.lopInfo;
        if (realtimeLiveCenterLopInfo != null) {
            _RealtimeLiveCenterLopInfo_ProtoDecoder.LJ(realtimeLiveCenterLopInfo);
        }
    }

    @Override // X.C0IMD
    public final LiveCenterStatusBarMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LiveCenterStatusBarMessage liveCenterStatusBarMessage = new LiveCenterStatusBarMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                switch (iLJI) {
                                    case 100:
                                        liveCenterStatusBarMessage.lopInfo = _RealtimeLiveCenterLopInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 101:
                                        liveCenterStatusBarMessage.trafficToolInfo = _RealtimeLiveCenterTrafficToolInfoIM_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 102:
                                        liveCenterStatusBarMessage.whiteBox = _RealtimeLiveCenterWhiteBoxIM_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    case 103:
                                        liveCenterStatusBarMessage.whiteBoxPreview = _RealtimeLiveCenterWhiteBoxPreviewIM_ProtoDecoder.LIZLLL(c1516680pZS);
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                            } else {
                                liveCenterStatusBarMessage.type = c1516680pZS.LJIIJ();
                            }
                        } else {
                            liveCenterStatusBarMessage.text = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        liveCenterStatusBarMessage.duration = c1516680pZS.LJIIJJI();
                    }
                } else {
                    liveCenterStatusBarMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveCenterStatusBarMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveCenterStatusBarMessage liveCenterStatusBarMessage, List list) {
    }
}
