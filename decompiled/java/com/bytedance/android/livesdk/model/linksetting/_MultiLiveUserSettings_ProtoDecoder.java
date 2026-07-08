package com.bytedance.android.livesdk.model.linksetting;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiLiveUserSettings_ProtoDecoder implements C0IMD<MultiLiveUserSettings> {
    public static MultiLiveUserSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiLiveUserSettings multiLiveUserSettings = new MultiLiveUserSettings();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            multiLiveUserSettings.coHost = _CoHost_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Integer numValueOf = null;
                        Long lValueOf = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (numValueOf != null) {
                            if (lValueOf != null) {
                                multiLiveUserSettings.channelMap.put(numValueOf, lValueOf);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    multiLiveUserSettings.multiLiveUserApplySettings = _MultiLiveUserApplySettings_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiLiveUserSettings;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiLiveUserSettings multiLiveUserSettings) {
        MultiLiveUserSettings multiLiveUserSettings2 = multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings = multiLiveUserSettings2.multiLiveUserApplySettings;
        if (multiLiveUserApplySettings != null) {
            _MultiLiveUserApplySettings_ProtoDecoder.LJ(multiLiveUserApplySettings);
        }
        CoHost coHost = multiLiveUserSettings2.coHost;
        if (coHost != null) {
            _CoHost_ProtoDecoder.LJ(coHost);
        }
    }

    @Override // X.C0IMD
    public final MultiLiveUserSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiLiveUserSettings multiLiveUserSettings, List list) {
    }
}
