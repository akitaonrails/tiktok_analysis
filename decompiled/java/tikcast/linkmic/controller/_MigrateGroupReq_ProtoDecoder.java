package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _MigrateGroupReq_ProtoDecoder implements C0IMD<MigrateGroupReq> {
    @Override // X.C0IMD
    public final void LIZ(MigrateGroupReq migrateGroupReq) {
        LinkCommon linkCommon = migrateGroupReq.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
    }

    @Override // X.C0IMD
    public final MigrateGroupReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MigrateGroupReq migrateGroupReq = new MigrateGroupReq();
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
                                migrateGroupReq.targetGroupChannelId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            migrateGroupReq.sourceGroupChannelId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        migrateGroupReq.myself = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    migrateGroupReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return migrateGroupReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MigrateGroupReq migrateGroupReq, List list) {
    }
}
