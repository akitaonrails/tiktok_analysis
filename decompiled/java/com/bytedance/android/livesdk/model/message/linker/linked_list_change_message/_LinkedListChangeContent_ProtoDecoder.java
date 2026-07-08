package com.bytedance.android.livesdk.model.message.linker.linked_list_change_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkedListChangeContent_ProtoDecoder implements C0IMD<LinkedListChangeContent> {
    public static LinkedListChangeContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkedListChangeContent linkedListChangeContent = new LinkedListChangeContent();
        linkedListChangeContent.listUsers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    linkedListChangeContent.listUsers.add(_ListUser_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkedListChangeContent;
            }
        }
    }

    public static void LJ(LinkedListChangeContent linkedListChangeContent) {
        User user;
        List<ListUser> list = linkedListChangeContent.listUsers;
        if (list == null) {
            linkedListChangeContent.listUsers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ListUser listUser : linkedListChangeContent.listUsers) {
            if (listUser != null && (user = listUser.user) != null) {
                _User_ProtoDecoder.LJ(user);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkedListChangeContent linkedListChangeContent) {
        LJ(linkedListChangeContent);
    }

    @Override // X.C0IMD
    public final LinkedListChangeContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkedListChangeContent linkedListChangeContent, List list) {
    }
}
