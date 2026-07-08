package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationInfo;

/* JADX INFO: loaded from: classes20.dex */
public final class BannerDisplayInfo {

    @C09CT("category")
    public final Integer category;

    @C09CT("debug_info")
    public final String debugInfo;
    public final String description;

    @C09CT("top_image_post_cover")
    public final com.ss.android.ugc.aweme.base.model.UrlModel imageUrl;

    @C09CT("inspiration")
    public final InspirationInfo inspiration;

    @C09CT("search_count")
    public final String searchCount;

    @C09CT("search_extra")
    public final String searchExtra;

    @C09CT("search_topic_id")
    public final String searchTopicId;

    @C09CT("cli_session_id")
    public final String sessionId;
    public final String title;

    @C09CT("topic_type")
    public final Integer topicType;

    @C09CT("trend_id")
    public final String trendId;
    public final String url;

    public final int getTopicTypeActual() {
        Integer num = this.topicType;
        return num != null ? num.intValue() : PhotoTopicBannerTopicType.REGULAR.getValue();
    }

    public final boolean isScenarioTopic() {
        Integer num = this.topicType;
        if (num != null) {
            return num.intValue() != PhotoTopicBannerTopicType.REGULAR.getValue();
        }
        return false;
    }

    public BannerDisplayInfo(String str, String str2, String str3, String str4, com.ss.android.ugc.aweme.base.model.UrlModel urlModel, Integer num, String str5, InspirationInfo inspirationInfo, Integer num2, String str6, String str7, String str8, String str9) {
        this.title = str;
        this.description = str2;
        this.url = str3;
        this.trendId = str4;
        this.imageUrl = urlModel;
        this.category = num;
        this.searchCount = str5;
        this.inspiration = inspirationInfo;
        this.topicType = num2;
        this.debugInfo = str6;
        this.sessionId = str7;
        this.searchTopicId = str8;
        this.searchExtra = str9;
    }
}
