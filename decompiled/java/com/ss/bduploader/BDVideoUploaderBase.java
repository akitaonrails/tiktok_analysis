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
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class BDVideoUploaderBase extends BDAbstractUpload implements Handler.Callback {
    public int headerIndex;
    public long mEndTime;
    public long mHandle;
    public Handler mHandler;
    public String[] mHeaders;
    public JSONObject mJsonInfo;
    public final ReentrantReadWriteLock.ReadLock mReadLock;
    public long mStartTime;
    public int mState;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;
    public final ReentrantReadWriteLock mReadWritedLock = new ReentrantReadWriteLock();
    public BDVideoUploaderListener mListener = null;
    public BDVideoUploaderAbstractListener mAbstractListener = null;
    public Lock mHeadersLock = new ReentrantLock();
    public boolean mFinish = false;
    public boolean mEnableVideoPatch = false;
    public int mSimpleRequestConfigOption = 0;
    public int mNoNetBlockOption = 0;

    public static native void _cancelUpload(long j);

    public static native void _close(long j);

    private final native long _create();

    public static native long _getLongValue(long j, int i);

    public static native String _getStrByKeyAndIndex(long j, int i, int i2);

    public static native String _getStringValue(long j, int i);

    public static native void _mergeUpload(long j);

    public static native void _setContext(long j, String str);

    public static native void _setFilePaths(long j, int i, String[] strArr);

    public static native void _setInt64Value(long j, int i, long j2);

    public static native void _setIntValue(long j, int i, int i2);

    public static native void _setObject(long j, int i, Object obj);

    public static native void _setPoster(long j, float f);

    public static native void _setSpecifiedContentType(long j, int i, String[] strArr);

    public static native void _setStringValue(long j, int i, String str);

    public static native void _start(long j);

    public static native void _stop(long j);

    private void setEnableBatch() {
        this.mEnableVideoPatch = true;
        _setIntValue(this.mHandle, 304, 1);
    }

    private void parseLog() {
        if (this.mFinish) {
            return;
        }
        this.mFinish = true;
        addLogToManager(_getStringValue(this.mHandle, 100));
    }

    public void allowMergeUpload() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _mergeUpload(j);
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
                parseLog();
                _close(this.mHandle);
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

    public String getBusinessTag() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            String str = "";
            if (j != 0) {
                String str_getStringValue = _getStringValue(j, 472);
                if (str_getStringValue != null) {
                    str = str_getStringValue;
                }
            }
            this.mWriteLock.unlock();
            return str;
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
        this.mWriteLock.lock();
        String str = BDUploadUtil.sdkConfigDir;
        if (str != null && str.length() > 0) {
            setContextDir(BDUploadUtil.sdkConfigDir);
            setDiskResumeDir(BDUploadUtil.sdkConfigDir);
            setRetryStatesDir(BDUploadUtil.sdkConfigDir);
            if (this.mSimpleRequestConfigOption > 0) {
                setSDKConfigDir(BDUploadUtil.sdkConfigDir);
            }
        }
        try {
            if (this.mHandle != 0) {
                this.mFinish = false;
                this.mState = 1;
                this.mStartTime = System.currentTimeMillis();
                _start(this.mHandle);
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void stop() {
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                _stop(j);
                String dnsip = getDNSIP();
                if (dnsip != null && !dnsip.isEmpty()) {
                    setStringValue(75, dnsip);
                }
                parseLog();
                this.mState = 4;
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public BDVideoUploaderBase() throws Exception {
        this.mState = -1;
        try {
            this.mHandle = _create();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mHandle = 0L;
        }
        long j = this.mHandle;
        if (j == 0) {
            throw new Exception("create native uploader fail:" + ((Object) BDAbstractUpload.mErrorMsg));
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
        this.mHeaders = new String[20];
        int i = 0;
        do {
            this.mHeaders[i] = null;
            i++;
        } while (i < 20);
        this.headerIndex = 0;
        setTraceId(UUID.randomUUID().toString());
        _setIntValue(this.mHandle, 429, BDUploadUtil.xquicAvalilable() ? 1 : 0);
        setBatchVideoId();
    }

    private void setBatchVideoId() {
        String string = UUID.randomUUID().toString();
        if (string == null || string.length() <= 0) {
            return;
        }
        _setStringValue(this.mHandle, 420, string);
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

    private void setDiskResumeDir(String str) {
        if (this.mHandle != 0 && str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(File.separator);
            sbLIZ.append(BDUploadUtil.DiskResumeConfigDir);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            BDUploadUtil.createDir(strLIZIZ);
            _setStringValue(this.mHandle, 303, strLIZIZ);
        }
    }

    private void setRetryStatesDir(String str) {
        if (this.mHandle != 0 && str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(File.separator);
            sbLIZ.append(BDUploadUtil.RetryStatesInfoDir);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            BDUploadUtil.createDir(strLIZIZ);
            _setStringValue(this.mHandle, 433, strLIZIZ);
        }
    }

    private void setSDKConfigDir(String str) {
        if (this.mHandle != 0 && str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(File.separator);
            sbLIZ.append(BDUploadUtil.SDKConfigDir);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            BDUploadUtil.createDir(strLIZIZ);
            _setStringValue(this.mHandle, 417, strLIZIZ);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public JSONObject addLogToManager(String str) {
        JSONObject jSONObject;
        String string = UUID.randomUUID().toString();
        JSONArray jSONArray = null;
        try {
            jSONObject = new JSONObject(str);
            jSONObject.put("dns_version", BDUploadResolver.mDNSVersion);
            jSONObject.put("main_dns_type", BDUploadDNSParser.mGlobalMainType);
            jSONObject.put("main_back_type", BDUploadDNSParser.mGlobalBackType);
            jSONObject.put("back_delayed_time", BDUploadDNSParser.mGlobalBackUpDelayedTime);
            jSONObject.put("expired_time", BDUploadDNSParser.mGlobalDefaultExpiredTime);
            JSONObject jSONObject2 = this.mJsonInfo;
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, this.mJsonInfo.get(next));
                }
            }
            String strLIZIZ = "";
            try {
                this.mHeadersLock.lock();
                for (int i = 0; i < 20; i++) {
                    if (!TextUtils.isEmpty(this.mHeaders[i])) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append("#");
                        sbLIZ.append(this.mHeaders[i]);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                this.mHeadersLock.unlock();
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    jSONObject.put("cdn_headers", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mHeadersLock.unlock();
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            try {
                Object obj = jSONObject.get("video_array");
                if (obj instanceof JSONArray) {
                    jSONArray = (JSONArray) obj;
                    jSONObject.remove("video_array");
                }
                int i2 = JSONObjectProtectorUtils.getInt(jSONObject, "file_num");
                for (int i3 = 0; i3 < i2; i3++) {
                    JSONObject jSONObject3 = new JSONObject(C786410Ut5.J3(jSONObject));
                    jSONObject3.remove("event");
                    jSONObject3.put("event", "bd_video_upload");
                    if (jSONArray != null && jSONArray.length() > i3) {
                        JSONObject jSONObject4 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i3);
                        Iterator<String> itKeys2 = jSONObject4.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            jSONObject3.put(next2, jSONObject4.get(next2));
                        }
                    }
                    jSONObject3.put("uuid", string);
                    UploadEventManager.instance.addEvent(jSONObject3);
                }
                return jSONObject;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        UploadEventManager.instance.addEvent(jSONObject);
        return jSONObject;
    }

    @Override // com.ss.bduploader.BDAbstractUpload
    public String getStringFromExtern(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    return null;
                }
            } else {
                return UUID.randomUUID().toString();
            }
        }
        BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
        if (bDVideoUploaderListener == null) {
            return null;
        }
        return bDVideoUploaderListener.getStringFromExtern(i);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        long j;
        int i = message.what;
        if (this.mNoNetBlockOption != 0 && i == 113) {
            stop();
            return true;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof LogInfo) {
            LogInfo logInfo = (LogInfo) HandlerHook.getMessageObj(message.obj);
            onLogInfoSync(i, logInfo.getCode(), logInfo.getInfo());
            return true;
        }
        if (this.mListener == null) {
            return true;
        }
        BDVideoInfo bDVideoInfo = (BDVideoInfo) HandlerHook.getMessageObj(message.obj);
        if (bDVideoInfo != null) {
            j = bDVideoInfo.mProgress;
        } else {
            j = 0;
        }
        this.mListener.onNotify(i, j, bDVideoInfo);
        return true;
    }

    public void setAbstractListener(BDVideoUploaderAbstractListener bDVideoUploaderAbstractListener) {
        this.mAbstractListener = bDVideoUploaderAbstractListener;
    }

    public void setAliveMaxFailTime(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 22, i);
        }
    }

    public void setBusinessTag(String str) {
        this.mWriteLock.lock();
        try {
            if (this.mHandle != 0 && str != null && str.length() != 0) {
                _setStringValue(this.mHandle, 472, str);
                this.mWriteLock.unlock();
            } else {
                this.mWriteLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void setCustomHttpHeaders(TreeMap<String, Object> treeMap) {
        String strMapToString;
        if (this.mHandle != 0 && treeMap != null && (strMapToString = BDUploadUtil.mapToString(treeMap)) != null) {
            setStringValue(430, strMapToString);
        }
    }

    public void setDiskResumeOption(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 302, i);
    }

    public void setDiskResumeUniqueKey(String str) {
        if (this.mHandle != 0 && str != null && !str.isEmpty()) {
            _setStringValue(this.mHandle, 301, str);
        }
    }

    public void setEnableBigFile(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 83, i);
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

    public void setEnableFiletryHttps(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i != 0 && i != 1) {
                return;
            }
            _setIntValue(j, 25, i);
        }
    }

    public void setEnableHttps(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 19, i);
        }
    }

    public void setEnableKeepAlive(int i) {
        long j = this.mHandle;
        if (j != 0) {
            if (i != 0 && i != 1) {
                return;
            }
            _setIntValue(j, 20, i);
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

    public void setListener(BDVideoUploaderListener bDVideoUploaderListener) {
        this.mListener = bDVideoUploaderListener;
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

    public void setMaxUploadSpeedThresh(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 413, i);
    }

    public void setMediaDataReader(BDMediaDataReader bDMediaDataReader) {
        long j = this.mHandle;
        if (j != 0 && bDMediaDataReader != null) {
            _setIntValue(j, 81, 2);
            _setObject(this.mHandle, 201, bDMediaDataReader);
        }
    }

    public void setObjectType(String str) {
        if (this.mHandle != 0 && str != null && !str.equals("")) {
            setStringValue(54, str);
        }
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

    public void setPathName(String str) {
        setStringValue(0, str);
    }

    public void setPoster(float f) {
        long j = this.mHandle;
        if (j != 0 && f >= 0.0f) {
            _setPoster(j, f);
        }
    }

    public void setPreUploadEncryptionMode(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, 74, i);
    }

    public void setRWTimeout(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 7, i);
        }
    }

    public void setResponseTimeOut(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 76, i);
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

    public void setSimpleRequestConfigOption(int i) {
        if (this.mHandle == 0) {
            return;
        }
        this.mSimpleRequestConfigOption = i;
    }

    public void setSliceReTryCount(int i) {
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

    public void setSocketNum(int i) {
        long j = this.mHandle;
        if (j != 0 && i >= 0) {
            _setIntValue(j, 9, i);
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

    public int checkNet(int i, int i2) {
        BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
        if (bDVideoUploaderListener == null) {
            return 1;
        }
        int iVideoUploadCheckNetState = bDVideoUploaderListener.videoUploadCheckNetState(i, i2);
        if (this.mNoNetBlockOption != 0 && i != 0 && iVideoUploadCheckNetState == 2) {
            Message messageObtainMessage = this.mHandler.obtainMessage();
            messageObtainMessage.what = 113;
            messageObtainMessage.sendToTarget();
        }
        return iVideoUploadCheckNetState;
    }

    public void setExternFileReader(BDMultiExternalFileReader bDMultiExternalFileReader, int i) {
        if (this.mHandle != 0 && bDMultiExternalFileReader != null && i > 0) {
            setEnableBatch();
            _setIntValue(this.mHandle, 71, i);
            _setIntValue(this.mHandle, 81, 1);
            _setObject(this.mHandle, 200, bDMultiExternalFileReader);
        }
    }

    public void setFilePath(int i, String[] strArr) {
        if (this.mHandle != 0 && strArr != null && i > 0) {
            setEnableBatch();
            _setFilePaths(this.mHandle, i, strArr);
            _setIntValue(this.mHandle, 81, 0);
        }
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
        if (i == 102) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.mHeadersLock.lock();
                    if (this.headerIndex >= 20) {
                        this.headerIndex = 0;
                    }
                    String[] strArr = this.mHeaders;
                    int i3 = this.headerIndex;
                    strArr[i3] = str;
                    this.headerIndex = i3 + 1;
                    this.mHeadersLock.unlock();
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.mHeadersLock.unlock();
                    throw th;
                }
            }
        } else {
            if (i == 104) {
                if (this.mAbstractListener != null) {
                    new HashMap(20);
                    try {
                        JSONObject jSONObject2 = new JSONObject(str);
                        JSONObject jSONObject3 = this.mJsonInfo;
                        if (jSONObject3 != null) {
                            Iterator<String> itKeys = jSONObject3.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                jSONObject2.put(next, this.mJsonInfo.get(next));
                            }
                        }
                        BDUploadUtil.jsonToHashMap(jSONObject2);
                        return;
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                return;
            }
            if (i == 103) {
                long time = new Date().getTime() / 1000;
                BDVideoUploaderListener bDVideoUploaderListener = this.mListener;
                if (bDVideoUploaderListener != null) {
                    bDVideoUploaderListener.onUploadVideoStage(i2, time);
                }
            } else if (i == 107) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    jSONObject = null;
                }
                UploadEventManager.instance.addEvent(jSONObject);
                BDVideoUploaderAbstractListener bDVideoUploaderAbstractListener = this.mAbstractListener;
                if (bDVideoUploaderAbstractListener != null) {
                    bDVideoUploaderAbstractListener.onEventLog();
                }
            }
        }
        BDVideoUploaderListener bDVideoUploaderListener2 = this.mListener;
        if (bDVideoUploaderListener2 != null) {
            bDVideoUploaderListener2.onLog(i, i2, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNotify(int r28, long r29, int r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bduploader.BDVideoUploaderBase.onNotify(int, long, int, java.lang.String):void");
    }
}
