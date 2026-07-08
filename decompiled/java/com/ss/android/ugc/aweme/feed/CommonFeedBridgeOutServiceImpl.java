package com.ss.android.ugc.aweme.feed;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1211690hdX;
import X.C1697810uHb;
import X.C297570BlT;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class CommonFeedBridgeOutServiceImpl implements ICommonFeedBridgeOutService {
    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedBridgeOutService
    public final boolean LIZJ() {
        return C297570BlT.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedBridgeOutService
    public final void LIZ(String str, String str2) {
        C1211690hdX.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId != null) {
            if (!Intrinsics.LJFF(curUserId, C1211690hdX.LIZIZ)) {
                C1211690hdX.LIZIZ = curUserId;
                ((LinkedHashMap) C1211690hdX.LIZJ).clear();
            }
            Map<String, List<String>> map = C1211690hdX.LIZJ;
            if (map.containsKey(str)) {
                List list = (List) ((LinkedHashMap) map).get(str);
                if (list != null) {
                    list.add(str2);
                    return;
                }
                return;
            }
            map.put(str, C1697810uHb.LJIILJJIL(str2));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ICommonFeedBridgeOutService
    public final boolean LIZIZ(Aweme aweme, String str) {
        ITcmService iTcmService = (ITcmService) PluggableExtentionKt.pluggableSpi$default(ITcmService.class, false, false, false, 14, null);
        if (iTcmService == null || !iTcmService.LIZIZ(aweme, str)) {
            return false;
        }
        return true;
    }
}
