package com.ss.android.ugc.aweme.framework.services;

import android.text.TextUtils;
import com.benchmark.BHApplogDowngrade;
import com.benchmark.BHNetTagDowngrade;
import com.benchmark.BHSlardarDowngrade;
import com.benchmark.BTCHConfigDowngrade;
import com.benchmark.collection_api.ByteBenchCollectionDowngrade;
import com.bytedance.android.commercialize.track.depend.AdEventTrackingProcessorDependDefaultImpl;
import com.bytedance.android.commercialize.track.depend.EventTrackingProcessorDependDefaultImpl;
import com.bytedance.android.livesdk.ecommerce.datachannel.DummyLiveStreamAdaptConfigService;
import com.bytedance.android.livesdk.ecommerce.datachannel.DummyLiveStreamAdaptService;
import com.bytedance.android.starship.StarshipStrategyEmptyService;
import com.bytedance.android.starship.base.StarshipBaseEmptyServiceBridge;
import com.bytedance.android.starship.engine.reasoning.StarshipInitEmptyService;
import com.bytedance.android.starship.solaria.StarshipSolariaEmptyService;
import com.bytedance.android.starship.solaria.profile.StarshipSolariaProfileEmptyService;
import com.bytedance.android.starship.spi.StarshipAbilityEmptyImpl;
import com.bytedance.android.starship.strategy.IDebugStarshipDataEmptyService;
import com.bytedance.android.starship.strategy.StarshipContainerEmptyService;
import com.bytedance.bmf_mods_api.AdaptiveGradingAPIDefault;
import com.bytedance.bmf_mods_api.ByteStreamHDCallbackAPIDefault;
import com.bytedance.bmf_mods_api.ByteStreamHDDefault;
import com.bytedance.bmf_mods_api.ColorHistAPIDefault;
import com.bytedance.bmf_mods_api.ColorShiftAPIDefault;
import com.bytedance.bmf_mods_api.DenoiseAPIDefault;
import com.bytedance.bmf_mods_api.HydraHDRAPIDefault;
import com.bytedance.bmf_mods_api.MotionSenseAPIDefault;
import com.bytedance.bmf_mods_api.NoiseDetectAPIDefault;
import com.bytedance.bmf_mods_api.NoiseDetectCallbackAPIDefault;
import com.bytedance.bmf_mods_api.NoiseLiveAPIDefault;
import com.bytedance.bmf_mods_api.NoiseLiveCallbackAPIDefault;
import com.bytedance.bmf_mods_api.SitiAPIDefault;
import com.bytedance.bmf_mods_api.TdiLiteStrategyAPIDefault;
import com.bytedance.bmf_mods_api.VideoBrightAPIDefault;
import com.bytedance.bmf_mods_api.VideoBrightCallBackAPIDefault;
import com.bytedance.bmf_mods_api.VideoOCLSRAPIDefault;
import com.bytedance.bmf_mods_api.VideoSRLutAPIDefault;
import com.bytedance.bmf_mods_api.VideoSRLutDspAPIDefault;
import com.bytedance.bmf_mods_api.VideoSRRaisrAPIDefault;
import com.bytedance.bmf_mods_api.VideoSuperResolutionAPIDefault;
import com.bytedance.bmf_mods_api.VqscoreLiveAPIDefault;
import com.bytedance.bmf_mods_api.VqscoreLiveCallbackAPIDefault;
import com.bytedance.bmf_mods_api.VqscoreProcessCallbackAPIDefault;
import com.bytedance.bpea.net3rd.impl.Default3rdRetrofitFactory;
import com.bytedance.hybrid.common.autoservice.DefaultSDUIAPI;
import com.bytedance.hybrid.common.autoservice.SparkAioDevtoolEmptyImpl;
import com.bytedance.hybrid.spark.roma.deploy.DowngradeGeckoService;
import com.bytedance.i18n.location.api.DefaultMockClient;
import com.bytedance.i18n.location.api.internal.DefaultCellClient;
import com.bytedance.i18n.location.api.internal.DefaultInstrumentationProvider;
import com.bytedance.i18n.location.api.internal.DefaultLocationClient;
import com.bytedance.i18n.location.api.internal.DefaultSensorClient;
import com.bytedance.i18n.location.api.internal.DefaultWifiClient;
import com.bytedance.ies.android.base.runtime.DependOutServiceDowngrade;
import com.bytedance.ies.foundation.base.DefaultBaseConfigConverterImpl;
import com.bytedance.ies.ugc.aweme.network.chunk.DefaultNetworkChunkPerformanceServiceImpl;
import com.bytedance.ies.ugc.aweme.network.chunk.DefaultNetworkChunkRaxServiceImpl;
import com.bytedance.ies.ugc.aweme.rich.impression.api.edge2edge.DowngradeEdge2EdgeApi;
import com.bytedance.ies.web.jsbridge2.JsBridge2ConfigDefault;
import com.bytedance.ies.xbridge.autoservice.DefaultReadableJSONServiceImpl;
import com.bytedance.ies.xbridge.autoservice.XBridgeDowngraderService;
import com.bytedance.lynx.hybrid.bridge.DefaultHybridBridgeImpl;
import com.bytedance.lynx.hybrid.ssr.DefaultSSRDebugger;
import com.bytedance.lynx.spark.schema.parser.api.DefaultCardSchemaParseAPI;
import com.bytedance.lynx.spark.schema.parser.api.DefaultPageSchemaParseAPI;
import com.bytedance.lynx.spark.schema.parser.api.DefaultPopupSchemaParseAPI;
import com.bytedance.pia.core.spi.ConfigTask;
import com.bytedance.pumbaa.api.PumbaaServiceEmptyImpl;
import com.bytedance.pumbaa.audit.api.OpenAuditServiceEmptyStub;
import com.bytedance.pumbaa.common.impl.applog.AppLogImpl;
import com.bytedance.pumbaa.common.impl.event.monitor.EventMonitorImpl;
import com.bytedance.pumbaa.common.impl.exception.monitor.ExceptionMonitorImpl;
import com.bytedance.pumbaa.common.impl.logger.AlogLoggerImpl;
import com.bytedance.pumbaa.common.impl.store.KevaStoreImpl;
import com.bytedance.pumbaa.governance.tool.api.ControlToolServiceDefault;
import com.bytedance.pumbaa.hybrid.engine.api.HybridEngineDowngradeImpl;
import com.bytedance.pumbaa.network.adapter.api.NetworkServiceEmptyImpl;
import com.bytedance.pumbaa.pdp.api.PolicyDecisionEmptyImp;
import com.bytedance.pumbaa.piz.api.PizServiceEmptyImpl;
import com.bytedance.pumbaa.piz.api.TokenManagerEmptyImpl;
import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineServiceEmptyImpl;
import com.bytedance.pumbaa.utility.settings.DefaultSystemApiPerfOptImpl;
import com.bytedance.pumbaa.utility.settings.PerformanceExprSwitchImpl;
import com.bytedance.sdkimpl.xbridge.DefaultUtilsService;
import com.bytedance.touchpoint.api.downgrade.DowngradeIncentiveServiceImpl;
import com.bytedance.touchpoint.api.downgrade.DowngradeInteractiveServiceImpl;
import com.bytedance.touchpoint.api.downgrade.DowngradeMultiDomainService;
import com.bytedance.touchpoint.api.downgrade.DowngradeSafeGuardReporterImpl;
import com.bytedance.touchpoint.api.downgrade.DowngradeTouchPointOptServiceImpl;
import com.bytedance.touchpoint.api.downgrade.DowngradeTouchPointServiceImpl;
import com.bytedance.touchpoint.api.downgrade.DowngradeViewModelServiceImpl;
import com.bytedance.touchpoint.api.downgrade.DowngradeWatchVideoServiceImpl;
import com.fackbook.drawee.DraweeConfigOutServiceDowngrade;
import com.ss.android.ugc.DummyExternalShareSmartSort;
import com.ss.android.ugc.DummyResourceChecker;
import com.ss.android.ugc.aweme.DefaultPreVideoPlayTimeUtilImpl;
import com.ss.android.ugc.aweme.DefaultPrepareVideoCaptionUtilImpl;
import com.ss.android.ugc.aweme.DefaultTranslatedVideoUtilImpl;
import com.ss.android.ugc.aweme.DummyRewardAdapterDependentImpl;
import com.ss.android.ugc.aweme.LandscapeFeedDowngradeService;
import com.ss.android.ugc.aweme.SubOnlyVideoOperatorServiceDummy;
import com.ss.android.ugc.aweme.account.appdiff.IDramaNonLoginService;
import com.ss.android.ugc.aweme.account.appdiff.IDramaNujService;
import com.ss.android.ugc.aweme.account.appdiff.IDramaPushFrequencyService;
import com.ss.android.ugc.aweme.account.oneclicklogin.OneClickLoginEmptyService;
import com.ss.android.ugc.aweme.account.settings.DefaultAccountSdkSettingsManagerApiImpl;
import com.ss.android.ugc.aweme.aigc.graph.spi.DfCameraBizAigcContributorDefaultImpl;
import com.ss.android.ugc.aweme.api.IDramaLandingTabApi;
import com.ss.android.ugc.aweme.appdiff.DefaultDramaSharedApiPathService;
import com.ss.android.ugc.aweme.appdiff.IAccountAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.IAwemeNoticeAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.ICaptionAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.ICommentAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.ICommonMiniDramaAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.IFavoriteAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.IFriendsAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.IHomepageAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.IInnerPushAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.ILaunchAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.IProfileAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.IPushPopupYieldService;
import com.ss.android.ugc.aweme.appdiff.IPushSettingsAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.ISeriesCenterConfigAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.ISeriesInnerFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.ISettingsCommonAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.ISettingsInternalAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.IStoryAppDiffProtocol;
import com.ss.android.ugc.aweme.appdiff.SeriesProfileTabViewModelAppDiffService;
import com.ss.android.ugc.aweme.application.DowngradeAppTaskProvider;
import com.ss.android.ugc.aweme.base.DefaultIAnchorApiForEcommerce;
import com.ss.android.ugc.aweme.casting.api.dummyspi.DummyCastingService;
import com.ss.android.ugc.aweme.comment.param.ICommentPageParamsAppDiffProtocol;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.photomode.innerflow.comment.PhotoModeInnerFlowServiceDowngradeImpl;
import com.ss.android.ugc.aweme.commercialize.router.impl.p005default.CRouterAdapterDelegateDefaultImpl;
import com.ss.android.ugc.aweme.commercialize.router.impl.p005default.CRouterMainDelegateDefaultImpl;
import com.ss.android.ugc.aweme.compliance.api.services.edm.PnsEdmConsentServiceDefault;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ScreenTimeCalcAndTimer;
import com.ss.android.ugc.aweme.compliance.sandbox.api.services.SandboxServiceEmptyImpl;
import com.ss.android.ugc.aweme.deeplink.AdsDeeplinkCommandDowngradeService;
import com.ss.android.ugc.aweme.deeplink.DeepLinkDowngradeService;
import com.ss.android.ugc.aweme.detail.platform.IDetailFeedAppDiffService;
import com.ss.android.ugc.aweme.discover.DiscoveryAsyncInflateDownImpl;
import com.ss.android.ugc.aweme.drama.IDramaInterceptService;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceEmptyImpl;
import com.ss.android.ugc.aweme.dummyopenspi.DummyOpenIABService;
import com.ss.android.ugc.aweme.dummyopenspi.DummyOpenPlatformService;
import com.ss.android.ugc.aweme.dummyopenspi.DummyServicePluginPlatformManager;
import com.ss.android.ugc.aweme.dummyopenspi.DummyShareRespSendService;
import com.ss.android.ugc.aweme.dummyspi.DummyEcSearchFeedCardService;
import com.ss.android.ugc.aweme.dummyspi.DummyEcomGeneralSearchService;
import com.ss.android.ugc.aweme.dummyspi.DummyEcomSearchService;
import com.ss.android.ugc.aweme.dummyspi.DummyMiddleForSearchFromEC;
import com.ss.android.ugc.aweme.dummyspi.DummyPhotoSearchService;
import com.ss.android.ugc.aweme.ecommerce.asyncinflater.EcomAsyncInflateMonitorDummy;
import com.ss.android.ugc.aweme.ecommerce.debug.DefaultDebugPanelService;
import com.ss.android.ugc.aweme.ecommerce.debug.DefaultEComDebugServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyAddressService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyCartCacheServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyCartService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyCommerceHybridBottomSheetDialogFragmentBehavior;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyECFYPPlayerService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyECPhotoService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyECommerceAddressCacheService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyECommerceArchService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyECommerceRecorderService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyECommerceService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyEcSvCommentTopBarService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyPdpPreviewService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyPdpResourceService;
import com.ss.android.ugc.aweme.ecommerce.dummyspi.DummyStrategyService;
import com.ss.android.ugc.aweme.ecommerce.image.DummyECImageService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.dummyspi.DummyECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.dummyspi.DummyEcMallUgService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.dummyspi.DummyMallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.dummyspi.DummyShopIconService;
import com.ss.android.ugc.aweme.ecommerce.network.DummyEcommerceMonitorService;
import com.ss.android.ugc.aweme.ecommerce.pad.DummyEcMallPadService;
import com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.DummyAIDubbingService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.hybrid.DefaultECHybridSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.network.DefaultECNetworkSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.schema.DefaultECSchemaSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.showcase.DefaultECShowcaseSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.transaction.DefaultECTransactionSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.video.DefaultECVideoAnchorSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.DefaultBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.DefaultDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.DefaultGuestModeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.DefaultActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.DefaultAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.DefaultAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.DefaultApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.DefaultApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.DefaultAppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.DefaultAwemeMainDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.buildconfigdiff.DefaultAwemeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.DefaultCommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.DefaultCommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.DefaultCommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.DefaultComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.DefaultReportDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.DefaultTpcConsentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.DefaultCreativePageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.deeplink.DefaultDeeplinkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.DefaultDetailFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.DefaultPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.DefaultSeaPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.DefaultECLiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.DefaultECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.DefaultEcMallUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.DefaultVideoDetailLoadDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.DefaultEcomSearchDependency;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultECDiversionDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultECUgPayToMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultECUgPdpPageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultEcUgBackButtonDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultEcUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultEcUgPopupDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultMallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.DefaultLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.DefaultFriendDependencyServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.homepage.DefaultHomepageTabDependencyServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.DefaultHybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.DefaultLauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.DefaultLegacyDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.DefaultLiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.DefaultLiveTTDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.DefaultLocalTestDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.DefaultPipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.DefaultLocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.DefaultPoiMapDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.DefaultECNetControllerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.DefaultNetworkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.DefaultNetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.DefaultNoticeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.offline.DefaultOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.DefaultBootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.DefaultPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.pitaya.DefaultPitayaDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.DefaultPlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.DefaultSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.sec.DefaultSecDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.DefaultShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.storage.DefaultTabDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.transaction.DefaultPdpDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.init.DefaultHostInitService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.service.monitor.DummyECSaaSCoreMonitorService;
import com.ss.android.ugc.aweme.ecommerce.service.DefaultEcomSearchSparkChannelInterceptorService;
import com.ss.android.ugc.aweme.ecommerce.service.DefaultEcommerceInternalJSBridgeService;
import com.ss.android.ugc.aweme.ecommerce.service.DummyECommerceFYPService;
import com.ss.android.ugc.aweme.ecommerce.service.DummyEcFypProductSelectCardService;
import com.ss.android.ugc.aweme.ecommerce.service.DummyEcommerceAnchorOuterService;
import com.ss.android.ugc.aweme.ecommerce.service.DummyPdpPrefetchService;
import com.ss.android.ugc.aweme.ecommerce.service.downgrade.ApiInterceptDowngrade;
import com.ss.android.ugc.aweme.ecommerce.service.downgrade.ApiLoggerDowngrade;
import com.ss.android.ugc.aweme.ecommerce.service.downgrade.DefaultEcomMonitorService;
import com.ss.android.ugc.aweme.ecommerce.service.dummyspi.DummyEComRouterHandlerInternalService;
import com.ss.android.ugc.aweme.ecommerce.service.dummyspi.DummyEcomHybridSparkMatchService;
import com.ss.android.ugc.aweme.ecommerce.service.dummyspi.DummyHybridDataService;
import com.ss.android.ugc.aweme.ecommerce.ug.dummyspi.DummyEcUgPitayaFetcherRegistration;
import com.ss.android.ugc.aweme.ecommerce.ug.dummyspi.DummyEcUgPitayaService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.dummyspi.DummyEcommerceLiveService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.dummyspi.DummySeaLiveService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.dummyspi.DummyUsEcommerceLiveService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.livewindow.DefaultWindowLivePlayerCompat;
import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysExp;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteRevisitAppDiffProtocol;
import com.ss.android.ugc.aweme.feed.DefaultFeedStrategyService;
import com.ss.android.ugc.aweme.feed.api.IFeedRecommendAppDiffProtocol;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.assem.report.ReportViewAssem;
import com.ss.android.ugc.aweme.feed.spi.IActionManagerAppDiffProtocol;
import com.ss.android.ugc.aweme.home.offline.DefaultWalletHomeOfflineTool;
import com.ss.android.ugc.aweme.homepage.HomePageServiceImpl;
import com.ss.android.ugc.aweme.homepage.api.ui.DefaultX2CFragmentMainPageIconService;
import com.ss.android.ugc.aweme.homepage.ui.experiment.InboxGuideWatchFollowingLiveServiceImpl;
import com.ss.android.ugc.aweme.i18n.xbridge.IPineDramaXBridgeService;
import com.ss.android.ugc.aweme.im.appdiff.IMCommonSaasAppDiffProtocol;
import com.ss.android.ugc.aweme.im.sticker.basic.stickerstore.BasicStickerStoreHelper;
import com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineServiceDefault;
import com.ss.android.ugc.aweme.influencer.ecommercelive.dummyspi.DummyECommerceLiveBridgeService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.dummyspi.DummyEcommerceInfluencerService;
import com.ss.android.ugc.aweme.lemon.IL8ServiceInitDiffProtocol;
import com.ss.android.ugc.aweme.live.assem.FollowWidgetServiceDummy;
import com.ss.android.ugc.aweme.live.spi.dummy.DummyLiveTabService;
import com.ss.android.ugc.aweme.live.spi.dummy.LiveDummyOuterService;
import com.ss.android.ugc.aweme.live.spi.dummy.LiveVersionCodeProviderDummy;
import com.ss.android.ugc.aweme.local_test.services.DefaultJacocoUtils;
import com.ss.android.ugc.aweme.local_test.services.DefaultRelationDebugService;
import com.ss.android.ugc.aweme.local_test.services.IDebugStarshipEmptyService;
import com.ss.android.ugc.aweme.localservice.service.optimistic.OptimisticPluginEmptyService;
import com.ss.android.ugc.aweme.localservice.service.optimistic.PoiCollectEmptyService;
import com.ss.android.ugc.aweme.localservice.service.optimistic.VideoLikeEmptyService;
import com.ss.android.ugc.aweme.logger.ColdBootLoggerAppDiffProtocol;
import com.ss.android.ugc.aweme.main.homepageImpl.LiveBubblePopServiceImpl;
import com.ss.android.ugc.aweme.mapapi.service.PoiMapServiceEmptylmpl;
import com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.appdiff.InnerFeedPlaylistAppDiffProtocol;
import com.ss.android.ugc.aweme.minis.noop.MiniGameRenderServiceNoop;
import com.ss.android.ugc.aweme.minis.noop.MinisServiceNoop;
import com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenterDefault;
import com.ss.android.ugc.aweme.ml.api.CreationFeatureBridgeDefault;
import com.ss.android.ugc.aweme.ml.api.MLCommonServiceDefault;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterServiceDefault;
import com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartCDNRankServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartDataCollectorServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartIdleDetectionServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartOHRServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2ServiceDefault;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2ServiceDefault;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifyServiceDefault;
import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadServiceDefault;
import com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceDefault;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictServiceDefault;
import com.ss.android.ugc.aweme.modeo.ModeoImitDefaultImpl;
import com.ss.android.ugc.aweme.multiapp.ISystemPushInboxBannerAppDiffService;
import com.ss.android.ugc.aweme.music.fanspotlight.service.MusicFanSpotlightEmptyImpl;
import com.ss.android.ugc.aweme.music.service.MusicAddToDspCoreServiceEmptyImpl;
import com.ss.android.ugc.aweme.net.DefaultMediaIOCoreBridgeServiceImpl;
import com.ss.android.ugc.aweme.net.interceptor.DowngradeSpiResponseExtraParser;
import com.ss.android.ugc.aweme.notice.api.services.IProfileRedDotService;
import com.ss.android.ugc.aweme.nowdummyspi.DummyNowCaptionService;
import com.ss.android.ugc.aweme.nowdummyspi.DummyNowFeedPreLoadService;
import com.ss.android.ugc.aweme.nowdummyspi.DummyNowsTabService;
import com.ss.android.ugc.aweme.nowdummyspi.DummyProfileNowsService;
import com.ss.android.ugc.aweme.offline.abmock.DefaultAbMockServiceImpl;
import com.ss.android.ugc.aweme.offline.account.debug.tools.DefaultAccountDebugToolsServiceImpl;
import com.ss.android.ugc.aweme.offline.ad.alog.DefaultAdALogServiceImpl;
import com.ss.android.ugc.aweme.offline.ad.explore.DefaultAdExploreServiceImpl;
import com.ss.android.ugc.aweme.offline.ad.landpage.debug.tool.DefaultAdLandpageDebugToolServiceImpl;
import com.ss.android.ugc.aweme.offline.anole.DefaultAnoleServiceImpl;
import com.ss.android.ugc.aweme.offline.anydoor.entry.DefaultAnydoorEntryServiceImpl;
import com.ss.android.ugc.aweme.offline.art.warp.DefaultArtWarpServiceImpl;
import com.ss.android.ugc.aweme.offline.auto.marker.DefaultAutoMarkAbilityServiceImpl;
import com.ss.android.ugc.aweme.offline.auto.marker.DefaultAutoMarkerServiceImpl;
import com.ss.android.ugc.aweme.offline.bleconnectnow.DefaultBleConnectNowServiceImpl;
import com.ss.android.ugc.aweme.offline.boe.controller.DefaultBoeControllerServiceImpl;
import com.ss.android.ugc.aweme.offline.campus.debug.DefaultCampusDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.capture.sdcard.DefaultCaptureSdcardServiceImpl;
import com.ss.android.ugc.aweme.offline.clean.cache.tool.DefaultCleanCacheToolServiceImpl;
import com.ss.android.ugc.aweme.offline.client.ai.benchmark.DefaultClientAiBenchmarkServiceImpl;
import com.ss.android.ugc.aweme.offline.compliance.debug.DefaultComplianceDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.compose.debugtool.DefaultComposeDebugtoolServiceImpl;
import com.ss.android.ugc.aweme.offline.debug.perf.DefaultDebugPerformanceServiceImpl;
import com.ss.android.ugc.aweme.offline.debug.perf.DoolittleServiceDefault;
import com.ss.android.ugc.aweme.offline.debug.router.DefaultDebugRouterServiceImpl;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.DefaultDmToolsDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.DefaultWebSocketConnectionStateDebugHelper;
import com.ss.android.ugc.aweme.offline.dnsopt.DefaultDnsOptDebugConfigServiceImpl;
import com.ss.android.ugc.aweme.offline.dogfood.autoupdate.DefaultDogfoodAutoUpdateServiceImpl;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.RaxLogServiceDefault;
import com.ss.android.ugc.aweme.offline.ec.rax.impl.RaxServiceDefault;
import com.ss.android.ugc.aweme.offline.ec.ug.debug.DefaultEcMallDebugVerifyServiceImpl;
import com.ss.android.ugc.aweme.offline.ec.ug.debug.DefaultEcUgDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.DefaultEComOfflineServiceImpl;
import com.ss.android.ugc.aweme.offline.feed.DefaultFeedCardInsertDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.feed.debug.DefaultFeedInfraOfflineServiceImpl;
import com.ss.android.ugc.aweme.offline.feed.debug.DefaultProfileBannerDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.feed.recommend.DefaultFeedRecommendInfoServiceImpl;
import com.ss.android.ugc.aweme.offline.gecko.DefaultGeckoServiceImpl;
import com.ss.android.ugc.aweme.offline.gp.newuser.DefaultNewUserDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.hybriddevtool.DefaultHybridDevtoolServiceImpl;
import com.ss.android.ugc.aweme.offline.iaptooling.DefaultIAPToolingServiceImpl;
import com.ss.android.ugc.aweme.offline.illustration.DefaultIllustrationServiceImpl;
import com.ss.android.ugc.aweme.offline.im.chatroom.playground.DefaultImChatroomPlaygroundServiceImpl;
import com.ss.android.ugc.aweme.offline.imagelightenservertime.DefaultImageLightenServerTimeServiceImpl;
import com.ss.android.ugc.aweme.offline.inner.push.offline.DefaultInnerPushOfflineServiceImpl;
import com.ss.android.ugc.aweme.offline.koopa.auto.DefaultKoopaAutoServiceImpl;
import com.ss.android.ugc.aweme.offline.language.DefaultLanguageDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.lemon.debug.tool.DefaultLemonDebugToolServiceImpl;
import com.ss.android.ugc.aweme.offline.mocknativecard.DefaultMockNativeCardServiceImpl;
import com.ss.android.ugc.aweme.offline.mocktime.DefaultMockTimeServiceImpl;
import com.ss.android.ugc.aweme.offline.music.debug.DefaultMusicDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.networklog.DefaultNetworkLogEasyServiceImpl;
import com.ss.android.ugc.aweme.offline.newuser.DefaultNewuserServiceImpl;
import com.ss.android.ugc.aweme.offline.nimble.debug.DefaultNimbleDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.nletemplate.DefaultNLETemplateOfflineServiceImpl;
import com.ss.android.ugc.aweme.offline.nxroute.DefaultNxRouteServiceImpl;
import com.ss.android.ugc.aweme.offline.performanceopt.DefaultPerformanceOptOfflineServiceImpl;
import com.ss.android.ugc.aweme.offline.photomode.debug.DefaultPhotomodeDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.playeranalytics.DefaultPlayerAnalyticsServiceImpl;
import com.ss.android.ugc.aweme.offline.pluggable.cla.debug.DefaultClaDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.post.mode.debug.DefaultPostModeDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.precise.test.DefaultPreciseTestServiceImpl;
import com.ss.android.ugc.aweme.offline.rax.log.DefaultRaxLogServiceImpl;
import com.ss.android.ugc.aweme.offline.relation.debug.DefaultRelationDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.reliability.chaos.DefaultReliabilityChaosServiceImpl;
import com.ss.android.ugc.aweme.offline.screenshot.feedback.DefaultScreenshotFeedbackServiceImpl;
import com.ss.android.ugc.aweme.offline.screenshot.test.kit.DefaultScreenshotTestKitServiceImpl;
import com.ss.android.ugc.aweme.offline.socialavatar.debug.DefaultSocialAvatarDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.statsfornerds.DefaultStatsForNerdsServiceImpl;
import com.ss.android.ugc.aweme.offline.tablet.OverlayImpl;
import com.ss.android.ugc.aweme.offline.tako.debug.DefaultTakoDebugServiceImpl;
import com.ss.android.ugc.aweme.offline.template.compare.DefaultTemplateCompareServiceImpl;
import com.ss.android.ugc.aweme.offline.testcase.DefaultTestcaseServiceImpl;
import com.ss.android.ugc.aweme.offline.thor.ThorServiceDefault;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.DefaultToolsDebugGpServiceImpl;
import com.ss.android.ugc.aweme.offline.ttmock.DefaultTtmockKevaServiceImpl;
import com.ss.android.ugc.aweme.offline.ttmock.DefaultTtmockNetworkServiceImpl;
import com.ss.android.ugc.aweme.offline.ttmock.DefaultTtmockServiceImpl;
import com.ss.android.ugc.aweme.offline.tweak.DefaultTweakServiceImpl;
import com.ss.android.ugc.aweme.offline.ucp.debug.DefaultUcpDebugToolsServiceImpl;
import com.ss.android.ugc.aweme.offline.ugc.rec.reason.debug.tool.DefaultUgcRecReasonDebugToolServiceImpl;
import com.ss.android.ugc.aweme.offline.visual.survey.info.DefaultVisualSurveyInfoServiceImpl;
import com.ss.android.ugc.aweme.offline.vm.ads.preview.DefaultVMPreviewAdsOfflineServiceImpl;
import com.ss.android.ugc.aweme.offline.warlock.DefaultWarlock2ServiceImpl;
import com.ss.android.ugc.aweme.offline.warlock.DefaultWarlockServiceImpl;
import com.ss.android.ugc.aweme.oppo.hyperboost.HyperboostServiceEmptyImpl;
import com.ss.android.ugc.aweme.photo.PhotoStrategyEmptyService;
import com.ss.android.ugc.aweme.pipfeed.api.PipFeedDefaultImpl;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperExService;
import com.ss.android.ugc.aweme.poi.anchor.api.PoiAnchorServiceTemporaryEmptyImpl;
import com.ss.android.ugc.aweme.poi_api.service.PoiExpServiceEmptyImpl;
import com.ss.android.ugc.aweme.poi_api.service.PoiServiceEmptyImpl;
import com.ss.android.ugc.aweme.portrait.api.PortraitCenterInitServiceDefault;
import com.ss.android.ugc.aweme.portrait.service.dummy.DummyAIPortraitFeatureServiceImpl;
import com.ss.android.ugc.aweme.preinstall.PreInstallFakeService;
import com.ss.android.ugc.aweme.profile.ProfileDowngradeService;
import com.ss.android.ugc.aweme.qrcode.IScanQRCodeDiffProtocol;
import com.ss.android.ugc.aweme.qrcode.QRCodeDowngradeService;
import com.ss.android.ugc.aweme.relation.spi.InviteFriendsDowngradeService;
import com.ss.android.ugc.aweme.saas.ecommerce.service.DummyECommerceTTDependencyService;
import com.ss.android.ugc.aweme.saas.ecommerce.service.DummyShowcaseSaaSService;
import com.ss.android.ugc.aweme.search.appdiff.ISearchEntranceAppDiff;
import com.ss.android.ugc.aweme.search.appdiff.ISearchLynxAppDiff;
import com.ss.android.ugc.aweme.search.appdiff.ISearchMobAppDiff;
import com.ss.android.ugc.aweme.search.appdiff.ISearchSugAppDiff;
import com.ss.android.ugc.aweme.search.appdiff.ISearchTabAppDiff;
import com.ss.android.ugc.aweme.search.df.api.choosemusic.SearchChooseMusicServiceDefaultImpl;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.dummyspi.DummySearchBlankPageCoinTaskService;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.dummyspi.DummySearchCoinHintService;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.dummyspi.DummySearchCoinTaskBridgeMethodService;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.dummyspi.DummySearchCoinTaskControlService;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.dummyspi.DummySearchCoinTaskProvider;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.dummyspi.DummySearchCoinViewModelBridgeService;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.dummyspi.DummySearchEntranceGuideTaskService;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.dummyspi.DummySearchIncentiveMultiDayService;
import com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.dummyspi.DummySearchIncentiveTaskBridgeService;
import com.ss.android.ugc.aweme.search.df.api.survey.SearchSurveyServiceDefaultImpl;
import com.ss.android.ugc.aweme.search.df.api.top1.SearchMarkdownNimblePreloadPluginDefaultImpl;
import com.ss.android.ugc.aweme.search.df.api.top1.SearchTop1AabServiceDefaultImpl;
import com.ss.android.ugc.aweme.search.df.api.top1.SearchTop1DynamicProtocolServiceDefaultImpl;
import com.ss.android.ugc.aweme.search.df.api.top1.SearchTop1ProtocolClassServiceDefaultImpl;
import com.ss.android.ugc.aweme.search.df.api.top1.Top1ExpandFloatingViewServiceDefaultImpl;
import com.ss.android.ugc.aweme.search.df.api.visualsearch.SearchVisualSearchServiceDefaultImpl;
import com.ss.android.ugc.aweme.search.voice.core.service.SearchDynamicServiceDefaultImpl;
import com.ss.android.ugc.aweme.series.common.serviceimpl.PaidContentFeedService;
import com.ss.android.ugc.aweme.series.commonfeed.component.playnext.AutoPlayNextAssem;
import com.ss.android.ugc.aweme.series.favorite.appdiff.SeriesFavoriteAppDiffProtocol;
import com.ss.android.ugc.aweme.series.feed.IDramaDiscoverColdStartTaskService;
import com.ss.android.ugc.aweme.series.feed.INUJUnderTakeManager;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedExService;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.appdiff.IPopularPushPopupService;
import com.ss.android.ugc.aweme.series.feed.appdiff.ISeriesDiscoverAppDiffProtocol;
import com.ss.android.ugc.aweme.series.feed.profile.viewmodel.ISeriesProfileAppDiffProtocol;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.ColdStartOptimization;
import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel;
import com.ss.android.ugc.aweme.series.feed.tab.SeriesHomeTabAppDiffProtocol;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;
import com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi;
import com.ss.android.ugc.aweme.service.DefaultMiniDramaTouchPointService;
import com.ss.android.ugc.aweme.service.IAutomaticPageStayTimeService;
import com.ss.android.ugc.aweme.service.IDramaDiscoverService;
import com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService;
import com.ss.android.ugc.aweme.service.IDramaProfileHistoryTabService;
import com.ss.android.ugc.aweme.service.IDramaRevisitOptService;
import com.ss.android.ugc.aweme.service.IResumeBannerService;
import com.ss.android.ugc.aweme.service.MiniDramaColdBootLogService;
import com.ss.android.ugc.aweme.service.NearbyFeedServiceEmptyImpl;
import com.ss.android.ugc.aweme.service.appdiff.IPineDramaInnerFeedRouterService;
import com.ss.android.ugc.aweme.service.downgrade.DefalutDanmakuDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultAIRemixDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultAIRemixPreDownloadDebugService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultAuraRecorderServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultComplianceOfflineServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultDogfoodFeedbackServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultDogfoodPermissionService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultDraftBoxDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultDraftFeedbackServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultDraftFileStructureServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultDraftOfflineMonitorService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultEtDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultExploreFeedDebugService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFaqDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFeedDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFeedRecommendDebugService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFileLancetServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFilterBotServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFrameCheckServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFridaHookService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultFriendsTabDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultKevaGuardService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLiveDebugService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocalEfficiencyServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocalTestImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocationMockServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocationOfflineServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultLocationPrfService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultMatrixPluginServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultNetworkDebugService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultOfflineFeedbackServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultOpenAuditOfflineServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultPeepholeIntegrationService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultPipoOfflineServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultPitayaOfflineService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultPopupDebugToolsServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultPopupRecordServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultRegionMockServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultRepostFeedDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultSearchDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultSecuidLarkServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultSparrowServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultStrictModeService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultSurveyDebuggerServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultTTWebviewDebugServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultTemplateDebugService;
import com.ss.android.ugc.aweme.service.downgrade.DefaultToolsCameraAudioSecurityCheckServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultToolsCaptureToSDServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultToolsOfflineServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultToolsVQEvaluationServiceImpl;
import com.ss.android.ugc.aweme.service.downgrade.DefaultTouchPointDebugServiceImpl;
import com.ss.android.ugc.aweme.services.IAwemeAccountAppDiffService;
import com.ss.android.ugc.aweme.services.autologin.AutoLoginEmptyService;
import com.ss.android.ugc.aweme.setting.services.IFeedbackCellService;
import com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSettingAppDiffProtocol;
import com.ss.android.ugc.aweme.share.ISharePanelService;
import com.ss.android.ugc.aweme.share.OpenPlatformFeatureFlagService;
import com.ss.android.ugc.aweme.share.multiapp.DowngradeShareExService;
import com.ss.android.ugc.aweme.socialavatar.api.DowngradeSocialAvatarAlbumLauncher;
import com.ss.android.ugc.aweme.socialavatar.api.DowngradeSocialAvatarFastFlowService;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.DowngradeMixStudioEntranceControl;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.DowngradeMixStudioLauncher;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.DowngradeMixStudioStatusRepository;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.DowngradeEmojiRepository;
import com.ss.android.ugc.aweme.spi.IFcpAppDiffProtocol;
import com.ss.android.ugc.aweme.spi.ISearchAppDiffProtocol;
import com.ss.android.ugc.aweme.story.StoryServiceDowngradeImpl;
import com.ss.android.ugc.aweme.story.appdiff.IStorySaasAppDiffProtocol;
import com.ss.android.ugc.aweme.story.widget.StoryWidgetServiceDowngradeImpl;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsServiceDummy;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.PgcSchemaInterceptServiceDummy;
import com.ss.android.ugc.aweme.tab.activity.DummyActivityTabServiceImpl;
import com.ss.android.ugc.aweme.tabicon.TabIconServiceDowngradeImpl;
import com.ss.android.ugc.aweme.tablet.api.DowngradeDeviceCapability;
import com.ss.android.ugc.aweme.tako.experiment.ITakoDisableDiffProtocol;
import com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference;
import com.ss.android.ugc.aweme.theater.downgrade.AITheaterPluginNotInstalledFeatureServiceImpl;
import com.ss.android.ugc.aweme.theater.downgrade.AITheaterProfilePluginNotInstalledServiceImpl;
import com.ss.android.ugc.aweme.tux.business.richtext.IRichTextService;
import com.ss.android.ugc.aweme.ug.IRateFeedbackService;
import com.ss.android.ugc.aweme.ug.brand.TranssonicFakeService;
import com.ss.android.ugc.aweme.ug.spi.IPraiseDialogDiff;
import com.ss.android.ugc.aweme.ui.DowngradeMainTabTextSizeImpl;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager;
import com.ss.android.ugc.aweme.unifiedauthapi.push.appdiff.ISystemPushAppDiffService;
import com.ss.android.ugc.aweme.unifiedauthapi.push.appdiff.ISystemPushGuideManagerAppDiffService;
import com.ss.android.ugc.aweme.upvote.service.UpvoteServiceDowngradeImpl;
import com.ss.android.ugc.aweme.utils.gecko.GeckoGlobalInitServiceDefault;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLocalServiceDefault;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLowStorageConfigDefault;
import com.ss.android.ugc.aweme.video.DefaultIPlayerManagerServiceImpl;
import com.ss.android.ugc.aweme.video.DefaultM2PlayerComboDFServiceImpl;
import com.ss.android.ugc.aweme.video.DowngradeLivePlayerManagerServiceImpl;
import com.ss.android.ugc.aweme.video.local.DefaultLocalVideoPlayerManagerImpl;
import com.ss.android.ugc.aweme.web.service.IAdUserAgentAppDiffProtocol;
import com.ss.android.ugc.aweme.websocket.bridge.WsServiceProvider;
import com.ss.android.ugc.awemepushapi.IDramaPushPreloadService;
import com.ss.android.ugc.customactivityoncrash_base.DefaultCustomActivityOnCrashService;
import com.ss.android.ugc.dtrace.DtraceDummy;
import com.ss.android.ugc.lifeguard.LifeguardDummy;
import com.ss.android.ugc.nearby.api.NearbyMobServiceEmptyImpl;
import com.ss.android.ugc.playerkit.videoview.DefaultVideoMediaMetaGetter;
import com.ss.android.ugc.profile.business.ci.SocialActivityAssem;
import com.ss.android.ugc.profile.business.drama.ISettingRedDotManager;
import com.ss.android.ugc.profile.business.profile.tab.appdiff.IAwmeListFragmentAppDiff;
import com.ss.android.ugc.profile.business.ur.school.datasource.DowngradeSchoolListRepository;
import com.ss.android.ugc.profile.business.ur.school.datasource.DowngradeVerifySchoolCache;
import com.ss.android.ugc.profile.platform.exp.IProfileDefaultConfigAppDiffProtocol;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.config.ProfileTabRegister;
import com.ss.android.ugc.profile.platform.multiapp.IProfileItemTrackService;
import com.ss.android.ugc.tiktok.deeplink.DeeplinkPrefetchDefault;
import com.ss.android.ugc.tiktok.location_api.service.LocationServiceEmptyImpl;
import com.ss.android.ugc.tiktok.location_api.service.LocationServiceForM;
import com.ss.android.ugc.tiktok.privacy.api.phl.PrivacyHighlightServiceDowngradeImpl;
import com.ss.android.ugc.tiktok.seclink.ISecLinkServiceDefault;
import com.ss.android.ugc.tiktok.security.IClientSecurityServiceDefault;
import com.ss.android.ugc.ur.school.downgrade.DowngradeSchoolFlowLauncher;
import com.ss.android.ugc.ur.school.downgrade.DowngradeUserCampusService;
import com.ss.android.ugc.xtrace.XtraceDummy;
import com.tiktok.myna.render.base.DefaultMynaGlobalServiceImpl;
import com.tiktok.myna.render.debug.legacy.DefaultMynaActionPanelImpl;
import com.tiktok.myna.render.debug.panel.DefaultMynaDebugPanelImpl;
import com.tiktok.ttf.absettings.init.depend.InitAbSettingsDependDefault;
import com.tiktok.ttf.network.depend.DefaultExpsDepend;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes29.dex */
public class DowngradeImplManager {
    public Map<String, ServiceProvider> downgradeImplMap = new ConcurrentHashMap();
    public Map<String, Object> staticDowngradeImplCache = new ConcurrentHashMap();
    public final Map<String, String> componentsMap = new ConcurrentHashMap();
    public final Set<String> downgradeComponents = Collections.synchronizedSet(new HashSet());
    public final Set<String> staticDowngradeNotExistSet = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: loaded from: classes3.dex */
    public static class SingleInstanceHolder {
        public static final DowngradeImplManager INSTANCE = new DowngradeImplManager();
    }

    private <T> T getStaticDowngradeImpl(Class<T> cls) {
        switch (cls.getName().hashCode()) {
            case -2141094083:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService")) {
                    T t = (T) new DefaultPlayerDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService", t);
                    return t;
                }
                break;
            case -2139103760:
                if (cls.getName().equals("com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.appdiff.InnerFeedPlaylistAppDiffProtocol")) {
                    T t2 = (T) new InnerFeedPlaylistAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.minidrama.common.component.innerfeed.playlist.appdiff.InnerFeedPlaylistAppDiffProtocol", t2);
                    return t2;
                }
                break;
            case -2131100860:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.visualsearch.ISearchVisualSearchService")) {
                    T t3 = (T) new SearchVisualSearchServiceDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.visualsearch.ISearchVisualSearchService", t3);
                    return t3;
                }
                break;
            case -2127128270:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService")) {
                    T t4 = (T) new DummyHybridDataService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService", t4);
                    return t4;
                }
                break;
            case -2117787791:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService")) {
                    T t6 = (T) new DefaultBusinessDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService", t6);
                    return t6;
                }
                break;
            case -2114923014:
                if (cls.getName().equals("com.ss.android.ugc.aweme.share.ISharePanelService")) {
                    T t7 = (T) new ISharePanelService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.share.ISharePanelService", t7);
                    return t7;
                }
                break;
            case -2114005580:
                if (cls.getName().equals("com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService")) {
                    T t8 = (T) new PoiCollectEmptyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.localservice.service.optimistic.IPoiCollectService", t8);
                    return t8;
                }
                break;
            case -2110987805:
                if (cls.getName().equals("com.ss.android.ugc.aweme.net.interceptor.IResponseExtraParser")) {
                    T t9 = (T) new DowngradeSpiResponseExtraParser();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.net.interceptor.IResponseExtraParser", t9);
                    return t9;
                }
                break;
            case -2107001402:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService")) {
                    T t10 = (T) new IDramaInnerFeedSyncupService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDramaInnerFeedSyncupService", t10);
                    return t10;
                }
                break;
            case -2095893929:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.top1.ISearchTop1DynamicProtocolService")) {
                    T t11 = (T) new SearchTop1DynamicProtocolServiceDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.top1.ISearchTop1DynamicProtocolService", t11);
                    return t11;
                }
                break;
            case -2093382703:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDramaDiscoverService")) {
                    T t12 = (T) new IDramaDiscoverService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDramaDiscoverService", t12);
                    return t12;
                }
                break;
            case -2088649324:
                if (cls.getName().equals("com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService")) {
                    T t13 = (T) new DummyOpenPlatformService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService", t13);
                    return t13;
                }
                break;
            case -2065462492:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.favorite.appdiff.SeriesFavoriteAppDiffProtocol")) {
                    T t14 = (T) new SeriesFavoriteAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.favorite.appdiff.SeriesFavoriteAppDiffProtocol", t14);
                    return t14;
                }
                break;
            case -2054428564:
                if (cls.getName().equals("com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher")) {
                    T t15 = (T) new DowngradeMixStudioLauncher();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher", t15);
                    return t15;
                }
                break;
            case -2042099152:
                if (cls.getName().equals("com.ss.android.ugc.aweme.saas.ecommerce.service.IShowcaseSaaSService")) {
                    T t16 = (T) new DummyShowcaseSaaSService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.saas.ecommerce.service.IShowcaseSaaSService", t16);
                    return t16;
                }
                break;
            case -2026569847:
                if (cls.getName().equals("com.bytedance.android.starship.strategy.IDebugStarshipDataService")) {
                    T t17 = (T) new IDebugStarshipDataEmptyService();
                    putStaticDowngradeImplCache("com.bytedance.android.starship.strategy.IDebugStarshipDataService", t17);
                    return t17;
                }
                break;
            case -2014153158:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.MiniDramaColdBootLogService")) {
                    T t18 = (T) new MiniDramaColdBootLogService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.MiniDramaColdBootLogService", t18);
                    return t18;
                }
                break;
            case -2011443554:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService")) {
                    T t19 = (T) new DefaultECUgPayToMallDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService", t19);
                    return t19;
                }
                break;
            case -2002071954:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.TdiLiteStrategyAPI")) {
                    T t20 = (T) new TdiLiteStrategyAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.TdiLiteStrategyAPI", t20);
                    return t20;
                }
                break;
            case -2001449431:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter")) {
                    T t21 = (T) new ClientAIConfigCenterDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ClientAIConfigCenter", t21);
                    return t21;
                }
                break;
            case -1993122886:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService")) {
                    T t22 = (T) new SearchChooseMusicServiceDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.choosemusic.ISearchChooseMusicService", t22);
                    return t22;
                }
                break;
            case -1987565757:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartIdleDetectionService")) {
                    T t23 = (T) new SmartIdleDetectionServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartIdleDetectionService", t23);
                    return t23;
                }
                break;
            case -1979430600:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcomSearchSparkChannelInterceptorService")) {
                    T t24 = (T) new DefaultEcomSearchSparkChannelInterceptorService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcomSearchSparkChannelInterceptorService", t24);
                    return t24;
                }
                break;
            case -1974340403:
                if (cls.getName().equals("com.ss.android.ugc.aweme.story.appdiff.IStorySaasAppDiffProtocol")) {
                    T t25 = (T) new IStorySaasAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.story.appdiff.IStorySaasAppDiffProtocol", t25);
                    return t25;
                }
                break;
            case -1971258211:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.NoiseLiveCallbackAPI")) {
                    T t26 = (T) new NoiseLiveCallbackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.NoiseLiveCallbackAPI", t26);
                    return t26;
                }
                break;
            case -1969783791:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.screenshot.feedback.IScreenshotFeedbackService")) {
                    T t29 = (T) new DefaultScreenshotFeedbackServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.screenshot.feedback.IScreenshotFeedbackService", t29);
                    return t29;
                }
                break;
            case -1966049751:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.commonfeed.component.playnext.AutoPlayNextAssem$AppDiffProtocol")) {
                    T t30 = (T) new AutoPlayNextAssem.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.commonfeed.component.playnext.AutoPlayNextAssem$AppDiffProtocol", t30);
                    return t30;
                }
                break;
            case -1951686657:
                if (cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IPoiExpService")) {
                    T t31 = (T) new PoiExpServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.poi_api.service.IPoiExpService", t31);
                    return t31;
                }
                break;
            case -1947571277:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceService")) {
                    T t32 = (T) new DummyECommerceService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommerceService", t32);
                    return t32;
                }
                break;
            case -1946347396:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.homepage.IHomepageTabDependencyService")) {
                    T t33 = (T) new DefaultHomepageTabDependencyServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.homepage.IHomepageTabDependencyService", t33);
                    return t33;
                }
                break;
            case -1930901295:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.IPoiMapDependencyService")) {
                    T t34 = (T) new DefaultPoiMapDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.IPoiMapDependencyService", t34);
                    return t34;
                }
                break;
            case -1925751769:
                if (cls.getName().equals("com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.config.ProfileTabRegister$AppDiffProtocol")) {
                    T t35 = (T) new ProfileTabRegister.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.config.ProfileTabRegister$AppDiffProtocol", t35);
                    return t35;
                }
                break;
            case -1922631433:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcSvCommentTopBarService")) {
                    T t36 = (T) new DummyEcSvCommentTopBarService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcSvCommentTopBarService", t36);
                    return t36;
                }
                break;
            case -1915712558:
                if (cls.getName().equals("com.bytedance.sdk.xbridge.services.IXBridgeDowngraderServiceProvider")) {
                    T t37 = (T) new XBridgeDowngraderService();
                    putStaticDowngradeImplCache("com.bytedance.sdk.xbridge.services.IXBridgeDowngraderServiceProvider", t37);
                    return t37;
                }
                break;
            case -1903396445:
                if (cls.getName().equals("com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService")) {
                    T t38 = (T) new DummyAIPortraitFeatureServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService", t38);
                    return t38;
                }
                break;
            case -1891048851:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.ColorShiftAPI")) {
                    T t39 = (T) new ColorShiftAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.ColorShiftAPI", t39);
                    return t39;
                }
                break;
            case -1882283000:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IAuraRecorderService")) {
                    T t40 = (T) new DefaultAuraRecorderServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IAuraRecorderService", t40);
                    return t40;
                }
                break;
            case -1877616633:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.debug.router.IDebugRouterService")) {
                    T t41 = (T) new DefaultDebugRouterServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.debug.router.IDebugRouterService", t41);
                    return t41;
                }
                break;
            case -1871288055:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.mocknativecard.IMockNativeCardService")) {
                    T t42 = (T) new DefaultMockNativeCardServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.mocknativecard.IMockNativeCardService", t42);
                    return t42;
                }
                break;
            case -1859502304:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSuperResolutionAPI")) {
                    T t43 = (T) new VideoSuperResolutionAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoSuperResolutionAPI", t43);
                    return t43;
                }
                break;
            case -1858406841:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.top1.ISearchMarkdownNimblePreloadPlugin")) {
                    T t44 = (T) new SearchMarkdownNimblePreloadPluginDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.top1.ISearchMarkdownNimblePreloadPlugin", t44);
                    return t44;
                }
                break;
            case -1854880805:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IProfileNowsService")) {
                    T t45 = (T) new DummyProfileNowsService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IProfileNowsService", t45);
                    return t45;
                }
                break;
            case -1849304411:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.INUJUnderTakeManager")) {
                    T t46 = (T) new INUJUnderTakeManager.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.INUJUnderTakeManager", t46);
                    return t46;
                }
                break;
            case -1844277035:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tux.business.richtext.IRichTextService")) {
                    T t47 = (T) new IRichTextService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.tux.business.richtext.IRichTextService", t47);
                    return t47;
                }
                break;
            case -1834582603:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.abmock.IAbMockService")) {
                    T t48 = (T) new DefaultAbMockServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.abmock.IAbMockService", t48);
                    return t48;
                }
                break;
            case -1811080351:
                if (cls.getName().equals("com.ss.android.ugc.aweme.regression_test.OpenAuditOfflineService")) {
                    T t49 = (T) new DefaultOpenAuditOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.regression_test.OpenAuditOfflineService", t49);
                    return t49;
                }
                break;
            case -1806946999:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowsTabService")) {
                    T t50 = (T) new DummyNowsTabService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.INowsTabService", t50);
                    return t50;
                }
                break;
            case -1799979829:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.privacy.api.phl.IPrivacyHighlightService")) {
                    T t51 = (T) new PrivacyHighlightServiceDowngradeImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.privacy.api.phl.IPrivacyHighlightService", t51);
                    return t51;
                }
                break;
            case -1788325683:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRRaisrAPI")) {
                    T t52 = (T) new VideoSRRaisrAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoSRRaisrAPI", t52);
                    return t52;
                }
                break;
            case -1788202922:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISearchDebugService")) {
                    T t53 = (T) new DefaultSearchDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ISearchDebugService", t53);
                    return t53;
                }
                break;
            case -1784567751:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService")) {
                    T t54 = (T) new DefaultAdDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService", t54);
                    return t54;
                }
                break;
            case -1779172690:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.top1.ISearchTop1ProtocolClassService")) {
                    T t55 = (T) new SearchTop1ProtocolClassServiceDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.top1.ISearchTop1ProtocolClassService", t55);
                    return t55;
                }
                break;
            case -1773234207:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.search.debug.ISearchDebugService")) {
                    T t56 = (T) new com.ss.android.ugc.aweme.offline.search.debug.DefaultSearchDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.search.debug.ISearchDebugService", t56);
                    return t56;
                }
                break;
            case -1772617633:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.IAIDubbingService")) {
                    T t57 = (T) new DummyAIDubbingService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.IAIDubbingService", t57);
                    return t57;
                }
                break;
            case -1771506892:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService")) {
                    T t58 = (T) new DummyEcSearchFeedCardService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.feedcard.IEcSearchFeedCardService", t58);
                    return t58;
                }
                break;
            case -1767384676:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.image.IECImageService")) {
                    T t59 = (T) new DummyECImageService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.image.IECImageService", t59);
                    return t59;
                }
                break;
            case -1762374099:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPeepholeIntegrationService")) {
                    T t60 = (T) new DefaultPeepholeIntegrationService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IPeepholeIntegrationService", t60);
                    return t60;
                }
                break;
            case -1762099470:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IToolsCaptureToSDService")) {
                    T t61 = (T) new DefaultToolsCaptureToSDServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IToolsCaptureToSDService", t61);
                    return t61;
                }
                break;
            case -1759265523:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.appdiff.ISearchMobAppDiff")) {
                    T t62 = (T) new ISearchMobAppDiff.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.appdiff.ISearchMobAppDiff", t62);
                    return t62;
                }
                break;
            case -1758234765:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDraftFileStructureService")) {
                    T t63 = (T) new DefaultDraftFileStructureServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDraftFileStructureService", t63);
                    return t63;
                }
                break;
            case -1756495563:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.buildconfigdiff.IBuildConfigDiffDependencyService")) {
                    T t64 = (T) new DefaultAwemeDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.buildconfigdiff.IBuildConfigDiffDependencyService", t64);
                    return t64;
                }
                break;
            case -1753842266:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.SmartCDNRankService")) {
                    T t65 = (T) new SmartCDNRankServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.SmartCDNRankService", t65);
                    return t65;
                }
                break;
            case -1746126115:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IEtDebugService")) {
                    T t66 = (T) new DefaultEtDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IEtDebugService", t66);
                    return t66;
                }
                break;
            case -1744958040:
                if (cls.getName().equals("com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository")) {
                    T t67 = (T) new DowngradeMixStudioStatusRepository();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository", t67);
                    return t67;
                }
                break;
            case -1727161271:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService")) {
                    T t68 = (T) new SmartFeedPreloadServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService", t68);
                    return t68;
                }
                break;
            case -1710008088:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.IECNetControllerDependencyService")) {
                    T t69 = (T) new DefaultECNetControllerDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.IECNetControllerDependencyService", t69);
                    return t69;
                }
                break;
            case -1707827715:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.networklog.INetworkLogEasyService")) {
                    T t70 = (T) new DefaultNetworkLogEasyServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.networklog.INetworkLogEasyService", t70);
                    return t70;
                }
                break;
            case -1700578046:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.spi.IActionManagerAppDiffProtocol")) {
                    T t71 = (T) new IActionManagerAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.feed.spi.IActionManagerAppDiffProtocol", t71);
                    return t71;
                }
                break;
            case -1690323830:
                if (cls.getName().equals("com.ss.android.ugc.aweme.deeplink.IDeepLinkService")) {
                    T t72 = (T) new DeepLinkDowngradeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.deeplink.IDeepLinkService", t72);
                    return t72;
                }
                break;
            case -1689796830:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.NoiseLiveAPI")) {
                    T t73 = (T) new NoiseLiveAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.NoiseLiveAPI", t73);
                    return t73;
                }
                break;
            case -1683187434:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.IDramaDiscoverColdStartTaskService")) {
                    T t74 = (T) new IDramaDiscoverColdStartTaskService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.IDramaDiscoverColdStartTaskService", t74);
                    return t74;
                }
                break;
            case -1680183749:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDraftFeedbackService")) {
                    T t75 = (T) new DefaultDraftFeedbackServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDraftFeedbackService", t75);
                    return t75;
                }
                break;
            case -1673054687:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.anole.IAnoleService")) {
                    T t77 = (T) new DefaultAnoleServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.anole.IAnoleService", t77);
                    return t77;
                }
                break;
            case -1667924960:
                if (cls.getName().equals("com.bytedance.touchpoint.api.service.IViewModelService")) {
                    T t78 = (T) new DowngradeViewModelServiceImpl();
                    putStaticDowngradeImplCache("com.bytedance.touchpoint.api.service.IViewModelService", t78);
                    return t78;
                }
                break;
            case -1667892141:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService")) {
                    T t79 = (T) new DefaultToolsDebugGpServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService", t79);
                    return t79;
                }
                break;
            case -1667865087:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLCommonService")) {
                    T t80 = (T) new MLCommonServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.IMLCommonService", t80);
                    return t80;
                }
                break;
            case -1658793647:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.client.ai.benchmark.IClientAiBenchmarkService")) {
                    T t81 = (T) new DefaultClientAiBenchmarkServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.client.ai.benchmark.IClientAiBenchmarkService", t81);
                    return t81;
                }
                break;
            case -1643744318:
                if (cls.getName().equals("com.ss.android.ugc.aweme.oppo.hyperboost.IHyperboostService")) {
                    T t82 = (T) new HyperboostServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.oppo.hyperboost.IHyperboostService", t82);
                    return t82;
                }
                break;
            case -1642579401:
                if (cls.getName().equals("com.ss.android.ugc.aweme.net.IMediaIOCoreBridgeService")) {
                    T t83 = (T) new DefaultMediaIOCoreBridgeServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.net.IMediaIOCoreBridgeService", t83);
                    return t83;
                }
                break;
            case -1633603100:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service")) {
                    T t84 = (T) new SmartPreloadCommentV2ServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service", t84);
                    return t84;
                }
                break;
            case -1633578207:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.ISeriesFeedExService")) {
                    T t85 = (T) new ISeriesFeedExService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.ISeriesFeedExService", t85);
                    return t85;
                }
                break;
            case -1630276685:
                if (cls.getName().equals("com.ss.android.ugc.aweme.spi.ISearchAppDiffProtocol")) {
                    T t86 = (T) new ISearchAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.spi.ISearchAppDiffProtocol", t86);
                    return t86;
                }
                break;
            case -1615422711:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.relation.debug.IRelationDebugService")) {
                    T t87 = (T) new DefaultRelationDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.relation.debug.IRelationDebugService", t87);
                    return t87;
                }
                break;
            case -1614766624:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VqscoreLiveCallbackAPI")) {
                    T t88 = (T) new VqscoreLiveCallbackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VqscoreLiveCallbackAPI", t88);
                    return t88;
                }
                break;
            case -1603190924:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.transaction.ISeaPdpDependencyService")) {
                    T t89 = (T) new DefaultPdpDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.transaction.ISeaPdpDependencyService", t89);
                    return t89;
                }
                break;
            case -1600302605:
                if (cls.getName().equals("com.ss.android.ugc.aweme.util.IStickerStoreHelper")) {
                    T t90 = (T) new BasicStickerStoreHelper.Service();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.util.IStickerStoreHelper", t90);
                    return t90;
                }
                break;
            case -1590000450:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService")) {
                    T t91 = (T) new DummyECommerceAnchorService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService", t91);
                    return t91;
                }
                break;
            case -1581112369:
                if (cls.getName().equals("com.benchmark.collection_api.BXCollectionAPI")) {
                    return (T) new ByteBenchCollectionDowngrade();
                }
                break;
            case -1568697773:
                if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService")) {
                    T t92 = (T) new LiveBubblePopServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService", t92);
                    return t92;
                }
                break;
            case -1568141815:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IEcMallUgDependencyService")) {
                    T t93 = (T) new DefaultEcMallUgDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IEcMallUgDependencyService", t93);
                    return t93;
                }
                break;
            case -1566360139:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.IAwemeDependencyService")) {
                    T t94 = (T) new com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.DefaultAwemeDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.IAwemeDependencyService", t94);
                    return t94;
                }
                break;
            case -1558631651:
                if (cls.getName().equals("com.ss.android.ugc.aweme.account.appdiff.IDramaNujService")) {
                    T t95 = (T) new IDramaNujService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.account.appdiff.IDramaNujService", t95);
                    return t95;
                }
                break;
            case -1533479679:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskProvider")) {
                    T t96 = (T) new DummySearchCoinTaskProvider();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskProvider", t96);
                    return t96;
                }
                break;
            case -1519317549:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService")) {
                    T t97 = (T) new DefaultECommerceMallDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService", t97);
                    return t97;
                }
                break;
            case -1506853545:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ttmock.ITtmockService")) {
                    T t98 = (T) new DefaultTtmockServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ttmock.ITtmockService", t98);
                    return t98;
                }
                break;
            case -1503932921:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommercelive.audience.sea.service.ISeaLiveService")) {
                    T t99 = (T) new DummySeaLiveService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommercelive.audience.sea.service.ISeaLiveService", t99);
                    return t99;
                }
                break;
            case -1503372321:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.feed.recommend.IFeedRecommendInfoService")) {
                    T t100 = (T) new DefaultFeedRecommendInfoServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.feed.recommend.IFeedRecommendInfoService", t100);
                    return t100;
                }
                break;
            case -1502608763:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi$AppDiffProtocol")) {
                    T t101 = (T) new SeriesDetailApi.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.seriesdetail.api.SeriesDetailApi$AppDiffProtocol", t101);
                    return t101;
                }
                break;
            case -1502126031:
                if (cls.getName().equals("com.ss.android.ugc.aweme.multiapp.ISystemPushInboxBannerAppDiffService")) {
                    T t102 = (T) new ISystemPushInboxBannerAppDiffService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.multiapp.ISystemPushInboxBannerAppDiffService", t102);
                    return t102;
                }
                break;
            case -1496587595:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.storage.IStorageDependencyService")) {
                    T t103 = (T) new DefaultTabDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.storage.IStorageDependencyService", t103);
                    return t103;
                }
                break;
            case -1495254594:
                if (cls.getName().equals("com.ss.android.ugc.aweme.logger.ColdBootLoggerAppDiffProtocol")) {
                    T t104 = (T) new ColdBootLoggerAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.logger.ColdBootLoggerAppDiffProtocol", t104);
                    return t104;
                }
                break;
            case -1487840514:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.ISeriesInnerFeedAppDiffProtocol")) {
                    T t105 = (T) new ISeriesInnerFeedAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.ISeriesInnerFeedAppDiffProtocol", t105);
                    return t105;
                }
                break;
            case -1472699734:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ILocationMockService")) {
                    T t106 = (T) new DefaultLocationMockServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ILocationMockService", t106);
                    return t106;
                }
                break;
            case -1468025852:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.SeriesProfileTabViewModelAppDiffService")) {
                    T t107 = (T) new SeriesProfileTabViewModelAppDiffService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.SeriesProfileTabViewModelAppDiffService", t107);
                    return t107;
                }
                break;
            case -1466836780:
                if (cls.getName().equals("com.bytedance.pumbaa.common.interfaces.IEventMonitor")) {
                    T t108 = (T) new EventMonitorImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.common.interfaces.IEventMonitor", t108);
                    return t108;
                }
                break;
            case -1455485075:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.ILegacyDependencyService")) {
                    T t109 = (T) new DefaultLegacyDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.ILegacyDependencyService", t109);
                    return t109;
                }
                break;
            case -1444581136:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService")) {
                    T t110 = (T) new DummyEcMallPadService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService", t110);
                    return t110;
                }
                break;
            case -1432297117:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate")) {
                    T t111 = (T) new CRouterAdapterDelegateDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate", t111);
                    return t111;
                }
                break;
            case -1429156681:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.location_api.service.ILocationService")) {
                    T t112 = (T) new LocationServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.location_api.service.ILocationService", t112);
                    return t112;
                }
                break;
            case -1415883408:
                if (cls.getName().equals("com.ss.android.ugc.profile.business.ur.school.datasource.SchoolListRepository")) {
                    T t113 = (T) new DowngradeSchoolListRepository();
                    putStaticDowngradeImplCache("com.ss.android.ugc.profile.business.ur.school.datasource.SchoolListRepository", t113);
                    return t113;
                }
                break;
            case -1379566319:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService")) {
                    T t114 = (T) new SmartMLSceneServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService", t114);
                    return t114;
                }
                break;
            case -1370750670:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IProfileAppDiffProtocol")) {
                    T t115 = (T) new IProfileAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IProfileAppDiffProtocol", t115);
                    return t115;
                }
                break;
            case -1364971920:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoOCLSRAPI")) {
                    T t116 = (T) new VideoOCLSRAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoOCLSRAPI", t116);
                    return t116;
                }
                break;
            case -1364051945:
                if (cls.getName().equals("com.ss.android.ugc.nearby.api.INearbyMobService")) {
                    T t117 = (T) new NearbyMobServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.nearby.api.INearbyMobService", t117);
                    return t117;
                }
                break;
            case -1351243761:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService")) {
                    T t118 = (T) new DefaultNoticeDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService", t118);
                    return t118;
                }
                break;
            case -1338406731:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService")) {
                    T t119 = (T) new DefaultShareDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService", t119);
                    return t119;
                }
                break;
            case -1328224907:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.tab.ITabDependencyService")) {
                    T t120 = (T) new com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.tab.DefaultTabDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.tab.ITabDependencyService", t120);
                    return t120;
                }
                break;
            case -1323957599:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ILandscapeFeedService")) {
                    T t121 = (T) new LandscapeFeedDowngradeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ILandscapeFeedService", t121);
                    return t121;
                }
                break;
            case -1322315436:
                if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService")) {
                    T t122 = (T) new DummyEcommerceInfluencerService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService", t122);
                    return t122;
                }
                break;
            case -1321892356:
                if (cls.getName().equals("com.ss.android.ugc.awemepushapi.IDramaPushPreloadService")) {
                    T t123 = (T) new IDramaPushPreloadService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.awemepushapi.IDramaPushPreloadService", t123);
                    return t123;
                }
                break;
            case -1317882728:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRLutDspAPI")) {
                    T t124 = (T) new VideoSRLutDspAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoSRLutDspAPI", t124);
                    return t124;
                }
                break;
            case -1311382259:
                if (cls.getName().equals("com.bytedance.ies.foundation.base.IBaseConfigConverter")) {
                    T t125 = (T) new DefaultBaseConfigConverterImpl();
                    putStaticDowngradeImplCache("com.bytedance.ies.foundation.base.IBaseConfigConverter", t125);
                    return t125;
                }
                break;
            case -1303470795:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommercelive.audience.common.livewindow.IWindowLivePlayerCompat")) {
                    T t126 = (T) new DefaultWindowLivePlayerCompat();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommercelive.audience.common.livewindow.IWindowLivePlayerCompat", t126);
                    return t126;
                }
                break;
            case -1303276871:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IOfflineFeedbackService")) {
                    T t127 = (T) new DefaultOfflineFeedbackServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IOfflineFeedbackService", t127);
                    return t127;
                }
                break;
            case -1289181594:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService")) {
                    T t128 = (T) new SmartPlaytimePredictServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService", t128);
                    return t128;
                }
                break;
            case -1288211415:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.appdiff.ISearchEntranceAppDiff")) {
                    T t129 = (T) new ISearchEntranceAppDiff.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.appdiff.ISearchEntranceAppDiff", t129);
                    return t129;
                }
                break;
            case -1282200045:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ILocationOfflineService")) {
                    T t130 = (T) new DefaultLocationOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ILocationOfflineService", t130);
                    return t130;
                }
                break;
            case -1281926155:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService")) {
                    T t131 = (T) new DefaultEcomSearchDependency();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService", t131);
                    return t131;
                }
                break;
            case -1275681414:
                if (cls.getName().equals("com.ss.android.ugc.dtrace.IDtrace")) {
                    T t132 = (T) new DtraceDummy();
                    putStaticDowngradeImplCache("com.ss.android.ugc.dtrace.IDtrace", t132);
                    return t132;
                }
                break;
            case -1268753058:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService")) {
                    T t133 = (T) new DummyShopIconService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService", t133);
                    return t133;
                }
                break;
            case -1265410950:
                if (cls.getName().equals("com.bytedance.touchpoint.api.service.IWatchVideoService")) {
                    T t134 = (T) new DowngradeWatchVideoServiceImpl();
                    putStaticDowngradeImplCache("com.bytedance.touchpoint.api.service.IWatchVideoService", t134);
                    return t134;
                }
                break;
            case -1263811427:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService")) {
                    T t135 = (T) new SmartFeedLoadMoreServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService", t135);
                    return t135;
                }
                break;
            case -1261652355:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ScreenTimeCalcAndTimer$AppDiffProtocol")) {
                    T t136 = (T) new ScreenTimeCalcAndTimer.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ScreenTimeCalcAndTimer$AppDiffProtocol", t136);
                    return t136;
                }
                break;
            case -1256962461:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinHintService")) {
                    T t137 = (T) new DummySearchCoinHintService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinHintService", t137);
                    return t137;
                }
                break;
            case -1254155996:
                if (cls.getName().equals("com.ss.android.ugc.aweme.localservice.service.optimistic.IVideoLikeService")) {
                    T t138 = (T) new VideoLikeEmptyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.localservice.service.optimistic.IVideoLikeService", t138);
                    return t138;
                }
                break;
            case -1252955399:
                if (cls.getName().equals("com.ss.android.ugc.aweme.opensdkservice.IOpenIABService")) {
                    T t139 = (T) new DummyOpenIABService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.opensdkservice.IOpenIABService", t139);
                    return t139;
                }
                break;
            case -1250925023:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.newuser.INewuserService")) {
                    T t140 = (T) new DefaultNewuserServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.newuser.INewuserService", t140);
                    return t140;
                }
                break;
            case -1233134364:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService")) {
                    T t141 = (T) new DefaultEcommerceInternalJSBridgeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceInternalJSBridgeService", t141);
                    return t141;
                }
                break;
            case -1230251313:
                if (cls.getName().equals("com.bytedance.ies.android.base.runtime.IDependOutService")) {
                    return (T) new DependOutServiceDowngrade();
                }
                break;
            case -1229718999:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.debug.perf.IDoolittleService")) {
                    T t142 = (T) new DoolittleServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.debug.perf.IDoolittleService", t142);
                    return t142;
                }
                break;
            case -1227228557:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.ISettingsCommonAppDiffProtocol")) {
                    T t143 = (T) new ISettingsCommonAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.ISettingsCommonAppDiffProtocol", t143);
                    return t143;
                }
                break;
            case -1193022775:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.profile.viewmodel.ISeriesProfileAppDiffProtocol")) {
                    T t144 = (T) new ISeriesProfileAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.profile.viewmodel.ISeriesProfileAppDiffProtocol", t144);
                    return t144;
                }
                break;
            case -1192220945:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService")) {
                    T t145 = (T) new DefaultDmToolsDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService", t145);
                    return t145;
                }
                break;
            case -1189818203:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.ISearchDynamicService")) {
                    T t146 = (T) new SearchDynamicServiceDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.ISearchDynamicService", t146);
                    return t146;
                }
                break;
            case -1187941394:
                if (cls.getName().equals("com.ss.android.ugc.aweme.account.appdiff.IDramaNonLoginService")) {
                    T t147 = (T) new IDramaNonLoginService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.account.appdiff.IDramaNonLoginService", t147);
                    return t147;
                }
                break;
            case -1181088827:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ttmock.ITtmockNetworkService")) {
                    T t148 = (T) new DefaultTtmockNetworkServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ttmock.ITtmockNetworkService", t148);
                    return t148;
                }
                break;
            case -1178352011:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.koopa.auto.IKoopaAutoService")) {
                    T t149 = (T) new DefaultKoopaAutoServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.koopa.auto.IKoopaAutoService", t149);
                    return t149;
                }
                break;
            case -1175770854:
                if (cls.getName().equals("com.ss.android.ugc.aweme.dsp.service.IMusicDspService")) {
                    T t150 = (T) new MusicDspServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.dsp.service.IMusicDspService", t150);
                    return t150;
                }
                break;
            case -1153330465:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService")) {
                    T t151 = (T) new DefaultEComOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService", t151);
                    return t151;
                }
                break;
            case -1147457382:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ILiveDebugService")) {
                    T t152 = (T) new DefaultLiveDebugService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ILiveDebugService", t152);
                    return t152;
                }
                break;
            case -1142155950:
                if (cls.getName().equals("com.bytedance.i18n.location.api.SensorClient")) {
                    T t153 = (T) new DefaultSensorClient();
                    putStaticDowngradeImplCache("com.bytedance.i18n.location.api.SensorClient", t153);
                    return t153;
                }
                break;
            case -1132306374:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPService")) {
                    T t154 = (T) new DummyECommerceFYPService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPService", t154);
                    return t154;
                }
                break;
            case -1128904493:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.ISeriesCenterConfigAppDiffProtocol")) {
                    T t155 = (T) new ISeriesCenterConfigAppDiffProtocol.Companion.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.ISeriesCenterConfigAppDiffProtocol", t155);
                    return t155;
                }
                break;
            case -1128187680:
                if (cls.getName().equals("com.ss.android.ugc.aweme.account.settings.IAccountSdkSettingsManagerApi")) {
                    T t156 = (T) new DefaultAccountSdkSettingsManagerApiImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.account.settings.IAccountSdkSettingsManagerApi", t156);
                    return t156;
                }
                break;
            case -1126955461:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService")) {
                    T t157 = (T) new DefaultPdpCreatorVideoFeedDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService", t157);
                    return t157;
                }
                break;
            case -1099920296:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol")) {
                    T t158 = (T) new ICommonFeedAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol", t158);
                    return t158;
                }
                break;
            case -1091698905:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService")) {
                    T t159 = (T) new DefaultLiveDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService", t159);
                    return t159;
                }
                break;
            case -1077200566:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.AdaptiveGradingAPI")) {
                    T t160 = (T) new AdaptiveGradingAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.AdaptiveGradingAPI", t160);
                    return t160;
                }
                break;
            case -1075792532:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IGetNetworkIntercept")) {
                    T t161 = (T) new ApiInterceptDowngrade();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IGetNetworkIntercept", t161);
                    return t161;
                }
                break;
            case -1069238911:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService")) {
                    T t162 = (T) new DefaultAppSettingDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService", t162);
                    return t162;
                }
                break;
            case -1067518024:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.security.IClientSecurityService")) {
                    T t163 = (T) new IClientSecurityServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.security.IClientSecurityService", t163);
                    return t163;
                }
                break;
            case -1063715876:
                if (cls.getName().equals("com.ss.android.ugc.aweme.socialavatar.api.mixstudio.EmojiRepository")) {
                    T t164 = (T) new DowngradeEmojiRepository();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.socialavatar.api.mixstudio.EmojiRepository", t164);
                    return t164;
                }
                break;
            case -1056796133:
                if (cls.getName().equals("com.ss.android.ugc.aweme.theater.service.AITheaterProfileService")) {
                    T t165 = (T) new AITheaterProfilePluginNotInstalledServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.theater.service.AITheaterProfileService", t165);
                    return t165;
                }
                break;
            case -1044279797:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.illustration.IIllustrationService")) {
                    T t166 = (T) new DefaultIllustrationServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.illustration.IIllustrationService", t166);
                    return t166;
                }
                break;
            case -1040142751:
                if (cls.getName().equals("com.ss.android.ugc.ur.school.service.SchoolFlowLauncher")) {
                    T t167 = (T) new DowngradeSchoolFlowLauncher();
                    putStaticDowngradeImplCache("com.ss.android.ugc.ur.school.service.SchoolFlowLauncher", t167);
                    return t167;
                }
                break;
            case -1034268622:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.INetworkExpsDepend")) {
                    T t168 = (T) new DefaultExpsDepend();
                    putStaticDowngradeImplCache("com.bytedance.ies.ugc.aweme.network.INetworkExpsDepend", t168);
                    return t168;
                }
                break;
            case -1027484900:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IAwemeNoticeAppDiffProtocol")) {
                    T t169 = (T) new IAwemeNoticeAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IAwemeNoticeAppDiffProtocol", t169);
                    return t169;
                }
                break;
            case -1023620604:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFridaHookService")) {
                    T t170 = (T) new DefaultFridaHookService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFridaHookService", t170);
                    return t170;
                }
                break;
            case -1020519893:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService")) {
                    T t171 = (T) new DummyPdpPreviewService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService", t171);
                    return t171;
                }
                break;
            case -1015971974:
                if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.business.IInboxGuideWatchFollowingLiveService")) {
                    T t172 = (T) new InboxGuideWatchFollowingLiveServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.homepage.business.IInboxGuideWatchFollowingLiveService", t172);
                    return t172;
                }
                break;
            case -1012377013:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.appdiff.IPineDramaInnerFeedRouterService")) {
                    T t173 = (T) new IPineDramaInnerFeedRouterService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.appdiff.IPineDramaInnerFeedRouterService", t173);
                    return t173;
                }
                break;
            case -986316994:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.dnsopt.IDnsOptDebugConfigService")) {
                    T t174 = (T) new DefaultDnsOptDebugConfigServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.dnsopt.IDnsOptDebugConfigService", t174);
                    return t174;
                }
                break;
            case -983995567:
                if (cls.getName().equals("com.tiktok.ef.absettings.api.IInitAbSettingsDepend")) {
                    T t175 = (T) new InitAbSettingsDependDefault();
                    putStaticDowngradeImplCache("com.tiktok.ef.absettings.api.IInitAbSettingsDepend", t175);
                    return t175;
                }
                break;
            case -972996282:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService")) {
                    T t176 = (T) new DefaultEcUgBackButtonDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService", t176);
                    return t176;
                }
                break;
            case -972506319:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.music.debug.IMusicDebugService")) {
                    T t177 = (T) new DefaultMusicDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.music.debug.IMusicDebugService", t177);
                    return t177;
                }
                break;
            case -961210765:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinViewModelBridgeService")) {
                    T t178 = (T) new DummySearchCoinViewModelBridgeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinViewModelBridgeService", t178);
                    return t178;
                }
                break;
            case -960691949:
                if (cls.getName().equals("com.ss.android.ugc.aweme.comment.photomode.innerflow.IPhotoModeInnerFlowService")) {
                    T t179 = (T) new PhotoModeInnerFlowServiceDowngradeImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.comment.photomode.innerflow.IPhotoModeInnerFlowService", t179);
                    return t179;
                }
                break;
            case -958609899:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService")) {
                    T t180 = (T) new DefaultActivityStackDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService", t180);
                    return t180;
                }
                break;
            case -954995616:
                if (cls.getName().equals("com.ss.android.ugc.aweme.unifiedauthapi.push.appdiff.ISystemPushGuideManagerAppDiffService")) {
                    T t181 = (T) new ISystemPushGuideManagerAppDiffService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.unifiedauthapi.push.appdiff.ISystemPushGuideManagerAppDiffService", t181);
                    return t181;
                }
                break;
            case -914215461:
                if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.xbridge.IPineDramaXBridgeService")) {
                    T t182 = (T) new IPineDramaXBridgeService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.i18n.xbridge.IPineDramaXBridgeService", t182);
                    return t182;
                }
                break;
            case -897514835:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPopupDebugToolsService")) {
                    T t183 = (T) new DefaultPopupDebugToolsServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IPopupDebugToolsService", t183);
                    return t183;
                }
                break;
            case -893966745:
                if (cls.getName().equals("com.bytedance.touchpoint.api.service.IMultiDomainService")) {
                    T t184 = (T) new DowngradeMultiDomainService();
                    putStaticDowngradeImplCache("com.bytedance.touchpoint.api.service.IMultiDomainService", t184);
                    return t184;
                }
                break;
            case -892718263:
                if (cls.getName().equals("com.benchmark.IBTCHSlardar")) {
                    T t185 = (T) new BHSlardarDowngrade();
                    putStaticDowngradeImplCache("com.benchmark.IBTCHSlardar", t185);
                    return t185;
                }
                break;
            case -882279405:
                if (cls.getName().equals("com.ss.android.ugc.profile.business.profile.tab.appdiff.IAwmeListFragmentAppDiff")) {
                    T t186 = (T) new IAwmeListFragmentAppDiff.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.profile.business.profile.tab.appdiff.IAwmeListFragmentAppDiff", t186);
                    return t186;
                }
                break;
            case -881735624:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService")) {
                    T t187 = (T) new DummyEcomSearchService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService", t187);
                    return t187;
                }
                break;
            case -864299331:
                if (cls.getName().equals("com.ss.android.ugc.aweme.video.IM2PlayerComboDFService")) {
                    T t188 = (T) new DefaultM2PlayerComboDFServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.video.IM2PlayerComboDFService", t188);
                    return t188;
                }
                break;
            case -861986395:
                if (cls.getName().equals("com.bytedance.android.starship.base.IStarshipBaseBridge")) {
                    T t189 = (T) new StarshipBaseEmptyServiceBridge();
                    putStaticDowngradeImplCache("com.bytedance.android.starship.base.IStarshipBaseBridge", t189);
                    return t189;
                }
                break;
            case -860972731:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IFavoriteAppDiffProtocol")) {
                    T t190 = (T) new IFavoriteAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IFavoriteAppDiffProtocol", t190);
                    return t190;
                }
                break;
            case -858910179:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.network.IECNetworkSaasService")) {
                    T t191 = (T) new DefaultECNetworkSaasService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.network.IECNetworkSaasService", t191);
                    return t191;
                }
                break;
            case -857828971:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IMatrixPluginService")) {
                    T t192 = (T) new DefaultMatrixPluginServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IMatrixPluginService", t192);
                    return t192;
                }
                break;
            case -856670543:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.ITpcConsentDependencyService")) {
                    T t193 = (T) new DefaultTpcConsentDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.ITpcConsentDependencyService", t193);
                    return t193;
                }
                break;
            case -854986307:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.transaction.IECTransactionSaaSService")) {
                    T t194 = (T) new DefaultECTransactionSaaSService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.transaction.IECTransactionSaaSService", t194);
                    return t194;
                }
                break;
            case -851129746:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFriendsTabDebugService")) {
                    T t195 = (T) new DefaultFriendsTabDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFriendsTabDebugService", t195);
                    return t195;
                }
                break;
            case -846736843:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService")) {
                    T t196 = (T) new DefaultCommentDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService", t196);
                    return t196;
                }
                break;
            case -841256394:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.ISeaPdpCreatorVideoFeedDependencyService")) {
                    T t197 = (T) new DefaultSeaPdpCreatorVideoFeedDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.ISeaPdpCreatorVideoFeedDependencyService", t197);
                    return t197;
                }
                break;
            case -832100041:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService")) {
                    T t198 = (T) new DummyEcomHybridSparkMatchService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService", t198);
                    return t198;
                }
                break;
            case -826855070:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService")) {
                    T t199 = (T) new PitayaFeatureCenterServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.IPitayaFeatureCenterService", t199);
                    return t199;
                }
                break;
            case -822603416:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaFetcherRegistration")) {
                    T t200 = (T) new DummyEcUgPitayaFetcherRegistration();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaFetcherRegistration", t200);
                    return t200;
                }
                break;
            case -820103060:
                if (cls.getName().equals("com.ss.android.ugc.aweme.base.IAnchorApiForEcommerce")) {
                    T t201 = (T) new DefaultIAnchorApiForEcommerce();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.base.IAnchorApiForEcommerce", t201);
                    return t201;
                }
                break;
            case -801115505:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService")) {
                    T t202 = (T) new DefaultToolsCameraAudioSecurityCheckServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService", t202);
                    return t202;
                }
                break;
            case -797524548:
                if (cls.getName().equals("com.bytedance.android.starship.engine.reasoning.IStarShipInit")) {
                    T t203 = (T) new StarshipInitEmptyService();
                    putStaticDowngradeImplCache("com.bytedance.android.starship.engine.reasoning.IStarShipInit", t203);
                    return t203;
                }
                break;
            case -795295750:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.appdiff.ISeriesDiscoverAppDiffProtocol")) {
                    T t204 = (T) new ISeriesDiscoverAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.appdiff.ISeriesDiscoverAppDiffProtocol", t204);
                    return t204;
                }
                break;
            case -774810769:
                if (cls.getName().equals("com.bytedance.pumbaa.audit.api.OpenAuditService")) {
                    T t205 = (T) new OpenAuditServiceEmptyStub();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.audit.api.OpenAuditService", t205);
                    return t205;
                }
                break;
            case -774054360:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.appdiff.ISearchSugAppDiff")) {
                    T t206 = (T) new ISearchSugAppDiff.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.appdiff.ISearchSugAppDiff", t206);
                    return t206;
                }
                break;
            case -767436525:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoBrightAPI")) {
                    T t207 = (T) new VideoBrightAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoBrightAPI", t207);
                    return t207;
                }
                break;
            case -749774093:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.hybrid.IECHybridSaaSService")) {
                    T t208 = (T) new DefaultECHybridSaaSService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.hybrid.IECHybridSaaSService", t208);
                    return t208;
                }
                break;
            case -739147891:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.im.chatroom.playground.IImChatroomPlaygroundService")) {
                    T t209 = (T) new DefaultImChatroomPlaygroundServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.im.chatroom.playground.IImChatroomPlaygroundService", t209);
                    return t209;
                }
                break;
            case -738600920:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.appdiff.ISearchLynxAppDiff")) {
                    T t210 = (T) new ISearchLynxAppDiff.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.appdiff.ISearchLynxAppDiff", t210);
                    return t210;
                }
                break;
            case -738010642:
                if (cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IPoiService")) {
                    T t211 = (T) new PoiServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.poi_api.service.IPoiService", t211);
                    return t211;
                }
                break;
            case -737626930:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ec.ug.debug.IEcMallDebugVerifyService")) {
                    T t212 = (T) new DefaultEcMallDebugVerifyServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ec.ug.debug.IEcMallDebugVerifyService", t212);
                    return t212;
                }
                break;
            case -735050699:
                if (cls.getName().equals("com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory")) {
                    T t213 = (T) new Default3rdRetrofitFactory();
                    putStaticDowngradeImplCache("com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory", t213);
                    return t213;
                }
                break;
            case -730964891:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService")) {
                    T t214 = (T) new DefaultDramaSharedApiPathService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IDramaSharedApiPathService", t214);
                    return t214;
                }
                break;
            case -726292617:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IAIRemixDebugService")) {
                    T t215 = (T) new DefaultAIRemixDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IAIRemixDebugService", t215);
                    return t215;
                }
                break;
            case -714573275:
                if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.api.ui.X2CFragmentMainPageIconService")) {
                    T t216 = (T) new DefaultX2CFragmentMainPageIconService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.homepage.api.ui.X2CFragmentMainPageIconService", t216);
                    return t216;
                }
                break;
            case -706028711:
                if (cls.getName().equals("com.ss.android.ugc.aweme.modeo.IModeoInit")) {
                    T t217 = (T) new ModeoImitDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.modeo.IModeoInit", t217);
                    return t217;
                }
                break;
            case -703329023:
                if (cls.getName().equals("com.fackbook.drawee.IDraweeConfigOutService")) {
                    return (T) new DraweeConfigOutServiceDowngrade();
                }
                break;
            case -701465704:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ug.spi.IPraiseDialogDiff")) {
                    T t218 = (T) new IPraiseDialogDiff.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ug.spi.IPraiseDialogDiff", t218);
                    return t218;
                }
                break;
            case -693840513:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgDependencyService")) {
                    T t219 = (T) new DefaultEcUgDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgDependencyService", t219);
                    return t219;
                }
                break;
            case -692884187:
                if (cls.getName().equals("com.ss.android.ugc.aweme.detail.platform.IDetailFeedAppDiffService")) {
                    T t220 = (T) new IDetailFeedAppDiffService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.detail.platform.IDetailFeedAppDiffService", t220);
                    return t220;
                }
                break;
            case -688908617:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService")) {
                    T t221 = (T) new DeeplinkPrefetchDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService", t221);
                    return t221;
                }
                break;
            case -683554468:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference")) {
                    T t222 = (T) new TarsWrapperInference.TarsWrapperInferenceEmptyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.tars.wrap.TarsWrapperInference", t222);
                    return t222;
                }
                break;
            case -673596545:
                if (cls.getName().equals("com.bytedance.pumbaa.common.interfaces.IExceptionMonitor")) {
                    T t223 = (T) new ExceptionMonitorImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.common.interfaces.IExceptionMonitor", t223);
                    return t223;
                }
                break;
            case -662760131:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService")) {
                    T t224 = (T) new DefaultSocialAvatarDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService", t224);
                    return t224;
                }
                break;
            case -652088378:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IFriendsAppDiffProtocol")) {
                    T t225 = (T) new IFriendsAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IFriendsAppDiffProtocol", t225);
                    return t225;
                }
                break;
            case -648566272:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IAutoLoginService")) {
                    T t226 = (T) new AutoLoginEmptyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.IAutoLoginService", t226);
                    return t226;
                }
                break;
            case -628620472:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService")) {
                    T t227 = (T) new SmartClassifyServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService", t227);
                    return t227;
                }
                break;
            case -627748852:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INearbyFeedService")) {
                    T t228 = (T) new NearbyFeedServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.INearbyFeedService", t228);
                    return t228;
                }
                break;
            case -625127351:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService")) {
                    T t229 = (T) new DefaultComplianceDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService", t229);
                    return t229;
                }
                break;
            case -613379961:
                if (cls.getName().equals("com.ss.android.ugc.aweme.video.ILivePlayerManagerService")) {
                    T t230 = (T) new DowngradeLivePlayerManagerServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.video.ILivePlayerManagerService", t230);
                    return t230;
                }
                break;
            case -610215625:
                if (cls.getName().equals("com.ss.android.ugc.aweme.favorites.service.IFavoriteRevisitAppDiffProtocol")) {
                    T t231 = (T) new IFavoriteRevisitAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.favorites.service.IFavoriteRevisitAppDiffProtocol", t231);
                    return t231;
                }
                break;
            case -607424883:
                if (cls.getName().equals("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService")) {
                    T t232 = (T) new DefaultCustomActivityOnCrashService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService", t232);
                    return t232;
                }
                break;
            case -605741614:
                if (cls.getName().equals("com.bytedance.lynx.spark.schema.parser.api.IPageSchemaParseAPI")) {
                    T t233 = (T) new DefaultPageSchemaParseAPI();
                    putStaticDowngradeImplCache("com.bytedance.lynx.spark.schema.parser.api.IPageSchemaParseAPI", t233);
                    return t233;
                }
                break;
            case -597770654:
                if (cls.getName().equals("com.ss.android.ugc.aweme.discover.IDiscoveryAsyncInflateService")) {
                    return (T) new DiscoveryAsyncInflateDownImpl();
                }
                break;
            case -593819631:
                if (cls.getName().equals("com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAlbumLauncher")) {
                    T t234 = (T) new DowngradeSocialAvatarAlbumLauncher();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarAlbumLauncher", t234);
                    return t234;
                }
                break;
            case -588825978:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IBootLogDependencyService")) {
                    T t235 = (T) new DefaultBootLogDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IBootLogDependencyService", t235);
                    return t235;
                }
                break;
            case -588763591:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$AppDiffProtocol")) {
                    T t236 = (T) new VideoDiggVM.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM$AppDiffProtocol", t236);
                    return t236;
                }
                break;
            case -587014433:
                if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveVersionCodeProvider")) {
                    T t237 = (T) new LiveVersionCodeProviderDummy();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.live.ILiveVersionCodeProvider", t237);
                    return t237;
                }
                break;
            case -576166497:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDramaRevisitOptService")) {
                    T t238 = (T) new IDramaRevisitOptService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDramaRevisitOptService", t238);
                    return t238;
                }
                break;
            case -574238249:
                if (cls.getName().equals("com.ss.android.ugc.aweme.poi.anchor.api.IPoiAnchorServiceTemporary")) {
                    T t239 = (T) new PoiAnchorServiceTemporaryEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.poi.anchor.api.IPoiAnchorServiceTemporary", t239);
                    return t239;
                }
                break;
            case -571312136:
                if (cls.getName().equals("com.bytedance.pumbaa.piz.api.ITokenManager")) {
                    T t240 = (T) new TokenManagerEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.piz.api.ITokenManager", t240);
                    return t240;
                }
                break;
            case -570979083:
                if (cls.getName().equals("com.bytedance.pia.core.spi.api.IPiaConfigTask")) {
                    T t241 = (T) new ConfigTask();
                    putStaticDowngradeImplCache("com.bytedance.pia.core.spi.api.IPiaConfigTask", t241);
                    return t241;
                }
                break;
            case -560848537:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveTTDependencyService")) {
                    T t242 = (T) new DefaultLiveTTDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveTTDependencyService", t242);
                    return t242;
                }
                break;
            case -559895462:
                if (cls.getName().equals("com.bytedance.lynx.hybrid.ssr.ILynxSSRDebugger")) {
                    T t243 = (T) new DefaultSSRDebugger();
                    putStaticDowngradeImplCache("com.bytedance.lynx.hybrid.ssr.ILynxSSRDebugger", t243);
                    return t243;
                }
                break;
            case -555189503:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.playeranalytics.IPlayerAnalyticsService")) {
                    T t244 = (T) new DefaultPlayerAnalyticsServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.playeranalytics.IPlayerAnalyticsService", t244);
                    return t244;
                }
                break;
            case -552038808:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.debug.IDebugPanelService")) {
                    T t245 = (T) new DefaultDebugPanelService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.debug.IDebugPanelService", t245);
                    return t245;
                }
                break;
            case -544007336:
                if (cls.getName().equals("com.bytedance.pumbaa.piz.api.IPizService")) {
                    T t246 = (T) new PizServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.piz.api.IPizService", t246);
                    return t246;
                }
                break;
            case -539986555:
                if (cls.getName().equals("com.benchmark.IBTCHApplog")) {
                    T t247 = (T) new BHApplogDowngrade();
                    putStaticDowngradeImplCache("com.benchmark.IBTCHApplog", t247);
                    return t247;
                }
                break;
            case -531914935:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDraftOfflineMonitorService")) {
                    T t248 = (T) new DefaultDraftOfflineMonitorService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDraftOfflineMonitorService", t248);
                    return t248;
                }
                break;
            case -520223228:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INetworkDebugService")) {
                    T t249 = (T) new DefaultNetworkDebugService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.INetworkDebugService", t249);
                    return t249;
                }
                break;
            case -519441132:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFileLancetService")) {
                    T t250 = (T) new DefaultFileLancetServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFileLancetService", t250);
                    return t250;
                }
                break;
            case -505491999:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IToolsOfflineService")) {
                    T t251 = (T) new DefaultToolsOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IToolsOfflineService", t251);
                    return t251;
                }
                break;
            case -497104607:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.warlock.IWarlockService")) {
                    T t252 = (T) new DefaultWarlockServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.warlock.IWarlockService", t252);
                    return t252;
                }
                break;
            case -488734248:
                if (cls.getName().equals("com.ss.android.ugc.aweme.casting.api.ICastingService")) {
                    T t253 = (T) new DummyCastingService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.casting.api.ICastingService", t253);
                    return t253;
                }
                break;
            case -480949480:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IAIRemixPreDownloadDebugService")) {
                    T t254 = (T) new DefaultAIRemixPreDownloadDebugService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IAIRemixPreDownloadDebugService", t254);
                    return t254;
                }
                break;
            case -476887577:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IRewardAdapterDepend")) {
                    T t255 = (T) new DummyRewardAdapterDependentImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.IRewardAdapterDepend", t255);
                    return t255;
                }
                break;
            case -463579028:
                if (cls.getName().equals("com.ss.android.ugc.aweme.aigc.graph.spi.IDfCameraBizAigcContributor")) {
                    T t256 = (T) new DfCameraBizAigcContributorDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.aigc.graph.spi.IDfCameraBizAigcContributor", t256);
                    return t256;
                }
                break;
            case -453020195:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IStrictModeService")) {
                    T t257 = (T) new DefaultStrictModeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IStrictModeService", t257);
                    return t257;
                }
                break;
            case -448974690:
                if (cls.getName().equals("com.ss.android.ugc.aweme.account.appdiff.IDramaPushFrequencyService")) {
                    T t258 = (T) new IDramaPushFrequencyService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.account.appdiff.IDramaPushFrequencyService", t258);
                    return t258;
                }
                break;
            case -424302170:
                if (cls.getName().equals("com.bytedance.android.starship.IStarshipBridgeService")) {
                    T t259 = (T) new StarshipStrategyEmptyService();
                    putStaticDowngradeImplCache("com.bytedance.android.starship.IStarshipBridgeService", t259);
                    return t259;
                }
                break;
            case -404165147:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommercePhotoService")) {
                    T t260 = (T) new DummyECPhotoService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommercePhotoService", t260);
                    return t260;
                }
                break;
            case -401510911:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService")) {
                    T t261 = (T) new SmartFeedAdUIServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService", t261);
                    return t261;
                }
                break;
            case -393847419:
                if (cls.getName().equals("com.ss.android.ugc.profile.platform.exp.IProfileDefaultConfigAppDiffProtocol")) {
                    T t262 = (T) new IProfileDefaultConfigAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.profile.platform.exp.IProfileDefaultConfigAppDiffProtocol", t262);
                    return t262;
                }
                break;
            case -385270259:
                if (cls.getName().equals("com.ss.android.ugc.aweme.home.offline.WalletHomeOfflineTool")) {
                    T t263 = (T) new DefaultWalletHomeOfflineTool();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.home.offline.WalletHomeOfflineTool", t263);
                    return t263;
                }
                break;
            case -380032182:
                if (cls.getName().equals("com.bytedance.android.commercialize.track.depend.IEventTrackingProcessorDepend")) {
                    T t264 = (T) new EventTrackingProcessorDependDefaultImpl();
                    putStaticDowngradeImplCache("com.bytedance.android.commercialize.track.depend.IEventTrackingProcessorDepend", t264);
                    return t264;
                }
                break;
            case -360388275:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService")) {
                    T t265 = (T) new MLDataCenterServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService", t265);
                    return t265;
                }
                break;
            case -353538851:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService")) {
                    T t266 = (T) new DummyEcUgPitayaService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService", t266);
                    return t266;
                }
                break;
            case -324784547:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.mocktime.IMockTimeService")) {
                    T t267 = (T) new DefaultMockTimeServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.mocktime.IMockTimeService", t267);
                    return t267;
                }
                break;
            case -323703721:
                if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveTabService")) {
                    T t268 = (T) new DummyLiveTabService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.live.ILiveTabService", t268);
                    return t268;
                }
                break;
            case -317372455:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.seclink.ISecLinkService")) {
                    T t269 = (T) new ISecLinkServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.seclink.ISecLinkService", t269);
                    return t269;
                }
                break;
            case -307383819:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService")) {
                    T t270 = (T) new DefaultCommonUtilsDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService", t270);
                    return t270;
                }
                break;
            case -302316116:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tabicon.ITabIconService")) {
                    T t271 = (T) new TabIconServiceDowngradeImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.tabicon.ITabIconService", t271);
                    return t271;
                }
                break;
            case -295484807:
                if (cls.getName().equals("com.ss.android.ugc.aweme.web.service.IAdUserAgentAppDiffProtocol")) {
                    T t272 = (T) new IAdUserAgentAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.web.service.IAdUserAgentAppDiffProtocol", t272);
                    return t272;
                }
                break;
            case -291146197:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IInnerPushAppDiffProtocol")) {
                    T t273 = (T) new IInnerPushAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IInnerPushAppDiffProtocol", t273);
                    return t273;
                }
                break;
            case -282606541:
                if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.IProfileRedDotService")) {
                    T t274 = (T) new IProfileRedDotService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.notice.api.services.IProfileRedDotService", t274);
                    return t274;
                }
                break;
            case -278721992:
                if (cls.getName().equals("com.ss.android.ugc.aweme.story.widget.IStoryWidgetService")) {
                    T t275 = (T) new StoryWidgetServiceDowngradeImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.story.widget.IStoryWidgetService", t275);
                    return t275;
                }
                break;
            case -278704761:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.art.warp.IArtWarpService")) {
                    T t276 = (T) new DefaultArtWarpServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.art.warp.IArtWarpService", t276);
                    return t276;
                }
                break;
            case -278210837:
                if (cls.getName().equals("com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService")) {
                    T t277 = (T) new OneClickLoginEmptyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService", t277);
                    return t277;
                }
                break;
            case -273788969:
                if (cls.getName().equals("com.bytedance.pumbaa.common.interfaces.IAppLog")) {
                    T t278 = (T) new AppLogImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.common.interfaces.IAppLog", t278);
                    return t278;
                }
                break;
            case -271762187:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISparrowService")) {
                    T t279 = (T) new DefaultSparrowServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ISparrowService", t279);
                    return t279;
                }
                break;
            case -266663287:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IApiLoggerService")) {
                    T t280 = (T) new ApiLoggerDowngrade();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IApiLoggerService", t280);
                    return t280;
                }
                break;
            case -266152902:
                if (cls.getName().equals("com.bytedance.i18n.location.api.CellClient")) {
                    T t281 = (T) new DefaultCellClient();
                    putStaticDowngradeImplCache("com.bytedance.i18n.location.api.CellClient", t281);
                    return t281;
                }
                break;
            case -250865977:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.IFeedStrategyService")) {
                    T t282 = (T) new DefaultFeedStrategyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.feed.IFeedStrategyService", t282);
                    return t282;
                }
                break;
            case -235712825:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService")) {
                    T t283 = (T) new DefaultHybridDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService", t283);
                    return t283;
                }
                break;
            case -230860677:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskBridgeMethodService")) {
                    T t284 = (T) new DummySearchCoinTaskBridgeMethodService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskBridgeMethodService", t284);
                    return t284;
                }
                break;
            case -221592737:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tablet.api.IDeviceCapability")) {
                    T t285 = (T) new DowngradeDeviceCapability();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.tablet.api.IDeviceCapability", t285);
                    return t285;
                }
                break;
            case -218060513:
                if (cls.getName().equals("com.bytedance.pumbaa.governance.tool.api.IControlService")) {
                    T t286 = (T) new ControlToolServiceDefault();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.governance.tool.api.IControlService", t286);
                    return t286;
                }
                break;
            case -217912854:
                if (cls.getName().equals("com.ss.android.ugc.profile.platform.multiapp.IProfileItemTrackService")) {
                    T t287 = (T) new IProfileItemTrackService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.profile.platform.multiapp.IProfileItemTrackService", t287);
                    return t287;
                }
                break;
            case -215931668:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFaqDebugService")) {
                    T t288 = (T) new DefaultFaqDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFaqDebugService", t288);
                    return t288;
                }
                break;
            case -212949957:
                if (cls.getName().equals("com.ss.android.ugc.aweme.deeplink.IAdsDeeplinkCommandService")) {
                    T t289 = (T) new AdsDeeplinkCommandDowngradeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.deeplink.IAdsDeeplinkCommandService", t289);
                    return t289;
                }
                break;
            case -205096260:
                if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService")) {
                    T t290 = (T) new DummyECommerceLiveBridgeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IECommerceLiveBridgeService", t290);
                    return t290;
                }
                break;
            case -203622012:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPopupRecordService")) {
                    T t291 = (T) new DefaultPopupRecordServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IPopupRecordService", t291);
                    return t291;
                }
                break;
            case -199936238:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ttmock.ITtmockKevaService")) {
                    T t292 = (T) new DefaultTtmockKevaServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ttmock.ITtmockKevaService", t292);
                    return t292;
                }
                break;
            case -192831749:
                if (cls.getName().equals("com.ss.android.ugc.IResourceChecker")) {
                    T t293 = (T) new DummyResourceChecker();
                    putStaticDowngradeImplCache("com.ss.android.ugc.IResourceChecker", t293);
                    return t293;
                }
                break;
            case -182280201:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.reliability.chaos.IReliabilityChaosService")) {
                    T t294 = (T) new DefaultReliabilityChaosServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.reliability.chaos.IReliabilityChaosService", t294);
                    return t294;
                }
                break;
            case -177870657:
                if (cls.getName().equals("com.benchmark.IBTCHNetTag")) {
                    T t295 = (T) new BHNetTagDowngrade();
                    putStaticDowngradeImplCache("com.benchmark.IBTCHNetTag", t295);
                    return t295;
                }
                break;
            case -177648497:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.rax.log.IRaxLogService")) {
                    T t296 = (T) new DefaultRaxLogServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.rax.log.IRaxLogService", t296);
                    return t296;
                }
                break;
            case -166380543:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.SitiAPI")) {
                    T t297 = (T) new SitiAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.SitiAPI", t297);
                    return t297;
                }
                break;
            case -134238731:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.tab.SeriesHomeTabAppDiffProtocol")) {
                    T t298 = (T) new SeriesHomeTabAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.tab.SeriesHomeTabAppDiffProtocol", t298);
                    return t298;
                }
                break;
            case -125725980:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchEntranceGuideTaskService")) {
                    T t299 = (T) new DummySearchEntranceGuideTaskService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchEntranceGuideTaskService", t299);
                    return t299;
                }
                break;
            case -123218152:
                if (cls.getName().equals("com.bytedance.hybrid.spark.roma.deploy.IGeckoService")) {
                    T t300 = (T) new DowngradeGeckoService();
                    putStaticDowngradeImplCache("com.bytedance.hybrid.spark.roma.deploy.IGeckoService", t300);
                    return t300;
                }
                break;
            case -106483444:
                if (cls.getName().equals("com.ss.android.ugc.ur.school.service.UserCampusService")) {
                    T t301 = (T) new DowngradeUserCampusService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.ur.school.service.UserCampusService", t301);
                    return t301;
                }
                break;
            case -94804797:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.asyncinflater.IEcomAsyncInflateMonitor")) {
                    T t302 = (T) new EcomAsyncInflateMonitorDummy();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.asyncinflater.IEcomAsyncInflateMonitor", t302);
                    return t302;
                }
                break;
            case -93793557:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService")) {
                    T t303 = (T) new DefaultLogDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService", t303);
                    return t303;
                }
                break;
            case -85956479:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IDetailFeedDependencyService")) {
                    T t304 = (T) new DefaultDetailFeedDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IDetailFeedDependencyService", t304);
                    return t304;
                }
                break;
            case -79906415:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.showcase.IECShowcaseSaaSService")) {
                    T t305 = (T) new DefaultECShowcaseSaaSService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.showcase.IECShowcaseSaaSService", t305);
                    return t305;
                }
                break;
            case -45175540:
                if (cls.getName().equals("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService")) {
                    T t306 = (T) new IInferenceEngineServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService", t306);
                    return t306;
                }
                break;
            case -29756897:
                if (cls.getName().equals("com.ss.android.ugc.aweme.comment.param.ICommentPageParamsAppDiffProtocol")) {
                    T t307 = (T) new ICommentPageParamsAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.comment.param.ICommentPageParamsAppDiffProtocol", t307);
                    return t307;
                }
                break;
            case -19654173:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.pitaya.IPitayaDependencyService")) {
                    T t308 = (T) new DefaultPitayaDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.pitaya.IPitayaDependencyService", t308);
                    return t308;
                }
                break;
            case -16524520:
                if (cls.getName().equals("com.ss.android.ugc.aweme.minis.api.IMinisApiService")) {
                    T t309 = (T) new MinisServiceNoop();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.minis.api.IMinisApiService", t309);
                    return t309;
                }
                break;
            case -8934871:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IPdpResourceService")) {
                    T t310 = (T) new DummyPdpResourceService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IPdpResourceService", t310);
                    return t310;
                }
                break;
            case -4398090:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge")) {
                    T t311 = (T) new CreationFeatureBridgeDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge", t311);
                    return t311;
                }
                break;
            case 9091455:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ug.IRateFeedbackService")) {
                    T t312 = (T) new IRateFeedbackService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ug.IRateFeedbackService", t312);
                    return t312;
                }
                break;
            case 9439656:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskControlService")) {
                    T t313 = (T) new DummySearchCoinTaskControlService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskControlService", t313);
                    return t313;
                }
                break;
            case 10812613:
                if (cls.getName().equals("com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSettingAppDiffProtocol")) {
                    T t314 = (T) new LooperProtectEnhanceSettingAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.settings.LooperProtectEnhanceSettingAppDiffProtocol", t314);
                    return t314;
                }
                break;
            case 21824049:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.clean.cache.tool.ICleanCacheToolService")) {
                    T t315 = (T) new DefaultCleanCacheToolServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.clean.cache.tool.ICleanCacheToolService", t315);
                    return t315;
                }
                break;
            case 21995517:
                if (cls.getName().equals("com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService")) {
                    T t316 = (T) new RuleEngineServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService", t316);
                    return t316;
                }
                break;
            case 23658350:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFrameCheckService")) {
                    T t317 = (T) new DefaultFrameCheckServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFrameCheckService", t317);
                    return t317;
                }
                break;
            case 26004728:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.HydraHDRAPI")) {
                    T t318 = (T) new HydraHDRAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.HydraHDRAPI", t318);
                    return t318;
                }
                break;
            case 28321842:
                if (cls.getName().equals("com.bytedance.i18n.location.api.InstrumentationProvider")) {
                    T t319 = (T) new DefaultInstrumentationProvider();
                    putStaticDowngradeImplCache("com.bytedance.i18n.location.api.InstrumentationProvider", t319);
                    return t319;
                }
                break;
            case 39965700:
                if (cls.getName().equals("com.bytedance.pumbaa.common.interfaces.ILogger")) {
                    T t320 = (T) new AlogLoggerImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.common.interfaces.ILogger", t320);
                    return t320;
                }
                break;
            case 44529129:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.api.IFeedRecommendAppDiffProtocol")) {
                    T t321 = (T) new IFeedRecommendAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.feed.api.IFeedRecommendAppDiffProtocol", t321);
                    return t321;
                }
                break;
            case 47006189:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ad.landpage.debug.tool.IAdLandpageDebugToolService")) {
                    T t322 = (T) new DefaultAdLandpageDebugToolServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ad.landpage.debug.tool.IAdLandpageDebugToolService", t322);
                    return t322;
                }
                break;
            case 53015589:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.screenshot.test.kit.IScreenshotTestKitService")) {
                    T t323 = (T) new DefaultScreenshotTestKitServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.screenshot.test.kit.IScreenshotTestKitService", t323);
                    return t323;
                }
                break;
            case 53902533:
                if (cls.getName().equals("com.ss.android.ugc.aweme.upvote.service.IUpvoteService")) {
                    T t324 = (T) new UpvoteServiceDowngradeImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.upvote.service.IUpvoteService", t324);
                    return t324;
                }
                break;
            case 57780698:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service")) {
                    T t325 = (T) new SmartPreloadProfileV2ServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service", t325);
                    return t325;
                }
                break;
            case 59459535:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ITTWebviewDebugService")) {
                    T t326 = (T) new DefaultTTWebviewDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ITTWebviewDebugService", t326);
                    return t326;
                }
                break;
            case 83761056:
                if (cls.getName().equals("com.tiktok.myna.render.debug.legacy.IMynaActionPanel")) {
                    T t327 = (T) new DefaultMynaActionPanelImpl();
                    putStaticDowngradeImplCache("com.tiktok.myna.render.debug.legacy.IMynaActionPanel", t327);
                    return t327;
                }
                break;
            case 87343796:
                if (cls.getName().equals("com.benchmark.IBTCHConfiguration")) {
                    T t328 = (T) new BTCHConfigDowngrade();
                    putStaticDowngradeImplCache("com.benchmark.IBTCHConfiguration", t328);
                    return t328;
                }
                break;
            case 88443590:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDramaProfileHistoryTabService")) {
                    T t329 = (T) new IDramaProfileHistoryTabService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDramaProfileHistoryTabService", t329);
                    return t329;
                }
                break;
            case 91220789:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IVideoDetailLoadDependencyService")) {
                    T t330 = (T) new DefaultVideoDetailLoadDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IVideoDetailLoadDependencyService", t330);
                    return t330;
                }
                break;
            case 93820643:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService")) {
                    T t331 = (T) new DefaultMallLandingPerfTrackerDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService", t331);
                    return t331;
                }
                break;
            case 94792885:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey")) {
                    T t332 = (T) new SearchSurveyServiceDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey", t332);
                    return t332;
                }
                break;
            case 95494115:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.nimble.debug.INimbleDebugService")) {
                    T t333 = (T) new DefaultNimbleDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.nimble.debug.INimbleDebugService", t333);
                    return t333;
                }
                break;
            case 105443495:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.post.mode.debug.IPostModeDebugService")) {
                    T t334 = (T) new DefaultPostModeDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.post.mode.debug.IPostModeDebugService", t334);
                    return t334;
                }
                break;
            case 134142500:
                if (cls.getName().equals("com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperExService")) {
                    T t335 = (T) new IGatekeeperExService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperExService", t335);
                    return t335;
                }
                break;
            case 146742051:
                if (cls.getName().equals("com.ss.android.ugc.aweme.tako.experiment.ITakoDisableDiffProtocol")) {
                    T t336 = (T) new ITakoDisableDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.tako.experiment.ITakoDisableDiffProtocol", t336);
                    return t336;
                }
                break;
            case 149298674:
                if (cls.getName().equals("com.ss.android.ugc.aweme.services.IAwemeAccountAppDiffService")) {
                    T t337 = (T) new IAwemeAccountAppDiffService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.services.IAwemeAccountAppDiffService", t337);
                    return t337;
                }
                break;
            case 151391297:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.chunk.INetworkChunkPerformanceService")) {
                    T t338 = (T) new DefaultNetworkChunkPerformanceServiceImpl();
                    putStaticDowngradeImplCache("com.bytedance.ies.ugc.aweme.network.chunk.INetworkChunkPerformanceService", t338);
                    return t338;
                }
                break;
            case 151889945:
                if (cls.getName().equals("com.bytedance.lynx.spark.schema.parser.api.IPopupSchemaParseAPI")) {
                    T t339 = (T) new DefaultPopupSchemaParseAPI();
                    putStaticDowngradeImplCache("com.bytedance.lynx.spark.schema.parser.api.IPopupSchemaParseAPI", t339);
                    return t339;
                }
                break;
            case 168006665:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior")) {
                    T t340 = (T) new DummyCommerceHybridBottomSheetDialogFragmentBehavior();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.ICommerceHybridBottomSheetDialogFragmentBehavior", t340);
                    return t340;
                }
                break;
            case 169193840:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECDiversionDependencyService")) {
                    T t341 = (T) new DefaultECDiversionDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECDiversionDependencyService", t341);
                    return t341;
                }
                break;
            case 174772053:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.ICaptionAppDiffProtocol")) {
                    T t342 = (T) new ICaptionAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.ICaptionAppDiffProtocol", t342);
                    return t342;
                }
                break;
            case 189816622:
                if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService")) {
                    T t343 = (T) new DummyAuthorizeCommonService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService", t343);
                    return t343;
                }
                break;
            case 191768275:
                if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IFeedbackCellService")) {
                    T t344 = (T) new IFeedbackCellService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.setting.services.IFeedbackCellService", t344);
                    return t344;
                }
                break;
            case 195610017:
                if (cls.getName().equals("com.ss.android.ugc.aweme.api.IOpenPlatformFeatureFlagService")) {
                    T t345 = (T) new OpenPlatformFeatureFlagService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.api.IOpenPlatformFeatureFlagService", t345);
                    return t345;
                }
                break;
            case 197041894:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.SmartOHRService")) {
                    T t346 = (T) new SmartOHRServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.SmartOHRService", t346);
                    return t346;
                }
                break;
            case 204211067:
                if (cls.getName().equals("com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl")) {
                    T t347 = (T) new DowngradeMixStudioEntranceControl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl", t347);
                    return t347;
                }
                break;
            case 206582094:
                if (cls.getName().equals("com.bytedance.sdk.xbridge.services.IUtilsService")) {
                    T t348 = (T) new DefaultUtilsService();
                    putStaticDowngradeImplCache("com.bytedance.sdk.xbridge.services.IUtilsService", t348);
                    return t348;
                }
                break;
            case 207921951:
                if (cls.getName().equals("com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch")) {
                    T t349 = (T) new PerformanceExprSwitchImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.base2.performance.IPerformanceExprSwitch", t349);
                    return t349;
                }
                break;
            case 225036552:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.ByteStreamHDAPI")) {
                    T t350 = (T) new ByteStreamHDDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.ByteStreamHDAPI", t350);
                    return t350;
                }
                break;
            case 225444266:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.feed.debug.IProfileBannerDebugService")) {
                    T t351 = (T) new DefaultProfileBannerDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.feed.debug.IProfileBannerDebugService", t351);
                    return t351;
                }
                break;
            case 229928025:
                if (cls.getName().equals("com.bytedance.touchpoint.api.service.IIncentiveService")) {
                    T t352 = (T) new DowngradeIncentiveServiceImpl();
                    putStaticDowngradeImplCache("com.bytedance.touchpoint.api.service.IIncentiveService", t352);
                    return t352;
                }
                break;
            case 235571029:
                if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.IScanQRCodeDiffProtocol")) {
                    T t353 = (T) new IScanQRCodeDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.qrcode.IScanQRCodeDiffProtocol", t353);
                    return t353;
                }
                break;
            case 236044821:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcomMonitorService")) {
                    T t354 = (T) new DefaultEcomMonitorService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcomMonitorService", t354);
                    return t354;
                }
                break;
            case 259772183:
                if (cls.getName().equals("com.tiktok.myna.render.base.IMynaGlobalService")) {
                    T t355 = (T) new DefaultMynaGlobalServiceImpl();
                    putStaticDowngradeImplCache("com.tiktok.myna.render.base.IMynaGlobalService", t355);
                    return t355;
                }
                break;
            case 262564097:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.hybriddevtool.IHybridDevtoolService")) {
                    T t356 = (T) new DefaultHybridDevtoolServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.hybriddevtool.IHybridDevtoolService", t356);
                    return t356;
                }
                break;
            case 272161392:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService")) {
                    T t357 = (T) new DummyCartService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService", t357);
                    return t357;
                }
                break;
            case 273680066:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.performanceopt.IPerformanceOptOfflineService")) {
                    T t358 = (T) new DefaultPerformanceOptOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.performanceopt.IPerformanceOptOfflineService", t358);
                    return t358;
                }
                break;
            case 281697562:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.debug.IEcomDebugService")) {
                    T t359 = (T) new DefaultEComDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.debug.IEcomDebugService", t359);
                    return t359;
                }
                break;
            case 304515265:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.statsfornerds.IStatsForNerdsService")) {
                    T t360 = (T) new DefaultStatsForNerdsServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.statsfornerds.IStatsForNerdsService", t360);
                    return t360;
                }
                break;
            case 315244802:
                if (cls.getName().equals("com.ss.android.ugc.lifeguard.ILifeguard")) {
                    T t361 = (T) new LifeguardDummy();
                    putStaticDowngradeImplCache("com.ss.android.ugc.lifeguard.ILifeguard", t361);
                    return t361;
                }
                break;
            case 316475372:
                if (cls.getName().equals("com.ss.android.ugc.aweme.story.IStoryService")) {
                    T t362 = (T) new StoryServiceDowngradeImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.story.IStoryService", t362);
                    return t362;
                }
                break;
            case 325422061:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.common.serviceimpl.PaidContentFeedService$AppDiffProtocol")) {
                    T t363 = (T) new PaidContentFeedService.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.common.serviceimpl.PaidContentFeedService$AppDiffProtocol", t363);
                    return t363;
                }
                break;
            case 337558515:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService")) {
                    T t364 = (T) new DefaultNetworkUtilDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService", t364);
                    return t364;
                }
                break;
            case 345301621:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService")) {
                    T t365 = (T) new DefaultDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService", t365);
                    return t365;
                }
                break;
            case 355394236:
                if (cls.getName().equals("com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile")) {
                    T t366 = (T) new StarshipSolariaProfileEmptyService();
                    putStaticDowngradeImplCache("com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile", t366);
                    return t366;
                }
                break;
            case 356455466:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPdpPageDependencyService")) {
                    T t367 = (T) new DefaultECUgPdpPageDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPdpPageDependencyService", t367);
                    return t367;
                }
                break;
            case 358045350:
                if (cls.getName().equals("com.ss.android.ugc.aweme.api.IDramaLandingTabApi")) {
                    T t368 = (T) new IDramaLandingTabApi.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.api.IDramaLandingTabApi", t368);
                    return t368;
                }
                break;
            case 359092965:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressCacheService")) {
                    T t369 = (T) new DummyECommerceAddressCacheService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressCacheService", t369);
                    return t369;
                }
                break;
            case 389028902:
                if (cls.getName().equals("com.ss.android.ugc.aweme.preinstall.IPreInstallService")) {
                    T t370 = (T) new PreInstallFakeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.preinstall.IPreInstallService", t370);
                    return t370;
                }
                break;
            case 396547665:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService")) {
                    T t371 = (T) new SandboxServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService", t371);
                    return t371;
                }
                break;
            case 406039729:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.photomode.debug.IPhotomodeDebugService")) {
                    T t372 = (T) new DefaultPhotomodeDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.photomode.debug.IPhotomodeDebugService", t372);
                    return t372;
                }
                break;
            case 423876807:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IGuestModeDependencyService")) {
                    T t373 = (T) new DefaultGuestModeDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IGuestModeDependencyService", t373);
                    return t373;
                }
                break;
            case 430617731:
                if (cls.getName().equals("com.bytedance.hybrid.common.autoservice.ISparkAioDevtool")) {
                    T t374 = (T) new SparkAioDevtoolEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.hybrid.common.autoservice.ISparkAioDevtool", t374);
                    return t374;
                }
                break;
            case 430850380:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPitayaOfflineService")) {
                    T t375 = (T) new DefaultPitayaOfflineService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IPitayaOfflineService", t375);
                    return t375;
                }
                break;
            case 439715030:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IPipoOfflineService")) {
                    T t376 = (T) new DefaultPipoOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IPipoOfflineService", t376);
                    return t376;
                }
                break;
            case 452788698:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveMultiDayService")) {
                    T t377 = (T) new DummySearchIncentiveMultiDayService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveMultiDayService", t377);
                    return t377;
                }
                break;
            case 463351185:
                if (cls.getName().equals("com.bytedance.touchpoint.api.ISafeGuardReporter")) {
                    T t378 = (T) new DowngradeSafeGuardReporterImpl();
                    putStaticDowngradeImplCache("com.bytedance.touchpoint.api.ISafeGuardReporter", t378);
                    return t378;
                }
                break;
            case 465672231:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IExploreFeedDebugService")) {
                    T t379 = (T) new DefaultExploreFeedDebugService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IExploreFeedDebugService", t379);
                    return t379;
                }
                break;
            case 466443618:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.ISeriesFeedService$IDramaKevaService")) {
                    T t380 = (T) new ISeriesFeedService.IDramaKevaService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.ISeriesFeedService$IDramaKevaService", t380);
                    return t380;
                }
                break;
            case 477254501:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VqscoreLiveAPI")) {
                    T t381 = (T) new VqscoreLiveAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VqscoreLiveAPI", t381);
                    return t381;
                }
                break;
            case 478472780:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFeedDebugService")) {
                    T t382 = (T) new DefaultFeedDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFeedDebugService", t382);
                    return t382;
                }
                break;
            case 485686815:
                if (cls.getName().equals("com.ss.android.ugc.aweme.music.fanspotlight.service.IMusicFanSpotlightService")) {
                    T t383 = (T) new MusicFanSpotlightEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.music.fanspotlight.service.IMusicFanSpotlightService", t383);
                    return t383;
                }
                break;
            case 508547621:
                if (cls.getName().equals("com.ss.android.ugc.aweme.local_test.services.IJacocoUtils")) {
                    T t384 = (T) new DefaultJacocoUtils();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.local_test.services.IJacocoUtils", t384);
                    return t384;
                }
                break;
            case 533301408:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IPreVideoPlayTimeUtil")) {
                    T t385 = (T) new DefaultPreVideoPlayTimeUtilImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.IPreVideoPlayTimeUtil", t385);
                    return t385;
                }
                break;
            case 533704707:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService")) {
                    T t386 = (T) new DefaultFriendDependencyServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService", t386);
                    return t386;
                }
                break;
            case 542675894:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.ICommonMiniDramaAppDiffProtocol")) {
                    T t387 = (T) new ICommonMiniDramaAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.ICommonMiniDramaAppDiffProtocol", t387);
                    return t387;
                }
                break;
            case 554144708:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.network.IEcommerceMonitorService")) {
                    T t388 = (T) new DummyEcommerceMonitorService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.network.IEcommerceMonitorService", t388);
                    return t388;
                }
                break;
            case 560897171:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.anydoor.entry.IAnydoorEntryService")) {
                    T t389 = (T) new DefaultAnydoorEntryServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.anydoor.entry.IAnydoorEntryService", t389);
                    return t389;
                }
                break;
            case 574390740:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowFeedPreLoadService")) {
                    T t390 = (T) new DummyNowFeedPreLoadService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.INowFeedPreLoadService", t390);
                    return t390;
                }
                break;
            case 577500742:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService")) {
                    T t391 = (T) new DefaultNLETemplateOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService", t391);
                    return t391;
                }
                break;
            case 591994085:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.lemon.debug.tool.ILemonDebugToolService")) {
                    T t392 = (T) new DefaultLemonDebugToolServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.lemon.debug.tool.ILemonDebugToolService", t392);
                    return t392;
                }
                break;
            case 592000943:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveTaskBridgeService")) {
                    T t393 = (T) new DummySearchIncentiveTaskBridgeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.incentivetask.spi.ISearchIncentiveTaskBridgeService", t393);
                    return t393;
                }
                break;
            case 593443641:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.INowCaptionService")) {
                    T t394 = (T) new DummyNowCaptionService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.INowCaptionService", t394);
                    return t394;
                }
                break;
            case 599108565:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService")) {
                    T t395 = (T) new DefaultApmDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService", t395);
                    return t395;
                }
                break;
            case 602001356:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.router.IStrategyService")) {
                    T t396 = (T) new DummyStrategyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.router.IStrategyService", t396);
                    return t396;
                }
                break;
            case 604825697:
                if (cls.getName().equals("com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolCache")) {
                    T t397 = (T) new DowngradeVerifySchoolCache();
                    putStaticDowngradeImplCache("com.ss.android.ugc.profile.business.ur.school.datasource.VerifySchoolCache", t397);
                    return t397;
                }
                break;
            case 625462581:
                if (cls.getName().equals("com.bytedance.hybrid.common.autoservice.ISDUIAPI")) {
                    T t398 = (T) new DefaultSDUIAPI();
                    putStaticDowngradeImplCache("com.bytedance.hybrid.common.autoservice.ISDUIAPI", t398);
                    return t398;
                }
                break;
            case 627669476:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IPushSettingsAppDiffProtocol")) {
                    T t399 = (T) new IPushSettingsAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IPushSettingsAppDiffProtocol", t399);
                    return t399;
                }
                break;
            case 642369832:
                if (cls.getName().equals("com.bytedance.ies.web.jsbridge2.IJsBridge2Config")) {
                    T t400 = (T) new JsBridge2ConfigDefault();
                    putStaticDowngradeImplCache("com.bytedance.ies.web.jsbridge2.IJsBridge2Config", t400);
                    return t400;
                }
                break;
            case 646537791:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.top1.ITop1ExpandFloatingViewService")) {
                    T t401 = (T) new Top1ExpandFloatingViewServiceDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.top1.ITop1ExpandFloatingViewService", t401);
                    return t401;
                }
                break;
            case 659948117:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService")) {
                    T t402 = (T) new DefaultLocalTestDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService", t402);
                    return t402;
                }
                break;
            case 668062194:
                if (cls.getName().equals("com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService")) {
                    T t403 = (T) new PGCSubsServiceDummy();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService", t403);
                    return t403;
                }
                break;
            case 671886221:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ILocalEfficiencyService")) {
                    T t404 = (T) new DefaultLocalEfficiencyServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ILocalEfficiencyService", t404);
                    return t404;
                }
                break;
            case 675237154:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ITranslatedVideoUtil")) {
                    T t405 = (T) new DefaultTranslatedVideoUtilImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ITranslatedVideoUtil", t405);
                    return t405;
                }
                break;
            case 682082159:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VqscoreProcessCallbackAPI")) {
                    T t406 = (T) new VqscoreProcessCallbackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VqscoreProcessCallbackAPI", t406);
                    return t406;
                }
                break;
            case 694665944:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.appdiff.ISearchTabAppDiff")) {
                    T t407 = (T) new ISearchTabAppDiff.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.appdiff.ISearchTabAppDiff", t407);
                    return t407;
                }
                break;
            case 696264772:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IDetailPageShareVMService")) {
                    T t408 = (T) new SubOnlyVideoOperatorServiceDummy();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.IDetailPageShareVMService", t408);
                    return t408;
                }
                break;
            case 713034583:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.precise.test.IPreciseTestService")) {
                    T t409 = (T) new DefaultPreciseTestServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.precise.test.IPreciseTestService", t409);
                    return t409;
                }
                break;
            case 714199974:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IStoryAppDiffProtocol")) {
                    T t410 = (T) new IStoryAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IStoryAppDiffProtocol", t410);
                    return t410;
                }
                break;
            case 738188939:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.account.debug.tools.IAccountDebugToolsService")) {
                    T t411 = (T) new DefaultAccountDebugToolsServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.account.debug.tools.IAccountDebugToolsService", t411);
                    return t411;
                }
                break;
            case 757984880:
                if (cls.getName().equals("com.bytedance.ies.xbridge.autoservice.IReadableJSONService")) {
                    T t412 = (T) new DefaultReadableJSONServiceImpl();
                    putStaticDowngradeImplCache("com.bytedance.ies.xbridge.autoservice.IReadableJSONService", t412);
                    return t412;
                }
                break;
            case 758021698:
                if (cls.getName().equals("com.ss.android.ugc.aweme.vision.IPhotoSearchService")) {
                    T t413 = (T) new DummyPhotoSearchService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.vision.IPhotoSearchService", t413);
                    return t413;
                }
                break;
            case 787868839:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.testcase.ITestcaseService")) {
                    T t414 = (T) new DefaultTestcaseServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.testcase.ITestcaseService", t414);
                    return t414;
                }
                break;
            case 819941793:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.capture.sdcard.ICaptureSdcardService")) {
                    T t415 = (T) new DefaultCaptureSdcardServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.capture.sdcard.ICaptureSdcardService", t415);
                    return t415;
                }
                break;
            case 834374198:
                if (cls.getName().equals("com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService")) {
                    T t416 = (T) new DummyLiveStreamAdaptService();
                    putStaticDowngradeImplCache("com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptService", t416);
                    return t416;
                }
                break;
            case 839175791:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService")) {
                    T t417 = (T) new DefaultSearchDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService", t417);
                    return t417;
                }
                break;
            case 839350469:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ec.ug.debug.IEcUgDebugService")) {
                    T t418 = (T) new DefaultEcUgDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ec.ug.debug.IEcUgDebugService", t418);
                    return t418;
                }
                break;
            case 844242577:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.inner.push.offline.IInnerPushOfflineService")) {
                    T t419 = (T) new DefaultInnerPushOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.inner.push.offline.IInnerPushOfflineService", t419);
                    return t419;
                }
                break;
            case 860475405:
                if (cls.getName().equals("com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService")) {
                    T t420 = (T) new DowngradeSocialAvatarFastFlowService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService", t420);
                    return t420;
                }
                break;
            case 863489093:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.template.compare.ITemplateCompareService")) {
                    T t421 = (T) new DefaultTemplateCompareServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.template.compare.ITemplateCompareService", t421);
                    return t421;
                }
                break;
            case 865400705:
                if (cls.getName().equals("com.ss.android.ugc.aweme.feed.assem.report.ReportViewAssem$AppDiffProtocol")) {
                    T t422 = (T) new ReportViewAssem.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.feed.assem.report.ReportViewAssem$AppDiffProtocol", t422);
                    return t422;
                }
                break;
            case 870324036:
                if (cls.getName().equals("com.tiktok.myna.render.debug.panel.IMynaDebugPanel")) {
                    T t423 = (T) new DefaultMynaDebugPanelImpl();
                    putStaticDowngradeImplCache("com.tiktok.myna.render.debug.panel.IMynaDebugPanel", t423);
                    return t423;
                }
                break;
            case 870434344:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.chunk.INetworkChunkRaxService")) {
                    T t424 = (T) new DefaultNetworkChunkRaxServiceImpl();
                    putStaticDowngradeImplCache("com.bytedance.ies.ugc.aweme.network.chunk.INetworkChunkRaxService", t424);
                    return t424;
                }
                break;
            case 880160181:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.offline.IOfflineDependencyService")) {
                    T t425 = (T) new DefaultOfflineDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.offline.IOfflineDependencyService", t425);
                    return t425;
                }
                break;
            case 885632920:
                if (cls.getName().equals("com.bytedance.geckox.IGeckoLowStorageConfig")) {
                    T t426 = (T) new GeckoLowStorageConfigDefault();
                    putStaticDowngradeImplCache("com.bytedance.geckox.IGeckoLowStorageConfig", t426);
                    return t426;
                }
                break;
            case 890528305:
                if (cls.getName().equals("com.ss.android.ugc.aweme.serviceplugin.IServicePluginPlatformManager")) {
                    T t427 = (T) new DummyServicePluginPlatformManager();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.serviceplugin.IServicePluginPlatformManager", t427);
                    return t427;
                }
                break;
            case 892608820:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager")) {
                    T t428 = (T) new DummyMallServiceManager();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager", t428);
                    return t428;
                }
                break;
            case 892692257:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IKevaGuardService")) {
                    T t429 = (T) new DefaultKevaGuardService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IKevaGuardService", t429);
                    return t429;
                }
                break;
            case 892732851:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.deeplink.IDeeplinkDependencyService")) {
                    T t430 = (T) new DefaultDeeplinkDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.deeplink.IDeeplinkDependencyService", t430);
                    return t430;
                }
                break;
            case 894220565:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.IAwemeMainDependencyService")) {
                    T t431 = (T) new DefaultAwemeMainDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.IAwemeMainDependencyService", t431);
                    return t431;
                }
                break;
            case 894687086:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ISurveyDebuggerService")) {
                    T t432 = (T) new DefaultSurveyDebuggerServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ISurveyDebuggerService", t432);
                    return t432;
                }
                break;
            case 896282920:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ITemplateDebugService")) {
                    T t433 = (T) new DefaultTemplateDebugService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ITemplateDebugService", t433);
                    return t433;
                }
                break;
            case 896785059:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.imagelightenservertime.IImageLightenServerTimeService")) {
                    T t434 = (T) new DefaultImageLightenServerTimeServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.imagelightenservertime.IImageLightenServerTimeService", t434);
                    return t434;
                }
                break;
            case 898143227:
                if (cls.getName().equals("com.ss.android.ugc.profile.business.drama.ISettingRedDotManager")) {
                    T t435 = (T) new ISettingRedDotManager.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.profile.business.drama.ISettingRedDotManager", t435);
                    return t435;
                }
                break;
            case 913277804:
                if (cls.getName().equals("com.ss.android.ugc.aweme.profile.IProfileService")) {
                    T t436 = (T) new ProfileDowngradeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.profile.IProfileService", t436);
                    return t436;
                }
                break;
            case 920783127:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.warlock.IWarlock2Service")) {
                    T t437 = (T) new DefaultWarlock2ServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.warlock.IWarlock2Service", t437);
                    return t437;
                }
                break;
            case 922519942:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.NoiseDetectCallbackAPI")) {
                    T t438 = (T) new NoiseDetectCallbackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.NoiseDetectCallbackAPI", t438);
                    return t438;
                }
                break;
            case 937803923:
                if (cls.getName().equals("com.bytedance.lynx.spark.schema.parser.api.ICardSchemaParseAPI")) {
                    T t439 = (T) new DefaultCardSchemaParseAPI();
                    putStaticDowngradeImplCache("com.bytedance.lynx.spark.schema.parser.api.ICardSchemaParseAPI", t439);
                    return t439;
                }
                break;
            case 938216902:
                if (cls.getName().equals("com.ss.android.ugc.aweme.mapapi.IPoiMapService")) {
                    T t440 = (T) new PoiMapServiceEmptylmpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.mapapi.IPoiMapService", t440);
                    return t440;
                }
                break;
            case 939821826:
                if (cls.getName().equals("com.bytedance.touchpoint.api.service.ITouchPointOptService")) {
                    T t441 = (T) new DowngradeTouchPointOptServiceImpl();
                    putStaticDowngradeImplCache("com.bytedance.touchpoint.api.service.ITouchPointOptService", t441);
                    return t441;
                }
                break;
            case 959171338:
                if (cls.getName().equals("com.ss.android.ugc.aweme.openshare.IShareRespSendService")) {
                    T t442 = (T) new DummyShareRespSendService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.openshare.IShareRespSendService", t442);
                    return t442;
                }
                break;
            case 974491930:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService")) {
                    T t443 = (T) new DummyEcommerceLiveService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService", t443);
                    return t443;
                }
                break;
            case 975969833:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService")) {
                    T t444 = (T) new DefaultEcUgPopupDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService", t444);
                    return t444;
                }
                break;
            case 994887398:
                if (cls.getName().equals("com.bytedance.android.starship.spi.IStarshipAbility")) {
                    T t445 = (T) new StarshipAbilityEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.android.starship.spi.IStarshipAbility", t445);
                    return t445;
                }
                break;
            case 1020813802:
                if (cls.getName().equals("com.bytedance.pumbaa.api.IPumbaaService")) {
                    T t446 = (T) new PumbaaServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.api.IPumbaaService", t446);
                    return t446;
                }
                break;
            case 1026308927:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService")) {
                    T t447 = (T) new DefaultLauncherDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService", t447);
                    return t447;
                }
                break;
            case 1045451100:
                if (cls.getName().equals("com.bytedance.touchpoint.api.ITouchPointService")) {
                    T t448 = (T) new DowngradeTouchPointServiceImpl();
                    putStaticDowngradeImplCache("com.bytedance.touchpoint.api.ITouchPointService", t448);
                    return t448;
                }
                break;
            case 1045931619:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService")) {
                    T t449 = (T) new DefaultCreativePageDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService", t449);
                    return t449;
                }
                break;
            case 1053771019:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.NoiseDetectAPI")) {
                    T t450 = (T) new NoiseDetectAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.NoiseDetectAPI", t450);
                    return t450;
                }
                break;
            case 1056033244:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.language.ILanguageDebugService")) {
                    T t451 = (T) new DefaultLanguageDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.language.ILanguageDebugService", t451);
                    return t451;
                }
                break;
            case 1070884488:
                if (cls.getName().equals("com.bytedance.android.starship.solaria.IStarshipSolaria")) {
                    T t452 = (T) new StarshipSolariaEmptyService();
                    putStaticDowngradeImplCache("com.bytedance.android.starship.solaria.IStarshipSolaria", t452);
                    return t452;
                }
                break;
            case 1073258125:
                if (cls.getName().equals("com.bytedance.pumbaa.pdp.api.IPolicyDecision")) {
                    T t453 = (T) new PolicyDecisionEmptyImp();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.pdp.api.IPolicyDecision", t453);
                    return t453;
                }
                break;
            case 1080188002:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFeedRecommendInfoDebugService")) {
                    T t454 = (T) new DefaultFeedRecommendDebugService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFeedRecommendInfoDebugService", t454);
                    return t454;
                }
                break;
            case 1082378479:
                if (cls.getName().equals("com.ss.android.ugc.aweme.unifiedauthapi.push.appdiff.ISystemPushAppDiffService")) {
                    T t455 = (T) new ISystemPushAppDiffService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.unifiedauthapi.push.appdiff.ISystemPushAppDiffService", t455);
                    return t455;
                }
                break;
            case 1121395323:
                if (cls.getName().equals("com.ss.android.ugc.aweme.video.IPlayerManagerService")) {
                    T t456 = (T) new DefaultIPlayerManagerServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.video.IPlayerManagerService", t456);
                    return t456;
                }
                break;
            case 1127805601:
                if (cls.getName().equals("com.ss.android.ugc.aweme.local_test.LocalTestApi")) {
                    T t457 = (T) new DefaultLocalTestImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.local_test.LocalTestApi", t457);
                    return t457;
                }
                break;
            case 1133388411:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxLogService")) {
                    T t458 = (T) new RaxLogServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxLogService", t458);
                    return t458;
                }
                break;
            case 1150454115:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService")) {
                    T t459 = (T) new DummyAddressService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService", t459);
                    return t459;
                }
                break;
            case 1155406104:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDraftBoxDebugService")) {
                    T t460 = (T) new DefaultDraftBoxDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDraftBoxDebugService", t460);
                    return t460;
                }
                break;
            case 1159085211:
                if (cls.getName().equals("com.ss.android.ugc.aweme.local_test.services.IRelationDebugService")) {
                    T t461 = (T) new DefaultRelationDebugService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.local_test.services.IRelationDebugService", t461);
                    return t461;
                }
                break;
            case 1159930051:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.ColorHistAPI")) {
                    T t462 = (T) new ColorHistAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.ColorHistAPI", t462);
                    return t462;
                }
                break;
            case 1166418976:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IPdpPrefetchService")) {
                    T t463 = (T) new DummyPdpPrefetchService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IPdpPrefetchService", t463);
                    return t463;
                }
                break;
            case 1179584194:
                if (cls.getName().equals("com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService")) {
                    T t464 = (T) new InviteFriendsDowngradeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService", t464);
                    return t464;
                }
                break;
            case 1205244940:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService")) {
                    T t465 = (T) new DefaultCommonFeedDependService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService", t465);
                    return t465;
                }
                break;
            case 1205724034:
                if (cls.getName().equals("com.bytedance.geckox.IGeckoGlobalInit")) {
                    T t466 = (T) new GeckoGlobalInitServiceDefault();
                    putStaticDowngradeImplCache("com.bytedance.geckox.IGeckoGlobalInit", t466);
                    return t466;
                }
                break;
            case 1219541409:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECHostInitService")) {
                    T t467 = (T) new DefaultHostInitService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECHostInitService", t467);
                    return t467;
                }
                break;
            case 1224189869:
                if (cls.getName().equals("com.bytedance.i18n.location.api.WifiClient")) {
                    T t468 = (T) new DefaultWifiClient();
                    putStaticDowngradeImplCache("com.bytedance.i18n.location.api.WifiClient", t468);
                    return t468;
                }
                break;
            case 1227462233:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService")) {
                    T t469 = (T) new DummyECFYPPlayerService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService", t469);
                    return t469;
                }
                break;
            case 1241362145:
                if (cls.getName().equals("com.ss.android.ugc.aweme.im.appdiff.IMCommonSaasAppDiffProtocol")) {
                    T t470 = (T) new IMCommonSaasAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.im.appdiff.IMCommonSaasAppDiffProtocol", t470);
                    return t470;
                }
                break;
            case 1245560842:
                if (cls.getName().equals("com.bytedance.android.starship.engine.strategy.IStarShipStrategy")) {
                    T t471 = (T) new com.bytedance.android.starship.engine.strategy.StarshipStrategyEmptyService();
                    putStaticDowngradeImplCache("com.bytedance.android.starship.engine.strategy.IStarShipStrategy", t471);
                    return t471;
                }
                break;
            case 1247340399:
                if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService")) {
                    T t472 = (T) new MusicAddToDspCoreServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.music.service.IMusicAddToDspCoreService", t472);
                    return t472;
                }
                break;
            case 1247732012:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.top1.ISearchTop1AabService")) {
                    T t473 = (T) new SearchTop1AabServiceDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.top1.ISearchTop1AabService", t473);
                    return t473;
                }
                break;
            case 1253300668:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.ICommentAppDiffProtocol")) {
                    T t474 = (T) new ICommentAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.ICommentAppDiffProtocol", t474);
                    return t474;
                }
                break;
            case 1256679090:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ILocationPrfService")) {
                    T t475 = (T) new DefaultLocationPrfService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ILocationPrfService", t475);
                    return t475;
                }
                break;
            case 1271555322:
                if (cls.getName().equals("com.ss.android.ugc.aweme.live.assem.IFollowWidgetService")) {
                    T t476 = (T) new FollowWidgetServiceDummy();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.live.assem.IFollowWidgetService", t476);
                    return t476;
                }
                break;
            case 1274472578:
                if (cls.getName().equals("com.ss.android.ugc.aweme.saas.ecommerce.service.IECommerceTTDependencyService")) {
                    T t477 = (T) new DummyECommerceTTDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.saas.ecommerce.service.IECommerceTTDependencyService", t477);
                    return t477;
                }
                break;
            case 1274673737:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IEcMallUgService")) {
                    T t478 = (T) new DummyEcMallUgService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.mall.service.IEcMallUgService", t478);
                    return t478;
                }
                break;
            case 1282325349:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDanmakuDebugService")) {
                    T t479 = (T) new DefalutDanmakuDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDanmakuDebugService", t479);
                    return t479;
                }
                break;
            case 1282970443:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommercelive.audience.us.service.IUsEcommerceLiveService")) {
                    T t480 = (T) new DummyUsEcommerceLiveService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommercelive.audience.us.service.IUsEcommerceLiveService", t480);
                    return t480;
                }
                break;
            case 1285576360:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.dogfood.autoupdate.IDogfoodUpdateService")) {
                    T t481 = (T) new DefaultDogfoodAutoUpdateServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.dogfood.autoupdate.IDogfoodUpdateService", t481);
                    return t481;
                }
                break;
            case 1293205521:
                if (cls.getName().equals("com.ss.android.ugc.aweme.local_test.services.IDebugStarshipService")) {
                    T t482 = (T) new IDebugStarshipEmptyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.local_test.services.IDebugStarshipService", t482);
                    return t482;
                }
                break;
            case 1293770485:
                if (cls.getName().equals("com.bytedance.pumbaa.hybrid.engine.api.IHybridEngine")) {
                    T t483 = (T) new HybridEngineDowngradeImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.hybrid.engine.api.IHybridEngine", t483);
                    return t483;
                }
                break;
            case 1294849365:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkDependencyService")) {
                    T t484 = (T) new DefaultNetworkDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkDependencyService", t484);
                    return t484;
                }
                break;
            case 1299906009:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.auto.marker.IAutoMarkerAbilityService")) {
                    T t485 = (T) new DefaultAutoMarkAbilityServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.auto.marker.IAutoMarkerAbilityService", t485);
                    return t485;
                }
                break;
            case 1312688277:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService")) {
                    T t486 = (T) new DefaultAnchorDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService", t486);
                    return t486;
                }
                break;
            case 1323394319:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.campus.debug.ICampusDebugService")) {
                    T t487 = (T) new DefaultCampusDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.campus.debug.ICampusDebugService", t487);
                    return t487;
                }
                break;
            case 1332810672:
                if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService")) {
                    T t488 = (T) new PnsEdmConsentServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.compliance.api.services.edm.IPnsEdmConsentService", t488);
                    return t488;
                }
                break;
            case 1333329962:
                if (cls.getName().equals("com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT")) {
                    T t489 = (T) new LocationServiceForM();
                    putStaticDowngradeImplCache("com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT", t489);
                    return t489;
                }
                break;
            case 1337060158:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ucp.debug.IUcpDebugToolsService")) {
                    T t490 = (T) new DefaultUcpDebugToolsServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ucp.debug.IUcpDebugToolsService", t490);
                    return t490;
                }
                break;
            case 1339464523:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService")) {
                    T t491 = (T) new RaxServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ec.rax.impl.IEcRaxService", t491);
                    return t491;
                }
                break;
            case 1340188349:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService")) {
                    T t492 = (T) new DefaultNewUserDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService", t492);
                    return t492;
                }
                break;
            case 1344456700:
                if (cls.getName().equals("com.ss.android.ugc.aweme.drama.IDramaInterceptService")) {
                    T t493 = (T) new IDramaInterceptService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.drama.IDramaInterceptService", t493);
                    return t493;
                }
                break;
            case 1359868725:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceRecorderService")) {
                    return (T) new DummyECommerceRecorderService();
                }
                break;
            case 1366755169:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.ISettingsInternalAppDiffProtocol")) {
                    T t494 = (T) new ISettingsInternalAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.ISettingsInternalAppDiffProtocol", t494);
                    return t494;
                }
                break;
            case 1373149304:
                if (cls.getName().equals("com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService")) {
                    T t495 = (T) new PipFeedDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService", t495);
                    return t495;
                }
                break;
            case 1377752390:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService")) {
                    T t496 = (T) new SmartDataTrackerServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService", t496);
                    return t496;
                }
                break;
            case 1382435335:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.compliance.debug.IComplianceDebugService")) {
                    T t497 = (T) new DefaultComplianceDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.compliance.debug.IComplianceDebugService", t497);
                    return t497;
                }
                break;
            case 1383469814:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.ColdStartOptimization")) {
                    T t498 = (T) new ColdStartOptimization.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.ColdStartOptimization", t498);
                    return t498;
                }
                break;
            case 1397119225:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IComplianceOfflineService")) {
                    T t499 = (T) new DefaultComplianceOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IComplianceOfflineService", t499);
                    return t499;
                }
                break;
            case 1397233689:
                if (cls.getName().equals("com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager$AppDiffProtocol")) {
                    T t500 = (T) new PushUserGuidePopupManager.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager$AppDiffProtocol", t500);
                    return t500;
                }
                break;
            case 1425545717:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.vm.ads.preview.service.IVMPreviewAdsOfflineService")) {
                    T t501 = (T) new DefaultVMPreviewAdsOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.vm.ads.preview.service.IVMPreviewAdsOfflineService", t501);
                    return t501;
                }
                break;
            case 1426200676:
                if (cls.getName().equals("com.ss.android.ugc.aweme.subscription.pgc.api.service.PgcSchemaInterceptService")) {
                    T t502 = (T) new PgcSchemaInterceptServiceDummy();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.subscription.pgc.api.service.PgcSchemaInterceptService", t502);
                    return t502;
                }
                break;
            case 1427019553:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.service.monitor.IECSaaSCoreMonitorService")) {
                    T t503 = (T) new DummyECSaaSCoreMonitorService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.service.monitor.IECSaaSCoreMonitorService", t503);
                    return t503;
                }
                break;
            case 1427766222:
                if (cls.getName().equals("com.ss.android.ugc.aweme.spi.IFcpAppDiffProtocol")) {
                    T t504 = (T) new IFcpAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.spi.IFcpAppDiffProtocol", t504);
                    return t504;
                }
                break;
            case 1428259352:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDogfoodPermissionService")) {
                    T t505 = (T) new DefaultDogfoodPermissionService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDogfoodPermissionService", t505);
                    return t505;
                }
                break;
            case 1439578746:
                if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.IHomePageService")) {
                    T t506 = (T) new HomePageServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.homepage.IHomePageService", t506);
                    return t506;
                }
                break;
            case 1448269554:
                if (cls.getName().equals("com.ss.android.ugc.aweme.spi.IActivityTabService")) {
                    T t507 = (T) new DummyActivityTabServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.spi.IActivityTabService", t507);
                    return t507;
                }
                break;
            case 1466173921:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.gecko.IGeckoService")) {
                    T t508 = (T) new DefaultGeckoServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.gecko.IGeckoService", t508);
                    return t508;
                }
                break;
            case 1469964205:
                if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService")) {
                    T t509 = (T) new GeckoLocalServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService", t509);
                    return t509;
                }
                break;
            case 1471250505:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService")) {
                    T t510 = (T) new DummyECommerceMallService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService", t510);
                    return t510;
                }
                break;
            case 1476771971:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.ByteStreamHDCallbackAPI")) {
                    T t511 = (T) new ByteStreamHDCallbackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.ByteStreamHDCallbackAPI", t511);
                    return t511;
                }
                break;
            case 1498685356:
                if (cls.getName().equals("com.ss.android.ugc.aweme.lemon.IL8ServiceInitDiffProtocol")) {
                    T t512 = (T) new IL8ServiceInitDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.lemon.IL8ServiceInitDiffProtocol", t512);
                    return t512;
                }
                break;
            case 1512189833:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.schema.IECSchemaSaasService")) {
                    T t513 = (T) new DefaultECSchemaSaasService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.schema.IECSchemaSaasService", t513);
                    return t513;
                }
                break;
            case 1526593817:
                if (cls.getName().equals("com.bytedance.pumbaa.network.adapter.api.INetworkService")) {
                    T t514 = (T) new NetworkServiceEmptyImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.network.adapter.api.INetworkService", t514);
                    return t514;
                }
                break;
            case 1532564235:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IRegionMockService")) {
                    T t515 = (T) new DefaultRegionMockServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IRegionMockService", t515);
                    return t515;
                }
                break;
            case 1536742851:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ui.IMainTabTextSizeApi")) {
                    T t516 = (T) new DowngradeMainTabTextSizeImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ui.IMainTabTextSizeApi", t516);
                    return t516;
                }
                break;
            case 1537384909:
                if (cls.getName().equals("com.bytedance.i18n.location.api.LocationClient")) {
                    T t517 = (T) new DefaultLocationClient();
                    putStaticDowngradeImplCache("com.bytedance.i18n.location.api.LocationClient", t517);
                    return t517;
                }
                break;
            case 1544943326:
                if (cls.getName().equals("com.ss.android.ugc.playerkit.videoview.IVideoMediaMetaGetter")) {
                    T t518 = (T) new DefaultVideoMediaMetaGetter();
                    putStaticDowngradeImplCache("com.ss.android.ugc.playerkit.videoview.IVideoMediaMetaGetter", t518);
                    return t518;
                }
                break;
            case 1549913815:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ad.explore.IAdExploreService")) {
                    T t519 = (T) new DefaultAdExploreServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ad.explore.IAdExploreService", t519);
                    return t519;
                }
                break;
            case 1558958925:
                if (cls.getName().equals("com.ss.android.ugc.aweme.video.local.ILocalVideoPlayerManager")) {
                    T t520 = (T) new DefaultLocalVideoPlayerManagerImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.video.local.ILocalVideoPlayerManager", t520);
                    return t520;
                }
                break;
            case 1580258804:
                if (cls.getName().equals("com.ss.android.ugc.aweme.localservice.service.optimistic.IOptimisticPluginService")) {
                    T t521 = (T) new OptimisticPluginEmptyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.localservice.service.optimistic.IOptimisticPluginService", t521);
                    return t521;
                }
                break;
            case 1610358593:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.tweak.ITweakService")) {
                    T t522 = (T) new DefaultTweakServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.tweak.ITweakService", t522);
                    return t522;
                }
                break;
            case 1631024401:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.dm.tools.debug.WebSocketConnectionStateDebugHelper")) {
                    T t523 = (T) new DefaultWebSocketConnectionStateDebugHelper();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.dm.tools.debug.WebSocketConnectionStateDebugHelper", t523);
                    return t523;
                }
                break;
            case 1635535805:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.tablet.TabletResizabilityOverlayService")) {
                    T t524 = (T) new OverlayImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.tablet.TabletResizabilityOverlayService", t524);
                    return t524;
                }
                break;
            case 1640075175:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService")) {
                    T t525 = (T) new DefaultPipoOfflineDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService", t525);
                    return t525;
                }
                break;
            case 1661968864:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService")) {
                    T t526 = (T) new SmartCommonPreloadServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService", t526);
                    return t526;
                }
                break;
            case 1662133409:
                if (cls.getName().equals("com.bytedance.pumbaa.utility.settings.ISystemApiPerfOptSettingsV1")) {
                    T t527 = (T) new DefaultSystemApiPerfOptImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.utility.settings.ISystemApiPerfOptSettingsV1", t527);
                    return t527;
                }
                break;
            case 1662194753:
                if (cls.getName().equals("com.bytedance.android.starship.strategy.IStarshipContainerService")) {
                    T t528 = (T) new StarshipContainerEmptyService();
                    putStaticDowngradeImplCache("com.bytedance.android.starship.strategy.IStarshipContainerService", t528);
                    return t528;
                }
                break;
            case 1670478829:
                if (cls.getName().equals("com.bytedance.pumbaa.common.interfaces.IStore")) {
                    T t529 = (T) new KevaStoreImpl();
                    putStaticDowngradeImplCache("com.bytedance.pumbaa.common.interfaces.IStore", t529);
                    return t529;
                }
                break;
            case 1671525849:
                if (cls.getName().equals("com.ss.android.ugc.aweme.share.multiapp.IShareExService")) {
                    T t530 = (T) new DowngradeShareExService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.share.multiapp.IShareExService", t530);
                    return t530;
                }
                break;
            case 1678604719:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.DenoiseAPI")) {
                    T t531 = (T) new DenoiseAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.DenoiseAPI", t531);
                    return t531;
                }
                break;
            case 1679730125:
                if (cls.getName().equals("com.bytedance.android.commercialize.track.depend.IAdEventTrackingProcessorDepend")) {
                    T t532 = (T) new AdEventTrackingProcessorDependDefaultImpl();
                    putStaticDowngradeImplCache("com.bytedance.android.commercialize.track.depend.IAdEventTrackingProcessorDepend", t532);
                    return t532;
                }
                break;
            case 1690201044:
                if (cls.getName().equals("com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptConfigService")) {
                    T t533 = (T) new DummyLiveStreamAdaptConfigService();
                    putStaticDowngradeImplCache("com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptConfigService", t533);
                    return t533;
                }
                break;
            case 1701644943:
                if (cls.getName().equals("com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService")) {
                    T t534 = (T) new PortraitCenterInitServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService", t534);
                    return t534;
                }
                break;
            case 1709516432:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IResumeBannerService")) {
                    T t535 = (T) new IResumeBannerService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IResumeBannerService", t535);
                    return t535;
                }
                break;
            case 1714087091:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IHomepageAppDiffProtocol")) {
                    T t536 = (T) new IHomepageAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IHomepageAppDiffProtocol", t536);
                    return t536;
                }
                break;
            case 1733959293:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.thor.IThorService")) {
                    T t537 = (T) new ThorServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.thor.IThorService", t537);
                    return t537;
                }
                break;
            case 1734892187:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcFypProductSelectCardService")) {
                    T t538 = (T) new DummyEcFypProductSelectCardService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcFypProductSelectCardService", t538);
                    return t538;
                }
                break;
            case 1737609430:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchBlankPageCoinTaskService")) {
                    T t539 = (T) new DummySearchBlankPageCoinTaskService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchBlankPageCoinTaskService", t539);
                    return t539;
                }
                break;
            case 1738596336:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.MotionSenseAPI")) {
                    T t540 = (T) new MotionSenseAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.MotionSenseAPI", t540);
                    return t540;
                }
                break;
            case 1742492986:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService")) {
                    return (T) new DummyEcomGeneralSearchService();
                }
                break;
            case 1743829145:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService")) {
                    T t541 = (T) new DefaultPerformanceOptDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService", t541);
                    return t541;
                }
                break;
            case 1748459787:
                if (cls.getName().equals("com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC")) {
                    return (T) new DummyMiddleForSearchFromEC();
                }
                break;
            case 1770833231:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IToolsVQEvaluationService")) {
                    T t542 = (T) new DefaultToolsVQEvaluationServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IToolsVQEvaluationService", t542);
                    return t542;
                }
                break;
            case 1771368059:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoSRLutAPI")) {
                    T t543 = (T) new VideoSRLutAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoSRLutAPI", t543);
                    return t543;
                }
                break;
            case 1772993265:
                if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveOuterService")) {
                    T t544 = (T) new LiveDummyOuterService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.live.ILiveOuterService", t544);
                    return t544;
                }
                break;
            case 1775410545:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.feed.IFeedCardInsertDebugService")) {
                    T t545 = (T) new DefaultFeedCardInsertDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.feed.IFeedCardInsertDebugService", t545);
                    return t545;
                }
                break;
            case 1776076386:
                if (cls.getName().equals("com.bytedance.i18n.location.api.MockClient")) {
                    T t546 = (T) new DefaultMockClient();
                    putStaticDowngradeImplCache("com.bytedance.i18n.location.api.MockClient", t546);
                    return t546;
                }
                break;
            case 1784507698:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFilterBotService")) {
                    T t547 = (T) new DefaultFilterBotServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IFilterBotService", t547);
                    return t547;
                }
                break;
            case 1790875022:
                if (cls.getName().equals("com.bytedance.bmf_mods_api.VideoBrightCallbackAPI")) {
                    T t548 = (T) new VideoBrightCallBackAPIDefault();
                    putStaticDowngradeImplCache("com.bytedance.bmf_mods_api.VideoBrightCallbackAPI", t548);
                    return t548;
                }
                break;
            case 1798948792:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.appdiff.IPopularPushPopupService")) {
                    T t549 = (T) new IPopularPushPopupService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.appdiff.IPopularPushPopupService", t549);
                    return t549;
                }
                break;
            case 1804629207:
                if (cls.getName().equals("com.ss.android.ugc.aweme.minis.api.IMiniGameRenderService")) {
                    T t550 = (T) new MiniGameRenderServiceNoop();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.minis.api.IMiniGameRenderService", t550);
                    return t550;
                }
                break;
            case 1810694096:
                if (cls.getName().equals("com.ss.android.ugc.aweme.photo.PhotoStrategyService")) {
                    T t551 = (T) new PhotoStrategyEmptyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.photo.PhotoStrategyService", t551);
                    return t551;
                }
                break;
            case 1815788680:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository$AppDiffProtocol")) {
                    T t552 = (T) new SeriesFeedRepository.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository$AppDiffProtocol", t552);
                    return t552;
                }
                break;
            case 1824279743:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IRepostFeedDebugService")) {
                    T t553 = (T) new DefaultRepostFeedDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IRepostFeedDebugService", t553);
                    return t553;
                }
                break;
            case 1832078845:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IPushPopupYieldService")) {
                    T t554 = (T) new IPushPopupYieldService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IPushPopupYieldService", t554);
                    return t554;
                }
                break;
            case 1833088691:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService")) {
                    T t555 = (T) new DefaultTakoDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService", t555);
                    return t555;
                }
                break;
            case 1836871425:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IAutomaticPageStayTimeService")) {
                    T t556 = (T) new IAutomaticPageStayTimeService.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IAutomaticPageStayTimeService", t556);
                    return t556;
                }
                break;
            case 1855314506:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.debug.perf.IDebugPerformanceService")) {
                    T t557 = (T) new DefaultDebugPerformanceServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.debug.perf.IDebugPerformanceService", t557);
                    return t557;
                }
                break;
            case 1860407217:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEComRouterHandlerInternalService")) {
                    T t558 = (T) new DummyEComRouterHandlerInternalService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEComRouterHandlerInternalService", t558);
                    return t558;
                }
                break;
            case 1861815865:
                if (cls.getName().equals("com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService")) {
                    T t559 = (T) new AITheaterPluginNotInstalledFeatureServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService", t559);
                    return t559;
                }
                break;
            case 1872830664:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.video.IECVideoAnchorSaasService")) {
                    T t560 = (T) new DefaultECVideoAnchorSaasService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.video.IECVideoAnchorSaasService", t560);
                    return t560;
                }
                break;
            case 1880021275:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ugc.rec.reason.debug.tool.IUgcRecReasonDebugToolService")) {
                    T t561 = (T) new DefaultUgcRecReasonDebugToolServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ugc.rec.reason.debug.tool.IUgcRecReasonDebugToolService", t561);
                    return t561;
                }
                break;
            case 1888269503:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.ITouchPointDebugService")) {
                    T t562 = (T) new DefaultTouchPointDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.ITouchPointDebugService", t562);
                    return t562;
                }
                break;
            case 1890308401:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService")) {
                    T t563 = (T) new DummyEcommerceAnchorOuterService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService", t563);
                    return t563;
                }
                break;
            case 1921357213:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.boe.controller.IBoeControllerService")) {
                    T t564 = (T) new DefaultBoeControllerServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.boe.controller.IBoeControllerService", t564);
                    return t564;
                }
                break;
            case 1923706231:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.feed.debug.IFeedInfraOfflineService")) {
                    T t565 = (T) new DefaultFeedInfraOfflineServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.feed.debug.IFeedInfraOfflineService", t565);
                    return t565;
                }
                break;
            case 1924668203:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService")) {
                    T t566 = (T) new DefaultECLiveDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService", t566);
                    return t566;
                }
                break;
            case 1937517514:
                if (cls.getName().equals("com.ss.android.ugc.aweme.experiment.ApplogAllowKeysExp$AppDiffProtocol")) {
                    T t567 = (T) new ApplogAllowKeysExp.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.experiment.ApplogAllowKeysExp$AppDiffProtocol", t567);
                    return t567;
                }
                break;
            case 1939446823:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ug.brand.ITranssonicService")) {
                    T t568 = (T) new TranssonicFakeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ug.brand.ITranssonicService", t568);
                    return t568;
                }
                break;
            case 1940229333:
                if (cls.getName().equals("com.ss.android.ugc.aweme.application.AppTaskProvider")) {
                    T t569 = (T) new DowngradeAppTaskProvider();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.application.AppTaskProvider", t569);
                    return t569;
                }
                break;
            case 1941660821:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.ad.alog.IAdALogService")) {
                    T t570 = (T) new DefaultAdALogServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.ad.alog.IAdALogService", t570);
                    return t570;
                }
                break;
            case 1950625487:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.visual.survey.info.IVisualSurveyInfoService")) {
                    T t571 = (T) new DefaultVisualSurveyInfoServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.visual.survey.info.IVisualSurveyInfoService", t571);
                    return t571;
                }
                break;
            case 1959495426:
                if (cls.getName().equals("com.ss.android.ugc.aweme.utils.ISecUidDependService")) {
                    T t572 = (T) new DefaultSecuidLarkServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.utils.ISecUidDependService", t572);
                    return t572;
                }
                break;
            case 1971621200:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IReportDependencyService")) {
                    T t573 = (T) new DefaultReportDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IReportDependencyService", t573);
                    return t573;
                }
                break;
            case 1975358687:
                if (cls.getName().equals("com.ss.android.ugc.IExternalShareSmartSort")) {
                    T t574 = (T) new DummyExternalShareSmartSort();
                    putStaticDowngradeImplCache("com.ss.android.ugc.IExternalShareSmartSort", t574);
                    return t574;
                }
                break;
            case 1987777294:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.ILaunchAppDiffProtocol")) {
                    T t575 = (T) new ILaunchAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.ILaunchAppDiffProtocol", t575);
                    return t575;
                }
                break;
            case 1991746174:
                if (cls.getName().equals("com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel$AppDiffProtocol")) {
                    T t576 = (T) new SeriesCenterMainPageAssemViewModel.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.SeriesCenterMainPageAssemViewModel$AppDiffProtocol", t576);
                    return t576;
                }
                break;
            case 1993043723:
                if (cls.getName().equals("com.ss.android.ugc.profile.business.ci.SocialActivityAssem$AppDiffProtocol")) {
                    T t577 = (T) new SocialActivityAssem.AppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.profile.business.ci.SocialActivityAssem$AppDiffProtocol", t577);
                    return t577;
                }
                break;
            case 2002923425:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.bleconnectnow.IBleConnectNowService")) {
                    T t578 = (T) new DefaultBleConnectNowServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.bleconnectnow.IBleConnectNowService", t578);
                    return t578;
                }
                break;
            case 2007804865:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.nxroute.INxRouteService")) {
                    T t579 = (T) new DefaultNxRouteServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.nxroute.INxRouteService", t579);
                    return t579;
                }
                break;
            case 2008176327:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.auto.marker.IAutoMarkerService")) {
                    T t580 = (T) new DefaultAutoMarkerServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.auto.marker.IAutoMarkerService", t580);
                    return t580;
                }
                break;
            case 2014617885:
                if (cls.getName().equals("com.bytedance.lynx.hybrid.bridge.IBridgeServiceApi")) {
                    T t581 = (T) new DefaultHybridBridgeImpl();
                    putStaticDowngradeImplCache("com.bytedance.lynx.hybrid.bridge.IBridgeServiceApi", t581);
                    return t581;
                }
                break;
            case 2029341077:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService")) {
                    T t582 = (T) new DefaultApplicationDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService", t582);
                    return t582;
                }
                break;
            case 2031266849:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.compose.debugtool.IComposeDebugtoolService")) {
                    T t583 = (T) new DefaultComposeDebugtoolServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.compose.debugtool.IComposeDebugtoolService", t583);
                    return t583;
                }
                break;
            case 2037829402:
                if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.IQRCodeService")) {
                    T t584 = (T) new QRCodeDowngradeService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.qrcode.IQRCodeService", t584);
                    return t584;
                }
                break;
            case 2046577553:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.ICartCacheService")) {
                    T t585 = (T) new DummyCartCacheServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.ICartCacheService", t585);
                    return t585;
                }
                break;
            case 2049295515:
                if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate")) {
                    T t586 = (T) new CRouterMainDelegateDefaultImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate", t586);
                    return t586;
                }
                break;
            case 2054553589:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.sec.ISecDependencyService")) {
                    T t587 = (T) new DefaultSecDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.sec.ISecDependencyService", t587);
                    return t587;
                }
                break;
            case 2057328860:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.SmartDataCollectorService")) {
                    T t588 = (T) new SmartDataCollectorServiceDefault();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ml.api.SmartDataCollectorService", t588);
                    return t588;
                }
                break;
            case 2058956332:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.pluggable.cla.debug.IClaDebugService")) {
                    T t589 = (T) new DefaultClaDebugServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.pluggable.cla.debug.IClaDebugService", t589);
                    return t589;
                }
                break;
            case 2062143298:
                if (cls.getName().equals("com.bytedance.touchpoint.api.service.IInteractiveService")) {
                    T t590 = (T) new DowngradeInteractiveServiceImpl();
                    putStaticDowngradeImplCache("com.bytedance.touchpoint.api.service.IInteractiveService", t590);
                    return t590;
                }
                break;
            case 2069562223:
                if (cls.getName().equals("com.ss.android.ugc.aweme.IPrepareVideoCaptionUtil")) {
                    T t591 = (T) new DefaultPrepareVideoCaptionUtilImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.IPrepareVideoCaptionUtil", t591);
                    return t591;
                }
                break;
            case 2070630994:
                if (cls.getName().equals("com.ss.android.ugc.xtrace.IXtrace")) {
                    T t592 = (T) new XtraceDummy();
                    putStaticDowngradeImplCache("com.ss.android.ugc.xtrace.IXtrace", t592);
                    return t592;
                }
                break;
            case 2077041532:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService")) {
                    T t593 = (T) new DummyECommerceVideoService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService", t593);
                    return t593;
                }
                break;
            case 2082080802:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.IDogfoodFeedbackService")) {
                    T t594 = (T) new DefaultDogfoodFeedbackServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.IDogfoodFeedbackService", t594);
                    return t594;
                }
                break;
            case 2088590134:
                if (cls.getName().equals("com.bytedance.ies.ugc.aweme.rich.impression.api.edge2edge.Edge2EdgeApi")) {
                    T t595 = (T) new DowngradeEdge2EdgeApi();
                    putStaticDowngradeImplCache("com.bytedance.ies.ugc.aweme.rich.impression.api.edge2edge.Edge2EdgeApi", t595);
                    return t595;
                }
                break;
            case 2121897853:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService")) {
                    T t596 = (T) new DummyECommerceArchService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService", t596);
                    return t596;
                }
                break;
            case 2124245038:
                if (cls.getName().equals("com.ss.android.ugc.aweme.appdiff.IAccountAppDiffProtocol")) {
                    T t597 = (T) new IAccountAppDiffProtocol.DowngradeInstance();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.appdiff.IAccountAppDiffProtocol", t597);
                    return t597;
                }
                break;
            case 2129069351:
                if (cls.getName().equals("com.ss.android.ugc.aweme.offline.iaptooling.IIAPToolingService")) {
                    T t598 = (T) new DefaultIAPToolingServiceImpl();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.offline.iaptooling.IIAPToolingService", t598);
                    return t598;
                }
                break;
            case 2134917781:
                if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService")) {
                    T t599 = (T) new DefaultLocationDependencyService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService", t599);
                    return t599;
                }
                break;
            case 2138809977:
                if (cls.getName().equals("com.ss.android.ugc.aweme.websocket.api.service.IWsServiceProvider")) {
                    T t600 = (T) new WsServiceProvider();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.websocket.api.service.IWsServiceProvider", t600);
                    return t600;
                }
                break;
            case 2139474609:
                if (cls.getName().equals("com.ss.android.ugc.aweme.service.MiniDramaTouchPointService")) {
                    T t601 = (T) new DefaultMiniDramaTouchPointService();
                    putStaticDowngradeImplCache("com.ss.android.ugc.aweme.service.MiniDramaTouchPointService", t601);
                    return t601;
                }
                break;
        }
        this.staticDowngradeNotExistSet.add(cls.getName());
        return null;
    }

    public static DowngradeImplManager getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    public void downgradeComponent(String str) {
        if (!TextUtils.isEmpty(str) && !this.downgradeComponents.contains(str)) {
            this.downgradeComponents.add(str);
        }
    }

    public <T> T getDowngradeImpl(Class<T> cls) {
        String name = cls.getName();
        ServiceProvider serviceProvider = this.downgradeImplMap.get(name);
        if (serviceProvider != null) {
            return (T) serviceProvider.get();
        }
        T t = (T) this.staticDowngradeImplCache.get(name);
        if (t == null && !this.staticDowngradeNotExistSet.contains(name)) {
            return (T) getStaticDowngradeImpl(cls);
        }
        return t;
    }

    public boolean isServiceForceDowngrade(Class cls) {
        String str = this.componentsMap.get(cls.getName());
        if (!TextUtils.isEmpty(str)) {
            return this.downgradeComponents.contains(str);
        }
        return false;
    }

    private void addServiceComponent(String str, String str2) {
        this.componentsMap.put(str, str2);
    }

    private void putStaticDowngradeImplCache(String str, Object obj) {
        this.staticDowngradeImplCache.put(str, obj);
    }

    public <T> void bindDowngradeImpl(Class<T> cls, ServiceProvider<T> serviceProvider) {
        this.downgradeImplMap.put(cls.getName(), serviceProvider);
    }
}
