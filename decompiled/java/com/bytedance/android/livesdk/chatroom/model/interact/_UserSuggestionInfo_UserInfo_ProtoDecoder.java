package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.UserSuggestionInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserSuggestionInfo_UserInfo_ProtoDecoder implements C0IMD<UserSuggestionInfo.UserInfo> {
    public static UserSuggestionInfo.UserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserSuggestionInfo.UserInfo userInfo = new UserSuggestionInfo.UserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            userInfo.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        userInfo.nickName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    userInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserSuggestionInfo.UserInfo userInfo) {
        ImageModel imageModel = userInfo.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final UserSuggestionInfo.UserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserSuggestionInfo.UserInfo userInfo, List list) {
    }
}
