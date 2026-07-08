package com.ss.android.ugc.aweme.ecommerce.saas.core;

import X.AnonymousClass0317;
import X.InterfaceC1079104Jx;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.DefaultBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.DefaultDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.DefaultGuestModeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IGuestModeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.DefaultActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.DefaultAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.DefaultAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.DefaultApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.DefaultApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.DefaultAppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.DefaultAwemeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.IAwemeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.DefaultAwemeMainDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.IAwemeMainDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.buildconfigdiff.IBuildConfigDiffDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.DefaultCommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.DefaultCommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.DefaultCommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.DefaultComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.DefaultReportDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.DefaultTpcConsentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IReportDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.ITpcConsentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.DefaultCreativePageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.deeplink.DefaultDeeplinkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.deeplink.IDeeplinkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.DefaultDetailFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.DefaultPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.DefaultSeaPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IDetailFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.ISeaPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.DefaultECLiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.DefaultECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.DefaultEcMallUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.DefaultVideoDetailLoadDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IEcMallUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IVideoDetailLoadDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.DefaultEcomSearchDependency;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultECDiversionDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultECUgPayToMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultECUgPdpPageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultEcUgBackButtonDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultEcUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultEcUgPopupDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.DefaultMallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECDiversionDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPdpPageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.DefaultLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.DefaultFriendDependencyServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.homepage.DefaultHomepageTabDependencyServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.homepage.IHomepageTabDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.DefaultHybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.DefaultLauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.DefaultLegacyDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.ILegacyDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.DefaultLiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.DefaultLiveTTDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveTTDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.DefaultLocalTestDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.DefaultPipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.DefaultLocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.DefaultPoiMapDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.IPoiMapDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.DefaultECNetControllerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.DefaultNetworkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.DefaultNetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.IECNetControllerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.DefaultNoticeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.offline.DefaultOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.offline.IOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.DefaultBootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.DefaultPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IBootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.pitaya.DefaultPitayaDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.pitaya.IPitayaDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.DefaultPlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.DefaultSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.sec.DefaultSecDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.sec.ISecDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.DefaultShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.storage.DefaultTabDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.storage.IStorageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.tab.ITabDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.transaction.DefaultPdpDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.transaction.ISeaPdpDependencyService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class EComHostServiceDefault implements InterfaceC1079104Jx {
    public IAccountDependencyService accountDependencyService;
    public IActivityStackDependencyService activityStackDependencyService;
    public IAdDependencyService adDependencyService;
    public IAnchorDependencyService anchorDependencyService;
    public IApmDependencyService apmDependencyService;
    public IAppSettingDependencyService appSettingDependencyService;
    public IApplicationDependencyService applicationDependencyService;
    public IAwemeDependencyService awemeDependencyService;
    public IAwemeMainDependencyService awemeMainDependencyService;
    public IBootLogDependencyService bootLogDependencyService;
    public IBuildConfigDiffDependencyService buildConfigDiffDependencyService;
    public IBusinessDependencyService businessDependencyService;
    public ICommentDependencyService commentDependencyService;
    public ICommonFeedDependService commonFeedDependService;
    public ICommonUtilsDependencyService commonUtilsDependencyService;
    public IComplianceDependencyService complianceDependencyService;
    public ICreativePageDependencyService creativePageDependencyService;
    public IDeeplinkDependencyService deeplinkDependencyService;
    public IDetailFeedDependencyService detailFeedDependencyService;
    public IECDiversionDependencyService eCDiversionDependencyService;
    public IECLiveDependencyService eCLiveDependencyService;
    public IECNetControllerDependencyService eCNetControllerDependencyService;
    public IECUgPayToMallDependencyService eCUgPayToMallDependencyService;
    public IECUgPdpPageDependencyService eCUgPdpPageDependencyService;
    public IECommerceMallDependencyService eCommerceMallDependencyService;
    public IEcMallUgDependencyService ecMallUgDependencyService;
    public IEcUgBackButtonDependencyService ecUgBackButtonDependencyService;
    public IEcUgDependencyService ecUgDependencyService;
    public IEcUgPopupDependencyService ecUgPopupDependencyService;
    public IEcomSearchDependencyService ecomSearchDependencyService;
    public IFriendDependencyService friendDependencyService;
    public IGuestModeDependencyService guestModeDependencyService;
    public IHomepageTabDependencyService homepageTabDependencyService;
    public IHybridDependencyService hybridDependencyService;
    public ILauncherDependencyService launcherDependencyService;
    public ILegacyDependencyService legacyDependencyService;
    public ILiveDependencyService liveDependencyService;
    public ILiveTTDependencyService liveTTDependencyService;
    public ILocalTestDependencyService localTestDependencyService;
    public ILocationDependencyService locationDependencyService;
    public ILogDependencyService logDependencyService;
    public IMallLandingPerfTrackerDependencyService mallLandingPerfTrackerDependencyService;
    public INetworkDependencyService networkDependencyService;
    public INetworkUtilDependencyService networkUtilDependencyService;
    public INoticeDependencyService noticeDependencyService;
    public IOfflineDependencyService offlineDependencyService;
    public IPdpCreatorVideoFeedDependencyService pdpCreatorVideoFeedDependencyService;
    public IPerformanceOptDependencyService performanceOptDependencyService;
    public IPipoOfflineDependencyService pipoOfflineDependencyService;
    public IPitayaDependencyService pitayaDependencyService;
    public IPlayerDependencyService playerDependencyService;
    public IPoiMapDependencyService poiMapDependencyService;
    public IReportDependencyService reportDependencyService;
    public ISeaPdpCreatorVideoFeedDependencyService seaPdpCreatorVideoFeedDependencyService;
    public ISeaPdpDependencyService seaPdpDependencyService;
    public ISearchDependencyService searchDependencyService;
    public ISecDependencyService secDependencyService;
    public final Class<?>[] serviceTypes = {IBusinessDependencyService.class, IAccountDependencyService.class, IGuestModeDependencyService.class, IActivityStackDependencyService.class, IAdDependencyService.class, IAnchorDependencyService.class, IApmDependencyService.class, IApplicationDependencyService.class, IAppSettingDependencyService.class, IAwemeDependencyService.class, IAwemeMainDependencyService.class, IBuildConfigDiffDependencyService.class, ICommentDependencyService.class, ICommonFeedDependService.class, ICommonUtilsDependencyService.class, IComplianceDependencyService.class, IReportDependencyService.class, ITpcConsentDependencyService.class, ICreativePageDependencyService.class, IDeeplinkDependencyService.class, IDetailFeedDependencyService.class, IPdpCreatorVideoFeedDependencyService.class, ISeaPdpCreatorVideoFeedDependencyService.class, IECLiveDependencyService.class, IECommerceMallDependencyService.class, IEcMallUgDependencyService.class, IVideoDetailLoadDependencyService.class, IEcomSearchDependencyService.class, IECDiversionDependencyService.class, IECUgPayToMallDependencyService.class, IECUgPdpPageDependencyService.class, IEcUgBackButtonDependencyService.class, IEcUgDependencyService.class, IEcUgPopupDependencyService.class, IMallLandingPerfTrackerDependencyService.class, ILogDependencyService.class, IFriendDependencyService.class, IHomepageTabDependencyService.class, IHybridDependencyService.class, ILauncherDependencyService.class, ILegacyDependencyService.class, ILiveDependencyService.class, ILiveTTDependencyService.class, ILocalTestDependencyService.class, IPipoOfflineDependencyService.class, ILocationDependencyService.class, IPoiMapDependencyService.class, IECNetControllerDependencyService.class, INetworkDependencyService.class, INetworkUtilDependencyService.class, INoticeDependencyService.class, IOfflineDependencyService.class, IBootLogDependencyService.class, IPerformanceOptDependencyService.class, IPitayaDependencyService.class, IPlayerDependencyService.class, ISearchDependencyService.class, ISecDependencyService.class, IShareDependencyService.class, IStorageDependencyService.class, ITabDependencyService.class, ISeaPdpDependencyService.class};
    public IShareDependencyService shareDependencyService;
    public IStorageDependencyService storageDependencyService;
    public ITabDependencyService tabDependencyService;
    public ITpcConsentDependencyService tpcConsentDependencyService;
    public IVideoDetailLoadDependencyService videoDetailLoadDependencyService;

    private final int getServiceType(Class<?> cls) {
        int length = this.serviceTypes.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.LJFF(cls, this.serviceTypes[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC1079104Jx
    public <T extends AnonymousClass0317> T getService(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        switch (getServiceType(cls)) {
            case 0:
                if (this.businessDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.businessDependencyService == null) {
                                DefaultBusinessDependencyService defaultBusinessDependencyService = new DefaultBusinessDependencyService();
                                defaultBusinessDependencyService.initService();
                                this.businessDependencyService = defaultBusinessDependencyService;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IBusinessDependencyService iBusinessDependencyService = this.businessDependencyService;
                if (!(iBusinessDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iBusinessDependencyService;
            case 1:
                if (this.accountDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.accountDependencyService == null) {
                                DefaultDependencyService defaultDependencyService = new DefaultDependencyService();
                                defaultDependencyService.initService();
                                this.accountDependencyService = defaultDependencyService;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                IAccountDependencyService iAccountDependencyService = this.accountDependencyService;
                if (!(iAccountDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAccountDependencyService;
            case 2:
                if (this.guestModeDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.guestModeDependencyService == null) {
                                DefaultGuestModeDependencyService defaultGuestModeDependencyService = new DefaultGuestModeDependencyService();
                                defaultGuestModeDependencyService.initService();
                                this.guestModeDependencyService = defaultGuestModeDependencyService;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                IGuestModeDependencyService iGuestModeDependencyService = this.guestModeDependencyService;
                if (!(iGuestModeDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iGuestModeDependencyService;
            case 3:
                if (this.activityStackDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.activityStackDependencyService == null) {
                                DefaultActivityStackDependencyService defaultActivityStackDependencyService = new DefaultActivityStackDependencyService();
                                defaultActivityStackDependencyService.initService();
                                this.activityStackDependencyService = defaultActivityStackDependencyService;
                            }
                        } catch (Throwable th22) {
                            throw th22;
                        }
                        break;
                    }
                }
                IActivityStackDependencyService iActivityStackDependencyService = this.activityStackDependencyService;
                if (!(iActivityStackDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iActivityStackDependencyService;
            case 4:
                if (this.adDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.adDependencyService == null) {
                                DefaultAdDependencyService defaultAdDependencyService = new DefaultAdDependencyService();
                                defaultAdDependencyService.initService();
                                this.adDependencyService = defaultAdDependencyService;
                            }
                        } catch (Throwable th222) {
                            throw th222;
                        }
                        break;
                    }
                }
                IAdDependencyService iAdDependencyService = this.adDependencyService;
                if (!(iAdDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAdDependencyService;
            case 5:
                if (this.anchorDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.anchorDependencyService == null) {
                                DefaultAnchorDependencyService defaultAnchorDependencyService = new DefaultAnchorDependencyService();
                                defaultAnchorDependencyService.initService();
                                this.anchorDependencyService = defaultAnchorDependencyService;
                            }
                        } catch (Throwable th2222) {
                            throw th2222;
                        }
                        break;
                    }
                }
                IAnchorDependencyService iAnchorDependencyService = this.anchorDependencyService;
                if (!(iAnchorDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAnchorDependencyService;
            case 6:
                if (this.apmDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.apmDependencyService == null) {
                                DefaultApmDependencyService defaultApmDependencyService = new DefaultApmDependencyService();
                                defaultApmDependencyService.initService();
                                this.apmDependencyService = defaultApmDependencyService;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IApmDependencyService iApmDependencyService = this.apmDependencyService;
                if (!(iApmDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iApmDependencyService;
            case 7:
                if (this.applicationDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.applicationDependencyService == null) {
                                DefaultApplicationDependencyService defaultApplicationDependencyService = new DefaultApplicationDependencyService();
                                defaultApplicationDependencyService.initService();
                                this.applicationDependencyService = defaultApplicationDependencyService;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IApplicationDependencyService iApplicationDependencyService = this.applicationDependencyService;
                if (!(iApplicationDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iApplicationDependencyService;
            case 8:
                if (this.appSettingDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.appSettingDependencyService == null) {
                                DefaultAppSettingDependencyService defaultAppSettingDependencyService = new DefaultAppSettingDependencyService();
                                defaultAppSettingDependencyService.initService();
                                this.appSettingDependencyService = defaultAppSettingDependencyService;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IAppSettingDependencyService iAppSettingDependencyService = this.appSettingDependencyService;
                if (!(iAppSettingDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAppSettingDependencyService;
            case BdTuring.TYPE_ECAF /* 9 */:
                if (this.awemeDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.awemeDependencyService == null) {
                                DefaultAwemeDependencyService defaultAwemeDependencyService = new DefaultAwemeDependencyService();
                                defaultAwemeDependencyService.initService();
                                this.awemeDependencyService = defaultAwemeDependencyService;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IAwemeDependencyService iAwemeDependencyService = this.awemeDependencyService;
                if (!(iAwemeDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAwemeDependencyService;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (this.awemeMainDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.awemeMainDependencyService == null) {
                                DefaultAwemeMainDependencyService defaultAwemeMainDependencyService = new DefaultAwemeMainDependencyService();
                                defaultAwemeMainDependencyService.initService();
                                this.awemeMainDependencyService = defaultAwemeMainDependencyService;
                            }
                        } catch (Throwable th22222) {
                            throw th22222;
                        }
                        break;
                    }
                }
                IAwemeMainDependencyService iAwemeMainDependencyService = this.awemeMainDependencyService;
                if (!(iAwemeMainDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAwemeMainDependencyService;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (this.buildConfigDiffDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.buildConfigDiffDependencyService == null) {
                                com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.buildconfigdiff.DefaultAwemeDependencyService defaultAwemeDependencyService2 = new com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.buildconfigdiff.DefaultAwemeDependencyService();
                                defaultAwemeDependencyService2.initService();
                                this.buildConfigDiffDependencyService = defaultAwemeDependencyService2;
                            }
                        } catch (Throwable th222222) {
                            throw th222222;
                        }
                        break;
                    }
                }
                IBuildConfigDiffDependencyService iBuildConfigDiffDependencyService = this.buildConfigDiffDependencyService;
                if (!(iBuildConfigDiffDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iBuildConfigDiffDependencyService;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if (this.commentDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.commentDependencyService == null) {
                                DefaultCommentDependencyService defaultCommentDependencyService = new DefaultCommentDependencyService();
                                defaultCommentDependencyService.initService();
                                this.commentDependencyService = defaultCommentDependencyService;
                            }
                        } catch (Throwable th2222222) {
                            throw th2222222;
                        }
                        break;
                    }
                }
                ICommentDependencyService iCommentDependencyService = this.commentDependencyService;
                if (!(iCommentDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iCommentDependencyService;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                if (this.commonFeedDependService == null) {
                    synchronized (cls) {
                        try {
                            if (this.commonFeedDependService == null) {
                                DefaultCommonFeedDependService defaultCommonFeedDependService = new DefaultCommonFeedDependService();
                                defaultCommonFeedDependService.initService();
                                this.commonFeedDependService = defaultCommonFeedDependService;
                            }
                        } catch (Throwable th22222222) {
                            throw th22222222;
                        }
                        break;
                    }
                }
                ICommonFeedDependService iCommonFeedDependService = this.commonFeedDependService;
                if (!(iCommonFeedDependService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iCommonFeedDependService;
            case 14:
                if (this.commonUtilsDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.commonUtilsDependencyService == null) {
                                DefaultCommonUtilsDependencyService defaultCommonUtilsDependencyService = new DefaultCommonUtilsDependencyService();
                                defaultCommonUtilsDependencyService.initService();
                                this.commonUtilsDependencyService = defaultCommonUtilsDependencyService;
                            }
                        } catch (Throwable th222222222) {
                            throw th222222222;
                        }
                        break;
                    }
                }
                ICommonUtilsDependencyService iCommonUtilsDependencyService = this.commonUtilsDependencyService;
                if (!(iCommonUtilsDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iCommonUtilsDependencyService;
            case 15:
                if (this.complianceDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.complianceDependencyService == null) {
                                DefaultComplianceDependencyService defaultComplianceDependencyService = new DefaultComplianceDependencyService();
                                defaultComplianceDependencyService.initService();
                                this.complianceDependencyService = defaultComplianceDependencyService;
                            }
                        } catch (Throwable th2222222222) {
                            throw th2222222222;
                        }
                        break;
                    }
                }
                IComplianceDependencyService iComplianceDependencyService = this.complianceDependencyService;
                if (!(iComplianceDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iComplianceDependencyService;
            case 16:
                if (this.reportDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.reportDependencyService == null) {
                                DefaultReportDependencyService defaultReportDependencyService = new DefaultReportDependencyService();
                                defaultReportDependencyService.initService();
                                this.reportDependencyService = defaultReportDependencyService;
                            }
                        } catch (Throwable th22222222222) {
                            throw th22222222222;
                        }
                        break;
                    }
                }
                IReportDependencyService iReportDependencyService = this.reportDependencyService;
                if (!(iReportDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iReportDependencyService;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                if (this.tpcConsentDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.tpcConsentDependencyService == null) {
                                DefaultTpcConsentDependencyService defaultTpcConsentDependencyService = new DefaultTpcConsentDependencyService();
                                defaultTpcConsentDependencyService.initService();
                                this.tpcConsentDependencyService = defaultTpcConsentDependencyService;
                            }
                        } catch (Throwable th222222222222) {
                            throw th222222222222;
                        }
                        break;
                    }
                }
                ITpcConsentDependencyService iTpcConsentDependencyService = this.tpcConsentDependencyService;
                if (!(iTpcConsentDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iTpcConsentDependencyService;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                if (this.creativePageDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.creativePageDependencyService == null) {
                                DefaultCreativePageDependencyService defaultCreativePageDependencyService = new DefaultCreativePageDependencyService();
                                defaultCreativePageDependencyService.initService();
                                this.creativePageDependencyService = defaultCreativePageDependencyService;
                            }
                        } catch (Throwable th2222222222222) {
                            throw th2222222222222;
                        }
                        break;
                    }
                }
                ICreativePageDependencyService iCreativePageDependencyService = this.creativePageDependencyService;
                if (!(iCreativePageDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iCreativePageDependencyService;
            case 19:
                if (this.deeplinkDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.deeplinkDependencyService == null) {
                                DefaultDeeplinkDependencyService defaultDeeplinkDependencyService = new DefaultDeeplinkDependencyService();
                                defaultDeeplinkDependencyService.initService();
                                this.deeplinkDependencyService = defaultDeeplinkDependencyService;
                            }
                        } catch (Throwable th22222222222222) {
                            throw th22222222222222;
                        }
                        break;
                    }
                }
                IDeeplinkDependencyService iDeeplinkDependencyService = this.deeplinkDependencyService;
                if (!(iDeeplinkDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iDeeplinkDependencyService;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                if (this.detailFeedDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.detailFeedDependencyService == null) {
                                DefaultDetailFeedDependencyService defaultDetailFeedDependencyService = new DefaultDetailFeedDependencyService();
                                defaultDetailFeedDependencyService.initService();
                                this.detailFeedDependencyService = defaultDetailFeedDependencyService;
                            }
                        } catch (Throwable th222222222222222) {
                            throw th222222222222222;
                        }
                        break;
                    }
                }
                IDetailFeedDependencyService iDetailFeedDependencyService = this.detailFeedDependencyService;
                if (!(iDetailFeedDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iDetailFeedDependencyService;
            case 21:
                if (this.pdpCreatorVideoFeedDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.pdpCreatorVideoFeedDependencyService == null) {
                                DefaultPdpCreatorVideoFeedDependencyService defaultPdpCreatorVideoFeedDependencyService = new DefaultPdpCreatorVideoFeedDependencyService();
                                defaultPdpCreatorVideoFeedDependencyService.initService();
                                this.pdpCreatorVideoFeedDependencyService = defaultPdpCreatorVideoFeedDependencyService;
                            }
                        } catch (Throwable th2222222222222222) {
                            throw th2222222222222222;
                        }
                        break;
                    }
                }
                IPdpCreatorVideoFeedDependencyService iPdpCreatorVideoFeedDependencyService = this.pdpCreatorVideoFeedDependencyService;
                if (!(iPdpCreatorVideoFeedDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPdpCreatorVideoFeedDependencyService;
            case 22:
                if (this.seaPdpCreatorVideoFeedDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.seaPdpCreatorVideoFeedDependencyService == null) {
                                DefaultSeaPdpCreatorVideoFeedDependencyService defaultSeaPdpCreatorVideoFeedDependencyService = new DefaultSeaPdpCreatorVideoFeedDependencyService();
                                defaultSeaPdpCreatorVideoFeedDependencyService.initService();
                                this.seaPdpCreatorVideoFeedDependencyService = defaultSeaPdpCreatorVideoFeedDependencyService;
                            }
                        } catch (Throwable th22222222222222222) {
                            throw th22222222222222222;
                        }
                        break;
                    }
                }
                ISeaPdpCreatorVideoFeedDependencyService iSeaPdpCreatorVideoFeedDependencyService = this.seaPdpCreatorVideoFeedDependencyService;
                if (!(iSeaPdpCreatorVideoFeedDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iSeaPdpCreatorVideoFeedDependencyService;
            case 23:
                if (this.eCLiveDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCLiveDependencyService == null) {
                                DefaultECLiveDependencyService defaultECLiveDependencyService = new DefaultECLiveDependencyService();
                                defaultECLiveDependencyService.initService();
                                this.eCLiveDependencyService = defaultECLiveDependencyService;
                            }
                        } catch (Throwable th222222222222222222) {
                            throw th222222222222222222;
                        }
                        break;
                    }
                }
                IECLiveDependencyService iECLiveDependencyService = this.eCLiveDependencyService;
                if (!(iECLiveDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECLiveDependencyService;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                if (this.eCommerceMallDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCommerceMallDependencyService == null) {
                                DefaultECommerceMallDependencyService defaultECommerceMallDependencyService = new DefaultECommerceMallDependencyService();
                                defaultECommerceMallDependencyService.initService();
                                this.eCommerceMallDependencyService = defaultECommerceMallDependencyService;
                            }
                        } catch (Throwable th2222222222222222222) {
                            throw th2222222222222222222;
                        }
                        break;
                    }
                }
                IECommerceMallDependencyService iECommerceMallDependencyService = this.eCommerceMallDependencyService;
                if (!(iECommerceMallDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECommerceMallDependencyService;
            case 25:
                if (this.ecMallUgDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ecMallUgDependencyService == null) {
                                DefaultEcMallUgDependencyService defaultEcMallUgDependencyService = new DefaultEcMallUgDependencyService();
                                defaultEcMallUgDependencyService.initService();
                                this.ecMallUgDependencyService = defaultEcMallUgDependencyService;
                            }
                        } catch (Throwable th22222222222222222222) {
                            throw th22222222222222222222;
                        }
                        break;
                    }
                }
                IEcMallUgDependencyService iEcMallUgDependencyService = this.ecMallUgDependencyService;
                if (!(iEcMallUgDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iEcMallUgDependencyService;
            case 26:
                if (this.videoDetailLoadDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.videoDetailLoadDependencyService == null) {
                                DefaultVideoDetailLoadDependencyService defaultVideoDetailLoadDependencyService = new DefaultVideoDetailLoadDependencyService();
                                defaultVideoDetailLoadDependencyService.initService();
                                this.videoDetailLoadDependencyService = defaultVideoDetailLoadDependencyService;
                            }
                        } catch (Throwable th222222222222222222222) {
                            throw th222222222222222222222;
                        }
                        break;
                    }
                }
                IVideoDetailLoadDependencyService iVideoDetailLoadDependencyService = this.videoDetailLoadDependencyService;
                if (!(iVideoDetailLoadDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iVideoDetailLoadDependencyService;
            case 27:
                if (this.ecomSearchDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ecomSearchDependencyService == null) {
                                DefaultEcomSearchDependency defaultEcomSearchDependency = new DefaultEcomSearchDependency();
                                defaultEcomSearchDependency.initService();
                                this.ecomSearchDependencyService = defaultEcomSearchDependency;
                            }
                        } catch (Throwable th2222222222222222222222) {
                            throw th2222222222222222222222;
                        }
                        break;
                    }
                }
                IEcomSearchDependencyService iEcomSearchDependencyService = this.ecomSearchDependencyService;
                if (!(iEcomSearchDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iEcomSearchDependencyService;
            case 28:
                if (this.eCDiversionDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCDiversionDependencyService == null) {
                                DefaultECDiversionDependencyService defaultECDiversionDependencyService = new DefaultECDiversionDependencyService();
                                defaultECDiversionDependencyService.initService();
                                this.eCDiversionDependencyService = defaultECDiversionDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222) {
                            throw th22222222222222222222222;
                        }
                        break;
                    }
                }
                IECDiversionDependencyService iECDiversionDependencyService = this.eCDiversionDependencyService;
                if (!(iECDiversionDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECDiversionDependencyService;
            case 29:
                if (this.eCUgPayToMallDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCUgPayToMallDependencyService == null) {
                                DefaultECUgPayToMallDependencyService defaultECUgPayToMallDependencyService = new DefaultECUgPayToMallDependencyService();
                                defaultECUgPayToMallDependencyService.initService();
                                this.eCUgPayToMallDependencyService = defaultECUgPayToMallDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222) {
                            throw th222222222222222222222222;
                        }
                        break;
                    }
                }
                IECUgPayToMallDependencyService iECUgPayToMallDependencyService = this.eCUgPayToMallDependencyService;
                if (!(iECUgPayToMallDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECUgPayToMallDependencyService;
            case 30:
                if (this.eCUgPdpPageDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCUgPdpPageDependencyService == null) {
                                DefaultECUgPdpPageDependencyService defaultECUgPdpPageDependencyService = new DefaultECUgPdpPageDependencyService();
                                defaultECUgPdpPageDependencyService.initService();
                                this.eCUgPdpPageDependencyService = defaultECUgPdpPageDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222) {
                            throw th2222222222222222222222222;
                        }
                        break;
                    }
                }
                IECUgPdpPageDependencyService iECUgPdpPageDependencyService = this.eCUgPdpPageDependencyService;
                if (!(iECUgPdpPageDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECUgPdpPageDependencyService;
            case 31:
                if (this.ecUgBackButtonDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ecUgBackButtonDependencyService == null) {
                                DefaultEcUgBackButtonDependencyService defaultEcUgBackButtonDependencyService = new DefaultEcUgBackButtonDependencyService();
                                defaultEcUgBackButtonDependencyService.initService();
                                this.ecUgBackButtonDependencyService = defaultEcUgBackButtonDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222) {
                            throw th22222222222222222222222222;
                        }
                        break;
                    }
                }
                IEcUgBackButtonDependencyService iEcUgBackButtonDependencyService = this.ecUgBackButtonDependencyService;
                if (!(iEcUgBackButtonDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iEcUgBackButtonDependencyService;
            case 32:
                if (this.ecUgDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ecUgDependencyService == null) {
                                DefaultEcUgDependencyService defaultEcUgDependencyService = new DefaultEcUgDependencyService();
                                defaultEcUgDependencyService.initService();
                                this.ecUgDependencyService = defaultEcUgDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222) {
                            throw th222222222222222222222222222;
                        }
                        break;
                    }
                }
                IEcUgDependencyService iEcUgDependencyService = this.ecUgDependencyService;
                if (!(iEcUgDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iEcUgDependencyService;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                if (this.ecUgPopupDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ecUgPopupDependencyService == null) {
                                DefaultEcUgPopupDependencyService defaultEcUgPopupDependencyService = new DefaultEcUgPopupDependencyService();
                                defaultEcUgPopupDependencyService.initService();
                                this.ecUgPopupDependencyService = defaultEcUgPopupDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222) {
                            throw th2222222222222222222222222222;
                        }
                        break;
                    }
                }
                IEcUgPopupDependencyService iEcUgPopupDependencyService = this.ecUgPopupDependencyService;
                if (!(iEcUgPopupDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iEcUgPopupDependencyService;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                if (this.mallLandingPerfTrackerDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.mallLandingPerfTrackerDependencyService == null) {
                                DefaultMallLandingPerfTrackerDependencyService defaultMallLandingPerfTrackerDependencyService = new DefaultMallLandingPerfTrackerDependencyService();
                                defaultMallLandingPerfTrackerDependencyService.initService();
                                this.mallLandingPerfTrackerDependencyService = defaultMallLandingPerfTrackerDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222) {
                            throw th22222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMallLandingPerfTrackerDependencyService iMallLandingPerfTrackerDependencyService = this.mallLandingPerfTrackerDependencyService;
                if (!(iMallLandingPerfTrackerDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iMallLandingPerfTrackerDependencyService;
            case 35:
                if (this.logDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.logDependencyService == null) {
                                DefaultLogDependencyService defaultLogDependencyService = new DefaultLogDependencyService();
                                defaultLogDependencyService.initService();
                                this.logDependencyService = defaultLogDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222) {
                            throw th222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILogDependencyService iLogDependencyService = this.logDependencyService;
                if (!(iLogDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLogDependencyService;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                if (this.friendDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.friendDependencyService == null) {
                                DefaultFriendDependencyServiceImpl defaultFriendDependencyServiceImpl = new DefaultFriendDependencyServiceImpl();
                                defaultFriendDependencyServiceImpl.initService();
                                this.friendDependencyService = defaultFriendDependencyServiceImpl;
                            }
                        } catch (Throwable th2222222222222222222222222222222) {
                            throw th2222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IFriendDependencyService iFriendDependencyService = this.friendDependencyService;
                if (!(iFriendDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iFriendDependencyService;
            case 37:
                if (this.homepageTabDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.homepageTabDependencyService == null) {
                                DefaultHomepageTabDependencyServiceImpl defaultHomepageTabDependencyServiceImpl = new DefaultHomepageTabDependencyServiceImpl();
                                defaultHomepageTabDependencyServiceImpl.initService();
                                this.homepageTabDependencyService = defaultHomepageTabDependencyServiceImpl;
                            }
                        } catch (Throwable th22222222222222222222222222222222) {
                            throw th22222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHomepageTabDependencyService iHomepageTabDependencyService = this.homepageTabDependencyService;
                if (!(iHomepageTabDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iHomepageTabDependencyService;
            case 38:
                if (this.hybridDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hybridDependencyService == null) {
                                DefaultHybridDependencyService defaultHybridDependencyService = new DefaultHybridDependencyService();
                                defaultHybridDependencyService.initService();
                                this.hybridDependencyService = defaultHybridDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHybridDependencyService iHybridDependencyService = this.hybridDependencyService;
                if (!(iHybridDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iHybridDependencyService;
            case 39:
                if (this.launcherDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.launcherDependencyService == null) {
                                DefaultLauncherDependencyService defaultLauncherDependencyService = new DefaultLauncherDependencyService();
                                defaultLauncherDependencyService.initService();
                                this.launcherDependencyService = defaultLauncherDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILauncherDependencyService iLauncherDependencyService = this.launcherDependencyService;
                if (!(iLauncherDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLauncherDependencyService;
            case 40:
                if (this.legacyDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.legacyDependencyService == null) {
                                DefaultLegacyDependencyService defaultLegacyDependencyService = new DefaultLegacyDependencyService();
                                defaultLegacyDependencyService.initService();
                                this.legacyDependencyService = defaultLegacyDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILegacyDependencyService iLegacyDependencyService = this.legacyDependencyService;
                if (!(iLegacyDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLegacyDependencyService;
            case 41:
                if (this.liveDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveDependencyService == null) {
                                DefaultLiveDependencyService defaultLiveDependencyService = new DefaultLiveDependencyService();
                                defaultLiveDependencyService.initService();
                                this.liveDependencyService = defaultLiveDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveDependencyService iLiveDependencyService = this.liveDependencyService;
                if (!(iLiveDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLiveDependencyService;
            case 42:
                if (this.liveTTDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveTTDependencyService == null) {
                                DefaultLiveTTDependencyService defaultLiveTTDependencyService = new DefaultLiveTTDependencyService();
                                defaultLiveTTDependencyService.initService();
                                this.liveTTDependencyService = defaultLiveTTDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveTTDependencyService iLiveTTDependencyService = this.liveTTDependencyService;
                if (!(iLiveTTDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLiveTTDependencyService;
            case 43:
                if (this.localTestDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.localTestDependencyService == null) {
                                DefaultLocalTestDependencyService defaultLocalTestDependencyService = new DefaultLocalTestDependencyService();
                                defaultLocalTestDependencyService.initService();
                                this.localTestDependencyService = defaultLocalTestDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILocalTestDependencyService iLocalTestDependencyService = this.localTestDependencyService;
                if (!(iLocalTestDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLocalTestDependencyService;
            case 44:
                if (this.pipoOfflineDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.pipoOfflineDependencyService == null) {
                                DefaultPipoOfflineDependencyService defaultPipoOfflineDependencyService = new DefaultPipoOfflineDependencyService();
                                defaultPipoOfflineDependencyService.initService();
                                this.pipoOfflineDependencyService = defaultPipoOfflineDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPipoOfflineDependencyService iPipoOfflineDependencyService = this.pipoOfflineDependencyService;
                if (!(iPipoOfflineDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPipoOfflineDependencyService;
            case 45:
                if (this.locationDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.locationDependencyService == null) {
                                DefaultLocationDependencyService defaultLocationDependencyService = new DefaultLocationDependencyService();
                                defaultLocationDependencyService.initService();
                                this.locationDependencyService = defaultLocationDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILocationDependencyService iLocationDependencyService = this.locationDependencyService;
                if (!(iLocationDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLocationDependencyService;
            case 46:
                if (this.poiMapDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.poiMapDependencyService == null) {
                                DefaultPoiMapDependencyService defaultPoiMapDependencyService = new DefaultPoiMapDependencyService();
                                defaultPoiMapDependencyService.initService();
                                this.poiMapDependencyService = defaultPoiMapDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPoiMapDependencyService iPoiMapDependencyService = this.poiMapDependencyService;
                if (!(iPoiMapDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPoiMapDependencyService;
            case 47:
                if (this.eCNetControllerDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCNetControllerDependencyService == null) {
                                DefaultECNetControllerDependencyService defaultECNetControllerDependencyService = new DefaultECNetControllerDependencyService();
                                defaultECNetControllerDependencyService.initService();
                                this.eCNetControllerDependencyService = defaultECNetControllerDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IECNetControllerDependencyService iECNetControllerDependencyService = this.eCNetControllerDependencyService;
                if (!(iECNetControllerDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECNetControllerDependencyService;
            case 48:
                if (this.networkDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.networkDependencyService == null) {
                                DefaultNetworkDependencyService defaultNetworkDependencyService = new DefaultNetworkDependencyService();
                                defaultNetworkDependencyService.initService();
                                this.networkDependencyService = defaultNetworkDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                INetworkDependencyService iNetworkDependencyService = this.networkDependencyService;
                if (!(iNetworkDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iNetworkDependencyService;
            case 49:
                if (this.networkUtilDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.networkUtilDependencyService == null) {
                                DefaultNetworkUtilDependencyService defaultNetworkUtilDependencyService = new DefaultNetworkUtilDependencyService();
                                defaultNetworkUtilDependencyService.initService();
                                this.networkUtilDependencyService = defaultNetworkUtilDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                INetworkUtilDependencyService iNetworkUtilDependencyService = this.networkUtilDependencyService;
                if (!(iNetworkUtilDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iNetworkUtilDependencyService;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                if (this.noticeDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.noticeDependencyService == null) {
                                DefaultNoticeDependencyService defaultNoticeDependencyService = new DefaultNoticeDependencyService();
                                defaultNoticeDependencyService.initService();
                                this.noticeDependencyService = defaultNoticeDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                INoticeDependencyService iNoticeDependencyService = this.noticeDependencyService;
                if (!(iNoticeDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iNoticeDependencyService;
            case 51:
                if (this.offlineDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.offlineDependencyService == null) {
                                DefaultOfflineDependencyService defaultOfflineDependencyService = new DefaultOfflineDependencyService();
                                defaultOfflineDependencyService.initService();
                                this.offlineDependencyService = defaultOfflineDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IOfflineDependencyService iOfflineDependencyService = this.offlineDependencyService;
                if (!(iOfflineDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iOfflineDependencyService;
            case 52:
                if (this.bootLogDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.bootLogDependencyService == null) {
                                DefaultBootLogDependencyService defaultBootLogDependencyService = new DefaultBootLogDependencyService();
                                defaultBootLogDependencyService.initService();
                                this.bootLogDependencyService = defaultBootLogDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IBootLogDependencyService iBootLogDependencyService = this.bootLogDependencyService;
                if (!(iBootLogDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iBootLogDependencyService;
            case 53:
                if (this.performanceOptDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.performanceOptDependencyService == null) {
                                DefaultPerformanceOptDependencyService defaultPerformanceOptDependencyService = new DefaultPerformanceOptDependencyService();
                                defaultPerformanceOptDependencyService.initService();
                                this.performanceOptDependencyService = defaultPerformanceOptDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPerformanceOptDependencyService iPerformanceOptDependencyService = this.performanceOptDependencyService;
                if (!(iPerformanceOptDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPerformanceOptDependencyService;
            case 54:
                if (this.pitayaDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.pitayaDependencyService == null) {
                                DefaultPitayaDependencyService defaultPitayaDependencyService = new DefaultPitayaDependencyService();
                                defaultPitayaDependencyService.initService();
                                this.pitayaDependencyService = defaultPitayaDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPitayaDependencyService iPitayaDependencyService = this.pitayaDependencyService;
                if (!(iPitayaDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPitayaDependencyService;
            case 55:
                if (this.playerDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.playerDependencyService == null) {
                                DefaultPlayerDependencyService defaultPlayerDependencyService = new DefaultPlayerDependencyService();
                                defaultPlayerDependencyService.initService();
                                this.playerDependencyService = defaultPlayerDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPlayerDependencyService iPlayerDependencyService = this.playerDependencyService;
                if (!(iPlayerDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPlayerDependencyService;
            case 56:
                if (this.searchDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.searchDependencyService == null) {
                                DefaultSearchDependencyService defaultSearchDependencyService = new DefaultSearchDependencyService();
                                defaultSearchDependencyService.initService();
                                this.searchDependencyService = defaultSearchDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ISearchDependencyService iSearchDependencyService = this.searchDependencyService;
                if (!(iSearchDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iSearchDependencyService;
            case 57:
                if (this.secDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.secDependencyService == null) {
                                DefaultSecDependencyService defaultSecDependencyService = new DefaultSecDependencyService();
                                defaultSecDependencyService.initService();
                                this.secDependencyService = defaultSecDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ISecDependencyService iSecDependencyService = this.secDependencyService;
                if (!(iSecDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iSecDependencyService;
            case 58:
                if (this.shareDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.shareDependencyService == null) {
                                DefaultShareDependencyService defaultShareDependencyService = new DefaultShareDependencyService();
                                defaultShareDependencyService.initService();
                                this.shareDependencyService = defaultShareDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IShareDependencyService iShareDependencyService = this.shareDependencyService;
                if (!(iShareDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iShareDependencyService;
            case 59:
                if (this.storageDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.storageDependencyService == null) {
                                DefaultTabDependencyService defaultTabDependencyService = new DefaultTabDependencyService();
                                defaultTabDependencyService.initService();
                                this.storageDependencyService = defaultTabDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IStorageDependencyService iStorageDependencyService = this.storageDependencyService;
                if (!(iStorageDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iStorageDependencyService;
            case 60:
                if (this.tabDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.tabDependencyService == null) {
                                com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.tab.DefaultTabDependencyService defaultTabDependencyService2 = new com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.tab.DefaultTabDependencyService();
                                defaultTabDependencyService2.initService();
                                this.tabDependencyService = defaultTabDependencyService2;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ITabDependencyService iTabDependencyService = this.tabDependencyService;
                if (!(iTabDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iTabDependencyService;
            case 61:
                if (this.seaPdpDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.seaPdpDependencyService == null) {
                                DefaultPdpDependencyService defaultPdpDependencyService = new DefaultPdpDependencyService();
                                defaultPdpDependencyService.initService();
                                this.seaPdpDependencyService = defaultPdpDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ISeaPdpDependencyService iSeaPdpDependencyService = this.seaPdpDependencyService;
                if (!(iSeaPdpDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iSeaPdpDependencyService;
            default:
                return null;
        }
    }
}
