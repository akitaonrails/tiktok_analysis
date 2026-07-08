package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostSettingsUpdateMessage_ProtoDecoder implements C0IMD<CohostSettingsUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(CohostSettingsUpdateMessage cohostSettingsUpdateMessage) {
        CohostSettingsUpdateMessage cohostSettingsUpdateMessage2 = cohostSettingsUpdateMessage;
        CommonMessageData commonMessageData = cohostSettingsUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (cohostSettingsUpdateMessage2.anchorSettings == null) {
            cohostSettingsUpdateMessage2.anchorSettings = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final CohostSettingsUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostSettingsUpdateMessage cohostSettingsUpdateMessage = new CohostSettingsUpdateMessage();
        cohostSettingsUpdateMessage.anchorSettings = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        Boolean boolValueOf = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    boolValueOf = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (lValueOf != null) {
                            if (boolValueOf != null) {
                                cohostSettingsUpdateMessage.anchorSettings.put(lValueOf, boolValueOf);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    cohostSettingsUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostSettingsUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostSettingsUpdateMessage cohostSettingsUpdateMessage, List list) {
    }
}
