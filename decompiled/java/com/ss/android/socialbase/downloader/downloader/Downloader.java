package com.ss.android.socialbase.downloader.downloader;

import X.C0AU7;
import X.C1B5Q;
import X.C1B76;
import X.C1B82;
import X.C1B84;
import X.C2200121B8w;
import X.C2200151B8z;
import X.InterfaceC1490850otn;
import X.InterfaceC19860712nF;
import X.InterfaceC2199961B8g;
import X.InterfaceC2200061B8q;
import X.InterfaceC2200071B8r;
import X.InterfaceC2200081B8s;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadNetworkHandler;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public class Downloader extends C2200151B8z {
    public static volatile Downloader instance;

    public static Downloader getInstance(Context context) {
        return com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(context);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ List getAllDownloadInfo() {
        return super.getAllDownloadInfo();
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ File getGlobalSaveDir() {
        return super.getGlobalSaveDir();
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ File getGlobalSaveTempDir() {
        return super.getGlobalSaveTempDir();
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ InterfaceC1490850otn getReserveWifiStatusListener() {
        super.getReserveWifiStatusListener();
        return null;
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ boolean isDownloadCacheSyncSuccess() {
        return super.isDownloadCacheSyncSuccess();
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ boolean isHttpServiceInit() {
        return super.isHttpServiceInit();
    }

    public Downloader() {
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void clearSqlDownloadCacheData() {
        super.clearSqlDownloadCacheData();
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void destoryDownloader() {
        super.destoryDownloader();
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void initDownloadCacheImmediately() {
        super.initDownloadCacheImmediately();
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void pauseAll() {
        super.pauseAll();
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setDownloadInMultiProcess() {
        super.setDownloadInMultiProcess();
    }

    public Downloader(C1B84 c1b84) {
        ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).initComponent(c1b84);
    }

    public static Downloader com_ss_android_socialbase_downloader_downloader_Downloader__getInstance$___twin___(Context context) {
        if (instance == null) {
            synchronized (Downloader.class) {
                try {
                    if (instance == null) {
                        ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).setAppContext(context);
                        instance = new Downloader();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return instance;
    }

    public static Downloader com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(Context context) {
        try {
            if (((Boolean) C0AU7.LIZ.getValue()).booleanValue()) {
                C2200121B8w.LIZ(context);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return com_ss_android_socialbase_downloader_downloader_Downloader__getInstance$___twin___(context);
    }

    public static void init(C1B84 c1b84) {
        initOrCover(c1b84, false);
    }

    public static void loadService(IDownloadServiceLoader iDownloadServiceLoader) {
        boolean z;
        if (iDownloadServiceLoader != null) {
            iDownloadServiceLoader.load();
            String str = C1B82.LIZJ;
            if (str == null) {
                z = true;
            } else {
                z = false;
            }
            iDownloadServiceLoader.defaultLoadCallback(z, str);
        }
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ boolean canResume(int i) {
        return super.canResume(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void cancel(int i) {
        super.cancel(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void clearDownloadData(int i) {
        super.clearDownloadData(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void clearMemoryCacheData(double d) {
        super.clearMemoryCacheData(d);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void forceDownloadIngoreRecommendSize(int i) {
        super.forceDownloadIngoreRecommendSize(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ long getCurBytes(int i) {
        return super.getCurBytes(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ InterfaceC19860712nF getDownloadFileUriProvider(int i) {
        return super.getDownloadFileUriProvider(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ DownloadInfo getDownloadInfo(int i) {
        return super.getDownloadInfo(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ List getDownloadInfoList(String str) {
        return super.getDownloadInfoList(str);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ List getDownloadInfosByFileExtension(String str) {
        return super.getDownloadInfosByFileExtension(str);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ C1B5Q getDownloadNotificationEventListener(int i) {
        return super.getDownloadNotificationEventListener(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ List getDownloadingDownloadInfosWithMimeType(String str) {
        return super.getDownloadingDownloadInfosWithMimeType(str);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ int getStatus(int i) {
        return super.getStatus(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ List getSuccessedDownloadInfosWithMimeType(String str) {
        return super.getSuccessedDownloadInfosWithMimeType(str);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ List getUnCompletedDownloadInfosWithMimeType(String str) {
        return super.getUnCompletedDownloadInfosWithMimeType(str);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ boolean isDownloadServiceForeground(int i) {
        return super.isDownloadServiceForeground(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        return super.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ boolean isDownloading(int i) {
        return super.isDownloading(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void pause(int i) {
        super.pause(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void registerDownloadCacheSyncListener(InterfaceC2199961B8g interfaceC2199961B8g) {
        super.registerDownloadCacheSyncListener(interfaceC2199961B8g);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void registerDownloaderProcessConnectedListener(C1B76 c1b76) {
        super.registerDownloaderProcessConnectedListener(c1b76);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void removeTaskMainListener(int i) {
        super.removeTaskMainListener(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void removeTaskNotificationListener(int i) {
        super.removeTaskNotificationListener(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void removeTaskSubListener(int i) {
        super.removeTaskSubListener(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void restart(int i) {
        super.restart(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void restartAllFailedDownloadTasks(List list) {
        super.restartAllFailedDownloadTasks(list);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void restartAllPauseReserveOnWifiDownloadTasks(List list) {
        super.restartAllPauseReserveOnWifiDownloadTasks(list);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void resume(int i) {
        super.resume(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setDefaultSavePath(String str) {
        super.setDefaultSavePath(str);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setDefaultSaveTempPath(String str) {
        super.setDefaultSaveTempPath(str);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setDownloadDBListener(InterfaceC2200071B8r interfaceC2200071B8r) {
        super.setDownloadDBListener(interfaceC2200071B8r);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setDownloadMemoryInfoListener(InterfaceC2200081B8s interfaceC2200081B8s) {
        super.setDownloadMemoryInfoListener(interfaceC2200081B8s);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setDownloadNetworkHandler(IDownloadNetworkHandler iDownloadNetworkHandler) {
        super.setDownloadNetworkHandler(iDownloadNetworkHandler);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setDownloadThreadCheckListener(InterfaceC2200061B8q interfaceC2200061B8q) {
        super.setDownloadThreadCheckListener(interfaceC2200061B8q);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setLogLevel(int i) {
        super.setLogLevel(i);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setReserveWifiStatusListener(InterfaceC1490850otn interfaceC1490850otn) {
        super.setReserveWifiStatusListener(interfaceC1490850otn);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void unRegisterDownloadCacheSyncListener(InterfaceC2199961B8g interfaceC2199961B8g) {
        super.unRegisterDownloadCacheSyncListener(interfaceC2199961B8g);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void unRegisterDownloaderProcessConnectedListener(C1B76 c1b76) {
        super.unRegisterDownloaderProcessConnectedListener(c1b76);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void updateDownloadInfo(DownloadInfo downloadInfo) {
        super.updateDownloadInfo(downloadInfo);
    }

    public static synchronized void initOrCover(C1B84 c1b84, boolean z) {
        if (c1b84 == null) {
            return;
        }
        if (instance == null) {
            instance = new Downloader(c1b84);
            return;
        }
        IDownloadComponentManagerService iDownloadComponentManagerService = (IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class);
        if (!iDownloadComponentManagerService.isInit()) {
            iDownloadComponentManagerService.initComponent(c1b84);
        } else if (z) {
            iDownloadComponentManagerService.coverComponent(c1b84);
        }
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        super.addMainThreadListener(i, iDownloadListener);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        super.addNotificationListener(i, iDownloadListener);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        super.addSubThreadListener(i, iDownloadListener);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void cancel(int i, boolean z) {
        super.cancel(i, z);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void clearDownloadData(int i, boolean z) {
        super.clearDownloadData(i, z);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ int getDownloadId(String str, String str2) {
        return super.getDownloadId(str, str2);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ DownloadInfo getDownloadInfo(String str, String str2) {
        return super.getDownloadInfo(str, str2);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        super.removeMainThreadListener(i, iDownloadListener);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        super.removeNotificationListener(i, iDownloadListener);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        super.removeSubThreadListener(i, iDownloadListener);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setDownloadNotificationEventListener(int i, C1B5Q c1b5q) {
        super.setDownloadNotificationEventListener(i, c1b5q);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        super.setMainThreadListener(i, iDownloadListener);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        super.setNotificationListener(i, iDownloadListener);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        super.setSubThreadListener(i, iDownloadListener);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setThrottleNetSpeed(int i, long j) {
        super.setThrottleNetSpeed(i, j);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setMainThreadListener(int i, IDownloadListener iDownloadListener, boolean z) {
        super.setMainThreadListener(i, iDownloadListener, z);
    }

    @Override // X.C2200151B8z
    public /* bridge */ /* synthetic */ void setThrottleNetSpeed(int i, long j, int i2) {
        super.setThrottleNetSpeed(i, j, i2);
    }
}
