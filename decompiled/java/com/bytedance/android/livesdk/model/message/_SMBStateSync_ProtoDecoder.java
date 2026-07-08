package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.SMBInfo;
import com.bytedance.android.livesdkapi.depend.model.live._SMBInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBStateSync_ProtoDecoder implements C0IMD<SMBStateSync> {
    @Override // X.C0IMD
    public final void LIZ(SMBStateSync sMBStateSync) {
        SMBStateSync sMBStateSync2 = sMBStateSync;
        CommonMessageData commonMessageData = sMBStateSync2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        SMBInfo sMBInfo = sMBStateSync2.smbInfo;
        if (sMBInfo != null) {
            _SMBInfo_ProtoDecoder.LJ(sMBInfo);
        }
    }

    @Override // X.C0IMD
    public final SMBStateSync LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SMBStateSync sMBStateSync = new SMBStateSync();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            sMBStateSync.smbInfo = _SMBInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        sMBStateSync.anchorId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    sMBStateSync.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBStateSync;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBStateSync sMBStateSync, List list) {
    }
}
