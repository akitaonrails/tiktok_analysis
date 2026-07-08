package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.AnonymousClass0208;
import X.AnonymousClass0515;
import X.C011B;
import X.C086F;
import X.C098J;
import X.C09AY;
import X.C0C64;
import X.C0CQT;
import X.C0NSL;
import X.C0PEM;
import X.C0T94;
import X.C0TA2;
import X.C0TCM;
import X.C0TCQ;
import X.C0TJI;
import X.C0TKN;
import X.C0TL6;
import X.C0TL7;
import X.C0TL8;
import X.C0TLA;
import X.C0TLO;
import X.C0TNR;
import X.C0TNS;
import X.C0TOM;
import X.C0TPL;
import X.C0TWJ;
import X.C0U5Z;
import X.C0U61;
import X.C0UA1;
import X.C0UAS;
import X.C0UBH;
import X.C0UBZ;
import X.C0UC4;
import X.C0UC6;
import X.C0UC7;
import X.C0UC8;
import X.C0UCZ;
import X.C0UD4;
import X.C0UDQ;
import X.C0UEI;
import X.C0UG4;
import X.C0UG5;
import X.C0UKJ;
import X.C0UMA;
import X.C0UMB;
import X.C0UMC;
import X.C0UND;
import X.C0UPC;
import X.C0UQ8;
import X.C0URD;
import X.C0UVW;
import X.C0WQX;
import X.C0XQ7;
import X.C1097680efe;
import X.C1101060el6;
import X.C1143920fsE;
import X.C1161920gLG;
import X.C11NJ;
import X.C1276840jKc;
import X.C1286510jaD;
import X.C1388190mED;
import X.C1514430pVp;
import X.C1547760qNa;
import X.C158B;
import X.C1619980sG4;
import X.C168F;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C176600m4;
import X.C1819620xS4;
import X.C1898110zUf;
import X.C1906580ziK;
import X.C1917290zzb;
import X.C19212010Ec;
import X.C19252910Tv;
import X.C19EG;
import X.C19MB;
import X.C20105113lZ;
import X.C20441214yg;
import X.C20642515q3;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2123408To;
import X.C2123508Tp;
import X.C2187041Aic;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C258160A9u;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C439101nJ;
import X.C473410IhP;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C582130MsN;
import X.C603820NmG;
import X.C744920TJy;
import X.C745010TKh;
import X.C745070TKn;
import X.C745130TKt;
import X.C746020TOe;
import X.C747450TTr;
import X.C752560Tfa;
import X.C754180TiC;
import X.C755900Tky;
import X.C756420Tlo;
import X.C757440TnS;
import X.C759500Tqm;
import X.C759790TrF;
import X.C760600TsY;
import X.C760630Tsb;
import X.C761680TuI;
import X.C761820TuW;
import X.C761830TuX;
import X.C765720U1y;
import X.C766120U3m;
import X.C766270U4b;
import X.C767120U7i;
import X.C767140U7k;
import X.C767210U7r;
import X.C767530U8x;
import X.C768460UCm;
import X.C770000UIk;
import X.C770850ULr;
import X.C772460URw;
import X.C772780UTc;
import X.C773190UUr;
import X.C773310UVd;
import X.C773450UVr;
import X.C775180Uay;
import X.C776230Ucf;
import X.C779730UiJ;
import X.C781270Ukn;
import X.C782630Umz;
import X.C783110Unl;
import X.C783270Uo1;
import X.C786410Ut5;
import X.C814420VxA;
import X.C823050WQl;
import X.C844470XAv;
import X.C930890aKd;
import X.C930940aKi;
import X.C960203pA;
import X.EnumC1006810cJ5;
import X.EnumC755480TkI;
import X.EnumC755930Tl1;
import X.InterfaceC1101080el8;
import X.InterfaceC1143270frB;
import X.InterfaceC1898130zUh;
import X.InterfaceC500940Jki;
import X.InterfaceC754190TiD;
import X.InterfaceC756510Tlx;
import X.InterfaceC766480U4w;
import X.InterfaceC772190UQv;
import X.InterfaceC772390URp;
import X.RunnableC767130U7j;
import X.RunnableC768870UEb;
import Y.ARunnableS112S0100000_12;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.LiveShareToStoryPublishResultEvent;
import com.bytedance.android.live.LiveToStoryClickPublishEvent;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenPanelEvent;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenPanelParamsEvent;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.broadcast.api.CheckOverlayPermissionEvent;
import com.bytedance.android.live.broadcast.api.ClickInsertStickerBackgroundEvent;
import com.bytedance.android.live.broadcast.api.ClickInsertStickerEvent;
import com.bytedance.android.live.broadcast.api.FloatWindowEnterForegroundEvent;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.ShouldStartFloatWindowServiceEvent;
import com.bytedance.android.live.broadcast.api.ShowFloatWindowEvent;
import com.bytedance.android.live.broadcast.api.ShowMusicPanelEvent;
import com.bytedance.android.live.broadcast.api.ShowStickerPanelEvent;
import com.bytedance.android.live.broadcast.api.StartPushStreamChannel;
import com.bytedance.android.live.broadcast.api.StickerShortcutPanelChannel;
import com.bytedance.android.live.broadcast.model.LiveEventInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.effect.api.FetchGreenScreenLiveGoalInterfaceEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchedChannel;
import com.bytedance.android.live.effect.api.LiveGoalEffectChannel;
import com.bytedance.android.live.effect.api.MoveLiveGoalEffectEvent;
import com.bytedance.android.live.effect.api.ScrollToInsertStickerEvent;
import com.bytedance.android.live.effect.api.SetImageToPreviewChannel;
import com.bytedance.android.live.effect.api.ShowStickerShortCutPanelEvent;
import com.bytedance.android.live.effect.karaoke.view.KaraokeSettingFragment;
import com.bytedance.android.live.effect.karaoke.view.library.KaraokeLibraryFragment;
import com.bytedance.android.live.effect.karaoke.view.playlist.KaraokePlayListFragment;
import com.bytedance.android.live.effect.music.AccompanimentApi;
import com.bytedance.android.live.effect.music.LiveBGMFragment;
import com.bytedance.android.live.effect.music.LiveBGMPlaylistFragment;
import com.bytedance.android.live.effect.navi.service.NaviAvatarApi;
import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.VideoGiftStartEvent;
import com.bytedance.android.live.hashtag.IHashTagService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCaptureImageChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCapturedImageDataEvent;
import com.bytedance.android.live.liveinteract.api.FloatWindowPlayingNoOverViewPermissionEvent;
import com.bytedance.android.live.liveinteract.api.FloatWindowWakeEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.OnlyPushRtcEngineAlreadyCloseChannel;
import com.bytedance.android.live.liveinteract.api.RTCMixStreamSuccessWhenResumeEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.BeansAvatarDownloadEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.BeansAvatarEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.BeansRequestLoadStatisticsEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.BeansRoomScoreEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.DropBeanEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.DropComboBombEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.DropSystemBombEvent;
import com.bytedance.android.live.liveinteract.competition.game.event.GameSettlementEnd;
import com.bytedance.android.live.liveinteract.competition.game.event.GameSettlementStart;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorBroadcastResolutionChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorWindowParamsChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.StatusBarVisibilityEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.PreviewPageActivePlaybook;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.slot.LiveGlobalECShopShowEvent;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentBlockKeywordsFragment;
import com.bytedance.android.livesdk.adminsetting.LiveManageListFragment;
import com.bytedance.android.livesdk.api.revenue.announcement.IAnnouncementService;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.AgeRestrictedChannel;
import com.bytedance.android.livesdk.broadcast.CommentFeaturePreviewChannel;
import com.bytedance.android.livesdk.broadcast.CountDownFinishEvent;
import com.bytedance.android.livesdk.broadcast.CountDownFinishOpt;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.broadcast.LiveCoverControllerChannel;
import com.bytedance.android.livesdk.broadcast.OptOutGiftGalleryChannel;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.broadcast.SelectedStreamResolutionChannel;
import com.bytedance.android.livesdk.broadcast.StartLiveEvent;
import com.bytedance.android.livesdk.broadcast.interaction.config.WidgetLoadViewModel;
import com.bytedance.android.livesdk.broadcast.preview.animation.manager.PreviewAnimationConfigSetting;
import com.bytedance.android.livesdk.broadcast.preview.animation.manager.PreviewAnimationTask;
import com.bytedance.android.livesdk.broadcast.preview.widget.cover.PreviewCoverSelectDialog;
import com.bytedance.android.livesdk.broadcast.preview.widget.replay.PreviewReplayWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewTitleCoverFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewVideoQualityFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper;
import com.bytedance.android.livesdk.chatroom.event.SwitchCameraChannel;
import com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService;
import com.bytedance.android.livesdk.comp.api.decoration.ILiveEventStickerService;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.BGMDialogShowEvent;
import com.bytedance.android.livesdk.dataChannel.BeforeStickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastDisableSubOnlyTrialLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastEnableSubOnlyLiveEvent;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.EndLiveWithoutEndPage;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEffectCommandChannel;
import com.bytedance.android.livesdk.dataChannel.LiveHostAutoAdaptiveChannel;
import com.bytedance.android.livesdk.dataChannel.LiveTalkStateEvent;
import com.bytedance.android.livesdk.dataChannel.LopUnlockEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.MuteMicMiniWidgetClosedEvent;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.SelectedDonationStickerChannel;
import com.bytedance.android.livesdk.dataChannel.ShowEndPageEvent;
import com.bytedance.android.livesdk.dataChannel.StartPollMessageSEIEvent;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.TtlsLiveProductNumber;
import com.bytedance.android.livesdk.dataChannel.TurnOnVisualRelatedFunctionEvent;
import com.bytedance.android.livesdk.dataChannel.VideoBelowBackgroundUpdateEvent;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameMessageAlertDialog;
import com.bytedance.android.livesdk.interaction.AudienceInteractionFeaturesDialog;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceParamsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GoLiveVoiceCallConflictCheckSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPicMemOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterNewAcademySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectStrategyPreloadSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEndLiveWsEnableSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveFEWebSocketBlackList;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerDataSourceOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LEnableInitTimeCostOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.OptEndLiveSchema;
import com.bytedance.android.livesdk.livesetting.broadcast.OptEndLiveSchemaSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.SecondPageCodeCacheABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerGameSettings;
import com.bytedance.android.livesdk.livesetting.decoration.DonationAdaptTopStatusSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectComposerOptSetting;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixPlaybookDataChannelNullSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMarkViewerOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSoMonitorFilterSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.RankingSwitchChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionNotificationPrompt;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.play.core.appupdate.c;
import com.google.gson.p;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ab.LiveAiSummaryFrequencyControlConfig;
import com.ss.android.ugc.aweme.ab.LiveAiSummaryTypewriterAnimConfig;
import com.ss.android.ugc.aweme.ab.LiveFollowGuideFrequencyControlConfig;
import com.ss.android.ugc.aweme.ab.LiveNewAiSummaryConfig;
import com.ss.android.ugc.aweme.ab.LivePreviewGuideConfig;
import com.ss.android.ugc.aweme.ad.feed.ibe.setting.IBELoadRetryConfigSettings;
import com.ss.android.ugc.aweme.appdiff.IPushPopupYieldService;
import com.ss.android.ugc.aweme.comment.experiment.Configuration;
import com.ss.android.ugc.aweme.comment.experiment.VideoViewerMaxFollowersConfig;
import com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidSurveyAPI;
import com.ss.android.ugc.aweme.detail.component.biz.TrashBinBottomComponent;
import com.ss.android.ugc.aweme.ecommerce.common.api.EcVideoApi;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.AiSummaryConfig;
import com.ss.android.ugc.aweme.feed.adapter.widget.degrade.exps.LiveCardDegradeConfigStore;
import com.ss.android.ugc.aweme.feed.adapter.widget.realtimecomment.ab.LivePreviewCommentBoxConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.helper.FriendsVideoScrollTracker;
import com.ss.android.ugc.aweme.inbox.api.IInboxActionService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.playlist.LiveReplayPlaylistApi;
import com.ss.android.ugc.aweme.live.wallet.LiveWalletShowWebappProfileBannerSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivityArg;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.search.model.TakoFullScreenDisclaimerTextModel;
import com.ss.android.ugc.aweme.serviceplugin.ServicePluginPlatformManager;
import com.ss.android.ugc.aweme.setting.experiment.BetaAppExperiment;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS14S2000000_12;
import kotlin.jvm.internal.AwS27S0001000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class AFwS199S0000000_12 extends C09AY implements Function0 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(561);
    public final int $t;

    public static AFwS199S0000000_12 get$arr$(int i) {
        AFwS199S0000000_12 aFwS199S0000000_12 = (AFwS199S0000000_12) arr$.get(i);
        if (aFwS199S0000000_12 != null) {
            return aFwS199S0000000_12;
        }
        arr$.compareAndSet(i, null, new AFwS199S0000000_12(i));
        return (AFwS199S0000000_12) arr$.get(i);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$208(AFwS199S0000000_12 aFwS199S0000000_12) {
        return "VIBE_FEED_LIST_KEY";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$250(AFwS199S0000000_12 aFwS199S0000000_12) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$38(AFwS199S0000000_12 aFwS199S0000000_12) {
        return "";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$59(AFwS199S0000000_12 aFwS199S0000000_12) {
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$65(AFwS199S0000000_12 aFwS199S0000000_12) {
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
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
            case 416:
                return invoke$416(this);
            case 417:
                return invoke$417(this);
            case 418:
                return invoke$418(this);
            case 419:
                return invoke$419(this);
            case 420:
                return invoke$420(this);
            case 421:
                return invoke$421(this);
            case 422:
                return invoke$422(this);
            case 423:
                return invoke$423(this);
            case 424:
                return invoke$424(this);
            case 425:
                return invoke$425(this);
            case 426:
                return invoke$426(this);
            case 427:
                return invoke$427(this);
            case 428:
                return invoke$428(this);
            case 429:
                return invoke$429(this);
            case 430:
                return invoke$430(this);
            case 431:
                return invoke$431(this);
            case 432:
                return invoke$432(this);
            case 433:
                return invoke$433(this);
            case 434:
                return invoke$434(this);
            case 435:
                return invoke$435(this);
            case 436:
                return invoke$436(this);
            case 437:
                return invoke$437(this);
            case 438:
                return invoke$438(this);
            case 439:
                return invoke$439(this);
            case 440:
                return invoke$440(this);
            case 441:
                return invoke$441(this);
            case 442:
                return invoke$442(this);
            case 443:
                return invoke$443(this);
            case 444:
                return invoke$444(this);
            case 445:
                return invoke$445(this);
            case 446:
                return invoke$446(this);
            case 447:
                return invoke$447(this);
            case 448:
                return invoke$448(this);
            case 449:
                return invoke$449(this);
            case 450:
                return invoke$450(this);
            case 451:
                return invoke$451(this);
            case 452:
                return invoke$452(this);
            case 453:
                return invoke$453(this);
            case 454:
                return invoke$454(this);
            case 455:
                return invoke$455(this);
            case 456:
                return invoke$456(this);
            case 457:
                return invoke$457(this);
            case 458:
                return invoke$458(this);
            case 459:
                return invoke$459(this);
            case 460:
                return invoke$460(this);
            case 461:
                return invoke$461(this);
            case 462:
                return invoke$462(this);
            case 463:
                return invoke$463(this);
            case 464:
                return invoke$464(this);
            case 465:
                return invoke$465(this);
            case 466:
                return invoke$466(this);
            case 467:
                return invoke$467(this);
            case 468:
                return invoke$468(this);
            case 469:
                return invoke$469(this);
            case 470:
                return invoke$470(this);
            case 471:
                return invoke$471(this);
            case 472:
                return invoke$472(this);
            case 473:
                return invoke$473(this);
            case 474:
                return invoke$474(this);
            case 475:
                return invoke$475(this);
            case 476:
                return invoke$476(this);
            case 477:
                return invoke$477(this);
            case 478:
                return invoke$478(this);
            case 479:
                return invoke$479(this);
            case 480:
                return invoke$480(this);
            case 481:
                return invoke$481(this);
            case 482:
                return invoke$482(this);
            case 483:
                return invoke$483(this);
            case 484:
                return invoke$484(this);
            case 485:
                return invoke$485(this);
            case 486:
                return invoke$486(this);
            case 487:
                return invoke$487(this);
            case 488:
                return invoke$488(this);
            case 489:
                return invoke$489(this);
            case 490:
                return invoke$490(this);
            case 491:
                return invoke$491(this);
            case 492:
                return invoke$492(this);
            case 493:
                return invoke$493(this);
            case 494:
                return invoke$494(this);
            case 495:
                return invoke$495(this);
            case 496:
                return invoke$496(this);
            case 497:
                return invoke$497(this);
            case 498:
                return invoke$498(this);
            case 499:
                return invoke$499(this);
            case 500:
                return invoke$500(this);
            case 501:
                return invoke$501(this);
            case 502:
                return invoke$502(this);
            case 503:
                return invoke$503(this);
            case 504:
                return invoke$504(this);
            case 505:
                return invoke$505(this);
            case 506:
                return invoke$506(this);
            case 507:
                return invoke$507(this);
            case 508:
                return invoke$508(this);
            case 509:
                return invoke$509(this);
            case 510:
                return invoke$510(this);
            case 511:
                return invoke$511(this);
            case 512:
                return invoke$512(this);
            case 513:
                return invoke$513(this);
            case 514:
                return invoke$514(this);
            case 515:
                return invoke$515(this);
            case 516:
                return invoke$516(this);
            case 517:
                return invoke$517(this);
            case 518:
                return invoke$518(this);
            case 519:
                return invoke$519(this);
            case 520:
                return invoke$520(this);
            case 521:
                return invoke$521(this);
            case 522:
                return invoke$522(this);
            case 523:
                return invoke$523(this);
            case 524:
                return invoke$524(this);
            case 525:
                return invoke$525(this);
            case 526:
                return invoke$526(this);
            case 527:
                return invoke$527(this);
            case 528:
                return invoke$528(this);
            case 529:
                return invoke$529(this);
            case 530:
                return invoke$530(this);
            case 531:
                return invoke$531(this);
            case 532:
                return invoke$532(this);
            case 533:
                return invoke$533(this);
            case 534:
                return invoke$534(this);
            case 535:
                return invoke$535(this);
            case 536:
                return invoke$536(this);
            case 537:
                return invoke$537(this);
            case 538:
                return invoke$538(this);
            case 539:
                return invoke$539(this);
            case 540:
                return invoke$540(this);
            case 541:
                return invoke$541(this);
            case 542:
                return invoke$542(this);
            case 543:
                return invoke$543(this);
            case 544:
                return invoke$544(this);
            case 545:
                return invoke$545(this);
            case 546:
                return invoke$546(this);
            case 547:
                return invoke$547(this);
            case 548:
                return invoke$548(this);
            case 549:
                return invoke$549(this);
            case 550:
                return invoke$550(this);
            case 551:
                return invoke$551(this);
            case 552:
                return invoke$552(this);
            case 553:
                return invoke$553(this);
            case 554:
                return invoke$554(this);
            case 555:
                return invoke$555(this);
            case 556:
                return invoke$556(this);
            case 557:
                return invoke$557(this);
            case 558:
                return invoke$558(this);
            case 559:
                return invoke$559(this);
            case 560:
                return invoke$560(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS199S0000000_12(int i) {
        super(0);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveCommentBlockKeywordsFragment();
    }

    public static final Object invoke$10(AFwS199S0000000_12 aFwS199S0000000_12) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "WaveDispatchExecutor";
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static final Object invoke$100(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LinkedList();
    }

    public static final Object invoke$101(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LinkedList();
    }

    public static final Object invoke$102(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ValueAnimator();
    }

    public static final Object invoke$103(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C779730UiJ();
    }

    public static /* bridge */ /* synthetic */ Object invoke$104(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(C786410Ut5.W2((HandlerThread) C783270Uo1.LIZJ.getValue()));
    }

    public static final Object invoke$105(AFwS199S0000000_12 aFwS199S0000000_12) {
        HandlerThread handlerThread = new HandlerThread("app_log_common_thread", 19);
        handlerThread.start();
        return handlerThread;
    }

    public static /* bridge */ /* synthetic */ Object invoke$106(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(C786410Ut5.W2((HandlerThread) C783270Uo1.LIZ.getValue()));
    }

    public static final Object invoke$107(AFwS199S0000000_12 aFwS199S0000000_12) {
        HandlerThread handlerThread = new HandlerThread("work_common_thread", 10);
        handlerThread.start();
        return handlerThread;
    }

    public static final Object invoke$108(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$109(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$11(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C823050WQl.LIZLLL();
    }

    public static final Object invoke$110(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IEffectService.class);
    }

    public static final Object invoke$111(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$112(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$113(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$114(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$115(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$116(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$117(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$118(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$119(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$12(AFwS199S0000000_12 aFwS199S0000000_12) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZIZ = "videoLegalCheck";
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static final Object invoke$120(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$121(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$122(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$123(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$124(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IEffectService.class);
    }

    public static final Object invoke$125(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$126(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$127(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$128(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$129(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(TTLHVideoQualityStrategyManagerGameSettings.INSTANCE.enabledStrategyCenter());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$13(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final Object invoke$130(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(TTLHVideoQualityStrategyManagerGameSettings.INSTANCE.enabledStrategyCenter());
    }

    public static final Object invoke$131(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$132(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$133(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$134(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$135(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$136(AFwS199S0000000_12 aFwS199S0000000_12) {
        String string;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return string;
    }

    public static final Object invoke$137(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf(C439101nJ.LIZ(54));
    }

    public static final Object invoke$138(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$139(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$14(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Keva.getRepo("task_scheduler_used_feature");
    }

    public static final Object invoke$140(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C11NJ();
    }

    public static final Object invoke$141(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C1286510jaD(2);
    }

    public static final Object invoke$142(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Float.valueOf(0.8f);
    }

    public static final Object invoke$143(AFwS199S0000000_12 aFwS199S0000000_12) {
        return 300L;
    }

    public static final Object invoke$144(AFwS199S0000000_12 aFwS199S0000000_12) {
        LiveBroadcastPicMemOpt liveBroadcastPicMemOpt = new LiveBroadcastPicMemOpt();
        liveBroadcastPicMemOpt.enable = true;
        liveBroadcastPicMemOpt.fitEffectPanelIconSize = true;
        liveBroadcastPicMemOpt.frescoLoadPicEnableInSample = true;
        liveBroadcastPicMemOpt.forbidPreloadInvalidGecko = true;
        liveBroadcastPicMemOpt.fitStickerPanelImageSize = true;
        liveBroadcastPicMemOpt.optGeckoWebPAnimationCache = true;
        liveBroadcastPicMemOpt.delayTime = 10000L;
        return liveBroadcastPicMemOpt;
    }

    public static final Object invoke$145(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("m2l_enable_init_time_cost_opt", M2LEnableInitTimeCostOpt.DEFAULT));
    }

    public static final Object invoke$146(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue("donation_adapt_top_status", DonationAdaptTopStatusSetting.DEFAULT));
    }

    public static final Object invoke$147(AFwS199S0000000_12 aFwS199S0000000_12) {
        return 0;
    }

    public static final Object invoke$148(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ViewModelStore();
    }

    public static final Object invoke$149(AFwS199S0000000_12 aFwS199S0000000_12) {
        return LiveSoMonitorFilterSetting.INSTANCE.getValue();
    }

    public static final Object invoke$15(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$150(AFwS199S0000000_12 aFwS199S0000000_12) {
        HashMap<Long, Boolean> map = C0TLO.LLJJ;
        map.remove(Long.valueOf(C0TLO.LLJJIII));
        Runnable runnable = C0TLO.LLJJI;
        if (runnable != null && map.isEmpty()) {
            C086F.LIZ.getClass();
            C086F.LIZIZ(0L, runnable);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$151(AFwS199S0000000_12 aFwS199S0000000_12) {
        CopyOnWriteArrayList<InterfaceC754190TiD> copyOnWriteArrayList = C0T94.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C754180TiC(null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$152(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$153(AFwS199S0000000_12 aFwS199S0000000_12) {
        return PluggableExtentionKt.pluggableSpi$default(IConsistentContentAndAdChoiceService.class, false, false, false, 14, null);
    }

    public static final Object invoke$154(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ComplianceServiceProvider.LJJI();
    }

    public static final Object invoke$155(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ComplianceServiceProvider.LJJI();
    }

    public static final Object invoke$156(AFwS199S0000000_12 aFwS199S0000000_12) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        C0TOM.LIZ.getClass();
        mutableLiveData.setValue(Integer.valueOf(C0TOM.LIZ()));
        return mutableLiveData;
    }

    public static final Object invoke$157(AFwS199S0000000_12 aFwS199S0000000_12) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        C0TOM.LIZ.getClass();
        mutableLiveData.setValue(Integer.valueOf(C0TOM.LIZJ()));
        return mutableLiveData;
    }

    public static final Object invoke$158(AFwS199S0000000_12 aFwS199S0000000_12) {
        TuxSheet tuxSheet = SubscriptionNotificationPrompt.LLIZ;
        if (tuxSheet == null) {
            tuxSheet = null;
        }
        tuxSheet.dismiss();
        return Unit.LIZ;
    }

    public static final Object invoke$159(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFZ();
    }

    public static final Object invoke$16(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$160(AFwS199S0000000_12 aFwS199S0000000_12) {
        ICommercializeComplianceApi.LIZ.getClass();
        return C0TPL.LIZ();
    }

    public static final Object invoke$161(AFwS199S0000000_12 aFwS199S0000000_12) {
        ICommercializeComplianceApi.LIZ.getClass();
        return C0TPL.LIZ();
    }

    public static final Object invoke$162(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new MutableLiveData(Boolean.FALSE);
    }

    public static final Object invoke$163(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveNewAiSummaryConfig liveNewAiSummaryConfig = C0TL8.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(LiveNewAiSummaryConfig.class, liveNewAiSummaryConfig, "live_smb_ai_summary_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return liveNewAiSummaryConfig;
    }

    public static final Object invoke$164(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveFollowGuideFrequencyControlConfig liveFollowGuideFrequencyControlConfig = C0TLA.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(LiveFollowGuideFrequencyControlConfig.class, liveFollowGuideFrequencyControlConfig, "live_follow_guide_frequency_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return liveFollowGuideFrequencyControlConfig;
    }

    public static final Object invoke$165(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LivePreviewGuideConfig livePreviewGuideConfig = C0TKN.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(LivePreviewGuideConfig.class, livePreviewGuideConfig, "live_preview_follow_guide_setting", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return livePreviewGuideConfig;
    }

    public static final Object invoke$166(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveAiSummaryFrequencyControlConfig liveAiSummaryFrequencyControlConfig = C745130TKt.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(LiveAiSummaryFrequencyControlConfig.class, liveAiSummaryFrequencyControlConfig, "live_ai_summary_frequency_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return liveAiSummaryFrequencyControlConfig;
    }

    public static final Object invoke$167(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveAiSummaryTypewriterAnimConfig liveAiSummaryTypewriterAnimConfig = C745070TKn.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(LiveAiSummaryTypewriterAnimConfig.class, liveAiSummaryTypewriterAnimConfig, "live_ai_summary_typewriter_anim_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return liveAiSummaryTypewriterAnimConfig;
    }

    public static final Object invoke$168(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveNewAiSummaryConfig liveNewAiSummaryConfig = C0TL7.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(LiveNewAiSummaryConfig.class, liveNewAiSummaryConfig, "live_ai_summary_config_v2", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return liveNewAiSummaryConfig;
    }

    public static final Object invoke$169(AFwS199S0000000_12 aFwS199S0000000_12) {
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IPushPopupYieldService.class, false, false, false, 14, null);
        if (objPluggableSpi$default == null) {
            return new IPushPopupYieldService.DowngradeInstance();
        }
        return objPluggableSpi$default;
    }

    public static final Object invoke$17(AFwS199S0000000_12 aFwS199S0000000_12) {
        return DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
    }

    public static final Object invoke$170(AFwS199S0000000_12 aFwS199S0000000_12) {
        boolean z = false;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIZ(0, "viewer_history");
        if (privacySettingsRestrictionItemLJIIIZ != null && privacySettingsRestrictionItemLJIIIZ.showType != 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$171(AFwS199S0000000_12 aFwS199S0000000_12) {
        boolean z = false;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIZ(0, "viewer_history");
        if (privacySettingsRestrictionItemLJIIIZ != null && privacySettingsRestrictionItemLJIIIZ.showType != 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$172(AFwS199S0000000_12 aFwS199S0000000_12) {
        com.bytedance.ies.abmock.SettingsManager settingsManagerLIZLLL = com.bytedance.ies.abmock.SettingsManager.LIZLLL();
        BASchemaConfig.BASchemaConfigData bASchemaConfigData = BASchemaConfig.LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ba_live_link_schema", BASchemaConfig.BASchemaConfigData.class, bASchemaConfigData);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return bASchemaConfigData;
    }

    public static final Object invoke$173(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(SearchAidSurveyAPI.API.class);
    }

    public static final Object invoke$174(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new MutableLiveData();
    }

    public static final Object invoke$175(AFwS199S0000000_12 aFwS199S0000000_12) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(null);
        return mutableLiveData;
    }

    public static final Object invoke$176(AFwS199S0000000_12 aFwS199S0000000_12) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.FALSE);
        return mutableLiveData;
    }

    public static final Object invoke$177(AFwS199S0000000_12 aFwS199S0000000_12) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Boolean.FALSE);
        return mutableLiveData;
    }

    public static final Object invoke$178(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new p();
    }

    public static final Object invoke$179(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new MutableLiveData();
    }

    public static final Object invoke$18(AFwS199S0000000_12 aFwS199S0000000_12) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(300L);
        return valueAnimator;
    }

    public static final Object invoke$180(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new MutableLiveData();
    }

    public static final Object invoke$181(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(C0TA2.class);
    }

    public static final Object invoke$182(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(TrashBinBottomComponent.TrashBinRestoreApiManager.TrashBinRestoreApi.class);
    }

    public static final Object invoke$183(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C0NSL.LIZ().create(EcVideoApi.class);
    }

    public static final Object invoke$184(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C757440TnS();
    }

    public static final Object invoke$185(AFwS199S0000000_12 aFwS199S0000000_12) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "ep_get_draft_list";
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static final Object invoke$186(AFwS199S0000000_12 aFwS199S0000000_12) {
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_map_pin;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJI = C20642515q3.LJI(2131844819);
        c1722300uv6.LJIIIIZZ = C20642515q3.LJI(2131844818);
        return c1722300uv6;
    }

    public static final Object invoke$187(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C11NJ();
    }

    public static final Object invoke$188(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ArrayList();
    }

    public static final Object invoke$189(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C11NJ();
    }

    public static final Object invoke$19(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new KaraokeLibraryFragment();
    }

    public static final Object invoke$190(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(((LiveCardDegradeConfigStore.LivePreviewCardDegradeConfig) LiveCardDegradeConfigStore.LIZIZ.getValue()).perfEvaluateIntervalMs);
    }

    public static final Object invoke$191(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveCardDegradeConfigStore.LivePreviewCardDegradeConfig livePreviewCardDegradeConfig = LiveCardDegradeConfigStore.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(LiveCardDegradeConfigStore.LivePreviewCardDegradeConfig.class, livePreviewCardDegradeConfig, "live_card_biz_degrade", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return livePreviewCardDegradeConfig;
    }

    public static final Object invoke$192(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$193(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C0XQ7.LJFF().getCurUserId();
    }

    public static final Object invoke$194(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new FriendsVideoScrollTracker();
    }

    public static final Object invoke$195(AFwS199S0000000_12 aFwS199S0000000_12) {
        Boolean boolValueOf;
        C19EG c19eg;
        C19EG c19eg2 = C770000UIk.LIZ;
        if (c19eg2 != null) {
            boolValueOf = Boolean.valueOf(c19eg2.isDestroyed());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf) && (c19eg = C770000UIk.LIZ) != null) {
            c19eg.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$196(AFwS199S0000000_12 aFwS199S0000000_12) {
        Object objLJJII = C0C64.LJIILLIIL().LJJII(LiveWalletShowWebappProfileBannerSetting.LiveWalletWebappProfileBannerData.class, LiveWalletShowWebappProfileBannerSetting.DEFAULT, "live_recharge_guide_info", true);
        if (objLJJII == null) {
            return LiveWalletShowWebappProfileBannerSetting.INSTANCE.getDEFAULT();
        }
        return objLJJII;
    }

    public static final Object invoke$197(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new EditPlaylistActivityArg("", "", null, null, null, null, null, null, null, null, null);
    }

    public static final Object invoke$198(AFwS199S0000000_12 aFwS199S0000000_12) {
        return KevaImpl.getRepo("explore_card_play_attribution_pending", 0);
    }

    public static final Object invoke$199(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(CastLongProtector.parseLong(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId()));
    }

    public static final Object invoke$2(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).Qj2("");
    }

    public static final Object invoke$20(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C19MB();
    }

    public static final Object invoke$200(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$201(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
    }

    public static final Object invoke$202(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ServicePluginPlatformManager.LIZJ();
    }

    public static final Object invoke$203(AFwS199S0000000_12 aFwS199S0000000_12) {
        C844470XAv.LIZ.getClass();
        return c.LIZ(C844470XAv.LIZ());
    }

    public static final Object invoke$204(AFwS199S0000000_12 aFwS199S0000000_12) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(BetaAppExperiment.LJIIIIZZ ? 1 : 0, "has_update");
        C20684815ws.LJIILLIIL("tiktok_beta_inbox_msg_click", c2344009Gk.LIZ);
        if (BetaAppExperiment.LJIIIIZZ) {
            return "//googleplay";
        }
        return "//setting/beta_register_internal";
    }

    public static final Object invoke$205(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new p();
    }

    public static final Object invoke$206(AFwS199S0000000_12 aFwS199S0000000_12) {
        AnonymousClass0515.LIZIZ(Boolean.TRUE, "reveal_story_guide_camera_lottie_overlay_shown");
        return Unit.LIZ;
    }

    public static final Object invoke$207(AFwS199S0000000_12 aFwS199S0000000_12) {
        return AwemeChangeCallBack.LLILLJJLI.getValue();
    }

    public static final Object invoke$209(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ServiceManager.get().getService(IPipFeedService.class);
    }

    public static final Object invoke$21(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new KaraokePlayListFragment();
    }

    public static final Object invoke$210(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(C783270Uo1.LIZ());
    }

    public static final Object invoke$211(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(C500260Jjc.LJJ());
    }

    public static final Object invoke$212(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(LiveEffectStrategyPreloadSetting.INSTANCE.withStrategy());
    }

    public static final Object invoke$213(AFwS199S0000000_12 aFwS199S0000000_12) {
        long j;
        long j2;
        LiveEffect liveEffect;
        C767140U7k c767140U7k = C767120U7i.LIZIZ;
        if (c767140U7k != null && (liveEffect = c767140U7k.LJI) != null && liveEffect.LJJIJIIJI()) {
            j2 = 0;
        } else {
            long jLIZ = C158B.LIZ();
            C767140U7k c767140U7k2 = C767120U7i.LIZIZ;
            if (c767140U7k2 != null) {
                j = c767140U7k2.LJII;
            } else {
                j = jLIZ;
            }
            j2 = (jLIZ - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return Long.valueOf(j2);
    }

    public static final Object invoke$214(AFwS199S0000000_12 aFwS199S0000000_12) {
        C767140U7k c767140U7k;
        float f;
        LiveEffect liveEffect;
        C767140U7k c767140U7k2 = C767120U7i.LIZIZ;
        if ((c767140U7k2 != null && (liveEffect = c767140U7k2.LJI) != null && liveEffect.LJJIJIIJI()) || (c767140U7k = C767120U7i.LIZIZ) == null) {
            f = 0.0f;
        } else {
            f = c767140U7k.LIZJ;
        }
        return Float.valueOf(f);
    }

    public static final Object invoke$215(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new RunnableC767130U7j();
    }

    public static final Object invoke$216(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(C783270Uo1.LIZ());
    }

    public static final Object invoke$217(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C760630Tsb.LIZ();
    }

    public static final Object invoke$218(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UC7();
    }

    public static final Object invoke$219(AFwS199S0000000_12 aFwS199S0000000_12) {
        long j;
        long j2 = 0;
        if (C0UC4.LJJII) {
            if (C0UC4.LIZJ != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0UC8 c0uc8 = C0UC4.LIZJ;
                if (c0uc8 != null) {
                    j = c0uc8.LJIILL;
                } else {
                    j = jCurrentTimeMillis;
                }
                j2 = (jCurrentTimeMillis - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            if (C0UC4.LJJIFFI) {
                C0UC4.LJJII = false;
            }
        }
        return Long.valueOf(j2);
    }

    public static final Object invoke$22(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new KaraokeSettingFragment();
    }

    public static final Object invoke$220(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(LiveEffectStrategyPreloadSetting.INSTANCE.withStrategy());
    }

    public static final Object invoke$221(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UDQ();
    }

    public static final Object invoke$222(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(C783270Uo1.LIZ());
    }

    public static final Object invoke$223(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(LiveEffectStrategyPreloadSetting.INSTANCE.withStrategy());
    }

    public static final Object invoke$224(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(C500260Jjc.LJJ());
    }

    public static final Object invoke$225(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(LiveEffectStrategyPreloadSetting.INSTANCE.withStrategy());
    }

    public static final Object invoke$226(AFwS199S0000000_12 aFwS199S0000000_12) {
        long j;
        HashMap<Long, Long> map = C0UC4.LJJIII;
        C0UC8 c0uc8 = C0UC4.LIZJ;
        if (c0uc8 != null) {
            j = c0uc8.LIZ;
        } else {
            j = -1;
        }
        return Boolean.valueOf(map.containsKey(Long.valueOf(j)));
    }

    public static final Object invoke$227(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(LiveEffectStrategyPreloadSetting.INSTANCE.withStrategy());
    }

    public static final Object invoke$228(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UC6();
    }

    public static final Object invoke$229(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C0U61.LIZ(new C767530U8x(null, null)).get(MultiGuestStickerViewModel.class);
    }

    public static final Object invoke$23(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.FALSE;
    }

    public static final Object invoke$230(AFwS199S0000000_12 aFwS199S0000000_12) {
        com.bytedance.ies.abmock.SettingsManager settingsManagerLIZLLL = com.bytedance.ies.abmock.SettingsManager.LIZLLL();
        IBELoadRetryConfigSettings.IbeLoadRetryConfigModel ibeLoadRetryConfigModel = IBELoadRetryConfigSettings.LIZ;
        IBELoadRetryConfigSettings.IbeLoadRetryConfigModel ibeLoadRetryConfigModel2 = (IBELoadRetryConfigSettings.IbeLoadRetryConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ibe_load_retry_config", IBELoadRetryConfigSettings.IbeLoadRetryConfigModel.class, ibeLoadRetryConfigModel);
        if (ibeLoadRetryConfigModel2 != null) {
            ibeLoadRetryConfigModel = ibeLoadRetryConfigModel2;
        }
        return Long.valueOf(ibeLoadRetryConfigModel.retryCount);
    }

    public static final Object invoke$231(AFwS199S0000000_12 aFwS199S0000000_12) {
        com.bytedance.ies.abmock.SettingsManager settingsManagerLIZLLL = com.bytedance.ies.abmock.SettingsManager.LIZLLL();
        IBELoadRetryConfigSettings.IbeLoadRetryConfigModel ibeLoadRetryConfigModel = IBELoadRetryConfigSettings.LIZ;
        IBELoadRetryConfigSettings.IbeLoadRetryConfigModel ibeLoadRetryConfigModel2 = (IBELoadRetryConfigSettings.IbeLoadRetryConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ibe_load_retry_config", IBELoadRetryConfigSettings.IbeLoadRetryConfigModel.class, ibeLoadRetryConfigModel);
        if (ibeLoadRetryConfigModel2 != null) {
            ibeLoadRetryConfigModel = ibeLoadRetryConfigModel2;
        }
        return Long.valueOf(ibeLoadRetryConfigModel.loadTimeoutMS);
    }

    public static final Object invoke$232(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IapService.class);
    }

    public static final Object invoke$233(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C773190UUr();
    }

    public static final Object invoke$234(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$235(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$236(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C11NJ();
    }

    public static final Object invoke$237(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$238(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$239(AFwS199S0000000_12 aFwS199S0000000_12) {
        ArrayList arrayList = (ArrayList) C1898110zUf.LLILZ;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1898130zUh) it2.next()).onAppForeground();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveBGMFragment();
    }

    public static final Object invoke$240(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C744920TJy();
    }

    public static final Object invoke$241(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).Rs().ch2("com.ss.android.ugc.aweme.main.MainActivity");
    }

    public static final Object invoke$242(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))));
    }

    public static final Object invoke$243(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C0UA1.LIZ();
    }

    public static final Object invoke$244(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C770850ULr(C497740JfY.LJII());
    }

    public static final Object invoke$245(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C0UA1.LIZ();
    }

    public static final Object invoke$246(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C770850ULr(C497740JfY.LJII());
    }

    public static final Object invoke$247(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0UAS.LIZIZ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$248(AFwS199S0000000_12 aFwS199S0000000_12) {
        if (LiveEffectComposerOptSetting.INSTANCE.enable()) {
            return new C0UG5();
        }
        return new C0UG4();
    }

    public static final Object invoke$249(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).baseComposerManager();
    }

    public static final Object invoke$25(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveBGMPlaylistFragment();
    }

    public static final Object invoke$251(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UND();
    }

    public static final Object invoke$252(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C176600m4.LIZ());
    }

    public static final Object invoke$253(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$254(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$255(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$256(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LivePreviewCommentBoxConfig livePreviewCommentBoxConfig = C745010TKh.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(LivePreviewCommentBoxConfig.class, livePreviewCommentBoxConfig, "live_preview_comment_box_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return livePreviewCommentBoxConfig;
    }

    public static final Object invoke$257(AFwS199S0000000_12 aFwS199S0000000_12) {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "view_pager_idle_preload_memory", true);
        if (iLJIJ == 1) {
            return EnumC1006810cJ5.Medium;
        }
        if (iLJIJ == 2) {
            return EnumC1006810cJ5.High;
        }
        return EnumC1006810cJ5.Low;
    }

    public static final Object invoke$258(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$259(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$26(AFwS199S0000000_12 aFwS199S0000000_12) {
        C761680TuI.LIZ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$260(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$261(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(6.0f));
    }

    public static final Object invoke$262(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$263(AFwS199S0000000_12 aFwS199S0000000_12) {
        C766270U4b.LIZLLL(2131855017);
        return Unit.LIZ;
    }

    public static final Object invoke$264(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new PriorityQueue(Math.min(PreviewAnimationConfigSetting.INSTANCE.activeAnimationSize(), 1), new Comparator() { // from class: X.0UIA
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((PreviewAnimationTask) obj).priority - ((PreviewAnimationTask) obj2).priority;
            }
        });
    }

    public static final Object invoke$265(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C2187041Aic();
    }

    public static final Object invoke$266(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C773310UVd();
    }

    public static final Object invoke$267(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(63.0f));
    }

    public static final Object invoke$268(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$269(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UVW();
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C786410Ut5.w2(C497740JfY.LJII()).getPath();
    }

    public static final Object invoke$270(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$271(AFwS199S0000000_12 aFwS199S0000000_12) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "story_publisher_synthetic_wave_executor";
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static final Object invoke$272(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IEffectService.class);
    }

    public static final Object invoke$273(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IHostAction.class);
    }

    public static final Object invoke$274(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IMicRoomService.class);
    }

    public static final Object invoke$275(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Keva.getRepo("web_creation_keva_repo");
    }

    public static final Object invoke$276(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C823050WQl.LIZLLL();
    }

    public static final Object invoke$277(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0URD();
    }

    public static final Object invoke$278(AFwS199S0000000_12 aFwS199S0000000_12) {
        C1143920fsE c1143920fsE = C0UKJ.LJI;
        if (c1143920fsE != null) {
            c1143920fsE.LIZIZ();
        }
        C0UKJ.LJI = null;
        C473410IhP.LIZLLL(LiveBroadcastPictureMemOpt.getDelayTime(), LiveBroadcastPictureMemOpt.getCleanFrescoAnimationCacheTask());
        return Unit.LIZ;
    }

    public static final Object invoke$279(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Keva.getRepo("tablet_pinch_feature");
    }

    public static final Object invoke$28(AFwS199S0000000_12 aFwS199S0000000_12) {
        if (LiveStickerDataSourceOptSetting.INSTANCE.enable()) {
            return new C0UMB(C0UD4.LIZIZ);
        }
        return new C0UMA(C0UD4.LIZIZ);
    }

    public static final Object invoke$280(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ArrayList();
    }

    public static final Object invoke$281(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AiSummaryConfig aiSummaryConfig = C0TL6.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(AiSummaryConfig.class, aiSummaryConfig, "live_ai_summary_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return aiSummaryConfig;
    }

    public static final Object invoke$282(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Keva.getRepo("ttlive_preview_repo");
    }

    public static final Object invoke$283(AFwS199S0000000_12 aFwS199S0000000_12) {
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        if (strValueOf == null) {
            return "";
        }
        return strValueOf;
    }

    public static final Object invoke$284(AFwS199S0000000_12 aFwS199S0000000_12) {
        C480460Ism.LIZ().getClass();
        return C480460Ism.LIZLLL(AccompanimentApi.class);
    }

    public static final Object invoke$285(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(C783270Uo1.LIZIZ(), C0UBZ.LL);
    }

    public static final Object invoke$286(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LinkedHashSet();
    }

    public static final Object invoke$287(AFwS199S0000000_12 aFwS199S0000000_12) {
        C480460Ism.LIZ().getClass();
        return C480460Ism.LIZLLL(AccompanimentApi.class);
    }

    public static final Object invoke$288(AFwS199S0000000_12 aFwS199S0000000_12) {
        C480460Ism.LIZ().getClass();
        return C480460Ism.LIZLLL(AccompanimentApi.class);
    }

    public static final Object invoke$289(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LinkedHashSet();
    }

    public static final Object invoke$29(AFwS199S0000000_12 aFwS199S0000000_12) {
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C0UBH("favorite", "favorite", true));
        ListProtector.add(listLJIILJJIL, 1, new C0UBH(C0UD4.LJIIL, "Recents", true));
        ListProtector.add(listLJIILJJIL, 0, new C0UBH("search", "search", true));
        return listLJIILJJIL;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$290(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final Object invoke$291(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C781270Ukn.LJI().getLiveComposerFilterManager();
    }

    public static final Object invoke$292(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IInteractService.class);
    }

    public static final Object invoke$293(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IActionHandlerService.class);
    }

    public static final Object invoke$294(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(ILiveEventStickerService.class);
    }

    public static final Object invoke$295(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IAdminSettingService.class);
    }

    public static final Object invoke$296(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(ILoggerService.class);
    }

    public static final Object invoke$297(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IAnnouncementService.class);
    }

    public static final Object invoke$298(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IMessageService.class);
    }

    public static final Object invoke$299(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IBannerService.class);
    }

    public static final Object invoke$3(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveAdminSettingGuideFragment();
    }

    public static final Object invoke$30(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UMC();
    }

    public static final Object invoke$300(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IMicRoomService.class);
    }

    public static final Object invoke$301(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IBarrageService.class);
    }

    public static final Object invoke$302(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IModeratorService.class);
    }

    public static final Object invoke$303(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IBroadcastService.class);
    }

    public static final Object invoke$304(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IPcsService.class);
    }

    public static final Object invoke$305(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IBrowserService.class);
    }

    public static final Object invoke$306(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IPinCardService.class);
    }

    public static final Object invoke$307(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(ICommentService.class);
    }

    public static final Object invoke$308(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IPublicScreenService.class);
    }

    public static final Object invoke$309(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IPullStreamService.class);
    }

    public static final Object invoke$31(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$310(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IDefinitionService.class);
    }

    public static final Object invoke$311(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IQAService.class);
    }

    public static final Object invoke$312(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IDonationStickerOuterService.class);
    }

    public static final Object invoke$313(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IRankService.class);
    }

    public static final Object invoke$314(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IEffectService.class);
    }

    public static final Object invoke$315(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IRoomFunctionService.class);
    }

    public static final Object invoke$316(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IGameService.class);
    }

    public static final Object invoke$317(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IRoomStickerOuterService.class);
    }

    public static final Object invoke$318(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IGameTopicService.class);
    }

    public static final Object invoke$319(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IShareService.class);
    }

    public static final Object invoke$32(AFwS199S0000000_12 aFwS199S0000000_12) {
        boolean zIsEmpty = C0UA1.LIZ().qr(C0UD4.LIZIZ).isEmpty();
        if (!zIsEmpty) {
            C0UC4.LJIL.LIZIZ("end");
            C0UC4.LJIJJ(1);
        }
        return Boolean.valueOf(zIsEmpty);
    }

    public static final Object invoke$320(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IGiftService.class);
    }

    public static final Object invoke$321(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IShortTouchService.class);
    }

    public static final Object invoke$322(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IGoodyBagService.class);
    }

    public static final Object invoke$323(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(ISlotService.class);
    }

    public static final Object invoke$324(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IHashTagService.class);
    }

    public static final Object invoke$325(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(ISubscribeService.class);
    }

    public static final Object invoke$326(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IHostAction.class);
    }

    public static final Object invoke$327(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IToolbarService.class);
    }

    public static final Object invoke$328(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IHostConfig.class);
    }

    public static final Object invoke$329(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(ITreasureBoxService.class);
    }

    public static final Object invoke$33(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C0U61.LIZ(new C767530U8x(null, null)).get(MultiGuestStickerViewModel.class);
    }

    public static final Object invoke$330(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IHostAppContext.class);
    }

    public static final Object invoke$331(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(ILiveProfileService.class);
    }

    public static final Object invoke$332(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IHostCreativeTool.class);
    }

    public static final Object invoke$333(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IUserInfoWidgetService.class);
    }

    public static final Object invoke$334(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IUserManageService.class);
    }

    public static final Object invoke$335(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IHostPlugin.class);
    }

    public static final Object invoke$336(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IWalletService.class);
    }

    public static final Object invoke$337(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IHostUser.class);
    }

    public static final Object invoke$338(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IHybridContainerManageService.class);
    }

    public static final Object invoke$339(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IHybridContainerService.class);
    }

    public static final Object invoke$34(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1819620xS4.LIZ();
    }

    public static final Object invoke$340(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ArrayList();
    }

    public static final Object invoke$341(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(C768460UCm.LIZIZ().qr(C0UD4.LIZIZ).isEmpty());
    }

    public static final Object invoke$342(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(C768460UCm.LIZIZ().qr(C0UD4.LIZIZ).isEmpty());
    }

    public static final Object invoke$343(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(C768460UCm.LIZIZ().qr(C0UD4.LIZIZ).isEmpty());
    }

    public static final Object invoke$344(AFwS199S0000000_12 aFwS199S0000000_12) {
        InterfaceC772390URp.i.LJFF(Boolean.TRUE);
        C20441214yg.LIZIZ("test_lzk_dynamic", "GameModeContainer - initDynamicStrategy Local settings load dynamic policy tags");
        return Unit.LIZ;
    }

    public static final Object invoke$345(AFwS199S0000000_12 aFwS199S0000000_12) {
        InterfaceC772390URp.i.LJFF(Boolean.TRUE);
        C20441214yg.LIZIZ("test_lzk_dynamic", "GameModeContainer - initDynamicStrategy Local settings load dynamic policy tags");
        return Unit.LIZ;
    }

    public static final Object invoke$346(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(C768460UCm.LIZIZ().qr(C0UD4.LIZIZ).isEmpty());
    }

    public static final Object invoke$347(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(C768460UCm.LIZIZ().qr(C0UD4.LIZIZ).isEmpty());
    }

    public static final Object invoke$348(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf(GameDualDeviceParamsSetting.INSTANCE.getParamSetting().height);
    }

    public static final Object invoke$349(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf(GameDualDeviceParamsSetting.INSTANCE.getParamSetting().width);
    }

    public static final Object invoke$35(AFwS199S0000000_12 aFwS199S0000000_12) {
        Long lValueOf;
        long jCurrentTimeMillis = 0;
        if (C761830TuX.LJIIIIZZ != null) {
            Map<Long, C761820TuW> map = C761830TuX.LJFF;
            LiveEffect liveEffect = C761830TuX.LJIIIIZZ;
            Long lValueOf2 = null;
            if (liveEffect != null) {
                lValueOf = Long.valueOf(liveEffect.getEffectId());
            } else {
                lValueOf = null;
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C761820TuW c761820TuW = (C761820TuW) linkedHashMap.get(lValueOf);
            if (c761820TuW != null) {
                jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - c761820TuW.LIZ;
            }
            LiveEffect liveEffect2 = C761830TuX.LJIIIIZZ;
            if (liveEffect2 != null) {
                lValueOf2 = Long.valueOf(liveEffect2.getEffectId());
            }
            if (linkedHashMap.get(lValueOf2) == null) {
                C1276840jKc.LIZ.getClass();
                Map<String, String> map2 = C1276840jKc.LJIIL;
                map2.remove("voice_effect_id");
                map2.remove("voice_resource_id");
            }
        }
        return Long.valueOf(jCurrentTimeMillis);
    }

    public static final Object invoke$350(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C767210U7r();
    }

    public static final Object invoke$351(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0U5Z();
    }

    public static final Object invoke$352(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C497740JfY.LJII());
    }

    public static final Object invoke$353(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$354(AFwS199S0000000_12 aFwS199S0000000_12) {
        boolean z = C782630Umz.LIZ;
        String value = OptEndLiveSchemaSetting.INSTANCE.getValue();
        if (SecondPageCodeCacheABSetting.INSTANCE.isMatch()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(value);
            sbLIZ.append("&enable_code_cache=1");
            value = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (value.length() <= 0) {
            value = OptEndLiveSchema.INSTANCE.getValue();
        }
        return C1547760qNa.LIZIZ(value);
    }

    public static final Object invoke$355(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$356(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$357(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final Object invoke$358(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Keva.getRepo("repo_name_ls_gps_card");
    }

    public static final /* bridge */ /* synthetic */ Object invoke$359(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final Object invoke$36(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$360(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C773450UVr();
    }

    public static final Object invoke$361(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C2097608Jq.LJIIJ(new Pair(EnumC755930Tl1.LIVE_PREVIEW_LIVING_ANIM, "downgrade_result_lottie_type"), new Pair(EnumC755930Tl1.LIVE_PREVIEW_COVER, "downgrade_result_cover_type"), new Pair(EnumC755930Tl1.LIVE_PREVIEW_PRE_PULL_STREAM_ON_DRAGGING, "downgrade_result_prepull_type"), new Pair(EnumC755930Tl1.LIVE_PREVIEW_GRADUAL_TOP, "downgrade_result_gradient_type"));
    }

    public static final Object invoke$362(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$363(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((LiveCardDegradeConfigStore.LivePreviewCardDegradeConfig) LiveCardDegradeConfigStore.LIZIZ.getValue()).degradeItemConfigs;
    }

    public static final Object invoke$364(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(((LiveCardDegradeConfigStore.LivePreviewCardDegradeConfig) LiveCardDegradeConfigStore.LIZIZ.getValue()).perfEvaluateMinIntervalMs);
    }

    public static final Object invoke$365(AFwS199S0000000_12 aFwS199S0000000_12) {
        C755900Tky.LL.getClass();
        final IPerformanceService iPerformanceServiceRs = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).Rs();
        C1101060el6 c1101060el6V91 = iPerformanceServiceRs.V91(new InterfaceC1101080el8() { // from class: X.0Ukz
            @Override // X.InterfaceC1101080el8
            public final void LIZ() {
            }

            @Override // X.InterfaceC1101080el8
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1101080el8
            public final C1101110elB LJI(InterfaceC1100800ekg interfaceC1100800ekg) {
                return null;
            }

            @Override // X.InterfaceC1101080el8
            public final void message() {
            }

            @Override // X.InterfaceC1101080el8
            public final String scene() {
                return "live_preview_card";
            }

            @Override // X.InterfaceC1101080el8
            public final InterfaceC1100960ekw LIZIZ() {
                return iPerformanceServiceRs.R61(15000L);
            }

            @Override // X.InterfaceC1101080el8
            public final C1ADU LIZJ() {
                IPerformanceService iPerformanceService = iPerformanceServiceRs;
                C755900Tky.LL.getClass();
                return iPerformanceService.ch2(C123100dR.LIZ(null) ? null : "com.ss.android.ugc.aweme.main.MainActivity");
            }

            @Override // X.InterfaceC1101080el8
            public final InterfaceC1100950ekv LJ() {
                return iPerformanceServiceRs.Gr0(15000L);
            }

            @Override // X.InterfaceC1101080el8
            public final InterfaceC1100980eky LJFF() {
                return iPerformanceServiceRs.jk1(15000L);
            }
        });
        if (c1101060el6V91 != null) {
            c1101060el6V91.LJIIIIZZ(C755900Tky.LLJIJIL);
        }
        return c1101060el6V91;
    }

    public static final Object invoke$366(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(((LiveCardDegradeConfigStore.LivePreviewCardDegradeConfig) LiveCardDegradeConfigStore.LIZIZ.getValue()).scoreCacheValidInterval);
    }

    public static final Object invoke$367(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C783110Unl();
    }

    public static final Object invoke$368(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(C0TWJ.LIZIZ.LIZLLL());
    }

    public static final Object invoke$369(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new MutableLiveData();
    }

    public static final Object invoke$37(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ArrayList();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$370(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final Object invoke$371(AFwS199S0000000_12 aFwS199S0000000_12) {
        try {
            return ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage().toLowerCase(Locale.getDefault());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "en";
        }
    }

    public static final Object invoke$372(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new RunnableC768870UEb();
    }

    public static final Object invoke$373(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Keva.getRepo("draft_box_guide_keva");
    }

    public static final /* bridge */ /* synthetic */ Object invoke$374(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$375(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final Object invoke$376(AFwS199S0000000_12 aFwS199S0000000_12) {
        boolean z;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$377(AFwS199S0000000_12 aFwS199S0000000_12) {
        long jCurrentTimeMillis = 0;
        if (C772780UTc.LJFF != 0) {
            jCurrentTimeMillis = (System.currentTimeMillis() - C772780UTc.LJFF) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return Long.valueOf(jCurrentTimeMillis);
    }

    public static final Object invoke$378(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(LiveAIBeautySetting.INSTANCE.enableAIBeauty());
    }

    public static final Object invoke$379(AFwS199S0000000_12 aFwS199S0000000_12) {
        if (C258160A9u.LIZIZ) {
            return new C756420Tlo();
        }
        return new InterfaceC756510Tlx() { // from class: X.0Tly
            @Override // X.InterfaceC756510Tlx
            public final void LIZ(C756480Tlu c756480Tlu, Function0<Unit> function0) {
            }

            @Override // X.InterfaceC756510Tlx
            public final void LIZIZ(EnumC1108010ewJ enumC1108010ewJ) {
            }
        };
    }

    public static final Object invoke$380(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$381(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C760600TsY();
    }

    public static final Object invoke$382(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$383(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ();
    }

    public static final Object invoke$384(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UEI();
    }

    public static final Object invoke$385(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C765720U1y();
    }

    public static final Object invoke$386(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ArrayList();
    }

    public static final Object invoke$387(AFwS199S0000000_12 aFwS199S0000000_12) {
        Retrofit hostRetrofit = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getHostRetrofit();
        if (hostRetrofit != null) {
            return hostRetrofit.LIZ(NaviAvatarApi.class);
        }
        return null;
    }

    public static final Object invoke$388(AFwS199S0000000_12 aFwS199S0000000_12) {
        C1276840jKc.LIZ.getClass();
        Map<String, String> map = C1276840jKc.LJIIJ;
        map.put("broadcast_scene", ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene());
        map.put("broadcast_duration", String.valueOf(C1276840jKc.LJJJ.invoke().longValue()));
        return map;
    }

    public static final Object invoke$389(AFwS199S0000000_12 aFwS199S0000000_12) {
        C1276840jKc.LIZ.getClass();
        Map<String, String> map = C1276840jKc.LJIIJ;
        map.put("broadcast_scene", ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene());
        map.put("broadcast_duration", String.valueOf(C1276840jKc.LJJJ.invoke().longValue()));
        return map;
    }

    public static final Object invoke$39(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C0UD4.LJ;
    }

    public static final Object invoke$390(AFwS199S0000000_12 aFwS199S0000000_12) {
        C1276840jKc.LIZ.getClass();
        Map<String, String> map = C1276840jKc.LJIIJ;
        map.put("broadcast_scene", ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene());
        map.put("broadcast_duration", String.valueOf(C1276840jKc.LJJJ.invoke().longValue()));
        return map;
    }

    public static final Object invoke$391(AFwS199S0000000_12 aFwS199S0000000_12) {
        C1276840jKc.LIZ.getClass();
        Map<String, String> map = C1276840jKc.LJIIJ;
        map.put("broadcast_scene", ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene());
        map.put("broadcast_duration", String.valueOf(C1276840jKc.LJJJ.invoke().longValue()));
        return map;
    }

    public static final Object invoke$392(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf(((LiveFollowGuideFrequencyControlConfig) C0TLA.LIZIZ.getValue()).close3FrequencyDays);
    }

    public static final Object invoke$393(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf(((LiveFollowGuideFrequencyControlConfig) C0TLA.LIZIZ.getValue()).closeAccumulatedDays);
    }

    public static final Object invoke$394(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Keva.getRepo("ttlive_preview_repo");
    }

    public static final Object invoke$395(AFwS199S0000000_12 aFwS199S0000000_12) {
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        if (strValueOf == null) {
            return "";
        }
        return strValueOf;
    }

    public static final Object invoke$396(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1619980sG4.LJFF();
    }

    public static final Object invoke$397(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1619980sG4.LJFF();
    }

    public static final Object invoke$398(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UCZ();
    }

    public static final Object invoke$399(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0TCM();
    }

    public static final Object invoke$4(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveManageListFragment();
    }

    public static final Object invoke$40(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).stickerPresenter();
    }

    public static final Object invoke$400(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new PriorityBlockingQueue(11, new Comparator() { // from class: X.0TG5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C0TAR) obj2).LL.LL - ((C0TAR) obj).LL.LL;
            }
        });
    }

    public static final Object invoke$401(AFwS199S0000000_12 aFwS199S0000000_12) {
        C766270U4b.LIZLLL(2131853080);
        return Unit.LIZ;
    }

    public static final Object invoke$402(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new CountDownFinishOpt();
    }

    public static final Object invoke$403(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new DropBeanEvent();
    }

    public static final Object invoke$404(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new VideoGiftStartEvent();
    }

    public static final Object invoke$405(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new DrawGuessCaptureImageChannel();
    }

    public static final Object invoke$406(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new GameSettlementStart();
    }

    public static final Object invoke$407(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new AnchorWindowParamsChangedEvent();
    }

    public static final Object invoke$408(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new DrawGuessCapturedImageDataEvent();
    }

    public static final Object invoke$409(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new InteractStateChangeEvent();
    }

    public static final Object invoke$41(AFwS199S0000000_12 aFwS199S0000000_12) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService != null) {
            return iBroadcastService.getLiveStreamSoundPlayer();
        }
        return null;
    }

    public static final Object invoke$410(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new StatusBarVisibilityEvent();
    }

    public static final Object invoke$411(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveToStoryClickPublishEvent();
    }

    public static final Object invoke$412(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new GameSettlementEnd();
    }

    public static final Object invoke$413(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new StartLiveEvent();
    }

    public static final Object invoke$414(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ShowStickerPanelEvent();
    }

    public static final Object invoke$415(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BeansAvatarEvent();
    }

    public static final Object invoke$416(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new CountDownFinishEvent();
    }

    public static final Object invoke$417(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ClickInsertStickerEvent();
    }

    public static final Object invoke$418(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BeansAvatarDownloadEvent();
    }

    public static final Object invoke$419(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveEffectCommandChannel();
    }

    public static final Object invoke$42(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).Qj2("from_broadcast_end");
    }

    public static final Object invoke$420(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new FetchGreenScreenLiveGoalInterfaceEvent();
    }

    public static final Object invoke$421(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BeansRoomScoreEvent();
    }

    public static final Object invoke$422(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new StartPollMessageSEIEvent();
    }

    public static final Object invoke$423(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ECLiveStatusChangeChannel();
    }

    public static final Object invoke$424(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BeansRequestLoadStatisticsEvent();
    }

    public static final Object invoke$425(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new SwitchCameraChannel();
    }

    public static final Object invoke$426(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new TtlsLiveProductNumber();
    }

    public static final Object invoke$427(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveBanCapabilityChannel();
    }

    public static final Object invoke$428(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new PauseLiveChannel();
    }

    public static final Object invoke$429(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveTalkStateEvent();
    }

    public static final Object invoke$43(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).Qj2("from_page_approve_comment");
    }

    public static final Object invoke$430(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ScrollToInsertStickerEvent();
    }

    public static final Object invoke$431(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new AnchorBroadcastResolutionChangeEvent();
    }

    public static final Object invoke$432(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BGMDialogShowEvent();
    }

    public static final Object invoke$433(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ShowStickerShortCutPanelEvent();
    }

    public static final Object invoke$434(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ShowEndPageEvent();
    }

    public static final Object invoke$435(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new SetImageToPreviewChannel();
    }

    public static final Object invoke$436(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new StickerShortcutPanelChannel();
    }

    public static final Object invoke$437(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new RTCMixStreamSuccessWhenResumeEvent();
    }

    public static final Object invoke$438(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveHostAutoAdaptiveChannel();
    }

    public static final Object invoke$439(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BeforeStickerSelectedEvent();
    }

    public static final Object invoke$44(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(LiveMarkViewerOptimizationSetting.INSTANCE.getValue());
    }

    public static final Object invoke$440(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BroadcastEnableSubOnlyLiveEvent();
    }

    public static final Object invoke$441(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ShowMusicPanelEvent();
    }

    public static final Object invoke$442(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new FloatWindowWakeEvent();
    }

    public static final Object invoke$443(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BroadcastDisableSubOnlyTrialLiveEvent();
    }

    public static final Object invoke$444(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ClickInsertStickerBackgroundEvent();
    }

    public static final Object invoke$445(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new CheckOverlayPermissionEvent();
    }

    public static final Object invoke$446(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new OnlyPushRtcEngineAlreadyCloseChannel();
    }

    public static final Object invoke$447(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new MuteMicChannel();
    }

    public static final Object invoke$448(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ShouldStartFloatWindowServiceEvent();
    }

    public static final Object invoke$449(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BroadcastEndShowEvent();
    }

    public static final Object invoke$45(AFwS199S0000000_12 aFwS199S0000000_12) {
        LiveCommentBlockKeywordsFragment liveCommentBlockKeywordsFragment = new LiveCommentBlockKeywordsFragment();
        liveCommentBlockKeywordsFragment.LLILZ = "fast_add_block_keywords";
        return liveCommentBlockKeywordsFragment;
    }

    public static final Object invoke$450(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new MuteMicMiniWidgetClosedEvent();
    }

    public static final Object invoke$451(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LinkCrossRoomStateChangeEvent();
    }

    public static final Object invoke$452(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveGlobalECShopShowEvent();
    }

    public static final Object invoke$453(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new VideoBelowBackgroundUpdateEvent();
    }

    public static final Object invoke$454(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveShareToStoryPublishResultEvent();
    }

    public static final Object invoke$455(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ShowFloatWindowEvent();
    }

    public static final Object invoke$456(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LopUnlockEvent();
    }

    public static final Object invoke$457(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new FloatWindowEnterForegroundEvent();
    }

    public static final Object invoke$458(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new StartPushStreamChannel();
    }

    public static final Object invoke$459(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new FloatWindowPlayingNoOverViewPermissionEvent();
    }

    public static final Object invoke$46(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IModeratorService) C1161920gLG.LIZJ(IModeratorService.class)).wN1(null);
    }

    public static final Object invoke$460(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new StickerSelectedEvent();
    }

    public static final Object invoke$461(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BroadcastSchemaOpenPanelParamsEvent();
    }

    public static final Object invoke$462(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new EndLiveWithoutEndPage();
    }

    public static final Object invoke$463(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BroadcastSchemaOpenPanelEvent();
    }

    public static final Object invoke$464(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new StickerCancelChannel();
    }

    public static final Object invoke$465(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new TurnOnVisualRelatedFunctionEvent();
    }

    public static final Object invoke$466(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveGoalEffectChannel();
    }

    public static final Object invoke$467(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new DropComboBombEvent();
    }

    public static final Object invoke$468(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new MoveLiveGoalEffectEvent();
    }

    public static final Object invoke$469(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new DropSystemBombEvent();
    }

    public static final Object invoke$47(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).YT1();
    }

    public static final Object invoke$470(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LiveGameEffectFetchedChannel();
    }

    public static final Object invoke$471(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C11NJ();
    }

    public static final Object invoke$472(AFwS199S0000000_12 aFwS199S0000000_12) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJII().getDir("live_capture_video", 0).getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("effect_video.h264");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$473(AFwS199S0000000_12 aFwS199S0000000_12) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJII().getDir("live_capture_video", 0).getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("origin_video.h264");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$474(AFwS199S0000000_12 aFwS199S0000000_12) {
        C20441214yg.LIZIZ("CaptureVideoUploadController", "effect file update success");
        InterfaceC772190UQv.h3.LJFF(Long.valueOf(System.currentTimeMillis()));
        return Unit.LIZ;
    }

    public static final Object invoke$475(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f))));
    }

    public static final Object invoke$476(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.TRUE;
    }

    public static final Object invoke$477(AFwS199S0000000_12 aFwS199S0000000_12) {
        return PluggableExtentionKt.pluggableSpi$default(IInboxActionService.class, false, false, false, 14, null);
    }

    public static final Object invoke$478(AFwS199S0000000_12 aFwS199S0000000_12) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "PublishEventDispatcher";
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static final Object invoke$479(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).generateDualDeviceSignalManager();
    }

    public static final Object invoke$48(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).Qj2("");
    }

    public static final Object invoke$480(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).generateDualDeviceSignalManager();
    }

    public static final Object invoke$481(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0TCQ();
    }

    public static final Object invoke$482(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$483(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$484(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C20105113lZ(new C0UPC(0L, null, null, 31));
    }

    public static final Object invoke$485(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C20105113lZ(new C0UPC(0L, null, null, 31));
    }

    public static final Object invoke$486(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C756420Tlo();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$487(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final Object invoke$488(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).o3();
    }

    public static final Object invoke$489(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$49(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C781270Ukn.LJIJJLI().XI2();
    }

    public static final Object invoke$490(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$491(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(C1514430pVp.LIZ());
    }

    public static final Object invoke$492(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Keva.getRepo("keva_repo_profile_viewer");
    }

    public static final Object invoke$493(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new GameMessageAlertDialog();
    }

    public static final Object invoke$494(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C011B();
    }

    public static final Object invoke$495(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$496(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$497(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$498(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$499(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ConcurrentLinkedDeque();
    }

    public static final Object invoke$5(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IRankService) C1161920gLG.LIZJ(IRankService.class)).Wq0(1);
    }

    public static final Object invoke$50(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.FALSE;
    }

    public static final Object invoke$500(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$501(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$502(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$503(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$504(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new AudienceInteractionFeaturesDialog();
    }

    public static final Object invoke$505(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$506(AFwS199S0000000_12 aFwS199S0000000_12) {
        com.bytedance.ies.abmock.SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(com.bytedance.ies.abmock.SettingsManager.LIZ("ttplus_feedcard_request_android_debug", false));
    }

    public static final Object invoke$507(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C746020TOe.LIZ();
    }

    public static final Object invoke$508(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Keva.getRepo("repo_ttplus_date");
    }

    public static final Object invoke$509(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.TRUE;
    }

    public static final Object invoke$51(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static final Object invoke$510(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ArrayList();
    }

    public static final Object invoke$511(AFwS199S0000000_12 aFwS199S0000000_12) {
        Context topActivity = ActivityStack.getTopActivity();
        if (topActivity == null) {
            C844470XAv.LIZ.getClass();
            topActivity = C844470XAv.LIZ();
        }
        return Integer.valueOf(C960203pA.LIZ(R.attr.a1j, topActivity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$512(AFwS199S0000000_12 aFwS199S0000000_12) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        PopupInstanceConfig popupInstanceConfig;
        tbk.c.LIZLLL = EnumC755480TkI.LL;
        if (ChannelsAuthRefactorExp.INSTANCE.enabled()) {
            UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("publish_finish");
            unifiedAuthPopupConfigLIZJ.setSceneId("publish_finish_post_push_manager");
            unifiedAuthPopupConfigLIZJ.setEnterMethod("toast_disappear");
            List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
            if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                popupInstanceConfig.setPopupCombinationType(3);
            }
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(activityLIZ, null, unifiedAuthPopupConfigLIZJ);
            }
        } else {
            C1917290zzb c1917290zzb = new C1917290zzb(null, 0 == true ? 1 : 0, "toast_disappear", "publish", 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8179);
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                if (AddOptionForGuidanceExp.LIZJ > 0) {
                    c1917290zzb.LIZ = AddOptionForGuidanceExp.LIZIZ("publish");
                    C19212010Ec.LIZJ.LJIILJJIL(topActivity, c1917290zzb);
                } else {
                    C19212010Ec.LIZJ.LJIILJJIL(topActivity, c1917290zzb);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$513(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C759500Tqm();
    }

    public static final Object invoke$514(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$515(AFwS199S0000000_12 aFwS199S0000000_12) {
        C1097680efe c1097680efe = new C1097680efe();
        c1097680efe.LJIIZILJ = true;
        c1097680efe.LIZ = "incentive_feed_lynx_card";
        c1097680efe.LJIJI = -1;
        c1097680efe.LJ = false;
        c1097680efe.LJIIIIZZ = AnonymousClass0208.get$arr$(61);
        c1097680efe.LJIJJ = AFwS326S0000000_1.get$arr$(17);
        return c1097680efe;
    }

    public static final Object invoke$516(AFwS199S0000000_12 aFwS199S0000000_12) {
        C0TJI.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$517(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C766120U3m();
    }

    public static final Object invoke$518(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new InterfaceC1143270frB() { // from class: X.0frA
            @Override // X.InterfaceC1143270frB
            public final void LIZ() {
            }

            @Override // X.InterfaceC1143270frB
            public final void LIZIZ(int i, int i2, Map<String, String> map, String str, String str2, byte[] bArr) throws JSONException {
                C774640Ua6 c774640Ua6 = C774640Ua6.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("on receive event: ");
                LiveEndLiveWsEnableSwitch liveEndLiveWsEnableSwitch = LiveEndLiveWsEnableSwitch.INSTANCE;
                sbLIZ.append(liveEndLiveWsEnableSwitch.isEnable());
                C774640Ua6.LIZ("FullBroadcastLife", C2188811AlT.LIZIZ(sbLIZ));
                if (liveEndLiveWsEnableSwitch.isEnable() && !LiveFEWebSocketBlackList.INSTANCE.shouldBlock(i, i2)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("service_id", i);
                    jSONObject.put("method_id", i2);
                    jSONObject.put("payload_type", str);
                    jSONObject.put("payload_encoding", str2);
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : ((HashMap) map).entrySet()) {
                        jSONObject2.put((String) entry.getKey(), entry.getValue());
                    }
                    jSONObject.put("headers", jSONObject2);
                    Charset charset = Charsets.UTF_8;
                    jSONObject.put("payload", new String(bArr, charset));
                    C774640Ua6 c774640Ua62 = C774640Ua6.LL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("on send event inside: ");
                    sbLIZ2.append(new String(bArr, charset));
                    C774640Ua6.LIZ("FullBroadcastLife", C2188811AlT.LIZIZ(sbLIZ2));
                    C389001fE.LIZ("on_ws_message_received", jSONObject, System.currentTimeMillis(), false);
                }
            }
        };
    }

    public static final Object invoke$519(AFwS199S0000000_12 aFwS199S0000000_12) {
        HandlerThread handlerThread = new HandlerThread("WholeLinkTrackingMonitor");
        handlerThread.start();
        return handlerThread;
    }

    public static final Object invoke$52(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.FALSE;
    }

    public static final Object invoke$520(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(C783270Uo1.LIZ());
    }

    public static final Object invoke$521(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$522(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$523(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new Object() { // from class: X.0UE4
        };
    }

    public static final Object invoke$524(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C752560Tfa();
    }

    public static final Object invoke$525(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new Object() { // from class: X.0UE2
        };
    }

    public static final Object invoke$526(AFwS199S0000000_12 aFwS199S0000000_12) {
        ComplianceServiceProvider.LJJI().LJIJJLI(null, 0);
        return Unit.LIZ;
    }

    public static final Object invoke$527(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ArrayList();
    }

    public static final Object invoke$528(AFwS199S0000000_12 aFwS199S0000000_12) {
        C761680TuI.LIZ = InterfaceC766480U4w.LJJJ.LIZIZ().booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$529(AFwS199S0000000_12 aFwS199S0000000_12) {
        C761680TuI.LIZ = true;
        return Unit.LIZ;
    }

    public static final Object invoke$53(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$530(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ArrayList();
    }

    public static final Object invoke$531(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C759790TrF();
    }

    public static final Object invoke$532(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C759790TrF();
    }

    public static final Object invoke$533(AFwS199S0000000_12 aFwS199S0000000_12) {
        C480460Ism.LIZ().getClass();
        return C480460Ism.LIZLLL(LiveReplayPlaylistApi.class);
    }

    public static final Object invoke$534(AFwS199S0000000_12 aFwS199S0000000_12) {
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            return new WidgetLoadViewModel();
        }
        C766270U4b.LJIIJJI("VideoLive start error. please contact @sunshuai.12345");
        throw new IllegalStateException("VideoLive start error. Context is null, generate WidgetLoadViewModel failed.Please contact @sunshuai.12345");
    }

    public static final Object invoke$535(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$536(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C098J(8);
    }

    public static final Object invoke$537(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new LinkedHashSet();
    }

    public static final Object invoke$538(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$539(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UDQ();
    }

    public static final Object invoke$54(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C775180Uay();
    }

    public static final Object invoke$540(AFwS199S0000000_12 aFwS199S0000000_12) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "story_publisher_synthetic_wave_executor";
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static final Object invoke$541(AFwS199S0000000_12 aFwS199S0000000_12) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "story_streaming_download_wait";
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static final Object invoke$542(AFwS199S0000000_12 aFwS199S0000000_12) {
        try {
            com.bytedance.ies.abmock.SettingsManager settingsManagerLIZLLL = com.bytedance.ies.abmock.SettingsManager.LIZLLL();
            Configuration configuration = C0TNR.LIZ;
            Configuration configuration2 = (Configuration) settingsManagerLIZLLL.LJIIIIZZ("video_view_history_guide_tips", Configuration.class, configuration);
            if (configuration2 != null) {
                return configuration2;
            }
            return configuration;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C0TNR.LIZ;
        }
    }

    public static final Object invoke$543(AFwS199S0000000_12 aFwS199S0000000_12) {
        try {
            com.bytedance.ies.abmock.SettingsManager settingsManagerLIZLLL = com.bytedance.ies.abmock.SettingsManager.LIZLLL();
            VideoViewerMaxFollowersConfig videoViewerMaxFollowersConfig = C0TNS.LIZ;
            VideoViewerMaxFollowersConfig videoViewerMaxFollowersConfig2 = (VideoViewerMaxFollowersConfig) settingsManagerLIZLLL.LJIIIIZZ("video_views_config", VideoViewerMaxFollowersConfig.class, videoViewerMaxFollowersConfig);
            if (videoViewerMaxFollowersConfig2 != null) {
                return videoViewerMaxFollowersConfig2;
            }
            return videoViewerMaxFollowersConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C0TNS.LIZ;
        }
    }

    public static final Object invoke$544(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.TRUE;
    }

    public static final Object invoke$545(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ServiceManager.get().getService(IProfileService.class);
    }

    public static final Object invoke$546(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf(C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJIILLIIL());
    }

    public static final Object invoke$547(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$548(AFwS199S0000000_12 aFwS199S0000000_12) {
        return "collab_keva_key_post_entry_" + C0XQ7.LJFF().getCurUserId();
    }

    public static final Object invoke$549(AFwS199S0000000_12 aFwS199S0000000_12) {
        return "collab_keva_key_intro_panel_" + C0XQ7.LJFF().getCurUserId();
    }

    public static final Object invoke$55(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new Object() { // from class: X.0UZk
        };
    }

    public static final Object invoke$550(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Long.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$551(AFwS199S0000000_12 aFwS199S0000000_12) {
        return UserService.getInstance().user().getCurrentUser().getSecUid();
    }

    public static final Object invoke$552(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C1161920gLG.LIZJ(IPinCardService.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$553(AFwS199S0000000_12 aFwS199S0000000_12) {
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Effect effect = new Effect(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, 0 == true ? 1 : 0, objArr28, objArr29, j, objArr30, objArr31, j, objArr32, objArr33, objArr34, objArr35, objArr36, 0 == true ? 1 : 0, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, j, objArr46, objArr47, objArr48, j, j, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr54);
        effect.setId("id_fake_header");
        effect.setUnzipPath("");
        return effect;
    }

    public static final Object invoke$554(AFwS199S0000000_12 aFwS199S0000000_12) {
        boolean z = false;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIZ(0, "viewer_history");
        if (privacySettingsRestrictionItemLJIIIZ != null && privacySettingsRestrictionItemLJIIIZ.showType != 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$555(AFwS199S0000000_12 aFwS199S0000000_12) {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "starship_engine-serial-t";
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public static final Object invoke$556(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C582130MsN.LIZ().LIZ();
    }

    public static final Object invoke$557(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C603820NmG(20);
    }

    public static final Object invoke$558(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new MutableLiveData();
    }

    public static final Object invoke$559(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Float.valueOf(C497740JfY.LJIIZILJ() * 0.16f);
    }

    public static final Object invoke$56(AFwS199S0000000_12 aFwS199S0000000_12) {
        return DataChannelGlobal.LLILZ.gg0(C168F.class);
    }

    public static final Object invoke$560(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Float.valueOf(C497740JfY.LJIIZILJ() * 0.1f);
    }

    public static final Object invoke$57(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$58(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C781270Ukn.LJI().getComposerFilterSlideHelper();
    }

    public static final Object invoke$60(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C11NJ();
    }

    public static final Object invoke$61(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$62(AFwS199S0000000_12 aFwS199S0000000_12) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return Long.valueOf(id);
    }

    public static final Object invoke$63(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(LiveCenterNewAcademySetting.INSTANCE.isNewAcademy());
    }

    public static final Object invoke$64(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new PreviewCoverSelectDialog();
    }

    public static final Object invoke$66(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$67(AFwS199S0000000_12 aFwS199S0000000_12) {
        return ((IGameService) C1161920gLG.LIZJ(IGameService.class)).ss0();
    }

    public static final Object invoke$68(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new PreviewCoverSelectDialog();
    }

    public static final Object invoke$69(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$7(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C747450TTr.LIZIZ.getValue();
    }

    public static final Object invoke$70(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$71(AFwS199S0000000_12 aFwS199S0000000_12) {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$72(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C11NJ();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$73(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Unit.LIZ;
    }

    public static final Object invoke$74(AFwS199S0000000_12 aFwS199S0000000_12) {
        return UserService.getInstance().user().LJIJJLI();
    }

    public static final Object invoke$75(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C781270Ukn.LIZIZ().Rz2();
    }

    public static final Object invoke$76(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C781270Ukn.LIZIZ().Qj2("");
    }

    public static final Object invoke$77(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C781270Ukn.LIZIZ().GL2();
    }

    public static final Object invoke$78(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BasePreviewSettingMainFragment();
    }

    public static final Object invoke$79(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new PreviewVideoQualityFragment();
    }

    public static final Object invoke$8(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$80(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new PreviewTitleCoverFragment();
    }

    public static final Object invoke$81(AFwS199S0000000_12 aFwS199S0000000_12) {
        PreviewCoverSelectDialog previewCoverSelectDialog = new PreviewCoverSelectDialog();
        Bundle bundle = new Bundle();
        bundle.putBoolean("autoClose", true);
        previewCoverSelectDialog.setArguments(bundle);
        return previewCoverSelectDialog;
    }

    public static final Object invoke$82(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new PreviewCoverSelectDialog();
    }

    public static final Object invoke$83(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new PreviewCoverSelectDialog();
    }

    public static final Object invoke$84(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UQ8() { // from class: X.0URx
            public final LiveMode LIZ = LiveMode.VIDEO;
            public final InterfaceC759380Tqa[] LIZIZ;

            @Override // X.C0UQ8
            public final void LIZIZ() {
            }

            @Override // X.C0UQ8
            public final void LIZLLL(String str, String str2) {
            }

            @Override // X.C0UQ8
            public final boolean LJIIIIZZ(Fragment fragment) {
                return false;
            }

            {
                C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
                InterfaceC759380Tqa[] interfaceC759380TqaArr = new InterfaceC759380Tqa[14];
                interfaceC759380TqaArr[0] = new C500780JkS();
                interfaceC759380TqaArr[1] = new C771730UPb();
                interfaceC759380TqaArr[2] = new C501000Jko();
                interfaceC759380TqaArr[3] = new C500850JkZ();
                interfaceC759380TqaArr[4] = new C0US9();
                interfaceC759380TqaArr[5] = new C771940UPw();
                interfaceC759380TqaArr[6] = new C772680USs();
                interfaceC759380TqaArr[7] = new C758890Tpn();
                interfaceC759380TqaArr[8] = new C758880Tpm();
                interfaceC759380TqaArr[9] = new C758900Tpo();
                interfaceC759380TqaArr[10] = OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable() ? null : new C772640USo();
                interfaceC759380TqaArr[11] = GoLiveVoiceCallConflictCheckSetting.INSTANCE.enable() ? new C0USC() : null;
                interfaceC759380TqaArr[12] = new C759550Tqr();
                interfaceC759380TqaArr[13] = new C500830JkX();
                this.LIZIZ = interfaceC759380TqaArr;
            }

            @Override // X.C0UQ8
            public final InterfaceC759380Tqa[] LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C0UQ8
            public final void LJFF(Fragment fragment) {
                DataChannel dataChannelLJ;
                Context context;
                String str;
                PreviewPageActivePlaybook previewPageActivePlaybookYK2;
                if (fragment == null || (dataChannelLJ = C475510Ikn.LJ(fragment)) == null || (context = fragment.getContext()) == null) {
                    return;
                }
                PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
                LiveMode liveMode = this.LIZ;
                previewContinueLiveHelper.getClass();
                Intent intentCreateStartBroadcastIntent = C781270Ukn.LJIIJ().createStartBroadcastIntent(C500260Jjc.LJ(context), PreviewContinueLiveHelper.LIZ(liveMode));
                RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class);
                if (roomCreateInfo != null) {
                    str = roomCreateInfo.mAdditionalPrompt;
                } else {
                    str = null;
                }
                intentCreateStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
                intentCreateStartBroadcastIntent.putExtra("request_page", (String) dataChannelLJ.gg0(C0ULI.class));
                if (BugFixPlaybookDataChannelNullSetting.INSTANCE.enable()) {
                    previewPageActivePlaybookYK2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).yK2(dataChannelLJ);
                } else {
                    previewPageActivePlaybookYK2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).yK2(null);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("previewPageActivePlaybook=");
                sbLIZ.append(previewPageActivePlaybookYK2);
                C20441214yg.LJIIIZ("startLiveActivity", C2188811AlT.LIZIZ(sbLIZ));
                intentCreateStartBroadcastIntent.putExtra("preview_page_active_playbook", previewPageActivePlaybookYK2);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentCreateStartBroadcastIntent, "Context_startActivity_1");
                C1701330uNH.LIZ(intentCreateStartBroadcastIntent, context);
                C2204961BRm.LJJJJJL(context, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyWq4lqd1QtMgqsXrtSuStWhHQO+Z/DPo5PjyQiffsU9BTgUP5zKoHU", null));
            }

            @Override // X.C0UQ8
            public final boolean LIZJ(ApplyLivePermission applyLivePermission, DetailLivePermission detailLivePermission) {
                Boolean boolValueOf;
                Boolean boolValueOf2 = null;
                if (detailLivePermission != null) {
                    boolValueOf = Boolean.valueOf(detailLivePermission.videoPermission);
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                    if (applyLivePermission != null) {
                        boolValueOf2 = Boolean.valueOf(applyLivePermission.videoApplyPermission);
                    }
                    if (C500260Jjc.LJJJI(boolValueOf2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.C0UQ8
            public final void LJ(DataChannel dataChannel, int i) {
                C772780UTc.LJFF(i, this.LIZ);
                C781270Ukn.LJ().startLiveManager().LJIIIZ(dataChannel, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0UQ8
            public final void LJI(Fragment fragment, Boolean bool) {
                DataChannel dataChannelLJ;
                Bundle bundle;
                String str;
                String str2;
                boolean z;
                PreviewPageActivePlaybook previewPageActivePlaybookYK2;
                Fragment fragment2;
                if (fragment != null && (dataChannelLJ = C475510Ikn.LJ(fragment)) != null) {
                    PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
                    LiveMode liveMode = this.LIZ;
                    previewContinueLiveHelper.getClass();
                    int iLIZ = PreviewContinueLiveHelper.LIZ(liveMode);
                    InterfaceC214902198i interfaceC214902198iCreateStartBroadcastFragment = C781270Ukn.LJIIJ().createStartBroadcastFragment(iLIZ);
                    if (interfaceC214902198iCreateStartBroadcastFragment == 0) {
                        return;
                    }
                    if (!(interfaceC214902198iCreateStartBroadcastFragment instanceof Fragment) || (fragment2 = (Fragment) interfaceC214902198iCreateStartBroadcastFragment) == null || (bundle = fragment2.getArguments()) == null) {
                        bundle = new Bundle();
                    }
                    bundle.putInt("broadcast_type", iLIZ);
                    RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class);
                    if (roomCreateInfo != null) {
                        str = roomCreateInfo.mAdditionalPrompt;
                    } else {
                        str = null;
                    }
                    C786410Ut5.LJJJI("live.intent.extra.LIVE_PC_TIPS", str, bundle);
                    C786410Ut5.LJJJI("request_page", (String) dataChannelLJ.gg0(C0ULI.class), bundle);
                    bundle.putInt("broadcast_type", iLIZ);
                    RoomCreateInfo roomCreateInfo2 = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class);
                    if (roomCreateInfo2 != null) {
                        str2 = roomCreateInfo2.mAdditionalPrompt;
                    } else {
                        str2 = null;
                    }
                    C786410Ut5.LJJJI("live.intent.extra.LIVE_PC_TIPS", str2, bundle);
                    C786410Ut5.LJJJI("request_page", (String) dataChannelLJ.gg0(C0ULI.class), bundle);
                    Bundle arguments = fragment.getArguments();
                    if (arguments != null) {
                        z = arguments.getBoolean("is_light_record_container_mode");
                    } else {
                        z = false;
                    }
                    bundle.putBoolean("is_light_record_container_mode", z);
                    if (BugFixPlaybookDataChannelNullSetting.INSTANCE.enable()) {
                        previewPageActivePlaybookYK2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).yK2(dataChannelLJ);
                    } else {
                        previewPageActivePlaybookYK2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).yK2(null);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("previewPageActivePlaybook=");
                    sbLIZ.append(previewPageActivePlaybookYK2);
                    C20441214yg.LJIIIZ("startLiveActivity", C2188811AlT.LIZIZ(sbLIZ));
                    C786410Ut5.LJJIJL(bundle, "preview_page_active_playbook", previewPageActivePlaybookYK2);
                    InterfaceC20622815ms interfaceC20622815msLIZ = C520010KaN.LIZ(fragment.getActivity());
                    if (interfaceC20622815msLIZ != null) {
                        C520010KaN.LJIIL(interfaceC20622815msLIZ, interfaceC214902198iCreateStartBroadcastFragment, -1, bundle, 0, bool, 8);
                    }
                }
            }

            @Override // X.C0UQ8
            public final C772410URr LJII(Context context, DataChannel dataChannel, WeakHandler weakHandler) {
                String strLIZ;
                int iIntValue;
                boolean zBooleanValue;
                int i;
                int i2;
                int i3;
                int i4;
                boolean zBooleanValue2;
                long j;
                long j2;
                long j3;
                boolean zBooleanValue3;
                boolean zBooleanValue4;
                String str;
                boolean zIsLocationPermissionGranted;
                boolean z;
                int iIntValue2;
                int iIntValue3;
                int iLIZIZ;
                CommercialContentToggle commercialContentToggle;
                int i5;
                int i6;
                C758940Tps c758940Tps;
                IHostAppContext iHostAppContext;
                String str2;
                Long l;
                LiveEventInfo liveEventInfo;
                if (dataChannel == null) {
                    return null;
                }
                C754700Tj2.LJ((Hashtag) dataChannel.gg0(HashtagChangedChannel.class));
                C772410URr c772410URr = new C772410URr(weakHandler, this.LIZ);
                String str3 = (String) dataChannel.gg0(PreviewTitleChannel.class);
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                c772410URr.LIZJ = str3;
                C754410TiZ c754410TiZ = (C754410TiZ) dataChannel.gg0(LiveCoverControllerChannel.class);
                if (c754410TiZ == null || (strLIZ = c754410TiZ.LIZ()) == null) {
                    strLIZ = "";
                }
                c772410URr.LIZLLL = strLIZ;
                c772410URr.LJ = C0UQX.LJFF(c772410URr.LIZIZ);
                boolean z2 = true;
                c772410URr.LJFF = 1;
                Integer num = (Integer) dataChannel.gg0(GiftFeatureChannel.class);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                c772410URr.LJI = iIntValue;
                Boolean bool = (Boolean) dataChannel.gg0(OptOutGiftGalleryChannel.class);
                int i7 = 0;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                c772410URr.LJJIIJ = zBooleanValue;
                if (C500260Jjc.LJJJI((Boolean) dataChannel.gg0(CommentFeaturePreviewChannel.class))) {
                    i = 1;
                } else {
                    i = 2;
                }
                c772410URr.LJII = i;
                C0USP c0usp = (C0USP) dataChannel.gg0(RankingSwitchChannel.class);
                if (c0usp != null) {
                    i2 = c0usp.LIZ;
                } else {
                    i2 = 1;
                }
                c772410URr.LJIIIZ = i2;
                C0USP c0usp2 = (C0USP) dataChannel.gg0(RankingSwitchChannel.class);
                if (c0usp2 != null) {
                    i3 = c0usp2.LIZIZ;
                } else {
                    i3 = 0;
                }
                c772410URr.LJIIJ = i3;
                C0USP c0usp3 = (C0USP) dataChannel.gg0(RankingSwitchChannel.class);
                if (c0usp3 != null) {
                    i4 = c0usp3.LIZJ;
                } else {
                    i4 = 0;
                }
                c772410URr.LJIIJJI = i4;
                dataChannel.gg0(RankingSwitchChannel.class);
                C770220UJg c770220UJg = C770220UJg.LIZ;
                c772410URr.LJIIL = C770220UJg.LIZJ(C13LE.LIZ(PreviewReplayWidget.class));
                c772410URr.LJIILIIL = (RoomDecoration) dataChannel.gg0(SelectedDonationStickerChannel.class);
                Boolean bool2 = (Boolean) dataChannel.gg0(C0UP3.class);
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                c772410URr.LJIILJJIL = zBooleanValue2;
                if (User.sSubPermission && C494680Jac.LJJI()) {
                    j = 1;
                } else {
                    j = 2;
                }
                c772410URr.LJIIIIZZ = j;
                RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class);
                long jLongValue = 0;
                if (roomCreateInfo != null && (liveEventInfo = roomCreateInfo.mLiveEventInfo) != null) {
                    j2 = liveEventInfo.id;
                } else {
                    j2 = 0;
                }
                c772410URr.LJIIZILJ = j2;
                Hashtag hashtag = (Hashtag) dataChannel.gg0(HashtagChangedChannel.class);
                if (hashtag == null || (j3 = hashtag.id) == null) {
                    j3 = 0L;
                }
                c772410URr.LJIILLIIL = j3;
                GameTag gameTagFB = ((IGameTopicService) C1161920gLG.LIZJ(IGameTopicService.class)).fB(c772410URr.LIZIZ);
                if (gameTagFB != null && (l = gameTagFB.id) != null) {
                    jLongValue = l.longValue();
                }
                c772410URr.LJIJI = jLongValue;
                Boolean bool3 = (Boolean) dataChannel.gg0(C0UQG.class);
                if (bool3 != null) {
                    zBooleanValue3 = bool3.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                c772410URr.LJIJJ = zBooleanValue3;
                Boolean bool4 = (Boolean) dataChannel.gg0(C0UQF.class);
                if (bool4 != null) {
                    zBooleanValue4 = bool4.booleanValue();
                } else {
                    zBooleanValue4 = false;
                }
                c772410URr.LJIJJLI = zBooleanValue4;
                c772410URr.LJJ = new C0USU() { // from class: X.0US8
                    @Override // X.C0USU
                    public final void LIZ(Room room) {
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                        dataChannelGlobal.JQ2(C930860aKa.class, Boolean.FALSE);
                        Creator creator = room.creator;
                        if (creator != null && (creator.roomContinue == 1 || creator.roomContinue == 3)) {
                            return;
                        }
                        dataChannelGlobal.JQ2(C930940aKi.class, room);
                        Context contextLIZ = C01AB.LIZ();
                        if (contextLIZ == null) {
                            return;
                        }
                        C20441214yg.LIZIZ("songsong", "VideoStartLiveStrategy preloadLiveStream");
                        C776270Ucj.LIZ.getClass();
                        C776270Ucj.LJIJ(contextLIZ, room);
                    }
                };
                Object objGg0 = dataChannel.gg0(C755600TkU.class);
                Boolean bool5 = Boolean.TRUE;
                c772410URr.LJJJJJ = Intrinsics.LJFF(objGg0, bool5);
                C0UST c0ust = (C0UST) dataChannel.gg0(C0USR.class);
                if (c0ust == null || (str = c0ust.LIZ) == null) {
                    str = "";
                }
                c772410URr.LJJJJ = str;
                C0UST c0ust2 = (C0UST) dataChannel.gg0(C0USR.class);
                if (c0ust2 != null && (str2 = c0ust2.LIZIZ) != null) {
                    str4 = str2;
                }
                c772410URr.LJJJJI = str4;
                if (context != null && (iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) != null) {
                    zIsLocationPermissionGranted = iHostAppContext.isLocationPermissionGranted(context);
                } else {
                    zIsLocationPermissionGranted = false;
                }
                c772410URr.LJJJJJL = zIsLocationPermissionGranted;
                C1D47 c1d47LJFF = C1D4I.LJFF();
                if (c1d47LJFF != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getRoomCreateParam() -> ");
                    sbLIZ.append(c1d47LJFF.LIZJ());
                    sbLIZ.append(", result: ");
                    sbLIZ.append(c1d47LJFF);
                    C20441214yg.LIZIZ("LiveSpeedTestAdapter", C2188811AlT.LIZIZ(sbLIZ));
                    c772410URr.LJJI = c1d47LJFF.LIZJ();
                    c772410URr.LJJJJL = c1d47LJFF;
                }
                if (dataChannel.gg0(SelectedStreamResolutionChannel.class) != null) {
                    z = true;
                } else {
                    z = false;
                }
                c772410URr.LJJIFFI = C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0;
                Integer num2 = (Integer) dataChannel.gg0(C772000UQc.class);
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                c772410URr.LJJIJIL = iIntValue2;
                c772410URr.LJJIJL = (String) dataChannel.gg0(C772090UQl.class);
                Integer num3 = (Integer) dataChannel.gg0(AgeRestrictedChannel.class);
                if (num3 != null) {
                    iIntValue3 = num3.intValue();
                } else {
                    iIntValue3 = 0;
                }
                c772410URr.LJJII = iIntValue3;
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                C758920Tpq c758920Tpq = (C758920Tpq) dataChannelGlobal.gg0(ECBcToggleChannel.class);
                if (c758920Tpq != null) {
                    iLIZIZ = c758920Tpq.LIZIZ();
                } else {
                    iLIZIZ = 3;
                }
                c772410URr.LJJIII = iLIZIZ;
                C758920Tpq c758920Tpq2 = (C758920Tpq) dataChannelGlobal.gg0(ECBcToggleChannel.class);
                if (c758920Tpq2 == null || (commercialContentToggle = c758920Tpq2.LIZIZ) == null) {
                    commercialContentToggle = new CommercialContentToggle();
                }
                c772410URr.LJJIIJZLJL = commercialContentToggle;
                C758920Tpq c758920Tpq3 = (C758920Tpq) dataChannelGlobal.gg0(ECBcToggleChannel.class);
                if (c758920Tpq3 != null && (c758940Tps = c758920Tpq3.LIZ) != null && c758940Tps.LJI == 1) {
                    CommercialContentToggle commercialContentToggle2 = c772410URr.LJJIIJZLJL;
                    commercialContentToggle2.openCommercialContentToggle = true;
                    if (!commercialContentToggle2.promoteMyself && !commercialContentToggle2.promoteThirdParty) {
                        commercialContentToggle2.promoteMyself = true;
                    }
                }
                c772410URr.LJJIIZ = C494680Jac.LIZJ() ? 1 : 0;
                c772410URr.LJJIIZI = C494680Jac.LJ();
                c772410URr.LJJIJ = C494680Jac.LIZLLL();
                if (C494680Jac.LIZJ() && !C494680Jac.LJFF()) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                c772410URr.LJJIJIIJI = i5;
                C486790J7d.LIZ(new ARunnableS112S0100000_12(c772410URr, 365));
                if (Intrinsics.LJFF(dataChannelGlobal.gg0(C931110aKz.class), bool5) && InterfaceC1106030et7.v6.LIZIZ().booleanValue()) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                c772410URr.LJJIJIIJIL = i6;
                if (Intrinsics.LJFF(C0KPJ.Je.LIZ(), Boolean.FALSE) || !LiveSubscriptionSubOnlyLongDurationPreviewDolphinSetting.getEnableLongPreview()) {
                    z2 = false;
                }
                c772410URr.LJJIL = z2;
                StarCommentConfig starCommentConfig = (StarCommentConfig) dataChannel.gg0(C752120Tes.class);
                if (starCommentConfig == null) {
                    starCommentConfig = new StarCommentConfig();
                }
                c772410URr.LJJIZ = starCommentConfig;
                c772410URr.LJJJ = C494680Jac.LIZIZ() ? 1 : 0;
                C758220Toi c758220Toi = (C758220Toi) dataChannel.gg0(VisibleScopeSelectedChannel.class);
                if (c758220Toi != null) {
                    int i8 = c758220Toi.LIZ;
                    if (i8 != 3) {
                        i7 = i8;
                    }
                    c772410URr.LJJJIL = i7;
                }
                return c772410URr;
            }
        };
    }

    public static final Object invoke$85(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C772460URw();
    }

    public static final Object invoke$86(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UQ8() { // from class: X.0URy
            public final LiveMode LIZ = LiveMode.LIVE_VOICE;
            public final String LIZIZ = C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
            public final InterfaceC759380Tqa[] LIZJ;

            @Override // X.C0UQ8
            public final void LIZIZ() {
            }

            @Override // X.C0UQ8
            public final void LIZLLL(String str, String str2) {
            }

            @Override // X.C0UQ8
            public final boolean LJIIIIZZ(Fragment fragment) {
                return false;
            }

            {
                InterfaceC759380Tqa[] interfaceC759380TqaArr = new InterfaceC759380Tqa[12];
                interfaceC759380TqaArr[0] = new C500780JkS();
                interfaceC759380TqaArr[1] = new C771730UPb();
                interfaceC759380TqaArr[2] = new C501000Jko();
                interfaceC759380TqaArr[3] = new C500850JkZ();
                interfaceC759380TqaArr[4] = new C0US9();
                interfaceC759380TqaArr[5] = new C771940UPw();
                interfaceC759380TqaArr[6] = new C772680USs();
                interfaceC759380TqaArr[7] = new C758890Tpn();
                interfaceC759380TqaArr[8] = OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable() ? null : new C772640USo();
                interfaceC759380TqaArr[9] = GoLiveVoiceCallConflictCheckSetting.INSTANCE.enable() ? new C0USC() : null;
                interfaceC759380TqaArr[10] = new C759550Tqr();
                interfaceC759380TqaArr[11] = new C500830JkX();
                this.LIZJ = interfaceC759380TqaArr;
            }

            @Override // X.C0UQ8
            public final InterfaceC759380Tqa[] LIZ() {
                return this.LIZJ;
            }

            @Override // X.C0UQ8
            public final void LJFF(Fragment fragment) {
                DataChannel dataChannelLJ;
                Context context;
                String str;
                if (fragment == null || (dataChannelLJ = C475510Ikn.LJ(fragment)) == null || (context = fragment.getContext()) == null) {
                    return;
                }
                PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
                LiveMode liveMode = this.LIZ;
                previewContinueLiveHelper.getClass();
                Intent intentCreateStartBroadcastIntent = C781270Ukn.LJIIJ().createStartBroadcastIntent(C500260Jjc.LJ(context), PreviewContinueLiveHelper.LIZ(liveMode));
                RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class);
                if (roomCreateInfo != null) {
                    str = roomCreateInfo.mAdditionalPrompt;
                } else {
                    str = null;
                }
                intentCreateStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
                intentCreateStartBroadcastIntent.putExtra("request_page", (String) dataChannelLJ.gg0(C0ULI.class));
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentCreateStartBroadcastIntent, "Context_startActivity_1");
                C1701330uNH.LIZ(intentCreateStartBroadcastIntent, context);
                C2204961BRm.LJJJJJL(context, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyWq4lqd1QtMgqsXrtSuStWhHQO/5LFNI7lfD8Lq+Yolclrz5vfE+jc", null));
            }

            @Override // X.C0UQ8
            public final boolean LIZJ(ApplyLivePermission applyLivePermission, DetailLivePermission detailLivePermission) {
                Boolean boolValueOf;
                Boolean boolValueOf2 = null;
                if (detailLivePermission != null) {
                    boolValueOf = Boolean.valueOf(detailLivePermission.videoPermission);
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                    if (applyLivePermission != null) {
                        boolValueOf2 = Boolean.valueOf(applyLivePermission.videoApplyPermission);
                    }
                    if (C500260Jjc.LJJJI(boolValueOf2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.C0UQ8
            public final void LJ(DataChannel dataChannel, int i) {
                C772780UTc.LJFF(i, this.LIZ);
                C781270Ukn.LJ().startLiveManager().LJIIIZ(dataChannel, i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0UQ8
            public final void LJI(Fragment fragment, Boolean bool) {
                DataChannel dataChannelLJ;
                Bundle bundle;
                Fragment fragment2;
                if (fragment != null && (dataChannelLJ = C475510Ikn.LJ(fragment)) != null) {
                    PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
                    LiveMode liveMode = this.LIZ;
                    previewContinueLiveHelper.getClass();
                    InterfaceC214902198i interfaceC214902198iCreateStartBroadcastFragment = C781270Ukn.LJIIJ().createStartBroadcastFragment(PreviewContinueLiveHelper.LIZ(liveMode));
                    if (interfaceC214902198iCreateStartBroadcastFragment == 0) {
                        return;
                    }
                    String str = null;
                    if (!(interfaceC214902198iCreateStartBroadcastFragment instanceof Fragment) || (fragment2 = (Fragment) interfaceC214902198iCreateStartBroadcastFragment) == null || (bundle = fragment2.getArguments()) == null) {
                        bundle = new Bundle();
                    }
                    RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class);
                    if (roomCreateInfo != null) {
                        str = roomCreateInfo.mAdditionalPrompt;
                    }
                    C786410Ut5.LJJJI("live.intent.extra.LIVE_PC_TIPS", str, bundle);
                    C786410Ut5.LJJJI("request_page", (String) dataChannelLJ.gg0(C0ULI.class), bundle);
                    InterfaceC20622815ms interfaceC20622815msLIZ = C520010KaN.LIZ(fragment.getActivity());
                    if (interfaceC20622815msLIZ != null) {
                        C520010KaN.LJIIL(interfaceC20622815msLIZ, interfaceC214902198iCreateStartBroadcastFragment, -1, bundle, 0, null, 24);
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:155:0x035a  */
            /* JADX WARN: Removed duplicated region for block: B:188:0x043c  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0228 A[PHI: r8
              0x0228: PHI (r8v7 java.lang.Integer) = (r8v2 java.lang.Integer), (r8v8 java.lang.Integer) binds: [B:178:0x03df, B:89:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:93:0x0236  */
            @Override // X.C0UQ8
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C772410URr LJII(android.content.Context r14, com.bytedance.ies.sdk.datachannel.DataChannel r15, com.bytedance.android.livesdkapi.depend.handler.WeakHandler r16) {
                /*
                    Method dump skipped, instruction units count: 1242
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C772480URy.LJII(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdkapi.depend.handler.WeakHandler):X.0URr");
            }
        };
    }

    public static final Object invoke$87(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C0UQ8() { // from class: X.0URz
            public final LiveMode LIZ = LiveMode.THIRD_PARTY;
            public final InterfaceC759380Tqa[] LIZIZ;

            @Override // X.C0UQ8
            public final boolean LJIIIIZZ(Fragment fragment) {
                return false;
            }

            @Override // X.C0UQ8
            public final void LIZIZ() {
                C773220UUu c773220UUu = C773220UUu.LIZ;
                LiveMode liveMode = this.LIZ;
                c773220UUu.getClass();
                C773220UUu.LJIIJJI(liveMode);
                C773220UUu.LJ = this.LIZ;
                C773220UUu.LJIIL(AFwS245S0000000_12.get$arr$(203));
            }

            {
                InterfaceC759380Tqa[] interfaceC759380TqaArr = new InterfaceC759380Tqa[13];
                interfaceC759380TqaArr[0] = new C500780JkS();
                interfaceC759380TqaArr[1] = new C758890Tpn();
                interfaceC759380TqaArr[2] = new C758880Tpm();
                interfaceC759380TqaArr[3] = new C758900Tpo();
                interfaceC759380TqaArr[4] = new C758910Tpp();
                interfaceC759380TqaArr[5] = new C771730UPb();
                interfaceC759380TqaArr[6] = new C501000Jko();
                interfaceC759380TqaArr[7] = new C500850JkZ();
                interfaceC759380TqaArr[8] = new C0US9();
                interfaceC759380TqaArr[9] = new C771940UPw();
                interfaceC759380TqaArr[10] = new C772680USs();
                interfaceC759380TqaArr[11] = new C500830JkX();
                interfaceC759380TqaArr[12] = GoLiveVoiceCallConflictCheckSetting.INSTANCE.enable() ? new C0USC() : null;
                this.LIZIZ = interfaceC759380TqaArr;
            }

            @Override // X.C0UQ8
            public final InterfaceC759380Tqa[] LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C0UQ8
            public final void LJFF(Fragment fragment) {
                DataChannel dataChannelLJ;
                Context context;
                String str;
                if (fragment == null || (dataChannelLJ = C475510Ikn.LJ(fragment)) == null || (context = fragment.getContext()) == null) {
                    return;
                }
                PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
                LiveMode liveMode = this.LIZ;
                previewContinueLiveHelper.getClass();
                Intent intentCreateStartBroadcastIntent = C781270Ukn.LJIIJ().createStartBroadcastIntent(C500260Jjc.LJ(context), PreviewContinueLiveHelper.LIZ(liveMode));
                InterfaceC772390URp.LLLZI.LJFF(Boolean.FALSE);
                RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class);
                if (roomCreateInfo != null) {
                    str = roomCreateInfo.mAdditionalPrompt;
                } else {
                    str = null;
                }
                intentCreateStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
                intentCreateStartBroadcastIntent.putExtra("request_page", (String) dataChannelLJ.gg0(C0ULI.class));
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentCreateStartBroadcastIntent, "Context_startActivity_1");
                C1701330uNH.LIZ(intentCreateStartBroadcastIntent, context);
                C2204961BRm.LJJJJJL(context, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyWq4lqd1QtMgqsXrtSuStWhHQX8oj1JbzUKu9JeQgrNczjo/F2AQ==", null));
            }

            @Override // X.C0UQ8
            public final boolean LIZJ(ApplyLivePermission applyLivePermission, DetailLivePermission detailLivePermission) {
                Boolean boolValueOf;
                Boolean boolValueOf2 = null;
                if (detailLivePermission != null) {
                    boolValueOf = Boolean.valueOf(detailLivePermission.obsPermission);
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                    if (applyLivePermission != null) {
                        boolValueOf2 = Boolean.valueOf(applyLivePermission.obsApplyPermission);
                    }
                    if (C500260Jjc.LJJJI(boolValueOf2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.C0UQ8
            public final void LIZLLL(String str, String str2) {
                C773220UUu c773220UUu = C773220UUu.LIZ;
                AwS14S2000000_12 awS14S2000000_12 = new AwS14S2000000_12(str, str2, 3);
                c773220UUu.getClass();
                C773220UUu.LJIIL(awS14S2000000_12);
                C773220UUu.LJIIJJI(this.LIZ);
            }

            @Override // X.C0UQ8
            public final void LJ(DataChannel dataChannel, int i) {
                C772780UTc.LJFF(i, this.LIZ);
                C781270Ukn.LJ().startLiveManager().LJIIIZ(dataChannel, i);
                C773220UUu c773220UUu = C773220UUu.LIZ;
                AwS27S0001000_12 awS27S0001000_12 = new AwS27S0001000_12(i, 3);
                c773220UUu.getClass();
                C773220UUu.LJIIL(awS27S0001000_12);
                C773220UUu.LJIIJJI(this.LIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0UQ8
            public final void LJI(Fragment fragment, Boolean bool) {
                DataChannel dataChannelLJ;
                Bundle bundle;
                Fragment fragment2;
                if (fragment != null && (dataChannelLJ = C475510Ikn.LJ(fragment)) != null) {
                    PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
                    LiveMode liveMode = this.LIZ;
                    previewContinueLiveHelper.getClass();
                    InterfaceC214902198i interfaceC214902198iCreateStartBroadcastFragment = C781270Ukn.LJIIJ().createStartBroadcastFragment(PreviewContinueLiveHelper.LIZ(liveMode));
                    if (interfaceC214902198iCreateStartBroadcastFragment == 0) {
                        return;
                    }
                    InterfaceC772390URp.LLLZI.LJFF(Boolean.FALSE);
                    String str = null;
                    if (!(interfaceC214902198iCreateStartBroadcastFragment instanceof Fragment) || (fragment2 = (Fragment) interfaceC214902198iCreateStartBroadcastFragment) == null || (bundle = fragment2.getArguments()) == null) {
                        bundle = new Bundle();
                    }
                    RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class);
                    if (roomCreateInfo != null) {
                        str = roomCreateInfo.mAdditionalPrompt;
                    }
                    C786410Ut5.LJJJI("live.intent.extra.LIVE_PC_TIPS", str, bundle);
                    C786410Ut5.LJJJI("request_page", (String) dataChannelLJ.gg0(C0ULI.class), bundle);
                    InterfaceC20622815ms interfaceC20622815msLIZ = C520010KaN.LIZ(fragment.getActivity());
                    if (interfaceC20622815msLIZ != null) {
                        C520010KaN.LJIIL(interfaceC20622815msLIZ, interfaceC214902198iCreateStartBroadcastFragment, -1, bundle, 0, null, 24);
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:128:0x0272  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x027e  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x0280  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0284  */
            @Override // X.C0UQ8
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C772410URr LJII(android.content.Context r11, com.bytedance.ies.sdk.datachannel.DataChannel r12, com.bytedance.android.livesdkapi.depend.handler.WeakHandler r13) {
                /*
                    Method dump skipped, instruction units count: 710
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C772490URz.LJII(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdkapi.depend.handler.WeakHandler):X.0URr");
            }
        };
    }

    public static final Object invoke$88(AFwS199S0000000_12 aFwS199S0000000_12) {
        ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(false);
        return Unit.LIZ;
    }

    public static final Object invoke$89(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(4));
    }

    public static final Object invoke$9(AFwS199S0000000_12 aFwS199S0000000_12) {
        com.bytedance.ies.abmock.SettingsManager settingsManagerLIZLLL = com.bytedance.ies.abmock.SettingsManager.LIZLLL();
        TakoFullScreenDisclaimerTextModel takoFullScreenDisclaimerTextModel = C747450TTr.LIZ;
        Object objLJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("tako_full_screen_disclaimer_text", TakoFullScreenDisclaimerTextModel.class, takoFullScreenDisclaimerTextModel);
        if (objLJIIIIZZ != null) {
            return objLJIIIIZZ;
        }
        return takoFullScreenDisclaimerTextModel;
    }

    public static final Object invoke$90(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(8));
    }

    public static final Object invoke$91(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C768460UCm.LJI();
    }

    public static final Object invoke$92(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ValueAnimator();
    }

    public static final Object invoke$93(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.FALSE;
    }

    public static final Object invoke$94(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C779730UiJ();
    }

    public static final Object invoke$95(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C1143920fsE();
    }

    public static final Object invoke$96(AFwS199S0000000_12 aFwS199S0000000_12) {
        return C768460UCm.LJI();
    }

    public static final Object invoke$97(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new ValueAnimator();
    }

    public static final Object invoke$98(AFwS199S0000000_12 aFwS199S0000000_12) {
        return new C779730UiJ();
    }

    public static final Object invoke$99(AFwS199S0000000_12 aFwS199S0000000_12) {
        return Boolean.valueOf(C776230Ucf.LLILZ);
    }
}
