package webcast.im;

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

/* JADX INFO: loaded from: classes.dex */
public final class _JoinGroupMessageExtra_ProtoDecoder implements C0IMD<JoinGroupMessageExtra> {
    public static JoinGroupMessageExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinGroupMessageExtra joinGroupMessageExtra = new JoinGroupMessageExtra();
        joinGroupMessageExtra.rivalGuestsMap = new HashMap();
        joinGroupMessageExtra.otherUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        joinGroupMessageExtra.sourceType = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        joinGroupMessageExtra.extra = _JoinGroupMessageExtra_RivalExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        joinGroupMessageExtra.otherUsers.add(_JoinGroupMessageExtra_RivalExtra_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        joinGroupMessageExtra.invitationReorderExtra = _JoinGroupMessageExtra_InvitationReorderExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        JoinGroupMessageExtra.RivalGuestExtras rivalGuestExtrasLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        rivalGuestExtrasLIZLLL = _JoinGroupMessageExtra_RivalGuestExtras_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (rivalGuestExtrasLIZLLL != null) {
                                        joinGroupMessageExtra.rivalGuestsMap.put(lValueOf, rivalGuestExtrasLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 6:
                        joinGroupMessageExtra.isFromCohostOverIssue = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinGroupMessageExtra;
            }
        }
    }

    public static void LJ(JoinGroupMessageExtra joinGroupMessageExtra) {
        JoinGroupMessageExtra.RivalExtra rivalExtra = joinGroupMessageExtra.extra;
        if (rivalExtra != null) {
            _JoinGroupMessageExtra_RivalExtra_ProtoDecoder.LJ(rivalExtra);
        }
        List<JoinGroupMessageExtra.RivalExtra> list = joinGroupMessageExtra.otherUsers;
        if (list == null) {
            joinGroupMessageExtra.otherUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            for (JoinGroupMessageExtra.RivalExtra rivalExtra2 : joinGroupMessageExtra.otherUsers) {
                if (rivalExtra2 != null) {
                    _JoinGroupMessageExtra_RivalExtra_ProtoDecoder.LJ(rivalExtra2);
                }
            }
        }
        Map<Long, JoinGroupMessageExtra.RivalGuestExtras> map = joinGroupMessageExtra.rivalGuestsMap;
        if (map == null) {
            joinGroupMessageExtra.rivalGuestsMap = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, JoinGroupMessageExtra.RivalGuestExtras>> it2 = joinGroupMessageExtra.rivalGuestsMap.entrySet().iterator();
        while (it2.hasNext()) {
            JoinGroupMessageExtra.RivalGuestExtras value = it2.next().getValue();
            if (value != null) {
                _JoinGroupMessageExtra_RivalGuestExtras_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(JoinGroupMessageExtra joinGroupMessageExtra) {
        LJ(joinGroupMessageExtra);
    }

    @Override // X.C0IMD
    public final JoinGroupMessageExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinGroupMessageExtra joinGroupMessageExtra, List list) {
    }
}
