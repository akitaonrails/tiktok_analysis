package com.bytedance.android.livesdk.model.message.linker.enter_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.multilive._MultiLiveAnchorPanelSettings_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.ListUser;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message._ListUser_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerEnterContent_ProtoDecoder implements C0IMD<LinkerEnterContent> {
    public static LinkerEnterContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkerEnterContent linkerEnterContent = new LinkerEnterContent();
        linkerEnterContent.listUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkerEnterContent.anchorSettingInfo = _MultiLiveAnchorPanelSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        linkerEnterContent.MultiLiveType = c1516680pZS.LJIIJ();
                    }
                } else {
                    linkerEnterContent.listUsers.add(_ListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkerEnterContent;
            }
        }
    }

    public static void LJ(LinkerEnterContent linkerEnterContent) {
        User user;
        List<ListUser> list = linkerEnterContent.listUsers;
        if (list == null) {
            linkerEnterContent.listUsers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ListUser listUser : linkerEnterContent.listUsers) {
            if (listUser != null && (user = listUser.user) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkerEnterContent linkerEnterContent) {
        LJ(linkerEnterContent);
    }

    @Override // X.C0IMD
    public final LinkerEnterContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerEnterContent linkerEnterContent, List list) {
    }
}
