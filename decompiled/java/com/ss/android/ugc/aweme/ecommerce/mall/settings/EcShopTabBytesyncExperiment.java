package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EcShopTabBytesyncExperiment {
    public static final ShopTabBytesyncModel LIZ = new ShopTabBytesyncModel(5, 300, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(166));

    public static final class ControlReqIntervalSeconds {

        @C09CT("search_bubble")
        public final Long searchBubble;

        public ControlReqIntervalSeconds() {
            this(null);
        }

        public ControlReqIntervalSeconds(Long l) {
            this.searchBubble = l;
        }
    }

    public static final class ShopTabBytesyncModel {

        @C09CT("backlog_processing_interval_seconds")
        public final long backlogProcessingIntervalSec;

        @C09CT("control_req_interval_seconds")
        public final ControlReqIntervalSeconds controlReqIntervalSeconds;

        @C09CT("polling_req_interval_seconds")
        public final long pollingReqIntervalSec;

        public ShopTabBytesyncModel() {
            this(5L, 300L, null);
        }

        public ShopTabBytesyncModel(long j, long j2, ControlReqIntervalSeconds controlReqIntervalSeconds) {
            this.backlogProcessingIntervalSec = j;
            this.pollingReqIntervalSec = j2;
            this.controlReqIntervalSeconds = controlReqIntervalSeconds;
        }
    }
}
