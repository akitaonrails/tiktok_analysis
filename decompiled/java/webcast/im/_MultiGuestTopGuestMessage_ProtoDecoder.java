package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play._TopGuestMetaContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestTopGuestMessage_ProtoDecoder implements C0IMD<MultiGuestTopGuestMessage> {
    @Override // X.C0IMD
    public final void LIZ(MultiGuestTopGuestMessage multiGuestTopGuestMessage) {
        MultiGuestTopGuestMessage multiGuestTopGuestMessage2 = multiGuestTopGuestMessage;
        CommonMessageData commonMessageData = multiGuestTopGuestMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        TopGuestStartContent topGuestStartContent = multiGuestTopGuestMessage2.topGuestStartContent;
        if (topGuestStartContent != null) {
            _TopGuestStartContent_ProtoDecoder.LJ(topGuestStartContent);
        }
        TopGuestEndContent topGuestEndContent = multiGuestTopGuestMessage2.topGuestEndContent;
        if (topGuestEndContent != null) {
            _TopGuestEndContent_ProtoDecoder.LJ(topGuestEndContent);
        }
    }

    @Override // X.C0IMD
    public final MultiGuestTopGuestMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestTopGuestMessage multiGuestTopGuestMessage = new MultiGuestTopGuestMessage();
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
                                    multiGuestTopGuestMessage.topGuestEndContent = _TopGuestEndContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                multiGuestTopGuestMessage.topGuestStartContent = _TopGuestStartContent_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            multiGuestTopGuestMessage.messageType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        multiGuestTopGuestMessage.metaContent = _TopGuestMetaContent_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    multiGuestTopGuestMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestTopGuestMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestTopGuestMessage multiGuestTopGuestMessage, List list) {
    }
}
