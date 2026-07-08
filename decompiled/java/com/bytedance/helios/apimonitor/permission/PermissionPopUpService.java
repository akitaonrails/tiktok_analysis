package com.bytedance.helios.apimonitor.permission;

import X.C098200Yq;
import X.C1390300mHc;
import X.C189200o6;
import X.C786410Ut5;
import X.C801200Vbq;
import X.C801240Vbu;
import X.C813120Vv4;
import X.C823280WRi;
import X.InterfaceC801250Vbv;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.helios.apimonitor.permission.PermissionPopUpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class PermissionPopUpService implements Application.ActivityLifecycleCallbacks, LifecycleEventObserver, IPermissionPopUpService {
    public static boolean LLILLJJLI;
    public static final C801240Vbu LL = new C801240Vbu();
    public static final Set<InterfaceC801250Vbv> LLILLL = new LinkedHashSet();
    public static final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0Vbt
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            Object c098200Yq;
            C801240Vbu c801240Vbu = PermissionPopUpService.LL;
            C1C7U.LIZ("PermissionPopUpService@b886.<clinit>$1L");
            C801240Vbu c801240Vbu2 = PermissionPopUpService.LL;
            try {
                Activity activity = (Activity) HandlerHook.getMessageObj(message.obj);
                c801240Vbu2.getClass();
                C801240Vbu.LIZ(activity).markPermissionHasPopUp();
                C801240Vbu.LIZJ(activity);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
                return true;
            }
            return true;
        }
    });

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public PermissionPopUpService() {
        Object c098200Yq;
        try {
            C813120Vv4.LIZ.add(this);
            ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // com.bytedance.helios.apimonitor.permission.IPermissionPopUpService
    public final void LIZ(C1390300mHc c1390300mHc) {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(LLILLL.add(c1390300mHc));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object c098200Yq;
        try {
            activity.getIntent().removeExtra("_pns_permission_state");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Object c098200Yq;
        try {
            C801200Vbq c801200Vbq = (C801200Vbq) activity.getIntent().getSerializableExtra("_pns_permission_state");
            if (c801200Vbq == null) {
                return;
            }
            if (c801200Vbq.isRequestingPermission()) {
                if (activity.getWindow().getDecorView().getVisibility() == 0) {
                    Map<String, Pair<Integer, Boolean>> grantResultsBeforeRequest = c801200Vbq.getGrantResultsBeforeRequest();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Pair<Integer, Boolean>> entry : grantResultsBeforeRequest.entrySet()) {
                        if (entry.getValue().getFirst().intValue() == -1) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (linkedHashMap.isEmpty() || LLILLJJLI) {
                        return;
                    }
                    BPEAHandler bPEAHandler = LLILZ;
                    C786410Ut5.LJLJLJ(bPEAHandler, Message.obtain(bPEAHandler, 4387, activity), 500L);
                } else {
                    return;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object c098200Yq;
        if (bundle != null) {
            try {
                Serializable serializable = bundle.getSerializable("_pns_permission_state");
                if (serializable != null) {
                    activity.getIntent().putExtra("_pns_permission_state", serializable);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object c098200Yq;
        try {
            C801200Vbq c801200Vbq = (C801200Vbq) activity.getIntent().getSerializableExtra("_pns_permission_state");
            if (c801200Vbq != null) {
                C786410Ut5.LJJIZ(bundle, "_pns_permission_state", c801200Vbq);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            LLILLJJLI = false;
        }
        if (event == Lifecycle.Event.ON_STOP) {
            LLILLJJLI = true;
        }
    }
}
