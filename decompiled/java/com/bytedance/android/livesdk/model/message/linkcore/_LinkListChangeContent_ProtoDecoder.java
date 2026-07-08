package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common._ContentPosition_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkListChangeContent_ProtoDecoder implements C0IMD<LinkListChangeContent> {
    public static LinkListChangeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkListChangeContent linkListChangeContent = new LinkListChangeContent();
        linkListChangeContent.linkedUserUiPositions = new ArrayList();
        linkListChangeContent.uiPos = new ArrayList();
        linkListChangeContent.contentPos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                linkListChangeContent.contentPos.add(_ContentPosition_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            linkListChangeContent.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        linkListChangeContent.userList = _AllListUser_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkListChangeContent.listChangeType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkListChangeContent;
            }
        }
    }

    public static void LJ(LinkListChangeContent linkListChangeContent) {
        AllListUser allListUser = linkListChangeContent.userList;
        if (allListUser != null) {
            _AllListUser_ProtoDecoder.LJ(allListUser);
        }
        if (linkListChangeContent.linkedUserUiPositions == null) {
            linkListChangeContent.linkedUserUiPositions = new ArrayList();
        }
        List<ContentPosition> list = linkListChangeContent.contentPos;
        if (list == null) {
            linkListChangeContent.contentPos = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<ContentPosition> it2 = linkListChangeContent.contentPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkListChangeContent linkListChangeContent) {
        LJ(linkListChangeContent);
    }

    @Override // X.C0IMD
    public final LinkListChangeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkListChangeContent linkListChangeContent, List list) {
    }
}
