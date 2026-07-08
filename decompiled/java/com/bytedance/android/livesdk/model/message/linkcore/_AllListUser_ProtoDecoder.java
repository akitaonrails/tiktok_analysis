package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AllListUser_ProtoDecoder implements C0IMD<AllListUser> {
    public static AllListUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AllListUser allListUser = new AllListUser();
        allListUser.appliedList = new ArrayList();
        allListUser.linkedList = new ArrayList();
        allListUser.readyList = new ArrayList();
        allListUser.invitedList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 2) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            if (iLJI != 5) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                allListUser.readyList.add(_LinkLayerListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            allListUser.invitedList.add(_LinkLayerListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        allListUser.appliedList.add(_LinkLayerListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    allListUser.linkedList.add(_LinkLayerListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return allListUser;
            }
        }
    }

    public static void LJ(AllListUser allListUser) {
        List<LinkLayerListUser> list = allListUser.linkedList;
        if (list == null) {
            allListUser.linkedList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<LinkLayerListUser> it2 = allListUser.linkedList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<LinkLayerListUser> list2 = allListUser.appliedList;
        if (list2 == null) {
            allListUser.appliedList = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<LinkLayerListUser> it3 = allListUser.appliedList.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<LinkLayerListUser> list3 = allListUser.invitedList;
        if (list3 == null) {
            allListUser.invitedList = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<LinkLayerListUser> it4 = allListUser.invitedList.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        List<LinkLayerListUser> list4 = allListUser.readyList;
        if (list4 == null) {
            allListUser.readyList = new ArrayList();
        } else {
            if (list4.isEmpty()) {
                return;
            }
            Iterator<LinkLayerListUser> it5 = allListUser.readyList.iterator();
            while (it5.hasNext()) {
                it5.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AllListUser allListUser) {
        LJ(allListUser);
    }

    @Override // X.C0IMD
    public final AllListUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AllListUser allListUser, List list) {
    }
}
