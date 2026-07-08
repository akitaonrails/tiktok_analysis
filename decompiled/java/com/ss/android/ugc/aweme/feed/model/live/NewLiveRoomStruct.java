package com.ss.android.ugc.aweme.feed.model.live;

import X.AbstractC2126608Uu;
import X.C09C2;
import X.C09CS;
import X.C09CT;
import X.C0X12;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.TVStationRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class NewLiveRoomStruct extends AbstractC2126608Uu implements C0X12, Serializable {
    public final int MAIN_HORIZONTAL;

    @C09CT("ai_live_preview_highlight")
    public AILivePreviewHighlight aiLivePreviewHighlight;

    @C09CT("ai_live_preview_highlight_expect")
    public AILivePreviewHighlight aiLivePreviewHighlightExpect;

    @C09CT("ai_live_preview_highlight_extra")
    public AILivePreviewHighlightExtra aiLivePreviewHighlightExtra;

    @C09CT("auto_cover")
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

    @C09CT("disable_preload_stream")
    public boolean disablePrePullStream;

    @C09CT("disable_screen_record")
    public boolean disableScreenRecord;

    @C09CT("drops_info")
    public LiveDropsRoomInfo dropsRoomInfo;

    @C09CT("enter_room_boost_extra")
    @C09CS(StringJsonAdapterFactory.class)
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

    @C09CT(alternate = {FollowStatusChangeMethod.PARAM_UID}, value = "room_id")
    public long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("live_type_official")
    public boolean isOfficialType;

    @C09CT("is_reposted_expect")
    public long isRepostedExpect;

    @C09CT("live_type_screenshot")
    public boolean isScreenshot;

    @C09CT("is_tag2_sfv_relation_pair")
    public boolean isTag2SfvRelationPair;

    @C09CT("live_type_third_party")
    public boolean isThirdParty;

    @C09CT("link_mic")
    @C09CS(RawStringJsonAdapter.class)
    public String linkMic;

    @C09CT("linkmic_layout")
    public long linkMicLayout;

    @C09CT("live_event_info")
    public LiveEventInfo liveEventInfo;

    @C09CT("ai_live_summary")
    public LiveAiSummary liveFoundationAiSummary;

    @C09CT("live_reason")
    public String liveReason;

    @C09CT("live_room_mode")
    public int liveRoomMode;

    @C09CT("live_sub_only")
    public long liveSubOnly;

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
    public LiveStreamUrl multiStreamUrl;

    @C09CT("operation_label")
    public LiveImageModel operationLabel;
    public String optionsSting;
    public transient String originStr;

    @C09CT("owner")
    public LiveUser owner;

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

    @C09CT("room_auth")
    public RoomAuthStatus roomAuthStatus;

    @C09CT(alternate = {"cover"}, value = "room_cover")
    public UrlModel roomCover;

    @C09CT("room_layout")
    public int roomLayout;

    @C09CT("room_pcu")
    public long roomPcu;

    @C09CT("stats")
    public RoomStas roomStas;

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

    @C09CT("stream_url")
    public LiveStreamUrl stream_url;

    @C09CT("taxonomy_tag_info")
    public TaxonomyTagInfo taxonomyTagInfo;

    @C09CT("title")
    public String title;

    @C09CT("top_frame_summary")
    public TopFrameSummary topFrameSummary;

    @C09CT("tv")
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

    @C09CT("allow_preview_time")
    public long allowPreviewTime = -1;

    @C09CT("max_preview_time")
    public long maxPreviewTime = -1;

    @C09CT("multi_stream_id_str")
    public String multiStreamIdStr = "";

    @C09CT("room_create_ab_param")
    public String roomCreateAbParam = "";

    public Boolean enableSMBLiveAiSummary() {
        SMBLivePreview sMBLivePreview = this.smbLivePreview;
        return Boolean.valueOf((sMBLivePreview == null || sMBLivePreview.liveAiSummary == null || !LivePreviewFeedServicePlusInfoSetting.INSTANCE.enableAISummary()) ? false : true);
    }

    public boolean forcedLowLatency() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        return (liveStreamUrl == null || liveStreamUrl.getLiveCoreSDKData() == null || this.stream_url.getLiveCoreSDKData().getPullData() == null || this.stream_url.getLiveCoreSDKData().getPullData().getOptions() == null || !this.stream_url.getLiveCoreSDKData().getPullData().getOptions().forcedLowLatency) ? false : true;
    }

    public boolean getAutoCover() {
        return this.autoCover == 1;
    }

    public Challenge getChallenge() {
        try {
            if (this.challenge == null) {
                this.challenge = (Challenge) C09C2.LIZ().LJII(this.challengeInfo, Challenge.class);
            }
            return this.challenge;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public LiveAiSummary getLiveAiSummary() {
        return (this.smbLivePreview == null || !enableSMBLiveAiSummary().booleanValue()) ? this.liveFoundationAiSummary : this.smbLivePreview.liveAiSummary;
    }

    public String getLiveStudioExtraSdkParams() {
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl == null) {
            return null;
        }
        return getLiveStudioExtraSdkParams(liveStreamUrl.defaultQualityName);
    }

    public String getLiveStudioExtraStreamData() {
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl == null || liveStreamUrl.getLiveCoreSDKData() == null || this.multiStreamUrl.getLiveCoreSDKData().getPullData() == null) {
            return null;
        }
        return this.multiStreamUrl.getLiveCoreSDKData().getPullData().getStreamData();
    }

    public String getLiveStudioExtraStreamDefaultQualitySdkKey() {
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl == null || liveStreamUrl.getLiveCoreSDKData() == null || this.multiStreamUrl.getLiveCoreSDKData().getDefaultQuality() == null) {
            return null;
        }
        return this.multiStreamUrl.getLiveCoreSDKData().getDefaultQuality().sdkKey;
    }

    public LiveStreamUrlExtra getLiveStudioStreamUrlExtra() {
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl == null) {
            return null;
        }
        return liveStreamUrl.getExtra();
    }

    public boolean getLiveSubOnlyEnable() {
        return this.liveSubOnly == 1;
    }

    public String getMultiStreamData() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null || liveStreamUrl.getLiveCoreSDKData() == null || this.stream_url.getLiveCoreSDKData().getPullData() == null) {
            return null;
        }
        return this.stream_url.getLiveCoreSDKData().getPullData().getStreamData();
    }

    public String getMultiStreamDefaultPreviewQualitySdkKey() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null || liveStreamUrl.getLiveCoreSDKData() == null || this.stream_url.getLiveCoreSDKData().getDefaultPreviewQuality() == null) {
            return null;
        }
        return this.stream_url.getLiveCoreSDKData().getDefaultPreviewQuality().sdkKey;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null || liveStreamUrl.getLiveCoreSDKData() == null || this.stream_url.getLiveCoreSDKData().getDefaultQuality() == null) {
            return null;
        }
        return this.stream_url.getLiveCoreSDKData().getDefaultQuality().sdkKey;
    }

    public Map<String, String> getMultiStreamLogParams() {
        String str;
        HashMap map = new HashMap();
        if (this.multiStreamScene != 1) {
            map.put("is_multi_stream_room", CardStruct.IStatusCode.DEFAULT);
            map.put("main_stream_orientation", "portrait");
            return map;
        }
        map.put("is_multi_stream_room", "1");
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl == null || (str = liveStreamUrl.idStr) == null) {
            str = "";
        }
        map.put("multi_stream_id", str);
        if (isMainStreamHorizontal()) {
            map.put("main_stream_orientation", "landscape");
            return map;
        }
        map.put("main_stream_orientation", "portrait");
        return map;
    }

    public String getOptions() {
        LiveStreamUrl liveStreamUrl;
        if (TextUtils.isEmpty(this.optionsSting) && (liveStreamUrl = this.stream_url) != null && liveStreamUrl.getLiveCoreSDKData() != null && this.stream_url.getLiveCoreSDKData().getPullData() != null && this.stream_url.getLiveCoreSDKData().getPullData().getOptions() != null) {
            this.optionsSting = GsonProtectorUtils.toJson(C09C2.LIZ(), this.stream_url.getLiveCoreSDKData().getPullData().getOptions());
        }
        return this.optionsSting;
    }

    public String getSdkParams() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null) {
            return null;
        }
        return getSdkParams(liveStreamUrl.defaultQualityName);
    }

    public LiveStreamUrlExtra getStreamUrlExtra() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null) {
            return null;
        }
        return liveStreamUrl.getExtra();
    }

    public void init() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl != null) {
            liveStreamUrl.validatePullUrl();
            if (this.stream_url.getLiveCoreSDKData() != null) {
                this.stream_url.validateMultiPullData();
            }
        }
        LiveStreamUrl liveStreamUrl2 = this.multiStreamUrl;
        if (liveStreamUrl2 != null) {
            liveStreamUrl2.validatePullUrl();
            if (this.multiStreamUrl.getLiveCoreSDKData() != null) {
                this.multiStreamUrl.validateMultiPullData();
            }
        }
    }

    public boolean isFinish() {
        return this.status == 4;
    }

    public boolean isMainStreamHorizontal() {
        return 1 == this.multiStreamScene && 0 == this.multiStreamSource;
    }

    public boolean isPullUrlValid() {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        return (liveStreamUrl == null || TextUtils.isEmpty(liveStreamUrl.rtmp_pull_url)) ? false : true;
    }

    public LiveRoomStruct roomStructConstructor() {
        LiveRoomStruct liveRoomStruct = new LiveRoomStruct();
        StreamUrlStruct streamUrlStruct = new StreamUrlStruct();
        StreamUrlStruct streamUrlStruct2 = new StreamUrlStruct();
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl != null) {
            streamUrlStruct.liveCoreSDKData = liveStreamUrl.liveCoreSDKData;
            streamUrlStruct.liveStreamUrlExtra = getStreamUrlExtraSafely();
            LiveStreamUrl liveStreamUrl2 = this.stream_url;
            streamUrlStruct.mCandidateResolutionList = liveStreamUrl2.candidateResolution;
            streamUrlStruct.mDefaultResolution = liveStreamUrl2.defaultResolution;
            streamUrlStruct.mFlvPullUrlMap = liveStreamUrl2.flvPullUrl;
            streamUrlStruct.provider = liveStreamUrl2.provider;
            streamUrlStruct.rtmp_pull_url = liveStreamUrl2.rtmp_pull_url;
            streamUrlStruct.rtmp_push_url = liveStreamUrl2.rtmp_push_url;
            streamUrlStruct.sid = liveStreamUrl2.id;
            streamUrlStruct.sdkParams = getSdkParams();
            LiveStreamUrl liveStreamUrl3 = this.stream_url;
            streamUrlStruct.aliveTimestamp = liveStreamUrl3.aliveTimestamp;
            streamUrlStruct.drmType = liveStreamUrl3.drmType;
            streamUrlStruct.streamLanguage = liveStreamUrl3.streamLanguage;
            streamUrlStruct.streamSizeWidth = liveStreamUrl3.streamSizeWidth;
            streamUrlStruct.streamSizeHeight = liveStreamUrl3.streamSizeHeight;
        }
        LiveStreamUrl liveStreamUrl4 = this.multiStreamUrl;
        if (liveStreamUrl4 != null) {
            streamUrlStruct2.liveCoreSDKData = liveStreamUrl4.liveCoreSDKData;
            streamUrlStruct2.liveStreamUrlExtra = getStreamUrlExtraSafely();
            LiveStreamUrl liveStreamUrl5 = this.multiStreamUrl;
            streamUrlStruct2.mCandidateResolutionList = liveStreamUrl5.candidateResolution;
            streamUrlStruct2.mDefaultResolution = liveStreamUrl5.defaultResolution;
            streamUrlStruct2.mFlvPullUrlMap = liveStreamUrl5.flvPullUrl;
            streamUrlStruct2.provider = liveStreamUrl5.provider;
            streamUrlStruct2.rtmp_pull_url = liveStreamUrl5.rtmp_pull_url;
            streamUrlStruct2.rtmp_push_url = liveStreamUrl5.rtmp_push_url;
            streamUrlStruct2.sid = liveStreamUrl5.id;
            streamUrlStruct2.sdkParams = getLiveStudioExtraSdkParams();
            LiveStreamUrl liveStreamUrl6 = this.multiStreamUrl;
            streamUrlStruct2.aliveTimestamp = liveStreamUrl6.aliveTimestamp;
            streamUrlStruct2.drmType = liveStreamUrl6.drmType;
            streamUrlStruct2.streamLanguage = liveStreamUrl6.streamLanguage;
            streamUrlStruct2.streamSizeWidth = liveStreamUrl6.streamSizeWidth;
            streamUrlStruct2.streamSizeHeight = liveStreamUrl6.streamSizeHeight;
        }
        User user = new User();
        LiveUser liveUser = this.owner;
        if (liveUser != null) {
            user.setUid(String.valueOf(liveUser.id));
            user.setSecUid(this.owner.secUid);
            user.setShortId(String.valueOf(this.owner.shortId));
            user.setNickname(this.owner.nickname);
            user.setAvatarLarger(this.owner.avatarLarger);
            user.setAvatarMedium(this.owner.avatarMedium);
            user.setAvatarThumb(this.owner.avatarThumb);
            user.setSecret(this.owner.secret == 1);
            FollowInfo followInfo = this.owner.followInfo;
            if (followInfo != null) {
                user.setFollowStatus((int) followInfo.followStatus);
            }
            user.setUniqueId(this.owner.uniqueId);
            user.authenticationInfo = this.owner.authenticationInfo;
        }
        RoomStas roomStas = this.roomStas;
        if (roomStas != null) {
            liveRoomStruct.total_user = roomStas.totalUser;
        }
        AILivePreviewHighlight aILivePreviewHighlight = this.aiLivePreviewHighlight;
        if (aILivePreviewHighlight != null) {
            liveRoomStruct.aiLivePreviewHighlight = aILivePreviewHighlight;
        }
        AILivePreviewHighlight aILivePreviewHighlight2 = this.aiLivePreviewHighlightExpect;
        if (aILivePreviewHighlight2 != null) {
            liveRoomStruct.aiLivePreviewHighlightExpect = aILivePreviewHighlight2;
        }
        AILivePreviewHighlightExtra aILivePreviewHighlightExtra = this.aiLivePreviewHighlightExtra;
        if (aILivePreviewHighlightExtra != null) {
            liveRoomStruct.aiLivePreviewHighlightExtra = aILivePreviewHighlightExtra;
        }
        liveRoomStruct.id = this.id;
        liveRoomStruct.idStr = this.idStr;
        liveRoomStruct.status = this.status;
        liveRoomStruct.owner = user;
        liveRoomStruct.title = this.title;
        liveRoomStruct.user_count = this.user_count;
        liveRoomStruct.roomCover = this.roomCover;
        liveRoomStruct.blurredCover = this.blurredCover;
        liveRoomStruct.partnershipInfo = this.partnershipInfo;
        liveRoomStruct.liveTypeAudio = this.liveTypeAudio;
        liveRoomStruct.isThirdParty = this.isThirdParty;
        liveRoomStruct.isScreenshot = this.isScreenshot;
        liveRoomStruct.isOfficialType = this.isOfficialType;
        liveRoomStruct.ownerUserId = this.ownerUserId;
        liveRoomStruct.videoFeedTag = this.videoFeedTag;
        liveRoomStruct.liveReason = this.liveReason;
        liveRoomStruct.withLinkmic = this.withLinkmic;
        long j = this.liveSubOnly;
        liveRoomStruct.stream_url = streamUrlStruct;
        liveRoomStruct.clientVersion = this.clientVersion;
        liveRoomStruct.webcastSdkVersion = this.webcastSdkVersion;
        liveRoomStruct.taxonomyTagInfo = this.taxonomyTagInfo;
        liveRoomStruct.platform = this.platform;
        liveRoomStruct.tvStationRoomStruct = this.tvStationRoomStruct;
        liveRoomStruct.challengeInfo = this.challengeInfo;
        liveRoomStruct.roomLayout = this.roomLayout;
        liveRoomStruct.contentLabel = this.contentLabel;
        liveRoomStruct.operationLabel = this.operationLabel;
        liveRoomStruct.contentTag = this.contentTag;
        liveRoomStruct.linkMicLayout = this.linkMicLayout;
        liveRoomStruct.autoCover = this.autoCover;
        liveRoomStruct.disablePrePullStream = this.disablePrePullStream;
        liveRoomStruct.allowPreviewTime = this.allowPreviewTime;
        liveRoomStruct.maxPreviewTime = this.maxPreviewTime;
        liveRoomStruct.liveEventInfo = this.liveEventInfo;
        liveRoomStruct.linkMic = this.linkMic;
        liveRoomStruct.warningTag = this.warningTag;
        liveRoomStruct.maskLayer = this.maskLayer;
        liveRoomStruct.fypWatchReason = this.fypWatchReason;
        liveRoomStruct.commerceStruct = this.commerceStruct;
        liveRoomStruct.hasCommerceGoods = this.hasCommerceGoods;
        liveRoomStruct.existedCommerceGoods = this.existedCommerceGoods;
        liveRoomStruct.liveSubOnly = j;
        RoomAuthStatus roomAuthStatus = this.roomAuthStatus;
        if (roomAuthStatus != null) {
            liveRoomStruct.commercePermission = roomAuthStatus.getCommercePermission();
        }
        liveRoomStruct.fypCommerceStruct = this.fypCommerceStruct;
        liveRoomStruct.feedRoomTagList = this.feedRoomTagList;
        LiveUser liveUser2 = this.owner;
        if (liveUser2 != null) {
            liveRoomStruct.scmLabel = liveUser2.scmLabel;
        }
        liveRoomStruct.topFrameSummary = this.topFrameSummary;
        liveRoomStruct.multiStreamUrl = streamUrlStruct2;
        liveRoomStruct.multiStreamIdStr = this.multiStreamIdStr;
        liveRoomStruct.multiStreamId = this.multiStreamId;
        liveRoomStruct.multiStreamScene = this.multiStreamScene;
        liveRoomStruct.multiStreamSource = this.multiStreamSource;
        liveRoomStruct.liveRoomMode = this.liveRoomMode;
        liveRoomStruct.hashTag = this.hashTag;
        liveRoomStruct.background = this.background;
        liveRoomStruct.disableScreenRecord = this.disableScreenRecord;
        liveRoomStruct.gameTagDetail = this.gameTagDetail;
        liveRoomStruct.dropsRoomInfo = this.dropsRoomInfo;
        liveRoomStruct.reposted = this.reposted;
        liveRoomStruct.repostNote = this.repostNote;
        liveRoomStruct.repostInfo = this.repostInfo;
        liveRoomStruct.isRepostedExpect = this.isRepostedExpect;
        liveRoomStruct.boardUsingInfo = this.boardUsingInfo;
        liveRoomStruct.liveFoundationAiSummary = this.liveFoundationAiSummary;
        liveRoomStruct.ctaData = this.ctaData;
        liveRoomStruct.guessWidgets = this.guessWidgets;
        liveRoomStruct.previewEnlargeViewInfo = this.previewEnlargeViewInfo;
        liveRoomStruct.previewCustomTabInfo = this.previewCustomTabInfo;
        liveRoomStruct.roomCreateAbParam = this.roomCreateAbParam;
        liveRoomStruct.playTogetherInfo = this.playTogetherInfo;
        liveRoomStruct.previewCommentInfo = this.previewCommentInfo;
        liveRoomStruct.previewCardCommentBox = this.previewCardCommentBox;
        liveRoomStruct.parallelPullStreamInfo = this.parallelPullStreamInfo;
        liveRoomStruct.roomPcu = this.roomPcu;
        liveRoomStruct.smbLivePreview = this.smbLivePreview;
        liveRoomStruct.watchReasonV2 = this.watchReasonV2;
        liveRoomStruct.smbInfo = this.smbInfo;
        liveRoomStruct.smbBoardId = this.smbBoardId;
        liveRoomStruct.multiLiveUserSettings = this.multiLiveUserSettings;
        liveRoomStruct.watchDayCntLayer = this.watchDayCntLayer;
        liveRoomStruct.streamSnapshotGif = this.streamSnapshotGif;
        liveRoomStruct.streamFacePosition = this.streamFacePosition;
        liveRoomStruct.epiDecision = this.epiDecision;
        liveRoomStruct.strategyPlatformFeatures = this.strategyPlatformFeatures;
        liveRoomStruct.logId = this.logId;
        liveRoomStruct.hostBoardStatus = this.hostBoardStatus;
        liveRoomStruct.isTag2SfvRelationPair = this.isTag2SfvRelationPair;
        liveRoomStruct.create_time = this.create_time;
        liveRoomStruct.setRequestId(getRequestId());
        liveRoomStruct.hasTtlsLivePermission = this.hasTtlsLivePermission;
        liveRoomStruct.existedTtlsGoods = this.existedTtlsGoods;
        liveRoomStruct.hasTtlsGoods = this.hasTtlsGoods;
        liveRoomStruct.debugSurveyId = this.debugSurveyId;
        liveRoomStruct.debugSurveyLan = this.debugSurveyLan;
        liveRoomStruct.originStr = this.originStr;
        liveRoomStruct.enterRoomExtra = this.enterRoomExtra;
        return liveRoomStruct;
    }

    public LiveStreamUrlExtra getStreamUrlExtraSafely() {
        LiveStreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        return streamUrlExtra == null ? new LiveStreamUrlExtra() : streamUrlExtra;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewLiveRoomStruct{mUserFrom=");
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
        sbLIZ.append(", roomCover=");
        sbLIZ.append(this.roomCover);
        sbLIZ.append(",blurredCover=");
        sbLIZ.append(this.blurredCover);
        sbLIZ.append(", liveTypeAudio=");
        sbLIZ.append(this.liveTypeAudio);
        sbLIZ.append(", isThirdParty=");
        sbLIZ.append(this.isThirdParty);
        sbLIZ.append(", isScreenshot=");
        sbLIZ.append(this.isScreenshot);
        sbLIZ.append(", isOfficialType=");
        sbLIZ.append(this.isOfficialType);
        sbLIZ.append(", ownerUserId=");
        sbLIZ.append(this.ownerUserId);
        sbLIZ.append(", videoFeedTag='");
        sbLIZ.append(this.videoFeedTag);
        sbLIZ.append('\'');
        sbLIZ.append(", withLinkmic=");
        sbLIZ.append(this.withLinkmic);
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
        sbLIZ.append(", tvStationRoomStruct=");
        sbLIZ.append(this.tvStationRoomStruct);
        sbLIZ.append(", errorMsg='");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append('\'');
        sbLIZ.append(", autoCover='");
        sbLIZ.append(this.autoCover);
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
        sbLIZ.append(", drops_info='");
        sbLIZ.append(this.dropsRoomInfo);
        sbLIZ.append('\'');
        sbLIZ.append(", liveSubOnly='");
        sbLIZ.append(this.liveSubOnly);
        sbLIZ.append('\'');
        sbLIZ.append(", live_room_mode='");
        sbLIZ.append(this.liveRoomMode);
        sbLIZ.append('\'');
        sbLIZ.append(", guess_widgets='");
        sbLIZ.append(this.guessWidgets);
        sbLIZ.append('\'');
        sbLIZ.append(", taxonomyTagInfo='");
        sbLIZ.append(this.taxonomyTagInfo);
        sbLIZ.append('\'');
        sbLIZ.append(", play_together_info='");
        sbLIZ.append(this.playTogetherInfo);
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

    public TopFrameSummary getTopFrameSummary() {
        return this.topFrameSummary;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public static boolean isValid(NewLiveRoomStruct newLiveRoomStruct) {
        if (newLiveRoomStruct != null && newLiveRoomStruct.id > 0 && newLiveRoomStruct.owner != null) {
            return true;
        }
        return false;
    }

    public String getLiveStudioExtraSdkParams(String str) {
        LiveStreamUrl liveStreamUrl = this.multiStreamUrl;
        if (liveStreamUrl == null) {
            return null;
        }
        return liveStreamUrl.sdkParamsMap.get(str);
    }

    public String getSdkParams(String str) {
        LiveStreamUrl liveStreamUrl = this.stream_url;
        if (liveStreamUrl == null) {
            return null;
        }
        return liveStreamUrl.sdkParamsMap.get(str);
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
