package com.ss.android.ugc.tiktok.addyours.mob.invite;

import X.C045000Ee;
import X.C0DLD;
import X.C0OD6;
import X.C13LP;
import X.C1554960qZC;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class SendAddYoursInvitationInviteeProvider implements IAddYoursInviteEventProtocol<C045000Ee> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C0DLD c0dld;
        List<UserInvitee> list;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(this.LL, "source_default_key", C0DLD.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c0dld = (C0DLD) interfaceC1555100qZQLIZIZ.getSource()) == null || (list = (List) c0dld.LL) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UserInvitee userInvitee : list) {
            arrayList.add(Integer.valueOf(C0OD6.LIZIZ(userInvitee.getFollowStatus(), userInvitee.getFollowerStatus())));
            arrayList2.add(userInvitee.getUid());
        }
        return new C045000Ee(String.valueOf(list.size()), C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62), C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
    }

    public SendAddYoursInvitationInviteeProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
