package com.bytedance.skynet.base;

import X.C08MO;
import X.C08MP;
import X.C08MQ;
import X.C08MR;
import X.C0VSJ;
import X.C2188811AlT;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public class BaseIniter {
    public static File currentLogFile;
    public static volatile boolean nativeReady;
    public static final String TAG = "BaseIniter";
    public static volatile boolean started = false;
    public static volatile boolean startedQuic = false;
    public static final Set<C08MQ> callbackList = new CopyOnWriteArraySet();

    public static native void addBlackHostNative(String str);

    public static native void init();

    public static native void setProxy(long j);

    public static native void startDns(String str, String str2, String str3, String str4, boolean z);

    public static native void startQuic(String str, String str2, boolean z, boolean z2);

    static {
        nativeReady = false;
        try {
            INVOKESTATIC_com_bytedance_skynet_base_BaseIniter_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("skbase");
            init();
            nativeReady = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            nativeReady = false;
        }
        currentLogFile = null;
    }

    public static File getCurrentLogFile() {
        return currentLogFile;
    }

    public static void INVOKESTATIC_com_bytedance_skynet_base_BaseIniter_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static boolean addBlackHost(Set<String> set) {
        if (set != null) {
            try {
                if (!set.isEmpty()) {
                    Iterator<String> it2 = set.iterator();
                    while (it2.hasNext()) {
                        addBlackHostNative(it2.next());
                    }
                    return true;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        return true;
    }

    public static void initProxy(long j) {
        if (nativeReady) {
            try {
                setProxy(j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void registerEventCallback(C08MQ c08mq) {
        if (c08mq == null) {
            return;
        }
        callbackList.add(c08mq);
    }

    public static void init(Context context, C08MQ c08mq) {
        initDns(context, false, false, false);
        initQuic(context, false, false, true);
        if (c08mq != null) {
            registerEventCallback(c08mq);
        }
    }

    public static void onEvent(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (C08MQ c08mq : callbackList) {
            if (c08mq != null) {
                try {
                    c08mq.onEvent(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public static void initDns(Context context, boolean z, boolean z2, boolean z3) {
        initDns(context, z, z2, z3, Collections.emptySet());
    }

    public static void initQuic(Context context, boolean z, boolean z2, boolean z3) {
        if (nativeReady && !startedQuic) {
            synchronized (BaseIniter.class) {
                try {
                    if (!startedQuic) {
                        if (z2) {
                            C0VSJ c0vsjLJI = C08MR.LJI(context);
                            C0VSJ c0vsjLJ = C08MR.LJ(c0vsjLJI);
                            try {
                                startQuic(c0vsjLJ.getAbsolutePath(), C08MR.LJFF(c0vsjLJI, z), true, z3);
                                startedQuic = true;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } else {
                            try {
                                startQuic(null, null, false, z3);
                                startedQuic = true;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
    }

    public static void initDns(Context context, boolean z, boolean z2, boolean z3, Set<String> set) {
        if (nativeReady && !started) {
            synchronized (BaseIniter.class) {
                try {
                    if (!started) {
                        int i = C08MO.LLILZ;
                        C08MP.LIZ.start();
                        C0VSJ c0vsjLJI = C08MR.LJI(context);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(c0vsjLJI.getAbsolutePath());
                        sbLIZ.append(File.separator);
                        sbLIZ.append(".proxyfd");
                        C0VSJ c0vsjLIZ = C08MR.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        if (z3) {
                            C0VSJ c0vsjLIZJ = C08MR.LIZJ(c0vsjLJI);
                            currentLogFile = c0vsjLIZJ;
                            String strLJII = C08MR.LJII(c0vsjLJI, z2);
                            String strLIZLLL = C08MR.LIZLLL(c0vsjLJI, z);
                            addBlackHost(set);
                            try {
                                startDns(c0vsjLIZ.getAbsolutePath(), strLIZLLL, c0vsjLIZJ.getAbsolutePath(), strLJII, true);
                                started = true;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } else {
                            try {
                                startDns(c0vsjLIZ.getAbsolutePath(), null, null, null, false);
                                started = true;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
    }
}
