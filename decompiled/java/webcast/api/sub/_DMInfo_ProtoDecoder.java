package webcast.api.sub;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api.UpsellConsultationContent;
import com.bytedance.android.livesdk.chatroom.api._UpsellConsultationContent_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DMInfo_ProtoDecoder implements C0IMD<DMInfo> {
    public static DMInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DMInfo dMInfo = new DMInfo();
        dMInfo.suggestedQuestionList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        dMInfo.serviceInfo = _ServiceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        dMInfo.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        dMInfo.suggestedQuestionList.add(_UpsellConsultationContent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        dMInfo.dmSendType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        dMInfo.skuId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        dMInfo.capsuleSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return dMInfo;
            }
        }
    }

    public static void LJ(DMInfo dMInfo) {
        ServiceInfo serviceInfo = dMInfo.serviceInfo;
        List<UpsellConsultationContent> list = dMInfo.suggestedQuestionList;
        if (list == null) {
            dMInfo.suggestedQuestionList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<UpsellConsultationContent> it2 = dMInfo.suggestedQuestionList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(DMInfo dMInfo) {
        LJ(dMInfo);
    }

    @Override // X.C0IMD
    public final DMInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DMInfo dMInfo, List list) {
    }
}
