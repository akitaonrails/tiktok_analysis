package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.UserSuggestionInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserSuggestionInfo_ProtoDecoder implements C0IMD<UserSuggestionInfo> {
    public static UserSuggestionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserSuggestionInfo userSuggestionInfo = new UserSuggestionInfo();
        userSuggestionInfo.voterInfoList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            userSuggestionInfo.detailPageLynx = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        userSuggestionInfo.voterInfoList.add(_UserSuggestionInfo_UserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    userSuggestionInfo.voteCount = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userSuggestionInfo;
            }
        }
    }

    public static void LJ(UserSuggestionInfo userSuggestionInfo) {
        ImageModel imageModel;
        List<UserSuggestionInfo.UserInfo> list = userSuggestionInfo.voterInfoList;
        if (list == null) {
            userSuggestionInfo.voterInfoList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (UserSuggestionInfo.UserInfo userInfo : userSuggestionInfo.voterInfoList) {
            if (userInfo != null && (imageModel = userInfo.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserSuggestionInfo userSuggestionInfo) {
        LJ(userSuggestionInfo);
    }

    @Override // X.C0IMD
    public final UserSuggestionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserSuggestionInfo userSuggestionInfo, List list) {
    }
}
