package com.bytedance.librarian;

import X.C08TL;
import X.C09NU;
import X.C0VSJ;
import X.C1304550k3J;
import X.C20129613pW;
import X.C2188811AlT;
import X.C2421309eF;
import X.C2421509eH;
import X.C2422509eR;
import X.C282210B4h;
import X.C282980B7g;
import X.C293320Bec;
import X.C299090Bnv;
import X.C535670Kzd;
import X.C786410Ut5;
import X.C805380Via;
import X.C844470XAv;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.zoin.model.ModuleManager;
import com.ss.android.agilelogger.ALog;
import com.ss.android.legoimpl.DecompressTask;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.VEPluginNotLoadedException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class Librarian {
    public static Context LIZ;
    public static volatile String LIZIZ;
    public static LibrarianMonitor LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final Object LJFF = new Object();

    public static void LIZIZ() {
        LibrarianImpl librarianImpl = LibrarianImpl.instance;
        if (librarianImpl != null) {
            librarianImpl.LIZ();
        }
    }

    public static UnsatisfiedLinkError[] LIZJ() {
        UnsatisfiedLinkError[] unsatisfiedLinkErrorArr;
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = LibrarianUnsatisfiedLinkError.LL;
        synchronized (arrayList) {
            try {
                unsatisfiedLinkErrorArr = (UnsatisfiedLinkError[]) arrayList.toArray(new UnsatisfiedLinkError[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return unsatisfiedLinkErrorArr;
    }

    public static UnsatisfiedLinkError[] LIZLLL() {
        UnsatisfiedLinkError[] unsatisfiedLinkErrorArr;
        ArrayList<UnsatisfiedLinkError> arrayList = LibrarianUnsatisfiedLinkError.LLILLJJLI;
        synchronized (arrayList) {
            try {
                unsatisfiedLinkErrorArr = (UnsatisfiedLinkError[]) arrayList.toArray(new UnsatisfiedLinkError[arrayList.size()]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return unsatisfiedLinkErrorArr;
    }

    public static void LIZ(List<String> list) {
        LibrarianImpl librarianImpl = LibrarianImpl.instance;
        if (librarianImpl != null) {
            ArrayList<String> arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                synchronized (librarianImpl.LJII) {
                    try {
                        for (String str : arrayList) {
                            if (str != null && str.length() != 0) {
                                C0VSJ c0vsj = new C0VSJ(str);
                                if (c0vsj.exists()) {
                                    try {
                                        ((ArrayList) librarianImpl.LJII).add(new C09NU((File) c0vsj));
                                        LibrarianMonitor librarianMonitor = librarianImpl.LIZ;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("custom apk path: ");
                                        sbLIZ.append(str);
                                        C2188811AlT.LIZIZ(sbLIZ);
                                        librarianMonitor.getClass();
                                    } catch (IOException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        LibrarianMonitor librarianMonitor2 = librarianImpl.LIZ;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("custom apk exception ");
                                        sbLIZ2.append(c0vsj.getName());
                                        sbLIZ2.append(", size ");
                                        sbLIZ2.append(c0vsj.length());
                                        sbLIZ2.append(", exists ");
                                        sbLIZ2.append(c0vsj.exists());
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                        librarianMonitor2.getClass();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                librarianImpl.LJIIIIZZ = null;
            }
        }
    }

    public static void LJFF(String str) {
        if (C08TL.LIZIZ.get(str) == null) {
            if (((HashSet) C1304550k3J.LJ).contains(str) && C535670Kzd.LIZ().LJIIIZ() && !C20129613pW.LIZ.get()) {
                if (!((IPluginService) PluggableExtentionKt.pluggableSpi(IPluginService.class)).checkPluginInstalled("com.ss.android.ugc.aweme.df_camera")) {
                    try {
                        Class.forName("com.ss.android.ugc.aweme.tools.aab.CameraDFInternalServiceImpl");
                        C20129613pW.LIZ.set(true);
                    } catch (ClassNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("VE Plugin No Ready, libName ");
                        sbLIZ.append(str);
                        final VEPluginNotLoadedException vEPluginNotLoadedException = new VEPluginNotLoadedException(C2188811AlT.LIZIZ(sbLIZ));
                        if (!C299090Bnv.LIZ()) {
                            if (((Boolean) C282980B7g.LIZ.getValue()).booleanValue()) {
                                Npth.reportBizException("VEPluginNot", vEPluginNotLoadedException, str, new LinkedHashMap(), new LinkedHashMap());
                                C805380Via.LIZJ(vEPluginNotLoadedException, str);
                            }
                        } else {
                            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable(vEPluginNotLoadedException) { // from class: X.0GUr
                                public final VEPluginNotLoadedException LL;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1C7U.LIZ("LibrarianLanect$ThrowExceptionRunnable@9c1d.run");
                                    try {
                                        throw this.LL;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        if (!C2179971ATj.LIZ(th)) {
                                            throw th;
                                        }
                                        C1C7U.LIZIZ("LibrarianLanect$ThrowExceptionRunnable@9c1d.run");
                                    }
                                }

                                {
                                    this.LL = vEPluginNotLoadedException;
                                }
                            });
                            throw vEPluginNotLoadedException;
                        }
                    }
                } else {
                    C20129613pW.LIZ.set(true);
                }
            }
            C2421309eF.LIZ.getClass();
            if (ModuleManager.isSoDepsNeedsResolve(str)) {
                if (str.equals("tt_c2pa_sdk")) {
                    if (C1304550k3J.LIZ == null) {
                        C1304550k3J.LIZ = Boolean.valueOf(((Boolean) C2422509eR.LIZ.getValue()).booleanValue());
                    }
                    if (C1304550k3J.LIZ.booleanValue()) {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        if (contextLIZ != null) {
                            DecompressTask.LJ((Application) contextLIZ);
                        } else {
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ZOIN", "null context when load");
                        }
                        C2421509eH.LIZ(str, C1304550k3J.LIZLLL);
                    } else {
                        loadLibraryInternal(str, false, false, null);
                    }
                } else if (((HashSet) C1304550k3J.LJFF).contains(str)) {
                    if (C1304550k3J.LIZIZ == null) {
                        C1304550k3J.LIZIZ = Boolean.valueOf(((Boolean) C282210B4h.LIZ.getValue()).booleanValue());
                    }
                    if (C1304550k3J.LIZIZ.booleanValue()) {
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ2 = C844470XAv.LIZ();
                        if (contextLIZ2 != null) {
                            DecompressTask.LJ((Application) contextLIZ2);
                        } else {
                            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ZOIN", "null context when load");
                        }
                        C2421509eH.LIZ(str, C1304550k3J.LIZLLL);
                    } else {
                        loadLibraryInternal(str, false, false, null);
                    }
                } else {
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ3 = C844470XAv.LIZ();
                    if (contextLIZ3 != null) {
                        DecompressTask.LJ((Application) contextLIZ3);
                    } else {
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("ZOIN", "null context when load");
                    }
                    C2421509eH.LIZ(str, C1304550k3J.LIZLLL);
                }
            } else {
                loadLibraryInternal(str, false, false, null);
            }
            if ("NLETemplateModelJni".equals(str) && !C293320Bec.LIZ) {
                C293320Bec.LIZIZ = true;
            }
        }
    }

    public static void LJI(Context context, String str) {
        loadLibraryInternal(str, false, true, context);
    }

    public static void loadLibraryInternal(String str, boolean z, boolean z2, Context context) {
        TextUtils.isEmpty(str);
        if (z2 && LIZ == null) {
            LIZ = context;
        }
        LibrarianImpl librarianImpl = LibrarianImpl.instance;
        if (librarianImpl != null) {
            librarianImpl.LJII(str, z);
        } else {
            LibrarianMonitor librarianMonitor = LIZJ;
            if (librarianMonitor != null) {
                librarianMonitor.LIZ(str);
            } else {
                System.loadLibrary(str);
            }
        }
        TextUtils.isEmpty(str);
    }

    public static void LJ(Context context, String str, boolean z, boolean z2, LibrarianMonitor librarianMonitor) {
        synchronized (LJFF) {
            try {
                if (LIZIZ != null) {
                    return;
                }
                if (context != null && str != null) {
                    LIZ = context;
                    LIZIZ = str;
                    LIZJ = librarianMonitor;
                    LIZLLL = z;
                    LJ = z2;
                    return;
                }
                throw new IllegalStateException("context or version is null in init");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
