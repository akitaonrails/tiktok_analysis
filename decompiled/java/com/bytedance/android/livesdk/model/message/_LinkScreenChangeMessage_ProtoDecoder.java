package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkScreenChangeMessage_ProtoDecoder implements C0IMD<LinkScreenChangeMessage> {
    @Override // X.C0IMD
    public final void LIZ(LinkScreenChangeMessage linkScreenChangeMessage) {
        LinkScreenChangeMessage linkScreenChangeMessage2 = linkScreenChangeMessage;
        CommonMessageData commonMessageData = linkScreenChangeMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        LinkerEnlargeStatusSynContent linkerEnlargeStatusSynContent = linkScreenChangeMessage2.enlargeStatusSyn;
        if (linkerEnlargeStatusSynContent != null && linkerEnlargeStatusSynContent.linkedUserUiPositions == null) {
            linkerEnlargeStatusSynContent.linkedUserUiPositions = new ArrayList();
        }
        EnlargePositionStatusSynContent enlargePositionStatusSynContent = linkScreenChangeMessage2.enlargePosStatusSyn;
        if (enlargePositionStatusSynContent != null) {
            _EnlargePositionStatusSynContent_ProtoDecoder.LJ(enlargePositionStatusSynContent);
        }
    }

    @Override // X.C0IMD
    public final LinkScreenChangeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkScreenChangeMessage linkScreenChangeMessage = new LinkScreenChangeMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    linkScreenChangeMessage.enlargePosStatusSyn = _EnlargePositionStatusSynContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                linkScreenChangeMessage.enlargeStatusSyn = _LinkerEnlargeStatusSynContent_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            linkScreenChangeMessage.guestCancelEnlarge = _LinkerGuestCancelEnlargeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        linkScreenChangeMessage.messageType = c1516680pZS.LJIIJ();
                    }
                } else {
                    linkScreenChangeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkScreenChangeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkScreenChangeMessage linkScreenChangeMessage, List list) {
    }
}
