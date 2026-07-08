package jv6;

import X.C08PR;
import X.C08Q0;
import X.C08T3;
import X.C08T4;
import X.C08T5;
import X.C08TA;
import X.C08TD;
import X.C08TE;
import X.C08TG;
import X.C08UU;
import X.C09NU;
import X.C0VSJ;
import X.C1BWL;
import X.C20600085e;
import X.C2120908Sp;
import X.C2121308St;
import X.C2121508Sv;
import X.C2121708Sx;
import X.C2133108Xh;
import X.C2133908Xp;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C810670Vr7;
import X.EnumC2121908Sz;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static final AtomicReference LJ = new AtomicReference(null);
    public final C08PR LIZ;
    public final C2121708Sx LIZIZ;
    public final Set LIZJ = new HashSet();
    public final C2121308St LIZLLL;

    public final Set LJ() {
        HashSet hashSet;
        synchronized (this.LIZJ) {
            try {
                hashSet = new HashSet(this.LIZJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return hashSet;
    }

    public a(Context context) {
        try {
            C08PR c08pr = new C08PR(context);
            this.LIZ = c08pr;
            this.LIZLLL = new C2121308St(c08pr);
            this.LIZIZ = new C2121708Sx(context);
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C08T4("Failed to initialize FileStorage", e);
        }
    }

    public static boolean LIZ(Context context) {
        StrictMode.ThreadPolicy threadPolicy;
        a aVar = (a) LJ.get();
        if (aVar == null) {
            if (C786410Ut5.N3(context) != null) {
                install(C786410Ut5.N3(context));
            }
            return install(context);
        }
        C2121308St c2121308St = aVar.LIZLLL;
        Set setLJ = aVar.LJ();
        synchronized (c2121308St) {
            try {
                threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                threadPolicy = null;
            }
            try {
                HashSet hashSet = new HashSet();
                Iterator it2 = ((HashSet) setLJ).iterator();
                while (it2.hasNext()) {
                    hashSet.add(c2121308St.LIZ.LIZ((String) it2.next()));
                }
                c2121308St.LIZ(context, hashSet);
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    return false;
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r0.length == 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jv6.a.LIZJ(android.content.Context):boolean");
    }

    public static boolean LIZLLL(Context context) {
        if ((C08Q0.LIZIZ(C1BWL.LIZ(), 0, "ab_resaltas_event") & 1) == 1) {
            String strLIZ = C20600085e.LIZ(context);
            String strLIZ2 = C08TG.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                C08TG.LIZJ("split_compat", "install_before", C08TG.LIZIZ("api", "installActivity", "caller_context", strLIZ, "top_page", strLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            boolean zLIZ = LIZ(context);
            try {
                C08TG.LIZJ("split_compat", "install_after", C08TG.LIZIZ("api", "installActivity", "cost_ms", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), "result", Boolean.valueOf(zLIZ), "caller_context", strLIZ, "top_page", C08TG.LIZ()));
                return zLIZ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return zLIZ;
            }
        }
        return LIZ(context);
    }

    public static boolean install(Context context) {
        if ((C08Q0.LIZIZ(C1BWL.LIZ(), 0, "ab_resaltas_event") & 1) == 1) {
            String strLIZ = C20600085e.LIZ(context);
            String strLIZ2 = C08TG.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                C08TG.LIZJ("split_compat", "install_before", C08TG.LIZIZ("api", "install", "caller_context", strLIZ, "top_page", strLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            boolean zLIZJ = LIZJ(context);
            try {
                C08TG.LIZJ("split_compat", "install_after", C08TG.LIZIZ("api", "install", "cost_ms", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), "result", Boolean.valueOf(zLIZJ), "caller_context", strLIZ, "top_page", C08TG.LIZ()));
                return zLIZJ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return zLIZJ;
            }
        }
        return LIZJ(context);
    }

    public final void LJFF(Set set) {
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            C08PR.LIZLLL(this.LIZ.LIZ((String) it2.next()));
        }
        C2121708Sx c2121708Sx = this.LIZIZ;
        c2121708Sx.getClass();
        synchronized (C2121708Sx.class) {
            try {
                C810670Vr7.LIZJ(c2121708Sx.LIZ, 0, "playcore_split_install_internal").edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LJI(final Context context, boolean z) {
        boolean z2;
        AtomicReference atomicReference = LJ;
        a aVar = new a(context);
        while (true) {
            if (atomicReference.compareAndSet(null, aVar)) {
                z2 = true;
                break;
            }
            if (atomicReference.get() != null && atomicReference.get() != null) {
                z2 = false;
                break;
            }
        }
        final a aVar2 = (a) LJ.get();
        if (z2) {
            EnumC2121908Sz.zza.zzb(new C2120908Sp(context, C08UU.LIZIZ(), new C2133108Xh(context, aVar2.LIZ), aVar2.LIZ));
            C08TD c08td = new C08TD() { // from class: X.08T6
                @Override // X.C08TD
                public final Set zza() {
                    return this.LIZ.LJ();
                }
            };
            AtomicReference atomicReference2 = C08TA.LIZ;
            while (!atomicReference2.compareAndSet(null, c08td) && (atomicReference2.get() == null || atomicReference2.get() == null)) {
            }
            C08UU.LIZIZ().execute(new Runnable() { // from class: X.09k3
                @Override // java.lang.Runnable
                @C1BCF(distinctId = AnonymousClass1375.serialVersionUID, scene = "boot", taskPriority = EnumC21352718hJ.UI)
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzo@a62.run");
                    try {
                        try {
                            C2457009k0 c2457009k0LIZLLL = C2457009k0.LIZLLL(context);
                            synchronized (c2457009k0LIZLLL) {
                                c2457009k0LIZLLL.LJFF = true;
                                c2457009k0LIZLLL.LIZJ();
                            }
                        } catch (SecurityException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzo@a62.run");
                }
            });
        }
        try {
            synchronized (aVar2) {
                try {
                    aVar2.LIZIZ(context, z);
                } finally {
                }
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final synchronized void LIZIZ(Context context, boolean z) {
        List<String> listAsList;
        C08T3 c2133908Xp;
        String str;
        String str2;
        if (!z) {
            C08UU.LIZIZ().execute(new Runnable() { // from class: X.08PS
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzq@a60.run");
                    try {
                        try {
                            this.LL.LIZ.LIZJ();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzq@a60.run");
                }
            });
        } else {
            this.LIZ.LIZJ();
        }
        String packageName = context.getPackageName();
        try {
            String[] strArr = C786410Ut5.Y3(context.getPackageManager(), packageName, 0).splitNames;
            if (strArr == null) {
                listAsList = new ArrayList();
            } else {
                listAsList = Arrays.asList(strArr);
            }
            Set setLIZIZ = this.LIZ.LIZIZ();
            Set setLIZ = this.LIZIZ.LIZ();
            final HashSet hashSet = new HashSet();
            HashSet<C08T5> hashSet2 = (HashSet) setLIZIZ;
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String strLIZIZ = ((C08T5) it2.next()).LIZIZ();
                if (!listAsList.contains(strLIZIZ)) {
                    if (strLIZIZ.startsWith("config.")) {
                        str2 = "";
                    } else {
                        str2 = strLIZIZ.split("\\.config\\.", 2)[0];
                    }
                    if (setLIZ.contains(str2)) {
                    }
                }
                hashSet.add(strLIZIZ);
                it2.remove();
            }
            if (!z) {
                if (!hashSet.isEmpty()) {
                    C08UU.LIZIZ().execute(new Runnable() { // from class: X.08EP
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("zzr@a5f.run");
                            try {
                                try {
                                    this.LLILLJJLI.LJFF(hashSet);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("zzr@a5f.run");
                        }
                    });
                }
            } else {
                LJFF(hashSet);
            }
            HashSet hashSet3 = new HashSet();
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                String strLIZIZ2 = ((C08T5) it3.next()).LIZIZ();
                if (!C08TE.LIZLLL(strLIZIZ2)) {
                    hashSet3.add(strLIZIZ2);
                }
            }
            for (String str3 : listAsList) {
                if (!C08TE.LIZLLL(str3)) {
                    hashSet3.add(str3);
                }
            }
            HashSet<C08T5> hashSet4 = new HashSet(hashSet2.size());
            for (C08T5 c08t5 : hashSet2) {
                if (!c08t5.LIZIZ().startsWith("config.")) {
                    String strLIZIZ3 = c08t5.LIZIZ();
                    if (strLIZIZ3.startsWith("config.")) {
                        str = "";
                    } else {
                        str = strLIZIZ3.split("\\.config\\.", 2)[0];
                    }
                    if (hashSet3.contains(str)) {
                    }
                }
                hashSet4.add(c08t5);
            }
            C2121508Sv c2121508Sv = new C2121508Sv(this.LIZ);
            switch (Build.VERSION.SDK_INT) {
                case 23:
                    c2133908Xp = new C2133908Xp();
                    break;
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    c2133908Xp = new C08T3() { // from class: X.08Xu
                        @Override // X.C08T3
                        public final void LIZ(ClassLoader classLoader, Set set) {
                            C2133908Xp.LIZJ(classLoader, set, new C2134708Xx());
                        }

                        @Override // X.C08T3
                        public final boolean LIZIZ(ClassLoader classLoader, C0VSJ c0vsj, File file, boolean z2) {
                            return C2133908Xp.LIZLLL(classLoader, c0vsj, file, z2);
                        }
                    };
                    break;
                case 25:
                    c2133908Xp = new C08T3() { // from class: X.08Xv
                        @Override // X.C08T3
                        public final void LIZ(ClassLoader classLoader, Set set) {
                            C2133908Xp.LIZJ(classLoader, set, new C2134708Xx());
                        }

                        @Override // X.C08T3
                        public final boolean LIZIZ(ClassLoader classLoader, C0VSJ c0vsj, File file, boolean z2) {
                            return C2133908Xp.LIZLLL(classLoader, c0vsj, file, z2);
                        }
                    };
                    break;
                case 26:
                    c2133908Xp = new C08T3() { // from class: X.08Xr
                        @Override // X.C08T3
                        public final void LIZ(ClassLoader classLoader, Set set) {
                            C2133908Xp.LIZJ(classLoader, set, new C2134808Xy());
                        }

                        @Override // X.C08T3
                        public final boolean LIZIZ(ClassLoader classLoader, C0VSJ c0vsj, File file, boolean z2) {
                            return C2134008Xq.LIZJ(classLoader, c0vsj, file, z2, new C2134608Xw(), "path", new C2133608Xm());
                        }
                    };
                    break;
                case 27:
                    if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                        c2133908Xp = new C08T3() { // from class: X.08Xs
                            @Override // X.C08T3
                            public final void LIZ(ClassLoader classLoader, Set set) {
                                C2133908Xp.LIZJ(classLoader, set, new C2134808Xy());
                            }

                            @Override // X.C08T3
                            public final boolean LIZIZ(ClassLoader classLoader, C0VSJ c0vsj, File file, boolean z2) {
                                return C2134008Xq.LIZJ(classLoader, c0vsj, file, z2, new C2134608Xw(), "path", new C2133608Xm());
                            }
                        };
                        break;
                    }
                default:
                    c2133908Xp = new C08T3() { // from class: X.08Xt
                        @Override // X.C08T3
                        public final void LIZ(ClassLoader classLoader, Set set) {
                            C2133908Xp.LIZJ(classLoader, set, new C2134808Xy());
                        }

                        @Override // X.C08T3
                        public final boolean LIZIZ(ClassLoader classLoader, C0VSJ c0vsj, File file, boolean z2) {
                            return C2134008Xq.LIZJ(classLoader, c0vsj, file, z2, new C2134608Xw(), "path", new C08Y1() { // from class: X.08Y0
                                @Override // X.C08Y1
                                public final boolean LIZ(Object obj, File file2, C0VSJ c0vsj2) {
                                    return true;
                                }
                            });
                        }
                    };
                    break;
            }
            ClassLoader classLoader = context.getClassLoader();
            if (z) {
                c2133908Xp.LIZ(classLoader, c2121508Sv.LIZIZ());
            } else {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    Set setLIZ2 = c2121508Sv.LIZ((C08T5) it4.next());
                    if (setLIZ2 == null) {
                        it4.remove();
                    } else {
                        c2133908Xp.LIZ(classLoader, setLIZ2);
                    }
                }
            }
            HashSet hashSet5 = new HashSet();
            for (C08T5 c08t52 : hashSet4) {
                try {
                    C09NU c09nu = new C09NU(c08t52.LIZ());
                    try {
                        ZipEntry entry = c09nu.getEntry("classes.dex");
                        c09nu.close();
                        if (entry != null) {
                            C08PR c08pr = this.LIZ;
                            String strLIZIZ4 = c08t52.LIZIZ();
                            c08pr.getClass();
                            C0VSJ c0vsj = new C0VSJ(c08pr.LJII(), "dex");
                            C08PR.LJFF(c0vsj);
                            C0VSJ c0vsjLJ = C08PR.LJ(c0vsj, strLIZIZ4);
                            C08PR.LJFF(c0vsjLJ);
                            if (!c2133908Xp.LIZIZ(classLoader, c0vsjLJ, c08t52.LIZ(), z)) {
                                "split was not installed ".concat(c08t52.LIZ().toString());
                            }
                        }
                        hashSet5.add(c08t52.LIZ());
                    } catch (IOException e) {
                        try {
                            c09nu.close();
                            throw e;
                        } catch (IOException e2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e2, e2);
                                throw e2;
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                throw e2;
                            }
                        }
                    }
                } catch (IOException e22) {
                    throw e22;
                }
            }
            this.LIZLLL.LIZ(context, hashSet5);
            HashSet hashSet6 = new HashSet();
            for (C08T5 c08t53 : hashSet4) {
                if (hashSet5.contains(c08t53.LIZ())) {
                    String strLIZIZ5 = c08t53.LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Split '");
                    sbLIZ.append(strLIZIZ5);
                    sbLIZ.append("' installation emulated");
                    C2188811AlT.LIZIZ(sbLIZ);
                    hashSet6.add(c08t53.LIZIZ());
                } else {
                    String strLIZIZ6 = c08t53.LIZIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Split '");
                    sbLIZ2.append(strLIZIZ6);
                    sbLIZ2.append("' installation not emulated.");
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            synchronized (this.LIZJ) {
                try {
                    this.LIZJ.addAll(hashSet6);
                } finally {
                    TryCatchGuardChecker.doCheck(e22);
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            TryCatchGuardChecker.doCheck(e4);
            throw new IOException(C786410Ut5.j4("Cannot load data for application '%s'", new Object[]{packageName}), e4);
        }
    }
}
