package webcast.api.sub;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api.SimplePinCardInfo;
import com.bytedance.android.livesdk.chatroom.api._SimplePinCardInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBServicePinInfo_ProtoDecoder implements C0IMD<SMBServicePinInfo> {
    public static SMBServicePinInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBServicePinInfo sMBServicePinInfo = new SMBServicePinInfo();
        sMBServicePinInfo.pinCardList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        sMBServicePinInfo.pinInfo = _PerksPinPanel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    sMBServicePinInfo.pinCardList.add(_SimplePinCardInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBServicePinInfo;
            }
        }
    }

    public static void LJ(SMBServicePinInfo sMBServicePinInfo) {
        List<SimplePinCardInfo> list = sMBServicePinInfo.pinCardList;
        if (list == null) {
            sMBServicePinInfo.pinCardList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (SimplePinCardInfo simplePinCardInfo : sMBServicePinInfo.pinCardList) {
            if (simplePinCardInfo != null) {
                _SimplePinCardInfo_ProtoDecoder.LJ(simplePinCardInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SMBServicePinInfo sMBServicePinInfo) {
        LJ(sMBServicePinInfo);
    }

    @Override // X.C0IMD
    public final SMBServicePinInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBServicePinInfo sMBServicePinInfo, List list) {
    }
}
