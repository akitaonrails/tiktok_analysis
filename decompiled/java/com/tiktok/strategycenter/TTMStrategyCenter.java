package com.tiktok.strategycenter;

import X.AbstractC2213611BkN;
import X.C1C7U;
import X.C2188811AlT;
import X.C2208771BcZ;
import X.C2213431Bk5;
import X.C2213581BkK;
import X.C786410Ut5;
import X.C822650WOx;
import X.InterfaceC2213441Bk6;
import Y.ARunnableS103S0200000_34;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pitaya.cep_engine.CepEngineManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenter.TTMStrategyCenter;
import com.tiktok.strategycenter.TTMStrategyResult;
import com.tiktok.strategycenter.TTMStrategyRunCallBack;
import com.tiktok.strategycenter.bytedt.TTMStrategyCenterByteDTEngineManager;
import com.tiktok.strategycenter.feature.IFeatureCenterDataManager;
import com.tiktok.strategycenter.settings.ISettingsManagerDelegate;
import com.tiktok.strategycenter.storage.TTMStrategyCenterKVManager;
import com.tiktok.ttm.TTMCore;
import com.tiktok.ttm.TTMInput;
import com.tiktok.ttm.TTMOutput;
import com.tiktok.ttm.TTMParamData;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes35.dex */
public class TTMStrategyCenter {
    public static boolean isInited;
    public static Handler threadHandler;
    public static long ttmStrategyCenterExtendFuncAddress;
    public static final HandlerThread handlerThread = new HandlerThread("OpenStrategyCenter");
    public static boolean initError = false;
    public static final ConcurrentHashMap<String, TTMStrategyRunCallBack> callBackHashMap = new ConcurrentHashMap<>();
    public static final TTMCepSettingsValueManager settingValueManager = new TTMCepSettingsValueManager();
    public static ExecutorService executor = null;
    public static InterfaceC2213441Bk6 configCallBck = null;
    public static TTMStrategyRunCallBack ruleCallBack = new TTMStrategyRunCallBack() { // from class: X.0eZB
        @Override // com.tiktok.strategycenter.TTMStrategyRunCallBack
        public final void run(TTMStrategyResult tTMStrategyResult) {
            ConcurrentHashMap<String, TTMStrategyRunCallBack> concurrentHashMap = TTMStrategyCenter.callBackHashMap;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(tTMStrategyResult.bizName);
            sbLIZ.append(tTMStrategyResult.ruleName);
            TTMStrategyRunCallBack tTMStrategyRunCallBack = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
            if (tTMStrategyRunCallBack != null) {
                tTMStrategyRunCallBack.run(tTMStrategyResult);
            }
        }
    };

    public static native void initStrategyCenter(TTMStrategyRunCallBack tTMStrategyRunCallBack, TTMCepSettingsValueManager tTMCepSettingsValueManager, IFeatureCenterDataManager iFeatureCenterDataManager, ISettingsManagerDelegate iSettingsManagerDelegate, boolean z);

    public static native boolean nativeCleanBizCepRule(String str, String str2);

    public static native long nativeCreateByteDTManager(String str, String str2);

    public static native long nativeGetTTMStrategyCenterExtendFuncAddress();

    public static native boolean nativeRegisterBizCepCallback(String str, String str2);

    public static native boolean nativeRegisterBizCepRule(String str, String str2, String str3, byte[] bArr, long j, boolean z, long j2);

    public static native boolean nativeRegisterBizCepRule(String str, String str2, String str3, byte[] bArr, long j, boolean z, long j2, int i);

    public static native boolean nativeRegisterSettingsCallBack(String str);

    public static native void nativeRunBizCepRule(String str, String str2, TTMParamData tTMParamData, TTMStrategyResult tTMStrategyResult, long j);

    public static native boolean nativeUnRegisterBizCepCallBack(String str, String str2);

    public static native boolean nativeUnRegisterRule(String str, String str2);

    public long getTTMStrategyCenterExtendFuncAddress() {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return 0L;
            }
        }
        return ttmStrategyCenterExtendFuncAddress;
    }

    public TTMStrategyCenter() {
    }

    public static TTMStrategyCenter getInstance() {
        return C2213581BkK.LIZ;
    }

    public static boolean getIsEnable() {
        return isInited;
    }

    public ExecutorService getExecutor() {
        return executor;
    }

    public static void setExecutor(ExecutorService executorService) {
        if (executorService != null) {
            executor = executorService;
        }
    }

    public static void setGetTTMStrategyCenterConfigCallBack(InterfaceC2213441Bk6 interfaceC2213441Bk6) {
        configCallBck = interfaceC2213441Bk6;
    }

    public Throwable init(C2213431Bk5 c2213431Bk5) {
        try {
            if (isInited) {
                return null;
            }
            synchronized (this) {
                try {
                    if (isInited) {
                        return null;
                    }
                    if ((c2213431Bk5 == null && (c2213431Bk5 = configCallBck.LIZ()) == null) || c2213431Bk5.LIZ == null) {
                        return null;
                    }
                    TTMCore.getInstance().initTTM(c2213431Bk5.LIZ);
                    TTMStrategyCenterKVManager.forceInit();
                    HandlerThread handlerThread2 = handlerThread;
                    handlerThread2.start();
                    threadHandler = new BPEAHandler(C786410Ut5.W2(handlerThread2));
                    CepEngineManager.INSTANCE.init();
                    initStrategyCenter(ruleCallBack, settingValueManager, c2213431Bk5.LIZIZ, C2208771BcZ.LIZ, c2213431Bk5.LIZJ);
                    ttmStrategyCenterExtendFuncAddress = nativeGetTTMStrategyCenterExtendFuncAddress();
                    TTMCore.getInstance().registerExternPlatformExtendFunAddress(ttmStrategyCenterExtendFuncAddress);
                    if (executor == null) {
                        int iMax = Math.max(Runtime.getRuntime().availableProcessors() * 2, 6);
                        C822650WOx c822650WOx = new C822650WOx(iMax, iMax, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        c822650WOx.allowCoreThreadTimeOut(true);
                        executor = c822650WOx;
                    }
                    isInited = true;
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            isInited = true;
            initError = true;
            return th2;
        }
    }

    public boolean registerExternFuncAddress(long j) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return false;
            }
        }
        return TTMCore.getInstance().registerExternPlatformExtendFunAddress(j);
    }

    public void releaseTTMRuleByteCode(long j) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return;
            }
        }
        TTMCore.getInstance().releaseTTMRuleByteCode(j);
    }

    public TTMOutput runTTMRuleWithBinData(TTMInput tTMInput) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return null;
            }
        }
        return TTMCore.getInstance().execute(tTMInput);
    }

    public static /* synthetic */ void lambda$asyncProcessBizCepRule$0(TTMStrategyRunCallBack tTMStrategyRunCallBack, TTMStrategyResult tTMStrategyResult) {
        C1C7U.LIZ("TTMStrategyCenter@c805.asyncProcessBizCepRule$1L$1L");
        tTMStrategyRunCallBack.run(tTMStrategyResult);
        C1C7U.LIZIZ("TTMStrategyCenter@c805.asyncProcessBizCepRule$1L$1L");
    }

    public boolean cleanBizCepRule(String str, String str2) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return false;
            }
        }
        return nativeCleanBizCepRule(str, str2);
    }

    public TTMStrategyCenterByteDTEngineManager getOrCreateByteDTManager(String str, String str2) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return null;
            }
        }
        return new TTMStrategyCenterByteDTEngineManager(nativeCreateByteDTManager(str, str2), str, str2);
    }

    public long parseTTMRuleByteCode(String str, long j) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return 0L;
            }
        }
        return TTMCore.getInstance().parseTTMRuleByteCode(str, j);
    }

    public byte[] processTTMRuleByteCode(String str, long j) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return null;
            }
        }
        return TTMCore.getInstance().processTTMRuleByteCode(str, j);
    }

    public boolean registerBizCepRule(String str, TTMStrategyRule tTMStrategyRule) {
        return registerBizCepRule(str, tTMStrategyRule, 0L);
    }

    public boolean registerSettingsCallBack(String str, AbstractC2213611BkN abstractC2213611BkN) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return false;
            }
        }
        if (abstractC2213611BkN == null || TextUtils.isEmpty(str)) {
            return false;
        }
        settingValueManager.addRuleConfig(str, abstractC2213611BkN);
        return nativeRegisterSettingsCallBack(str);
    }

    public boolean unRegisterBizCepCallback(String str, String str2) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return false;
            }
        }
        ConcurrentHashMap<String, TTMStrategyRunCallBack> concurrentHashMap = callBackHashMap;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        concurrentHashMap.remove(C2188811AlT.LIZIZ(sbLIZ));
        return nativeUnRegisterBizCepCallBack(str, str2);
    }

    public boolean unRegisterRule(String str, String str2) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return false;
            }
        }
        settingValueManager.removeRuleConfig(str);
        if (str == null || str2 == null) {
            return false;
        }
        return nativeUnRegisterRule(str, str2);
    }

    public long parseTTMRuleByteCode(byte[] bArr, long j) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return 0L;
            }
        }
        return TTMCore.getInstance().parseTTMRuleByteCode(bArr, j);
    }

    public boolean registerBizCepCallback(String str, String str2, TTMStrategyRunCallBack tTMStrategyRunCallBack) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return false;
            }
        }
        ConcurrentHashMap<String, TTMStrategyRunCallBack> concurrentHashMap = callBackHashMap;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), tTMStrategyRunCallBack);
        return nativeRegisterBizCepCallback(str, str2);
    }

    public boolean registerBizCepRule(String str, TTMStrategyRule tTMStrategyRule, long j) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return false;
            }
        }
        String ruleName = tTMStrategyRule.getRuleName();
        String rule = tTMStrategyRule.getRule();
        long ruleStrAddr = tTMStrategyRule.getRuleStrAddr();
        if (TextUtils.isEmpty(ruleName) || TextUtils.isEmpty(str) || (TextUtils.isEmpty(rule) && ruleStrAddr == 0 && tTMStrategyRule.getByteRule() == null)) {
            return false;
        }
        return nativeRegisterBizCepRule(str, ruleName, rule, tTMStrategyRule.getByteRule(), ruleStrAddr, tTMStrategyRule.isOverWrite(), j, tTMStrategyRule.getRuleType().getValue());
    }

    public boolean registerBizCepRules(String str, List<TTMStrategyRule> list, List<TTMStrategyRule> list2, long j) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return false;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean z = true;
        for (TTMStrategyRule tTMStrategyRule : list) {
            String ruleName = tTMStrategyRule.getRuleName();
            String rule = tTMStrategyRule.getRule();
            long ruleStrAddr = tTMStrategyRule.getRuleStrAddr();
            if (TextUtils.isEmpty(ruleName) || ((TextUtils.isEmpty(rule) && ruleStrAddr == 0) || !nativeRegisterBizCepRule(str, ruleName, rule, tTMStrategyRule.getByteRule(), ruleStrAddr, tTMStrategyRule.isOverWrite(), j, tTMStrategyRule.getRuleType().getValue()))) {
                if (list2 != null) {
                    list2.add(tTMStrategyRule);
                }
                z = false;
            }
        }
        return z;
    }

    public TTMStrategyResult syncProcessBizCepRule(String str, String str2, TTMParamData tTMParamData, long j) {
        TTMStrategyResult tTMStrategyResult = new TTMStrategyResult(false, null, str2, str, new Object[0]);
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return tTMStrategyResult;
            }
        }
        if (tTMParamData != null) {
            nativeRunBizCepRule(str, str2, tTMParamData, tTMStrategyResult, j);
        }
        return tTMStrategyResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$asyncProcessBizCepRule$1(String str, String str2, TTMParamData tTMParamData, long j, TTMStrategyRunCallBack tTMStrategyRunCallBack) {
        C1C7U.LIZ("TTMStrategyCenter@c805.asyncProcessBizCepRule$1L");
        executor.execute(new ARunnableS103S0200000_34(tTMStrategyRunCallBack, syncProcessBizCepRule(str, str2, tTMParamData, j), 14));
        C1C7U.LIZIZ("TTMStrategyCenter@c805.asyncProcessBizCepRule$1L");
    }

    public void asyncProcessBizCepRule(final String str, final String str2, final TTMParamData tTMParamData, final long j, final TTMStrategyRunCallBack tTMStrategyRunCallBack) {
        if (!isInited) {
            init(null);
            if (!isInited || initError) {
                return;
            }
        }
        try {
            C786410Ut5.LJJZZIII(threadHandler, new Runnable() { // from class: X.1BkJ
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$asyncProcessBizCepRule$1(str, str2, tTMParamData, j, tTMStrategyRunCallBack);
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
