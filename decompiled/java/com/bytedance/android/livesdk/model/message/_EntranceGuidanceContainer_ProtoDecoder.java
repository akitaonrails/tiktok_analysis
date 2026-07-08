package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EntranceGuidanceContainer_ProtoDecoder implements C0IMD<EntranceGuidanceContainer> {
    public static EntranceGuidanceContainer LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EntranceGuidanceContainer entranceGuidanceContainer = new EntranceGuidanceContainer();
        entranceGuidanceContainer.extra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 101) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                String strLIZLLL = null;
                                String strLIZLLL2 = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL2 != null) {
                                        entranceGuidanceContainer.extra.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            entranceGuidanceContainer.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        entranceGuidanceContainer.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    entranceGuidanceContainer.guidanceKey = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return entranceGuidanceContainer;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EntranceGuidanceContainer entranceGuidanceContainer) {
        EntranceGuidanceContainer entranceGuidanceContainer2 = entranceGuidanceContainer;
        Text text = entranceGuidanceContainer2.text;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        if (entranceGuidanceContainer2.extra == null) {
            entranceGuidanceContainer2.extra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final EntranceGuidanceContainer LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EntranceGuidanceContainer entranceGuidanceContainer, List list) {
    }
}
