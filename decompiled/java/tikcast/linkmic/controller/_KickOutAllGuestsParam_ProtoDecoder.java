package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _KickOutAllGuestsParam_ProtoDecoder implements C0IMD<KickOutAllGuestsParam> {
    @Override // X.C0IMD
    public final void LIZ(KickOutAllGuestsParam kickOutAllGuestsParam) {
        LinkCommon linkCommon = kickOutAllGuestsParam.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
    }

    @Override // X.C0IMD
    public final KickOutAllGuestsParam LIZJ(C1516680pZS c1516680pZS) throws IOException {
        KickOutAllGuestsParam kickOutAllGuestsParam = new KickOutAllGuestsParam();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 100) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        kickOutAllGuestsParam.extendExtra = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    kickOutAllGuestsParam.groupChannelId = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                kickOutAllGuestsParam.reason = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            kickOutAllGuestsParam.channelId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        kickOutAllGuestsParam.myself = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    kickOutAllGuestsParam.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return kickOutAllGuestsParam;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KickOutAllGuestsParam kickOutAllGuestsParam, List list) {
    }
}
