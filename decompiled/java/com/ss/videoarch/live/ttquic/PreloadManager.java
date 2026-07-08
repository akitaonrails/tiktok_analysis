package com.ss.videoarch.live.ttquic;

import X.C08RN;
import X.C0VSJ;
import X.C1726190v1N;
import X.C2118208Ro;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C822650WOx;
import X.RunnableC1726150v1J;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.videoarch.live.ttquic.PreloadListener;
import com.ss.videoarch.live.ttquic.PreloadManager;
import com.ss.videoarch.live.ttquic.TTEvent;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class PreloadManager {
    public static boolean mInitialized;
    public Context mContext;
    public RunnableC1726150v1J mCurrentTask;
    public int mEnableCancelAll;
    public Handler mEventHandler;
    public HandlerThread mEventThread;
    public final Object mListenerLock;
    public final HashMap<Integer, PreloadListener> mListeners;
    public int mMpdPreloadMinSec;
    public long mNativePtr;
    public int mOptCancelTask;
    public int mPlayCacheMaxAgeSec;
    public final Stack<Integer> mPlayerIds;
    public int mPreloadCacheMaxAgeSec;
    public final ThreadPoolExecutor mPreloadExecutor;
    public final Set<String> mPreloadList;
    public String mQuicScfgPath;
    public int mRequestOpenTimeout;
    public int mRequestReadTimeout;
    public final Object mTaskLock;
    public final LruCache<String, RunnableC1726150v1J> mTasks;

    private native int native_cancel(long j, String str);

    private native int native_destroy(long j);

    private native long native_init(TTEngineParam tTEngineParam, Handler handler);

    public int getActivePlayer() {
        try {
            if (this.mPlayerIds.isEmpty()) {
                return 0;
            }
            return this.mPlayerIds.peek().intValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public native int native_preload(long j, TTRequestParam tTRequestParam);

    private void destroyEvent() {
        Handler handler = this.mEventHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mEventHandler = null;
        }
        HandlerThread handlerThread = this.mEventThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mEventThread = null;
        }
    }

    private int initContext() {
        try {
            Method method = Class.forName("com.ss.videoarch.live.ttquic.ContextUtils").getMethod("initApplicationContext", Context.class);
            method.setAccessible(true);
            method.invoke(null, C786410Ut5.N3(this.mContext));
            Method method2 = Class.forName("com.ss.videoarch.live.ttquic.JNIUtils").getMethod("setClassLoader", ClassLoader.class);
            method2.setAccessible(true);
            method2.invoke(null, this.mContext.getClassLoader());
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -4002;
        }
    }

    private int initEvent() {
        try {
            HandlerThread handlerThread = new HandlerThread("tt_preload_event");
            this.mEventThread = handlerThread;
            handlerThread.start();
            this.mEventHandler = new BPEAHandler(C786410Ut5.W2(this.mEventThread), new Handler.Callback() { // from class: X.0v1K
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    TTEvent tTEvent = (TTEvent) HandlerHook.getMessageObj(message.obj);
                    this.LL.updateTaskState(tTEvent);
                    if (!TextUtils.isEmpty(tTEvent.url)) {
                        PreloadManager preloadManager = this.LL;
                        RunnableC1726150v1J runnableC1726150v1J = preloadManager.mTasks.get(preloadManager.cacheKey(tTEvent.url));
                        if (runnableC1726150v1J != null) {
                            tTEvent.bundle = runnableC1726150v1J.LLJ;
                            tTEvent.mode = runnableC1726150v1J.LLIZ;
                            synchronized (this.LL.mListenerLock) {
                                try {
                                    PreloadListener preloadListener = this.LL.mListeners.get(Integer.valueOf(runnableC1726150v1J.LLILLJJLI));
                                    if (preloadListener != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("preload_event", tTEvent.what);
                                        C786410Ut5.LJJJI("preload_url", tTEvent.url, bundle);
                                        C786410Ut5.LJJJI("preload_error", tTEvent.error, bundle);
                                        bundle.putInt("preload_code", tTEvent.code);
                                        bundle.putInt("preload_sub_code", tTEvent.subCode);
                                        bundle.putInt("preload_num", tTEvent.preloadNum);
                                        bundle.putInt("video_cached_num", tTEvent.videoCachedNum);
                                        bundle.putInt("audio_cached_num", tTEvent.audioCachedNum);
                                        bundle.putInt("video_init_section_cached", tTEvent.videoInitSectionCached);
                                        bundle.putInt("audio_init_section_cached", tTEvent.audioInitSectionCached);
                                        bundle.putLong("cache_read_bytes", tTEvent.cacheReadBytes);
                                        bundle.putLong("cache_write_bytes", tTEvent.cacheWriteBytes);
                                        bundle.putInt("cache_mode", tTEvent.cacheMode);
                                        bundle.putInt("cache_frame_count", tTEvent.cacheFrameCount);
                                        bundle.putLong("cache_duration", tTEvent.cacheDuration);
                                        bundle.putInt("cache_size", tTEvent.cacheSize);
                                        bundle.putLong("cancel_cost_time", tTEvent.cancelCostTime);
                                        bundle.putInt("opt_cancel_task", tTEvent.optCancelTask);
                                        bundle.putInt("mode", tTEvent.mode);
                                        C786410Ut5.LJJIIZI(bundle, tTEvent.bundle, "ext_info");
                                        preloadListener.onPreloadEvent(tTEvent.what, bundle);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
            });
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -4003;
        }
    }

    private int loadLibrary() {
        try {
            C2118208Ro.LIZ("ttffmpeg");
            try {
                C2118208Ro.LIZ("ffmpeg_dashdec");
                try {
                    C2118208Ro.LIZ("ttmcmaf");
                    try {
                        C2118208Ro.LIZ("vcbasekit");
                        try {
                            C2118208Ro.LIZ("ttquic");
                            try {
                                C2118208Ro.LIZ("ttpreload");
                                return 0;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                return -1004;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            return -1001;
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        return -1006;
                    }
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    return -1002;
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                return -1005;
            }
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            return -1003;
        }
    }

    public int cancelAll() {
        if (this.mEnableCancelAll != 1 || this.mNativePtr == 0) {
            return -1;
        }
        String str = "";
        synchronized (this.mTaskLock) {
            try {
                RunnableC1726150v1J runnableC1726150v1J = this.mCurrentTask;
                if (runnableC1726150v1J != null) {
                    runnableC1726150v1J.LLILLL.set(3);
                    str = this.mCurrentTask.LL;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        native_cancel(this.mNativePtr, str);
        return 0;
    }

    public void destroy() {
        long j = this.mNativePtr;
        if (j != 0) {
            native_destroy(j);
            this.mNativePtr = 0L;
        }
        destroyEvent();
        synchronized (this.mListenerLock) {
            try {
                this.mListeners.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        mInitialized = false;
    }

    public int getCurrentTaskState() {
        int i;
        synchronized (this.mTaskLock) {
            try {
                RunnableC1726150v1J runnableC1726150v1J = this.mCurrentTask;
                i = runnableC1726150v1J != null ? runnableC1726150v1J.LLILLL.get() : 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    public PreloadManager() {
        this.mPreloadCacheMaxAgeSec = 600;
        this.mPlayCacheMaxAgeSec = 600;
        this.mRequestOpenTimeout = 5000;
        this.mRequestReadTimeout = 5000;
        this.mEnableCancelAll = 1;
        this.mMpdPreloadMinSec = -1;
        this.mListenerLock = new Object();
        this.mListeners = new HashMap<>();
        this.mPreloadList = new HashSet();
        this.mTasks = new LruCache<>(64);
        this.mTaskLock = new Object();
        this.mCurrentTask = null;
        this.mPlayerIds = new Stack<>();
        this.mPreloadExecutor = new C822650WOx(1, 1, 0L, TimeUnit.SECONDS, new PriorityBlockingQueue(64, new Comparator<RunnableC1726150v1J>() { // from class: X.0v1L
            @Override // java.util.Comparator
            public final int compare(RunnableC1726150v1J runnableC1726150v1J, RunnableC1726150v1J runnableC1726150v1J2) {
                long j;
                long j2;
                RunnableC1726150v1J runnableC1726150v1J3 = runnableC1726150v1J;
                RunnableC1726150v1J runnableC1726150v1J4 = runnableC1726150v1J2;
                int i = runnableC1726150v1J3.LLIZ;
                int i2 = runnableC1726150v1J4.LLIZ;
                if (i == i2) {
                    j = runnableC1726150v1J3.LLILZIL;
                    j2 = runnableC1726150v1J4.LLILZIL;
                } else {
                    if (i == 1) {
                        return -1;
                    }
                    if (i2 == 1) {
                        return 1;
                    }
                    j = runnableC1726150v1J3.LLILZIL;
                    j2 = runnableC1726150v1J4.LLILZIL;
                }
                return (int) (j - j2);
            }
        }), new ThreadFactory() { // from class: X.0v1M
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new BPEAThread(runnable, "PreloadExecutor");
            }
        });
    }

    public static PreloadManager getInstance() {
        return C1726190v1N.LIZ;
    }

    public static File INVOKEVIRTUAL_com_ss_videoarch_live_ttquic_PreloadManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public void attachPlayer(int i) {
        this.mPlayerIds.push(Integer.valueOf(i));
    }

    public String cacheKey(String str) {
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        builderBuildUpon.clearQuery();
        return builderBuildUpon.build().getPath();
    }

    public int cancelAll(int i) {
        RunnableC1726150v1J runnableC1726150v1J;
        if (this.mEnableCancelAll == 1 && this.mNativePtr != 0 && (runnableC1726150v1J = this.mCurrentTask) != null) {
            runnableC1726150v1J.LLILLL.set(3);
            native_cancel(this.mNativePtr, this.mCurrentTask.LL);
            return 0;
        }
        return -1;
    }

    public void detachPlayer(int i) {
        try {
            this.mPlayerIds.remove(Integer.valueOf(i));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void recordResource(String str) {
        this.mPreloadList.add(str);
    }

    public void removeListener(int i) {
        synchronized (this.mListenerLock) {
            try {
                this.mListeners.remove(Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void updateTaskState(TTEvent tTEvent) {
        RunnableC1726150v1J runnableC1726150v1J;
        if (tTEvent.what == 0 || TextUtils.isEmpty(tTEvent.url) || (runnableC1726150v1J = this.mTasks.get(cacheKey(tTEvent.url))) == null) {
            return;
        }
        synchronized (this.mTaskLock) {
            try {
                this.mCurrentTask = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        int i = tTEvent.what;
        if (1 == i) {
            runnableC1726150v1J.LLILLL.set(4);
            runnableC1726150v1J.LLILZ = System.currentTimeMillis();
            runnableC1726150v1J.LLJI.countDown();
        } else {
            if (2 != i) {
                return;
            }
            runnableC1726150v1J.LLILLL.set(5);
            runnableC1726150v1J.LLILZLL = tTEvent.code;
            runnableC1726150v1J.LLJI.countDown();
        }
    }

    private int parseEngineParam(String str, TTEngineParam tTEngineParam) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("cacheMaxSize")) {
                tTEngineParam.cacheMaxSize = jSONObject.optInt("cacheMaxSize");
            }
            if (jSONObject.has("PreloadCacheMaxAge")) {
                this.mPreloadCacheMaxAgeSec = jSONObject.optInt("PreloadCacheMaxAge");
            }
            if (jSONObject.has("PlayCacheMaxAge")) {
                this.mPlayCacheMaxAgeSec = jSONObject.optInt("PlayCacheMaxAge");
            }
            if (jSONObject.has("openTimeout")) {
                this.mRequestOpenTimeout = jSONObject.optInt("openTimeout");
            }
            if (jSONObject.has("readTimeout")) {
                this.mRequestReadTimeout = jSONObject.optInt("readTimeout");
            }
            if (jSONObject.has("EnableCancelAll")) {
                this.mEnableCancelAll = jSONObject.optInt("EnableCancelAll");
            }
            if (jSONObject.has("MpdPreloadMinSec")) {
                this.mMpdPreloadMinSec = jSONObject.optInt("MpdPreloadMinSec");
            }
            if (jSONObject.has("optCancelTask")) {
                this.mOptCancelTask = jSONObject.optInt("optCancelTask");
            }
            if (tTEngineParam.cacheMaxSize <= 0) {
                tTEngineParam.cacheMaxSize = 209715200;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(INVOKEVIRTUAL_com_ss_videoarch_live_ttquic_PreloadManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(this.mContext).getAbsolutePath());
            String str2 = File.separator;
            sbLIZ.append(str2);
            sbLIZ.append("live_preload");
            tTEngineParam.cachePath = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(tTEngineParam.cachePath);
            sbLIZ2.append(str2);
            sbLIZ2.append("flv");
            tTEngineParam.flvCachePath = C2188811AlT.LIZIZ(sbLIZ2);
            C0VSJ c0vsj = new C0VSJ(tTEngineParam.cachePath);
            if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                return -1;
            }
            C0VSJ c0vsj2 = new C0VSJ(tTEngineParam.flvCachePath);
            if (!c0vsj2.exists() && !c0vsj2.mkdirs()) {
                return -1;
            }
            if (this.mPreloadCacheMaxAgeSec <= 0) {
                this.mPreloadCacheMaxAgeSec = 600;
            }
            if (this.mPlayCacheMaxAgeSec <= 0) {
                this.mPlayCacheMaxAgeSec = 600;
            }
            if (this.mRequestOpenTimeout <= 0) {
                this.mRequestOpenTimeout = 5000;
            }
            if (this.mRequestReadTimeout <= 0) {
                this.mRequestReadTimeout = 5000;
                return 0;
            }
            return 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public void addListener(int i, Object obj) {
        synchronized (this.mListenerLock) {
            try {
                if (obj instanceof PreloadListener) {
                    this.mListeners.put(Integer.valueOf(i), (PreloadListener) obj);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int cancel(int i, String str) {
        RunnableC1726150v1J runnableC1726150v1J = this.mTasks.get(cacheKey(str));
        if (runnableC1726150v1J == null) {
            return -3002;
        }
        if (runnableC1726150v1J.LLILLJJLI != i) {
            return -3003;
        }
        if (1 != runnableC1726150v1J.LLILLL.get()) {
            return -3004;
        }
        runnableC1726150v1J.LLILLL.set(3);
        native_cancel(this.mNativePtr, str);
        return 0;
    }

    public Bundle getPreloadInfo(String str, int i) {
        int i2;
        Bundle bundle = new Bundle();
        long jCurrentTimeMillis = 0;
        int i3 = -1;
        String string = "";
        if (i != 0 && 1 != i) {
            i2 = -2;
        } else {
            String strCacheKey = cacheKey(str);
            RunnableC1726150v1J runnableC1726150v1J = this.mTasks.get(strCacheKey);
            if (runnableC1726150v1J == null) {
                if (this.mPreloadList.contains(strCacheKey)) {
                    i2 = -3002;
                } else {
                    i2 = -3009;
                }
            } else if (4 != runnableC1726150v1J.LLILLL.get() && 6 != runnableC1726150v1J.LLILLL.get()) {
                if (1 == runnableC1726150v1J.LLILLL.get()) {
                    i2 = -3001;
                } else if (5 == runnableC1726150v1J.LLILLL.get()) {
                    i2 = runnableC1726150v1J.LLILZLL;
                } else {
                    i2 = -999;
                }
            } else if (runnableC1726150v1J.LLILZ > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - runnableC1726150v1J.LLILZ;
                if (jCurrentTimeMillis < ((long) this.mPlayCacheMaxAgeSec) * 1000) {
                    int i4 = runnableC1726150v1J.LLIZ;
                    if (i4 == -1) {
                        i2 = -3005;
                    } else {
                        i2 = 0;
                        if (i4 == 1) {
                            if (jCurrentTimeMillis >= runnableC1726150v1J.LLIZLLLIL.cmafPreloadMPDExpMs) {
                                i2 = -8002;
                            }
                        } else {
                            string = runnableC1726150v1J.LLJ.getString("resolution", "");
                        }
                        i3 = runnableC1726150v1J.LLIZ;
                    }
                } else {
                    i2 = -8000;
                }
            } else {
                i2 = -8001;
            }
        }
        bundle.putInt("preload_result", i2);
        bundle.putLong("time_delta", jCurrentTimeMillis);
        bundle.putInt("preload_mode", i3);
        C786410Ut5.LJJJI("preload_resolution", string, bundle);
        return bundle;
    }

    public int init(Context context, String str) {
        if (mInitialized) {
            return 0;
        }
        this.mContext = C786410Ut5.N3(context);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(INVOKEVIRTUAL_com_ss_videoarch_live_ttquic_PreloadManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context).getAbsolutePath());
        sbLIZ.append("/pullstream.scfg");
        this.mQuicScfgPath = C2188811AlT.LIZIZ(sbLIZ);
        int iLoadLibrary = loadLibrary();
        if (iLoadLibrary != 0) {
            return iLoadLibrary;
        }
        TTEngineParam tTEngineParam = new TTEngineParam();
        int engineParam = parseEngineParam(str, tTEngineParam);
        if (engineParam != 0) {
            return engineParam;
        }
        int iInitContext = initContext();
        if (iInitContext != 0) {
            return iInitContext;
        }
        int iInitEvent = initEvent();
        if (iInitEvent != 0) {
            return iInitEvent;
        }
        long jNative_init = native_init(tTEngineParam, this.mEventHandler);
        this.mNativePtr = jNative_init;
        if (jNative_init == 0) {
            return -4000;
        }
        mInitialized = true;
        return 0;
    }

    private int parseSdkParams(String str, String str2, TTRequestParam tTRequestParam) {
        try {
            tTRequestParam.url = str;
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("cmaf")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("cmaf"));
                if (jSONObject2.has("CmafEnableFastOpen")) {
                    tTRequestParam.cmafEnableFastOpen = jSONObject2.optInt("CmafEnableFastOpen");
                }
                if (jSONObject2.has("CmafSkipInitSection")) {
                    tTRequestParam.cmafSkipInitSection = jSONObject2.optInt("CmafSkipInitSection");
                }
                if (jSONObject2.has("CmafStartSegmentOffset")) {
                    tTRequestParam.cmafStartSegOffset = jSONObject2.optInt("CmafStartSegmentOffset");
                }
                if (jSONObject2.has("CmafPreloadNum")) {
                    tTRequestParam.cmafPreloadNum = jSONObject2.optInt("CmafPreloadNum");
                }
                if (jSONObject2.has("CmafPreloadParallel")) {
                    tTRequestParam.cmafPreloadParallel = jSONObject2.optInt("CmafPreloadParallel");
                }
                if (jSONObject2.has("CmafPreloadMPDUpdateMs")) {
                    tTRequestParam.cmafPreloadMPDUpdateMs = jSONObject2.optInt("CmafPreloadMPDUpdateMs");
                }
                if (jSONObject2.has("CmafPreloadMPDExpMs")) {
                    tTRequestParam.cmafPreloadMPDExpMs = jSONObject2.optInt("CmafPreloadMPDExpMs");
                }
            }
            if (jSONObject.has("httpx")) {
                String strOptString = jSONObject.optString("httpx");
                tTRequestParam.httpxParams = strOptString;
                JSONObject jSONObject3 = new JSONObject(strOptString);
                if (jSONObject3.has("HttpQuicVersion")) {
                    tTRequestParam.quicVersion = jSONObject3.optInt("HttpQuicVersion");
                }
                if (jSONObject3.has("HttpEnableCertVerify")) {
                    tTRequestParam.enableCertVerify = jSONObject3.optInt("HttpEnableCertVerify");
                }
            }
            if (jSONObject.has("LivePreloadConfig")) {
                JSONObject jSONObject4 = new JSONObject(jSONObject.optString("LivePreloadConfig"));
                if (jSONObject4.has("PreloadMode")) {
                    tTRequestParam.preloadMode = jSONObject4.optInt("PreloadMode", -1);
                }
            }
            if (jSONObject.has("quic")) {
                tTRequestParam.quicParams = jSONObject.optString("quic");
            }
            if (jSONObject.has("EnableSaveSCFG")) {
                if (1 == jSONObject.optInt("EnableSaveSCFG")) {
                    try {
                        tTRequestParam.quicSCFGAddr = this.mQuicScfgPath;
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        return -2004;
                    }
                }
            }
            if (jSONObject.has("SuggestProtocol")) {
                String strOptString2 = jSONObject.optString("SuggestProtocol");
                tTRequestParam.protocol = strOptString2;
                if (TextUtils.equals("h2", strOptString2)) {
                    tTRequestParam.httpVersion = 2;
                    tTRequestParam.lowProtocol = 1;
                    tTRequestParam.cryptoProtocol = 2;
                } else if (TextUtils.equals("h2q", strOptString2)) {
                    tTRequestParam.httpVersion = 2;
                    tTRequestParam.lowProtocol = 2;
                    tTRequestParam.cryptoProtocol = 1;
                } else if (TextUtils.equals("tls", strOptString2)) {
                    tTRequestParam.httpVersion = 1;
                    tTRequestParam.lowProtocol = 1;
                    tTRequestParam.cryptoProtocol = 2;
                } else if (TextUtils.equals("tcp", strOptString2)) {
                    tTRequestParam.httpVersion = 1;
                    tTRequestParam.lowProtocol = 0;
                }
            }
            if (jSONObject.has("SuggestFormat")) {
                tTRequestParam.format = jSONObject.optString("SuggestFormat");
            }
            if (jSONObject.has("CacheFrameCount")) {
                tTRequestParam.cacheFrameCount = jSONObject.optInt("CacheFrameCount");
            }
            if (jSONObject.has("CacheDuration")) {
                tTRequestParam.cacheDuration = jSONObject.optInt("CacheDuration");
            }
            if (jSONObject.has("MinCacheDuration")) {
                tTRequestParam.minCacheDuration = jSONObject.optInt("MinCacheDuration");
            }
            if (jSONObject.has("CacheMode")) {
                tTRequestParam.cacheMode = jSONObject.optInt("CacheMode");
            }
            tTRequestParam.httpCacheMaxAgeSec = this.mPreloadCacheMaxAgeSec;
            tTRequestParam.openTimeoutMs = this.mRequestOpenTimeout;
            tTRequestParam.readTimeoutMs = this.mRequestReadTimeout;
            tTRequestParam.optCancelTask = this.mOptCancelTask;
            return 0;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r18 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int preload(int r20, java.lang.String r21, java.lang.String r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.live.ttquic.PreloadManager.preload(int, java.lang.String, java.lang.String, android.os.Bundle):int");
    }
}
