package com.ss.android.ugc.aweme.feed.model;

import X.C09C2;
import X.C2097608Jq;
import X.C616570OGh;
import X.InterfaceC1294060jmO;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.ss.android.ugc.aweme.commercialize.model.AdNodeTrackUrl;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.mention.CoverMentionedUserStruct;
import com.ss.android.ugc.aweme.feed.model.mention.VideoMentionInfoStruct;
import com.ss.android.ugc.aweme.feed.model.metainfo.MetaInfoCommonStruct;
import com.ss.android.ugc.aweme.feed.model.metainfo.MetaInfoContainerStruct;
import com.ss.android.ugc.aweme.feed.model.offlinevideo.OfflineVideoInfo;
import com.ss.android.ugc.aweme.feed.model.story.ShareToStoryStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class AwemeExtKt {

    /* JADX INFO: loaded from: classes22.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoTag.values().length];
            try {
                iArr[VideoTag.FEATURED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[VideoTag.FRIENDS_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[VideoTag.FOLLOWERS_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[VideoTag.EFFECT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean canDuetVideoType(Aweme aweme) {
        int i = aweme.awemeType;
        if (i != 0 && i != 51 && i != 52 && i != 58 && i != 54 && i != 53 && i != 61 && i != 55 && i != 56 && i != 150 && i != 160 && !commerceVideoTypeAllowDuetReact(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean canShare(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus == null || !awemeStatus.allowShare) {
            return false;
        }
        return true;
    }

    public static final boolean canShareToStory(Aweme aweme) {
        if (aweme.shareStoryStatus == 2) {
            return true;
        }
        return false;
    }

    public static final boolean canStitchVideoType(Aweme aweme) {
        int i = aweme.awemeType;
        if (i != 0 && i != 51 && i != 52 && i != 54 && i != 53 && i != 61 && i != 55 && i != 56 && i != 150 && i != 160 && !commerceVideoTypeAllowDuetReact(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean commerceVideoTypeAllowDuetReact(Aweme aweme) {
        int i = aweme.awemeType;
        if (i == 1 || i == 29 || i == 30 || i == 32 || i == 33 || i == 201) {
            return true;
        }
        return false;
    }

    public static final boolean containC2PA(Aweme aweme) {
        C2PAInfo c2PAInfo;
        String str;
        if (aweme.aigcInfo == null || (c2PAInfo = aweme.c2paInfo) == null || (str = c2PAInfo.aigcSrc) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean firstIsGreenScreenAnchor(Aweme aweme) {
        List<AnchorCommonStruct> list = aweme.anchors;
        if (list != null && !list.isEmpty() && ((AnchorCommonStruct) ListProtector.get(aweme.anchors, 0)).getType() == 99) {
            return true;
        }
        return false;
    }

    public static final String getAIFunctionType(Aweme aweme) {
        if (aweme.aiTheaterInfo != null) {
            return "ai_theater";
        }
        return "";
    }

    public static final CommentStruct getAdCommentStruct(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.awemeRawAd;
        if (awemeRawAd != null) {
            return awemeRawAd.getCommentArea();
        }
        return null;
    }

    public static final AnalyticsEntranceStatus getAnalyticsEntranceStatus(Aweme aweme) {
        StandardBusinessModel standardBusinessModel;
        CreatorAnalytics creatorAnalytics;
        Integer creatorAnalyticsEntranceStatus;
        ContentModel contentModel = aweme.contentModel;
        if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (creatorAnalytics = standardBusinessModel.getCreatorAnalytics()) != null && (creatorAnalyticsEntranceStatus = creatorAnalytics.getCreatorAnalyticsEntranceStatus()) != null) {
            if (creatorAnalyticsEntranceStatus.intValue() == 1) {
                return AnalyticsEntranceStatus.SHOW_ENTRANCE_WITH_PRIVACY_SETTINGS;
            }
            if (creatorAnalyticsEntranceStatus.intValue() == 2) {
                return AnalyticsEntranceStatus.DISABLED_ENTRANCE_WITH_PRIVACY_SETTINGS;
            }
            if (creatorAnalyticsEntranceStatus.intValue() == 3) {
                return AnalyticsEntranceStatus.SHOW_ENTRANCE_WITHOUT_PRIVACY_SETTINGS;
            }
        }
        return AnalyticsEntranceStatus.DEFAULT_FALLBACK;
    }

    public static final String getAuthorUid(Aweme aweme) {
        String uid;
        User user = aweme.author;
        if (user == null || (uid = user.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public static final String getAwemeRawAdIdStr(Aweme aweme) {
        String creativeIdStr;
        AwemeRawAd awemeRawAd = aweme.awemeRawAd;
        if (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) {
            return "";
        }
        return creativeIdStr;
    }

    public static final List<CoverMentionedUserStruct> getCoverMentionedUserInfos(Aweme aweme) {
        VideoMentionInfoStruct videoMentionInfoStruct = aweme.videoMentionInfoStruct;
        if (videoMentionInfoStruct != null) {
            return videoMentionInfoStruct.coverMentionedUserInfos;
        }
        return null;
    }

    public static final String getCoverNotice(Aweme aweme) {
        AwemeStatus.ReviewResult reviewResult;
        String str;
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus == null || (reviewResult = awemeStatus.reviewResult) == null || (str = reviewResult.coverNotice) == null) {
            return "";
        }
        return str;
    }

    public static final DescAreaInfo getDescAreaInfo(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.awemeRawAd;
        if (awemeRawAd != null) {
            return awemeRawAd.getDescAreaInfo();
        }
        return null;
    }

    public static final boolean getDownloadCommentEnable(Aweme aweme) {
        OfflineVideoInfo offlineVideoInfo;
        if (aweme != null && (offlineVideoInfo = aweme.offlineVideoInfo) != null) {
            return Intrinsics.LJFF(offlineVideoInfo.downloadCommentEnable, Boolean.TRUE);
        }
        return false;
    }

    public static final CharSequence getEllipsizeDesc(Aweme aweme) {
        if (AwemeBizExtKt.getEllipsizeDesc(aweme) != null) {
            WeakReference<CharSequence> ellipsizeDesc = AwemeBizExtKt.getEllipsizeDesc(aweme);
            if (ellipsizeDesc != null) {
                if (!TextUtils.isEmpty(ellipsizeDesc.get())) {
                    WeakReference<CharSequence> ellipsizeDesc2 = AwemeBizExtKt.getEllipsizeDesc(aweme);
                    if (ellipsizeDesc2 != null) {
                        return ellipsizeDesc2.get();
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return aweme.getDesc();
    }

    public static final int getEnterpriseType(Aweme aweme) {
        User user = aweme.author;
        if (user != null) {
            return user.getCommerceUserLevel();
        }
        return 0;
    }

    public static final CharSequence getFoldedHashTagDesc(Aweme aweme) {
        if (AwemeBizExtKt.getFoldedHashTagDesc(aweme) != null && !TextUtils.isEmpty(AwemeBizExtKt.getFoldedHashTagDesc(aweme))) {
            CharSequence foldedHashTagDesc = AwemeBizExtKt.getFoldedHashTagDesc(aweme);
            if (foldedHashTagDesc == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            return foldedHashTagDesc;
        }
        String desc = aweme.getDesc();
        if (desc == null) {
            return "";
        }
        return desc;
    }

    public static final List<TextExtraStruct> getFoldedTextExtra(Aweme aweme) {
        List<TextExtraStruct> foldedTextExtra = AwemeBizExtKt.getFoldedTextExtra(aweme);
        if (foldedTextExtra != null && !foldedTextExtra.isEmpty()) {
            return AwemeBizExtKt.getFoldedTextExtra(aweme);
        }
        return aweme.getTextExtra();
    }

    public static final int getFollowStatus(Aweme aweme) {
        User user = aweme.author;
        if (user != null) {
            return user.getFollowStatus();
        }
        return -1;
    }

    public static final String getForwardGroupId(Aweme aweme) {
        if (isMultiForwardAweme(aweme)) {
            return aweme.preForwardId;
        }
        return "";
    }

    public static final String getForwardUserId(Aweme aweme) {
        if (C616570OGh.LIZ(aweme.textExtra)) {
            return "";
        }
        for (TextExtraStruct textExtraStruct : aweme.textExtra) {
            if (textExtraStruct.getType() == 2) {
                return textExtraStruct.getUserId();
            }
        }
        return "";
    }

    public static final String getFromGroupId(Aweme aweme) {
        if (aweme.getAwemeType() == 13) {
            if (aweme.getForwardItem() != null) {
                return aweme.getForwardItem().getAid();
            }
            return aweme.getForwardItemId();
        }
        return aweme.getAid();
    }

    public static final String getFromUserId(Aweme aweme) {
        if (aweme.getAwemeType() == 13) {
            if (aweme.getForwardItem() != null) {
                return getAuthorUid(aweme.getForwardItem());
            }
            return "";
        }
        return getAuthorUid(aweme);
    }

    public static final String getGenreType(Aweme aweme) {
        AnimatedImageInfo animatedImageInfo;
        if (TextUtils.isEmpty(aweme.genreType)) {
            if (!aweme.isAd && !aweme.isSoftAd) {
                int i = aweme.awemeType;
                if (i == 160) {
                    aweme.genreType = "text";
                } else if (i == 150) {
                    aweme.genreType = "photo";
                } else if (i != 11 && !aweme.isTikTokStory) {
                    if (i == 0 && (animatedImageInfo = aweme.mAnimatedImageInfo) != null && animatedImageInfo.isLivePhoto()) {
                        aweme.genreType = "photo";
                    }
                } else {
                    aweme.genreType = "story";
                }
            } else {
                aweme.genreType = "ad";
            }
        }
        return aweme.genreType;
    }

    public static final String getGiphyGifIds(Aweme aweme) {
        return "";
    }

    public static final InsightsEligibilityStatus getInsightsEligibilityStatus(Aweme aweme) {
        int i = aweme.insightsEligibilityStatus;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return InsightsEligibilityStatus.CONTROL;
                }
                return InsightsEligibilityStatus.NOT_AVAILABLE_NEW;
            }
            return InsightsEligibilityStatus.NOT_AVAILABLE_TTL;
        }
        return InsightsEligibilityStatus.AVAILABLE;
    }

    public static final boolean getIsUserInVideoMention(Aweme aweme) {
        VideoMentionInfoStruct videoMentionInfoStruct = aweme.videoMentionInfoStruct;
        if (videoMentionInfoStruct != null && videoMentionInfoStruct.isMentioned()) {
            return true;
        }
        return false;
    }

    public static final String getLayoutMode(Aweme aweme) {
        LayoutInfo layoutInfo = aweme.layoutInfo;
        if (layoutInfo == null) {
            return null;
        }
        return layoutInfo.layoutMode;
    }

    public static final LiveRoomStruct getLiveRoomStructFinally(Aweme aweme) {
        LiveRoomStruct newLiveRoomDataExt = getNewLiveRoomDataExt(aweme);
        if (newLiveRoomDataExt == null) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct != null) {
                return roomFeedCellStruct.getNewLiveRoomData();
            }
            return null;
        }
        return newLiveRoomDataExt;
    }

    public static final String getMainSurveyKey(Aweme aweme) {
        String str;
        com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo surveyInfo = aweme.surveyInfo;
        if (surveyInfo != null) {
            return surveyInfo.surveyKey;
        }
        List<com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo> list = aweme.surveyInfos;
        if (list == null || list.isEmpty() || ListProtector.get(aweme.surveyInfos, 0) == null || (str = ((com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo) ListProtector.get(aweme.surveyInfos, 0)).surveyKey) == null) {
            return "";
        }
        return str;
    }

    public static final List<MetaInfoCommonStruct> getMetainfos(Aweme aweme) {
        MetaInfoContainerStruct metaInfoContainerStruct;
        StandardComponentInfo standardComponentInfo = aweme.standardComponentInfo;
        if (standardComponentInfo != null && (metaInfoContainerStruct = standardComponentInfo.metaInfoContainer) != null) {
            return metaInfoContainerStruct.metaInfos;
        }
        return null;
    }

    public static final String getMixId(Aweme aweme) {
        String str;
        MixStruct mixStruct = aweme.mixInfo;
        if (mixStruct == null || (str = mixStruct.mixId) == null) {
            return "";
        }
        return str;
    }

    public static final AwemeRawAd getMonetizationData(Aweme aweme) {
        if (!isMonetizationTraffic(aweme)) {
            return null;
        }
        if (isAdTraffic(aweme)) {
            return aweme.getAwemeRawAd();
        }
        AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo == null) {
            return null;
        }
        return commerceVideoAuthInfo.getPseudoAdData();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[PHI: r4
      0x009d: PHI (r4v1 long) = (r4v0 long), (r4v3 long) binds: [B:34:0x009a, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.util.Pair<java.lang.Integer, java.lang.Integer> getMusicDspStartAndEndTime(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            int r1 = r9.getAwemeType()
            r0 = 151(0x97, float:2.12E-43)
            if (r1 != r0) goto La2
            com.ss.android.ugc.aweme.music.model.Music r0 = r9.getMusic()
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.music.model.Music r0 = r9.getMusic()
            com.ss.android.ugc.aweme.music.model.MatchedSoundInfo r0 = r0.getMatchedSongInfo()
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.music.model.Music r0 = r9.getMusic()
            com.ss.android.ugc.aweme.music.model.MatchedSoundInfo r0 = r0.getMatchedSongInfo()
            com.ss.android.ugc.aweme.music.model.MusicChorusInfo r0 = r0.getChorusInfo()
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.music.model.Music r0 = r9.getMusic()
            com.ss.android.ugc.aweme.music.model.MatchedSoundInfo r0 = r0.getMatchedSongInfo()
            com.ss.android.ugc.aweme.music.model.MusicChorusInfo r8 = r0.getChorusInfo()
        L32:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r9.getVideo()
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.feed.model.Video r0 = r9.getVideo()
            int r3 = r0.getDuration()
        L40:
            r6 = 0
            if (r8 == 0) goto L98
            long r1 = r8.getStartTime()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L98
            long r4 = r8.getStartTime()
            long r1 = (long) r3
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L98
            long r4 = r8.getStartTime()
        L59:
            long r1 = r8.getDuration()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L9d
            long r6 = r8.getDuration()
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L92
            r2 = 60000(0xea60, float:8.4078E-41)
        L6f:
            long r6 = (long) r2
            long r6 = r6 + r4
            long r1 = (long) r3
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L7a:
            android.util.Pair r2 = new android.util.Pair
            int r0 = (int) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        L8d:
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            goto L7a
        L92:
            long r0 = r8.getDuration()
            int r2 = (int) r0
            goto L6f
        L98:
            r4 = 0
            if (r8 == 0) goto L9d
            goto L59
        L9d:
            r2 = 30000(0x7530, float:4.2039E-41)
            goto L6f
        La0:
            r3 = 0
            goto L40
        La2:
            r8 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getMusicDspStartAndEndTime(com.ss.android.ugc.aweme.feed.model.Aweme):android.util.Pair");
    }

    public static final boolean getNeedPreloadAdLink(Aweme aweme) {
        if (aweme.adLinkType == 1) {
            return true;
        }
        return false;
    }

    public static final LiveRoomStruct getNewLiveRoomDataExt(Aweme aweme) {
        try {
            if (AwemeBizExtKt.getCachedLiveRoomStruct(aweme) != null) {
                return AwemeBizExtKt.getCachedLiveRoomStruct(aweme);
            }
            RoomFeedCellStruct roomFeedCellStruct = aweme.mRoomFeedCellStruct;
            if (roomFeedCellStruct != null && roomFeedCellStruct.getNewLiveRoomData() != null) {
                return aweme.mRoomFeedCellStruct.getNewLiveRoomData();
            }
            NewLiveRoomStruct newLiveRoomStruct = aweme.newLiveRoomData;
            if (newLiveRoomStruct != null) {
                newLiveRoomStruct.init();
                return aweme.newLiveRoomData.roomStructConstructor();
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final OcrLocation getOcrLocation(Aweme aweme) {
        return getUploadMiscInfoStruct(aweme).getOcrLocation();
    }

    public static final CharSequence getProcessedDesc(Aweme aweme) {
        if (AwemeBizExtKt.getProcessedDesc(aweme) != null) {
            WeakReference<CharSequence> processedDesc = AwemeBizExtKt.getProcessedDesc(aweme);
            if (processedDesc != null) {
                if (!TextUtils.isEmpty(processedDesc.get())) {
                    WeakReference<CharSequence> processedDesc2 = AwemeBizExtKt.getProcessedDesc(aweme);
                    if (processedDesc2 != null) {
                        return processedDesc2.get();
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return aweme.getDesc();
    }

    public static final int getPromoteAdTypeForReport(Aweme aweme) {
        if (aweme == null) {
            return 0;
        }
        boolean zIsPseudoAd = isPseudoAd(aweme);
        if (!aweme.isAd && !aweme.isSoftAd && !zIsPseudoAd) {
            return 100;
        }
        AwemeRawAd awemeRawAd = aweme.awemeRawAd;
        if (awemeRawAd != null && awemeRawAd.getSystemOrigin() == 51) {
            if (aweme.isAd) {
                return 101;
            }
            if (aweme.isSoftAd) {
                return 102;
            }
            return 103;
        }
        if (aweme.isAd) {
            return 104;
        }
        if (aweme.isSoftAd) {
            return 105;
        }
        return 106;
    }

    public static final SimplePromotion getPromotion(Aweme aweme) {
        List<SimplePromotion> promotions = getPromotions(aweme);
        if (promotions.isEmpty()) {
            return null;
        }
        return (SimplePromotion) ListProtector.get(promotions, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.commerce.model.SimplePromotion> getPromotions(com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            java.util.List r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getSimplePromotions(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r0 = r3.anchorInfo
            if (r0 == 0) goto L55
            java.lang.Integer r0 = r0.getType()
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r0 = r3.anchorInfo
            java.lang.Integer r0 = r0.getType()
            if (r0 == 0) goto L55
            int r1 = r0.intValue()
            r0 = 3
            if (r1 != r0) goto L55
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r0 = r3.anchorInfo
            java.lang.String r0 = r0.getExtra()
            if (r0 == 0) goto L32
            int r0 = r0.length()
            if (r0 == 0) goto L32
            r0 = 0
        L2f:
            if (r0 != 0) goto L55
            goto L34
        L32:
            r0 = 1
            goto L2f
        L34:
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L5b
            r2.<init>()     // Catch: java.lang.Exception -> L5b
            com.ss.android.ugc.aweme.feed.model.AnchorInfo r0 = r3.anchorInfo     // Catch: java.lang.Exception -> L5b
            java.lang.String r1 = r0.getExtra()     // Catch: java.lang.Exception -> L5b
            java.lang.Class<com.ss.android.ugc.aweme.commerce.model.SimplePromotion[]> r0 = com.ss.android.ugc.aweme.commerce.model.SimplePromotion[].class
            java.lang.Object r0 = r2.LJII(r1, r0)     // Catch: java.lang.Exception -> L5b
            com.ss.android.ugc.aweme.commerce.model.SimplePromotion[] r0 = (com.ss.android.ugc.aweme.commerce.model.SimplePromotion[]) r0     // Catch: java.lang.Exception -> L5b
            if (r0 == 0) goto L4f
            java.util.List r0 = X.C13LQ.LJJLL(r0)     // Catch: java.lang.Exception -> L5b
            if (r0 != 0) goto L51
        L4f:
            X.13BV r0 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L5b
        L51:
            com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.setSimplePromotions(r3, r0)     // Catch: java.lang.Exception -> L5b
            goto L64
        L55:
            X.13BV r0 = X.C13BV.INSTANCE
            com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.setSimplePromotions(r3, r0)
            goto L64
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.13BV r0 = X.C13BV.INSTANCE
            com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.setSimplePromotions(r3, r0)
        L64:
            java.util.List r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getSimplePromotions(r3)
            if (r0 != 0) goto L6c
            X.13BV r0 = X.C13BV.INSTANCE
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getPromotions(com.ss.android.ugc.aweme.feed.model.Aweme):java.util.List");
    }

    public static final List<RecReasonEntry> getRecReasonsEntry(Aweme aweme) {
        RecReasonsStruct recReasonsStruct = aweme.recReasonsStruct;
        if (recReasonsStruct != null) {
            return recReasonsStruct.reasons;
        }
        return null;
    }

    public static final String getRepostFromGroupId(Aweme aweme) {
        Aweme aweme2;
        if (!TextUtils.isEmpty(AwemeBizExtKt.getRepostFromGroupId(aweme))) {
            return AwemeBizExtKt.getRepostFromGroupId(aweme);
        }
        if (AwemeSaaSExtKt.isForwardAweme(aweme) && (aweme2 = aweme.forwardItem) != null) {
            return aweme2.getAid();
        }
        return null;
    }

    public static final String getRepostFromUserId(Aweme aweme) {
        Aweme aweme2;
        User user;
        if (!TextUtils.isEmpty(AwemeBizExtKt.getRepostFromUserId(aweme))) {
            return AwemeBizExtKt.getRepostFromUserId(aweme);
        }
        if (AwemeSaaSExtKt.isForwardAweme(aweme) && (aweme2 = aweme.forwardItem) != null && (user = aweme2.author) != null) {
            return user.getUid();
        }
        return null;
    }

    public static final String getReviewDetailUrl(Aweme aweme) {
        String reviewDetailUrl;
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus == null || (reviewDetailUrl = awemeStatus.getReviewDetailUrl()) == null) {
            return "";
        }
        return reviewDetailUrl;
    }

    public static final int getReviewStatus(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus == null) {
            return 0;
        }
        return awemeStatus.getReviewStatus();
    }

    public static final List<Scenario> getScenarioList(Aweme aweme) {
        CustomBizInfo customBizInfo;
        List<Scenario> list;
        ContentModel contentModel = aweme.contentModel;
        if (contentModel == null || (customBizInfo = contentModel.customBizInfo) == null || (list = customBizInfo.scenarioList) == null) {
            return new ArrayList();
        }
        return list;
    }

    public static final String getSecAuthorUid(Aweme aweme) {
        String secUid;
        User user = aweme.author;
        if (user == null || (secUid = user.getSecUid()) == null) {
            return "";
        }
        return secUid;
    }

    public static final AwemeStatus getStatusSafety(Aweme aweme) {
        if (isScheduleVideo(aweme) && aweme.status == null) {
            aweme.status = new AwemeStatus();
        }
        return aweme.status;
    }

    public static final AVUploadMiscInfoStruct getUploadMiscInfoStruct(Aweme aweme) {
        if (AwemeBizExtKt.getCacheAvUploadMiscInfoStruct(aweme) == null) {
            AwemeBizExtKt.setCacheAvUploadMiscInfoStruct(aweme, AVUploadMiscInfoStruct.createStruct(aweme.uploadMiscInfoStructStr));
        }
        AVUploadMiscInfoStruct cacheAvUploadMiscInfoStruct = AwemeBizExtKt.getCacheAvUploadMiscInfoStruct(aweme);
        if (cacheAvUploadMiscInfoStruct != null) {
            return cacheAvUploadMiscInfoStruct;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final String getVideoDetailNotice(Aweme aweme) {
        AwemeStatus.ReviewResult reviewResult;
        String str;
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus == null || (reviewResult = awemeStatus.reviewResult) == null || (str = reviewResult.videoDetailNotice) == null) {
            return "";
        }
        return str;
    }

    public static final String getVideoDetailNoticeBottom(Aweme aweme) {
        AwemeStatus.ReviewResult reviewResult;
        String str;
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus == null || (reviewResult = awemeStatus.reviewResult) == null || (str = reviewResult.videoDetailNoticeBottom) == null) {
            return "";
        }
        return str;
    }

    public static final int getViolationDisplayStatus(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus != null) {
            return awemeStatus.violationDisplayStatus;
        }
        return 0;
    }

    public static final boolean hasPromotion(Aweme aweme) {
        if (getPromotion(aweme) != null) {
            return true;
        }
        return false;
    }

    public static final boolean hasStickerID(Aweme aweme) {
        if (aweme.stickerIDs != null) {
            return true;
        }
        return false;
    }

    public static final boolean isAdFiled(Aweme aweme) {
        if (!aweme.isAd && !aweme.isSoftAd) {
            return false;
        }
        return true;
    }

    public static final boolean isAdTraffic(Aweme aweme) {
        if (!aweme.isAd() && !aweme.isSoftAd()) {
            return false;
        }
        return true;
    }

    public static final boolean isAwemeFromXiGua(Aweme aweme) {
        if (aweme.externalType == 1) {
            return true;
        }
        return false;
    }

    public static final boolean isCard(Aweme aweme) {
        int i = aweme.awemeType;
        if (i != 104 && i != 105) {
            return false;
        }
        return true;
    }

    public static final boolean isCollected(Aweme aweme) {
        if (aweme.collectStatus == 1) {
            return true;
        }
        return false;
    }

    public static final boolean isCommentPostInvisible(Aweme aweme) {
        if (!aweme.isCommentPostVideo) {
            return false;
        }
        CommentPostInfo commentPostInfo = aweme.commentPostInfo;
        if (commentPostInfo != null && commentPostInfo.isVisible() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean isDelete(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus != null && awemeStatus.isDelete()) {
            return true;
        }
        return false;
    }

    public static final boolean isDescAreaReplaceAd(Aweme aweme) {
        DescAreaInfo descAreaInfo;
        AwemeRawAd awemeRawAd = aweme.awemeRawAd;
        if (awemeRawAd == null || (descAreaInfo = awemeRawAd.getDescAreaInfo()) == null || !Intrinsics.LJFF(descAreaInfo.enableReplaceDescArea, Boolean.TRUE) || !isAdTraffic(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean isGreenScreenSticker(Aweme aweme) {
        AVUploadMiscInfoStruct uploadMiscInfoStruct = getUploadMiscInfoStruct(aweme);
        if (uploadMiscInfoStruct == null || uploadMiscInfoStruct.greenScreen != 1) {
            return false;
        }
        return true;
    }

    public static final boolean isHotSearchAweme(Aweme aweme) {
        HotSearchInfo hotSearchInfo = aweme.hotSearchInfo;
        if (hotSearchInfo != null && !TextUtils.isEmpty(hotSearchInfo.getSentence())) {
            return true;
        }
        return false;
    }

    public static final boolean isHotVideoAweme(Aweme aweme) {
        HotSearchInfo hotSearchInfo = aweme.hotSearchInfo;
        if (hotSearchInfo != null && hotSearchInfo.getVideoRank() > 0 && aweme.hotSearchInfo.getVideoRankVV() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean isImage(Aweme aweme) {
        if (aweme.awemeType == 2) {
            return true;
        }
        return false;
    }

    public static final boolean isInReviewing(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus != null && awemeStatus.isInReviewing()) {
            return true;
        }
        return false;
    }

    public static final boolean isLiveNoDeduplicate(Aweme aweme) {
        if (aweme.awemeType == 101 && 1 == aweme.deduplicationType) {
            return true;
        }
        return false;
    }

    public static final boolean isLiveNoDeduplicateClient(Aweme aweme) {
        LiveRoomStruct newLiveRoomDataExt;
        if (aweme.awemeType != 101 || (newLiveRoomDataExt = getNewLiveRoomDataExt(aweme)) == null) {
            return false;
        }
        return newLiveRoomDataExt.liveNoDeduplicationClient;
    }

    public static final boolean isMDPSquareType(Aweme aweme) {
        int i = aweme.detailPageItemType;
        if (i != VideoTag.MDP_SQUARE_EFFECT.videoTag && i != VideoTag.MDP_SQUARE_MUSIC.videoTag && i != VideoTag.MDP_SQUARE_TEMPLATE.videoTag) {
            return false;
        }
        return true;
    }

    public static final boolean isMixAweme(Aweme aweme) {
        MixStruct mixStruct = aweme.mixInfo;
        if (mixStruct != null && !TextUtils.isEmpty(mixStruct.mixId)) {
            return true;
        }
        return false;
    }

    public static final boolean isMonetizationTraffic(Aweme aweme) {
        if (!isAdTraffic(aweme) && !isPseudoAd(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean isMultiForwardAweme(Aweme aweme) {
        if (C616570OGh.LIZ(aweme.textExtra)) {
            return false;
        }
        Iterator<TextExtraStruct> it2 = aweme.textExtra.iterator();
        while (it2.hasNext()) {
            if (it2.next().getType() == 2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isNormalVideo(Aweme aweme) {
        if (aweme.awemeType == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isOfflineVideo(Aweme aweme) {
        OfflineVideoInfo offlineVideoInfo;
        if (aweme == null || (offlineVideoInfo = aweme.offlineVideoInfo) == null || !offlineVideoInfo.isOfflineVideo()) {
            return false;
        }
        return true;
    }

    public static final boolean isOnThisDayVideo(Aweme aweme) {
        if (aweme.isOnThisDay == 1) {
            return true;
        }
        return false;
    }

    public static final boolean isPhotoMode(Aweme aweme) {
        if (aweme.awemeType == 150) {
            return true;
        }
        return false;
    }

    public static final boolean isPrivate(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus != null && awemeStatus.getPrivateStatus() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean isPrivateV2(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus != null) {
            if (awemeStatus.getPrivateStatus() == 1 || aweme.status.getPrivateStatus() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean isProhibited(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus != null && awemeStatus.isProhibited()) {
            return true;
        }
        return false;
    }

    public static final boolean isProhibitedAndShouldTell(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus == null || !awemeStatus.isProhibitedAndShouldTell()) {
            return false;
        }
        return true;
    }

    public static final boolean isPseudoAd(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo == null || !commerceVideoAuthInfo.isPseudoAd() || commerceVideoAuthInfo.getPseudoAdData() == null) {
            return false;
        }
        return true;
    }

    public static final boolean isPublic(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus != null && awemeStatus.getPrivateStatus() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isReviewed(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus != null && awemeStatus.isReviewed()) {
            return true;
        }
        return false;
    }

    public static final boolean isScheduleVideo(Aweme aweme) {
        if (aweme.scheduleTime > 0) {
            return true;
        }
        return false;
    }

    public static final boolean isSearchPreciseAd(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.awemeRawAd;
        if (awemeRawAd != null && awemeRawAd.isSearchPreciseAd()) {
            return true;
        }
        return false;
    }

    public static final boolean isSelfSee(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus != null && awemeStatus.isSelfSee()) {
            return true;
        }
        return false;
    }

    public static final boolean isSharedStoryVisible(Aweme aweme) {
        ShareToStoryStruct shareToStoryStruct = aweme.share2StoryStruct;
        if (shareToStoryStruct == null || shareToStoryStruct.isVisible() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean isSupportGameChallenge(Aweme aweme) {
        if (aweme.gameInfo != null) {
            return true;
        }
        return false;
    }

    public static final boolean isTextMoreAd(Aweme aweme) {
        TitlePanelConfigs titlePanelConfigs;
        Integer num;
        AwemeRawAd awemeRawAd = aweme.awemeRawAd;
        if (awemeRawAd != null && (titlePanelConfigs = awemeRawAd.getTitlePanelConfigs()) != null && (num = titlePanelConfigs.enable) != null && num.intValue() == 1 && isAdTraffic(aweme)) {
            return true;
        }
        return false;
    }

    @InterfaceC1294060jmO
    public static final boolean isTop(Aweme aweme) {
        if (aweme.isTop == 1) {
            return true;
        }
        return false;
    }

    public static final boolean isUserPost(Aweme aweme) {
        if (aweme.awemeType == 33 || aweme.adAwemeSource == 1) {
            return true;
        }
        return false;
    }

    public static final boolean isWithSurvey(Aweme aweme) {
        List<com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo> list = aweme.surveyInfos;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final void resetSessionData(Aweme aweme) {
        AwemeBizExtKt.setClientAcceptanceTime(aweme, -1L);
        AwemeBizExtKt.setPositionInRequest(aweme, -1);
        AwemeBizExtKt.setSessionPosition(aweme, -1);
        AwemeBizExtKt.setSessionRequestPosition(aweme, -1);
    }

    public static final boolean shouldShowReviewStatus(Aweme aweme) {
        AwemeStatus awemeStatus = aweme.status;
        if (awemeStatus == null || !awemeStatus.shouldShowReviewStatus()) {
            return false;
        }
        return true;
    }

    public static final void updateAwemeShareToStoryStatusWhenDeleted(Aweme aweme) {
        aweme.shareStoryStatus = 2;
    }

    public static final void updateAwemeShareToStoryStatusWhenShared(Aweme aweme) {
        aweme.shareStoryStatus = 1;
    }

    public static final boolean withFakeUser(Aweme aweme) {
        User user = aweme.author;
        if (user != null && !user.isAdFake()) {
            return false;
        }
        return true;
    }

    public static final void copyMobParamsFrom(Aweme aweme, Aweme aweme2) {
        Map mapLJ;
        if (aweme2 == null || (mapLJ = aweme2.mMobParams) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        aweme.mMobParams = new HashMap<>(mapLJ);
    }

    public static final <T> T getCustomPayload(Aweme aweme, String str) {
        if (AwemeBizExtKt.getCustomPayloads(aweme) == null) {
            return null;
        }
        Map<String, Object> customPayloads = AwemeBizExtKt.getCustomPayloads(aweme);
        if (customPayloads != null) {
            T t = (T) customPayloads.get(str);
            if (t == null) {
                return null;
            }
            return t;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final List<String> getRawAdPlayNodeTrackUrlList(Aweme aweme, int i) {
        List<AdNodeTrackUrl> adNodeTrackUrlList;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (adNodeTrackUrlList = awemeRawAd.getAdNodeTrackUrlList()) == null || adNodeTrackUrlList.isEmpty()) {
            return null;
        }
        for (AdNodeTrackUrl adNodeTrackUrl : adNodeTrackUrlList) {
            if (adNodeTrackUrl.percent == i) {
                return adNodeTrackUrl.urlList;
            }
        }
        return null;
    }

    public static final void removeCustomPayload(Aweme aweme, String str) {
        if (AwemeBizExtKt.getCustomPayloads(aweme) == null) {
            return;
        }
        Map<String, Object> customPayloads = AwemeBizExtKt.getCustomPayloads(aweme);
        if (customPayloads != null) {
            customPayloads.remove(str);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static final void setDetailPageVideoTag(Aweme aweme, VideoTag videoTag) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[videoTag.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        i = VideoTag.DEFAULT.videoTag;
                    } else {
                        i = VideoTag.EFFECT.videoTag;
                    }
                } else {
                    i = VideoTag.FOLLOWERS_VIDEO.videoTag;
                }
            } else {
                i = VideoTag.FRIENDS_VIDEO.videoTag;
            }
        } else {
            i = VideoTag.FEATURED_VIDEO.videoTag;
        }
        aweme.detailPageVideoTag = i;
    }

    public static final void setEllipsizeDesc(Aweme aweme, CharSequence charSequence) {
        if (charSequence == null) {
            AwemeBizExtKt.setEllipsizeDesc(aweme, null);
        } else {
            AwemeBizExtKt.setEllipsizeDesc(aweme, new WeakReference(charSequence));
        }
    }

    public static final void setNewLiveRoomDataStr(Aweme aweme, String str) {
        if (!TextUtils.isEmpty(str)) {
            aweme.newLiveRoomData = (NewLiveRoomStruct) GsonProtectorUtils.fromJson(C09C2.LIZ(), str, NewLiveRoomStruct.class);
        }
    }

    public static final void setPb2AwemeMillis(Aweme aweme, long j) {
        Video video;
        Video video2 = aweme.video;
        if (video2 != null) {
            video2.setPb2AwemeMillis(j);
        }
        List<LongVideo> list = aweme.longVideos;
        if (list != null) {
            for (LongVideo longVideo : list) {
                if (longVideo != null && (video = longVideo.video) != null) {
                    video.setPb2AwemeMillis(j);
                }
            }
        }
    }

    public static final void setScenarioList(Aweme aweme, List<Scenario> list) {
        if (list != null && !list.isEmpty()) {
            if (aweme.contentModel == null) {
                aweme.contentModel = new ContentModel(null, null);
            }
            ContentModel contentModel = aweme.contentModel;
            if (contentModel.customBizInfo == null) {
                contentModel.setCustomBizInfo(new CustomBizInfo(null, null, null, null));
            }
            CustomBizInfo customBizInfo = aweme.contentModel.customBizInfo;
            if (customBizInfo != null) {
                customBizInfo.setScenarioList(list);
            }
        }
    }

    public static final void appendExtraParamUseInSearch(Aweme aweme, String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            if (AwemeBizExtKt.getSearchExtraParams(aweme) == null) {
                AwemeBizExtKt.setSearchExtraParams(aweme, new HashMap());
            }
            HashMap<String, String> searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme);
            if (searchExtraParams != null) {
                searchExtraParams.put(str, str2);
            }
        }
    }

    public static final void appendMobParam(Aweme aweme, String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            if (aweme.mMobParams == null) {
                aweme.mMobParams = new HashMap<>();
            }
            aweme.mMobParams.put(str, str2);
        }
    }

    public static final void putCustomPayload(Aweme aweme, String str, Object obj) {
        Map<String, Object> customPayloads;
        if (AwemeBizExtKt.getCustomPayloads(aweme) == null) {
            AwemeBizExtKt.setCustomPayloads(aweme, new ConcurrentHashMap(8));
        }
        if (str != null && obj != null && (customPayloads = AwemeBizExtKt.getCustomPayloads(aweme)) != null) {
            customPayloads.put(str, obj);
        }
    }
}
