package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BarrageMessage_RightLabel_ProtoDecoder implements C0IMD<BarrageMessage.RightLabel> {
    public static BarrageMessage.RightLabel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BarrageMessage.RightLabel rightLabel = new BarrageMessage.RightLabel();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            rightLabel.height = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        rightLabel.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    rightLabel.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rightLabel;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BarrageMessage.RightLabel rightLabel) {
        Text text = rightLabel.content;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final BarrageMessage.RightLabel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BarrageMessage.RightLabel rightLabel, List list) {
    }
}
