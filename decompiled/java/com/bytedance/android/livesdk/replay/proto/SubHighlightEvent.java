package com.bytedance.android.livesdk.replay.proto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubHighlightEvent {

    @C09CT("detailed_page_info")
    public DetailedPageInfo detailedPageInfo;

    @C09CT("duration")
    public Duration duration;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("main_event_id")
    public long mainEventId;

    @C09CT("publish_page_info")
    public PublishPageInfo publishPageInfo;

    @C09CT("quota")
    public long quota;

    @C09CT("template_duration")
    public float templateDuration;

    @C09CT("name")
    public String name = "";

    @C09CT("start_end_time")
    public List<TimeRange> startEndTime = new ArrayList();

    @C09CT("country_whitelist")
    public List<String> countryWhitelist = new ArrayList();

    @C09CT("country_blacklist")
    public List<String> countryBlacklist = new ArrayList();

    @C09CT("gift_ids")
    public List<Integer> giftIds = new ArrayList();

    @C09CT("mp4_template_name")
    public String mp4TemplateName = "";

    public static final class DetailedPageInfo {

        @C09CT("display_icon")
        public String displayIcon = "";

        @C09CT("pop_up_page_info")
        public HighlightInfo popUpPageInfo;

        @C09CT("sub_title")
        public HighlightInfo subTitle;

        @C09CT("title")
        public HighlightInfo title;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Duration {

        @C09CT("max")
        public int max;

        @C09CT("min")
        public int min;
    }

    public static final class PublishPageInfo {

        @C09CT("hashtag")
        public List<HighlightInfo> hashtag = new ArrayList();
    }
}
