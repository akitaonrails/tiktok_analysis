package com.bytedance.android.livesdk.model.linksetting;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.data.LinkmicGuestUser;
import webcast.data._LinkmicGuestUser_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CoHost_ProtoDecoder implements C0IMD<CoHost> {
    public static CoHost LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CoHost coHost = new CoHost();
        coHost.linkedUsers = new ArrayList();
        coHost.linkedGuestUsers = new HashMap();
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
                            LinkmicGuestUser linkmicGuestUserLIZLLL = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 == -1) {
                                    break;
                                }
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        linkmicGuestUserLIZLLL = _LinkmicGuestUser_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            }
                            c1516680pZS.LJ(jLIZJ2);
                            if (lValueOf != null) {
                                if (linkmicGuestUserLIZLLL != null) {
                                    coHost.linkedGuestUsers.put(lValueOf, linkmicGuestUserLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        coHost.linkedUsers.add(_LinkmicUser_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    coHost.multiCoHostPermission = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return coHost;
            }
        }
    }

    public static void LJ(CoHost coHost) {
        ImageModel imageModel;
        ImageModel imageModel2;
        List<LinkmicUser> list = coHost.linkedUsers;
        if (list == null) {
            coHost.linkedUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            for (LinkmicUser linkmicUser : coHost.linkedUsers) {
                if (linkmicUser != null && (imageModel = linkmicUser.avatar) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        Map<Long, LinkmicGuestUser> map = coHost.linkedGuestUsers;
        if (map == null) {
            coHost.linkedGuestUsers = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, LinkmicGuestUser>> it2 = coHost.linkedGuestUsers.entrySet().iterator();
        while (it2.hasNext()) {
            LinkmicGuestUser value = it2.next().getValue();
            if (value != null && (imageModel2 = value.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CoHost coHost) {
        LJ(coHost);
    }

    @Override // X.C0IMD
    public final CoHost LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CoHost coHost, List list) {
    }
}
