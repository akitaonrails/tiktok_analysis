package com.bytedance.android.livesdkapi.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder implements C0IMD<ProtoMessageFetchResult.BaseProtoMessage> {
    public static ProtoMessageFetchResult.BaseProtoMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage = new ProtoMessageFetchResult.BaseProtoMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        baseProtoMessage.method = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        baseProtoMessage.payload = c1516680pZS.LJII();
                        break;
                    case 3:
                        baseProtoMessage.msgId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        baseProtoMessage.msgType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        baseProtoMessage.offset = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        baseProtoMessage.isHistory = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        baseProtoMessage.sampleFlag = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return baseProtoMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final ProtoMessageFetchResult.BaseProtoMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage, List list) {
    }
}
