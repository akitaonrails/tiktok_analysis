package com.ss.android.ugc.aweme.search.csi.profile.api;

import X.C09CT;
import X.C1499850p8J;
import X.C359001aO;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class CSIFreqControlAPI {
    public static final CSIFreqControlAPI LIZ = new CSIFreqControlAPI();
    public static volatile API LIZIZ;

    public interface API {
        @InterfaceC1501170pAR("/tiktok/v1/inspiration/profile_banner/check_show/v3")
        Object checkV3(@InterfaceC1485405rg CheckRequestV3 checkRequestV3, InterfaceC1364105Vn<? super CheckResponseV3> interfaceC1364105Vn);
    }

    public final API LIZ() {
        API api;
        C1499850p8J c1499850p8JCreateBuilder;
        API api2 = LIZIZ;
        if (api2 != null) {
            return api2;
        }
        synchronized (this) {
            try {
                API api3 = LIZIZ;
                if (api3 != null) {
                    return api3;
                }
                IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
                if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C359001aO.LIZ)) == null) {
                    api = null;
                } else {
                    api = (API) c1499850p8JCreateBuilder.build().retrofit.LIZ(API.class);
                    if (api != null) {
                        LIZIZ = api;
                    }
                }
                return api;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final class UserPostItemJson {

        @C09CT("create_time")
        public final long createTime;

        @C09CT("is_draft")
        public final boolean isDraft;

        @C09CT("is_private")
        public final boolean isPrivate;

        @C09CT("item_id")
        public final String itemId;

        public UserPostItemJson(String str, long j, boolean z, boolean z2) {
            this.itemId = str;
            this.createTime = j;
            this.isPrivate = z;
            this.isDraft = z2;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class CheckRequestV3 {

        @C09CT("enter_from")
        public final String enterFrom;

        @C09CT("has_reported_historical_close_times")
        public final boolean hasReportedHistoricalCloseTimes;

        @C09CT("historical_close_times")
        public final Integer historicalCloseTimes;

        @C09CT("most_recent_close_timestamp")
        public final Long mostRecentCloseTimestamp;

        @C09CT("user_posted_items")
        public final List<UserPostItemJson> userPostedItems;

        public CheckRequestV3(List<UserPostItemJson> list, String str, boolean z, Integer num, Long l) {
            this.userPostedItems = list;
            this.enterFrom = str;
            this.hasReportedHistoricalCloseTimes = z;
            this.historicalCloseTimes = num;
            this.mostRecentCloseTimestamp = l;
        }
    }

    public static final class CheckResponseV3 {

        @C09CT("block_detail")
        public final String blockDetail;

        @C09CT("block_reason")
        public final String blockReason;

        @C09CT("historical_close_received")
        public final Boolean historicalCloseReceived;

        @C09CT("must_req_every_n")
        public final Integer mustReqEveryN;

        @C09CT("next_check_timestamp")
        public final Long nextCheckTimestamp;

        @C09CT("server_check_info")
        public final String searchCheckInfo;

        @C09CT("show_enable")
        public final boolean showEnable;

        public CheckResponseV3(boolean z, String str, String str2, Long l, Integer num, Boolean bool, String str3) {
            this.showEnable = z;
            this.blockReason = str;
            this.blockDetail = str2;
            this.nextCheckTimestamp = l;
            this.mustReqEveryN = num;
            this.historicalCloseReceived = bool;
            this.searchCheckInfo = str3;
        }
    }
}
