package com.ss.android.ugc.aweme.services;

import X.C19EG;
import X.InterfaceC2257101DWa;
import X.InterfaceC524700Khw;
import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.audio.IAudioModelService;
import com.ss.android.ugc.aweme.services.audio.IAudioUserPortraitService;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.aweme.services.external.IAIGCQuotaService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.IAVPhotoModeService;
import com.ss.android.ugc.aweme.services.external.IAVTransformModelService;
import com.ss.android.ugc.aweme.services.external.IAVTypeFaceService;
import com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService;
import com.ss.android.ugc.aweme.services.external.IAnchorService;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.external.ICreativePathAdapterService;
import com.ss.android.ugc.aweme.services.external.ICreativeStandardPathService;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.external.IInitTaskService;
import com.ss.android.ugc.aweme.services.external.ILargeTransactionService;
import com.ss.android.ugc.aweme.services.external.IRouterService;
import com.ss.android.ugc.aweme.services.external.ability.IAVVESDKService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.services.external.ability.IEffectSDKGeneralParamService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextNextService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.story.ICStoryService;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.IActivityNameService;

/* JADX INFO: loaded from: classes36.dex */
public interface IExternalService {
    IAVTransformModelService aVTransformModelService();

    IAbilityService abilityService();

    IAbnormalExitLogService abnormalExitLogService();

    IAnchorService anchorService();

    void asyncService(Context context, String str, ServiceLoadCallback serviceLoadCallback);

    void asyncService(String str, ServiceLoadCallback serviceLoadCallback);

    void asyncServiceForMainRecordService(Context context, String str, ServiceLoadCallback serviceLoadCallback);

    void asyncServiceWithActivity(Context context, String str, ServiceLoadCallback serviceLoadCallback);

    void asyncServiceWithOutPanel(String str, ServiceLoadCallback serviceLoadCallback);

    void attachApplication(Application application);

    IAudioModelService audioModelService();

    IAudioUserPortraitService audioUserPortraitService();

    IAvatarPublishStoryService avatarService();

    IActivityNameService classnameService();

    ICommerceToolsService commerceToolsService();

    IConfigService configService();

    ICreativePathAdapterService creativePathAdapter();

    ICreativeStandardPathService creativeStandardPath();

    IDonationService donationService();

    IAVDraftService draftService();

    IEditService editService();

    IEffectCardService effectCardService();

    IEnterFromService enterFromService();

    IExternalUploaderService externalUploaderService();

    IAVFilterService filterService();

    IAIGCQuotaService getAIGCQuotaService();

    IAILiveService getAILiveService();

    IAVMobService getAVMobService();

    int getCommentSettingCache();

    String getCurrentUploadFrameResult();

    NextLiveData<InterfaceC2257101DWa> getCurrentUserData();

    IEffectSDKGeneralParamService getEffectSDKGeneralParamService();

    int getPermissionSettingCache();

    String getToolsCachePath();

    IInfoService infoService();

    void initASVE();

    IInitTaskService initService();

    ILargeTransactionService largeTransactionService();

    InterfaceC524700Khw mvTemplateService();

    IOpenPhotoNextService openGotoNextService();

    IOpenTextNextService openTextNextService();

    IOpenTextToImageService openTextToImageService();

    ICreativePerformanceMonitorService performanceMonitorService();

    IAVPhotoModeService photoModeService();

    IPreloadVESo preloadService();

    IAVPerformance provideAVPerformance();

    ICrashReportService provideErrorReporter();

    IAVPublishService publishService();

    void resetBrightness(C19EG c19eg);

    IRouterService routerService();

    void setVideoIdParam(Aweme aweme);

    ISpecialPlusService specialPlusService();

    ICStoryService storyService();

    ISuperEntranceService superEntranceService();

    ITTEPAbilityService ttepAbilityService();

    ITTSService ttsService();

    IAVTypeFaceService typeFaceService();

    void updateVESDKDeviceId(String str);

    IAVVESDKService vesdkService();

    /* JADX INFO: loaded from: classes9.dex */
    public interface ServiceLoadCallback {
        void onDismiss();

        void onFailed();

        void onLoad(AsyncAVService asyncAVService, long j);

        void onOK();

        public static final class DefaultImpls {
            public static void onDismiss(ServiceLoadCallback serviceLoadCallback) {
            }

            public static void onFailed(ServiceLoadCallback serviceLoadCallback) {
            }

            public static void onOK(ServiceLoadCallback serviceLoadCallback) {
                serviceLoadCallback.onFailed();
            }
        }
    }
}
