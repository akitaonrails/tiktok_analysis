package com.ss.android.ugc.aweme.services.external;

import X.C01GW;
import X.C1697810uHb;
import X.C452501pT;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class IAILiveServiceKt {
    public static final C01GW aiLiveService$delegate = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(113));

    public static final IAILiveService getAiLiveService() {
        return (IAILiveService) aiLiveService$delegate.getValue();
    }

    public static final boolean forceRefreshScene(RefreshQuotaScene refreshQuotaScene) {
        return C1697810uHb.LJIIJJI(RefreshQuotaScene.INVALID_REFRESH, RefreshQuotaScene.TASK_STATUS_CHANGE, RefreshQuotaScene.GENERATE).contains(refreshQuotaScene);
    }

    public static final boolean hasAILiveAnchor(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty()) {
            return false;
        }
        Iterator<AnchorCommonStruct> it2 = anchors.iterator();
        while (it2.hasNext()) {
            if (it2.next().getType() == 97) {
                return true;
            }
        }
        return false;
    }
}
