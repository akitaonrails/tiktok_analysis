package com.ss.android.socialbase.downloader.model;

import X.C0VSJ;
import X.C1294200jmc;
import X.C1490830otl;
import X.C1498850p6h;
import X.C1B7X;
import X.C1B7Y;
import X.C1B7Z;
import X.C1B82;
import X.C1B83;
import X.C1D13;
import X.C207234167k;
import X.C2188811AlT;
import X.C2199671B7d;
import X.C2199751B7l;
import X.C2199771B7n;
import X.C2199881B7y;
import X.C786410Ut5;
import X.C810670Vr7;
import X.EnumC19365210pW;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadIdGeneratorService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadInfo implements Parcelable {
    public static final Parcelable.Creator<DownloadInfo> CREATOR = new C1D13(26);
    public List<String> accessHttpHeaderKeys;
    public boolean addListenerToSameTask;
    public boolean addTTNetCommonParam;
    public AtomicLong allConnectTime;
    public int appVersionCode;
    public C1B7X asyncHandleStatus;
    public boolean autoResumed;
    public int backUpUrlRetryCount;
    public boolean backUpUrlUsed;
    public List<String> backUpUrls;
    public String backUpUrlsStr;
    public int bindValueCount;
    public C1B7Z byteInvalidRetryStatus;
    public int chunkCount;
    public int curBackUpUrlIndex;
    public AtomicLong curBytes;
    public int curNetworkRetryCount;
    public int curRetryTime;
    public JSONObject dbJsonData;
    public String dbJsonDataString;
    public boolean deleteCacheIfCheckFailed;
    public long downloadFinishTimeStamp;
    public long downloadStartTimeStamp;
    public long downloadTime;
    public String eTag;
    public EnumC19365210pW enqueueType;
    public StringBuffer errorBytesLog;
    public boolean expiredHttpCheck;
    public boolean expiredRedownload;
    public String extra;
    public List<HttpHeader> extraHeaders;
    public int[] extraMonitorStatus;
    public BaseException failedException;
    public String filePackageName;
    public List<String> forbiddenBackupUrls;
    public boolean force;
    public boolean forceIgnoreRecommendSize;
    public boolean hasDoInstallation;
    public boolean headConnectionAvailable;
    public String headConnectionException;
    public Map<String, String> httpHeaders;
    public int httpStatusCode;
    public String httpStatusMessage;
    public boolean httpsToHttpRetryUsed;
    public String iconUrl;
    public int id;
    public boolean ignoreDataVerify;
    public Boolean ignoreInterceptor;
    public long installedTimeStamp;
    public int interceptFlag;
    public Boolean isAutoInstallWithoutNotification;
    public boolean isCacheExistsInDownloading;
    public boolean isFirstDownload;
    public boolean isFirstSuccess;
    public boolean isForbiddenRetryed;
    public volatile boolean isSaveTempFile;
    public AtomicLong lastNotifyProgressTime;
    public boolean mDownloadFromReserveWifi;
    public int maxBytes;
    public int maxProgressCount;
    public String md5;
    public String mimeType;
    public int minProgressTimeMsInterval;
    public String monitorScene;
    public String name;
    public boolean needDefaultHttpServiceBackUp;
    public boolean needHttpsToHttpRetry;
    public boolean needIndependentProcess;
    public boolean needPostProgress;
    public boolean needRetryDelay;
    public boolean needReuseFirstConnection;
    public boolean needSDKMonitor;
    public String networkQuality;
    public int notificationVisibility;
    public boolean onlyWifi;
    public boolean openLimitSpeed;
    public String[] outIp;
    public int[] outSize;
    public SoftReference<PackageInfo> packageInfoRef;
    public String packageName;
    public long realDownloadTime;
    public long realStartDownloadTime;
    public int retryCount;
    public C1B7Y retryDelayStatus;
    public String retryDelayTimeArray;
    public int retryScheduleMinutes;
    public String savePath;
    public boolean showNotification;
    public boolean showNotificationForAutoResumed;
    public boolean showNotificationForNetworkResumed;
    public JSONObject spData;
    public long startDownloadTime;
    public AtomicInteger status;
    public int statusAtDbInit;
    public boolean successByCache;
    public boolean supportPartial;
    public String taskId;
    public ConcurrentHashMap<String, Object> tempCacheData;
    public String tempPath;
    public long throttleNetSpeed;
    public int throttleSmoothness;
    public String title;
    public long totalBytes;
    public long ttnetProtectTimeout;
    public String url;
    public long xTotalBytes;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isChunkDowngradeRetryUsed() {
        return false;
    }

    public boolean isNeedChunkDowngradeRetry() {
        return false;
    }

    public boolean isNeedRetryDelay() {
        return false;
    }

    public boolean isNeedReuseChunkRunnable() {
        return false;
    }

    public void setDeleteCacheIfCheckFailed() {
        this.deleteCacheIfCheckFailed = true;
    }

    public void setForbiddenRetryed() {
        this.isForbiddenRetryed = true;
    }

    private void ensureDBJsonData() {
        if (this.dbJsonData == null) {
            synchronized (this) {
                try {
                    if (this.dbJsonData == null) {
                        try {
                            if (TextUtils.isEmpty(this.dbJsonDataString)) {
                                this.dbJsonData = new JSONObject();
                            } else {
                                this.dbJsonData = new JSONObject(this.dbJsonDataString);
                                this.dbJsonDataString = null;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            this.dbJsonData = new JSONObject();
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }

    private void ensureSpData() {
        if (this.spData == null) {
            Context appContext = ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext();
            if (appContext != null) {
                String string = C810670Vr7.LIZJ(appContext, 0, "sp_download_info").getString(Long.toString(getId()), "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        this.spData = new JSONObject(string);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            if (this.spData == null) {
                this.spData = new JSONObject();
            }
        }
    }

    private void ensureTempCacheData() {
        if (this.tempCacheData == null) {
            synchronized (this) {
                try {
                    if (this.tempCacheData == null) {
                        this.tempCacheData = new ConcurrentHashMap<>();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    private void putMonitorSetting() {
        safePutToDBJsonData("need_sdk_monitor", Boolean.valueOf(this.needSDKMonitor));
        safePutToDBJsonData("monitor_scene", this.monitorScene);
        try {
            JSONArray jSONArray = new JSONArray();
            int[] iArr = this.extraMonitorStatus;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                while (true) {
                    int[] iArr2 = this.extraMonitorStatus;
                    if (i >= iArr2.length) {
                        break;
                    }
                    jSONArray.put(iArr2[i]);
                    i++;
                }
            }
            safePutToDBJsonData("extra_monitor_status", jSONArray);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public boolean canNotifyProgress() {
        long j = this.lastNotifyProgressTime.get();
        return j == 0 || SystemClock.uptimeMillis() - j > 20;
    }

    public boolean canReplaceHttpForRetry() {
        return !TextUtils.isEmpty(this.url) && this.url.startsWith("https") && this.needHttpsToHttpRetry && !this.httpsToHttpRetryUsed;
    }

    public boolean canShowNotification() {
        return !this.autoResumed ? this.showNotification : this.showNotificationForAutoResumed || this.showNotificationForNetworkResumed;
    }

    public int checkMd5Status() {
        return C2199671B7d.LIZIZ(new C2199881B7y(getSavePath(), getName(), true, true), this.md5);
    }

    public void clearSpData() {
        Context appContext = ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext();
        if (appContext != null) {
            try {
                C810670Vr7.LIZJ(appContext, 0, "sp_download_info").edit().remove(Integer.toString(getId())).apply();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void erase() {
        setCurBytes(0L, true);
        this.totalBytes = 0L;
        this.chunkCount = 1;
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
        this.curRetryTime = 0;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.backUpUrlUsed = false;
        this.httpsToHttpRetryUsed = false;
        this.eTag = null;
        this.failedException = null;
        this.tempCacheData = null;
        this.packageInfoRef = null;
    }

    public void generateTaskId() {
        if (TextUtils.isEmpty(this.taskId)) {
            this.taskId = UUID.randomUUID().toString();
        }
    }

    public String getBackUpUrl() {
        List<String> list;
        int i;
        if (!this.backUpUrlUsed || (list = this.backUpUrls) == null || list.size() <= 0 || (i = this.curBackUpUrlIndex) < 0 || i >= this.backUpUrls.size()) {
            return "";
        }
        String str = (String) ListProtector.get(this.backUpUrls, this.curBackUpUrlIndex);
        return !TextUtils.isEmpty(str) ? str : "";
    }

    public String getBackUpUrlsStr() {
        List<String> list;
        if (this.backUpUrlsStr == null && (list = this.backUpUrls) != null && !list.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.backUpUrls) {
                    if (!TextUtils.isEmpty(str)) {
                        jSONArray.put(str);
                    }
                }
                this.backUpUrlsStr = jSONArray.toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.backUpUrlsStr == null) {
            this.backUpUrlsStr = "";
        }
        return this.backUpUrlsStr;
    }

    public String getConnectionUrl() {
        List<String> list;
        int i;
        List<String> list2;
        String str = this.url;
        if (getStatus() == 8 && (list2 = this.forbiddenBackupUrls) != null && !list2.isEmpty() && !this.backUpUrlUsed) {
            return (String) ListProtector.get(this.forbiddenBackupUrls, 0);
        }
        if (!this.backUpUrlUsed || (list = this.backUpUrls) == null || list.size() <= 0 || (i = this.curBackUpUrlIndex) < 0 || i >= this.backUpUrls.size()) {
            return (!TextUtils.isEmpty(this.url) && this.url.startsWith("https") && this.needHttpsToHttpRetry && this.httpsToHttpRetryUsed) ? this.url.replaceFirst("https", "http") : str;
        }
        String str2 = (String) ListProtector.get(this.backUpUrls, this.curBackUpUrlIndex);
        return !TextUtils.isEmpty(str2) ? str2 : str;
    }

    public long getCurBytes() {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public int getCurRetryTimeInTotal() {
        int i = this.curRetryTime;
        if (!this.backUpUrlUsed) {
            return i;
        }
        int i2 = i + this.retryCount;
        int i3 = this.curBackUpUrlIndex;
        return i3 > 0 ? i2 + (i3 * this.backUpUrlRetryCount) : i2;
    }

    public String getDBJsonDataString() {
        String strJ3;
        String str = this.dbJsonDataString;
        if (str != null) {
            return str;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                strJ3 = C786410Ut5.J3(this.dbJsonData);
                this.dbJsonDataString = strJ3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strJ3;
    }

    public int getDownloadProcess() {
        if (this.totalBytes <= 0) {
            return 0;
        }
        if (getCurBytes() > this.totalBytes) {
            return 100;
        }
        return (int) ((getCurBytes() * 100) / this.totalBytes);
    }

    public String getErrorBytesLog() {
        StringBuffer stringBuffer = this.errorBytesLog;
        return (stringBuffer == null || stringBuffer.length() == 0) ? "" : this.errorBytesLog.toString();
    }

    public int getId() {
        if (this.id == 0) {
            this.id = ((IDownloadIdGeneratorService) C1B82.LIZ(IDownloadIdGeneratorService.class)).generate(this);
        }
        return this.id;
    }

    public int getMinProgressTimeMsInterval() {
        int i = this.minProgressTimeMsInterval;
        return i < 1000 ? LSPassThroughRecordSizeConfig.DEFAULT : i;
    }

    public PackageInfo getPackageInfo() {
        SoftReference<PackageInfo> softReference = this.packageInfoRef;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public long getRealDownloadTime() {
        return TimeUnit.NANOSECONDS.toMillis(this.realDownloadTime);
    }

    public int getRealStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    public long getRetryScheduleMinutes() {
        return this.retryScheduleMinutes;
    }

    public int getStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger == null) {
            return 0;
        }
        int i = atomicInteger.get();
        if (i == -5) {
            return -2;
        }
        return i;
    }

    public String getTargetFilePath() {
        return C2199671B7d.LJIILL(this.savePath, this.name);
    }

    public String getTempFilePath() {
        String str = this.savePath;
        String str2 = this.tempPath;
        String str3 = this.name;
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.isEmpty(str3)) {
            return null;
        }
        String strLJIILL = !TextUtils.isEmpty(str2) ? C2199671B7d.LJIILL(str2, str3) : C2199671B7d.LJIILL(str, str3);
        if (TextUtils.isEmpty(strLJIILL)) {
            return null;
        }
        return C786410Ut5.j4("%s.tp", new Object[]{strLJIILL});
    }

    public String getTempName() {
        String str = this.name;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C786410Ut5.j4("%s.tp", new Object[]{str});
    }

    public String getTempPath() {
        String str = this.savePath;
        String str2 = this.tempPath;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return null;
        }
        return !TextUtils.isEmpty(str2) ? str2 : str;
    }

    public String getTitle() {
        return TextUtils.isEmpty(this.title) ? this.name : this.title;
    }

    public int getTotalRetryCount() {
        int i = this.retryCount;
        List<String> list = this.backUpUrls;
        return (list == null || list.isEmpty()) ? i : i + (this.backUpUrlRetryCount * this.backUpUrls.size());
    }

    public boolean hasNextBackupUrl() {
        int i;
        List<String> list = this.backUpUrls;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return !this.backUpUrlUsed || ((i = this.curBackUpUrlIndex) >= 0 && i < this.backUpUrls.size() - 1);
    }

    public boolean isAutoInstallWithoutNotification() {
        if (this.isAutoInstallWithoutNotification == null) {
            if (TextUtils.isEmpty(this.extra)) {
                this.isAutoInstallWithoutNotification = Boolean.FALSE;
            } else {
                try {
                    this.isAutoInstallWithoutNotification = Boolean.valueOf(new JSONObject(this.extra).optBoolean("auto_install_without_notification", false));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.isAutoInstallWithoutNotification = Boolean.FALSE;
                }
            }
        }
        return this.isAutoInstallWithoutNotification.booleanValue();
    }

    public boolean isChunked() {
        return this.totalBytes == -1;
    }

    public boolean isEntityInvalid() {
        return TextUtils.isEmpty(this.url) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.savePath);
    }

    public boolean isExpiredRedownload() {
        if (C2199751B7l.LJFF.LJIIIIZZ("force_close_download_cache_check", 0) != 1) {
            return this.expiredRedownload;
        }
        if (C1490830otl.LIZ()) {
            int i = this.id;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IsExpiredRedownload Force to false, reason(global setting) id=");
            sbLIZ.append(getId());
            sbLIZ.append(" name=");
            sbLIZ.append(getName());
            C1490830otl.LIZLLL(i, "DownloadInfo", "isExpiredRedownload", C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public boolean isFirstDownload() {
        if (!this.isFirstDownload || TextUtils.isEmpty(getTempPath()) || TextUtils.isEmpty(getTempName())) {
            return false;
        }
        return !new C0VSJ(getTempPath(), getTempName()).exists();
    }

    public boolean isIgnoreInterceptor() {
        if (this.ignoreInterceptor == null) {
            ensureDBJsonData();
            this.ignoreInterceptor = Boolean.valueOf(this.dbJsonData.optInt("ignore_intercept", 0) == 1);
        }
        return this.ignoreInterceptor.booleanValue();
    }

    public boolean isPauseReserveWithWifiValid() {
        return !this.mDownloadFromReserveWifi || (isPauseReserveOnWifi() && C2199671B7d.LJJI(((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext()));
    }

    public boolean isWaitingWifiStatus() {
        BaseException baseException = this.failedException;
        return baseException != null && baseException.getErrorCode() == 1013;
    }

    public void reset() {
        setCurBytes(0L, true);
        this.totalBytes = 0L;
        this.chunkCount = 1;
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
    }

    public void resetRealStartDownloadTime() {
        this.realStartDownloadTime = 0L;
    }

    public void setLastNotifyProgressTime() {
        this.lastNotifyProgressTime.set(SystemClock.uptimeMillis());
    }

    public boolean trySwitchToNextBackupUrl() {
        if (this.backUpUrlUsed) {
            this.curBackUpUrlIndex++;
        }
        List<String> list = this.backUpUrls;
        if (list != null && list.size() != 0 && this.curBackUpUrlIndex >= 0) {
            while (this.curBackUpUrlIndex < this.backUpUrls.size()) {
                if (!TextUtils.isEmpty((String) ListProtector.get(this.backUpUrls, this.curBackUpUrlIndex))) {
                    this.backUpUrlUsed = true;
                    return true;
                }
                this.curBackUpUrlIndex++;
            }
        }
        return false;
    }

    public void updateDownloadTime() {
        if (this.startDownloadTime == 0) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.startDownloadTime;
        if (this.downloadTime < 0) {
            this.downloadTime = 0L;
        }
        if (jUptimeMillis > 0) {
            this.downloadTime = jUptimeMillis;
        }
    }

    public void updateRealStartDownloadTime() {
        if (this.realStartDownloadTime == 0) {
            this.realStartDownloadTime = System.nanoTime();
        }
    }

    public void updateSpData() {
        Context appContext;
        if (this.spData == null || (appContext = ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext()) == null) {
            return;
        }
        C810670Vr7.LIZJ(appContext, 0, "sp_download_info").edit().putString(Integer.toString(getId()), C786410Ut5.J3(this.spData)).apply();
    }

    public DownloadInfo() {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = C1B7Y.DELAY_RETRY_NONE;
        this.asyncHandleStatus = C1B7X.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.interceptFlag = -1;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = C1B7Z.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnumC19365210pW.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
    }

    private int getReserveWifiStatus() {
        ensureSpData();
        int iOptInt = 0;
        try {
            iOptInt = this.spData.optInt("pause_reserve_on_wifi", 0);
            return iOptInt;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return iOptInt;
        }
    }

    private void parseMonitorSetting() {
        ensureDBJsonData();
        this.needSDKMonitor = this.dbJsonData.optBoolean("need_sdk_monitor", false);
        this.monitorScene = this.dbJsonData.optString("monitor_scene", "");
        JSONArray jSONArrayOptJSONArray = this.dbJsonData.optJSONArray("extra_monitor_status");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        this.extraMonitorStatus = new int[jSONArrayOptJSONArray.length()];
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            this.extraMonitorStatus[i] = jSONArrayOptJSONArray.optInt(i);
        }
    }

    public boolean cacheExpierd() {
        if (isDownloaded()) {
            return C2199671B7d.LIZ(this, false);
        }
        return true;
    }

    public boolean canReStartAsyncTask() {
        return getStatus() != -3 && this.asyncHandleStatus == C1B7X.ASYNC_HANDLE_WAITING;
    }

    public boolean canSkipStatusHandler() {
        C1B7X c1b7x;
        int status = getStatus();
        return status == 7 || this.retryDelayStatus == C1B7Y.DELAY_RETRY_WAITING || status == 8 || (c1b7x = this.asyncHandleStatus) == C1B7X.ASYNC_HANDLE_WAITING || c1b7x == C1B7X.ASYNC_HANDLE_RESTART || this.byteInvalidRetryStatus == C1B7Z.BYTE_INVALID_RETRY_STATUS_RESTART;
    }

    public boolean canStartRetryDelayTask() {
        return isNeedRetryDelay() && getStatus() != -3 && this.retryDelayStatus == C1B7Y.DELAY_RETRY_WAITING;
    }

    public void changeSkipStatus() {
        C1B7X c1b7x;
        int status = getStatus();
        if (status == 7 || this.retryDelayStatus == C1B7Y.DELAY_RETRY_WAITING) {
            setRetryDelayStatus(C1B7Y.DELAY_RETRY_DOWNLOADING);
        }
        if (status == 8 || (c1b7x = this.asyncHandleStatus) == C1B7X.ASYNC_HANDLE_WAITING || c1b7x == C1B7X.ASYNC_HANDLE_RESTART) {
            setAsyncHandleStatus(C1B7X.ASYNC_HANDLE_DOWNLOADING);
        }
        if (this.byteInvalidRetryStatus == C1B7Z.BYTE_INVALID_RETRY_STATUS_RESTART) {
            setByteInvalidRetryStatus(C1B7Z.BYTE_INVALID_RETRY_STATUS_DOWNLOADING);
        }
    }

    public boolean checkMd5Valid() {
        int iLIZIZ = C2199671B7d.LIZIZ(new C2199881B7y(getSavePath(), getName(), true, true), this.md5);
        return iLIZIZ == 0 || iLIZIZ == 2;
    }

    public long getAllConnectTime() {
        ensureDBJsonData();
        if (this.allConnectTime == null) {
            this.allConnectTime = new AtomicLong(this.dbJsonData.optLong("dbjson_key_all_connect_time"));
        }
        return this.allConnectTime.get();
    }

    public String getCacheControl() {
        ensureSpData();
        String strOptString = null;
        try {
            strOptString = this.spData.optString("cache-control", null);
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strOptString;
        }
    }

    public long getCacheExpiredTime() {
        ensureSpData();
        long jOptLong = -1;
        try {
            jOptLong = this.spData.optLong("cache-control/expired_time", -1L);
            return jOptLong;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jOptLong;
        }
    }

    public long getDownloadPrepareTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_download_prepare_time");
    }

    public String getDownloadSettingString() {
        ensureDBJsonData();
        return this.dbJsonData.optString("download_setting");
    }

    public double getDownloadSpeed() {
        double curBytes = getCurBytes() / 1048576.0d;
        double realDownloadTime = getRealDownloadTime() / 1000.0d;
        if (curBytes <= 0.0d || realDownloadTime <= 0.0d) {
            return -1.0d;
        }
        return curBytes / realDownloadTime;
    }

    public long getEndOffset() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("end_offset", -1L);
    }

    public int getExecutorGroup() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("executor_group", 2);
    }

    public long getExpectFileLength() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_expect_file_length");
    }

    public int getFailedResumeCount() {
        ensureSpData();
        return this.spData.optInt("failed_resume_count", 0);
    }

    public long getFirstSpeedTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_first_speed_time");
    }

    public long getLastDownloadTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_last_start_download_time", 0L);
    }

    public long getLastFailedResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_failed_resume_time", 0L);
    }

    public String getLastModified() {
        ensureSpData();
        String strOptString = null;
        try {
            strOptString = this.spData.optString("last-modified", null);
            return strOptString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strOptString;
        }
    }

    public long getLastUninstallResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_unins_resume_time", 0L);
    }

    public int getLinkMode() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("link_mode");
    }

    public int getPausedResumeCount() {
        ensureSpData();
        return this.spData.optInt("paused_resume_count", 0);
    }

    public int getPreconnectLevel() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("dbjson_key_preconnect_level", 0);
    }

    public String getRedirectPartialUrlResults() {
        ensureDBJsonData();
        return this.dbJsonData.optString("redirect_partial_url_results");
    }

    public int getRetryScheduleCount() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("retry_schedule_count", 0);
    }

    public long getStartOffset() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("start_offset");
    }

    public int getTTMd5CheckStatus() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("ttmd5_check_status", -1);
    }

    public String getTaskKey() {
        ensureDBJsonData();
        return this.dbJsonData.optString("task_key");
    }

    public ConcurrentHashMap<String, Object> getTempCacheData() {
        ensureTempCacheData();
        return this.tempCacheData;
    }

    public int getUninstallResumeCount() {
        ensureSpData();
        return this.spData.optInt("unins_resume_count", 0);
    }

    public boolean hasPauseReservedOnWifi() {
        return (getReserveWifiStatus() & 1) > 0;
    }

    public boolean isAutoInstall() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("auto_install", 1) == 1;
    }

    public boolean isCanResumeFromBreakPointStatus() {
        int status = getStatus();
        return status == 4 || status == 3 || status == -1 || status == 5 || status == 8 || ((status == 1 || status == 2) && getCurBytes() > 0);
    }

    public boolean isDownloadOverStatus() {
        int status = getStatus();
        return (status >= 0 || status == -2 || status == -5) ? false : true;
    }

    public boolean isDownloadWithWifiValid() {
        return !isOnlyWifi() || C2199671B7d.LJJI(((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext());
    }

    public boolean isDownloaded() {
        return C2199671B7d.LJIJ(this, isForce(), getMd5());
    }

    public boolean isDownloadingStatus() {
        return C207234167k.LIZ(getStatus());
    }

    public boolean isFileDataExists() {
        if (isEntityInvalid()) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(getTempPath(), getTempName());
        return c0vsj.exists() && !c0vsj.isDirectory();
    }

    public boolean isFileDataValid() {
        if (isEntityInvalid()) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(getTempPath(), getTempName());
        boolean zExists = c0vsj.exists();
        boolean zIsDirectory = c0vsj.isDirectory();
        if (zExists && !zIsDirectory) {
            long length = c0vsj.length();
            long curBytes = getCurBytes();
            if (C2199751B7l.LJFF.LJI("fix_file_data_valid", false)) {
                if (curBytes > 0) {
                    long j = this.totalBytes;
                    if (j > 0 && this.chunkCount > 0 && length >= curBytes && length <= j) {
                        return true;
                    }
                }
                if (C1490830otl.LIZ()) {
                    int i = this.id;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cur = ");
                    sbLIZ.append(curBytes);
                    sbLIZ.append(",totalBytes =");
                    sbLIZ.append(this.totalBytes);
                    sbLIZ.append(",fileLength=");
                    sbLIZ.append(length);
                    C1490830otl.LIZLLL(i, "DownloadInfo", "isFileDataValid", C2188811AlT.LIZIZ(sbLIZ));
                }
                return false;
            }
            if (length > 0 && curBytes > 0) {
                long j2 = this.totalBytes;
                if (j2 > 0 && this.chunkCount > 0 && length >= curBytes && length <= j2 && curBytes < j2) {
                    return true;
                }
            }
            if (C1490830otl.LIZ()) {
                int i2 = this.id;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Cur = ");
                sbLIZ2.append(curBytes);
                sbLIZ2.append(",totalBytes =");
                sbLIZ2.append(this.totalBytes);
                sbLIZ2.append(",fileLength=");
                sbLIZ2.append(length);
                C1490830otl.LIZLLL(i2, "DownloadInfo", "isFileDataValid", C2188811AlT.LIZIZ(sbLIZ2));
                return false;
            }
        }
        return false;
    }

    public boolean isNewTask() {
        return getStatus() == 0;
    }

    public boolean isPauseReserveOnWifi() {
        return (getReserveWifiStatus() & 2) > 0;
    }

    public boolean isRwConcurrent() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("rw_concurrent", 0) == 1;
    }

    public boolean isSavePathRedirected() {
        ensureDBJsonData();
        return this.dbJsonData.optBoolean("is_save_path_redirected", false);
    }

    public void startPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put("pause_reserve_on_wifi", 3);
            updateSpData();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public boolean statusInPause() {
        return getRealStatus() == -2 || getRealStatus() == -5;
    }

    public void stopPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put("pause_reserve_on_wifi", 1);
            updateSpData();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadInfo{id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name='");
        sbLIZ.append(this.name);
        sbLIZ.append('\'');
        sbLIZ.append(", title='");
        sbLIZ.append(this.title);
        sbLIZ.append('\'');
        sbLIZ.append(", url='");
        sbLIZ.append(this.url);
        sbLIZ.append('\'');
        sbLIZ.append(", savePath='");
        sbLIZ.append(this.savePath);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public void updateStartDownloadTime() {
        this.startDownloadTime = SystemClock.uptimeMillis();
        safePutToDBJsonData("dbjson_last_start_download_time", Long.valueOf(System.currentTimeMillis()));
    }

    public List<String> getAccessHttpHeaderKeys() {
        return this.accessHttpHeaderKeys;
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public C1B7X getAsyncHandleStatus() {
        return this.asyncHandleStatus;
    }

    public int getBackUpUrlRetryCount() {
        return this.backUpUrlRetryCount;
    }

    public List<String> getBackUpUrls() {
        return this.backUpUrls;
    }

    public int getBindValueCount() {
        return this.bindValueCount;
    }

    public C1B7Z getByteInvalidRetryStatus() {
        return this.byteInvalidRetryStatus;
    }

    public int getChunkCount() {
        return this.chunkCount;
    }

    public int getCurBackUpUrlIndex() {
        return this.curBackUpUrlIndex;
    }

    public int getCurNetworkRetryCount() {
        return this.curNetworkRetryCount;
    }

    public int getCurRetryTime() {
        return this.curRetryTime;
    }

    public long getDownloadFinishTimeStamp() {
        return this.downloadFinishTimeStamp;
    }

    public long getDownloadStartTimeStamp() {
        return this.downloadStartTimeStamp;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public EnumC19365210pW getEnqueueType() {
        return this.enqueueType;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<HttpHeader> getExtraHeaders() {
        return this.extraHeaders;
    }

    public int[] getExtraMonitorStatus() {
        return this.extraMonitorStatus;
    }

    public BaseException getFailedException() {
        return this.failedException;
    }

    public String getFilePackageName() {
        return this.filePackageName;
    }

    public List<String> getForbiddenBackupUrls() {
        return this.forbiddenBackupUrls;
    }

    public String getHeadConnectionException() {
        return this.headConnectionException;
    }

    public Map<String, String> getHttpHeaders() {
        return this.httpHeaders;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String getHttpStatusMessage() {
        return this.httpStatusMessage;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public long getInstalledTimeStamp() {
        return this.installedTimeStamp;
    }

    public int getInterceptFlag() {
        return this.interceptFlag;
    }

    public boolean getIsFirstDownload() {
        return this.isFirstDownload;
    }

    public int getMaxBytes() {
        return this.maxBytes;
    }

    public int getMaxProgressCount() {
        return this.maxProgressCount;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getMonitorScene() {
        return this.monitorScene;
    }

    public String getName() {
        return this.name;
    }

    public String getNetworkQuality() {
        return this.networkQuality;
    }

    public int getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public boolean getOpenLimitSpeed() {
        return this.openLimitSpeed;
    }

    public String[] getOutIp() {
        return this.outIp;
    }

    public int[] getOutSize() {
        return this.outSize;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getRawId() {
        return this.id;
    }

    public long getRawRealDownloadTime() {
        return this.realDownloadTime;
    }

    public String getRawTempPath() {
        return this.tempPath;
    }

    public String getRawTitle() {
        return this.title;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public C1B7Y getRetryDelayStatus() {
        return this.retryDelayStatus;
    }

    public String getRetryDelayTimeArray() {
        return this.retryDelayTimeArray;
    }

    public String getSavePath() {
        return this.savePath;
    }

    public int getStatusAtDbInit() {
        return this.statusAtDbInit;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public long getThrottleNetSpeed() {
        return this.throttleNetSpeed;
    }

    public int getThrottleSmoothness() {
        return this.throttleSmoothness;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTtnetProtectTimeout() {
        return this.ttnetProtectTimeout;
    }

    public String getUrl() {
        return this.url;
    }

    public long getXTotalBytes() {
        return this.xTotalBytes;
    }

    public String geteTag() {
        return this.eTag;
    }

    public boolean isAddListenerToSameTask() {
        return this.addListenerToSameTask;
    }

    public boolean isAddTTNetCommonParam() {
        return this.addTTNetCommonParam;
    }

    public boolean isAutoResumed() {
        return this.autoResumed;
    }

    public boolean isBackUpUrlUsed() {
        return this.backUpUrlUsed;
    }

    public boolean isCacheExistsInDownloading() {
        return this.isCacheExistsInDownloading;
    }

    public boolean isDeleteCacheIfCheckFailed() {
        return this.deleteCacheIfCheckFailed;
    }

    public boolean isDownloadFromReserveWifi() {
        return this.mDownloadFromReserveWifi;
    }

    public boolean isExpiredHttpCheck() {
        return this.expiredHttpCheck;
    }

    public boolean isFirstSuccess() {
        return this.isFirstSuccess;
    }

    public boolean isForbiddenRetryed() {
        return this.isForbiddenRetryed;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean isForceIgnoreRecommendSize() {
        return this.forceIgnoreRecommendSize;
    }

    public boolean isHasDoInstallation() {
        return this.hasDoInstallation;
    }

    public boolean isHeadConnectionAvailable() {
        return this.headConnectionAvailable;
    }

    public boolean isHttpsToHttpRetryUsed() {
        return this.httpsToHttpRetryUsed;
    }

    public boolean isIgnoreDataVerify() {
        return this.ignoreDataVerify;
    }

    public boolean isNeedDefaultHttpServiceBackUp() {
        return this.needDefaultHttpServiceBackUp;
    }

    public boolean isNeedHttpsToHttpRetry() {
        return this.needHttpsToHttpRetry;
    }

    public boolean isNeedIndependentProcess() {
        return this.needIndependentProcess;
    }

    public boolean isNeedPostProgress() {
        return this.needPostProgress;
    }

    public boolean isNeedReuseFirstConnection() {
        return this.needReuseFirstConnection;
    }

    public boolean isNeedSDKMonitor() {
        return this.needSDKMonitor;
    }

    public boolean isOnlyWifi() {
        return this.onlyWifi;
    }

    public boolean isSaveTempFile() {
        return this.isSaveTempFile;
    }

    public boolean isShowNotification() {
        return this.showNotification;
    }

    public boolean isShowNotificationForAutoResumed() {
        return this.showNotificationForAutoResumed;
    }

    public boolean isShowNotificationForNetworkResumed() {
        return this.showNotificationForNetworkResumed;
    }

    public boolean isSuccessByCache() {
        return this.successByCache;
    }

    public boolean isSupportPartial() {
        return this.supportPartial;
    }

    public DownloadInfo(C2199771B7n c2199771B7n) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = C1B7Y.DELAY_RETRY_NONE;
        this.asyncHandleStatus = C1B7X.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.interceptFlag = -1;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = C1B7Z.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnumC19365210pW.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        if (c2199771B7n == null) {
            return;
        }
        this.name = c2199771B7n.LIZ;
        this.title = c2199771B7n.LIZIZ;
        this.url = c2199771B7n.LIZJ;
        String strLIZ = c2199771B7n.LIZLLL;
        if (TextUtils.isEmpty(strLIZ)) {
            try {
                strLIZ = C1294200jmc.LIZ(Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext()).getGlobalSaveDir());
            } catch (Throwable th) {
            }
        }
        this.savePath = strLIZ;
        this.tempPath = c2199771B7n.LJ;
        safePutToDBJsonData("task_key", c2199771B7n.LJJJLL);
        if (TextUtils.isEmpty(this.tempPath) && !C1294200jmc.LIZIZ(strLIZ)) {
            this.tempPath = C1294200jmc.LIZ(Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext()).getGlobalSaveTempDir());
        }
        if (c2199771B7n.LJJJLIIL && ((IDownloadProcessDispatcherService) C1B82.LIZ(IDownloadProcessDispatcherService.class)).getDownloadInfo(getId()) == null) {
            this.savePath = C2199671B7d.LJII(this.savePath, this.url);
            this.tempPath = C2199671B7d.LJII(this.tempPath, this.url);
        }
        this.status = new AtomicInteger(0);
        this.curBytes = new AtomicLong(0L);
        this.extra = c2199771B7n.LJI;
        this.onlyWifi = c2199771B7n.LJFF;
        this.extraHeaders = c2199771B7n.LJII;
        this.maxBytes = c2199771B7n.LJIIIIZZ;
        this.retryCount = c2199771B7n.LJIIJJI;
        this.backUpUrlRetryCount = c2199771B7n.LJIIL;
        this.force = c2199771B7n.LJIILIIL;
        this.outIp = c2199771B7n.LJIIIZ;
        this.outSize = c2199771B7n.LJIIJ;
        this.needPostProgress = c2199771B7n.LJIILJJIL;
        this.maxProgressCount = c2199771B7n.LJIILL;
        this.minProgressTimeMsInterval = c2199771B7n.LJIILLIIL;
        this.backUpUrls = c2199771B7n.LJIIZILJ;
        this.showNotification = c2199771B7n.LJIJ;
        this.mimeType = c2199771B7n.LJIJJ;
        this.needHttpsToHttpRetry = c2199771B7n.LJIJJLI;
        this.needRetryDelay = c2199771B7n.LJJIIJ;
        this.retryDelayTimeArray = c2199771B7n.LJJIIJZLJL;
        this.autoResumed = c2199771B7n.LJIL;
        this.showNotificationForAutoResumed = c2199771B7n.LJJ;
        this.needDefaultHttpServiceBackUp = c2199771B7n.LJJI;
        this.packageName = c2199771B7n.LJJIFFI;
        this.md5 = c2199771B7n.LJJII;
        this.needReuseFirstConnection = c2199771B7n.LJJIIZ;
        this.needIndependentProcess = c2199771B7n.LJJIIZI;
        this.enqueueType = c2199771B7n.LJJIJ;
        this.headConnectionAvailable = c2199771B7n.LJJIJIIJI;
        this.ignoreDataVerify = c2199771B7n.LJJIJIIJIL;
        this.addListenerToSameTask = c2199771B7n.LJJJIL;
        this.iconUrl = c2199771B7n.LJJIJIL;
        this.throttleNetSpeed = c2199771B7n.LJJIZ;
        this.throttleSmoothness = c2199771B7n.LJJJ;
        this.openLimitSpeed = c2199771B7n.LJJJI;
        getId();
        JSONObject jSONObject = c2199771B7n.LJJJJ;
        if (jSONObject != null) {
            int id = getId();
            if (jSONObject != C2199751B7l.LIZIZ() && !C2199751B7l.LJIIIZ) {
                C1498850p6h<Integer, C2199751B7l> c1498850p6h = C2199751B7l.LJ;
                synchronized (c1498850p6h) {
                    try {
                        C2199751B7l c2199751B7l = C2199751B7l.LJIIJ;
                        if (c2199751B7l != null && c2199751B7l.LIZ == jSONObject) {
                            c2199751B7l.LIZLLL = id;
                        } else {
                            Iterator<C2199751B7l> it2 = c1498850p6h.values().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    c2199751B7l = it2.next();
                                    if (c2199751B7l.LIZ == jSONObject) {
                                        c2199751B7l.LIZLLL = id;
                                        break;
                                    }
                                } else {
                                    c2199751B7l = new C2199751B7l(jSONObject);
                                    c2199751B7l.LIZLLL = id;
                                    break;
                                }
                            }
                            C2199751B7l.LJIIJ = c2199751B7l;
                        }
                        C2199751B7l.LJ.put(Integer.valueOf(id), c2199751B7l);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            safePutToDBJsonData("download_setting", C786410Ut5.J3(jSONObject));
        }
        safePutToDBJsonData("dbjson_key_expect_file_length", Long.valueOf(c2199771B7n.LJJIII));
        safePutToDBJsonData("executor_group", Integer.valueOf(c2199771B7n.LJJJJJL));
        safePutToDBJsonData("auto_install", Integer.valueOf(c2199771B7n.LJIJI ? 1 : 0));
        this.needSDKMonitor = c2199771B7n.LJJJJI;
        this.monitorScene = c2199771B7n.LJJJJIZL;
        this.extraMonitorStatus = c2199771B7n.LJJJJJ;
        boolean z = c2199771B7n.LJJJJL;
        this.expiredRedownload = z;
        this.expiredHttpCheck = c2199771B7n.LJJJJLI;
        this.deleteCacheIfCheckFailed = c2199771B7n.LJJJJLL;
        this.ttnetProtectTimeout = c2199771B7n.LJJJJZ;
        this.addTTNetCommonParam = c2199771B7n.LJJJJZI;
        if (z && this.retryCount <= 0) {
            this.retryCount = 1;
        }
        Boolean boolValueOf = Boolean.valueOf(c2199771B7n.LJJJLZIJ);
        this.ignoreInterceptor = boolValueOf;
        if (boolValueOf.booleanValue() || ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getDownloadInterceptor() == null) {
            this.interceptFlag = 0;
        }
        this.accessHttpHeaderKeys = c2199771B7n.LJJJZ;
        safePutToDBJsonData("ignore_intercept", Integer.valueOf(c2199771B7n.LJJJLZIJ ? 1 : 0));
        safePutToDBJsonData("start_offset", Long.valueOf(c2199771B7n.LJJIJLIJ));
        safePutToDBJsonData("end_offset", Long.valueOf(c2199771B7n.LJJIL));
        putMonitorSetting();
    }

    private void convertEnqueueType(int i) {
        EnumC19365210pW enumC19365210pW = EnumC19365210pW.ENQUEUE_HEAD;
        if (i == enumC19365210pW.ordinal()) {
            this.enqueueType = enumC19365210pW;
            return;
        }
        EnumC19365210pW enumC19365210pW2 = EnumC19365210pW.ENQUEUE_TAIL;
        if (i == enumC19365210pW2.ordinal()) {
            this.enqueueType = enumC19365210pW2;
        } else {
            this.enqueueType = EnumC19365210pW.ENQUEUE_NONE;
        }
    }

    private void convertRetryDelayStatus(int i) {
        C1B7Y c1b7y = C1B7Y.DELAY_RETRY_WAITING;
        if (i == c1b7y.ordinal()) {
            this.retryDelayStatus = c1b7y;
            return;
        }
        C1B7Y c1b7y2 = C1B7Y.DELAY_RETRY_DOWNLOADING;
        if (i == c1b7y2.ordinal()) {
            this.retryDelayStatus = c1b7y2;
            return;
        }
        C1B7Y c1b7y3 = C1B7Y.DELAY_RETRY_DOWNLOADED;
        if (i == c1b7y3.ordinal()) {
            this.retryDelayStatus = c1b7y3;
        } else {
            this.retryDelayStatus = C1B7Y.DELAY_RETRY_NONE;
        }
    }

    private JSONObject convertStrToJson(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    private void mergeAuxiliaryJSONObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                try {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object objOpt = jSONObject.opt(next);
                        if (!this.dbJsonData.has(next) && objOpt != null) {
                            this.dbJsonData.put(next, objOpt);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.dbJsonDataString = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        parseMonitorSetting();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    private void refreshBackupUrls(boolean z) {
        List<String> list = this.forbiddenBackupUrls;
        if (list != null && list.size() > z) {
            List<String> list2 = this.backUpUrls;
            if (list2 == null) {
                this.backUpUrls = new ArrayList();
            } else {
                list2.clear();
            }
            this.backUpUrlUsed = false;
            this.curBackUpUrlIndex = 0;
            for (?? r3 = z; r3 < this.forbiddenBackupUrls.size(); r3++) {
                this.backUpUrls.add((String) ListProtector.get(this.forbiddenBackupUrls, r3));
            }
        }
    }

    private void setBackUpUrlsStr(String str) {
        if (!TextUtils.isEmpty(str) && getStatus() != -3) {
            this.backUpUrlsStr = str;
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String strOptString = jSONArray.optString(i);
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList.add(strOptString);
                        }
                    }
                    this.backUpUrls = arrayList;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void bindValue(SQLiteStatement sQLiteStatement) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        if (sQLiteStatement == null) {
            return;
        }
        this.bindValueCount = 0;
        sQLiteStatement.clearBindings();
        int i = this.bindValueCount + 1;
        this.bindValueCount = i;
        sQLiteStatement.bindLong(i, this.id);
        int i2 = this.bindValueCount + 1;
        this.bindValueCount = i2;
        String str = this.url;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sQLiteStatement.bindString(i2, str);
        int i3 = this.bindValueCount + 1;
        this.bindValueCount = i3;
        String str3 = this.savePath;
        if (str3 == null) {
            str3 = "";
        }
        sQLiteStatement.bindString(i3, str3);
        int i4 = this.bindValueCount + 1;
        this.bindValueCount = i4;
        String str4 = this.tempPath;
        if (str4 == null) {
            str4 = "";
        }
        sQLiteStatement.bindString(i4, str4);
        int i5 = this.bindValueCount + 1;
        this.bindValueCount = i5;
        String str5 = this.name;
        if (str5 == null) {
            str5 = "";
        }
        sQLiteStatement.bindString(i5, str5);
        int i6 = this.bindValueCount + 1;
        this.bindValueCount = i6;
        sQLiteStatement.bindLong(i6, this.chunkCount);
        int i7 = this.bindValueCount + 1;
        this.bindValueCount = i7;
        sQLiteStatement.bindLong(i7, getStatus());
        int i8 = this.bindValueCount + 1;
        this.bindValueCount = i8;
        sQLiteStatement.bindLong(i8, getCurBytes());
        int i9 = this.bindValueCount + 1;
        this.bindValueCount = i9;
        sQLiteStatement.bindLong(i9, this.totalBytes);
        int i10 = this.bindValueCount + 1;
        this.bindValueCount = i10;
        String str6 = this.eTag;
        if (str6 == null) {
            str6 = "";
        }
        sQLiteStatement.bindString(i10, str6);
        int i11 = this.bindValueCount + 1;
        this.bindValueCount = i11;
        long j10 = 1;
        if (this.onlyWifi) {
            j = 1;
        } else {
            j = 0;
        }
        sQLiteStatement.bindLong(i11, j);
        int i12 = this.bindValueCount + 1;
        this.bindValueCount = i12;
        if (this.force) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        sQLiteStatement.bindLong(i12, j2);
        int i13 = this.bindValueCount + 1;
        this.bindValueCount = i13;
        sQLiteStatement.bindLong(i13, this.retryCount);
        int i14 = this.bindValueCount + 1;
        this.bindValueCount = i14;
        String str7 = this.extra;
        if (str7 == null) {
            str7 = "";
        }
        sQLiteStatement.bindString(i14, str7);
        int i15 = this.bindValueCount + 1;
        this.bindValueCount = i15;
        String str8 = this.mimeType;
        if (str8 == null) {
            str8 = "";
        }
        sQLiteStatement.bindString(i15, str8);
        int i16 = this.bindValueCount + 1;
        this.bindValueCount = i16;
        String str9 = this.title;
        if (str9 == null) {
            str9 = "";
        }
        sQLiteStatement.bindString(i16, str9);
        int i17 = this.bindValueCount + 1;
        this.bindValueCount = i17;
        if (this.showNotification) {
            j3 = 1;
        } else {
            j3 = 0;
        }
        sQLiteStatement.bindLong(i17, j3);
        int i18 = this.bindValueCount + 1;
        this.bindValueCount = i18;
        sQLiteStatement.bindLong(i18, this.notificationVisibility);
        int i19 = this.bindValueCount + 1;
        this.bindValueCount = i19;
        if (this.isFirstDownload) {
            j4 = 1;
        } else {
            j4 = 0;
        }
        sQLiteStatement.bindLong(i19, j4);
        int i20 = this.bindValueCount + 1;
        this.bindValueCount = i20;
        if (this.isFirstSuccess) {
            j5 = 1;
        } else {
            j5 = 0;
        }
        sQLiteStatement.bindLong(i20, j5);
        int i21 = this.bindValueCount + 1;
        this.bindValueCount = i21;
        if (this.needHttpsToHttpRetry) {
            j6 = 1;
        } else {
            j6 = 0;
        }
        sQLiteStatement.bindLong(i21, j6);
        int i22 = this.bindValueCount + 1;
        this.bindValueCount = i22;
        sQLiteStatement.bindLong(i22, this.downloadTime);
        int i23 = this.bindValueCount + 1;
        this.bindValueCount = i23;
        String str10 = this.packageName;
        if (str10 == null) {
            str10 = "";
        }
        sQLiteStatement.bindString(i23, str10);
        int i24 = this.bindValueCount + 1;
        this.bindValueCount = i24;
        String str11 = this.md5;
        if (str11 == null) {
            str11 = "";
        }
        sQLiteStatement.bindString(i24, str11);
        int i25 = this.bindValueCount + 1;
        this.bindValueCount = i25;
        if (this.needRetryDelay) {
            j7 = 1;
        } else {
            j7 = 0;
        }
        sQLiteStatement.bindLong(i25, j7);
        int i26 = this.bindValueCount + 1;
        this.bindValueCount = i26;
        sQLiteStatement.bindLong(i26, this.curRetryTime);
        int i27 = this.bindValueCount + 1;
        this.bindValueCount = i27;
        sQLiteStatement.bindLong(i27, this.retryDelayStatus.ordinal());
        int i28 = this.bindValueCount + 1;
        this.bindValueCount = i28;
        if (this.needDefaultHttpServiceBackUp) {
            j8 = 1;
        } else {
            j8 = 0;
        }
        sQLiteStatement.bindLong(i28, j8);
        int i29 = this.bindValueCount + 1;
        this.bindValueCount = i29;
        sQLiteStatement.bindLong(i29, 0L);
        int i30 = this.bindValueCount + 1;
        this.bindValueCount = i30;
        String str12 = this.retryDelayTimeArray;
        if (str12 == null) {
            str12 = "";
        }
        sQLiteStatement.bindString(i30, str12);
        int i31 = this.bindValueCount + 1;
        this.bindValueCount = i31;
        sQLiteStatement.bindLong(i31, 0L);
        int i32 = this.bindValueCount + 1;
        this.bindValueCount = i32;
        sQLiteStatement.bindString(i32, getBackUpUrlsStr());
        int i33 = this.bindValueCount + 1;
        this.bindValueCount = i33;
        sQLiteStatement.bindLong(i33, this.backUpUrlRetryCount);
        int i34 = this.bindValueCount + 1;
        this.bindValueCount = i34;
        sQLiteStatement.bindLong(i34, this.realDownloadTime);
        int i35 = this.bindValueCount + 1;
        this.bindValueCount = i35;
        sQLiteStatement.bindLong(i35, this.retryScheduleMinutes);
        int i36 = this.bindValueCount + 1;
        this.bindValueCount = i36;
        if (this.needIndependentProcess) {
            j9 = 1;
        } else {
            j9 = 0;
        }
        sQLiteStatement.bindLong(i36, j9);
        int i37 = this.bindValueCount + 1;
        this.bindValueCount = i37;
        sQLiteStatement.bindString(i37, getDBJsonDataString());
        int i38 = this.bindValueCount + 1;
        this.bindValueCount = i38;
        String str13 = this.iconUrl;
        if (str13 == null) {
            str13 = "";
        }
        sQLiteStatement.bindString(i38, str13);
        int i39 = this.bindValueCount + 1;
        this.bindValueCount = i39;
        sQLiteStatement.bindLong(i39, this.appVersionCode);
        int i40 = this.bindValueCount + 1;
        this.bindValueCount = i40;
        String str14 = this.taskId;
        if (str14 != null) {
            str2 = str14;
        }
        sQLiteStatement.bindString(i40, str2);
        int i41 = this.bindValueCount + 1;
        this.bindValueCount = i41;
        sQLiteStatement.bindLong(i41, this.downloadStartTimeStamp);
        int i42 = this.bindValueCount + 1;
        this.bindValueCount = i42;
        sQLiteStatement.bindLong(i42, this.downloadFinishTimeStamp);
        int i43 = this.bindValueCount + 1;
        this.bindValueCount = i43;
        sQLiteStatement.bindLong(i43, this.installedTimeStamp);
        int i44 = this.bindValueCount + 1;
        this.bindValueCount = i44;
        if (!this.hasDoInstallation) {
            j10 = 0;
        }
        sQLiteStatement.bindLong(i44, j10);
    }

    public boolean equalsTask(DownloadInfo downloadInfo) {
        String str;
        String str2;
        if (downloadInfo == null || (str = this.url) == null || !str.equals(downloadInfo.getUrl()) || (str2 = this.savePath) == null || !str2.equals(downloadInfo.getSavePath())) {
            return false;
        }
        return true;
    }

    public int getAntiHijackErrorCode(int i) {
        ensureDBJsonData();
        return this.dbJsonData.optInt("anti_hijack_error_code", i);
    }

    public int getDBJsonInt(String str) {
        ensureDBJsonData();
        return this.dbJsonData.optInt(str);
    }

    public String getDBJsonString(String str) {
        ensureDBJsonData();
        return this.dbJsonData.optString(str);
    }

    public long getMinByteIntervalForPostToMainThread(long j) {
        int i = this.maxProgressCount;
        if (i <= 0) {
            i = 100;
        }
        long j2 = j / ((long) (i + 1));
        if (j2 <= 0) {
            return 1048576L;
        }
        return j2;
    }

    public int getSpIntVal(String str) {
        ensureSpData();
        return this.spData.optInt(str, 0);
    }

    public long getSpLongVal(String str) {
        ensureSpData();
        return this.spData.optLong(str, 0L);
    }

    public String getSpStringVal(String str) {
        ensureSpData();
        return this.spData.optString(str, null);
    }

    public void increaseAllConnectTime(long j) {
        if (j > 0) {
            getAllConnectTime();
            safePutToDBJsonData("dbjson_key_all_connect_time", Long.valueOf(this.allConnectTime.addAndGet(j)));
        }
    }

    public void increaseCurBytes(long j) {
        this.curBytes.addAndGet(j);
    }

    public void increaseDownloadPrepareTime(long j) {
        if (j > 0) {
            safePutToDBJsonData("dbjson_key_download_prepare_time", Long.valueOf(getDownloadPrepareTime() + j));
        }
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.title = parcel.readString();
        this.url = parcel.readString();
        this.savePath = parcel.readString();
        this.tempPath = parcel.readString();
        boolean z26 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.onlyWifi = z;
        this.extra = parcel.readString();
        this.extraHeaders = parcel.createTypedArrayList(HttpHeader.CREATOR);
        this.maxBytes = parcel.readInt();
        this.outIp = parcel.createStringArray();
        this.outSize = parcel.createIntArray();
        this.retryCount = parcel.readInt();
        this.backUpUrlRetryCount = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.force = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.needPostProgress = z3;
        this.maxProgressCount = parcel.readInt();
        this.minProgressTimeMsInterval = parcel.readInt();
        this.backUpUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.showNotification = z4;
        this.mimeType = parcel.readString();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.needHttpsToHttpRetry = z5;
        this.packageName = parcel.readString();
        this.md5 = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.needRetryDelay = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.needDefaultHttpServiceBackUp = z7;
        this.retryDelayTimeArray = parcel.readString();
        this.eTag = parcel.readString();
        this.curRetryTime = parcel.readInt();
        convertRetryDelayStatus(parcel.readInt());
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.needReuseFirstConnection = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.forceIgnoreRecommendSize = z9;
        this.networkQuality = parcel.readString();
        this.curBackUpUrlIndex = parcel.readInt();
        this.notificationVisibility = parcel.readInt();
        this.chunkCount = parcel.readInt();
        setCurBytes(parcel.readLong());
        this.totalBytes = parcel.readLong();
        setStatus(parcel.readInt());
        this.downloadTime = parcel.readLong();
        this.realDownloadTime = parcel.readLong();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.backUpUrlUsed = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.httpsToHttpRetryUsed = z11;
        try {
            StringBuffer stringBuffer = this.errorBytesLog;
            if (stringBuffer == null) {
                this.errorBytesLog = new StringBuffer(parcel.readString());
            } else {
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer.append(parcel.readString());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.autoResumed = z12;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.showNotificationForAutoResumed = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.showNotificationForNetworkResumed = z14;
        this.forbiddenBackupUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.needIndependentProcess = z15;
        convertEnqueueType(parcel.readInt());
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.headConnectionAvailable = z16;
        this.httpStatusCode = parcel.readInt();
        this.httpStatusMessage = parcel.readString();
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.isSaveTempFile = z17;
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.isForbiddenRetryed = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.addListenerToSameTask = z19;
        this.failedException = (BaseException) parcel.readParcelable(BaseException.class.getClassLoader());
        this.retryScheduleMinutes = parcel.readInt();
        this.dbJsonDataString = parcel.readString();
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.supportPartial = z20;
        this.iconUrl = parcel.readString();
        this.appVersionCode = parcel.readInt();
        this.taskId = parcel.readString();
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.expiredRedownload = z21;
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.deleteCacheIfCheckFailed = z22;
        if (parcel.readByte() != 0) {
            z23 = true;
        } else {
            z23 = false;
        }
        this.successByCache = z23;
        if (parcel.readByte() != 0) {
            z24 = true;
        } else {
            z24 = false;
        }
        this.expiredHttpCheck = z24;
        this.xTotalBytes = parcel.readLong();
        this.interceptFlag = parcel.readInt();
        this.accessHttpHeaderKeys = parcel.createStringArrayList();
        this.httpHeaders = parcel.readHashMap(getClass().getClassLoader());
        this.downloadStartTimeStamp = parcel.readLong();
        this.downloadFinishTimeStamp = parcel.readLong();
        this.installedTimeStamp = parcel.readLong();
        if (parcel.readByte() != 0) {
            z25 = true;
        } else {
            z25 = false;
        }
        this.hasDoInstallation = z25;
        if (parcel.readByte() == 0) {
            z26 = false;
        }
        this.isCacheExistsInDownloading = z26;
        parseMonitorSetting();
    }

    public void resetDataForEtagEndure(String str) {
        setCurBytes(0L, true);
        setTotalBytes(0L);
        seteTag(str);
        setChunkCount(1);
        setLastModified(null);
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
    }

    public void setAddListenerToSameTask(boolean z) {
        this.addListenerToSameTask = z;
    }

    public void setAntiHijackErrorCode(int i) {
        safePutToDBJsonData("anti_hijack_error_code", Integer.valueOf(i));
    }

    public void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public void setAsyncHandleStatus(C1B7X c1b7x) {
        this.asyncHandleStatus = c1b7x;
    }

    public void setAutoResumed(boolean z) {
        this.autoResumed = z;
    }

    public void setByteInvalidRetryStatus(C1B7Z c1b7z) {
        this.byteInvalidRetryStatus = c1b7z;
    }

    public void setCacheControl(String str) {
        ensureSpData();
        try {
            this.spData.put("cache-control", str);
            updateSpData();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setCacheExistsInDownloading(boolean z) {
        this.isCacheExistsInDownloading = z;
    }

    public void setCacheExpiredTime(long j) {
        ensureSpData();
        try {
            this.spData.put("cache-control/expired_time", j);
            updateSpData();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setChunkCount(int i) {
        this.chunkCount = i;
    }

    public void setCurBytes(long j) {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            atomicLong.set(j);
        } else {
            this.curBytes = new AtomicLong(j);
        }
    }

    public void setCurNetworkRetryCount(int i) {
        this.curNetworkRetryCount = i;
    }

    public void setDownloadFinishTimeStamp(long j) {
        this.downloadFinishTimeStamp = j;
    }

    public void setDownloadFromReserveWifi(boolean z) {
        this.mDownloadFromReserveWifi = z;
    }

    public void setDownloadStartTimeStamp(long j) {
        this.downloadStartTimeStamp = j;
    }

    public void setDownloadTime(long j) {
        if (j >= 0) {
            this.downloadTime = j;
        }
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFailedException(BaseException baseException) {
        this.failedException = baseException;
    }

    public void setFailedResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_count", i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setFilePackageName(String str) {
        this.filePackageName = str;
    }

    public void setFirstDownload(boolean z) {
        this.isFirstDownload = z;
    }

    public void setFirstSpeedTime(long j) {
        safePutToDBJsonData("dbjson_key_first_speed_time", Long.valueOf(j));
    }

    public void setFirstSuccess(boolean z) {
        this.isFirstSuccess = z;
    }

    public void setForceIgnoreRecommendSize(boolean z) {
        this.forceIgnoreRecommendSize = z;
    }

    public void setHasDoInstallation(boolean z) {
        this.hasDoInstallation = z;
    }

    public void setHeadConnectionException(String str) {
        this.headConnectionException = str;
    }

    public void setHttpHeaders(Map<String, String> map) {
        this.httpHeaders = map;
    }

    public void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }

    public void setHttpStatusMessage(String str) {
        this.httpStatusMessage = str;
    }

    public void setHttpsToHttpRetryUsed(boolean z) {
        this.httpsToHttpRetryUsed = z;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setInstalledTimeStamp(long j) {
        this.installedTimeStamp = j;
    }

    public void setInterceptFlag(int i) {
        this.interceptFlag = i;
    }

    public void setIsRwConcurrent(boolean z) {
        safePutToDBJsonData("rw_concurrent", Integer.valueOf(z ? 1 : 0));
    }

    public void setIsSaveTempFile(boolean z) {
        this.isSaveTempFile = z;
    }

    public void setLastFailedResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put("last_failed_resume_time", j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setLastModified(String str) {
        ensureSpData();
        try {
            this.spData.put("last-modified", str);
            updateSpData();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setLastUninstallResumeTime(long j) {
        ensureSpData();
        try {
            this.spData.put("last_unins_resume_time", j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setLinkMode(int i) {
        safePutToDBJsonData("link_mode", Integer.valueOf(i));
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNetworkQuality(String str) {
        this.networkQuality = str;
    }

    public void setNotificationVisibility(int i) {
        this.notificationVisibility = i;
    }

    public void setOnlyWifi(boolean z) {
        this.onlyWifi = z;
    }

    public void setOpenLimitSpeed(boolean z) {
        this.openLimitSpeed = z;
    }

    public void setPackageInfo(PackageInfo packageInfo) {
        this.packageInfoRef = new SoftReference<>(packageInfo);
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPausedResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("paused_resume_count", i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setPreconnectLevel(int i) {
        ensureDBJsonData();
        safePutToDBJsonData("dbjson_key_preconnect_level", Integer.valueOf(i));
    }

    public void setRedirectPartialUrlResults(String str) {
        safePutToDBJsonData("redirect_partial_url_results", str);
    }

    public void setRetryDelayStatus(C1B7Y c1b7y) {
        this.retryDelayStatus = c1b7y;
    }

    public void setRetryScheduleCount(int i) {
        safePutToDBJsonData("retry_schedule_count", Integer.valueOf(i));
    }

    public void setSavePath(String str) {
        this.savePath = str;
    }

    public void setSavePathRedirected(boolean z) {
        safePutToDBJsonData("is_save_path_redirected", Boolean.valueOf(z));
    }

    public void setShowNotification(boolean z) {
        this.showNotification = z;
    }

    public void setShowNotificationForAutoResumed(boolean z) {
        this.showNotificationForAutoResumed = z;
    }

    public void setShowNotificationForNetworkResumed(boolean z) {
        this.showNotificationForNetworkResumed = z;
    }

    public void setStatus(int i) {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            atomicInteger.set(i);
        } else {
            this.status = new AtomicInteger(i);
        }
    }

    public void setStatusAtDbInit(int i) {
        this.statusAtDbInit = i;
    }

    public void setSuccessByCache(boolean z) {
        this.successByCache = z;
    }

    public void setSupportPartial(boolean z) {
        this.supportPartial = z;
    }

    public void setTTMd5CheckStatus(int i) {
        safePutToDBJsonData("ttmd5_check_status", Integer.valueOf(i));
    }

    public void setThrottleNetSpeed(long j) {
        setThrottleNetSpeed(j, -1);
    }

    public void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public void setUninstallResumeCount(int i) {
        ensureSpData();
        try {
            this.spData.put("unins_resume_count", i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setXTotalBytes(long j) {
        this.xTotalBytes = j;
    }

    public void seteTag(String str) {
        this.eTag = str;
    }

    public void updateCurRetryTime(int i) {
        int i2;
        if (this.backUpUrlUsed) {
            i2 = this.backUpUrlRetryCount;
        } else {
            i2 = this.retryCount;
        }
        int i3 = i2 - i;
        this.curRetryTime = i3;
        if (i3 < 0) {
            this.curRetryTime = 0;
        }
    }

    public void updateRealDownloadTime(boolean z) {
        long jNanoTime = System.nanoTime();
        long j = this.realStartDownloadTime;
        if (j <= 0) {
            if (z) {
                this.realStartDownloadTime = jNanoTime;
                return;
            }
            return;
        }
        long j2 = jNanoTime - j;
        if (z) {
            this.realStartDownloadTime = jNanoTime;
        } else {
            this.realStartDownloadTime = 0L;
        }
        if (j2 > 0) {
            this.realDownloadTime += j2;
        }
    }

    public DownloadInfo(C1B83 c1b83) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = C1B7Y.DELAY_RETRY_NONE;
        this.asyncHandleStatus = C1B7X.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.interceptFlag = -1;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = C1B7Z.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnumC19365210pW.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        this.id = c1b83.LJJL;
        this.name = c1b83.LIZ;
        this.title = c1b83.LIZIZ;
        this.url = c1b83.LIZJ;
        this.savePath = c1b83.LIZLLL;
        this.tempPath = c1b83.LJ;
        this.chunkCount = c1b83.LJJLI;
        setStatus(c1b83.LJJLIIIIJ);
        setCurBytes(c1b83.LJJLIIIJ);
        this.totalBytes = c1b83.LJJLIIIJILLIZJL;
        this.eTag = c1b83.LJJZ;
        this.onlyWifi = c1b83.LJFF;
        this.force = c1b83.LJIILIIL;
        this.retryCount = c1b83.LJIIJJI;
        this.extra = c1b83.LJI;
        this.mimeType = c1b83.LJIJJ;
        this.showNotification = c1b83.LJIJ;
        this.notificationVisibility = c1b83.LJJLIIIJJI;
        this.isFirstDownload = c1b83.LJJLIIIJJIZ;
        this.isFirstSuccess = c1b83.LJJLIIIJL;
        this.needHttpsToHttpRetry = c1b83.LJIJJLI;
        this.downloadTime = c1b83.LJJLIIIJLJLI;
        this.packageName = c1b83.LJJIFFI;
        this.md5 = c1b83.LJJII;
        this.needRetryDelay = c1b83.LJJIIJ;
        this.curRetryTime = c1b83.LJJLIIIJLLLLLLLZ;
        this.retryDelayStatus = c1b83.LJJLIIJ;
        this.needDefaultHttpServiceBackUp = c1b83.LJJI;
        this.retryDelayTimeArray = c1b83.LJJIIJZLJL;
        this.backUpUrlsStr = c1b83.LJJLIL;
        this.backUpUrlRetryCount = c1b83.LJIIL;
        this.realDownloadTime = c1b83.LJJLJ;
        this.retryScheduleMinutes = c1b83.LJJLJLI;
        this.needIndependentProcess = c1b83.LJJIIZI;
        this.dbJsonDataString = c1b83.LJJLL;
        this.iconUrl = c1b83.LJJIJIL;
        this.appVersionCode = c1b83.LJJIJL;
        this.taskId = c1b83.LJJZZI;
        this.downloadStartTimeStamp = c1b83.LJJZZIII;
        this.downloadFinishTimeStamp = c1b83.LJL;
        this.installedTimeStamp = c1b83.LJLI;
        this.hasDoInstallation = c1b83.LJLIIIL;
        try {
            parseMonitorSetting();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public DownloadInfo(Parcel parcel) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = C1B7Y.DELAY_RETRY_NONE;
        this.asyncHandleStatus = C1B7X.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.interceptFlag = -1;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = C1B7Z.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnumC19365210pW.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        readFromParcel(parcel);
    }

    public DownloadInfo(Cursor cursor) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = C1B7Y.DELAY_RETRY_NONE;
        this.asyncHandleStatus = C1B7X.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.interceptFlag = -1;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = C1B7Z.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnumC19365210pW.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
    }

    public /* synthetic */ DownloadInfo(C2199771B7n c2199771B7n, C1D13 c1d13) {
        this(c2199771B7n);
    }

    public void copyFromCacheData(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo == null) {
            return;
        }
        setChunkCount(downloadInfo.getChunkCount());
        setTotalBytes(downloadInfo.getTotalBytes());
        setCurBytes(downloadInfo.getCurBytes(), true);
        this.realDownloadTime = downloadInfo.realDownloadTime;
        if (!downloadInfo.canSkipStatusHandler() && !canSkipStatusHandler()) {
            this.curRetryTime = 0;
            this.isForbiddenRetryed = false;
            this.backUpUrlUsed = false;
            this.curBackUpUrlIndex = 0;
            this.httpsToHttpRetryUsed = false;
        } else {
            this.curRetryTime = downloadInfo.getCurRetryTime();
        }
        seteTag(downloadInfo.geteTag());
        if (z) {
            setStatus(downloadInfo.getStatus());
        }
        this.isFirstDownload = downloadInfo.getIsFirstDownload();
        this.isFirstSuccess = downloadInfo.isFirstSuccess();
        this.retryDelayStatus = downloadInfo.getRetryDelayStatus();
        this.downloadStartTimeStamp = downloadInfo.getDownloadStartTimeStamp();
        this.downloadFinishTimeStamp = downloadInfo.getDownloadFinishTimeStamp();
        this.installedTimeStamp = downloadInfo.getInstalledTimeStamp();
        this.hasDoInstallation = downloadInfo.hasDoInstallation;
        this.taskId = downloadInfo.getTaskId();
        mergeAuxiliaryJSONObject(downloadInfo.dbJsonData);
    }

    public void safePutToDBJsonData(String str, Object obj) {
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                try {
                    this.dbJsonData.put(str, obj);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.dbJsonDataString = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setCurBytes(long j, boolean z) {
        if (z) {
            setCurBytes(j);
        } else {
            if (j <= getCurBytes()) {
                return;
            }
            setCurBytes(j);
        }
    }

    public void setForbiddenBackupUrls(List<String> list, boolean z) {
        this.forbiddenBackupUrls = list;
        refreshBackupUrls(z);
    }

    public void setSpValue(String str, String str2) {
        ensureSpData();
        try {
            this.spData.put(str, str2);
            updateSpData();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setThrottleNetSpeed(long j, int i) {
        this.throttleNetSpeed = j;
        this.throttleSmoothness = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String string;
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.savePath);
        parcel.writeString(this.tempPath);
        parcel.writeByte(this.onlyWifi ? (byte) 1 : (byte) 0);
        parcel.writeString(this.extra);
        parcel.writeTypedList(this.extraHeaders);
        parcel.writeInt(this.maxBytes);
        parcel.writeStringArray(this.outIp);
        parcel.writeIntArray(this.outSize);
        parcel.writeInt(this.retryCount);
        parcel.writeInt(this.backUpUrlRetryCount);
        parcel.writeByte(this.force ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needPostProgress ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.maxProgressCount);
        parcel.writeInt(this.minProgressTimeMsInterval);
        parcel.writeStringList(this.backUpUrls);
        parcel.writeByte(this.showNotification ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mimeType);
        parcel.writeByte(this.needHttpsToHttpRetry ? (byte) 1 : (byte) 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.md5);
        parcel.writeByte(this.needRetryDelay ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needDefaultHttpServiceBackUp ? (byte) 1 : (byte) 0);
        parcel.writeString(this.retryDelayTimeArray);
        parcel.writeString(this.eTag);
        parcel.writeInt(this.curRetryTime);
        parcel.writeInt(this.retryDelayStatus.ordinal());
        parcel.writeByte(this.needReuseFirstConnection ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.forceIgnoreRecommendSize ? (byte) 1 : (byte) 0);
        parcel.writeString(this.networkQuality);
        parcel.writeInt(this.curBackUpUrlIndex);
        parcel.writeInt(this.notificationVisibility);
        parcel.writeInt(this.chunkCount);
        parcel.writeLong(getCurBytes());
        parcel.writeLong(this.totalBytes);
        parcel.writeInt(getRealStatus());
        parcel.writeLong(this.downloadTime);
        parcel.writeLong(this.realDownloadTime);
        parcel.writeByte(this.backUpUrlUsed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.httpsToHttpRetryUsed ? (byte) 1 : (byte) 0);
        StringBuffer stringBuffer = this.errorBytesLog;
        if (stringBuffer != null) {
            string = stringBuffer.toString();
        } else {
            string = "";
        }
        parcel.writeString(string);
        parcel.writeByte(this.autoResumed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showNotificationForAutoResumed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showNotificationForNetworkResumed ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.forbiddenBackupUrls);
        parcel.writeByte(this.needIndependentProcess ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enqueueType.ordinal());
        parcel.writeByte(this.headConnectionAvailable ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.httpStatusCode);
        parcel.writeString(this.httpStatusMessage);
        parcel.writeByte(this.isSaveTempFile ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isForbiddenRetryed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.addListenerToSameTask ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.failedException, i);
        parcel.writeInt(this.retryScheduleMinutes);
        parcel.writeString(getDBJsonDataString());
        parcel.writeByte(this.supportPartial ? (byte) 1 : (byte) 0);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.appVersionCode);
        parcel.writeString(this.taskId);
        parcel.writeByte(this.expiredRedownload ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.deleteCacheIfCheckFailed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.successByCache ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.expiredHttpCheck ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.xTotalBytes);
        parcel.writeInt(this.interceptFlag);
        parcel.writeStringList(this.accessHttpHeaderKeys);
        parcel.writeMap(this.httpHeaders);
        parcel.writeLong(this.downloadStartTimeStamp);
        parcel.writeLong(this.downloadFinishTimeStamp);
        parcel.writeLong(this.installedTimeStamp);
        parcel.writeByte(this.hasDoInstallation ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCacheExistsInDownloading ? (byte) 1 : (byte) 0);
    }

    public /* synthetic */ DownloadInfo(C1B83 c1b83, C1D13 c1d13) {
        this(c1b83);
    }

    public void addErrorBytesLog(long j, int i, String str) {
        try {
            if (C1490830otl.LIZ()) {
                if (this.errorBytesLog == null) {
                    this.errorBytesLog = new StringBuffer();
                }
                if (this.errorBytesLog.length() != 0) {
                    this.errorBytesLog.append(",");
                }
                StringBuffer stringBuffer = this.errorBytesLog;
                stringBuffer.append("[type:");
                stringBuffer.append(i);
                stringBuffer.append(",bytes:");
                stringBuffer.append(j);
                stringBuffer.append(",method:");
                stringBuffer.append(str);
                stringBuffer.append(e3.f);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
