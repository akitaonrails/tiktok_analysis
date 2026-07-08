package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PreloadConfig {

    @C09CT("action")
    public String action;

    @C09CT("enable_filter")
    public EnableFilter enableFilter;

    @C09CT("data_params")
    public ItemDataParams itemDataParams;

    @C09CT("trigger")
    public List<String> trigger;

    public static final class EnableFilter {

        @C09CT("sub_feed_type")
        public List<Integer> subFeedType;

        public EnableFilter(List<Integer> list) {
            this.subFeedType = list;
        }
    }

    public static final class ItemDataParams {

        @C09CT("extra")
        public Map<String, String> extra;

        @C09CT("feed_type")
        public String feedType;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id;

        @C09CT("sub_feed_type")
        public String subFeedType;

        public ItemDataParams(String str, String str2, String str3, Map<String, String> map) {
            this.id = str;
            this.feedType = str2;
            this.subFeedType = str3;
            this.extra = map;
        }
    }

    public PreloadConfig(List<String> list, String str, ItemDataParams itemDataParams, EnableFilter enableFilter) {
        this.trigger = list;
        this.action = str;
        this.itemDataParams = itemDataParams;
        this.enableFilter = enableFilter;
    }
}
