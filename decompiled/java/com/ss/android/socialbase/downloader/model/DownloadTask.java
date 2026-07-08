package com.ss.android.socialbase.downloader.model;

import X.C1490830otl;
import X.C1B5Q;
import X.C1B6D;
import X.C1B72;
import X.C1B82;
import X.C2188811AlT;
import X.C2199751B7l;
import X.C2199771B7n;
import X.EnumC19365210pW;
import X.InterfaceC19860712nF;
import X.InterfaceC2199321B5u;
import X.InterfaceC2199361B5y;
import X.InterfaceC2199431B6f;
import X.InterfaceC2199461B6i;
import X.InterfaceC2199471B6j;
import X.InterfaceC2199481B6k;
import X.InterfaceC2329409Au;
import Y.ARunnableS72S0200000_3;
import android.util.SparseArray;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadMonitorHelperService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadTask {
    public boolean autoRemoveCallback;
    public boolean autoSetHashCodeForSameTask;
    public IDownloadDepend depend;
    public InterfaceC2199481B6k diskSpaceHandler;
    public final List<InterfaceC2199361B5y> downloadCompleteHandlers;
    public DownloadInfo downloadInfo;
    public C2199771B7n downloadInfoBuilder;
    public InterfaceC19860712nF fileUriProvider;
    public InterfaceC2199321B5u forbiddenHandler;
    public int hashCodeForSameTask;
    public InterfaceC2199461B6i interceptor;
    public final SparseArray<IDownloadListener> mainThreadListeners;
    public InterfaceC2199431B6f monitorDepend;
    public boolean needDelayForCacheSync;
    public C1B6D notificationClickCallback;
    public C1B5Q notificationEventListener;
    public final SparseArray<IDownloadListener> notificationListeners;
    public InterfaceC2199471B6j retryDelayTimeCalculator;
    public final SparseArray<C1B72> singleListenerHashCodeMap;
    public final Map<C1B72, IDownloadListener> singleListenerMap;
    public final SparseArray<IDownloadListener> subThreadListeners;

    public synchronized int autoCalAndGetHashCodeForSameTask() {
        IDownloadListener singleDownloadListener = getSingleDownloadListener(C1B72.MAIN);
        if (singleDownloadListener != null || (singleDownloadListener = getSingleDownloadListener(C1B72.SUB)) != null) {
            this.hashCodeForSameTask = singleDownloadListener.hashCode();
        }
        return this.hashCodeForSameTask;
    }

    public DownloadTask needChunkDowngradeRetry(boolean z) {
        return this;
    }

    public DownloadTask needReuseChunkRunnable(boolean z) {
        return this;
    }

    public DownloadTask newSaveTempFileEnable(boolean z) {
        return this;
    }

    private int downloadImpl() {
        this.downloadInfo = this.downloadInfoBuilder.LIZ();
        IDownloadProcessDispatcherService iDownloadProcessDispatcherService = (IDownloadProcessDispatcherService) C1B82.LIZ(IDownloadProcessDispatcherService.class);
        if (iDownloadProcessDispatcherService.getDownloadInfo(this.downloadInfo.getId()) == null) {
            ((IDownloadMonitorHelperService) C1B82.LIZ(IDownloadMonitorHelperService.class)).monitorSend(this, null, 0);
        }
        iDownloadProcessDispatcherService.tryDownload(this);
        DownloadInfo downloadInfo = this.downloadInfo;
        if (downloadInfo == null) {
            return 0;
        }
        return downloadInfo.getId();
    }

    public void addListenerToDownloadingSameTask() {
        if (this.downloadInfo != null) {
            if (C1490830otl.LIZ()) {
                C1490830otl.LIZLLL(this.downloadInfo.getId(), "DownloadTask", "addListenerToDownloadingSameTask", "Same task just tryDownloading, so add listener in last task instead of tryDownload");
            }
            if (!this.downloadInfo.isAddListenerToSameTask()) {
                this.downloadInfo.setAddListenerToSameTask(true);
            }
        }
        addListenerToDownloadingSameTask(C1B72.MAIN);
        addListenerToDownloadingSameTask(C1B72.SUB);
        ((IDownloadMonitorHelperService) C1B82.LIZ(IDownloadMonitorHelperService.class)).monitorSendWithTaskMonitor(this.monitorDepend, this.downloadInfo, new BaseException(1003, "has another same task, add Listener to old task"), 0);
    }

    public DownloadInfo buildDownloadInfo() {
        return this.downloadInfoBuilder.LIZ();
    }

    public boolean canShowNotification() {
        DownloadInfo downloadInfo = this.downloadInfo;
        if (downloadInfo != null) {
            return downloadInfo.canShowNotification();
        }
        return false;
    }

    public int getDownloadId() {
        DownloadInfo downloadInfo = this.downloadInfo;
        if (downloadInfo == null) {
            return 0;
        }
        return downloadInfo.getId();
    }

    public DownloadTask() {
        this.singleListenerMap = new ConcurrentHashMap();
        this.singleListenerHashCodeMap = new SparseArray<>();
        this.needDelayForCacheSync = false;
        this.downloadCompleteHandlers = new ArrayList();
        this.autoRemoveCallback = false;
        this.autoSetHashCodeForSameTask = true;
        this.downloadInfoBuilder = new C2199771B7n();
        this.mainThreadListeners = new SparseArray<>();
        this.subThreadListeners = new SparseArray<>();
        this.notificationListeners = new SparseArray<>();
    }

    public int download() {
        boolean zLJI = MethodIDManager.LJI(137667);
        if (C2199751B7l.LJFF.LJIIIIZZ("fix_anr_remove_report_idle_status", 0) <= 0) {
            int iDownloadImpl = downloadImpl();
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return iDownloadImpl;
        }
        this.downloadInfo = this.downloadInfoBuilder.LIZ();
        ((IDownloadProcessDispatcherService) C1B82.LIZ(IDownloadProcessDispatcherService.class)).tryDownload(this);
        int id = this.downloadInfo.getId();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return id;
    }

    public IDownloadDepend getDepend() {
        return this.depend;
    }

    public InterfaceC2199481B6k getDiskSpaceHandler() {
        return this.diskSpaceHandler;
    }

    public List<InterfaceC2199361B5y> getDownloadCompleteHandlers() {
        return this.downloadCompleteHandlers;
    }

    public DownloadInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public InterfaceC19860712nF getFileUriProvider() {
        return this.fileUriProvider;
    }

    public InterfaceC2199321B5u getForbiddenHandler() {
        return this.forbiddenHandler;
    }

    public int getHashCodeForSameTask() {
        return this.hashCodeForSameTask;
    }

    public InterfaceC2199461B6i getInterceptor() {
        return this.interceptor;
    }

    public InterfaceC2199431B6f getMonitorDepend() {
        return this.monitorDepend;
    }

    public C1B6D getNotificationClickCallback() {
        return this.notificationClickCallback;
    }

    public C1B5Q getNotificationEventListener() {
        return this.notificationEventListener;
    }

    public InterfaceC2199471B6j getRetryDelayTimeCalculator() {
        return this.retryDelayTimeCalculator;
    }

    public boolean isAutoSetHashCodeForSameTask() {
        return this.autoSetHashCodeForSameTask;
    }

    public boolean isNeedDelayForCacheSync() {
        return this.needDelayForCacheSync;
    }

    public DownloadTask(DownloadInfo downloadInfo) {
        this();
        this.downloadInfo = downloadInfo;
    }

    private void addListenerToDownloadingSameTask(C1B72 c1b72) {
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(c1b72);
        if (downloadListeners == null) {
            C1490830otl.LJ(getDownloadId(), "DownloadTask", "addListenerToDownloadingSameTask", "ListenerType is null");
            return;
        }
        synchronized (downloadListeners) {
            for (int i = 0; i < downloadListeners.size(); i++) {
                try {
                    IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i));
                    if (iDownloadListener != null) {
                        ((IDownloadProcessDispatcherService) C1B82.LIZ(IDownloadProcessDispatcherService.class)).addDownloadListener(getDownloadId(), iDownloadListener, c1b72, false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public DownloadTask accessHttpHeaderKeys(List<String> list) {
        this.downloadInfoBuilder.LJJJZ = list;
        return this;
    }

    public DownloadTask addDownloadCompleteHandler(InterfaceC2199361B5y interfaceC2199361B5y) {
        synchronized (this.downloadCompleteHandlers) {
            if (interfaceC2199361B5y != null) {
                try {
                    if (!this.downloadCompleteHandlers.contains(interfaceC2199361B5y)) {
                        this.downloadCompleteHandlers.add(interfaceC2199361B5y);
                        return this;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return this;
        }
    }

    public DownloadTask addListenerToSameTask(boolean z) {
        this.downloadInfoBuilder.LJJJIL = z;
        return this;
    }

    public DownloadTask addTTNetCommonParam(boolean z) {
        this.downloadInfoBuilder.LJJJJZI = z;
        return this;
    }

    public void asyncDownload(InterfaceC2329409Au interfaceC2329409Au) {
        ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).submitSingleTask(new ARunnableS72S0200000_3(interfaceC2329409Au, this, 7));
    }

    public DownloadTask autoRemoveCallback(boolean z) {
        this.autoRemoveCallback = z;
        return this;
    }

    public DownloadTask autoResumed(boolean z) {
        this.downloadInfoBuilder.LJIL = z;
        return this;
    }

    public DownloadTask autoSetHashCodeForSameTask(boolean z) {
        this.autoSetHashCodeForSameTask = z;
        return this;
    }

    public DownloadTask backUpUrlRetryCount(int i) {
        this.downloadInfoBuilder.LJIIL = i;
        return this;
    }

    public DownloadTask backUpUrls(List<String> list) {
        this.downloadInfoBuilder.LJIIZILJ = list;
        return this;
    }

    public void copyInterfaceFromNewTask(DownloadTask downloadTask) {
        this.singleListenerMap.clear();
        this.singleListenerMap.putAll(downloadTask.singleListenerMap);
        synchronized (this.mainThreadListeners) {
            try {
                this.mainThreadListeners.clear();
                addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
            } finally {
            }
        }
        synchronized (this.subThreadListeners) {
            try {
                this.subThreadListeners.clear();
                addAll(downloadTask.subThreadListeners, this.subThreadListeners);
            } finally {
            }
        }
        synchronized (this.notificationListeners) {
            try {
                this.notificationListeners.clear();
                addAll(downloadTask.notificationListeners, this.notificationListeners);
            } finally {
            }
        }
        this.notificationEventListener = downloadTask.notificationEventListener;
        this.interceptor = downloadTask.interceptor;
        this.depend = downloadTask.depend;
        this.monitorDepend = downloadTask.monitorDepend;
        this.forbiddenHandler = downloadTask.forbiddenHandler;
        this.diskSpaceHandler = downloadTask.diskSpaceHandler;
        this.retryDelayTimeCalculator = downloadTask.retryDelayTimeCalculator;
        this.notificationClickCallback = downloadTask.notificationClickCallback;
        this.fileUriProvider = downloadTask.fileUriProvider;
        synchronized (this.downloadCompleteHandlers) {
            try {
                this.downloadCompleteHandlers.clear();
                this.downloadCompleteHandlers.addAll(downloadTask.downloadCompleteHandlers);
            } finally {
            }
        }
    }

    public void copyListenerFromPendingTask(DownloadTask downloadTask) {
        for (Map.Entry<C1B72, IDownloadListener> entry : downloadTask.singleListenerMap.entrySet()) {
            if (entry != null && !this.singleListenerMap.containsKey(entry.getKey())) {
                this.singleListenerMap.put(entry.getKey(), entry.getValue());
            }
        }
        try {
            if (downloadTask.mainThreadListeners.size() != 0) {
                synchronized (this.mainThreadListeners) {
                    try {
                        removeAll(this.mainThreadListeners, downloadTask.mainThreadListeners);
                        addAll(downloadTask.mainThreadListeners, this.mainThreadListeners);
                    } finally {
                    }
                }
            }
            if (downloadTask.subThreadListeners.size() != 0) {
                synchronized (this.subThreadListeners) {
                    try {
                        removeAll(this.subThreadListeners, downloadTask.subThreadListeners);
                        addAll(downloadTask.subThreadListeners, this.subThreadListeners);
                    } finally {
                    }
                }
            }
            if (downloadTask.notificationListeners.size() != 0) {
                synchronized (this.notificationListeners) {
                    try {
                        removeAll(this.notificationListeners, downloadTask.notificationListeners);
                        addAll(downloadTask.notificationListeners, this.notificationListeners);
                    } finally {
                    }
                }
            }
        } catch (Throwable th) {
        }
    }

    public DownloadTask deleteCacheIfCheckFailed(boolean z) {
        this.downloadInfoBuilder.LJJJJLL = z;
        return this;
    }

    public DownloadTask depend(IDownloadDepend iDownloadDepend) {
        this.depend = iDownloadDepend;
        return this;
    }

    public DownloadTask diskSpaceHandler(InterfaceC2199481B6k interfaceC2199481B6k) {
        this.diskSpaceHandler = interfaceC2199481B6k;
        return this;
    }

    public DownloadTask distinctDirectory(boolean z) {
        this.downloadInfoBuilder.LJJJLIIL = z;
        return this;
    }

    public DownloadTask downloadSetting(JSONObject jSONObject) {
        this.downloadInfoBuilder.LJJJJ = jSONObject;
        return this;
    }

    public DownloadTask endOffset(long j) {
        this.downloadInfoBuilder.LJJIL = j;
        return this;
    }

    public DownloadTask enqueueType(EnumC19365210pW enumC19365210pW) {
        this.downloadInfoBuilder.LJJIJ = enumC19365210pW;
        return this;
    }

    public DownloadTask executorGroup(int i) {
        this.downloadInfoBuilder.LJJJJJL = i;
        return this;
    }

    public DownloadTask expectFileLength(long j) {
        this.downloadInfoBuilder.LJJIII = j;
        return this;
    }

    public DownloadTask expiredHttpCheck(boolean z) {
        this.downloadInfoBuilder.LJJJJLI = z;
        return this;
    }

    public DownloadTask expiredRedownload(boolean z) {
        this.downloadInfoBuilder.LJJJJL = z;
        return this;
    }

    public DownloadTask extra(String str) {
        this.downloadInfoBuilder.LJI = str;
        return this;
    }

    public DownloadTask extraHeaders(List<HttpHeader> list) {
        this.downloadInfoBuilder.LJII = list;
        return this;
    }

    public DownloadTask extraMonitorStatus(int[] iArr) {
        this.downloadInfoBuilder.LJJJJJ = iArr;
        return this;
    }

    public DownloadTask fileUriProvider(InterfaceC19860712nF interfaceC19860712nF) {
        this.fileUriProvider = interfaceC19860712nF;
        return this;
    }

    public DownloadTask forbiddenHandler(InterfaceC2199321B5u interfaceC2199321B5u) {
        this.forbiddenHandler = interfaceC2199321B5u;
        return this;
    }

    public DownloadTask force(boolean z) {
        this.downloadInfoBuilder.LJIILIIL = z;
        return this;
    }

    public InterfaceC2199361B5y getDownloadCompleteHandlerByIndex(int i) {
        synchronized (this.downloadCompleteHandlers) {
            try {
                if (i < this.downloadCompleteHandlers.size()) {
                    return this.downloadCompleteHandlers.get(i);
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int getDownloadListenerSize(C1B72 c1b72) {
        int size;
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(c1b72);
        if (downloadListeners == null) {
            return 0;
        }
        synchronized (downloadListeners) {
            try {
                size = downloadListeners.size();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return size;
    }

    public SparseArray<IDownloadListener> getDownloadListeners(C1B72 c1b72) {
        if (c1b72 == C1B72.MAIN) {
            return this.mainThreadListeners;
        }
        if (c1b72 == C1B72.SUB) {
            return this.subThreadListeners;
        }
        if (c1b72 == C1B72.NOTIFICATION) {
            return this.notificationListeners;
        }
        return null;
    }

    public IDownloadListener getSingleDownloadListener(C1B72 c1b72) {
        return this.singleListenerMap.get(c1b72);
    }

    public DownloadTask hashCodeForSameTask(int i) {
        this.hashCodeForSameTask = i;
        return this;
    }

    public DownloadTask headConnectionAvailable(boolean z) {
        this.downloadInfoBuilder.LJJIJIIJI = z;
        return this;
    }

    public DownloadTask iconUrl(String str) {
        this.downloadInfoBuilder.LJJIJIL = str;
        return this;
    }

    public DownloadTask ignoreDataVerify(boolean z) {
        this.downloadInfoBuilder.LJJIJIIJIL = z;
        return this;
    }

    public DownloadTask ignoreInterceptor(boolean z) {
        this.downloadInfoBuilder.LJJJLZIJ = z;
        return this;
    }

    public DownloadTask interceptor(InterfaceC2199461B6i interfaceC2199461B6i) {
        this.interceptor = interfaceC2199461B6i;
        return this;
    }

    public DownloadTask isOpenLimitSpeed(boolean z) {
        this.downloadInfoBuilder.LJJJI = z;
        return this;
    }

    public DownloadTask mainThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        mainThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        return this;
    }

    public DownloadTask maxBytes(int i) {
        this.downloadInfoBuilder.LJIIIIZZ = i;
        return this;
    }

    public DownloadTask maxProgressCount(int i) {
        this.downloadInfoBuilder.LJIILL = i;
        return this;
    }

    public DownloadTask md5(String str) {
        this.downloadInfoBuilder.LJJII = str;
        return this;
    }

    public DownloadTask mimeType(String str) {
        this.downloadInfoBuilder.LJIJJ = str;
        return this;
    }

    public DownloadTask minProgressTimeMsInterval(int i) {
        this.downloadInfoBuilder.LJIILLIIL = i;
        return this;
    }

    public DownloadTask monitorDepend(InterfaceC2199431B6f interfaceC2199431B6f) {
        this.monitorDepend = interfaceC2199431B6f;
        return this;
    }

    public DownloadTask monitorScene(String str) {
        this.downloadInfoBuilder.LJJJJIZL = str;
        return this;
    }

    public DownloadTask name(String str) {
        this.downloadInfoBuilder.LIZ = str;
        return this;
    }

    public DownloadTask needDefaultHttpServiceBackUp(boolean z) {
        this.downloadInfoBuilder.LJJI = z;
        return this;
    }

    public DownloadTask needHttpsToHttpRetry(boolean z) {
        this.downloadInfoBuilder.LJIJJLI = z;
        return this;
    }

    public DownloadTask needIndependentProcess(boolean z) {
        this.downloadInfoBuilder.LJJIIZI = z;
        return this;
    }

    public DownloadTask needPostProgress(boolean z) {
        this.downloadInfoBuilder.LJIILJJIL = z;
        return this;
    }

    public DownloadTask needRetryDelay(boolean z) {
        this.downloadInfoBuilder.LJJIIJ = z;
        return this;
    }

    public DownloadTask needReuseFirstConnection(boolean z) {
        this.downloadInfoBuilder.LJJIIZ = z;
        return this;
    }

    public DownloadTask needSDKMonitor(boolean z) {
        this.downloadInfoBuilder.LJJJJI = z;
        return this;
    }

    public DownloadTask notificationClickCallback(C1B6D c1b6d) {
        this.notificationClickCallback = c1b6d;
        return this;
    }

    public DownloadTask notificationEventListener(C1B5Q c1b5q) {
        this.notificationEventListener = c1b5q;
        return this;
    }

    public DownloadTask notificationListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        notificationListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        return this;
    }

    public DownloadTask onlyWifi(boolean z) {
        this.downloadInfoBuilder.LJFF = z;
        return this;
    }

    public DownloadTask outIp(String[] strArr) {
        this.downloadInfoBuilder.LJIIIZ = strArr;
        return this;
    }

    public DownloadTask outSize(int[] iArr) {
        this.downloadInfoBuilder.LJIIJ = iArr;
        return this;
    }

    public DownloadTask packageName(String str) {
        this.downloadInfoBuilder.LJJIFFI = str;
        return this;
    }

    public DownloadTask retryCount(int i) {
        this.downloadInfoBuilder.LJIIJJI = i;
        return this;
    }

    public DownloadTask retryDelayTimeArray(String str) {
        this.downloadInfoBuilder.LJJIIJZLJL = str;
        return this;
    }

    public DownloadTask retryDelayTimeCalculator(InterfaceC2199471B6j interfaceC2199471B6j) {
        this.retryDelayTimeCalculator = interfaceC2199471B6j;
        return this;
    }

    public DownloadTask savePath(String str) {
        this.downloadInfoBuilder.LIZLLL = str;
        return this;
    }

    public DownloadTask setAutoInstall(boolean z) {
        this.downloadInfoBuilder.LJIJI = z;
        return this;
    }

    public DownloadTask setDownloadCompleteHandlers(List<InterfaceC2199361B5y> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<InterfaceC2199361B5y> it2 = list.iterator();
            while (it2.hasNext()) {
                addDownloadCompleteHandler(it2.next());
            }
        }
        return this;
    }

    public void setNeedDelayForCacheSync(boolean z) {
        this.needDelayForCacheSync = z;
    }

    public void setNotificationEventListener(C1B5Q c1b5q) {
        this.notificationEventListener = c1b5q;
    }

    public DownloadTask showNotification(boolean z) {
        this.downloadInfoBuilder.LJIJ = z;
        return this;
    }

    public DownloadTask showNotificationForAutoResumed(boolean z) {
        this.downloadInfoBuilder.LJJ = z;
        return this;
    }

    public DownloadTask startOffset(long j) {
        C2199771B7n c2199771B7n = this.downloadInfoBuilder;
        if (j > 0) {
            c2199771B7n.LJJIJLIJ = j;
            return this;
        }
        c2199771B7n.getClass();
        return this;
    }

    public DownloadTask subThreadListener(IDownloadListener iDownloadListener) {
        if (iDownloadListener == null) {
            return this;
        }
        subThreadListenerWithHashCode(iDownloadListener.hashCode(), iDownloadListener);
        return this;
    }

    public DownloadTask taskKey(String str) {
        this.downloadInfoBuilder.LJJJLL = str;
        return this;
    }

    public DownloadTask tempPath(String str) {
        this.downloadInfoBuilder.LJ = str;
        return this;
    }

    public DownloadTask throttleNetSpeed(long j) {
        this.downloadInfoBuilder.LJJIZ = j;
        return this;
    }

    public DownloadTask throttleSmoothness(int i) {
        this.downloadInfoBuilder.LJJJ = i;
        return this;
    }

    public DownloadTask title(String str) {
        this.downloadInfoBuilder.LIZIZ = str;
        return this;
    }

    public DownloadTask ttnetProtectTimeout(long j) {
        this.downloadInfoBuilder.LJJJJZ = j;
        return this;
    }

    public DownloadTask url(String str) {
        this.downloadInfoBuilder.LIZJ = str;
        return this;
    }

    private void addAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray != null && sparseArray2 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                sparseArray2.put(iKeyAt, sparseArray.get(iKeyAt));
            }
        }
    }

    private void copyListeners(SparseArray<IDownloadListener> sparseArray, SparseArray<IDownloadListener> sparseArray2) {
        sparseArray.clear();
        for (int i = 0; i < sparseArray2.size(); i++) {
            int iKeyAt = sparseArray2.keyAt(i);
            IDownloadListener iDownloadListener = sparseArray2.get(iKeyAt);
            if (iDownloadListener != null) {
                sparseArray.put(iKeyAt, iDownloadListener);
            }
        }
    }

    private void removeAll(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray != null && sparseArray2 != null) {
            int size = sparseArray2.size();
            for (int i = 0; i < size; i++) {
                sparseArray.remove(sparseArray2.keyAt(i));
            }
        }
    }

    public IDownloadListener getDownloadListenerByIndex(C1B72 c1b72, int i) {
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(c1b72);
        if (downloadListeners == null || i < 0) {
            return null;
        }
        synchronized (downloadListeners) {
            try {
                if (i >= downloadListeners.size()) {
                    return null;
                }
                return downloadListeners.get(downloadListeners.keyAt(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public DownloadTask mainThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.mainThreadListeners) {
                try {
                    this.mainThreadListeners.put(i, iDownloadListener);
                } finally {
                }
            }
            Map<C1B72, IDownloadListener> map = this.singleListenerMap;
            C1B72 c1b72 = C1B72.MAIN;
            map.put(c1b72, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                try {
                    this.singleListenerHashCodeMap.put(i, c1b72);
                } finally {
                }
            }
            return this;
        }
        return this;
    }

    public DownloadTask notificationListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.notificationListeners) {
                try {
                    this.notificationListeners.put(i, iDownloadListener);
                } finally {
                }
            }
            Map<C1B72, IDownloadListener> map = this.singleListenerMap;
            C1B72 c1b72 = C1B72.NOTIFICATION;
            map.put(c1b72, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                try {
                    this.singleListenerHashCodeMap.put(i, c1b72);
                } finally {
                }
            }
            return this;
        }
        return this;
    }

    public void removeCallback(C1B72 c1b72, IDownloadListener iDownloadListener) {
        int iHashCode;
        if (this.autoRemoveCallback && c1b72 != C1B72.NONE) {
            if (C1490830otl.LIZ()) {
                int id = this.downloadInfo.getId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ListenerType:");
                sbLIZ.append(c1b72);
                sbLIZ.append(" listener:");
                sbLIZ.append(iDownloadListener);
                C1490830otl.LIZLLL(id, "DownloadTask", "removeCallback", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (iDownloadListener == null) {
                iHashCode = 0;
            } else {
                iHashCode = iDownloadListener.hashCode();
            }
            removeDownloadListener(iHashCode, iDownloadListener, c1b72, false);
        }
    }

    public void setDownloadListeners(SparseArray<IDownloadListener> sparseArray, C1B72 c1b72) {
        if (sparseArray == null) {
            return;
        }
        try {
            if (c1b72 == C1B72.MAIN) {
                synchronized (this.mainThreadListeners) {
                    try {
                        copyListeners(this.mainThreadListeners, sparseArray);
                    } finally {
                    }
                }
                return;
            }
            if (c1b72 == C1B72.SUB) {
                synchronized (this.subThreadListeners) {
                    try {
                        copyListeners(this.subThreadListeners, sparseArray);
                    } finally {
                    }
                }
                return;
            }
            if (c1b72 == C1B72.NOTIFICATION) {
                synchronized (this.notificationListeners) {
                    try {
                        copyListeners(this.notificationListeners, sparseArray);
                    } finally {
                    }
                }
                return;
            }
            return;
        } catch (Throwable th) {
        }
    }

    public DownloadTask subThreadListenerWithHashCode(int i, IDownloadListener iDownloadListener) {
        if (iDownloadListener != null) {
            synchronized (this.subThreadListeners) {
                try {
                    this.subThreadListeners.put(i, iDownloadListener);
                } finally {
                }
            }
            Map<C1B72, IDownloadListener> map = this.singleListenerMap;
            C1B72 c1b72 = C1B72.SUB;
            map.put(c1b72, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                try {
                    this.singleListenerHashCodeMap.put(i, c1b72);
                } finally {
                }
            }
            return this;
        }
        return this;
    }

    public void addDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        Map<C1B72, IDownloadListener> map;
        if (iDownloadListener == null) {
            return;
        }
        if (z && (map = this.singleListenerMap) != null) {
            map.put(c1b72, iDownloadListener);
            synchronized (this.singleListenerHashCodeMap) {
                try {
                    this.singleListenerHashCodeMap.put(i, c1b72);
                } finally {
                }
            }
        }
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(c1b72);
        if (downloadListeners == null) {
            return;
        }
        synchronized (downloadListeners) {
            try {
                downloadListeners.put(i, iDownloadListener);
            } finally {
            }
        }
    }

    public void removeDownloadListener(int i, IDownloadListener iDownloadListener, C1B72 c1b72, boolean z) {
        int iIndexOfValue;
        SparseArray<IDownloadListener> downloadListeners = getDownloadListeners(c1b72);
        if (downloadListeners == null) {
            if (z && this.singleListenerMap.containsKey(c1b72)) {
                this.singleListenerMap.remove(c1b72);
                return;
            }
            return;
        }
        synchronized (downloadListeners) {
            try {
                if (z) {
                    if (this.singleListenerMap.containsKey(c1b72)) {
                        iDownloadListener = this.singleListenerMap.get(c1b72);
                        this.singleListenerMap.remove(c1b72);
                    }
                    if (iDownloadListener != null && (iIndexOfValue = downloadListeners.indexOfValue(iDownloadListener)) >= 0 && iIndexOfValue < downloadListeners.size()) {
                        downloadListeners.removeAt(iIndexOfValue);
                    }
                } else {
                    downloadListeners.remove(i);
                    synchronized (this.singleListenerHashCodeMap) {
                        try {
                            C1B72 c1b722 = this.singleListenerHashCodeMap.get(i);
                            if (c1b722 != null && this.singleListenerMap.containsKey(c1b722)) {
                                this.singleListenerMap.remove(c1b722);
                                this.singleListenerHashCodeMap.remove(i);
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
