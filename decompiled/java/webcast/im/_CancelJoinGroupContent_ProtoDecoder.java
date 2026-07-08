package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CancelJoinGroupContent_ProtoDecoder implements C0IMD<CancelJoinGroupContent> {
    public static CancelJoinGroupContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CancelJoinGroupContent cancelJoinGroupContent = new CancelJoinGroupContent();
        cancelJoinGroupContent.leaver = new ArrayList();
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
                                cancelJoinGroupContent.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            cancelJoinGroupContent.type = c1516680pZS.LJIIJ();
                        }
                    } else {
                        cancelJoinGroupContent.operator = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    cancelJoinGroupContent.leaver.add(_GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cancelJoinGroupContent;
            }
        }
    }

    public static void LJ(CancelJoinGroupContent cancelJoinGroupContent) {
        List<GroupPlayer> list = cancelJoinGroupContent.leaver;
        if (list == null) {
            cancelJoinGroupContent.leaver = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<GroupPlayer> it2 = cancelJoinGroupContent.leaver.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        GroupPlayer groupPlayer = cancelJoinGroupContent.operator;
        GroupChannelAllUser groupChannelAllUser = cancelJoinGroupContent.groupUser;
        if (groupChannelAllUser != null) {
            _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CancelJoinGroupContent cancelJoinGroupContent) {
        LJ(cancelJoinGroupContent);
    }

    @Override // X.C0IMD
    public final CancelJoinGroupContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CancelJoinGroupContent cancelJoinGroupContent, List list) {
    }
}
