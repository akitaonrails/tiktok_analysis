package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1950707kX;
import X.C2097608Jq;
import X.InterfaceC563090M6p;
import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixDeepLinkAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final String LJI() {
        return "ai_remix";
    }

    public static void LJIIIZ(String str, String str2, HashMap map) {
        String str3;
        Object obj = map.get(str);
        if (!(obj instanceof String) || (str3 = (String) obj) == null || a0.LJJJIL(str3)) {
            map.put(str, str2);
        }
    }

    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        InterfaceC563090M6p interfaceC563090M6pLIZ;
        IAIRemixService iAIRemixService = (IAIRemixService) PluggableExtentionKt.pluggableSpi$default(IAIRemixService.class, false, false, false, 14, null);
        if (iAIRemixService != null && (interfaceC563090M6pLIZ = iAIRemixService.LIZ()) != null) {
            LJIIIZ("referpage_name", "open_app", map);
            LJIIIZ("recall_way", AIGC.RecallWay.OUTER_PUSH.INSTANCE.getValue(), map);
            return new Pair<>("//ai_remix/create", C2097608Jq.LJI(new Pair("key_launch_param", interfaceC563090M6pLIZ.LJFF(map))));
        }
        return new Pair<>("//ai_remix/create", map);
    }
}
