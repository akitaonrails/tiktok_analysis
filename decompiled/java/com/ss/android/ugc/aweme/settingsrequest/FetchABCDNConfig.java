package com.ss.android.ugc.aweme.settingsrequest;

import X.C089E;
import X.C08RN;
import X.C0CJ2;
import X.C0CJ4;
import X.C0CJ5;
import X.C0CO3;
import X.C0VSJ;
import X.C2084808Es;
import X.C2188811AlT;
import X.C2200151B8z;
import X.C259800zU;
import X.C786450Ut9;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.app.Application;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FetchABCDNConfig implements InterfaceC800130Va7 {
    public final List<C0CJ5> LL;
    public final C0CJ4 LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FetchABCDNConfig";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.P0;
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public FetchABCDNConfig(List<C0CJ5> list, C0CJ4 c0cj4) {
        this.LL = list;
        this.LLILLJJLI = c0cj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0141: IGET (r0 I:X.0CJ4) = (r8 I:com.ss.android.ugc.aweme.settingsrequest.FetchABCDNConfig) (LINE:33554753) com.ss.android.ugc.aweme.settingsrequest.FetchABCDNConfig.LLILLJJLI X.0CJ4, block:B:32:0x013e */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.ss.android.ugc.aweme.settingsrequest.FetchABCDNConfig] */
    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        ?? r8;
        try {
            if (this.LL.size() == 0) {
                this.LLILLJJLI.LIZ();
                return;
            }
            final C259800zU c259800zU = new C259800zU();
            boolean z2 = false;
            c259800zU.element = this.LL.get(0).LIZJ;
            final C259800zU c259800zU2 = new C259800zU();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZ(context).getPath());
            sbLIZ.append('/');
            sbLIZ.append(C2084808Es.LIZ("cdn_file"));
            sbLIZ.append('/');
            sbLIZ.append(C2084808Es.LIZ((String) c259800zU.element));
            c259800zU2.element = C2188811AlT.LIZIZ(sbLIZ);
            final C259800zU c259800zU3 = new C259800zU();
            c259800zU3.element = new HashMap();
            for (C0CJ5 c0cj5 : this.LL) {
                ((Map) c259800zU3.element).put(c0cj5.LIZIZ, null);
                if (C0CJ2.LIZIZ((String) c259800zU.element).contains(c0cj5.LIZ)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append((String) c259800zU2.element);
                    sbLIZ2.append('/');
                    sbLIZ2.append(c0cj5.LIZIZ);
                    if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).exists()) {
                        ((Map) c259800zU3.element).put(c0cj5.LIZIZ, Boolean.TRUE);
                    }
                }
            }
            File[] fileArrListFiles = new C0VSJ((String) c259800zU2.element).listFiles();
            if (fileArrListFiles != null) {
                C089E c089e = new C089E(fileArrListFiles);
                while (c089e.hasNext()) {
                    File file = (File) c089e.next();
                    if (!((HashMap) c259800zU3.element).containsKey(file.getName())) {
                        file.delete();
                    }
                }
            }
            for (final C0CJ5 c0cj52 : this.LL) {
                if (!Intrinsics.LJFF(((HashMap) c259800zU3.element).get(c0cj52.LIZIZ), Boolean.TRUE)) {
                    DownloadTask downloadTaskWith = C2200151B8z.with(context);
                    downloadTaskWith.url(c0cj52.LIZ);
                    downloadTaskWith.savePath((String) c259800zU2.element);
                    downloadTaskWith.name(c0cj52.LIZIZ);
                    downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: X.0CJ3
                        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onSuccessed(DownloadInfo downloadInfo) {
                            super.onSuccessed(downloadInfo);
                            if (downloadInfo != null) {
                                String str = c0cj52.LIZJ;
                                String url = downloadInfo.getUrl();
                                Set<String> setLIZIZ = C0CJ2.LIZIZ(str);
                                setLIZIZ.add(url);
                                Keva kevaLIZLLL = C0CJ2.LIZLLL();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(str);
                                sbLIZ3.append("$cdn_file_url_set");
                                kevaLIZLLL.storeStringSet(C2188811AlT.LIZIZ(sbLIZ3), setLIZIZ);
                            }
                            c259800zU3.element.put(c0cj52.LIZIZ, Boolean.TRUE);
                            if (c259800zU3.element.size() == this.LL.size()) {
                                Collection<Boolean> collectionValues = c259800zU3.element.values();
                                if (!collectionValues.isEmpty()) {
                                    Iterator<T> it2 = collectionValues.iterator();
                                    while (it2.hasNext()) {
                                        if (!Intrinsics.LJFF(it2.next(), Boolean.TRUE)) {
                                            return;
                                        }
                                    }
                                }
                                try {
                                    ArrayList arrayList = new ArrayList();
                                    for (C0CJ5 c0cj53 : this.LL) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append(c259800zU2.element);
                                        sbLIZ4.append('/');
                                        sbLIZ4.append(c0cj52.LIZIZ);
                                        C1717206ny.LIZ(new C308090C5v(new C0VSP(C2188811AlT.LIZIZ(sbLIZ4)), c0cj53.LIZIZ), arrayList);
                                    }
                                    new Object() { // from class: X.0C5w
                                    };
                                    C308080C5u c308080C5u = new C308080C5u(c259800zU.element, (C308090C5v[]) arrayList.toArray(new C308090C5v[0]));
                                    C0C5P.LIZJ().getClass();
                                    C0C5P.LJIIL(c308080C5u);
                                    String str2 = c259800zU.element;
                                    Set setLIZ = C0CJ2.LIZ();
                                    setLIZ.add(str2);
                                    C0CJ2.LJFF(setLIZ);
                                    this.LLILLJJLI.LIZ();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }

                        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                            super.onFailed(downloadInfo, baseException);
                            c259800zU3.element.put(c0cj52.LIZIZ, Boolean.FALSE);
                            this.LLILLJJLI.onFailed();
                        }
                    });
                    downloadTaskWith.download();
                    z2 = true;
                }
            }
            if (!z2) {
                this.LLILLJJLI.LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            r8.LLILLJJLI.onFailed();
        }
    }
}
