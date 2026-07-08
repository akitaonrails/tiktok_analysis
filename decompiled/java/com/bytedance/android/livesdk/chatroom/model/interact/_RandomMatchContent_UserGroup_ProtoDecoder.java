package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.RandomMatchContent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RandomMatchContent_UserGroup_ProtoDecoder implements C0IMD<RandomMatchContent.UserGroup> {
    public static RandomMatchContent.UserGroup LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RandomMatchContent.UserGroup userGroup = new RandomMatchContent.UserGroup();
        userGroup.userInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    userGroup.userInfo.add(_RandomMatchContent_UserGroup_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userGroup;
            }
        }
    }

    public static void LJ(RandomMatchContent.UserGroup userGroup) {
        ImageModel imageModel;
        List<RandomMatchContent.UserGroup.UserInfo> list = userGroup.userInfo;
        if (list == null) {
            userGroup.userInfo = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (RandomMatchContent.UserGroup.UserInfo userInfo : userGroup.userInfo) {
            if (userInfo != null && (imageModel = userInfo.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RandomMatchContent.UserGroup userGroup) {
        LJ(userGroup);
    }

    @Override // X.C0IMD
    public final RandomMatchContent.UserGroup LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RandomMatchContent.UserGroup userGroup, List list) {
    }
}
