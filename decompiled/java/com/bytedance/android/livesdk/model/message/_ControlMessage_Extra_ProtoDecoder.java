package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ControlMessage_Extra_ProtoDecoder implements C0IMD<ControlMessage.Extra> {
    public static ControlMessage.Extra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ControlMessage.Extra extra = new ControlMessage.Extra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 8) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    extra.source = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                extra.violationReason = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            extra.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        extra.reasonNo = c1516680pZS.LJIIJJI();
                    }
                } else {
                    extra.banInfoUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return extra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ControlMessage.Extra extra) {
        ControlMessage.Extra extra2 = extra;
        Text text = extra2.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = extra2.violationReason;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final ControlMessage.Extra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ControlMessage.Extra extra, List list) {
    }
}
