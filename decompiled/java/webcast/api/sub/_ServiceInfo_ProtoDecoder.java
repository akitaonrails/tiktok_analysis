package webcast.api.sub;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api._AuditInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ServiceInfo_ProtoDecoder implements C0IMD<ServiceInfo> {
    public static ServiceInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ServiceInfo serviceInfo = new ServiceInfo();
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
                                serviceInfo.violationInfo = _AuditInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            serviceInfo.auditStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        serviceInfo.desc = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    serviceInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return serviceInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ServiceInfo serviceInfo) {
    }

    @Override // X.C0IMD
    public final ServiceInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ServiceInfo serviceInfo, List list) {
    }
}
