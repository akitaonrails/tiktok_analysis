package com.bytedance.vcloud.strategy;

import X.C08RN;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyStartupGearInfo;
import com.bytedance.vcloud.strategy.drm.ILiveWidevineNetworkClient;
import com.bytedance.vcloud.strategy.drm.LiveWidevineManager;
import com.bytedance.vcloud.strategy.drm.SessionConfig;
import com.bytedance.vcloud.strategy.drm.SessionEntry;
import com.bytedance.vcloud.strategy.model.LiveRoomInfo;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class StrategyCenter {
    public static final int ALGO_CONFIG_SMART_SERVICE_PACKAGE_URL = 31021;
    public static final int ALGO_CONFIG_STRING_SMART_RANGE_REQUEST = 31009;
    public static final int ENABLE_SMART_SERVICE = 808;
    public static final int SMART_RANGE_REQUEST_LABEL = 31204;
    public static volatile StrategyCenter mInstance;
    public ILiveFeatureBundle mAppInfoBundleNew;
    public ILiveFeatureBundle mAppInfobundle;
    public List<BusinessEventRecord> mBusinessEventCache;
    public Context mContext;
    public boolean mDidStart;
    public long mHandle;
    public IStrategyEventListener mListener;
    public boolean mLiveAppInfoBundleNewSetted;
    public boolean mLiveAppInfoBundleSetted;
    public boolean mLiveStrategyStartEarlier;
    public List<BusinessEventRecord> mSyncBusinessEventCache;
    public int mLogLevel = 3;
    public StrategyStartupGear mStrategyStartupGear = new StrategyStartupGear();
    public final ConcurrentLruCache<String, String> mediaAddedMap = new ConcurrentLruCache<>(50);
    public final ConcurrentLruCache<String, String> gearResultMap = new ConcurrentLruCache<>(35);
    public volatile String mCurrentScene = "engine_default";
    public HashSet<Integer> mBusinessEventNeedCache = new HashSet<>(Arrays.asList(11000, 11001, 11002, 11003, 11004, 11005, 11006, 11007));

    private native void _addInterimMedia(long j, String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z, boolean z2);

    private native void _addLiveMediaSessionBundle(long j, String str, LiveFeatureBundleWrapper liveFeatureBundleWrapper);

    private native void _addMedia(long j, String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z);

    private native void _addMediaWithCallback(long j, String str, ISelectBitrateListener iSelectBitrateListener, IPreloadTaskCallbackListener iPreloadTaskCallbackListener, String str2, boolean z, boolean z2);

    private native void _addPriorityTask(long j, String str, ISelectBitrateListener iSelectBitrateListener, IPreloadTaskCallbackListener iPreloadTaskCallbackListener);

    private native void _addSignalingCallback(long j, String str, ISignalingCallbackDelegate iSignalingCallbackDelegate);

    private native void _addStrategyMedias(long j, List<StrategyMediaInfo> list, String str);

    private native void _businessEvent(long j, int i, int i2);

    private native void _businessEvent(long j, int i, int i2, int i3);

    private native void _businessEvent(long j, int i, int i2, String str);

    private native void _businessEvent(long j, int i, String str);

    private native void _businessEvent(long j, int i, JSONObject jSONObject);

    private native long _create(IStrategyEventListener iStrategyEventListener);

    private native void _createPlayer(long j, long j2, String str, String str2);

    private native void _createPlayerWithTag(long j, long j2, String str, String str2, String str3);

    private native void _createScene(long j, String str);

    private native void _destroyScene(long j, String str);

    private native void _focusMedia(long j, String str, int i);

    private native List<String> _getCCTKSeries(long j, String str, long j2, long j3, int i);

    private native String _getFeedParams(long j, String str);

    private native float _getFloatValue(long j, int i, float f);

    private native String _getInFeedSwitchStats(long j, String str);

    private native int _getIntValue(long j, int i, int i2);

    private native String _getLiveSource(long j, String str);

    private native String _getLoadMoreResult(long j, String str);

    private native long _getLongValue(long j, int i, long j2);

    private native long _getLongValue(long j, int i, String str, long j2);

    private native List<String> _getNodeListWithHost(long j, String str);

    private native String _getNodeOptimizerInfos(long j, String str);

    private native String _getStrValue(long j, int i, String str);

    private native int _iPlayerVersion(long j);

    private native boolean _isIOManagerVersionMatch(long j);

    private native void _makeCurrentPlayer(long j, String str);

    private native void _moveToScene(long j, String str);

    private native void _playSelection(long j, String str, int i, int i2);

    private native String _popLogData(long j, int i, String str);

    private native void _refreshUnplayedMedias(long j, List<StrategyMediaInfo> list, String str);

    private native void _release(long j);

    private native void _releasePlayer(long j, String str, String str2);

    private native void _removeAllMedia(long j, String str, int i);

    private native void _removeLiveMediaSessionBundle(long j, String str);

    private native void _removeMedia(long j, String str, String str2);

    private native void _removePriorityTask(long j, String str);

    private native void _removeSignalingCallback(long j, String str);

    private native String _selectBitrate(long j, String str, int i, String str2, Object obj);

    private native String _selectBitrateStringMap(long j, String str, int i, String str2, Object obj, int i2);

    private native String _selectBitrateStringMapWithObject(long j, Object obj, int i, String str, Object obj2, int i2);

    private native void _setAlgorithmJson(long j, int i, String str);

    private native void _setAppInfo(long j, String str);

    private native void _setAppServer(long j, IAppService iAppService);

    private native void _setEventListener(long j, IStrategyEventListener iStrategyEventListener);

    private native void _setFloatValue(long j, int i, float f);

    private native void _setIOManager(long j, long j2, long j3);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setIntervalMS(long j, int i);

    private native void _setLiveAppInfoBundle(long j, LiveFeatureBundleWrapper liveFeatureBundleWrapper);

    private native void _setLiveAppInfoBundleNew(long j, LiveFeatureBundleWrapper liveFeatureBundleWrapper);

    private native void _setLiveInfoHandler(long j, ILiveInfoHandler iLiveInfoHandler);

    private native void _setLogCallback(long j, ILogCallback iLogCallback);

    private native void _setLongValue(long j, int i, long j2);

    private native void _setPlayDoubleConfig(long j, String str, int i, double d);

    private native void _setPlayIntConfig(long j, String str, int i, int i2);

    private native void _setPlayLongConfig(long j, String str, int i, long j2);

    private native void _setPlayStringConfig(long j, String str, int i, String str2);

    private native void _setPlayTaskProgress(long j, float f);

    private native void _setPreciseExpServer(long j, IPreciseExpService iPreciseExpService);

    private native void _setProbeType(long j, int i);

    private native void _setSettingsInfo(long j, String str, String str2);

    private native void _setStateSupplier(long j, IStrategyStateSupplier iStrategyStateSupplier);

    private native void _setStrValue(long j, int i, String str);

    private native void _start(long j);

    private native void _stop(long j);

    private native void _updateMedia(long j, String str, String str2, String str3);

    public static StrategyCenter getInstance() {
        if (mInstance == null) {
            synchronized (StrategyCenter.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new StrategyCenter();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public int iPlayerVersion() {
        long j = this.mHandle;
        if (j == 0) {
            return -1;
        }
        return _iPlayerVersion(j);
    }

    public boolean isIOManagerVersionMatch() {
        long j = this.mHandle;
        if (j == 0) {
            return false;
        }
        return _isIOManagerVersionMatch(j);
    }

    public boolean isLoadLibrarySucceed() {
        return this.mHandle != 0;
    }

    public void stop() {
        if (this.mDidStart) {
            long j = this.mHandle;
            if (j == 0) {
                return;
            }
            _stop(j);
            this.mDidStart = false;
        }
    }

    public StrategyCenter() {
        ArrayList arrayList = new ArrayList();
        this.mBusinessEventCache = arrayList;
        this.mSyncBusinessEventCache = Collections.synchronizedList(arrayList);
    }

    public Map<String, Object> getProvisionMetrics() {
        return LiveWidevineManager.getInstance().getProvisionMetrics();
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean isRunning() {
        return this.mDidStart;
    }

    public static File INVOKEVIRTUAL_com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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

    public SessionEntry acquireLiveWidevineSessionEntry(String str) {
        return LiveWidevineManager.getInstance().tryAcquire(str);
    }

    public void addMediaForPlay(JSONObject jSONObject) {
        if (this.mHandle == 0) {
            return;
        }
        try {
            addMedia(C786410Ut5.J3(jSONObject), null, null, false, true);
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "infos");
            String strLIZIZ = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(jSONObject2.optString("file_hash"));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.mediaAddedMap.put(strLIZIZ, jSONObject.optString("vid"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public boolean checkMediaAdded(JSONObject jSONObject) {
        boolean zContainsKey = false;
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "infos");
            String strLIZIZ = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(jSONObject2.optString("file_hash"));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            zContainsKey = this.mediaAddedMap.containsKey(strLIZIZ);
            return zContainsKey;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return zContainsKey;
        }
    }

    public SessionEntry createLiveWidevineSessionEntry(SessionConfig sessionConfig) {
        return LiveWidevineManager.getInstance().create(sessionConfig);
    }

    public void createScene(String str) {
        long j = this.mHandle;
        if (j != 0 && str != null) {
            _createScene(j, str);
        }
    }

    public void destroyScene(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _destroyScene(j, str);
    }

    public String getBitrateSelectResultCache(String str) {
        if (str == null) {
            return null;
        }
        return this.gearResultMap.get(str);
    }

    public String getFeedParams(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return "";
        }
        try {
            return _getFeedParams(j, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public JSONObject getInFeedSwitchStats(String str) {
        if (str != null && !str.isEmpty()) {
            long j = this.mHandle;
            if (j == 0) {
                return new JSONObject();
            }
            String str_getInFeedSwitchStats = _getInFeedSwitchStats(j, str);
            if (TextUtils.isEmpty(str_getInFeedSwitchStats)) {
                return new JSONObject();
            }
            try {
                return new JSONObject(str_getInFeedSwitchStats);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public String getLiveSource(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        long j = this.mHandle;
        if (j == 0) {
            return "";
        }
        return _getLiveSource(j, str);
    }

    public StrategyStartupGearInfo.GearResponse getLiveStartupBitrateResult(StrategyStartupGearInfo.GearRequest gearRequest) {
        try {
            StrategyStartupGear strategyStartupGear = this.mStrategyStartupGear;
            if (strategyStartupGear != null) {
                StrategyStartupGearInfo.GearResponse startupGear = strategyStartupGear.getStartupGear(gearRequest);
                if (gearRequest.mEnableStartupRetry && gearRequest.mStartupRetryListener != null) {
                    this.mStrategyStartupGear.createStartupRetryTaskAsyn(gearRequest);
                }
                return startupGear;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public Map<String, Object> getLiveWidevineSessionMetrics(String str) {
        return LiveWidevineManager.getInstance().getSessionMetrics(str);
    }

    public Map<String, String> getLoadMoreResult(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = this.mHandle;
        if (j == 0) {
            return linkedHashMap;
        }
        try {
            for (String str2 : _getLoadMoreResult(j, str).split("&")) {
                int iIndexOf = str2.indexOf("=");
                linkedHashMap.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
            }
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return linkedHashMap;
        }
    }

    public List<String> getNodeListWithHost(String str) {
        long j = this.mHandle;
        if (j != 0 && this.mDidStart) {
            try {
                return _getNodeListWithHost(j, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public String getNodeOptimizerInfos(String str) {
        long j = this.mHandle;
        if (j != 0 && this.mDidStart) {
            try {
                return _getNodeOptimizerInfos(j, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public int installLicenseForLiveWidevineSessionEntry(String str) {
        return LiveWidevineManager.getInstance().installLicense(str);
    }

    public void makeCurrentPlayer(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _makeCurrentPlayer(j, str);
    }

    public void releaseLiveWidevineSessionEntry(String str) {
        LiveWidevineManager.getInstance().release(str);
    }

    public void removeLiveMediaSessionBundle(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _removeLiveMediaSessionBundle(j, str);
    }

    public void removePriorityTask(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _removePriorityTask(j, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void removeSignalingCallback(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _removeSignalingCallback(j, str);
    }

    public void removeStartupCacheResult(String str) {
        StrategyStartupGear strategyStartupGear = this.mStrategyStartupGear;
        if (strategyStartupGear != null) {
            strategyStartupGear.removeStartupCacheResult(str);
        }
    }

    public void setAppInfo(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setAppInfo(j, str);
    }

    public void setAppServer(IAppService iAppService) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setAppServer(j, iAppService);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setEventListener(IStrategyEventListener iStrategyEventListener) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setEventListener(j, iStrategyEventListener);
    }

    public void setLiveAppInfoBundle(ILiveFeatureBundle iLiveFeatureBundle) {
        if (this.mHandle != 0 && this.mDidStart) {
            this.mAppInfobundle = iLiveFeatureBundle;
            this.mLiveAppInfoBundleSetted = true;
            _setLiveAppInfoBundle(this.mHandle, new LiveFeatureBundleWrapper(iLiveFeatureBundle, this.mContext, LiveFeatureBundleWrapper.IVCLiveSourceAppType));
            return;
        }
        this.mAppInfobundle = iLiveFeatureBundle;
    }

    public void setLiveAppInfoBundleNew(ILiveFeatureBundle iLiveFeatureBundle) {
        if (this.mHandle != 0 && this.mDidStart) {
            this.mAppInfoBundleNew = iLiveFeatureBundle;
            this.mLiveAppInfoBundleNewSetted = true;
            _setLiveAppInfoBundleNew(this.mHandle, new LiveFeatureBundleWrapper(iLiveFeatureBundle, this.mContext, LiveFeatureBundleWrapper.IVCLiveSourceAppType));
            return;
        }
        this.mAppInfoBundleNew = iLiveFeatureBundle;
    }

    public void setLiveInfoHandler(ILiveInfoHandler iLiveInfoHandler) {
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
        boolean z12 = true;
        if (!this.mDidStart) {
            this.mLiveStrategyStartEarlier = true;
            return;
        }
        _setLiveInfoHandler(this.mHandle, iLiveInfoHandler);
        JSONObject jSONObject = new JSONObject();
        if (getIntValue(55002, 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (getIntValue(55003, 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getIntValue(55013, 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getIntValue(55009, 0) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (getIntValue(55020, 0) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getIntValue(55021, 0) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 && z) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z6 && z) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z2 && z) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z3 && z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 && z8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z7) {
            z12 = false;
        }
        try {
            jSONObject.put("live_sdk_enable_use_ttk_strategy", z12);
            jSONObject.put("live_sdk_enable_use_ttk_preconnect", z10);
            jSONObject.put("live_sdk_enable_use_ttk_complete_dns", z11);
            if (iLiveInfoHandler == null) {
                return;
            }
            iLiveInfoHandler.syncStrategyOption(C786410Ut5.J3(jSONObject));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void setLiveWidevineNetworkClient(ILiveWidevineNetworkClient iLiveWidevineNetworkClient) {
        LiveWidevineManager.getInstance().setNetworkClient(iLiveWidevineNetworkClient);
    }

    public void setLogCallback(ILogCallback iLogCallback) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setLogCallback(j, iLogCallback);
    }

    public void setPreciseExpService(IPreciseExpService iPreciseExpService) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setPreciseExpServer(j, iPreciseExpService);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setStateSupplier(IStrategyStateSupplier iStrategyStateSupplier) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setStateSupplier(j, iStrategyStateSupplier);
    }

    public void setStrategyEventListener(IStrategyEventListener iStrategyEventListener) {
        this.mListener = iStrategyEventListener;
    }

    public void switchToScene(String str) {
        if (this.mHandle == 0) {
            return;
        }
        this.mCurrentScene = str;
        _moveToScene(this.mHandle, str);
    }

    private boolean isGearResultInMediaInfos(String str, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        if (str != null && jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                int iOptInt = jSONObject2.optInt("video_bitrarte", -1);
                int iOptInt2 = jSONObject2.optInt("audio_bitrarte", -1);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("infos");
                if (jSONArrayOptJSONArray == null) {
                    return false;
                }
                if (iOptInt <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (iOptInt2 <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i = 0;
                while (true) {
                    if (i < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("media_type", "");
                            int iOptInt3 = jSONObjectOptJSONObject.optInt("bitrate", -1);
                            if (!z && "video".equals(strOptString) && iOptInt3 == iOptInt) {
                                z = true;
                            }
                            if (!z2 && "audio".equals(strOptString) && iOptInt3 == iOptInt2) {
                                z2 = true;
                            }
                            if (z && z2) {
                                break;
                            }
                        }
                        i++;
                    } else if (!z || !z2) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public void addLiveMediaSessionBundle(String str, ILiveFeatureBundle iLiveFeatureBundle) {
        if (this.mHandle == 0) {
            return;
        }
        _addLiveMediaSessionBundle(this.mHandle, str, new LiveFeatureBundleWrapper(iLiveFeatureBundle, this.mContext, LiveFeatureBundleWrapper.IVCLiveSourceFeatureType));
    }

    public void addSignalingCallback(String str, ISignalingCallbackDelegate iSignalingCallbackDelegate) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _addSignalingCallback(j, str, iSignalingCallbackDelegate);
    }

    public void addStrategyMedia(StrategyMediaInfo strategyMediaInfo, String str) {
        if (this.mHandle == 0 || strategyMediaInfo == null) {
            return;
        }
        if (getIntValue(56015, 0) != 0 && strategyMediaInfo.getIsLive() > 0) {
            LiveStreamManager.getInstance().addMediaList(str, Collections.singletonList(strategyMediaInfo.getMediaId()), Collections.singletonList(strategyMediaInfo.getMediaInfo()));
        }
        addMedia(strategyMediaInfo.getMediaInfo(), strategyMediaInfo.getSelectBitrateListener(), strategyMediaInfo.getPreloadTaskListener(), str, strategyMediaInfo.getIsLast().booleanValue(), strategyMediaInfo.getNeedRemove().booleanValue());
    }

    public void addStrategyMedias(List<StrategyMediaInfo> list, String str) {
        if (this.mHandle == 0) {
            return;
        }
        if (getIntValue(56015, 0) != 0) {
            for (StrategyMediaInfo strategyMediaInfo : list) {
                if (strategyMediaInfo != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    if (strategyMediaInfo.getIsLive() > 0) {
                        arrayList.add(strategyMediaInfo.getMediaId());
                        arrayList2.add(strategyMediaInfo.getMediaInfo());
                    }
                    LiveStreamManager.getInstance().addMediaList(str, arrayList, arrayList2);
                }
            }
        }
        _addStrategyMedias(this.mHandle, list, str);
    }

    public void businessEvent(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            if (this.mBusinessEventNeedCache.contains(Integer.valueOf(i))) {
                this.mSyncBusinessEventCache.add(new BusinessEventRecord(i, Integer.valueOf(i2), null, null));
            }
        } else {
            try {
                _businessEvent(j, i, i2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void cacheBitrateSelectResult(String str, String str2) {
        if (str != null && str2 != null) {
            this.gearResultMap.put(str, str2);
        }
    }

    public void create(Context context, boolean z) {
        if (!isLoadLibrarySucceed()) {
            if (z) {
                StrategyCenterJniLoader.loadLibrary(context);
                if (!StrategyCenterJniLoader.isLibraryLoaded) {
                    return;
                }
            }
            this.mHandle = _create(this.mListener);
        }
        this.mContext = context;
        if (context != null) {
            setStringValue(31226, INVOKEVIRTUAL_com_bytedance_vcloud_strategy_StrategyCenter_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context).getAbsolutePath());
        }
        this.mStrategyStartupGear.setContext(context);
    }

    public void focusMedia(String str, int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _focusMedia(j, str, i);
    }

    public float getFloatValue(int i, float f) {
        long j = this.mHandle;
        if (j == 0) {
            return f;
        }
        try {
            return _getFloatValue(j, i, f);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return f;
        }
    }

    public int getIntValue(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return i2;
        }
        try {
            return _getIntValue(j, i, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return i2;
        }
    }

    public StrategyStartupGearInfo.GearResponse getLiveStartupBitrateResult(String str, LiveRoomInfo liveRoomInfo) {
        try {
            StrategyStartupGear strategyStartupGear = this.mStrategyStartupGear;
            if (strategyStartupGear != null) {
                StrategyStartupGearInfo.GearResponse startupCacheResult = strategyStartupGear.getStartupCacheResult(str);
                if (startupCacheResult != null) {
                    return startupCacheResult;
                }
                return this.mStrategyStartupGear.getStartupGear(liveRoomInfo);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public long getLongValue(int i, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return j;
        }
        try {
            return _getLongValue(j2, i, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return j;
        }
    }

    public String getStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return str;
        }
        try {
            return _getStrValue(j, i, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }

    public String popLogData(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return "";
        }
        return _popLogData(j, i, str);
    }

    public String readFromStorage(String str, String str2) {
        StrategyStartupGear strategyStartupGear = this.mStrategyStartupGear;
        if (strategyStartupGear != null) {
            return strategyStartupGear.readFromStorage(this.mContext, str, str2);
        }
        return "";
    }

    public void refreshUnplayedMedias(List<StrategyMediaInfo> list, String str) {
        if (this.mHandle != 0 && list != null && !list.isEmpty()) {
            _refreshUnplayedMedias(this.mHandle, list, str);
        }
    }

    public void releasePlayer(String str, String str2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _releasePlayer(j, str, str2);
    }

    public void removeAllMedia(String str, int i) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _removeAllMedia(j, str, i);
    }

    public void removeLiveMediaSessionBundle(String str, String str2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _removeLiveMediaSessionBundle(j, str);
        LiveStrategyManager.inst().releaseFeatureDataBundle(str2);
    }

    public void removeMedia(String str, String str2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _removeMedia(j, str, str2);
    }

    public JSONObject runLiveStrategy(int i, JSONObject jSONObject) {
        return LiveStrategyManager.inst().runLiveStrategy(i, jSONObject);
    }

    public void setAlgorithmJson(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setAlgorithmJson(j, i, str);
    }

    public void setFloatValue(int i, float f) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setFloatValue(j, i, f);
    }

    public void setIOManager(long j, long j2) {
        long j3 = this.mHandle;
        if (j3 == 0) {
            return;
        }
        _setIOManager(j3, j, j2);
    }

    public void setIntValue(int i, int i2) {
        if (i == 10000) {
            this.mLogLevel = i2;
        }
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, i, i2);
    }

    public void setLongValue(int i, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return;
        }
        try {
            _setLongValue(j2, i, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setSettingsInfo(String str, String str2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setSettingsInfo(j, str, str2);
    }

    public void setStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setStrValue(j, i, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void start(Context context, boolean z) {
        if (this.mDidStart) {
            return;
        }
        create(context, z);
        if (this.mHandle == 0) {
            return;
        }
        setIntValue(10000, this.mLogLevel);
        _start(this.mHandle);
        synchronized (this.mSyncBusinessEventCache) {
            try {
                for (BusinessEventRecord businessEventRecord : this.mSyncBusinessEventCache) {
                    Integer num = businessEventRecord.mIntValue;
                    if (num != null) {
                        businessEvent(businessEventRecord.mKey, num.intValue());
                    } else {
                        String str = businessEventRecord.mStringValue;
                        if (str != null) {
                            businessEvent(businessEventRecord.mKey, str);
                        } else {
                            JSONObject jSONObject = businessEventRecord.mJsonValue;
                            if (jSONObject != null) {
                                businessEvent(businessEventRecord.mKey, jSONObject);
                            }
                        }
                    }
                }
                this.mSyncBusinessEventCache.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.mDidStart = true;
        if (getIntValue(55002, 0) == 1 && !this.mLiveAppInfoBundleSetted) {
            setLiveAppInfoBundle(this.mAppInfobundle);
        }
        if (!this.mLiveAppInfoBundleNewSetted) {
            setLiveAppInfoBundleNew(this.mAppInfoBundleNew);
        }
        if (this.mLiveStrategyStartEarlier) {
            setIntValue(55012, 1);
        }
    }

    public void triggerPreProvision(int i, int i2) {
        LiveWidevineManager.getInstance().triggerPreProvision(i, i2);
    }

    public void businessEvent(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            if (this.mBusinessEventNeedCache.contains(Integer.valueOf(i))) {
                this.mSyncBusinessEventCache.add(new BusinessEventRecord(i, null, str, null));
            }
        } else {
            try {
                _businessEvent(j, i, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void businessEvent(int i, JSONObject jSONObject) {
        long j = this.mHandle;
        if (j == 0) {
            if (this.mBusinessEventNeedCache.contains(Integer.valueOf(i))) {
                this.mSyncBusinessEventCache.add(new BusinessEventRecord(i, null, null, jSONObject));
            }
        } else {
            try {
                _businessEvent(j, i, jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public void addLiveMediaSessionBundle(String str, String str2, ILiveFeatureBundle iLiveFeatureBundle) {
        if (this.mHandle == 0) {
            return;
        }
        LiveStrategyManager.inst().setFeatureDataBundle(str2, iLiveFeatureBundle);
        _addLiveMediaSessionBundle(this.mHandle, str, new LiveFeatureBundleWrapper(iLiveFeatureBundle, this.mContext, LiveFeatureBundleWrapper.IVCLiveSourceFeatureType));
    }

    public void addPriorityTask(String str, ISelectBitrateListener iSelectBitrateListener, IPreloadTaskCallbackListener iPreloadTaskCallbackListener) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _addPriorityTask(j, str, iSelectBitrateListener, iPreloadTaskCallbackListener);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void businessEvent(int i, int i2, int i3) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _businessEvent(j, i, i2, i3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void createPlayer(long j, String str, String str2) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return;
        }
        _createPlayer(j2, j, str, str2);
    }

    public long getLongValue(int i, String str, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return j;
        }
        try {
            return _getLongValue(j2, i, str, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return j;
        }
    }

    public void playSelection(String str, int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _playSelection(j, str, i, i2);
    }

    public void setPlayDoubleConfig(String str, int i, double d) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setPlayDoubleConfig(j, str, i, d);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setPlayIntConfig(String str, int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setPlayIntConfig(j, str, i, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setPlayLongConfig(String str, int i, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return;
        }
        try {
            _setPlayLongConfig(j2, str, i, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setPlayStringConfig(String str, int i, String str2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setPlayStringConfig(j, str, i, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void updateMedia(String str, String str2, String str3) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _updateMedia(j, str, str2, str3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void writeToStorage(String str, String str2, String str3) {
        StrategyStartupGear strategyStartupGear = this.mStrategyStartupGear;
        if (strategyStartupGear != null) {
            strategyStartupGear.writeToStorage(this.mContext, str, str2, str3);
        }
    }

    public void businessEvent(int i, int i2, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _businessEvent(j, i, i2, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void addMedia(String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _addMedia(j, str, iSelectBitrateListener, str2, z);
    }

    public void createPlayer(long j, String str, String str2, String str3) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return;
        }
        try {
            _createPlayerWithTag(j2, j, str, str2, str3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            _createPlayer(this.mHandle, j, str, str2);
        }
    }

    public List<String> getCCTKSeries(String str, long j, long j2, int i) {
        long j3 = this.mHandle;
        if (j3 != 0 && this.mDidStart) {
            try {
                return _getCCTKSeries(j3, str, j, j2, i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public String selectBitrate(String str, int i, String str2, Object obj) {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        try {
            return _selectBitrate(j, str, i, str2, obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public void sendHttpRequest(String str, String str2, IHttpResponseCallback iHttpResponseCallback, boolean z) {
        VCHttpWrapperBridge.inst().sendRequest(str, str2, iHttpResponseCallback, z);
    }

    public class BusinessEventRecord {
        public Integer mIntValue;
        public JSONObject mJsonValue;
        public int mKey;
        public String mStringValue;

        public BusinessEventRecord(int i, Integer num, String str, JSONObject jSONObject) {
            this.mKey = i;
            this.mIntValue = num;
            this.mStringValue = str;
            this.mJsonValue = jSONObject;
        }
    }

    public void addMedia(String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z, boolean z2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _addInterimMedia(j, str, iSelectBitrateListener, str2, z, z2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public String selectBitrateStringMap(String str, int i, String str2, Object obj, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        try {
            return _selectBitrateStringMap(j, str, i, str2, obj, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public void addMedia(String str, ISelectBitrateListener iSelectBitrateListener, IPreloadTaskCallbackListener iPreloadTaskCallbackListener, String str2, boolean z, boolean z2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _addMediaWithCallback(j, str, iSelectBitrateListener, iPreloadTaskCallbackListener, str2, z, z2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                _addInterimMedia(this.mHandle, str, iSelectBitrateListener, str2, z, z2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public String selectBitrateStringMapWithObject(String str, JSONObject jSONObject, int i, String str2, Object obj, int i2) {
        String str3;
        if (this.mHandle == 0) {
            return null;
        }
        try {
            int intValue = getIntValue(50141, 0);
            if (intValue > 0 && str != null && (str3 = this.gearResultMap.get(str)) != null) {
                boolean zIsGearResultInMediaInfos = true;
                if (getIntValue(50148, 0) > 0 && i == 1 && jSONObject != null) {
                    zIsGearResultInMediaInfos = isGearResultInMediaInfos(str3, jSONObject);
                }
                if (zIsGearResultInMediaInfos) {
                    return str3;
                }
                this.gearResultMap.remove(str);
            }
            String str_selectBitrateStringMapWithObject = _selectBitrateStringMapWithObject(this.mHandle, jSONObject, i, str2, obj, i2);
            if (intValue > 0 && str_selectBitrateStringMapWithObject != null && str != null) {
                cacheBitrateSelectResult(str, str_selectBitrateStringMapWithObject);
            }
            return str_selectBitrateStringMapWithObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
