package com.ss.mediakit.fetcher;

import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLURLFetcherBridge implements AVMDLURLFetcherListener {
    public static AVMDLFetcherMakerInterface fetcherMaker = null;
    public static AVMDLNewFetcherMakerInterface newFetcherMaker = null;
    public static int sJniVersion = 2;
    public String engineId;
    public AVMDLURLFetcherInterface fetcherInstance;
    public String fileKey;
    public boolean isFinish;
    public String newURL;
    public String oldURL;
    public String rawKey;
    public Lock lock = new ReentrantLock();
    public long handle = 0;

    public static native void _notifyFetcherResult(long j, String str, String str2, String str3);

    public static native void _notifyFetcherResult(long j, String str, String str2, String str3, int i);

    public String getResult() {
        this.lock.lock();
        try {
            String str = this.newURL;
            this.lock.unlock();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("****get result:");
            sbLIZ.append(str);
            AVMDLLog.d("AVMDLURLFetcherBridge", C2188811AlT.LIZIZ(sbLIZ));
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public void release() {
        Locale locale = Locale.US;
        AVMDLLog.d("AVMDLURLFetcherBridge", C786410Ut5.k4(locale, "----start release fetcher:%s", new Object[]{this}));
        this.lock.lock();
        try {
            this.handle = 0L;
            this.lock.unlock();
            AVMDLLog.d("AVMDLURLFetcherBridge", C786410Ut5.k4(locale, "remove fetcher rawkey:%s, fileKey:%s", new Object[]{this.rawKey, this.fileKey}));
            AVMDLLog.d("AVMDLURLFetcherBridge", C786410Ut5.k4(locale, "****end call release:%s", new Object[]{this}));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public boolean isFinish() {
        return this.isFinish;
    }

    public static void setFetcherMaker(AVMDLFetcherMakerInterface aVMDLFetcherMakerInterface) {
        if (aVMDLFetcherMakerInterface != null) {
            fetcherMaker = aVMDLFetcherMakerInterface;
        }
    }

    public static void setNewFetcherMaker(AVMDLNewFetcherMakerInterface aVMDLNewFetcherMakerInterface) {
        if (aVMDLNewFetcherMakerInterface != null) {
            newFetcherMaker = aVMDLNewFetcherMakerInterface;
        }
    }

    public int getNewUrl(AVMDLURLFetcherInterface aVMDLURLFetcherInterface, String str, String str2, String str3) {
        this.rawKey = str;
        this.fileKey = str2;
        this.oldURL = str3;
        int iStart = aVMDLURLFetcherInterface.start(str, str2, str3, this);
        if (iStart <= 0) {
            return 0;
        }
        String[] uRLs = aVMDLURLFetcherInterface.getURLs();
        if (uRLs != null && uRLs.length != 0) {
            if (this.handle == 0) {
                return 0;
            }
            this.newURL = uRLs[0];
            AVMDLLog.d("AVMDLURLFetcherBridge", "start notify result");
            if (sJniVersion == 2) {
                try {
                    _notifyFetcherResult(this.handle, str, str2, uRLs[0], 1);
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    sJniVersion = 1;
                }
            }
            if (sJniVersion == 1) {
                _notifyFetcherResult(this.handle, str, str2, uRLs[0]);
            }
            AVMDLLog.d("AVMDLURLFetcherBridge", "end notify result");
            return 1;
        }
        AVMDLLog.d("AVMDLURLFetcherBridge", C786410Ut5.k4(Locale.US, "****end fail start ret:%d, but getURLs null", new Object[]{Integer.valueOf(iStart)}));
        return -2;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherListener
    public void onCompletion(int i, String str, String str2, String[] strArr) {
        this.lock.lock();
        try {
            if (!this.isFinish) {
                if (strArr != null && strArr.length > 0) {
                    this.newURL = strArr[0];
                }
                AVMDLLog.d("AVMDLURLFetcherBridge", C786410Ut5.k4(Locale.US, "receive completion code:%d result:%s", new Object[]{Integer.valueOf(i), this.newURL}));
                this.isFinish = true;
                if (this.handle != 0) {
                    AVMDLLog.d("AVMDLURLFetcherBridge", "start notify result");
                    if (sJniVersion == 2) {
                        try {
                            _notifyFetcherResult(this.handle, str, str2, this.newURL, i);
                        } catch (UnsatisfiedLinkError e) {
                            TryCatchGuardChecker.doCheck(e);
                            sJniVersion = 1;
                        }
                    }
                    if (sJniVersion == 1) {
                        _notifyFetcherResult(this.handle, str, str2, this.newURL);
                    }
                    AVMDLLog.d("AVMDLURLFetcherBridge", "end notify result");
                }
            } else {
                AVMDLLog.d("AVMDLURLFetcherBridge", C786410Ut5.k4(Locale.US, "has fetch finished not need cur completion code:%d result:%s", new Object[]{Integer.valueOf(i), this.newURL}));
            }
            this.lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.lock.unlock();
            throw th;
        }
    }

    public int start(long j, String str, String str2, String str3) {
        int newUrl;
        AVMDLURLFetcherInterface fetcher;
        AVMDLLog.d("AVMDLURLFetcherBridge", "----old api fallback retry Jni");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("----start fetch rawkey:");
        sbLIZ.append(str);
        AVMDLLog.d("AVMDLURLFetcherBridge", C2188811AlT.LIZIZ(sbLIZ));
        if (fetcherMaker != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            AVMDLLog.d("AVMDLURLFetcherBridge", "----old api fallback retry engine");
            this.lock.lock();
            this.handle = j;
            try {
                try {
                    fetcher = fetcherMaker.getFetcher(str, str2, str3);
                    this.fetcherInstance = fetcher;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    AVMDLLog.d("AVMDLURLFetcherBridge", C786410Ut5.k4(Locale.US, "****call start failed, get exception: %s", new Object[]{e.toString()}));
                    this.lock.unlock();
                    newUrl = -999;
                }
                if (fetcher == null) {
                    AVMDLLog.d("AVMDLURLFetcherBridge", "****fail, get fetcher is null");
                    this.lock.unlock();
                    return -1;
                }
                newUrl = getNewUrl(fetcher, str, str2, str3);
                this.lock.unlock();
                AVMDLLog.d("AVMDLURLFetcherBridge", C786410Ut5.k4(Locale.US, "****call start end, result:%d", new Object[]{Integer.valueOf(newUrl)}));
                return newUrl;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.lock.unlock();
                throw th;
            }
        }
        AVMDLLog.d("AVMDLURLFetcherBridge", "****end fetch fail,fetcherMaker is null or rawky or filekey or originurl is null");
        return -1;
    }

    public int start(long j, String str, String str2, String str3, String str4) {
        int newUrl;
        AVMDLURLFetcherInterface fetcher;
        AVMDLLog.d("AVMDLURLFetcherBridge", "----new api fallback retry Jni");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("----start fetch rawkey:");
        sbLIZ.append(str);
        AVMDLLog.d("AVMDLURLFetcherBridge", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("----start fetch engineID is:");
        sbLIZ2.append(str4);
        AVMDLLog.d("AVMDLURLFetcherBridge", C2188811AlT.LIZIZ(sbLIZ2));
        if (newFetcherMaker != null) {
            AVMDLLog.d("AVMDLURLFetcherBridge", "----new api fallback retry engine");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                this.lock.lock();
                this.handle = j;
                try {
                    try {
                        this.engineId = str4;
                        fetcher = newFetcherMaker.getFetcher(str, str2, str3, str4);
                        this.fetcherInstance = fetcher;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        AVMDLLog.d("AVMDLURLFetcherBridge", C786410Ut5.k4(Locale.US, "****call start failed, get exception: %s", new Object[]{e.toString()}));
                        this.lock.unlock();
                        newUrl = -999;
                    }
                    if (fetcher == null) {
                        AVMDLLog.d("AVMDLURLFetcherBridge", "****fail, get fetcher is null");
                        this.lock.unlock();
                        return -1;
                    }
                    newUrl = getNewUrl(fetcher, str, str2, str3);
                    this.lock.unlock();
                    AVMDLLog.d("AVMDLURLFetcherBridge", C786410Ut5.k4(Locale.US, "****call start end, result:%d", new Object[]{Integer.valueOf(newUrl)}));
                    return newUrl;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.lock.unlock();
                    throw th;
                }
            }
            AVMDLLog.d("AVMDLURLFetcherBridge", "****end fetch fail,fetcherMaker is null or rawky or filekey or originurl or engineId is null");
            return -1;
        }
        AVMDLLog.d("AVMDLURLFetcherBridge", "----old api fallback retry engine");
        return start(j, str, str2, str3);
    }
}
