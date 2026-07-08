package com.ss.android.ugc.aweme.services;

import X.C19EG;
import X.InterfaceC2257101DWa;
import X.InterfaceC524700Khw;
import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
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
public final class ExternalService implements IExternalService {
    public static final ExternalService INSTANCE = new ExternalService();
    public final /* synthetic */ IExternalService $$delegate_0 = (IExternalService) ServiceManager.get().getService(IExternalService.class);

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVTransformModelService aVTransformModelService() {
        return this.$$delegate_0.aVTransformModelService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAbilityService abilityService() {
        return this.$$delegate_0.abilityService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAbnormalExitLogService abnormalExitLogService() {
        return this.$$delegate_0.abnormalExitLogService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAnchorService anchorService() {
        return this.$$delegate_0.anchorService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void asyncService(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        this.$$delegate_0.asyncService(context, str, serviceLoadCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void asyncService(String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        this.$$delegate_0.asyncService(str, serviceLoadCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void asyncServiceForMainRecordService(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        this.$$delegate_0.asyncServiceForMainRecordService(context, str, serviceLoadCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void asyncServiceWithActivity(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        this.$$delegate_0.asyncServiceWithActivity(context, str, serviceLoadCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void asyncServiceWithOutPanel(String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        this.$$delegate_0.asyncServiceWithOutPanel(str, serviceLoadCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void attachApplication(Application application) {
        this.$$delegate_0.attachApplication(application);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAudioModelService audioModelService() {
        return this.$$delegate_0.audioModelService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAudioUserPortraitService audioUserPortraitService() {
        return this.$$delegate_0.audioUserPortraitService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAvatarPublishStoryService avatarService() {
        return this.$$delegate_0.avatarService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IActivityNameService classnameService() {
        return this.$$delegate_0.classnameService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ICommerceToolsService commerceToolsService() {
        return this.$$delegate_0.commerceToolsService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IConfigService configService() {
        return this.$$delegate_0.configService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ICreativePathAdapterService creativePathAdapter() {
        return this.$$delegate_0.creativePathAdapter();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ICreativeStandardPathService creativeStandardPath() {
        return this.$$delegate_0.creativeStandardPath();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IDonationService donationService() {
        return this.$$delegate_0.donationService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVDraftService draftService() {
        return this.$$delegate_0.draftService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IEditService editService() {
        return this.$$delegate_0.editService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IEffectCardService effectCardService() {
        return this.$$delegate_0.effectCardService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IEnterFromService enterFromService() {
        return this.$$delegate_0.enterFromService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IExternalUploaderService externalUploaderService() {
        return this.$$delegate_0.externalUploaderService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVFilterService filterService() {
        return this.$$delegate_0.filterService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAIGCQuotaService getAIGCQuotaService() {
        return this.$$delegate_0.getAIGCQuotaService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAILiveService getAILiveService() {
        return this.$$delegate_0.getAILiveService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVMobService getAVMobService() {
        return this.$$delegate_0.getAVMobService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public int getCommentSettingCache() {
        return this.$$delegate_0.getCommentSettingCache();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public String getCurrentUploadFrameResult() {
        return this.$$delegate_0.getCurrentUploadFrameResult();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public NextLiveData<InterfaceC2257101DWa> getCurrentUserData() {
        return this.$$delegate_0.getCurrentUserData();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IEffectSDKGeneralParamService getEffectSDKGeneralParamService() {
        return this.$$delegate_0.getEffectSDKGeneralParamService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public int getPermissionSettingCache() {
        return this.$$delegate_0.getPermissionSettingCache();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public String getToolsCachePath() {
        return this.$$delegate_0.getToolsCachePath();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IInfoService infoService() {
        return this.$$delegate_0.infoService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void initASVE() {
        this.$$delegate_0.initASVE();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IInitTaskService initService() {
        return this.$$delegate_0.initService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ILargeTransactionService largeTransactionService() {
        return this.$$delegate_0.largeTransactionService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public InterfaceC524700Khw mvTemplateService() {
        return this.$$delegate_0.mvTemplateService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IOpenPhotoNextService openGotoNextService() {
        return this.$$delegate_0.openGotoNextService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IOpenTextNextService openTextNextService() {
        return this.$$delegate_0.openTextNextService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IOpenTextToImageService openTextToImageService() {
        return this.$$delegate_0.openTextToImageService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ICreativePerformanceMonitorService performanceMonitorService() {
        return this.$$delegate_0.performanceMonitorService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVPhotoModeService photoModeService() {
        return this.$$delegate_0.photoModeService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IPreloadVESo preloadService() {
        return this.$$delegate_0.preloadService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVPerformance provideAVPerformance() {
        return this.$$delegate_0.provideAVPerformance();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ICrashReportService provideErrorReporter() {
        return this.$$delegate_0.provideErrorReporter();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVPublishService publishService() {
        return this.$$delegate_0.publishService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void resetBrightness(C19EG c19eg) {
        this.$$delegate_0.resetBrightness(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IRouterService routerService() {
        return this.$$delegate_0.routerService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void setVideoIdParam(Aweme aweme) {
        this.$$delegate_0.setVideoIdParam(aweme);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ISpecialPlusService specialPlusService() {
        return this.$$delegate_0.specialPlusService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ICStoryService storyService() {
        return this.$$delegate_0.storyService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ISuperEntranceService superEntranceService() {
        return this.$$delegate_0.superEntranceService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ITTEPAbilityService ttepAbilityService() {
        return this.$$delegate_0.ttepAbilityService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public ITTSService ttsService() {
        return this.$$delegate_0.ttsService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVTypeFaceService typeFaceService() {
        return this.$$delegate_0.typeFaceService();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public void updateVESDKDeviceId(String str) {
        this.$$delegate_0.updateVESDKDeviceId(str);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public IAVVESDKService vesdkService() {
        return this.$$delegate_0.vesdkService();
    }
}
