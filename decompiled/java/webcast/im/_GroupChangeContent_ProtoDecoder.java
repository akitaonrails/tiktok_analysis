package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common._GroupChannelAllUser_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupChangeContent_ProtoDecoder implements C0IMD<GroupChangeContent> {
    public static GroupChangeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupChangeContent groupChangeContent = new GroupChangeContent();
        groupChangeContent.linkedUserUiPositions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        groupChangeContent.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    groupChangeContent.groupUser = _GroupChannelAllUser_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupChangeContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupChangeContent groupChangeContent) {
        GroupChangeContent groupChangeContent2 = groupChangeContent;
        GroupChannelAllUser groupChannelAllUser = groupChangeContent2.groupUser;
        if (groupChannelAllUser != null) {
            _GroupChannelAllUser_ProtoDecoder.LJ(groupChannelAllUser);
        }
        if (groupChangeContent2.linkedUserUiPositions == null) {
            groupChangeContent2.linkedUserUiPositions = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GroupChangeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupChangeContent groupChangeContent, List list) {
    }
}
