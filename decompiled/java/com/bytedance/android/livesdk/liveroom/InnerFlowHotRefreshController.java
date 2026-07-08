package com.bytedance.android.livesdk.liveroom;

import X.C00YP;
import X.C00YQ;
import X.C0IJT;
import X.C0ISJ;
import X.C0ITB;
import X.C0ITC;
import X.C0ITD;
import X.C0ITE;
import X.C13LQ;
import X.C1954807lC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Set;
import kotlin.jvm.internal.AwS115S0101000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes8.dex */
public final class InnerFlowHotRefreshController implements ISubController, LifecycleOwner {
    public static final C0ITD Companion = new C0ITD();
    public static final Set<String> TRANSIENT_SKIP_REASONS = C13LQ.LJLIIL(new String[]{"recent_feed_protect", "cooldown", "scroll_not_idle"});
    public String cachedEntryType;
    public C0ITB cachedGate;
    public EnterRoomConfig enterRoomConfig;
    public long lastBackgroundTimestampMs;
    public long lastExecuteTimestampMs;
    public final LiveRoomFragment liveRoomFragment;
    public C0ISJ provider;
    public final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    public long lastFeedArriveTimestampMs = SystemClock.elapsedRealtime();

    private final String negativeTypeKey(long j) {
        return j == 4 ? "fin" : j == 101 ? "nr" : j == 3 ? "pausing" : j == 8 ? "stream_stop" : j == -1 ? "black_stream" : j == 100203 ? "online_drop" : "other";
    }

    public static final String resolveEntryType(EnterRoomConfig enterRoomConfig) {
        Companion.getClass();
        return C0ITD.LIZ(enterRoomConfig);
    }

    private final boolean canExecuteNow() {
        return this.liveRoomFragment.PF();
    }

    private final C0ITB disabledGate() {
        return new C0ITB(false, false, false, false, 0L, 0L, 0L, false);
    }

    private final String resolveEntryType() {
        String str = this.cachedEntryType;
        if (str != null) {
            return str;
        }
        C0ITD c0itd = Companion;
        EnterRoomConfig enterRoomConfig = this.enterRoomConfig;
        c0itd.getClass();
        String strLIZ = C0ITD.LIZ(enterRoomConfig);
        if (strLIZ.length() == 0) {
            return strLIZ;
        }
        this.cachedEntryType = strLIZ;
        return strLIZ;
    }

    private final C0ITB resolveGate() {
        C0ITB c0itb = this.cachedGate;
        if (c0itb != null) {
            return c0itb;
        }
        String strResolveEntryType = resolveEntryType();
        if (strResolveEntryType.length() == 0) {
            return disabledGate();
        }
        C0ITB c0itbBuildGate = buildGate(strResolveEntryType);
        this.cachedGate = c0itbBuildGate;
        return c0itbBuildGate;
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void init() {
        this.lifecycleRegistry.setCurrentState(Lifecycle.State.INITIALIZED);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onCreate() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onDestroy() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        C0ISJ c0isj = this.provider;
        if (c0isj != null) {
            c0isj.LJJLIIIJLJLI(null);
        }
        C0ISJ c0isj2 = this.provider;
        if (c0isj2 != null) {
            c0isj2.LLLLLLIL = null;
        }
        this.provider = null;
        this.enterRoomConfig = null;
        this.cachedEntryType = null;
        this.cachedGate = null;
    }

    public final void onFeedArrived() {
        markFeedArrived("feed_arrived");
    }

    public final boolean onFeedExpired() {
        C0ISJ c0isj = this.provider;
        if (c0isj == null) {
            return false;
        }
        C0ITC c0itc = C0ITC.FEED_TIMEOUT;
        C00YQ c00yqDecide = decide(c0itc, null);
        reportDecision(c0itc, c00yqDecide.LIZ, c00yqDecide.LIZIZ);
        int iRoomStatusOf = roomStatusOf(c0itc, 0L);
        if (c00yqDecide.LIZ == C00YP.HOT_REFRESH) {
            return c0isj.LJJLJ("FEED_TIMEOUT", new AwS115S0101000_7(this, iRoomStatusOf, 0));
        }
        reportInnerHotRefresh(3, iRoomStatusOf, gateReasonToActionType(c00yqDecide.LIZIZ));
        if (isTransientSkip(c00yqDecide.LIZIZ) && c0isj.LJJJJL()) {
            c0isj.LJJJJLI().LIZ();
        }
        return false;
    }

    public final boolean onForegroundReturn() {
        C0ISJ c0isj = this.provider;
        if (c0isj == null) {
            return false;
        }
        C0ITC c0itc = C0ITC.APP_RETURN_FOREGROUND;
        C00YQ c00yqDecide = decide(c0itc, null);
        reportDecision(c0itc, c00yqDecide.LIZ, c00yqDecide.LIZIZ);
        int iRoomStatusOf = roomStatusOf(c0itc, 0L);
        if (c00yqDecide.LIZ == C00YP.HOT_REFRESH) {
            return c0isj.LJJLJ("APP_RETURN_FOREGROUND", new AwS115S0101000_7(this, iRoomStatusOf, 1));
        }
        reportInnerHotRefresh(3, iRoomStatusOf, gateReasonToActionType(c00yqDecide.LIZIZ));
        return false;
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onPause() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.lastBackgroundTimestampMs = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.android.livesdk.liveroom.ISubController
    public void onResume() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        long jElapsedRealtime = this.lastBackgroundTimestampMs > 0 ? SystemClock.elapsedRealtime() - this.lastBackgroundTimestampMs : 0L;
        this.lastBackgroundTimestampMs = 0L;
        if (shouldTriggerForegroundRefresh(jElapsedRealtime)) {
            onForegroundReturn();
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public InnerFlowHotRefreshController(LiveRoomFragment liveRoomFragment) {
        this.liveRoomFragment = liveRoomFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c A[PHI: r3
      0x003c: PHI (r3v1 boolean) = (r3v0 boolean), (r3v5 boolean) binds: [B:22:0x0039, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[PHI: r3 r4
      0x0040: PHI (r3v2 boolean) = (r3v1 boolean), (r3v4 boolean) binds: [B:25:0x003d, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r4v1 boolean) = (r4v0 boolean), (r4v3 boolean) binds: [B:25:0x003d, B:11:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C0ITB buildGate(java.lang.String r14) {
        /*
            r13 = this;
            boolean r2 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.isEnableForEntry(r14)
            X.0ITB r1 = new X.0ITB
            if (r2 == 0) goto L38
            boolean r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.isNegativeSignalTriggerEnable(r14)
            if (r0 == 0) goto L38
            r3 = 1
        Lf:
            boolean r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.isFeedTimeoutTriggerEnable(r14)
            if (r0 == 0) goto L3c
            r4 = 1
        L16:
            boolean r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.isForegroundTriggerEnable(r14)
            if (r0 == 0) goto L40
            r5 = 1
        L1d:
            long r6 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.getBackgroundThresholdMs(r14)
            long r8 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.getCooldownMs()
            long r10 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.getRecentFeedProtectMs(r14)
            if (r2 == 0) goto L36
            boolean r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting.isNegativeSignalSkipRecentFeedProtectEnable(r14)
            if (r0 == 0) goto L36
            r12 = 1
        L32:
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r12)
            return r1
        L36:
            r12 = 0
            goto L32
        L38:
            r3 = 0
            if (r2 == 0) goto L3c
            goto Lf
        L3c:
            r4 = 0
            if (r2 == 0) goto L40
            goto L16
        L40:
            r5 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.liveroom.InnerFlowHotRefreshController.buildGate(java.lang.String):X.0ITB");
    }

    private final C00YP defaultFallbackAction(C0ITC c0itc) {
        if (c0itc == C0ITC.NEGATIVE_SIGNAL) {
            return C00YP.DELETE_ONLY;
        }
        return C00YP.SKIP;
    }

    private final int gateReasonToActionType(String str) {
        if (Intrinsics.LJFF(str, "feature_disabled")) {
            return 30;
        }
        if (Intrinsics.LJFF(str, "trigger_disabled")) {
            return 31;
        }
        if (u.LJJIIJZLJL(str, "negative_type_disabled", false)) {
            return 32;
        }
        if (Intrinsics.LJFF(str, "provider_unavailable")) {
            return 33;
        }
        if (Intrinsics.LJFF(str, "landscape")) {
            return 34;
        }
        if (Intrinsics.LJFF(str, "recent_feed_protect")) {
            return 35;
        }
        if (Intrinsics.LJFF(str, "cooldown")) {
            return 36;
        }
        if (Intrinsics.LJFF(str, "provider_busy")) {
            return 37;
        }
        if (Intrinsics.LJFF(str, "scroll_not_idle")) {
            return 38;
        }
        if (Intrinsics.LJFF(str, "variant_card")) {
            return 39;
        }
        return 49;
    }

    private final boolean isInCooldownWindow(C0ITB c0itb) {
        long j = c0itb.LJFF;
        if (j > 0 && SystemClock.elapsedRealtime() - this.lastExecuteTimestampMs < j) {
            return true;
        }
        return false;
    }

    private final boolean isInRecentFeedProtectWindow(C0ITB c0itb) {
        long j = c0itb.LJI;
        if (j > 0 && SystemClock.elapsedRealtime() - this.lastFeedArriveTimestampMs < j) {
            return true;
        }
        return false;
    }

    private final boolean isTransientSkip(String str) {
        return TRANSIENT_SKIP_REASONS.contains(str);
    }

    private final void markFeedArrived(String str) {
        this.lastFeedArriveTimestampMs = SystemClock.elapsedRealtime();
    }

    private final boolean shouldTriggerForegroundRefresh(long j) {
        C0ITB c0itbResolveGate = resolveGate();
        if (c0itbResolveGate.LIZ && c0itbResolveGate.LIZLLL) {
            long j2 = c0itbResolveGate.LJ;
            if (j2 > 0 && j >= j2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void markExecuted(C0ITC c0itc) {
        this.lastExecuteTimestampMs = SystemClock.elapsedRealtime();
    }

    private final C00YQ decide(C0ITC c0itc, String str) {
        C0ITB c0itbResolveGate = resolveGate();
        if (!c0itbResolveGate.LIZ) {
            return new C00YQ(defaultFallbackAction(c0itc), "feature_disabled");
        }
        if (!isTriggerEnabled(c0itc, c0itbResolveGate)) {
            return new C00YQ(defaultFallbackAction(c0itc), "trigger_disabled");
        }
        if (c0itc == C0ITC.NEGATIVE_SIGNAL && str != null && !LiveInnerFlowHotRefreshSetting.isNegativeSignalTypeEnable(resolveEntryType(), str)) {
            C00YP c00ypDefaultFallbackAction = defaultFallbackAction(c0itc);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("negative_type_disabled_");
            sbLIZ.append(str);
            return new C00YQ(c00ypDefaultFallbackAction, C2188811AlT.LIZIZ(sbLIZ));
        }
        C0ISJ c0isj = this.provider;
        if (c0isj == null) {
            return new C00YQ(defaultFallbackAction(c0itc), "provider_unavailable");
        }
        if (c0isj.LLILZIL == 2) {
            return new C00YQ(defaultFallbackAction(c0itc), "landscape");
        }
        if (isInRecentFeedProtectWindow(c0itbResolveGate)) {
            if (shouldBypassRecentFeedProtect(c0itc, c0itbResolveGate)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("decision/recent_feed_protect_bypassed trigger=");
                sbLIZ2.append(c0itc);
                sbLIZ2.append(" reason=unviewed_negative_signal");
                C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                return new C00YQ(defaultFallbackAction(c0itc), "recent_feed_protect");
            }
        }
        if (isInCooldownWindow(c0itbResolveGate)) {
            return new C00YQ(defaultFallbackAction(c0itc), "cooldown");
        }
        if (!c0isj.LLJZIJLIL && !c0isj.LLLLLLJ) {
            if (!canExecuteNow()) {
                return new C00YQ(defaultFallbackAction(c0itc), "scroll_not_idle");
            }
            int size = c0isj.LLJILJIL.size();
            for (int i = c0isj.LLJI + 1; i < size; i++) {
                Room room = (Room) ListProtector.get(c0isj.LLJILJIL, i);
                if (room.isVariantCard() && !room.isShow) {
                    return new C00YQ(defaultFallbackAction(c0itc), "variant_card");
                }
            }
            return new C00YQ(C00YP.HOT_REFRESH, "hot_refresh");
        }
        return new C00YQ(defaultFallbackAction(c0itc), "provider_busy");
    }

    private final boolean isTriggerEnabled(C0ITC c0itc, C0ITB c0itb) {
        if (!c0itb.LIZ) {
            return false;
        }
        int i = C0ITE.LIZ[c0itc.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return c0itb.LIZLLL;
                }
                throw new C1954807lC();
            }
            return c0itb.LIZJ;
        }
        return c0itb.LIZIZ;
    }

    private final int roomStatusOf(C0ITC c0itc, long j) {
        int i = C0ITE.LIZ[c0itc.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return -3;
                }
                throw new C1954807lC();
            }
            return -2;
        }
        return (int) j;
    }

    private final boolean shouldBypassRecentFeedProtect(C0ITC c0itc, C0ITB c0itb) {
        if (c0itc == C0ITC.NEGATIVE_SIGNAL && c0itb.LJII) {
            return true;
        }
        return false;
    }

    public final void bind(EnterRoomConfig enterRoomConfig, C0ISJ c0isj) {
        boolean z;
        long j;
        C0ISJ c0isj2 = this.provider;
        if (c0isj2 != null) {
            c0isj2.LJJLIIIJLJLI(null);
        }
        C0ISJ c0isj3 = this.provider;
        if (c0isj3 != null) {
            c0isj3.LLLLLLIL = null;
        }
        this.enterRoomConfig = enterRoomConfig;
        this.cachedEntryType = null;
        this.cachedGate = null;
        this.provider = c0isj;
        if (c0isj != null) {
            c0isj.LJJLIIIJLJLI(new AwS551S0100000_7(this, 72));
            c0isj.LLLLLLIL = new AwS551S0100000_7(this, 73);
        }
        markFeedArrived("bind");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init/bind entryType=");
        sbLIZ.append(resolveEntryType());
        sbLIZ.append(" provider=");
        if (c0isj != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" currentRoomId=");
        if (c0isj != null) {
            j = c0isj.LLLLIILL;
        } else {
            j = 0;
        }
        sbLIZ.append(j);
        sbLIZ.append(" lastFeedArriveTimestampMs=");
        sbLIZ.append(this.lastFeedArriveTimestampMs);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    private final void reportDecision(C0ITC c0itc, C00YP c00yp, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger=");
        sbLIZ.append(c0itc);
        sbLIZ.append(" action=");
        sbLIZ.append(c00yp);
        sbLIZ.append(" reason=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("InnerFlowHotRefresh", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean onNegativeSignal(long j, long j2, long j3) {
        C0ISJ c0isj = this.provider;
        if (c0isj == null) {
            return false;
        }
        if (j != c0isj.LLLLIILL && !c0isj.LLJJJJLIIL.contains(Long.valueOf(j))) {
            C0ITC c0itc = C0ITC.NEGATIVE_SIGNAL;
            C00YQ c00yqDecide = decide(c0itc, negativeTypeKey(j3));
            reportDecision(c0itc, c00yqDecide.LIZ, c00yqDecide.LIZIZ);
            int iRoomStatusOf = roomStatusOf(c0itc, j3);
            if (c00yqDecide.LIZ == C00YP.HOT_REFRESH) {
                return c0isj.LJJLJ("NEGATIVE_SIGNAL", new AwS115S0101000_7(this, iRoomStatusOf, 2));
            }
            reportInnerHotRefresh(1, iRoomStatusOf, gateReasonToActionType(c00yqDecide.LIZIZ));
            return false;
        }
        reportInnerHotRefresh(1, roomStatusOf(C0ITC.NEGATIVE_SIGNAL, j3), 40);
        return false;
    }

    public final void reportInnerHotRefresh(int i, int i2, int i3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_inner_hot_refresh");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(i), "hot_reload_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "inner_reload_room_status");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "inner_reload_action_type");
        c474500IjALIZ.LIZ();
    }
}
