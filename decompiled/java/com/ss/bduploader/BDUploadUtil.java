package com.ss.bduploader;

import X.C08TM;
import X.C0VSJ;
import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.bduploader.BDUploadUtil;
import com.ss.bduploader.logupload.VideoEventEngineUploader;
import com.ss.bduploader.net.BDUploadThreadPool;
import com.ss.bduploader.util.BDUrlDispatchInterface;
import com.ss.mediakit.vcnlib.VcnlibloadWrapper;
import com.ss.vcbkit.VCBaseKitLoader;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class BDUploadUtil {
    public static String DiskResumeConfigDir = "DiskResumeConfigDir";
    public static String RetryStatesInfoDir = "RetryStatesInfoDir";
    public static String SDKConfigDir = "SDKConfigDir";
    public static String SpeedTestcontextDir = "SpeedTestcontextDir";
    public static Boolean mEnableDisaptch;
    public static Boolean mEnableNativeLog;
    public static volatile boolean mIsLibraryLoaded;
    public static volatile boolean mIsXQuicLoaded;
    public static volatile BDLibraryLoaderProxy mProxy;
    public static volatile String mServerIP;
    public static volatile long mServerIPTime;
    public static String sdkConfigDir;
    public static final ReentrantLock mLock = new ReentrantLock();
    public static VideoEventEngineUploader eventEngineUploader = null;
    public static BDUrlDispatchInterface urlDispatch = null;

    static {
        Boolean bool = Boolean.FALSE;
        mEnableDisaptch = bool;
        mEnableNativeLog = bool;
    }

    public static synchronized String getDNSServerIP() {
        if (SystemClock.elapsedRealtime() - mServerIPTime >= 300000) {
            BDUploadThreadPool.addExecuteTask(new Runnable() { // from class: X.0jW6
                @Override // java.lang.Runnable
                public final void run() {
                    BDUploadUtil.lambda$getDNSServerIP$0();
                }
            });
        }
        return mServerIP;
    }

    public static /* synthetic */ void lambda$getDNSServerIP$0() {
        C1C7U.LIZ("BDUploadUtil@eba.getDNSServerIP$1L");
        try {
            InetAddress byName = InetAddress.getByName("whoami.akamai.net");
            if (byName != null) {
                mServerIP = C2204961BRm.d0(byName, new C0WZX("dzBzEhEpEcjYQEctShOAYxA5t1tc+xEEjWFSk+3G", null));
                mServerIPTime = SystemClock.elapsedRealtime();
            }
        } catch (UnknownHostException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("BDUploadUtil@eba.getDNSServerIP$1L");
    }

    public static boolean loadLibrary() {
        if (mProxy == null) {
            return true;
        }
        if (mProxy != null && !mIsLibraryLoaded) {
            boolean zLoadLibrary = VCBaseKitLoader.loadLibrary();
            boolean z = C08TM.LIZ() || mProxy.loadLibrary("ttopenssl");
            mProxy.loadLibrary("vcn");
            mProxy.loadLibrary("vcnverify");
            boolean zLoadLibrary2 = mProxy.loadLibrary("xquic");
            boolean zLoadLibrary3 = mProxy.loadLibrary("xquicclient");
            mProxy.loadLibrary("starship_sdk");
            boolean zLoadLibrary4 = mProxy.loadLibrary("bdvideouploader");
            mIsXQuicLoaded = zLoadLibrary2 && zLoadLibrary3;
            mIsLibraryLoaded = z && zLoadLibrary4 && zLoadLibrary;
        }
        return mIsLibraryLoaded;
    }

    public static synchronized void updateDNSServerIP() {
        if (SystemClock.elapsedRealtime() - mServerIPTime < 300000) {
            return;
        }
        new BPEAThread(new Runnable() { // from class: com.ss.bduploader.BDUploadUtil.1
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("BDUploadUtil@eba.updateDNSServerIP$1");
                com_ss_bduploader_BDUploadUtil$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("BDUploadUtil@eba.updateDNSServerIP$1");
            }

            public void com_ss_bduploader_BDUploadUtil$1__run$___twin___() {
                try {
                    InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                    if (byName != null) {
                        BDUploadUtil.mServerIP = C2204961BRm.d0(byName, new C0WZX("dzBzEhEpEcjYQEctShOAYxA5t1tc+xEEjWFSk+3G", null));
                        BDUploadUtil.mServerIPTime = SystemClock.elapsedRealtime();
                    }
                } catch (UnknownHostException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            public static void com_ss_bduploader_BDUploadUtil$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_bduploader_BDUploadUtil$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }).start();
    }

    public static synchronized boolean xquicAvalilable() {
        return mIsXQuicLoaded;
    }

    public static boolean loadVcn() {
        VcnlibloadWrapper.tryLoadVcnlib();
        VcnlibloadWrapper.tryLoadVcnverifylib();
        return true;
    }

    public static void INVOKESTATIC_com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static int createDir(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists()) {
            return 1;
        }
        String str2 = File.separator;
        if (!str.endsWith(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c0vsj.mkdirs()) {
            return 1;
        }
        return -1;
    }

    public static synchronized boolean initInternal(StringBuffer stringBuffer) {
        boolean z;
        if (!loadLibrary()) {
            return false;
        }
        if (mProxy != null) {
            z = true;
        } else {
            z = false;
        }
        if (systemLoadInit(z, stringBuffer) != 1) {
            return false;
        }
        return true;
    }

    public static Map<String, String> jsonToHashMap(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String strValueOf = String.valueOf(itKeys.next());
            map.put(strValueOf, jSONObject.optString(strValueOf));
        }
        return map;
    }

    public static JSONObject mapToJSON(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String mapToString(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put(str, obj);
                }
            }
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void setDispatchImp(BDUrlDispatchInterface bDUrlDispatchInterface) {
        urlDispatch = bDUrlDispatchInterface;
    }

    public static void setEnableDispatch(Boolean bool) {
        mEnableDisaptch = bool;
    }

    public static void setEnableNativeLog(Boolean bool) {
        mEnableNativeLog = bool;
    }

    public static void setLoadProxy(BDLibraryLoaderProxy bDLibraryLoaderProxy) {
        ReentrantLock reentrantLock = mLock;
        reentrantLock.lock();
        if (bDLibraryLoaderProxy != null) {
            try {
                mProxy = bDLibraryLoaderProxy;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                mLock.unlock();
                throw th;
            }
        }
        reentrantLock.unlock();
    }

    public static void setSDKConfigDir(String str) {
        String str2 = sdkConfigDir;
        if (str2 != null && str2.length() > 0) {
            return;
        }
        sdkConfigDir = str;
    }

    public static void setVideoEventUpload(VideoEventEngineUploader videoEventEngineUploader) {
        eventEngineUploader = videoEventEngineUploader;
    }

    public static int systemLoadInit(boolean z, StringBuffer stringBuffer) {
        boolean z2;
        if (mIsLibraryLoaded) {
            return 1;
        }
        mIsLibraryLoaded = z;
        if (!mIsLibraryLoaded) {
            C08TM.LIZ();
            VcnlibloadWrapper.tryLoadVcnlib();
            VcnlibloadWrapper.tryLoadVcnverifylib();
            VCBaseKitLoader.loadLibrary();
            try {
                INVOKESTATIC_com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("starship_sdk");
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                INVOKESTATIC_com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("xquic");
                INVOKESTATIC_com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("xquicclient");
                z2 = true;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                z2 = false;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                z2 = false;
            }
            mIsXQuicLoaded = z2;
            try {
                INVOKESTATIC_com_ss_bduploader_BDUploadUtil_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bdvideouploader");
                mIsLibraryLoaded = true;
            } catch (UnsatisfiedLinkError e3) {
                TryCatchGuardChecker.doCheck(e3);
                stringBuffer.append(e3.toString());
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                stringBuffer.append(th3.toString());
            }
        }
        if (mIsLibraryLoaded) {
            return 1;
        }
        return -1;
    }
}
