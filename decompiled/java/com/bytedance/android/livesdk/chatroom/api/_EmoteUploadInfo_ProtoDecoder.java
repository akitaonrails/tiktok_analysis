package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EmoteUploadInfo_ProtoDecoder implements C0IMD<EmoteUploadInfo> {
    public static EmoteUploadInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EmoteUploadInfo emoteUploadInfo = new EmoteUploadInfo();
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
                                emoteUploadInfo.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            emoteUploadInfo.userInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        emoteUploadInfo.emoteUploadSource = c1516680pZS.LJIIJ();
                    }
                } else {
                    emoteUploadInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return emoteUploadInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EmoteUploadInfo emoteUploadInfo) {
        User user = emoteUploadInfo.userInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final EmoteUploadInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EmoteUploadInfo emoteUploadInfo, List list) {
    }
}
