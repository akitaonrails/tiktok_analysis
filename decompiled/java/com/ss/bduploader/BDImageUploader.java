package com.ss.bduploader;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.net.BDUploadDNSParser;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class BDImageUploader extends BDAbstractUpload implements Handler.Callback {
    public long mEndTime;
    public long mHandle;
    public Handler mHandler;
    public int mImageNum;
    public final ReentrantReadWriteLock.ReadLock mReadLock;
    public long mStartTime;
    public int mState;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;
    public final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    public BDImageUploaderListener mListener = null;
    public BDImageUploaderAbstractListener mAbstractListener = null;
    public boolean mStartLockOpt = false;

    public static native void _allowContinueUpload(long j);

    public static native void _cancelUpload(long j);

    public static native void _close(long j);

    private final native long _create(int i);

    public static native long _getLongValue(long j, int i);

    public static native String _getStrByKeyAndIndex(long j, int i, int i2);

    public static native String _getStringValue(long j, int i);

    public static native void _mergeUpload(long j);

    public static native void _setFileData(long j, int i, byte[][] bArr);

    public static native void _setFileName(long j, int i, String[] strArr);

    public static native void _setFileNum(long j, int i);

    public static native void _setFilePaths(long j, int i, String[] strArr);

    public static native void _setFileStoreKeys(long j, int i, String[] strArr);

    public static native void _setInt64Value(long j, int i, long j2);

    public static native void _setIntValue(long j, int i, int i2);

    public static native void _setObject(long j, int i, Object obj);

    public static native void _setSpecifiedContentType(long j, int i, String[] strArr);

    public static native void _setStringValue(long j, int i, String str);

    public static native void _start(long j);

    public static native void _stop(long j);

    public void enableStartLockOpt() {
        this.mStartLockOpt = true;
    }

    public void setPreUpload(boolean z) {
    }

    public void startPreHeat() {
        setPreheatUploader(2);
        start();
    }

    public void allowContinueUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _allowContinueUpload(j);
    }

    public void allowMergeUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _mergeUpload(j);
    }

    public void cancelUpload() {
        this.mWriteLock.lock();
        long j = this.mHandle;
        if (j == 0) {
            this.mWriteLock.unlock();
        } else {
            _cancelUpload(j);
            this.mWriteLock.unlock();
        }
    }

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

    public String getUploadContextSnapshot() {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return _getStringValue(j, 468);
    }

    public void start() {
        if (this.mStartLockOpt) {
            this.mWriteLock.lock();
        } else {
            this.mReadLock.lock();
        }
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
            if (this.mStartLockOpt) {
                this.mWriteLock.unlock();
            } else {
                this.mReadLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.mStartLockOpt) {
                this.mWriteLock.unlock();
                throw th;
            }
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
                addLogToManager(_getStringValue(this.mHandle, 100));
                this.mState = 4;
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public BDImageUploader() throws Exception {
        this.mState = -1;
        try {
            this.mHandle = _create(0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mHandle = 0L;
        }
        long j = this.mHandle;
        if (j == 0) {
            throw new Exception("create native uploader fail");
        }
        _setIntValue(j, 421, BDUploadUtil.mEnableNativeLog.booleanValue() ? 1 : 0);
        if (Looper.myLooper() != null) {
            this.mHandler = new BPEAHandler(this);
        } else {
            this.mHandler = new BPEAHandler(Looper.getMainLooper(), this);
        }
        this.mReadLock = this.mReadWritedLock.readLock();
        this.mWriteLock = this.mReadWritedLock.writeLock();
        this.mState = 0;
        getDNSIP();
    }

    public String getDNSIP() {
        return BDUploadUtil.getDNSServerIP();
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

    public static boolean isError() {
        return BDAbstractUpload.IsErrored;
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

    public void SetExtraParams(JSONObject jSONObject) {
        if (this.mHandle != 0 && jSONObject != null) {
            setStringValue(61, C786410Ut5.J3(jSONObject));
        }
    }

    public void addLogToManager(String str) {
        JSONObject jSONObject;
        String string = UUID.randomUUID().toString();
        if (string == null || string.length() <= 0) {
            string = "invalid_uuid";
        }
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", BDUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", BDUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", BDUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", BDUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", BDUploadDNSParser.mGlobalDefaultExpiredTime);
            jSONObject.put("uuid", string);
            jSONObject.remove("event");
            jSONObject.put("event", "bd_image_upload_all");
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "image_array");
                if (jSONArray != null) {
                    jSONObject.remove("image_array");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
                        jSONObject2.remove("event");
                        jSONObject2.put("event", "bd_image_upload_single");
                        JSONObject jSONObject3 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                        Iterator<String> itKeys = jSONObject3.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject2.put(next, jSONObject3.get(next));
                        }
                        jSONObject2.put("uuid", string);
                        UploadEventManager.instance.addEvent(jSONObject2);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            jSONObject = null;
        }
        UploadEventManager.instance.addEvent(jSONObject);
    }

    @Override // com.ss.bduploader.BDAbstractUpload
    public String getStringFromExtern(int i) {
        if (i != 0) {
            if (i == 1) {
                return UUID.randomUUID().toString();
            }
            return null;
        }
        BDImageUploaderAbstractListener bDImageUploaderAbstractListener = this.mAbstractListener;
        if (bDImageUploaderAbstractListener != null) {
            return bDImageUploaderAbstractListener.getStringFromExtern(i);
        }
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        long j;
        int i = message.what;
        if (HandlerHook.getMessageObj(message.obj) instanceof LogInfo) {
            LogInfo logInfo = (LogInfo) HandlerHook.getMessageObj(message.obj);
            onLogInfoSync(i, logInfo.getCode(), logInfo.getInfo());
            return true;
        }
        if (this.mListener == null) {
            return true;
        }
        BDImageInfo bDImageInfo = (BDImageInfo) HandlerHook.getMessageObj(message.obj);
        if (bDImageInfo != null) {
            j = bDImageInfo.mProgress;
        } else {
            j = 0;
        }
        if (i == 124) {
            j = message.arg1;
        }
        this.mListener.onNotify(i, j, bDImageInfo);
        return true;
    }

    public void setAbstractListener(BDImageUploaderAbstractListener bDImageUploaderAbstractListener) {
        this.mAbstractListener = bDImageUploaderAbstractListener;
    }

    public void setAuthType(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 416, i);
    }

    public void setConfig(TreeMap<String, Object> treeMap) {
        String strMapToString;
        if (this.mHandle != 0 && treeMap != null && (strMapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(56, strMapToString);
        }
    }

    public void setCustomConfig(TreeMap<String, Object> treeMap) {
        JSONObject jSONObjectMapToJSON;
        if (this.mHandle == 0 || treeMap == null || (jSONObjectMapToJSON = BDUploadUtil.mapToJSON(treeMap)) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("custom_config", jSONObjectMapToJSON);
            String strJ3 = C786410Ut5.J3(jSONObject);
            if (!TextUtils.isEmpty(strJ3)) {
                setStringValue(63, strJ3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
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

    public void setEnableCommitUpload(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 401, i);
    }

    public void setEnableHttps(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 19, i);
        }
    }

    public void setEnableLogCallBack(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        if (z) {
            _setIntValue(j, 78, 1);
        } else {
            _setIntValue(j, 78, 0);
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

    public void setListener(BDImageUploaderListener bDImageUploaderListener) {
        this.mListener = bDImageUploaderListener;
    }

    public void setMaxConcurrentFileNum(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 400, i);
        }
    }

    public void setMaxFailTime(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 13, i);
        }
    }

    public void setObjectType(String str) {
        setStringValue(54, str);
    }

    public void setOpenBoe(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        if (z) {
            _setIntValue(j, 67, 1);
        } else {
            _setIntValue(j, 67, 0);
        }
    }

    public void setPolicyParams(TreeMap<String, Object> treeMap) {
        String strMapToString;
        if (this.mHandle != 0 && treeMap != null && (strMapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(55, strMapToString);
        }
    }

    public void setPreUploadEncryptionMode(int i) {
        String string;
        if (this.mHandle == 0) {
            return;
        }
        if (i == 2 && (string = UUID.randomUUID().toString()) != null && string.length() > 0) {
            _setStringValue(this.mHandle, 420, string);
        }
        _setIntValue(this.mHandle, 74, i);
    }

    public void setPreheatUploader(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 419, i);
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

    public void setSDKConfigDir(String str) {
        if (this.mHandle != 0 && str != null) {
            BDUploadUtil.createDir(str);
            _setStringValue(this.mHandle, 417, str);
            setContextDir(str);
        }
    }

    public void setSDKMaxRetryCount(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 426, i);
    }

    public void setSDKMaxRetryTimeout(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 428, i);
    }

    public void setScenesTag(String str) {
        long j = this.mHandle;
        if (j != 0 && str != null) {
            _setStringValue(j, 85, str);
        }
    }

    public void setServerParameter(String str) {
        long j = this.mHandle;
        if (j != 0 && str != null) {
            _setStringValue(j, 16, str);
        }
    }

    public void setSliceRetryCount(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 5, i);
        }
    }

    public void setSliceSize(int i) {
        long j = this.mHandle;
        if (j != 0 && i > 0) {
            _setIntValue(j, 8, i);
        }
    }

    public void setSliceThreshold(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 402, i);
    }

    public void setSocketNum(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 9, i);
        }
    }

    public void setSpaceName(String str) {
        setStringValue(45, str);
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
        if (this.mHandle != 0 && str != null) {
            setStringValue(46, str);
        }
    }

    public void setEnableCommitUpload(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 401, z ? 1 : 0);
    }

    public void setPreheatUploader(boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 419, z ? 1 : 0);
    }

    public int checkNet(int i, int i2) {
        BDImageUploaderListener bDImageUploaderListener = this.mListener;
        if (bDImageUploaderListener != null) {
            return bDImageUploaderListener.imageUploadCheckNetState(i, i2);
        }
        return 1;
    }

    public void setFileData(int i, byte[][] bArr) {
        long j = this.mHandle;
        if (j != 0 && bArr != null && i > 0) {
            _setFileData(j, i, bArr);
        }
    }

    public void setFileName(int i, String[] strArr) {
        long j = this.mHandle;
        if (j != 0 && strArr != null && i > 0) {
            _setFileName(j, i, strArr);
        }
    }

    public void setFileNum(int i, int i2) {
        long j = this.mHandle;
        if (j != 0 && i > 0) {
            this.mImageNum = i;
            _setFileNum(j, i);
            _setIntValue(this.mHandle, 438, i2);
        }
    }

    public void setFilePath(int i, String[] strArr) {
        long j = this.mHandle;
        if (j != 0 && strArr != null && i > 0) {
            this.mImageNum = i;
            _setFilePaths(j, i, strArr);
            _setIntValue(this.mHandle, 81, 0);
        }
    }

    public void setMediaDataReader(BDMediaDataReader bDMediaDataReader, int i) {
        long j = this.mHandle;
        if (j != 0 && bDMediaDataReader != null && i > 0) {
            _setIntValue(j, 71, i);
            _setIntValue(this.mHandle, 81, 2);
            _setObject(this.mHandle, 201, bDMediaDataReader);
        }
    }

    public void setNetworkType(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, i, i2);
    }

    public void setSpecifiedContentType(int i, String[] strArr) {
        long j = this.mHandle;
        if (j != 0 && strArr != null && i > 0) {
            _setSpecifiedContentType(j, i, strArr);
        }
    }

    public void setStringValue(int i, String str) {
        long j = this.mHandle;
        if (j != 0 && str != null) {
            _setStringValue(j, i, str);
        }
    }

    private void setMediaDataReader(BDMediaDataReader bDMediaDataReader, int i, int i2) {
        if (this.mHandle != 0 && bDMediaDataReader != null && i > 0) {
            setMediaDataReader(bDMediaDataReader, i);
            _setIntValue(this.mHandle, 81, i2);
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
        if (this.mListener != null) {
            if (i == 103) {
                long time = new Date().getTime();
                BDImageUploaderAbstractListener bDImageUploaderAbstractListener = this.mAbstractListener;
                if (bDImageUploaderAbstractListener != null) {
                    bDImageUploaderAbstractListener.onUploadStage(i2, time);
                }
            }
            this.mListener.onLog(i, i2, str);
        }
    }

    public void onNotify(int i, long j, int i2, String str) {
        BDImageInfo bDImageInfo;
        int i3 = 1;
        if (this.mState != 1) {
            return;
        }
        int i4 = (int) j;
        BDImageInfo bDImageInfo2 = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 6) {
                            if (i != 7) {
                                if (i != 123) {
                                    if (i == 124) {
                                        if (i4 != 0) {
                                            i3 = 0;
                                        }
                                    }
                                    Message messageObtainMessage = this.mHandler.obtainMessage();
                                    messageObtainMessage.what = i;
                                    messageObtainMessage.arg1 = i3;
                                    messageObtainMessage.obj = bDImageInfo2;
                                    messageObtainMessage.sendToTarget();
                                }
                                bDImageInfo = new BDImageInfo(null, i2, null, i4, null, null);
                            } else {
                                _getStrByKeyAndIndex(this.mHandle, 415, i4);
                                bDImageInfo = new BDImageInfo(null, i2, str, i4, null, null);
                            }
                        } else {
                            this.mEndTime = System.currentTimeMillis();
                            bDImageInfo = new BDImageInfo(_getStrByKeyAndIndex(this.mHandle, 409, i4), 0L, null, i4, _getStrByKeyAndIndex(this.mHandle, 410, i4), _getStrByKeyAndIndex(this.mHandle, 407, i4));
                        }
                    } else {
                        addLogToManager(_getStringValue(this.mHandle, 100));
                        this.mState = 2;
                    }
                } else {
                    String dnsip = getDNSIP();
                    if (dnsip != null && !dnsip.isEmpty()) {
                        setStringValue(75, dnsip);
                    }
                    addLogToManager(_getStringValue(this.mHandle, 100));
                    this.mState = 2;
                }
            } else {
                bDImageInfo = new BDImageInfo(null, i2, null, i4, null, null);
            }
            i3 = i4;
            bDImageInfo2 = bDImageInfo;
            Message messageObtainMessage2 = this.mHandler.obtainMessage();
            messageObtainMessage2.what = i;
            messageObtainMessage2.arg1 = i3;
            messageObtainMessage2.obj = bDImageInfo2;
            messageObtainMessage2.sendToTarget();
        }
        String dnsip2 = getDNSIP();
        if (dnsip2 != null && !dnsip2.isEmpty()) {
            setStringValue(75, dnsip2);
        }
        addLogToManager(_getStringValue(this.mHandle, 100));
        this.mState = 3;
        i3 = i4;
        Message messageObtainMessage22 = this.mHandler.obtainMessage();
        messageObtainMessage22.what = i;
        messageObtainMessage22.arg1 = i3;
        messageObtainMessage22.obj = bDImageInfo2;
        messageObtainMessage22.sendToTarget();
    }

    public void setCustomNetworkTimeoutParams(int i, int i2, int i3, int i4, int i5) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 422, i);
        _setIntValue(this.mHandle, 423, i2);
        _setIntValue(this.mHandle, 424, i3);
        _setIntValue(this.mHandle, 425, i4);
        _setIntValue(this.mHandle, 427, i5);
    }
}
