package com.ss.android.socialbase.downloader.service;

import X.C2199761B7m;
import X.C786410Ut5;
import X.InterfaceC2200101B8u;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadPreconnecterService implements IDownloadPreconnecterService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
    public void asyncFetchHttpHeadInfo(final String str, InterfaceC2200101B8u interfaceC2200101B8u) {
        C786410Ut5.LJJZZIII(C2199761B7m.LIZIZ, new Runnable() { // from class: X.1B80
            public final void LIZ() throws Throwable {
                C2199841B7u c2199841B7u;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                C2199841B7u c2199841B7uLIZ = null;
                try {
                    try {
                        try {
                            List<HttpHeader> listLIZ = C2199661B7c.LIZ(0L, 0L, null, null);
                            C2199851B7v c2199851B7v = C2199901B8a.LIZ;
                            if (!c2199851B7v.LIZIZ(str) || (c2199841B7uLIZ = c2199851B7v.LIZ(str, listLIZ)) == null) {
                                c2199841B7u = new C2199841B7u(str, listLIZ);
                                try {
                                    c2199841B7u.LIZJ();
                                    if (c2199841B7u.LJI) {
                                        String str2 = str;
                                        synchronized (c2199851B7v.LIZ) {
                                            try {
                                                ((HashMap) c2199851B7v.LIZ).put(str2, c2199841B7u);
                                            } finally {
                                            }
                                        }
                                    }
                                    c2199841B7uLIZ = c2199841B7u;
                                } catch (Exception e) {
                                    e = e;
                                    TryCatchGuardChecker.doCheck(e);
                                    c2199841B7u.cancel();
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        c2199841B7u.cancel();
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            c2199841B7uLIZ.cancel();
                        } catch (Throwable th2) {
                            th = th2;
                            c2199841B7uLIZ = null;
                            c2199841B7u = c2199841B7uLIZ;
                            TryCatchGuardChecker.doCheck(th);
                            c2199841B7u.cancel();
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        c2199841B7u = c2199841B7uLIZ;
                    } catch (Throwable th3) {
                        th = th3;
                        c2199841B7u = c2199841B7uLIZ;
                        TryCatchGuardChecker.doCheck(th);
                        c2199841B7u.cancel();
                        throw th;
                    }
                } catch (Throwable th4) {
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DownloadPreconnecterImpl@82ba.asyncFetchHttpHeadInfo$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DownloadPreconnecterImpl@82ba.asyncFetchHttpHeadInfo$1");
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
    public void preconnect(String str, String str2, boolean z) {
        C2199761B7m.LIZJ(-1, str, str2, null, z, true);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadPreconnecterService
    public void preconnect(int i, String str, String str2, List<HttpHeader> list, boolean z, boolean z2) {
        C2199761B7m.LIZJ(i, str, str2, list, z, z2);
    }
}
