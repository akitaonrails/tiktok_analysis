package com.ss.bduploader;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.smartserver.SmartProtocol;
import com.ss.bduploader.smartserver.SmartSpeedTest;
import java.io.File;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class BDNetworkSpeedTest extends BDAbstractUpload implements Handler.Callback {
    public int hasInit;
    public int mEnableIntelligentProtocol;
    public int mEnableIntelligentSpeedTest;
    public long mEndTime;
    public long mHandle;
    public Handler mHandler;
    public BDNetworkSpeedTestListener mListener;
    public final ReentrantReadWriteLock.ReadLock mReadLock;
    public final ReentrantReadWriteLock mReadWritedLock;
    public SmartProtocol mSmartProtocol;
    public SmartSpeedTest mSmartSpeedTest;
    public long mStartTime;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;
    public int mState = -1;
    public String mIntelligentModelURL = "";
    public String mIntelligentProtocolModelURL = "";

    public static native void _close(long j);

    private final native long _create();

    public static native void _setIntValue(long j, int i, int i2);

    public static native void _setStringValue(long j, int i, String str);

    public static native void _start(long j);

    public static native void _stop(long j);

    public void close() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _close(j);
                this.mHandle = 0L;
                this.mState = 5;
                this.mHandler.removeCallbacksAndMessages(null);
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void start() {
        this.mReadLock.lock();
        String str = BDUploadUtil.sdkConfigDir;
        if (str != null && str.length() > 0) {
            setContextDir(BDUploadUtil.sdkConfigDir);
        }
        try {
            if (this.mHandle != 0) {
                this.mState = 1;
                this.mStartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
            this.mReadLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
                this.mState = 4;
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public BDNetworkSpeedTest() throws Exception {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        this.mListener = null;
        if (Looper.myLooper() != null) {
            this.mHandler = new BPEAHandler(this);
        } else {
            this.mHandler = new BPEAHandler(Looper.getMainLooper(), this);
        }
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        try {
            this.mHandle = _create();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mHandle = 0L;
        }
        long j = this.mHandle;
        if (j == 0) {
            throw new Exception("create native speed tester fail");
        }
        _setIntValue(j, 421, BDUploadUtil.mEnableNativeLog.booleanValue() ? 1 : 0);
    }

    public static class LogInfo {
        public int code;
        public String info;

        public int getCode() {
            return this.code;
        }

        public String getInfo() {
            return this.info;
        }

        public LogInfo(int i, String str) {
            this.code = i;
            this.info = str;
        }
    }

    private int predictIntelligentProtocol(JSONObject jSONObject) {
        SmartProtocol smartProtocol = this.mSmartProtocol;
        if (smartProtocol == null) {
            return -1;
        }
        return smartProtocol.predictClassificationSync(jSONObject);
    }

    private float predictIntelligentSpeed(JSONObject jSONObject) {
        SmartSpeedTest smartSpeedTest = this.mSmartSpeedTest;
        if (smartSpeedTest == null) {
            return -1.0f;
        }
        return smartSpeedTest.predictSpeedSync(jSONObject);
    }

    private void preloadModel(int i) {
        SmartProtocol smartProtocol;
        if (i != 0) {
            if (i == 1 && (smartProtocol = this.mSmartProtocol) != null) {
                smartProtocol.preloadEnv();
                return;
            }
            return;
        }
        SmartSpeedTest smartSpeedTest = this.mSmartSpeedTest;
        if (smartSpeedTest == null) {
            return;
        }
        smartSpeedTest.preloadEnv();
    }

    private void setContextDir(String str) {
        if (this.mHandle != 0 && str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(File.separator);
            sbLIZ.append(BDUploadUtil.SpeedTestcontextDir);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            BDUploadUtil.createDir(strLIZIZ);
            _setStringValue(this.mHandle, 418, strLIZIZ);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (HandlerHook.getMessageObj(message.obj) instanceof LogInfo) {
            LogInfo logInfo = (LogInfo) HandlerHook.getMessageObj(message.obj);
            onLogInfoSync(message.what, logInfo.getCode(), logInfo.getInfo());
            return true;
        }
        if (this.mListener != null && (HandlerHook.getMessageObj(message.obj) instanceof BDNetworkSpeedTestInfo)) {
            BDNetworkSpeedTestInfo bDNetworkSpeedTestInfo = (BDNetworkSpeedTestInfo) HandlerHook.getMessageObj(message.obj);
            this.mListener.onSpeedTestContext(bDNetworkSpeedTestInfo.mContextType, bDNetworkSpeedTestInfo.mSpeed, bDNetworkSpeedTestInfo.mContext);
        }
        return true;
    }

    public void setAuthType(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 416, i);
    }

    public void setCustomHttpHeaders(TreeMap<String, Object> treeMap) {
        String strMapToString;
        if (this.mHandle != 0 && treeMap != null && (strMapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(430, strMapToString);
        }
    }

    public void setDataTransportProtocol(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 411, i);
        }
    }

    public void setEnableExternDNS(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i != 0 && i != 1) {
                return;
            }
            _setIntValue(j, 21, i);
        }
    }

    public void setEnableHttps(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 19, i);
        }
    }

    public void setFileRetryCount(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 6, i);
        }
    }

    public void setHandler(Handler handler) {
        this.mHandler = handler;
    }

    public void setListener(BDNetworkSpeedTestListener bDNetworkSpeedTestListener) {
        this.mListener = bDNetworkSpeedTestListener;
    }

    public void setMaxFailTime(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 13, i);
        }
    }

    public void setProcessActionType(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 65, i);
    }

    public void setQueryAuth(String str) {
        long j = this.mHandle;
        if (j != 0 && str != null) {
            _setStringValue(j, 15, str);
        }
    }

    public void setRWTimeout(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 7, i);
        }
    }

    public void setRegionName(String str) {
        setStringValue(47, str);
    }

    public void setSDKConfigDir(String str) {
        if (this.mHandle != 0 && str != null) {
            BDUploadUtil.createDir(str);
            _setStringValue(this.mHandle, 417, str);
            setContextDir(str);
        }
    }

    public void setServerParameter(String str) {
        long j = this.mHandle;
        if (j != 0 && str != null) {
            _setStringValue(j, 16, str);
        }
    }

    public void setSpaceName(String str) {
        setStringValue(45, str);
    }

    public void setTcpOpenTimeOutMilliSec(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 24, i);
        }
    }

    public void setThreadModelVersion(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 457, i);
    }

    public void setTopAccessKey(String str) {
        setStringValue(42, str);
    }

    public void setTopPath(String str) {
        setStringValue(470, str);
    }

    public void setTopSecretKey(String str) {
        setStringValue(43, str);
    }

    public void setTopSessionToken(String str) {
        setStringValue(44, str);
    }

    public void setTraceId(String str) {
        if (this.mHandle != 0 && str != null && !str.isEmpty()) {
            _setStringValue(this.mHandle, 69, str);
        }
    }

    public void setTranTimeOutUnit(int i) {
        long j = this.mHandle;
        if (j != 0 && i > 0) {
            _setIntValue(j, 64, i);
        }
    }

    public void setUploadDomain(String str) {
        setStringValue(46, str);
    }

    private void checkAndInit(String str, int i) {
        int i2 = 1 << i;
        int i3 = this.hasInit;
        if ((i2 & i3) == 1) {
            return;
        }
        this.hasInit = i2 | i3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i != 0) {
            if (i == 1) {
                SmartProtocol smartProtocol = new SmartProtocol();
                this.mSmartProtocol = smartProtocol;
                smartProtocol.init();
                this.mSmartProtocol.setUrl(str);
                this.mSmartProtocol.configServer();
                return;
            }
            return;
        }
        SmartSpeedTest smartSpeedTest = new SmartSpeedTest();
        this.mSmartSpeedTest = smartSpeedTest;
        smartSpeedTest.init();
        this.mSmartSpeedTest.setUrl(str);
        this.mSmartSpeedTest.configServer();
    }

    public int checkNet(int i, int i2) {
        BDNetworkSpeedTestListener bDNetworkSpeedTestListener = this.mListener;
        if (bDNetworkSpeedTestListener != null) {
            return bDNetworkSpeedTestListener.speedTestCheckNetState(i, i2);
        }
        return 1;
    }

    @Override // com.ss.bduploader.BDAbstractUpload
    public String intelligentInterface(int i, String str) {
        int i2;
        int iPredictIntelligentProtocol;
        JSONObject jSONObject = new JSONObject();
        if (i == 3 || i == 5 || i == 6) {
            if (i != 3 && i != 6) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            SmartSpeedTest smartSpeedTest = this.mSmartSpeedTest;
            if (smartSpeedTest == null) {
                return "";
            }
            smartSpeedTest.setSpeedTestUseVCN(i2);
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (this.mEnableIntelligentSpeedTest == 1) {
                    float fPredictIntelligentSpeed = predictIntelligentSpeed(jSONObject2);
                    if (fPredictIntelligentSpeed > 0.0f) {
                        jSONObject.put("intelligentTestResult", fPredictIntelligentSpeed);
                    }
                }
                if (this.mEnableIntelligentProtocol == 1 && this.mSmartProtocol != null && (iPredictIntelligentProtocol = predictIntelligentProtocol(jSONObject2)) >= 0) {
                    jSONObject.put("intelligentProtocolResult", iPredictIntelligentProtocol);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
        }
        if (jSONObject == null) {
            return "";
        }
        return C786410Ut5.J3(jSONObject);
    }

    public void setIntelligentProtocolInfo(int i, String str) {
        if (this.mHandle != 0 && str != null) {
            this.mEnableIntelligentProtocol = i;
            this.mIntelligentProtocolModelURL = str;
            if (i == 1) {
                checkAndInit(str, 1);
                preloadModel(1);
            }
            _setIntValue(this.mHandle, 444, i);
        }
    }

    public void setIntelligentSpeedTestInfo(int i, String str) {
        if (this.mHandle != 0 && str != null) {
            this.mEnableIntelligentSpeedTest = i;
            this.mIntelligentModelURL = str;
            if (i == 1) {
                checkAndInit(str, 0);
                preloadModel(0);
            }
            _setIntValue(this.mHandle, 431, i);
        }
    }

    public void setNetworkType(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, i, i2);
    }

    public void setStringValue(int i, String str) {
        long j = this.mHandle;
        if (j != 0 && str != null) {
            _setStringValue(j, i, str);
        }
    }

    public void onLogInfo(int i, int i2, String str) {
        if (this.mState != 1) {
            return;
        }
        LogInfo logInfo = new LogInfo(i2, str);
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = i;
        messageObtainMessage.obj = logInfo;
        messageObtainMessage.sendToTarget();
    }

    public void onLogInfoSync(int i, int i2, String str) {
        JSONObject jSONObject;
        if (i == 107) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
            UploadEventManager.instance.addEvent(jSONObject);
        }
    }

    public void onNotify(int i, long j, int i2, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "upload_log");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = null;
        }
        UploadEventManager.instance.addEvent(jSONObject);
        BDNetworkSpeedTestInfo bDNetworkSpeedTestInfo = new BDNetworkSpeedTestInfo(str, i, (int) j);
        Handler handler = this.mHandler;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = i;
            messageObtainMessage.obj = bDNetworkSpeedTestInfo;
            messageObtainMessage.sendToTarget();
        }
    }
}
