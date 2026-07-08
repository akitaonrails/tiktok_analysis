package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import com.bytedance.android.livesdk.model.message.linkcore._LinkMicCommonResp_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _KickOutAllGuestsResp_ProtoDecoder implements C0IMD<KickOutAllGuestsResp> {
    @Override // X.C0IMD
    public final void LIZ(KickOutAllGuestsResp kickOutAllGuestsResp) {
        KickOutAllGuestsResp kickOutAllGuestsResp2 = kickOutAllGuestsResp;
        LinkMicCommonResp linkMicCommonResp = kickOutAllGuestsResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        if (kickOutAllGuestsResp2.removedUserIds == null) {
            kickOutAllGuestsResp2.removedUserIds = new ArrayList();
        }
        if (kickOutAllGuestsResp2.removedLinkerSessionIds == null) {
            kickOutAllGuestsResp2.removedLinkerSessionIds = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final KickOutAllGuestsResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        KickOutAllGuestsResp kickOutAllGuestsResp = new KickOutAllGuestsResp();
        kickOutAllGuestsResp.removedUserIds = new ArrayList();
        kickOutAllGuestsResp.removedLinkerSessionIds = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            Long lValueOf = null;
                            String strLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 == -1) {
                                    break;
                                }
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ2);
                            if (lValueOf != null) {
                                if (strLIZLLL != null) {
                                    kickOutAllGuestsResp.removedLinkerSessionIds.put(lValueOf, strLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        kickOutAllGuestsResp.removedUserIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    kickOutAllGuestsResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return kickOutAllGuestsResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KickOutAllGuestsResp kickOutAllGuestsResp, List list) {
    }
}
