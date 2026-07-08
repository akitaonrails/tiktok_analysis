package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostListUser_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostListChangeContent_ProtoDecoder implements C0IMD<CohostListChangeContent> {
    public static CohostListChangeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostListChangeContent cohostListChangeContent = new CohostListChangeContent();
        cohostListChangeContent.users = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    cohostListChangeContent.users.add(_CohostListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostListChangeContent;
            }
        }
    }

    public static void LJ(CohostListChangeContent cohostListChangeContent) {
        ImageModel imageModel;
        List<CohostListUser> list = cohostListChangeContent.users;
        if (list == null) {
            cohostListChangeContent.users = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CohostListUser cohostListUser : cohostListChangeContent.users) {
            if (cohostListUser != null && (imageModel = cohostListUser.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostListChangeContent cohostListChangeContent) {
        LJ(cohostListChangeContent);
    }

    @Override // X.C0IMD
    public final CohostListChangeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostListChangeContent cohostListChangeContent, List list) {
    }
}
