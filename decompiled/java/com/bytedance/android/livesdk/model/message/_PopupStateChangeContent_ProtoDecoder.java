package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.im.JoinGroupMessageExtra;
import webcast.im._JoinGroupMessageExtra_RivalExtra_ProtoDecoder;
import webcast.im._JoinGroupMessageExtra_RivalGuestExtras_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PopupStateChangeContent_ProtoDecoder implements C0IMD<PopupStateChangeContent> {
    public static PopupStateChangeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PopupStateChangeContent popupStateChangeContent = new PopupStateChangeContent();
        popupStateChangeContent.rivalGuestsMap = new HashMap();
        popupStateChangeContent.otherUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            Long lValueOf = null;
                            JoinGroupMessageExtra.RivalGuestExtras rivalGuestExtrasLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 == -1) {
                                    break;
                                }
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        rivalGuestExtrasLIZLLL = _JoinGroupMessageExtra_RivalGuestExtras_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ2);
                            if (lValueOf != null) {
                                if (rivalGuestExtrasLIZLLL != null) {
                                    popupStateChangeContent.rivalGuestsMap.put(lValueOf, rivalGuestExtrasLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        popupStateChangeContent.otherUsers.add(_JoinGroupMessageExtra_RivalExtra_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    popupStateChangeContent.joinUser = _JoinGroupMessageExtra_RivalExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return popupStateChangeContent;
            }
        }
    }

    public static void LJ(PopupStateChangeContent popupStateChangeContent) {
        JoinGroupMessageExtra.RivalExtra rivalExtra = popupStateChangeContent.joinUser;
        if (rivalExtra != null) {
            _JoinGroupMessageExtra_RivalExtra_ProtoDecoder.LJ(rivalExtra);
        }
        List<JoinGroupMessageExtra.RivalExtra> list = popupStateChangeContent.otherUsers;
        if (list == null) {
            popupStateChangeContent.otherUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            for (JoinGroupMessageExtra.RivalExtra rivalExtra2 : popupStateChangeContent.otherUsers) {
                if (rivalExtra2 != null) {
                    _JoinGroupMessageExtra_RivalExtra_ProtoDecoder.LJ(rivalExtra2);
                }
            }
        }
        Map<Long, JoinGroupMessageExtra.RivalGuestExtras> map = popupStateChangeContent.rivalGuestsMap;
        if (map == null) {
            popupStateChangeContent.rivalGuestsMap = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, JoinGroupMessageExtra.RivalGuestExtras>> it2 = popupStateChangeContent.rivalGuestsMap.entrySet().iterator();
        while (it2.hasNext()) {
            JoinGroupMessageExtra.RivalGuestExtras value = it2.next().getValue();
            if (value != null) {
                _JoinGroupMessageExtra_RivalGuestExtras_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PopupStateChangeContent popupStateChangeContent) {
        LJ(popupStateChangeContent);
    }

    @Override // X.C0IMD
    public final PopupStateChangeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PopupStateChangeContent popupStateChangeContent, List list) {
    }
}
