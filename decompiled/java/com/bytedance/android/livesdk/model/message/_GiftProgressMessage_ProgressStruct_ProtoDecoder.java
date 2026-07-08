package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.GiftProgressMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftProgressMessage_ProgressStruct_ProtoDecoder implements C0IMD<GiftProgressMessage.ProgressStruct> {
    public static GiftProgressMessage.ProgressStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftProgressMessage.ProgressStruct progressStruct = new GiftProgressMessage.ProgressStruct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            progressStruct.progressStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        progressStruct.progressValue = c1516680pZS.LJIIJJI();
                    }
                } else {
                    progressStruct.progressId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return progressStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftProgressMessage.ProgressStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftProgressMessage.ProgressStruct progressStruct) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftProgressMessage.ProgressStruct progressStruct, List list) {
    }
}
