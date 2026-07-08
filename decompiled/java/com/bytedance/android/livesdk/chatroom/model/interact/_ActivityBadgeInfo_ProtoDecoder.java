package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ActivityBadgeInfo_ProtoDecoder implements C0IMD<ActivityBadgeInfo> {
    public static ActivityBadgeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ActivityBadgeInfo activityBadgeInfo = new ActivityBadgeInfo();
        activityBadgeInfo.eventTrace = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
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
                                            activityBadgeInfo.eventTrace.put(strLIZLLL, strLIZLLL2);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                activityBadgeInfo.backgroundColorDark = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            activityBadgeInfo.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        activityBadgeInfo.badgeTextDark = _LinkmicDisplayText_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    activityBadgeInfo.badgeText = _LinkmicDisplayText_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return activityBadgeInfo;
            }
        }
    }

    public static void LJ(ActivityBadgeInfo activityBadgeInfo) {
        LinkmicDisplayText linkmicDisplayText = activityBadgeInfo.badgeText;
        if (linkmicDisplayText != null) {
            _LinkmicDisplayText_ProtoDecoder.LJ(linkmicDisplayText);
        }
        LinkmicDisplayText linkmicDisplayText2 = activityBadgeInfo.badgeTextDark;
        if (linkmicDisplayText2 != null) {
            _LinkmicDisplayText_ProtoDecoder.LJ(linkmicDisplayText2);
        }
        if (activityBadgeInfo.eventTrace == null) {
            activityBadgeInfo.eventTrace = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ActivityBadgeInfo activityBadgeInfo) {
        LJ(activityBadgeInfo);
    }

    @Override // X.C0IMD
    public final ActivityBadgeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ActivityBadgeInfo activityBadgeInfo, List list) {
    }
}
