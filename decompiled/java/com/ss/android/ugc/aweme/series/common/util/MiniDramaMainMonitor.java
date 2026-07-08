package com.ss.android.ugc.aweme.series.common.util;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaMainMonitor {
    public static final /* synthetic */ int LIZ = 0;

    public static final class DramaCTACheckInfo {

        @C09CT("paid_content_info")
        public final PaidContentInfo paidContentInfo;

        @C09CT("standard_component_info")
        public final StandardComponentInfo standardComponentInfo;

        public DramaCTACheckInfo() {
            this(null, null);
        }

        public DramaCTACheckInfo(StandardComponentInfo standardComponentInfo, PaidContentInfo paidContentInfo) {
            this.standardComponentInfo = standardComponentInfo;
            this.paidContentInfo = paidContentInfo;
        }
    }
}
