package com.bytedance.android.livesdk.liveroom;

import X.C086I;
import X.C0IJT;
import X.C0IKQ;
import X.C0IOL;
import X.C0ISF;
import X.C0ISJ;
import X.C0IU0;
import X.C11NZ;
import X.C11S5;
import X.C1338270kvh;
import X.C1701940uOG;
import X.C19748512Ol;
import X.C1C7U;
import X.C20441214yg;
import X.C2093608Ic;
import X.C21601619gM;
import X.C2188811AlT;
import X.C466490IRb;
import X.C467210ITv;
import X.C472830IgT;
import X.C474500IjA;
import X.C480460Ism;
import X.C786410Ut5;
import X.InterfaceC19483011Ki;
import X.InterfaceC420801kM;
import X.InterfaceC466550IRh;
import Y.AObserverS211S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.AfS132S0000000_7;
import Y.AfS176S0100000_7;
import Y.AfS3S0100200_7;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.live.api.RoomStatApi;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.android.livesdk.live.model.FilterInfoData;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.feed.FeedRefreshUnified;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveInnerFeedRefreshUnifiedSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveLoopCheckRoomTimeSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveNotRecommendLiveSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class RoomStatusController implements ISubController {
    public InterfaceC420801kM disposable;
    public boolean enableLongLinkCheckExp;
    public InterfaceC466550IRh hotRefreshCallback;
    public long mLastPauseTime;
    public C0IOL mListProvider;
    public final Runnable mRefreshRoomNRTimer;
    public final Runnable mRefreshRoomStatsTimer;
    public RoomStatsViewModel mRoomStatsViewModel;
    public C21601619gM mViewPager;
    public FeedRefreshUnified unifiedConfig;
    public static final long ROOM_REFRESH_TIME = LiveFeedRefreshTimeSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT;
    public static final long RECOMMEND_REFRESH_TIME = LiveLoopCheckRoomTimeSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT;
    public static int START = 1;
    public static int LOOP = 2;
    public static int SWIPE = 3;
    public final Handler mHandler = new BPEAHandler(Looper.getMainLooper());
    public List<String> currentStatus = new ArrayList();

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
    }

    private void resetRefreshTimer() {
        this.mHandler.removeCallbacks(this.mRefreshRoomStatsTimer);
        this.mHandler.removeCallbacks(this.mRefreshRoomNRTimer);
    }

    public List<Room> collectAllRoom() {
        if (this.mListProvider == null || this.mViewPager == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(100);
        List<Room> listLJJ = this.mListProvider.LJJ();
        ArrayList arrayList2 = new ArrayList();
        for (Room room : listLJJ) {
            if (room != null && !room.isVariantCard()) {
                arrayList2.add(room);
            }
        }
        if (!C0IKQ.LIZ(arrayList2)) {
            try {
                int currentItem = this.mListProvider.size() <= 0 ? -1 : this.mViewPager.getCurrentItem() % this.mListProvider.size();
                if (currentItem < 0 || currentItem >= arrayList2.size()) {
                    arrayList.addAll(arrayList2);
                    return arrayList;
                }
                arrayList.addAll(arrayList2.subList(Math.max(0, currentItem - 50), currentItem));
                arrayList.addAll(arrayList2.subList(currentItem + 1, Math.min(arrayList2.size(), currentItem + 50)));
                return arrayList;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return arrayList;
    }

    public List<Room> collectUnreadRoom() {
        int currentItem;
        if (this.mListProvider == null || this.mViewPager == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(50);
        ArrayList<Room> arrayList2 = new ArrayList(this.mListProvider.LJJ());
        if (!C0IKQ.LIZ(arrayList2)) {
            if (this.mListProvider.size() <= 0 || (currentItem = this.mViewPager.getCurrentItem() % this.mListProvider.size()) < 0 || currentItem >= arrayList2.size()) {
                for (Room room : arrayList2) {
                    if (room != null && !room.isShow) {
                        arrayList.add(room);
                    }
                }
            } else {
                int iMin = Math.min(arrayList2.size(), currentItem + 50);
                int i = currentItem + 1;
                if (i < iMin) {
                    while (i < iMin) {
                        Room room2 = (Room) ListProtector.get(arrayList2, i);
                        if (room2 != null && !room2.isShow) {
                            arrayList.add(room2);
                        }
                        i++;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
        if (this.mLastPauseTime <= 0 || System.currentTimeMillis() - this.mLastPauseTime < 300000) {
            return;
        }
        this.mHandler.removeCallbacks(this.mRefreshRoomStatsTimer);
        this.mRefreshRoomStatsTimer.run();
    }

    public void refreshRecommendTimer() {
        if (this.unifiedConfig.enable) {
            return;
        }
        this.mHandler.removeCallbacks(this.mRefreshRoomNRTimer);
        C786410Ut5.LJLIIL(RECOMMEND_REFRESH_TIME, this.mHandler, this.mRefreshRoomNRTimer);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestroy() {
        resetRefreshTimer();
        this.hotRefreshCallback = null;
        InterfaceC420801kM interfaceC420801kM = this.disposable;
        if (interfaceC420801kM == null || interfaceC420801kM.isDisposed()) {
            return;
        }
        this.disposable.dispose();
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onPause() {
        this.mLastPauseTime = System.currentTimeMillis();
    }

    public RoomStatusController(LiveRoomFragment liveRoomFragment) {
        this.unifiedConfig = new FeedRefreshUnified();
        C467210ITv.LIZ.getClass();
        this.enableLongLinkCheckExp = C467210ITv.LIZIZ.enable;
        this.mRefreshRoomStatsTimer = new Runnable() { // from class: X.0IgK
            public final void LIZ() {
                RoomStatusController roomStatusController = this.LL;
                if (roomStatusController.mListProvider == null || roomStatusController.mViewPager == null) {
                    return;
                }
                if (roomStatusController.enableLongLinkCheckExp) {
                    C467210ITv.LIZ.getClass();
                    if (!C467210ITv.LIZIZ.enablePoll && (this.LL.mListProvider instanceof C0ISJ)) {
                        return;
                    }
                }
                List<Room> listCollectAllRoom = this.LL.collectAllRoom();
                RoomStatusController roomStatusController2 = this.LL;
                roomStatusController2.mRoomStatsViewModel.getRoomStats(listCollectAllRoom, "toplive_timing_inspection", roomStatusController2.currentStatus, roomStatusController2.unifiedConfig.enable);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RoomStatusController@2513.<field>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RoomStatusController@2513.<field>$1");
            }
        };
        this.mRefreshRoomNRTimer = new ARunnableS107S0100000_7(this, 91);
        RoomStatsViewModel roomStatsViewModel = (RoomStatsViewModel) ViewModelProviders.of(liveRoomFragment, new ViewModelProvider.Factory() { // from class: X.0IgL
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                if (cls.isAssignableFrom(RoomStatsViewModel.class)) {
                    return new RoomStatsViewModel();
                }
                throw new IllegalArgumentException("Unknown ViewModel class");
            }
        }).get(RoomStatsViewModel.class);
        this.mRoomStatsViewModel = roomStatsViewModel;
        roomStatsViewModel.getRoomStatsResponse().observe(liveRoomFragment, new AObserverS211S0100000_7(this, 8));
        this.mRoomStatsViewModel.getRoomRecommendResponse().observe(liveRoomFragment, new AObserverS211S0100000_7(this, 9));
        this.mRoomStatsViewModel.getAllRoomStatusResponse().observe(liveRoomFragment, new AObserverS211S0100000_7(this, 10));
        this.unifiedConfig = LiveInnerFeedRefreshUnifiedSetting.getConfig();
    }

    public static /* synthetic */ void lambda$checkRoom$13(Throwable th) {
        C1C7U.LIZ("RoomStatusController@2513.checkRoom$2L");
        C1C7U.LIZIZ("RoomStatusController@2513.checkRoom$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshAllRoomStatus$2(Room room) {
        C1C7U.LIZ("RoomStatusController@2513.refreshAllRoomStatus$1L");
        C0IOL c0iol = this.mListProvider;
        if (c0iol != null) {
            c0iol.LJJIL(room.getId());
        }
        C1C7U.LIZIZ("RoomStatusController@2513.refreshAllRoomStatus$1L");
    }

    public static /* synthetic */ void lambda$refreshAllRoomStatus$3(Throwable th) {
        C1C7U.LIZ("RoomStatusController@2513.refreshAllRoomStatus$2L");
        C1C7U.LIZIZ("RoomStatusController@2513.refreshAllRoomStatus$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshRoomRecommendStats$10(Room room) {
        C1C7U.LIZ("RoomStatusController@2513.refreshRoomRecommendStats$1L");
        C0IOL c0iol = this.mListProvider;
        if (c0iol != null) {
            c0iol.LJJIL(room.getId());
        }
        C1C7U.LIZIZ("RoomStatusController@2513.refreshRoomRecommendStats$1L");
    }

    public static /* synthetic */ void lambda$refreshRoomRecommendStats$11(Throwable th) {
        C1C7U.LIZ("RoomStatusController@2513.refreshRoomRecommendStats$2L");
        C1C7U.LIZIZ("RoomStatusController@2513.refreshRoomRecommendStats$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshRoomStats$6(Room room) {
        C1C7U.LIZ("RoomStatusController@2513.refreshRoomStats$1L");
        C0IOL c0iol = this.mListProvider;
        if (c0iol != null) {
            c0iol.LJJIL(room.getId());
        }
        C1C7U.LIZIZ("RoomStatusController@2513.refreshRoomStats$1L");
    }

    public static /* synthetic */ void lambda$refreshRoomStats$7(Throwable th) {
        C1C7U.LIZ("RoomStatusController@2513.refreshRoomStats$2L");
        C1C7U.LIZIZ("RoomStatusController@2513.refreshRoomStats$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshAllRoomStatus(final Map<String, RoomStatsModel> map) {
        C0IOL c0iol = this.mListProvider;
        if (c0iol != null && c0iol.LJJ() != null) {
            C0IOL c0iol2 = this.mListProvider;
            if (c0iol2 instanceof C0ISJ) {
                c0iol2.LJIIL(new C0ISF() { // from class: X.0IgQ
                    @Override // X.C0ISF
                    public final boolean LIZ(Room room) {
                        return this.LIZ.lambda$refreshAllRoomStatus$1(room, map);
                    }
                });
            } else {
                C11NZ.LJJJJIZL(new ArrayList(this.mListProvider.LJJ())).LJJIL(new InterfaceC19483011Ki() { // from class: X.0IgR
                    @Override // X.InterfaceC19483011Ki
                    public final boolean test(Object obj) {
                        return this.LL.lambda$refreshAllRoomStatus$1((Room) obj, map);
                    }
                }).LJJLL(new AfS176S0100000_7(this, 76), new AfS132S0000000_7(21));
            }
            refreshTimer(LOOP);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshRoomRecommendStats(final Map<String, RoomStatsModel> map) {
        C0IOL c0iol = this.mListProvider;
        if (c0iol != null && c0iol.LJJ() != null) {
            C0IOL c0iol2 = this.mListProvider;
            if (c0iol2 instanceof C0ISJ) {
                c0iol2.LJIIL(new C0ISF() { // from class: X.0IgM
                    @Override // X.C0ISF
                    public final boolean LIZ(Room room) {
                        return this.LIZ.lambda$refreshRoomRecommendStats$9(room, map);
                    }
                });
            } else {
                C11NZ.LJJJJIZL(new ArrayList(this.mListProvider.LJJ())).LJJIL(new InterfaceC19483011Ki() { // from class: X.0IgN
                    @Override // X.InterfaceC19483011Ki
                    public final boolean test(Object obj) {
                        return this.LL.lambda$refreshRoomRecommendStats$9((Room) obj, map);
                    }
                }).LJJLL(new AfS176S0100000_7(this, 74), new AfS132S0000000_7(18));
            }
            refreshRecommendTimer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshRoomStats(final Map<String, RoomStatsModel> map) {
        C0IOL c0iol = this.mListProvider;
        if (c0iol != null && c0iol.LJJ() != null) {
            C0IOL c0iol2 = this.mListProvider;
            if (c0iol2 instanceof C0ISJ) {
                c0iol2.LJIIL(new C0ISF() { // from class: X.0IgO
                    @Override // X.C0ISF
                    public final boolean LIZ(Room room) {
                        return this.LIZ.lambda$refreshRoomStats$5(room, map);
                    }
                });
            } else {
                C11NZ.LJJJJIZL(new ArrayList(this.mListProvider.LJJ())).LJJIL(new InterfaceC19483011Ki() { // from class: X.0IgP
                    @Override // X.InterfaceC19483011Ki
                    public final boolean test(Object obj) {
                        return this.LL.lambda$refreshRoomStats$5((Room) obj, map);
                    }
                }).LJJLL(new AfS176S0100000_7(this, 75), new AfS132S0000000_7(19));
            }
            refreshTimer(LOOP);
        }
    }

    public void checkRoom(int i) {
        boolean zLJI = MethodIDManager.LJI(202279);
        InterfaceC420801kM interfaceC420801kM = this.disposable;
        if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
            this.disposable.dispose();
        }
        C0IOL c0iol = this.mListProvider;
        if (c0iol == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        int size = c0iol.size();
        if (i >= 0 && i < size) {
            Room roomLJIIJJI = this.mListProvider.LJIIJJI(i);
            if (roomLJIIJJI != null && !roomLJIIJJI.isVariantCard()) {
                long id = 0;
                if (roomLJIIJJI.getId() != 0) {
                    long id2 = roomLJIIJJI.getId();
                    if (roomLJIIJJI.getOwner() != null) {
                        id = roomLJIIJJI.getOwner().getId();
                    }
                    C480460Ism.LIZ().getClass();
                    this.disposable = ((RoomStatApi) C480460Ism.LIZLLL(RoomStatApi.class)).checkRoom(String.valueOf(id2), "toplive_inspection").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS3S0100200_7(id, id2, this, 0), new AfS132S0000000_7(20));
                }
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public boolean getCurrentCheckConfig(EnterRoomConfig enterRoomConfig) {
        this.currentStatus.clear();
        boolean zLIZ = C0IU0.LIZ(enterRoomConfig);
        if (RemoveNotRecommendLiveSetting.INSTANCE.enable()) {
            if (zLIZ) {
                this.currentStatus.add("nr");
                this.currentStatus.add("pause");
            }
        } else if (zLIZ) {
            this.currentStatus.add("pause");
        }
        this.currentStatus.add("nostream");
        return !C086I.LIZIZ(this.currentStatus);
    }

    public void refreshTimer(int i) {
        if (i == SWIPE && this.unifiedConfig.removeSwipeRefresh) {
            return;
        }
        this.mHandler.removeCallbacks(this.mRefreshRoomStatsTimer);
        C786410Ut5.LJLIIL(ROOM_REFRESH_TIME, this.mHandler, this.mRefreshRoomStatsTimer);
    }

    public void setHotRefreshCallback(InterfaceC466550IRh interfaceC466550IRh) {
        boolean z;
        this.hotRefreshCallback = interfaceC466550IRh;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init/register_negative_signal_callback hasCallback=");
        if (interfaceC466550IRh != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public void setListProvider(C0IOL c0iol) {
        this.mListProvider = c0iol;
    }

    public void setViewPager(C21601619gM c21601619gM) {
        this.mViewPager = c21601619gM;
    }

    public void startCheckTimer(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig != null && getCurrentCheckConfig(enterRoomConfig)) {
            refreshRecommendTimer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkAlive, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public boolean lambda$refreshRoomStats$5(Room room, Map<String, RoomStatsModel> map) {
        long id;
        if (room != null) {
            String strValueOf = String.valueOf(room.getId());
            if (map.containsKey(strValueOf) && !map.get(strValueOf).alive) {
                if (room.getOwner() != null) {
                    id = room.getOwner().getId();
                } else {
                    id = 0;
                }
                if (handleHotRefreshSignal(room.getId(), id, 4L)) {
                    return false;
                }
                reportDeleteRoom(room.getId(), id, "fixedtime_inspection");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkAllStatus, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public boolean lambda$refreshAllRoomStatus$1(Room room, Map<String, RoomStatsModel> map) {
        if (!lambda$refreshRoomStats$5(room, map) && !lambda$refreshRoomRecommendStats$9(room, map)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkNR, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public boolean lambda$refreshRoomRecommendStats$9(Room room, Map<String, RoomStatsModel> map) {
        FilterInfoData filterInfoData;
        long j;
        RoomStatsModel roomStatsModel = map.get(String.valueOf(room.getId()));
        if (roomStatsModel == null || (filterInfoData = roomStatsModel.filterInfo) == null || !filterInfoData.isFiltered) {
            return false;
        }
        String str = filterInfoData.reason;
        long id = 0;
        if (C2093608Ic.LIZJ(str, "nostream")) {
            if (room.getOwner() != null) {
                id = room.getOwner().getId();
            }
            if (handleHotRefreshSignal(room.getId(), id, 8L)) {
                return false;
            }
            logLiveDelete(room, str);
            return true;
        }
        if (!room.isShow) {
            if (room.getOwner() != null) {
                id = room.getOwner().getId();
            }
            if (C2093608Ic.LIZJ(str, "nr")) {
                j = 101;
            } else {
                j = 3;
            }
            if (handleHotRefreshSignal(room.getId(), id, j)) {
                return false;
            }
            logLiveDelete(room, str);
        }
        return !room.isShow;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void logLiveDelete(com.bytedance.android.livesdkapi.depend.model.live.Room r6, java.lang.String r7) {
        /*
            r5 = this;
            r7.getClass()
            int r4 = r7.hashCode()
            r0 = 3524(0xdc4, float:4.938E-42)
            r2 = 2
            r1 = 1
            java.lang.String r3 = "nr"
            if (r4 == r0) goto L7f
            r0 = 106440182(0x65825f6, float:4.0652974E-35)
            if (r4 == r0) goto L75
            r0 = 1567246465(0x5d6a4881, float:1.0551178E18)
            if (r4 != r0) goto L87
            java.lang.String r0 = "nostream"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L87
            r0 = 2
        L22:
            r4 = 0
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L72
            if (r0 == r2) goto L6f
            r3 = r4
        L2a:
            com.bytedance.android.live.base.model.user.User r0 = r6.getOwner()
            if (r0 == 0) goto L3c
            com.bytedance.android.live.base.model.user.User r0 = r6.getOwner()
            long r0 = r0.getId()
            java.lang.String r4 = java.lang.String.valueOf(r0)
        L3c:
            double r0 = com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting.getSAMPLE_100()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "livesdk_live_delete"
            X.0IjA r2 = X.C0IJT.LIZIZ(r0, r1)
            r2.LJIL()
            long r0 = r6.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "del_room_id"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "del_anchor_id"
            r2.LJJII(r4, r0)
            java.lang.String r1 = "del_type"
            java.lang.String r0 = "draw"
            r2.LJJII(r0, r1)
            java.lang.String r0 = "del_reason"
            r2.LJJII(r3, r0)
            r2.LIZ()
            return
        L6f:
            java.lang.String r3 = "disconnected"
            goto L2a
        L72:
            java.lang.String r3 = "paused"
            goto L2a
        L75:
            java.lang.String r0 = "pause"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L87
            r0 = 1
            goto L22
        L7f:
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L87
            r0 = 0
            goto L22
        L87:
            r0 = -1
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.liveroom.RoomStatusController.logLiveDelete(com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String):void");
    }

    private boolean handleHotRefreshSignal(long j, long j2, long j3) {
        InnerFlowHotRefreshController innerFlowHotRefreshController;
        InterfaceC466550IRh interfaceC466550IRh = this.hotRefreshCallback;
        if (interfaceC466550IRh == null || (innerFlowHotRefreshController = ((C466490IRb) interfaceC466550IRh).LIZ.LLILZ) == null || !innerFlowHotRefreshController.onNegativeSignal(j, j2, j3)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$checkRoom$12(long j, long j2, C472830IgT c472830IgT) {
        C1C7U.LIZ("RoomStatusController@2513.checkRoom$1L");
        if (!C0IKQ.LIZ(c472830IgT.data)) {
            RoomStatsModel roomStatsModel = (RoomStatsModel) ListProtector.get(c472830IgT.data, 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttlivesdk room status controller check room status, model:");
            sbLIZ.append(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, roomStatsModel));
            C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (roomStatsModel != null && !roomStatsModel.alive && this.mListProvider != null && !handleHotRefreshSignal(roomStatsModel.roomId, j, 4L)) {
                this.mListProvider.LJJIL(roomStatsModel.roomId);
                reportDeleteRoom(j2, j, "inspection");
            }
        }
        C1C7U.LIZIZ("RoomStatusController@2513.checkRoom$1L");
    }

    private void reportDeleteRoom(long j, long j2, String str) {
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_finish_delete", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJJII(Long.valueOf(j), "delete_room_id");
        c474500IjALIZIZ.LJJII(Long.valueOf(j2), "delete_anchor_id");
        c474500IjALIZIZ.LJJII(str, "delete_type");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        } else {
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJJIJL();
        }
    }

    public void mockInjectNegativeSignal(long j, long j2, long j3) {
        Map<String, Object> map = C1338270kvh.LIZ;
    }
}
