package com.bytedance.android.livesdk.liveroom;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C0IOL;
import X.C0ISJ;
import X.C0ITO;
import X.C0IU0;
import X.C0UO0;
import X.C1338270kvh;
import X.C189200o6;
import X.C2188811AlT;
import X.C452501pT;
import X.C474500IjA;
import X.C480460Ism;
import X.InterfaceC1631620sYq;
import Y.AfS132S0000000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.dataChannel.GlobalRoomMessage;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveNotRecommendLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.RoomScreenStatusObserveNewSetting;
import com.bytedance.android.livesdk.setting.RoomStatusControllerV2MemoryOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.feed.LiveFeedDataStateApi;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class RoomStatusControllerV2 implements ISubController, LifecycleOwner {
    public static final C0ITO Companion = new Object() { // from class: X.0ITO
    };
    public EnterRoomConfig enterRoomConfig;
    public InterfaceC1631620sYq<? super Long, ? super Long, ? super Long, Boolean> hotRefreshCallback;
    public boolean isRegistered;
    public C0IOL listProvider;
    public final LiveRoomFragment liveRoomFragment;
    public final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    public final Set<Long> noStreamRoomSet = new LinkedHashSet();
    public final Set<Long> blackStreamRoomSet = new LinkedHashSet();
    public final Map<Long, Long> blackStreamTimestampMap = new LinkedHashMap();
    public final Map<Long, Long> blackStreamUpdatedTimestamp = new LinkedHashMap();
    public final Set<String> currentStatus = new LinkedHashSet();
    public final C01GW enableLongLinkStateCheck$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(55));
    public final C01GW enableEnhance$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(54));
    public final C01GW enableMarkOpt$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(56));

    private final Set<String> getCheckConfig() {
        this.currentStatus.clear();
        EnterRoomConfig enterRoomConfig = this.enterRoomConfig;
        if (enterRoomConfig == null) {
            return this.currentStatus;
        }
        boolean zLIZ = C0IU0.LIZ(enterRoomConfig);
        if (RemoveNotRecommendLiveSetting.INSTANCE.enable()) {
            if (zLIZ) {
                this.currentStatus.add("nr");
                this.currentStatus.add("pause");
            }
        } else if (zLIZ) {
            this.currentStatus.add("pause");
        }
        return this.currentStatus;
    }

    private final String resolveEntryType() {
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig enterRoomConfig = this.enterRoomConfig;
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.mRoomsData) == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = roomsData.enterFromMerge;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append('_');
        String str2 = roomsData.enterMethod;
        sbLIZ.append(str2 != null ? str2 : "");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getEnableEnhance() {
        return ((Boolean) this.enableEnhance$delegate.getValue()).booleanValue();
    }

    public final boolean getEnableLongLinkStateCheck() {
        return ((Boolean) this.enableLongLinkStateCheck$delegate.getValue()).booleanValue();
    }

    public final boolean getEnableMarkOpt() {
        return ((Boolean) this.enableMarkOpt$delegate.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
        this.lifecycleRegistry.setCurrentState(Lifecycle.State.INITIALIZED);
    }

    public final void observeAndUpdateRoomState() {
        DataChannelGlobal.LLILZ.BQ2(this, this.liveRoomFragment, GlobalRoomMessage.class, new AwS586S0100000_7(this, 156));
        this.isRegistered = true;
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestroy() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.hotRefreshCallback = null;
        if (this.isRegistered && RoomStatusControllerV2MemoryOptSetting.enable()) {
            DataChannelGlobal.LLILZ.zQ2(this);
            this.isRegistered = false;
        }
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onPause() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    public final boolean isOnlineDropEnabled() {
        return LiveInnerFlowHotRefreshSetting.isOnlineDropTriggerEnable(resolveEntryType());
    }

    public final boolean isPreNRConfigSatisfy() {
        return getCheckConfig().contains("nr");
    }

    public final boolean isPrePauseConfigSatisfy() {
        return getCheckConfig().contains("pause");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public final LiveRoomFragment getLiveRoomFragment() {
        return this.liveRoomFragment;
    }

    public RoomStatusControllerV2(LiveRoomFragment liveRoomFragment) {
        this.liveRoomFragment = liveRoomFragment;
    }

    public final boolean isRoomShowed(Long l) {
        C0IOL c0iol;
        List<Room> listLJJ;
        if (l != null && (c0iol = this.listProvider) != null && (listLJJ = c0iol.LJJ()) != null) {
            try {
                int size = listLJJ.size();
                for (int i = 0; i < size; i++) {
                    Room room = listLJJ.get(i);
                    if (room != null && room.getId() == l.longValue()) {
                        return room.isShow;
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return false;
    }

    public final void setEnterRoomConfig(EnterRoomConfig enterRoomConfig) {
        this.enterRoomConfig = enterRoomConfig;
        if (enterRoomConfig != null) {
            C0IU0.LIZ(enterRoomConfig);
        }
    }

    public final void setHotRefreshCallback(InterfaceC1631620sYq<? super Long, ? super Long, ? super Long, Boolean> interfaceC1631620sYq) {
        boolean z;
        this.hotRefreshCallback = interfaceC1631620sYq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init/register_negative_signal_callback hasCallback=");
        if (interfaceC1631620sYq != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setListProvider(C0IOL c0iol) {
        this.listProvider = c0iol;
    }

    public final void mockInjectNegativeSignal(long j, long j2, long j3) {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public final void removeNotProperStateRoom(long j, long j2, long j3) {
        C0IOL c0iol = this.listProvider;
        if (c0iol != null && (c0iol instanceof C0ISJ)) {
            InterfaceC1631620sYq<? super Long, ? super Long, ? super Long, Boolean> interfaceC1631620sYq = this.hotRefreshCallback;
            if (interfaceC1631620sYq != null && interfaceC1631620sYq.invoke(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)).booleanValue()) {
                return;
            }
            C0IOL c0iol2 = this.listProvider;
            if (c0iol2 != null) {
                c0iol2.LJJIL(j);
            }
            reportDeleteRoom(j, j2, "inflow_long_link_check", j3);
        }
    }

    private final void reportDeleteRoom(long j, long j2, String str, long j3) {
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_finish_delete", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJJII(Long.valueOf(j), "delete_room_id");
        c474500IjALIZIZ.LJJII(Long.valueOf(j2), "delete_anchor_id");
        c474500IjALIZIZ.LJJII(str, "delete_type");
        c474500IjALIZIZ.LJJII(Long.valueOf(j3), "delete_reason");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        } else {
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJJIJL();
        }
        if (j3 == -1) {
            C480460Ism.LIZ().getClass();
            ((LiveFeedDataStateApi) C480460Ism.LIZIZ(LiveFeedDataStateApi.class)).collectUnreadRequest("black_stream", String.valueOf(j)).LJIILIIL(new C0UO0()).LJJLL(new AfS132S0000000_7(17), new C09JN() { // from class: X.0ITN
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RoomStatusControllerV2@20d0.reportDeleteRoom$2");
                    C1C7U.LIZIZ("RoomStatusControllerV2@20d0.reportDeleteRoom$2");
                }
            });
        }
    }

    public final void removeNoStreamRoom(int i, boolean z, int i2, boolean z2) {
        C0IOL c0iol;
        Room roomLJIIJJI;
        long j;
        long jLongValue;
        boolean z3;
        int i3 = i;
        if (RoomScreenStatusObserveNewSetting.enableBlackStreamRemove() && !this.blackStreamRoomSet.isEmpty()) {
            this.noStreamRoomSet.addAll(this.blackStreamRoomSet);
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        C0IOL c0iol2 = this.listProvider;
        if (c0iol2 == null || c0iol2.LJJ() == null || this.noStreamRoomSet.isEmpty() || i2 < 1) {
            return;
        }
        int i4 = 1;
        while (true) {
            if (z) {
                i3++;
            } else {
                i3--;
            }
            if (i3 >= 0 && (c0iol = this.listProvider) != null && (roomLJIIJJI = c0iol.LJIIJJI(i3)) != null) {
                long id = roomLJIIJJI.getId();
                long ownerUserId = roomLJIIJJI.getOwnerUserId();
                if (isRoomShowed(Long.valueOf(id)) && !this.blackStreamRoomSet.contains(Long.valueOf(id))) {
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                    return;
                }
                if (this.noStreamRoomSet.contains(Long.valueOf(id)) && (this.listProvider instanceof C0ISJ) && (!RoomScreenStatusObserveNewSetting.enableQuickSlideCheck() || !this.blackStreamRoomSet.contains(Long.valueOf(id)) || z2)) {
                    if (this.blackStreamRoomSet.contains(Long.valueOf(id))) {
                        Long l = this.blackStreamTimestampMap.get(Long.valueOf(id));
                        if (l != null) {
                            long jLongValue2 = l.longValue();
                            if (jLongValue2 <= 0) {
                                return;
                            }
                            long jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - jLongValue2;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            Long l2 = this.blackStreamUpdatedTimestamp.get(Long.valueOf(id));
                            if (l2 != null) {
                                jLongValue = l2.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            if (jCurrentTimeMillis2 - jLongValue > RoomScreenStatusObserveNewSetting.getTimeoutMs()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (jCurrentTimeMillis < RoomScreenStatusObserveNewSetting.getBlackDurThreshold() || z3) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (RoomScreenStatusObserveNewSetting.enableBlackStreamRemove() && this.blackStreamRoomSet.contains(Long.valueOf(id))) {
                        j = -1;
                    } else {
                        j = 8;
                    }
                    InterfaceC1631620sYq<? super Long, ? super Long, ? super Long, Boolean> interfaceC1631620sYq = this.hotRefreshCallback;
                    if (interfaceC1631620sYq == null || !interfaceC1631620sYq.invoke(Long.valueOf(id), Long.valueOf(ownerUserId), Long.valueOf(j)).booleanValue()) {
                        C0IOL c0iol3 = this.listProvider;
                        if (c0iol3 != null) {
                            c0iol3.LJJIL(id);
                        }
                        reportDeleteRoom(id, ownerUserId, "inflow_long_link_check", j);
                    }
                }
                if (i4 != i2) {
                    i4++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
