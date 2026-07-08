package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C01GW;
import X.C09CT;
import X.C2097608Jq;
import X.C452501pT;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class GuideOutPushUGTriggerWeightExp {
    public static final GuideOutPushUGTriggerWeightExp LIZ = new GuideOutPushUGTriggerWeightExp();
    public static final IntelligentGuideConfig LIZIZ = new IntelligentGuideConfig(false, new SceneWeights(1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d), false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(291));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(292));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(293));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(290));
    public static final Map<String, Double> LJI = C2097608Jq.LJIIIIZZ(new Pair("inbox", Double.valueOf(LIZ().inbox)), new Pair("in_app_share", Double.valueOf(LIZ().inAppShare)), new Pair("dm", Double.valueOf(LIZ().dm)), new Pair("share_video", Double.valueOf(LIZ().shareVideo)), new Pair("follow", Double.valueOf(LIZ().follow)), new Pair("self_video", Double.valueOf(LIZ().selfVideo)), new Pair("enter_homepage_friends", Double.valueOf(LIZ().enterFriendsPage)), new Pair("repost", Double.valueOf(LIZ().repost)), new Pair("publish", Double.valueOf(LIZ().publish)), new Pair("comment", Double.valueOf(LIZ().comment)), new Pair("all_read_return_inbox", Double.valueOf(LIZ().inBoxAllRead)), new Pair("like_video", Double.valueOf(LIZ().likeVideo)), new Pair("like_comment", Double.valueOf(LIZ().likeComment)), new Pair("share_profile", Double.valueOf(LIZ().shareProfile)), new Pair("download_video", Double.valueOf(LIZ().downloadVideo)), new Pair("copy_link_success_profile", Double.valueOf(LIZ().copyLinkProfile)), new Pair("copy_link_success_feed", Double.valueOf(LIZ().copyLinkFeed)), new Pair("feed_vv_enough", Double.valueOf(LIZ().feedVV)), new Pair("app_launch", Double.valueOf(LIZ().appLaunch)), new Pair("search_result_show", Double.valueOf(LIZ().searchResult)));

    public static final class SceneWeights {

        @C09CT("app_launch")
        public final double appLaunch;

        @C09CT("comment")
        public final double comment;

        @C09CT("copy_link_success_feed")
        public final double copyLinkFeed;

        @C09CT("copy_link_success_profile")
        public final double copyLinkProfile;

        @C09CT("dm")
        public final double dm;

        @C09CT("download_video")
        public final double downloadVideo;

        @C09CT("enter_homepage_friends")
        public final double enterFriendsPage;

        @C09CT("feed_vv_enough")
        public final double feedVV;

        @C09CT("follow")
        public final double follow;

        @C09CT("in_app_share")
        public final double inAppShare;

        @C09CT("all_read_return_inbox")
        public final double inBoxAllRead;

        @C09CT("inbox")
        public final double inbox;

        @C09CT("like_comment")
        public final double likeComment;

        @C09CT("like_video")
        public final double likeVideo;

        @C09CT("publish")
        public final double publish;

        @C09CT("repost")
        public final double repost;

        @C09CT("search_result_show")
        public final double searchResult;

        @C09CT("self_video")
        public final double selfVideo;

        @C09CT("share_profile")
        public final double shareProfile;

        @C09CT("share_video")
        public final double shareVideo;

        public SceneWeights() {
            this(1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d);
        }

        public SceneWeights(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20) {
            this.inAppShare = d;
            this.enterFriendsPage = d2;
            this.inBoxAllRead = d3;
            this.comment = d4;
            this.follow = d5;
            this.inbox = d6;
            this.dm = d7;
            this.shareVideo = d8;
            this.selfVideo = d9;
            this.repost = d10;
            this.publish = d11;
            this.feedVV = d12;
            this.likeVideo = d13;
            this.likeComment = d14;
            this.shareProfile = d15;
            this.downloadVideo = d16;
            this.copyLinkFeed = d17;
            this.copyLinkProfile = d18;
            this.searchResult = d19;
            this.appLaunch = d20;
        }
    }

    public static SceneWeights LIZ() {
        return (SceneWeights) LJ.getValue();
    }

    public static final class IntelligentGuideConfig {

        @C09CT("debug_enable")
        public final boolean enableDebugInfo;

        @C09CT("pitaya_package_enable")
        public final boolean isPitayaEnabled;

        @C09CT("android_weights")
        public final SceneWeights sceneWeights;

        public IntelligentGuideConfig() {
            this(false, new SceneWeights(1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d), false);
        }

        public IntelligentGuideConfig(boolean z, SceneWeights sceneWeights, boolean z2) {
            this.isPitayaEnabled = z;
            this.sceneWeights = sceneWeights;
            this.enableDebugInfo = z2;
        }
    }
}
