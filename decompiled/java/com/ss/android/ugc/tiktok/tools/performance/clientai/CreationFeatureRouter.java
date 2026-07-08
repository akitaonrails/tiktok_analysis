package com.ss.android.ugc.tiktok.tools.performance.clientai;

import X.C01GW;
import X.C08LG;
import X.C0BXW;
import X.C13LQ;
import X.C2097608Jq;
import X.C2100108Kp;
import X.C2205208kU;
import X.C2205408kW;
import X.C2255851DRf;
import X.C2255861DRg;
import X.C2255891DRj;
import X.C2255901DRk;
import X.C2255921DRm;
import X.C2255931DRn;
import X.C2255941DRo;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC2255871DRh;
import X.InterfaceC2255911DRl;
import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.tiktok.tools.performance.clientai.CreationFeatureRouter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes36.dex */
public final class CreationFeatureRouter {
    public static final CreationFeatureRouter INSTANCE = new CreationFeatureRouter();
    public static final Set<String> SESSION_OPENER_EVENTS = C13LQ.LJLIIL(new String[]{"shoot", "draft_load", "enter_video_shoot_page"});
    public static final Set<String> SESSION_CLOSER_EVENTS = Collections.singleton("shoot_exit");
    public static final C01GW perfStore$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(346));
    public static final C01GW dailyCounter$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(344));
    public static final C01GW sessionCounter$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(347));
    public static final C01GW perfProvider$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(345));
    public static final C01GW sessionStateProvider$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(348));
    public static final C01GW userEventProvider$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(349));
    public static final C01GW contextProvider$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(343));
    public static final AtomicBoolean isSessionOpen = new AtomicBoolean(false);
    public static final AtomicBoolean dirtySinceLastFlush = new AtomicBoolean(false);
    public static final C01GW mainHandler$delegate = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(47));
    public static final C01GW flushHandler$delegate = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(46));
    public static final C01GW flushTask$delegate = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(324));
    public static final C01GW backgroundObserver$delegate = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(323));
    public static final int $stable = 8;

    public static /* synthetic */ void getSESSION_CLOSER_EVENTS$tools_perf_impl_release$annotations() {
    }

    public static /* synthetic */ void getSESSION_OPENER_EVENTS$tools_perf_impl_release$annotations() {
    }

    private final void closeSessionIfNeeded() {
        if (isSessionOpen.compareAndSet(true, false)) {
            C2205408kW userEventProvider = getUserEventProvider();
            if (!userEventProvider.LIZJ) {
                userEventProvider.LIZ(EnumC2255871DRh.EXIT_WITHOUT_RECORD);
            } else if (!userEventProvider.LIZLLL) {
                userEventProvider.LIZ(EnumC2255871DRh.EXIT_WITHOUT_EDIT);
            } else if (!userEventProvider.LJ && !userEventProvider.LJFF) {
                userEventProvider.LIZ(EnumC2255871DRh.EXIT_AFTER_EDIT_WITHOUT_POST);
            }
            userEventProvider.LIZIZ.LIZJ();
            userEventProvider.LIZJ = false;
            userEventProvider.LIZLLL = false;
            userEventProvider.LJ = false;
            userEventProvider.LJFF = false;
            C2255931DRn sessionStateProvider = getSessionStateProvider();
            if (sessionStateProvider.LIZ != null) {
                sessionStateProvider.LIZ(System.currentTimeMillis());
                sessionStateProvider.LIZ = null;
                sessionStateProvider.LIZIZ = null;
                sessionStateProvider.LIZJ = null;
                sessionStateProvider.LIZLLL = null;
                sessionStateProvider.LJ = null;
                sessionStateProvider.LJFF = 0;
                sessionStateProvider.LJI = null;
                sessionStateProvider.LJII = 0L;
                sessionStateProvider.LJIIIIZZ = 0L;
                sessionStateProvider.LJIIIZ = 0L;
            }
            getPerfProvider().LIZ.LIZ();
            disarmBackgroundFlush();
        }
    }

    private final Handler getMainHandler() {
        return (Handler) mainHandler$delegate.getValue();
    }

    private final void openSessionIfNeeded() {
        if (isSessionOpen.compareAndSet(false, true)) {
            C2100108Kp c2100108Kp = getPerfProvider().LIZ;
            ReentrantLock reentrantLock = c2100108Kp.LJFF;
            reentrantLock.lock();
            try {
                c2100108Kp.LIZJ = new LinkedHashMap();
                c2100108Kp.LJ = true;
                reentrantLock.unlock();
                C2255931DRn sessionStateProvider = getSessionStateProvider();
                sessionStateProvider.LIZ = null;
                sessionStateProvider.LIZIZ = null;
                sessionStateProvider.LIZJ = null;
                sessionStateProvider.LIZLLL = null;
                sessionStateProvider.LJ = null;
                sessionStateProvider.LJFF = 0;
                sessionStateProvider.LJI = null;
                sessionStateProvider.LJII = 0L;
                sessionStateProvider.LJIIIIZZ = 0L;
                sessionStateProvider.LJIIIZ = 0L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                sessionStateProvider.LIZ = Long.valueOf(jCurrentTimeMillis);
                sessionStateProvider.LIZIZ = Long.valueOf(jCurrentTimeMillis);
                sessionStateProvider.LJFF = 0;
                sessionStateProvider.LJI = Long.valueOf(jCurrentTimeMillis);
                C2205408kW userEventProvider = getUserEventProvider();
                userEventProvider.LIZJ = false;
                userEventProvider.LIZLLL = false;
                userEventProvider.LJ = false;
                userEventProvider.LJFF = false;
                C08LG c08lg = userEventProvider.LIZIZ;
                ReentrantLock reentrantLock2 = c08lg.LIZIZ;
                reentrantLock2.lock();
                try {
                    c08lg.LIZLLL = new LinkedHashMap();
                    c08lg.LJFF = true;
                    reentrantLock2.unlock();
                    armBackgroundFlush();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLock2.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final CreationFeatureRouter$backgroundObserver$2$1 getBackgroundObserver() {
        return (CreationFeatureRouter$backgroundObserver$2$1) backgroundObserver$delegate.getValue();
    }

    public final C2255861DRg getContextProvider() {
        return (C2255861DRg) contextProvider$delegate.getValue();
    }

    public final C2205208kU getDailyCounter() {
        return (C2205208kU) dailyCounter$delegate.getValue();
    }

    public final Handler getFlushHandler() {
        return (Handler) flushHandler$delegate.getValue();
    }

    public final Runnable getFlushTask() {
        return (Runnable) flushTask$delegate.getValue();
    }

    public final C2255901DRk getPerfProvider() {
        return (C2255901DRk) perfProvider$delegate.getValue();
    }

    public final C2100108Kp getPerfStore() {
        return (C2100108Kp) perfStore$delegate.getValue();
    }

    public final C08LG getSessionCounter() {
        return (C08LG) sessionCounter$delegate.getValue();
    }

    public final C2255931DRn getSessionStateProvider() {
        return (C2255931DRn) sessionStateProvider$delegate.getValue();
    }

    public final C2205408kW getUserEventProvider() {
        return (C2205408kW) userEventProvider$delegate.getValue();
    }

    private final void armBackgroundFlush() {
        C786410Ut5.LJJZZIII(getMainHandler(), new Runnable() { // from class: X.15Zn
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CreationFeatureRouter@ac1d.armBackgroundFlush$1");
                try {
                    ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(CreationFeatureRouter.INSTANCE.getBackgroundObserver());
                } finally {
                    try {
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                }
                C1C7U.LIZIZ("CreationFeatureRouter@ac1d.armBackgroundFlush$1");
            }
        });
    }

    private final void disarmBackgroundFlush() {
        C786410Ut5.LJJZZIII(getMainHandler(), new Runnable() { // from class: X.15Zo
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CreationFeatureRouter@ac1d.disarmBackgroundFlush$1");
                try {
                    ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(CreationFeatureRouter.INSTANCE.getBackgroundObserver());
                } finally {
                    try {
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                }
                C1C7U.LIZIZ("CreationFeatureRouter@ac1d.disarmBackgroundFlush$1");
            }
        });
    }

    private final void resolveContextService() {
        if (getContextProvider().LIZ == null) {
            InterfaceC2255911DRl.LIZ.getClass();
            InterfaceC2255911DRl interfaceC2255911DRl = C2255851DRf.LIZIZ;
            if (interfaceC2255911DRl != null) {
                INSTANCE.getContextProvider().LIZ = interfaceC2255911DRl;
            }
        }
    }

    public final void flushOnBackground() {
        if (C0BXW.LIZ() && dirtySinceLastFlush.getAndSet(false)) {
            C2100108Kp perfStore = getPerfStore();
            if (perfStore.LJI) {
                ReentrantLock reentrantLock = perfStore.LJFF;
                reentrantLock.lock();
                try {
                    if (perfStore.LJ) {
                        Map<String, ? extends Number> mapLJIIZILJ = C2097608Jq.LJIIZILJ(perfStore.LIZJ);
                        reentrantLock.unlock();
                        perfStore.LIZLLL(perfStore.LIZIZ, mapLJIIZILJ);
                    } else {
                        reentrantLock.unlock();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLock.unlock();
                    throw th;
                }
            }
            C08LG sessionCounter = getSessionCounter();
            if (sessionCounter.LIZJ) {
                ReentrantLock reentrantLock2 = sessionCounter.LIZIZ;
                reentrantLock2.lock();
                try {
                    if (!sessionCounter.LJFF) {
                        reentrantLock2.unlock();
                        return;
                    }
                    Map<String, Integer> mapLJIIZILJ2 = C2097608Jq.LJIIZILJ(sessionCounter.LIZLLL);
                    reentrantLock2.unlock();
                    sessionCounter.LJFF("creation_session_counter_temp", mapLJIIZILJ2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    reentrantLock2.unlock();
                    throw th2;
                }
            }
        }
    }

    public final Set<String> getSESSION_CLOSER_EVENTS$tools_perf_impl_release() {
        return SESSION_CLOSER_EVENTS;
    }

    public final Set<String> getSESSION_OPENER_EVENTS$tools_perf_impl_release() {
        return SESSION_OPENER_EVENTS;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object getFeature(String str) {
        boolean zContains;
        InterfaceC2255911DRl interfaceC2255911DRl;
        Long l;
        Long l2;
        Long l3;
        int iLIZIZ;
        if (!C0BXW.LIZ()) {
            return null;
        }
        resolveContextService();
        C2255901DRk perfProvider = getPerfProvider();
        perfProvider.getClass();
        Pair pairLJ = C2255901DRk.LJ(str);
        int i = 0;
        if (pairLJ == null) {
            zContains = false;
        } else {
            zContains = perfProvider.LIZLLL.contains(pairLJ.getFirst());
        }
        if (zContains) {
            C2255901DRk perfProvider2 = getPerfProvider();
            perfProvider2.getClass();
            Pair pairLJ2 = C2255901DRk.LJ(str);
            if (pairLJ2 == null) {
                return null;
            }
            String str2 = (String) pairLJ2.getFirst();
            int iIntValue = ((Number) pairLJ2.getSecond()).intValue();
            if (!perfProvider2.LIZLLL.contains(str2)) {
                return null;
            }
            if (C2255891DRj.LIZIZ.contains(str2)) {
                if (iIntValue == 0) {
                    iLIZIZ = perfProvider2.LIZIZ.LIZ(str2);
                } else {
                    iLIZIZ = perfProvider2.LIZIZ.LIZIZ(str2);
                }
                return Integer.valueOf(iLIZIZ);
            }
            if (C2255891DRj.LIZJ.contains(str2)) {
                Number numberLJI = perfProvider2.LIZ.LJI(iIntValue, str2);
                if (numberLJI != null) {
                    return numberLJI;
                }
                return 0;
            }
            switch (str2.hashCode()) {
                case -2082903796:
                    if (str2.equals("perf_if_bad_shoot_preview_fps")) {
                        Number numberLJI2 = perfProvider2.LIZ.LJI(iIntValue, "perf_shoot_preview_fps");
                        if (numberLJI2 != null && numberLJI2.doubleValue() <= 10.0d) {
                            i = 1;
                        }
                        return Integer.valueOf(i);
                    }
                    break;
                case -1826613352:
                    if (str2.equals("perf_if_bad_publish_cover_show_duration")) {
                        return Integer.valueOf(C2255901DRk.LJI(9000.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_publish_cover_show_duration")));
                    }
                    break;
                case -1755899803:
                    if (str2.equals("perf_if_bad_save_draft")) {
                        return Integer.valueOf(perfProvider2.LIZLLL(iIntValue, "perf_save_draft_failed_count"));
                    }
                    break;
                case -1748599249:
                    if (str2.equals("perf_if_bad_save_local")) {
                        return Integer.valueOf(perfProvider2.LIZLLL(iIntValue, "perf_save_local_failed_count"));
                    }
                    break;
                case -1619595679:
                    if (str2.equals("perf_if_bad_prop_panel_loading_time")) {
                        return Integer.valueOf(C2255901DRk.LJI(1500.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_prop_panel_loading_time")));
                    }
                    break;
                case -1298440091:
                    if (str2.equals("perf_if_bad_edit_mixed_asset_apply_status")) {
                        return Integer.valueOf(perfProvider2.LIZLLL(iIntValue, "perf_edit_mixed_asset_apply_failed_count"));
                    }
                    break;
                case -1276146361:
                    if (str2.equals("perf_if_bad_edit_mixed_asset_apply_duration")) {
                        return Integer.valueOf(C2255901DRk.LJI(3000.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_edit_mixed_asset_apply_duration")));
                    }
                    break;
                case -815584737:
                    if (str2.equals("perf_if_bad_shoot_ui_ffd")) {
                        return Integer.valueOf(C2255901DRk.LJI(5000.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_shoot_ui_ffd")));
                    }
                    break;
                case -554531270:
                    if (str2.equals("perf_if_bad_preview_serious_lag")) {
                        return Integer.valueOf(C2255901DRk.LJI(5.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_preview_serious_lag")));
                    }
                    break;
                case -508818853:
                    if (str2.equals("perf_if_bad_prop_apply_duration")) {
                        return Integer.valueOf(C2255901DRk.LJI(5500.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_prop_apply_duration")));
                    }
                    break;
                case -225497910:
                    if (str2.equals("perf_if_bad_draft_load")) {
                        return Integer.valueOf(perfProvider2.LIZLLL(iIntValue, "perf_draft_load_failed_count"));
                    }
                    break;
                case -129071858:
                    if (str2.equals("perf_if_bad_album_ffd")) {
                        return Integer.valueOf(C2255901DRk.LJI(2500.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_album_ffd")));
                    }
                    break;
                case 26705816:
                    if (str2.equals("perf_if_bad_prop_apply")) {
                        return Integer.valueOf(perfProvider2.LIZLLL(iIntValue, "perf_prop_apply_failed_count"));
                    }
                    break;
                case 498229062:
                    if (str2.equals("perf_if_bad_enter_prop_tab")) {
                        return Integer.valueOf(perfProvider2.LIZLLL(iIntValue, "perf_enter_prop_tab_failed_count"));
                    }
                    break;
                case 805993794:
                    if (str2.equals("perf_if_bad_ai_recommend_music_duration")) {
                        return Integer.valueOf(C2255901DRk.LJI(7000.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_ai_recommend_music_duration")));
                    }
                    break;
                case 1208661158:
                    if (str2.equals("perf_if_bad_publish_stuck")) {
                        return Integer.valueOf(C2255901DRk.LJI(1.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_publish_stuck")));
                    }
                    break;
                case 1585985731:
                    if (str2.equals("perf_if_bad_edit_preview_fps")) {
                        Number numberLJI3 = perfProvider2.LIZ.LJI(iIntValue, "perf_edit_preview_fps");
                        if (numberLJI3 != null && numberLJI3.doubleValue() <= 16.0d) {
                            i = 1;
                        }
                        return Integer.valueOf(i);
                    }
                    break;
                case 1724449970:
                    if (str2.equals("perf_if_bad_post_ui_ffd")) {
                        return Integer.valueOf(C2255901DRk.LJI(3000.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_post_ui_ffd")));
                    }
                    break;
                case 1728686453:
                    if (str2.equals("perf_if_bad_edit_ffd")) {
                        return Integer.valueOf(C2255901DRk.LJI(6000.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_edit_ffd")));
                    }
                    break;
                case 1875567617:
                    if (str2.equals("perf_if_bad_record_fps")) {
                        Number numberLJI4 = perfProvider2.LIZ.LJI(iIntValue, "perf_record_fps");
                        if (numberLJI4 != null && numberLJI4.doubleValue() <= 10.0d) {
                            i = 1;
                        }
                        return Integer.valueOf(i);
                    }
                    break;
                case 1890803209:
                    if (str2.equals("perf_if_bad_draft_restore_duration")) {
                        return Integer.valueOf(C2255901DRk.LJI(1500.0d, perfProvider2.LIZ.LJI(iIntValue, "perf_draft_restore_duration")));
                    }
                    break;
                case 1985105078:
                    if (str2.equals("perf_if_bad_album_to_edit_page")) {
                        return Integer.valueOf(perfProvider2.LIZLLL(iIntValue, "perf_album_to_edit_page_failed_count"));
                    }
                    break;
            }
            if (C2255891DRj.LIZLLL.contains(str2)) {
                Number numberLJI5 = perfProvider2.LIZ.LJI(iIntValue, str2);
                if (numberLJI5 != null) {
                    return numberLJI5;
                }
                return 0;
            }
            return perfProvider2.LIZ.LJI(iIntValue, str2);
        }
        getSessionStateProvider().getClass();
        if (C2255941DRo.LIZ.contains(str)) {
            C2255931DRn sessionStateProvider = getSessionStateProvider();
            Long l4 = sessionStateProvider.LIZ;
            if (l4 == null) {
                return null;
            }
            long jLongValue = l4.longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            switch (str.hashCode()) {
                case -2118826367:
                    if (!str.equals("post_page_dwell")) {
                        return null;
                    }
                    return Integer.valueOf((int) sessionStateProvider.LIZIZ(2, jCurrentTimeMillis));
                case -1775517493:
                    if (!str.equals("time_to_post_enter") || (l3 = sessionStateProvider.LJ) == null) {
                        return null;
                    }
                    return Integer.valueOf(Math.max(0, (int) (l3.longValue() - jLongValue)));
                case -1616786729:
                    if (!str.equals("edit_page_dwell")) {
                        return null;
                    }
                    return Integer.valueOf((int) sessionStateProvider.LIZIZ(1, jCurrentTimeMillis));
                case -1596750563:
                    if (!str.equals("session_duration")) {
                        return null;
                    }
                    return Integer.valueOf(Math.max(0, (int) (jCurrentTimeMillis - jLongValue)));
                case -1471792433:
                    if (!str.equals("session_current_stage")) {
                        return null;
                    }
                    return Integer.valueOf(sessionStateProvider.LJFF);
                case -1454940491:
                    if (!str.equals("time_to_edit_enter") || (l2 = sessionStateProvider.LIZLLL) == null) {
                        return null;
                    }
                    return Integer.valueOf(Math.max(0, (int) (l2.longValue() - jLongValue)));
                case -1250518382:
                    if (!str.equals("time_to_first_record") || (l = sessionStateProvider.LIZJ) == null) {
                        return null;
                    }
                    return Integer.valueOf(Math.max(0, (int) (l.longValue() - jLongValue)));
                case -635747960:
                    if (!str.equals("time_since_last_action")) {
                        return null;
                    }
                    Long l5 = sessionStateProvider.LIZIZ;
                    if (l5 != null) {
                        jLongValue = l5.longValue();
                    }
                    return Integer.valueOf(Math.max(0, (int) (jCurrentTimeMillis - jLongValue)));
                case 1915021872:
                    if (!str.equals("record_page_dwell")) {
                        return null;
                    }
                    return Integer.valueOf((int) sessionStateProvider.LIZIZ(0, jCurrentTimeMillis));
                default:
                    return null;
            }
        }
        if (((Set) getUserEventProvider().LJI.getValue()).contains(str)) {
            C2205408kW userEventProvider = getUserEventProvider();
            userEventProvider.getClass();
            for (EnumC2255871DRh enumC2255871DRh : EnumC2255871DRh.values()) {
                if (enumC2255871DRh.getFeatureNames().contains(str)) {
                    if (u.LJIIZILJ(str, "_7d", false)) {
                        return Integer.valueOf(userEventProvider.LIZ.LIZ(7, enumC2255871DRh.getStorageKey()));
                    }
                    if (u.LJIIZILJ(str, "_14d", false)) {
                        return Integer.valueOf(userEventProvider.LIZ.LIZ(14, enumC2255871DRh.getStorageKey()));
                    }
                    if (u.LJIIZILJ(str, "_s0", false)) {
                        return Integer.valueOf(userEventProvider.LIZIZ.LIZ(enumC2255871DRh.getStorageKey()));
                    }
                    if (!u.LJIIZILJ(str, "_s1", false)) {
                        return null;
                    }
                    return Integer.valueOf(userEventProvider.LIZIZ.LIZIZ(enumC2255871DRh.getStorageKey()));
                }
            }
            return null;
        }
        getContextProvider().getClass();
        if (!C2255921DRm.LIZ.contains(str) || (interfaceC2255911DRl = getContextProvider().LIZ) == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -2113595041:
                if (!str.equals("shoot_fun")) {
                    return null;
                }
                return interfaceC2255911DRl.getShootFun();
            case -2113579313:
                if (!str.equals("shoot_way")) {
                    return null;
                }
                return interfaceC2255911DRl.getShootWay();
            case -2025376357:
                if (!str.equals("edit_extra")) {
                    return null;
                }
                return interfaceC2255911DRl.getEditExtra();
            case -1993755576:
                if (!str.equals("shoot_enter_method")) {
                    return null;
                }
                return interfaceC2255911DRl.getShootEnterMethod();
            case -1882523157:
                if (!str.equals("is_upload_direct_enter")) {
                    return null;
                }
                return C2255861DRg.LIZ(interfaceC2255911DRl.isUploadDirectEnter());
            case -1137465135:
                if (!str.equals("shoot_enter_from")) {
                    return null;
                }
                return interfaceC2255911DRl.getShootEnterFrom();
            case -932633993:
                if (!str.equals("is_backup")) {
                    return null;
                }
                return C2255861DRg.LIZ(interfaceC2255911DRl.isBackup());
            case -321162805:
                if (!str.equals("draft_cnt")) {
                    return null;
                }
                return interfaceC2255911DRl.getDraftCount();
            case -69641546:
                if (!str.equals("publish_params")) {
                    return null;
                }
                return interfaceC2255911DRl.getPublishParams();
            case -35824908:
                if (!str.equals("creation_duration")) {
                    return null;
                }
                return interfaceC2255911DRl.getCreationDuration();
            case 64948288:
                if (!str.equals("has_music")) {
                    return null;
                }
                return C2255861DRg.LIZ(interfaceC2255911DRl.hasMusic());
            case 110813772:
                if (!str.equals("is_draft")) {
                    return null;
                }
                return C2255861DRg.LIZ(interfaceC2255911DRl.isDraft());
            case 353871856:
                if (!str.equals("shoot_extra")) {
                    return null;
                }
                return interfaceC2255911DRl.getShootExtra();
            case 502589089:
                if (!str.equals("content_source")) {
                    return null;
                }
                return interfaceC2255911DRl.getContentSource();
            case 757335392:
                if (!str.equals("post_fun")) {
                    return null;
                }
                return interfaceC2255911DRl.getPostFun();
            case 831846208:
                if (!str.equals("content_type")) {
                    return null;
                }
                return interfaceC2255911DRl.getContentType();
            case 1602360778:
                if (!str.equals("edit_fun")) {
                    return null;
                }
                return interfaceC2255911DRl.getEditFun();
            case 1983953709:
                if (!str.equals("is_long_video")) {
                    return null;
                }
                return C2255861DRg.LIZ(interfaceC2255911DRl.isLongVideo());
            case 2140769934:
                if (!str.equals("media_cnt")) {
                    return null;
                }
                return interfaceC2255911DRl.getMediaCount();
            default:
                return null;
        }
    }

    public final void handleEvent(String str) {
        handleEvent(str, AFwS283S0000000_35.get$arr$(118));
    }

    public final void setContextService(InterfaceC2255911DRl interfaceC2255911DRl) {
        getContextProvider().LIZ = interfaceC2255911DRl;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void handleEvent(String str, Function1<? super String, ? extends Object> function1) {
        Integer numLIZIZ;
        boolean z;
        String string;
        Integer numLIZIZ2;
        String strLIZJ;
        Double dLIZ;
        Double dLIZ2;
        Integer numLIZIZ3;
        Integer numLIZIZ4;
        Integer numLIZIZ5;
        Integer numLIZIZ6;
        Integer numLIZIZ7;
        int i;
        int i2;
        if (!C0BXW.LIZ()) {
            return;
        }
        if (SESSION_OPENER_EVENTS.contains(str)) {
            openSessionIfNeeded();
        } else if (SESSION_CLOSER_EVENTS.contains(str)) {
            closeSessionIfNeeded();
        }
        C2255901DRk perfProvider = getPerfProvider();
        perfProvider.getClass();
        if (!C2255901DRk.LJ.contains(str)) {
            perfProvider.LIZ.LIZIZ();
        }
        Object objValueOf = null;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        switch (str.hashCode()) {
            case -1938569620:
                if (str.equals("publish_stuck") && (numLIZIZ = C2255901DRk.LIZIZ(function1.invoke("count"))) != null) {
                    perfProvider.LIZ.LJFF(Integer.valueOf(numLIZIZ.intValue()), "perf_publish_stuck");
                }
                break;
            case -1746884747:
                if (str.equals("album_import") && Intrinsics.LJFF(C2255901DRk.LIZJ(function1.invoke("event")), "failed")) {
                    perfProvider.LJFF("perf_album_to_edit_page_failed_count");
                }
                break;
            case -1670734387:
                if (str.equals("tool_performance_prop_apply_total")) {
                    String strLIZJ2 = C2255901DRk.LIZJ(function1.invoke("prop_type_name"));
                    String strLIZJ3 = C2255901DRk.LIZJ(function1.invoke("prop_id"));
                    if (strLIZJ3 != null && (string = a0.LJLIIIL(strLIZJ3).toString()) != null && string.length() > 0 && !Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Intrinsics.LJFF(strLIZJ2, "effect") && z) {
                        Object objInvoke = function1.invoke("prop_apply_status");
                        if (objInvoke instanceof Boolean) {
                            objValueOf = objInvoke;
                        } else if (objInvoke instanceof Integer) {
                            objValueOf = Boolean.valueOf(!Intrinsics.LJFF(objInvoke, 0));
                        } else if (objInvoke instanceof Number) {
                            if (((Number) objInvoke).intValue() != 0) {
                                z3 = true;
                            }
                            objValueOf = Boolean.valueOf(z3);
                        } else if (objInvoke instanceof String) {
                            String lowerCase = ((String) objInvoke).toLowerCase(Locale.ROOT);
                            if (Intrinsics.LJFF(lowerCase, "true") || Intrinsics.LJFF(lowerCase, "1")) {
                                z2 = true;
                            }
                            objValueOf = Boolean.valueOf(z2);
                        }
                        if (Intrinsics.LJFF(objValueOf, Boolean.FALSE)) {
                            perfProvider.LJFF("perf_prop_apply_failed_count");
                        }
                        Integer numLIZIZ8 = C2255901DRk.LIZIZ(function1.invoke("duration"));
                        if (numLIZIZ8 != null) {
                            perfProvider.LIZ.LJ(Integer.valueOf(numLIZIZ8.intValue()), "perf_prop_apply_duration");
                        }
                    }
                }
                break;
            case -1647593906:
                if (str.equals("tool_performance_video_preview")) {
                    Double dLIZ3 = C2255901DRk.LIZ(function1.invoke("fps"));
                    if (dLIZ3 != null && dLIZ3.doubleValue() > 0.0d) {
                        perfProvider.LIZ.LJ(Double.valueOf(dLIZ3.doubleValue()), "perf_shoot_preview_fps");
                    }
                    Integer numLIZIZ9 = C2255901DRk.LIZIZ(function1.invoke("serious_lag_count"));
                    if (numLIZIZ9 != null) {
                        perfProvider.LIZ.LJFF(Integer.valueOf(numLIZIZ9.intValue()), "perf_preview_serious_lag");
                    }
                }
                break;
            case -1595749921:
                if (str.equals("tool_performance_edit_first_frame") && (numLIZIZ2 = C2255901DRk.LIZIZ(function1.invoke("first_frame_duration"))) != null) {
                    perfProvider.LIZ.LJ(Integer.valueOf(numLIZIZ2.intValue()), "perf_edit_ffd");
                }
                break;
            case -1365843772:
                if (str.equals("draft_load")) {
                    Integer numLIZIZ10 = C2255901DRk.LIZIZ(function1.invoke("restore_duration"));
                    if (numLIZIZ10 != null) {
                        perfProvider.LIZ.LJ(Integer.valueOf(numLIZIZ10.intValue()), "perf_draft_restore_duration");
                    }
                    Integer numLIZIZ11 = C2255901DRk.LIZIZ(function1.invoke(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS));
                    if (numLIZIZ11 != null && numLIZIZ11.intValue() != 0) {
                        perfProvider.LJFF("perf_draft_load_failed_count");
                    }
                }
                break;
            case -1365648037:
                if (str.equals("draft_save") && (strLIZJ = C2255901DRk.LIZJ(function1.invoke("error_code"))) != null && !Intrinsics.LJFF(strLIZJ, CardStruct.IStatusCode.DEFAULT) && !Intrinsics.LJFF(strLIZJ, "-553")) {
                    perfProvider.LJFF("perf_save_draft_failed_count");
                }
                break;
            case -700698357:
                if (str.equals("tool_performance_video_record") && (dLIZ = C2255901DRk.LIZ(function1.invoke("fps"))) != null && dLIZ.doubleValue() > 0.0d) {
                    perfProvider.LIZ.LJ(Double.valueOf(dLIZ.doubleValue()), "perf_record_fps");
                }
                break;
            case -630762136:
                if (str.equals("save_local_stage") && Intrinsics.LJFF(C2255901DRk.LIZJ(function1.invoke("event")), "fail")) {
                    perfProvider.LJFF("perf_save_local_failed_count");
                }
                break;
            case -441836791:
                if (str.equals("tool_performance_edit_preview") && (dLIZ2 = C2255901DRk.LIZ(function1.invoke("fps"))) != null && dLIZ2.doubleValue() > 0.0d) {
                    perfProvider.LIZ.LJ(Double.valueOf(dLIZ2.doubleValue()), "perf_edit_preview_fps");
                }
                break;
            case -222740353:
                if (str.equals("capsule_ai_recommend_music_result") && Intrinsics.LJFF(C2255901DRk.LIZJ(function1.invoke("recommend_source_from")), "ai_music") && (numLIZIZ3 = C2255901DRk.LIZIZ(function1.invoke("total_duration"))) != null) {
                    perfProvider.LIZ.LJ(Integer.valueOf(numLIZIZ3.intValue()), "perf_ai_recommend_music_duration");
                }
                break;
            case 35721254:
                if (str.equals("tool_performance_record_first_frame") && (numLIZIZ4 = C2255901DRk.LIZIZ(function1.invoke("first_ui_frame_duration"))) != null) {
                    perfProvider.LIZ.LJ(Integer.valueOf(numLIZIZ4.intValue()), "perf_shoot_ui_ffd");
                }
                break;
            case 36442609:
                if (str.equals("tool_performance_operation_cost_time") && Intrinsics.LJFF(C2255901DRk.LIZJ(function1.invoke("type")), "tool_performance_open_album_panel") && (numLIZIZ5 = C2255901DRk.LIZIZ(function1.invoke("totaltime"))) != null) {
                    perfProvider.LIZ.LJ(Integer.valueOf(numLIZIZ5.intValue()), "perf_album_ffd");
                }
                break;
            case 244581125:
                if (str.equals("publish_page_cover_show") && (numLIZIZ6 = C2255901DRk.LIZIZ(function1.invoke("cover_show_duration"))) != null) {
                    perfProvider.LIZ.LJ(Integer.valueOf(numLIZIZ6.intValue()), "perf_publish_cover_show_duration");
                }
                break;
            case 754635498:
                if (str.equals("tool_performance_mixed_asset_apply_total") && Intrinsics.LJFF(C2255901DRk.LIZJ(function1.invoke(Scene.SCENE_SERVICE)), "edit_mixed_asset_carousel")) {
                    Integer numLIZIZ12 = C2255901DRk.LIZIZ(function1.invoke("duration"));
                    if (numLIZIZ12 != null) {
                        perfProvider.LIZ.LJ(Integer.valueOf(numLIZIZ12.intValue()), "perf_edit_mixed_asset_apply_duration");
                    }
                    Integer numLIZIZ13 = C2255901DRk.LIZIZ(function1.invoke(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS));
                    if (numLIZIZ13 != null && (numLIZIZ13.intValue() == 1 || numLIZIZ13.intValue() == 2)) {
                        perfProvider.LJFF("perf_edit_mixed_asset_apply_failed_count");
                    }
                }
                break;
            case 757992758:
                if (str.equals("tool_performance_enter_prop_tab")) {
                    Integer numLIZIZ14 = C2255901DRk.LIZIZ(function1.invoke(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS));
                    if (numLIZIZ14 != null && numLIZIZ14.intValue() != 0) {
                        perfProvider.LJFF("perf_enter_prop_tab_failed_count");
                    }
                    Integer numLIZIZ15 = C2255901DRk.LIZIZ(function1.invoke("duration"));
                    if (numLIZIZ15 != null) {
                        perfProvider.LIZ.LJ(Integer.valueOf(numLIZIZ15.intValue()), "perf_prop_panel_loading_time");
                    }
                }
                break;
            case 861493944:
                if (str.equals("tool_performance_publish_first_frame") && (numLIZIZ7 = C2255901DRk.LIZIZ(function1.invoke("first_frame_duration"))) != null) {
                    perfProvider.LIZ.LJ(Integer.valueOf(numLIZIZ7.intValue()), "perf_post_ui_ffd");
                }
                break;
            case 1219763495:
                if (str.equals("app_kill_reason")) {
                    String strLIZJ4 = C2255901DRk.LIZJ(function1.invoke("enter_from"));
                    Set setLJLIIL = C13LQ.LJLIIL(new String[]{"video_shoot_page", "video_edit_page", "video_post_page"});
                    if (strLIZJ4 != null && setLJLIIL.contains(strLIZJ4)) {
                        perfProvider.LIZ.LIZIZ();
                        Integer numLIZIZ16 = C2255901DRk.LIZIZ(function1.invoke("reason"));
                        if (numLIZIZ16 != null) {
                            C2100108Kp c2100108Kp = perfProvider.LIZ;
                            if (numLIZIZ16.intValue() == 10) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            c2100108Kp.LJ(Integer.valueOf(i), "perf_if_bad_native_crash");
                            C2100108Kp c2100108Kp2 = perfProvider.LIZ;
                            if (numLIZIZ16.intValue() != 11 && numLIZIZ16.intValue() != 12) {
                                i2 = 0;
                            } else {
                                i2 = 1;
                            }
                            c2100108Kp2.LJ(Integer.valueOf(i2), "perf_if_bad_anr");
                            C2100108Kp c2100108Kp3 = perfProvider.LIZ;
                            if (numLIZIZ16.intValue() == 9) {
                                i3 = 1;
                            }
                            c2100108Kp3.LJ(Integer.valueOf(i3), "perf_if_bad_oom");
                        }
                        perfProvider.LIZ.LIZ();
                        perfProvider.LIZJ.invoke();
                        perfProvider.LIZIZ.LIZJ();
                    }
                }
                break;
        }
        C2255931DRn sessionStateProvider = getSessionStateProvider();
        if (sessionStateProvider.LIZ != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            sessionStateProvider.LIZIZ = Long.valueOf(jCurrentTimeMillis);
            switch (str.hashCode()) {
                case -2106940659:
                    if (str.equals("record_video") && sessionStateProvider.LIZJ == null) {
                        sessionStateProvider.LIZJ = Long.valueOf(jCurrentTimeMillis);
                    }
                    break;
                case -795442013:
                    if (str.equals("enter_video_post_page")) {
                        if (sessionStateProvider.LJ == null) {
                            sessionStateProvider.LJ = Long.valueOf(jCurrentTimeMillis);
                        }
                        sessionStateProvider.LIZJ(2, jCurrentTimeMillis);
                    }
                    break;
                case -369458823:
                    if (str.equals("enter_video_edit_page")) {
                        if (sessionStateProvider.LIZLLL == null) {
                            sessionStateProvider.LIZLLL = Long.valueOf(jCurrentTimeMillis);
                        }
                        sessionStateProvider.LIZJ(1, jCurrentTimeMillis);
                    }
                    break;
                case 540885959:
                    if (str.equals("post_page_back_to_edit")) {
                        sessionStateProvider.LIZJ(1, jCurrentTimeMillis);
                    }
                    break;
                case 1126648969:
                    if (str.equals("performance_publish_click")) {
                        sessionStateProvider.LIZJ(2, jCurrentTimeMillis);
                    }
                    break;
            }
        }
        C2205408kW userEventProvider = getUserEventProvider();
        userEventProvider.getClass();
        if (Intrinsics.LJFF(str, EnumC2255871DRh.RECORD_VIDEO.getTrackerEvent())) {
            userEventProvider.LIZJ = true;
        } else if (Intrinsics.LJFF(str, EnumC2255871DRh.EDIT_ENTER.getTrackerEvent()) || Intrinsics.LJFF(str, EnumC2255871DRh.RETURN_TO_EDIT_FROM_POST.getTrackerEvent())) {
            userEventProvider.LIZLLL = true;
        } else if (Intrinsics.LJFF(str, EnumC2255871DRh.POST_ENTER.getTrackerEvent())) {
            userEventProvider.LJ = true;
        } else if (Intrinsics.LJFF(str, EnumC2255871DRh.CLICK_POST.getTrackerEvent())) {
            if (userEventProvider.LJFF) {
                userEventProvider.LIZ(EnumC2255871DRh.RETRY_PUBLISH);
            }
            userEventProvider.LJFF = true;
        }
        EnumC2255871DRh.Companion.getClass();
        EnumC2255871DRh enumC2255871DRh = EnumC2255871DRh.TRACKER_EVENT_MAP.get(str);
        if (enumC2255871DRh != null) {
            userEventProvider.LIZ(enumC2255871DRh);
        }
        dirtySinceLastFlush.set(true);
    }
}
