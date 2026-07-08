package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _VirtualWaitingUser_ProtoDecoder implements C0IMD<VirtualWaitingUser> {
    public static VirtualWaitingUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        VirtualWaitingUser virtualWaitingUser = new VirtualWaitingUser();
        virtualWaitingUser.avatars = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            virtualWaitingUser.avatars.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        virtualWaitingUser.sendTimestamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    virtualWaitingUser.sendUserId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return virtualWaitingUser;
            }
        }
    }

    public static void LJ(VirtualWaitingUser virtualWaitingUser) {
        List<ImageModel> list = virtualWaitingUser.avatars;
        if (list == null) {
            virtualWaitingUser.avatars = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ImageModel imageModel : virtualWaitingUser.avatars) {
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(VirtualWaitingUser virtualWaitingUser) {
        LJ(virtualWaitingUser);
    }

    @Override // X.C0IMD
    public final VirtualWaitingUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, VirtualWaitingUser virtualWaitingUser, List list) {
    }
}
