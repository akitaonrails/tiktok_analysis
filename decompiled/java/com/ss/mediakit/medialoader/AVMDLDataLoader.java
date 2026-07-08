package com.ss.mediakit.medialoader;

import X.C08TM;
import X.C0VSJ;
import X.C0W9U;
import X.C1478160oZK;
import X.C1495520p1K;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C274520ApO;
import X.C786410Ut5;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.mediakit.image.MIOImageClient;
import com.ss.mediakit.net.AVMDLDNSInfo;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.mediakit.net.AVMDLMultiNetwork;
import com.ss.mediakit.net.IPCache;
import com.ss.mediakit.net.NQE;
import com.ss.mediakit.net.NetworkState;
import com.ss.mediakit.utils.AVMDLDeviceUtil;
import com.ss.mediakit.vcnlib.VcnlibloadWrapper;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class AVMDLDataLoader implements Handler.Callback {
    public static final int KeyIsLoaderFactoryP2PLevel = 8216;
    public static boolean isSupportQueryEncode = true;
    public static Context mGlobalApplicationContext = null;
    public static volatile AVMDLDataLoader mInstance = null;
    public static volatile boolean mIsAsyncLoadPlugin = false;
    public static Boolean mIsByteMediaNetInit = Boolean.FALSE;
    public static volatile boolean mIsLibraryLoaded = false;
    public static volatile boolean mIsMdlByteMediaNetPluginLoaded = false;
    public static volatile boolean mIsMdlv2PluginLoaded = false;
    public static String mLoadFailMsg = "";
    public boolean isSupportGetAuth;
    public AVMDLDataLoaderConfigure mConfigure;
    public long mEndTime;
    public LoaderListener mEventListener;
    public long mHandle;
    public Handler mHandler;
    public AVMDLDataLoaderListener mImageListener;
    public AVMDLDataLoaderListener mLiveListener;
    public Handler mLogHandler;
    public Thread mMsgThread;
    public final ReentrantReadWriteLock.ReadLock mReadLock;
    public final ReentrantReadWriteLock mReadWritedLock;
    public long mSartTime;
    public AVMDLStartCompleteListener mStartCompleteListener;
    public volatile int mState;
    public AVMDLTaskEventListener mTaskListener;
    public AVMDLDataLoaderListener mVodListener;
    public Map<String, AVMDLCopyOperation> mWaitingCopyItem;
    public final ReentrantReadWriteLock.WriteLock mWriteLock;

    public static class IOTaskModel {
        public int bitrate;
        public String fileId;
        public String fileKey;
        public String filePath;
        public String groupId;
        public boolean isDash;
        public boolean isSelectedLadder;
        public String rawKey;
        public int resType;
        public String subtag;
        public String tag;
        public String traceId;
        public String[] urls;
        public boolean useLocalServer;

        public String getExtendInfo() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(this.groupId)) {
                    jSONObject.put("gid", this.groupId);
                }
                JSONArray jSONArray = new JSONArray();
                for (String str : this.urls) {
                    jSONArray.put(str);
                }
                jSONObject.put("urls", jSONArray);
                if (!TextUtils.isEmpty(this.tag)) {
                    jSONObject.put("tag", this.tag);
                }
                if (!TextUtils.isEmpty(this.subtag)) {
                    jSONObject.put("stag", this.subtag);
                }
                if (!TextUtils.isEmpty(this.filePath)) {
                    jSONObject.put("filePath", this.filePath);
                }
                if (this.isDash) {
                    if (!TextUtils.isEmpty(this.fileId)) {
                        jSONObject.put("fileId", this.fileId);
                    }
                    int i = this.bitrate;
                    if (i > 0) {
                        jSONObject.put("bitrate", i);
                    }
                }
                return C786410Ut5.J3(jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }

        public boolean isValid() {
            String[] strArr;
            if (!TextUtils.isEmpty(this.traceId) && !TextUtils.isEmpty(this.rawKey) && !TextUtils.isEmpty(this.fileKey) && (strArr = this.urls) != null && strArr.length != 0) {
                String str = strArr[0];
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                if ((str.startsWith("http://") || str.startsWith("https://")) && !str.contains(".m3u8?") && !str.endsWith(".m3u8") && !str.contains(".m3u?") && !str.endsWith(".m3u") && !str.endsWith(".mpd") && !str.contains(".mpd?") && !str.startsWith("http://127.0.0.1") && !str.startsWith("http://localhost")) {
                    if (this.resType != 2) {
                        return true;
                    }
                    TextUtils.isEmpty(this.fileId);
                    return true;
                }
            }
            return false;
        }

        public IOTaskModel(String str, String str2, String str3, boolean z, int i, boolean z2, boolean z3) {
            this.traceId = str;
            this.fileKey = str3;
            this.rawKey = TextUtils.isEmpty(str2) ? str3 : str2;
            this.isDash = z;
            this.resType = i;
            this.isSelectedLadder = z2;
            this.useLocalServer = z3;
        }
    }

    public static native void _addDataSource(long j, int i, String str);

    public static native int _addImageTask(long j, String str);

    public static native void _cancel(long j, String str);

    public static native void _cancelAll(long j);

    public static native void _cancelAllPreloadWaitReqs(long j);

    public static native int _cancelImageTask(long j, String str);

    public static native void _cleanCacheDir(long j, long j2);

    public static native void _cleanSpecifiedCacheDir(long j, String str, int i);

    public static native void _clearAllCaches(long j);

    public static native long _clearAndGetCachesByUsedTime(long j, long j2, int i);

    public static native void _clearCachesByUsedTime(long j, long j2);

    public static native void _clearNetinfoCache(long j);

    public static native void _close(long j);

    public static native int _closeImageStream(long j, String str);

    public static native int _copyFile(long j, String str, String str2);

    public static native long _copyFile64(long j, String str, String str2);

    public static native int _copyFileWithCustomDir(long j, String str, String str2, String str3);

    public static native long _copyFileWithCustomDir64(long j, String str, String str2, String str3);

    public static native int _copyFileWithForceFlag(long j, String str, String str2, int i);

    public static native long _copyFileWithForceFlag64(long j, String str, String str2, int i);

    private final native long _create();

    public static native void _downloadResource(long j, String str);

    public static native String _encodeUrl(String str, int i);

    public static native void _forceClearAllCaches(long j);

    public static native void _forceRemoveCacheFile(long j, String str);

    public static native String _getAuth(long j, String str);

    public static native String _getCDNLog(long j, String str);

    public static native long _getContinueCacheSize(long j, String str, int i, long j2);

    public static native int _getIsFileCacheComplete(long j, String str);

    public static native long _getLongValue(long j, int i);

    public static native long _getLongValueByStr(long j, String str, int i);

    public static native long _getLongValueByStrStr(long j, String str, String str2, int i);

    public static native String _getStringValue(long j, int i);

    public static native String _getStringValueByStr(long j, String str, int i);

    public static native String _getStringValueByStrStr(long j, String str, String str2, int i);

    public static native int _haveRunningPlayTask(long j, String str);

    public static native String _ioPrepare(long j, String str, String str2, String str3, boolean z, int i, boolean z2, boolean z3, String str4);

    public static native void _makeFileAutoDeleteFlag(long j, String str, int i);

    public static native String _makeTsFileKey(String str, String str2);

    public static native void _notifyPlayStart(long j, String str);

    public static native String _notifyPlayStop(long j, String str, int i);

    public static native int _onCellularAlwaysUp(long j, long j2, int i);

    public static native int _onInitMultiNetworkEnv(long j, int i);

    public static native void _p2pPredown(long j, String str);

    public static native void _preConnectByHost(long j, String str, int i);

    public static native void _preloadGroupResource(long j, String str, String str2, int i, int i2);

    public static native void _preloadResource(long j, String str, int i);

    public static native void _preloadResourceWithOffset(long j, String str, int i, int i2);

    public static native long _readImageStream(long j, String str, byte[] bArr, int i, long j2, int i2);

    public static native void _removeCacheFile(long j, String str);

    public static native void _removeCacheFileInDirPath(long j, String str, String str2);

    public static native void _removeOfflineFilePath(long j, boolean z, String str);

    public static native void _resetPreloadTraceId(long j, String str);

    public static native void _resumeFileWriteIO(long j);

    public static native void _setInt64Value(long j, int i, long j2);

    public static native void _setInt64ValueByStrKey(long j, int i, String str, long j2);

    public static native void _setIntValue(long j, int i, int i2);

    public static native void _setStringValue(long j, int i, String str);

    public static native int _start(long j);

    public static native void _stop(long j);

    public static native void _suspendedDownload(long j, String str);

    public static native int _tryDownloadPlayReqByKey(long j, String str);

    public static native void _updateDNSInfo(long j, String str, String str2, long j2, String str3, int i);

    public static native int _writeDataToFile(long j, String str, long j2, long j3, int i, byte[] bArr);

    private boolean isNotifyInfo(int i) {
        return i == 4 || i == 20 || i == 50 || i == 8 || i == 3 || i == 21 || i == 51 || i == 7 || i == 22 || i == 52 || i == 901 || i == 24 || i == 902 || i == 1100 || i == 1101;
    }

    public static boolean isVCBasekitStaticLinked() {
        return false;
    }

    public static native void nativeAddVodNetworkStateCallback(long j, NetworkState.NetworkStateCallback networkStateCallback, String str);

    public static native NetworkState nativeGetVodNetworkState(long j);

    public static native void nativeRemoveVodNetworkStateCallback(long j, String str);

    public static void setOkhttpClient(C1495520p1K c1495520p1K) {
    }

    public int start() {
        return com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_feed_lancet_PlayerLancet_start(this);
    }

    public static Context getApplicationContext() {
        Context context;
        synchronized (AVMDLDataLoader.class) {
            try {
                context = mGlobalApplicationContext;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return context;
    }

    public static AVMDLDataLoader getInstance() {
        if (mInstance == null) {
            synchronized (AVMDLDataLoader.class) {
                try {
                    if (mInstance == null) {
                        try {
                            mInstance = new AVMDLDataLoader(null);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            mInstance = null;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public static synchronized String getLoadFailMsg() {
        return mLoadFailMsg;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String getProxyUrl() {
        /*
            r5 = this;
            java.lang.String r0 = "----try get proxyaddr"
            java.lang.String r3 = "AVMDLProxy"
            com.ss.mediakit.medialoader.AVMDLLog.d(r3, r0)
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r4 = java.lang.System.getProperty(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "proxy host:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.ss.mediakit.medialoader.AVMDLLog.d(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L76
            java.lang.String r0 = "http.proxyPort"
            java.lang.String r2 = java.lang.System.getProperty(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "proxy port:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.ss.mediakit.medialoader.AVMDLLog.d(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L76
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "http://"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "/"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
        L62:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "****end get proxyaddr, result:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.ss.mediakit.medialoader.AVMDLLog.d(r3, r0)
            return r2
        L76:
            r2 = 0
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.getProxyUrl():java.lang.String");
    }

    private void hijack() {
        AVMDLLog.d("ttmdljava", "----hijack start");
        AVMDLDNSParser.processHijack();
        AVMDLLog.d("ttmdljava", "hijack clear net cache: ");
        clearNetinfoCache();
        AVMDLLog.d("ttmdljava", "****hijack end");
    }

    public static synchronized int initDependency() {
        C08TM.LIZ();
        VcnlibloadWrapper.tryLoadVcnlib();
        VcnlibloadWrapper.tryLoadVcnverifylib();
        return 0;
    }

    private void initNativeHandle() {
        if (this.mHandle != 0) {
            return;
        }
        try {
            this.mHandle = _create();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mHandle = 0L;
        }
        if (this.mHandle == 0 || this.mHandler != null) {
            return;
        }
        if (Looper.myLooper() != null) {
            this.mHandler = new BPEAHandler(this);
        } else {
            this.mHandler = new BPEAHandler(Looper.getMainLooper(), this);
        }
    }

    public static synchronized int initWithLibraryManager() {
        if (mIsLibraryLoaded) {
            return 0;
        }
        if (AVMDLLibraryManager.loadLibraries()) {
            mIsLibraryLoaded = true;
        }
        return mIsLibraryLoaded ? 0 : -1;
    }

    public static synchronized void loadAVMDLBaseLibrary() {
        initDependency();
        try {
            INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdlbase");
            mIsLibraryLoaded = true;
            mIsMdlv2PluginLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private int testFileIOSpeed() {
        double dTestFileIO;
        if (TextUtils.isEmpty(this.mConfigure.mCacheDir)) {
            return -1;
        }
        String str = this.mConfigure.mCacheDir;
        String strK4 = str.charAt(str.length() - 1) == '/' ? C786410Ut5.k4(Locale.US, "%siospeed", new Object[]{this.mConfigure.mCacheDir}) : C786410Ut5.k4(Locale.US, "%s/iospeed", new Object[]{this.mConfigure.mCacheDir});
        C0VSJ c0vsj = new C0VSJ(strK4);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        C0VSJ c0vsj2 = new C0VSJ(strK4, "iospeed.cach");
        if (c0vsj2.exists()) {
            c0vsj2.delete();
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(c0vsj2, "rw");
            int i = 0;
            double d = 0.0d;
            double d2 = 0.0d;
            do {
                try {
                    try {
                        dTestFileIO = testFileIO(strK4, i, randomAccessFile);
                        try {
                            AVMDLLog.d("BENCHMARKIO", C786410Ut5.k4(Locale.US, "num:%d result:%f", new Object[]{Integer.valueOf(i), Double.valueOf(dTestFileIO)}));
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("test fileio exception:");
                            sbLIZ.append(e);
                            AVMDLLog.d("BENCHMARKIO", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    dTestFileIO = 0.0d;
                }
                if (dTestFileIO > 0.0d && i >= 20) {
                    try {
                        d2 += dTestFileIO;
                        d += 1.0d;
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
                i++;
            } while (i < 30);
            randomAccessFile.close();
            c0vsj2.delete();
            if (d > 0.0d) {
                return (int) (d2 / d);
            }
            return 0;
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("create accefile exception:");
            sbLIZ2.append(e4);
            AVMDLLog.d("BENCHMARKIO", C2188811AlT.LIZIZ(sbLIZ2));
            return -1;
        }
    }

    public static synchronized boolean tryLoadByteMediaNetLoaderPlugin() {
        return mIsMdlByteMediaNetPluginLoaded;
    }

    private void tryLoadP2pPluginInternal() {
        if (mIsAsyncLoadPlugin && mIsMdlv2PluginLoaded && this.mConfigure.mLoadPcdnInterval <= 0) {
            try {
                INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdlp2pv2");
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void cancelAll() {
        if (this.mState != 1) {
            return;
        }
        Lock lock = getLock(2);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cancelAll(j);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void cancelAllPreloadWaitReqs() {
        if (this.mState != 1) {
            return;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cancelAllPreloadWaitReqs(j);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void clearAllCaches() {
        if (this.mState != 1) {
            return;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _clearAllCaches(j);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void clearNetinfoCache() {
        if (this.mState != 1) {
            return;
        }
        IPCache.getInstance().clear();
        Lock lock = getLock(4);
        lock.lock();
        try {
            try {
                _clearNetinfoCache(this.mHandle);
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void close() {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                return;
            }
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _close(j);
                    this.mHandle = 0L;
                    this.mState = 5;
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        this.mHandler = null;
                    }
                    Handler handler2 = this.mLogHandler;
                    if (handler2 != null) {
                        handler2.removeCallbacksAndMessages(null);
                        this.mLogHandler.getLooper().quit();
                        this.mLogHandler = null;
                        this.mMsgThread = null;
                    }
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public int com_ss_mediakit_medialoader_AVMDLDataLoader__start$___twin___() {
        if (this.mState == 1) {
            return 0;
        }
        initNativeHandle();
        initLogThread(this);
        if (!enableThreadMerge()) {
            new BPEAThread(new Runnable() { // from class: com.ss.mediakit.medialoader.AVMDLDataLoader.3
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("AVMDLDataLoader@445f.start$1");
                    com_ss_mediakit_medialoader_AVMDLDataLoader$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("AVMDLDataLoader@445f.start$1");
                }

                public void com_ss_mediakit_medialoader_AVMDLDataLoader$3__run$___twin___() {
                    AVMDLLog.d("AVMDLDataLoader", "[tm]start native mdl in temporary thread");
                    AVMDLDataLoader.this.startInternal();
                }

                public static void com_ss_mediakit_medialoader_AVMDLDataLoader$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    try {
                        anonymousClass3.com_ss_mediakit_medialoader_AVMDLDataLoader$3__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            }).start();
        }
        return 0;
    }

    public boolean enableThreadMerge() {
        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = this.mConfigure;
        return aVMDLDataLoaderConfigure != null && aVMDLDataLoaderConfigure.mEnableJavaThreadMerge > 0;
    }

    public void forceClearAllCaches() {
        if (this.mState != 1) {
            return;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _forceClearAllCaches(j);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public long getAllCacheSize() {
        long j_getLongValue = -1;
        if (this.mState != 1) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_getLongValue = _getLongValue(j, 100);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return j_getLongValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public AVMDLDataLoaderConfigure getConfig() {
        if (this.mState != 1) {
            return null;
        }
        return this.mConfigure;
    }

    public Looper getGlobalLooper() {
        Handler handler = this.mLogHandler;
        if (handler != null) {
            return handler.getLooper();
        }
        return null;
    }

    public String getLocalAddr() {
        String str_getStringValue = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str_getStringValue = _getStringValue(j, 4);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return str_getStringValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void handleLoadPcdn() {
        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = this.mConfigure;
        if (aVMDLDataLoaderConfigure == null) {
            C786410Ut5.LJLIIL(30000L, this.mLogHandler, new Runnable() { // from class: com.ss.mediakit.medialoader.AVMDLDataLoader.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("AVMDLDataLoader@445f.handleLoadPcdn$1");
                    com_ss_mediakit_medialoader_AVMDLDataLoader$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("AVMDLDataLoader@445f.handleLoadPcdn$1");
                }

                public void com_ss_mediakit_medialoader_AVMDLDataLoader$1__run$___twin___() {
                    AVMDLDataLoader.this.handleLoadPcdn();
                }

                public static void com_ss_mediakit_medialoader_AVMDLDataLoader$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_ss_mediakit_medialoader_AVMDLDataLoader$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
            return;
        }
        if (aVMDLDataLoaderConfigure.mLoadPcdnInterval > 0 && mIsMdlv2PluginLoaded) {
            try {
                INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("avmdlp2pv2");
                setIntValue(9301, 1);
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public boolean isRunning() {
        return this.mState == 1;
    }

    public int onInitMultiNetworkEnv() {
        AVMDLLog.d("AVMDLDataLoader", "start on init multinetwork env");
        Lock lock = getLock(4);
        lock.lock();
        int i_onInitMultiNetworkEnv = -1;
        try {
            long j = this.mHandle;
            if (j != 0) {
                i_onInitMultiNetworkEnv = _onInitMultiNetworkEnv(j, Build.VERSION.SDK_INT);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
        lock.unlock();
        AVMDLLog.d("AVMDLDataLoader", "end on init multinetwork env");
        return i_onInitMultiNetworkEnv;
    }

    public void resumeFileWriteIO() {
        if (this.mState != 1) {
            return;
        }
        AVMDLLog.d("AVMDLDataLoader", "resume file write io: ");
        this.mWriteLock.lock();
        try {
            if (this.mConfigure.mMaxFileMemCacheSize > 0) {
                _resumeFileWriteIO(this.mHandle);
                this.mConfigure.mMaxFileMemCacheSize = 0;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
    }

    public void resumePreConnect() {
        setIntValue(8223, 0);
    }

    public void startInternal() {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1 && this.mHandle != 0) {
                tryLoadP2pPluginInternal();
                setConfigureInternal(this.mConfigure);
                if (_start(this.mHandle) >= 0) {
                    this.mState = 1;
                    NQE.getInstance().init(2);
                    MIOImageClient.getInstance().notifyMDLStart();
                }
            }
            this.mWriteLock.unlock();
            if (this.mConfigure.mEnableBenchMarkIOSpeed > 0) {
                int iTestFileIOSpeed = testFileIOSpeed();
                AVMDLLog.d("BENCHMARKIO", C786410Ut5.k4(Locale.US, "test io average speed:%d", new Object[]{Integer.valueOf(iTestFileIOSpeed)}));
                if (iTestFileIOSpeed > 0) {
                    setIntValue(1508, iTestFileIOSpeed);
                }
            }
            AVMDLStartCompleteListener aVMDLStartCompleteListener = this.mStartCompleteListener;
            if (aVMDLStartCompleteListener != null) {
                aVMDLStartCompleteListener.onStartComplete();
            }
            if (this.mState == 1) {
                AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = this.mConfigure;
                if (aVMDLDataLoaderConfigure.mEnableCellularUp > 0) {
                    if (aVMDLDataLoaderConfigure.mCellularUpAsyncDelay <= 0) {
                        AVMDLLog.d("AVMDLDataLoader", "start sync try up cellular");
                        AVMDLMultiNetwork.alwayUpCellular(getApplicationContext());
                        AVMDLLog.d("AVMDLDataLoader", "end sync try up cellular");
                    } else {
                        Handler handler = this.mLogHandler;
                        if (handler != null) {
                            C786410Ut5.LJLIIL(this.mConfigure.mCellularUpAsyncDelay * LSPassThroughRecordSizeConfig.DEFAULT, handler, new Runnable() { // from class: com.ss.mediakit.medialoader.AVMDLDataLoader.4
                                @Override // java.lang.Runnable
                                public void run() {
                                    C1C7U.LIZ("AVMDLDataLoader@445f.startInternal$1");
                                    com_ss_mediakit_medialoader_AVMDLDataLoader$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                    C1C7U.LIZIZ("AVMDLDataLoader@445f.startInternal$1");
                                }

                                public void com_ss_mediakit_medialoader_AVMDLDataLoader$4__run$___twin___() {
                                    AVMDLLog.d("AVMDLDataLoader", "start async try up cellular");
                                    AVMDLMultiNetwork.alwayUpCellular(AVMDLDataLoader.getApplicationContext());
                                    AVMDLLog.d("AVMDLDataLoader", "end async try up cellular");
                                }

                                public static void com_ss_mediakit_medialoader_AVMDLDataLoader$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                                    try {
                                        anonymousClass4.com_ss_mediakit_medialoader_AVMDLDataLoader$4__run$___twin___();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        if (!C2179971ATj.LIZ(th)) {
                                            throw th;
                                        }
                                    }
                                }
                            });
                        } else {
                            AVMDLLog.d("AVMDLDataLoader", "mLogHandler is null, async up cellular fail");
                        }
                    }
                }
            }
            AVMDLMultiNetwork.registerNetworkChangeCallback(getApplicationContext());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void stop() {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _stop(j);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void suspendPreconnect() {
        setIntValue(8223, 1);
    }

    public static boolean tryLoadVcnverifylib() {
        if (VcnlibloadWrapper.tryLoadVcnlib()) {
            AVMDLLog.d("vcn", "load vcnverify suc");
            return true;
        }
        AVMDLLog.d("vcn", "load vcnverify fail");
        return false;
    }

    public boolean isLoadedMDLv2() {
        return mIsMdlv2PluginLoaded;
    }

    public AVMDLDataLoader(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) throws Exception {
        this.mState = -1;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        this.mMsgThread = null;
        this.isSupportGetAuth = true;
        this.mStartCompleteListener = null;
        this.mWaitingCopyItem = new HashMap();
        this.mTaskListener = null;
        initNativeHandle();
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        if (this.mHandle != 0) {
            if (aVMDLDataLoaderConfigure != null) {
                this.mConfigure = aVMDLDataLoaderConfigure;
            }
            this.mState = 0;
            this.isSupportGetAuth = true;
            return;
        }
        throw new Exception("create native mdl fail");
    }

    public static void INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    private void _copyInternal(AVMDLCopyOperation aVMDLCopyOperation) {
        long jCopyFile;
        if (TextUtils.isEmpty(aVMDLCopyOperation.mCustomDir)) {
            jCopyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath, aVMDLCopyOperation.mForceCopyUnfinished);
        } else {
            jCopyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mCustomDir, aVMDLCopyOperation.mDestPath);
        }
        AVMDLFileInfo cacheInfo = getCacheInfo(aVMDLCopyOperation.mFileKey);
        if (cacheInfo == null) {
            String str = aVMDLCopyOperation.mFileKey;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file info null ");
            sbLIZ.append(jCopyFile);
            onCopyFinish(str, AVMDLCopyResult.getCustomError(C2188811AlT.LIZIZ(sbLIZ)), aVMDLCopyOperation.mListener);
            return;
        }
        AVMDLCopyOperationListener aVMDLCopyOperationListener = aVMDLCopyOperation.mListener;
        if (aVMDLCopyOperationListener != null) {
            aVMDLCopyOperationListener.onFileInfo(cacheInfo);
        }
        if (jCopyFile != cacheInfo.mCacheSize && jCopyFile != cacheInfo.mContentLenght && jCopyFile != 0) {
            String str2 = aVMDLCopyOperation.mFileKey;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("copy error ");
            sbLIZ2.append(jCopyFile);
            onCopyFinish(str2, AVMDLCopyResult.getCustomError(C2188811AlT.LIZIZ(sbLIZ2)), aVMDLCopyOperation.mListener);
            return;
        }
        onCopyFinish(aVMDLCopyOperation.mFileKey, AVMDLCopyResult.CR_SUCCESS, aVMDLCopyOperation.mListener);
    }

    public static int com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_feed_lancet_PlayerLancet_start(AVMDLDataLoader aVMDLDataLoader) {
        int iLJJIJIL;
        if (((Boolean) C274520ApO.LIZ.getValue()).booleanValue() && (iLJJIJIL = C1478160oZK.LIZ().LJJIJIL()) == 0) {
            return iLJJIJIL;
        }
        return aVMDLDataLoader.com_ss_mediakit_medialoader_AVMDLDataLoader__start$___twin___();
    }

    private void copyInternal(AVMDLCopyOperation aVMDLCopyOperation) {
        AVMDLCopyResult aVMDLCopyResultTryToExportFileOnCacheDuration;
        if (aVMDLCopyOperation != null) {
            if (!TextUtils.isEmpty(aVMDLCopyOperation.mFileKey) && !TextUtils.isEmpty(aVMDLCopyOperation.mDestPath)) {
                this.mWriteLock.lock();
                try {
                    try {
                        long j = this.mHandle;
                        if (j != 0) {
                            int i_getIsFileCacheComplete = _getIsFileCacheComplete(j, aVMDLCopyOperation.mFileKey);
                            if (i_getIsFileCacheComplete == 1) {
                                _copyInternal(aVMDLCopyOperation);
                            } else if (i_getIsFileCacheComplete == -1) {
                                onCopyFinish(aVMDLCopyOperation.mFileKey, AVMDLCopyResult.CR_FILE_HAVE_HOLE, aVMDLCopyOperation.mListener);
                            } else if (aVMDLCopyOperation.mForceCopyUnfinished) {
                                _copyInternal(aVMDLCopyOperation);
                            } else if (aVMDLCopyOperation.mWaitIfCaching) {
                                if (aVMDLCopyOperation.mMinDurationMs > 0 && (aVMDLCopyResultTryToExportFileOnCacheDuration = tryToExportFileOnCacheDuration(aVMDLCopyOperation)) != null && aVMDLCopyResultTryToExportFileOnCacheDuration.isSuccess()) {
                                    onCopyFinish(aVMDLCopyOperation.mFileKey, aVMDLCopyResultTryToExportFileOnCacheDuration, aVMDLCopyOperation.mListener);
                                    this.mWriteLock.unlock();
                                    return;
                                } else if (_haveRunningPlayTask(this.mHandle, aVMDLCopyOperation.mFileKey) > 0) {
                                    this.mWaitingCopyItem.put(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation);
                                } else {
                                    onCopyFinish(aVMDLCopyOperation.mFileKey, AVMDLCopyResult.CR_NO_RUNNING_TASK, aVMDLCopyOperation.mListener);
                                }
                            } else if (aVMDLCopyOperation.mMinDurationMs > 0) {
                                onCopyFinish(aVMDLCopyOperation.mFileKey, tryToExportFileOnCacheDuration(aVMDLCopyOperation), aVMDLCopyOperation.mListener);
                            } else {
                                onCopyFinish(aVMDLCopyOperation.mFileKey, AVMDLCopyResult.CR_INVALID_PARAM, aVMDLCopyOperation.mListener);
                            }
                        }
                    } catch (UnsatisfiedLinkError e) {
                        TryCatchGuardChecker.doCheck(e);
                        e.printStackTrace();
                        onCopyFinish(aVMDLCopyOperation.mFileKey, AVMDLCopyResult.CR_MDL_NOT_RUNNING, aVMDLCopyOperation.mListener);
                    }
                    this.mWriteLock.unlock();
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.mWriteLock.unlock();
                    throw th;
                }
            }
            onCopyFinish(aVMDLCopyOperation.mFileKey, AVMDLCopyResult.CR_INVALID_PARAM, aVMDLCopyOperation.mListener);
        }
    }

    private String encodeUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private Lock getLock(int i) {
        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure;
        if (mIsMdlv2PluginLoaded && (aVMDLDataLoaderConfigure = this.mConfigure) != null) {
            if ((i & aVMDLDataLoaderConfigure.mEnableDataLoaderLockOpt) == 0) {
                return this.mWriteLock;
            }
            return this.mReadLock;
        }
        return this.mWriteLock;
    }

    private void handleCopyMsg(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        AVMDLCopyOperation aVMDLCopyOperation;
        AVMDLCopyResult aVMDLCopyResultTryToExportFileOnCacheDuration;
        if (aVMDLDataLoaderNotifyInfo != null && !TextUtils.isEmpty(aVMDLDataLoaderNotifyInfo.logInfo)) {
            int i = aVMDLDataLoaderNotifyInfo.what;
            if (i == 3 || i == 51) {
                String[] strArrSplit = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                if (strArrSplit.length < 4) {
                    return;
                }
                long j = CastLongProtector.parseLong(strArrSplit[0]);
                long j2 = CastLongProtector.parseLong(strArrSplit[1]);
                if (j2 <= 0 && aVMDLDataLoaderNotifyInfo.what != 4) {
                    return;
                }
                String str = strArrSplit[2];
                TextUtils.isEmpty(str);
                if (this.mWaitingCopyItem.containsKey(str) && (aVMDLCopyOperation = this.mWaitingCopyItem.get(str)) != null && !TextUtils.isEmpty(aVMDLCopyOperation.mFileKey)) {
                    if (j == j2) {
                        if (copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath, aVMDLCopyOperation.mForceCopyUnfinished) == 0) {
                            onCopyFinish(aVMDLCopyOperation.mFileKey, AVMDLCopyResult.CR_SUCCESS, aVMDLCopyOperation.mListener);
                            return;
                        } else {
                            onCopyFinish(aVMDLCopyOperation.mFileKey, AVMDLCopyResult.CR_FAILED, aVMDLCopyOperation.mListener);
                            return;
                        }
                    }
                    if (aVMDLCopyOperation.mMinDurationMs > 0 && (aVMDLCopyResultTryToExportFileOnCacheDuration = tryToExportFileOnCacheDuration(aVMDLCopyOperation)) != null && aVMDLCopyResultTryToExportFileOnCacheDuration.isSuccess()) {
                        onCopyFinish(aVMDLCopyOperation.mFileKey, aVMDLCopyResultTryToExportFileOnCacheDuration, aVMDLCopyOperation.mListener);
                    } else if (aVMDLDataLoaderNotifyInfo.what == 51 && _haveRunningPlayTask(this.mHandle, aVMDLCopyOperation.mFileKey) <= 0) {
                        onCopyFinish(aVMDLCopyOperation.mFileKey, AVMDLCopyResult.CR_FILE_NOT_CACHING, aVMDLCopyOperation.mListener);
                    }
                }
            }
        }
    }

    private void handleImageMsg(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        AVMDLDataLoaderListener aVMDLDataLoaderListener = this.mImageListener;
        if (aVMDLDataLoaderListener != null) {
            aVMDLDataLoaderListener.onNotify(aVMDLDataLoaderNotifyInfo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int init(boolean r5) {
        /*
            java.lang.Class<com.ss.mediakit.medialoader.AVMDLDataLoader> r4 = com.ss.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r4)
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            if (r0 == 0) goto La
            monitor-exit(r4)
            return r3
        La:
            com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r5     // Catch: java.lang.Throwable -> L5f
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L56
            X.C08TM.LIZ()     // Catch: java.lang.Throwable -> L5f
            com.ss.mediakit.vcnlib.VcnlibloadWrapper.tryLoadVcnlib()     // Catch: java.lang.Throwable -> L5f
            loadAVMDLBaseLibrary()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "avmdl"
            INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(r0)     // Catch: java.lang.Throwable -> L22 java.lang.UnsatisfiedLinkError -> L24
            r0 = 1
            com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r0     // Catch: java.lang.Throwable -> L22 java.lang.UnsatisfiedLinkError -> L24
            goto L50
        L22:
            r2 = move-exception
            goto L3b
        L24:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "Can't load avmdl library: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5f
            r1.append(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5f
            com.ss.mediakit.medialoader.AVMDLDataLoader.mLoadFailMsg = r0     // Catch: java.lang.Throwable -> L5f
            goto L50
        L3b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "other exception when loading avmdl library: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5f
            r1.append(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5f
            com.ss.mediakit.medialoader.AVMDLDataLoader.mLoadFailMsg = r0     // Catch: java.lang.Throwable -> L5f
        L50:
            com.ss.mediakit.vcnlib.VcnlibloadWrapper.tryLoadVcnverifylib()     // Catch: java.lang.Throwable -> L5f
            tryLoadByteMediaNetLoaderPlugin()     // Catch: java.lang.Throwable -> L5f
        L56:
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L5d
            monitor-exit(r4)
            r0 = -1
            return r0
        L5d:
            monitor-exit(r4)
            return r3
        L5f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.init(boolean):int");
    }

    public static void initApplicationContext(Context context) {
        synchronized (AVMDLDataLoader.class) {
            try {
                if (mGlobalApplicationContext == null) {
                    mGlobalApplicationContext = context;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void initLogThread(final Handler.Callback callback) {
        this.mWriteLock.lock();
        try {
            if (this.mMsgThread == null) {
                BPEAThread bPEAThread = new BPEAThread() { // from class: com.ss.mediakit.medialoader.AVMDLDataLoader.2
                    private void bpea_origin_run() {
                        com_ss_mediakit_medialoader_AVMDLDataLoader$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                    public void run() {
                        C1C7U.LIZ("AVMDLDataLoader@445f.initLogThread$1");
                        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                        try {
                            com_ss_mediakit_medialoader_AVMDLDataLoader$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            if (zLJ) {
                                C0W9U.LJFF();
                            }
                            C1C7U.LIZIZ("AVMDLDataLoader@445f.initLogThread$1");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (zLJ) {
                                C0W9U.LJFF();
                            }
                            throw th;
                        }
                    }

                    public void com_ss_mediakit_medialoader_AVMDLDataLoader$2__run$___twin___() {
                        if (Looper.myLooper() == null) {
                            Looper.prepare();
                        }
                        AVMDLDataLoader.this.mLogHandler = new BPEAHandler(callback);
                        if (AVMDLDataLoader.this.enableThreadMerge()) {
                            C786410Ut5.LJJZZIII(AVMDLDataLoader.this.mLogHandler, new Runnable() { // from class: com.ss.mediakit.medialoader.AVMDLDataLoader.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    C1C7U.LIZ("AVMDLDataLoader@445f.initLogThread$1$1");
                                    com_ss_mediakit_medialoader_AVMDLDataLoader$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                    C1C7U.LIZIZ("AVMDLDataLoader@445f.initLogThread$1$1");
                                }

                                public void com_ss_mediakit_medialoader_AVMDLDataLoader$2$1__run$___twin___() {
                                    AVMDLLog.d("AVMDLDataLoader", "[tm]start native mdl in global thread");
                                    AVMDLDataLoader.this.startInternal();
                                }

                                public static void com_ss_mediakit_medialoader_AVMDLDataLoader$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                                    try {
                                        anonymousClass1.com_ss_mediakit_medialoader_AVMDLDataLoader$2$1__run$___twin___();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        if (!C2179971ATj.LIZ(th)) {
                                            throw th;
                                        }
                                    }
                                }
                            });
                        }
                        C786410Ut5.LJLIIL(30000L, AVMDLDataLoader.this.mLogHandler, new Runnable() { // from class: com.ss.mediakit.medialoader.AVMDLDataLoader.2.2
                            @Override // java.lang.Runnable
                            public void run() {
                                C1C7U.LIZ("AVMDLDataLoader@445f.initLogThread$1$2");
                                com_ss_mediakit_medialoader_AVMDLDataLoader$2$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                                C1C7U.LIZIZ("AVMDLDataLoader@445f.initLogThread$1$2");
                            }

                            public void com_ss_mediakit_medialoader_AVMDLDataLoader$2$2__run$___twin___() {
                                AVMDLDataLoader.this.handleLoadPcdn();
                            }

                            public static void com_ss_mediakit_medialoader_AVMDLDataLoader$2$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC00322 runnableC00322) {
                                try {
                                    runnableC00322.com_ss_mediakit_medialoader_AVMDLDataLoader$2$2__run$___twin___();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    if (!C2179971ATj.LIZ(th)) {
                                        throw th;
                                    }
                                }
                            }
                        });
                        Looper.loop();
                    }

                    public static void com_ss_mediakit_medialoader_AVMDLDataLoader$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        try {
                            anonymousClass2.com_ss_mediakit_medialoader_AVMDLDataLoader$2__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                };
                this.mMsgThread = bPEAThread;
                ThreadMethodProxy.setName(bPEAThread, "mdl_log_handler");
                this.mMsgThread.start();
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public static String queryComponentEncode(String str) {
        if (isSupportQueryEncode && !TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("before encode, src: ");
            sbLIZ.append(str);
            AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ));
            try {
                return _encodeUrl(str, 4);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("query ComponentEncode:err ");
                sbLIZ2.append(e.getMessage());
                AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("query ComponentEncode:stacktrace ");
                sbLIZ3.append(e.getStackTrace());
                AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ3));
                return null;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                isSupportQueryEncode = false;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("query ComponentEncode:err ");
                sbLIZ4.append(e2.getMessage());
                AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ4));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("query ComponentEncode:stacktrace ");
                sbLIZ5.append(e2.getStackTrace());
                AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ5));
            }
        }
        return null;
    }

    private void setConfigureInternal(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        if (this.mHandle != 0 && aVMDLDataLoaderConfigure != null) {
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mCacheDir)) {
                String strCreateFilePathBaseDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "loaderFactory");
                if (!TextUtils.isEmpty(strCreateFilePathBaseDir)) {
                    _setStringValue(this.mHandle, 9, strCreateFilePathBaseDir);
                }
                if (TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
                    aVMDLDataLoaderConfigure.mNetCacheDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "netCache");
                }
                _setStringValue(this.mHandle, 0, aVMDLDataLoaderConfigure.mCacheDir);
            }
            if (!TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
                _setStringValue(this.mHandle, 5510, aVMDLDataLoaderConfigure.mNetCacheDir);
                String strCreateFilePathBaseDir2 = createFilePathBaseDir(aVMDLDataLoaderConfigure.mNetCacheDir, "ttquiche");
                aVMDLDataLoaderConfigure.mTTquicheCacheDir = strCreateFilePathBaseDir2;
                _setStringValue(this.mHandle, 6513, strCreateFilePathBaseDir2);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mAppInfo)) {
                _setStringValue(this.mHandle, 10, aVMDLDataLoaderConfigure.mAppInfo);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDownloadDir)) {
                _setStringValue(this.mHandle, 7300, aVMDLDataLoaderConfigure.mDownloadDir);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mMdlExtensionOptsStr)) {
                _setStringValue(this.mHandle, 7500, aVMDLDataLoaderConfigure.mMdlExtensionOptsStr);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mMdlTTQuicHeOptsStr)) {
                _setStringValue(this.mHandle, 7504, aVMDLDataLoaderConfigure.mMdlTTQuicHeOptsStr);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mTemporaryOptStr)) {
                _setStringValue(this.mHandle, 7502, aVMDLDataLoaderConfigure.mTemporaryOptStr);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mN80OptsStr)) {
                _setStringValue(this.mHandle, 7503, aVMDLDataLoaderConfigure.mN80OptsStr);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mSpeedEngineSetting)) {
                _setStringValue(this.mHandle, 8226, aVMDLDataLoaderConfigure.mSpeedEngineSetting);
            }
            _setIntValue(this.mHandle, 8001, aVMDLDataLoaderConfigure.mLiveP2pAllow);
            _setIntValue(this.mHandle, 8000, aVMDLDataLoaderConfigure.mLiveLoaderType);
            _setIntValue(this.mHandle, 8005, aVMDLDataLoaderConfigure.mLiveWatchDurationThreshold);
            _setIntValue(this.mHandle, 8006, aVMDLDataLoaderConfigure.mLiveCacheThresholdHttpToP2p);
            _setIntValue(this.mHandle, 8007, aVMDLDataLoaderConfigure.mLiveCacheThresholdP2pToHttp);
            _setIntValue(this.mHandle, 8008, aVMDLDataLoaderConfigure.mLiveMaxTrySwitchP2pTimes);
            _setIntValue(this.mHandle, 8009, aVMDLDataLoaderConfigure.mLiveWaitP2pReadyThreshold);
            _setIntValue(this.mHandle, 8010, aVMDLDataLoaderConfigure.mLiveMobileUploadAllow);
            _setIntValue(this.mHandle, 8011, aVMDLDataLoaderConfigure.mLiveMobileDownloadAllow);
            _setIntValue(this.mHandle, 8012, aVMDLDataLoaderConfigure.mLiveRecvDataTimeout);
            _setStringValue(this.mHandle, 8021, aVMDLDataLoaderConfigure.mLiveContainerString);
            _setIntValue(this.mHandle, 1, aVMDLDataLoaderConfigure.mMaxCacheSize);
            _setIntValue(this.mHandle, 2, aVMDLDataLoaderConfigure.mRWTimeOut);
            _setIntValue(this.mHandle, 3, aVMDLDataLoaderConfigure.mOpenTimeOut);
            _setIntValue(this.mHandle, 5, aVMDLDataLoaderConfigure.mTryCount);
            _setIntValue(this.mHandle, 7, aVMDLDataLoaderConfigure.mMaxCacheSize);
            _setIntValue(this.mHandle, 8, aVMDLDataLoaderConfigure.mLoaderFactoryMaxMemorySize);
            int i = aVMDLDataLoaderConfigure.mEnablePcdnAuto;
            if (i == 1) {
                _setIntValue(this.mHandle, 12, i);
            } else {
                _setIntValue(this.mHandle, 6, aVMDLDataLoaderConfigure.mLoaderType);
            }
            _setIntValue(this.mHandle, 102, aVMDLDataLoaderConfigure.mPreloadParallelNum);
            _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
            int i2 = aVMDLDataLoaderConfigure.mMaxCacheAge;
            if (i2 > 0) {
                _setIntValue(this.mHandle, 104, i2);
            }
            _setIntValue(this.mHandle, 111, aVMDLDataLoaderConfigure.mEnableMaxCacheAgeForAllDir);
            _setIntValue(this.mHandle, 1030, aVMDLDataLoaderConfigure.mPreloadStrategy);
            _setIntValue(this.mHandle, 1040, aVMDLDataLoaderConfigure.mPreloadWaitListType);
            _setIntValue(this.mHandle, 105, aVMDLDataLoaderConfigure.mEnablePreloadReUse);
            _setIntValue(this.mHandle, OppoPermissionPopupMaskDelayExp.DEFAULT, aVMDLDataLoaderConfigure.mEnableExternDNS);
            _setIntValue(this.mHandle, 701, aVMDLDataLoaderConfigure.mEnableSocketReuse);
            _setIntValue(this.mHandle, 703, aVMDLDataLoaderConfigure.mControlCDNRangeType);
            _setIntValue(this.mHandle, 702, aVMDLDataLoaderConfigure.mSocketIdleTimeOut);
            _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
            _setIntValue(this.mHandle, 1502, aVMDLDataLoaderConfigure.mTestSpeedTypeVersion);
            _setIntValue(this.mHandle, 1504, aVMDLDataLoaderConfigure.mCheckSumLevel);
            _setIntValue(this.mHandle, 1505, aVMDLDataLoaderConfigure.mEncryptVersion);
            _setIntValue(this.mHandle, 1507, aVMDLDataLoaderConfigure.mSpeedCoefficientValue);
            _setIntValue(this.mHandle, 900, aVMDLDataLoaderConfigure.mMaxIpCountEachDomain);
            _setIntValue(this.mHandle, 901, aVMDLDataLoaderConfigure.mEnableIpBucket);
            _setIntValue(this.mHandle, 902, aVMDLDataLoaderConfigure.mErrorStateTrustTime);
            _setIntValue(this.mHandle, 2508, aVMDLDataLoaderConfigure.mEnablePreconnect);
            _setIntValue(this.mHandle, 2509, aVMDLDataLoaderConfigure.mPreconnectNum);
            _setIntValue(this.mHandle, 2510, aVMDLDataLoaderConfigure.mEnableLoaderPreempt);
            _setIntValue(this.mHandle, 2511, aVMDLDataLoaderConfigure.mNextDownloadThreshold);
            _setIntValue(this.mHandle, 7216, aVMDLDataLoaderConfigure.mOnlyUseCdn);
            _setIntValue(this.mHandle, 3511, aVMDLDataLoaderConfigure.mAccessCheckLevel);
            _setIntValue(this.mHandle, 5511, aVMDLDataLoaderConfigure.mEnableSessionReuse);
            _setIntValue(this.mHandle, 5512, aVMDLDataLoaderConfigure.mMaxTlsVersion);
            _setIntValue(this.mHandle, 6512, aVMDLDataLoaderConfigure.mCheckPreloadLevel);
            _setIntValue(this.mHandle, 8217, aVMDLDataLoaderConfigure.mXYLibValue);
            _setIntValue(this.mHandle, 7340, aVMDLDataLoaderConfigure.mEnableP2PPreDown);
            _setIntValue(this.mHandle, 7341, aVMDLDataLoaderConfigure.mEnablePlayLog);
            _setIntValue(this.mHandle, 7342, aVMDLDataLoaderConfigure.mEnableNetScheduler);
            _setIntValue(this.mHandle, 7358, aVMDLDataLoaderConfigure.mEnableCacheReqRange);
            _setIntValue(this.mHandle, 7343, aVMDLDataLoaderConfigure.mNetSchedulerBlockAllNetErr);
            _setIntValue(this.mHandle, 7344, aVMDLDataLoaderConfigure.mNetSchedulerBlockErrCount);
            _setIntValue(this.mHandle, 7345, aVMDLDataLoaderConfigure.mNetSChedulerBlockDurationMs);
            _setIntValue(this.mHandle, 7346, aVMDLDataLoaderConfigure.mFirstRangeLeftThreshold);
            _setIntValue(this.mHandle, 7394, aVMDLDataLoaderConfigure.mNetSchedulerBlockHostIpErrCount);
            _setIntValue(this.mHandle, 5513, aVMDLDataLoaderConfigure.mMaxFileMemCacheSize);
            _setIntValue(this.mHandle, 5515, aVMDLDataLoaderConfigure.mMaxFileMemCacheNum);
            _setIntValue(this.mHandle, 110, aVMDLDataLoaderConfigure.mWriteFileNotifyIntervalMS);
            _setIntValue(this.mHandle, 7359, aVMDLDataLoaderConfigure.mP2PPreDownPeerCount);
            _setIntValue(this.mHandle, 7372, aVMDLDataLoaderConfigure.mP2PFirstRangeLoaderType);
            int i3 = aVMDLDataLoaderConfigure.mSocketSendBufferKB;
            if (i3 > 0) {
                _setIntValue(this.mHandle, 7220, i3);
            }
            int i4 = aVMDLDataLoaderConfigure.mRingBufferSizeKB;
            if (i4 > 0) {
                _setIntValue(this.mHandle, 7221, i4);
            }
            _setIntValue(this.mHandle, 7222, aVMDLDataLoaderConfigure.mEnableFileCacheV2);
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpABTestId)) {
                _setStringValue(this.mHandle, 7223, aVMDLDataLoaderConfigure.mVdpABTestId);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpGroupId)) {
                _setStringValue(this.mHandle, 7224, aVMDLDataLoaderConfigure.mVdpGroupId);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mNetSchedulerConfigStr)) {
                _setStringValue(this.mHandle, 7403, aVMDLDataLoaderConfigure.mNetSchedulerConfigStr);
            }
            _setIntValue(this.mHandle, 7225, aVMDLDataLoaderConfigure.mAlogEnable);
            _setIntValue(this.mHandle, 7226, aVMDLDataLoaderConfigure.mEnableSyncDnsForPcdn);
            _setIntValue(this.mHandle, 7228, aVMDLDataLoaderConfigure.mEnableFileRingBuffer);
            _setIntValue(this.mHandle, 7332, aVMDLDataLoaderConfigure.mEnableLazyBufferpool);
            _setIntValue(this.mHandle, 7334, aVMDLDataLoaderConfigure.mEnableNewBufferpool);
            _setIntValue(this.mHandle, 7335, aVMDLDataLoaderConfigure.mNewBufferPoolBlockSize);
            _setIntValue(this.mHandle, 7336, aVMDLDataLoaderConfigure.mNewBufferPoolResidentSize);
            _setIntValue(this.mHandle, 7337, aVMDLDataLoaderConfigure.mNewBufferPoolGrowBlockCount);
            _setIntValue(this.mHandle, 7229, aVMDLDataLoaderConfigure.mEnableUseFileExtendLoaderBuffer);
            _setIntValue(this.mHandle, 7330, aVMDLDataLoaderConfigure.mMaxIPV6Num);
            _setIntValue(this.mHandle, 7331, aVMDLDataLoaderConfigure.mMaxIPV4Num);
            _setIntValue(this.mHandle, 1510, aVMDLDataLoaderConfigure.mForbidByPassCookie);
            _setIntValue(this.mHandle, 7333, aVMDLDataLoaderConfigure.mSessionTimeout);
            _setIntValue(this.mHandle, 7339, aVMDLDataLoaderConfigure.mEnablePlayInfoCache);
            _setIntValue(this.mHandle, 7347, aVMDLDataLoaderConfigure.mEnableDownloaderLog);
            _setIntValue(this.mHandle, 7348, aVMDLDataLoaderConfigure.mEnableTTNetLoader);
            _setIntValue(this.mHandle, 7349, aVMDLDataLoaderConfigure.mTTNetLoaderCronetBufSizeKB);
            _setIntValue(this.mHandle, 7357, aVMDLDataLoaderConfigure.mIsAllowTryTheLastUrl);
            _setIntValue(this.mHandle, 7368, aVMDLDataLoaderConfigure.mSpeedSampleInterval);
            _setIntValue(this.mHandle, 7400, aVMDLDataLoaderConfigure.mUseNewSpeedTestForSingle);
            _setIntValue(this.mHandle, 7352, aVMDLDataLoaderConfigure.mEnableTTQuicHeLoader);
            _setIntValue(this.mHandle, 7353, aVMDLDataLoaderConfigure.mEnableTTQuicHeLoaderCheckWithNetworkType);
            _setIntValue(this.mHandle, 7391, aVMDLDataLoaderConfigure.mEnableIOManager);
            _setIntValue(this.mHandle, 7369, aVMDLDataLoaderConfigure.mEnableLoaderSeek);
            _setIntValue(this.mHandle, 7370, aVMDLDataLoaderConfigure.mGlobalSpeedSampleInterval);
            _setIntValue(this.mHandle, 7362, aVMDLDataLoaderConfigure.mEnableDynamicTimeout);
            _setIntValue(this.mHandle, 7360, aVMDLDataLoaderConfigure.mSocketInitialTimeout);
            _setIntValue(this.mHandle, 7361, aVMDLDataLoaderConfigure.mMaxSocketReuseCount);
            _setIntValue(this.mHandle, 7371, aVMDLDataLoaderConfigure.mEnableReportTaskLog);
            _setInt64Value(this.mHandle, 8218, aVMDLDataLoaderConfigure.mP2PStragetyLevel);
            _setInt64Value(this.mHandle, 7363, aVMDLDataLoaderConfigure.mConnectPoolStragetyValue);
            _setIntValue(this.mHandle, 7364, aVMDLDataLoaderConfigure.mMaxAliveHostNum);
            _setIntValue(this.mHandle, 7392, aVMDLDataLoaderConfigure.mFileExtendSizeKB);
            _setIntValue(this.mHandle, 7393, aVMDLDataLoaderConfigure.mMinAllowSpeed);
            _setIntValue(this.mHandle, 7395, aVMDLDataLoaderConfigure.mEnableOwnVDPPreloadNotify);
            _setIntValue(this.mHandle, 8219, aVMDLDataLoaderConfigure.mEnableEarlyData);
            _setIntValue(this.mHandle, 8220, aVMDLDataLoaderConfigure.mEnableSpeedPredict);
            _setIntValue(this.mHandle, 8224, aVMDLDataLoaderConfigure.mEnableSpeedEngine);
            _setIntValue(this.mHandle, 8225, aVMDLDataLoaderConfigure.mEnableSpeedReport);
            _setIntValue(this.mHandle, 7404, aVMDLDataLoaderConfigure.mEnableUseOriginalUrl);
            _setIntValue(this.mHandle, 7405, aVMDLDataLoaderConfigure.mEnableLoaderLogExtractUrls);
            _setIntValue(this.mHandle, 7406, aVMDLDataLoaderConfigure.mMaxLoaderLogNum);
            _setIntValue(this.mHandle, 7407, aVMDLDataLoaderConfigure.mCheckContentTypeMethod);
            _setIntValue(this.mHandle, 7412, aVMDLDataLoaderConfigure.mThreadStackSizeLevel);
            _setIntValue(this.mHandle, 7413, aVMDLDataLoaderConfigure.mEnableThreadPoolCheckIdle);
            _setIntValue(this.mHandle, 7414, aVMDLDataLoaderConfigure.mThreadPoolTTLSecond);
            _setIntValue(this.mHandle, 7415, aVMDLDataLoaderConfigure.mThreadPoolMinCount);
            _setIntValue(this.mHandle, 7416, aVMDLDataLoaderConfigure.mNonBlockRangeMode);
            int i5 = aVMDLDataLoaderConfigure.mNonBlockRangeMaxSizeKB;
            if (i5 > 0) {
                _setIntValue(this.mHandle, 7417, i5);
            }
            _setIntValue(this.mHandle, 7418, aVMDLDataLoaderConfigure.mNetUnreachableStopRetry);
            _setIntValue(this.mHandle, 7419, aVMDLDataLoaderConfigure.mEnableWaitNetReachable);
            _setInt64Value(this.mHandle, 7397, aVMDLDataLoaderConfigure.mMonitorMinAllowLoadSize);
            _setInt64Value(this.mHandle, 7396, aVMDLDataLoaderConfigure.mMonitorTimeInternal);
            _setStringValue(this.mHandle, 7398, aVMDLDataLoaderConfigure.mSocketTraingCenterConfigStr);
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mEnginePortraitStr)) {
                _setStringValue(this.mHandle, 7445, aVMDLDataLoaderConfigure.mEnginePortraitStr);
            }
            _setStringValue(this.mHandle, 7399, aVMDLDataLoaderConfigure.mCacheDirListsStr);
            _setStringValue(this.mHandle, 8221, aVMDLDataLoaderConfigure.mP2PConfigStr);
            _setIntValue(this.mHandle, 7401, aVMDLDataLoaderConfigure.mSocketRecvBufferSize);
            _setIntValue(this.mHandle, 7350, aVMDLDataLoaderConfigure.mEnableByteMediaNetLoader);
            _setIntValue(this.mHandle, 7351, aVMDLDataLoaderConfigure.mByteMediaNetLoaderCronetBufSizeKB);
            _setIntValue(this.mHandle, 8215, aVMDLDataLoaderConfigure.mEnableCellularUp);
            _setIntValue(this.mHandle, 7408, aVMDLDataLoaderConfigure.mCloseThreadPool);
            _setIntValue(this.mHandle, 8301, aVMDLDataLoaderConfigure.mMaxIpNum);
            _setIntValue(this.mHandle, 7427, aVMDLDataLoaderConfigure.mIgnoreTextSpeedTest);
            _setIntValue(this.mHandle, 7428, aVMDLDataLoaderConfigure.mEnableOptimizeRange);
            _setIntValue(this.mHandle, 7430, aVMDLDataLoaderConfigure.mCheckCacheDir);
            _setIntValue(this.mHandle, 7431, aVMDLDataLoaderConfigure.mEnableUseGroupId);
            _setIntValue(this.mHandle, 7438, aVMDLDataLoaderConfigure.mEnableMissReason);
            _setIntValue(this.mHandle, 7439, aVMDLDataLoaderConfigure.mPreloadInfoRecordMaxCnt);
            _setIntValue(this.mHandle, 7440, aVMDLDataLoaderConfigure.mEnableTraceIdPreloadLog);
            int i6 = aVMDLDataLoaderConfigure.mCloseLocalServer;
            if (i6 > 0) {
                _setIntValue(this.mHandle, 7441, i6);
            }
            int i7 = aVMDLDataLoaderConfigure.mZeroRatingStatus;
            if (i7 > 0) {
                _setIntValue(this.mHandle, 6601, i7);
            }
            int i8 = aVMDLDataLoaderConfigure.mGetCookieTokenLevel;
            if (i8 > 0) {
                _setIntValue(this.mHandle, 8303, i8);
            }
            _setIntValue(this.mHandle, 7435, aVMDLDataLoaderConfigure.mDisableRecentCache);
            _setIntValue(this.mHandle, 7436, aVMDLDataLoaderConfigure.mUpdateCacheFileInternal);
            _setIntValue(this.mHandle, 12001, aVMDLDataLoaderConfigure.mHlsTsFileKeyGenerateType);
            _setStringValue(this.mHandle, 7444, aVMDLDataLoaderConfigure.mProtectCacheDirsStr);
            int i9 = aVMDLDataLoaderConfigure.mEnableEventInfo;
            if (i9 > 0) {
                _setIntValue(this.mHandle, 9999, i9);
            }
            int i10 = aVMDLDataLoaderConfigure.mDownLogMaxSize;
            if (i10 > 0) {
                _setIntValue(this.mHandle, 7429, i10);
            }
            int i11 = aVMDLDataLoaderConfigure.mLoadPcdnInterval;
            if (i11 > 0) {
                _setIntValue(this.mHandle, 9302, i11);
            }
            int i12 = aVMDLDataLoaderConfigure.mEnableStorageModule;
            if (i12 > 0) {
                _setIntValue(this.mHandle, 10000, i12);
                int i13 = aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBNM;
                if (i13 > 0) {
                    _setIntValue(this.mHandle, 10001, i13);
                }
                int i14 = aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBLS;
                if (i14 > 0) {
                    _setIntValue(this.mHandle, 10002, i14);
                }
                int i15 = aVMDLDataLoaderConfigure.mStoRingBufferSizeKB;
                if (i15 > 0) {
                    _setIntValue(this.mHandle, 10003, i15);
                }
                int i16 = aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh1;
                if (i16 > 0) {
                    _setIntValue(this.mHandle, 10004, i16);
                }
                int i17 = aVMDLDataLoaderConfigure.mStoMaxIdleTimeSec;
                if (i17 > 0) {
                    _setIntValue(this.mHandle, 10006, i17);
                }
            }
            _setIntValue(this.mHandle, 7453, aVMDLDataLoaderConfigure.mStoSensitiveUser);
            _setIntValue(this.mHandle, 7455, aVMDLDataLoaderConfigure.mStoLevel);
            _setIntValue(this.mHandle, 7456, aVMDLDataLoaderConfigure.mNewUserOptVer);
            int i18 = aVMDLDataLoaderConfigure.mPlayTaskNotWriteDisk;
            if (i18 > 0) {
                _setIntValue(this.mHandle, 10008, i18);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mStoStrategyConfig)) {
                _setStringValue(this.mHandle, 10007, aVMDLDataLoaderConfigure.mStoStrategyConfig);
            }
            int i19 = aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh2;
            if (i19 > 0) {
                _setIntValue(this.mHandle, 10005, i19);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mP2PCostTag)) {
                _setStringValue(this.mHandle, 7423, aVMDLDataLoaderConfigure.mP2PCostTag);
            }
            _setIntValue(this.mHandle, 9400, aVMDLDataLoaderConfigure.mIgnorePlayInfo);
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mSettingsDomain)) {
                _setStringValue(this.mHandle, 9401, aVMDLDataLoaderConfigure.mSettingsDomain);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDmDomain)) {
                _setStringValue(this.mHandle, 9402, aVMDLDataLoaderConfigure.mDmDomain);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mForesightDomain)) {
                _setStringValue(this.mHandle, 9403, aVMDLDataLoaderConfigure.mForesightDomain);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDomains)) {
                _setStringValue(this.mHandle, 9404, aVMDLDataLoaderConfigure.mDomains);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mKeyDomain)) {
                _setStringValue(this.mHandle, 9405, aVMDLDataLoaderConfigure.mKeyDomain);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mKeyToken)) {
                _setStringValue(this.mHandle, 9406, aVMDLDataLoaderConfigure.mKeyToken);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDynamicPreconnectConfigStr)) {
                _setStringValue(this.mHandle, 7501, aVMDLDataLoaderConfigure.mDynamicPreconnectConfigStr);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mCustomUA)) {
                _setStringValue(this.mHandle, 8222, aVMDLDataLoaderConfigure.mCustomUA);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mFileRingBufferOptStr)) {
                _setStringValue(this.mHandle, 8302, aVMDLDataLoaderConfigure.mFileRingBufferOptStr);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mFileKeyRule)) {
                _setStringValue(this.mHandle, 12000, aVMDLDataLoaderConfigure.mFileKeyRule);
            }
            _setIntValue(this.mHandle, 9300, aVMDLDataLoaderConfigure.mEnableOkHttpLoader);
            _setIntValue(this.mHandle, 11000, aVMDLDataLoaderConfigure.mEnableP2pUpload);
            _setIntValue(this.mHandle, 11002, aVMDLDataLoaderConfigure.mDevDiskSizeMB);
            _setIntValue(this.mHandle, 11004, aVMDLDataLoaderConfigure.mDevMemorySizeMB);
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpExtGlobalInfo)) {
                _setStringValue(this.mHandle, 11001, aVMDLDataLoaderConfigure.mVdpExtGlobalInfo);
            }
            _setIntValue(this.mHandle, 7411, aVMDLDataLoaderConfigure.mEnableMultiDownloadPath);
            _setIntValue(this.mHandle, 7420, aVMDLDataLoaderConfigure.mEnableFileMutexOptimize);
            _setIntValue(this.mHandle, 7421, aVMDLDataLoaderConfigure.mSkipCDNBeforeExpiredSec);
            _setIntValue(this.mHandle, 7422, aVMDLDataLoaderConfigure.mNetUnreachableTimeout);
            int i20 = aVMDLDataLoaderConfigure.mDeviceScoreEx;
            if (i20 > 0) {
                _setIntValue(this.mHandle, 7426, i20);
            }
            int i21 = aVMDLDataLoaderConfigure.mSessionCacheInterval;
            if (i21 > 0) {
                _setIntValue(this.mHandle, 7442, i21);
            }
            int i22 = aVMDLDataLoaderConfigure.mFileManagerInterval;
            if (i22 > 0) {
                _setIntValue(this.mHandle, 7443, i22);
            }
            AVMDLDNSParser.setIntValue(0, this.mConfigure.mDNSMainType);
            AVMDLDNSParser.setIntValue(1, this.mConfigure.mDNSBackType);
            AVMDLDNSParser.setIntValue(2, this.mConfigure.mDefaultExpiredTime);
            AVMDLDNSParser.setIntValue(3, this.mConfigure.mMainToBackUpDelayedTime);
        }
    }

    private AVMDLCopyResult tryToExportFileOnCacheDuration(AVMDLCopyOperation aVMDLCopyOperation) {
        if (aVMDLCopyOperation != null && !TextUtils.isEmpty(aVMDLCopyOperation.mFileKey) && !TextUtils.isEmpty(aVMDLCopyOperation.mDestPath) && aVMDLCopyOperation.mMinDurationMs > 0) {
            AVMDLFileInfo cacheInfo = getCacheInfo(aVMDLCopyOperation.mFileKey);
            if (cacheInfo == null) {
                return AVMDLCopyResult.CR_FILE_NOT_CACHED;
            }
            long j = aVMDLCopyOperation.mMinCacheSize;
            if (j > 0 && cacheInfo.mCacheSize >= j) {
                long jCopyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath, true);
                if (jCopyFile >= 0) {
                    return AVMDLCopyResult.CR_SUCCESS;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("copy error, result: ");
                sbLIZ.append(jCopyFile);
                return AVMDLCopyResult.getCustomError(C2188811AlT.LIZIZ(sbLIZ));
            }
            long j_getContinueCacheSize = _getContinueCacheSize(this.mHandle, aVMDLCopyOperation.mFileKey, 0, aVMDLCopyOperation.mMinDurationMs);
            if (j_getContinueCacheSize > 0 && j_getContinueCacheSize <= cacheInfo.mContentLenght) {
                aVMDLCopyOperation.mMinCacheSize = j_getContinueCacheSize;
                if (cacheInfo.mCacheSize >= j_getContinueCacheSize) {
                    long jCopyFile2 = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath, true);
                    if (jCopyFile2 >= 0) {
                        return AVMDLCopyResult.CR_SUCCESS;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("copy error, result: ");
                    sbLIZ2.append(jCopyFile2);
                    return AVMDLCopyResult.getCustomError(C2188811AlT.LIZIZ(sbLIZ2));
                }
                return AVMDLCopyResult.CR_INSUFFICIENT_CACHE;
            }
            return AVMDLCopyResult.CR_DEMUXER_FAILED;
        }
        return AVMDLCopyResult.CR_INVALID_PARAM;
    }

    public int addImageTask(String str) {
        int i_addImageTask = -1;
        if (this.mState != 1) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.e("MIO_IMG", "add image task failed, resource is empty");
            return -2;
        }
        Lock lock = getLock(2);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    i_addImageTask = _addImageTask(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                AVMDLLog.e("MIO_IMG", e.toString());
            }
            lock.unlock();
            return i_addImageTask;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public int asyncCopyOperation(AVMDLCopyOperation aVMDLCopyOperation) {
        Handler handler;
        if (this.mState == 1 && (handler = this.mLogHandler) != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = 23;
            messageObtainMessage.obj = aVMDLCopyOperation;
            messageObtainMessage.sendToTarget();
            return 0;
        }
        return -1;
    }

    public void cancel(String str) {
        if (this.mState != 1) {
            return;
        }
        Lock lock = getLock(2);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cancel(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public int cancelImageTask(String str) {
        int i_cancelImageTask = -1;
        if (this.mState != 1) {
            return -1;
        }
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.e("MIO_IMG", "cancel image task failed, taskId is empty");
            return -2;
        }
        Lock lock = getLock(2);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    i_cancelImageTask = _cancelImageTask(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                AVMDLLog.e("MIO_IMG", e.toString());
            }
            lock.unlock();
            return i_cancelImageTask;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void cleanCacheDir(long j) {
        if (this.mState != 1) {
            return;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _cleanCacheDir(j2, j);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public int closeImageStream(String str) {
        int i_closeImageStream = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    i_closeImageStream = _closeImageStream(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                AVMDLLog.e("MIO_IMG", e.toString());
            }
            this.mReadLock.unlock();
            return i_closeImageStream;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void doParseHosts(String[] strArr) {
        AVMDLDNSParser.getInstance().doParseHosts(strArr);
    }

    public void downloadResource(String str) {
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        Lock lock = getLock(8);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _downloadResource(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void forceRemoveFileCache(String str) {
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _forceRemoveCacheFile(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public String getAuth(String str) {
        String str_getAuth = null;
        if (this.mState != 1 || !this.isSupportGetAuth) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                str_getAuth = _getAuth(this.mHandle, str);
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
                this.isSupportGetAuth = false;
            }
            this.mReadLock.unlock();
            return str_getAuth;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public String getCDNLog(String str) {
        String str_getCDNLog = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                str_getCDNLog = _getCDNLog(this.mHandle, str);
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("not support get cdnlog,");
                sbLIZ.append(e.toString());
                AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.mReadLock.unlock();
            return str_getCDNLog;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public AVMDLFileInfo getCacheInfo(String str) {
        long j;
        AVMDLFileInfo aVMDLFileInfo = null;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                j = this.mHandle;
            } catch (UnsatisfiedLinkError e) {
                e = e;
            }
            if (j != 0) {
                String str_getStringValueByStr = _getStringValueByStr(j, str, 101);
                if (TextUtils.isEmpty(str_getStringValueByStr)) {
                    this.mReadLock.unlock();
                    return null;
                }
                String[] strArrSplit = str_getStringValueByStr.split(",");
                if (strArrSplit.length >= 3) {
                    AVMDLFileInfo aVMDLFileInfo2 = new AVMDLFileInfo();
                    try {
                        aVMDLFileInfo2.mFilePath = strArrSplit[2];
                        if (!TextUtils.isEmpty(strArrSplit[0])) {
                            aVMDLFileInfo2.mCacheSize = Long.valueOf(strArrSplit[0]).longValue();
                        }
                        if (!TextUtils.isEmpty(strArrSplit[1])) {
                            aVMDLFileInfo2.mContentLenght = Long.valueOf(strArrSplit[1]).longValue();
                        }
                        aVMDLFileInfo = aVMDLFileInfo2;
                    } catch (UnsatisfiedLinkError e2) {
                        e = e2;
                        aVMDLFileInfo = aVMDLFileInfo2;
                        TryCatchGuardChecker.doCheck(e);
                        e.printStackTrace();
                    }
                }
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return aVMDLFileInfo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public long getCacheSize(String str) {
        long j_getLongValueByStr = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_getLongValueByStr = _getLongValueByStr(j, str, 103);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return j_getLongValueByStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public long getDownloadCount(String str) {
        long j_getLongValueByStr = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_getLongValueByStr = _getLongValueByStr(j, str, 9217);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return j_getLongValueByStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public long getLongValue(int i) {
        int i2;
        long j_getLongValue = -1;
        if (i != 7218 && i != 7390 && i != 9407 && i != 7402 && i != 7433) {
            if (this.mState != 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getLongValue key: ");
                sbLIZ.append(i);
                sbLIZ.append(" result: ");
                sbLIZ.append(-1L);
                AVMDLLog.d("ttmdljava", C2188811AlT.LIZIZ(sbLIZ));
                return -1L;
            }
            if (this.mConfigure == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getLongValue key: ");
                sbLIZ2.append(i);
                sbLIZ2.append(" result: ");
                sbLIZ2.append(-998L);
                AVMDLLog.d("ttmdljava", C2188811AlT.LIZIZ(sbLIZ2));
                return -998L;
            }
            this.mReadLock.lock();
            try {
                try {
                    switch (i) {
                        case 8100:
                            i2 = this.mConfigure.mLiveLoaderEnable;
                            j_getLongValue = i2;
                            break;
                        case 8101:
                            i2 = this.mConfigure.mLiveP2pAllow;
                            j_getLongValue = i2;
                            break;
                        case 8102:
                            i2 = this.mConfigure.mLiveEnableMdlProto;
                            j_getLongValue = i2;
                            break;
                        case 8103:
                            i2 = this.mConfigure.mLiveLoaderType;
                            j_getLongValue = i2;
                            break;
                        default:
                            long j = this.mHandle;
                            if (j != 0) {
                                j_getLongValue = _getLongValue(j, i);
                            }
                            break;
                    }
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.printStackTrace();
                }
                this.mReadLock.unlock();
                AVMDLLog.d("ttmdljava", "getLongValue key: " + i + " result: " + j_getLongValue);
                return j_getLongValue;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mReadLock.unlock();
                throw th;
            }
        }
        long j2 = this.mHandle;
        if (j2 == 0) {
            return -1L;
        }
        return _getLongValue(j2, i);
    }

    public NetworkState getNetworkState(int i) {
        if (isRunning()) {
            long j = this.mHandle;
            if (j != 0) {
                return nativeGetVodNetworkState(j);
            }
            return null;
        }
        return null;
    }

    public String getStringCacheInfo(String str) {
        String str_getStringValueByStr = null;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str_getStringValueByStr = _getStringValueByStr(j, str, 101);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return str_getStringValueByStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public String getStringValue(int i) {
        String str_getStringValue = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str_getStringValue = _getStringValue(j, i);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return str_getStringValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 23) {
            AVMDLCopyOperation aVMDLCopyOperation = (AVMDLCopyOperation) HandlerHook.getMessageObj(message.obj);
            if (aVMDLCopyOperation != null) {
                copyInternal(aVMDLCopyOperation);
            }
            return true;
        }
        if (i == 3 || i == 51) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) HandlerHook.getMessageObj(message.obj);
            if (this.mWaitingCopyItem.size() > 0 && aVMDLDataLoaderNotifyInfo != null) {
                handleCopyMsg(aVMDLDataLoaderNotifyInfo);
            }
        }
        if (i != 12 && i != 9) {
            if (i != 71 && i != 72 && i != 73 && i != 74) {
                if (i != 1101 && i != 1100 && i != 1103 && i != 1104) {
                    return postMessage(this.mVodListener, message);
                }
                handleImageMsg((AVMDLDataLoaderNotifyInfo) HandlerHook.getMessageObj(message.obj));
                return true;
            }
            return postMessage(this.mEventListener, message);
        }
        return postMessage(this.mLiveListener, message);
    }

    public String ioPrepare(IOTaskModel iOTaskModel) {
        if (this.mState != 1 || this.mHandle == 0 || iOTaskModel == null || !iOTaskModel.isValid()) {
            return null;
        }
        return _ioPrepare(this.mHandle, iOTaskModel.traceId, iOTaskModel.rawKey, iOTaskModel.fileKey, iOTaskModel.isDash, iOTaskModel.resType, iOTaskModel.isSelectedLadder, iOTaskModel.useLocalServer, iOTaskModel.getExtendInfo());
    }

    public void notifyPlayStart(String str) {
        if (this.mState == 1 && this.mHandle != 0 && !TextUtils.isEmpty(str)) {
            _notifyPlayStart(this.mHandle, str);
        }
    }

    public int onCellularAlwaysUp(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start on cellular netId: ");
        sbLIZ.append(j);
        AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ));
        Lock lock = getLock(4);
        lock.lock();
        int i_onCellularAlwaysUp = -1;
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    i_onCellularAlwaysUp = _onCellularAlwaysUp(j2, j, Build.VERSION.SDK_INT);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            lock.unlock();
            AVMDLLog.d("AVMDLDataLoader", "end on cellular netId: " + j + " ret: " + i_onCellularAlwaysUp);
            return i_onCellularAlwaysUp;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void onEventInfo(Object obj) {
        String strValueOf;
        if (this.mState == 1 && this.mLogHandler != null) {
            LoaderEventInfo loaderEventInfo = new LoaderEventInfo();
            loaderEventInfo.what = 74;
            try {
                HashMap map = (HashMap) obj;
                if (map.containsKey("what")) {
                    loaderEventInfo.what = ((Integer) map.get("what")).intValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[debugUI] eventMap contains What");
                    sbLIZ.append(loaderEventInfo.what);
                    AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ));
                }
                if (map.containsKey("taskType")) {
                    loaderEventInfo.taskType = ((Integer) map.get("taskType")).intValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[debugUI] eventMap contains taskType");
                    sbLIZ2.append(loaderEventInfo.taskType);
                    AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (map.containsKey("off")) {
                    loaderEventInfo.off = ((Long) map.get("off")).longValue();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[debugUI] eventMap contains off");
                    sbLIZ3.append(loaderEventInfo.off);
                    AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (map.containsKey("endOff")) {
                    loaderEventInfo.endOff = ((Long) map.get("endOff")).longValue();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[debugUI] eventMap contains endOff");
                    sbLIZ4.append(loaderEventInfo.endOff);
                    AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ4));
                }
                if (map.containsKey("fileHash")) {
                    loaderEventInfo.fileHash = String.valueOf(map.get("fileHash"));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("[debugUI] eventMap contains fileHash");
                    sbLIZ5.append(loaderEventInfo.fileHash);
                    AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ5));
                }
                if (map.containsKey("bytesLoaded")) {
                    loaderEventInfo.bytesLoaded = ((Long) map.get("bytesLoaded")).longValue();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("[debugUI] eventMap contains bytesLoaded");
                    sbLIZ6.append(loaderEventInfo.bytesLoaded);
                    AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ6));
                }
                if (!map.containsKey("headers")) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(map.get("headers"));
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("[debugUI] eventMap contains headers");
                    sbLIZ7.append(strValueOf);
                    AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ7));
                }
                if (strValueOf != "") {
                    String[] strArrSplit = strValueOf.split("\r\n");
                    for (String str : strArrSplit) {
                        String[] strArrSplit2 = str.split(":");
                        loaderEventInfo.mHeaders.put(strArrSplit2[0], strArrSplit2[1]);
                    }
                } else {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("[debugUI] what");
                    sbLIZ8.append(loaderEventInfo.what);
                    AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ8));
                    AVMDLLog.d("AVMDLDataLoader", "[debugUI]no headers");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            Message messageObtainMessage = this.mLogHandler.obtainMessage();
            messageObtainMessage.what = loaderEventInfo.what;
            messageObtainMessage.obj = loaderEventInfo;
            messageObtainMessage.sendToTarget();
        }
    }

    public long quickQueryCacheSize(String str) {
        long j_getLongValueByStr = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_getLongValueByStr = _getLongValueByStr(j, str, 113);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return j_getLongValueByStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void removeFileCache(String str) {
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _removeCacheFile(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void removeNetworkStateCallback(String str) {
        if (isRunning()) {
            long j = this.mHandle;
            if (j != 0) {
                nativeRemoveVodNetworkStateCallback(j, str);
            }
        }
    }

    public void resetPreloadTraceId(String str) {
        if (this.mState != 1) {
            return;
        }
        Lock lock = getLock(2);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _resetPreloadTraceId(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void setConfigure(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                this.mConfigure = aVMDLDataLoaderConfigure;
                aVMDLDataLoaderConfigure.ParseJsonConfig();
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void setEventListener(LoaderListener loaderListener) {
        this.mWriteLock.lock();
        try {
            this.mEventListener = loaderListener;
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void setListener(AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        try {
            this.mVodListener = aVMDLDataLoaderListener;
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void setPluginLibraryLoader(IAVMDLLibraryLoader iAVMDLLibraryLoader) {
        this.mWriteLock.lock();
        try {
            mIsAsyncLoadPlugin = true;
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void setStartCompleteListener(AVMDLStartCompleteListener aVMDLStartCompleteListener) {
        this.mStartCompleteListener = aVMDLStartCompleteListener;
    }

    public synchronized void setTaskEventListener(AVMDLTaskEventListener aVMDLTaskEventListener) {
        this.mTaskListener = aVMDLTaskEventListener;
    }

    public void suspendDownload(String str) {
        if (this.mState != 1) {
            return;
        }
        Lock lock = getLock(8);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _suspendedDownload(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public long tryQuickGetCacheSize(String str) {
        long j_getLongValueByStr = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_getLongValueByStr = _getLongValueByStr(j, str, 106);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return j_getLongValueByStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void tryToClearCachesByUsedTime(long j) {
        if (this.mState != 1) {
            return;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _clearCachesByUsedTime(j2, j);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    private String createFilePathBaseDir(String str, String str2) {
        String strLIZIZ;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (str.charAt(str.length() - 1) == '/') {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("/");
                sbLIZ2.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (!TextUtils.isEmpty(strLIZIZ)) {
                C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                if (!c0vsj.exists()) {
                    c0vsj.mkdirs();
                }
            }
            return strLIZIZ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int init(boolean r5, boolean r6) {
        /*
            java.lang.Class<com.ss.mediakit.medialoader.AVMDLDataLoader> r4 = com.ss.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r4)
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            if (r0 == 0) goto La
            monitor-exit(r4)
            return r3
        La:
            com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r5     // Catch: java.lang.Throwable -> L5f
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L56
            X.C08TM.LIZ()     // Catch: java.lang.Throwable -> L5f
            com.ss.mediakit.vcnlib.VcnlibloadWrapper.tryLoadVcnlib()     // Catch: java.lang.Throwable -> L5f
            loadAVMDLBaseLibrary()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "avmdl"
            INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(r0)     // Catch: java.lang.Throwable -> L22 java.lang.UnsatisfiedLinkError -> L24
            r0 = 1
            com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r0     // Catch: java.lang.Throwable -> L22 java.lang.UnsatisfiedLinkError -> L24
            goto L50
        L22:
            r2 = move-exception
            goto L3b
        L24:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "Can't load avmdl library: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5f
            r1.append(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5f
            com.ss.mediakit.medialoader.AVMDLDataLoader.mLoadFailMsg = r0     // Catch: java.lang.Throwable -> L5f
            goto L50
        L3b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "other exception when loading avmdl library: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5f
            r1.append(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5f
            com.ss.mediakit.medialoader.AVMDLDataLoader.mLoadFailMsg = r0     // Catch: java.lang.Throwable -> L5f
        L50:
            com.ss.mediakit.vcnlib.VcnlibloadWrapper.tryLoadVcnverifylib()     // Catch: java.lang.Throwable -> L5f
            tryLoadByteMediaNetLoaderPlugin()     // Catch: java.lang.Throwable -> L5f
        L56:
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L5d
            monitor-exit(r4)
            r0 = -1
            return r0
        L5d:
            monitor-exit(r4)
            return r3
        L5f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.init(boolean, boolean):int");
    }

    public static void initByteMediaNetEnv(Context context, ClassLoader classLoader) {
        synchronized (AVMDLDataLoader.class) {
            try {
                if (mIsByteMediaNetInit.booleanValue()) {
                    return;
                }
                try {
                    Method method = Class.forName("com.ss.avframework.transport.ContextUtils").getMethod("initApplicationContext", Context.class);
                    method.setAccessible(true);
                    method.invoke(null, context);
                    Method method2 = Class.forName("com.ss.avframework.transport.JNIUtils").getMethod("setClassLoader", ClassLoader.class);
                    method2.setAccessible(true);
                    method2.invoke(null, classLoader);
                    mIsByteMediaNetInit = Boolean.TRUE;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static String makeTsFileKey(String str, String str2) {
        try {
            return _makeTsFileKey(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("makeTsFileKey failed, other reason:  ");
            sbLIZ.append(e.getMessage());
            AVMDLLog.e("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("makeTsFileKey failed, native not support: ");
            sbLIZ2.append(e2.getMessage());
            AVMDLLog.e("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    private boolean postMessage(LoaderListener loaderListener, Message message) {
        LoaderEventInfo loaderEventInfo;
        if (loaderListener != null && HandlerHook.getMessageObj(message.obj) != null && (loaderEventInfo = (LoaderEventInfo) HandlerHook.getMessageObj(message.obj)) != null) {
            int i = message.what;
            if (i == 71) {
                loaderListener.onLoaderTaskStart(loaderEventInfo);
                AVMDLLog.d("ttmdljava", "receive eventLog KeyIsLoaderEventStart");
            } else {
                if (i == 72) {
                    loaderListener.onLoaderTaskCancel(loaderEventInfo);
                    AVMDLLog.d("ttmdljava", "receive eventLog KeyIsLoaderEventCancel");
                    return true;
                }
                if (i == 73) {
                    loaderListener.onLoaderTaskCompleted(loaderEventInfo);
                    AVMDLLog.d("ttmdljava", "receive eventLog KeyIsLoaderEventCompleted");
                    return true;
                }
                AVMDLLog.d("ttmdljava", "receive eventLog fail");
                return true;
            }
        }
        return true;
    }

    public void addDataSource(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addDataSource: id: ");
        sbLIZ.append(i);
        sbLIZ.append(", queyr: ");
        sbLIZ.append(str);
        AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ));
        Lock lock = getLock(4);
        lock.lock();
        try {
            try {
                _addDataSource(this.mHandle, i, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void addNetworkStateCallback(NetworkState.NetworkStateCallback networkStateCallback, String str) {
        if (networkStateCallback != null && isRunning()) {
            long j = this.mHandle;
            if (j != 0) {
                nativeAddVodNetworkStateCallback(j, networkStateCallback, str);
            }
        }
    }

    public void cleanSpecifiedCacheDir(String str, int i) {
        if (this.mState != 1) {
            return;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cleanSpecifiedCacheDir(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public long copyFile(String str, String str2) {
        long j_copyFile = -1;
        if (this.mState != 1) {
            return -1L;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_copyFile = _copyFile64(j, str, str2);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                long j2 = this.mHandle;
                if (j2 != 0) {
                    try {
                        j_copyFile = _copyFile(j2, str, str2);
                    } catch (UnsatisfiedLinkError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        e2.printStackTrace();
                    }
                }
                e.printStackTrace();
            }
            lock.unlock();
            return j_copyFile;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public long getCacheSize(String str, String str2) {
        long j_getLongValueByStrStr = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_getLongValueByStrStr = _getLongValueByStrStr(j, str, str2, 103);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return j_getLongValueByStrStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public long getCacheSizeByKeyAndDirPath(String str, String str2) {
        long j_getLongValueByStrStr = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_getLongValueByStrStr = _getLongValueByStrStr(j, str, str2, 114);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return j_getLongValueByStrStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public long getInt64Value(int i, long j) {
        if (i != 8003 && i != 8004) {
            if (i == 11009) {
                return AVMDLDeviceUtil.getBatteryPercentage(getApplicationContext());
            }
            if (i == 11011) {
                if (AVMDLDeviceUtil.isOverHeat(getApplicationContext())) {
                    return 1L;
                }
                return 0L;
            }
            if (i == 11010) {
                if (AVMDLDeviceUtil.isPowerSaveMode(getApplicationContext())) {
                    return 1L;
                }
                return 0L;
            }
            if (i == 11008) {
                return AVMDLDeviceUtil.getTotalFreeStorageKB();
            }
            if (i == 11007) {
                return AVMDLDeviceUtil.getTotalStorageSpaceKB();
            }
        } else {
            AVMDLDataLoaderListener aVMDLDataLoaderListener = this.mLiveListener;
            if (aVMDLDataLoaderListener != null) {
                return aVMDLDataLoaderListener.getInt64Value(i, j);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getInt64Value mLiveListener is nullptr, code: ");
            sbLIZ.append(i);
            AVMDLLog.e("ttmdljava", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getInt64Value code: ");
        sbLIZ2.append(i);
        sbLIZ2.append(" defaultValue: ");
        sbLIZ2.append(j);
        AVMDLLog.d("ttmdljava", C2188811AlT.LIZIZ(sbLIZ2));
        return j;
    }

    public long getLongValueByStr(String str, int i) {
        long j_getLongValueByStr = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_getLongValueByStr = _getLongValueByStr(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mWriteLock.unlock();
            return j_getLongValueByStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public long getMissReason(String str, String str2) {
        long j_getLongValueByStrStr = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_getLongValueByStrStr = _getLongValueByStrStr(j, str, str2, 112);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return j_getLongValueByStrStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public String getStringCacheInfo(String str, String str2) {
        String str_getStringValueByStrStr = null;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str_getStringValueByStrStr = _getStringValueByStrStr(j, str, str2, 101);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return str_getStringValueByStrStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public String getStringValueByStr(String str, int i) {
        String str_getStringValueByStr = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    str_getStringValueByStr = _getStringValueByStr(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return str_getStringValueByStr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void makeFileAutoDeleteFlag(String str, int i) {
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _makeFileAutoDeleteFlag(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public String notifyPlayStop(String str, int i) {
        String str_notifyPlayStop = null;
        if (this.mState == 1 && this.mHandle != 0) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        str_notifyPlayStop = _notifyPlayStop(this.mHandle, str, i);
                        return str_notifyPlayStop;
                    } catch (UnsatisfiedLinkError e) {
                        TryCatchGuardChecker.doCheck(e);
                        e.printStackTrace();
                        return str_notifyPlayStop;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return null;
    }

    public void preConnectByHost(String str, int i) {
        if (this.mState != 1) {
            return;
        }
        Lock lock = getLock(4);
        lock.lock();
        try {
            try {
                _preConnectByHost(this.mHandle, str, i);
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void preloadResource(String str, int i) {
        if (this.mState == 1 && !TextUtils.isEmpty(str) && i != 0) {
            Lock lock = getLock(2);
            lock.lock();
            try {
                try {
                    long j = this.mHandle;
                    if (j != 0) {
                        _preloadResource(j, str, i);
                    }
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.printStackTrace();
                }
                lock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                throw th;
            }
        }
    }

    public void removeFileCacheByKeyAndPath(String str, String str2) {
        if (this.mState == 1 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Lock lock = getLock(1);
            lock.lock();
            try {
                try {
                    long j = this.mHandle;
                    if (j != 0) {
                        _removeCacheFileInDirPath(j, str, str2);
                    }
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.printStackTrace();
                }
                lock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                throw th;
            }
        }
    }

    public void removeOfflineFilePath(boolean z, String str) {
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _removeOfflineFilePath(j, z, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public void setBackUpIp(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IPCache.getInstance().putBackUpIp(str, new AVMDLDNSInfo(11, str, str2, 0L, (String) null));
        }
    }

    public void setIntValue(int i, int i2) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _setIntValue(j, i, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void setListener(int i, AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        try {
            if (i == 107) {
                this.mLiveListener = aVMDLDataLoaderListener;
            } else {
                if (i == 108) {
                    this.mImageListener = aVMDLDataLoaderListener;
                }
                this.mWriteLock.unlock();
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void setLongValue(int i, long j) {
        if (i == 7432) {
            long j2 = this.mHandle;
            if (j2 != 0) {
                _setInt64Value(j2, i, j);
                return;
            }
            return;
        }
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j3 = this.mHandle;
                if (j3 != 0) {
                    _setInt64Value(j3, i, j);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public void setStringValue(int i, String str) {
        if (TextUtils.isEmpty(str) || this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _setStringValue(j, i, str);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public long tryToClearAndGetCachesByUsedTime(long j, boolean z) {
        long j_clearAndGetCachesByUsedTime = 0;
        int i = 1;
        if (this.mState != 1) {
            return 0L;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    if (!z) {
                        i = 0;
                    }
                    j_clearAndGetCachesByUsedTime = _clearAndGetCachesByUsedTime(j2, j, i);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            lock.unlock();
            return j_clearAndGetCachesByUsedTime;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    private boolean postMessage(AVMDLDataLoaderListener aVMDLDataLoaderListener, Message message) {
        AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo;
        if (message.what == 701) {
            AVMDLLog.d("ttmdljava", "receive hijack err: ");
            hijack();
            return true;
        }
        if (aVMDLDataLoaderListener != null && HandlerHook.getMessageObj(message.obj) != null && (aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) HandlerHook.getMessageObj(message.obj)) != null) {
            aVMDLDataLoaderListener.onNotify(aVMDLDataLoaderNotifyInfo);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int init(boolean r3, boolean r4, boolean r5) {
        /*
            java.lang.Class<com.ss.mediakit.medialoader.AVMDLDataLoader> r2 = com.ss.mediakit.medialoader.AVMDLDataLoader.class
            monitor-enter(r2)
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r2)
            return r1
        La:
            com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded = r3     // Catch: java.lang.Throwable -> L3e
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L35
            X.C08TM.LIZ()     // Catch: java.lang.Throwable -> L3e
            com.ss.mediakit.vcnlib.VcnlibloadWrapper.tryLoadVcnlib()     // Catch: java.lang.Throwable -> L3e
            loadAVMDLBaseLibrary()     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L2e
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsAsyncLoadPlugin     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L2e
            java.lang.String r0 = "avmdlp2pv2"
            INVOKESTATIC_com_ss_mediakit_medialoader_AVMDLDataLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(r0)     // Catch: java.lang.Throwable -> L25 java.lang.UnsatisfiedLinkError -> L2a
            goto L2e
        L25:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3e
            goto L2e
        L2a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3e
        L2e:
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L35
            tryLoadByteMediaNetLoaderPlugin()     // Catch: java.lang.Throwable -> L3e
        L35:
            boolean r0 = com.ss.mediakit.medialoader.AVMDLDataLoader.mIsLibraryLoaded     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L3c
            monitor-exit(r2)
            r0 = -1
            return r0
        L3c:
            monitor-exit(r2)
            return r1
        L3e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.init(boolean, boolean, boolean):int");
    }

    private void onCopyFinish(String str, AVMDLCopyResult aVMDLCopyResult, AVMDLCopyOperationListener aVMDLCopyOperationListener) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.mWaitingCopyItem.containsKey(str)) {
            this.mWaitingCopyItem.remove(str);
        }
        if (aVMDLCopyResult != null && aVMDLCopyOperationListener != null) {
            aVMDLCopyOperationListener.onCopyComplete(aVMDLCopyResult.isSuccess(), aVMDLCopyResult.code, aVMDLCopyResult.desc);
        }
    }

    private double testFileIO(String str, int i, RandomAccessFile randomAccessFile) throws InterruptedException, IOException {
        if (TextUtils.isEmpty(str)) {
            return -1.0d;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        randomAccessFile.seek(i);
        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
        int i2 = 0;
        do {
            Thread.sleep(5);
            randomAccessFile.write(bArr, 0, 1024);
            i2++;
        } while (i2 < 200);
        long jCurrentTimeMillis2 = ((System.currentTimeMillis() - jCurrentTimeMillis) - ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + 0;
        if (jCurrentTimeMillis2 <= 0) {
            return -1.0d;
        }
        AVMDLLog.d("BENCHMARKIO", C786410Ut5.k4(Locale.US, "size:%d costtime:%d", new Object[]{819200, Long.valueOf(jCurrentTimeMillis2)}));
        return 819200 / jCurrentTimeMillis2;
    }

    public long copyFile(String str, String str2, boolean z) {
        int i;
        int i2;
        long jCopyFile = -1;
        if (this.mState != 1) {
            return -1L;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    jCopyFile = _copyFileWithForceFlag64(j, str, str2, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                long j2 = this.mHandle;
                if (j2 != 0) {
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    try {
                        jCopyFile = _copyFileWithForceFlag(j2, str, str2, i);
                    } catch (UnsatisfiedLinkError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        e2.printStackTrace();
                        if (!z) {
                            jCopyFile = copyFile(str, str2);
                        }
                    }
                }
                e.printStackTrace();
            }
            lock.unlock();
            return jCopyFile;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public long getContinueCacheSize(String str, int i, long j) {
        long j_getContinueCacheSize = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j_getContinueCacheSize = _getContinueCacheSize(j2, str, i, j);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mReadLock.unlock();
            return j_getContinueCacheSize;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public String getStringValueByStrkey(int i, long j, String str) {
        if (this.mState != 1) {
            return null;
        }
        if (i != 1503) {
            if (i != 1506 && i != 1509) {
                if (i != 3512) {
                    return null;
                }
                return getProxyUrl();
            }
            if (this.mVodListener == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return this.mVodListener.getStringValue(i, j, str);
        }
        if (this.mVodListener == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mVodListener.getCheckSumInfo(str);
    }

    public void onLogInfo(int i, int i2, String str) {
        boolean zLJI = MethodIDManager.LJI(202448);
        onLogInfo(i, i2, -1, str);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public void onNotify(int i, long j, int i2) {
        if (this.mState == 1 && this.mHandler != null) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = new AVMDLDataLoaderNotifyInfo();
            aVMDLDataLoaderNotifyInfo.what = i;
            aVMDLDataLoaderNotifyInfo.parameter = j;
            aVMDLDataLoaderNotifyInfo.code = i2;
            Message messageObtainMessage = this.mHandler.obtainMessage();
            messageObtainMessage.obj = aVMDLDataLoaderNotifyInfo;
            messageObtainMessage.what = i;
            messageObtainMessage.sendToTarget();
        }
    }

    public void preloadResource(String str, int i, int i2) {
        if (this.mState == 1 && !TextUtils.isEmpty(str) && i2 != 0) {
            Lock lock = getLock(2);
            lock.lock();
            try {
                try {
                    long j = this.mHandle;
                    if (j != 0) {
                        _preloadResourceWithOffset(j, str, i, i2);
                    }
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.printStackTrace();
                }
                lock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                throw th;
            }
        }
    }

    public void setInt64ValueByStrKey(int i, String str, long j) {
        if (this.mState != 1) {
            return;
        }
        this.mWriteLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _setInt64ValueByStrKey(j2, i, str, j);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            this.mWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mWriteLock.unlock();
            throw th;
        }
    }

    public long copyFile(String str, String str2, String str3) {
        long j_copyFileWithCustomDir = -1;
        if (this.mState != 1) {
            return -1L;
        }
        Lock lock = getLock(1);
        lock.lock();
        try {
            try {
                long j = this.mHandle;
                if (j != 0) {
                    j_copyFileWithCustomDir = _copyFileWithCustomDir64(j, str, str2, str3);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                long j2 = this.mHandle;
                if (j2 != 0) {
                    try {
                        j_copyFileWithCustomDir = _copyFileWithCustomDir(j2, str, str2, str3);
                    } catch (UnsatisfiedLinkError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        e2.printStackTrace();
                    }
                }
                e.printStackTrace();
            }
            lock.unlock();
            return j_copyFileWithCustomDir;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLogInfo(int r15, int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.onLogInfo(int, int, int, java.lang.String):void");
    }

    public void preloadGroupResource(String str, String str2, int i, int i2) {
        if (this.mState == 1 && !TextUtils.isEmpty(str2) && i2 != 0) {
            Lock lock = getLock(2);
            lock.lock();
            try {
                try {
                    long j = this.mHandle;
                    if (j != 0) {
                        _preloadGroupResource(j, str, str2, i, i2);
                    }
                } catch (UnsatisfiedLinkError e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.printStackTrace();
                }
                lock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                throw th;
            }
        }
    }

    public synchronized void onTaskEvent(int i, String str, int i2, int i3, String str2) {
        JSONObject jSONObject;
        if (this.mTaskListener == null) {
            return;
        }
        if (!AVMDLTaskEventID.taskTypeIsValid(i2)) {
            return;
        }
        if (!AVMDLTaskEventID.eventTypeIsValid(i3)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
            this.mTaskListener.onTaskEventNotify(i, str, i2, i3, jSONObject);
            return;
        }
        jSONObject = null;
        this.mTaskListener.onTaskEventNotify(i, str, i2, i3, jSONObject);
        return;
    }

    public void onTaskEventWithData(int i, int i2, int i3, String str, byte[] bArr) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        int length = 0;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = str;
        if (bArr != null) {
            length = bArr.length;
        }
        objArr[4] = Integer.valueOf(length);
        AVMDLLog.d("MIO_IMG", C786410Ut5.k4(locale, "onTaskEventWithData, what: %d, intParam1: %d, intParam2: %d, strParam: %s, dataSize: %d", objArr));
        if (this.mState != 1 || this.mLogHandler == null) {
            return;
        }
        switch (i) {
            case 1100:
            case 1101:
            case 1103:
            case 1104:
                AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = new AVMDLDataLoaderNotifyInfo();
                aVMDLDataLoaderNotifyInfo.what = i;
                aVMDLDataLoaderNotifyInfo.code = i2;
                aVMDLDataLoaderNotifyInfo.parameter = i3;
                aVMDLDataLoaderNotifyInfo.strParam = str;
                aVMDLDataLoaderNotifyInfo.data = bArr;
                Message messageObtainMessage = this.mLogHandler.obtainMessage();
                messageObtainMessage.what = i;
                messageObtainMessage.obj = aVMDLDataLoaderNotifyInfo;
                messageObtainMessage.sendToTarget();
                break;
        }
    }

    public long readImageStream(String str, byte[] bArr, int i, long j, int i2) {
        long j_readImageStream = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str) || bArr == null || i < 0 || i2 <= 0 || j < 0 || i > bArr.length || i2 > bArr.length - i) {
            return -1L;
        }
        this.mReadLock.lock();
        try {
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    j_readImageStream = _readImageStream(j2, str, bArr, i, j, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                AVMDLLog.e("MIO_IMG", e.toString());
            }
            this.mReadLock.unlock();
            return j_readImageStream;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mReadLock.unlock();
            throw th;
        }
    }

    public void updateDNSInfo(String str, String str2, long j, String str3, int i) {
        if (this.mState != 1) {
            return;
        }
        Lock lock = getLock(4);
        lock.lock();
        try {
            try {
                _updateDNSInfo(this.mHandle, str, str2, j, str3, i);
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                e.printStackTrace();
            }
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.StringBuilder] */
    public int writeDataToFile(String str, long j, long j2, int i, byte[] bArr) {
        int i_writeDataToFile;
        if (this.mState != 1) {
            return -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start write data to file filekey:");
        sbLIZ.append(str);
        sbLIZ.append(" off:");
        sbLIZ.append(j2);
        sbLIZ.append(" length:");
        sbLIZ.append(i);
        AVMDLLog.d("AVMDLDataLoader", C2188811AlT.LIZIZ(sbLIZ));
        ?? lock = getLock(1);
        lock.lock();
        try {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                throw th;
            }
        } catch (Exception e) {
            e = e;
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
        }
        try {
            i_writeDataToFile = _writeDataToFile(this.mHandle, str, j, j2, i, bArr);
            lock.unlock();
        } catch (Exception e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            lock.unlock();
            i_writeDataToFile = -3;
        } catch (UnsatisfiedLinkError e4) {
            e = e4;
            TryCatchGuardChecker.doCheck(e);
            lock.unlock();
            i_writeDataToFile = -2;
        }
        lock = new StringBuilder("end write data to file filekey:");
        lock.append(str);
        lock.append(" off:");
        lock.append(j2);
        lock.append(" length:");
        lock.append(i);
        AVMDLLog.d("AVMDLDataLoader", lock.toString());
        return i_writeDataToFile;
    }
}
