package webcast.api.partnership;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.api.partnership.AnchorInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorInfoResponse_PunishInfo_ProtoDecoder implements C0IMD<AnchorInfoResponse.PunishInfo> {
    public static AnchorInfoResponse.PunishInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorInfoResponse.PunishInfo punishInfo = new AnchorInfoResponse.PunishInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        punishInfo.punishEventInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    punishInfo.punishText = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return punishInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorInfoResponse.PunishInfo punishInfo) {
    }

    @Override // X.C0IMD
    public final AnchorInfoResponse.PunishInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorInfoResponse.PunishInfo punishInfo, List list) {
    }
}
