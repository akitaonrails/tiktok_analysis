package com.ss.android.ugc.aweme.feed.model.live;

import X.AbstractC2126608Uu;
import X.C09C2;
import X.C09CS;
import X.C09CT;
import X.C0X12;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes34.dex */
public class LiveRoomStruct extends AbstractC2126608Uu implements C0X12, Serializable {
    public int MAIN_HORIZONTAL;

    @C09CT("additional_stream_url")
    public StreamUrlStruct additional_stream_url;

    @C09CT("ai_live_preview_highlight")
    public AILivePreviewHighlight aiLivePreviewHighlight;

    @C09CT("ai_live_preview_highlight_expect")
    public AILivePreviewHighlight aiLivePreviewHighlightExpect;

    @C09CT("ai_live_preview_highlight_extra")
    public AILivePreviewHighlightExtra aiLivePreviewHighlightExtra;
    public long autoCover;

    @C09CT("background")
    public LiveImageModel background;

    @C09CT("blurred_cover")
    public UrlModel blurredCover;

    @C09CT("board_using_info")
    public BoardUsingInfo boardUsingInfo;
    public Challenge challenge;

    @C09CT("challenge_info")
    public String challengeInfo;

    @C09CT("client_version")
    public String clientVersion;

    @C09CT("coins")
    public int coins;
    public PreviewCommentItem commentItem;

    @C09CT("commerce_permission")
    public int commercePermission;

    @C09CT("commerce_info")
    public CommerceStruct commerceStruct;

    @C09CT("content_label")
    public LiveImageModel contentLabel;

    @C09CT("content_tag")
    public String contentTag;

    @C09CT("create_time")
    public long create_time;

    @C09CT("preview_cta")
    public LivePreviewCta ctaData;
    public String debugSurveyId;
    public String debugSurveyLan;

    @C09CT("digg_count")
    public int digg_count;

    @C09CT("disable_preload_stream")
    public boolean disablePrePullStream;

    @C09CT("disable_screen_record")
    public boolean disableScreenRecord;

    @C09CT("distance")
    public String distance;

    @C09CT("drops_info")
    public LiveDropsRoomInfo dropsRoomInfo;
    public EnterRoomBoostEntra enterRoomExtra;

    @C09CT("decisions")
    public EpiDecision epiDecision;
    public String errorMsg;

    @C09CT("existed_commerce_goods")
    public boolean existedCommerceGoods;

    @C09CT("existed_ttls_goods")
    public boolean existedTtlsGoods;

    @C09CT("fyp_room_tags")
    public FeedRoomTagList feedRoomTagList;

    @C09CT("finish_time")
    public long finish_time;
    public int fromInnerPush;

    @C09CT("fyp_commerce_info")
    public FYPCommerceStruct fypCommerceStruct;

    @C09CT("fyp_watch_reason")
    public WatchReason fypWatchReason;

    @C09CT("game_tag_detail")
    public GameTagDetail gameTagDetail;

    @C09CT("guess_widgets")
    public GuessWidgets guessWidgets;

    @C09CT("has_commerce_goods")
    public boolean hasCommerceGoods;

    @C09CT("has_ttls_goods")
    public boolean hasTtlsGoods;

    @C09CT("has_ttls_live_permission")
    public boolean hasTtlsLivePermission;

    @C09CT("hashtag")
    public Hashtag hashTag;

    @C09CT("host_board_status")
    public long hostBoardStatus;
    public HotReloadFeedParams hotReloadFeedParams;
    public String hotReloadType;
    public String hotUpdateType;

    @C09CT(alternate = {FollowStatusChangeMethod.PARAM_UID}, value = "room_id")
    public long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("in_sandbox")
    public boolean inSandbox;

    @C09CT("live_type_official")
    public boolean isOfficialType;

    @C09CT("is_reposted_expect")
    public long isRepostedExpect;

    @C09CT("live_type_screenshot")
    public boolean isScreenshot;
    public boolean isShow;

    @C09CT("is_tag2_sfv_relation_pair")
    public boolean isTag2SfvRelationPair;

    @C09CT("live_type_third_party")
    public boolean isThirdParty;
    public boolean isTopGifter;
    public boolean isWatched;

    @C09CT("leads_ads_pin_card")
    @C09CS(RawStringJsonAdapter.class)
    public String leadsAdsPinCardJson;

    @C09CT("link_mic")
    @C09CS(RawStringJsonAdapter.class)
    public String linkMic;

    @C09CT("linkmic_layout")
    public long linkMicLayout;

    @C09CT("live_event_info")
    public LiveEventInfo liveEventInfo;

    @C09CT("ai_live_summary")
    public LiveAiSummary liveFoundationAiSummary;
    public boolean liveNoDeduplicationClient;

    @C09CT("live_reason")
    public String liveReason;

    @C09CT("live_room_mode")
    public int liveRoomMode;

    @C09CT("live_sub_only")
    public long liveSubOnly;

    @C09CT("live_total_time")
    public long liveTotalTime;

    @C09CT("live_type_audio")
    public boolean liveTypeAudio;

    @C09CT("log_id")
    public String logId;
    public String mRequestId;
    public long mUserFrom;

    @C09CT("mask_layer")
    public MaskLayer maskLayer;
    public String message;

    @C09CT("social_interaction")
    public MultiLiveUserSettings multiLiveUserSettings;

    @C09CT("multi_stream_id")
    public long multiStreamId;

    @C09CT("multi_stream_scene")
    public long multiStreamScene;

    @C09CT("multi_stream_source")
    public long multiStreamSource;

    @C09CT("multi_stream_url")
    public StreamUrlStruct multiStreamUrl;

    @C09CT("new_fans_count")
    public int newFansCount;

    @C09CT("operation_label")
    public LiveImageModel operationLabel;
    public String optionsSting;
    public String originReqId;
    public String originRoomId;
    public String originStr;

    @C09CT("owner")
    public User owner;

    @C09CT("owner_user_id")
    public long ownerUserId;

    @C09CT("parallel_pull_stream_info")
    public ParallelPullStreamInfo parallelPullStreamInfo;

    @C09CT("partnership_info")
    public FYPartnershipInfo partnershipInfo;

    @C09CT("os_type")
    public int platform;

    @C09CT("play_together_info")
    public PlayTogetherBasicInfo playTogetherInfo;

    @C09CT("preview_card_comment_box")
    public PreviewCardCommentBox previewCardCommentBox;

    @C09CT("preview_comment_info")
    public PreviewCommentInfo previewCommentInfo;

    @C09CT("custom_tab_info")
    public PreviewCustomTabInfo previewCustomTabInfo;

    @C09CT("enlarge_view_info")
    public PreviewEnlargeViewInfo previewEnlargeViewInfo;
    public String prompts;

    @C09CT("repost_info")
    public RepostInfo repostInfo;

    @C09CT("repost_note")
    public String repostNote;

    @C09CT("reposted")
    public boolean reposted;

    @C09CT("activity")
    public RoomBuilding roomActivity;

    @C09CT(alternate = {"cover"}, value = "room_cover")
    public UrlModel roomCover;

    @C09CT("room_layout")
    public int roomLayout;

    @C09CT("room_pcu")
    public long roomPcu;

    @C09CT("room_type_tag")
    public String roomTypeTag;

    @C09CT("share_info")
    public ShareStruct share_info;

    @C09CT("smb_board_id")
    public long smbBoardId;

    @C09CT("smb_info")
    public SMBInfo smbInfo;

    @C09CT("smb_live_preview")
    public SMBLivePreview smbLivePreview;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
    public int status_code;
    public String status_msg;

    @C09CT("strategy_platform_features")
    public FeedStrategyPlatformFeatures strategyPlatformFeatures;

    @C09CT("stream_face_position")
    public LiveStreamFacePosition streamFacePosition;

    @C09CT("stream_snapshot_gif")
    public LiveStreamSnapshotGif streamSnapshotGif;

    @C09CT("stream_id")
    public long stream_id;

    @C09CT("stream_url")
    public StreamUrlStruct stream_url;

    @C09CT("taxonomy_tag_info")
    public TaxonomyTagInfo taxonomyTagInfo;

    @C09CT("title")
    public String title;

    @C09CT("top_frame_summary")
    public TopFrameSummary topFrameSummary;

    @C09CT("total_user")
    public int total_user;

    @C09CT("total_user_count")
    public int total_user_count;

    @C09CT("tv_station_room")
    public TVStationRoomStruct tvStationRoomStruct;
    public long userId;

    @C09CT("user_count")
    public int user_count;

    @C09CT("video_feed_tag")
    public String videoFeedTag;

    @C09CT("warning_tag")
    public WarningTag warningTag;

    @C09CT("watch_day_cnt_layer")
    public long watchDayCntLayer;

    @C09CT("watch_reason_v2")
    public WatchReasonV2 watchReasonV2;

    @C09CT("webcast_sdk_version")
    public long webcastSdkVersion;

    @C09CT("with_linkmic")
    public boolean withLinkmic;
    public int roomType = 3;
    public long firstShowTime = -1;

    @C09CT("allow_preview_time")
    public long allowPreviewTime = -1;

    @C09CT("max_preview_time")
    public long maxPreviewTime = -1;

    @C09CT("scm_label")
    public String scmLabel = "";

    @C09CT("multi_stream_id_str")
    public String multiStreamIdStr = "";

    @C09CT("room_create_ab_param")
    public String roomCreateAbParam = "";
    public int livePositionInSession = -1;
    public long clientAcceptanceTime = -1;
    public int livePositionInRequest = -1;

    public Boolean enableSMBLiveAiSummary() {
        return Boolean.valueOf(LivePreviewFeedServicePlusInfoSetting.INSTANCE.canLoadSMBAISummary(this));
    }

    public long getAnchorId() {
        User user = this.owner;
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return 0L;
        }
        return CastLongProtector.parseLong(this.owner.getUid());
    }

    public Challenge getChallenge() {
        try {
            Challenge challenge = this.challenge;
            if (challenge != null) {
                return challenge;
            }
            Challenge awemeChallenge = ((LiveChallenge) C09C2.LIZ().LJII(this.challengeInfo, LiveChallenge.class)).toAwemeChallenge();
            this.challenge = awemeChallenge;
            return awemeChallenge;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public FypRecommendInfo getEcommerceFypRecommendInfo() {
        PreviewProductCardInfo previewProductCardInfo;
        FYPCommerceStruct fYPCommerceStruct = this.fypCommerceStruct;
        if (fYPCommerceStruct == null || (previewProductCardInfo = fYPCommerceStruct.getPreviewProductCardInfo()) == null) {
            return null;
        }
        return previewProductCardInfo.getRecommendInfo();
    }

    public boolean getForceLowLatency() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null || this.stream_url.liveCoreSDKData.getPullData().getOptions() == null) {
            return false;
        }
        return this.stream_url.liveCoreSDKData.getPullData().getOptions().getForceLowLatency();
    }

    public LiveAiSummary getLiveAiSummary() {
        return (this.smbLivePreview == null || !enableSMBLiveAiSummary().booleanValue()) ? this.liveFoundationAiSummary : this.smbLivePreview.liveAiSummary;
    }

    public String getLiveStudioExtraStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.multiStreamUrl;
        if (streamUrlStruct == null || (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getLiveStudioExtraStreamDefaultPreviewQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.multiStreamUrl;
        if (streamUrlStruct == null || (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) == null || liveCoreSDKData.getDefaultPreviewQuality() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getDefaultPreviewQuality().sdkKey;
    }

    public String getLiveStudioExtraStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.multiStreamUrl;
        if (streamUrlStruct == null || (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public LiveStreamUrlExtra getLiveStudioStreamUrlExtra() {
        StreamUrlStruct streamUrlStruct = this.multiStreamUrl;
        if (streamUrlStruct == null) {
            return null;
        }
        return streamUrlStruct.liveStreamUrlExtra;
    }

    public String getMultiStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultPreviewQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) == null || liveCoreSDKData.getDefaultPreviewQuality() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getDefaultPreviewQuality().sdkKey;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null || (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.stream_url.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.String> getMultiStreamLogParams() {
        /*
            r8 = this;
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            long r3 = r8.multiStreamScene
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            java.lang.String r7 = "portrait"
            java.lang.String r1 = "is_multi_stream_room"
            java.lang.String r5 = "main_stream_orientation"
            if (r0 != 0) goto L40
            java.lang.String r0 = "1"
            r6.put(r1, r0)
            com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct r0 = r8.multiStreamUrl
            if (r0 == 0) goto L39
            long r3 = r0.sid
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L39
            java.lang.String r1 = java.lang.String.valueOf(r3)
        L28:
            java.lang.String r0 = "multi_stream_id"
            r6.put(r0, r1)
            boolean r0 = r8.isMainStreamHorizontal()
            if (r0 == 0) goto L3c
            java.lang.String r0 = "landscape"
            r6.put(r5, r0)
            return r6
        L39:
            java.lang.String r1 = ""
            goto L28
        L3c:
            r6.put(r5, r7)
            return r6
        L40:
            java.lang.String r0 = "0"
            r6.put(r1, r0)
            r6.put(r5, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct.getMultiStreamLogParams():java.util.Map");
    }

    public String getOptions() {
        StreamUrlStruct streamUrlStruct;
        LiveCoreSDKData liveCoreSDKData;
        if (TextUtils.isEmpty(this.optionsSting) && (streamUrlStruct = this.stream_url) != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && liveCoreSDKData.getPullData() != null && this.stream_url.liveCoreSDKData.getPullData().getOptions() != null) {
            this.optionsSting = GsonProtectorUtils.toJson(C09C2.LIZ(), this.stream_url.liveCoreSDKData.getPullData().getOptions());
        }
        return this.optionsSting;
    }

    public LiveStreamUrlExtra getStreamUrlExtra() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        if (streamUrlStruct == null) {
            return null;
        }
        return streamUrlStruct.liveStreamUrlExtra;
    }

    public String getTotalUserDes() {
        int i = this.total_user;
        if (i < 1000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.total_user);
            sbLIZ.append("");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i > 1000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(new BigDecimal(this.total_user / 1000000.0f).setScale(1, RoundingMode.DOWN).floatValue());
            sbLIZ2.append("M");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(new BigDecimal(this.total_user / 1000.0f).setScale(1, RoundingMode.DOWN).floatValue());
        sbLIZ3.append("K");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public String getUserCountDes() {
        int i = this.user_count;
        if (i < 1000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.user_count);
            sbLIZ.append("");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (i > 1000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(new BigDecimal(this.user_count / 1000000.0f).setScale(1, RoundingMode.DOWN).floatValue());
            sbLIZ2.append("M");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(new BigDecimal(this.user_count / 1000.0f).setScale(1, RoundingMode.DOWN).floatValue());
        sbLIZ3.append("K");
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public boolean isFinish() {
        return this.status == 4;
    }

    public boolean isMainStreamHorizontal() {
        return 1 == this.multiStreamScene && 0 == this.multiStreamSource;
    }

    public boolean isMediaRoom() {
        return this.roomLayout == 1;
    }

    public boolean isPullUrlValid() {
        StreamUrlStruct streamUrlStruct = this.stream_url;
        return (streamUrlStruct == null || TextUtils.isEmpty(streamUrlStruct.rtmp_pull_url)) ? false : true;
    }

    public LiveStreamUrlExtra getLiveStudioStreamUrlExtraSafely() {
        LiveStreamUrlExtra liveStudioStreamUrlExtra = getLiveStudioStreamUrlExtra();
        return liveStudioStreamUrlExtra == null ? new LiveStreamUrlExtra() : liveStudioStreamUrlExtra;
    }

    public LiveStreamUrlExtra getStreamUrlExtraSafely() {
        LiveStreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        return streamUrlExtra == null ? new LiveStreamUrlExtra() : streamUrlExtra;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveRoomStruct{mUserFrom=");
        sbLIZ.append(this.mUserFrom);
        sbLIZ.append(", mRequestId='");
        sbLIZ.append(this.mRequestId);
        sbLIZ.append('\'');
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", message='");
        sbLIZ.append(this.message);
        sbLIZ.append('\'');
        sbLIZ.append(", status_msg='");
        sbLIZ.append(this.status_msg);
        sbLIZ.append('\'');
        sbLIZ.append(", prompts='");
        sbLIZ.append(this.prompts);
        sbLIZ.append('\'');
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", roomType=");
        sbLIZ.append(this.roomType);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", owner=");
        sbLIZ.append(this.owner);
        sbLIZ.append(", title='");
        sbLIZ.append(this.title);
        sbLIZ.append('\'');
        sbLIZ.append(", user_count=");
        sbLIZ.append(this.user_count);
        sbLIZ.append(", create_time=");
        sbLIZ.append(this.create_time);
        sbLIZ.append(", finish_time=");
        sbLIZ.append(this.finish_time);
        sbLIZ.append(", stream_id=");
        sbLIZ.append(this.stream_id);
        sbLIZ.append(", additional_stream_url=");
        sbLIZ.append(this.additional_stream_url);
        sbLIZ.append(", share_info=");
        sbLIZ.append(this.share_info);
        sbLIZ.append(", digg_count=");
        sbLIZ.append(this.digg_count);
        sbLIZ.append(", coins=");
        sbLIZ.append(this.coins);
        sbLIZ.append(", inSandbox=");
        sbLIZ.append(this.inSandbox);
        sbLIZ.append(", total_user_count=");
        sbLIZ.append(this.total_user_count);
        sbLIZ.append(", roomActivity=");
        sbLIZ.append(this.roomActivity);
        sbLIZ.append(", roomCover=");
        sbLIZ.append(this.roomCover);
        sbLIZ.append(",blurredCover=");
        sbLIZ.append(this.blurredCover);
        sbLIZ.append(", roomTypeTag='");
        sbLIZ.append(this.roomTypeTag);
        sbLIZ.append('\'');
        sbLIZ.append(", newFansCount=");
        sbLIZ.append(this.newFansCount);
        sbLIZ.append(", liveTypeAudio=");
        sbLIZ.append(this.liveTypeAudio);
        sbLIZ.append(", isThirdParty=");
        sbLIZ.append(this.isThirdParty);
        sbLIZ.append(", isScreenshot=");
        sbLIZ.append(this.isScreenshot);
        sbLIZ.append(", isOfficialType=");
        sbLIZ.append(this.isOfficialType);
        sbLIZ.append(", liveTotalTime=");
        sbLIZ.append(this.liveTotalTime);
        sbLIZ.append(", ownerUserId=");
        sbLIZ.append(this.ownerUserId);
        sbLIZ.append(", videoFeedTag='");
        sbLIZ.append(this.videoFeedTag);
        sbLIZ.append('\'');
        sbLIZ.append(", withLinkmic=");
        sbLIZ.append(this.withLinkmic);
        sbLIZ.append(", distance='");
        sbLIZ.append(this.distance);
        sbLIZ.append('\'');
        sbLIZ.append(", stream_url=");
        sbLIZ.append(this.stream_url);
        sbLIZ.append(", clientVersion='");
        sbLIZ.append(this.clientVersion);
        sbLIZ.append('\'');
        sbLIZ.append(", webcastSdkVersion='");
        sbLIZ.append(this.webcastSdkVersion);
        sbLIZ.append('\'');
        sbLIZ.append(", platform=");
        sbLIZ.append(this.platform);
        sbLIZ.append(", errorMsg='");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append('\'');
        sbLIZ.append(", multi_stream_url='");
        sbLIZ.append(this.multiStreamUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", multi_stream_id_str='");
        sbLIZ.append(this.multiStreamIdStr);
        sbLIZ.append('\'');
        sbLIZ.append(", multi_stream_id='");
        sbLIZ.append(this.multiStreamId);
        sbLIZ.append('\'');
        sbLIZ.append(", multi_stream_scene='");
        sbLIZ.append(this.multiStreamScene);
        sbLIZ.append('\'');
        sbLIZ.append(", multi_stream_source='");
        sbLIZ.append(this.multiStreamSource);
        sbLIZ.append('\'');
        sbLIZ.append(", game_tag_detail='");
        sbLIZ.append(this.gameTagDetail);
        sbLIZ.append('\'');
        sbLIZ.append(", liveSubObly=");
        sbLIZ.append(this.liveSubOnly);
        sbLIZ.append("', live_room_mode='");
        sbLIZ.append(this.liveRoomMode);
        sbLIZ.append('\'');
        sbLIZ.append(", guess_widgets='");
        sbLIZ.append(this.guessWidgets);
        sbLIZ.append('\'');
        sbLIZ.append(", enlarge_view_info='");
        sbLIZ.append(this.previewEnlargeViewInfo);
        sbLIZ.append('\'');
        sbLIZ.append(", taxonomyTagInfo='");
        sbLIZ.append(this.taxonomyTagInfo);
        sbLIZ.append('\'');
        sbLIZ.append(", play_together_info='");
        sbLIZ.append(this.playTogetherInfo);
        sbLIZ.append('\'');
        sbLIZ.append(", ai_live_preview_highlight'");
        sbLIZ.append(this.aiLivePreviewHighlight);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getChallengeInfo() {
        return this.challengeInfo;
    }

    public LiveImageModel getContentLabel() {
        return this.contentLabel;
    }

    public String getContentTag() {
        return this.contentTag;
    }

    public LiveImageModel getOperationLabel() {
        return this.operationLabel;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.mRequestId;
    }

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public TopFrameSummary getTopFrameSummary() {
        return this.topFrameSummary;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public static boolean isValid(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct != null && liveRoomStruct.id > 0 && liveRoomStruct.owner != null) {
            return true;
        }
        return false;
    }

    public void setChallengeInfo(String str) {
        this.challengeInfo = str;
    }

    public void setContentLabel(LiveImageModel liveImageModel) {
        this.contentLabel = liveImageModel;
    }

    public void setContentTag(String str) {
        this.contentTag = str;
    }

    public void setOperationLabel(LiveImageModel liveImageModel) {
        this.operationLabel = liveImageModel;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setTopFrameSummary(TopFrameSummary topFrameSummary) {
        this.topFrameSummary = topFrameSummary;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }
}
