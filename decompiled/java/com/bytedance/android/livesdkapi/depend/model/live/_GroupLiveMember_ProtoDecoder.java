package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupLiveMember_ProtoDecoder implements C0IMD<GroupLiveMember> {
    public static GroupLiveMember LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupLiveMember groupLiveMember = new GroupLiveMember();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            groupLiveMember.avatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        groupLiveMember.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    groupLiveMember.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupLiveMember;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupLiveMember groupLiveMember) {
        ImageModel imageModel = groupLiveMember.avatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GroupLiveMember LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupLiveMember groupLiveMember, List list) {
    }
}
