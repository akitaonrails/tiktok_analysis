package com.bytedance.vcloud.strategy.drm;

import X.C08FF;
import X.C1C7U;
import X.C2188811AlT;
import android.media.MediaCrypto;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.drm.ILiveWidevineNetworkClient;
import com.bytedance.vcloud.strategy.drm.NetworkResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveWidevineManager {
    public boolean mDeviceCapabilityCollected;
    public final DrmDispatcher mDrmDispatcher;
    public final Object mDrmStartLock;
    public volatile boolean mDrmStarted;
    public final Object mGlobalLock;
    public volatile boolean mIsL1;
    public volatile boolean mIsWidevineSupported;
    public final Map<String, KeyContext> mKeys;
    public volatile long mLastProvisionFailedTimeMs;
    public volatile ProvisionResult mLastProvisionResult;
    public volatile ILiveWidevineNetworkClient mNetworkClient;
    public volatile NetworkDispatcher mNetworkDispatcher;
    public final Object mNetworkDispatcherLock;
    public volatile PreloadOptions mPreloadOptions;
    public final Object mProvisionLock;
    public final ProvisionMetrics mProvisionMetrics;
    public volatile ProvisionState mProvisionState;
    public final AtomicBoolean mProvisionTriggered;
    public volatile String mSecurityLevel;
    public final Map<String, StreamContext> mStreams;

    /* JADX INFO: loaded from: classes14.dex */
    public interface Callable<T> {
        T call();
    }

    public static final class CreateMediaDrmResult {
        public final Exception exception;
        public final MediaDrm mediaDrm;
        public final int widevineCode;

        public boolean isSuccess() {
            return this.mediaDrm != null && this.widevineCode == 0;
        }

        public static CreateMediaDrmResult success(MediaDrm mediaDrm) {
            return new CreateMediaDrmResult(mediaDrm, 0, null);
        }

        public static CreateMediaDrmResult failed(int i, Exception exc) {
            return new CreateMediaDrmResult(null, i, exc);
        }

        public CreateMediaDrmResult(MediaDrm mediaDrm, int i, Exception exc) {
            this.mediaDrm = mediaDrm;
            this.widevineCode = i;
            this.exception = exc;
        }
    }

    public static class Holder {
        public static final LiveWidevineManager INSTANCE = new LiveWidevineManager();
    }

    public static final class KeyContext {
        public SessionConfig config;
        public final SessionEntry sessionEntry;
        public final StreamContext streamContext;
        public final Object lock = new Object();
        public KeyState keyState = KeyState.INIT;
        public final SessionMetrics metrics = new SessionMetrics();

        public boolean isReady() {
            return this.keyState == KeyState.READY;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("KeyContext{streamName=");
            StreamContext streamContext = this.streamContext;
            sbLIZ.append(streamContext != null ? streamContext.streamName : "null");
            sbLIZ.append(", keyState=");
            sbLIZ.append(this.keyState);
            sbLIZ.append(", config=");
            sbLIZ.append(this.config);
            sbLIZ.append(", sessionEntry=");
            sbLIZ.append(this.sessionEntry);
            sbLIZ.append(", metrics=");
            SessionMetrics sessionMetrics = this.metrics;
            sbLIZ.append(sessionMetrics != null ? sessionMetrics.toMap() : "null");
            sbLIZ.append("}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public KeyContext(StreamContext streamContext, SessionConfig sessionConfig) {
            this.streamContext = streamContext;
            this.config = sessionConfig;
            this.sessionEntry = new SessionEntry(sessionConfig.streamName, sessionConfig.pssh);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ManagerDrmTask extends DrmTask {
        public final Callable<Object> action;

        @Override // com.bytedance.vcloud.strategy.drm.DrmTask
        public Object execute() {
            try {
                return this.action.call();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }

        public ManagerDrmTask(Priority priority, Callable<Object> callable) {
            super(priority, new DrmFuture());
            this.action = callable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ProvisionRequestPhase beginProvisionRequestPhase() {
        CreateMediaDrmResult createMediaDrmResultCreateMediaDrm = createMediaDrm();
        if (!createMediaDrmResultCreateMediaDrm.isSuccess()) {
            return ProvisionRequestPhase.done(ProvisionResult.failed(createMediaDrmResultCreateMediaDrm.widevineCode, false));
        }
        MediaDrm mediaDrm = createMediaDrmResultCreateMediaDrm.mediaDrm;
        try {
            try {
                MediaDrm.ProvisionRequest provisionRequest = mediaDrm.getProvisionRequest();
                String defaultUrl = provisionRequest.getDefaultUrl();
                String str = new String(provisionRequest.getData(), StandardCharsets.UTF_8);
                String str2 = defaultUrl.contains("?") ? "&" : "?";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(defaultUrl);
                sbLIZ.append(str2);
                sbLIZ.append("signedRequest=");
                sbLIZ.append(str);
                return ProvisionRequestPhase.needsNetwork(mediaDrm, C2188811AlT.LIZIZ(sbLIZ));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int iMapMediaDrmException = WidevineCode.mapMediaDrmException(e);
                if (iMapMediaDrmException == -1) {
                    iMapMediaDrmException = 1203;
                }
                destroyMediaDrm(mediaDrm);
                return ProvisionRequestPhase.done(ProvisionResult.failed(iMapMediaDrmException, false));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            destroyMediaDrm(mediaDrm);
            return ProvisionRequestPhase.done(ProvisionResult.failed(-1, false));
        }
    }

    private CreateMediaDrmResult createMediaDrm() {
        try {
            if (!this.mIsWidevineSupported) {
                return CreateMediaDrmResult.failed(LSPassThroughRecordSizeConfig.DEFAULT, null);
            }
            MediaDrm mediaDrm = new MediaDrm(PsshUtils.WIDEVINE_UUID);
            if (!this.mDeviceCapabilityCollected) {
                try {
                    this.mSecurityLevel = mediaDrm.getPropertyString("securityLevel");
                    this.mIsL1 = "L1".equalsIgnoreCase(this.mSecurityLevel);
                    if (Build.VERSION.SDK_INT >= 28) {
                        this.mProvisionMetrics.maxSessionCountInt = mediaDrm.getMaxSessionCount();
                        this.mProvisionMetrics.maxHdcpLevelInt = mediaDrm.getMaxHdcpLevel();
                    }
                    this.mProvisionMetrics.maxSessionCountString = mediaDrm.getPropertyString("maxNumberOfSessions");
                    this.mProvisionMetrics.maxHdcpLevelString = mediaDrm.getPropertyString("maxHdcpLevel");
                    this.mDeviceCapabilityCollected = true;
                } catch (RuntimeException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return CreateMediaDrmResult.success(mediaDrm);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            int iMapMediaDrmException = WidevineCode.mapMediaDrmException(e2);
            if (iMapMediaDrmException == 1000) {
                this.mIsWidevineSupported = false;
            } else if (iMapMediaDrmException == -1) {
                iMapMediaDrmException = 1200;
            }
            return CreateMediaDrmResult.failed(iMapMediaDrmException, e2);
        }
    }

    private void ensureDrmDispatcher() {
        if (this.mDrmStarted) {
            return;
        }
        synchronized (this.mDrmStartLock) {
            try {
                if (!this.mDrmStarted) {
                    this.mDrmDispatcher.start();
                    this.mDrmStarted = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private NetworkDispatcher ensureNetworkDispatcher() {
        NetworkDispatcher networkDispatcher;
        NetworkDispatcher networkDispatcher2 = this.mNetworkDispatcher;
        if (networkDispatcher2 != null) {
            return networkDispatcher2;
        }
        synchronized (this.mNetworkDispatcherLock) {
            try {
                if (this.mNetworkDispatcher == null) {
                    PreloadOptions preloadOptions = this.mPreloadOptions;
                    this.mNetworkDispatcher = new NetworkDispatcher(preloadOptions.maxConcurrentRequests, preloadOptions.maxRetryCount, preloadOptions.retryIntervalMS, preloadOptions.requestTimeoutMS);
                }
                networkDispatcher = this.mNetworkDispatcher;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return networkDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LinkedHashMap lambda$getProvisionMetrics$2() {
        return new LinkedHashMap(this.mProvisionMetrics.toMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$removeAllPreloads$8() {
        ArrayList<Map.Entry> arrayList;
        ArrayList<Map.Entry> arrayList2;
        synchronized (this.mGlobalLock) {
            try {
                arrayList = new ArrayList(this.mKeys.entrySet());
                arrayList2 = new ArrayList(this.mStreams.entrySet());
            } finally {
            }
        }
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : arrayList) {
            KeyContext keyContext = (KeyContext) entry.getValue();
            if (tryCloseKeyContext(keyContext)) {
                arrayList3.add(entry.getKey());
            } else {
                hashSet.add(keyContext.streamContext);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        synchronized (this.mGlobalLock) {
            try {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    this.mKeys.remove((String) it2.next());
                }
                for (Map.Entry entry2 : arrayList2) {
                    if (!hashSet.contains(entry2.getValue())) {
                        this.mStreams.remove(entry2.getKey());
                        arrayList4.add((StreamContext) entry2.getValue());
                    }
                }
            } finally {
            }
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            destroyMediaDrm(((StreamContext) it3.next()).mediaDrm);
        }
        return null;
    }

    public void removeAllPreloads() {
        postDrm(Priority.LOW, new Callable() { // from class: X.1Cmb
            @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
            public final Object call() {
                return this.LIZ.lambda$removeAllPreloads$8();
            }
        });
    }

    public LiveWidevineManager() {
        this.mIsWidevineSupported = true;
        this.mPreloadOptions = new PreloadOptions(false);
        this.mProvisionTriggered = new AtomicBoolean(false);
        this.mProvisionLock = new Object();
        this.mProvisionState = ProvisionState.INIT;
        this.mLastProvisionFailedTimeMs = 0L;
        this.mLastProvisionResult = null;
        this.mProvisionMetrics = new ProvisionMetrics();
        this.mGlobalLock = new Object();
        this.mStreams = new HashMap();
        this.mKeys = new HashMap();
        this.mDrmDispatcher = new DrmDispatcher();
        this.mDrmStartLock = new Object();
        this.mDrmStarted = false;
        this.mNetworkDispatcherLock = new Object();
        this.mNetworkDispatcher = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ProvisionResult needsProvisionRequest() {
        byte[] bArrOpenSession;
        CreateMediaDrmResult createMediaDrmResultCreateMediaDrm = createMediaDrm();
        if (!createMediaDrmResultCreateMediaDrm.isSuccess()) {
            return ProvisionResult.failed(createMediaDrmResultCreateMediaDrm.widevineCode, false);
        }
        MediaDrm mediaDrm = createMediaDrmResultCreateMediaDrm.mediaDrm;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                bArrOpenSession = mediaDrm.openSession();
                try {
                    ProvisionResult provisionResult = ProvisionResult.readyWithoutRequest();
                    if (bArrOpenSession != null) {
                        try {
                            mediaDrm.closeSession(bArrOpenSession);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                    destroyMediaDrm(mediaDrm);
                    return provisionResult;
                } catch (NotProvisionedException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    if (bArrOpenSession != null) {
                        try {
                            mediaDrm.closeSession(bArrOpenSession);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                    }
                    destroyMediaDrm(mediaDrm);
                    return null;
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    int iMapMediaDrmException = WidevineCode.mapMediaDrmException(e);
                    if (iMapMediaDrmException == -1) {
                        iMapMediaDrmException = 1201;
                    }
                    ProvisionResult provisionResultFailed = ProvisionResult.failed(iMapMediaDrmException, false);
                    if (bArrOpenSession != null) {
                        try {
                            mediaDrm.closeSession(bArrOpenSession);
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                        }
                    }
                    destroyMediaDrm(mediaDrm);
                    return provisionResultFailed;
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                destroyMediaDrm(mediaDrm);
                throw th5;
            }
        } catch (NotProvisionedException e3) {
            e = e3;
            bArrOpenSession = null;
        } catch (Exception e4) {
            e = e4;
            bArrOpenSession = null;
        } catch (Throwable th6) {
            th = th6;
            TryCatchGuardChecker.doCheck(th);
            if (0 != 0) {
                try {
                    mediaDrm.closeSession(null);
                } catch (Throwable th7) {
                    TryCatchGuardChecker.doCheck(th7);
                }
            }
            throw th;
        }
    }

    public Map<String, Object> getProvisionMetrics() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, Object> map = (Map) submitDrm(Priority.HIGH, new Callable() { // from class: X.1CmT
            @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
            public final Object call() {
                return this.LIZ.lambda$getProvisionMetrics$2();
            }
        });
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        this.mProvisionMetrics.getMetricsCost = jCurrentTimeMillis2;
        if (map == null) {
            return new LinkedHashMap();
        }
        map.put("drm_get_provision_metrics_cost", Long.valueOf(jCurrentTimeMillis2));
        return map;
    }

    public static LiveWidevineManager getInstance() {
        return Holder.INSTANCE;
    }

    public enum KeyState {
        INIT,
        LICENSE_REQUESTING,
        READY,
        BORROWED,
        ERROR;

        public static KeyState valueOf(String str) {
            return (KeyState) C08FF.LIZ(KeyState.class, str);
        }
    }

    public static final class ProvisionRequestPhase {
        public final boolean complete;
        public final MediaDrm provisionDrm;
        public final ProvisionResult result;
        public final String url;

        public static ProvisionRequestPhase done(ProvisionResult provisionResult) {
            return new ProvisionRequestPhase(true, provisionResult, null, null);
        }

        public static ProvisionRequestPhase needsNetwork(MediaDrm mediaDrm, String str) {
            return new ProvisionRequestPhase(false, null, mediaDrm, str);
        }

        public ProvisionRequestPhase(boolean z, ProvisionResult provisionResult, MediaDrm mediaDrm, String str) {
            this.complete = z;
            this.result = provisionResult;
            this.provisionDrm = mediaDrm;
            this.url = str;
        }
    }

    public enum ProvisionState {
        INIT,
        PROVISIONING,
        PROVISIONED,
        ERROR;

        public static ProvisionState valueOf(String str) {
            return (ProvisionState) C08FF.LIZ(ProvisionState.class, str);
        }
    }

    private void closeSessionEntry(SessionEntry sessionEntry) {
        if (sessionEntry == null) {
            return;
        }
        closeSession(sessionEntry.mediaDrm, sessionEntry.sessionId, sessionEntry.mediaCrypto);
        sessionEntry.mediaDrm = null;
        sessionEntry.sessionId = null;
        sessionEntry.mediaCrypto = null;
    }

    private void destroyMediaDrm(MediaDrm mediaDrm) {
        if (mediaDrm == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                mediaDrm.close();
            } else {
                mediaDrm.release();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private void dumpMaps(String str) {
        for (Map.Entry<String, KeyContext> entry : this.mKeys.entrySet()) {
            entry.getKey();
            KeyContext value = entry.getValue();
            if (value != null) {
                StreamContext streamContext = value.streamContext;
                if (value.config != null) {
                }
            }
        }
        for (Map.Entry<String, StreamContext> entry2 : this.mStreams.entrySet()) {
            entry2.getKey();
            entry2.getValue();
        }
    }

    private byte[] getKeyRequestData(KeyContext keyContext) {
        if (keyContext == null || !keyContext.sessionEntry.isValid()) {
            return null;
        }
        try {
            return keyContext.streamContext.mediaDrm.getKeyRequest(keyContext.sessionEntry.sessionId, Base64.decode(keyContext.config.pssh, 0), "video/mp4", 1, new HashMap<>()).getData();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            WidevineCode.mapMediaDrmException(e);
            keyContext.sessionEntry.widevineCode = 1205;
            return null;
        }
    }

    private KeyContext getOrCreateKeyContext(SessionConfig sessionConfig) {
        KeyContext keyContext;
        synchronized (this.mGlobalLock) {
            try {
                String strCacheKeyOf = PsshUtils.cacheKeyOf(sessionConfig.pssh);
                KeyContext keyContext2 = this.mKeys.get(strCacheKeyOf);
                if (keyContext2 != null) {
                    return keyContext2;
                }
                StreamContext streamContext = this.mStreams.get(sessionConfig.streamName);
                KeyContext keyContext3 = null;
                if (streamContext == null) {
                    CreateMediaDrmResult createMediaDrmResultCreateMediaDrm = createMediaDrm();
                    if (!createMediaDrmResultCreateMediaDrm.isSuccess()) {
                        return null;
                    }
                    streamContext = new StreamContext(sessionConfig.streamName, createMediaDrmResultCreateMediaDrm.mediaDrm);
                    this.mStreams.put(sessionConfig.streamName, streamContext);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    keyContext = new KeyContext(streamContext, sessionConfig);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    byte[] bArrOpenSession = streamContext.mediaDrm.openSession();
                    MediaCrypto mediaCrypto = new MediaCrypto(PsshUtils.WIDEVINE_UUID, bArrOpenSession);
                    SessionEntry sessionEntry = keyContext.sessionEntry;
                    sessionEntry.mediaDrm = streamContext.mediaDrm;
                    sessionEntry.sessionId = bArrOpenSession;
                    sessionEntry.mediaCrypto = mediaCrypto;
                    sessionEntry.securityLevel = this.mSecurityLevel;
                    SessionMetrics sessionMetrics = keyContext.metrics;
                    sessionMetrics.drmOpenResult = 0;
                    sessionMetrics.drmOpenCost = System.currentTimeMillis() - jCurrentTimeMillis;
                    this.mKeys.put(strCacheKeyOf, keyContext);
                    keyContext3 = keyContext;
                } catch (Exception e2) {
                    e = e2;
                    keyContext2 = keyContext;
                    TryCatchGuardChecker.doCheck(e);
                    WidevineCode.mapMediaDrmException(e);
                    if (keyContext2 == null) {
                        keyContext3 = keyContext2;
                    } else {
                        SessionEntry sessionEntry2 = keyContext2.sessionEntry;
                        sessionEntry2.widevineCode = 1201;
                        keyContext2.metrics.drmOpenResult = 1201;
                        closeSessionEntry(sessionEntry2);
                    }
                }
                return keyContext3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private int installLicenseOnDrmThread(KeyContext keyContext) {
        synchronized (keyContext.lock) {
            try {
                if (keyContext.isReady()) {
                    return 0;
                }
                keyContext.keyState = KeyState.LICENSE_REQUESTING;
                byte[] keyRequestData = getKeyRequestData(keyContext);
                if (keyRequestData == null) {
                    finishLicenseTask(keyContext, KeyState.ERROR);
                    return 1205;
                }
                ILiveWidevineNetworkClient.DrmResponse drmResponseRequestLicense = requestLicense(keyContext, keyRequestData);
                int iNetworkResultCode = networkResultCode(drmResponseRequestLicense);
                if (iNetworkResultCode != 0) {
                    finishLicenseTask(keyContext, KeyState.ERROR);
                    return iNetworkResultCode;
                }
                return applyLicense(keyContext, keyContext.sessionEntry.sessionId, drmResponseRequestLicense.byteBody);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$getSessionMetrics$3(String str) {
        KeyContext keyContext;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.mGlobalLock) {
                try {
                    keyContext = this.mKeys.get(PsshUtils.cacheKeyOf(str));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (keyContext != null) {
                linkedHashMap.putAll(keyContext.metrics.toMap());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$installLicense$6(KeyContext keyContext) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iInstallLicenseOnDrmThread = installLicenseOnDrmThread(keyContext);
        keyContext.metrics.licenseRequestCost = System.currentTimeMillis() - jCurrentTimeMillis;
        return Integer.valueOf(iInstallLicenseOnDrmThread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$preload$4(SessionConfig sessionConfig) {
        startPreload(sessionConfig);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$removePreloadForStreamName$7(String str) {
        ArrayList<Map.Entry> arrayList = new ArrayList();
        synchronized (this.mGlobalLock) {
            try {
                StreamContext streamContext = this.mStreams.get(str);
                if (streamContext == null) {
                    return null;
                }
                for (Map.Entry<String, KeyContext> entry : this.mKeys.entrySet()) {
                    if (entry.getValue().streamContext == streamContext) {
                        arrayList.add(entry);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                boolean z = false;
                for (Map.Entry entry2 : arrayList) {
                    if (tryCloseKeyContext((KeyContext) entry2.getValue())) {
                        arrayList2.add(entry2.getKey());
                    } else {
                        z = true;
                    }
                }
                synchronized (this.mGlobalLock) {
                    try {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            this.mKeys.remove((String) it2.next());
                        }
                        if (!z) {
                            this.mStreams.remove(str);
                        }
                    } finally {
                    }
                }
                if (!z) {
                    destroyMediaDrm(streamContext.mediaDrm);
                }
                return null;
            } finally {
            }
        }
    }

    private void startPreload(SessionConfig sessionConfig) {
        KeyContext orCreateKeyContext;
        KeyState keyState;
        if (sessionConfig == null || !sessionConfig.isValid() || !ensureProvisionedBlocking(this.mPreloadOptions.requestTimeoutMS, this.mPreloadOptions.retryIntervalMS).success || !this.mPreloadOptions.enablePreLicense) {
            return;
        }
        if ((sessionConfig.isStrictRequired() && !this.mIsL1) || (orCreateKeyContext = getOrCreateKeyContext(sessionConfig)) == null) {
            return;
        }
        synchronized (orCreateKeyContext.lock) {
            try {
                if (orCreateKeyContext.isReady()) {
                    return;
                }
                KeyState keyState2 = orCreateKeyContext.keyState;
                if (keyState2 != KeyState.BORROWED && keyState2 != (keyState = KeyState.LICENSE_REQUESTING)) {
                    orCreateKeyContext.config = sessionConfig;
                    orCreateKeyContext.keyState = keyState;
                    byte[] keyRequestData = getKeyRequestData(orCreateKeyContext);
                    if (keyRequestData == null) {
                        finishLicenseTask(orCreateKeyContext, KeyState.ERROR);
                    } else {
                        submitPreloadLicense(orCreateKeyContext, keyRequestData);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private boolean tryCloseKeyContext(KeyContext keyContext) {
        if (keyContext == null) {
            return true;
        }
        synchronized (keyContext.lock) {
            try {
                if (keyContext.keyState == KeyState.BORROWED) {
                    return false;
                }
                keyContext.keyState = KeyState.ERROR;
                closeSessionEntry(keyContext.sessionEntry);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public SessionEntry create(final SessionConfig sessionConfig) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (sessionConfig == null || !sessionConfig.isValid() || !ensureProvisionedBlocking(this.mPreloadOptions.requestTimeoutMS, this.mPreloadOptions.retryIntervalMS).success) {
            return null;
        }
        return (SessionEntry) submitDrm(Priority.HIGH, new Callable() { // from class: X.1CmQ
            @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
            public final Object call() {
                return this.LIZ.lambda$create$5(sessionConfig, jCurrentTimeMillis);
            }
        });
    }

    public Map<String, Object> getSessionMetrics(final String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, Object> linkedHashMap = (Map) submitDrm(Priority.HIGH, new Callable() { // from class: X.1CmV
            @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
            public final Object call() {
                return this.LIZ.lambda$getSessionMetrics$3(str);
            }
        });
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        NetworkDispatcher networkDispatcher = this.mNetworkDispatcher;
        if (networkDispatcher != null) {
            linkedHashMap.putAll(networkDispatcher.getMetrics());
        }
        linkedHashMap.put("drm_get_session_metrics_cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return linkedHashMap;
    }

    public int installLicense(String str) {
        final KeyContext keyContext;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iIntValue = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        synchronized (this.mGlobalLock) {
            try {
                keyContext = this.mKeys.get(PsshUtils.cacheKeyOf(str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (keyContext == null) {
            return -1;
        }
        Integer num = (Integer) submitDrm(Priority.HIGH, new Callable() { // from class: X.1CmS
            @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
            public final Object call() {
                return this.LIZ.lambda$installLicense$6(keyContext);
            }
        });
        if (num != null) {
            iIntValue = num.intValue();
        }
        SessionMetrics sessionMetrics = keyContext.metrics;
        sessionMetrics.usePreload = 0;
        sessionMetrics.licenseRequestResult = iIntValue;
        sessionMetrics.licenseRequestTotalCost = System.currentTimeMillis() - jCurrentTimeMillis;
        return iIntValue;
    }

    public int networkResultCode(ILiveWidevineNetworkClient.DrmResponse drmResponse) {
        if (drmResponse == null) {
            return 1101;
        }
        if (!drmResponse.isSuccessful()) {
            if (drmResponse.isClientError()) {
                return 1100;
            }
            return 1104;
        }
        byte[] bArr = drmResponse.byteBody;
        if (bArr != null && bArr.length != 0) {
            return 0;
        }
        return 1102;
    }

    public void preload(String str) {
        if (TextUtils.isEmpty(str) || !this.mPreloadOptions.enablePreLicense) {
            return;
        }
        List<SessionConfig> all = SessionConfig.parseAll(str);
        if (all.isEmpty()) {
            return;
        }
        for (int i = 0; i < all.size(); i++) {
            final SessionConfig sessionConfig = (SessionConfig) ListProtector.get(all, i);
            postDrm(Priority.LOW, new Callable() { // from class: X.1CmW
                @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
                public final Object call() {
                    return this.LIZ.lambda$preload$4(sessionConfig);
                }
            });
        }
    }

    public void release(String str) {
        KeyContext keyContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.mGlobalLock) {
            try {
                keyContext = this.mKeys.get(PsshUtils.cacheKeyOf(str));
            } finally {
            }
        }
        if (keyContext == null) {
            return;
        }
        synchronized (keyContext.lock) {
            try {
                if (keyContext.keyState == KeyState.BORROWED) {
                    keyContext.keyState = KeyState.READY;
                }
            } finally {
            }
        }
    }

    public void removePreloadForStreamName(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        postDrm(Priority.LOW, new Callable() { // from class: X.1Cma
            @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
            public final Object call() {
                return this.LIZ.lambda$removePreloadForStreamName$7(str);
            }
        });
    }

    public void setNetworkClient(ILiveWidevineNetworkClient iLiveWidevineNetworkClient) {
        this.mNetworkClient = iLiveWidevineNetworkClient;
    }

    public void setPreloadOptions(String str) {
        PreloadOptions preloadOptions;
        if (str == null || str.isEmpty() || (preloadOptions = PreloadOptions.parse(str)) == null || preloadOptions.contentEquals(this.mPreloadOptions)) {
            return;
        }
        this.mPreloadOptions = preloadOptions;
    }

    public SessionEntry tryAcquire(String str) {
        KeyContext keyContext;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.mGlobalLock) {
            try {
                keyContext = this.mKeys.get(PsshUtils.cacheKeyOf(str));
            } finally {
            }
        }
        if (keyContext == null) {
            return null;
        }
        synchronized (keyContext.lock) {
            try {
                if (!keyContext.isReady()) {
                    return null;
                }
                keyContext.keyState = KeyState.BORROWED;
                keyContext.metrics.usePreload = 1;
                SessionConfig sessionConfig = keyContext.config;
                if (sessionConfig != null && (str2 = sessionConfig.pssh) != null) {
                    str2.equals(str);
                }
                return keyContext.sessionEntry;
            } finally {
            }
        }
    }

    public static final class StreamContext {
        public final MediaDrm mediaDrm;
        public final String streamName;

        public StreamContext(String str, MediaDrm mediaDrm) {
            this.streamName = str;
            this.mediaDrm = mediaDrm;
        }
    }

    private ProvisionResult ensureProvisionedBlocking(int i, int i2) {
        ProvisionState provisionState = this.mProvisionState;
        ProvisionState provisionState2 = ProvisionState.PROVISIONED;
        if (provisionState == provisionState2) {
            return ProvisionResult.readyWithoutRequest();
        }
        synchronized (this.mProvisionLock) {
            try {
                if (this.mProvisionState == provisionState2) {
                    return ProvisionResult.readyWithoutRequest();
                }
                ProvisionState provisionState3 = this.mProvisionState;
                ProvisionState provisionState4 = ProvisionState.ERROR;
                if (provisionState3 == provisionState4) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.mLastProvisionFailedTimeMs;
                    if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis < i2) {
                        ProvisionResult provisionResult = this.mLastProvisionResult;
                        if (provisionResult != null) {
                            return provisionResult;
                        }
                        return ProvisionResult.failed(-1, false);
                    }
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Priority priority = Priority.HIGH;
                ProvisionResult provisionResultFailed = (ProvisionResult) submitDrm(priority, new Callable() { // from class: X.1CmX
                    @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
                    public final Object call() {
                        return this.LIZ.needsProvisionRequest();
                    }
                });
                if (provisionResultFailed == null) {
                    this.mProvisionState = ProvisionState.PROVISIONING;
                    final ProvisionRequestPhase provisionRequestPhase = (ProvisionRequestPhase) submitDrm(priority, new Callable() { // from class: X.1CmY
                        @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
                        public final Object call() {
                            return this.LIZ.beginProvisionRequestPhase();
                        }
                    });
                    if (provisionRequestPhase == null) {
                        provisionResultFailed = ProvisionResult.failed(-1, true);
                    } else if (provisionRequestPhase.complete) {
                        provisionResultFailed = provisionRequestPhase.result;
                    } else {
                        final ILiveWidevineNetworkClient.DrmResponse drmResponsePostProvisionRequest = postProvisionRequest(provisionRequestPhase.url, i);
                        provisionResultFailed = (ProvisionResult) submitDrm(priority, new Callable() { // from class: X.1CmO
                            @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
                            public final Object call() {
                                return this.LIZ.lambda$ensureProvisionedBlocking$11(provisionRequestPhase, drmResponsePostProvisionRequest);
                            }
                        });
                        if (provisionResultFailed == null) {
                            provisionResultFailed = ProvisionResult.failed(-1, true);
                        }
                    }
                    if (provisionResultFailed == null) {
                        provisionResultFailed = ProvisionResult.failed(-1, true);
                    }
                }
                ProvisionMetrics provisionMetrics = this.mProvisionMetrics;
                provisionMetrics.provisionRequestResult = provisionResultFailed.widevineCode;
                provisionMetrics.provisionRequestCost = System.currentTimeMillis() - jCurrentTimeMillis2;
                if (provisionResultFailed.success) {
                    this.mProvisionState = provisionState2;
                    this.mLastProvisionResult = provisionResultFailed;
                    this.mLastProvisionFailedTimeMs = 0L;
                } else {
                    this.mProvisionState = provisionState4;
                    this.mLastProvisionResult = provisionResultFailed;
                    this.mLastProvisionFailedTimeMs = System.currentTimeMillis();
                }
                return provisionResultFailed;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void finishLicenseTask(KeyContext keyContext, KeyState keyState) {
        if (keyContext == null) {
            return;
        }
        synchronized (keyContext.lock) {
            if (keyState != null) {
                try {
                    if (keyContext.keyState != KeyState.READY) {
                        keyContext.keyState = keyState;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: finishProvisionRequestPhase, reason: merged with bridge method [inline-methods] */
    public ProvisionResult lambda$ensureProvisionedBlocking$11(ProvisionRequestPhase provisionRequestPhase, ILiveWidevineNetworkClient.DrmResponse drmResponse) {
        int i;
        MediaDrm mediaDrm = provisionRequestPhase.provisionDrm;
        if (mediaDrm == null) {
            return ProvisionResult.failed(-1, true);
        }
        try {
            if (drmResponse == null) {
                ProvisionResult provisionResultFailed = ProvisionResult.failed(1101, true);
                destroyMediaDrm(mediaDrm);
                return provisionResultFailed;
            }
            if (!drmResponse.isSuccessful()) {
                if (drmResponse.isClientError()) {
                    i = 1100;
                } else {
                    i = 1104;
                }
                ProvisionResult provisionResultFailed2 = ProvisionResult.failed(i, true);
                destroyMediaDrm(mediaDrm);
                return provisionResultFailed2;
            }
            byte[] bArr = drmResponse.byteBody;
            if (bArr != null && bArr.length != 0) {
                try {
                    mediaDrm.provideProvisionResponse(bArr);
                    ProvisionResult provisionResult = ProvisionResult.readyAfterRequest();
                    destroyMediaDrm(mediaDrm);
                    return provisionResult;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (WidevineCode.mapMediaDrmException(e) == 1003) {
                        ProvisionResult provisionResultFailed3 = ProvisionResult.failed(1003, true);
                        destroyMediaDrm(mediaDrm);
                        return provisionResultFailed3;
                    }
                    ProvisionResult provisionResultFailed4 = ProvisionResult.failed(1204, true);
                    destroyMediaDrm(mediaDrm);
                    return provisionResultFailed4;
                }
            }
            ProvisionResult provisionResultFailed5 = ProvisionResult.failed(1102, true);
            destroyMediaDrm(mediaDrm);
            return provisionResultFailed5;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            destroyMediaDrm(mediaDrm);
            throw th;
        }
    }

    private int handleMediaDrmError(String str, Exception exc) {
        return WidevineCode.mapMediaDrmException(exc);
    }

    private boolean hasQueryParameter(String str, String str2) {
        try {
            if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), str2) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SessionEntry lambda$create$5(SessionConfig sessionConfig, long j) {
        KeyContext orCreateKeyContext = getOrCreateKeyContext(sessionConfig);
        if (orCreateKeyContext == null) {
            return null;
        }
        orCreateKeyContext.metrics.drmOpenTotalCost = System.currentTimeMillis() - j;
        return orCreateKeyContext.sessionEntry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$triggerPreProvision$0(ProvisionResult provisionResult, long j) {
        ProvisionMetrics provisionMetrics = this.mProvisionMetrics;
        provisionMetrics.preProvisionEnabled = 1;
        provisionMetrics.preProvisionTriggered = 1;
        provisionMetrics.preProvisionResult = provisionResult.widevineCode;
        provisionMetrics.preProvisionRequested = provisionResult.requestedProvision ? 1 : 0;
        provisionMetrics.preProvisionCost = j;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerPreProvision$1(int i, int i2) {
        final ProvisionResult provisionResultFailed;
        C1C7U.LIZ("LiveWidevineManager@2d7e.triggerPreProvision$1L");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            provisionResultFailed = ensureProvisionedBlocking(i, i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            provisionResultFailed = ProvisionResult.failed(-1, false);
        }
        final long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        postDrm(Priority.LOW, new Callable() { // from class: X.1CmU
            @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
            public final Object call() {
                return this.LIZ.lambda$triggerPreProvision$0(provisionResultFailed, jCurrentTimeMillis2);
            }
        });
        if (!provisionResultFailed.success) {
            this.mProvisionTriggered.set(false);
        }
        C1C7U.LIZIZ("LiveWidevineManager@2d7e.triggerPreProvision$1L");
    }

    private void postDrm(Priority priority, Callable<Object> callable) {
        ensureDrmDispatcher();
        this.mDrmDispatcher.post(new ManagerDrmTask(priority, callable));
    }

    private ILiveWidevineNetworkClient.DrmResponse postProvisionRequest(String str, int i) {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/octet-stream");
        ILiveWidevineNetworkClient iLiveWidevineNetworkClient = this.mNetworkClient;
        if (iLiveWidevineNetworkClient == null) {
            return null;
        }
        return iLiveWidevineNetworkClient.post(str, map, "application/octet-stream", new byte[0], false, i);
    }

    private <T> T submitDrm(Priority priority, Callable<T> callable) {
        ensureDrmDispatcher();
        if (this.mDrmDispatcher.isOnDispatcherThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return (T) this.mDrmDispatcher.submit(new ManagerDrmTask(priority, callable));
    }

    private void submitPreloadLicense(final KeyContext keyContext, final byte[] bArr) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        NetworkDispatcher networkDispatcherEnsureNetworkDispatcher = ensureNetworkDispatcher();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("license:");
        sbLIZ.append(PsshUtils.cacheKeyOf(keyContext.config.pssh));
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        networkDispatcherEnsureNetworkDispatcher.submit(new NetworkTask<ILiveWidevineNetworkClient.DrmResponse>() { // from class: com.bytedance.vcloud.strategy.drm.LiveWidevineManager.1
            @Override // com.bytedance.vcloud.strategy.drm.NetworkTask
            public NetworkResult<ILiveWidevineNetworkClient.DrmResponse> execute() {
                ILiveWidevineNetworkClient.DrmResponse drmResponseRequestLicense = LiveWidevineManager.this.requestLicense(keyContext, bArr);
                int iNetworkResultCode = LiveWidevineManager.this.networkResultCode(drmResponseRequestLicense);
                return iNetworkResultCode == 0 ? NetworkResult.success(drmResponseRequestLicense, null) : NetworkResult.failure(iNetworkResultCode, null);
            }

            @Override // com.bytedance.vcloud.strategy.drm.NetworkTask
            public Priority priority() {
                return Priority.LOW;
            }

            @Override // com.bytedance.vcloud.strategy.drm.NetworkTask
            public String requestId() {
                return strLIZIZ;
            }
        }, new NetworkCallback() { // from class: X.1CmR
            @Override // com.bytedance.vcloud.strategy.drm.NetworkCallback
            public final void onComplete(NetworkResult networkResult) {
                this.LIZ.lambda$submitPreloadLicense$10(keyContext, jCurrentTimeMillis, networkResult);
            }
        });
    }

    public ILiveWidevineNetworkClient.DrmResponse requestLicense(KeyContext keyContext, byte[] bArr) {
        if (keyContext == null || bArr == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("Content-Type", "application/octet-stream");
        boolean zHasQueryParameter = hasQueryParameter(keyContext.config.licenseUrl, "bid");
        ILiveWidevineNetworkClient iLiveWidevineNetworkClient = this.mNetworkClient;
        if (iLiveWidevineNetworkClient == null) {
            return null;
        }
        return iLiveWidevineNetworkClient.post(keyContext.config.licenseUrl, map, "application/octet-stream", bArr, zHasQueryParameter, this.mPreloadOptions.requestTimeoutMS);
    }

    public void triggerPreProvision(final int i, final int i2) {
        if (!this.mProvisionTriggered.compareAndSet(false, true)) {
            return;
        }
        new BPEAThread(new Runnable() { // from class: X.1CmZ
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$triggerPreProvision$1(i, i2);
            }
        }, "drm-pre-provision").start();
    }

    private int applyLicense(KeyContext keyContext, byte[] bArr, byte[] bArr2) {
        if (keyContext != null && bArr != null && bArr2 != null) {
            synchronized (keyContext.lock) {
                try {
                    if (keyContext.isReady()) {
                        return 0;
                    }
                    try {
                        keyContext.streamContext.mediaDrm.provideKeyResponse(bArr, bArr2);
                        synchronized (keyContext.lock) {
                            try {
                                keyContext.sessionEntry.widevineCode = 0;
                                keyContext.keyState = KeyState.READY;
                            } finally {
                            }
                        }
                        return 0;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        WidevineCode.mapMediaDrmException(e);
                        keyContext.sessionEntry.widevineCode = 1206;
                        finishLicenseTask(keyContext, KeyState.ERROR);
                        return 1206;
                    }
                } finally {
                }
            }
        }
        finishLicenseTask(keyContext, KeyState.ERROR);
        return -1;
    }

    private void closeSession(MediaDrm mediaDrm, byte[] bArr, MediaCrypto mediaCrypto) {
        if (mediaCrypto != null) {
            try {
                mediaCrypto.release();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (mediaDrm != null && bArr != null) {
            try {
                mediaDrm.closeSession(bArr);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$submitPreloadLicense$10(final KeyContext keyContext, final long j, final NetworkResult networkResult) {
        postDrm(Priority.LOW, new Callable() { // from class: X.1CmP
            @Override // com.bytedance.vcloud.strategy.drm.LiveWidevineManager.Callable
            public final Object call() {
                return this.LIZ.lambda$submitPreloadLicense$9(keyContext, j, networkResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Object lambda$submitPreloadLicense$9(KeyContext keyContext, long j, NetworkResult networkResult) {
        int i;
        T t;
        RequestMetrics requestMetrics;
        keyContext.metrics.licenseRequestTotalCost = System.currentTimeMillis() - j;
        if (networkResult != null && (requestMetrics = networkResult.metrics) != null) {
            keyContext.metrics.licenseRequestCost = requestMetrics.durationMs();
            keyContext.metrics.licenseRequestRetryCount = networkResult.metrics.retryCount;
        }
        if (networkResult != null) {
            if (networkResult.success && (t = networkResult.data) != 0) {
                keyContext.metrics.licenseRequestResult = applyLicense(keyContext, keyContext.sessionEntry.sessionId, ((ILiveWidevineNetworkClient.DrmResponse) t).byteBody);
                return null;
            }
            i = networkResult.code;
        } else {
            i = -1;
        }
        keyContext.metrics.licenseRequestResult = i;
        finishLicenseTask(keyContext, KeyState.ERROR);
        return null;
    }
}
