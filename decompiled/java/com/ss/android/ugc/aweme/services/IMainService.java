package com.ss.android.ugc.aweme.services;

import X.AbstractC2420009e2;
import X.C0CCZ;
import X.C1402840mbq;
import X.C19EG;
import X.InterfaceC1028550cs9;
import X.InterfaceC1066660drc;
import X.InterfaceC1294060jmO;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public interface IMainService {

    /* JADX INFO: loaded from: classes29.dex */
    public interface DownLoadFinishListener {
        void doAfterDownLoad(int i, Boolean bool);
    }

    AVMusic avMusicApply(MusicModel musicModel);

    void changeStatusBarMainTab(Activity activity, String str);

    void checkAmplify(Activity activity, int i);

    boolean checkIsMinAppVersionNotSatisfied(Activity activity, String str, String str2);

    void clearDelayedPostMessage();

    void downloadStickerHelper(String str, String str2, Activity activity, boolean z, DownLoadFinishListener downLoadFinishListener);

    InterfaceC1028550cs9 generateSplashAdDependImpl();

    IAVRouterIntentParse getAVRouterIntentParse();

    String getAccessKey();

    String getAnywhereChannelPath(String str);

    String getApiUrlPrefix();

    Class<? extends Activity> getAppLinkHandlerActivityClass(boolean z);

    int getAppVersionCode();

    Intent getAwemeWebIntent(Context context, Uri uri, Boolean bool, Boolean bool2);

    Class<? extends Activity> getDeepLinkHandlerActivityClass(boolean z, String str);

    List<AbstractC2420009e2> getDeeplinkCommands();

    Fragment getFollowFragmentCache();

    List<AbstractC2420009e2> getHighLevelCommands();

    Class<? extends Activity> getMainActivityClass();

    Intent getMainActivityIntent(Context context);

    String getMainLifecycleRegistryClassName();

    C0CCZ getMultiProcessMobEventTask();

    C0CCZ getObserverTabCheckTask();

    C0CCZ getPreloadInstanceTask();

    IEvent getPublishConcatMessage();

    Fragment getRecommendFragmentCache();

    <T> T getSP(Context context, Class<T> cls);

    String getSecurityUrl(String str);

    Map<String, Object> getSettings(List<String> list);

    Class<? extends Activity> getSplashActivityClass();

    Intent handleAmeWebViewBrowserForDeeplink(Context context, Uri uri, Boolean bool, Boolean bool2);

    boolean handleCarouselMultiJump(Context context, Aweme aweme, int i);

    boolean handleLiveSchema(String str, Context context);

    boolean hasAppByHttp(Context context, Uri uri);

    void hideUploadRecover();

    boolean isAppHot();

    boolean isAwemeAppDataEmpty();

    boolean isChattingMessageUri(String str);

    boolean isContainsKeyWithLruEntries();

    boolean isInActivity();

    boolean isLastPublishFailed();

    boolean isLimitAdTrackingEnabled();

    boolean isMainActivity(C19EG c19eg);

    @InterfaceC1294060jmO
    boolean isMainPage(Context context);

    boolean isMoveMainTrackersEnabled();

    boolean isNUJSingleActivityExpDeeplinkEnabled(Context context);

    boolean isNUJSingleActivityExpHit(Context context);

    boolean isNewUser(C19EG c19eg);

    boolean isOnFollowPage(Activity activity, Fragment fragment);

    boolean isReplaceAwemeCache();

    void logFeedRawAdClick(Context context, Aweme aweme, String str);

    Fragment obtainMainPageFragment();

    Fragment obtainSecondTabFragment();

    void onBackToOpenPlatform(BaseShortVideoContext baseShortVideoContext);

    void onBackToTikTokMusic(Activity activity);

    boolean openAdOpenUrl(Context context, String str, boolean z);

    boolean openAdTestUrl(Context context, String str, int i);

    boolean openAdWebUrl(Context context, String str, String str2);

    boolean openAppByHttpUri(Context context, Uri uri);

    Boolean openAppLinkHandlerV2ActivityClass(Context context, String str, String str2);

    void openAppWithLog(Context context, AwemeRawAd awemeRawAd, String str, boolean z);

    void openDeepLinkActivity(Context context, String str, String str2);

    boolean openFeedAdScheme(Context context, Aweme aweme, int i);

    boolean openFeedAdWebUrl(Context context, Aweme aweme, int i);

    boolean openFeedAdWebUrl(Context context, Aweme aweme, String str, String str2, int i);

    boolean openGooglePlayStore(Context context, Aweme aweme, String str, int i);

    void openPlatformDialog(C1402840mbq c1402840mbq, String str);

    boolean openPopUpWebPageWithViewShrink(Context context, Aweme aweme, int i, AdWebUrlDataFromJsb adWebUrlDataFromJsb);

    boolean openSystemBrowser(Context context, String str);

    void pendingDeepLinkLog(Function1<? super Boolean, Unit> function1);

    void preloadScene();

    void preloadStageTask(int i, Context context);

    void processPublishChallenges(BaseShortVideoContext baseShortVideoContext);

    void processPublishStickerIds(C19EG c19eg, String str);

    void registerModerationResultPush(Function1<? super String, Unit> function1);

    void releaseWindowBackgroundTask(Activity activity);

    InterfaceC1066660drc routerDepend();

    void saveShowAd(String str, String str2);

    boolean searchAdTransformOpen(Context context, Aweme aweme, int i);

    void setLastPublishFailed(boolean z);

    void setOptSmartAvatarBorderView(boolean z);

    void setOptSmartAvatarVideoBorderView(boolean z);

    void showConfirmDialogBeforeJumpTo3rdApp(Context context, Aweme aweme, String str);

    boolean startActivity(Context context, Intent intent);

    boolean startAdsAppActivity(Context context, String str, String str2);

    void startCleanEffect(Context context);

    void startVideoPlayActivity(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6, float f);

    void startupTestColdBootEnd();

    void trackAppsFlyerEvent(String str, String str2);

    String transferClickFromToRefer(int i);

    boolean tryShowIllegalUsernameDialog(String str, Runnable runnable, Runnable runnable2);

    boolean tryToGetApps(Context context, int i, String str, Aweme aweme, boolean z, boolean z2);

    boolean tryToOpenGPMiniCard(Context context, Aweme aweme, int i, boolean z, boolean z2);

    void unRegisterModerationResultPush();

    void updateIMUserFollowStatus(User user);

    boolean useSystemBrowserOpenWebPage(Context context, Aweme aweme, int i);

    public static final class DefaultImpls {
        public static /* synthetic */ boolean tryToOpenGPMiniCard$default(IMainService iMainService, Context context, Aweme aweme, int i, boolean z, boolean z2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 16) != 0) {
                    z2 = false;
                }
                return iMainService.tryToOpenGPMiniCard(context, aweme, i, z, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryToOpenGPMiniCard");
        }
    }
}
