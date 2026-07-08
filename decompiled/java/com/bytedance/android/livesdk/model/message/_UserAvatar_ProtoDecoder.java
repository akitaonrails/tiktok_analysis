package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserAvatar_ProtoDecoder implements C0IMD<UserAvatar> {
    public static UserAvatar LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserAvatar userAvatar = new UserAvatar();
        userAvatar.urlList = new ArrayList();
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
                                    userAvatar.urlList.add(C1516700pZU.LIZLLL(c1516680pZS));
                                }
                            } else {
                                userAvatar.uri = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            userAvatar.width = c1516680pZS.LJIIJ();
                        }
                    } else {
                        userAvatar.height = c1516680pZS.LJIIJ();
                    }
                } else {
                    userAvatar.avgColor = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userAvatar;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserAvatar userAvatar) {
        UserAvatar userAvatar2 = userAvatar;
        if (userAvatar2.urlList == null) {
            userAvatar2.urlList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final UserAvatar LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserAvatar userAvatar, List list) {
    }
}
