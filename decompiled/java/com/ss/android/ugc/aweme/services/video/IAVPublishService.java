package com.ss.android.ugc.aweme.services.video;

import X.AbstractC1387200mCc;
import X.C0ZIK;
import X.C1220690hs3;
import X.C1434650nR9;
import X.C1443000nec;
import X.C1445970njP;
import X.C19EG;
import X.InterfaceC1433360nP4;
import X.InterfaceC1447710nmD;
import X.InterfaceC1447760nmI;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.api.VideoInfoFromURLResponse;
import com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editpost.BizExpiration;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public interface IAVPublishService {

    public interface PublishProgressController {
        boolean initHide();
    }

    void addAVChallenges(List<AVChallenge> list);

    boolean addAiChatWatermarkWhenDownload(Aweme aweme, int i);

    boolean addAiLiveWatermarkWhenDownload(Aweme aweme);

    void addChallenge(Challenge challenge);

    void addMusic(MusicModel musicModel, int i);

    void addPublishCallback(InterfaceC1433360nP4<CreateBaseAwemeResponse> interfaceC1433360nP4, String str);

    void addPublishPreviewCallback(Lifecycle lifecycle, String str, InterfaceC1447710nmD interfaceC1447710nmD);

    void addPublishProgressToActivity(C19EG c19eg, boolean z, int i, int i2, boolean z2, PublishProgressController publishProgressController, boolean z3);

    void addPublishProgressToActivity(C19EG c19eg, boolean z, int i, int i2, boolean z2, PublishProgressController publishProgressController, boolean z3, boolean z4);

    void addPublishProgressToActivity(C19EG c19eg, boolean z, int i, int i2, boolean z2, boolean z3, PublishProgressController publishProgressController, boolean z4);

    void addPublishProgressToActivitySetEnd(C19EG c19eg, boolean z, int i, int i2, boolean z2, PublishProgressController publishProgressController, boolean z3);

    void addPublishProgressToActivitySetEnd(C19EG c19eg, boolean z, int i, int i2, boolean z2, PublishProgressController publishProgressController, boolean z3, boolean z4);

    void buildFakeMarkupText(String str, List<AVTextExtraStruct> list, Object obj);

    boolean canAutoRetry();

    boolean cancelPublishByClickCover(String str);

    void cancelRestoreOnMain();

    void cancelSynthesis(Context context, String str);

    void changeIntentToHighlightIfNeed(C19EG c19eg, Intent intent, BaseShortVideoContext baseShortVideoContext);

    void checkAndAutoRetryIfNeed(C19EG c19eg);

    boolean checkIfCache(String str);

    boolean checkIsAlreadyPublished(Context context);

    void clearCurChallenge();

    boolean containEmoji(String str);

    void deleteUselessCheckPointFile();

    void dismissExistingRepostPush(String str);

    boolean enableCacheOptimize();

    boolean enableLazyLoadC2PA();

    boolean enableSaveLocalInLegacyScenario();

    List<String> findAIBusinessWatermarkKeysWhenDownload(Aweme aweme);

    void finishAllCreativeActivity(C19EG c19eg);

    void finishAllCreativeActivityExceptDraftBox(C19EG c19eg);

    boolean forceWatermarkWhenDownloadAIGC(Aweme aweme);

    List<PublishModel> getAllProgressValidPublishModel();

    List<PublishModel> getAllPublishModel();

    String getAwemeType();

    List<File> getCacheFileListWithOutPublishing();

    Bitmap getCover(PublishModel publishModel);

    String getCoverPath(BaseShortVideoContext baseShortVideoContext);

    AVChallenge getCurChallenge();

    String getCurrentPublishTaskId();

    String getCurrentSecUid();

    String getCurrentUserId();

    IInterceptor getDraftNotificationDeeplinkInterceptor();

    BizExpiration[] getEditPostBizExPiration();

    String getErrorHintWhenDisableDuetOrStitch(int i);

    String getErrorMsg(Context context, C1434650nR9 c1434650nR9, String str);

    List<String> getLastPublishedVids();

    List<File> getLocalVideoCacheWhitelist();

    Long getLocalVideoLruCacheDays();

    Long getLocalVideoLruCacheThreshold();

    List<AVTextExtraStruct> getMetaDataHashTag(String str);

    List<File> getNotCleanableFileList();

    int[] getOutputMediaSize(BaseShortVideoContext baseShortVideoContext);

    PaidContentVideoModel getPaidContentVideoModel(PublishModel publishModel);

    int getParallelPublishTaskSize();

    List<Aweme> getPreloadedCoverPreviewFeedItems();

    Bitmap getPreviewProfileBitmap();

    Object getPublishMetaData(Object obj);

    PublishModel getPublishModel(String str);

    int getPublishTaskWithoutStorySize();

    String getPublisherEventAsJSON();

    List<Aweme> getPublishingAwemesByPermission(Boolean bool);

    String getShootWay();

    String getVideoTitle(PublishModel publishModel);

    boolean goCoverPreviewProfileActivity(Activity activity, String str, String[] strArr, int i);

    boolean hasECCommerceAnchor();

    void hideProgress(C19EG c19eg);

    void hideUploadRecoverWindow(Context context, boolean z, boolean z2);

    boolean hitRepostPushAfterPostSuccess(C1445970njP c1445970njP);

    boolean inPublishPage();

    boolean inPublishPage(Context context);

    boolean isAfterPost();

    boolean isAutoRetry();

    boolean isCreativeToolsActivity(Activity activity);

    boolean isCreativeToolsPage(AbstractC1387200mCc abstractC1387200mCc);

    boolean isImageMode(String str);

    boolean isMainCameraPublishingOrStoryCameraPublishing();

    boolean isMultiTaskRecover();

    boolean isParallelPublishTaskFinished();

    boolean isPublishing();

    boolean isSubOnlyVideo();

    void log(String str, String str2);

    void markPublishFailed(String str);

    void moveProgress(int i, int i2);

    boolean needAvoidTimeControl();

    boolean needPauseFeed();

    boolean needShowAnim();

    void onSaveLocalTimeoutEvent(String str);

    boolean onlyEmoji(String str);

    Map<String, String> parseC2PAMobParamFromAweme(Aweme aweme);

    long passedDaysAfterPost(long j);

    boolean privateLandingToProfile();

    boolean processMainActivityCallback(AbstractC1387200mCc abstractC1387200mCc, String str, boolean z, boolean z2, Boolean bool);

    void readImageAndAddAIGCWatermarkIfNeed(Aweme aweme, List<String> list, int i);

    void registerPublishProgressCallback(C19EG c19eg, InterfaceC1447760nmI interfaceC1447760nmI, LifecycleOwner lifecycleOwner);

    void removePublishCallback(InterfaceC1433360nP4<CreateBaseAwemeResponse> interfaceC1433360nP4);

    void removedUnusedLocalVideoCache();

    void reportQuitAutoUploadingEvent(Object obj, String str);

    void reportQuitAutoUploadingShowEvent(Object obj);

    List<String> resolveHashtagNamesInCaption(BaseShortVideoContext baseShortVideoContext);

    void restoreNLEData(AwemeDraft awemeDraft);

    void retryMissedSaveLocalAfterModeration();

    void retryPublishIfNeed(C19EG c19eg, PublishFailureReason publishFailureReason, PublishModel publishModel, String str);

    boolean returnMentionVideoRespose(Activity activity, VideoInfoFromURLResponse videoInfoFromURLResponse, String str);

    void saveCheckPointToDraft(Activity activity, int i);

    void saveLocalByUniqueURI(String str);

    boolean sendLocalPushAfterPostSuccess(C1445970njP c1445970njP);

    boolean sendLocalPushAfterPrivatePostSuccess(C1445970njP c1445970njP);

    void setChainInfo(Activity activity, C0ZIK c0zik);

    void setCurMusic(MusicModel musicModel, int i);

    void setCurMusic(MusicModel musicModel, Boolean bool, int i);

    void setECCommerceAnchor(boolean z);

    void setHashTagRegex(String str);

    void setKitManageRegister(boolean z);

    void setMentionVideoSubType(Activity activity, int i);

    void setMultiTaskRecover(boolean z);

    void setMusicChooseType(int i);

    void setNeedShowAnim(boolean z);

    void setPublishStatus(int i);

    void setUploadRecoverViewInfo(Context context, C1434650nR9 c1434650nR9, C1443000nec c1443000nec, IUploadRecoverInfoStore iUploadRecoverInfoStore, PublishModel publishModel);

    boolean shouldDisableDuetOrStitch(int i);

    boolean shouldShowSharePopupAfterPostSuccess(C1445970njP c1445970njP);

    void showMentionVideoLoading(Activity activity);

    void showProgress(C19EG c19eg, boolean z);

    void showPublishRecoverViewForCCPublish(C19EG c19eg, String str, PublishFailMsg publishFailMsg);

    Dialog showRestoreWorkDialog(Activity activity, LifecycleOwner lifecycleOwner, String str);

    void showUploadRecoverIfNeed(PublishFailureReason publishFailureReason, C19EG c19eg, PublishModel publishModel, String str, boolean z, boolean z2);

    void startEditPostPublishPage(Activity activity, Aweme aweme, int i, String str, Boolean bool);

    String startPublish(C19EG c19eg, Bundle bundle);

    void toPreview(Activity activity, C1220690hs3 c1220690hs3);

    void triggerDraftPublishNotificationIfNeeded();

    void triggerPublishProgressCallbacksOnly(C19EG c19eg, boolean z);

    boolean tryRegisterHomePageUICallback(AbstractC1387200mCc abstractC1387200mCc, String str);

    void tryRestorePublish(C19EG c19eg, boolean z, Function1<Boolean, Void> function1);

    boolean turnOffSaveLocalAfterModeration();

    boolean turnOffSaveLocalOptionByDefault();

    void uploadRecoverPopViewSetVisibility(boolean z);

    void writeTransCodeC2Pa(String str, String str2);
}
