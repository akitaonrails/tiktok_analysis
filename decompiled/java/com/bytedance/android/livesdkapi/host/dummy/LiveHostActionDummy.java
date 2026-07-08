package com.bytedance.android.livesdkapi.host.dummy;

import X.AbstractC1387200mCc;
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
import X.C781420Ul2;
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
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.model.LivePreloadHighlightVideoModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
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
public class LiveHostActionDummy implements IHostAction {
    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void addNpthTag(String str, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void addPauseTask(Runnable runnable) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void anchorAutoSelection(Context context, JSONObject jSONObject) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final float calcTargetLoudness() {
        return 0.0f;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean canOpen(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void clearShareLinkManagerData() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void clearTask() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void createNewNavi(String str, Function1<String, Unit> function1) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final InterfaceC214902198i createStartBroadcastFragment(int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Fragment createTabletChatRootFragment(String str) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void deleteAnchorShareList() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void ensureGameDetailDesign() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void enterGameMixInnerFlowPage(Context context, boolean z, String str, C1607950rwf c1607950rwf, Map<String, String> map, String str2, Float f) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void finishLivePlayActivityAndGoLiveActivity() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void finishOtherPage() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final AbstractC1387200mCc forceGetLiveTopPage() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final int getAllMUFIMUserSize() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean getAudienceControlStatus() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean getBgBroadcastServiceCreate() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final String getBgBroadcastServiceName() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final C11PQ<Integer> getBgBroadcastServiceState() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Bitmap getBitmapFromUrl(String str) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final int getCachedSettingItemStatus(String str) {
        return -1;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Activity getCurrentActivity() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Fragment getDetailSafRootFragment(View view) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Fragment getDetailSafRootFragment(Fragment fragment) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final String getEnterFromMg(FeedItem feedItem) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Object getFeature(String str, String str2, int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Object getGameBottomLivePlayer() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Object getGameBottomVideoPlayer() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Object getGameLivePlayHelper() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Object getGameMixAwemeVideosModel(Lifecycle lifecycle, boolean z) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final C157V getHostClientAiService() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Class getHostRootFragment(int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Intent getHostSingleActivityIntent(Context context, int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Fragment getInviteGuestSelectorPanel(Context context, String str, String str2, String str3, String str4, String str5, String str6, List<User> list, List<User> list2, int i, int i2, boolean z, C0J9U c0j9u, InterfaceC1226070i0j interfaceC1226070i0j) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Class getLivePlayActivityClass() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Class getLivePlayRootFragmentClass() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final InterfaceC464000IHm getLivePreloadService() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final /* synthetic */ String getLynxReportUrl(String str) {
        return C781420Ul2.LIZ(this, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final HashMap<String, String> getMetaData(String str) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final LivePodcastResponse.ResponseData getPodcastCache() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Context getPreviousPageContext() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean getPushLiveState() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final AbstractC1387200mCc[] getRootPages() {
        return new AbstractC1387200mCc[0];
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Activity getTopActivity() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Context getTopContext() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final C19EG getTopFragmentActivity() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final FragmentManager getTopFragmentManager() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final AbstractC1387200mCc getTopPage() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final AbstractC1387200mCc getTopRootPage() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Context getTopValidContext() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void goEditDoBAgeGatePage(Activity activity, String str, C10JU c10ju) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean handleSchema(Context context, String str, Bundle bundle) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean handleSchema(Context context, String str, Bundle bundle, boolean z) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean hasLivePermission() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean hasLivePlayPage() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void hideNotificationTipDialog(Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void initLiveInvitePushObserver() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isDetailOOMFixV2Enable() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isECVisible(Room room) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isLiveBroadcastActivityOnTop() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isLivePlayActivity(AbstractC1387200mCc abstractC1387200mCc) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isLivePlayActivity(Context context) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isLivePlayActivityOnTop() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isLivePlayRootFragment(AbstractC1387200mCc abstractC1387200mCc) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isNotificationEnabled(Context context) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isPartnershipNewAttrPointEnable() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isPrivateAccount() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean isSupportFoldDevice() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void jumpLivePlayActivityClearTop(Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void jumpToAgsStatusPage(Context context, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void jumpToFeedBack(Activity activity, long j, int i) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean liveStrategyIsHttpDnsNotReady(int i) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final String localLanguage(Context context) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void notifyShowLiveIconEntrance(boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void onGeckoEventTrigger(String str, Map<String, Object> map) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void onNaviMessageReceived(int i, int i2, int i3, String str, Function1<String, Unit> function1, Function1<Integer, Unit> function12) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void onlyEmitAppLogEventToCaiEventStream(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openAiSummaryDescDialog(Context context, Map<String, String> map) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openAutoPostLivingPanelDialog(FragmentManager fragmentManager, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final TuxSheet openBulletinPageWithSheet(String str, String str2, Map<String, String> map) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openCamera(Activity activity, int i, Uri uri, Boolean bool, Boolean bool2, float f) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Fragment openContactorSelectorForVisibleScope(Context context, int i, int i2, boolean z, C758320Tos c758320Tos, InterfaceC1225900i0S interfaceC1225900i0S) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openESportsHighlightsVideoDetails(Context context, String str, String str2, String str3) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final /* synthetic */ void openEndPageCreateOrInviteGroupChatPanel(Context context, Uri uri, boolean z) {
        C781420Ul2.LIZJ(this, context, uri, z);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final /* synthetic */ void openFanGroupCreateChooseInvitePanel(Context context, Uri uri) {
        C781420Ul2.LIZLLL(this, context, uri);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openFeedBack(String str, Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final /* synthetic */ void openGroupChat(Context context, String str) {
        C781420Ul2.LJ(this, context, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveBrowser(String str, Bundle bundle, Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveBrowser(String str, String str2, Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final /* synthetic */ void openLiveEventInviteGuestPanel(Activity activity, String str, long j, GetLiveEventUserResponse getLiveEventUserResponse, MultiGuestLiveEvent multiGuestLiveEvent) {
        C781420Ul2.LJFF(this, activity, str, j, getLiveEventUserResponse, multiGuestLiveEvent);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openLiveReplaySettings(C19EG c19eg, int i, boolean z, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean openMixVideoLiveFeedPage(Context context, Map<String, String> map) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openPromotePage(String str, Context context, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openRegionListPage(Activity activity, C10JS c10js) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final /* synthetic */ void openReportContainer(Context context, String str, Function1 function1) {
        C781420Ul2.LJI(this, context, str, function1);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openShareUserProfilePage(long j, Map<String, String> map, Context context, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openStoryDetail(Context context, String str, String str2, String str3, String str4) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openUserProfilePage(long j, Map<String, String> map) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void openWallet(Activity activity) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void preGetAnchorShareList(boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void preloadLiveHighlightVideo(List<LivePreloadHighlightVideoModel> list) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void preloadPromoteModule(String str, Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void releaseGoLiveManager() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void report(Activity activity, Uri.Builder builder, Bundle bundle) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void reportNpthBizException(String str, Throwable th, String str2, Map<String, String> map) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void reportNpthBizException(String str, Throwable th, String str2, Map<String, String> map, Map<String, String> map2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void reportNpthBizException(String str, Throwable th, String str2, Map<String, String> map, Map<String, String> map2, boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void reportNpthBizException(String str, Throwable th, String str2, Map<String, String> map, boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void reportPushImprDurationTrack(HashMap<String, String> map, boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void reportROI2Event(boolean z, String str, Map<String, String> map, n nVar) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void requestAceAccountInfo(C0IK0 c0ik0, C0IKY c0iky, C0IKZ c0ikz) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void setCurrentPage(int i) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final int setMetaData(String str, String str2, Map<String, String> map) {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void showAcePhoneBindDialog(Activity activity, C0IKY c0iky, C10JP c10jp) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void showAutoPostLivingGuideSheet(String str, Context context, FragmentManager fragmentManager, Function0<Unit> function0) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean showEngagementCount() {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void showLegacyToast(Context context, String str, long j, Boolean bool) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void showNotificationTipDialog(int i, String str, String str2, String str3, String str4, int i2, View view, String str5, C0IL8 c0il8, boolean z, InterfaceC517340KQq interfaceC517340KQq) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void showNotificationTipDialog(String str, String str2, String str3, String str4, int i, View view, String str5, C0IL8 c0il8, boolean z, InterfaceC517340KQq interfaceC517340KQq) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void showNotificationTipDialogForSubJSB(Activity activity, String str, Map<String, String> map, int i, InterfaceC1877670yxh interfaceC1877670yxh) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void startLivePlay(Context context, InterfaceC475370IkZ interfaceC475370IkZ) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void startNaviOnboarding(Activity activity, View view, String str, boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void startStoryEditFromLiveEvent(Context context, String str, String str2, Number number, String str3) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final boolean tryChangeShortVideoPlayingStatus(Boolean bool) {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void tryOpenAutoLogin(String str, String str2, String str3, Function2<Boolean, String, Unit> function2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void tryOpenFeedWithExtra(Context context, String str, Bundle bundle, Map<String, String> map) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void tryOpenSystemNotificationSetting(Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void tryRequestAndShowAceBindPhoneDialog(C19EG c19eg, C0IK0 c0ik0, C0IKY c0iky, C10JP c10jp) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void tryShowPushGuidePopup(Context context, String str, String str2, String str3) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void updateSettingItem(String str, int i) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void uploadNaviAsset(Context context, Bitmap bitmap, Function2<List<String>, String, Unit> function2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final void whetherChangeSAFStatus() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final HandlerThread getHostHandlerThread() {
        return new HandlerThread("");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final List<C467050ITf> getLiveActivityTasksSetting() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Intent createLiveStudioMonitorIntent(C19EG c19eg) {
        return new Intent();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Class getHostActivity(int i) {
        return Object.class;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Boolean getPushSettingStatus(String str) {
        return Boolean.FALSE;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Boolean onBackPressByHomeBackPressListener(Fragment fragment) {
        return Boolean.FALSE;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Intent createBroadcastEndSafetyToolsIntent(C19EG c19eg, Uri uri) {
        return new Intent();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Intent createOfflineRankIntent(C19EG c19eg, Bundle bundle) {
        return new Intent();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final Intent createStartBroadcastIntent(C19EG c19eg, int i) {
        return new Intent();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public final View getNaviSkinToneView(Context context, List<Effect> list, int i, boolean z, Function1<Effect, Unit> function1) {
        return new View(context);
    }
}
