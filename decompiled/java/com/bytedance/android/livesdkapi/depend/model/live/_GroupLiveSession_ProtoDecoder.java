package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupLiveSession_ProtoDecoder implements C0IMD<GroupLiveSession> {
    public static GroupLiveSession LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupLiveSession groupLiveSession = new GroupLiveSession();
        groupLiveSession.groupLiveMembers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            groupLiveSession.groupLiveMembers.add(_GroupLiveMember_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        groupLiveSession.lastVisitTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    groupLiveSession.isGroupLiveSession = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupLiveSession;
            }
        }
    }

    public static void LJ(GroupLiveSession groupLiveSession) {
        ImageModel imageModel;
        List<GroupLiveMember> list = groupLiveSession.groupLiveMembers;
        if (list == null) {
            groupLiveSession.groupLiveMembers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GroupLiveMember groupLiveMember : groupLiveSession.groupLiveMembers) {
            if (groupLiveMember != null && (imageModel = groupLiveMember.avatar) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupLiveSession groupLiveSession) {
        LJ(groupLiveSession);
    }

    @Override // X.C0IMD
    public final GroupLiveSession LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupLiveSession groupLiveSession, List list) {
    }
}
