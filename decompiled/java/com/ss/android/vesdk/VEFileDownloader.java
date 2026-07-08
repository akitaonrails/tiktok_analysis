package com.ss.android.vesdk;

import X.AbstractC20187113yn;
import X.C0VSJ;
import X.C20187913yv;
import X.C2188811AlT;
import X.C2484209oO;
import X.InterfaceC20187013ym;
import Y.ARunnableS130S0100000_30;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ttve.nativePort.TENativeFileDownloader;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes31.dex */
public class VEFileDownloader {
    public static final String[] EMPTY_URL_LIST = new String[0];
    public long mNativeHandle;
    public AtomicBoolean mIsDestroying = new AtomicBoolean(false);
    public Lock mDestroyLock = new ReentrantLock();
    public final TENativeFileDownloader mNativeDownloader = new TENativeFileDownloader();

    public synchronized void destroyFileDownload() {
        if (this.mIsDestroying.get()) {
            C2484209oO.LJIIIIZZ("VEFileDownloader", "destroyFileDownload is already been called.");
        } else if (this.mNativeHandle == 0) {
            C2484209oO.LJIIIIZZ("VEFileDownloader", "destroyFileDownload downloadHandle = 0, may have been auto-destroyed 1");
        } else {
            this.mIsDestroying.set(true);
            new BPEAThread(new ARunnableS130S0100000_30(this, 21)).start();
        }
    }

    public String dumpMetricsJson() {
        long j = this.mNativeHandle;
        if (j != 0) {
            return this.mNativeDownloader.dumpMetricsJson(j);
        }
        C2484209oO.LJIIIIZZ("VEFileDownloader", "dumpMetricsJson called but mNativeHandle is 0");
        return "";
    }

    public static int checkTTNetAvailable() {
        return TENativeFileDownloader.nativeCheckTTNetAvailable();
    }

    public static String getFilePathWithConfig(VEDownloaderConfig vEDownloaderConfig) {
        String finalSavePath;
        if (!TextUtils.isEmpty(vEDownloaderConfig.customSavePath) && (finalSavePath = vEDownloaderConfig.getFinalSavePath()) != null && new C0VSJ(finalSavePath).exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFilePathWithConfig found customSavePath product: ");
            sbLIZ.append(finalSavePath);
            C2484209oO.LJI("VEFileDownloader", C2188811AlT.LIZIZ(sbLIZ));
            return finalSavePath;
        }
        return getFilePathWithResourceKey(vEDownloaderConfig.cacheDir, vEDownloaderConfig.getResourceKey());
    }

    public static String[] normalizeUrlList(String[] strArr) {
        if (strArr == null) {
            return EMPTY_URL_LIST;
        }
        return strArr;
    }

    public static void setAllDownloadsPaused(boolean z) {
        TENativeFileDownloader.nativeSetAllDownloadsPaused(z);
    }

    public int getBufferTimeWithTimestamp(int i) {
        if (i < 0) {
            return -2;
        }
        if (this.mIsDestroying.get()) {
            C2484209oO.LJIIIIZZ("VEFileDownloader", "destroyFileDownload is already been called and getBufferTimeWithTimestamp is invalided");
            return -1;
        }
        if (this.mDestroyLock.tryLock()) {
            long j = this.mNativeHandle;
            if (j == 0) {
                C2484209oO.LJIIIIZZ("VEFileDownloader", "mNativeHandle is nullptr");
                this.mDestroyLock.unlock();
                return -1;
            }
            int bufferTimeWithTimestamp = this.mNativeDownloader.getBufferTimeWithTimestamp(j, i);
            this.mDestroyLock.unlock();
            return bufferTimeWithTimestamp;
        }
        C2484209oO.LJIIIIZZ("VEFileDownloader", "mDestroyLock is already been called and getBufferTimeWithTimestamp is invalided");
        return -1;
    }

    public void setDownloadPaused(boolean z) {
        if (this.mIsDestroying.get()) {
            C2484209oO.LJIIIIZZ("VEFileDownloader", "setDownloadPaused called while destroyFileDownload is in progress.");
            return;
        }
        if (this.mDestroyLock.tryLock()) {
            long j = this.mNativeHandle;
            if (j == 0) {
                C2484209oO.LJIIIIZZ("VEFileDownloader", "setDownloadPaused called but mNativeHandle is 0");
                this.mDestroyLock.unlock();
                return;
            } else {
                this.mNativeDownloader.setDownloadPaused(j, z);
                this.mDestroyLock.unlock();
                return;
            }
        }
        C2484209oO.LJIIIIZZ("VEFileDownloader", "setDownloadPaused skipped because destroyFileDownload is in progress.");
    }

    public static String getFilePathWithResourceKey(String str, String str2) {
        String mD5FileName = TEVideoUtils.getMD5FileName(str, str2);
        if (mD5FileName != null && new C0VSJ(mD5FileName).exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(mD5FileName);
            sbLIZ.append(".vesf");
            if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).exists()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(mD5FileName);
                sbLIZ2.append(".vesf");
                sbLIZ2.append(".meta");
                if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).exists()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("getFilePathWithResourceKey found, resourceKey = ");
                    sbLIZ3.append(str2);
                    C2484209oO.LJI("VEFileDownloader", C2188811AlT.LIZIZ(sbLIZ3));
                    return mD5FileName;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static String getFilePathWithUrl(String str, String str2) {
        return getFilePathWithResourceKey(str, str2);
    }

    public synchronized boolean createFileDownload(VEDownloaderConfig vEDownloaderConfig, final InterfaceC20187013ym interfaceC20187013ym) {
        boolean z;
        C2484209oO.LJI("VEFileDownloader", "createFileDownload in.");
        if (!TextUtils.isEmpty(vEDownloaderConfig.url) && !TextUtils.isEmpty(vEDownloaderConfig.cacheDir)) {
            TENativeFileDownloader tENativeFileDownloader = this.mNativeDownloader;
            String str = vEDownloaderConfig.url;
            String str2 = vEDownloaderConfig.cacheDir;
            String str3 = vEDownloaderConfig.externalPath;
            long j = vEDownloaderConfig.externalFirstSegOffset;
            long j2 = vEDownloaderConfig.externalMediaSize;
            int i = vEDownloaderConfig.maxDownloadCount;
            int i2 = vEDownloaderConfig.maxCacheFileCount;
            int i3 = vEDownloaderConfig.maxNetworkTimeout;
            int i4 = vEDownloaderConfig.connectTimeoutMs;
            boolean z2 = vEDownloaderConfig.needSaveFile;
            int i5 = vEDownloaderConfig.mediaCheckTimeoutMs;
            int i6 = vEDownloaderConfig.mediaCheckMaxRetries;
            int value = vEDownloaderConfig.priority.getValue();
            int value2 = vEDownloaderConfig.probePriority.getValue();
            String str4 = vEDownloaderConfig.businessId;
            if (str4 == null) {
                str4 = "";
            }
            long jCreateFileDownload = tENativeFileDownloader.createFileDownload(str, str2, str3, j, j2, i, i2, i3, i4, z2, i5, i6, value, value2, str4, vEDownloaderConfig.getResourceKey(), normalizeUrlList(vEDownloaderConfig.urlList), vEDownloaderConfig.rangeStart, vEDownloaderConfig.rangeEnd, vEDownloaderConfig.headerParams, new AbstractC20187113yn() { // from class: X.13yl
                @Override // X.InterfaceC20187013ym
                public final void LIZ(String str5) {
                    this.LIZIZ.destroyFileDownload();
                    InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                    if (interfaceC20187013ym2 != null) {
                        interfaceC20187013ym2.LIZ(str5);
                    }
                }

                @Override // X.InterfaceC20187013ym
                public final void LIZJ(String str5) {
                    InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                    if (interfaceC20187013ym2 != null) {
                        interfaceC20187013ym2.LIZJ(str5);
                    }
                }

                @Override // X.InterfaceC20187013ym
                public final void LIZLLL(String str5, boolean z3) {
                    InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                    if (interfaceC20187013ym2 != null) {
                        interfaceC20187013ym2.LIZLLL(str5, z3);
                    }
                }

                @Override // X.InterfaceC20187013ym
                public final void LJJJLL(String str5, float f) {
                    InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                    if (interfaceC20187013ym2 != null) {
                        interfaceC20187013ym2.LJJJLL(str5, f);
                    }
                }

                @Override // X.InterfaceC20187013ym
                public final void LIZIZ(String str5, int i7, int i8, String str6) {
                    this.LIZIZ.destroyFileDownload();
                    InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                    if (interfaceC20187013ym2 != null) {
                        interfaceC20187013ym2.LIZIZ(str5, i7, i8, str6);
                    }
                }

                @Override // X.AbstractC20187113yn
                public final void LJ(String str5, int i7, int i8, float f, String str6) {
                    InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                    if (interfaceC20187013ym2 != null && (interfaceC20187013ym2 instanceof AbstractC20187113yn)) {
                        ((AbstractC20187113yn) interfaceC20187013ym2).LJ(str5, i7, i8, f, str6);
                    }
                }
            });
            this.mNativeHandle = jCreateFileDownload;
            if (jCreateFileDownload != 0) {
                z = true;
            } else {
                z = false;
            }
            return z;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createFileDownload param error! url = ");
        sbLIZ.append(vEDownloaderConfig.url);
        sbLIZ.append(", cacheDir = ");
        sbLIZ.append(vEDownloaderConfig.cacheDir);
        C2484209oO.LIZJ("VEFileDownloader", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public synchronized boolean createFileDownloadWithCustomPath(VEDownloaderConfig vEDownloaderConfig, InterfaceC20187013ym interfaceC20187013ym) {
        C2484209oO.LJI("VEFileDownloader", "createFileDownloadWithCustomPath in.");
        C20187913yv c20187913yvValidateConfig = vEDownloaderConfig.validateConfig();
        if (!c20187913yvValidateConfig.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createFileDownloadWithCustomPath config validation failed: ");
            sbLIZ.append(c20187913yvValidateConfig.LIZIZ);
            C2484209oO.LIZJ("VEFileDownloader", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        String finalSavePath = vEDownloaderConfig.getFinalSavePath();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createFileDownloadWithCustomPath finalSavePath: ");
        sbLIZ2.append(finalSavePath);
        C2484209oO.LJI("VEFileDownloader", C2188811AlT.LIZIZ(sbLIZ2));
        return createFileDownloadInternal(vEDownloaderConfig, interfaceC20187013ym, finalSavePath);
    }

    private synchronized boolean createFileDownloadInternal(VEDownloaderConfig vEDownloaderConfig, final InterfaceC20187013ym interfaceC20187013ym, String str) {
        boolean z;
        String str2 = str;
        synchronized (this) {
            if (!TextUtils.isEmpty(vEDownloaderConfig.url) && !TextUtils.isEmpty(vEDownloaderConfig.cacheDir)) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = null;
                }
                TENativeFileDownloader tENativeFileDownloader = this.mNativeDownloader;
                String str3 = vEDownloaderConfig.url;
                String str4 = vEDownloaderConfig.cacheDir;
                String str5 = vEDownloaderConfig.externalPath;
                long j = vEDownloaderConfig.externalFirstSegOffset;
                long j2 = vEDownloaderConfig.externalMediaSize;
                int i = vEDownloaderConfig.maxDownloadCount;
                int i2 = vEDownloaderConfig.maxCacheFileCount;
                int i3 = vEDownloaderConfig.maxNetworkTimeout;
                int i4 = vEDownloaderConfig.connectTimeoutMs;
                boolean z2 = vEDownloaderConfig.needSaveFile;
                int i5 = vEDownloaderConfig.mediaCheckTimeoutMs;
                int i6 = vEDownloaderConfig.mediaCheckMaxRetries;
                int value = vEDownloaderConfig.priority.getValue();
                int value2 = vEDownloaderConfig.probePriority.getValue();
                String str6 = vEDownloaderConfig.businessId;
                if (str6 == null) {
                    str6 = "";
                }
                long jCreateFileDownloadWithCustomPath = tENativeFileDownloader.createFileDownloadWithCustomPath(str3, str4, str5, j, j2, i, i2, i3, i4, z2, i5, i6, value, value2, str6, vEDownloaderConfig.getResourceKey(), normalizeUrlList(vEDownloaderConfig.urlList), vEDownloaderConfig.rangeStart, vEDownloaderConfig.rangeEnd, str2, vEDownloaderConfig.headerParams, new AbstractC20187113yn() { // from class: X.13yk
                    @Override // X.InterfaceC20187013ym
                    public final void LIZ(String str7) {
                        this.LIZIZ.destroyFileDownload();
                        InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                        if (interfaceC20187013ym2 != null) {
                            interfaceC20187013ym2.LIZ(str7);
                        }
                    }

                    @Override // X.InterfaceC20187013ym
                    public final void LIZJ(String str7) {
                        InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                        if (interfaceC20187013ym2 != null) {
                            interfaceC20187013ym2.LIZJ(str7);
                        }
                    }

                    @Override // X.InterfaceC20187013ym
                    public final void LIZLLL(String str7, boolean z3) {
                        InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                        if (interfaceC20187013ym2 != null) {
                            interfaceC20187013ym2.LIZLLL(str7, z3);
                        }
                    }

                    @Override // X.InterfaceC20187013ym
                    public final void LJJJLL(String str7, float f) {
                        InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                        if (interfaceC20187013ym2 != null) {
                            interfaceC20187013ym2.LJJJLL(str7, f);
                        }
                    }

                    @Override // X.InterfaceC20187013ym
                    public final void LIZIZ(String str7, int i7, int i8, String str8) {
                        this.LIZIZ.destroyFileDownload();
                        InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                        if (interfaceC20187013ym2 != null) {
                            interfaceC20187013ym2.LIZIZ(str7, i7, i8, str8);
                        }
                    }

                    @Override // X.AbstractC20187113yn
                    public final void LJ(String str7, int i7, int i8, float f, String str8) {
                        InterfaceC20187013ym interfaceC20187013ym2 = interfaceC20187013ym;
                        if (interfaceC20187013ym2 != null && (interfaceC20187013ym2 instanceof AbstractC20187113yn)) {
                            ((AbstractC20187113yn) interfaceC20187013ym2).LJ(str7, i7, i8, f, str8);
                        }
                    }
                });
                this.mNativeHandle = jCreateFileDownloadWithCustomPath;
                if (jCreateFileDownloadWithCustomPath != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return z;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createFileDownloadInternal param error! url = ");
            sbLIZ.append(vEDownloaderConfig.url);
            sbLIZ.append(", cacheDir = ");
            sbLIZ.append(vEDownloaderConfig.cacheDir);
            C2484209oO.LIZJ("VEFileDownloader", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }
}
