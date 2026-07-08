package com.ss.android.ugc.aweme.ecommerce.mall.service.video;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class RecommendItemsResponse {

    @C09CT("extra")
    public final Extra extra;

    @C09CT("items")
    public final List<DetailItem> items;

    @C09CT("ttec_debug_info")
    public final String ttecDebugInfo;

    public static final class Extra {

        @C09CT("time_cost")
        public final Long timeCost;

        public Extra(Long l) {
            this.timeCost = l;
        }
    }

    public static final class StandardData {

        @C09CT("video_info")
        public final VideoInfo videoInfo;

        public StandardData(VideoInfo videoInfo) {
            this.videoInfo = videoInfo;
        }
    }

    public RecommendItemsResponse(List<DetailItem> list) {
        this.items = list;
    }

    public static final class VideoInfo {

        @C09CT("video_base_info")
        public final VideoBaseInfo videoBaseInfo;

        @C09CT("video_play_info")
        public final VideoPlayInfo videoPlayInfo;

        public VideoInfo() {
            this(null, null);
        }

        public VideoInfo(VideoBaseInfo videoBaseInfo, VideoPlayInfo videoPlayInfo) {
            this.videoBaseInfo = videoBaseInfo;
            this.videoPlayInfo = videoPlayInfo;
        }
    }

    public static final class VideoPlayInfo {

        @C09CT("aweme_struct")
        public final String awemeStruct;

        @C09CT("ratio")
        public final String ratio;

        @C09CT("seconds")
        public final Long seconds;

        public VideoPlayInfo() {
            this(null, null, null);
        }

        public VideoPlayInfo(Long l, String str, String str2) {
            this.seconds = l;
            this.awemeStruct = str;
            this.ratio = str2;
        }
    }

    public static final class VideoBaseInfo {

        @C09CT("link")
        public final String link;

        @C09CT("multi_anchors")
        public final Boolean multiAnchors;

        @C09CT("video_id")
        public final String videoId;

        @C09CT("video_type")
        public final Integer videoType;

        public VideoBaseInfo() {
            this(null, null, null, null);
        }

        public VideoBaseInfo(String str, Boolean bool, String str2, Integer num) {
            this.videoId = str;
            this.multiAnchors = bool;
            this.link = str2;
            this.videoType = num;
        }
    }

    public static final class DetailItem {

        @C09CT("feed_item_id")
        public final String feedItemId;

        @C09CT("feed_type")
        public final String feedType;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("standard_data")
        public final StandardData standardData;

        @C09CT("sub_feed_type")
        public final String subFeedType;

        public DetailItem(String str, String str2, String str3, String str4, StandardData standardData) {
            this.id = str;
            this.feedItemId = str2;
            this.feedType = str3;
            this.subFeedType = str4;
            this.standardData = standardData;
        }
    }
}
