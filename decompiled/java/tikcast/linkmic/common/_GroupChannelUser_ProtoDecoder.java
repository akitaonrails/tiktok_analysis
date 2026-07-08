package tikcast.linkmic.common;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore._AllListUser_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupChannelUser_ProtoDecoder implements C0IMD<GroupChannelUser> {
    public static GroupChannelUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupChannelUser groupChannelUser = new GroupChannelUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        groupChannelUser.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        groupChannelUser.status = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        groupChannelUser.type = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        groupChannelUser.allUser = _AllListUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        groupChannelUser.joinTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        groupChannelUser.linkedTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        groupChannelUser.ownerUser = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        groupChannelUser.groupLinkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupChannelUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupChannelUser groupChannelUser) {
        AllListUser allListUser = groupChannelUser.allUser;
        if (allListUser != null) {
            _AllListUser_ProtoDecoder.LJ(allListUser);
        }
    }

    @Override // X.C0IMD
    public final GroupChannelUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupChannelUser groupChannelUser, List list) {
    }
}
