package com.bytedance.android.livesdkapi.session;

import X.C09CT;
import X.C0ITV;
import X.C0IVQ;
import X.C13LP;
import X.C19EG;
import X.C466910ISr;
import X.C466980ISy;
import X.C466990ISz;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.settings.LiveSendShowEventOnSetupSetting;
import com.bytedance.android.livesdk.game.model.GameTagDetail;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.EnlargeViewInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.deeplink.DeepLinkData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.AwemeCommerceStructV2;
import webcast.api.feed.SpecialCard;
import webcast.data.AILivePreviewHighlight;

/* JADX INFO: loaded from: classes8.dex */
public final class EnterRoomConfig implements Parcelable {
    public AwemeCommerceStructV2 commerceInfo;
    public DrawParams drawParams;
    public ECWrapData mECData;
    public FeedCoverData mFeedCoverData;
    public boolean mFromScheme;
    public LogData mLogData;
    public RoomsData mRoomsData;
    public SearchWrapData mSearchData;
    public StreamData mStreamData;
    public StreamData mSubStreamData;
    public static final C466990ISz Companion = new Object() { // from class: X.0ISz
    };
    public static final Parcelable.Creator<EnterRoomConfig> CREATOR = new Parcelable.Creator<EnterRoomConfig>() { // from class: X.0ISt
        @Override // android.os.Parcelable.Creator
        public final EnterRoomConfig createFromParcel(Parcel parcel) {
            Parcelable.Creator<EnterRoomConfig.StreamData> creator = EnterRoomConfig.StreamData.CREATOR;
            return new EnterRoomConfig(creator.createFromParcel(parcel), creator.createFromParcel(parcel), EnterRoomConfig.LogData.CREATOR.createFromParcel(parcel), EnterRoomConfig.RoomsData.CREATOR.createFromParcel(parcel), EnterRoomConfig.SearchWrapData.CREATOR.createFromParcel(parcel), EnterRoomConfig.ECWrapData.CREATOR.createFromParcel(parcel), EnterRoomConfig.DrawParams.CREATOR.createFromParcel(parcel), (AwemeCommerceStructV2) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final EnterRoomConfig[] newArray(int i) {
            return new EnterRoomConfig[i];
        }
    };

    public static final class RoomsData implements Parcelable {
        public static final Parcelable.Creator<RoomsData> CREATOR = new Parcelable.Creator<RoomsData>() { // from class: X.0ISm
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.RoomsData createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                Integer numValueOf;
                boolean z5;
                AdLiveEnterRoomConfig adLiveEnterRoomConfigCreateFromParcel;
                boolean z6;
                Integer numValueOf2;
                boolean z7;
                boolean z8;
                boolean z9;
                boolean z10;
                Boolean boolValueOf;
                boolean z11;
                boolean z12;
                Integer numValueOf3;
                Integer numValueOf4;
                LinkedHashMap linkedHashMap2;
                LinkedHashMap linkedHashMap3;
                LinkedHashMap linkedHashMap4;
                EnterRoomConfig.SpecialCardWrapper specialCardWrapperCreateFromParcel;
                Integer numValueOf5;
                boolean z13;
                boolean z14;
                boolean z15;
                boolean z16;
                boolean z17;
                boolean z18;
                Boolean boolValueOf2;
                EnterRoomConfig.ConfigRoomExtraInfo configRoomExtraInfoCreateFromParcel;
                boolean z19;
                boolean z20;
                EnterRoomConfig.TimeStamp timeStampCreateFromParcel;
                boolean z21;
                boolean z22;
                boolean z23;
                boolean z24;
                boolean z25;
                boolean z26;
                Boolean boolValueOf3;
                boolean z27;
                boolean z28;
                boolean z29;
                boolean z30;
                boolean z31;
                EnterRoomConfig.GuestUser guestUserCreateFromParcel;
                boolean z32;
                boolean z33;
                Integer numValueOf6;
                Integer numValueOf7;
                boolean z34;
                boolean z35;
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                }
                String string = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap5.put(parcel.readString(), parcel.readString());
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                if (parcel.readInt() == 0) {
                    adLiveEnterRoomConfigCreateFromParcel = null;
                } else {
                    adLiveEnterRoomConfigCreateFromParcel = AdLiveEnterRoomConfig.CREATOR.createFromParcel(parcel);
                }
                AdLiveEnterRoomConfig adLiveEnterRoomConfig = adLiveEnterRoomConfigCreateFromParcel;
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (parcel.readInt() == 0) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                DeepLinkData deepLinkData = (DeepLinkData) parcel.readParcelable(EnterRoomConfig.RoomsData.class.getClassLoader());
                String string14 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (parcel.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int i5 = parcel.readInt();
                String string15 = parcel.readString();
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                String string16 = parcel.readString();
                long j = parcel.readLong();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolValueOf = Boolean.valueOf(z10);
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                String string24 = parcel.readString();
                int i8 = parcel.readInt();
                long j2 = parcel.readLong();
                String string25 = parcel.readString();
                String string26 = parcel.readString();
                String string27 = parcel.readString();
                String string28 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf3 = null;
                } else {
                    numValueOf3 = Integer.valueOf(parcel.readInt());
                }
                String string29 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf4 = null;
                } else {
                    numValueOf4 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = null;
                } else {
                    int i9 = parcel.readInt();
                    linkedHashMap2 = new LinkedHashMap(i9);
                    for (int i10 = 0; i10 != i9; i10++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap3 = null;
                } else {
                    int i11 = parcel.readInt();
                    linkedHashMap3 = new LinkedHashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashMap3.put(parcel.readString(), parcel.readString());
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap4 = null;
                } else {
                    int i13 = parcel.readInt();
                    linkedHashMap4 = new LinkedHashMap(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        linkedHashMap4.put(parcel.readString(), parcel.readString());
                    }
                }
                if (parcel.readInt() == 0) {
                    specialCardWrapperCreateFromParcel = null;
                } else {
                    specialCardWrapperCreateFromParcel = EnterRoomConfig.SpecialCardWrapper.CREATOR.createFromParcel(parcel);
                }
                EnterRoomConfig.SpecialCardWrapper specialCardWrapper = specialCardWrapperCreateFromParcel;
                if (parcel.readInt() == 0) {
                    numValueOf5 = null;
                } else {
                    numValueOf5 = Integer.valueOf(parcel.readInt());
                }
                String string30 = parcel.readString();
                String string31 = parcel.readString();
                int i15 = parcel.readInt();
                String string32 = parcel.readString();
                Rect rect = (Rect) parcel.readParcelable(EnterRoomConfig.RoomsData.class.getClassLoader());
                long[] jArrCreateLongArray = parcel.createLongArray();
                String string33 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (parcel.readInt() != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                String string34 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (parcel.readInt() != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                String string35 = parcel.readString();
                String string36 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolValueOf2 = Boolean.valueOf(z18);
                }
                if (parcel.readInt() == 0) {
                    configRoomExtraInfoCreateFromParcel = null;
                } else {
                    configRoomExtraInfoCreateFromParcel = EnterRoomConfig.ConfigRoomExtraInfo.CREATOR.createFromParcel(parcel);
                }
                EnterRoomConfig.ConfigRoomExtraInfo configRoomExtraInfo = configRoomExtraInfoCreateFromParcel;
                String string37 = parcel.readString();
                String string38 = parcel.readString();
                String string39 = parcel.readString();
                long j3 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                String string40 = parcel.readString();
                String string41 = parcel.readString();
                int i16 = parcel.readInt();
                String string42 = parcel.readString();
                String string43 = parcel.readString();
                long j4 = parcel.readLong();
                String string44 = parcel.readString();
                String string45 = parcel.readString();
                String string46 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                String string47 = parcel.readString();
                String string48 = parcel.readString();
                long j5 = parcel.readLong();
                if (parcel.readInt() == 0) {
                    timeStampCreateFromParcel = null;
                } else {
                    timeStampCreateFromParcel = EnterRoomConfig.TimeStamp.CREATOR.createFromParcel(parcel);
                }
                EnterRoomConfig.TimeStamp timeStamp = timeStampCreateFromParcel;
                if (parcel.readInt() != 0) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                String string49 = parcel.readString();
                long j6 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (parcel.readInt() != 0) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                if (parcel.readInt() != 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (parcel.readInt() != 0) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolValueOf3 = Boolean.valueOf(z26);
                }
                if (parcel.readInt() != 0) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if (parcel.readInt() != 0) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                long j7 = parcel.readLong();
                long j8 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                long j9 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z30 = true;
                } else {
                    z30 = false;
                }
                if (parcel.readInt() != 0) {
                    z31 = true;
                } else {
                    z31 = false;
                }
                String string50 = parcel.readString();
                if (parcel.readInt() == 0) {
                    guestUserCreateFromParcel = null;
                } else {
                    guestUserCreateFromParcel = EnterRoomConfig.GuestUser.CREATOR.createFromParcel(parcel);
                }
                EnterRoomConfig.GuestUser guestUser = guestUserCreateFromParcel;
                String string51 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z32 = true;
                } else {
                    z32 = false;
                }
                String string52 = parcel.readString();
                int i17 = parcel.readInt();
                String string53 = parcel.readString();
                String string54 = parcel.readString();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                String string55 = parcel.readString();
                String string56 = parcel.readString();
                String string57 = parcel.readString();
                int i20 = parcel.readInt();
                int i21 = parcel.readInt();
                long j10 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z33 = true;
                } else {
                    z33 = false;
                }
                if (parcel.readInt() == 0) {
                    numValueOf6 = null;
                } else {
                    numValueOf6 = Integer.valueOf(parcel.readInt());
                }
                long j11 = parcel.readLong();
                int i22 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    numValueOf7 = null;
                } else {
                    numValueOf7 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                if (parcel.readInt() != 0) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                return new EnterRoomConfig.RoomsData(linkedHashMap, null, string, linkedHashMap5, string2, string3, z, z2, string4, z3, z4, string5, numValueOf, string6, string7, z5, string8, string9, string10, adLiveEnterRoomConfig, z6, numValueOf2, z7, string11, string12, string13, deepLinkData, string14, z8, z9, i5, string15, i6, i7, string16, j, boolValueOf, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, string17, string18, z11, z12, string19, string20, string21, string22, string23, string24, i8, j2, string25, string26, string27, string28, numValueOf3, string29, numValueOf4, linkedHashMap2, linkedHashMap3, linkedHashMap4, specialCardWrapper, numValueOf5, string30, string31, i15, string32, rect, jArrCreateLongArray, string33, z13, z14, string34, z15, z16, string35, string36, z17, boolValueOf2, configRoomExtraInfo, string37, string38, string39, j3, z19, string40, string41, i16, string42, string43, j4, string44, string45, string46, z20, string47, string48, j5, timeStamp, z21, string49, j6, z22, z23, z24, z25, boolValueOf3, z27, z28, j7, j8, z29, j9, z30, z31, string50, guestUser, string51, z32, string52, i17, string53, string54, i18, i19, string55, string56, string57, i20, i21, j10, z33, numValueOf6, j11, i22, numValueOf7, z34, z35);
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.RoomsData[] newArray(int i) {
                return new EnterRoomConfig.RoomsData[i];
            }
        };
        public String actionType;
        public String actionTypeForMultiLive;
        public AdLiveEnterRoomConfig adLiveEnterRoomConfig;
        public String allSecondLabel;
        public long anchorGiftId;
        public int anchorPosition;
        public int anchorRelationType;
        public Integer autoOpenCommentBox;
        public long autoOpenCommentDelay;
        public String backPreRoomType;
        public long backRoomId;
        public String backRoomSource;
        public String backRouterSchema;
        public int backTabIndex;
        public String backUrl;
        public ArrayList<String> bgUrls;
        public long bottomLabelId;
        public long bottomSubLabelId;
        public String bubbleOwnerd;
        public String bubbleRoomId;
        public boolean clickAdsPinCard;
        public String clickedUserId;
        public CommerceStruct commerceStruct;
        public ConfigRoomExtraInfo configRoomExtraInfo;
        public boolean curIsMicRoom;
        public boolean curIsMicRoomFromOfficial;
        public int dataFlowType;
        public HashMap<Long, String> debugInfos;
        public String debugSurveyId;
        public String debugSurveyLan;
        public DeepLinkData deepLinkData;
        public Integer delayOpenMultiGuestApplyDialogTime;
        public Boolean disableBgPlaceHolder;
        public boolean disableDraw;
        public String drawerLiveType;
        public int drawerTabInnerFeedSuggest;
        public String dropsPageEntrance;
        public EnlargeViewInfo enlargeView;
        public String enterForJoinDirect;
        public String enterForMultiLive;
        public boolean enterFromAd;
        public String enterFromLiveSource;
        public String enterFromMerge;
        public String enterFromMergeRecommend;
        public boolean enterFromPreviewHighlightPlaying;
        public int enterLiveAlive;
        public String enterLiveSource;
        public String enterMethod;
        public String enterMethodSubtag;
        public Room enterRoomCache;
        public long enterRoomId;
        public int enterRoomOrientation;
        public String enterRoomScene;
        public String enterScene;
        public Rect enterSourcePosition;
        public String enterTag;
        public String enterType;
        public long enterUserId;
        public String explorePosition;
        public String extraDict;
        public String extraSchema;
        public String feedUrl;
        public long firstLabelId;
        public Map<String, String> firstRoomParamsMap;
        public String firstShowRankType;
        public String flareTaskId;
        public String followStatus;
        public boolean forceUseMultiListProvider;
        public String fragmentItemVPId;
        public boolean fromAutoJump;
        public boolean fromClickTopLive;
        public String fromDrawerStyle;
        public String fromDrawerTab;
        public boolean fromNewStyle;
        public long fromRoomId;
        public boolean fromSearchTrendingLive;
        public boolean fromShareDeepLink;
        public String fromShareUid;
        public Map<String, String> gameLiveExtra;
        public Map<String, String> gamePartnershipExtra;
        public GameTagDetail gameTagDetail;
        public ArrayList<String> gaussianBgUrls;
        public GuestUser guestUser;
        public String hangoutEnterSource;
        public Boolean hasCommerceGoods;
        public boolean hasEnterRoomBoostCacheInvalid;
        public boolean hasEnterRoomBoostDecided;
        public Boolean hasMoreExtra;
        public boolean hasTriggerBoostApi;
        public Long hashtagId;
        public String inflowKey;
        public boolean isBackPreRoom;
        public boolean isFresh;
        public int isFromBubble;
        public int isFromCache;
        public boolean isFromCoinBottomClick;
        public String isFromMgTopLive;
        public boolean isMixLive;
        public boolean isMixLiveHasMore;
        public boolean isPreFetchUserRoom;
        public long isRepostedExpect;
        public Integer isSecret;
        public boolean isShowBackRoom;
        public boolean isShowFlare;
        public long isSubOnlyLive;
        public boolean isSubscription;
        public Integer isWand;
        public int landingPage;
        public boolean liveReferralFromDmJump;
        public String liveReferralSchema;
        public MaskLayer maskLayer;
        public long maxTimeExtra;
        public String mentionMsgId;
        public String message;
        public String messageI18n;
        public Map<String, String> mgAISummaryExtra;
        public Map<String, String> mgCardLabelInfo;
        public Integer mgCoverStyle;
        public String mgCoverType;
        public Map<String, String> mgDistributionInfo;
        public int mgEnterType;
        public Map<String, String> mgExtraInfo;
        public long mgFromSourceUserId;
        public Integer mgRealtimeGuestCnt;
        public String multiAccountPushUid;
        public int multiGuestContinuousType;
        public int multiGuestMatchType;
        public String musicTabRank;
        public boolean needLandInteractFragment;
        public boolean needSetRoomOrientation;
        public String oceanReqInfo;
        public boolean openGiftPanel;
        public String openLiveFromDrawerTab;
        public String openOnboardingPage;
        public boolean openPaidEventPanel;
        public boolean openPropPanel;
        public boolean openSubscribePanel;
        public String openUrlLink;
        public int orientation;
        public boolean personalizedChanged;
        public int position;
        public boolean preCreateSurface;
        public boolean preIsMicRoom;
        public String preLoadRoomInfo;
        public int previewWatchTime;
        public Boolean previousRoomIsMicRoom;
        public String providerTag;
        public String randomMatchLinkPageEntrance;
        public Map<String, String> rechargeReminderPushList;
        public long recommendApiEndTimestamp;
        public Integer relationshipTag;
        public String relativeLiveTag;
        public long repostCnt;
        public String roomEventTrackingTag;
        public long roomId;
        public long[] roomIds;
        public String roomInfoList;
        public String roomLabels;
        public int roomPosition;
        public int roomProviderType;
        public String roomSourceFrom;
        public String sceneId;
        public String secUid;
        public long secondLabelId;
        public boolean sendSubscriptionCapsule;
        public String serverLogId;
        public String shareFromUserId;
        public String shareIntent;
        public String shareLiveTraceId;
        public String shareSource;
        public String sharedEnterFrom;
        public Integer sharedInviteeEnterSource;
        public boolean shouldAutoJoinMultiguest;
        public boolean shouldAutoNotifyMultiguest;
        public boolean shouldConsumeLiveReferralInNextRoom;
        public long smallPictureOrder;
        public String sourceType;
        public SpecialCardWrapper specialCard;
        public LiveMode streamType;
        public long subscribePreviewTime;
        public String tabType;
        public TimeStamp timeStamps;
        public boolean topLiveSkylightDataFromCache;
        public boolean topliveEnterRoomFromCache;
        public float translationRoomFragment;
        public int ttlsAutoOpenBag;
        public String ttlsBagAutoAnchorProductId;
        public String unReadIdExtra;
        public String unreadExtra;
        public String userId;
        public String warmUpPlayerTag;
        public WarningTag warningTag;
        public String wbcTag;
        public int widgetAnchorNum;
        public String widgetType;
        public String windowMode;
        public String xtBackRoom;

        public RoomsData(Map<String, String> map, Room room, String str, Map<String, String> map2, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, boolean z4, String str5, Integer num, String str6, String str7, boolean z5, String str8, String str9, String str10, AdLiveEnterRoomConfig adLiveEnterRoomConfig, boolean z6, Integer num2, boolean z7, String str11, String str12, String str13, DeepLinkData deepLinkData, String str14, boolean z8, boolean z9, int i, String str15, int i2, int i3, String str16, long j, Boolean bool, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str17, String str18, boolean z10, boolean z11, String str19, String str20, String str21, String str22, String str23, String str24, int i4, long j2, String str25, String str26, String str27, String str28, Integer num3, String str29, Integer num4, Map<String, String> map3, Map<String, String> map4, Map<String, String> map5, SpecialCardWrapper specialCardWrapper, Integer num5, String str30, String str31, int i5, String str32, Rect rect, long[] jArr, String str33, boolean z12, boolean z13, String str34, boolean z14, boolean z15, String str35, String str36, boolean z16, Boolean bool2, ConfigRoomExtraInfo configRoomExtraInfo, String str37, String str38, String str39, long j3, boolean z17, String str40, String str41, int i6, String str42, String str43, long j4, String str44, String str45, String str46, boolean z18, String str47, String str48, long j5, TimeStamp timeStamp, boolean z19, String str49, long j6, boolean z20, boolean z21, boolean z22, boolean z23, Boolean bool3, boolean z24, boolean z25, long j7, long j8, boolean z26, long j9, boolean z27, boolean z28, String str50, GuestUser guestUser, String str51, boolean z29, String str52, int i7, String str53, String str54, int i8, int i9, String str55, String str56, String str57, int i10, int i11, long j10, boolean z30, Integer num6, long j11, int i12, Integer num7, boolean z31, boolean z32) {
            this.firstRoomParamsMap = map;
            this.enterRoomCache = room;
            this.isFromMgTopLive = str;
            this.mgExtraInfo = map2;
            this.enterTag = str2;
            this.providerTag = str3;
            this.personalizedChanged = z;
            this.isPreFetchUserRoom = z2;
            this.secUid = str4;
            this.openPropPanel = z3;
            this.sendSubscriptionCapsule = z4;
            this.inflowKey = str5;
            this.delayOpenMultiGuestApplyDialogTime = num;
            this.extraDict = str6;
            this.openOnboardingPage = str7;
            this.openGiftPanel = z5;
            this.xtBackRoom = str8;
            this.messageI18n = str9;
            this.message = str10;
            this.adLiveEnterRoomConfig = adLiveEnterRoomConfig;
            this.enterFromAd = z6;
            this.isWand = num2;
            this.clickAdsPinCard = z7;
            this.enterForMultiLive = str11;
            this.actionTypeForMultiLive = str12;
            this.enterForJoinDirect = str13;
            this.deepLinkData = deepLinkData;
            this.liveReferralSchema = str14;
            this.shouldConsumeLiveReferralInNextRoom = z8;
            this.liveReferralFromDmJump = z9;
            this.orientation = i;
            this.sceneId = str15;
            this.backTabIndex = i2;
            this.landingPage = i3;
            this.unReadIdExtra = str16;
            this.maxTimeExtra = j;
            this.hasMoreExtra = bool;
            this.bgUrls = arrayList;
            this.gaussianBgUrls = arrayList2;
            this.roomLabels = str17;
            this.feedUrl = str18;
            this.isShowFlare = z10;
            this.topLiveSkylightDataFromCache = z11;
            this.flareTaskId = str19;
            this.userId = str20;
            this.clickedUserId = str21;
            this.wbcTag = str22;
            this.shareFromUserId = str23;
            this.shareIntent = str24;
            this.mgEnterType = i4;
            this.mgFromSourceUserId = j2;
            this.sharedEnterFrom = str25;
            this.randomMatchLinkPageEntrance = str26;
            this.shareLiveTraceId = str27;
            this.shareSource = str28;
            this.sharedInviteeEnterSource = num3;
            this.mgCoverType = str29;
            this.mgCoverStyle = num4;
            this.mgAISummaryExtra = map3;
            this.mgCardLabelInfo = map4;
            this.mgDistributionInfo = map5;
            this.specialCard = specialCardWrapper;
            this.mgRealtimeGuestCnt = num5;
            this.warmUpPlayerTag = str30;
            this.followStatus = str31;
            this.enterLiveAlive = i5;
            this.multiAccountPushUid = str32;
            this.enterSourcePosition = rect;
            this.roomIds = jArr;
            this.roomInfoList = str33;
            this.disableDraw = z12;
            this.forceUseMultiListProvider = z13;
            this.enterFromMerge = str34;
            this.enterFromPreviewHighlightPlaying = z14;
            this.isFromCoinBottomClick = z15;
            this.enterMethod = str35;
            this.enterMethodSubtag = str36;
            this.fromNewStyle = z16;
            this.disableBgPlaceHolder = bool2;
            this.configRoomExtraInfo = configRoomExtraInfo;
            this.relativeLiveTag = str37;
            this.fromDrawerStyle = str38;
            this.enterFromLiveSource = str39;
            this.roomId = j3;
            this.fromClickTopLive = z17;
            this.backUrl = str40;
            this.backRouterSchema = str41;
            this.position = i6;
            this.windowMode = str42;
            this.enterLiveSource = str43;
            this.fromRoomId = j4;
            this.enterFromMergeRecommend = str44;
            this.enterRoomScene = str45;
            this.roomSourceFrom = str46;
            this.topliveEnterRoomFromCache = z18;
            this.enterType = str47;
            this.sourceType = str48;
            this.smallPictureOrder = j5;
            this.timeStamps = timeStamp;
            this.isShowBackRoom = z19;
            this.enterScene = str49;
            this.backRoomId = j6;
            this.fromShareDeepLink = z20;
            this.fromAutoJump = z21;
            this.preIsMicRoom = z22;
            this.curIsMicRoom = z23;
            this.previousRoomIsMicRoom = bool3;
            this.shouldAutoJoinMultiguest = z24;
            this.shouldAutoNotifyMultiguest = z25;
            this.enterRoomId = j7;
            this.enterUserId = j8;
            this.openSubscribePanel = z26;
            this.subscribePreviewTime = j9;
            this.openPaidEventPanel = z27;
            this.curIsMicRoomFromOfficial = z28;
            this.fragmentItemVPId = str50;
            this.guestUser = guestUser;
            this.backRoomSource = str51;
            this.isBackPreRoom = z29;
            this.openLiveFromDrawerTab = str52;
            this.drawerTabInnerFeedSuggest = i7;
            this.extraSchema = str53;
            this.unreadExtra = str54;
            this.isFromBubble = i8;
            this.isFromCache = i9;
            this.bubbleRoomId = str55;
            this.bubbleOwnerd = str56;
            this.widgetType = str57;
            this.widgetAnchorNum = i10;
            this.anchorPosition = i11;
            this.isSubOnlyLive = j10;
            this.isSubscription = z30;
            this.autoOpenCommentBox = num6;
            this.autoOpenCommentDelay = j11;
            this.anchorRelationType = i12;
            this.relationshipTag = num7;
            this.isMixLive = z31;
            this.isMixLiveHasMore = z32;
            this.preLoadRoomInfo = "";
            this.previewWatchTime = -1;
            this.streamType = LiveMode.VIDEO;
            this.firstLabelId = -1L;
            this.secondLabelId = -1L;
            this.bottomLabelId = -1L;
            this.bottomSubLabelId = -1L;
            this.roomProviderType = -1;
            this.dataFlowType = -1;
            this.repostCnt = -1L;
            this.openUrlLink = "";
            this.hashtagId = 0L;
            this.enterRoomOrientation = 1;
            this.tabType = "";
            this.fromDrawerTab = "";
            this.drawerLiveType = "";
            this.roomPosition = -1;
            this.explorePosition = "";
            this.firstShowRankType = "";
            this.serverLogId = "";
            this.dropsPageEntrance = "";
            this.roomEventTrackingTag = "";
        }

        public RoomsData() {
            this(null, null, CardStruct.IStatusCode.DEFAULT, new LinkedHashMap(), null, null, false, false, null, false, false, null, null, null, null, false, null, null, null, null, false, null, false, null, null, null, null, null, false, false, 0, "", -1, -1, "", -1L, null, null, null, null, null, false, false, null, "", "", null, "", null, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, false, false, null, false, false, null, null, false, null, null, null, "", "", -1L, false, null, null, 0, "full_screen", "", 0L, null, "inner_draw", null, false, null, null, -1L, new TimeStamp(0L, 0L), false, null, 0L, false, false, false, false, null, false, false, 0L, 0L, false, -1L, false, false, null, new GuestUser(0L, null, 0, "", 0), null, false, "", 0, "", null, 0, 0, null, null, null, 0, 0, 0L, false, null, 0L, 0, null, false, false);
        }

        public static /* synthetic */ void getEnterRoomCache$annotations() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Map<String, String> map = this.firstRoomParamsMap;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeString(entry.getValue());
                }
            }
            parcel.writeString(this.isFromMgTopLive);
            Map<String, String> map2 = this.mgExtraInfo;
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
            parcel.writeString(this.enterTag);
            parcel.writeString(this.providerTag);
            parcel.writeInt(this.personalizedChanged ? 1 : 0);
            parcel.writeInt(this.isPreFetchUserRoom ? 1 : 0);
            parcel.writeString(this.secUid);
            parcel.writeInt(this.openPropPanel ? 1 : 0);
            parcel.writeInt(this.sendSubscriptionCapsule ? 1 : 0);
            parcel.writeString(this.inflowKey);
            Integer num = this.delayOpenMultiGuestApplyDialogTime;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.extraDict);
            parcel.writeString(this.openOnboardingPage);
            parcel.writeInt(this.openGiftPanel ? 1 : 0);
            parcel.writeString(this.xtBackRoom);
            parcel.writeString(this.messageI18n);
            parcel.writeString(this.message);
            AdLiveEnterRoomConfig adLiveEnterRoomConfig = this.adLiveEnterRoomConfig;
            if (adLiveEnterRoomConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                adLiveEnterRoomConfig.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.enterFromAd ? 1 : 0);
            Integer num2 = this.isWand;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeInt(this.clickAdsPinCard ? 1 : 0);
            parcel.writeString(this.enterForMultiLive);
            parcel.writeString(this.actionTypeForMultiLive);
            parcel.writeString(this.enterForJoinDirect);
            parcel.writeParcelable(this.deepLinkData, i);
            parcel.writeString(this.liveReferralSchema);
            parcel.writeInt(this.shouldConsumeLiveReferralInNextRoom ? 1 : 0);
            parcel.writeInt(this.liveReferralFromDmJump ? 1 : 0);
            parcel.writeInt(this.orientation);
            parcel.writeString(this.sceneId);
            parcel.writeInt(this.backTabIndex);
            parcel.writeInt(this.landingPage);
            parcel.writeString(this.unReadIdExtra);
            parcel.writeLong(this.maxTimeExtra);
            Boolean bool = this.hasMoreExtra;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            parcel.writeStringList(this.bgUrls);
            parcel.writeStringList(this.gaussianBgUrls);
            parcel.writeString(this.roomLabels);
            parcel.writeString(this.feedUrl);
            parcel.writeInt(this.isShowFlare ? 1 : 0);
            parcel.writeInt(this.topLiveSkylightDataFromCache ? 1 : 0);
            parcel.writeString(this.flareTaskId);
            parcel.writeString(this.userId);
            parcel.writeString(this.clickedUserId);
            parcel.writeString(this.wbcTag);
            parcel.writeString(this.shareFromUserId);
            parcel.writeString(this.shareIntent);
            parcel.writeInt(this.mgEnterType);
            parcel.writeLong(this.mgFromSourceUserId);
            parcel.writeString(this.sharedEnterFrom);
            parcel.writeString(this.randomMatchLinkPageEntrance);
            parcel.writeString(this.shareLiveTraceId);
            parcel.writeString(this.shareSource);
            Integer num3 = this.sharedInviteeEnterSource;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num3.intValue());
            }
            parcel.writeString(this.mgCoverType);
            Integer num4 = this.mgCoverStyle;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num4.intValue());
            }
            Map<String, String> map3 = this.mgAISummaryExtra;
            if (map3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map3.size());
                for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                    parcel.writeString(entry3.getKey());
                    parcel.writeString(entry3.getValue());
                }
            }
            Map<String, String> map4 = this.mgCardLabelInfo;
            if (map4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map4.size());
                for (Map.Entry<String, String> entry4 : map4.entrySet()) {
                    parcel.writeString(entry4.getKey());
                    parcel.writeString(entry4.getValue());
                }
            }
            Map<String, String> map5 = this.mgDistributionInfo;
            if (map5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map5.size());
                for (Map.Entry<String, String> entry5 : map5.entrySet()) {
                    parcel.writeString(entry5.getKey());
                    parcel.writeString(entry5.getValue());
                }
            }
            SpecialCardWrapper specialCardWrapper = this.specialCard;
            if (specialCardWrapper == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                specialCardWrapper.writeToParcel(parcel, i);
            }
            Integer num5 = this.mgRealtimeGuestCnt;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num5.intValue());
            }
            parcel.writeString(this.warmUpPlayerTag);
            parcel.writeString(this.followStatus);
            parcel.writeInt(this.enterLiveAlive);
            parcel.writeString(this.multiAccountPushUid);
            parcel.writeParcelable(this.enterSourcePosition, i);
            parcel.writeLongArray(this.roomIds);
            parcel.writeString(this.roomInfoList);
            parcel.writeInt(this.disableDraw ? 1 : 0);
            parcel.writeInt(this.forceUseMultiListProvider ? 1 : 0);
            parcel.writeString(this.enterFromMerge);
            parcel.writeInt(this.enterFromPreviewHighlightPlaying ? 1 : 0);
            parcel.writeInt(this.isFromCoinBottomClick ? 1 : 0);
            parcel.writeString(this.enterMethod);
            parcel.writeString(this.enterMethodSubtag);
            parcel.writeInt(this.fromNewStyle ? 1 : 0);
            Boolean bool2 = this.disableBgPlaceHolder;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            ConfigRoomExtraInfo configRoomExtraInfo = this.configRoomExtraInfo;
            if (configRoomExtraInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                configRoomExtraInfo.writeToParcel(parcel, i);
            }
            parcel.writeString(this.relativeLiveTag);
            parcel.writeString(this.fromDrawerStyle);
            parcel.writeString(this.enterFromLiveSource);
            parcel.writeLong(this.roomId);
            parcel.writeInt(this.fromClickTopLive ? 1 : 0);
            parcel.writeString(this.backUrl);
            parcel.writeString(this.backRouterSchema);
            parcel.writeInt(this.position);
            parcel.writeString(this.windowMode);
            parcel.writeString(this.enterLiveSource);
            parcel.writeLong(this.fromRoomId);
            parcel.writeString(this.enterFromMergeRecommend);
            parcel.writeString(this.enterRoomScene);
            parcel.writeString(this.roomSourceFrom);
            parcel.writeInt(this.topliveEnterRoomFromCache ? 1 : 0);
            parcel.writeString(this.enterType);
            parcel.writeString(this.sourceType);
            parcel.writeLong(this.smallPictureOrder);
            TimeStamp timeStamp = this.timeStamps;
            if (timeStamp == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                timeStamp.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.isShowBackRoom ? 1 : 0);
            parcel.writeString(this.enterScene);
            parcel.writeLong(this.backRoomId);
            parcel.writeInt(this.fromShareDeepLink ? 1 : 0);
            parcel.writeInt(this.fromAutoJump ? 1 : 0);
            parcel.writeInt(this.preIsMicRoom ? 1 : 0);
            parcel.writeInt(this.curIsMicRoom ? 1 : 0);
            Boolean bool3 = this.previousRoomIsMicRoom;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            parcel.writeInt(this.shouldAutoJoinMultiguest ? 1 : 0);
            parcel.writeInt(this.shouldAutoNotifyMultiguest ? 1 : 0);
            parcel.writeLong(this.enterRoomId);
            parcel.writeLong(this.enterUserId);
            parcel.writeInt(this.openSubscribePanel ? 1 : 0);
            parcel.writeLong(this.subscribePreviewTime);
            parcel.writeInt(this.openPaidEventPanel ? 1 : 0);
            parcel.writeInt(this.curIsMicRoomFromOfficial ? 1 : 0);
            parcel.writeString(this.fragmentItemVPId);
            GuestUser guestUser = this.guestUser;
            if (guestUser == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                guestUser.writeToParcel(parcel, i);
            }
            parcel.writeString(this.backRoomSource);
            parcel.writeInt(this.isBackPreRoom ? 1 : 0);
            parcel.writeString(this.openLiveFromDrawerTab);
            parcel.writeInt(this.drawerTabInnerFeedSuggest);
            parcel.writeString(this.extraSchema);
            parcel.writeString(this.unreadExtra);
            parcel.writeInt(this.isFromBubble);
            parcel.writeInt(this.isFromCache);
            parcel.writeString(this.bubbleRoomId);
            parcel.writeString(this.bubbleOwnerd);
            parcel.writeString(this.widgetType);
            parcel.writeInt(this.widgetAnchorNum);
            parcel.writeInt(this.anchorPosition);
            parcel.writeLong(this.isSubOnlyLive);
            parcel.writeInt(this.isSubscription ? 1 : 0);
            Integer num6 = this.autoOpenCommentBox;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num6.intValue());
            }
            parcel.writeLong(this.autoOpenCommentDelay);
            parcel.writeInt(this.anchorRelationType);
            Integer num7 = this.relationshipTag;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num7.intValue());
            }
            parcel.writeInt(this.isMixLive ? 1 : 0);
            parcel.writeInt(this.isMixLiveHasMore ? 1 : 0);
        }

        public final String getBackRouterSchema() {
            return this.backRouterSchema;
        }

        public final String getBackUrl() {
            return this.backUrl;
        }

        public final Room getEnterRoomCache() {
            return this.enterRoomCache;
        }

        public final boolean getHasEnterRoomBoostCacheInvalid() {
            return this.hasEnterRoomBoostCacheInvalid;
        }

        public final boolean getHasEnterRoomBoostDecided() {
            return this.hasEnterRoomBoostDecided;
        }

        public final boolean getHasTriggerBoostApi() {
            return this.hasTriggerBoostApi;
        }

        public final void setBackRouterSchema(String str) {
            this.backRouterSchema = str;
        }

        public final void setBackUrl(String str) {
            this.backUrl = str;
        }

        public final void setEnterRoomCache(Room room) {
            this.enterRoomCache = room;
        }

        public final void setHasEnterRoomBoostCacheInvalid(boolean z) {
            this.hasEnterRoomBoostCacheInvalid = z;
        }

        public final void setHasEnterRoomBoostDecided(boolean z) {
            this.hasEnterRoomBoostDecided = z;
        }

        public final void setHasTriggerBoostApi(boolean z) {
            this.hasTriggerBoostApi = z;
        }
    }

    public static final class DrawParams implements Parcelable {
        public static final Parcelable.Creator<DrawParams> CREATOR = new Parcelable.Creator<DrawParams>() { // from class: X.0ISq
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.DrawParams createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new EnterRoomConfig.DrawParams(z, z2, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.DrawParams[] newArray(int i) {
                return new EnterRoomConfig.DrawParams[i];
            }
        };
        public boolean openLiveFromDrawer;
        public boolean openLiveFromGameDrawer;
        public boolean openLiveFromSkylightDrawer;

        public DrawParams() {
            this(false, false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.openLiveFromDrawer ? 1 : 0);
            parcel.writeInt(this.openLiveFromGameDrawer ? 1 : 0);
            parcel.writeInt(this.openLiveFromSkylightDrawer ? 1 : 0);
        }

        public final DrawParams clone() {
            return new DrawParams(this.openLiveFromDrawer, this.openLiveFromGameDrawer, this.openLiveFromSkylightDrawer);
        }

        public DrawParams(boolean z, boolean z2, boolean z3) {
            this.openLiveFromDrawer = z;
            this.openLiveFromGameDrawer = z2;
            this.openLiveFromSkylightDrawer = z3;
        }
    }

    public static final class SearchWrapData implements Parcelable {
        public static final Parcelable.Creator<SearchWrapData> CREATOR = new Parcelable.Creator<SearchWrapData>() { // from class: X.0ISw
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.SearchWrapData createFromParcel(Parcel parcel) {
                return new EnterRoomConfig.SearchWrapData(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.SearchWrapData[] newArray(int i) {
                return new EnterRoomConfig.SearchWrapData[i];
            }
        };
        public boolean isFromSearch;
        public boolean isSearchHasMore;
        public String listProviderTag;
        public String uid;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.listProviderTag);
        }

        public SearchWrapData() {
            this("");
        }

        public SearchWrapData(String str) {
            this.listProviderTag = str;
        }
    }

    public static final class SpecialCardWrapper implements Parcelable {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("payload")
        public String payload;

        @C09CT("type")
        public int type;
        public static final C466910ISr Companion = new Object() { // from class: X.0ISr
        };
        public static final Parcelable.Creator<SpecialCardWrapper> CREATOR = new Parcelable.Creator<SpecialCardWrapper>() { // from class: X.0ISp
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.SpecialCardWrapper createFromParcel(Parcel parcel) {
                return new EnterRoomConfig.SpecialCardWrapper(parcel.readInt(), parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.SpecialCardWrapper[] newArray(int i) {
                return new EnterRoomConfig.SpecialCardWrapper[i];
            }
        };

        public SpecialCardWrapper() {
            this(0, 0L, "");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.type);
            parcel.writeLong(this.id);
            parcel.writeString(this.payload);
        }

        public final SpecialCard toSpecialCard() {
            SpecialCard specialCard = new SpecialCard();
            specialCard.type = this.type;
            specialCard.id = this.id;
            specialCard.payload = this.payload;
            return specialCard;
        }

        public static final SpecialCardWrapper fromSpecialCard(SpecialCard specialCard) {
            Companion.getClass();
            if (specialCard == null) {
                return null;
            }
            SpecialCardWrapper specialCardWrapper = new SpecialCardWrapper(0, 0L, "");
            specialCardWrapper.type = specialCard.type;
            specialCardWrapper.id = specialCard.id;
            specialCardWrapper.payload = specialCard.payload;
            return specialCardWrapper;
        }

        public SpecialCardWrapper(int i, long j, String str) {
            this.type = i;
            this.id = j;
            this.payload = str;
        }
    }

    public static final class TimeStamp implements Parcelable {
        public static final Parcelable.Creator<TimeStamp> CREATOR = new Parcelable.Creator<TimeStamp>() { // from class: X.0ISo
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.TimeStamp createFromParcel(Parcel parcel) {
                Long lValueOf;
                long j = parcel.readLong();
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new EnterRoomConfig.TimeStamp(j, lValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.TimeStamp[] newArray(int i) {
                return new EnterRoomConfig.TimeStamp[i];
            }
        };
        public Long enterRoomStarInnerTime;
        public long enterRoomStarTime;
        public long enterRoomStarTimeReal;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.enterRoomStarTime);
            Long l = this.enterRoomStarInnerTime;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
        }

        public TimeStamp() {
            this(0L, 0L);
        }

        public TimeStamp(long j, Long l) {
            this.enterRoomStarTime = j;
            this.enterRoomStarInnerTime = l;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.mStreamData.writeToParcel(parcel, i);
        this.mSubStreamData.writeToParcel(parcel, i);
        this.mLogData.writeToParcel(parcel, i);
        this.mRoomsData.writeToParcel(parcel, i);
        this.mSearchData.writeToParcel(parcel, i);
        this.mECData.writeToParcel(parcel, i);
        this.drawParams.writeToParcel(parcel, i);
        parcel.writeSerializable(this.commerceInfo);
    }

    public EnterRoomConfig() {
        this(new StreamData(null, 0L, 0, null, null, null, null, null, null, false, false, 0, -1, false, -1L, false, 0L, false, false), new StreamData(null, 0L, 0, null, null, null, null, null, null, false, false, 0, -1, false, -1L, false, 0L, false, false), new LogData(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, "", "", 0L, false, null, 0L, null, null, null, null, null, null, null, null, null, "", 0L, 0L, 0L, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, -1L, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, 0, false, -1, null, -1L, -1L, "-1", 3, null, null, null, null, null, 0, 0, -1L, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null), new RoomsData(null, null, CardStruct.IStatusCode.DEFAULT, new LinkedHashMap(), null, null, false, false, null, false, false, null, null, null, null, false, null, null, null, null, false, null, false, null, null, null, null, null, false, false, 0, "", -1, -1, "", -1L, null, null, null, null, null, false, false, null, "", "", null, "", null, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, false, false, null, false, false, null, null, false, null, null, null, "", "", -1L, false, null, null, 0, "full_screen", "", 0L, null, "inner_draw", null, false, null, null, -1L, new TimeStamp(0L, 0L), false, null, 0L, false, false, false, false, null, false, false, 0L, 0L, false, -1L, false, false, null, new GuestUser(0L, null, 0, "", 0), null, false, "", 0, "", null, 0, 0, null, null, null, 0, 0, 0L, false, null, 0L, 0, null, false, false), new SearchWrapData(""), new ECWrapData(0, 0, "", new HashMap(), false, 0, 0, null, null, null, "{}"), new DrawParams(false, false, false), null);
    }

    public final boolean isVariantCard() {
        SpecialCardWrapper specialCardWrapper = this.mRoomsData.specialCard;
        return (specialCardWrapper == null || specialCardWrapper.type == 0) ? false : true;
    }

    public final boolean sendLiveShowEventOnSetup() {
        if (TextUtils.equals(this.mRoomsData.enterType, "draw")) {
            return true;
        }
        RoomsData roomsData = this.mRoomsData;
        if (roomsData.isBackPreRoom) {
            return true;
        }
        if (Intrinsics.LJFF("live_merge", roomsData.enterFromMerge) && !Intrinsics.LJFF("live_cover", this.mRoomsData.enterMethod)) {
            return true;
        }
        if ((Intrinsics.LJFF("homepage_hot", this.mRoomsData.enterFromMerge) && Intrinsics.LJFF("bottom_banner", this.mRoomsData.enterMethod)) || Intrinsics.LJFF("nearby_tab_live_cover", this.mRoomsData.enterMethod) || Intrinsics.LJFF("nearby_module", this.mRoomsData.enterMethod)) {
            return true;
        }
        return C13LP.LJJJJ(this.mRoomsData.enterFromMerge, LiveSendShowEventOnSetupSetting.INSTANCE.getAllowedEnterFromMerge());
    }

    public static final class LogData implements Parcelable {
        public long aiSummaryBoardShow;
        public String anchorType;
        public Map<String, String> auctionLogMap;
        public Integer balanceLiveLine;
        public Integer balanceLivePosition;
        public String bottomLeftRoomLabel;
        public long cardRoomId;
        public String chatGroupId;
        public String chatGroupOwnerUid;
        public String chatGroupUserNum;
        public String chatId;
        public String chatMessageFromUid;
        public String chatMessageGuestInviteType;
        public String chatType;
        public String clickMethod;
        public String drawAction;
        public String endSourceActionType;
        public String endSourceEnterFromMerge;
        public String endSourceEnterMethod;
        public String endViewStatus;
        public String enterFrom;
        public String enterGiftPanelSource;
        public String enterLiveModule;
        public String enterLiveSquareSource;
        public String enterMgReason;
        public long enterRoomId;
        public String enterRoomViaPreviewGuide;
        public int followListOrder;
        public String follow_status;
        public boolean forcedLowLatency;
        public int fromEnd;
        public String fromFollowRelationShipTopliveGuide;
        public Boolean fromManualRefresh;
        public long fromPortalId;
        public long fromRoomId;
        public String fromTopliveGuide;
        public ArrayList<EnterRoomConfig> frontRoomConfig;
        public String gdLabel;
        public int giftEffectFinish;
        public int giftEffectStart;
        public String guestRequestId;
        public String innerDrawSortStatsClientFunc;
        public Map<String, String> innerDrawSortStatsTag;
        public Map<String, String> innerDrawSortStatsTagsForClientFun;
        public String innerPushType;
        public int interactType;
        public Boolean isAutoEnter;
        public Integer isConsumeNewUser;
        public String isDirectOpenApp;
        public Integer isFirstRecharge;
        public int isFromList;
        public Boolean isInRoomInfoList;
        public Integer isMaf;
        public Integer isNearby;
        public boolean isPreLiveAccessRecall;
        public boolean isVideoHead;
        public String landingTab;
        public long latencyEnterRoomInterval;
        public String list_item_id;
        public Map<String, String> liveAiSummaryParams;
        public String liveBgImageId;
        public String liveEndExit;
        public long liveEventId;
        public String livePlaySessionId;
        public int livePreviewCTAShown;
        public Integer livePreviewEnterEntrance;
        public long livePreviewShowInterval;
        public String liveReason;
        public String liveRecommendReason;
        public String liveRoomMode;
        public Map<String, String> liveRoomStatesTagMap;
        public String liveSortBy;
        public String liveTabSource;
        public long loadDuration;
        public String logId;
        public Map<String, String> logMap;
        public String logPb;
        public String logTopMessageType;
        public String magic3_activity_id;
        public String magic3_comptype;
        public String magic3_source;
        public ArrayList<EnterRoomConfig> moreConfig;
        public String openFromSchema;
        public boolean optSearchWarmUpDuration;
        public String originalUri;
        public long originatingRoomId;
        public Map<String, String> pcsDecorationLogParams;
        public String popType;
        public long portalClickStamp;
        public int positionOutsideLiveRoom;
        public String preBizSessionId;
        public String previewCardClickArea;
        public String previewCtrSessionId;
        public Boolean previewFollowedAnchor;
        public Map<String, String> previewPositionParams;
        public Boolean previewShowedFollowGuide;
        public long previewWatchDuration;
        public String pushStreamUrlStatus;
        public String recContentId;
        public String recContentType;
        public Integer rechargePackage;
        public String rechargeType;
        public String repostPairFollowStatus;
        public String requestId;
        public String requestPage;
        public String search_id;
        public String search_keyword;
        public String search_result_id;
        public String search_result_id_v2;
        public int search_result_type;
        public String search_token_type;
        public String search_type;
        public String shareFromUserId;
        public String sharePlatform;
        public String share_from;
        public String sharedInnerPushRecentRoomId;
        public String sharedPlatform;
        public Map<String, String> singleRoomLogMap;
        public Map<String, String> singleRoomLogMapV2;
        public Map<String, String> singleRoomLogMapWithSlide;
        public Map<String, String> smbLiveRoomLogMap;
        public String sourceBtmToken;
        public String sourceModule;
        public String storyEnterFrom;
        public String storyEnterPosition;
        public String subGameRank;
        public String superiorPageFrom;
        public String templateID;
        public String testRequestId;
        public int toggleStatus;
        public String topLeftRoomLabel;
        public String topLiveSource;
        public long topliveCacheDataDuration;
        public String topliveEnterTimestamp;
        public String topliveGuidanceType;
        public String topliveHomepageType;
        public String toplivePosition;
        public long userFrom;
        public String videoId;
        public String webId;
        public Integer webappLiveLine;
        public Integer webappLivePosition;
        public static final C0IVQ Companion = new Object() { // from class: X.0IVQ
        };
        public static final Parcelable.Creator<LogData> CREATOR = new Parcelable.Creator<LogData>() { // from class: X.0ISx
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.LogData createFromParcel(Parcel parcel) {
                Integer numValueOf;
                boolean z;
                Integer numValueOf2;
                ArrayList arrayList;
                ArrayList arrayList2;
                LinkedHashMap linkedHashMap;
                LinkedHashMap linkedHashMap2;
                LinkedHashMap linkedHashMap3;
                LinkedHashMap linkedHashMap4;
                LinkedHashMap linkedHashMap5;
                boolean z2;
                Integer numValueOf3;
                Integer numValueOf4;
                Integer numValueOf5;
                Integer numValueOf6;
                Integer numValueOf7;
                Integer numValueOf8;
                Integer numValueOf9;
                boolean z3;
                LinkedHashMap linkedHashMap6;
                LinkedHashMap linkedHashMap7;
                LinkedHashMap linkedHashMap8;
                LinkedHashMap linkedHashMap9;
                LinkedHashMap linkedHashMap10;
                boolean z4;
                boolean z5;
                Boolean boolValueOf;
                Integer numValueOf10;
                boolean z6;
                Boolean boolValueOf2;
                boolean z7;
                Boolean boolValueOf3;
                boolean z8;
                Boolean boolValueOf4;
                boolean z9;
                Boolean boolValueOf5;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(EnterRoomConfig.CREATOR.createFromParcel(parcel));
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i3 = parcel.readInt();
                    arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        arrayList2.add(EnterRoomConfig.CREATOR.createFromParcel(parcel));
                    }
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i5 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap2 = null;
                } else {
                    int i7 = parcel.readInt();
                    linkedHashMap2 = new LinkedHashMap(i7);
                    for (int i8 = 0; i8 != i7; i8++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap3 = null;
                } else {
                    int i9 = parcel.readInt();
                    linkedHashMap3 = new LinkedHashMap(i9);
                    for (int i10 = 0; i10 != i9; i10++) {
                        linkedHashMap3.put(parcel.readString(), parcel.readString());
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap4 = null;
                } else {
                    int i11 = parcel.readInt();
                    linkedHashMap4 = new LinkedHashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashMap4.put(parcel.readString(), parcel.readString());
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap5 = null;
                } else {
                    int i13 = parcel.readInt();
                    linkedHashMap5 = new LinkedHashMap(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        linkedHashMap5.put(parcel.readString(), parcel.readString());
                    }
                }
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf3 = null;
                } else {
                    numValueOf3 = Integer.valueOf(parcel.readInt());
                }
                String string13 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf4 = null;
                } else {
                    numValueOf4 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf5 = null;
                } else {
                    numValueOf5 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf6 = null;
                } else {
                    numValueOf6 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf7 = null;
                } else {
                    numValueOf7 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf8 = null;
                } else {
                    numValueOf8 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    numValueOf9 = null;
                } else {
                    numValueOf9 = Integer.valueOf(parcel.readInt());
                }
                String string14 = parcel.readString();
                long j = parcel.readLong();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                long j2 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String string18 = parcel.readString();
                long j3 = parcel.readLong();
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                String string22 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap6 = null;
                } else {
                    int i15 = parcel.readInt();
                    linkedHashMap6 = new LinkedHashMap(i15);
                    for (int i16 = 0; i16 != i15; i16++) {
                        linkedHashMap6.put(parcel.readString(), parcel.readString());
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap7 = null;
                } else {
                    int i17 = parcel.readInt();
                    linkedHashMap7 = new LinkedHashMap(i17);
                    for (int i18 = 0; i18 != i17; i18++) {
                        linkedHashMap7.put(parcel.readString(), parcel.readString());
                    }
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap8 = null;
                } else {
                    int i19 = parcel.readInt();
                    linkedHashMap8 = new LinkedHashMap(i19);
                    for (int i20 = 0; i20 != i19; i20++) {
                        linkedHashMap8.put(parcel.readString(), parcel.readString());
                    }
                }
                String string23 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap9 = null;
                } else {
                    int i21 = parcel.readInt();
                    linkedHashMap9 = new LinkedHashMap(i21);
                    for (int i22 = 0; i22 != i21; i22++) {
                        linkedHashMap9.put(parcel.readString(), parcel.readString());
                    }
                }
                String string24 = parcel.readString();
                long j4 = parcel.readLong();
                long j5 = parcel.readLong();
                long j6 = parcel.readLong();
                String string25 = parcel.readString();
                String string26 = parcel.readString();
                String string27 = parcel.readString();
                String string28 = parcel.readString();
                String string29 = parcel.readString();
                int i23 = parcel.readInt();
                String string30 = parcel.readString();
                String string31 = parcel.readString();
                String string32 = parcel.readString();
                String string33 = parcel.readString();
                String string34 = parcel.readString();
                String string35 = parcel.readString();
                String string36 = parcel.readString();
                String string37 = parcel.readString();
                long j7 = parcel.readLong();
                String string38 = parcel.readString();
                String string39 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap10 = null;
                } else {
                    int i24 = parcel.readInt();
                    linkedHashMap10 = new LinkedHashMap(i24);
                    for (int i25 = 0; i25 != i24; i25++) {
                        linkedHashMap10.put(parcel.readString(), parcel.readString());
                    }
                }
                String string40 = parcel.readString();
                String string41 = parcel.readString();
                String string42 = parcel.readString();
                String string43 = parcel.readString();
                String string44 = parcel.readString();
                int i26 = parcel.readInt();
                String string45 = parcel.readString();
                String string46 = parcel.readString();
                String string47 = parcel.readString();
                String string48 = parcel.readString();
                String string49 = parcel.readString();
                String string50 = parcel.readString();
                int i27 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int i28 = parcel.readInt();
                String string51 = parcel.readString();
                long j8 = parcel.readLong();
                long j9 = parcel.readLong();
                String string52 = parcel.readString();
                int i29 = parcel.readInt();
                String string53 = parcel.readString();
                String string54 = parcel.readString();
                String string55 = parcel.readString();
                String string56 = parcel.readString();
                String string57 = parcel.readString();
                int i30 = parcel.readInt();
                int i31 = parcel.readInt();
                long j10 = parcel.readLong();
                int i32 = parcel.readInt();
                int i33 = parcel.readInt();
                String string58 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolValueOf = Boolean.valueOf(z5);
                }
                String string59 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf10 = null;
                } else {
                    numValueOf10 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolValueOf2 = Boolean.valueOf(z6);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf3 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolValueOf3 = Boolean.valueOf(z7);
                }
                String string60 = parcel.readString();
                String string61 = parcel.readString();
                String string62 = parcel.readString();
                String string63 = parcel.readString();
                String string64 = parcel.readString();
                String string65 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf4 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolValueOf4 = Boolean.valueOf(z8);
                }
                if (parcel.readInt() == 0) {
                    boolValueOf5 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolValueOf5 = Boolean.valueOf(z9);
                }
                return new EnterRoomConfig.LogData(numValueOf, z, numValueOf2, arrayList, arrayList2, string, string2, string3, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, string4, string5, string6, string7, z2, string8, string9, string10, string11, string12, numValueOf3, string13, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, string14, j, string15, string16, string17, j2, z3, string18, j3, string19, string20, string21, string22, linkedHashMap6, linkedHashMap7, linkedHashMap8, string23, linkedHashMap9, string24, j4, j5, j6, string25, string26, string27, string28, string29, i23, string30, string31, string32, string33, string34, string35, string36, string37, j7, string38, string39, linkedHashMap10, string40, string41, string42, string43, string44, i26, string45, string46, string47, string48, string49, string50, i27, z4, i28, string51, j8, j9, string52, i29, string53, string54, string55, string56, string57, i30, i31, j10, i32, i33, string58, boolValueOf, string59, numValueOf10, boolValueOf2, boolValueOf3, string60, string61, string62, string63, string64, string65, boolValueOf4, boolValueOf5);
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.LogData[] newArray(int i) {
                return new EnterRoomConfig.LogData[i];
            }
        };

        public LogData() {
            this(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, null, "", "", 0L, false, null, 0L, null, null, null, null, null, null, null, null, null, "", 0L, 0L, 0L, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, -1L, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, 0, false, -1, null, -1L, -1L, "-1", 3, null, null, null, null, null, 0, 0, -1L, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Integer num = this.isNearby;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeInt(this.optSearchWarmUpDuration ? 1 : 0);
            Integer num2 = this.isMaf;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            ArrayList<EnterRoomConfig> arrayList = this.moreConfig;
            if (arrayList == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(arrayList.size());
                Iterator<EnterRoomConfig> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
            ArrayList<EnterRoomConfig> arrayList2 = this.frontRoomConfig;
            if (arrayList2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(arrayList2.size());
                Iterator<EnterRoomConfig> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(parcel, i);
                }
            }
            parcel.writeString(this.landingTab);
            parcel.writeString(this.liveTabSource);
            parcel.writeString(this.topLiveSource);
            Map<String, String> map = this.logMap;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    parcel.writeString(entry.getValue());
                }
            }
            Map<String, String> map2 = this.singleRoomLogMap;
            if (map2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map2.size());
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    parcel.writeString(entry2.getKey());
                    parcel.writeString(entry2.getValue());
                }
            }
            Map<String, String> map3 = this.singleRoomLogMapV2;
            if (map3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map3.size());
                for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                    parcel.writeString(entry3.getKey());
                    parcel.writeString(entry3.getValue());
                }
            }
            Map<String, String> map4 = this.singleRoomLogMapWithSlide;
            if (map4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map4.size());
                for (Map.Entry<String, String> entry4 : map4.entrySet()) {
                    parcel.writeString(entry4.getKey());
                    parcel.writeString(entry4.getValue());
                }
            }
            Map<String, String> map5 = this.auctionLogMap;
            if (map5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map5.size());
                for (Map.Entry<String, String> entry5 : map5.entrySet()) {
                    parcel.writeString(entry5.getKey());
                    parcel.writeString(entry5.getValue());
                }
            }
            parcel.writeString(this.enterGiftPanelSource);
            parcel.writeString(this.enterLiveSquareSource);
            parcel.writeString(this.requestId);
            parcel.writeString(this.logId);
            parcel.writeInt(this.forcedLowLatency ? 1 : 0);
            parcel.writeString(this.testRequestId);
            parcel.writeString(this.guestRequestId);
            parcel.writeString(this.liveBgImageId);
            parcel.writeString(this.clickMethod);
            parcel.writeString(this.videoId);
            Integer num3 = this.isFirstRecharge;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num3.intValue());
            }
            parcel.writeString(this.rechargeType);
            Integer num4 = this.rechargePackage;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num4.intValue());
            }
            Integer num5 = this.balanceLiveLine;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num5.intValue());
            }
            Integer num6 = this.isConsumeNewUser;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num6.intValue());
            }
            Integer num7 = this.balanceLivePosition;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num7.intValue());
            }
            Integer num8 = this.webappLiveLine;
            if (num8 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num8.intValue());
            }
            Integer num9 = this.webappLivePosition;
            if (num9 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num9.intValue());
            }
            parcel.writeString(this.liveReason);
            parcel.writeLong(this.aiSummaryBoardShow);
            parcel.writeString(this.logPb);
            parcel.writeString(this.requestPage);
            parcel.writeString(this.anchorType);
            parcel.writeLong(this.userFrom);
            parcel.writeInt(this.isVideoHead ? 1 : 0);
            parcel.writeString(this.enterLiveModule);
            parcel.writeLong(this.enterRoomId);
            parcel.writeString(this.superiorPageFrom);
            parcel.writeString(this.logTopMessageType);
            parcel.writeString(this.innerPushType);
            parcel.writeString(this.gdLabel);
            Map<String, String> map6 = this.liveRoomStatesTagMap;
            if (map6 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map6.size());
                for (Map.Entry<String, String> entry6 : map6.entrySet()) {
                    parcel.writeString(entry6.getKey());
                    parcel.writeString(entry6.getValue());
                }
            }
            Map<String, String> map7 = this.smbLiveRoomLogMap;
            if (map7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map7.size());
                for (Map.Entry<String, String> entry7 : map7.entrySet()) {
                    parcel.writeString(entry7.getKey());
                    parcel.writeString(entry7.getValue());
                }
            }
            Map<String, String> map8 = this.innerDrawSortStatsTag;
            if (map8 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map8.size());
                for (Map.Entry<String, String> entry8 : map8.entrySet()) {
                    parcel.writeString(entry8.getKey());
                    parcel.writeString(entry8.getValue());
                }
            }
            parcel.writeString(this.innerDrawSortStatsClientFunc);
            Map<String, String> map9 = this.innerDrawSortStatsTagsForClientFun;
            if (map9 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map9.size());
                for (Map.Entry<String, String> entry9 : map9.entrySet()) {
                    parcel.writeString(entry9.getKey());
                    parcel.writeString(entry9.getValue());
                }
            }
            parcel.writeString(this.popType);
            parcel.writeLong(this.fromPortalId);
            parcel.writeLong(this.originatingRoomId);
            parcel.writeLong(this.loadDuration);
            parcel.writeString(this.search_id);
            parcel.writeString(this.search_keyword);
            parcel.writeString(this.search_result_id);
            parcel.writeString(this.search_token_type);
            parcel.writeString(this.search_result_id_v2);
            parcel.writeInt(this.search_result_type);
            parcel.writeString(this.search_type);
            parcel.writeString(this.list_item_id);
            parcel.writeString(this.follow_status);
            parcel.writeString(this.share_from);
            parcel.writeString(this.toplivePosition);
            parcel.writeString(this.topliveEnterTimestamp);
            parcel.writeString(this.fromTopliveGuide);
            parcel.writeString(this.topliveGuidanceType);
            parcel.writeLong(this.topliveCacheDataDuration);
            parcel.writeString(this.fromFollowRelationShipTopliveGuide);
            parcel.writeString(this.topliveHomepageType);
            Map<String, String> map10 = this.previewPositionParams;
            if (map10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map10.size());
                for (Map.Entry<String, String> entry10 : map10.entrySet()) {
                    parcel.writeString(entry10.getKey());
                    parcel.writeString(entry10.getValue());
                }
            }
            parcel.writeString(this.magic3_source);
            parcel.writeString(this.magic3_activity_id);
            parcel.writeString(this.magic3_comptype);
            parcel.writeString(this.topLeftRoomLabel);
            parcel.writeString(this.bottomLeftRoomLabel);
            parcel.writeInt(this.fromEnd);
            parcel.writeString(this.endSourceEnterFromMerge);
            parcel.writeString(this.endSourceEnterMethod);
            parcel.writeString(this.endSourceActionType);
            parcel.writeString(this.endViewStatus);
            parcel.writeString(this.liveEndExit);
            parcel.writeString(this.liveRecommendReason);
            parcel.writeInt(this.isFromList);
            parcel.writeInt(this.isPreLiveAccessRecall ? 1 : 0);
            parcel.writeInt(this.positionOutsideLiveRoom);
            parcel.writeString(this.previewCardClickArea);
            parcel.writeLong(this.cardRoomId);
            parcel.writeLong(this.fromRoomId);
            parcel.writeString(this.drawAction);
            parcel.writeInt(this.toggleStatus);
            parcel.writeString(this.enterRoomViaPreviewGuide);
            parcel.writeString(this.subGameRank);
            parcel.writeString(this.sharedPlatform);
            parcel.writeString(this.sourceModule);
            parcel.writeString(this.liveSortBy);
            parcel.writeInt(this.giftEffectStart);
            parcel.writeInt(this.livePreviewCTAShown);
            parcel.writeLong(this.livePreviewShowInterval);
            parcel.writeInt(this.giftEffectFinish);
            parcel.writeInt(this.followListOrder);
            parcel.writeString(this.pushStreamUrlStatus);
            Boolean bool = this.isAutoEnter;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.chatGroupId);
            Integer num10 = this.livePreviewEnterEntrance;
            if (num10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num10.intValue());
            }
            Boolean bool2 = this.previewShowedFollowGuide;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.previewFollowedAnchor;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.chatGroupOwnerUid);
            parcel.writeString(this.chatGroupUserNum);
            parcel.writeString(this.chatMessageFromUid);
            parcel.writeString(this.chatMessageGuestInviteType);
            parcel.writeString(this.chatId);
            parcel.writeString(this.chatType);
            Boolean bool4 = this.fromManualRefresh;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool4.booleanValue() ? 1 : 0);
            }
            Boolean bool5 = this.isInRoomInfoList;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool5.booleanValue() ? 1 : 0);
            }
        }

        public final Map<String, String> getInnerDrawSortStatsTagsForClientFun() {
            return this.innerDrawSortStatsTagsForClientFun;
        }

        public final void setInnerDrawSortStatsTagsForClientFun(Map<String, String> map) {
            this.innerDrawSortStatsTagsForClientFun = map;
        }

        public LogData(Integer num, boolean z, Integer num2, ArrayList<EnterRoomConfig> arrayList, ArrayList<EnterRoomConfig> arrayList2, String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, Map<String, String> map5, String str4, String str5, String str6, String str7, boolean z2, String str8, String str9, String str10, String str11, String str12, Integer num3, String str13, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str14, long j, String str15, String str16, String str17, long j2, boolean z3, String str18, long j3, String str19, String str20, String str21, String str22, Map<String, String> map6, Map<String, String> map7, Map<String, String> map8, String str23, Map<String, String> map9, String str24, long j4, long j5, long j6, String str25, String str26, String str27, String str28, String str29, int i, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, long j7, String str38, String str39, Map<String, String> map10, String str40, String str41, String str42, String str43, String str44, int i2, String str45, String str46, String str47, String str48, String str49, String str50, int i3, boolean z4, int i4, String str51, long j8, long j9, String str52, int i5, String str53, String str54, String str55, String str56, String str57, int i6, int i7, long j10, int i8, int i9, String str58, Boolean bool, String str59, Integer num10, Boolean bool2, Boolean bool3, String str60, String str61, String str62, String str63, String str64, String str65, Boolean bool4, Boolean bool5) {
            this.isNearby = num;
            this.optSearchWarmUpDuration = z;
            this.isMaf = num2;
            this.moreConfig = arrayList;
            this.frontRoomConfig = arrayList2;
            this.landingTab = str;
            this.liveTabSource = str2;
            this.topLiveSource = str3;
            this.logMap = map;
            this.singleRoomLogMap = map2;
            this.singleRoomLogMapV2 = map3;
            this.singleRoomLogMapWithSlide = map4;
            this.auctionLogMap = map5;
            this.enterGiftPanelSource = str4;
            this.enterLiveSquareSource = str5;
            this.requestId = str6;
            this.logId = str7;
            this.forcedLowLatency = z2;
            this.testRequestId = str8;
            this.guestRequestId = str9;
            this.liveBgImageId = str10;
            this.clickMethod = str11;
            this.videoId = str12;
            this.isFirstRecharge = num3;
            this.rechargeType = str13;
            this.rechargePackage = num4;
            this.balanceLiveLine = num5;
            this.isConsumeNewUser = num6;
            this.balanceLivePosition = num7;
            this.webappLiveLine = num8;
            this.webappLivePosition = num9;
            this.liveReason = str14;
            this.aiSummaryBoardShow = j;
            this.logPb = str15;
            this.requestPage = str16;
            this.anchorType = str17;
            this.userFrom = j2;
            this.isVideoHead = z3;
            this.enterLiveModule = str18;
            this.enterRoomId = j3;
            this.superiorPageFrom = str19;
            this.logTopMessageType = str20;
            this.innerPushType = str21;
            this.gdLabel = str22;
            this.liveRoomStatesTagMap = map6;
            this.smbLiveRoomLogMap = map7;
            this.innerDrawSortStatsTag = map8;
            this.innerDrawSortStatsClientFunc = str23;
            this.innerDrawSortStatsTagsForClientFun = map9;
            this.popType = str24;
            this.fromPortalId = j4;
            this.originatingRoomId = j5;
            this.loadDuration = j6;
            this.search_id = str25;
            this.search_keyword = str26;
            this.search_result_id = str27;
            this.search_token_type = str28;
            this.search_result_id_v2 = str29;
            this.search_result_type = i;
            this.search_type = str30;
            this.list_item_id = str31;
            this.follow_status = str32;
            this.share_from = str33;
            this.toplivePosition = str34;
            this.topliveEnterTimestamp = str35;
            this.fromTopliveGuide = str36;
            this.topliveGuidanceType = str37;
            this.topliveCacheDataDuration = j7;
            this.fromFollowRelationShipTopliveGuide = str38;
            this.topliveHomepageType = str39;
            this.previewPositionParams = map10;
            this.magic3_source = str40;
            this.magic3_activity_id = str41;
            this.magic3_comptype = str42;
            this.topLeftRoomLabel = str43;
            this.bottomLeftRoomLabel = str44;
            this.fromEnd = i2;
            this.endSourceEnterFromMerge = str45;
            this.endSourceEnterMethod = str46;
            this.endSourceActionType = str47;
            this.endViewStatus = str48;
            this.liveEndExit = str49;
            this.liveRecommendReason = str50;
            this.isFromList = i3;
            this.isPreLiveAccessRecall = z4;
            this.positionOutsideLiveRoom = i4;
            this.previewCardClickArea = str51;
            this.cardRoomId = j8;
            this.fromRoomId = j9;
            this.drawAction = str52;
            this.toggleStatus = i5;
            this.enterRoomViaPreviewGuide = str53;
            this.subGameRank = str54;
            this.sharedPlatform = str55;
            this.sourceModule = str56;
            this.liveSortBy = str57;
            this.giftEffectStart = i6;
            this.livePreviewCTAShown = i7;
            this.livePreviewShowInterval = j10;
            this.giftEffectFinish = i8;
            this.followListOrder = i9;
            this.pushStreamUrlStatus = str58;
            this.isAutoEnter = bool;
            this.chatGroupId = str59;
            this.livePreviewEnterEntrance = num10;
            this.previewShowedFollowGuide = bool2;
            this.previewFollowedAnchor = bool3;
            this.chatGroupOwnerUid = str60;
            this.chatGroupUserNum = str61;
            this.chatMessageFromUid = str62;
            this.chatMessageGuestInviteType = str63;
            this.chatId = str64;
            this.chatType = str65;
            this.fromManualRefresh = bool4;
            this.isInRoomInfoList = bool5;
            this.livePlaySessionId = "";
            this.preBizSessionId = "";
            this.templateID = "";
        }
    }

    public static final class ConfigRoomExtraInfo implements Parcelable {
        public static final Parcelable.Creator<ConfigRoomExtraInfo> CREATOR = new Parcelable.Creator<ConfigRoomExtraInfo>() { // from class: X.0IT0
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.ConfigRoomExtraInfo createFromParcel(Parcel parcel) {
                Long lValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new EnterRoomConfig.ConfigRoomExtraInfo(string, string2, arrayListCreateStringArrayList, string3, string4, lValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.ConfigRoomExtraInfo[] newArray(int i) {
                return new EnterRoomConfig.ConfigRoomExtraInfo[i];
            }
        };
        public AILivePreviewHighlight aiLiveHighlight;
        public String avatarThumbUri;
        public List<String> avatarThumbUrls;
        public Long followStatus;
        public String nickName;
        public String roomTitle;
        public String username;

        public ConfigRoomExtraInfo() {
            this(null, null, null, null, null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.nickName);
            parcel.writeString(this.username);
            parcel.writeStringList(this.avatarThumbUrls);
            parcel.writeString(this.avatarThumbUri);
            parcel.writeString(this.roomTitle);
            Long l = this.followStatus;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
        }

        public final void appendToRoom(Room room) {
            User owner;
            User owner2;
            FollowInfo followInfo;
            User owner3 = room.getOwner();
            if (owner3 != null) {
                owner3.setNickName(this.nickName);
            }
            User owner4 = room.getOwner();
            if (owner4 != null) {
                owner4.setDisplayId(this.username);
            }
            User owner5 = room.getOwner();
            if ((owner5 == null || owner5.getAvatarThumb() == null) && (owner = room.getOwner()) != null) {
                owner.setAvatarThumb(new ImageModel(this.avatarThumbUri, this.avatarThumbUrls));
            }
            String title = room.getTitle();
            if (title == null || title.length() == 0) {
                room.setTitle(this.roomTitle);
            }
            if (room.aiLivePreviewHighlight == null) {
                room.aiLivePreviewHighlight = this.aiLiveHighlight;
            }
            Long l = this.followStatus;
            if (l != null) {
                long jLongValue = l.longValue();
                User owner6 = room.getOwner();
                if ((owner6 == null || owner6.getFollowInfo() == null) && (owner2 = room.getOwner()) != null) {
                    owner2.setFollowInfo(new FollowInfo());
                }
                User owner7 = room.getOwner();
                if (owner7 != null && (followInfo = owner7.getFollowInfo()) != null) {
                    followInfo.setFollowStatus(jLongValue);
                }
            }
        }

        public ConfigRoomExtraInfo(String str, String str2, List<String> list, String str3, String str4, Long l) {
            this.nickName = str;
            this.username = str2;
            this.avatarThumbUrls = list;
            this.avatarThumbUri = str3;
            this.roomTitle = str4;
            this.followStatus = l;
        }
    }

    private final C19EG asActivity(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return asActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void updateGdLabel(Context context) {
        Intent intent;
        String strINVOKEVIRTUAL_com_bytedance_android_livesdkapi_session_EnterRoomConfig_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        C19EG c19egAsActivity = asActivity(context);
        if (c19egAsActivity != null && (intent = c19egAsActivity.getIntent()) != null && (strINVOKEVIRTUAL_com_bytedance_android_livesdkapi_session_EnterRoomConfig_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_bytedance_android_livesdkapi_session_EnterRoomConfig_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "gd_label")) != null && strINVOKEVIRTUAL_com_bytedance_android_livesdkapi_session_EnterRoomConfig_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra.length() > 0) {
            this.mLogData.gdLabel = strINVOKEVIRTUAL_com_bytedance_android_livesdkapi_session_EnterRoomConfig_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra;
        }
    }

    public static final class FeedCoverData implements Parcelable {
        public static final Parcelable.Creator<FeedCoverData> CREATOR = new Parcelable.Creator<FeedCoverData>() { // from class: X.0ISs
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.FeedCoverData createFromParcel(Parcel parcel) {
                boolean z;
                Integer numValueOf;
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                float f = parcel.readFloat();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                EnterRoomConfig.FeedCoverData.PlayerInfo playerInfoCreateFromParcel = EnterRoomConfig.FeedCoverData.PlayerInfo.CREATOR.createFromParcel(parcel);
                Pair pair = (Pair) parcel.readSerializable();
                Integer numValueOf2 = null;
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() != 0) {
                    numValueOf2 = Integer.valueOf(parcel.readInt());
                }
                return new EnterRoomConfig.FeedCoverData(z, z2, i, i2, i3, i4, f, arrayListCreateStringArrayList, playerInfoCreateFromParcel, pair, numValueOf, numValueOf2, (Rect) parcel.readParcelable(EnterRoomConfig.FeedCoverData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.FeedCoverData[] newArray(int i) {
                return new EnterRoomConfig.FeedCoverData[i];
            }
        };
        public boolean enterPreviewSmooth;
        public boolean enterPreviewSmoothWithFirstFrame;
        public float gameCurrentRatio;
        public int immersiveMarginTop;
        public int navigationBarHeight;
        public Pair<Integer, Integer> playerContainerSize;
        public PlayerInfo playerInfo;
        public PreviewLayoutHandoff previewLayoutHandoff;
        public int screenHeight;
        public Integer smoothEnterContainerGravity;
        public Integer smoothEnterStreamGravity;
        public Rect smoothEnterStreamMargin;
        public int statusBarHeight;
        public List<String> urlList;

        public FeedCoverData() {
            this(false, false, 0, 0, 0, 0, 0.0f, null, new PlayerInfo(null, new Rect()), null, null, null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.enterPreviewSmooth ? 1 : 0);
            parcel.writeInt(this.enterPreviewSmoothWithFirstFrame ? 1 : 0);
            parcel.writeInt(this.immersiveMarginTop);
            parcel.writeInt(this.statusBarHeight);
            parcel.writeInt(this.navigationBarHeight);
            parcel.writeInt(this.screenHeight);
            parcel.writeFloat(this.gameCurrentRatio);
            parcel.writeStringList(this.urlList);
            this.playerInfo.writeToParcel(parcel, i);
            parcel.writeSerializable(this.playerContainerSize);
            Integer num = this.smoothEnterStreamGravity;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.smoothEnterContainerGravity;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeParcelable(this.smoothEnterStreamMargin, i);
        }

        public static final class PlayerInfo implements Parcelable {
            public static final Parcelable.Creator<PlayerInfo> CREATOR = new Parcelable.Creator<PlayerInfo>() { // from class: X.0ISv
                @Override // android.os.Parcelable.Creator
                public final EnterRoomConfig.FeedCoverData.PlayerInfo createFromParcel(Parcel parcel) {
                    return new EnterRoomConfig.FeedCoverData.PlayerInfo(parcel.readString(), (Rect) parcel.readParcelable(EnterRoomConfig.FeedCoverData.PlayerInfo.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final EnterRoomConfig.FeedCoverData.PlayerInfo[] newArray(int i) {
                    return new EnterRoomConfig.FeedCoverData.PlayerInfo[i];
                }
            };
            public Rect playerActualRange;
            public Pair<Integer, Integer> playerSize;
            public Pair<Integer, Integer> playerViewSize;
            public String sei;

            public PlayerInfo() {
                this(null, new Rect());
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.sei);
                parcel.writeParcelable(this.playerActualRange, i);
            }

            public PlayerInfo(String str, Rect rect) {
                this.sei = str;
                this.playerActualRange = rect;
                this.playerSize = new Pair<>(-1, -1);
                this.playerViewSize = new Pair<>(0, 0);
            }
        }

        public static final class PreviewLayoutHandoff implements Parcelable {
            public int layoutType;
            public int pageType;
            public String sharedBgImageFilePath;
            public static final C0ITV Companion = new Object() { // from class: X.0ITV
            };
            public static final Parcelable.Creator<PreviewLayoutHandoff> CREATOR = new Parcelable.Creator<PreviewLayoutHandoff>() { // from class: X.0ITU
                @Override // android.os.Parcelable.Creator
                public final EnterRoomConfig.FeedCoverData.PreviewLayoutHandoff createFromParcel(Parcel parcel) {
                    return new EnterRoomConfig.FeedCoverData.PreviewLayoutHandoff(parcel.readInt(), parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final EnterRoomConfig.FeedCoverData.PreviewLayoutHandoff[] newArray(int i) {
                    return new EnterRoomConfig.FeedCoverData.PreviewLayoutHandoff[i];
                }
            };

            public PreviewLayoutHandoff() {
                this(0, 0, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.layoutType);
                parcel.writeInt(this.pageType);
                parcel.writeString(this.sharedBgImageFilePath);
            }

            public PreviewLayoutHandoff(int i, int i2, String str) {
                this.layoutType = i;
                this.pageType = i2;
                this.sharedBgImageFilePath = str;
            }
        }

        public FeedCoverData(boolean z, boolean z2, int i, int i2, int i3, int i4, float f, List<String> list, PlayerInfo playerInfo, Pair<Integer, Integer> pair, Integer num, Integer num2, Rect rect) {
            this.enterPreviewSmooth = z;
            this.enterPreviewSmoothWithFirstFrame = z2;
            this.immersiveMarginTop = i;
            this.statusBarHeight = i2;
            this.navigationBarHeight = i3;
            this.screenHeight = i4;
            this.gameCurrentRatio = f;
            this.urlList = list;
            this.playerInfo = playerInfo;
            this.playerContainerSize = pair;
            this.smoothEnterStreamGravity = num;
            this.smoothEnterContainerGravity = num2;
            this.smoothEnterStreamMargin = rect;
        }
    }

    public static String INVOKEVIRTUAL_com_bytedance_android_livesdkapi_session_EnterRoomConfig_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final class GuestUser implements Parcelable {
        public static final Parcelable.Creator<GuestUser> CREATOR = new Parcelable.Creator<GuestUser>() { // from class: X.0ISn
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.GuestUser createFromParcel(Parcel parcel) {
                Integer numValueOf;
                long j = parcel.readLong();
                String string = parcel.readString();
                int i = parcel.readInt();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                return new EnterRoomConfig.GuestUser(j, string, i, string2, numValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.GuestUser[] newArray(int i) {
                return new EnterRoomConfig.GuestUser[i];
            }
        };
        public String distributionType;
        public Integer guestCnt;
        public int isGuestEnter;
        public String nickName;
        public long uid;

        public GuestUser() {
            this(0L, null, 0, "", 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iIntValue;
            parcel.writeLong(this.uid);
            parcel.writeString(this.nickName);
            parcel.writeInt(this.isGuestEnter);
            parcel.writeString(this.distributionType);
            Integer num = this.guestCnt;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }

        public GuestUser(long j, String str, int i, String str2, Integer num) {
            this.uid = j;
            this.nickName = str;
            this.isGuestEnter = i;
            this.distributionType = str2;
            this.guestCnt = num;
        }
    }

    public EnterRoomConfig(StreamData streamData, StreamData streamData2, LogData logData, RoomsData roomsData, SearchWrapData searchWrapData, ECWrapData eCWrapData, DrawParams drawParams, AwemeCommerceStructV2 awemeCommerceStructV2) {
        this.mStreamData = streamData;
        this.mSubStreamData = streamData2;
        this.mLogData = logData;
        this.mRoomsData = roomsData;
        this.mSearchData = searchWrapData;
        this.mECData = eCWrapData;
        this.drawParams = drawParams;
        this.commerceInfo = awemeCommerceStructV2;
        this.mFeedCoverData = new FeedCoverData(false, false, 0, 0, 0, 0, 0.0f, null, new FeedCoverData.PlayerInfo(null, new Rect()), null, null, null, null);
    }

    public static final class ECWrapData implements Parcelable {
        public int autoOpenProductBag;
        public String autoOpenProductBagTrackParams;
        public HashMap<String, String> ecCommonExtraParam;
        public String ecRecommendInfo;
        public List<Long> exposureItems;
        public boolean hasShownEcPreviewCard;
        public int isFromECContext;
        public int isPrefetchPinEnabled;
        public int optAutoRouteSchemeRouting;
        public String productBagPageParams;
        public HashMap<String, String> tagDaInfo;
        public static final C466980ISy Companion = new Object() { // from class: X.0ISy
        };
        public static final Parcelable.Creator<ECWrapData> CREATOR = new Parcelable.Creator<ECWrapData>() { // from class: X.0ISu
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.ECWrapData createFromParcel(Parcel parcel) {
                boolean z;
                HashMap map;
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                String string = parcel.readString();
                int i3 = parcel.readInt();
                HashMap map2 = new HashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    map2.put(parcel.readString(), parcel.readString());
                }
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                ArrayList arrayList = null;
                if (parcel.readInt() == 0) {
                    map = null;
                } else {
                    int i7 = parcel.readInt();
                    map = new HashMap(i7);
                    for (int i8 = 0; i8 != i7; i8++) {
                        map.put(parcel.readString(), parcel.readString());
                    }
                }
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i9 = parcel.readInt();
                    arrayList = new ArrayList(i9);
                    for (int i10 = 0; i10 != i9; i10++) {
                        arrayList.add(Long.valueOf(parcel.readLong()));
                    }
                }
                return new EnterRoomConfig.ECWrapData(i, i2, string, map2, z, i5, i6, map, string2, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.ECWrapData[] newArray(int i) {
                return new EnterRoomConfig.ECWrapData[i];
            }
        };

        public ECWrapData() {
            this(0, 0, "", new HashMap(), false, 0, 0, null, null, null, "{}");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.isFromECContext);
            parcel.writeInt(this.autoOpenProductBag);
            parcel.writeString(this.autoOpenProductBagTrackParams);
            HashMap<String, String> map = this.ecCommonExtraParam;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
            parcel.writeInt(this.hasShownEcPreviewCard ? 1 : 0);
            parcel.writeInt(this.optAutoRouteSchemeRouting);
            parcel.writeInt(this.isPrefetchPinEnabled);
            HashMap<String, String> map2 = this.tagDaInfo;
            if (map2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(map2.size());
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    parcel.writeString(entry2.getKey());
                    parcel.writeString(entry2.getValue());
                }
            }
            parcel.writeString(this.ecRecommendInfo);
            List<Long> list = this.exposureItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<Long> it2 = list.iterator();
                while (it2.hasNext()) {
                    parcel.writeLong(it2.next().longValue());
                }
            }
            parcel.writeString(this.productBagPageParams);
        }

        public ECWrapData(int i, int i2, String str, HashMap<String, String> map, boolean z, int i3, int i4, HashMap<String, String> map2, String str2, List<Long> list, String str3) {
            this.isFromECContext = i;
            this.autoOpenProductBag = i2;
            this.autoOpenProductBagTrackParams = str;
            this.ecCommonExtraParam = map;
            this.hasShownEcPreviewCard = z;
            this.optAutoRouteSchemeRouting = i3;
            this.isPrefetchPinEnabled = i4;
            this.tagDaInfo = map2;
            this.ecRecommendInfo = str2;
            this.exposureItems = list;
            this.productBagPageParams = str3;
        }
    }

    public static final class StreamData implements Parcelable {
        public static final Parcelable.Creator<StreamData> CREATOR = new Parcelable.Creator<StreamData>() { // from class: X.0ISl
            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.StreamData createFromParcel(Parcel parcel) {
                Long lValueOf;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                String string = parcel.readString();
                Integer numValueOf = null;
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                if (parcel.readInt() != 0) {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                long j = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                long j2 = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                return new EnterRoomConfig.StreamData(string, lValueOf, numValueOf, string2, string3, string4, string5, string6, string7, z, z2, i, i2, z3, j, z4, j2, z5, z6);
            }

            @Override // android.os.Parcelable.Creator
            public final EnterRoomConfig.StreamData[] newArray(int i) {
                return new EnterRoomConfig.StreamData[i];
            }
        };
        public Long aliveTimestamp;
        public long captionStreamDelayMs;
        public boolean disablePrePullStream;
        public Integer drmType;
        public boolean enablePreCreateSurface;
        public boolean extraStreamSRAntiAlias;
        public boolean extraStreamSREnable;
        public int extraStreamSRStrength;
        public boolean isHorizontalStream;
        public boolean isMultiStreamMode;
        public boolean isWithPush;
        public String options;
        public String pullDefaultResolution;
        public String pullSDKParam;
        public String pullStreamData;
        public String pullStreamUrl;
        public String sharePullStreamData;
        public String streamLanguage;
        public long streamRoomId;
        public int streamType;

        public StreamData() {
            this(null, 0L, 0, null, null, null, null, null, null, false, false, 0, -1, false, -1L, false, 0L, false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.pullStreamUrl);
            Long l = this.aliveTimestamp;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Integer num = this.drmType;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.streamLanguage);
            parcel.writeString(this.pullSDKParam);
            parcel.writeString(this.pullStreamData);
            parcel.writeString(this.options);
            parcel.writeString(this.sharePullStreamData);
            parcel.writeString(this.pullDefaultResolution);
            parcel.writeInt(this.extraStreamSREnable ? 1 : 0);
            parcel.writeInt(this.extraStreamSRAntiAlias ? 1 : 0);
            parcel.writeInt(this.extraStreamSRStrength);
            parcel.writeInt(this.streamType);
            parcel.writeInt(this.disablePrePullStream ? 1 : 0);
            parcel.writeLong(this.streamRoomId);
            parcel.writeInt(this.isWithPush ? 1 : 0);
            parcel.writeLong(this.captionStreamDelayMs);
            parcel.writeInt(this.isMultiStreamMode ? 1 : 0);
            parcel.writeInt(this.isHorizontalStream ? 1 : 0);
        }

        public StreamData(String str, Long l, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, int i, int i2, boolean z3, long j, boolean z4, long j2, boolean z5, boolean z6) {
            this.pullStreamUrl = str;
            this.aliveTimestamp = l;
            this.drmType = num;
            this.streamLanguage = str2;
            this.pullSDKParam = str3;
            this.pullStreamData = str4;
            this.options = str5;
            this.sharePullStreamData = str6;
            this.pullDefaultResolution = str7;
            this.extraStreamSREnable = z;
            this.extraStreamSRAntiAlias = z2;
            this.extraStreamSRStrength = i;
            this.streamType = i2;
            this.disablePrePullStream = z3;
            this.streamRoomId = j;
            this.isWithPush = z4;
            this.captionStreamDelayMs = j2;
            this.isMultiStreamMode = z5;
            this.isHorizontalStream = z6;
        }
    }
}
