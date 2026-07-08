package com.ss.android.ugc.aweme.ecommerce.saas.core;

import X.AnonymousClass0317;
import X.InterfaceC1079104Jx;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.OfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.GuestModeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.application.ApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.aweme.AwemeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.aweme.main.AwemeMainDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.buildconfigdiff.BuildConfigDIffDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.comment.CommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonutils.CommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ReportDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.TpcConsentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.creativepage.CreativePageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.creatorfeed.PdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.deeplink.DeeplinkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.defailfeed.DetailFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecmall.ECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecmall.EcMallUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecmall.VideoDetailLoadDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.ECDiversionDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.ECUgPayToMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.ECUgPdpPageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.EcUgBackButtonDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.EcUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.EcUgPopupDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.MallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.friend.FriendDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.homepage.HomepageTabDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.launcher.LauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.legacy.LegacyDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveTTDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.localtest.LocalTestDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.localtest.PipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.map.PoiMapDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.ECNetControllerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.NetworkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.NetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.notice.NoticeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.BootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.pitaya.PitayaDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.player.PlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.sea.creatorfeed.SeaPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.sec.SecDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.share.ShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.storage.StorageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.tab.TabDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.transaction.pdp.SeaPdpDependencyService;
import com.ss.android.ugc.aweme.ecommerce.init.EcomInitService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IGuestModeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.IAwemeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.IAwemeMainDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.buildconfigdiff.IBuildConfigDiffDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonutils.ICommonUtilsDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IReportDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.ITpcConsentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.deeplink.IDeeplinkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IDetailFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.IPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.ISeaPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IEcMallUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IVideoDetailLoadDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECDiversionDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPayToMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECUgPdpPageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.friend.IFriendDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.homepage.IHomepageTabDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.launcher.ILauncherDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.ILegacyDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveTTDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.map.IPoiMapDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.IECNetControllerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.notice.INoticeDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.offline.IOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IBootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.pitaya.IPitayaDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.sec.ISecDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.storage.IStorageDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.tab.ITabDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.transaction.ISeaPdpDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.init.IECHostInitService;
import com.ss.android.ugc.aweme.ecommerce.search.saas.EcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.saas.ECLiveDependencyService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EComHostServiceInitializer implements InterfaceC1079104Jx {
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
    public IECHostInitService eCHostInitService;
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
    public final Class<?>[] serviceTypes = {IActivityStackDependencyService.class, IHybridDependencyService.class, IOfflineDependencyService.class, IAccountDependencyService.class, IGuestModeDependencyService.class, IAdDependencyService.class, IAnchorDependencyService.class, IApmDependencyService.class, IApplicationDependencyService.class, IAppSettingDependencyService.class, IAwemeDependencyService.class, IAwemeMainDependencyService.class, IBuildConfigDiffDependencyService.class, IBusinessDependencyService.class, ICommentDependencyService.class, ICommonFeedDependService.class, ICommonUtilsDependencyService.class, IComplianceDependencyService.class, IReportDependencyService.class, ITpcConsentDependencyService.class, ICreativePageDependencyService.class, IDeeplinkDependencyService.class, IDetailFeedDependencyService.class, IECommerceMallDependencyService.class, IEcMallUgDependencyService.class, IVideoDetailLoadDependencyService.class, IECDiversionDependencyService.class, IECUgPayToMallDependencyService.class, IECUgPdpPageDependencyService.class, IEcUgBackButtonDependencyService.class, IEcUgDependencyService.class, IEcUgPopupDependencyService.class, IMallLandingPerfTrackerDependencyService.class, IFriendDependencyService.class, IHomepageTabDependencyService.class, ILauncherDependencyService.class, ILegacyDependencyService.class, ILiveDependencyService.class, ILiveTTDependencyService.class, ILocalTestDependencyService.class, IPipoOfflineDependencyService.class, ILocationDependencyService.class, ILogDependencyService.class, IPoiMapDependencyService.class, INetworkDependencyService.class, INetworkUtilDependencyService.class, INoticeDependencyService.class, IBootLogDependencyService.class, IPerformanceOptDependencyService.class, IPitayaDependencyService.class, IPlayerDependencyService.class, ISearchDependencyService.class, ISecDependencyService.class, IShareDependencyService.class, IStorageDependencyService.class, ITabDependencyService.class, ISeaPdpDependencyService.class, IECHostInitService.class, IECLiveDependencyService.class, IPdpCreatorVideoFeedDependencyService.class, ISeaPdpCreatorVideoFeedDependencyService.class, IEcomSearchDependencyService.class, IECNetControllerDependencyService.class};
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
                if (this.activityStackDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.activityStackDependencyService == null) {
                                ActivityStackDependencyService activityStackDependencyService = new ActivityStackDependencyService();
                                activityStackDependencyService.initService();
                                this.activityStackDependencyService = activityStackDependencyService;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IActivityStackDependencyService iActivityStackDependencyService = this.activityStackDependencyService;
                if (!(iActivityStackDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iActivityStackDependencyService;
            case 1:
                if (this.hybridDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hybridDependencyService == null) {
                                HybridDependencyService hybridDependencyService = new HybridDependencyService();
                                hybridDependencyService.initService();
                                this.hybridDependencyService = hybridDependencyService;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                IHybridDependencyService iHybridDependencyService = this.hybridDependencyService;
                if (!(iHybridDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iHybridDependencyService;
            case 2:
                if (this.offlineDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.offlineDependencyService == null) {
                                OfflineDependencyService offlineDependencyService = new OfflineDependencyService();
                                offlineDependencyService.initService();
                                this.offlineDependencyService = offlineDependencyService;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                IOfflineDependencyService iOfflineDependencyService = this.offlineDependencyService;
                if (!(iOfflineDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iOfflineDependencyService;
            case 3:
                if (this.accountDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.accountDependencyService == null) {
                                AccountDependencyService accountDependencyService = new AccountDependencyService();
                                accountDependencyService.initService();
                                this.accountDependencyService = accountDependencyService;
                            }
                        } catch (Throwable th22) {
                            throw th22;
                        }
                        break;
                    }
                }
                IAccountDependencyService iAccountDependencyService = this.accountDependencyService;
                if (!(iAccountDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAccountDependencyService;
            case 4:
                if (this.guestModeDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.guestModeDependencyService == null) {
                                GuestModeDependencyService guestModeDependencyService = new GuestModeDependencyService();
                                guestModeDependencyService.initService();
                                this.guestModeDependencyService = guestModeDependencyService;
                            }
                        } catch (Throwable th222) {
                            throw th222;
                        }
                        break;
                    }
                }
                IGuestModeDependencyService iGuestModeDependencyService = this.guestModeDependencyService;
                if (!(iGuestModeDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iGuestModeDependencyService;
            case 5:
                if (this.adDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.adDependencyService == null) {
                                AdDependencyService adDependencyService = new AdDependencyService();
                                adDependencyService.initService();
                                this.adDependencyService = adDependencyService;
                            }
                        } catch (Throwable th2222) {
                            throw th2222;
                        }
                        break;
                    }
                }
                IAdDependencyService iAdDependencyService = this.adDependencyService;
                if (!(iAdDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAdDependencyService;
            case 6:
                if (this.anchorDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.anchorDependencyService == null) {
                                AnchorDependencyService anchorDependencyService = new AnchorDependencyService();
                                anchorDependencyService.initService();
                                this.anchorDependencyService = anchorDependencyService;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IAnchorDependencyService iAnchorDependencyService = this.anchorDependencyService;
                if (!(iAnchorDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAnchorDependencyService;
            case 7:
                if (this.apmDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.apmDependencyService == null) {
                                ApmDependencyService apmDependencyService = new ApmDependencyService();
                                apmDependencyService.initService();
                                this.apmDependencyService = apmDependencyService;
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
            case 8:
                if (this.applicationDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.applicationDependencyService == null) {
                                ApplicationDependencyService applicationDependencyService = new ApplicationDependencyService();
                                applicationDependencyService.initService();
                                this.applicationDependencyService = applicationDependencyService;
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
            case BdTuring.TYPE_ECAF /* 9 */:
                if (this.appSettingDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.appSettingDependencyService == null) {
                                AppSettingDependencyService appSettingDependencyService = new AppSettingDependencyService();
                                appSettingDependencyService.initService();
                                this.appSettingDependencyService = appSettingDependencyService;
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (this.awemeDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.awemeDependencyService == null) {
                                AwemeDependencyService awemeDependencyService = new AwemeDependencyService();
                                awemeDependencyService.initService();
                                this.awemeDependencyService = awemeDependencyService;
                            }
                        } catch (Throwable th22222) {
                            throw th22222;
                        }
                        break;
                    }
                }
                IAwemeDependencyService iAwemeDependencyService = this.awemeDependencyService;
                if (!(iAwemeDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAwemeDependencyService;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (this.awemeMainDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.awemeMainDependencyService == null) {
                                AwemeMainDependencyService awemeMainDependencyService = new AwemeMainDependencyService();
                                awemeMainDependencyService.initService();
                                this.awemeMainDependencyService = awemeMainDependencyService;
                            }
                        } catch (Throwable th222222) {
                            throw th222222;
                        }
                        break;
                    }
                }
                IAwemeMainDependencyService iAwemeMainDependencyService = this.awemeMainDependencyService;
                if (!(iAwemeMainDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iAwemeMainDependencyService;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if (this.buildConfigDiffDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.buildConfigDiffDependencyService == null) {
                                BuildConfigDIffDependencyService buildConfigDIffDependencyService = new BuildConfigDIffDependencyService();
                                buildConfigDIffDependencyService.initService();
                                this.buildConfigDiffDependencyService = buildConfigDIffDependencyService;
                            }
                        } catch (Throwable th2222222) {
                            throw th2222222;
                        }
                        break;
                    }
                }
                IBuildConfigDiffDependencyService iBuildConfigDiffDependencyService = this.buildConfigDiffDependencyService;
                if (!(iBuildConfigDiffDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iBuildConfigDiffDependencyService;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                if (this.businessDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.businessDependencyService == null) {
                                BusinessDependencyService businessDependencyService = new BusinessDependencyService();
                                businessDependencyService.initService();
                                this.businessDependencyService = businessDependencyService;
                            }
                        } catch (Throwable th22222222) {
                            throw th22222222;
                        }
                        break;
                    }
                }
                IBusinessDependencyService iBusinessDependencyService = this.businessDependencyService;
                if (!(iBusinessDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iBusinessDependencyService;
            case 14:
                if (this.commentDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.commentDependencyService == null) {
                                CommentDependencyService commentDependencyService = new CommentDependencyService();
                                commentDependencyService.initService();
                                this.commentDependencyService = commentDependencyService;
                            }
                        } catch (Throwable th222222222) {
                            throw th222222222;
                        }
                        break;
                    }
                }
                ICommentDependencyService iCommentDependencyService = this.commentDependencyService;
                if (!(iCommentDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iCommentDependencyService;
            case 15:
                if (this.commonFeedDependService == null) {
                    synchronized (cls) {
                        try {
                            if (this.commonFeedDependService == null) {
                                CommonFeedDependService commonFeedDependService = new CommonFeedDependService();
                                commonFeedDependService.initService();
                                this.commonFeedDependService = commonFeedDependService;
                            }
                        } catch (Throwable th2222222222) {
                            throw th2222222222;
                        }
                        break;
                    }
                }
                ICommonFeedDependService iCommonFeedDependService = this.commonFeedDependService;
                if (!(iCommonFeedDependService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iCommonFeedDependService;
            case 16:
                if (this.commonUtilsDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.commonUtilsDependencyService == null) {
                                CommonUtilsDependencyService commonUtilsDependencyService = new CommonUtilsDependencyService();
                                commonUtilsDependencyService.initService();
                                this.commonUtilsDependencyService = commonUtilsDependencyService;
                            }
                        } catch (Throwable th22222222222) {
                            throw th22222222222;
                        }
                        break;
                    }
                }
                ICommonUtilsDependencyService iCommonUtilsDependencyService = this.commonUtilsDependencyService;
                if (!(iCommonUtilsDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iCommonUtilsDependencyService;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                if (this.complianceDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.complianceDependencyService == null) {
                                ComplianceDependencyService complianceDependencyService = new ComplianceDependencyService();
                                complianceDependencyService.initService();
                                this.complianceDependencyService = complianceDependencyService;
                            }
                        } catch (Throwable th222222222222) {
                            throw th222222222222;
                        }
                        break;
                    }
                }
                IComplianceDependencyService iComplianceDependencyService = this.complianceDependencyService;
                if (!(iComplianceDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iComplianceDependencyService;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                if (this.reportDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.reportDependencyService == null) {
                                ReportDependencyService reportDependencyService = new ReportDependencyService();
                                reportDependencyService.initService();
                                this.reportDependencyService = reportDependencyService;
                            }
                        } catch (Throwable th2222222222222) {
                            throw th2222222222222;
                        }
                        break;
                    }
                }
                IReportDependencyService iReportDependencyService = this.reportDependencyService;
                if (!(iReportDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iReportDependencyService;
            case 19:
                if (this.tpcConsentDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.tpcConsentDependencyService == null) {
                                TpcConsentDependencyService tpcConsentDependencyService = new TpcConsentDependencyService();
                                tpcConsentDependencyService.initService();
                                this.tpcConsentDependencyService = tpcConsentDependencyService;
                            }
                        } catch (Throwable th22222222222222) {
                            throw th22222222222222;
                        }
                        break;
                    }
                }
                ITpcConsentDependencyService iTpcConsentDependencyService = this.tpcConsentDependencyService;
                if (!(iTpcConsentDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iTpcConsentDependencyService;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                if (this.creativePageDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.creativePageDependencyService == null) {
                                CreativePageDependencyService creativePageDependencyService = new CreativePageDependencyService();
                                creativePageDependencyService.initService();
                                this.creativePageDependencyService = creativePageDependencyService;
                            }
                        } catch (Throwable th222222222222222) {
                            throw th222222222222222;
                        }
                        break;
                    }
                }
                ICreativePageDependencyService iCreativePageDependencyService = this.creativePageDependencyService;
                if (!(iCreativePageDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iCreativePageDependencyService;
            case 21:
                if (this.deeplinkDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.deeplinkDependencyService == null) {
                                DeeplinkDependencyService deeplinkDependencyService = new DeeplinkDependencyService();
                                deeplinkDependencyService.initService();
                                this.deeplinkDependencyService = deeplinkDependencyService;
                            }
                        } catch (Throwable th2222222222222222) {
                            throw th2222222222222222;
                        }
                        break;
                    }
                }
                IDeeplinkDependencyService iDeeplinkDependencyService = this.deeplinkDependencyService;
                if (!(iDeeplinkDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iDeeplinkDependencyService;
            case 22:
                if (this.detailFeedDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.detailFeedDependencyService == null) {
                                DetailFeedDependencyService detailFeedDependencyService = new DetailFeedDependencyService();
                                detailFeedDependencyService.initService();
                                this.detailFeedDependencyService = detailFeedDependencyService;
                            }
                        } catch (Throwable th22222222222222222) {
                            throw th22222222222222222;
                        }
                        break;
                    }
                }
                IDetailFeedDependencyService iDetailFeedDependencyService = this.detailFeedDependencyService;
                if (!(iDetailFeedDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iDetailFeedDependencyService;
            case 23:
                if (this.eCommerceMallDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCommerceMallDependencyService == null) {
                                ECommerceMallDependencyService eCommerceMallDependencyService = new ECommerceMallDependencyService();
                                eCommerceMallDependencyService.initService();
                                this.eCommerceMallDependencyService = eCommerceMallDependencyService;
                            }
                        } catch (Throwable th222222222222222222) {
                            throw th222222222222222222;
                        }
                        break;
                    }
                }
                IECommerceMallDependencyService iECommerceMallDependencyService = this.eCommerceMallDependencyService;
                if (!(iECommerceMallDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECommerceMallDependencyService;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                if (this.ecMallUgDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ecMallUgDependencyService == null) {
                                EcMallUgDependencyService ecMallUgDependencyService = new EcMallUgDependencyService();
                                ecMallUgDependencyService.initService();
                                this.ecMallUgDependencyService = ecMallUgDependencyService;
                            }
                        } catch (Throwable th2222222222222222222) {
                            throw th2222222222222222222;
                        }
                        break;
                    }
                }
                IEcMallUgDependencyService iEcMallUgDependencyService = this.ecMallUgDependencyService;
                if (!(iEcMallUgDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iEcMallUgDependencyService;
            case 25:
                if (this.videoDetailLoadDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.videoDetailLoadDependencyService == null) {
                                VideoDetailLoadDependencyService videoDetailLoadDependencyService = new VideoDetailLoadDependencyService();
                                videoDetailLoadDependencyService.initService();
                                this.videoDetailLoadDependencyService = videoDetailLoadDependencyService;
                            }
                        } catch (Throwable th22222222222222222222) {
                            throw th22222222222222222222;
                        }
                        break;
                    }
                }
                IVideoDetailLoadDependencyService iVideoDetailLoadDependencyService = this.videoDetailLoadDependencyService;
                if (!(iVideoDetailLoadDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iVideoDetailLoadDependencyService;
            case 26:
                if (this.eCDiversionDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCDiversionDependencyService == null) {
                                ECDiversionDependencyService eCDiversionDependencyService = new ECDiversionDependencyService();
                                eCDiversionDependencyService.initService();
                                this.eCDiversionDependencyService = eCDiversionDependencyService;
                            }
                        } catch (Throwable th222222222222222222222) {
                            throw th222222222222222222222;
                        }
                        break;
                    }
                }
                IECDiversionDependencyService iECDiversionDependencyService = this.eCDiversionDependencyService;
                if (!(iECDiversionDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECDiversionDependencyService;
            case 27:
                if (this.eCUgPayToMallDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCUgPayToMallDependencyService == null) {
                                ECUgPayToMallDependencyService eCUgPayToMallDependencyService = new ECUgPayToMallDependencyService();
                                eCUgPayToMallDependencyService.initService();
                                this.eCUgPayToMallDependencyService = eCUgPayToMallDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222) {
                            throw th2222222222222222222222;
                        }
                        break;
                    }
                }
                IECUgPayToMallDependencyService iECUgPayToMallDependencyService = this.eCUgPayToMallDependencyService;
                if (!(iECUgPayToMallDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECUgPayToMallDependencyService;
            case 28:
                if (this.eCUgPdpPageDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCUgPdpPageDependencyService == null) {
                                ECUgPdpPageDependencyService eCUgPdpPageDependencyService = new ECUgPdpPageDependencyService();
                                eCUgPdpPageDependencyService.initService();
                                this.eCUgPdpPageDependencyService = eCUgPdpPageDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222) {
                            throw th22222222222222222222222;
                        }
                        break;
                    }
                }
                IECUgPdpPageDependencyService iECUgPdpPageDependencyService = this.eCUgPdpPageDependencyService;
                if (!(iECUgPdpPageDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECUgPdpPageDependencyService;
            case 29:
                if (this.ecUgBackButtonDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ecUgBackButtonDependencyService == null) {
                                EcUgBackButtonDependencyService ecUgBackButtonDependencyService = new EcUgBackButtonDependencyService();
                                ecUgBackButtonDependencyService.initService();
                                this.ecUgBackButtonDependencyService = ecUgBackButtonDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222) {
                            throw th222222222222222222222222;
                        }
                        break;
                    }
                }
                IEcUgBackButtonDependencyService iEcUgBackButtonDependencyService = this.ecUgBackButtonDependencyService;
                if (!(iEcUgBackButtonDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iEcUgBackButtonDependencyService;
            case 30:
                if (this.ecUgDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ecUgDependencyService == null) {
                                EcUgDependencyService ecUgDependencyService = new EcUgDependencyService();
                                ecUgDependencyService.initService();
                                this.ecUgDependencyService = ecUgDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222) {
                            throw th2222222222222222222222222;
                        }
                        break;
                    }
                }
                IEcUgDependencyService iEcUgDependencyService = this.ecUgDependencyService;
                if (!(iEcUgDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iEcUgDependencyService;
            case 31:
                if (this.ecUgPopupDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ecUgPopupDependencyService == null) {
                                EcUgPopupDependencyService ecUgPopupDependencyService = new EcUgPopupDependencyService();
                                ecUgPopupDependencyService.initService();
                                this.ecUgPopupDependencyService = ecUgPopupDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222) {
                            throw th22222222222222222222222222;
                        }
                        break;
                    }
                }
                IEcUgPopupDependencyService iEcUgPopupDependencyService = this.ecUgPopupDependencyService;
                if (!(iEcUgPopupDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iEcUgPopupDependencyService;
            case 32:
                if (this.mallLandingPerfTrackerDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.mallLandingPerfTrackerDependencyService == null) {
                                MallLandingPerfTrackerDependencyService mallLandingPerfTrackerDependencyService = new MallLandingPerfTrackerDependencyService();
                                mallLandingPerfTrackerDependencyService.initService();
                                this.mallLandingPerfTrackerDependencyService = mallLandingPerfTrackerDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222) {
                            throw th222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMallLandingPerfTrackerDependencyService iMallLandingPerfTrackerDependencyService = this.mallLandingPerfTrackerDependencyService;
                if (!(iMallLandingPerfTrackerDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iMallLandingPerfTrackerDependencyService;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                if (this.friendDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.friendDependencyService == null) {
                                FriendDependencyService friendDependencyService = new FriendDependencyService();
                                friendDependencyService.initService();
                                this.friendDependencyService = friendDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222) {
                            throw th2222222222222222222222222222;
                        }
                        break;
                    }
                }
                IFriendDependencyService iFriendDependencyService = this.friendDependencyService;
                if (!(iFriendDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iFriendDependencyService;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                if (this.homepageTabDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.homepageTabDependencyService == null) {
                                HomepageTabDependencyService homepageTabDependencyService = new HomepageTabDependencyService();
                                homepageTabDependencyService.initService();
                                this.homepageTabDependencyService = homepageTabDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222) {
                            throw th22222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHomepageTabDependencyService iHomepageTabDependencyService = this.homepageTabDependencyService;
                if (!(iHomepageTabDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iHomepageTabDependencyService;
            case 35:
                if (this.launcherDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.launcherDependencyService == null) {
                                LauncherDependencyService launcherDependencyService = new LauncherDependencyService();
                                launcherDependencyService.initService();
                                this.launcherDependencyService = launcherDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222) {
                            throw th222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILauncherDependencyService iLauncherDependencyService = this.launcherDependencyService;
                if (!(iLauncherDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLauncherDependencyService;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                if (this.legacyDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.legacyDependencyService == null) {
                                LegacyDependencyService legacyDependencyService = new LegacyDependencyService();
                                legacyDependencyService.initService();
                                this.legacyDependencyService = legacyDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222) {
                            throw th2222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILegacyDependencyService iLegacyDependencyService = this.legacyDependencyService;
                if (!(iLegacyDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLegacyDependencyService;
            case 37:
                if (this.liveDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveDependencyService == null) {
                                LiveDependencyService liveDependencyService = new LiveDependencyService();
                                liveDependencyService.initService();
                                this.liveDependencyService = liveDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222) {
                            throw th22222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveDependencyService iLiveDependencyService = this.liveDependencyService;
                if (!(iLiveDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLiveDependencyService;
            case 38:
                if (this.liveTTDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveTTDependencyService == null) {
                                LiveTTDependencyService liveTTDependencyService = new LiveTTDependencyService();
                                liveTTDependencyService.initService();
                                this.liveTTDependencyService = liveTTDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveTTDependencyService iLiveTTDependencyService = this.liveTTDependencyService;
                if (!(iLiveTTDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLiveTTDependencyService;
            case 39:
                if (this.localTestDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.localTestDependencyService == null) {
                                LocalTestDependencyService localTestDependencyService = new LocalTestDependencyService();
                                localTestDependencyService.initService();
                                this.localTestDependencyService = localTestDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILocalTestDependencyService iLocalTestDependencyService = this.localTestDependencyService;
                if (!(iLocalTestDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLocalTestDependencyService;
            case 40:
                if (this.pipoOfflineDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.pipoOfflineDependencyService == null) {
                                PipoOfflineDependencyService pipoOfflineDependencyService = new PipoOfflineDependencyService();
                                pipoOfflineDependencyService.initService();
                                this.pipoOfflineDependencyService = pipoOfflineDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPipoOfflineDependencyService iPipoOfflineDependencyService = this.pipoOfflineDependencyService;
                if (!(iPipoOfflineDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPipoOfflineDependencyService;
            case 41:
                if (this.locationDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.locationDependencyService == null) {
                                LocationDependencyService locationDependencyService = new LocationDependencyService();
                                locationDependencyService.initService();
                                this.locationDependencyService = locationDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILocationDependencyService iLocationDependencyService = this.locationDependencyService;
                if (!(iLocationDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLocationDependencyService;
            case 42:
                if (this.logDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.logDependencyService == null) {
                                LogDependencyService logDependencyService = new LogDependencyService();
                                logDependencyService.initService();
                                this.logDependencyService = logDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILogDependencyService iLogDependencyService = this.logDependencyService;
                if (!(iLogDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iLogDependencyService;
            case 43:
                if (this.poiMapDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.poiMapDependencyService == null) {
                                PoiMapDependencyService poiMapDependencyService = new PoiMapDependencyService();
                                poiMapDependencyService.initService();
                                this.poiMapDependencyService = poiMapDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPoiMapDependencyService iPoiMapDependencyService = this.poiMapDependencyService;
                if (!(iPoiMapDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPoiMapDependencyService;
            case 44:
                if (this.networkDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.networkDependencyService == null) {
                                NetworkDependencyService networkDependencyService = new NetworkDependencyService();
                                networkDependencyService.initService();
                                this.networkDependencyService = networkDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                INetworkDependencyService iNetworkDependencyService = this.networkDependencyService;
                if (!(iNetworkDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iNetworkDependencyService;
            case 45:
                if (this.networkUtilDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.networkUtilDependencyService == null) {
                                NetworkUtilDependencyService networkUtilDependencyService = new NetworkUtilDependencyService();
                                networkUtilDependencyService.initService();
                                this.networkUtilDependencyService = networkUtilDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                INetworkUtilDependencyService iNetworkUtilDependencyService = this.networkUtilDependencyService;
                if (!(iNetworkUtilDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iNetworkUtilDependencyService;
            case 46:
                if (this.noticeDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.noticeDependencyService == null) {
                                NoticeDependencyService noticeDependencyService = new NoticeDependencyService();
                                noticeDependencyService.initService();
                                this.noticeDependencyService = noticeDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                INoticeDependencyService iNoticeDependencyService = this.noticeDependencyService;
                if (!(iNoticeDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iNoticeDependencyService;
            case 47:
                if (this.bootLogDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.bootLogDependencyService == null) {
                                BootLogDependencyService bootLogDependencyService = new BootLogDependencyService();
                                bootLogDependencyService.initService();
                                this.bootLogDependencyService = bootLogDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IBootLogDependencyService iBootLogDependencyService = this.bootLogDependencyService;
                if (!(iBootLogDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iBootLogDependencyService;
            case 48:
                if (this.performanceOptDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.performanceOptDependencyService == null) {
                                PerformanceOptDependencyService performanceOptDependencyService = new PerformanceOptDependencyService();
                                performanceOptDependencyService.initService();
                                this.performanceOptDependencyService = performanceOptDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPerformanceOptDependencyService iPerformanceOptDependencyService = this.performanceOptDependencyService;
                if (!(iPerformanceOptDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPerformanceOptDependencyService;
            case 49:
                if (this.pitayaDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.pitayaDependencyService == null) {
                                PitayaDependencyService pitayaDependencyService = new PitayaDependencyService();
                                pitayaDependencyService.initService();
                                this.pitayaDependencyService = pitayaDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPitayaDependencyService iPitayaDependencyService = this.pitayaDependencyService;
                if (!(iPitayaDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPitayaDependencyService;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                if (this.playerDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.playerDependencyService == null) {
                                PlayerDependencyService playerDependencyService = new PlayerDependencyService();
                                playerDependencyService.initService();
                                this.playerDependencyService = playerDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPlayerDependencyService iPlayerDependencyService = this.playerDependencyService;
                if (!(iPlayerDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPlayerDependencyService;
            case 51:
                if (this.searchDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.searchDependencyService == null) {
                                SearchDependencyService searchDependencyService = new SearchDependencyService();
                                searchDependencyService.initService();
                                this.searchDependencyService = searchDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ISearchDependencyService iSearchDependencyService = this.searchDependencyService;
                if (!(iSearchDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iSearchDependencyService;
            case 52:
                if (this.secDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.secDependencyService == null) {
                                SecDependencyService secDependencyService = new SecDependencyService();
                                secDependencyService.initService();
                                this.secDependencyService = secDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ISecDependencyService iSecDependencyService = this.secDependencyService;
                if (!(iSecDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iSecDependencyService;
            case 53:
                if (this.shareDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.shareDependencyService == null) {
                                ShareDependencyService shareDependencyService = new ShareDependencyService();
                                shareDependencyService.initService();
                                this.shareDependencyService = shareDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IShareDependencyService iShareDependencyService = this.shareDependencyService;
                if (!(iShareDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iShareDependencyService;
            case 54:
                if (this.storageDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.storageDependencyService == null) {
                                StorageDependencyService storageDependencyService = new StorageDependencyService();
                                storageDependencyService.initService();
                                this.storageDependencyService = storageDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IStorageDependencyService iStorageDependencyService = this.storageDependencyService;
                if (!(iStorageDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iStorageDependencyService;
            case 55:
                if (this.tabDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.tabDependencyService == null) {
                                TabDependencyService tabDependencyService = new TabDependencyService();
                                tabDependencyService.initService();
                                this.tabDependencyService = tabDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ITabDependencyService iTabDependencyService = this.tabDependencyService;
                if (!(iTabDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iTabDependencyService;
            case 56:
                if (this.seaPdpDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.seaPdpDependencyService == null) {
                                SeaPdpDependencyService seaPdpDependencyService = new SeaPdpDependencyService();
                                seaPdpDependencyService.initService();
                                this.seaPdpDependencyService = seaPdpDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ISeaPdpDependencyService iSeaPdpDependencyService = this.seaPdpDependencyService;
                if (!(iSeaPdpDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iSeaPdpDependencyService;
            case 57:
                if (this.eCHostInitService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCHostInitService == null) {
                                EcomInitService ecomInitService = new EcomInitService();
                                ecomInitService.initService();
                                this.eCHostInitService = ecomInitService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IECHostInitService iECHostInitService = this.eCHostInitService;
                if (!(iECHostInitService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECHostInitService;
            case 58:
                if (this.eCLiveDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCLiveDependencyService == null) {
                                ECLiveDependencyService eCLiveDependencyService = new ECLiveDependencyService();
                                eCLiveDependencyService.initService();
                                this.eCLiveDependencyService = eCLiveDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IECLiveDependencyService iECLiveDependencyService = this.eCLiveDependencyService;
                if (!(iECLiveDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECLiveDependencyService;
            case 59:
                if (this.pdpCreatorVideoFeedDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.pdpCreatorVideoFeedDependencyService == null) {
                                PdpCreatorVideoFeedDependencyService pdpCreatorVideoFeedDependencyService = new PdpCreatorVideoFeedDependencyService();
                                pdpCreatorVideoFeedDependencyService.initService();
                                this.pdpCreatorVideoFeedDependencyService = pdpCreatorVideoFeedDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPdpCreatorVideoFeedDependencyService iPdpCreatorVideoFeedDependencyService = this.pdpCreatorVideoFeedDependencyService;
                if (!(iPdpCreatorVideoFeedDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iPdpCreatorVideoFeedDependencyService;
            case 60:
                if (this.seaPdpCreatorVideoFeedDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.seaPdpCreatorVideoFeedDependencyService == null) {
                                SeaPdpCreatorVideoFeedDependencyService seaPdpCreatorVideoFeedDependencyService = new SeaPdpCreatorVideoFeedDependencyService();
                                seaPdpCreatorVideoFeedDependencyService.initService();
                                this.seaPdpCreatorVideoFeedDependencyService = seaPdpCreatorVideoFeedDependencyService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ISeaPdpCreatorVideoFeedDependencyService iSeaPdpCreatorVideoFeedDependencyService = this.seaPdpCreatorVideoFeedDependencyService;
                if (!(iSeaPdpCreatorVideoFeedDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iSeaPdpCreatorVideoFeedDependencyService;
            case 61:
                if (this.ecomSearchDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ecomSearchDependencyService == null) {
                                EcomSearchDependencyService ecomSearchDependencyService = new EcomSearchDependencyService();
                                ecomSearchDependencyService.initService();
                                this.ecomSearchDependencyService = ecomSearchDependencyService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IEcomSearchDependencyService iEcomSearchDependencyService = this.ecomSearchDependencyService;
                if (!(iEcomSearchDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iEcomSearchDependencyService;
            case BaseNotice.CREATOR /* 62 */:
                if (this.eCNetControllerDependencyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCNetControllerDependencyService == null) {
                                ECNetControllerDependencyService eCNetControllerDependencyService = new ECNetControllerDependencyService();
                                eCNetControllerDependencyService.initService();
                                this.eCNetControllerDependencyService = eCNetControllerDependencyService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IECNetControllerDependencyService iECNetControllerDependencyService = this.eCNetControllerDependencyService;
                if (!(iECNetControllerDependencyService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECNetControllerDependencyService;
            default:
                return null;
        }
    }
}
