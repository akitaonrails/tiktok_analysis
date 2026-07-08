package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MsgMeta_ProtoDecoder implements C0IMD<MsgMeta> {
    public static MsgMeta LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MsgMeta msgMeta = new MsgMeta();
        msgMeta.reasons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            msgMeta.reasons.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        msgMeta.serverSendMs = c1516680pZS.LJIIJJI();
                    }
                } else {
                    msgMeta.sourceOperateMs = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return msgMeta;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MsgMeta msgMeta) {
        MsgMeta msgMeta2 = msgMeta;
        if (msgMeta2.reasons == null) {
            msgMeta2.reasons = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final MsgMeta LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MsgMeta msgMeta, List list) {
    }
}
