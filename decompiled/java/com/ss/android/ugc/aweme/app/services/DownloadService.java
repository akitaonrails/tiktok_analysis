package com.ss.android.ugc.aweme.app.services;

import X.C036E;
import X.C09MO;
import X.C09MP;
import X.C0VSJ;
import X.C0XI3;
import X.C2093608Ic;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadService implements IDownloadService {
    @Override // com.ss.android.ugc.aweme.app.services.IDownloadService
    public final boolean LIZ(Context context, String str, String str2, String str3) throws Throwable {
        List<C09MP> listExtractImageUrlList = C09MO.extractImageUrlList(str, null);
        if (listExtractImageUrlList != null && !listExtractImageUrlList.isEmpty()) {
            int i = 0;
            for (C09MP c09mp : listExtractImageUrlList) {
                if (c09mp != null) {
                    String str4 = c09mp.LIZ;
                    if (!C2093608Ic.LJ(str4)) {
                        i++;
                        if (i > 3) {
                            break;
                        }
                        String[] strArr = new String[1];
                        int[] iArr = new int[1];
                        System.currentTimeMillis();
                        try {
                            try {
                                if (!C036E.LIZ.LIZIZ()) {
                                    break;
                                }
                                try {
                                    boolean zDownloadFile = NetworkUtils.downloadFile(20971520, str4, str2, "", str3, null, str3, null, c09mp.LIZIZ, strArr, iArr);
                                    System.currentTimeMillis();
                                    try {
                                        if (zDownloadFile) {
                                            try {
                                            } catch (Exception e) {
                                                e = e;
                                            }
                                            try {
                                                C0VSJ c0vsj = new C0VSJ(str2, str3);
                                                if (c0vsj.isFile()) {
                                                    long length = c0vsj.length();
                                                    if (length > 0 && iArr[0] <= 0 && length < 2147483647L) {
                                                        iArr[0] = (int) length;
                                                        return zDownloadFile;
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                TryCatchGuardChecker.doCheck(e);
                                                return zDownloadFile;
                                            }
                                        }
                                        return zDownloadFile;
                                    } catch (Throwable th) {
                                        th = th;
                                        TryCatchGuardChecker.doCheck(th);
                                        if (!(th instanceof SocketException) && !(th instanceof IOException) && !(th instanceof SocketTimeoutException) && !(th instanceof C0XI3)) {
                                            throw th;
                                        }
                                        try {
                                            if (!C036E.LIZ.LIZIZ()) {
                                                return false;
                                            }
                                        } catch (Exception e3) {
                                            TryCatchGuardChecker.doCheck(e3);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                return false;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }
}
