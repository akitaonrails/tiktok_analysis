package com.ss.android.ugc.tiktok.location_api.service;

import X.AbstractC838380Wui;
import X.C15O7;
import X.C19514711Wn;
import X.C19741112Lp;
import X.C786410Ut5;
import X.C844470XAv;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PermissionCache implements LifecycleEventObserver {
    public static final PermissionCache LL;
    public static final ConcurrentHashMap<String, Boolean> LLILLJJLI;
    public static Lifecycle.Event LLILLL;
    public static volatile boolean LLILZ;

    static {
        PermissionCache permissionCache = new PermissionCache();
        LL = permissionCache;
        LLILLJJLI = new ConcurrentHashMap<>();
        LLILLL = Lifecycle.Event.ON_ANY;
        if (LLILZ) {
            return;
        }
        if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
            permissionCache.LIZ();
        } else {
            C15O7.LJIIIIZZ.execute(new Runnable() { // from class: X.0hP4
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PermissionCache@c2df.tryInitCache$1");
                    try {
                        PermissionCache.LL.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PermissionCache@c2df.tryInitCache$1");
                }
            });
        }
    }

    public final void LIZ() {
        if (LLILZ) {
            return;
        }
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(this);
        C19514711Wn.LIZJ.add(new AbstractC838380Wui() { // from class: X.0hVv
            @Override // X.AbstractC838380Wui
            public final void LIZIZ(C19514611Wm c19514611Wm, C0HWO... c0hwoArr) {
                try {
                    try {
                        for (C0HWO c0hwo : c0hwoArr) {
                            PermissionCache.LLILLJJLI.remove(c0hwo.LIZ);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        PermissionCache.LLILLJJLI.clear();
                        if (c19514611Wm == null) {
                            return;
                        }
                    }
                    if (c19514611Wm != null) {
                        c19514611Wm.LIZJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (c19514611Wm != null) {
                        c19514611Wm.LIZJ();
                    }
                    throw th;
                }
            }
        });
        LLILZ = true;
    }

    public static boolean LIZIZ(String... strArr) {
        for (String str : strArr) {
            ConcurrentHashMap<String, Boolean> concurrentHashMap = LLILLJJLI;
            Boolean bool = concurrentHashMap.get(str);
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return false;
                }
            } else {
                PermissionCache permissionCache = LL;
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                c19741112Lp.getClass();
                boolean zLIZLLL = C19741112Lp.LIZLLL(contextLIZ, str);
                if (LLILZ) {
                    permissionCache.getClass();
                    if (LLILLL == Lifecycle.Event.ON_RESUME) {
                        concurrentHashMap.put(str, Boolean.valueOf(zLIZLLL));
                    }
                }
                if (!zLIZLLL) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        LLILLL = event;
        if (event == Lifecycle.Event.ON_PAUSE) {
            LLILLJJLI.clear();
        }
    }
}
