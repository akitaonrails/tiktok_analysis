package com.ss.android.ugc.aweme.chatnoticenew.extra;

import X.AnonymousClass0629;
import X.C051M;
import X.C098200Yq;
import X.C189200o6;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C461720I8s;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeExtraProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatNoticeExtraProvider implements IChatNoticeExtraProvider {
    @Override // com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeExtraProvider
    public final String LIZ() {
        Object c098200Yq;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IMAIServiceAPI.LIZ.getClass();
        Map<String, String> mapLJJJIL = AnonymousClass0629.LIZ().LIZ().LJJJIL();
        if (!mapLJJJIL.isEmpty()) {
            linkedHashMap.put("smart_reply_creator", mapLJJJIL);
        }
        String strLIZIZ = C461720I8s.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("turn_on_go_live_notification_guide_card_repo_");
        sbLIZ.append(C461720I8s.LIZIZ());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("has_consumed_turn_on_go_live_notification_guide_card_");
        sbLIZ2.append(strLIZIZ);
        linkedHashMap.put("chatroom_guide_seller_live_reminder_banner", C2097908Jt.LIZJ(new Pair("go_live_notification_banner_has_consumed", repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false) ? "1" : CardStruct.IStatusCode.DEFAULT)));
        if (!(!linkedHashMap.isEmpty())) {
            return "";
        }
        try {
            c098200Yq = C051M.LJ(linkedHashMap, false);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (String) (C189200o6.m7isFailureimpl(c098200Yq) ? "" : c098200Yq);
    }
}
