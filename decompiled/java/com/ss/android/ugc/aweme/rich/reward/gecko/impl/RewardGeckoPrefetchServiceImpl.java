package com.ss.android.ugc.aweme.rich.reward.gecko.impl;

import X.C01GW;
import X.C098200Yq;
import X.C0AJ2;
import X.C1052360dUY;
import X.C13LN;
import X.C1499850p8J;
import X.C189200o6;
import X.C20684815ws;
import X.C2188811AlT;
import X.C452501pT;
import X.C458601qS;
import X.InterfaceC1052390dUb;
import X.InterfaceC594300NSq;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.rich.reward.gecko.api.IRewardGeckoPrefetchService;
import com.ss.android.ugc.aweme.rich.reward.gecko.impl.RewardGeckoPrefetchServiceImpl;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardGeckoPrefetchServiceImpl implements IRewardGeckoPrefetchService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(616));

    @Override // com.ss.android.ugc.aweme.rich.reward.gecko.api.IRewardGeckoPrefetchService
    public final void LIZ(final C1052360dUY c1052360dUY) {
        Object c098200Yq;
        C1499850p8J c1499850p8JCreateBuilder;
        RewardGeckoPrefetchApi rewardGeckoPrefetchApi;
        if (!((Boolean) C0AJ2.LIZ.getValue()).booleanValue()) {
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", "reward_ad");
            C20684815ws.LJIJ("resource_load_start", jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        String strLJZL = null;
        try {
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
            if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C458601qS.LIZ)) != null && (rewardGeckoPrefetchApi = (RewardGeckoPrefetchApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(RewardGeckoPrefetchApi.class)) != null) {
                rewardGeckoPrefetchApi.getGeckoChannels("/tiktok/v1/ad/incentive/resource/preload/").enqueue(new InterfaceC594300NSq<String>() { // from class: X.0dUa
                    @Override // X.InterfaceC594300NSq
                    public final void onFailure(C0X9S<String> c0x9s, Throwable th2) {
                        String strLJZL2;
                        Exception exc;
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        RewardGeckoPrefetchServiceImpl rewardGeckoPrefetchServiceImpl = this.LL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("networkError:");
                        String message = th2.getMessage();
                        if (message != null) {
                            strLJZL2 = C13LN.LJZL(256, message);
                        } else {
                            strLJZL2 = null;
                        }
                        sbLIZ.append(strLJZL2);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        rewardGeckoPrefetchServiceImpl.getClass();
                        RewardGeckoPrefetchServiceImpl.LIZJ(0, 4, jElapsedRealtime2, strLIZIZ);
                        RewardGeckoPrefetchServiceImpl rewardGeckoPrefetchServiceImpl2 = this.LL;
                        InterfaceC1052390dUb interfaceC1052390dUb = c1052360dUY;
                        rewardGeckoPrefetchServiceImpl2.getClass();
                        if (th2 instanceof Exception) {
                            exc = (Exception) th2;
                        } else {
                            exc = new Exception(th2);
                        }
                        RewardGeckoPrefetchServiceImpl.LIZIZ(interfaceC1052390dUb, exc);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
                    @Override // X.InterfaceC594300NSq
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onResponse(X.C0X9S<java.lang.String> r12, X.C0X52<java.lang.String> r13) {
                        /*
                            Method dump skipped, instruction units count: 265
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1052380dUa.onResponse(X.0X9S, X.0X52):void");
                    }
                });
            } else {
                LIZJ(0, 4, SystemClock.elapsedRealtime() - jElapsedRealtime, "networkError:Retrofit unavailable");
                LIZIZ(c1052360dUY, new IllegalStateException("Retrofit unavailable"));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("networkError:");
            String message = e.getMessage();
            if (message != null) {
                strLJZL = C13LN.LJZL(256, message);
            }
            sbLIZ.append(strLJZL);
            LIZJ(0, 4, jElapsedRealtime2, C2188811AlT.LIZIZ(sbLIZ));
            LIZIZ(c1052360dUY, e);
        }
    }

    public static void LIZIZ(InterfaceC1052390dUb interfaceC1052390dUb, Exception exc) {
        try {
            interfaceC1052390dUb.onFailure();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String LIZLLL(RewardGeckoPrefetchServiceImpl rewardGeckoPrefetchServiceImpl, String str) {
        if (str.length() > 2048) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C13LN.LJZL(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, str));
            sbLIZ.append("...(truncated, length=");
            sbLIZ.append(str.length());
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static void LIZJ(int i, int i2, long j, String str) {
        Object c098200Yq;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", "reward_ad");
            jSONObject.put("success", i);
            jSONObject.put("code", i2);
            jSONObject.put("duration", j);
            if (str != null) {
                jSONObject.put("fail_reason", str);
            }
            C20684815ws.LJIJ("resource_load_result", jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
