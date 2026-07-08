package com.ss.android.ugc.aweme.friendstab.tab;

import X.C098200Yq;
import X.C0XQ7;
import X.C189200o6;
import X.C19EG;
import X.InterfaceC1585190rLx;
import X.InterfaceC1586360rNq;
import X.InterfaceC1603190roz;
import X.InterfaceC586170Myt;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public final class StateOwner implements InterfaceC586170Myt, InterfaceC1586360rNq, InterfaceC1585190rLx, GenericLifecycleObserver {
    public static WeakReference<C19EG> LLILLJJLI;
    public static boolean LLJJIII;
    public static boolean LLJJIJIIJIL;
    public static boolean LLJJIJIL;
    public static boolean LLJJJ;
    public static boolean LLJJJIL;
    public static final StateOwner LL = new StateOwner();
    public static boolean LLILLL = true;
    public static final MutableLiveData<Boolean> LLILZ = new MutableLiveData<>();
    public static final MutableLiveData<Boolean> LLILZIL = new MutableLiveData<>();
    public static final MutableLiveData<Boolean> LLILZLL = new MutableLiveData<>();
    public static final MutableLiveData<Boolean> LLIZ = new MutableLiveData<>();
    public static final MutableLiveData<Boolean> LLIZLLLIL = new MutableLiveData<>();
    public static final MutableLiveData<Boolean> LLJ = new MutableLiveData<>();
    public static final Set<Function1<Boolean, Unit>> LLJI = new LinkedHashSet();
    public static final Set<Function1<Boolean, Unit>> LLJIJIL = new LinkedHashSet();
    public static final MutableLiveData<Pair<String, String>> LLJILJIL = new MutableLiveData<>();
    public static final MutableLiveData<String> LLJILJILJ = new MutableLiveData<>();
    public static final MutableLiveData<Unit> LLJILLL = new MutableLiveData<>();
    public static boolean LLJJ = true;
    public static boolean LLJJI = true;
    public static final MutableLiveData<Boolean> LLJJIJI = new MutableLiveData<>();

    public final void LIZLLL() {
        LLJJIII = false;
        MutableLiveData<Boolean> mutableLiveData = LLJJIJI;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        C19EG c19egLIZIZ = LIZIZ();
        if (c19egLIZIZ != null) {
            MutableLiveData<Pair<String, String>> mutableLiveData2 = LLJILJIL;
            mutableLiveData2.setValue(null);
            MutableLiveData<Boolean> mutableLiveData3 = LLILZ;
            mutableLiveData3.setValue(bool);
            MutableLiveData<Boolean> mutableLiveData4 = LLIZLLLIL;
            mutableLiveData4.setValue(bool);
            MutableLiveData<Boolean> mutableLiveData5 = LLILZIL;
            mutableLiveData5.setValue(bool);
            mutableLiveData2.removeObservers(c19egLIZIZ);
            LLJILJILJ.removeObservers(c19egLIZIZ);
            LLJILLL.removeObservers(c19egLIZIZ);
            mutableLiveData4.removeObservers(c19egLIZIZ);
            LLJ.removeObservers(c19egLIZIZ);
            mutableLiveData3.removeObservers(c19egLIZIZ);
            LLIZ.removeObservers(c19egLIZIZ);
            LLILZLL.removeObservers(c19egLIZIZ);
            mutableLiveData5.removeObservers(c19egLIZIZ);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C19EG LIZIZ() {
        Activity activity;
        WeakReference<C19EG> weakReference = LLILLJJLI;
        if ((weakReference != null ? weakReference.get() : null) != null) {
            WeakReference<C19EG> weakReference2 = LLILLJJLI;
            if (weakReference2 != null) {
                return weakReference2.get();
            }
            return null;
        }
        try {
            Activity[] activityStack = ActivityStack.getActivityStack();
            int length = activityStack.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    activity = null;
                    break;
                }
                activity = activityStack[i];
                if (activity instanceof InterfaceC1603190roz) {
                    break;
                }
                i++;
            }
            if (activity instanceof C19EG) {
                return (C19EG) activity;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return null;
        }
    }

    public final boolean LIZ() {
        return C0XQ7.LJFF().isLogin();
    }

    public final LifecycleOwner LIZJ() {
        C19EG c19egLIZIZ = LIZIZ();
        if (c19egLIZIZ != null) {
            return IMainSAFLifecycleKt.requireMainSAFLifecycle(c19egLIZIZ, LIZIZ(), true);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    @Override // X.InterfaceC1585190rLx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p1(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r1 = "FRIENDS_FEED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r8)
            if (r0 == 0) goto L72
            boolean r0 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLJJIJIIJIL
            if (r0 == 0) goto L36
            java.lang.String r4 = "publish_landing"
        Le:
            X.0rT8 r0 = X.C1589640rT8.LIZIZ
            boolean r0 = r0.F2()
            r5 = 0
            if (r0 == 0) goto L8f
            boolean r0 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLJJI
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLJJI = r5
            X.19EG r0 = r6.LIZIZ()
            r3 = 0
            if (r0 == 0) goto L34
            android.content.Intent r2 = r0.getIntent()
        L28:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "shouldHandleSwitchBottomTabFromPush: intent = "
            r1.append(r0)
            if (r2 == 0) goto L50
            goto L47
        L34:
            r2 = r3
            goto L28
        L36:
            boolean r0 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLJJIJIL
            if (r0 == 0) goto L3d
            java.lang.String r4 = "slide"
            goto Le
        L3d:
            boolean r0 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLJJJ
            if (r0 == 0) goto L44
            java.lang.String r4 = "inner_push_landing"
            goto Le
        L44:
            java.lang.String r4 = "click_top_icon"
            goto Le
        L47:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Exception -> L4c
            goto L50
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L50:
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            if (r2 == 0) goto L69
            java.lang.String r1 = "tab"
            r0 = -1
            int r1 = r2.getIntExtra(r1, r0)     // Catch: java.lang.Throwable -> L80
            X.0qyO r0 = X.EnumC1570580qyO.FRIENDS     // Catch: java.lang.Throwable -> L80
            int r0 = r0.getValue()     // Catch: java.lang.Throwable -> L80
            if (r1 != r0) goto L69
            r2 = 1
            goto L6a
        L69:
            r2 = 0
        L6a:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L70
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L70
            goto L8d
        L70:
            r1 = move-exception
            goto L82
        L72:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r7)
            if (r0 == 0) goto La3
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLJILJILJ
            java.lang.String r0 = "home top friends unselected"
            r1.postValue(r0)
            return
        L80:
            r1 = move-exception
            r2 = 0
        L82:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L8d:
            if (r2 != 0) goto L9d
        L8f:
            androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.String, java.lang.String>> r1 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLJILJIL
            kotlin.Pair r0 = new kotlin.Pair
            if (r7 != 0) goto L97
            java.lang.String r7 = ""
        L97:
            r0.<init>(r7, r4)
            r1.setValue(r0)
        L9d:
            com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLJJIJIIJIL = r5
            com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLJJIJIL = r5
            com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLJJJ = r5
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.tab.StateOwner.p1(java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 1) {
            if (z) {
                LLJILJIL.setValue(null);
                LLILZ.postValue(Boolean.valueOf(z));
                return;
            }
            return;
        }
        if (i == 2) {
            if (!z) {
                return;
            }
            LLILZIL.postValue(Boolean.valueOf(z));
            LIZLLL();
            return;
        }
        if (i == 3) {
            if (!z) {
                return;
            }
            LLILZLL.postValue(Boolean.valueOf(z));
            LIZLLL();
            return;
        }
        if (i != 4 || !z) {
            return;
        }
        LLIZ.postValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC1586360rNq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZLZ(java.lang.String r9, java.lang.String r10, boolean r11, boolean r12, android.os.Bundle r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LLLZLZ(java.lang.String, java.lang.String, boolean, boolean, android.os.Bundle, java.lang.String):void");
    }
}
