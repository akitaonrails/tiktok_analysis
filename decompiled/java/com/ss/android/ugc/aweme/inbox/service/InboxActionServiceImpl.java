package com.ss.android.ugc.aweme.inbox.service;

import X.C0NBD;
import X.C11JF;
import X.C11S5;
import X.C1599780rjU;
import X.C1701940uOG;
import X.C20684815ws;
import X.C2188811AlT;
import Y.AfS178S0100000_9;
import com.ss.android.ugc.aweme.inbox.api.IInboxActionService;
import com.ss.android.ugc.aweme.inbox.api.MultiApiManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS53S0010000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxActionServiceImpl implements IInboxActionService {
    @Override // com.ss.android.ugc.aweme.inbox.api.IInboxActionService
    public final C11JF LIZ(int i, int i2, int i3, String str, Map map, AwS53S0010000_9 awS53S0010000_9, AFwS195S0000000_9 aFwS195S0000000_9) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        String str2 = C0NBD.LIZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("inbox_session_id", str2);
        if (Intrinsics.LJFF(linkedHashMap.get("enter_from"), "notification_page")) {
            C1599780rjU c1599780rjU = C1599780rjU.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("entrance_");
            sbLIZ.append(9);
            sbLIZ.append('_');
            if (str != null) {
                str3 = str;
            }
            sbLIZ.append(str3);
            linkedHashMap.put("is_first_screen", String.valueOf(c1599780rjU.LIZJ(C2188811AlT.LIZIZ(sbLIZ))));
        }
        C20684815ws.LJIILLIIL("inbox_message_cell", linkedHashMap);
        return (C11JF) MultiApiManager.LIZ().updateInboxEntrance(9, i, i2, i3, str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS178S0100000_9(awS53S0010000_9, 40), new AfS178S0100000_9(aFwS195S0000000_9, 41));
    }
}
