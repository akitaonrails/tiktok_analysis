package com.ss.android.socialbase.downloader.service;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1B5Q;
import X.C1B6D;
import X.C1B72;
import X.C1B76;
import X.InterfaceC19860712nF;
import X.InterfaceC2199961B8g;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public interface IDownloadProcessDispatcherService {

    public static class DefaultDownloadProcessDispatcherService implements IDownloadProcessDispatcherService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void addDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void addDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z, boolean z2) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean canResume(int i) {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void cancel(int i, boolean z) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void clearDownloadData(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void clearDownloadData(int i, boolean z) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void forceDownloadIngoreRecommendSize(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getAllDownloadInfo() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public long getCurBytes(int i) {
            return 0L;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public InterfaceC19860712nF getDownloadFileUriProvider(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public int getDownloadId(String str, String str2) throws Throwable {
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400601, "com/ss/android/socialbase/downloader/service/IDownloadProcessDispatcherService$DefaultDownloadProcessDispatcherService", "getDownloadId", this, new Object[]{str, str2}, "int", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)I", new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisoenH8UkbAQIOYUSMCrbRx9hbZGJeXJYKjU/Bza3f4VCrD5UmJuJmTMZk", null)));
            if (c0wsuLIZIZ.LIZ) {
                return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            if (objArr != null) {
                Object obj = objArr[0];
                Object obj2 = objArr[1];
            }
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public DownloadInfo getDownloadInfo(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public DownloadInfo getDownloadInfo(String str, String str2) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getDownloadInfoList(String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public C1B5Q getDownloadNotificationEventListener(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public C1B6D getNotificationClickCallback(int i) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public int getStatus(int i) {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean isDownloadCacheSyncSuccess() {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean isDownloadServiceForeground(int i) {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean isDownloading(int i) {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public boolean isHttpServiceInit() {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void pause(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void pauseAll() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void registerDownloadCacheSyncListener(InterfaceC2199961B8g interfaceC2199961B8g) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void registerDownloaderProcessConnectedListener(C1B76 c1b76) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void removeDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void removeTaskNotificationListener(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void removeTaskSubListener(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void restart(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void restartAllFailedDownloadTasks(List<String> list) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void resume(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void setDownloadNotificationEventListener(int i, C1B5Q c1b5q) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void setLogLevel(int i) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void setThrottleNetSpeed(int i, long j, int i2) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void tryDownload(DownloadTask downloadTask) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void unRegisterDownloadCacheSyncListener(InterfaceC2199961B8g interfaceC2199961B8g) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
        public void unRegisterDownloaderProcessConnectedListener(C1B76 c1b76) {
        }
    }

    void addDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z);

    void addDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z, boolean z2);

    void addNotificationListener(int i, IDownloadListener iDownloadListener);

    boolean canResume(int i);

    void cancel(int i, boolean z);

    void clearDownloadData(int i);

    void clearDownloadData(int i, boolean z);

    void forceDownloadIngoreRecommendSize(int i);

    List<DownloadInfo> getAllDownloadInfo();

    long getCurBytes(int i);

    InterfaceC19860712nF getDownloadFileUriProvider(int i);

    int getDownloadId(String str, String str2);

    DownloadInfo getDownloadInfo(int i);

    DownloadInfo getDownloadInfo(String str, String str2);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getDownloadInfosByFileExtension(String str);

    C1B5Q getDownloadNotificationEventListener(int i);

    List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str);

    C1B6D getNotificationClickCallback(int i);

    int getStatus(int i);

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str);

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str);

    boolean isDownloadCacheSyncSuccess();

    boolean isDownloadServiceForeground(int i);

    boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo);

    boolean isDownloading(int i);

    boolean isHttpServiceInit();

    void pause(int i);

    void pauseAll();

    void registerDownloadCacheSyncListener(InterfaceC2199961B8g interfaceC2199961B8g);

    void registerDownloaderProcessConnectedListener(C1B76 c1b76);

    void removeDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z);

    void removeNotificationListener(int i, IDownloadListener iDownloadListener);

    void removeSubThreadListener(int i, IDownloadListener iDownloadListener);

    void removeTaskNotificationListener(int i);

    void removeTaskSubListener(int i);

    void restart(int i);

    void restartAllFailedDownloadTasks(List<String> list);

    void restartAllPauseReserveOnWifiDownloadTasks(List<String> list);

    void resume(int i);

    void setDownloadNotificationEventListener(int i, C1B5Q c1b5q);

    void setLogLevel(int i);

    void setNotificationListener(int i, IDownloadListener iDownloadListener);

    void setThrottleNetSpeed(int i, long j, int i2);

    void tryDownload(DownloadTask downloadTask);

    void unRegisterDownloadCacheSyncListener(InterfaceC2199961B8g interfaceC2199961B8g);

    void unRegisterDownloaderProcessConnectedListener(C1B76 c1b76);
}
