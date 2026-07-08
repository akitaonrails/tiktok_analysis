package com.facebook;

import X.C08TN;
import X.C093Y;
import X.C0C7S;
import X.C0W7K;
import X.C0WP3;
import X.C1324360kZG;
import X.C1BIE;
import X.C1BJG;
import X.C1BJJ;
import X.C1BJL;
import X.C1BJN;
import X.C1BJO;
import X.C1BJT;
import X.C1BKH;
import X.C1EPD;
import X.C2202721BIw;
import X.C786410Ut5;
import X.C807650VmF;
import X.C807660VmG;
import X.C822650WOx;
import Y.ACallableS150S0000000_13;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class FacebookSdk {
    public static final HashSet<C1BJT> LIZ;
    public static Executor LIZIZ;
    public static volatile String LIZJ;
    public static volatile String LIZLLL;
    public static volatile String LJ;
    public static volatile Boolean LJFF;
    public static final AtomicLong LJI;
    public static Context LJII;
    public static int LJIIIIZZ;
    public static final ReentrantLock LJIIIZ;
    public static final String LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static final AtomicBoolean LJIILJJIL;
    public static volatile String LJIILL;
    public static volatile String LJIILLIIL;
    public static boolean LJIIZILJ;

    public static final synchronized void LJIIJ(Context context) {
        LIZIZ(context);
    }

    public static final synchronized void LJIIJJI(Context context) {
        LIZ(context);
    }

    static {
        new FacebookSdk();
        LIZ = C093Y.LIZJ(C1BJT.DEVELOPER_ERRORS);
        LJI = new AtomicLong(65536L);
        LJIIIIZZ = 64206;
        LJIIIZ = new ReentrantLock();
        LJIIJ = "v16.0";
        LJIILJJIL = new AtomicBoolean(false);
        LJIILL = "instagram.com";
        LJIILLIIL = "facebook.com";
    }

    public static final Executor LJ() {
        ReentrantLock reentrantLock = LJIIIZ;
        reentrantLock.lock();
        try {
            if (LIZIZ == null) {
                LIZIZ = C0WP3.LIZ(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2);
            }
            reentrantLock.unlock();
            Executor executor = LIZIZ;
            if (executor != null) {
                return executor;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String LJFF() {
        AccessToken.Companion.getClass();
        AccessToken accessTokenLIZIZ = C2202721BIw.LIZIZ();
        String str = accessTokenLIZIZ != null ? accessTokenLIZIZ.graphDomain : null;
        String str2 = LJIILLIIL;
        return str != null ? Intrinsics.LJFF(str, "gaming") ? u.LJJIFFI(str2, "facebook.com", "fb.gg", false) : Intrinsics.LJFF(str, "instagram") ? u.LJJIFFI(str2, "facebook.com", "instagram.com", false) : str2 : str2;
    }

    public static final synchronized boolean LJI() {
        return LJIIZILJ;
    }

    public static final boolean LJII() {
        return LJIILJJIL.get();
    }

    public static final void LJIIIIZZ() {
        synchronized (LIZ) {
        }
    }

    public static final Context LIZJ() {
        C0W7K.LJFF();
        Context context = LJII;
        context.getClass();
        return context;
    }

    public static final String LIZLLL() {
        C0W7K.LJFF();
        String str = LIZJ;
        if (str != null) {
            return str;
        }
        throw new C1BJO("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static void LIZ(Context context) {
        String str;
        PackageManager packageManager;
        if (C1324360kZG.LIZIZ.compareAndSet(false, true)) {
            C822650WOx c822650WOx = C1324360kZG.LIZ;
            ReentrantLock reentrantLock = LJIIIZ;
            reentrantLock.lock();
            try {
                LIZIZ = c822650WOx;
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
        synchronized (FacebookSdk.class) {
            if (LJIILJJIL.get()) {
                return;
            }
            try {
                packageManager = context.getPackageManager();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (packageManager != null) {
                try {
                    packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
                } catch (PackageManager.NameNotFoundException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                context.checkCallingOrSelfPermission("android.permission.INTERNET");
                LJII = C786410Ut5.N3(context);
                Context context2 = LJII;
                context2.getClass();
                LJIIIZ(context2);
                str = LIZJ;
                if (str == null && str.length() != 0) {
                    String str2 = LJ;
                    if (str2 != null && str2.length() != 0) {
                        LJIILJJIL.set(true);
                        if (!C807660VmG.LIZ(C1BJJ.class)) {
                            try {
                                C1BJJ.LIZ.LJ();
                                if (C1BJJ.LIZLLL.LIZ()) {
                                    LJIIZILJ = true;
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }
                        Context context3 = LJII;
                        context3.getClass();
                        if ((context3 instanceof Application) && C1BJJ.LIZJ()) {
                            int i = C0C7S.LIZ;
                            Context context4 = LJII;
                            context4.getClass();
                        }
                        C1BJL.LIZJ();
                        C1BIE.LJIIJJI();
                        Context context5 = LJII;
                        context5.getClass();
                        C807650VmF.LIZ(context5);
                        new C1BJG(new ACallableS150S0000000_13(2));
                        C1BJN.LIZ(new C1BKH() { // from class: X.1BKN
                            @Override // X.C1BKH
                            public final void LIZ(boolean z) {
                            }
                        }, C1EPD.Instrument);
                        C1BJN.LIZ(new C1BKH() { // from class: X.1BKO
                            @Override // X.C1BKH
                            public final void LIZ(boolean z) {
                            }
                        }, C1EPD.AppEvents);
                        C1BJN.LIZ(new C1BKH() { // from class: X.1BJy
                            @Override // X.C1BKH
                            public final void LIZ(boolean z) {
                                if (z) {
                                    FacebookSdk.LJIIJJI = true;
                                }
                            }
                        }, C1EPD.ChromeCustomTabsPrefetching);
                        C1BJN.LIZ(new C1BKH() { // from class: X.1BJz
                            @Override // X.C1BKH
                            public final void LIZ(boolean z) {
                                if (z) {
                                    FacebookSdk.LJIIL = true;
                                }
                            }
                        }, C1EPD.IgnoreAppSwitchToLoggedOut);
                        C1BJN.LIZ(new C1BKH() { // from class: X.1BK0
                            @Override // X.C1BKH
                            public final void LIZ(boolean z) {
                                if (z) {
                                    FacebookSdk.LJIILIIL = true;
                                }
                            }
                        }, C1EPD.BypassAppSwitch);
                        LJ().execute(new FutureTask(new Callable() { // from class: X.1BIt
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                AccessToken accessTokenLIZ;
                                String string;
                                C1C7U.LIZ("FacebookSdk@8a1e.com_facebook_FacebookSdk__sdkInitialize$___twin___$2L");
                                C2202741BIy c2202741BIyLIZ = C2202741BIy.LJFF.LIZ();
                                C2202761BJa c2202761BJa = c2202741BIyLIZ.LIZIZ;
                                if (!c2202761BJa.LIZ.contains("com.facebook.AccessTokenManager.CachedAccessToken") || (string = c2202761BJa.LIZ.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) == null) {
                                    accessTokenLIZ = null;
                                } else {
                                    try {
                                        JSONObject jSONObject = new JSONObject(string);
                                        AccessToken.Companion.getClass();
                                        accessTokenLIZ = C2202721BIw.LIZ(jSONObject);
                                    } catch (JSONException e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                        accessTokenLIZ = null;
                                    }
                                }
                                if (accessTokenLIZ != null) {
                                    c2202741BIyLIZ.LIZJ(accessTokenLIZ, false);
                                }
                                C2202701BIu c2202701BIuLIZ = C2202701BIu.LIZLLL.LIZ();
                                String string2 = c2202701BIuLIZ.LIZIZ.LIZ.getString("com.facebook.ProfileManager.CachedProfile", null);
                                if (string2 != null) {
                                    try {
                                        c2202701BIuLIZ.LIZ(new Profile(new JSONObject(string2)), false);
                                    } catch (JSONException e4) {
                                        TryCatchGuardChecker.doCheck(e4);
                                    }
                                }
                                AccessToken.Companion.getClass();
                                if (C2202721BIw.LIZJ()) {
                                    Profile.Companion.getClass();
                                    if (C2202701BIu.LIZLLL.LIZ().LIZJ == null) {
                                        C2202571BIh.LIZ();
                                    }
                                }
                                FacebookSdk.LIZJ();
                                if (!C807660VmG.LIZ(C1BJJ.class)) {
                                    try {
                                        try {
                                            Context contextLIZJ = FacebookSdk.LIZJ();
                                            Bundle bundle = C786410Ut5.V3(contextLIZJ.getPackageManager(), contextLIZJ.getPackageName(), 128).metaData;
                                            if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                                                Bundle bundle2 = new Bundle();
                                                if (!C0W7Q.LJIIL()) {
                                                    C786410Ut5.LJJJI("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest", bundle2);
                                                }
                                            }
                                        } catch (PackageManager.NameNotFoundException e5) {
                                            TryCatchGuardChecker.doCheck(e5);
                                        }
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                    }
                                }
                                C786410Ut5.N3(FacebookSdk.LIZJ());
                                C1C7U.LIZIZ("FacebookSdk@8a1e.com_facebook_FacebookSdk__sdkInitialize$___twin___$2L");
                                return null;
                            }
                        }));
                        return;
                    }
                    throw new C1BJO("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
                }
                throw new C1BJO("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            context.checkCallingOrSelfPermission("android.permission.INTERNET");
            LJII = C786410Ut5.N3(context);
            Context context22 = LJII;
            context22.getClass();
            LJIIIZ(context22);
            str = LIZJ;
            if (str == null) {
            }
            throw new C1BJO("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
    }

    public static void LIZIZ(Context context) {
        C08TN.LIZ().LJ("FacebookSdk", false);
        synchronized (FacebookSdk.class) {
            LJIIJJI(context);
        }
        C08TN.LIZ().LJI("FacebookSdk");
    }

    public static final void LJIIIZ(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfoV3 = C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128);
            if (applicationInfoV3.metaData == null) {
                return;
            }
            if (LIZJ == null) {
                try {
                    obj = applicationInfoV3.metaData.get("com.facebook.sdk.ApplicationId");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (u.LJJIIJZLJL(str.toLowerCase(Locale.ROOT), "fb", false)) {
                        LIZJ = str.substring(2);
                    } else {
                        LIZJ = str;
                    }
                } else if (obj instanceof Number) {
                    throw new C1BJO("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (LIZLLL == null) {
                LIZLLL = applicationInfoV3.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (LJ == null) {
                LJ = applicationInfoV3.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (LJIIIIZZ == 64206) {
                LJIIIIZZ = applicationInfoV3.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (LJFF == null) {
                LJFF = Boolean.valueOf(applicationInfoV3.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
