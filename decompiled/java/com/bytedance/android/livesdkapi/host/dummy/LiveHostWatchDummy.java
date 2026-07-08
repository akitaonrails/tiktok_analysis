package com.bytedance.android.livesdkapi.host.dummy;

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
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;
import java.util.Map;
import java.util.Set;
import webcast.api.feed.SortStatsTag;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostWatchDummy implements IHostWatch {
    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void abortEnterRoomBoost() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void addScreenShotListener() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void cancelPTFTask(long j) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final long cleanLiveUnimportantGecko(boolean z) {
        return 0L;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void clearSessionId(Long l) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final long commitPTFTask(String str, String str2, Runnable runnable) {
        return -1L;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void deleteEnterRoomBoostCache(String str, long j, long j2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void deleteUnreadLiveCard(long j) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void enqueueFlushTrigger(int i) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final int getAnchorPosition() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final InterfaceC465210IMd getAudioPlayerController() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final long getBackgroundTime() {
        return 0L;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean getEnterRoomBoostEnable() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final int getEnterRoomBoostType() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final String getFollowWidgetType() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final InterfaceC671190QUj getILiveSearchService() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean getIsFollowJumpToLive() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean getIsFollowWidgetExp() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final Object getLiveFeature(String str, String str2, String str3) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final String getLiveScopedUserId() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final String getSessionId(Long l) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final Room getUnreadLiveCard(Set<Long> set, int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final InterfaceC470090Ic3 getVideoCleanPlayerController(TextureView textureView, String str, int i, InterfaceC1835090xr1 interfaceC1835090xr1, String str2, InterfaceC588410N5z interfaceC588410N5z) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final int getWidgetAnchorNum() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final Long hasUnreadLiveCard(Set<Long> set, int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void initPitayaAfterUserTrigger() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean isAppBackground() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void markNearbyEnter() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void mixLiveScrollToNextItem(boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void onECMixFeedLiveFirstFrameRender(EnterRoomConfig enterRoomConfig, long j) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void onFeedRequestTriggerFinish() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void onSceneTriggerArrived(String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void openWatchLaterHistoryActivity(Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void predictP95Strategy(String str, C0IVM c0ivm) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void recordExitRoomId(long j) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void removeScreenShotListener() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void requestForEnterRoomBoost(EnterRoomConfig enterRoomConfig, Context context) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void saveSessionId(Long l, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void searchScrollToNextItem(boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void setIsFollowJumpToLive(boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void updateMixLiveScrollStatus() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void updateRecInfo(Map<String, ? extends List<SortStatsTag>> map) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void updateRoomLists(String str, boolean z, int i, List<Long> list) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void updateSearchScrollStatus() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void watchLive(Context context, EnterRoomConfig enterRoomConfig, long j) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final void watchLive(Context context, EnterRoomConfig enterRoomConfig, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean watchLive(Context context, EnterRoomConfig enterRoomConfig) {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean watchLiveFromSchema(Context context, EnterRoomConfig enterRoomConfig) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final boolean watchLiveFromSchemaNoLogin(Context context, EnterRoomConfig enterRoomConfig, String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final Rect getLiveIconRect() {
        return new Rect();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostWatch
    public final C0IOU getSearchComponent(String str) {
        return new C0IOU() { // from class: X.0IVN
            @Override // X.C0IOU
            public final boolean LJIIJJI() {
                return false;
            }

            @Override // X.C0IOU
            public final void LJIIL(long j) {
            }

            @Override // X.C0IOU
            public final void LJIILIIL(long j) {
            }

            @Override // X.C0IOU
            public final void LJIILL(int i, C0IOT c0iot) {
            }

            @Override // X.C0IOU
            public final void LJIILLIIL(Map<String, String> map) {
            }

            @Override // X.C0IOU
            public final void release() {
            }

            @Override // X.C0IOU
            public final List<EnterRoomConfig> LJIILJJIL() {
                return C13BV.INSTANCE;
            }
        };
    }
}
