package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C0IOU;
import X.C0IVM;
import X.InterfaceC1835090xr1;
import X.InterfaceC465210IMd;
import X.InterfaceC470090Ic3;
import X.InterfaceC588410N5z;
import X.InterfaceC671190QUj;
import android.content.Context;
import android.graphics.Rect;
import android.view.TextureView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;
import java.util.Map;
import java.util.Set;
import webcast.api.feed.SortStatsTag;

/* JADX INFO: loaded from: classes8.dex */
public interface IHostWatch extends C006A {
    void abortEnterRoomBoost();

    void addScreenShotListener();

    void cancelPTFTask(long j);

    long cleanLiveUnimportantGecko(boolean z);

    void clearSessionId(Long l);

    long commitPTFTask(String str, String str2, Runnable runnable);

    void deleteEnterRoomBoostCache(String str, long j, long j2);

    void deleteUnreadLiveCard(long j);

    void enqueueFlushTrigger(int i);

    int getAnchorPosition();

    InterfaceC465210IMd getAudioPlayerController();

    long getBackgroundTime();

    boolean getEnterRoomBoostEnable();

    int getEnterRoomBoostType();

    String getFollowWidgetType();

    InterfaceC671190QUj getILiveSearchService();

    boolean getIsFollowJumpToLive();

    boolean getIsFollowWidgetExp();

    Object getLiveFeature(String str, String str2, String str3);

    Rect getLiveIconRect();

    String getLiveScopedUserId();

    C0IOU getSearchComponent(String str);

    String getSessionId(Long l);

    Room getUnreadLiveCard(Set<Long> set, int i);

    InterfaceC470090Ic3 getVideoCleanPlayerController(TextureView textureView, String str, int i, InterfaceC1835090xr1 interfaceC1835090xr1, String str2, InterfaceC588410N5z interfaceC588410N5z);

    int getWidgetAnchorNum();

    Long hasUnreadLiveCard(Set<Long> set, int i);

    void initPitayaAfterUserTrigger();

    boolean isAppBackground();

    void markNearbyEnter();

    void mixLiveScrollToNextItem(boolean z);

    void onECMixFeedLiveFirstFrameRender(EnterRoomConfig enterRoomConfig, long j);

    void onFeedRequestTriggerFinish();

    /* bridge */ /* synthetic */ void onInit();

    void onSceneTriggerArrived(String str);

    void openWatchLaterHistoryActivity(Context context);

    void predictP95Strategy(String str, C0IVM c0ivm);

    void recordExitRoomId(long j);

    void removeScreenShotListener();

    void requestForEnterRoomBoost(EnterRoomConfig enterRoomConfig, Context context);

    void saveSessionId(Long l, String str);

    void searchScrollToNextItem(boolean z);

    void setIsFollowJumpToLive(boolean z);

    void updateMixLiveScrollStatus();

    void updateRecInfo(Map<String, ? extends List<SortStatsTag>> map);

    void updateRoomLists(String str, boolean z, int i, List<Long> list);

    void updateSearchScrollStatus();

    void watchLive(Context context, EnterRoomConfig enterRoomConfig, long j);

    void watchLive(Context context, EnterRoomConfig enterRoomConfig, String str);

    boolean watchLive(Context context, EnterRoomConfig enterRoomConfig);

    boolean watchLiveFromSchema(Context context, EnterRoomConfig enterRoomConfig);

    boolean watchLiveFromSchemaNoLogin(Context context, EnterRoomConfig enterRoomConfig, String str);
}
