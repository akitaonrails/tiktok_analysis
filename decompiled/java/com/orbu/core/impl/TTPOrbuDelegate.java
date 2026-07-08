package com.orbu.core.impl;

import X.C098200Yq;
import X.C1697810uHb;
import X.C189200o6;
import X.C2188811AlT;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.TTKOrbu;
import com.orbu.core.TTKOrbuConstants;
import com.orbu.core.adapter.TTKNetworkRequest;
import com.orbu.core.adapter.TTKOrbuContext;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.adapter.TTKResponseKt;
import com.orbu.core.api.ITTKOrbu;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuRequestPayload;
import com.orbu.core.api.ITTKOrbusActiveCallback;
import com.orbu.core.config.AgConfig;
import com.orbu.core.config.BootConfig;
import com.orbu.core.config.BootConfigKt;
import com.orbu.core.config.IConfigCenter;
import com.orbu.core.init.HardBlockConfig;
import com.orbu.core.init.HardBlockConfigManager;
import com.orbu.core.init.TTKNativeNetworkManager;
import com.orbu.core.logger.SandboxActivationJournal;
import com.orbu.core.logger.SandboxBootLogger;
import com.orbu.core.mob.ITTKEventReport;
import com.orbu.core.mob.MobUtils;
import com.orbu.core.utils.OrbuRequestExtKt;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ttp.orbu.sdk.Channel;
import ttp.orbu.sdk.ITTPOrbuInterceptor;
import ttp.orbu.sdk.TTPOrbuResponse;
import ttp.orbu.sdk.TTPOrbuSdk;
import ttp.orbu.sdk.init.TTPOrbuActiveResult;
import ttp.orbu.sdk.init.TTPOrbuContext;
import ttp.orbu.sdk.init.TTPOrbusActiveCallback;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPOrbuDelegate implements ITTKOrbu {
    public volatile boolean enableIntercept;
    public volatile boolean enableInterceptExpr;
    public int nativeReportStrategy;
    public String storeRegion;
    public final String TAG = "orbu.TTPOrbuDelegate";
    public AtomicReference<String> curState = new AtomicReference<>("DISABLE_SDK");
    public AtomicReference<String> sdkInternalEnableState = new AtomicReference<>("unknown");
    public AtomicInteger sandboxActiveCounter = new AtomicInteger(0);
    public String sandboxRulesExperimentGroup = "";

    @Override // com.orbu.core.api.ITTKOrbu
    public BootConfig getBootConfig() {
        return new BootConfig(new AgConfig(null, null, null, 7, null), BootConfigKt.getDefaultThirdPartyConfig(), "671089669", C1697810uHb.LJIIJJI("http://", "https://", "wss://", "tcp://", "udp://", "tls://", "quic://"));
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getCurOrbuInternalState() {
        return this.sdkInternalEnableState.get();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getCurOrbuState() {
        return this.curState.get();
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public boolean hitSampleDrop() {
        ITTKEventReport iTTKEventReportEventReport = TTKOrbu.INSTANCE.eventReport();
        return iTTKEventReportEventReport != null && iTTKEventReportEventReport.hitSampleDrop("pns_sandbox_intercept");
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getOrbuSDKVersion() {
        return ITTKOrbu.DefaultImpls.getOrbuSDKVersion(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getRuleHash() {
        return ITTKOrbu.DefaultImpls.getRuleHash(this);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public boolean enableInterceptor() {
        return this.enableIntercept;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getExperimentGroup() {
        return this.sandboxRulesExperimentGroup;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public String getStoreRegion() {
        return this.storeRegion;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public int nativeReportStrategy() {
        return this.nativeReportStrategy;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setConfigCenter(IConfigCenter iConfigCenter) {
        ITTKOrbu.DefaultImpls.setConfigCenter(this, iConfigCenter);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setDebug(boolean z) {
        TTKNativeNetworkManager.setDebug(z);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setDelegate(ITTKOrbu iTTKOrbu) {
        ITTKOrbu.DefaultImpls.setDelegate(this, iTTKOrbu);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public void setHardBlockConfig(HardBlockConfig hardBlockConfig) {
        ITTKOrbu.DefaultImpls.setHardBlockConfig(this, hardBlockConfig);
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public <T extends ITTKOrbuRequestPayload> TTKResponse shouldInterceptTTKRequest(ITTKOrbuRequest<? extends T> iTTKOrbuRequest) throws JSONException {
        String string;
        MobUtils mobUtils = MobUtils.INSTANCE;
        long curMillis = mobUtils.getCurMillis();
        long curThreadMillis = mobUtils.getCurThreadMillis();
        String str = iTTKOrbuRequest.metadata().get("x-tt-dataflow-id");
        String strDataFlowId2Hex = OrbuRequestExtKt.dataFlowId2Hex(str);
        if (iTTKOrbuRequest.channel() == Channel.SETTINGS) {
            string = "";
        } else {
            string = iTTKOrbuRequest.payload().toString();
        }
        boolean zIsHexDataFlowIdEmpty = OrbuRequestExtKt.isHexDataFlowIdEmpty(strDataFlowId2Hex);
        ITTKEventReport iTTKEventReportEventReport = TTKOrbu.INSTANCE.eventReport();
        if (iTTKEventReportEventReport != null) {
            iTTKEventReportEventReport.onTTKRequest(iTTKOrbuRequest, !zIsHexDataFlowIdEmpty);
        }
        if (Intrinsics.LJFF(this.curState.get(), "PRE_ACTIVE") && iTTKOrbuRequest.channel() != Channel.NETWORK) {
            handlePreActiveState(iTTKOrbuRequest, str, strDataFlowId2Hex, string);
            TTKResponse.Builder builder = new TTKResponse.Builder();
            builder.statusCode(90001);
            builder.description("Can not transmit data in pre_active status");
            builder.block(false);
            return builder.build();
        }
        long curMillis2 = mobUtils.getCurMillis();
        TTKResponse tTKResponseInterceptRequest = interceptRequest(iTTKOrbuRequest, strDataFlowId2Hex);
        reportInterceptEvent(iTTKOrbuRequest, tTKResponseInterceptRequest, str, strDataFlowId2Hex, string, curMillis2, curMillis, curThreadMillis, zIsHexDataFlowIdEmpty);
        return tTKResponseInterceptRequest;
    }

    private final void handleDisabledState(ITTKOrbusActiveCallback iTTKOrbusActiveCallback, SandboxActivationJournal sandboxActivationJournal) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        sandboxActivationJournal.setActivationEnd(jUptimeMillis);
        sandboxActivationJournal.setActivationCallback(jUptimeMillis);
        SandboxBootLogger.INSTANCE.setLastActivationJournal(sandboxActivationJournal);
        this.sandboxActiveCounter.incrementAndGet();
        iTTKOrbusActiveCallback.onActiveCallback(1);
    }

    private final void handleNativeNetResult(TTPOrbuActiveResult tTPOrbuActiveResult, ITTKOrbusActiveCallback iTTKOrbusActiveCallback) {
        int i;
        if (tTPOrbuActiveResult.getResultOfLoadNativeNet()) {
            if (this.enableIntercept && tTPOrbuActiveResult.getShouldActive() && this.enableInterceptExpr) {
                i = 3;
            } else if (this.enableIntercept && tTPOrbuActiveResult.getShouldActive()) {
                i = 2;
            } else {
                i = 1;
            }
            iTTKOrbusActiveCallback.onActiveCallback(i);
        }
    }

    private final <T extends ITTKOrbuRequestPayload> TTKResponse interceptRequest(ITTKOrbuRequest<? extends T> iTTKOrbuRequest, String str) {
        Object c098200Yq;
        ITTKEventReport iTTKEventReportEventReport;
        List<ITTPOrbuInterceptor<?>> list;
        Object obj = null;
        if (!this.enableIntercept || !Intrinsics.LJFF(this.sdkInternalEnableState.get(), "enable")) {
            return null;
        }
        try {
            List<ITTPOrbuInterceptor<?>> list2 = TTPOrbuSdk.INSTANCE.interceptorsMap().get(iTTKOrbuRequest.channel());
            if ((list2 instanceof List) && (list = list2) != null) {
                Iterator<ITTPOrbuInterceptor<?>> it2 = list.iterator();
                while (it2.hasNext()) {
                    TTPOrbuResponse tTPOrbuResponseShouldInterceptRequest = it2.next().shouldInterceptRequest(iTTKOrbuRequest);
                    if (tTPOrbuResponseShouldInterceptRequest != null) {
                        TTKResponse.Builder builder = new TTKResponse.Builder();
                        builder.statusCode(tTPOrbuResponseShouldInterceptRequest.getStatusCode());
                        builder.description(tTPOrbuResponseShouldInterceptRequest.getDescription());
                        builder.block(HardBlockConfigManager.INSTANCE.isResultNeedHardBlock(iTTKOrbuRequest.channel(), str, tTPOrbuResponseShouldInterceptRequest.getStatusCode()));
                        c098200Yq = builder.build();
                        if (c098200Yq != null) {
                            break;
                        }
                    }
                }
                c098200Yq = null;
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                c098200Yq = null;
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null && (iTTKEventReportEventReport = TTKOrbu.INSTANCE.eventReport()) != null) {
            iTTKEventReportEventReport.onError(thM5exceptionOrNullimpl);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (TTKResponse) obj;
    }

    @Override // com.orbu.core.api.ITTKOrbu
    public int cleanUpTTP(Context context, String str) {
        return ITTKOrbu.DefaultImpls.cleanUpTTP(this, context, str);
    }

    private final void logActivationResult(TTPOrbuActiveResult tTPOrbuActiveResult, SandboxActivationJournal sandboxActivationJournal, int i) {
        SandboxBootLogger sandboxBootLogger = SandboxBootLogger.INSTANCE;
        sandboxBootLogger.getInitCost();
        long activationToCallbackCost = sandboxActivationJournal.getActivationToCallbackCost();
        sandboxBootLogger.getThreshold(activationToCallbackCost);
        sandboxBootLogger.isThresholdValid(activationToCallbackCost);
    }

    private final void reportActivationEvent(TTPOrbuActiveResult tTPOrbuActiveResult, SandboxActivationJournal sandboxActivationJournal, int i) throws JSONException {
        ITTKEventReport iTTKEventReportEventReport = TTKOrbu.INSTANCE.eventReport();
        if (iTTKEventReportEventReport != null && !iTTKEventReportEventReport.hitSampleDrop("pns_sandbox_sdk_event")) {
            long activationToCallbackCost = sandboxActivationJournal.getActivationToCallbackCost();
            SandboxBootLogger sandboxBootLogger = SandboxBootLogger.INSTANCE;
            boolean zIsThresholdValid = sandboxBootLogger.isThresholdValid(activationToCallbackCost);
            long threshold = sandboxBootLogger.getThreshold(activationToCallbackCost);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orbu_sdk_init_time", sandboxActivationJournal.getActivationCost());
            jSONObject.put("orbu_sdk_internal_init_time", activationToCallbackCost);
            jSONObject.put("orbu_sdk_enable_state", this.curState.get());
            jSONObject.put("experiment_group", this.sandboxRulesExperimentGroup);
            jSONObject.put("orbu_sdk_internal_enable_state", this.sdkInternalEnableState.get());
            jSONObject.put("orbu_sdk_result_native_net", tTPOrbuActiveResult.getResultOfLoadNativeNet());
            jSONObject.put("orbu_sdk_threshold_valid", zIsThresholdValid ? 1 : 0);
            jSONObject.put("orbu_sdk_threshold", threshold);
            jSONObject.put("orbu_sdk_active_count", i);
            jSONObject.put("orbu_sdk_version", getOrbuSDKVersion());
            iTTKEventReportEventReport.onEvent("pns_sandbox_sdk_event", jSONObject);
        }
    }

    private final boolean shouldReportPayload(Channel channel, int i, String str) {
        ITTKEventReport iTTKEventReportEventReport = TTKOrbu.INSTANCE.eventReport();
        if (iTTKEventReportEventReport == null || !iTTKEventReportEventReport.shouldReportPayload(channel, i, str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // com.orbu.core.api.ITTKOrbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void activeOrbu(com.orbu.core.adapter.TTKOrbuContext r12, java.lang.String r13, com.orbu.core.api.ITTKOrbusActiveCallback r14) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = r11.curState
            r0.set(r13)
            org.json.JSONObject r1 = r12.extraInfo
            java.lang.String r0 = "sandbox_rules_experiment_group"
            java.lang.String r0 = r1.optString(r0)
            r11.sandboxRulesExperimentGroup = r0
            int r0 = r12.nativeReportStrategy
            r11.nativeReportStrategy = r0
            java.lang.String r0 = r12.region
            r11.storeRegion = r0
            int r2 = r13.hashCode()
            r0 = -787383773(0xffffffffd1117a23, float:-3.905121E10)
            java.lang.String r1 = "DISABLE_SDK"
            if (r2 == r0) goto L71
            r0 = -389910462(0xffffffffe8c27042, float:-7.345679E24)
            if (r2 == r0) goto L66
            r0 = 2049448323(0x7a281983, float:2.1820583E35)
            if (r2 != r0) goto L7a
            java.lang.String r0 = "ENABLE"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L7a
            ttp.orbu.sdk.TTPOrbuSdk$OrbuState r2 = ttp.orbu.sdk.TTPOrbuSdk.OrbuState.ENABLE
        L36:
            ttp.orbu.sdk.TTPOrbuSdk$OrbuState r0 = ttp.orbu.sdk.TTPOrbuSdk.OrbuState.DISABLE
            if (r2 != r0) goto L64
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r13, r1)
            if (r0 != 0) goto L64
            r0 = 0
        L41:
            r11.enableIntercept = r0
            com.orbu.core.logger.SandboxActivationJournal r3 = new com.orbu.core.logger.SandboxActivationJournal
            long r4 = android.os.SystemClock.uptimeMillis()
            long r6 = android.os.SystemClock.uptimeMillis()
            r10 = 0
            r8 = 0
            r3.<init>(r4, r6, r8, r10)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r13, r1)
            if (r0 != 0) goto L7d
            r11.activateOrbuSdk(r2, r12, r14, r3)
            com.orbu.core.init.HardBlockConfigManager r1 = com.orbu.core.init.HardBlockConfigManager.INSTANCE
            java.lang.String r0 = r11.sandboxRulesExperimentGroup
            r1.setCurrentRuleGroup(r0)
            return
        L64:
            r0 = 1
            goto L41
        L66:
            java.lang.String r0 = "PRE_ACTIVE"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L7a
            ttp.orbu.sdk.TTPOrbuSdk$OrbuState r2 = ttp.orbu.sdk.TTPOrbuSdk.OrbuState.PRE_ACTIVE
            goto L36
        L71:
            boolean r0 = r13.equals(r1)
            if (r0 == 0) goto L7a
            ttp.orbu.sdk.TTPOrbuSdk$OrbuState r2 = ttp.orbu.sdk.TTPOrbuSdk.OrbuState.DISABLE
            goto L36
        L7a:
            ttp.orbu.sdk.TTPOrbuSdk$OrbuState r2 = ttp.orbu.sdk.TTPOrbuSdk.OrbuState.DISABLE
            goto L36
        L7d:
            r11.handleDisabledState(r14, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orbu.core.impl.TTPOrbuDelegate.activeOrbu(com.orbu.core.adapter.TTKOrbuContext, java.lang.String, com.orbu.core.api.ITTKOrbusActiveCallback):void");
    }

    public final void handleActivationResponse(TTPOrbuActiveResult tTPOrbuActiveResult, SandboxActivationJournal sandboxActivationJournal, ITTKOrbusActiveCallback iTTKOrbusActiveCallback) throws JSONException {
        String str;
        sandboxActivationJournal.setActivationCallback(SystemClock.uptimeMillis());
        SandboxBootLogger.INSTANCE.setLastActivationJournal(sandboxActivationJournal);
        int iIncrementAndGet = this.sandboxActiveCounter.incrementAndGet();
        sandboxActivationJournal.setActiveCount(iIncrementAndGet);
        AtomicReference<String> atomicReference = this.sdkInternalEnableState;
        if (tTPOrbuActiveResult.getShouldActive()) {
            str = "enable";
        } else {
            str = "disable";
        }
        atomicReference.set(str);
        logActivationResult(tTPOrbuActiveResult, sandboxActivationJournal, iIncrementAndGet);
        handleNativeNetResult(tTPOrbuActiveResult, iTTKOrbusActiveCallback);
        reportActivationEvent(tTPOrbuActiveResult, sandboxActivationJournal, iIncrementAndGet);
    }

    private final void activateOrbuSdk(TTPOrbuSdk.OrbuState orbuState, TTKOrbuContext tTKOrbuContext, final ITTKOrbusActiveCallback iTTKOrbusActiveCallback, final SandboxActivationJournal sandboxActivationJournal) {
        Object c098200Yq;
        try {
            TTPOrbuSdk.INSTANCE.activateOrbu(orbuState, new TTPOrbuContext(tTKOrbuContext.region, tTKOrbuContext.userId, tTKOrbuContext.deviceId, tTKOrbuContext.userAction, tTKOrbuContext.applicationContext, tTKOrbuContext.extraInfo), new TTPOrbusActiveCallback() { // from class: com.orbu.core.impl.TTPOrbuDelegate$activateOrbuSdk$1$1
                @Override // ttp.orbu.sdk.init.TTPOrbusActiveCallback
                public void response(TTPOrbuActiveResult tTPOrbuActiveResult) throws JSONException {
                    this.this$0.handleActivationResponse(tTPOrbuActiveResult, sandboxActivationJournal, iTTKOrbusActiveCallback);
                }
            }, null, null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            this.sdkInternalEnableState.set("disable");
            ITTKEventReport iTTKEventReportEventReport = TTKOrbu.INSTANCE.eventReport();
            if (iTTKEventReportEventReport != null) {
                iTTKEventReportEventReport.onError(thM5exceptionOrNullimpl);
            }
        }
    }

    private final void handlePreActiveState(ITTKOrbuRequest<?> iTTKOrbuRequest, String str, String str2, String str3) throws JSONException {
        ITTKEventReport iTTKEventReportEventReport = TTKOrbu.INSTANCE.eventReport();
        if (iTTKEventReportEventReport != null && !iTTKEventReportEventReport.hitSampleDrop("pns_sandbox_intercept")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_channel", iTTKOrbuRequest.channel().name());
            jSONObject.put("orbu_sdk_version", getOrbuSDKVersion());
            jSONObject.put("orbu_sdk_enable_state", this.curState);
            jSONObject.put("experiment_group", this.sandboxRulesExperimentGroup);
            jSONObject.put("rule_hash", getRuleHash());
            jSONObject.put("orbu_sdk_internal_enable_state", this.sdkInternalEnableState);
            jSONObject.put("intercept_cost_time", 0);
            jSONObject.put("intercept_result", 1);
            if (str == null) {
                str = "";
            }
            jSONObject.put("dataflow_id_source", str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PRE_ACTIVE#");
            sbLIZ.append(str2);
            jSONObject.put("dataflow_id", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PRE_ACTIVE#");
            sbLIZ2.append(str3);
            jSONObject.put("payload", C2188811AlT.LIZIZ(sbLIZ2));
            iTTKEventReportEventReport.onEvent("pns_sandbox_intercept", jSONObject);
        }
    }

    private final void reportInterceptEvent(ITTKOrbuRequest<?> iTTKOrbuRequest, TTKResponse tTKResponse, String str, String str2, String str3, long j, long j2, long j3, boolean z) throws JSONException {
        int i;
        String str4;
        ITTKEventReport iTTKEventReportEventReport = TTKOrbu.INSTANCE.eventReport();
        if (iTTKEventReportEventReport != null && !iTTKEventReportEventReport.hitSampleDrop("pns_sandbox_intercept")) {
            MobUtils mobUtils = MobUtils.INSTANCE;
            long curMillis = mobUtils.getCurMillis() - j;
            int i2 = !TTKResponseKt.isBlock(tTKResponse) ? 1 : 0;
            if (tTKResponse != null) {
                i = 1;
            } else {
                i = 0;
            }
            if (HardBlockConfigManager.INSTANCE.isChannelNeedHardBlock(iTTKOrbuRequest.channel())) {
                str4 = "hard";
            } else {
                str4 = "soft";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_channel", iTTKOrbuRequest.channel().name());
            jSONObject.put("orbu_sdk_version", getOrbuSDKVersion());
            jSONObject.put("orbu_sdk_enable_state", this.curState);
            jSONObject.put("orbu_sdk_internal_enable_state", this.sdkInternalEnableState);
            jSONObject.put("intercept_cost_time", curMillis);
            jSONObject.put("intercept_result", i2);
            if (str == null) {
                str = "";
            }
            jSONObject.put("dataflow_id_source", str);
            jSONObject.put("dataflow_id", str2);
            jSONObject.put("intercept_result_exist", i);
            jSONObject.put("intercept_result_status_code", TTKResponseKt.getStatusCode(tTKResponse));
            jSONObject.put("intercept_result_reason", TTKResponseKt.getDescription(tTKResponse));
            jSONObject.put("experiment_group", this.sandboxRulesExperimentGroup);
            jSONObject.put("rule_hash", getRuleHash());
            jSONObject.put("block_mode", str4);
            boolean zIsTransitionDFID = TTKOrbuConstants.INSTANCE.isTransitionDFID(iTTKOrbuRequest.metadata().get("x-tt-dataflow-id"));
            int statusCode = TTKResponseKt.getStatusCode(tTKResponse);
            if (statusCode != 0 || z || zIsTransitionDFID || iTTKEventReportEventReport.shouldReportPayload(iTTKOrbuRequest.channel(), statusCode, str2)) {
                jSONObject.put("payload", str3);
            }
            if (iTTKOrbuRequest instanceof TTKNetworkRequest) {
                jSONObject.put("domain_type", ((TTKNetworkRequest) iTTKOrbuRequest).getDomainType());
            }
            long curMillis2 = mobUtils.getCurMillis() - j2;
            long curThreadMillis = mobUtils.getCurThreadMillis() - j3;
            jSONObject.put("wrapper_cost_time", curMillis2);
            jSONObject.put("wrapper_cost_thread_time", curThreadMillis);
            iTTKEventReportEventReport.onEvent("pns_sandbox_intercept", jSONObject);
        }
    }
}
