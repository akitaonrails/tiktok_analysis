package com.ss.videoarch.liveio;

import X.C09SD;
import X.C0VSJ;
import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C838410Wul;
import X.InterfaceC1476670oWv;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.INetworkApi;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.mediakit.net.BWA;
import com.ss.mediakit.net.BwaResult;
import com.ss.mediakit.net.MIONetworkInfo;
import com.ss.mediakit.net.NQE;
import com.ss.mediakit.net.NetworkState;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class LiveIOManager {
    public static LiveIOManager mInstance;
    public static boolean mIsLibraryLoaded;
    public String mCacheDir;
    public boolean mCheckPermissonToGetNetwork;
    public Context mContext;
    public boolean mHasSetDeviceInfo;
    public boolean mIsNativeCreate;
    public String mSettings;
    public volatile int mState;

    private native void _mio_addBwaResultCallback(BwaResult.BwaResultCallback bwaResultCallback, String str);

    private native void _mio_addNetworkStateCallback(NetworkState.NetworkStateCallback networkStateCallback, String str);

    private native void _mio_close();

    private native int _mio_create();

    private native BwaResult _mio_getBwaResult(String str);

    private native long _mio_getLongValue(int i);

    private native long _mio_getLongValueByStr(String str, int i);

    private native MIONetworkInfo _mio_getNetworkInfoByCid(String str);

    private native List<MIONetworkInfo> _mio_getNetworkInfoListByCid(String str, long j);

    private native NetworkState _mio_getNetworkState(int i);

    private native String _mio_getStringValue(int i);

    private native String _mio_getStringValueByStr(String str, int i);

    private native void _mio_notifyFnish(String str, String str2);

    private native void _mio_play(String str);

    private native void _mio_preConnect(String str, String str2);

    private native int _mio_preioStart(String str);

    private native int _mio_preioStop(String str);

    private native void _mio_prepare(String str, String str2);

    private native void _mio_removeBwaResultCallback(String str);

    private native void _mio_removeLiveEngineCallback(String str);

    private native void _mio_removeNetworkStateCallback(String str);

    private native void _mio_setConfig(int i, String str);

    private native void _mio_setInt64Value(int i, long j);

    private native void _mio_setInt64ValueByStrKey(int i, String str, long j);

    private native void _mio_setIntValue(int i, int i2);

    private native void _mio_setLiveEngineCallback(IMIOLivePlayTaskCallback iMIOLivePlayTaskCallback, String str, boolean z);

    private native void _mio_setStringValue(int i, String str);

    private native void _mio_setStringValueByStrKey(int i, String str, String str2);

    private native int _mio_start();

    public void close() {
        synchronized (this) {
            try {
                if (this.mState == 2) {
                    return;
                }
                try {
                    if (this.mIsNativeCreate) {
                        _mio_close();
                    }
                    this.mIsNativeCreate = false;
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        this.mIsNativeCreate = false;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        this.mIsNativeCreate = false;
                        this.mState = 2;
                        throw th2;
                    }
                }
                this.mState = 2;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    public void setListener(int i, InterfaceC1476670oWv interfaceC1476670oWv) {
    }

    public int start() {
        synchronized (this) {
            try {
                if (TextUtils.isEmpty(this.mSettings)) {
                    return -1;
                }
                if (this.mState == 1) {
                    return 0;
                }
                if (!this.mIsNativeCreate) {
                    try {
                        _mio_create();
                        this.mIsNativeCreate = true;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.mIsNativeCreate = false;
                        this.mState = 0;
                        return -1;
                    }
                }
                _mio_setConfig(LSPassThroughRecordSizeConfig.DEFAULT, this.mSettings);
                this.mSettings = null;
                try {
                    this.mState = _mio_start() == 0 ? 1 : 0;
                    if (this.mState == 1) {
                        NQE.getInstance().init(1);
                        BWA.getInstance().init();
                    }
                    return 0;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return -1;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    public static LiveIOManager getInstance() {
        if (mInstance == null) {
            synchronized (LiveIOManager.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new LiveIOManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public static synchronized int loadNative() {
        if (mIsLibraryLoaded) {
            return 0;
        }
        try {
            INVOKESTATIC_com_ss_videoarch_liveio_LiveIOManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("liveio");
            mIsLibraryLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return !mIsLibraryLoaded ? -1 : 0;
    }

    public int getCurrentNetworkType() {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(this.mContext, "connectivity"));
            if (networkInfoLJIJ != null && networkInfoLJIJ.isConnected()) {
                int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEdzVUVIuRACHbhhZGc9USiyLiEeJh9I13GOp2MACSw==", null));
                if (iLJLLILLLL == 0) {
                    int iLJLL = C2204961BRm.LJLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEdzVUVIuRACHbhhZGc9USiyLiEeJh9I13GOp2MACSw==", null));
                    if (iLJLL == 20) {
                        return 4;
                    }
                    switch (iLJLL) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            return 2;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        case 14:
                        case 15:
                            return 3;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            return 1;
                    }
                }
                if (iLJLLILLLL == 1) {
                    return 0;
                }
            }
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public boolean isRunning() {
        return this.mState == 1;
    }

    public boolean GetCheckPermissionToGetNetwork() {
        return this.mCheckPermissonToGetNetwork;
    }

    public boolean GetHasSetDeviceInfo() {
        return this.mHasSetDeviceInfo;
    }

    public static void INVOKESTATIC_com_ss_videoarch_liveio_LiveIOManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    private void createDir(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
    }

    private void parseSettingsAndInit(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("cache_dir")) {
                this.mCacheDir = JSONObjectProtectorUtils.getString(jSONObject, "cache_dir");
            }
            if (!TextUtils.isEmpty(this.mCacheDir)) {
                createDir(this.mCacheDir);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public BwaResult getBwaResult(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return _mio_getBwaResult(str);
    }

    public long getLongValue(int i) {
        synchronized (this) {
            try {
                long j_mio_getLongValue = -1;
                if (!this.mIsNativeCreate) {
                    return -1L;
                }
                try {
                    j_mio_getLongValue = _mio_getLongValue(i);
                    return j_mio_getLongValue;
                } catch (Throwable th) {
                    return j_mio_getLongValue;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public MIONetworkInfo getNetworkInfoByCid(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return _mio_getNetworkInfoByCid(str);
    }

    public NetworkState getNetworkState(int i) {
        return _mio_getNetworkState(i);
    }

    public String getStringValue(int i) {
        String str_mio_getStringValue = null;
        if (this.mState != 1) {
            return null;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return null;
                }
                try {
                    str_mio_getStringValue = _mio_getStringValue(i);
                    return str_mio_getStringValue;
                } catch (Throwable th) {
                    return str_mio_getStringValue;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void play(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return;
                }
                try {
                    _mio_play(str);
                } catch (Throwable th) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void removeBwaResultCallback(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        _mio_removeBwaResultCallback(str);
    }

    public void removeLiveEngineCallback(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return;
                }
                try {
                    _mio_removeLiveEngineCallback(str);
                } catch (Exception e) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void removeNetworkStateCallback(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        _mio_removeNetworkStateCallback(str);
    }

    public void setApplicationContext(Context context) {
        this.mContext = context;
        if (context == null || C838410Wul.LIZ(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return;
        }
        this.mCheckPermissonToGetNetwork = true;
    }

    public int startPreIO(String str) {
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return -3;
                }
                try {
                    return _mio_preioStart(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return -1;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public int stopPreIO(String str) {
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return -3;
                }
                try {
                    return _mio_preioStop(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return -1;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public void addBwaResultCallback(BwaResult.BwaResultCallback bwaResultCallback, String str) {
        if (bwaResultCallback != null && !TextUtils.isEmpty(str)) {
            _mio_addBwaResultCallback(bwaResultCallback, str);
        }
    }

    public void addNetworkStateCallback(NetworkState.NetworkStateCallback networkStateCallback, String str) {
        if (networkStateCallback != null && !TextUtils.isEmpty(str)) {
            _mio_addNetworkStateCallback(networkStateCallback, str);
        }
    }

    public long getLongValueByStr(String str, int i) {
        long j_mio_getLongValueByStr = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1L;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return -1L;
                }
                try {
                    j_mio_getLongValueByStr = _mio_getLongValueByStr(str, i);
                    return j_mio_getLongValueByStr;
                } catch (Throwable th) {
                    return j_mio_getLongValueByStr;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public List<MIONetworkInfo> getNetworkInfoListByCid(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return _mio_getNetworkInfoListByCid(str, j);
    }

    public String getStringValueByStr(String str, int i) {
        String str_mio_getStringValueByStr = null;
        if (this.mState != 1) {
            return null;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return null;
                }
                try {
                    str_mio_getStringValueByStr = _mio_getStringValueByStr(str, i);
                    return str_mio_getStringValueByStr;
                } catch (Throwable th) {
                    return str_mio_getStringValueByStr;
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void notifyFinish(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return;
                }
                try {
                    _mio_notifyFnish(str, str2);
                } catch (Throwable th) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void preConnect(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return;
                }
                try {
                    _mio_preConnect(str, str2);
                } catch (Throwable th) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void prepare(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            synchronized (this) {
                try {
                    if (!this.mIsNativeCreate) {
                        return;
                    }
                    try {
                        _mio_prepare(str, str2);
                    } catch (Throwable th) {
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    public void setConfig(int i, String str) {
        synchronized (this) {
            if (i == 1000) {
                try {
                    try {
                        this.mSettings = str;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void setIntValue(int i, int i2) {
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return;
                }
                try {
                    _mio_setIntValue(i, i2);
                } catch (Throwable th) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void setIntValueForce(int i, int i2) {
        try {
            _mio_setIntValue(i, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setLongValue(int i, long j) {
        if (this.mState != 1) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return;
                }
                try {
                    _mio_setInt64Value(i, j);
                } catch (Throwable th) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void setStringValue(int i, String str) {
        if (TextUtils.isEmpty(str) || this.mState != 1) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return;
                }
                try {
                    _mio_setStringValue(i, str);
                } catch (Throwable th) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void setInt64ValueByStrKey(int i, String str, long j) {
        if (this.mState != 1) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return;
                }
                try {
                    _mio_setInt64ValueByStrKey(i, str, j);
                } catch (Throwable th) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void setLiveEngineCallback(IMIOLivePlayTaskCallback iMIOLivePlayTaskCallback, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return;
                }
                try {
                    _mio_setLiveEngineCallback(iMIOLivePlayTaskCallback, str, z);
                } catch (Exception e) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void setStringValueByStrKey(int i, String str, String str2) {
        if (this.mState != 1) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.mIsNativeCreate) {
                    return;
                }
                try {
                    _mio_setStringValueByStrKey(i, str, str2);
                } catch (Throwable th) {
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    private void nativeRecall(int i, long j, long j2, long j3, long j4, String str, String str2, String str3, String str4) {
        if (3001 == i) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    AppLogNewUtils.onEventV3(str, new JSONObject(str2));
                    return;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        if (1156 == i && !TextUtils.isEmpty(str)) {
            try {
                String strLIZ = new C09SD() { // from class: X.09SC
                    @Override // X.C09SD
                    public final String LIZ(String str5) {
                        Pair<String, String> pairLIZJ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String str6 = null;
                        try {
                            pairLIZJ = C2088908Gh.LIZJ(str5, linkedHashMap);
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            pairLIZJ = null;
                        }
                        String str7 = (String) pairLIZJ.first;
                        String str8 = (String) pairLIZJ.second;
                        INetworkApi iNetworkApi = (INetworkApi) C1515120pWw.LJIIIZ(INetworkApi.class, str7);
                        C1493620oyG c1493620oyG = new C1493620oyG();
                        long j5 = 10000;
                        c1493620oyG.LIZJ = j5;
                        c1493620oyG.LIZLLL = j5;
                        c1493620oyG.LJIIZILJ = false;
                        C0X9S<String> c0x9sDoGet = iNetworkApi.doGet(false, Integer.MAX_VALUE, str8, linkedHashMap, null, c1493620oyG);
                        try {
                            C0X52<String> c0x52Execute = c0x9sDoGet.execute();
                            if (c0x52Execute.LIZ.LIZIZ == 200) {
                                str6 = c0x52Execute.LIZIZ;
                            }
                        } catch (Throwable th) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                if (c0x9sDoGet != null) {
                                }
                                return str6;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                if (c0x9sDoGet != null) {
                                    c0x9sDoGet.cancel();
                                }
                                throw th2;
                            }
                        }
                        c0x9sDoGet.cancel();
                        return str6;
                    }
                }.LIZ(str);
                if (!TextUtils.isEmpty(strLIZ)) {
                    setStringValue(1157, C786410Ut5.J3(new JSONObject(strLIZ)));
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
