package com.ss.android.socialbase.downloader.service;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1B5Q;
import X.C1B6D;
import X.C1B72;
import X.C1B76;
import X.C1B7E;
import X.C1B7M;
import X.C2199661B7c;
import X.C2199681B7e;
import X.C2199691B7f;
import X.InterfaceC19860712nF;
import X.InterfaceC2199431B6f;
import X.InterfaceC2199641B7a;
import X.InterfaceC2199961B8g;
import Y.ARunnableS99S0200000_30;
import android.content.Context;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadProcessDispatcherService implements IDownloadProcessDispatcherService {
    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public List<DownloadInfo> getAllDownloadInfo() {
        C2199661B7c.LIZLLL("getAllDownloadInfo");
        C1B7M.LJ().getClass();
        SparseArray sparseArray = new SparseArray();
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(false);
        List<DownloadInfo> allDownloadInfo = interfaceC2199641B7aLIZ != null ? interfaceC2199641B7aLIZ.getAllDownloadInfo() : null;
        InterfaceC2199641B7a interfaceC2199641B7aLIZ2 = C1B7E.LIZ(true);
        return C1B7M.LJFF(allDownloadInfo, interfaceC2199641B7aLIZ2 != null ? interfaceC2199641B7aLIZ2.getAllDownloadInfo() : null, sparseArray);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public boolean isDownloadCacheSyncSuccess() {
        C1B7M.LJ().getClass();
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(false);
        if (interfaceC2199641B7aLIZ != null) {
            return interfaceC2199641B7aLIZ.isDownloadCacheSyncSuccess();
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public boolean isHttpServiceInit() {
        boolean z;
        C1B7M.LJ().getClass();
        Context context = C2199681B7e.LIZ;
        synchronized (C2199681B7e.class) {
            z = C2199681B7e.LJJIZ;
        }
        return z;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void pauseAll() {
        C1B7M.LJ().getClass();
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(false);
        if (interfaceC2199641B7aLIZ != null) {
            interfaceC2199641B7aLIZ.pauseAll();
        }
        InterfaceC2199641B7a interfaceC2199641B7aLIZ2 = C1B7E.LIZ(true);
        if (interfaceC2199641B7aLIZ2 != null) {
            interfaceC2199641B7aLIZ2.pauseAll();
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public boolean canResume(int i) {
        C2199661B7c.LIZLLL("canResume");
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ == null) {
            return false;
        }
        return interfaceC2199641B7aLIZIZ.canResume(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void clearDownloadData(int i) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ != null) {
            interfaceC2199641B7aLIZIZ.LJJJJZ(i, true, true);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void forceDownloadIngoreRecommendSize(int i) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ != null) {
            interfaceC2199641B7aLIZIZ.forceDownloadIngoreRecommendSize(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public long getCurBytes(int i) {
        C2199661B7c.LIZLLL("getCurBytes");
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ == null) {
            return 0L;
        }
        return interfaceC2199641B7aLIZIZ.getCurBytes(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public InterfaceC19860712nF getDownloadFileUriProvider(int i) {
        C2199661B7c.LIZLLL("getDownloadFileUriProvider");
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ == null) {
            return null;
        }
        return interfaceC2199641B7aLIZIZ.getDownloadFileUriProvider(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public DownloadInfo getDownloadInfo(int i) {
        C2199661B7c.LIZLLL("getDownloadInfo");
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ == null) {
            return null;
        }
        return interfaceC2199641B7aLIZIZ.getDownloadInfo(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public List<DownloadInfo> getDownloadInfoList(String str) {
        C2199661B7c.LIZLLL("getDownloadInfoList");
        C1B7M.LJ().getClass();
        List<DownloadInfo> downloadInfoList = C1B7E.LIZ(false).getDownloadInfoList(str);
        List<DownloadInfo> downloadInfoList2 = C1B7E.LIZ(true).getDownloadInfoList(str);
        if (downloadInfoList == null) {
            if (downloadInfoList2 == null) {
                return null;
            }
            return downloadInfoList2;
        }
        if (downloadInfoList2 != null) {
            ArrayList arrayList = new ArrayList(downloadInfoList);
            arrayList.addAll(downloadInfoList2);
            return arrayList;
        }
        return downloadInfoList;
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public List<DownloadInfo> getDownloadInfosByFileExtension(String str) {
        List<DownloadInfo> downloadInfosByFileExtension;
        C2199661B7c.LIZLLL("getDownloadInfosByFileExtension");
        C1B7M.LJ().getClass();
        SparseArray sparseArray = new SparseArray();
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(false);
        List<DownloadInfo> downloadInfosByFileExtension2 = null;
        if (interfaceC2199641B7aLIZ != null) {
            downloadInfosByFileExtension = interfaceC2199641B7aLIZ.getDownloadInfosByFileExtension(str);
        } else {
            downloadInfosByFileExtension = null;
        }
        InterfaceC2199641B7a interfaceC2199641B7aLIZ2 = C1B7E.LIZ(true);
        if (interfaceC2199641B7aLIZ2 != null) {
            downloadInfosByFileExtension2 = interfaceC2199641B7aLIZ2.getDownloadInfosByFileExtension(str);
        }
        return C1B7M.LJFF(downloadInfosByFileExtension, downloadInfosByFileExtension2, sparseArray);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public C1B5Q getDownloadNotificationEventListener(int i) {
        C2199661B7c.LIZLLL("getDownloadNotificationEventListener");
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ == null) {
            return null;
        }
        return interfaceC2199641B7aLIZIZ.getDownloadNotificationEventListener(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> downloadingDownloadInfosWithMimeType;
        C2199661B7c.LIZLLL("getDownloadingDownloadInfosWithMimeType");
        C1B7M.LJ().getClass();
        SparseArray sparseArray = new SparseArray();
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(false);
        List<DownloadInfo> downloadingDownloadInfosWithMimeType2 = null;
        if (interfaceC2199641B7aLIZ != null) {
            downloadingDownloadInfosWithMimeType = interfaceC2199641B7aLIZ.getDownloadingDownloadInfosWithMimeType(str);
        } else {
            downloadingDownloadInfosWithMimeType = null;
        }
        InterfaceC2199641B7a interfaceC2199641B7aLIZ2 = C1B7E.LIZ(true);
        if (interfaceC2199641B7aLIZ2 != null) {
            downloadingDownloadInfosWithMimeType2 = interfaceC2199641B7aLIZ2.getDownloadingDownloadInfosWithMimeType(str);
        }
        return C1B7M.LJFF(downloadingDownloadInfosWithMimeType, downloadingDownloadInfosWithMimeType2, sparseArray);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public C1B6D getNotificationClickCallback(int i) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ == null) {
            return null;
        }
        return interfaceC2199641B7aLIZIZ.getNotificationClickCallback(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public int getStatus(int i) {
        C2199661B7c.LIZLLL("getStatus");
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ == null) {
            return 0;
        }
        return interfaceC2199641B7aLIZIZ.getStatus(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> successedDownloadInfosWithMimeType;
        C2199661B7c.LIZLLL("getSuccessedDownloadInfosWithMimeType");
        C1B7M.LJ().getClass();
        SparseArray sparseArray = new SparseArray();
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(false);
        List<DownloadInfo> successedDownloadInfosWithMimeType2 = null;
        if (interfaceC2199641B7aLIZ != null) {
            successedDownloadInfosWithMimeType = interfaceC2199641B7aLIZ.getSuccessedDownloadInfosWithMimeType(str);
        } else {
            successedDownloadInfosWithMimeType = null;
        }
        InterfaceC2199641B7a interfaceC2199641B7aLIZ2 = C1B7E.LIZ(true);
        if (interfaceC2199641B7aLIZ2 != null) {
            successedDownloadInfosWithMimeType2 = interfaceC2199641B7aLIZ2.getSuccessedDownloadInfosWithMimeType(str);
        }
        return C1B7M.LJFF(successedDownloadInfosWithMimeType, successedDownloadInfosWithMimeType2, sparseArray);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        List<DownloadInfo> unCompletedDownloadInfosWithMimeType;
        C2199661B7c.LIZLLL("getUnCompletedDownloadInfosWithMimeType");
        C1B7M.LJ().getClass();
        SparseArray sparseArray = new SparseArray();
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(false);
        List<DownloadInfo> unCompletedDownloadInfosWithMimeType2 = null;
        if (interfaceC2199641B7aLIZ != null) {
            unCompletedDownloadInfosWithMimeType = interfaceC2199641B7aLIZ.getUnCompletedDownloadInfosWithMimeType(str);
        } else {
            unCompletedDownloadInfosWithMimeType = null;
        }
        InterfaceC2199641B7a interfaceC2199641B7aLIZ2 = C1B7E.LIZ(true);
        if (interfaceC2199641B7aLIZ2 != null) {
            unCompletedDownloadInfosWithMimeType2 = interfaceC2199641B7aLIZ2.getUnCompletedDownloadInfosWithMimeType(str);
        }
        return C1B7M.LJFF(unCompletedDownloadInfosWithMimeType, unCompletedDownloadInfosWithMimeType2, sparseArray);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public boolean isDownloadServiceForeground(int i) {
        return C1B7M.LJ().LIZIZ(i).LJJIJIL();
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ;
        C2199661B7c.LIZLLL("isDownloadSuccessAndFileNotExist");
        C1B7M c1b7mLJ = C1B7M.LJ();
        c1b7mLJ.getClass();
        if (downloadInfo == null || (interfaceC2199641B7aLIZIZ = c1b7mLJ.LIZIZ(downloadInfo.getId())) == null) {
            return false;
        }
        return interfaceC2199641B7aLIZIZ.isDownloadSuccessAndFileNotExist(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public boolean isDownloading(int i) {
        C2199661B7c.LIZLLL("isDownloading");
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ == null) {
            return false;
        }
        return interfaceC2199641B7aLIZIZ.isDownloading(i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void pause(int i) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ != null) {
            interfaceC2199641B7aLIZIZ.LJJLIIIJJI(i, false);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void registerDownloadCacheSyncListener(InterfaceC2199961B8g interfaceC2199961B8g) {
        C1B7M.LJ().getClass();
        List<InterfaceC2199961B8g> list = C2199681B7e.LJJJ;
        synchronized (list) {
            if (interfaceC2199961B8g != null) {
                try {
                    if (!((ArrayList) list).contains(interfaceC2199961B8g)) {
                        ((ArrayList) list).add(interfaceC2199961B8g);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void registerDownloaderProcessConnectedListener(C1B76 c1b76) {
        C1B7M c1b7mLJ = C1B7M.LJ();
        c1b7mLJ.getClass();
        if (c1b76 != null) {
            if (C2199661B7c.LJIIL()) {
                c1b76.LIZ();
                return;
            }
            if (C1B7E.LIZ(true).LIZLLL()) {
                c1b76.LIZ();
            }
            synchronized (c1b7mLJ.LIZIZ) {
                try {
                    if (!((ArrayList) c1b7mLJ.LIZIZ).contains(c1b76)) {
                        ((ArrayList) c1b7mLJ.LIZIZ).add(c1b76);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void removeTaskNotificationListener(int i) {
        C2199661B7c.LIZLLL("removeTaskNotificationListener");
        C1B7M.LJ().LJI(i, null, C1B72.NOTIFICATION, true);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void removeTaskSubListener(int i) {
        C2199661B7c.LIZLLL("removeTaskSubListener");
        C1B7M.LJ().LJI(i, null, C1B72.SUB, true);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void restart(int i) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ != null) {
            interfaceC2199641B7aLIZIZ.restart(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void restartAllFailedDownloadTasks(List<String> list) {
        C1B7M.LJ().getClass();
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(false);
        if (interfaceC2199641B7aLIZ != null) {
            interfaceC2199641B7aLIZ.restartAllFailedDownloadTasks(list);
        }
        InterfaceC2199641B7a interfaceC2199641B7aLIZ2 = C1B7E.LIZ(true);
        if (interfaceC2199641B7aLIZ2 != null) {
            interfaceC2199641B7aLIZ2.restartAllFailedDownloadTasks(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        C1B7M.LJ().getClass();
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(false);
        if (interfaceC2199641B7aLIZ != null) {
            interfaceC2199641B7aLIZ.restartAllPauseReserveOnWifiDownloadTasks(list);
        }
        InterfaceC2199641B7a interfaceC2199641B7aLIZ2 = C1B7E.LIZ(true);
        if (interfaceC2199641B7aLIZ2 != null) {
            interfaceC2199641B7aLIZ2.restartAllPauseReserveOnWifiDownloadTasks(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void resume(int i) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ != null) {
            interfaceC2199641B7aLIZIZ.resume(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void setLogLevel(int i) {
        C1B7M.LJ().getClass();
        InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(false);
        if (interfaceC2199641B7aLIZ != null) {
            interfaceC2199641B7aLIZ.setLogLevel(i);
        }
        InterfaceC2199641B7a interfaceC2199641B7aLIZ2 = C1B7E.LIZ(true);
        if (interfaceC2199641B7aLIZ2 != null) {
            interfaceC2199641B7aLIZ2.setLogLevel(i);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void tryDownload(DownloadTask downloadTask) {
        boolean z;
        C1B7M c1b7mLJ = C1B7M.LJ();
        c1b7mLJ.getClass();
        int status = 0;
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                boolean zIsNeedIndependentProcess = downloadInfo.isNeedIndependentProcess();
                boolean z2 = true;
                if (C2199661B7c.LJIIL() || !C2199661B7c.LJIILJJIL()) {
                    zIsNeedIndependentProcess = true;
                }
                int iLIZJ = c1b7mLJ.LIZJ(downloadInfo.getId());
                if (iLIZJ >= 0 && iLIZJ != zIsNeedIndependentProcess) {
                    try {
                        if (iLIZJ == 1) {
                            if (C2199661B7c.LJIILJJIL()) {
                                C1B7E.LIZ(true).LJJLIIIJJI(downloadInfo.getId(), true);
                                DownloadInfo downloadInfo2 = C1B7E.LIZ(true).getDownloadInfo(downloadInfo.getId());
                                if (downloadInfo2 != null) {
                                    C1B7E.LIZ(false).LJIJI(downloadInfo2);
                                }
                            }
                        } else if (C2199661B7c.LJIILJJIL()) {
                            C1B7E.LIZ(false).LJJLIIIJJI(downloadInfo.getId(), true);
                        } else {
                            downloadTask.setNeedDelayForCacheSync(true);
                            C1B7E.LIZ(true).LJJJJJ(1, downloadInfo.getId());
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                int id = downloadInfo.getId();
                if (zIsNeedIndependentProcess) {
                    z = true;
                } else {
                    z = false;
                }
                c1b7mLJ.LJIIIIZZ(id, z);
                if (!zIsNeedIndependentProcess) {
                    z2 = false;
                }
                InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(z2);
                if (interfaceC2199641B7aLIZ == null) {
                    if (downloadTask == null) {
                        return;
                    }
                } else if (downloadTask.isNeedDelayForCacheSync()) {
                    C2199681B7e.LJJIJIIJI(new ARunnableS99S0200000_30(interfaceC2199641B7aLIZ, downloadTask, 11), 500L, TimeUnit.MILLISECONDS);
                    return;
                } else {
                    interfaceC2199641B7aLIZ.tryDownload(downloadTask);
                    return;
                }
            }
            InterfaceC2199431B6f monitorDepend = downloadTask.getMonitorDepend();
            DownloadInfo downloadInfo3 = downloadTask.getDownloadInfo();
            BaseException baseException = new BaseException(1003, "tryDownload but getDownloadHandler failed");
            if (downloadTask.getDownloadInfo() != null) {
                status = downloadTask.getDownloadInfo().getStatus();
            }
            C2199691B7f.LJIIIIZZ(monitorDepend, downloadInfo3, baseException, status);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void unRegisterDownloadCacheSyncListener(InterfaceC2199961B8g interfaceC2199961B8g) {
        C1B7M.LJ().getClass();
        List<InterfaceC2199961B8g> list = C2199681B7e.LJJJ;
        synchronized (list) {
            if (interfaceC2199961B8g != null) {
                try {
                    if (((ArrayList) list).contains(interfaceC2199961B8g)) {
                        ((ArrayList) list).remove(interfaceC2199961B8g);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void unRegisterDownloaderProcessConnectedListener(C1B76 c1b76) {
        C1B7M c1b7mLJ = C1B7M.LJ();
        if (c1b76 == null) {
            c1b7mLJ.getClass();
            return;
        }
        synchronized (c1b7mLJ.LIZIZ) {
            try {
                if (((ArrayList) c1b7mLJ.LIZIZ).contains(c1b76)) {
                    ((ArrayList) c1b7mLJ.LIZIZ).remove(c1b76);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        C2199661B7c.LIZLLL("addNotificationListener");
        C1B7M.LJ().LIZ(i, iDownloadListener, C1B72.NOTIFICATION, false);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void cancel(int i, boolean z) {
        C1B7M c1b7mLJ = C1B7M.LJ();
        c1b7mLJ.getClass();
        if (C2199661B7c.LJIILJJIL()) {
            InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(true);
            if (interfaceC2199641B7aLIZ != null) {
                interfaceC2199641B7aLIZ.cancel(i, z);
            }
            InterfaceC2199641B7a interfaceC2199641B7aLIZ2 = C1B7E.LIZ(false);
            if (interfaceC2199641B7aLIZ2 != null) {
                interfaceC2199641B7aLIZ2.cancel(i, z);
                return;
            }
            return;
        }
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = c1b7mLJ.LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ != null) {
            interfaceC2199641B7aLIZIZ.cancel(i, z);
        }
        C1B7E.LIZ(true).LJJJJJ(2, i);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void clearDownloadData(int i, boolean z) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ != null) {
            interfaceC2199641B7aLIZIZ.LJJJJZ(i, z, true);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public int getDownloadId(String str, String str2) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400601, "com/ss/android/socialbase/downloader/service/DownloadProcessDispatcherService", "getDownloadId", this, new Object[]{str, str2}, "int", new C0WZW(false, "(Ljava/lang/String;Ljava/lang/String;)I", new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisoenH8UkbAQIObG+Uh6EUGOirMqBfxzA6dMIOGJg79FfgdQnFSx+uxbg=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return ((Integer) c0wsuLIZIZ.LIZIZ).intValue();
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                str = (String) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                str2 = (String) obj2;
            }
        }
        C1B7M.LJ().getClass();
        return C2199681B7e.LJIILJJIL(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public DownloadInfo getDownloadInfo(String str, String str2) {
        C2199661B7c.LIZLLL("getDownloadInfo");
        C1B7M c1b7mLJ = C1B7M.LJ();
        c1b7mLJ.getClass();
        int iLJIILJJIL = C2199681B7e.LJIILJJIL(str, str2);
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = c1b7mLJ.LIZIZ(iLJIILJJIL);
        if (interfaceC2199641B7aLIZIZ == null) {
            return null;
        }
        return interfaceC2199641B7aLIZIZ.getDownloadInfo(iLJIILJJIL);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        C2199661B7c.LIZLLL("removeNotificationListener");
        C1B7M.LJ().LJI(i, iDownloadListener, C1B72.NOTIFICATION, false);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        C2199661B7c.LIZLLL("removeSubThreadListener");
        C1B7M.LJ().LJI(i, iDownloadListener, C1B72.SUB, false);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void setDownloadNotificationEventListener(int i, C1B5Q c1b5q) {
        C2199661B7c.LIZLLL("setDownloadNotificationEventListener");
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ != null) {
            interfaceC2199641B7aLIZIZ.setDownloadNotificationEventListener(i, c1b5q);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return;
        }
        C2199661B7c.LIZLLL("setNotificationListener");
        C1B7M.LJ().LIZ(i, iDownloadListener, C1B72.NOTIFICATION, true);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void setThrottleNetSpeed(int i, long j, int i2) {
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ != null) {
            interfaceC2199641B7aLIZIZ.setThrottleNetSpeed(i, j, i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void addDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        C2199661B7c.LIZLLL("addDownloadListener");
        C1B7M.LJ().LIZ(i, iDownloadListener, c1b72, z);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void removeDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        C2199661B7c.LIZLLL("removeDownloadListener");
        C1B7M.LJ().LJI(i, iDownloadListener, c1b72, false);
    }

    @Override // com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService
    public void addDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z, boolean z2) {
        C2199661B7c.LIZLLL("addDownloadListener");
        InterfaceC2199641B7a interfaceC2199641B7aLIZIZ = C1B7M.LJ().LIZIZ(i);
        if (interfaceC2199641B7aLIZIZ != null) {
            interfaceC2199641B7aLIZIZ.LIZIZ(i, iDownloadListener.hashCode(), iDownloadListener, c1b72, z, z2);
        }
    }
}
