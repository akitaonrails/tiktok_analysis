package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WarningTag_ProtoDecoder implements C0IMD<WarningTag> {
    public static WarningTag LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WarningTag warningTag = new WarningTag();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        warningTag.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        warningTag.duration = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        warningTag.tagSource = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        warningTag.punishInfo = _PunishEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        warningTag.style = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        warningTag.detailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        warningTag.iconType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return warningTag;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WarningTag warningTag) {
        Text text = warningTag.text;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final WarningTag LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WarningTag warningTag, List list) {
    }
}
