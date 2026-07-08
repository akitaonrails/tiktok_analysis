package com.ss.android.ugc.aweme.nxreword.manager;

import X.C0W81;
import X.C2102208Lk;
import X.C817670W5t;
import X.C818130W7n;
import X.C818150W7p;
import X.C818160W7q;
import X.C818170W7r;
import X.C818230W7x;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.nxreword.utils.NxResourceUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class NxRewordManager {
    public static Locale LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static Context LJ;
    public static String LJFF;
    public static C818230W7x LJI;
    public static long LJIIIIZZ;
    public static volatile boolean LJIIIZ;
    public static volatile C817670W5t LJIIJ;
    public static ExecutorService LJIIJJI;
    public static Resources.Theme LJIIL;
    public static boolean LJIILIIL;
    public static Function1<? super Context, Unit> LJIILJJIL;
    public static final NxRewordManager LIZ = new NxRewordManager();
    public static final Object LJII = new Object();
    public static final AtomicBoolean LJIILL = new AtomicBoolean(false);
    public static boolean LJIILLIIL = true;
    public static boolean LJIIZILJ = true;

    public static Locale LIZIZ() {
        Locale locale = LIZIZ;
        if (locale != null) {
            return locale;
        }
        return null;
    }

    public static void LJ(Locale locale) {
        if (!LJIIIZ) {
            return;
        }
        Function1<? super Context, Unit> function1 = LJIILJJIL;
        if (function1 != null) {
            function1.invoke(LJ);
        }
        LIZIZ = locale;
        String str = LJFF;
        if (str == null) {
            str = null;
        }
        C818160W7q c818160W7q = new C818160W7q(locale);
        c818160W7q.LJIIIZ = str;
        AwS592S0100000_13 awS592S0100000_13 = new AwS592S0100000_13(locale, 46);
        c818160W7q.LJ = SystemClock.elapsedRealtimeNanos();
        awS592S0100000_13.invoke(c818160W7q);
        c818160W7q.LJFF = SystemClock.elapsedRealtimeNanos();
        c818160W7q.LIZJ();
        Field field = C817670W5t.LJI;
        C817670W5t.LJIILLIIL = new LinkedHashMap();
        SharedPreferences sharedPreferences = C818130W7n.LIZ;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C818170W7r c818170W7r = new C818170W7r(locale);
        c818170W7r.LIZIZ = jElapsedRealtimeNanos;
        c818170W7r.LJ = "switch_locale";
        C818130W7n.LIZJ(locale, c818170W7r, true);
    }

    public static boolean LIZ(Resources resources, boolean z) {
        if (LIZJ == 0) {
            synchronized (LJII) {
                try {
                    LJIILLIIL = z;
                    if (LIZJ == 0) {
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        Intrinsics.LJIIJJI(Boolean.valueOf(z), "init load default resource, fromInit: ");
                        System.loadLibrary("nxreword");
                        LIZJ = NxResourceUtils.INSTANCE.initNativeResourceManager(resources.getAssets());
                        LJIIIIZZ = (SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIILLIIL;
    }

    public static Resources LJFF(Context context, Resources resources) {
        if (LJIIJ == null) {
            try {
                if (LJIILL.compareAndSet(false, true)) {
                    C2102208Lk.LIZ(null, new C0W81(resources), 31);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (!LJIIIZ) {
            return resources;
        }
        if (LJIIJ == null) {
            LJIIJ = new C817670W5t(resources, resources.getConfiguration().locale, new WeakReference(context), false);
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                configuration.locale = LIZIZ();
            }
            C817670W5t c817670W5t = LJIIJ;
            if (c817670W5t != null) {
                c817670W5t.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
        return LJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.util.Locale r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager.LIZLLL(java.util.Locale, java.lang.String, boolean):void");
    }

    public final void LIZJ(Context context, C818150W7p c818150W7p, Function1<? super Context, Unit> function1) {
        LJIILIIL = true;
        Locale locale = c818150W7p.LIZ;
        String str = c818150W7p.LIZIZ;
        C818160W7q c818160W7q = new C818160W7q(locale);
        c818160W7q.LJIIIZ = str;
        NxRewordManager$init$1 nxRewordManager$init$1 = new NxRewordManager$init$1(c818150W7p, this, function1, context);
        c818160W7q.LIZIZ = SystemClock.elapsedRealtimeNanos();
        nxRewordManager$init$1.invoke(c818160W7q);
        c818160W7q.LIZLLL = SystemClock.elapsedRealtimeNanos();
        LJIIIZ = true;
    }
}
