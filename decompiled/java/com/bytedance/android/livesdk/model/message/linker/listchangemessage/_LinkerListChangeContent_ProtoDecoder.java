package com.bytedance.android.livesdk.model.message.linker.listchangemessage;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerListChangeContent_ProtoDecoder implements C0IMD<LinkerListChangeContent> {
    public static LinkerListChangeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerListChangeContent linkerListChangeContent = new LinkerListChangeContent();
        linkerListChangeContent.onLineUsers = new ArrayList();
        linkerListChangeContent.waitingUsers = new ArrayList();
        linkerListChangeContent.connectingUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkerListChangeContent.connectingUsers.add(_LinkListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        linkerListChangeContent.waitingUsers.add(_LinkListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    linkerListChangeContent.onLineUsers.add(_LinkListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerListChangeContent;
            }
        }
    }

    public static void LJ(LinkerListChangeContent linkerListChangeContent) {
        List<LinkListUser> list = linkerListChangeContent.onLineUsers;
        if (list == null) {
            linkerListChangeContent.onLineUsers = new ArrayList();
        } else if (!list.isEmpty()) {
            for (LinkListUser linkListUser : linkerListChangeContent.onLineUsers) {
                if (linkListUser != null) {
                    _LinkListUser_ProtoDecoder.LJ(linkListUser);
                }
            }
        }
        List<LinkListUser> list2 = linkerListChangeContent.waitingUsers;
        if (list2 == null) {
            linkerListChangeContent.waitingUsers = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (LinkListUser linkListUser2 : linkerListChangeContent.waitingUsers) {
                if (linkListUser2 != null) {
                    _LinkListUser_ProtoDecoder.LJ(linkListUser2);
                }
            }
        }
        List<LinkListUser> list3 = linkerListChangeContent.connectingUsers;
        if (list3 == null) {
            linkerListChangeContent.connectingUsers = new ArrayList();
            return;
        }
        if (list3.isEmpty()) {
            return;
        }
        for (LinkListUser linkListUser3 : linkerListChangeContent.connectingUsers) {
            if (linkListUser3 != null) {
                _LinkListUser_ProtoDecoder.LJ(linkListUser3);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkerListChangeContent linkerListChangeContent) {
        LJ(linkerListChangeContent);
    }

    @Override // X.C0IMD
    public final LinkerListChangeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerListChangeContent linkerListChangeContent, List list) {
    }
}
