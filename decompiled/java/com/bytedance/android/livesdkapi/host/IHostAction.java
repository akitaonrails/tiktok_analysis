package com.bytedance.android.livesdkapi.host;

import X.AbstractC1387200mCc;
import X.C006A;
import X.C0IK0;
import X.C0IKY;
import X.C0IKZ;
import X.C0IL8;
import X.C0J9U;
import X.C10JP;
import X.C10JS;
import X.C10JU;
import X.C11PQ;
import X.C157V;
import X.C1607950rwf;
import X.C19EG;
import X.C467050ITf;
import X.C758320Tos;
import X.InterfaceC1225900i0S;
import X.InterfaceC1226070i0j;
import X.InterfaceC1877670yxh;
import X.InterfaceC214902198i;
import X.InterfaceC464000IHm;
import X.InterfaceC475370IkZ;
import X.InterfaceC517340KQq;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.interact.MultiGuestLiveEvent;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.model.LivePreloadHighlightVideoModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface IHostAction extends C006A {
    void addNpthTag(String str, String str2);

    void addPauseTask(Runnable runnable);

    void anchorAutoSelection(Context context, JSONObject jSONObject);

    float calcTargetLoudness();

    boolean canOpen(String str);

    void clearShareLinkManagerData();

    void clearTask();

    Intent createBroadcastEndSafetyToolsIntent(C19EG c19eg, Uri uri);

    Intent createLiveStudioMonitorIntent(C19EG c19eg);

    void createNewNavi(String str, Function1<String, Unit> function1);

    Intent createOfflineRankIntent(C19EG c19eg, Bundle bundle);

    InterfaceC214902198i createStartBroadcastFragment(int i);

    Intent createStartBroadcastIntent(C19EG c19eg, int i);

    Fragment createTabletChatRootFragment(String str);

    void deleteAnchorShareList();

    void ensureGameDetailDesign();

    void enterGameMixInnerFlowPage(Context context, boolean z, String str, C1607950rwf c1607950rwf, Map<String, String> map, String str2, Float f);

    void finishLivePlayActivityAndGoLiveActivity();

    void finishOtherPage();

    AbstractC1387200mCc forceGetLiveTopPage();

    int getAllMUFIMUserSize();

    boolean getAudienceControlStatus();

    boolean getBgBroadcastServiceCreate();

    String getBgBroadcastServiceName();

    C11PQ<Integer> getBgBroadcastServiceState();

    Bitmap getBitmapFromUrl(String str);

    int getCachedSettingItemStatus(String str);

    Activity getCurrentActivity();

    Fragment getDetailSafRootFragment(View view);

    Fragment getDetailSafRootFragment(Fragment fragment);

    String getEnterFromMg(FeedItem feedItem);

    Object getFeature(String str, String str2, int i);

    Object getGameBottomLivePlayer();

    Object getGameBottomVideoPlayer();

    Object getGameLivePlayHelper();

    Object getGameMixAwemeVideosModel(Lifecycle lifecycle, boolean z);

    Class getHostActivity(int i);

    C157V getHostClientAiService();

    HandlerThread getHostHandlerThread();

    Class getHostRootFragment(int i);

    Intent getHostSingleActivityIntent(Context context, int i);

    Fragment getInviteGuestSelectorPanel(Context context, String str, String str2, String str3, String str4, String str5, String str6, List<User> list, List<User> list2, int i, int i2, boolean z, C0J9U c0j9u, InterfaceC1226070i0j interfaceC1226070i0j);

    List<C467050ITf> getLiveActivityTasksSetting();

    Class getLivePlayActivityClass();

    Class getLivePlayRootFragmentClass();

    InterfaceC464000IHm getLivePreloadService();

    String getLynxReportUrl(String str);

    HashMap<String, String> getMetaData(String str);

    View getNaviSkinToneView(Context context, List<Effect> list, int i, boolean z, Function1<Effect, Unit> function1);

    LivePodcastResponse.ResponseData getPodcastCache();

    Context getPreviousPageContext();

    boolean getPushLiveState();

    Boolean getPushSettingStatus(String str);

    AbstractC1387200mCc[] getRootPages();

    Activity getTopActivity();

    Context getTopContext();

    C19EG getTopFragmentActivity();

    FragmentManager getTopFragmentManager();

    AbstractC1387200mCc getTopPage();

    AbstractC1387200mCc getTopRootPage();

    Context getTopValidContext();

    void goEditDoBAgeGatePage(Activity activity, String str, C10JU c10ju);

    boolean handleSchema(Context context, String str, Bundle bundle);

    boolean handleSchema(Context context, String str, Bundle bundle, boolean z);

    boolean hasLivePermission();

    boolean hasLivePlayPage();

    void hideNotificationTipDialog(Context context);

    void initLiveInvitePushObserver();

    boolean isDetailOOMFixV2Enable();

    boolean isECVisible(Room room);

    boolean isLiveBroadcastActivityOnTop();

    boolean isLivePlayActivity(AbstractC1387200mCc abstractC1387200mCc);

    boolean isLivePlayActivity(Context context);

    boolean isLivePlayActivityOnTop();

    boolean isLivePlayRootFragment(AbstractC1387200mCc abstractC1387200mCc);

    boolean isNotificationEnabled(Context context);

    boolean isPartnershipNewAttrPointEnable();

    boolean isPrivateAccount();

    boolean isSupportFoldDevice();

    void jumpLivePlayActivityClearTop(Context context);

    void jumpToAgsStatusPage(Context context, String str);

    void jumpToFeedBack(Activity activity, long j, int i);

    boolean liveStrategyIsHttpDnsNotReady(int i);

    String localLanguage(Context context);

    void notifyShowLiveIconEntrance(boolean z);

    Boolean onBackPressByHomeBackPressListener(Fragment fragment);

    void onGeckoEventTrigger(String str, Map<String, Object> map);

    /* bridge */ /* synthetic */ void onInit();

    void onNaviMessageReceived(int i, int i2, int i3, String str, Function1<String, Unit> function1, Function1<Integer, Unit> function12);

    void onlyEmitAppLogEventToCaiEventStream(String str, JSONObject jSONObject);

    void openAiSummaryDescDialog(Context context, Map<String, String> map);

    void openAutoPostLivingPanelDialog(FragmentManager fragmentManager, String str);

    TuxSheet openBulletinPageWithSheet(String str, String str2, Map<String, String> map);

    void openCamera(Activity activity, int i, Uri uri, Boolean bool, Boolean bool2, float f);

    Fragment openContactorSelectorForVisibleScope(Context context, int i, int i2, boolean z, C758320Tos c758320Tos, InterfaceC1225900i0S interfaceC1225900i0S);

    void openESportsHighlightsVideoDetails(Context context, String str, String str2, String str3);

    void openEndPageCreateOrInviteGroupChatPanel(Context context, Uri uri, boolean z);

    void openFanGroupCreateChooseInvitePanel(Context context, Uri uri);

    void openFeedBack(String str, Context context);

    void openGroupChat(Context context, String str);

    void openLiveBrowser(String str, Bundle bundle, Context context);

    void openLiveBrowser(String str, String str2, Context context);

    void openLiveEventInviteGuestPanel(Activity activity, String str, long j, GetLiveEventUserResponse getLiveEventUserResponse, MultiGuestLiveEvent multiGuestLiveEvent);

    void openLiveReplaySettings(C19EG c19eg, int i, boolean z, String str);

    boolean openMixVideoLiveFeedPage(Context context, Map<String, String> map);

    void openPromotePage(String str, Context context, String str2);

    void openRegionListPage(Activity activity, C10JS c10js);

    void openReportContainer(Context context, String str, Function1<SparkContext, Unit> function1);

    void openShareUserProfilePage(long j, Map<String, String> map, Context context, String str);

    void openStoryDetail(Context context, String str, String str2, String str3, String str4);

    void openUserProfilePage(long j, Map<String, String> map);

    void openWallet(Activity activity);

    void preGetAnchorShareList(boolean z);

    void preloadLiveHighlightVideo(List<LivePreloadHighlightVideoModel> list);

    void preloadPromoteModule(String str, Context context);

    void releaseGoLiveManager();

    void report(Activity activity, Uri.Builder builder, Bundle bundle);

    void reportNpthBizException(String str, Throwable th, String str2, Map<String, String> map);

    void reportNpthBizException(String str, Throwable th, String str2, Map<String, String> map, Map<String, String> map2);

    void reportNpthBizException(String str, Throwable th, String str2, Map<String, String> map, Map<String, String> map2, boolean z);

    void reportNpthBizException(String str, Throwable th, String str2, Map<String, String> map, boolean z);

    void reportPushImprDurationTrack(HashMap<String, String> map, boolean z);

    void reportROI2Event(boolean z, String str, Map<String, String> map, n nVar);

    void requestAceAccountInfo(C0IK0 c0ik0, C0IKY c0iky, C0IKZ c0ikz);

    void setCurrentPage(int i);

    int setMetaData(String str, String str2, Map<String, String> map);

    void showAcePhoneBindDialog(Activity activity, C0IKY c0iky, C10JP c10jp);

    void showAutoPostLivingGuideSheet(String str, Context context, FragmentManager fragmentManager, Function0<Unit> function0);

    boolean showEngagementCount();

    void showLegacyToast(Context context, String str, long j, Boolean bool);

    void showNotificationTipDialog(int i, String str, String str2, String str3, String str4, int i2, View view, String str5, C0IL8 c0il8, boolean z, InterfaceC517340KQq interfaceC517340KQq);

    void showNotificationTipDialog(String str, String str2, String str3, String str4, int i, View view, String str5, C0IL8 c0il8, boolean z, InterfaceC517340KQq interfaceC517340KQq);

    void showNotificationTipDialogForSubJSB(Activity activity, String str, Map<String, String> map, int i, InterfaceC1877670yxh interfaceC1877670yxh);

    void startLivePlay(Context context, InterfaceC475370IkZ interfaceC475370IkZ);

    void startNaviOnboarding(Activity activity, View view, String str, boolean z);

    void startStoryEditFromLiveEvent(Context context, String str, String str2, Number number, String str3);

    boolean tryChangeShortVideoPlayingStatus(Boolean bool);

    void tryOpenAutoLogin(String str, String str2, String str3, Function2<Boolean, String, Unit> function2);

    void tryOpenFeedWithExtra(Context context, String str, Bundle bundle, Map<String, String> map);

    void tryOpenSystemNotificationSetting(Context context);

    void tryRequestAndShowAceBindPhoneDialog(C19EG c19eg, C0IK0 c0ik0, C0IKY c0iky, C10JP c10jp);

    void tryShowPushGuidePopup(Context context, String str, String str2, String str3);

    void updateSettingItem(String str, int i);

    void uploadNaviAsset(Context context, Bitmap bitmap, Function2<List<String>, String, Unit> function2);

    void whetherChangeSAFStatus();
}
