package com.ss.android.ugc.aweme.ecommerce.mall.service.video;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoDetailRequestParams {

    @C09CT("da_params")
    public final Map<String, Object> daParams;

    @C09CT("details_biz_code")
    public final Integer detailBizCode;

    @C09CT("extra")
    public final Extra extra;

    @C09CT("items")
    public final List<Item> items;

    @C09CT("ttec_debug_params")
    public final String ttecDebugParams;

    public static final class Extra {

        @C09CT("session_id")
        public final String sessionId;

        public Extra(String str) {
            this.sessionId = str;
        }
    }

    public VideoDetailRequestParams(Integer num, List<Item> list) {
        this.detailBizCode = num;
        this.items = list;
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class Item {

        @C09CT("extra")
        public final Map<String, Object> extra;

        @C09CT("feed_type")
        public final Integer feedType;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("sub_feed_type")
        public final Integer subFeedType;

        public Item(String str, Integer num, Integer num2, Map<String, ? extends Object> map) {
            this.id = str;
            this.feedType = num;
            this.subFeedType = num2;
            this.extra = map;
        }
    }
}
