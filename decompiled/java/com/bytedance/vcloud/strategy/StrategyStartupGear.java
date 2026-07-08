package com.bytedance.vcloud.strategy;

import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyStartupGearInfo;
import com.bytedance.vcloud.strategy.model.LiveGear;
import com.bytedance.vcloud.strategy.model.LivePreference;
import com.bytedance.vcloud.strategy.model.LiveRoomInfo;
import com.bytedance.vcloud.strategy.model.LiveStartupConfig;
import com.bytedance.vcloud.strategy.model.LiveStreamData;
import com.ttkmedia.datacenter.common.DCThreadPool;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class StrategyStartupGear {
    public static SharedPreferences sharedPreferences;
    public long mParseStrategyConfigCostUs;
    public MyStartupHandler mStartupHandler;
    public HandlerThread mStartupHandlerThread;
    public final String TAG = "StrategyStartupGear";
    public boolean isMainLevel = true;
    public final HashSet<String> mStartupRetryTaskSet = new HashSet<>();
    public final ConcurrentLruCache<String, StrategyStartupGearInfo.GearResponse> mStartupResultCacheMap = new ConcurrentLruCache<>(3);
    public Size mPhysicalScreenSize = null;
    public Context mContext = null;

    public static int getResolutionRateByPixelCount(int i) {
        if (i >= 5000000) {
            return 2160;
        }
        if (i >= 2200000) {
            return 1440;
        }
        if (i >= 1400000) {
            return 1080;
        }
        if (i >= 700000) {
            return 720;
        }
        if (i >= 420000) {
            return 540;
        }
        if (i >= 300000) {
            return 480;
        }
        if (i >= 110000) {
            return 360;
        }
        return i > 0 ? 240 : -1;
    }

    private void ensureStartupHandlerThreadInitialized() {
        if (this.mStartupHandlerThread == null) {
            synchronized (this) {
                try {
                    if (this.mStartupHandlerThread == null) {
                        HandlerThread handlerThread = new HandlerThread("live_startup_handler");
                        this.mStartupHandlerThread = handlerThread;
                        handlerThread.start();
                        this.mStartupHandler = new MyStartupHandler(this, C786410Ut5.W2(this.mStartupHandlerThread));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public JSONObject getScreenInfo() {
        JSONObject jSONObject = new JSONObject();
        if (this.mContext == null) {
            return jSONObject;
        }
        if (this.mPhysicalScreenSize == null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) C786410Ut5.H2(this.mContext, "window");
            if (windowManager != null) {
                if (C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFySZduP4JEZyTG0yf2e0nZHl3vtx4k3rZrFRbzCKHvBBWbsUA==", null)) != null) {
                    C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFySZduP4JEZyTG0yf2e0nZHl3vtx4k3rZrFRbzCKHvBBWbsUA==", null)).getRealMetrics(displayMetrics);
                }
                this.mPhysicalScreenSize = new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        Size size = this.mPhysicalScreenSize;
        if (size != null) {
            try {
                jSONObject.put("width", size.getWidth());
                jSONObject.put("height", this.mPhysicalScreenSize.getHeight());
                return jSONObject;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class MyStartupHandler extends BPEAHandler {
        public final WeakReference<StrategyStartupGear> mStartupGearRef;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1C7U.LIZ("StrategyStartupGear$MyStartupHandler@2a2b.handleMessage");
            WeakReference<StrategyStartupGear> weakReference = this.mStartupGearRef;
            if (weakReference == null) {
                C1C7U.LIZIZ("StrategyStartupGear$MyStartupHandler@2a2b.handleMessage");
                return;
            }
            StrategyStartupGear strategyStartupGear = weakReference.get();
            if (strategyStartupGear == null) {
                C1C7U.LIZIZ("StrategyStartupGear$MyStartupHandler@2a2b.handleMessage");
                return;
            }
            if (message.what == 1) {
                strategyStartupGear.handleStartupRetry((StrategyStartupGearInfo.GearRequest) HandlerHook.getMessageObj(message.obj));
                message.obj = null;
            }
            C1C7U.LIZIZ("StrategyStartupGear$MyStartupHandler@2a2b.handleMessage");
        }

        public MyStartupHandler(StrategyStartupGear strategyStartupGear, Looper looper) {
            super(looper);
            this.mStartupGearRef = new WeakReference<>(strategyStartupGear);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[Catch: JSONException -> 0x00b5, TryCatch #0 {JSONException -> 0x00b5, blocks: (B:3:0x0001, B:17:0x0072, B:19:0x0078, B:20:0x0080, B:22:0x0086, B:23:0x008d, B:25:0x0093, B:26:0x009a, B:28:0x00a0, B:29:0x00a7, B:31:0x00ad), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[Catch: JSONException -> 0x00b5, TryCatch #0 {JSONException -> 0x00b5, blocks: (B:3:0x0001, B:17:0x0072, B:19:0x0078, B:20:0x0080, B:22:0x0086, B:23:0x008d, B:25:0x0093, B:26:0x009a, B:28:0x00a0, B:29:0x00a7, B:31:0x00ad), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[Catch: JSONException -> 0x00b5, TryCatch #0 {JSONException -> 0x00b5, blocks: (B:3:0x0001, B:17:0x0072, B:19:0x0078, B:20:0x0080, B:22:0x0086, B:23:0x008d, B:25:0x0093, B:26:0x009a, B:28:0x00a0, B:29:0x00a7, B:31:0x00ad), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[Catch: JSONException -> 0x00b5, TryCatch #0 {JSONException -> 0x00b5, blocks: (B:3:0x0001, B:17:0x0072, B:19:0x0078, B:20:0x0080, B:22:0x0086, B:23:0x008d, B:25:0x0093, B:26:0x009a, B:28:0x00a0, B:29:0x00a7, B:31:0x00ad), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[Catch: JSONException -> 0x00b5, TryCatch #0 {JSONException -> 0x00b5, blocks: (B:3:0x0001, B:17:0x0072, B:19:0x0078, B:20:0x0080, B:22:0x0086, B:23:0x008d, B:25:0x0093, B:26:0x009a, B:28:0x00a0, B:29:0x00a7, B:31:0x00ad), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getVrtbitrateFromCybertron(com.bytedance.vcloud.strategy.StrategyStartupGearInfo.GearRequest r11) {
        /*
            r10 = this;
            r5 = -1
            com.bytedance.vcloud.strategy.StrategyCenter r2 = com.bytedance.vcloud.strategy.StrategyCenter.getInstance()     // Catch: org.json.JSONException -> Lb5
            java.lang.String r1 = r11.mStreamName     // Catch: org.json.JSONException -> Lb5
            r0 = 57003(0xdeab, float:7.9878E-41)
            java.lang.String r9 = r2.getStringValue(r0, r1)     // Catch: org.json.JSONException -> Lb5
            com.bytedance.vcloud.strategy.StrategyCenter r2 = com.bytedance.vcloud.strategy.StrategyCenter.getInstance()     // Catch: org.json.JSONException -> Lb5
            java.lang.String r1 = r11.mStreamName     // Catch: org.json.JSONException -> Lb5
            r0 = 57004(0xdeac, float:7.988E-41)
            java.lang.String r8 = r2.getStringValue(r0, r1)     // Catch: org.json.JSONException -> Lb5
            com.bytedance.vcloud.strategy.StrategyCenter r2 = com.bytedance.vcloud.strategy.StrategyCenter.getInstance()     // Catch: org.json.JSONException -> Lb5
            java.lang.String r1 = r11.mStreamName     // Catch: org.json.JSONException -> Lb5
            r0 = 57005(0xdead, float:7.9881E-41)
            java.lang.String r3 = r2.getStringValue(r0, r1)     // Catch: org.json.JSONException -> Lb5
            com.bytedance.vcloud.strategy.StrategyCenter r2 = com.bytedance.vcloud.strategy.StrategyCenter.getInstance()     // Catch: org.json.JSONException -> Lb5
            java.lang.String r1 = r11.mStreamName     // Catch: org.json.JSONException -> Lb5
            r0 = 57006(0xdeae, float:7.9882E-41)
            java.lang.String r7 = r2.getStringValue(r0, r1)     // Catch: org.json.JSONException -> Lb5
            com.bytedance.vcloud.strategy.StrategyCenter r2 = com.bytedance.vcloud.strategy.StrategyCenter.getInstance()     // Catch: org.json.JSONException -> Lb5
            java.lang.String r1 = r11.mStreamName     // Catch: org.json.JSONException -> Lb5
            r0 = 57007(0xdeaf, float:7.9884E-41)
            java.lang.String r4 = r2.getStringValue(r0, r1)     // Catch: org.json.JSONException -> Lb5
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> Lb5
            if (r0 != 0) goto L72
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb7
            r2.<init>(r3)     // Catch: org.json.JSONException -> Lb7
            java.util.Iterator r1 = r2.keys()     // Catch: org.json.JSONException -> Lb7
            boolean r0 = r1.hasNext()     // Catch: org.json.JSONException -> Lb7
            if (r0 == 0) goto L64
            java.lang.Object r0 = r1.next()     // Catch: org.json.JSONException -> Lb7
            java.lang.String r0 = (java.lang.String) r0     // Catch: org.json.JSONException -> Lb7
            long r5 = r2.optLong(r0)     // Catch: org.json.JSONException -> Lb7
        L61:
            long r1 = r11.mLatestVrtbitrateTs     // Catch: org.json.JSONException -> Lb7
            goto L67
        L64:
            r5 = -1
            goto L61
        L67:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L70
            r0 = 1
        L6c:
            r5 = 1
            if (r0 == 0) goto Lbc
            goto L72
        L70:
            r0 = 0
            goto L6c
        L72:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch: org.json.JSONException -> Lb5
            if (r0 != 0) goto L80
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb5
            r0.<init>(r9)     // Catch: org.json.JSONException -> Lb5
            r11.mAbrRtBitrateInfoMap = r0     // Catch: org.json.JSONException -> Lb5
            r5 = 2
        L80:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: org.json.JSONException -> Lb5
            if (r0 != 0) goto L8d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb5
            r0.<init>(r8)     // Catch: org.json.JSONException -> Lb5
            r11.mAbrRtBitrateTsMap = r0     // Catch: org.json.JSONException -> Lb5
        L8d:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> Lb5
            if (r0 != 0) goto L9a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb5
            r0.<init>(r7)     // Catch: org.json.JSONException -> Lb5
            r11.mAbrRtBitrateStdMap = r0     // Catch: org.json.JSONException -> Lb5
        L9a:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> Lb5
            if (r0 != 0) goto La7
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb5
            r0.<init>(r4)     // Catch: org.json.JSONException -> Lb5
            r11.mAbrRtBitratePctMap = r0     // Catch: org.json.JSONException -> Lb5
        La7:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> Lb5
            if (r0 != 0) goto Lbc
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb5
            r0.<init>(r3)     // Catch: org.json.JSONException -> Lb5
            r11.mAbrRtBitrateVpaasTsMap = r0     // Catch: org.json.JSONException -> Lb5
            return r5
        Lb5:
            r0 = move-exception
            goto Lb9
        Lb7:
            r0 = move-exception
            r5 = 1
        Lb9:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.vcloud.strategy.StrategyStartupGear.getVrtbitrateFromCybertron(com.bytedance.vcloud.strategy.StrategyStartupGearInfo$GearRequest):int");
    }

    private StrategyStartupGearInfo.GearRequest parseParams(LiveRoomInfo liveRoomInfo) {
        String str;
        StrategyStartupGearInfo.GearRequest gearRequest = new StrategyStartupGearInfo.GearRequest();
        long jNanoTime = System.nanoTime() / 1000;
        Map<String, String> map = liveRoomInfo.liveStreamData.common.commonSdkParams;
        if (liveRoomInfo.isMainLevel) {
            str = "main";
        } else {
            str = "backup";
        }
        String str2 = map.get(str);
        if (str2 == null) {
            this.mParseStrategyConfigCostUs = (System.nanoTime() / 1000) - jNanoTime;
            return gearRequest;
        }
        parseStrategyParams(gearRequest, str2, liveRoomInfo);
        parseGearInfo(gearRequest, liveRoomInfo.liveStreamData);
        return gearRequest;
    }

    private void processScreenInfoIfNeeded(StrategyStartupGearInfo.GearRequest gearRequest) {
        boolean z;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        if (gearRequest.mStartupStrategyInputParams.has("InputFeatureList") && (jSONArrayOptJSONArray = gearRequest.mStartupStrategyInputParams.optJSONArray("InputFeatureList")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if (Objects.equals(jSONArrayOptJSONArray.optString(i), "DEVICE-ScreenInfo")) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if ((gearRequest.mStartupStrategyInputParams.has("InputFeatureMap") && (jSONObjectOptJSONObject = gearRequest.mStartupStrategyInputParams.optJSONObject("InputFeatureMap")) != null && 1 == jSONObjectOptJSONObject.optInt("DEVICE-ScreenInfo", 0)) || z) {
            gearRequest.mScreenInfo = getScreenInfo();
        }
    }

    private StrategyStartupGearInfo.GearResponse runStartupStrategy(StrategyStartupGearInfo.GearRequest gearRequest) {
        JSONObject jSONObject;
        StrategyStartupGearInfo.GearResponse gearResponse = new StrategyStartupGearInfo.GearResponse();
        gearResponse.mStartupExecType = StrategyStartupGearInfo.LiveStartupExecType.STARTUP_EXEC_TYPE_FAIL.ordinal();
        gearResponse.mStartupStrategyStartTs = System.currentTimeMillis();
        if (gearRequest.mEnableGetCybertronVrtbitrate) {
            int vrtbitrateFromCybertron = getVrtbitrateFromCybertron(gearRequest);
            gearResponse.mHitCybertronVrtbitrate = vrtbitrateFromCybertron;
            if (vrtbitrateFromCybertron == 2) {
                gearResponse.mCybertronRtBitrateInfoMap = gearRequest.mAbrRtBitrateInfoMap;
                gearResponse.mCybertronRtBitrateTsMap = gearRequest.mAbrRtBitrateTsMap;
                gearResponse.mCybertronRtBitrateVpaasTsMap = gearRequest.mAbrRtBitrateVpaasTsMap;
            }
        }
        processScreenInfoIfNeeded(gearRequest);
        String stringValue = StrategyCenter.getInstance().getStringValue(57009, C786410Ut5.J3(gearRequest.toJson()));
        if (!TextUtils.isEmpty(stringValue)) {
            try {
                jSONObject = new JSONObject(stringValue);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        gearResponse.mStartupStrategyEndTs = System.currentTimeMillis();
        if (jSONObject != null) {
            gearResponse.mStrategyLog = jSONObject;
        } else {
            gearResponse.mStrategyLog = new JSONObject();
        }
        try {
            gearResponse.mStrategyLog.put("startupStrategyStartTs", gearResponse.mStartupStrategyStartTs);
            gearResponse.mStrategyLog.put("startupStrategyEndTs", gearResponse.mStartupStrategyEndTs);
            return gearResponse;
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return gearResponse;
        }
    }

    public void createStartupRetryTask(StrategyStartupGearInfo.GearRequest gearRequest) {
        if (gearRequest.mRealStartupRetryCount >= gearRequest.mStartupRetryLimitCount) {
            this.mStartupRetryTaskSet.remove(gearRequest.mRoomId);
            return;
        }
        if (!TextUtils.isEmpty(gearRequest.mRoomId)) {
            Message messageObtainMessage = this.mStartupHandler.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = gearRequest;
            this.mStartupHandler.sendMessageDelayed(messageObtainMessage, gearRequest.mStartupRetryInterval);
            this.mStartupRetryTaskSet.add(gearRequest.mRoomId);
        }
    }

    public void createStartupRetryTaskAsyn(final StrategyStartupGearInfo.GearRequest gearRequest) {
        ensureStartupHandlerThreadInitialized();
        MyStartupHandler myStartupHandler = this.mStartupHandler;
        if (myStartupHandler != null) {
            myStartupHandler.post(new Runnable() { // from class: com.bytedance.vcloud.strategy.StrategyStartupGear.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("StrategyStartupGear@736.createStartupRetryTaskAsyn$1");
                    com_bytedance_vcloud_strategy_StrategyStartupGear$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("StrategyStartupGear@736.createStartupRetryTaskAsyn$1");
                }

                public void com_bytedance_vcloud_strategy_StrategyStartupGear$1__run$___twin___() {
                    if (TextUtils.isEmpty(gearRequest.mRoomId) || StrategyStartupGear.this.mStartupRetryTaskSet.contains(gearRequest.mRoomId)) {
                        return;
                    }
                    StrategyStartupGear.this.createStartupRetryTask(gearRequest);
                }

                public static void com_bytedance_vcloud_strategy_StrategyStartupGear$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_bytedance_vcloud_strategy_StrategyStartupGear$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    public StrategyStartupGearInfo.GearResponse getStartupCacheResult(String str) {
        if (!TextUtils.isEmpty(str) && this.mStartupResultCacheMap.containsKey(str)) {
            return this.mStartupResultCacheMap.get(str);
        }
        return null;
    }

    public StrategyStartupGearInfo.GearResponse getStartupGear(StrategyStartupGearInfo.GearRequest gearRequest) {
        if (gearRequest == null) {
            return null;
        }
        new StrategyStartupGearInfo.GearResponse();
        StrategyStartupGearInfo.GearResponse gearResponseRunStartupStrategy = runStartupStrategy(gearRequest);
        JSONObject jSONObject = gearResponseRunStartupStrategy.mStrategyLog;
        if (jSONObject != null) {
            gearResponseRunStartupStrategy.mGear = jSONObject.optString("probe_res");
            gearResponseRunStartupStrategy.mStrategyResult = "from strategy center";
            gearResponseRunStartupStrategy.mParseStrategyConfigCostUs = this.mParseStrategyConfigCostUs;
        }
        if (TextUtils.isEmpty(gearResponseRunStartupStrategy.mGear)) {
            gearResponseRunStartupStrategy.mGear = gearRequest.mDefaultResolution;
            gearResponseRunStartupStrategy.mStrategyResult = "from default";
        }
        String str = gearRequest.mRoomId;
        gearResponseRunStartupStrategy.mRoomId = str;
        if (gearRequest.mEnableUseStartupCache && !TextUtils.isEmpty(str)) {
            this.mStartupResultCacheMap.put(gearRequest.mRoomId, gearResponseRunStartupStrategy);
        }
        return gearResponseRunStartupStrategy;
    }

    public void handleStartupRetry(StrategyStartupGearInfo.GearRequest gearRequest) {
        if (gearRequest.mStartupRetryListener != null) {
            StrategyStartupGearInfo.GearResponse startupGear = getStartupGear(gearRequest);
            gearRequest.mRealStartupRetryCount++;
            if (gearRequest.mStartupRetryListener.onStartupRetryResultCallback(startupGear)) {
                createStartupRetryTask(gearRequest);
                return;
            }
            this.mStartupRetryTaskSet.remove(gearRequest.mRoomId);
            if (!gearRequest.mEnableUseStartupCache) {
                return;
            }
            this.mStartupResultCacheMap.remove(gearRequest.mRoomId);
        }
    }

    public void removeStartupCacheResult(String str) {
        if (!TextUtils.isEmpty(str) && this.mStartupResultCacheMap.containsKey(str)) {
            this.mStartupResultCacheMap.remove(str);
        }
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public StrategyStartupGearInfo.GearResponse getStartupGear(LiveRoomInfo liveRoomInfo) {
        String str;
        if (liveRoomInfo == null) {
            return null;
        }
        this.isMainLevel = liveRoomInfo.isMainLevel;
        StrategyStartupGearInfo.GearRequest params = parseParams(liveRoomInfo);
        if (this.isMainLevel) {
            str = "main";
        } else {
            str = "backup";
        }
        params.mLevel = str;
        return getStartupGear(params);
    }

    private void fillPresetAbrConfigIfNeeded(LiveStartupConfig liveStartupConfig, StrategyStartupGearInfo.GearRequest gearRequest) {
        StrategyConfigItem startupBitrateItem = liveStartupConfig.getStartupBitrateItem();
        if (startupBitrateItem != null && !liveStartupConfig.hasStartupStrategy()) {
            if (startupBitrateItem.isEnabled()) {
                gearRequest.mEnableProbeStartupBitrate = true;
            }
            JSONObject jSONObject = startupBitrateItem.mStrategyInputParams;
            if (jSONObject != null) {
                gearRequest.mStartupStrategyInputParams = jSONObject;
            }
        }
        StrategyConfigItem bandwidthEstimatorItem = liveStartupConfig.getBandwidthEstimatorItem();
        if (bandwidthEstimatorItem != null && !liveStartupConfig.hasBandwidthStrategy()) {
            if (bandwidthEstimatorItem.isEnabled()) {
                gearRequest.mEnableBandwidthEstimationStrategy = true;
            }
            JSONObject jSONObject2 = bandwidthEstimatorItem.mStrategyInputParams;
            if (jSONObject2 != null) {
                gearRequest.mbandwidthEstimationStrategyInputParams = jSONObject2;
            }
        }
    }

    private boolean isEnableAbrByAutoInfo(LiveStreamData liveStreamData, JSONObject jSONObject) {
        LiveStreamData.Auto auto;
        if (jSONObject.optInt("EnableABRByAutoInfo", 0) != 1 || (auto = liveStreamData.common.autoInfo) == null || auto.enable != 1 || auto.list.isEmpty() || liveStreamData.common.autoInfo.list.size() <= 1) {
            return false;
        }
        return true;
    }

    private boolean isEnableAdaptive(LiveStreamData liveStreamData, String str) {
        if (liveStreamData.common.autoInfo.list.contains(str)) {
            return true;
        }
        return false;
    }

    private void parseGearInfo(StrategyStartupGearInfo.GearRequest gearRequest, LiveStreamData liveStreamData) {
        Map<String, LiveGear> map;
        LiveStreamData.StreamDataCommon streamDataCommon;
        LiveStreamData.Auto auto;
        if (liveStreamData != null && (map = liveStreamData.gears) != null && (streamDataCommon = liveStreamData.common) != null && (auto = streamDataCommon.autoInfo) != null && auto.list != null) {
            gearRequest.mDefaultResolution = liveStreamData.common.autoInfo.defaultGear;
            for (String str : map.keySet()) {
                if (!TextUtils.isEmpty(gearRequest.mStartupResListStr)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("\"");
                    sbLIZ.append(str);
                    sbLIZ.append("\"");
                    if (!gearRequest.mStartupResListStr.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                    }
                }
                if (isEnableAdaptive(liveStreamData, str)) {
                    getInfoByGear(gearRequest, liveStreamData, str);
                }
            }
        }
    }

    private boolean getInfoByGear(StrategyStartupGearInfo.GearRequest gearRequest, LiveStreamData liveStreamData, String str) {
        Map<String, LiveGear> map;
        LivePreference livePreference;
        int i;
        if (liveStreamData != null && str != null && (map = liveStreamData.gears) != null) {
            try {
                LiveGear liveGear = map.get(str);
                if (liveGear == null) {
                    return false;
                }
                if (this.isMainLevel) {
                    livePreference = liveGear.main;
                } else {
                    livePreference = liveGear.backup;
                }
                String str2 = livePreference.sdkParams;
                if (str2 == null) {
                    return false;
                }
                if (gearRequest.mAbrGearToResolutionMap == null) {
                    gearRequest.mAbrGearToResolutionMap = new JSONObject();
                }
                if (gearRequest.mAbrBitrateInfoMap == null) {
                    gearRequest.mAbrBitrateInfoMap = new JSONObject();
                }
                if (gearRequest.mAbrRtBitrateInfoMap == null) {
                    gearRequest.mAbrRtBitrateInfoMap = new JSONObject();
                }
                if (gearRequest.mAbrRtBitrateTsMap == null) {
                    gearRequest.mAbrRtBitrateTsMap = new JSONObject();
                }
                if (gearRequest.mAbrRtBitrateStdMap == null) {
                    gearRequest.mAbrRtBitrateStdMap = new JSONObject();
                }
                if (gearRequest.mAbrRtBitratePctMap == null) {
                    gearRequest.mAbrRtBitratePctMap = new JSONObject();
                }
                JSONObject jSONObject = new JSONObject(str2);
                String[] strArrSplit = jSONObject.optString("resolution").split("x");
                if (strArrSplit.length == 2) {
                    try {
                        i = CastIntegerProtector.parseInt(strArrSplit[0]) * CastIntegerProtector.parseInt(strArrSplit[1]);
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        i = 0;
                    }
                    int resolutionRateByPixelCount = getResolutionRateByPixelCount(i);
                    if (resolutionRateByPixelCount != -1) {
                        gearRequest.mAbrGearToResolutionMap.put(str, resolutionRateByPixelCount);
                    }
                }
                gearRequest.mAbrBitrateInfoMap.put(str, jSONObject.optInt("vbitrate"));
                gearRequest.mAbrRtBitrateInfoMap.put(str, jSONObject.optInt("v_rtbitrate"));
                gearRequest.mAbrRtBitrateTsMap.put(str, jSONObject.optLong("v_rtbitrate_timestamp"));
                gearRequest.mAbrRtBitrateStdMap.put(str, jSONObject.optLong("v_rtbitrate_std"));
                gearRequest.mAbrRtBitratePctMap.put(str, jSONObject.optLong("v_rtbitrate_pct"));
                return true;
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return false;
    }

    private void parseStrategyParams(StrategyStartupGearInfo.GearRequest gearRequest, String str, LiveRoomInfo liveRoomInfo) {
        boolean z;
        boolean z2;
        LiveStartupConfig liveStartupConfig;
        JSONObject jSONObjectOptJSONObject;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap map = new HashMap();
            boolean z6 = true;
            if (jSONObject.has("StrategyInLss") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("StrategyInLss")) != null && jSONObjectOptJSONObject2.has("StrategyList") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("StrategyList")) != null) {
                z = false;
                z2 = false;
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    StrategyConfigItem strategyConfigItemFrom = StrategyConfigItem.from((JSONObject) jSONArrayOptJSONArray.opt(i));
                    if (strategyConfigItemFrom != null && !TextUtils.isEmpty(strategyConfigItemFrom.mName)) {
                        if (!TextUtils.equals(strategyConfigItemFrom.mName, "live_stream_strategy_abr_predict_bitrate") && !z2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!TextUtils.equals(strategyConfigItemFrom.mName, "live_stream_strategy_startup_bitrate_predict") && !z) {
                            z = false;
                        } else {
                            z = true;
                        }
                        map.put(strategyConfigItemFrom.mName, strategyConfigItemFrom);
                    }
                }
            } else {
                z = false;
                z2 = false;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("StrategyInLSS");
            if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.has("StrategyList")) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("StrategyList");
                if (isEnableAbrByAutoInfo(liveRoomInfo.liveStreamData, jSONObject)) {
                    LiveStreamData liveStreamData = liveRoomInfo.liveStreamData;
                    if (!z2 && !z) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    liveStartupConfig = new LiveStartupConfig(jSONObjectOptJSONObject, liveStreamData, z5);
                    LiveStreamData.Auto auto = liveRoomInfo.liveStreamData.common.autoInfo;
                    if (auto != null) {
                        liveStartupConfig.updateDefaultResolution(auto.defaultGear);
                    }
                } else {
                    liveStartupConfig = null;
                }
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    StrategyConfigItem strategyConfigItemFrom2 = StrategyConfigItem.from(jSONObjectOptJSONObject.optJSONObject(next));
                    if (strategyConfigItemFrom2 != null && !TextUtils.isEmpty(strategyConfigItemFrom2.mName)) {
                        if (liveStartupConfig != null && liveStartupConfig.isEnableABRAndStartup()) {
                            strategyConfigItemFrom2 = liveStartupConfig.mergePresetAndDeliveryParam(strategyConfigItemFrom2);
                        }
                        map.put(next, strategyConfigItemFrom2);
                    }
                }
            } else {
                liveStartupConfig = null;
                jSONObjectOptJSONObject = null;
            }
            for (String str2 : map.keySet()) {
                StrategyConfigItem strategyConfigItem = (StrategyConfigItem) map.get(str2);
                if (!TextUtils.equals(strategyConfigItem.mName, "live_stream_strategy_startup_bitrate_predict") && !TextUtils.equals(str2, "live_stream_strategy_startup_bitrate_predict")) {
                    if (TextUtils.equals(strategyConfigItem.mName, "live_stream_strategy_bandwidth_estimator") || TextUtils.equals(str2, "live_stream_strategy_bandwidth_estimator")) {
                        if (strategyConfigItem.isEnabled()) {
                            gearRequest.mEnableBandwidthEstimationStrategy = true;
                        }
                        JSONObject jSONObject2 = strategyConfigItem.mStrategyInputParams;
                        if (jSONObject2 != null) {
                            gearRequest.mbandwidthEstimationStrategyInputParams = jSONObject2;
                        }
                    }
                } else {
                    if (strategyConfigItem.isEnabled()) {
                        gearRequest.mEnableProbeStartupBitrate = true;
                    }
                    JSONObject jSONObject3 = strategyConfigItem.mStrategyInputParams;
                    if (jSONObject3 != null) {
                        gearRequest.mStartupStrategyInputParams = jSONObject3;
                    }
                }
            }
            if (jSONObject.optInt("EnableUseStartupCache", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            gearRequest.mEnableUseStartupCache = z3;
            if (jSONObject.optInt("EnableGetCybertronVrtBitrate", 0) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            gearRequest.mEnableGetCybertronVrtbitrate = z4;
            if (isEnableAbrByAutoInfo(liveRoomInfo.liveStreamData, jSONObject)) {
                if (liveStartupConfig == null) {
                    LiveStreamData liveStreamData2 = liveRoomInfo.liveStreamData;
                    if (!z2 && !z) {
                        z6 = false;
                    }
                    liveStartupConfig = new LiveStartupConfig(jSONObjectOptJSONObject, liveStreamData2, z6);
                    LiveStreamData.Auto auto2 = liveRoomInfo.liveStreamData.common.autoInfo;
                    if (auto2 != null) {
                        liveStartupConfig.updateDefaultResolution(auto2.defaultGear);
                    }
                }
                if (liveStartupConfig.isEnableABRAndStartup() && !liveStartupConfig.hasStartupAndAbrStrategy()) {
                    fillPresetAbrConfigIfNeeded(liveStartupConfig, gearRequest);
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public String readFromStorage(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        if (sharedPreferences == null) {
            sharedPreferences = C810670Vr7.LIZJ(context, 0, str);
        }
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            return "";
        }
        return sharedPreferences2.getString(str2, "");
    }

    public void writeToStorage(final Context context, final String str, final String str2, final String str3) {
        DCThreadPool.addTask(new Runnable() { // from class: com.bytedance.vcloud.strategy.StrategyStartupGear.2
            @Override // java.lang.Runnable
            public void run() {
                C1C7U.LIZ("StrategyStartupGear@736.writeToStorage$1");
                com_bytedance_vcloud_strategy_StrategyStartupGear$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("StrategyStartupGear@736.writeToStorage$1");
            }

            public void com_bytedance_vcloud_strategy_StrategyStartupGear$2__run$___twin___() {
                Context context2 = context;
                if (context2 != null) {
                    if (StrategyStartupGear.sharedPreferences == null) {
                        StrategyStartupGear.sharedPreferences = C810670Vr7.LIZJ(context2, 0, str);
                    }
                    SharedPreferences.Editor editorEdit = StrategyStartupGear.sharedPreferences.edit();
                    editorEdit.putString(str2, str3);
                    editorEdit.apply();
                }
            }

            public static void com_bytedance_vcloud_strategy_StrategyStartupGear$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                try {
                    anonymousClass2.com_bytedance_vcloud_strategy_StrategyStartupGear$2__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }
}
