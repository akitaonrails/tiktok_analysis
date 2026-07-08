package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore._AllListUser_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupChannelAllUser_ProtoDecoder implements C0IMD<GroupChannelAllUser> {
    public static GroupChannelAllUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupChannelAllUser groupChannelAllUser = new GroupChannelAllUser();
        groupChannelAllUser.user = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            groupChannelAllUser.contentVersion = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        groupChannelAllUser.user.add(_GroupChannelUser_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    groupChannelAllUser.groupChannelId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupChannelAllUser;
            }
        }
    }

    public static void LJ(GroupChannelAllUser groupChannelAllUser) {
        AllListUser allListUser;
        List<GroupChannelUser> list = groupChannelAllUser.user;
        if (list == null) {
            groupChannelAllUser.user = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GroupChannelUser groupChannelUser : groupChannelAllUser.user) {
            if (groupChannelUser != null && (allListUser = groupChannelUser.allUser) != null) {
                _AllListUser_ProtoDecoder.LJ(allListUser);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupChannelAllUser groupChannelAllUser) {
        LJ(groupChannelAllUser);
    }

    @Override // X.C0IMD
    public final GroupChannelAllUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupChannelAllUser groupChannelAllUser, List list) {
    }
}
