package com.bytedance.vcloud.strategy;

import X.C08FF;
import X.C08RN;
import X.C09CT;
import X.C1476630oWr;
import X.C1476640oWs;
import X.C1476650oWt;
import X.C1476660oWu;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyStartupGearInfo;
import com.bytedance.vcloud.strategy.drm.LiveWidevineManager;
import com.bytedance.vcloud.strategy.model.LiveRoomInfo;
import com.bytedance.vcloud.strategy.model.LiveStreamData;
import com.google.gson.Gson;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes24.dex */
public class LiveStreamManager {
    public static LiveStreamManager _manager;
    public ConcurrentLruCache<String, String> mFollow;
    public ConcurrentLruCache<String, String> mForYou;
    public volatile boolean mInitialized;
    public ConcurrentLruCache<String, String> mInnerLive;
    public ConcurrentLruCache<String, LiveRoomInfo> mParsedFollow;
    public ConcurrentLruCache<String, LiveRoomInfo> mParsedForYou;
    public ConcurrentLruCache<String, LiveRoomInfo> mParsedInnerLive;
    public ConcurrentLruCache<String, LiveRoomInfo> mParsedSkyLight;
    public ConcurrentLruCache<String, String> mSkyLight;
    public final ReadWriteLock lock = new ReentrantReadWriteLock();
    public long mLiveIOHandle = -1;
    public LiveScene mCurrentScene = LiveScene.kUnknown;
    public Gson mGson = new Gson();

    public static class LiveStreamDataWrapper {

        @C09CT("live_json_string_data")
        public String data;
    }

    public static class LiveStreamDataWrapper2 {

        @C09CT("live_json_string_data")
        public String streamData;
    }

    /* JADX INFO: renamed from: com.bytedance.vcloud.strategy.LiveStreamManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$vcloud$strategy$LiveStreamManager$LiveScene;

        static {
            int[] iArr = new int[LiveScene.values().length];
            $SwitchMap$com$bytedance$vcloud$strategy$LiveStreamManager$LiveScene = iArr;
            try {
                iArr[LiveScene.kLiveInner.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$vcloud$strategy$LiveStreamManager$LiveScene[LiveScene.kLiveSkylight.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$vcloud$strategy$LiveStreamManager$LiveScene[LiveScene.kLiveInbox.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$vcloud$strategy$LiveStreamManager$LiveScene[LiveScene.kLiveForYouHead.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$vcloud$strategy$LiveStreamManager$LiveScene[LiveScene.kLiveForYou.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$bytedance$vcloud$strategy$LiveStreamManager$LiveScene[LiveScene.kLiveFollow.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$bytedance$vcloud$strategy$LiveStreamManager$LiveScene[LiveScene.kLiveFollowHead.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
        }
    }

    public static LiveStreamManager getInstance() {
        if (_manager == null) {
            synchronized (LiveStreamManager.class) {
                try {
                    if (_manager == null) {
                        _manager = new LiveStreamManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return _manager;
    }

    private long getLiveIOHandle() {
        long j = this.mLiveIOHandle;
        if (j == 0 || j == -1) {
            setupLiveIO();
        }
        return this.mLiveIOHandle;
    }

    private void setupLiveIO() {
        C1476650oWt c1476650oWt = C1476660oWu.LIZ;
        if (c1476650oWt.LIZJ) {
            this.mLiveIOHandle = c1476650oWt.LIZJ(1162);
            return;
        }
        Context context = StrategyCenter.getInstance().getContext();
        if (context == null) {
            return;
        }
        int intValue = StrategyCenter.getInstance().getIntValue(55412, 0);
        C1476630oWr c1476630oWr = new C1476630oWr();
        c1476630oWr.LIZ = INVOKEVIRTUAL_com_bytedance_vcloud_strategy_LiveStreamManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context).getAbsolutePath();
        c1476630oWr.LIZIZ = false;
        c1476630oWr.LJ = intValue == 1;
        c1476630oWr.LJFF = false;
        c1476650oWt.LJIIL(C786410Ut5.N3(context), new C1476640oWs(c1476630oWr));
        this.mLiveIOHandle = c1476650oWt.LIZJ(1162);
    }

    public enum LiveScene {
        kUnknown(0),
        kLiveForYou(1),
        kLiveFollow(2),
        kLiveInner(4),
        kLiveSkylight(8),
        kLiveForYouHead(16),
        kLiveFollowHead(32),
        kLiveInbox(64);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static LiveScene valueOf(int i) {
            LiveScene liveScene = kUnknown;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    return liveScene;
                                }
                            }
                        } else {
                            return kLiveSkylight;
                        }
                    } else {
                        return kLiveInner;
                    }
                }
                return kLiveFollow;
            }
            return kLiveForYou;
        }

        public static LiveScene valueOf(String str) {
            return (LiveScene) C08FF.LIZ(LiveScene.class, str);
        }

        LiveScene(int i) {
            this.value = i;
        }
    }

    public static File INVOKEVIRTUAL_com_bytedance_vcloud_strategy_LiveStreamManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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

    private ConcurrentLruCache<String, String> getCacheByScene(LiveScene liveScene) {
        switch (AnonymousClass1.$SwitchMap$com$bytedance$vcloud$strategy$LiveStreamManager$LiveScene[liveScene.ordinal()]) {
            case 1:
                return this.mInnerLive;
            case 2:
            case 3:
                return this.mSkyLight;
            case 4:
            case 5:
                return this.mForYou;
            case 6:
            case 7:
                return this.mFollow;
            default:
                return null;
        }
    }

    private ConcurrentLruCache<String, LiveRoomInfo> getParsedCacheByScene(LiveScene liveScene) {
        switch (AnonymousClass1.$SwitchMap$com$bytedance$vcloud$strategy$LiveStreamManager$LiveScene[liveScene.ordinal()]) {
            case 1:
                return this.mParsedInnerLive;
            case 2:
            case 3:
                return this.mParsedSkyLight;
            case 4:
            case 5:
                return this.mParsedForYou;
            case 6:
            case 7:
                return this.mParsedFollow;
            default:
                return null;
        }
    }

    private LiveScene getScene(String str) {
        LiveScene liveScene = LiveScene.kUnknown;
        if (TextUtils.isEmpty(str)) {
            return liveScene;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (TextUtils.isEmpty(lowerCase)) {
            return liveScene;
        }
        if (lowerCase.contains("liveplayactivity")) {
            return LiveScene.kLiveInner;
        }
        if (lowerCase.contains("skylight")) {
            return LiveScene.kLiveSkylight;
        }
        if (lowerCase.contains("follow")) {
            return LiveScene.kLiveFollow;
        }
        return LiveScene.kLiveForYou;
    }

    public LiveRoomInfo getLiveRoomInfoByRoomId(String str) {
        if (!TextUtils.isEmpty(str) && this.mInitialized) {
            ConcurrentLruCache<String, LiveRoomInfo> parsedCacheByScene = getParsedCacheByScene(this.mCurrentScene);
            if (parsedCacheByScene != null && parsedCacheByScene.containsKey(str)) {
                return parsedCacheByScene.get(str);
            }
            if (this.mParsedForYou.containsKey(str)) {
                return this.mParsedForYou.get(str);
            }
            if (this.mParsedFollow.containsKey(str)) {
                return this.mParsedFollow.get(str);
            }
            if (this.mParsedInnerLive.containsKey(str)) {
                return this.mParsedInnerLive.get(str);
            }
            if (this.mParsedSkyLight.containsKey(str)) {
                return this.mParsedSkyLight.get(str);
            }
        }
        return null;
    }

    private String getStartupGear(String str, String str2) {
        LiveStreamData liveStreamData;
        if (!this.mInitialized) {
            return null;
        }
        LiveRoomInfo liveRoomInfoByRoomId = getLiveRoomInfoByRoomId(str);
        if (TextUtils.isEmpty(str2)) {
            if (liveRoomInfoByRoomId == null || (liveStreamData = liveRoomInfoByRoomId.liveStreamData) == null || !liveStreamData.isValid()) {
                return null;
            }
        } else if (liveRoomInfoByRoomId == null) {
            liveRoomInfoByRoomId = new LiveRoomInfo();
            liveRoomInfoByRoomId.liveStreamData = (LiveStreamData) GsonProtectorUtils.fromJson(this.mGson, str2, LiveStreamData.class);
        }
        return getStartupGearByRoomInfo(str, liveRoomInfoByRoomId);
    }

    private String getStartupGearByRoomInfo(String str, LiveRoomInfo liveRoomInfo) {
        LiveStreamData liveStreamData;
        if (TextUtils.isEmpty(str) || liveRoomInfo == null || (liveStreamData = liveRoomInfo.liveStreamData) == null || !liveStreamData.isValid()) {
            return null;
        }
        LiveStreamData.StreamDataCommon streamDataCommon = liveRoomInfo.liveStreamData.common;
        if (streamDataCommon != null && streamDataCommon.autoInfo != null) {
            StrategyStartupGearInfo.GearResponse liveStartupBitrateResult = StrategyCenter.getInstance().getLiveStartupBitrateResult(str, liveRoomInfo);
            if (liveStartupBitrateResult == null) {
                return null;
            }
            if (!TextUtils.isEmpty(liveStartupBitrateResult.mGear)) {
                liveRoomInfo.setStartUpGearName(liveStartupBitrateResult.mGear);
                liveRoomInfo.setStartUpStrategyLog(liveStartupBitrateResult.mStrategyLog);
            }
        }
        return liveRoomInfo.getStartUpGearName();
    }

    private String readFromStorage(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || StrategyCenter.getInstance() == null) {
            return "";
        }
        return StrategyCenter.getInstance().readFromStorage(str, str2);
    }

    private boolean sameSessionId(LiveRoomInfo liveRoomInfo, String str) {
        LiveStreamData liveStreamData;
        if (liveRoomInfo == null || (liveStreamData = liveRoomInfo.liveStreamData) == null || !liveStreamData.isValid() || TextUtils.isEmpty(str) || TextUtils.isEmpty(liveRoomInfo.liveStreamData.common.sessionId) || !str.contains(liveRoomInfo.liveStreamData.common.sessionId)) {
            return false;
        }
        return true;
    }

    private void onEvent(int i, int i2, String str) {
        if (i != 2001) {
            if (i != 8014) {
                if (i == 8015) {
                    LiveWidevineManager.getInstance().preload(str);
                    return;
                }
                return;
            }
            LiveWidevineManager.getInstance().setPreloadOptions(str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LiveScene scene = getScene(str);
        LiveScene liveScene = this.mCurrentScene;
        LiveScene liveScene2 = LiveScene.kLiveInner;
        if (liveScene == liveScene2 && scene != liveScene2) {
            ConcurrentLruCache<String, String> concurrentLruCache = this.mInnerLive;
            if (concurrentLruCache != null) {
                concurrentLruCache.evictAll();
            }
            ConcurrentLruCache<String, LiveRoomInfo> concurrentLruCache2 = this.mParsedInnerLive;
            if (concurrentLruCache2 != null) {
                concurrentLruCache2.evictAll();
            }
        }
        this.mCurrentScene = scene;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeDataToCache(ConcurrentLruCache<String, String> concurrentLruCache, List<String> list, List<String> list2) {
        for (int iMin = Math.min(list.size(), list2.size()) - 1; iMin >= 0; iMin--) {
            if (!concurrentLruCache.containsKey(ListProtector.get(list, iMin))) {
                concurrentLruCache.put(ListProtector.get(list, iMin), ListProtector.get(list2, iMin));
            }
        }
    }

    private void writeToStorage(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || StrategyCenter.getInstance() == null) {
            return;
        }
        StrategyCenter.getInstance().writeToStorage(str, str2, str3);
    }

    public void addMediaList(String str, List<String> list, List<String> list2) {
        ConcurrentLruCache<String, String> cacheByScene;
        if (list != null && list2 != null && (cacheByScene = getCacheByScene(getScene(str))) != null) {
            writeDataToCache(cacheByScene, list, list2);
        }
    }

    public void init(int i, int i2, int i3) {
        if (this.mInitialized) {
            return;
        }
        if (i > 0) {
            int i4 = i * 2;
            this.mForYou = new ConcurrentLruCache<>(i4);
            this.mParsedForYou = new ConcurrentLruCache<>(i);
            this.mFollow = new ConcurrentLruCache<>(i4);
            this.mParsedFollow = new ConcurrentLruCache<>(i);
        }
        if (i2 > 0) {
            this.mInnerLive = new ConcurrentLruCache<>(i2 * 2);
            this.mParsedInnerLive = new ConcurrentLruCache<>(i2);
        }
        if (i3 > 0) {
            this.mSkyLight = new ConcurrentLruCache<>(i3 * 2);
            this.mParsedSkyLight = new ConcurrentLruCache<>(i3);
        }
        this.mInitialized = true;
    }

    public int startPreParse(int i, String str, String str2, String str3) {
        LiveStreamData liveStreamData;
        String str4;
        LiveStreamDataWrapper2 liveStreamDataWrapper2;
        String str5;
        LiveScene liveSceneValueOf = LiveScene.valueOf(i);
        ConcurrentLruCache<String, LiveRoomInfo> parsedCacheByScene = getParsedCacheByScene(liveSceneValueOf);
        if (parsedCacheByScene == null) {
            return -1;
        }
        if (parsedCacheByScene.containsKey(str) && sameSessionId(parsedCacheByScene.get(str), str2)) {
            return 0;
        }
        if (!TextUtils.isEmpty(str3)) {
            liveStreamData = (LiveStreamData) GsonProtectorUtils.fromJson(this.mGson, str3, LiveStreamData.class);
        } else {
            ConcurrentLruCache<String, String> cacheByScene = getCacheByScene(liveSceneValueOf);
            liveStreamData = null;
            if (cacheByScene != null && cacheByScene.containsKey(str)) {
                LiveStreamDataWrapper liveStreamDataWrapper = (LiveStreamDataWrapper) GsonProtectorUtils.fromJson(this.mGson, cacheByScene.get(str), LiveStreamDataWrapper.class);
                if (liveStreamDataWrapper != null && (str4 = liveStreamDataWrapper.data) != null && (liveStreamDataWrapper2 = (LiveStreamDataWrapper2) GsonProtectorUtils.fromJson(this.mGson, str4, LiveStreamDataWrapper2.class)) != null && (str5 = liveStreamDataWrapper2.streamData) != null) {
                    liveStreamData = (LiveStreamData) GsonProtectorUtils.fromJson(this.mGson, str5, LiveStreamData.class);
                }
                cacheByScene.remove(str);
            }
            return -1;
        }
        if (liveStreamData != null) {
            LiveRoomInfo liveRoomInfo = new LiveRoomInfo();
            liveRoomInfo.generatedSessionId = str2;
            liveRoomInfo.liveStreamData = liveStreamData;
            parsedCacheByScene.put(str, liveRoomInfo);
            return 0;
        }
        return -1;
    }
}
