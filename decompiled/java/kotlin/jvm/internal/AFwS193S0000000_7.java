package kotlin.jvm.internal;

import X.AbstractC1132980faa;
import X.AbstractC497160Jec;
import X.AbstractC515830KKv;
import X.C01CC;
import X.C06W5;
import X.C098200Yq;
import X.C09AY;
import X.C0C64;
import X.C0CQT;
import X.C0DMM;
import X.C0GY9;
import X.C0IJT;
import X.C0IL2;
import X.C0IV7;
import X.C0IV8;
import X.C0IVF;
import X.C0J07;
import X.C0J0B;
import X.C0J7Q;
import X.C0J82;
import X.C0J8K;
import X.C0JAM;
import X.C0JCJ;
import X.C0JCX;
import X.C0JOK;
import X.C0JT9;
import X.C0K0H;
import X.C0K0I;
import X.C0K0Q;
import X.C0K20;
import X.C0K24;
import X.C0K4O;
import X.C0K5Y;
import X.C0K5Z;
import X.C0K6O;
import X.C0K7V;
import X.C0KAX;
import X.C0KF4;
import X.C0KJC;
import X.C0KKG;
import X.C0KKP;
import X.C0KL4;
import X.C0KLS;
import X.C0KP4;
import X.C0KS3;
import X.C0KSF;
import X.C0NSL;
import X.C0S4U;
import X.C0UIM;
import X.C110700bR;
import X.C1151220g40;
import X.C1161920gLG;
import X.C11JF;
import X.C11NJ;
import X.C1389890mGx;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C14KS;
import X.C15438062q;
import X.C1697810uHb;
import X.C1805390x57;
import X.C1805440x5C;
import X.C1805490x5H;
import X.C189200o6;
import X.C19748512Ol;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2190691AoV;
import X.C2296808zG;
import X.C2421209eE;
import X.C339550DSv;
import X.C463900IHc;
import X.C464770IKl;
import X.C465260IMi;
import X.C467210ITv;
import X.C467220ITw;
import X.C467450IUt;
import X.C467460IUu;
import X.C467480IUw;
import X.C469620IbI;
import X.C469630IbJ;
import X.C469660IbM;
import X.C469950Ibp;
import X.C470590Icr;
import X.C473410IhP;
import X.C474500IjA;
import X.C474850Ijj;
import X.C477860Ioa;
import X.C478220IpA;
import X.C478230IpB;
import X.C478250IpD;
import X.C478680Ipu;
import X.C480220IsO;
import X.C480460Ism;
import X.C480730ItD;
import X.C480740ItE;
import X.C482120IvS;
import X.C482930Iwl;
import X.C482950Iwn;
import X.C483590Ixp;
import X.C484860Izs;
import X.C486390J5p;
import X.C487860JBg;
import X.C487890JBj;
import X.C487930JBn;
import X.C487940JBo;
import X.C488700JEm;
import X.C496200Jd4;
import X.C496230Jd7;
import X.C497590JfJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C510640K0w;
import X.C510890K1v;
import X.C511510K4f;
import X.C512110K6n;
import X.C514330KFb;
import X.C516010KLn;
import X.C516050KLr;
import X.C516140KMa;
import X.C516700KOe;
import X.C634700Ouy;
import X.C721340SRg;
import X.C736850SvL;
import X.C766270U4b;
import X.C781270Ukn;
import X.C784440Upu;
import X.C786410Ut5;
import X.C844470XAv;
import X.C939890aZ9;
import X.EnumC480200IsM;
import X.EnumC520290Kap;
import X.InterfaceC1106030et7;
import X.InterfaceC1596380re0;
import X.InterfaceC1603190roz;
import X.InterfaceC20318714ev;
import X.InterfaceC2661011f;
import X.InterfaceC467580IVg;
import X.InterfaceC477690IoJ;
import X.InterfaceC478660Ips;
import X.InterfaceC482530Iw7;
import X.InterfaceC484330Iz1;
import X.InterfaceC511350K3p;
import X.InterfaceC520300Kaq;
import X.InterfaceC671190QUj;
import X.InterfaceC736910SvR;
import X.InterfaceC943980afk;
import Y.ACListenerS74S0300000_7;
import Y.ARunnableS73S0200000_4;
import Y.AfS2S0200100_7;
import Y.AfS3S0100100_7;
import Y.AfS9S2000000_7;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.feed.api.NearbyClearModelChannel;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceMultiGuestShareBgChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.RealLinkControlWidgetCreatedChannel;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetRandomMatchStateReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchStartReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchStartResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendRoomsReq;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.publicscreen.api.GameBillboardChannel;
import com.bytedance.android.live.room.DismissUserProfileEvent;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.PaidRoomChannel;
import com.bytedance.android.livesdk.SwipeNextEvent;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.chatroom.model.AccessRecallMessageChannel;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveScrollUpInterceptOpt;
import com.bytedance.android.livesdk.chatroom.ui.widgetload.InternalWindowAdapterLiveStreamPanelDefaultSetting;
import com.bytedance.android.livesdk.chatroom.ui.widgetload.InternalWindowAdapterLiveStreamPanelSetting;
import com.bytedance.android.livesdk.chatroom.ui.widgetload.InternalWindowAdapterUserManualMuteSetting;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGuestNumChannel;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.setting.PrivilegePageVideoListSetting;
import com.bytedance.android.livesdk.comp.api.subscription.setting.SubscriptionPhotoTextConsumptionKillswitch;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.dataChannel.GoLiveCardShowing;
import com.bytedance.android.livesdk.dataChannel.IsInteractingData;
import com.bytedance.android.livesdk.dataChannel.MultiTabLIVEVisibility;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.PaidEventStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveChangedChannel;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeListResponse;
import com.bytedance.android.livesdk.feed.preloadfeed.FeedLiveTopLivePrefetchModel;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.iap.AbsIapPricing;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessFreeStartFragment;
import com.bytedance.android.livesdk.interaction.pollandgiftvote.PollAndGiftVoteDialog;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.LiveActiveWatchGuideConfig;
import com.bytedance.android.livesdk.livesetting.LiveActiveWatchGuideSetting;
import com.bytedance.android.livesdk.livesetting.LiveActiveWatchShowIntervalSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AiLiveSummarySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.BubbleConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAutoPlaybookGuideGoLiveSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostAiGeneratedToggleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TiktokLiveLocationBubbleSetting;
import com.bytedance.android.livesdk.livesetting.feed.Config;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightOptSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedTopliveTabEntranceSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.livesetting.feed.LivePreviewAutoSkipTypeSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveRecoInfoFeatureSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveSkylightNearbyStyleConfig;
import com.bytedance.android.livesdk.livesetting.feed.TopLiveNetOptConfigV2;
import com.bytedance.android.livesdk.livesetting.feed.TopLiveNetOptV2;
import com.bytedance.android.livesdk.livesetting.feed.TopLivePreFetchPoolSetting;
import com.bytedance.android.livesdk.livesetting.feed.TopLiveSkylightNearbyStyle;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutBizConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLivePreloadConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveRequestingCacelThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHangoutLiveCardTraceSuccessOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.OptConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveHangoutPerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LayoutBizConfigReadSourceSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveDynamicStrategySetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMarkViewerOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveOptPlayerFluencyExp;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomClickPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveFixPullStreamBizSessionIdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFullLinkPerfSendExp;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegradeSettings;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEasyExitCardSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostNewAwarenessStoreSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostStrategyV2Config;
import com.bytedance.android.livesdk.livesetting.skylight.LiveSkylightStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.BackRoomListSettingConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FeedRequestParamsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerWindowConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerWindowEnable;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveJumpReturnSkylightAutoOpenSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRoomScrollEndLogSampleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSmallApiAllowList;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSmallWindowPageMap;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUnknownSourceConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WindowPageConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerRefactorSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.innerflowdowngrade.LiveInnerFlowDowngradeSceneSetting;
import com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule.PTFWatchLiveScheduleSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import com.bytedance.android.livesdk.subscribe.model.BannerBackground;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widget.RecommendSwipeOptWidget;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.CustomTab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.android.livesdkapi.host.IHostFriends;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.android.livesdkapi.host.IHostPgcSubsService;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.host.ILiveStatusCheckServiceV2;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.pgc.wallet.base.subscribe.PGCCreateContractResult;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubLiveBanner;
import com.bytedance.android.strategy.CacheEntry;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.bytedance.touchpoint.core.crossplatform.SparkTaskFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ab.FollowTopliveBubbleConfig;
import com.ss.android.ugc.aweme.ab.TopGifterColdStartConfig;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.exp.LivePreviewExtraCardConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hangout.container.model.IMultiTopLivePageApi;
import com.ss.android.ugc.aweme.lemon.IL8ServiceInitDiffProtocol;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import com.ss.android.ugc.aweme.live.follow.FollowLiveDataFetchManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pcs.course.api.network.IPcsCourseApi;
import com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetail;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.api.ILivePurchasePanelBridge;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageSheet;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.ss.android.ugc.aweme.subscription.pgc.experiment.PurchasePanelMigrationSettings;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceApi;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionApi;
import com.ss.android.ugc.profile.business.commerce.OrderCenterGuideDialogApi;
import com.ss.android.ugc.profile.business.commerce.OrderCenterGuideDialogRepository;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.api.fans.GetNonFansUserDataResponse;
import tikcast.api.fans.GetSuperFansTreasureBoxDataResponse;
import webcast.api.cohost.CohostCheckPointResponse;
import webcast.api.envelope.PortalListResponse;
import webcast.api.envelope.RevenuePermissionResponse;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.TopliveNoticeListRequest;
import webcast.api.pgc_sub.PGCCommentActionRequest;
import webcast.api.pgc_sub.PGCCommentActionResponse;
import webcast.api.pgc_sub.PGCCommentDeleteResponse;
import webcast.api.pgc_sub.PGCCommentPageResponse;
import webcast.api.pgc_sub.PGCCommentSendReq;
import webcast.api.pgc_sub.PGCCommentSendResp;
import webcast.api.pgc_sub.PGCPollVoteResponse;
import webcast.api.pgc_sub.PGCPostActionRequest;
import webcast.api.pgc_sub.PGCPostActionResponse;
import webcast.api.pgc_sub.PGCPostCreateReq;
import webcast.api.pgc_sub.PGCPostCreateResp;
import webcast.api.pgc_sub.PGCPostDetailResponse;
import webcast.api.pgc_sub.PGCPostPageResponse;
import webcast.api.pgc_sub.PGCPostPinActionResponse;
import webcast.api.pgc_sub.PGCRecoverContractInAppResponse;
import webcast.api.pgc_sub.PGCSettingsResponse;
import webcast.api.pgc_sub.PGCSpaceActivityListResponse;
import webcast.api.pgc_sub.PGCSpaceJoinResponse;
import webcast.api.pgc_sub.PGCSpaceMembersResponse;
import webcast.api.pgc_sub.PGCSpaceQuitResponse;
import webcast.api.pgc_sub.PGCTemplateListData;
import webcast.api.pgc_sub.PGCTopicResponse;
import webcast.api.room.StrategyData;
import webcast.api.room.StrategyTrigger;
import webcast.api.room.UnifyBaseBusinessResponse;
import webcast.api.sub.HomePageResponse;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.PostDeleteResponse;
import webcast.api.sub.SMBPreviewResponse;
import webcast.api.sub.TemplateInfo;
import webcast.data.SuperFanPackage;

/* JADX INFO: loaded from: classes8.dex */
public class AFwS193S0000000_7 extends C09AY implements Function0 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(416);
    public final int $t;

    public static AFwS193S0000000_7 get$arr$(int i) {
        AFwS193S0000000_7 aFwS193S0000000_7 = (AFwS193S0000000_7) arr$.get(i);
        if (aFwS193S0000000_7 != null) {
            return aFwS193S0000000_7;
        }
        arr$.compareAndSet(i, null, new AFwS193S0000000_7(i));
        return (AFwS193S0000000_7) arr$.get(i);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$111(AFwS193S0000000_7 aFwS193S0000000_7) {
        return "sd";
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case 85:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            case 97:
                return invoke$97(this);
            case 98:
                return invoke$98(this);
            case 99:
                return invoke$99(this);
            case 100:
                return invoke$100(this);
            case 101:
                return invoke$101(this);
            case 102:
                return invoke$102(this);
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            case 106:
                return invoke$106(this);
            case 107:
                return invoke$107(this);
            case 108:
                return invoke$108(this);
            case 109:
                return invoke$109(this);
            case 110:
                return invoke$110(this);
            case 111:
                return invoke$111(this);
            case 112:
                return invoke$112(this);
            case 113:
                return invoke$113(this);
            case 114:
                return invoke$114(this);
            case 115:
                return invoke$115(this);
            case 116:
                return invoke$116(this);
            case 117:
                return invoke$117(this);
            case 118:
                return invoke$118(this);
            case 119:
                return invoke$119(this);
            case 120:
                return invoke$120(this);
            case 121:
                return invoke$121(this);
            case 122:
                return invoke$122(this);
            case 123:
                return invoke$123(this);
            case 124:
                return invoke$124(this);
            case 125:
                return invoke$125(this);
            case 126:
                return invoke$126(this);
            case 127:
                return invoke$127(this);
            case 128:
                return invoke$128(this);
            case 129:
                return invoke$129(this);
            case 130:
                return invoke$130(this);
            case 131:
                return invoke$131(this);
            case 132:
                return invoke$132(this);
            case 133:
                return invoke$133(this);
            case 134:
                return invoke$134(this);
            case 135:
                return invoke$135(this);
            case 136:
                return invoke$136(this);
            case 137:
                return invoke$137(this);
            case 138:
                return invoke$138(this);
            case 139:
                return invoke$139(this);
            case 140:
                return invoke$140(this);
            case 141:
                return invoke$141(this);
            case 142:
                return invoke$142(this);
            case 143:
                return invoke$143(this);
            case 144:
                return invoke$144(this);
            case 145:
                return invoke$145(this);
            case 146:
                return invoke$146(this);
            case 147:
                return invoke$147(this);
            case 148:
                return invoke$148(this);
            case 149:
                return invoke$149(this);
            case 150:
                return invoke$150(this);
            case 151:
                return invoke$151(this);
            case 152:
                return invoke$152(this);
            case 153:
                return invoke$153(this);
            case 154:
                return invoke$154(this);
            case 155:
                return invoke$155(this);
            case 156:
                return invoke$156(this);
            case 157:
                return invoke$157(this);
            case 158:
                return invoke$158(this);
            case 159:
                return invoke$159(this);
            case 160:
                return invoke$160(this);
            case 161:
                return invoke$161(this);
            case 162:
                return invoke$162(this);
            case 163:
                return invoke$163(this);
            case 164:
                return invoke$164(this);
            case 165:
                return invoke$165(this);
            case 166:
                return invoke$166(this);
            case 167:
                return invoke$167(this);
            case 168:
                return invoke$168(this);
            case 169:
                return invoke$169(this);
            case 170:
                return invoke$170(this);
            case 171:
                return invoke$171(this);
            case 172:
                return invoke$172(this);
            case 173:
                return invoke$173(this);
            case 174:
                return invoke$174(this);
            case 175:
                return invoke$175(this);
            case 176:
                return invoke$176(this);
            case 177:
                return invoke$177(this);
            case 178:
                return invoke$178(this);
            case 179:
                return invoke$179(this);
            case 180:
                return invoke$180(this);
            case 181:
                return invoke$181(this);
            case 182:
                return invoke$182(this);
            case 183:
                return invoke$183(this);
            case 184:
                return invoke$184(this);
            case 185:
                return invoke$185(this);
            case 186:
                return invoke$186(this);
            case 187:
                return invoke$187(this);
            case 188:
                return invoke$188(this);
            case 189:
                return invoke$189(this);
            case 190:
                return invoke$190(this);
            case 191:
                return invoke$191(this);
            case 192:
                return invoke$192(this);
            case 193:
                return invoke$193(this);
            case 194:
                return invoke$194(this);
            case 195:
                return invoke$195(this);
            case 196:
                return invoke$196(this);
            case 197:
                return invoke$197(this);
            case 198:
                return invoke$198(this);
            case 199:
                return invoke$199(this);
            case 200:
                return invoke$200(this);
            case 201:
                return invoke$201(this);
            case 202:
                return invoke$202(this);
            case 203:
                return invoke$203(this);
            case 204:
                return invoke$204(this);
            case 205:
                return invoke$205(this);
            case 206:
                return invoke$206(this);
            case 207:
                return invoke$207(this);
            case 208:
                return invoke$208(this);
            case 209:
                return invoke$209(this);
            case 210:
                return invoke$210(this);
            case 211:
                return invoke$211(this);
            case 212:
                return invoke$212(this);
            case 213:
                return invoke$213(this);
            case 214:
                return invoke$214(this);
            case 215:
                return invoke$215(this);
            case 216:
                return invoke$216(this);
            case 217:
                return invoke$217(this);
            case 218:
                return invoke$218(this);
            case 219:
                return invoke$219(this);
            case 220:
                return invoke$220(this);
            case 221:
                return invoke$221(this);
            case 222:
                return invoke$222(this);
            case 223:
                return invoke$223(this);
            case 224:
                return invoke$224(this);
            case 225:
                return invoke$225(this);
            case 226:
                return invoke$226(this);
            case 227:
                return invoke$227(this);
            case 228:
                return invoke$228(this);
            case 229:
                return invoke$229(this);
            case 230:
                return invoke$230(this);
            case 231:
                return invoke$231(this);
            case 232:
                return invoke$232(this);
            case 233:
                return invoke$233(this);
            case 234:
                return invoke$234(this);
            case 235:
                return invoke$235(this);
            case 236:
                return invoke$236(this);
            case 237:
                return invoke$237(this);
            case 238:
                return invoke$238(this);
            case 239:
                return invoke$239(this);
            case 240:
                return invoke$240(this);
            case 241:
                return invoke$241(this);
            case 242:
                return invoke$242(this);
            case 243:
                return invoke$243(this);
            case 244:
                return invoke$244(this);
            case 245:
                return invoke$245(this);
            case 246:
                return invoke$246(this);
            case 247:
                return invoke$247(this);
            case 248:
                return invoke$248(this);
            case 249:
                return invoke$249(this);
            case 250:
                return invoke$250(this);
            case 251:
                return invoke$251(this);
            case 252:
                return invoke$252(this);
            case 253:
                return invoke$253(this);
            case 254:
                return invoke$254(this);
            case 255:
                return invoke$255(this);
            case 256:
                return invoke$256(this);
            case 257:
                return invoke$257(this);
            case 258:
                return invoke$258(this);
            case 259:
                return invoke$259(this);
            case 260:
                return invoke$260(this);
            case 261:
                return invoke$261(this);
            case 262:
                return invoke$262(this);
            case 263:
                return invoke$263(this);
            case 264:
                return invoke$264(this);
            case 265:
                return invoke$265(this);
            case 266:
                return invoke$266(this);
            case 267:
                return invoke$267(this);
            case 268:
                return invoke$268(this);
            case 269:
                return invoke$269(this);
            case 270:
                return invoke$270(this);
            case 271:
                return invoke$271(this);
            case 272:
                return invoke$272(this);
            case 273:
                return invoke$273(this);
            case 274:
                return invoke$274(this);
            case 275:
                return invoke$275(this);
            case 276:
                return invoke$276(this);
            case 277:
                return invoke$277(this);
            case 278:
                return invoke$278(this);
            case 279:
                return invoke$279(this);
            case 280:
                return invoke$280(this);
            case 281:
                return invoke$281(this);
            case 282:
                return invoke$282(this);
            case 283:
                return invoke$283(this);
            case 284:
                return invoke$284(this);
            case 285:
                return invoke$285(this);
            case 286:
                return invoke$286(this);
            case 287:
                return invoke$287(this);
            case 288:
                return invoke$288(this);
            case 289:
                return invoke$289(this);
            case 290:
                return invoke$290(this);
            case 291:
                return invoke$291(this);
            case 292:
                return invoke$292(this);
            case 293:
                return invoke$293(this);
            case 294:
                return invoke$294(this);
            case 295:
                return invoke$295(this);
            case 296:
                return invoke$296(this);
            case 297:
                return invoke$297(this);
            case 298:
                return invoke$298(this);
            case 299:
                return invoke$299(this);
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                return invoke$300(this);
            case 301:
                return invoke$301(this);
            case 302:
                return invoke$302(this);
            case 303:
                return invoke$303(this);
            case 304:
                return invoke$304(this);
            case 305:
                return invoke$305(this);
            case 306:
                return invoke$306(this);
            case 307:
                return invoke$307(this);
            case 308:
                return invoke$308(this);
            case 309:
                return invoke$309(this);
            case 310:
                return invoke$310(this);
            case 311:
                return invoke$311(this);
            case 312:
                return invoke$312(this);
            case 313:
                return invoke$313(this);
            case 314:
                return invoke$314(this);
            case 315:
                return invoke$315(this);
            case 316:
                return invoke$316(this);
            case 317:
                return invoke$317(this);
            case 318:
                return invoke$318(this);
            case 319:
                return invoke$319(this);
            case 320:
                return invoke$320(this);
            case 321:
                return invoke$321(this);
            case 322:
                return invoke$322(this);
            case 323:
                return invoke$323(this);
            case 324:
                return invoke$324(this);
            case 325:
                return invoke$325(this);
            case 326:
                return invoke$326(this);
            case 327:
                return invoke$327(this);
            case 328:
                return invoke$328(this);
            case 329:
                return invoke$329(this);
            case 330:
                return invoke$330(this);
            case 331:
                return invoke$331(this);
            case 332:
                return invoke$332(this);
            case 333:
                return invoke$333(this);
            case 334:
                return invoke$334(this);
            case 335:
                return invoke$335(this);
            case 336:
                return invoke$336(this);
            case 337:
                return invoke$337(this);
            case 338:
                return invoke$338(this);
            case 339:
                return invoke$339(this);
            case 340:
                return invoke$340(this);
            case 341:
                return invoke$341(this);
            case 342:
                return invoke$342(this);
            case 343:
                return invoke$343(this);
            case 344:
                return invoke$344(this);
            case 345:
                return invoke$345(this);
            case 346:
                return invoke$346(this);
            case 347:
                return invoke$347(this);
            case 348:
                return invoke$348(this);
            case 349:
                return invoke$349(this);
            case 350:
                return invoke$350(this);
            case 351:
                return invoke$351(this);
            case 352:
                return invoke$352(this);
            case 353:
                return invoke$353(this);
            case 354:
                return invoke$354(this);
            case 355:
                return invoke$355(this);
            case 356:
                return invoke$356(this);
            case 357:
                return invoke$357(this);
            case 358:
                return invoke$358(this);
            case 359:
                return invoke$359(this);
            case 360:
                return invoke$360(this);
            case 361:
                return invoke$361(this);
            case 362:
                return invoke$362(this);
            case 363:
                return invoke$363(this);
            case 364:
                return invoke$364(this);
            case 365:
                return invoke$365(this);
            case 366:
                return invoke$366(this);
            case 367:
                return invoke$367(this);
            case 368:
                return invoke$368(this);
            case 369:
                return invoke$369(this);
            case 370:
                return invoke$370(this);
            case 371:
                return invoke$371(this);
            case 372:
                return invoke$372(this);
            case 373:
                return invoke$373(this);
            case 374:
                return invoke$374(this);
            case 375:
                return invoke$375(this);
            case 376:
                return invoke$376(this);
            case 377:
                return invoke$377(this);
            case 378:
                return invoke$378(this);
            case 379:
                return invoke$379(this);
            case 380:
                return invoke$380(this);
            case 381:
                return invoke$381(this);
            case 382:
                return invoke$382(this);
            case 383:
                return invoke$383(this);
            case 384:
                return invoke$384(this);
            case 385:
                return invoke$385(this);
            case 386:
                return invoke$386(this);
            case 387:
                return invoke$387(this);
            case 388:
                return invoke$388(this);
            case 389:
                return invoke$389(this);
            case 390:
                return invoke$390(this);
            case 391:
                return invoke$391(this);
            case 392:
                return invoke$392(this);
            case 393:
                return invoke$393(this);
            case 394:
                return invoke$394(this);
            case 395:
                return invoke$395(this);
            case 396:
                return invoke$396(this);
            case 397:
                return invoke$397(this);
            case 398:
                return invoke$398(this);
            case 399:
                return invoke$399(this);
            case 400:
                return invoke$400(this);
            case 401:
                return invoke$401(this);
            case 402:
                return invoke$402(this);
            case 403:
                return invoke$403(this);
            case 404:
                return invoke$404(this);
            case 405:
                return invoke$405(this);
            case 406:
                return invoke$406(this);
            case 407:
                return invoke$407(this);
            case 408:
                return invoke$408(this);
            case 409:
                return invoke$409(this);
            case 410:
                return invoke$410(this);
            case 411:
                return invoke$411(this);
            case 412:
                return invoke$412(this);
            case 413:
                return invoke$413(this);
            case 414:
                return invoke$414(this);
            case 415:
                return invoke$415(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS193S0000000_7(int i) {
        super(0);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new PollAndGiftVoteDialog();
    }

    public static final Object invoke$1(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C0K7V.LIZ;
    }

    public static final Object invoke$10(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig> innerFlowRecoInfoSaveConfig = LiveRecoInfoFeatureSetting.INSTANCE.getInnerFlowRecoInfoSaveConfig();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig recoInfoFeatureSaveConfig : innerFlowRecoInfoSaveConfig) {
            linkedHashMap.put(recoInfoFeatureSaveConfig.getRecoInfoKey(), recoInfoFeatureSaveConfig);
        }
        return linkedHashMap;
    }

    public static final Object invoke$100(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Long.valueOf(LivePlayFullLinkPerfSendExp.INSTANCE.collectIntervalSec());
    }

    public static final Object invoke$101(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.TRUE;
    }

    public static /* bridge */ /* synthetic */ Object invoke$102(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$103(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new SparkTaskFragment();
    }

    public static final Object invoke$104(AFwS193S0000000_7 aFwS193S0000000_7) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        TopGifterColdStartConfig topGifterColdStartConfig = C0J8K.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(TopGifterColdStartConfig.class, topGifterColdStartConfig, "live_top_gifter_cold_start_strategy", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return topGifterColdStartConfig;
    }

    public static final Object invoke$105(AFwS193S0000000_7 aFwS193S0000000_7) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FollowTopliveBubbleConfig followTopliveBubbleConfig = C0J0B.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(FollowTopliveBubbleConfig.class, followTopliveBubbleConfig, "follow_relationship_toplive_bubble", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return followTopliveBubbleConfig;
    }

    public static final Object invoke$106(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C06W5(0);
    }

    public static final Object invoke$107(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).G5();
    }

    public static final Object invoke$108(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C06W5(0);
    }

    public static final Object invoke$109(AFwS193S0000000_7 aFwS193S0000000_7) {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(validTopActivity);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJ(validTopActivity.getString(2131845167));
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.ee);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(IHostPerformanceOpt.class);
    }

    public static final Object invoke$110(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C06W5(0);
    }

    public static final Object invoke$112(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C2296808zG.LIZIZ();
    }

    public static final Object invoke$113(AFwS193S0000000_7 aFwS193S0000000_7) {
        MainActivityScope mainActivityScopeLIZJ;
        Activity activityLIZ = C2421209eE.LIZ();
        if ((activityLIZ instanceof InterfaceC1603190roz) && (activityLIZ instanceof C19EG) && (mainActivityScopeLIZJ = C0S4U.LIZJ((C19EG) activityLIZ)) != null) {
            return C0DMM.LIZ(mainActivityScopeLIZJ);
        }
        return null;
    }

    public static final Object invoke$114(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZLLL(0.1d, "livesdk_finish_card_show"));
    }

    public static final Object invoke$115(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZLLL(0.01d, "livesdk_finish_card_delete"));
    }

    public static final Object invoke$116(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZLLL(0.01d, "livesdk_live_delete"));
    }

    public static final Object invoke$117(AFwS193S0000000_7 aFwS193S0000000_7) {
        boolean z;
        if (C497740JfY.LJIIZILJ() <= ((int) C497740JfY.LIZIZ(375.0f))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$118(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C473410IhP.LIZ();
    }

    public static final Object invoke$119(AFwS193S0000000_7 aFwS193S0000000_7) {
        return 201326592;
    }

    public static final Object invoke$12(AFwS193S0000000_7 aFwS193S0000000_7) {
        String strLJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        InterfaceC671190QUj iLiveSearchService = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getILiveSearchService();
        if (iLiveSearchService != null) {
            strLJIILJJIL = iLiveSearchService.LJIILJJIL();
        } else {
            strLJIILJJIL = null;
        }
        sbLIZ.append(strLJIILJJIL);
        sbLIZ.append("/aweme/v1/live/search/");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$120(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Keva.getRepo("following_widget_manager_repo");
    }

    public static final Object invoke$121(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new LinkedHashMap();
    }

    public static final Object invoke$122(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C474850Ijj.LIZIZ();
    }

    public static final Object invoke$123(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new InterfaceC736910SvR<InterfaceC477690IoJ>() { // from class: X.0IoK
            public final C477710IoL LL = new InterfaceC477690IoJ() { // from class: X.0IoL
                @Override // X.InterfaceC477690IoJ
                public final Object E(RecommendRoomsReq recommendRoomsReq, C477670IoH c477670IoH) {
                    if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
                        C478590Ipl c478590Ipl = C478590Ipl.LIZ;
                        C480460Ism.LIZ().getClass();
                        return ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).getRecommendRooms(recommendRoomsReq, c477670IoH);
                    }
                    C480460Ism.LIZ().getClass();
                    return ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).getRecommendRooms(recommendRoomsReq, c477670IoH);
                }
            };

            @Override // X.InterfaceC736910SvR
            public final void release() {
            }

            @Override // X.InterfaceC736910SvR
            public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                return this.LL;
            }
        };
    }

    public static final Object invoke$124(AFwS193S0000000_7 aFwS193S0000000_7) {
        MGModuleInteraction mGModuleInteraction = new MGModuleInteraction();
        mGModuleInteraction.type = 1;
        mGModuleInteraction.name = "hangout_mg_agg_playlabel_dating";
        mGModuleInteraction.title = "Dating";
        mGModuleInteraction.btnTitle = "Join";
        return mGModuleInteraction;
    }

    public static final Object invoke$125(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Keva.getRepo("top_live_tab");
    }

    public static final Object invoke$126(AFwS193S0000000_7 aFwS193S0000000_7) {
        MGModuleInteraction mGModuleInteraction = new MGModuleInteraction();
        mGModuleInteraction.type = 3;
        mGModuleInteraction.name = "hangout_mg_agg_playlabel_random_chat";
        mGModuleInteraction.title = "Random chat";
        mGModuleInteraction.btnTitle = "Join";
        return mGModuleInteraction;
    }

    public static final Object invoke$127(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(TiktokLiveHangoutPerformanceOptSetting.isRandomMatchEnterRoomOpt());
    }

    public static final Object invoke$128(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C474850Ijj.LIZIZ();
    }

    public static final Object invoke$129(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new InterfaceC736910SvR<InterfaceC478660Ips>() { // from class: X.0Ipv
            public final C478630Ipp LL = new InterfaceC478660Ips() { // from class: X.0Ipp
                @Override // X.InterfaceC478660Ips
                public final Object LJLIL(GetRandomMatchStateReq getRandomMatchStateReq, C481490IuR c481490IuR) {
                    if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
                        C478590Ipl c478590Ipl = C478590Ipl.LIZ;
                        C480460Ism.LIZ().getClass();
                        return ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).getRandomMatchState(getRandomMatchStateReq, c481490IuR);
                    }
                    C480460Ism.LIZ().getClass();
                    return ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).getRandomMatchState(getRandomMatchStateReq, c481490IuR);
                }

                @Override // X.InterfaceC478660Ips
                public final Object cancelRandomMatch(RandomMatchGuestCancelReq randomMatchGuestCancelReq, InterfaceC1364105Vn<? super C470590Icr<RandomMatchGuestCancelResp.ResponseData>> interfaceC1364105Vn) {
                    if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
                        C478590Ipl c478590Ipl = C478590Ipl.LIZ;
                        C480460Ism.LIZ().getClass();
                        return ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).cancelRandomMatch(randomMatchGuestCancelReq, interfaceC1364105Vn);
                    }
                    C480460Ism.LIZ().getClass();
                    return ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).cancelRandomMatch(randomMatchGuestCancelReq, interfaceC1364105Vn);
                }

                @Override // X.InterfaceC478660Ips
                public final Object startRandomMatch(RandomMatchStartReq randomMatchStartReq, InterfaceC1364105Vn<? super C470590Icr<RandomMatchStartResp.ResponseData>> interfaceC1364105Vn) {
                    if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
                        C478590Ipl c478590Ipl = C478590Ipl.LIZ;
                        C480460Ism.LIZ().getClass();
                        return ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).startRandomMatch(randomMatchStartReq, interfaceC1364105Vn);
                    }
                    C480460Ism.LIZ().getClass();
                    return ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).startRandomMatch(randomMatchStartReq, interfaceC1364105Vn);
                }
            };

            @Override // X.InterfaceC736910SvR
            public final void release() {
            }

            @Override // X.InterfaceC736910SvR
            public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                return this.LL;
            }
        };
    }

    public static final Object invoke$13(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((InterfaceC2661011f) C0JCJ.LIZIZ.getValue()).create(C0KLS.class);
    }

    public static final Object invoke$130(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C474850Ijj.LIZIZ();
    }

    public static final Object invoke$131(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new LinearInterpolator();
    }

    public static /* bridge */ /* synthetic */ Object invoke$132(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C736850SvL();
    }

    public static /* bridge */ /* synthetic */ Object invoke$133(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C736850SvL();
    }

    public static final Object invoke$134(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(40.0f));
    }

    public static /* bridge */ /* synthetic */ Object invoke$135(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C736850SvL();
    }

    public static final Object invoke$136(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C478680Ipu();
    }

    public static final Object invoke$137(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C478680Ipu();
    }

    public static final Object invoke$138(AFwS193S0000000_7 aFwS193S0000000_7) {
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IL8ServiceInitDiffProtocol.class, false, false, false, 14, null);
        if (objPluggableSpi$default == null) {
            return new IL8ServiceInitDiffProtocol.DowngradeInstance();
        }
        return objPluggableSpi$default;
    }

    public static final Object invoke$139(AFwS193S0000000_7 aFwS193S0000000_7) {
        IL8ServiceInitDiffProtocol.LIZ.getClass();
        C0J82.LIZIZ.getValue().LIZ();
        boolean z = true;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "lemon8_service_init", true, false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$14(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C0KAX() { // from class: X.0KLR
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(13));

            public final C0KLS LIZLLL() {
                return (C0KLS) this.LIZ.getValue();
            }

            @Override // X.C0KAX
            public final C11NZ getUserInfo(String str) {
                return LIZLLL().getUserInfo(str, 0L, 0L, 0);
            }

            @Override // X.C0KAX
            public final C11NZ<DataResponse<Unit>> setRenewReminder(String str) {
                return LIZLLL().setRenewReminder(str);
            }

            @Override // X.C0KAX
            public final C11JN checkSubOrder(String str, String str2) {
                return LIZLLL().checkSubOrder(str, str2).LJJIJIL(new C516901zr(1)).LJJIJIIJIL(new AfS9S2000000_7(str, str2, 0)).LJJIJIIJI(new C516901zr(2)).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0KLT
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                    }
                });
            }

            @Override // X.C0KAX
            public final C11NZ<DataResponse<PGCRecoverContractInAppResponse.RecoverContractInAppResult>> resubscribeOrder(String str, String str2, String str3) {
                return LIZLLL().resubscribeOrder(str, str2, str3);
            }

            @Override // X.C0KAX
            public final C11NZ LIZJ(String str, String str2, long j, String str3) {
                return LIZLLL().getSubPrivilegeDetail(str, str2, 0, true, j, str3);
            }

            @Override // X.C0KAX
            public final C11NZ<DataResponse<n>> getSubscribeInfo(boolean z, String str, boolean z2, String str2, int i) {
                return LIZLLL().getSubscribeInfo(z, str, z2, str2, i);
            }

            @Override // X.C0KAX
            public final C11NZ<DataResponse<PGCTemplateListData>> LIZIZ(String str, int i, String str2, String str3, long j, long j2, boolean z, String str4, boolean z2) {
                return LIZLLL().LIZIZ(str, i, str2, str3, j, j2, z, str4, z2);
            }

            @Override // X.C0KAX
            public final C11NZ<DataResponse<PGCCreateContractResult>> LIZ(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i, int i2, String str7, int i3, int i4, String str8, String str9, Map<String, String> map) {
                return LIZLLL().LIZ(str, str2, str3, str4, str5, str6, bool, i, i2, str7, i3, i4, str8, str9, map);
            }
        };
    }

    public static final Object invoke$140(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(IHostPgcSubsService.class);
    }

    public static final Object invoke$141(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Keva.getRepo("live_cold_start");
    }

    public static final Object invoke$142(AFwS193S0000000_7 aFwS193S0000000_7) {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(Live.getLiveDomain());
        return iRetrofitFactory.LIZ(C2188811AlT.LIZIZ(sbLIZ)).create(LiveStateApi.class);
    }

    public static final Object invoke$143(AFwS193S0000000_7 aFwS193S0000000_7) {
        HashMap<Integer, CacheEntry> map = C469630IbJ.LIZ;
        if (!map.containsKey(18)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new_scene_");
            sbLIZ.append(18);
            String string = C469630IbJ.LIZIZ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
            if (string != null && string.length() != 0) {
                try {
                    map.put(18, (CacheEntry) C19748512Ol.LIZIZ.LJII(string, CacheEntry.class));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        CacheEntry cacheEntry = C469630IbJ.LIZ.get(18);
        if (cacheEntry != null) {
            return cacheEntry.data;
        }
        return null;
    }

    public static final Object invoke$144(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C06W5(0);
    }

    public static final Object invoke$145(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$146(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$147(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$148(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).g5();
    }

    public static final Object invoke$149(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C486390J5p.LLJI;
    }

    public static final Object invoke$15(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C516140KMa();
    }

    public static final Object invoke$150(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).G5();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$151(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$152(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Keva.getRepo("nearby_bubble_repo");
    }

    public static final Object invoke$153(AFwS193S0000000_7 aFwS193S0000000_7) {
        C469620IbI.LIZ.getClass();
        return C469620IbI.LIZIZ(23, null, true, true, false);
    }

    public static final Object invoke$154(AFwS193S0000000_7 aFwS193S0000000_7) {
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService != null) {
            return iLiveFeedApiService.y30(2, true);
        }
        return null;
    }

    public static final Object invoke$155(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.TRUE;
    }

    public static /* bridge */ /* synthetic */ Object invoke$156(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C736850SvL();
    }

    public static /* bridge */ /* synthetic */ Object invoke$157(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C736850SvL();
    }

    public static /* bridge */ /* synthetic */ Object invoke$158(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C736850SvL();
    }

    public static final Object invoke$159(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new InterfaceC736910SvR<InterfaceC484330Iz1>() { // from class: X.0Iyz
            public final C484300Iyy LL = new InterfaceC484330Iz1() { // from class: X.0Iyy
                @Override // X.InterfaceC484330Iz1
                public final Object LJLLLL(int i, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            C484270Iyv.LIZLLL = 0L;
                        }
                    } else {
                        Long l = C484270Iyv.LIZLLL;
                        if (l != null) {
                            C484270Iyv.LIZLLL = Long.valueOf(l.longValue() - 1);
                        }
                    }
                    Object objLJ = C2296808zG.LJ(new C324150CnF(i, j, null), interfaceC1364105Vn);
                    if (objLJ != C099R.LJFF()) {
                        objLJ = Unit.LIZ;
                    }
                    if (objLJ == C099R.LJFF()) {
                        return objLJ;
                    }
                    return Unit.LIZ;
                }

                @Override // X.InterfaceC484330Iz1
                public final Object LLLZIL(TopliveNoticeListRequest topliveNoticeListRequest, EnumC484320Iz0 enumC484320Iz0, C484350Iz3 c484350Iz3) {
                    return C2296808zG.LJ(new C484280Iyw(topliveNoticeListRequest.lastNoticeId, enumC484320Iz0, topliveNoticeListRequest, null), c484350Iz3);
                }
            };

            @Override // X.InterfaceC736910SvR
            public final void release() {
            }

            @Override // X.InterfaceC736910SvR
            public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                return this.LL;
            }
        };
    }

    public static final Object invoke$16(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C11NJ();
    }

    public static final Object invoke$160(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C0J7Q();
    }

    public static final Object invoke$161(AFwS193S0000000_7 aFwS193S0000000_7) {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            return iLiveOuterService.g5();
        }
        return null;
    }

    public static final Object invoke$162(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C0J7Q.LJIIIZ.getValue();
    }

    public static final Object invoke$163(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Keva.getRepo("watch_later_activity_bubble_repo");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$164(kotlin.jvm.internal.AFwS193S0000000_7 r4) {
        /*
            X.0JT6<java.lang.Boolean> r1 = X.InterfaceC1106030et7.N9
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.LIZJ(r0)
            java.lang.Class<com.bytedance.android.feed.api.ILiveFeedApiService> r0 = com.bytedance.android.feed.api.ILiveFeedApiService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.feed.api.ILiveFeedApiService r0 = (com.bytedance.android.feed.api.ILiveFeedApiService) r0
            r3 = 0
            if (r0 == 0) goto Laa
            r0.zX1()
            com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager r2 = com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager.LIZ
            X.0Ien r1 = X.EnumC471790Ien.ROOM
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.bytedance.android.live.network.response.BaseListResponse r0 = r2.LJIIL(r1, r0)
            if (r0 == 0) goto Laa
            java.util.List<T> r0 = r0.data
            if (r0 == 0) goto Laa
            java.util.Iterator r4 = r0.iterator()
        L29:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.bytedance.android.livesdk.model.FeedItem r0 = (com.bytedance.android.livesdk.model.FeedItem) r0
            int r1 = r0.type
            r0 = 22
            if (r1 != r0) goto L29
        L3c:
            com.bytedance.android.livesdk.model.FeedItem r2 = (com.bytedance.android.livesdk.model.FeedItem) r2
            if (r2 == 0) goto Laa
            webcast.api.feed.WatchLaterInfo r0 = r2.watchLaterInfo
            if (r0 == 0) goto Laa
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r0.latestRoom
        L46:
            java.lang.String r0 = "livesdk_toplive_watch_later_guide_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "enter_from_merge"
            java.lang.String r0 = "live_merge"
            r2.LJJII(r0, r1)
            if (r4 == 0) goto La6
            com.bytedance.android.live.base.model.user.User r0 = r4.getOwner()
            if (r0 == 0) goto La6
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r0.toString()
        L67:
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            if (r4 == 0) goto La4
            long r0 = r4.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r0.toString()
        L7a:
            java.lang.String r0 = "room_id"
            r2.LJJII(r1, r0)
            if (r4 == 0) goto L99
            com.bytedance.android.live.base.model.user.User r0 = r4.getOwner()
            if (r0 == 0) goto L99
            com.bytedance.android.live.base.model.user.FollowInfo r0 = r0.getFollowInfo()
            if (r0 == 0) goto L99
            long r0 = r0.getFollowStatus()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r3 = r0.toString()
        L99:
            java.lang.String r0 = "follow_status"
            r2.LJJII(r3, r0)
            r2.LIZ()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La4:
            r1 = r3
            goto L7a
        La6:
            r1 = r3
            goto L67
        La8:
            r2 = r3
            goto L3c
        Laa:
            r4 = r3
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS193S0000000_7.invoke$164(kotlin.jvm.internal.AFwS193S0000000_7):java.lang.Object");
    }

    public static final Object invoke$165(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C06W5(2);
    }

    public static final Object invoke$166(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C06W5(0);
    }

    public static final Object invoke$167(AFwS193S0000000_7 aFwS193S0000000_7) {
        C480460Ism.LIZ().getClass();
        return C480460Ism.LIZLLL(IPcsCourseApi.class);
    }

    public static final Object invoke$168(AFwS193S0000000_7 aFwS193S0000000_7) {
        C766270U4b.LIZLLL(2131856533);
        return Unit.LIZ;
    }

    public static final Object invoke$169(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$17(AFwS193S0000000_7 aFwS193S0000000_7) {
        boolean z;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && LiveUnknownSourceConfigSetting.INSTANCE.getValue().length > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$170(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$171(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$172(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$173(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$174(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$175(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$176(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$177(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$178(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$179(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C339550DSv(C2097608Jq.LJIIIIZZ(new Pair(C510640K0w.class, new C510890K1v()), new Pair(C0K0H.class, new C0K24<C0K0H, C0K0Q>() { // from class: X.0K1j
            @Override // X.C0DVN
            public final int LIZIZ() {
                return C0K7G.LIZLLL() ? R.layout.fgm : R.layout.fgl;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(View view) {
                return new C0K0Q(view);
            }
        }), new Pair(C0K0I.class, new C0K24<C0K0I, C0K20>() { // from class: X.0K1z
            @Override // X.C0DVN
            public final int LIZIZ() {
                return R.layout.ffd;
            }

            @Override // X.C0DVN
            public final AbstractC339560DSw LIZ(final View view) {
                return new C0K1I<C0K0I>(view) { // from class: X.0K20
                    public final View LLILLJJLI;
                    public final TextView LLILLL;
                    public final TextView LLILZ;

                    {
                        super(view);
                        this.LLILLJJLI = view.findViewById(R.id.wee);
                        this.LLILLL = (TextView) view.findViewById(R.id.weg);
                        this.LLILZ = (TextView) view.findViewById(R.id.web);
                    }

                    @Override // X.AbstractC339560DSw
                    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
                        String string;
                        C510610K0t c510610K0t;
                        C417400GYg c417400GYg;
                        C0K0I c0k0i = (C0K0I) interfaceC339570DSx;
                        P5(c0k0i);
                        View view2 = this.itemView;
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(0, view2);
                        }
                        C0K25 c0k25 = C0K25.LIZ;
                        String strLIZJ = C510570K0p.LIZJ(c0k0i.LIZLLL);
                        String str = c0k0i.LJIIIIZZ;
                        PGCSubLiveBanner pGCSubLiveBanner = c0k0i.LIZLLL.banner;
                        if (pGCSubLiveBanner == null || (string = Long.valueOf(pGCSubLiveBanner.id).toString()) == null) {
                            string = "";
                        }
                        c0k25.getClass();
                        C511970K5z c511970K5z = new C511970K5z("livesdk_subscribe_operation_top_banner_show");
                        c511970K5z.LIZIZ(strLIZJ, "subscribe_state");
                        c511970K5z.LIZIZ(str, "show_entrance");
                        c511970K5z.LIZIZ(string, "banner_id");
                        c511970K5z.LIZLLL();
                        View view3 = this.itemView;
                        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.leftMargin = (int) C511520K4g.LIZ(16.0f);
                            marginLayoutParams.rightMargin = (int) C511520K4g.LIZ(16.0f);
                            C786410Ut5.W5(view3, marginLayoutParams);
                            PGCSubLiveBanner pGCSubLiveBanner2 = c0k0i.LIZLLL.banner;
                            if (pGCSubLiveBanner2 != null) {
                                C0K21 c0k21LIZIZ = C0KLX.LIZIZ(pGCSubLiveBanner2);
                                C510680K1a c510680K1a = C510680K1a.LIZ;
                                Context context = this.itemView.getContext();
                                View view4 = this.itemView;
                                View view5 = this.LLILLJJLI;
                                TextView textView = this.LLILLL;
                                TextView textView2 = this.LLILZ;
                                AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c0k0i, 803);
                                c510680K1a.getClass();
                                int iLIZ = (int) C511520K4g.LIZ(8.0f);
                                Object c098200Yq = null;
                                BannerBackground bannerBackground = null;
                                c098200Yq = null;
                                if ((view5 instanceof C417400GYg) && (c417400GYg = (C417400GYg) view5) != null) {
                                    if (C511520K4g.LJIIIZ()) {
                                        c417400GYg.LIZJ(iLIZ, iLIZ, 0, 0);
                                    } else {
                                        c417400GYg.LIZJ(0, 0, iLIZ, iLIZ);
                                    }
                                }
                                textView2.setMaxLines(2);
                                String str2 = c0k21LIZIZ.LIZ;
                                String str3 = c0k21LIZIZ.LIZJ;
                                String str4 = c0k21LIZIZ.LJFF;
                                textView.setText(str2);
                                textView2.setText(str3);
                                if (str3.length() == 0) {
                                    C786410Ut5.LLIL(textView2, 8);
                                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                                    if (layoutParams2 != null) {
                                        C19ME c19me = (C19ME) layoutParams2;
                                        ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) C511520K4g.LIZ(23.0f);
                                        ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) C511520K4g.LIZ(23.0f);
                                        c19me.topToTop = 0;
                                        c19me.bottomToBottom = 0;
                                        C786410Ut5.W5(textView, c19me);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                    }
                                } else {
                                    C786410Ut5.LLIL(textView2, 0);
                                }
                                Integer numLIZ = C510680K1a.LIZ(str4);
                                if (numLIZ != null) {
                                    int iIntValue = numLIZ.intValue();
                                    textView.setTextColor(iIntValue);
                                    textView2.setTextColor(iIntValue);
                                }
                                textView.setMaxLines(2);
                                HandlerHook.viewPost(textView, new ARunnableS73S0200000_4(textView, numLIZ, 50));
                                C511420K3w.LJIIJ.getClass();
                                C511420K3w c511420K3w = new C511420K3w();
                                Object obj = c0k21LIZIZ.LIZIZ;
                                if (!(obj instanceof ImageModel)) {
                                    obj = null;
                                }
                                c511420K3w.LIZ = obj;
                                c511420K3w.LJIIIIZZ = true;
                                c511420K3w.LIZ(view5);
                                C786410Ut5.LJLLLLLL(0, view4);
                                C786410Ut5.I7(new ACListenerS74S0300000_7(context, c0k21LIZIZ, awS551S0100000_7, 22), view4);
                                try {
                                    if ((view4 instanceof C510610K0t) && (c510610K0t = (C510610K0t) view4) != null) {
                                        Object obj2 = c0k21LIZIZ.LJI;
                                        if (obj2 instanceof BannerBackground) {
                                            bannerBackground = (BannerBackground) obj2;
                                        }
                                        c510610K0t.setBackground(bannerBackground);
                                        c098200Yq = Unit.LIZ;
                                    }
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                    view4.setBackgroundColor(C426930God.LIZ(R.attr.f8h, context));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                };
            }
        })));
    }

    public static final Object invoke$18(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Collections.singletonList(new C482120IvS());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$180(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$181(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C511510K4f();
    }

    public static final Object invoke$182(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C511510K4f();
    }

    public static final Object invoke$183(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C511510K4f();
    }

    public static final Object invoke$184(AFwS193S0000000_7 aFwS193S0000000_7) {
        C0JCX.LIZ(2131839619);
        return Unit.LIZ;
    }

    public static final Object invoke$185(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C511510K4f();
    }

    public static final Object invoke$186(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C511510K4f();
    }

    public static final Object invoke$187(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C0K6O() { // from class: X.0K8c
            @Override // X.C0K6O
            public final boolean isAvailable() {
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
            @Override // X.C0K6O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(androidx.fragment.app.FragmentManager r47, java.lang.String r48, X.EnumC513420KBo r49) {
                /*
                    Method dump skipped, instruction units count: 210
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C512520K8c.LIZ(androidx.fragment.app.FragmentManager, java.lang.String, X.0KBo):void");
            }

            @Override // X.C0K6O
            public final void LIZLLL(FragmentManager fragmentManager, C0KCC c0kcc, Map<String, String> map) {
                if (PurchasePanelMigrationSettings.INSTANCE.isEnabled() && (Intrinsics.LJFF(c0kcc.LJJIFFI, EnumC513400KBm.PACKAGE_PAGE.getPageName()) || Intrinsics.LJFF(c0kcc.LJJIFFI, EnumC513400KBm.PACKAGE_PAGE_V2.getPageName()))) {
                    C0K19.LIZ(fragmentManager, C513520KBy.LIZIZ(SubPackagePageSheet.LLJZIJLIL, c0kcc, map, null, 124), "sub_package_page", null);
                } else {
                    C513510KBx.LIZ(c0kcc, map, null, 12).show(fragmentManager, "");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v3, types: [androidx.lifecycle.LifecycleObserver, com.ss.android.ugc.aweme.subscription.pgc.serviceimpl.LiveSdkSubscriptionPaymentServicePgc$observeBridgePaySuccessOnce$lifecycleObserver$1] */
            @Override // X.C0K6O
            public final void LIZIZ(FragmentManager fragmentManager, C0KCC c0kcc, Map<String, String> map, LifecycleOwner lifecycleOwner) {
                boolean z;
                Map<String, String> mapLIZJ;
                Object c098200Yq;
                Object objC3;
                Object c098200Yq2;
                ILivePurchasePanelBridge iLivePurchasePanelBridge = (ILivePurchasePanelBridge) PluggableExtentionKt.pluggableSpi$default(ILivePurchasePanelBridge.class, false, false, false, 14, null);
                if (iLivePurchasePanelBridge != null && iLivePurchasePanelBridge.isEnabled()) {
                    z = true;
                } else {
                    z = false;
                }
                Object obj = null;
                if (z) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    String str = (String) linkedHashMap.get("package_id");
                    if (str != null && str.length() > 0) {
                        mapLIZJ = C2097908Jt.LIZJ(new Pair("package_id", str));
                    } else {
                        mapLIZJ = null;
                    }
                    C13DA c13da = new C13DA();
                    String str2 = (String) linkedHashMap.get("previous_page");
                    if (str2 != null && str2.length() > 0) {
                        c13da.put("previous_page", str2);
                    }
                    c13da.put("enter_from", "sub_only_privilege_page");
                    String str3 = (String) linkedHashMap.get("show_entrance");
                    if (str3 != null && str3.length() > 0) {
                        c13da.put("series_enter_entrance", str3);
                    }
                    String str4 = (String) linkedHashMap.get("source_way");
                    if (str4 != null && str4.length() > 0) {
                        c13da.put("source_way", str4);
                    }
                    String str5 = c0kcc.LJIIJ;
                    if (str5 != null && str5.length() > 0) {
                        c13da.put("group_id", str5);
                    }
                    c13da.put("has_preview", Boolean.FALSE);
                    c13da.put("is_auto_triggered_paywall", Boolean.valueOf(iLivePurchasePanelBridge.LIZIZ()));
                    Map<String, ? extends Object> mapBuild = c13da.build();
                    if (!(!mapBuild.isEmpty())) {
                        mapBuild = null;
                    }
                    String str6 = c0kcc.LJJIJIIJIL;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = c0kcc.LIZ;
                    String str8 = c0kcc.LJJIJIL;
                    if (str8 == null) {
                        str8 = c0kcc.LIZIZ;
                    }
                    if (iLivePurchasePanelBridge.LIZ(str6, str7, str8, mapLIZJ, mapBuild)) {
                        String str9 = c0kcc.LIZ;
                        if (str9.length() != 0 && lifecycleOwner != null) {
                            boolean zLJFF = Intrinsics.LJFF(c0kcc.LJIIL, "homepage-entry");
                            try {
                                c098200Yq = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            ILiveOuterService iLiveOuterService = (ILiveOuterService) c098200Yq;
                            if (iLiveOuterService == null) {
                                objC3 = null;
                            } else {
                                try {
                                    objC3 = iLiveOuterService.C3();
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    objC3 = new C098200Yq(th2);
                                    C189200o6.m2constructorimpl(objC3);
                                }
                            }
                            C189200o6.m2constructorimpl(objC3);
                            if (!C189200o6.m7isFailureimpl(objC3)) {
                                obj = objC3;
                            }
                            final C0K77 c0k77 = (C0K77) obj;
                            if (c0k77 != null) {
                                final Object obj2 = new Object();
                                final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                                ?? r5 = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.subscription.pgc.serviceimpl.LiveSdkSubscriptionPaymentServicePgc$observeBridgePaySuccessOnce$lifecycleObserver$1
                                    @Override // androidx.lifecycle.LifecycleEventObserver
                                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                        if (event == Lifecycle.Event.ON_DESTROY) {
                                            try {
                                                c0k77.LJJIJL(obj2);
                                                C189200o6.m2constructorimpl(Unit.LIZ);
                                            } catch (Throwable th3) {
                                                TryCatchGuardChecker.doCheck(th3);
                                                C189200o6.m2constructorimpl(new C098200Yq(th3));
                                            }
                                            lifecycle.removeObserver(this);
                                        }
                                    }
                                };
                                lifecycle.addObserver(r5);
                                try {
                                    c0k77.LJJIJIIJI(obj2, new C512500K8a(str9, this, lifecycle, r5, lifecycleOwner, zLJFF, c0kcc, c0k77, obj2));
                                    c098200Yq2 = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    c098200Yq2 = new C098200Yq(th3);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                }
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                                    lifecycle.removeObserver(r5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                C0K19.LIZ(fragmentManager, C513520KBy.LIZIZ(SubPackagePageSheet.LLJZIJLIL, c0kcc, map, null, 124), "sub_package_page", null);
            }

            @Override // X.C0K6O
            public final void LIZJ(Context context, Map map, Map map2, Map map3, Map map4, Map map5, C0KOP c0kop, C0KR6 c0kr6) {
                String str;
                Object obj;
                String str2;
                String str3;
                String str4;
                Integer num;
                int iIntValue;
                String str5;
                String str6;
                String str7;
                String str8;
                String str9;
                String str10;
                Integer num2;
                Object obj2 = map.get("tpl_id");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                String str11 = "";
                if (str == null) {
                    str = "";
                }
                TemplateInfo templateInfo = new TemplateInfo();
                templateInfo.id = str;
                if (map2 != null) {
                    obj = map2.get("iap_id");
                } else {
                    obj = null;
                }
                if (!(obj instanceof String) || (str2 = (String) obj) == null) {
                    str2 = "";
                }
                templateInfo.iapId = str2;
                Object obj3 = map.get("package_id");
                if (!(obj3 instanceof String) || (str3 = (String) obj3) == null) {
                    str3 = "";
                }
                templateInfo.packageId = str3;
                OfferInfo offerInfo = new OfferInfo();
                Object obj4 = map.get("offer_id");
                if (!(obj4 instanceof String) || (str4 = (String) obj4) == null) {
                    str4 = "";
                }
                offerInfo.id = str4;
                templateInfo.offerInfo = offerInfo;
                Object obj5 = map.get("sub_circle");
                if (obj5 instanceof Integer) {
                    num = (Integer) obj5;
                } else {
                    num = null;
                }
                int iIntValue2 = 0;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                templateInfo.subCircle = iIntValue;
                Object obj6 = map.get("create_contract_intent");
                if ((obj6 instanceof Integer) && (num2 = (Integer) obj6) != null) {
                    iIntValue2 = num2.intValue();
                }
                templateInfo.createContractIntent = iIntValue2;
                String str12 = templateInfo.iapId;
                Object obj7 = map.get("offer_id");
                if (!(obj7 instanceof String) || (str5 = (String) obj7) == null) {
                    str5 = "";
                }
                Object obj8 = map.get("offer_token");
                if (!(obj8 instanceof String) || (str6 = (String) obj8) == null) {
                    str6 = "";
                }
                C13BV c13bv = C13BV.INSTANCE;
                Object obj9 = map.get("client_param");
                if (!(obj9 instanceof String) || (str7 = (String) obj9) == null) {
                    str7 = "";
                }
                PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = new PGCSubscriptionProductDetailWithTemplateInfo(templateInfo, new PGCSubscriptionProductDetail(str12, str5, str6, c13bv, str7));
                Object obj10 = map.get("to_uid");
                if (!(obj10 instanceof String) || (str8 = (String) obj10) == null) {
                    str8 = "";
                }
                Object obj11 = map.get("from_id");
                if (!(obj11 instanceof String) || (str9 = (String) obj11) == null) {
                    str9 = "";
                }
                Object obj12 = map.get("request_extra_param");
                if ((obj12 instanceof String) && (str10 = (String) obj12) != null) {
                    str11 = str10;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map3.size()));
                for (Map.Entry entry : map3.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
                if (map2 != null) {
                    for (Map.Entry entry3 : map2.entrySet()) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue().toString());
                    }
                }
                if (map4 != null) {
                    for (Map.Entry entry4 : map4.entrySet()) {
                        String str13 = (String) entry4.getKey();
                        Object value = entry4.getValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("purchase_option_");
                        sbLIZ.append(str13);
                        linkedHashMap2.put(C2188811AlT.LIZIZ(sbLIZ), value.toString());
                    }
                }
                if (map5 != null) {
                    for (Map.Entry entry5 : map5.entrySet()) {
                        String str14 = (String) entry5.getKey();
                        Object value2 = entry5.getValue();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("collection_");
                        sbLIZ2.append(str14);
                        linkedHashMap2.put(C2188811AlT.LIZIZ(sbLIZ2), value2.toString());
                    }
                }
                new C0KFK().LIZIZ(context, pGCSubscriptionProductDetailWithTemplateInfo, str8, str9, c0kop, linkedHashMap2, str11, false, EnumC513400KBm.PACKAGE_PAGE, false, null, c0kr6, linkedHashMap);
            }
        };
    }

    public static final Object invoke$188(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new InterfaceC736910SvR<InterfaceC482530Iw7>() { // from class: X.0Iw8
            public final C482520Iw6 LL = new InterfaceC482530Iw7() { // from class: X.0Iw6
                @Override // X.InterfaceC482530Iw7
                public final Object LJLJJI(C482560IwA c482560IwA) {
                    return C482300Ivk.LIZ.LIZLLL(c482560IwA);
                }

                @Override // X.InterfaceC482530Iw7
                public final Object o(List<String> list, EnumC482480Iw2 enumC482480Iw2, InterfaceC1364105Vn<? super BaseListResponse<AbstractC482420Ivw, FeedExtra>> interfaceC1364105Vn) {
                    C482300Ivk.LIZ.getClass();
                    return C2296808zG.LJ(new C482450Ivz(list, enumC482480Iw2, null), interfaceC1364105Vn);
                }
            };

            @Override // X.InterfaceC736910SvR
            public final void release() {
            }

            @Override // X.InterfaceC736910SvR
            public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
                return this.LL;
            }
        };
    }

    public static final Object invoke$189(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C474850Ijj.LIZIZ();
    }

    public static final Object invoke$19(AFwS193S0000000_7 aFwS193S0000000_7) {
        return LiveSubscribeLynxUrl.INSTANCE.getValue();
    }

    public static final Object invoke$190(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(TTSVoiceApi.class);
    }

    public static final Object invoke$191(AFwS193S0000000_7 aFwS193S0000000_7) {
        TTSVoiceApi.LIZ.getClass();
        return C487890JBj.LIZIZ.getValue();
    }

    public static final Object invoke$192(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C634700Ouy();
    }

    public static final Object invoke$193(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C487860JBg();
    }

    public static final Object invoke$194(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).oV1());
    }

    public static final Object invoke$195(AFwS193S0000000_7 aFwS193S0000000_7) {
        return LiveSubscribeLynxUrl.INSTANCE.getValue();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$196(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$197(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(VoiceConversionApi.class);
    }

    public static final Object invoke$198(AFwS193S0000000_7 aFwS193S0000000_7) {
        VoiceConversionApi.LIZ.getClass();
        return C487940JBo.LIZIZ.getValue();
    }

    public static final Object invoke$199(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C634700Ouy();
    }

    public static final Object invoke$2(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C469950Ibp();
    }

    public static final Object invoke$20(AFwS193S0000000_7 aFwS193S0000000_7) {
        C781270Ukn.LJJIII().xf();
        return C0JT9.LIZIZ(0, "live_take_page", null);
    }

    public static final Object invoke$200(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C487930JBn();
    }

    public static final Object invoke$201(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$202(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C0NSL.LIZ().create(OrderCenterGuideDialogApi.class);
    }

    public static final Object invoke$203(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new OrderCenterGuideDialogRepository();
    }

    public static final Object invoke$204(AFwS193S0000000_7 aFwS193S0000000_7) {
        boolean z = FollowLiveDataFetchManager.LIZ;
        FollowLiveDataFetchManager.LIZIZ = false;
        C11JF c11jf = FollowLiveDataFetchManager.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C0IV8 c0iv8 = FollowLiveDataFetchManager.LJ;
        if (c0iv8 != null) {
            ((C0IV7) c0iv8).LIZIZ(C0IVF.PAUSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$205(AFwS193S0000000_7 aFwS193S0000000_7) {
        C0IV8 c0iv8;
        if (FollowLiveDataFetchManager.LIZLLL() && (c0iv8 = FollowLiveDataFetchManager.LJ) != null) {
            ((C0IV7) c0iv8).LIZIZ(C0IVF.RESUME);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$206(AFwS193S0000000_7 aFwS193S0000000_7) {
        boolean z = FollowLiveDataFetchManager.LIZ;
        FollowLiveDataFetchManager.LIZIZ = false;
        C11JF c11jf = FollowLiveDataFetchManager.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C0IV8 c0iv8 = FollowLiveDataFetchManager.LJ;
        if (c0iv8 != null) {
            ((C0IV7) c0iv8).LIZIZ(C0IVF.STOP);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$207(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C467460IUu();
    }

    public static final Object invoke$208(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C467480IUw.LIZIZ.getValue();
    }

    public static final Object invoke$209(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C721340SRg(true);
    }

    public static final Object invoke$21(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C11NJ();
    }

    public static final Object invoke$210(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C721340SRg(true);
    }

    public static final Object invoke$211(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C721340SRg(true);
    }

    public static final Object invoke$212(AFwS193S0000000_7 aFwS193S0000000_7) {
        if (C467220ITw.LJIILJJIL == 1) {
            C469660IbM.LIZJ("confirm_toast");
        }
        C467220ITw.LJIILJJIL = 0;
        return Unit.LIZ;
    }

    public static final Object invoke$213(AFwS193S0000000_7 aFwS193S0000000_7) {
        if (C467220ITw.LJIILIIL == 1) {
            C469660IbM.LIZJ("sug_toast");
        }
        C467220ITw.LJIILIIL = 0;
        return Unit.LIZ;
    }

    public static final Object invoke$214(AFwS193S0000000_7 aFwS193S0000000_7) {
        if (C467220ITw.LJIIL == 1) {
            C469660IbM.LIZJ("notification_toast");
        }
        C467220ITw.LJIIL = 0;
        return Unit.LIZ;
    }

    public static final Object invoke$215(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C13LQ.LJLIIL(new String[]{"homepage_hot_video_head", "homepage_hot_live_cell", "live_end_live_cover", "live_merge_live_cover"});
    }

    public static final Object invoke$216(AFwS193S0000000_7 aFwS193S0000000_7) {
        ArrayList arrayList = new ArrayList(C464770IKl.LJIIL);
        arrayList.addAll(RecommendEndAtFollowingSetting.INSTANCE.getValue().followUnreadExtraList);
        return arrayList;
    }

    public static final Object invoke$217(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveAutoPlaybookGuideGoLiveSetting.INSTANCE.isV2());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$218(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$219(AFwS193S0000000_7 aFwS193S0000000_7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$22(AFwS193S0000000_7 aFwS193S0000000_7) {
        return LiveSubscribeLynxUrl.INSTANCE.getValue();
    }

    public static final Object invoke$220(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ((String) C0JCJ.LIZ.getValue());
    }

    public static final Object invoke$221(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C516050KLr.LIZ;
    }

    public static final Object invoke$222(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C516050KLr.LIZ;
    }

    public static final Object invoke$223(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C516140KMa();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$224(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$225(AFwS193S0000000_7 aFwS193S0000000_7) {
        C766270U4b.LIZLLL(2131851936);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$226(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$227(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$228(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$229(AFwS193S0000000_7 aFwS193S0000000_7) {
        C480460Ism.LIZ().getClass();
        return C480460Ism.LIZLLL(IPcsCourseApi.class);
    }

    public static final Object invoke$23(AFwS193S0000000_7 aFwS193S0000000_7) {
        C781270Ukn.LJJIII().xf();
        return C0JT9.LIZIZ(0, "live_take_page", null);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$230(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$231(AFwS193S0000000_7 aFwS193S0000000_7) {
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei().getClass();
        return C516010KLn.LIZ;
    }

    public static final Object invoke$232(AFwS193S0000000_7 aFwS193S0000000_7) {
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Ae().getClass();
        return new C0KKG();
    }

    public static final Object invoke$233(AFwS193S0000000_7 aFwS193S0000000_7) {
        C784440Upu.LIZ().LIZIZ(new C0JOK());
        return Unit.LIZ;
    }

    public static final Object invoke$234(AFwS193S0000000_7 aFwS193S0000000_7) {
        C784440Upu.LIZ().LIZIZ(new DismissUserProfileEvent());
        return Unit.LIZ;
    }

    public static final Object invoke$235(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((InterfaceC2661011f) C0JCJ.LIZIZ.getValue()).create(C0K4O.class);
    }

    public static final Object invoke$236(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new InterfaceC511350K3p() { // from class: X.0K4N
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(235));

            public final C0K4O LIZLLL() {
                return (C0K4O) this.LIZ.getValue();
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCSettingsResponse.ResponseData>> getSpaceSettings() {
                return LIZLLL().getSpaceSettings();
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCTopicResponse.ResponseData>> getSpaceTopics() {
                return LIZLLL().getSpaceTopics();
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCPostActionResponse>> LIZ(PGCPostActionRequest pGCPostActionRequest) {
                return LIZLLL().LIZ(pGCPostActionRequest);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCCommentActionResponse>> LIZIZ(PGCCommentActionRequest pGCCommentActionRequest) {
                return LIZLLL().LIZIZ(pGCCommentActionRequest);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PostDeleteResponse.ResponseData>> deletePost(long j) {
                return LIZLLL().deletePost(j);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCPostCreateResp.ResponseData>> e(PGCPostCreateReq pGCPostCreateReq) {
                return LIZLLL().e(pGCPostCreateReq);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<HomePageResponse.ResponseData>> getSpaceHome(String str) {
                return LIZLLL().getSpaceHome(str);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCSpaceActivityListResponse.ResponseData>> getSubSpaceActivityList(String str) {
                return LIZLLL().getSubSpaceActivityList(str);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCSpaceJoinResponse>> joinSpace(String str) {
                return LIZLLL().joinSpace(str);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCCommentSendResp.ResponseData>> n1(PGCCommentSendReq pGCCommentSendReq) {
                return LIZLLL().n1(pGCCommentSendReq);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCSpaceQuitResponse>> quitSpace(String str) {
                return LIZLLL().quitSpace(str);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCCommentDeleteResponse>> deleteComment(long j, long j2) {
                return LIZLLL().deleteComment(j, j2);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCSpaceMembersResponse.ResponseData>> getSpaceMembers(String str, long j) {
                return LIZLLL().getSpaceMembers(str, j);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCPostPinActionResponse.ResponseData>> postPinAction(long j, int i) {
                return LIZLLL().postPinAction(j, i);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ LIZJ(long j, long j2, long j3) {
                return LIZLLL().getPollUserList(j, j2, j3, 0L);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCPostPageResponse.ResponseData>> getPostPage(String str, long j, long j2) {
                return LIZLLL().getPostPage(str, j, j2);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCPollVoteResponse.ResponseData>> pollVote(long j, long j2, long j3) {
                return LIZLLL().pollVote(j, j2, j3);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCPostDetailResponse.ResponseData>> getPostDetail(long j, String str, long j2, int i) {
                return LIZLLL().getPostDetail(j, str, j2, i);
            }

            @Override // X.InterfaceC511350K3p
            public final C11NZ<DataResponse<PGCCommentPageResponse.ResponseData>> getCommentPages(long j, long j2, String str, int i, long j3) {
                return LIZLLL().getCommentPages(j, j2, str, i, j3);
            }
        };
    }

    public static final Object invoke$237(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C516140KMa();
    }

    public static final Object invoke$238(AFwS193S0000000_7 aFwS193S0000000_7) {
        InterfaceC1106030et7.w9.LJFF(Boolean.TRUE);
        C01CC.LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$239(AFwS193S0000000_7 aFwS193S0000000_7) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_whisper_bubble_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().LJIJJLI().getId()), "user_id");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS193S0000000_7 aFwS193S0000000_7) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$240(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Float.valueOf(C480730ItD.LIZ());
    }

    public static final Object invoke$241(AFwS193S0000000_7 aFwS193S0000000_7) {
        C766270U4b.LIZLLL(2131851936);
        return Unit.LIZ;
    }

    public static final Object invoke$242(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$243(AFwS193S0000000_7 aFwS193S0000000_7) {
        return PluggableExtentionKt.pluggableSpi$default(IPublishGuideDraftService.class, false, false, false, 14, null);
    }

    public static final Object invoke$244(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new JSONObject();
    }

    public static final Object invoke$245(AFwS193S0000000_7 aFwS193S0000000_7) {
        C477860Ioa.LIZJ(0L, "random_match_landing_page", "close");
        return Unit.LIZ;
    }

    public static final Object invoke$246(AFwS193S0000000_7 aFwS193S0000000_7) {
        return LiveEasyExitCardSetting.INSTANCE.getConfig();
    }

    public static final Object invoke$247(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC1596380re0.class);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$248(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$249(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$25(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new AbstractC1132980faa() { // from class: X.0Itb
            @Override // X.AbstractC1132980faa
            public final void LIZIZ(List<Gift> list) {
            }

            @Override // X.AbstractC1132980faa
            public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i) {
            }
        };
    }

    public static final Object invoke$250(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Keva.getRepo("top_live_tab");
    }

    public static final Object invoke$251(AFwS193S0000000_7 aFwS193S0000000_7) {
        C0K5Y.LIZ.getClass();
        return C0K5Z.LIZIZ.getValue();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$252(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$253(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new InterfaceC943980afk() { // from class: X.0J3h
            @Override // X.InterfaceC943980afk
            public final View LIZ(int i) {
                C0J3Y.LIZ.getClass();
                return C0J3Y.LJIIIIZZ(i);
            }

            @Override // X.InterfaceC943980afk
            public final View LIZJ(ViewGroup viewGroup) {
                return C0J3Y.LIZ.LJI(R.layout.grs);
            }

            @Override // X.InterfaceC943980afk
            public final void LIZIZ(Context context, int i, String str, RecyclerView recyclerView, int i2) {
                C0J3Y c0j3y = C0J3Y.LIZ;
                c0j3y.getClass();
                if (C0J3Y.LJIIIIZZ == null && C520010KaN.LJJIIZI(context, false) != null) {
                    C0J3Y.LJIIJJI(context);
                }
                if (i2 == 1) {
                    C0J3Y.LJIILIIL(i, recyclerView, C485760J3e.LIZIZ(str), EnumC485780J3g.FIRST_FRAME, true);
                } else {
                    c0j3y.LJIILL(i, recyclerView, i2, C485760J3e.LIZIZ(str), EnumC485780J3g.FIRST_FRAME, true);
                }
            }
        };
    }

    public static final Object invoke$254(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C474850Ijj.LIZIZ();
    }

    public static final Object invoke$255(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad());
    }

    public static final Object invoke$256(AFwS193S0000000_7 aFwS193S0000000_7) {
        float f;
        if (LiveSkylightStyleSetting.INSTANCE.enableStyleV2()) {
            f = 18.0f;
        } else {
            f = 4.0f;
        }
        return Integer.valueOf((int) C497740JfY.LIZIZ(f));
    }

    public static final Object invoke$257(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Float.valueOf(C497740JfY.LIZIZ(C474850Ijj.LIZLLL()));
    }

    public static final Object invoke$258(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(AiLiveSummarySetting.INSTANCE.enable());
    }

    public static final Object invoke$259(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveMarkViewerOptimizationSetting.INSTANCE.getValue());
    }

    public static final Object invoke$26(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new AbstractC1132980faa() { // from class: X.0Itc
            @Override // X.AbstractC1132980faa
            public final void LIZIZ(List<Gift> list) {
            }

            @Override // X.AbstractC1132980faa
            public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j, int i) {
            }
        };
    }

    public static final Object invoke$260(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveHostAiGeneratedToggleSetting.INSTANCE.enable());
    }

    public static final Object invoke$261(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(!HostAddLocationSetting.INSTANCE.enable());
    }

    public static final Object invoke$262(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(ILiveDecisionService.class);
    }

    public static final Object invoke$263(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(IHostPerformanceOpt.class);
    }

    public static final Object invoke$264(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C482950Iwn(C482930Iwl.LLLF);
    }

    public static /* bridge */ /* synthetic */ Object invoke$265(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C786410Ut5.h4();
    }

    public static final Object invoke$266(AFwS193S0000000_7 aFwS193S0000000_7) {
        if (LayoutBizConfigReadSourceSetting.INSTANCE.isEnable()) {
            try {
                C939890aZ9.LIZ.getClass();
                return new JSONObject(C465260IMi.LIZ());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new JSONObject();
            }
        }
        return new JSONObject(MultiGuestLayoutBizConfigSetting.INSTANCE.getSettingValue());
    }

    public static final Object invoke$267(AFwS193S0000000_7 aFwS193S0000000_7) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$268(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).wJ2());
    }

    public static final Object invoke$269(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C2097608Jq.LJIIIIZZ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("page_name", "video"), new Pair("source_page_type", "video"), new Pair("is_ad", 1), new Pair("rec_params", ""));
    }

    public static final Object invoke$27(AFwS193S0000000_7 aFwS193S0000000_7) {
        final Context contextLJII = C497740JfY.LJII();
        return new OrientationEventListener(contextLJII) { // from class: X.0IYz
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
            
                if (r4 < 190) goto L13;
             */
            @Override // android.view.OrientationEventListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onOrientationChanged(int r4) {
                /*
                    r3 = this;
                    r0 = -1
                    if (r4 != r0) goto L4
                    return
                L4:
                    r0 = 350(0x15e, float:4.9E-43)
                    r2 = 1
                    if (r4 > r0) goto L16
                    r0 = 10
                    if (r4 < r0) goto L16
                    r0 = 171(0xab, float:2.4E-43)
                    r1 = 0
                    if (r0 > r4) goto L1c
                    r0 = 190(0xbe, float:2.66E-43)
                    if (r4 >= r0) goto L2a
                L16:
                    com.bytedance.android.livesdk.chatroom.helper.AudienceOrientationManager r0 = com.bytedance.android.livesdk.chatroom.helper.AudienceOrientationManager.LIZ
                    r0.LIZ(r2)
                L1b:
                    return
                L1c:
                    r0 = 81
                    if (r0 > r4) goto L1b
                    r0 = 100
                    if (r4 >= r0) goto L2a
                L24:
                    com.bytedance.android.livesdk.chatroom.helper.AudienceOrientationManager r0 = com.bytedance.android.livesdk.chatroom.helper.AudienceOrientationManager.LIZ
                    r0.LIZ(r1)
                    return
                L2a:
                    r0 = 261(0x105, float:3.66E-43)
                    if (r0 > r4) goto L1b
                    r0 = 280(0x118, float:3.92E-43)
                    if (r4 >= r0) goto L1b
                    goto L24
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C468550IYz.onOrientationChanged(int):void");
            }
        };
    }

    public static final Object invoke$270(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline());
    }

    public static final Object invoke$271(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((IHostMonitorAndLog) C1161920gLG.LIZJ(IHostMonitorAndLog.class)).Ru2();
    }

    public static final Object invoke$272(AFwS193S0000000_7 aFwS193S0000000_7) {
        long jG42;
        IAdLiveHelperService iAdLiveHelperService = (IAdLiveHelperService) C1161920gLG.LIZJ(IAdLiveHelperService.class);
        if (iAdLiveHelperService != null) {
            jG42 = iAdLiveHelperService.g42();
        } else {
            jG42 = 3000;
        }
        return Long.valueOf(jG42);
    }

    public static final Object invoke$273(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C463900IHc();
    }

    public static final Object invoke$274(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((IHostMonitorAndLog) C1161920gLG.LIZJ(IHostMonitorAndLog.class)).Ru2();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$275(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$276(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$277(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$278(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(IHostFriends.class);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$279(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$28(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveScrollUpInterceptOpt.INSTANCE.enable());
    }

    public static final Object invoke$280(AFwS193S0000000_7 aFwS193S0000000_7) {
        EnterRoomConfig.RoomsData roomsData = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData;
        String str = roomsData.enterFromMerge;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = roomsData.enterMethod;
        if (str3 != null) {
            str2 = str3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$281(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new CopyOnWriteArrayList();
    }

    public static final Object invoke$282(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).TS1();
    }

    public static final Object invoke$283(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new HashMap();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$284(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$285(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$286(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$287(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$288(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$289(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C482950Iwn(C484860Izs.LJJII);
    }

    public static final Object invoke$29(AFwS193S0000000_7 aFwS193S0000000_7) {
        return 20;
    }

    public static final Object invoke$290(AFwS193S0000000_7 aFwS193S0000000_7) {
        return LiveRepostStrategyV2Config.INSTANCE.config();
    }

    public static final Object invoke$291(AFwS193S0000000_7 aFwS193S0000000_7) {
        String str;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (LiveRepostNewAwarenessStoreSetting.INSTANCE.hitExperiment()) {
            str = "live_repost_record_repo_v2";
        } else {
            str = "live_repost_record_repo";
        }
        sbLIZ.append(str);
        sbLIZ.append(currentUserId);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object invoke$292(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$293(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).vx2());
    }

    public static final Object invoke$294(AFwS193S0000000_7 aFwS193S0000000_7) {
        FeedItem feedItem = new FeedItem();
        feedItem.type = 101;
        return feedItem;
    }

    public static final Object invoke$295(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C0KF4();
    }

    public static final Object invoke$296(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C514330KFb();
    }

    public static final Object invoke$297(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Keva.getRepo("multi_guest_top_live");
    }

    public static final Object invoke$298(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new CopyOnWriteArraySet();
    }

    public static final Object invoke$299(AFwS193S0000000_7 aFwS193S0000000_7) {
        C0KL4 c0kl4 = new C0KL4();
        c0kl4.LIZ();
        return c0kl4;
    }

    public static final Object invoke$3(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$30(AFwS193S0000000_7 aFwS193S0000000_7) {
        return 2000L;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$300(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$301(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveCombineRequestExp.INSTANCE.enableForLog());
    }

    public static final Object invoke$302(AFwS193S0000000_7 aFwS193S0000000_7) {
        return InterfaceC1106030et7.U9.LIZIZ();
    }

    public static final Object invoke$303(AFwS193S0000000_7 aFwS193S0000000_7) throws NoSuchMethodException {
        Constructor declaredConstructor = C483590Ixp.class.getDeclaredConstructor(FrameLayout.class);
        declaredConstructor.setAccessible(true);
        return declaredConstructor;
    }

    public static final Object invoke$304(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Keva.getRepo("top_live_tab");
    }

    public static final Object invoke$305(AFwS193S0000000_7 aFwS193S0000000_7) {
        ISubscribeService iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class);
        if (iSubscribeService != null && iSubscribeService.Ae() != null) {
            return C516700KOe.LIZ();
        }
        return "";
    }

    public static final Object invoke$306(AFwS193S0000000_7 aFwS193S0000000_7) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131835079));
        return Unit.LIZ;
    }

    public static final Object invoke$307(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Integer.valueOf(MultiGuestTopLivePreloadConfigSetting.getValue().feedDataTimeoutThreshold);
    }

    public static final Object invoke$308(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Integer.valueOf(MultiGuestTopLiveRequestingCacelThresholdSetting.INSTANCE.getValue());
    }

    public static final Object invoke$309(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Integer.valueOf(MultiGuestTopLivePreloadConfigSetting.getValue().feedDataTimeoutThreshold);
    }

    public static final Object invoke$31(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C13LQ.LJLIIIL(LiveSmallApiAllowList.INSTANCE.getValue());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$310(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$311(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$312(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C478250IpD();
    }

    public static final Object invoke$313(AFwS193S0000000_7 aFwS193S0000000_7) {
        C0K5Y.LIZ.getClass();
        return C0K5Z.LIZIZ.getValue();
    }

    public static final Object invoke$314(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<StrategyTrigger> list;
        ArrayList arrayList = null;
        C469620IbI.LIZ.getClass();
        StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(10, null, true, true, false);
        if (strategyDataLIZIZ != null && (list = strategyDataLIZIZ.trigger) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (StrategyTrigger strategyTrigger : list) {
                if (strategyTrigger.cepRuleName.length() == 0) {
                    arrayList2.add(strategyTrigger);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((StrategyTrigger) it2.next()).cepExpression);
            }
        }
        return arrayList;
    }

    public static final Object invoke$315(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(ILiveDecisionService.class);
    }

    public static final Object invoke$316(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Long.valueOf(LiveDynamicStrategySetting.getValue().strategyOverTime);
    }

    public static final Object invoke$317(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Float.valueOf(C497740JfY.LJIIZILJ());
    }

    public static final Object invoke$318(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C478220IpA();
    }

    public static final Object invoke$319(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C478230IpB();
    }

    public static final Object invoke$32(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveInnerWindowEnable.INSTANCE.getValue());
    }

    public static final Object invoke$320(AFwS193S0000000_7 aFwS193S0000000_7) {
        C497590JfJ c497590JfJKz2;
        IWalletCenter iWalletCenterWalletCenter;
        ArrayList arrayList = new ArrayList();
        C496200Jd4 c496200Jd4UL2 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).uL2();
        if (c496200Jd4UL2 != null) {
            arrayList.add(c496200Jd4UL2);
        }
        arrayList.add(new AbstractC497160Jec<C470590Icr<UnifyBaseBusinessResponse.Data>, C496230Jd7>() { // from class: X.0JfG
            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ boolean LIZ(C496230Jd7 c496230Jd7) {
                return true;
            }

            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/room/unify_base/get_middle_touch/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<C470590Icr<UnifyBaseBusinessResponse.Data>>() { // from class: X.0JfH
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<UnifyBaseBusinessResponse.Data>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                Room room = c496230Jd7.LIZ;
                if (room == null) {
                    return null;
                }
                return C2097608Jq.LJIIIIZZ(new Pair("room_id", String.valueOf(room.getId())), new Pair("anchor_id", String.valueOf(room.getOwner().getId())), new Pair("unify_base_id", "3"));
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<UnifyBaseBusinessResponse.Data> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        });
        arrayList.add(new AbstractC497160Jec<C470590Icr<BannerInRoomCollection>, C496230Jd7>() { // from class: X.0JfF
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/room/in_room_banner/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return TypeToken.getParameterized(C470590Icr.class, BannerInRoomCollection.class).getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<BannerInRoomCollection>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final boolean LIZ(C496230Jd7 c496230Jd7) {
                RoomAuthStatus roomAuthStatus;
                Room room = c496230Jd7.LIZ;
                if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.getBannerState() != 2 && LiveBannerDegradeSettings.INSTANCE.enableBanner()) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                Long lValueOf;
                Pair[] pairArr = new Pair[2];
                Room room = c496230Jd7.LIZ;
                if (room != null) {
                    lValueOf = Long.valueOf(room.getId());
                } else {
                    lValueOf = null;
                }
                pairArr[0] = new Pair("room_id", String.valueOf(lValueOf));
                pairArr[1] = new Pair("user_type", "1");
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<BannerInRoomCollection> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        });
        arrayList.add(new AbstractC497160Jec<C470590Icr<CohostCheckPointResponse.CohostCheckPointData>, C496230Jd7>() { // from class: X.0JfC
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/cohost/cohost_checkpoint/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return TypeToken.getParameterized(C470590Icr.class, CohostCheckPointResponse.CohostCheckPointData.class).getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<CohostCheckPointResponse.CohostCheckPointData>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                return C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "2"), new Pair("inviter_id", CardStruct.IStatusCode.DEFAULT));
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<CohostCheckPointResponse.CohostCheckPointData> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        });
        arrayList.add(new AbstractC497160Jec<C470590Icr<List<? extends RankEntranceV3Response.EntranceGroup>>, C496230Jd7>() { // from class: X.0Jer
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/ranklist/entrance/v3/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<C470590Icr<List<? extends RankEntranceV3Response.EntranceGroup>>>() { // from class: X.0Jes
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<List<? extends RankEntranceV3Response.EntranceGroup>>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                Long lValueOf;
                User owner;
                C496230Jd7 c496230Jd72 = c496230Jd7;
                Pair[] pairArr = new Pair[2];
                Room room = c496230Jd72.LIZ;
                Long lValueOf2 = null;
                if (room != null && (owner = room.getOwner()) != null) {
                    lValueOf = Long.valueOf(owner.getId());
                } else {
                    lValueOf = null;
                }
                pairArr[0] = new Pair("anchor_id", String.valueOf(lValueOf));
                Room room2 = c496230Jd72.LIZ;
                if (room2 != null) {
                    lValueOf2 = Long.valueOf(room2.getId());
                }
                pairArr[1] = new Pair("room_id", String.valueOf(lValueOf2));
                return C2097608Jq.LJIIJ(pairArr);
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<List<? extends RankEntranceV3Response.EntranceGroup>> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        });
        arrayList.add(new AbstractC497160Jec<C470590Icr<RedEnvelopeListResponse>, C496230Jd7>() { // from class: X.0Jf8
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/envelope/list/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<C470590Icr<RedEnvelopeListResponse>>() { // from class: X.0Jf9
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<RedEnvelopeListResponse>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                Long lValueOf;
                String secUid;
                User owner;
                C496230Jd7 c496230Jd72 = c496230Jd7;
                Pair[] pairArr = new Pair[2];
                Room room = c496230Jd72.LIZ;
                if (room != null) {
                    lValueOf = Long.valueOf(room.getId());
                } else {
                    lValueOf = null;
                }
                pairArr[0] = new Pair("room_id", String.valueOf(lValueOf));
                Room room2 = c496230Jd72.LIZ;
                if (room2 == null || (owner = room2.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                    secUid = "";
                }
                pairArr[1] = new Pair("sec_anchor_id", secUid);
                return C2097608Jq.LJIIJ(pairArr);
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<RedEnvelopeListResponse> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        });
        arrayList.add(new AbstractC497160Jec<C470590Icr<PortalListResponse.ResponseData>, C496230Jd7>() { // from class: X.0JfA
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/portal/list/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<C470590Icr<PortalListResponse.ResponseData>>() { // from class: X.0JfB
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<PortalListResponse.ResponseData>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                Long lValueOf;
                C496230Jd7 c496230Jd72 = c496230Jd7;
                Pair[] pairArr = new Pair[2];
                Room room = c496230Jd72.LIZ;
                Long lValueOf2 = null;
                if (room != null) {
                    lValueOf = Long.valueOf(room.getId());
                } else {
                    lValueOf = null;
                }
                pairArr[0] = new Pair("room_id", String.valueOf(lValueOf));
                Room room2 = c496230Jd72.LIZ;
                if (room2 != null) {
                    lValueOf2 = Long.valueOf(room2.getOwnerUserId());
                }
                pairArr[1] = new Pair("anchor_id", String.valueOf(lValueOf2));
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<PortalListResponse.ResponseData> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        });
        arrayList.add(new AbstractC497160Jec<C470590Icr<RevenuePermissionResponse.ResponseData>, C496230Jd7>() { // from class: X.0JfD
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "POST";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/revenue/permission/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "application/json; charset=utf-8";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<C470590Icr<RevenuePermissionResponse.ResponseData>>() { // from class: X.0JfE
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<RevenuePermissionResponse.ResponseData>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                Long lValueOf;
                User owner;
                C496230Jd7 c496230Jd72 = c496230Jd7;
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("need_bizs", "3");
                Room room = c496230Jd72.LIZ;
                String secUid = null;
                if (room != null) {
                    lValueOf = Long.valueOf(room.getId());
                } else {
                    lValueOf = null;
                }
                pairArr[1] = new Pair("room_id", String.valueOf(lValueOf));
                Room room2 = c496230Jd72.LIZ;
                if (room2 != null && (owner = room2.getOwner()) != null) {
                    secUid = owner.getSecUid();
                }
                pairArr[2] = new Pair("sec_anchor_id", String.valueOf(secUid));
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<RevenuePermissionResponse.ResponseData> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        });
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && (iWalletCenterWalletCenter = iWalletService.walletCenter()) != null) {
            C1805440x5C c1805440x5CPj0 = iWalletCenterWalletCenter.pj0();
            if (c1805440x5CPj0 != null) {
                arrayList.add(c1805440x5CPj0);
            }
            C1805490x5H c1805490x5HON1 = iWalletCenterWalletCenter.oN1();
            if (c1805490x5HON1 != null) {
                arrayList.add(c1805490x5HON1);
            }
            C1805390x57 c1805390x57UC0 = iWalletCenterWalletCenter.uC0();
            if (c1805390x57UC0 != null) {
                arrayList.add(c1805390x57UC0);
            }
        }
        C1151220g40 c1151220g40Te2 = ((ITreasureBoxService) C1161920gLG.LIZJ(ITreasureBoxService.class)).Te2();
        if (c1151220g40Te2 != null) {
            arrayList.add(c1151220g40Te2);
        }
        ICommentService iCommentService = (ICommentService) C1161920gLG.LIZJ(ICommentService.class);
        if (iCommentService != null && (c497590JfJKz2 = iCommentService.kz2()) != null) {
            arrayList.add(c497590JfJKz2);
        }
        arrayList.add(new AbstractC497160Jec<C470590Icr<SMBPreviewResponse.ResponseData>, C496230Jd7>() { // from class: X.0Jei
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/sub/smb/preview/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<C470590Icr<SMBPreviewResponse.ResponseData>>() { // from class: X.0Jej
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<SMBPreviewResponse.ResponseData>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final boolean LIZ(C496230Jd7 c496230Jd7) {
                return C1083940eJU.LIZIZ(c496230Jd7.LIZ);
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                String secUid;
                Long lValueOf;
                User owner;
                C496230Jd7 c496230Jd72 = c496230Jd7;
                Pair[] pairArr = new Pair[2];
                Room room = c496230Jd72.LIZ;
                if (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                    secUid = "";
                }
                pairArr[0] = new Pair("sec_anchor_id", secUid);
                Room room2 = c496230Jd72.LIZ;
                if (room2 != null) {
                    lValueOf = Long.valueOf(room2.getId());
                } else {
                    lValueOf = null;
                }
                pairArr[1] = new Pair("room_id", String.valueOf(lValueOf));
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<SMBPreviewResponse.ResponseData> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        });
        return arrayList;
    }

    public static final Object invoke$321(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C488700JEm();
    }

    public static final Object invoke$322(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new ViewModelStore();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$323(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$324(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$325(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new Stack();
    }

    public static final Object invoke$326(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new HashMap();
    }

    public static final Object invoke$327(AFwS193S0000000_7 aFwS193S0000000_7) {
        return LiveEasyExitCardSetting.INSTANCE.getConfig();
    }

    public static final Object invoke$328(AFwS193S0000000_7 aFwS193S0000000_7) {
        return LiveEasyExitCardSetting.INSTANCE.getConfig();
    }

    public static final Object invoke$329(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$33(AFwS193S0000000_7 aFwS193S0000000_7) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LiveInnerWindowConfig liveInnerWindowConfig = LiveInnerWindowConfig.INSTANCE;
        Map<String, WindowPageConfig> lynx = liveInnerWindowConfig.getValue().getLynx();
        if (lynx == null) {
            lynx = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(lynx);
        Map<String, WindowPageConfig> mapLJ = liveInnerWindowConfig.getValue().getNative();
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(mapLJ);
        return linkedHashMap;
    }

    public static final Object invoke$330(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C2097608Jq.LJIIJ(new Pair("test_request_id", new InterfaceC467580IVg() { // from class: X.0IVm
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return c467600IVi.LIZ.mLogData.testRequestId;
            }
        }), new Pair("log_context_error", new InterfaceC467580IVg() { // from class: X.0IWB
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return String.valueOf(c467600IVi.LIZ.mRoomsData.roomId);
            }
        }), new Pair("anchor_id", new InterfaceC467580IVg() { // from class: X.0IW3
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                User owner = c467600IVi.LIZIZ.getOwner();
                if (owner != null) {
                    return Long.valueOf(owner.getId()).toString();
                }
                return null;
            }
        }), new Pair("is_video_head", new InterfaceC467580IVg() { // from class: X.0IVb
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                if (C500260Jjc.LJJJI(Boolean.valueOf(c467600IVi.LIZ.mLogData.isVideoHead))) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
        }), new Pair("hashtag_id", new InterfaceC467580IVg() { // from class: X.0IW5
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                Long l;
                Hashtag hashtag = c467600IVi.LIZIZ.hashtag;
                if (hashtag == null || (l = hashtag.id) == null) {
                    return null;
                }
                return l.toString();
            }
        }), new Pair("live_session_id", new InterfaceC467580IVg() { // from class: X.0IWO
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return C0IL2.LIZ.LJ;
            }
        }), new Pair("log_pb", new InterfaceC467580IVg() { // from class: X.0IVe
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return c467600IVi.LIZ.mLogData.logPb;
            }
        }), new Pair("event_page", new InterfaceC467580IVg() { // from class: X.0IWR
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return "live_detail";
            }
        }), new Pair("is_commerce_inner_flow", new InterfaceC467580IVg() { // from class: X.0IW4
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                C01GW<C468070IXd> c01gw = C468070IXd.LJIIIIZZ;
                if (C0IFC.LIZ().LIZIZ()) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
        }), new Pair("content_type", new InterfaceC467580IVg() { // from class: X.0IVa
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                if (C500260Jjc.LJJJI(c467600IVi.LIZ.mLogData.isInRoomInfoList)) {
                    String str = c467600IVi.LIZ.mRoomsData.enterMethod;
                    if (str == null) {
                        return null;
                    }
                    RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                    RankTypeV2 rankTypeV2LIZIZ = C235000vU.LIZIZ(str);
                    if (!Intrinsics.LJFF(rankTypeV2LIZIZ, RankTypeV2.LJJIJIIJI)) {
                        return rankTypeV2LIZIZ.rankName;
                    }
                    return str;
                }
                return "live_merge_content";
            }
        }), new Pair("initial_follow_status", new InterfaceC467580IVg() { // from class: X.0IWC
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return String.valueOf(c467600IVi.LIZ.mRoomsData.followStatus);
            }
        }), new Pair("toplive_position", new InterfaceC467580IVg() { // from class: X.0IWI
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return c467600IVi.LIZ.mLogData.toplivePosition;
            }
        }), new Pair("hashtag_name", new InterfaceC467580IVg() { // from class: X.0IW7
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                Hashtag hashtag = c467600IVi.LIZIZ.hashtag;
                if (hashtag == null) {
                    return null;
                }
                String str = hashtag.title;
                if (str != null && str.length() != 0) {
                    Hashtag hashtag2 = c467600IVi.LIZIZ.hashtag;
                    if (hashtag2 == null) {
                        return null;
                    }
                    return hashtag2.title;
                }
                return "none";
            }
        }), new Pair("hashtag_type", new InterfaceC467580IVg() { // from class: X.0IW8
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                Hashtag hashtag = c467600IVi.LIZIZ.hashtag;
                if (hashtag == null) {
                    return null;
                }
                String str = hashtag.title;
                if (str != null && str.length() != 0) {
                    Hashtag hashtag2 = c467600IVi.LIZIZ.hashtag;
                    if (hashtag2 == null) {
                        return null;
                    }
                    return hashtag2.title;
                }
                return "none";
            }
        }), new Pair("hashtag_is_game", new InterfaceC467580IVg() { // from class: X.0IVl
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                Hashtag hashtag = c467600IVi.LIZIZ.hashtag;
                if (hashtag == null) {
                    return null;
                }
                if (C500260Jjc.LJJJI(Boolean.valueOf(hashtag.isUseGameTagAsHashTag()))) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
        }), new Pair("is_from_draw_req", new InterfaceC467580IVg() { // from class: X.0IVZ
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                C466650IRr c466650IRr;
                if (c467600IVi.LIZJ != 0) {
                    EnterRoomConfig enterRoomConfig = c467600IVi.LIZ;
                    if (Intrinsics.LJFF("live_merge", enterRoomConfig.mRoomsData.enterFromMerge) && Intrinsics.LJFF("live_cover", enterRoomConfig.mRoomsData.enterMethod)) {
                        C466640IRq c466640IRqLIZJ = C466640IRq.LIZJ();
                        if (!c466640IRqLIZJ.LIZ || (c466650IRr = c466640IRqLIZJ.LIZIZ) == null || !c466650IRr.LJ) {
                            return CardStruct.IStatusCode.DEFAULT;
                        }
                        return "1";
                    }
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
        }), new Pair("is_sale", new InterfaceC467580IVg() { // from class: X.0IWK
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                if (c467600IVi.LIZIZ.hasCommerceGoods) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
        }), new Pair("live_play_session_id", new InterfaceC467580IVg() { // from class: X.0IWJ
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                String str = C0IL2.LIZ.LIZIZ;
                if (str == null) {
                    return "-1";
                }
                return str;
            }
        }), new Pair("is_from_list", new InterfaceC467580IVg() { // from class: X.0IWD
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return String.valueOf(c467600IVi.LIZ.mLogData.isFromList);
            }
        }), new Pair("room_id", new InterfaceC467580IVg() { // from class: X.0IWL
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return String.valueOf(c467600IVi.LIZIZ.getId());
            }
        }), new Pair("sdk_version", new InterfaceC467580IVg() { // from class: X.0IWP
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return C465680INy.LIZ();
            }
        }), new Pair("explore_level", new InterfaceC467580IVg() { // from class: X.0IWM
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                C467800IWc c467800IWc = C467800IWc.LJIJ;
                return String.valueOf(C467800IWc.LJIJ.LIZJ());
            }
        }), new Pair("is_from_bubble", new InterfaceC467580IVg() { // from class: X.0IW0
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return String.valueOf(c467600IVi.LIZ.mRoomsData.isFromBubble);
            }
        }), new Pair("live_window_mode", new InterfaceC467580IVg() { // from class: X.0IW6
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                String str = c467600IVi.LIZ.mRoomsData.windowMode;
                if (str == null || str.length() == 0) {
                    return "full_screen";
                }
                return str;
            }
        }), new Pair("enter_from_merge", new InterfaceC467580IVg() { // from class: X.0IWE
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return c467600IVi.LIZ.mRoomsData.enterFromMerge;
            }
        }), new Pair("is_ecom", new InterfaceC467580IVg() { // from class: X.0IW2
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                Room room = c467600IVi.LIZIZ;
                if (room.hasCommerceGoods) {
                    return "1";
                }
                CommerceStruct commerceStruct = room.getCommerceStruct();
                if (commerceStruct != null && commerceStruct.commercePermission == 1) {
                    return "2";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
        }), new Pair("isFromList", new InterfaceC467580IVg() { // from class: X.0IWA
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return String.valueOf(c467600IVi.LIZ.mLogData.isFromList);
            }
        }), new Pair("_param_live_platform", new InterfaceC467580IVg() { // from class: X.0IWQ
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return "live";
            }
        }), new Pair("request_id", new InterfaceC467580IVg() { // from class: X.0IWF
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return c467600IVi.LIZ.mLogData.requestId;
            }
        }), new Pair("is_from_cache", new InterfaceC467580IVg() { // from class: X.0IW1
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return String.valueOf(c467600IVi.LIZ.mRoomsData.isFromCache);
            }
        }), new Pair("live_type", new InterfaceC467580IVg() { // from class: X.0IW9
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return C354201Zc.LIZ(c467600IVi.LIZIZ.getStreamType());
            }
        }), new Pair("action_type", new InterfaceC467580IVg() { // from class: X.0IWG
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return c467600IVi.LIZ.mRoomsData.actionType;
            }
        }), new Pair("room_position", new InterfaceC467580IVg() { // from class: X.0IVk
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return String.valueOf(c467600IVi.LIZJ);
            }
        }), new Pair("enter_method", new InterfaceC467580IVg() { // from class: X.0IWH
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return c467600IVi.LIZ.mRoomsData.enterMethod;
            }
        }), new Pair("from_end", new InterfaceC467580IVg() { // from class: X.0IVc
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return String.valueOf(c467600IVi.LIZ.mLogData.fromEnd);
            }
        }), new Pair("orientation", new InterfaceC467580IVg() { // from class: X.0IWN
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return String.valueOf(c467600IVi.LIZIZ.getOrientation());
            }
        }), new Pair("room_source", new InterfaceC467580IVg() { // from class: X.0IVd
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                return c467600IVi.LIZ.mRoomsData.relativeLiveTag;
            }
        }), new Pair("is_guest_connection", new InterfaceC467580IVg() { // from class: X.0IVf
            @Override // X.InterfaceC467580IVg
            public final String LIZ(C467600IVi c467600IVi) {
                EnterRoomConfig.GuestUser guestUser = c467600IVi.LIZ.mRoomsData.guestUser;
                if (guestUser != null && guestUser.isGuestEnter == 1) {
                    return "1";
                }
                return CardStruct.IStatusCode.DEFAULT;
            }
        }));
    }

    public static final Object invoke$331(AFwS193S0000000_7 aFwS193S0000000_7) {
        ILiveOuterService iLiveOuterServiceQ4;
        InterfaceC20318714ev interfaceC20318714evB4;
        boolean z = false;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (iLiveOuterServiceQ4 = iLiveOuterService.q4()) != null && (interfaceC20318714evB4 = iLiveOuterServiceQ4.B4()) != null && interfaceC20318714evB4.LIZLLL(0.01d, "livesdk_live_request_response")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$332(AFwS193S0000000_7 aFwS193S0000000_7) {
        ILiveOuterService iLiveOuterServiceQ4;
        InterfaceC20318714ev interfaceC20318714evB4;
        boolean z = false;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (iLiveOuterServiceQ4 = iLiveOuterService.q4()) != null && (interfaceC20318714evB4 = iLiveOuterServiceQ4.B4()) != null && interfaceC20318714evB4.LJFF(0.0d, "ttlive_from_following_show_live")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$333(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<StrategyTrigger> list;
        ArrayList arrayList = null;
        C469620IbI.LIZ.getClass();
        StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(10, null, true, true, false);
        if (strategyDataLIZIZ != null && (list = strategyDataLIZIZ.trigger) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (StrategyTrigger strategyTrigger : list) {
                if (Intrinsics.LJFF(strategyTrigger.cepRuleName, "epi_scene_config")) {
                    arrayList2.add(strategyTrigger);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((StrategyTrigger) it2.next()).cepExpression);
            }
        }
        return arrayList;
    }

    public static final Object invoke$334(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(ILiveDecisionService.class);
    }

    public static final Object invoke$335(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Long.valueOf(LiveDynamicStrategySetting.getValue().strategyOverTime);
    }

    public static final Object invoke$336(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<StrategyTrigger> list;
        ArrayList arrayList = null;
        C469620IbI.LIZ.getClass();
        StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(10, null, true, true, false);
        if (strategyDataLIZIZ != null && (list = strategyDataLIZIZ.trigger) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (StrategyTrigger strategyTrigger : list) {
                if (strategyTrigger.cepRuleName.length() == 0) {
                    arrayList2.add(strategyTrigger);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((StrategyTrigger) it2.next()).cepExpression);
            }
        }
        return arrayList;
    }

    public static final Object invoke$337(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(IHostPerformanceOpt.class);
    }

    public static final Object invoke$338(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest());
    }

    public static final Object invoke$339(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(IHostPerformanceOpt.class);
    }

    public static final Object invoke$34(AFwS193S0000000_7 aFwS193S0000000_7) {
        return LiveSmallWindowPageMap.INSTANCE.getValue();
    }

    public static final Object invoke$340(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<LiveSettingModel> models = SettingsManager.INSTANCE.getModels();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(models, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (LiveSettingModel liveSettingModel : models) {
            linkedHashMap.put(liveSettingModel.getSettingsKey(), liveSettingModel);
        }
        return linkedHashMap;
    }

    public static final Object invoke$341(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Keva.getRepo("live_debug_tools_repo");
    }

    public static final /* bridge */ /* synthetic */ Object invoke$342(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$343(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$344(AFwS193S0000000_7 aFwS193S0000000_7) {
        return UserService.getInstance().user().LJIJJLI();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$345(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$346(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C110700bR.LIZ().LIZJ();
    }

    public static final Object invoke$347(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C0KL4();
    }

    public static final Object invoke$348(AFwS193S0000000_7 aFwS193S0000000_7) {
        TTSVoiceApi.LIZ.getClass();
        return C487890JBj.LIZIZ.getValue();
    }

    public static final Object invoke$349(AFwS193S0000000_7 aFwS193S0000000_7) {
        C467210ITv.LIZ.getClass();
        return Boolean.valueOf(C467210ITv.LIZIZ.enable);
    }

    public static final Object invoke$35(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$350(AFwS193S0000000_7 aFwS193S0000000_7) {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_repost_record_repo");
        sbLIZ.append(currentUserId);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object invoke$351(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new LinkedHashMap();
    }

    public static final Object invoke$352(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new LinkedHashMap();
    }

    public static final Object invoke$353(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new LinkedHashMap();
    }

    public static final Object invoke$354(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new PaidEventStatusChannel();
    }

    public static final Object invoke$355(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new SubOnlyLiveChangedChannel();
    }

    public static final Object invoke$356(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new CommentOrMessageData();
    }

    public static final Object invoke$357(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new GameBillboardChannel();
    }

    public static final Object invoke$358(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new FullScreenSurveyShowing();
    }

    public static final Object invoke$359(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new RealLinkControlWidgetCreatedChannel();
    }

    public static final Object invoke$36(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("internal_window_adapter_live_stream_panel_default", InternalWindowAdapterLiveStreamPanelDefaultSetting.DEFAULT));
    }

    public static final Object invoke$360(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new GoLiveCardShowing();
    }

    public static final Object invoke$361(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new IsInteractingData();
    }

    public static final Object invoke$362(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new RoomUserChannel();
    }

    public static final Object invoke$363(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new PIPStatusData();
    }

    public static final Object invoke$364(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new PaidRoomChannel();
    }

    public static final Object invoke$365(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new SubOnlyLiveAudienceStatusChannel();
    }

    public static final Object invoke$366(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new GameLinkGuestNumChannel();
    }

    public static final Object invoke$367(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new NearbyClearModelChannel();
    }

    public static final Object invoke$368(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new SwipeNextEvent();
    }

    public static final Object invoke$369(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new AccessRecallMessageChannel();
    }

    public static final Object invoke$37(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("internal_window_adapter_live_stream_panel", InternalWindowAdapterLiveStreamPanelSetting.DEFAULT));
    }

    public static final Object invoke$370(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new AudienceMultiGuestShareBgChannel();
    }

    public static final Object invoke$371(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C512110K6n.LIZIZ;
    }

    public static final Object invoke$372(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new ArrayList();
    }

    public static final Object invoke$373(AFwS193S0000000_7 aFwS193S0000000_7) {
        IHostBridge iHostBridge = (IHostBridge) C1161920gLG.LIZJ(IHostBridge.class);
        if (iHostBridge != null) {
            iHostBridge.prepareSearchCache();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$374(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().blockList;
        if (list == null) {
            return C1697810uHb.LJ("jump_source_room_back", "jump_source_mic_room", "jump_source_recommend_end_at_follow_button_style");
        }
        return list;
    }

    public static final Object invoke$375(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().multiList;
        if (list == null) {
            return C1697810uHb.LJ("jump_source_all");
        }
        return list;
    }

    public static final Object invoke$376(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().multiList;
        if (list == null) {
            return C1697810uHb.LJ("jump_source_all", "jump_source_live_end", "jump_source_mic_room");
        }
        return list;
    }

    public static final Object invoke$377(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<String> list = BackRoomListSettingConfigSetting.INSTANCE.getValue().singleList;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$378(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$379(AFwS193S0000000_7 aFwS193S0000000_7) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("live_merge");
        arrayList.add("homepage_hot");
        arrayList.add("live_end");
        arrayList.add("feed");
        arrayList.add("follow_recommend");
        arrayList.add("homepage_live");
        arrayList.add("homepage_bottom_live");
        return arrayList;
    }

    public static final Object invoke$38(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("internal_window_adapter_user_manual_mute", InternalWindowAdapterUserManualMuteSetting.DEFAULT));
    }

    public static final Object invoke$380(AFwS193S0000000_7 aFwS193S0000000_7) {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            LivePreviewExtraCardConfig livePreviewExtraCardConfig = C0J07.LIZ;
            LivePreviewExtraCardConfig livePreviewExtraCardConfig2 = (LivePreviewExtraCardConfig) c0c64LJIILLIIL.LJJII(LivePreviewExtraCardConfig.class, livePreviewExtraCardConfig, "live_extra_card_style_v2", true);
            if (livePreviewExtraCardConfig2 != null) {
                return livePreviewExtraCardConfig2;
            }
            return livePreviewExtraCardConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C0J07.LIZ;
        }
    }

    public static final Object invoke$381(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new HashSet();
    }

    public static final Object invoke$382(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new Stack();
    }

    public static final Object invoke$383(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C2097608Jq.LJI(new Pair(Integer.valueOf(C497740JfY.LJFF(R.color.a54)), "white"), new Pair(Integer.valueOf(C497740JfY.LJFF(R.color.a4u)), "blue"), new Pair(Integer.valueOf(C497740JfY.LJFF(R.color.a4z)), "red"), new Pair(Integer.valueOf(C497740JfY.LJFF(R.color.a4w)), "green"), new Pair(Integer.valueOf(C497740JfY.LJFF(R.color.a55)), "yellow"), new Pair(Integer.valueOf(C497740JfY.LJFF(R.color.a4y)), "pink_purple"));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$384(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$385(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$386(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$387(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$388(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.TRUE;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$389(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$39(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$390(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$391(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$392(AFwS193S0000000_7 aFwS193S0000000_7) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FeedLiveTopLivePrefetchModel feedLiveTopLivePrefetchModel = C467480IUw.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(FeedLiveTopLivePrefetchModel.class, feedLiveTopLivePrefetchModel, "toplive_prefetch_data_strategy_setting", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return feedLiveTopLivePrefetchModel;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$393(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Unit.LIZ;
    }

    public static final Object invoke$394(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).Z80();
    }

    public static /* bridge */ /* synthetic */ Object invoke$395(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
    }

    public static final Object invoke$396(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(!HostAddLocationSetting.INSTANCE.enable());
    }

    public static final Object invoke$397(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(HostAddLocationSetting.INSTANCE.enable());
    }

    public static final Object invoke$398(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(AiLiveSummarySetting.INSTANCE.enable());
    }

    public static final Object invoke$399(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveHostAiGeneratedToggleSetting.INSTANCE.enable());
    }

    public static final Object invoke$4(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Resources.getSystem().getDisplayMetrics();
    }

    public static final Object invoke$40(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$400(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C0UIM.LJII())));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$401(kotlin.jvm.internal.AFwS193S0000000_7 r0) {
        /*
            boolean r0 = X.C0UIM.LJII()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L36
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.service.IGameService> r0 = com.bytedance.android.livesdk.comp.api.game.service.IGameService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.game.service.IGameService r0 = (com.bytedance.android.livesdk.comp.api.game.service.IGameService) r0
            if (r0 == 0) goto L34
            webcast.api.game.CreateInfoResponse$ResponseData r0 = r0.I92()
            if (r0 == 0) goto L34
            webcast.api.game.InGameInfo r0 = r0.inGameInfo
            if (r0 == 0) goto L34
            boolean r0 = r0.showInGameRank
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L28:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L36
            r0 = 1
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L34:
            r0 = 0
            goto L28
        L36:
            r0 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS193S0000000_7.invoke$401(kotlin.jvm.internal.AFwS193S0000000_7):java.lang.Object");
    }

    public static final Object invoke$402(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveMarkViewerOptimizationSetting.INSTANCE.getValue());
    }

    public static final Object invoke$403(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new LinkedHashMap();
    }

    public static final Object invoke$404(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new LinkedHashSet();
    }

    public static final Object invoke$405(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C516050KLr.LIZ;
    }

    public static final Object invoke$406(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C467450IUt();
    }

    public static final Object invoke$407(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$408(AFwS193S0000000_7 aFwS193S0000000_7) {
        String str = null;
        C469620IbI.LIZ.getClass();
        StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(24, null, true, true, false);
        if (strategyDataLIZIZ != null) {
            str = strategyDataLIZIZ.strategyId;
        }
        return Boolean.valueOf(Intrinsics.LJFF("1", str));
    }

    public static final Object invoke$409(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(ILiveStatusCheckServiceV2.class);
    }

    public static final Object invoke$41(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("sov_consumption_cover_list_picker_feature_toggle_enabled", PrivilegePageVideoListSetting.DEFAULT));
    }

    public static final Object invoke$410(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$411(AFwS193S0000000_7 aFwS193S0000000_7) {
        return TopLivePreFetchPoolSetting.INSTANCE.getValue();
    }

    public static final Object invoke$412(AFwS193S0000000_7 aFwS193S0000000_7) {
        if (LayoutBizConfigReadSourceSetting.INSTANCE.isEnable()) {
            return C465260IMi.LIZ();
        }
        return MultiGuestLayoutBizConfigSetting.INSTANCE.getSettingValue();
    }

    public static final Object invoke$413(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new C0KJC();
    }

    public static final Object invoke$414(AFwS193S0000000_7 aFwS193S0000000_7) {
        VoiceConversionApi.LIZ.getClass();
        return C487940JBo.LIZIZ.getValue();
    }

    public static final Object invoke$415(AFwS193S0000000_7 aFwS193S0000000_7) {
        HashMap map = new HashMap();
        map.put("enter_from_merge", "live_merge");
        map.put("enter_method", "toplive_live_cover");
        map.put("action_type", "click");
        return new C0JAM(map);
    }

    public static final Object invoke$42(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("subscriptions_photo_text_consumption_killswitch", SubscriptionPhotoTextConsumptionKillswitch.DEFAULT));
    }

    public static final Object invoke$43(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C1161920gLG.LIZJ(ISubscriptionStatusService.class);
    }

    public static final Object invoke$44(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Integer.valueOf(((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).BO2(C480730ItD.LIZ()));
    }

    public static final Object invoke$45(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).TS1();
    }

    public static final Object invoke$46(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveInfeedSkylightOptSetting.disableAnim());
    }

    public static final Object invoke$47(AFwS193S0000000_7 aFwS193S0000000_7) {
        ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).L61();
        return Boolean.FALSE;
    }

    public static final Object invoke$48(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).vx2());
    }

    public static final Object invoke$49(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Long.valueOf(TimeUnit.MINUTES.toMillis(5L));
    }

    public static final Object invoke$5(AFwS193S0000000_7 aFwS193S0000000_7) {
        if (LivePlayerRefactorSetting.INSTANCE.enableSwitchToMediaBox()) {
            return new C480740ItE() { // from class: X.0ItF
                @Override // X.C480740ItE
                public final void LIZ() {
                    super.LIZ();
                }

                @Override // X.C480740ItE
                public final void LIZJ(InterfaceC480510Isr interfaceC480510Isr) {
                    LinkedList<InterfaceC480510Isr> linkedList = this.LIZ;
                    if (linkedList.size() < 2) {
                        linkedList = null;
                    }
                    if (linkedList != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("putRecycledPlayer:");
                        sbLIZ.append(interfaceC480510Isr.hashCode());
                        sbLIZ.append(" -> over size");
                        C827750WdZ.LIZ("LivePlayControllerManager_RecyclerPlayerPool3", C2188811AlT.LIZIZ(sbLIZ));
                        interfaceC480510Isr.LJJIJLIJ();
                        return;
                    }
                    interfaceC480510Isr.LJJIJLIJ();
                    this.LIZ.push(interfaceC480510Isr);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("putRecycledPlayer -> ");
                    sbLIZ2.append(interfaceC480510Isr.hashCode());
                    sbLIZ2.append(" count=");
                    sbLIZ2.append(LIZIZ());
                    C827750WdZ.LIZ("LivePlayControllerManager_RecyclerPlayerPool3", C2188811AlT.LIZIZ(sbLIZ2));
                }
            };
        }
        return new C480740ItE();
    }

    public static final Object invoke$50(AFwS193S0000000_7 aFwS193S0000000_7) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$51(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<LiveSettingModel> models = SettingsManager.INSTANCE.getModels();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(models, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (LiveSettingModel liveSettingModel : models) {
            linkedHashMap.put(liveSettingModel.getSettingsKey(), liveSettingModel);
        }
        return linkedHashMap;
    }

    public static final Object invoke$52(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new DrawGuessFreeStartFragment();
    }

    public static final Object invoke$53(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(60.0f));
    }

    public static final Object invoke$54(AFwS193S0000000_7 aFwS193S0000000_7) {
        C467210ITv.LIZ.getClass();
        return Boolean.valueOf(C467210ITv.LIZIZ.enableEnhance);
    }

    public static final Object invoke$55(AFwS193S0000000_7 aFwS193S0000000_7) {
        C467210ITv.LIZ.getClass();
        return Boolean.valueOf(C467210ITv.LIZIZ.enableNR);
    }

    public static final Object invoke$56(AFwS193S0000000_7 aFwS193S0000000_7) {
        C467210ITv.LIZ.getClass();
        return Boolean.valueOf(C467210ITv.LIZIZ.enableNoStreamMark);
    }

    public static final Object invoke$57(AFwS193S0000000_7 aFwS193S0000000_7) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveActiveWatchGuideConfig liveActiveWatchGuideConfig = LiveActiveWatchGuideSetting.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("live_active_watch_guide_setting", liveActiveWatchGuideConfig);
        if (valueSafely != null) {
            return valueSafely;
        }
        return liveActiveWatchGuideConfig;
    }

    public static final Object invoke$58(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Long.valueOf(SettingsManager.INSTANCE.getLongValue("live_active_watch_show_interval", LiveActiveWatchShowIntervalSetting.DEFAULT));
    }

    public static final Object invoke$59(AFwS193S0000000_7 aFwS193S0000000_7) {
        try {
            SettingsManager settingsManager = SettingsManager.INSTANCE;
            BubbleConfig bubbleConfig = TiktokLiveLocationBubbleSetting.DEFAULT;
            BubbleConfig bubbleConfig2 = (BubbleConfig) settingsManager.getValueSafely("tiktok_live_location_bubble", bubbleConfig);
            if (bubbleConfig2 != null) {
                return bubbleConfig2;
            }
            return bubbleConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return TiktokLiveLocationBubbleSetting.DEFAULT;
        }
    }

    public static final Object invoke$6(AFwS193S0000000_7 aFwS193S0000000_7) {
        C2190691AoV.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$60(AFwS193S0000000_7 aFwS193S0000000_7) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        String[] strArr = LiveInfeedTopliveTabEntranceSetting.DEFAULT;
        String[] stringArrayValue = settingsManager.getStringArrayValue("live_infeed_toplive_tab_entrance", strArr);
        if (stringArrayValue != null) {
            return stringArrayValue;
        }
        return strArr;
    }

    public static final Object invoke$61(AFwS193S0000000_7 aFwS193S0000000_7) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = LiveNearbyTabSetting.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("live_nearby_tab", config);
        if (valueSafely != null) {
            return valueSafely;
        }
        return config;
    }

    public static final Object invoke$62(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue("live_preview_auto_skip_type", LivePreviewAutoSkipTypeSetting.DEFAULT));
    }

    public static final Object invoke$63(AFwS193S0000000_7 aFwS193S0000000_7) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TopLiveNetOptConfigV2 topLiveNetOptConfigV2 = TopLiveNetOptV2.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("toplive_net_opt_v2", topLiveNetOptConfigV2);
        if (valueSafely != null) {
            return valueSafely;
        }
        return topLiveNetOptConfigV2;
    }

    public static final Object invoke$64(AFwS193S0000000_7 aFwS193S0000000_7) {
        Object valueSafely = SettingsManager.INSTANCE.getValueSafely("toplive_prefetch_pool_setting", TopLivePreFetchPoolSetting.DEFAULT);
        if (valueSafely == null) {
            return TopLivePreFetchPoolSetting.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }

    public static final Object invoke$65(AFwS193S0000000_7 aFwS193S0000000_7) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSkylightNearbyStyleConfig liveSkylightNearbyStyleConfig = TopLiveSkylightNearbyStyle.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("toplive_skylight_nearby_style", liveSkylightNearbyStyleConfig);
        if (valueSafely != null) {
            return valueSafely;
        }
        return liveSkylightNearbyStyleConfig;
    }

    public static final Object invoke$66(AFwS193S0000000_7 aFwS193S0000000_7) {
        boolean booleanValue;
        try {
            booleanValue = SettingsManager.INSTANCE.getBooleanValue("multi_hangout_live_card_trace_success_opt", MultiHangoutLiveCardTraceSuccessOptSetting.DEFAULT);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            booleanValue = false;
        }
        return Boolean.valueOf(booleanValue);
    }

    public static final Object invoke$67(AFwS193S0000000_7 aFwS193S0000000_7) {
        try {
            SettingsManager settingsManager = SettingsManager.INSTANCE;
            com.bytedance.android.livesdk.livesetting.linkmic.Config config = TiktokLiveTopLiveArchitectureOptSetting.DEFAULT;
            com.bytedance.android.livesdk.livesetting.linkmic.Config config2 = (com.bytedance.android.livesdk.livesetting.linkmic.Config) settingsManager.getValueSafely("tiktok_live_top_live_architecture_opt", config);
            if (config2 != null) {
                return config2;
            }
            return config;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return TiktokLiveTopLiveArchitectureOptSetting.DEFAULT;
        }
    }

    public static final Object invoke$68(AFwS193S0000000_7 aFwS193S0000000_7) {
        try {
            OptConfig optConfig = (OptConfig) SettingsManager.INSTANCE.getValueSafely("tiktok_live_top_live_architecture_opt", TiktokLiveTopLiveArchitectureOptSetting.DEFAULT);
            if (optConfig == null) {
                return TiktokLiveTopLiveArchitectureOptV2Setting.DEFAULT;
            }
            return optConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return TiktokLiveTopLiveArchitectureOptV2Setting.DEFAULT;
        }
    }

    public static final Object invoke$69(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue("live_opt_player_fluency_exp", LiveOptPlayerFluencyExp.DEFAULT));
    }

    public static final Object invoke$7(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveRecoInfoFeatureSetting.INSTANCE.enableForPreview());
    }

    public static final Object invoke$70(AFwS193S0000000_7 aFwS193S0000000_7) {
        Object valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveEnterRoomClickPerfOptSetting.class);
        if (valueSafely == null) {
            return LiveEnterRoomClickPerfOptSetting.DEFAULT;
        }
        return valueSafely;
    }

    public static final Object invoke$71(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("live_fix_pull_stream_biz_session_id", LiveFixPullStreamBizSessionIdSetting.DEFAULT));
    }

    public static final Object invoke$72(AFwS193S0000000_7 aFwS193S0000000_7) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveRepostStrategyV2Config.RepostConfig repostConfig = LiveRepostStrategyV2Config.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("live_repost_strategy_v2_config", repostConfig);
        if (valueSafely != null) {
            return valueSafely;
        }
        return repostConfig;
    }

    public static final Object invoke$73(AFwS193S0000000_7 aFwS193S0000000_7) {
        return SettingsManager.INSTANCE.getValueSafely("feed_request_params", FeedRequestParamsSetting.DEFAULT);
    }

    public static final Object invoke$74(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue("live_jump_return_skylight_auto_open", LiveJumpReturnSkylightAutoOpenSetting.DEFAULT));
    }

    public static final Object invoke$75(AFwS193S0000000_7 aFwS193S0000000_7) {
        boolean z;
        if (Math.random() < LiveRoomScrollEndLogSampleSetting.INSTANCE.value()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$76(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$77(AFwS193S0000000_7 aFwS193S0000000_7) {
        return ((IPadAutoRotateScreenService) C1161920gLG.LIZJ(IPadAutoRotateScreenService.class)).XQ0();
    }

    public static final Object invoke$78(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.TRUE;
    }

    public static final Object invoke$79(AFwS193S0000000_7 aFwS193S0000000_7) {
        return LiveInnerFlowDowngradeSceneSetting.INSTANCE.getValue();
    }

    public static final Object invoke$8(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig> previewRecoInfoSaveConfig = LiveRecoInfoFeatureSetting.INSTANCE.getPreviewRecoInfoSaveConfig();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (LiveRecoInfoFeatureSetting.RecoInfoFeatureSaveConfig recoInfoFeatureSaveConfig : previewRecoInfoSaveConfig) {
            linkedHashMap.put(recoInfoFeatureSaveConfig.getRecoInfoKey(), recoInfoFeatureSaveConfig);
        }
        return linkedHashMap;
    }

    public static final Object invoke$80(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C13LP.LLIIJI(LiveInnerFlowDowngradeSceneSetting.INSTANCE.getValue().ignoreLevelChangedBizList);
    }

    public static final Object invoke$81(AFwS193S0000000_7 aFwS193S0000000_7) {
        Object valueSafely = SettingsManager.INSTANCE.getValueSafely(PTFWatchLiveScheduleSetting.class);
        if (valueSafely == null) {
            return PTFWatchLiveScheduleSetting.DEFAULT;
        }
        return valueSafely;
    }

    public static final Object invoke$82(AFwS193S0000000_7 aFwS193S0000000_7) {
        List<String> disableTriggers = PTFWatchLiveScheduleSetting.INSTANCE.getValue().getDisableTriggers();
        if (disableTriggers == null) {
            disableTriggers = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(disableTriggers, 10));
        for (String str : disableTriggers) {
            EnumC480200IsM.Companion.getClass();
            arrayList.add(C480220IsO.LIZ(str));
        }
        return C13LP.LLIIJI(arrayList);
    }

    public static final Object invoke$83(AFwS193S0000000_7 aFwS193S0000000_7) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC520290Kap.DEFAULT_LYNX, new InterfaceC520300Kaq() { // from class: X.0Kam
            @Override // X.InterfaceC520300Kaq
            public final InterfaceC520350Kav LIZ(Context context, DataChannel dataChannel, CustomTab customTab) {
                return new C520360Kaw(context, dataChannel, customTab);
            }
        });
        linkedHashMap.put(EnumC520290Kap.TTGP, new InterfaceC520300Kaq() { // from class: X.0Kal
            @Override // X.InterfaceC520300Kaq
            public final InterfaceC520350Kav LIZ(final Context context, final DataChannel dataChannel, final CustomTab customTab) {
                return new AbstractC520380Kay(context, dataChannel, customTab) { // from class: X.0Kb0
                    public final C520410Kb1 LJFF;

                    @Override // X.InterfaceC520350Kav
                    public final int LIZLLL() {
                        return 1;
                    }

                    @Override // X.InterfaceC520350Kav
                    public final String LIZ() {
                        return this.LIZJ.tabTitle;
                    }

                    @Override // X.AbstractC520380Kay, X.InterfaceC520350Kav
                    public final void LIZIZ() {
                        C520410Kb1 c520410Kb1 = this.LJFF;
                        c520410Kb1.getClass();
                        C20441214yg.LIZIZ("XtabGameEsportsHelper", "onEnterBackground");
                        InterfaceC520420Kb2 interfaceC520420Kb2 = c520410Kb1.LJ;
                        if (interfaceC520420Kb2 != null) {
                            interfaceC520420Kb2.LIZIZ();
                        }
                    }

                    @Override // X.InterfaceC520350Kav
                    public final void onDestroy() {
                        C520410Kb1 c520410Kb1 = this.LJFF;
                        c520410Kb1.getClass();
                        C20441214yg.LIZIZ("XtabGameEsportsHelper", "onDestroy");
                        InterfaceC520420Kb2 interfaceC520420Kb2LIZ = c520410Kb1.LIZ();
                        if (interfaceC520420Kb2LIZ != null) {
                            interfaceC520420Kb2LIZ.onDestroy();
                        }
                    }

                    @Override // X.InterfaceC520350Kav
                    public final void onHide() {
                        C520410Kb1 c520410Kb1 = this.LJFF;
                        c520410Kb1.getClass();
                        C20441214yg.LIZIZ("XtabGameEsportsHelper", "onHide");
                        InterfaceC520420Kb2 interfaceC520420Kb2LIZ = c520410Kb1.LIZ();
                        if (interfaceC520420Kb2LIZ != null) {
                            interfaceC520420Kb2LIZ.onHide();
                        }
                        this.LIZLLL = 0L;
                    }

                    @Override // X.InterfaceC520350Kav
                    public final void onShow() {
                        C520410Kb1 c520410Kb1 = this.LJFF;
                        c520410Kb1.getClass();
                        C20441214yg.LIZIZ("XtabGameEsportsHelper", "onShow");
                        InterfaceC520420Kb2 interfaceC520420Kb2LIZ = c520410Kb1.LIZ();
                        if (interfaceC520420Kb2LIZ != null) {
                            interfaceC520420Kb2LIZ.onShow();
                        }
                    }

                    @Override // X.AbstractC520380Kay, X.InterfaceC520350Kav
                    public final void LLLZZ() {
                        super.LLLZZ();
                        C520410Kb1 c520410Kb1 = this.LJFF;
                        c520410Kb1.getClass();
                        C20441214yg.LIZIZ("XtabGameEsportsHelper", "onEnterForeground");
                        InterfaceC520420Kb2 interfaceC520420Kb2 = c520410Kb1.LJ;
                        if (interfaceC520420Kb2 != null) {
                            interfaceC520420Kb2.LLLZZ();
                        }
                    }

                    @Override // X.AbstractC520380Kay, X.InterfaceC520350Kav
                    public final void LIZJ(ViewGroup viewGroup) {
                        this.LJ = viewGroup;
                        C520410Kb1 c520410Kb1 = this.LJFF;
                        c520410Kb1.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("bindContainer: ");
                        sbLIZ.append(c520410Kb1.LIZJ.tabSchema);
                        C20441214yg.LIZIZ("XtabGameEsportsHelper", C2188811AlT.LIZIZ(sbLIZ));
                        c520410Kb1.LIZLLL = viewGroup;
                        InterfaceC520420Kb2 interfaceC520420Kb2LIZ = c520410Kb1.LIZ();
                        if (interfaceC520420Kb2LIZ != null) {
                            interfaceC520420Kb2LIZ.LIZJ(viewGroup);
                        }
                    }

                    {
                        super(context, dataChannel, customTab);
                        this.LJFF = new C520410Kb1(context, dataChannel, customTab);
                    }
                };
            }
        });
        return linkedHashMap;
    }

    public static final Object invoke$84(AFwS193S0000000_7 aFwS193S0000000_7) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, new InterfaceC520300Kaq() { // from class: X.0Kan
            @Override // X.InterfaceC520300Kaq
            public final InterfaceC520350Kav LIZ(final Context context, final DataChannel dataChannel, final CustomTab customTab) {
                return new AbstractC520380Kay(context, dataChannel, customTab) { // from class: X.0Kax
                    @Override // X.InterfaceC520350Kav
                    public final String LIZ() {
                        return "CHAT";
                    }

                    @Override // X.InterfaceC520350Kav
                    public final int LIZLLL() {
                        return 0;
                    }

                    @Override // X.InterfaceC520350Kav
                    public final void onDestroy() {
                    }

                    @Override // X.InterfaceC520350Kav
                    public final void onHide() {
                        this.LIZLLL = 0L;
                        this.LIZIZ.LC0(MultiTabLIVEVisibility.class, Boolean.FALSE);
                    }

                    @Override // X.InterfaceC520350Kav
                    public final void onShow() {
                        this.LIZLLL = System.currentTimeMillis();
                        this.LIZIZ.LC0(MultiTabLIVEVisibility.class, Boolean.TRUE);
                    }
                };
            }
        });
        linkedHashMap.put(1, new InterfaceC520300Kaq() { // from class: X.0Kao
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
            
                r1 = X.EnumC520290Kap.DEFAULT_LYNX;
             */
            @Override // X.InterfaceC520300Kaq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC520350Kav LIZ(android.content.Context r8, com.bytedance.ies.sdk.datachannel.DataChannel r9, com.bytedance.android.livesdkapi.depend.model.live.CustomTab r10) {
                /*
                    r7 = this;
                    java.lang.Class<com.bytedance.android.live.programmedlive.IProgrammedLiveService> r0 = com.bytedance.android.live.programmedlive.IProgrammedLiveService.class
                    X.006A r4 = X.C1161920gLG.LIZJ(r0)
                    com.bytedance.android.live.programmedlive.IProgrammedLiveService r4 = (com.bytedance.android.live.programmedlive.IProgrammedLiveService) r4
                    X.0Kar r1 = X.EnumC520290Kap.Companion
                    java.lang.String r0 = r10.tabSchema
                    r1.getClass()
                    r6 = 0
                    android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L5c
                    java.lang.String r0 = r1.getScheme()     // Catch: java.lang.Exception -> L5c
                    if (r0 == 0) goto L57
                    java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)     // Catch: java.lang.Exception -> L5c
                    java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L5c
                L22:
                    java.lang.String r0 = r1.getHost()     // Catch: java.lang.Exception -> L5c
                    if (r0 == 0) goto L55
                    java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)     // Catch: java.lang.Exception -> L5c
                    java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L5c
                L30:
                    X.07zh r0 = X.EnumC520290Kap.getEntries()     // Catch: java.lang.Exception -> L5c
                    java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L5c
                L38:
                    boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L5c
                    if (r0 == 0) goto L59
                    java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L5c
                    X.0Kap r1 = (X.EnumC520290Kap) r1     // Catch: java.lang.Exception -> L5c
                    java.lang.String r0 = r1.schemaProtocol     // Catch: java.lang.Exception -> L5c
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)     // Catch: java.lang.Exception -> L5c
                    if (r0 == 0) goto L38
                    java.lang.String r0 = r1.schemaHost     // Catch: java.lang.Exception -> L5c
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)     // Catch: java.lang.Exception -> L5c
                    if (r0 == 0) goto L38
                    goto L62
                L55:
                    r3 = r6
                    goto L30
                L57:
                    r5 = r6
                    goto L22
                L59:
                    X.0Kap r1 = X.EnumC520290Kap.DEFAULT_LYNX     // Catch: java.lang.Exception -> L5c
                    goto L62
                L5c:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.0Kap r1 = X.EnumC520290Kap.DEFAULT_LYNX
                L62:
                    X.0Kaq r0 = r4.M52(r1)
                    if (r0 == 0) goto L6c
                    X.0Kav r6 = r0.LIZ(r8, r9, r10)
                L6c:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C520280Kao.LIZ(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdkapi.depend.model.live.CustomTab):X.0Kav");
            }
        });
        return linkedHashMap;
    }

    public static final Object invoke$85(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C0GY9.LIZIZ(0.5f, 1.0f, 0.89f, 1.0f);
    }

    public static final Object invoke$86(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C0GY9.LIZIZ(0.5f, 1.0f, 0.89f, 1.0f);
    }

    public static final Object invoke$87(AFwS193S0000000_7 aFwS193S0000000_7) {
        return C0GY9.LIZIZ(0.5f, 1.0f, 0.89f, 1.0f);
    }

    public static final Object invoke$88(AFwS193S0000000_7 aFwS193S0000000_7) {
        C0KKP c0kkp = new C0KKP() { // from class: X.0KSG
        };
        c0kkp.LL = new AbstractC515830KKv<GetSuperFansTreasureBoxDataResponse.Data>() { // from class: X.0KSO
            public C0KSK<GetSuperFansTreasureBoxDataResponse.Data> LIZIZ;

            @Override // X.AbstractC515830KKv
            public final void LJ() {
            }

            @Override // X.AbstractC515830KKv
            public final void LIZJ() {
                C0KSK<GetSuperFansTreasureBoxDataResponse.Data> c0ksk = this.LIZIZ;
                if (c0ksk == null) {
                    return;
                }
                C0KST c0kst = new C0KST(c0ksk);
                C515840KKw c515840KKw = this.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c0kst.LIZIZ.LIZJ().LJJLL(new AfS2S0200100_7(jCurrentTimeMillis, c0kst, c515840KKw, 18), new AfS3S0100100_7(jCurrentTimeMillis, c0kst, 20));
            }

            @Override // X.AbstractC515830KKv
            public final void LIZ(GetSuperFansTreasureBoxDataResponse.Data data) {
                final GetSuperFansTreasureBoxDataResponse.Data data2 = data;
                final C0KSK<GetSuperFansTreasureBoxDataResponse.Data> c0ksk = this.LIZIZ;
                if (c0ksk != null) {
                    C517810KSl c517810KSl = new C517810KSl();
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    List<SuperFanPackage> list = data2.treasureBoxPkgInfo;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<SuperFanPackage> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().iapid);
                    }
                    List listLJJJJI = C13LP.LJJJJI(arrayList);
                    c517810KSl.LIZ.LIZ(new C1617170sBX("80XR2DK73101", (List<String>) listLJJJJI, "inapp"), new InterfaceC1791300wiO() { // from class: X.0KSN
                        @Override // X.InterfaceC1791300wiO
                        public final void LJ(C0KSV c0ksv) {
                        }

                        @Override // X.InterfaceC1791300wiO
                        public final void LIZLLL(C518150KTt c518150KTt) {
                            Integer numValueOf;
                            EnumC1792020wjY enumC1792020wjY;
                            int size;
                            String str;
                            Collection<IapProductDetail> collectionValues;
                            IapProductDetail iapProductDetail;
                            C1617230sBd c1617230sBd;
                            String str2 = null;
                            if (c518150KTt.LIZ) {
                                Map<String, IapProductDetail> map = c518150KTt.LIZIZ;
                                c0ksk.LJIIJ.LIZLLL(new C0KSY<>(data2, null, map));
                                C516010KLn c516010KLn = C516010KLn.LIZ;
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                if (map != null) {
                                    size = map.size();
                                } else {
                                    size = 0;
                                }
                                if (map == null || (collectionValues = map.values()) == null || (iapProductDetail = (IapProductDetail) C13LP.LJJJLIIL(collectionValues)) == null || (c1617230sBd = iapProductDetail.oneTimePurchaseProduct) == null || (str = c1617230sBd.priceCurrencyCode) == null) {
                                    str = "";
                                }
                                String str3 = c0ksk.LJFF;
                                boolean zEnableRedEnvelopeForSuperFan = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).enableRedEnvelopeForSuperFan();
                                c516010KLn.getClass();
                                C516010KLn.LJIJJLI(size, jCurrentTimeMillis2, "", str, str3, true, zEnableRedEnvelopeForSuperFan);
                                return;
                            }
                            C0KQW c0kqw = c518150KTt.LIZJ;
                            c0ksk.LJIIJ.LJ(c0kqw);
                            C516010KLn c516010KLn2 = C516010KLn.LIZ;
                            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                            if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
                                numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
                            } else {
                                numValueOf = null;
                            }
                            if (c0kqw != null) {
                                str2 = c0kqw.LIZIZ;
                            }
                            C0KSK<GetSuperFansTreasureBoxDataResponse.Data> c0ksk2 = c0ksk;
                            boolean z = c0ksk2.LJIIL;
                            String str4 = c0ksk2.LJFF;
                            boolean zEnableRedEnvelopeForSuperFan2 = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).enableRedEnvelopeForSuperFan();
                            c516010KLn2.getClass();
                            C516010KLn.LJIJJ(jCurrentTimeMillis3, numValueOf, -999, str2, z, str4, zEnableRedEnvelopeForSuperFan2);
                        }
                    });
                }
            }

            @Override // X.AbstractC515830KKv
            public final void LIZIZ(InterfaceC509200Jy2 interfaceC509200Jy2) {
                C0KSK<GetSuperFansTreasureBoxDataResponse.Data> c0ksk;
                if (interfaceC509200Jy2 instanceof C0KSK) {
                    c0ksk = (C0KSK) interfaceC509200Jy2;
                } else {
                    c0ksk = null;
                }
                this.LIZIZ = c0ksk;
                if (c0ksk != null) {
                    c0ksk.LJIIL = false;
                }
                super.LIZIZ(interfaceC509200Jy2);
            }
        };
        c0kkp.LLILLJJLI = new C0KP4();
        return c0kkp;
    }

    public static final Object invoke$89(AFwS193S0000000_7 aFwS193S0000000_7) {
        C0KSF c0ksf = new C0KSF();
        c0ksf.LL = new AbstractC515830KKv<GetNonFansUserDataResponse.Data>() { // from class: X.0KSJ
            public C0KSK<GetNonFansUserDataResponse.Data> LIZIZ;

            @Override // X.AbstractC515830KKv
            public final void LJ() {
            }

            @Override // X.AbstractC515830KKv
            public final void LIZJ() {
                C0KSK<GetNonFansUserDataResponse.Data> c0ksk = this.LIZIZ;
                if (c0ksk == null) {
                    return;
                }
                C0KSS c0kss = new C0KSS(c0ksk);
                C515840KKw c515840KKw = this.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c0kss.LIZIZ.LIZJ().LJJLL(new AfS2S0200100_7(jCurrentTimeMillis, c0kss, c515840KKw, 17), new AfS3S0100100_7(jCurrentTimeMillis, c0kss, 19));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [X.0KSM] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractC515830KKv
            public final void LIZ(GetNonFansUserDataResponse.Data data) {
                final GetNonFansUserDataResponse.Data data2 = data;
                final C0KSK<GetNonFansUserDataResponse.Data> c0ksk = this.LIZIZ;
                if (c0ksk != null) {
                    C517620KRs c517620KRs = new C517620KRs();
                    Map<? extends String, ? extends String> mapLIZJ = C0KSH.LIZJ(c0ksk);
                    C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_fetch_product_start");
                    c512030K6fLIZ.LIZLLL.putAll(mapLIZJ);
                    c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    List<SuperFanPackage> list = data2.allPkgInfos;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<SuperFanPackage> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().iapid);
                    }
                    List listLJJJJI = C13LP.LJJJJI(arrayList);
                    c517620KRs.LIZ.LJIILJJIL(new C1617170sBX("80XR2DK73101", (List<String>) listLJJJJI, "subs"), new InterfaceC1791300wiO() { // from class: X.0KSM
                        @Override // X.InterfaceC1791300wiO
                        public final void LIZLLL(C518150KTt c518150KTt) {
                        }

                        @Override // X.InterfaceC1791300wiO
                        public final void LJ(C0KSV c0ksv) {
                            Integer numValueOf;
                            EnumC1792020wjY enumC1792020wjY;
                            String string;
                            EnumC1792020wjY enumC1792020wjY2;
                            Collection<C0KSW> collectionValues;
                            C0KSW c0ksw;
                            AbsIapPricing absIapPricing;
                            String str;
                            String str2 = "";
                            int size = 0;
                            String str3 = null;
                            if (c0ksv.LIZ) {
                                Map<String, C0KSW> map = c0ksv.LIZIZ;
                                c0ksk.LJIIJ.LIZLLL(new C0KSY<>(data2, map, null));
                                C516010KLn c516010KLn = C516010KLn.LIZ;
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                if (map != null) {
                                    size = map.size();
                                }
                                if (map != null && (collectionValues = map.values()) != null && (c0ksw = (C0KSW) C13LP.LJJJLIIL(collectionValues)) != null && (absIapPricing = (AbsIapPricing) C13LP.LJJJLL(c0ksw.LIZIZ)) != null && (str = absIapPricing.priceCurrencyCode) != null) {
                                    str2 = str;
                                }
                                String str4 = c0ksk.LJFF;
                                boolean zLIZ = C0KSX.LIZ(data2);
                                c516010KLn.getClass();
                                C516010KLn.LJIJJLI(size, jCurrentTimeMillis2, "", str2, str4, true, zLIZ);
                                C0KSH.LJFF((int) (System.currentTimeMillis() - jCurrentTimeMillis), true, C0KSH.LIZJ(c0ksk));
                                return;
                            }
                            C0KQW c0kqw = c0ksv.LIZJ;
                            c0ksk.LJIIJ.LJ(c0kqw);
                            C516010KLn c516010KLn2 = C516010KLn.LIZ;
                            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                            if (c0kqw != null && (enumC1792020wjY2 = c0kqw.LIZ) != null) {
                                numValueOf = Integer.valueOf(enumC1792020wjY2.getValue());
                            } else {
                                numValueOf = null;
                            }
                            if (c0kqw != null) {
                                str3 = c0kqw.LIZIZ;
                            }
                            C0KSK<GetNonFansUserDataResponse.Data> c0ksk2 = c0ksk;
                            boolean z = c0ksk2.LJIIL;
                            String str5 = c0ksk2.LJFF;
                            boolean zLIZ2 = C0KSX.LIZ(data2);
                            c516010KLn2.getClass();
                            C516010KLn.LJIJJ(jCurrentTimeMillis3, numValueOf, -999, str3, z, str5, zLIZ2);
                            Map mapLIZJ2 = C0KSH.LIZJ(c0ksk);
                            if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null && (string = Integer.valueOf(enumC1792020wjY.getValue()).toString()) != null) {
                                str2 = string;
                            }
                            mapLIZJ2.put("error_code", str2);
                            mapLIZJ2.put("detail_error_code", "-999");
                            C0KSH.LJFF((int) (System.currentTimeMillis() - jCurrentTimeMillis), false, mapLIZJ2);
                        }
                    });
                }
            }

            @Override // X.AbstractC515830KKv
            public final void LIZIZ(InterfaceC509200Jy2 interfaceC509200Jy2) {
                C0KSK<GetNonFansUserDataResponse.Data> c0ksk;
                if (interfaceC509200Jy2 instanceof C0KSK) {
                    c0ksk = (C0KSK) interfaceC509200Jy2;
                } else {
                    c0ksk = null;
                }
                this.LIZIZ = c0ksk;
                if (c0ksk != null) {
                    c0ksk.LJIIL = true;
                }
                super.LIZIZ(interfaceC509200Jy2);
            }
        };
        c0ksf.LLILLJJLI = new C0KP4();
        c0ksf.LLILLL = new C0KS3();
        return c0ksf;
    }

    public static final Object invoke$9(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.valueOf(LiveRecoInfoFeatureSetting.INSTANCE.enableForInnerFlow());
    }

    public static final Object invoke$90(AFwS193S0000000_7 aFwS193S0000000_7) {
        String str;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (LiveRepostNewAwarenessStoreSetting.INSTANCE.hitExperiment()) {
            str = "live_repost_record_repo_v2";
        } else {
            str = "live_repost_record_repo";
        }
        sbLIZ.append(str);
        sbLIZ.append(currentUserId);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object invoke$91(AFwS193S0000000_7 aFwS193S0000000_7) {
        final BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        return new ContentObserver(bPEAHandler) { // from class: X.0ITx
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                super.onChange(z);
                C467220ITw.LJIIJJI = true;
                C469660IbM.LIZ = true;
                C467220ITw.LIZ.getClass();
                Activity activityLIZ = C467220ITw.LIZ();
                if (activityLIZ != null) {
                    C467220ITw.LIZJ(activityLIZ);
                }
            }
        };
    }

    public static final Object invoke$92(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new ArrayList();
    }

    public static final Object invoke$93(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new HashMap();
    }

    public static final Object invoke$94(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new ArrayList();
    }

    public static final Object invoke$95(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new ArrayList();
    }

    public static final Object invoke$96(AFwS193S0000000_7 aFwS193S0000000_7) {
        return new RecommendSwipeOptWidget();
    }

    public static final Object invoke$97(AFwS193S0000000_7 aFwS193S0000000_7) {
        boolean z;
        if (C497740JfY.LJIIZILJ() <= ((int) C497740JfY.LIZIZ(375.0f))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$98(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Boolean.TRUE;
    }

    public static final Object invoke$99(AFwS193S0000000_7 aFwS193S0000000_7) {
        return Integer.valueOf(C14KS.LJFF());
    }
}
