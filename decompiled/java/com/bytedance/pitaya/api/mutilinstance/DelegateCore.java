package com.bytedance.pitaya.api.mutilinstance;

import android.content.Context;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.bean.PTYCleanStrategy;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.api.bean.PTYNativeTaskConfig;
import com.bytedance.pitaya.api.bean.PTYNativeTaskData;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.inner.thridpart.DelegateCoreEventReport;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public final class DelegateCore implements IPitayaCore {
    public String aid;
    public Function0<Unit> cleanAction;
    public final PTYError hostNotReadyError;
    public final ReentrantReadWriteLock.ReadLock rLock;
    public volatile IPitayaCore realCore;
    public final ReentrantReadWriteLock rwLock;
    public final ReentrantReadWriteLock.WriteLock wLock;
    public final ConcurrentHashMap<String, PTYMessageHandler> messageHandlers = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, PTYTaskResultCallback> appLogTaskCallback = new ConcurrentHashMap<>();

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public boolean isPreloadReady() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            return iPitayaCore.isPreloadReady();
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public boolean isReady() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            return iPitayaCore.isReady();
        }
        return false;
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void preDownloadAllPackage() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.preDownloadAllPackage();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void releaseAllEngines() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.releaseAllEngines();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void requestUpdateAll() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.requestUpdateAll();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void stopAllDownloadTask() {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.stopAllDownloadTask();
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public String getAid() {
        return this.aid;
    }

    public final IPitayaCore getRealCore$pitayacore_release() {
        return this.realCore;
    }

    public DelegateCore(String str) {
        this.aid = str;
        PTYErrorCode pTYErrorCode = PTYErrorCode.PITAYA_IMPL_NOT_READY;
        this.hostNotReadyError = new PTYError("Multi-Instance", pTYErrorCode.getCode(), pTYErrorCode.getCode(), "Method invoked before host setup!", null);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.rwLock = reentrantReadWriteLock;
        this.rLock = reentrantReadWriteLock.readLock();
        this.wLock = reentrantReadWriteLock.writeLock();
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void preCreateLLMEngine(String str) {
        this.rLock.lock();
        try {
            if (this.realCore != null) {
                this.realCore.preCreateLLMEngine(str);
            }
            this.rLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void releaseEngine(String str) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.releaseEngine(str);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void releaseLLMEngine(String str) {
        this.rLock.lock();
        try {
            if (this.realCore != null) {
                this.realCore.releaseLLMEngine(str);
            }
            this.rLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void releaseNativeEngine(String str) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.releaseNativeEngine(str);
        }
    }

    @Override // com.bytedance.pitaya.api.PitayaFE
    public void removeApplogRunEventCallback(String str) {
        this.rLock.lock();
        try {
            if (this.realCore != null) {
                this.realCore.removeApplogRunEventCallback(str);
            } else {
                this.appLogTaskCallback.remove(str);
            }
            this.rLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void removeCustomTaskHandler(String str) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.removeCustomTaskHandler(str);
        }
    }

    @Override // com.bytedance.pitaya.api.PitayaFE
    public void removeMessageHandler(String str) {
        this.rLock.lock();
        try {
            if (this.realCore != null) {
                this.realCore.removeMessageHandler(str);
            } else {
                this.messageHandlers.remove(str);
            }
            this.rLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void setAid(String str) {
        this.aid = str;
    }

    public final void setRealCore$pitayacore_release(IPitayaCore iPitayaCore) {
        this.wLock.lock();
        if (iPitayaCore != null) {
            try {
                if (this.realCore == null) {
                    this.realCore = iPitayaCore;
                    this.wLock.unlock();
                    for (Map.Entry<String, PTYMessageHandler> entry : this.messageHandlers.entrySet()) {
                        IPitayaCore iPitayaCore2 = this.realCore;
                        if (iPitayaCore2 != null) {
                            iPitayaCore2.registerMessageHandler(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry<String, PTYTaskResultCallback> entry2 : this.appLogTaskCallback.entrySet()) {
                        IPitayaCore iPitayaCore3 = this.realCore;
                        if (iPitayaCore3 != null) {
                            iPitayaCore3.registerApplogRunEventCallback(entry2.getKey(), entry2.getValue());
                        }
                    }
                    this.messageHandlers.clear();
                    this.appLogTaskCallback.clear();
                    Function0<Unit> function0 = this.cleanAction;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.wLock.unlock();
                throw th;
            }
        }
        this.wLock.unlock();
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void socketLogError(String str) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.socketLogError(str);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void socketLogInfo(String str) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.socketLogInfo(str);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void socketLogWarn(String str) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.socketLogWarn(str);
        }
    }

    private final <T> T safeCall(Function0<? extends T> function0, Function0<? extends T> function02) {
        T tInvoke;
        this.rLock.lock();
        try {
            if (this.realCore != null) {
                tInvoke = function0.invoke();
            } else {
                tInvoke = function02.invoke();
            }
            this.rLock.unlock();
            return tInvoke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void downloadPackage(String str, PTYPackageCallback pTYPackageCallback) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.downloadPackage(str, pTYPackageCallback);
            if (Unit.LIZ != null) {
                return;
            }
        }
        pTYPackageCallback.onResult(false, this.hostNotReadyError, null);
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void queryPackage(String str, PTYPackageCallback pTYPackageCallback) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.queryPackage(str, pTYPackageCallback);
            if (Unit.LIZ != null) {
                return;
            }
        }
        pTYPackageCallback.onResult(false, this.hostNotReadyError, null);
    }

    @Override // com.bytedance.pitaya.api.PitayaFE
    public void registerApplogRunEventCallback(String str, PTYTaskResultCallback pTYTaskResultCallback) {
        this.rLock.lock();
        try {
            if (this.realCore != null) {
                this.realCore.registerApplogRunEventCallback(str, pTYTaskResultCallback);
            } else {
                this.appLogTaskCallback.put(str, pTYTaskResultCallback);
            }
            this.rLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void registerCustomTaskHandler(String str, PTYTaskResultCallback pTYTaskResultCallback) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.registerCustomTaskHandler(str, pTYTaskResultCallback);
        }
    }

    @Override // com.bytedance.pitaya.api.PitayaFE
    public void registerMessageHandler(String str, PTYMessageHandler pTYMessageHandler) {
        this.rLock.lock();
        try {
            if (this.realCore != null) {
                this.realCore.registerMessageHandler(str, pTYMessageHandler);
            } else {
                this.messageHandlers.put(str, pTYMessageHandler);
            }
            this.rLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void cleanStorage(Context context, PTYCleanStrategy pTYCleanStrategy, PTYNormalCallback pTYNormalCallback) {
        this.rLock.lock();
        try {
            if (this.realCore != null) {
                IPitayaCore iPitayaCore = this.realCore;
                if (iPitayaCore != null) {
                    iPitayaCore.cleanStorage(context, pTYCleanStrategy, pTYNormalCallback);
                }
            } else {
                pTYNormalCallback.onResult(false, this.hostNotReadyError);
            }
            this.rLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.rLock.unlock();
            throw th;
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void requestUpdate(String str, PTYRequestConfig pTYRequestConfig, PTYPackageCallback pTYPackageCallback) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.requestUpdate(str, pTYRequestConfig, pTYPackageCallback);
        } else {
            if (pTYPackageCallback == null) {
                return;
            }
            pTYPackageCallback.onResult(false, this.hostNotReadyError, null);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void setup(Context context, PTYSetupInfo pTYSetupInfo, PTYSetupCallback pTYSetupCallback) {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.setup(context, pTYSetupInfo, pTYSetupCallback);
        } else {
            if (pTYSetupCallback == null) {
                return;
            }
            pTYSetupCallback.onResult(false, this.hostNotReadyError);
        }
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void ensurePackageReady(String str, double d, boolean z, PTYPackageCallback pTYPackageCallback) throws JSONException {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.ensurePackageReady(str, d, z, pTYPackageCallback);
            if (Unit.LIZ != null) {
                return;
            }
        }
        DelegateCoreEventReport.INSTANCE.notReadyCall$pitayacore_release(getAid(), str);
        pTYPackageCallback.onResult(false, this.hostNotReadyError, null);
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void runNativeTask(String str, PTYNativeTaskData pTYNativeTaskData, PTYNativeTaskConfig pTYNativeTaskConfig, PTYTaskResultCallback pTYTaskResultCallback) throws JSONException {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.runNativeTask(str, pTYNativeTaskData, pTYNativeTaskConfig, pTYTaskResultCallback);
            if (Unit.LIZ != null) {
                return;
            }
        }
        DelegateCoreEventReport.INSTANCE.notReadyCall$pitayacore_release(getAid(), str);
        pTYTaskResultCallback.onResult(false, this.hostNotReadyError, null, null);
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void runTask(String str, PTYTaskData pTYTaskData, PTYTaskConfig pTYTaskConfig, PTYTaskResultCallback pTYTaskResultCallback) throws JSONException {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.runTask(str, pTYTaskData, pTYTaskConfig, pTYTaskResultCallback);
            if (Unit.LIZ != null) {
                return;
            }
        }
        DelegateCoreEventReport.INSTANCE.notReadyCall$pitayacore_release(getAid(), str);
        pTYTaskResultCallback.onResult(false, this.hostNotReadyError, null, null);
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void runLLMTask(String str, String str2, String str3, PTYTaskData pTYTaskData, PTYTaskResultCallback pTYTaskResultCallback) throws JSONException {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.runLLMTask(str, str2, str3, pTYTaskData, pTYTaskResultCallback);
            if (Unit.LIZ != null) {
                return;
            }
        }
        DelegateCoreEventReport.INSTANCE.notReadyCall$pitayacore_release(getAid(), str);
        pTYTaskResultCallback.onResult(false, this.hostNotReadyError, null, null);
    }

    @Override // com.bytedance.pitaya.api.IPitayaCore
    public void runTask(String str, PTYTaskData pTYTaskData, PTYTaskConfig pTYTaskConfig, PTYTaskResultCallback pTYTaskResultCallback, PTYTaskResultCallback pTYTaskResultCallback2) throws JSONException {
        IPitayaCore iPitayaCore = this.realCore;
        if (iPitayaCore != null) {
            iPitayaCore.runTask(str, pTYTaskData, pTYTaskConfig, pTYTaskResultCallback, pTYTaskResultCallback2);
            if (Unit.LIZ != null) {
                return;
            }
        }
        DelegateCoreEventReport.INSTANCE.notReadyCall$pitayacore_release(getAid(), str);
        pTYTaskResultCallback.onResult(false, this.hostNotReadyError, null, null);
    }
}
