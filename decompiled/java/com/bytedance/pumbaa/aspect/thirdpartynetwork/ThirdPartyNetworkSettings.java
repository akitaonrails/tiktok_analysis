package com.bytedance.pumbaa.aspect.thirdpartynetwork;

import X.C09CT;
import X.C786410Ut5;
import X.C826270WbB;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ThirdPartyNetworkSettings {
    public static final ThirdPartyNetworkConfig LIZ = new ThirdPartyNetworkConfig(false, 0.0d, 0.0d, 0.0d, null, false, false, false, false, false, false, false, false, false, false, 32767, null);

    public static final class ThirdPartyNetworkConfig {

        @C09CT("allowed_schemes")
        public final List<String> allowedSchemes;

        @C09CT("backtrace_sample_rate")
        public final double backtraceSampleRate;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_okhttp_call_server_intercept")
        public final boolean enableOkhttpCallServerIntercept;

        @C09CT("enable_okhttp_realcall_enqueue")
        public final boolean enableOkhttpRealCallEnqueue;

        @C09CT("enable_okhttp_realcall_execute")
        public final boolean enableOkhttpRealCallExecute;

        @C09CT("enable_okhttp_request_builder_build")
        public final boolean enableOkhttpRequestBuilderBuild;

        @C09CT("enable_retrofit_request_builder_build")
        public final boolean enableRetrofitRequestBuilderBuild;

        @C09CT("enable_ss_cronet_new_ss_call")
        public final boolean enableSsCronetNewSsCall;

        @C09CT("enable_sshttpcall_enqueue")
        public final boolean enableSsHttpCallEnqueue;

        @C09CT("enable_sshttpcall_execute")
        public final boolean enableSsHttpCallExecute;

        @C09CT("enable_ttnet_request_interceptor")
        public final boolean enableTTNetRequestInterceptor;

        @C09CT("enable_urlconnection_on_connect")
        public final boolean enableUrlConnectionOnConnect;

        @C09CT("monitor_sample_rate")
        public final double monitorSampleRate;

        @C09CT("page_stack_sample_rate")
        public final double pageStackSampleRate;

        public ThirdPartyNetworkConfig() {
            this(false, 0.0d, 0.0d, 0.0d, null, false, false, false, false, false, false, false, false, false, false, 32767, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThirdPartyNetworkConfig)) {
                return false;
            }
            ThirdPartyNetworkConfig thirdPartyNetworkConfig = (ThirdPartyNetworkConfig) obj;
            return this.enable == thirdPartyNetworkConfig.enable && Double.compare(this.monitorSampleRate, thirdPartyNetworkConfig.monitorSampleRate) == 0 && Double.compare(this.backtraceSampleRate, thirdPartyNetworkConfig.backtraceSampleRate) == 0 && Double.compare(this.pageStackSampleRate, thirdPartyNetworkConfig.pageStackSampleRate) == 0 && Intrinsics.LJFF(this.allowedSchemes, thirdPartyNetworkConfig.allowedSchemes) && this.enableTTNetRequestInterceptor == thirdPartyNetworkConfig.enableTTNetRequestInterceptor && this.enableSsHttpCallExecute == thirdPartyNetworkConfig.enableSsHttpCallExecute && this.enableSsHttpCallEnqueue == thirdPartyNetworkConfig.enableSsHttpCallEnqueue && this.enableRetrofitRequestBuilderBuild == thirdPartyNetworkConfig.enableRetrofitRequestBuilderBuild && this.enableSsCronetNewSsCall == thirdPartyNetworkConfig.enableSsCronetNewSsCall && this.enableUrlConnectionOnConnect == thirdPartyNetworkConfig.enableUrlConnectionOnConnect && this.enableOkhttpCallServerIntercept == thirdPartyNetworkConfig.enableOkhttpCallServerIntercept && this.enableOkhttpRequestBuilderBuild == thirdPartyNetworkConfig.enableOkhttpRequestBuilderBuild && this.enableOkhttpRealCallExecute == thirdPartyNetworkConfig.enableOkhttpRealCallExecute && this.enableOkhttpRealCallEnqueue == thirdPartyNetworkConfig.enableOkhttpRealCallEnqueue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
        /* JADX WARN: Type inference failed for: r0v13, types: [int] */
        /* JADX WARN: Type inference failed for: r0v15, types: [int] */
        /* JADX WARN: Type inference failed for: r0v17, types: [int] */
        /* JADX WARN: Type inference failed for: r0v19, types: [int] */
        /* JADX WARN: Type inference failed for: r0v21, types: [int] */
        /* JADX WARN: Type inference failed for: r0v23, types: [int] */
        /* JADX WARN: Type inference failed for: r0v25, types: [int] */
        /* JADX WARN: Type inference failed for: r0v27, types: [int] */
        /* JADX WARN: Type inference failed for: r0v29 */
        /* JADX WARN: Type inference failed for: r0v30 */
        /* JADX WARN: Type inference failed for: r0v31 */
        /* JADX WARN: Type inference failed for: r0v32 */
        /* JADX WARN: Type inference failed for: r0v33 */
        /* JADX WARN: Type inference failed for: r0v34 */
        /* JADX WARN: Type inference failed for: r0v35 */
        /* JADX WARN: Type inference failed for: r0v36 */
        /* JADX WARN: Type inference failed for: r0v37 */
        /* JADX WARN: Type inference failed for: r0v38 */
        /* JADX WARN: Type inference failed for: r0v39 */
        /* JADX WARN: Type inference failed for: r0v40 */
        /* JADX WARN: Type inference failed for: r0v41 */
        /* JADX WARN: Type inference failed for: r0v42 */
        /* JADX WARN: Type inference failed for: r0v43 */
        /* JADX WARN: Type inference failed for: r0v44 */
        /* JADX WARN: Type inference failed for: r0v45 */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v47 */
        /* JADX WARN: Type inference failed for: r0v48 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int iX2 = ((((((((r0 * 31) + C786410Ut5.X2(this.monitorSampleRate)) * 31) + C786410Ut5.X2(this.backtraceSampleRate)) * 31) + C786410Ut5.X2(this.pageStackSampleRate)) * 31) + this.allowedSchemes.hashCode()) * 31;
            boolean z2 = this.enableTTNetRequestInterceptor;
            ?? r02 = z2;
            if (z2) {
                r02 = 1;
            }
            int i = (iX2 + r02) * 31;
            boolean z3 = this.enableSsHttpCallExecute;
            ?? r03 = z3;
            if (z3) {
                r03 = 1;
            }
            int i2 = (i + r03) * 31;
            boolean z4 = this.enableSsHttpCallEnqueue;
            ?? r04 = z4;
            if (z4) {
                r04 = 1;
            }
            int i3 = (i2 + r04) * 31;
            boolean z5 = this.enableRetrofitRequestBuilderBuild;
            ?? r05 = z5;
            if (z5) {
                r05 = 1;
            }
            int i4 = (i3 + r05) * 31;
            boolean z6 = this.enableSsCronetNewSsCall;
            ?? r06 = z6;
            if (z6) {
                r06 = 1;
            }
            int i5 = (i4 + r06) * 31;
            boolean z7 = this.enableUrlConnectionOnConnect;
            ?? r07 = z7;
            if (z7) {
                r07 = 1;
            }
            int i6 = (i5 + r07) * 31;
            boolean z8 = this.enableOkhttpCallServerIntercept;
            ?? r08 = z8;
            if (z8) {
                r08 = 1;
            }
            int i7 = (i6 + r08) * 31;
            boolean z9 = this.enableOkhttpRequestBuilderBuild;
            ?? r09 = z9;
            if (z9) {
                r09 = 1;
            }
            int i8 = (i7 + r09) * 31;
            boolean z10 = this.enableOkhttpRealCallExecute;
            ?? r010 = z10;
            if (z10) {
                r010 = 1;
            }
            return ((i8 + r010) * 31) + (this.enableOkhttpRealCallEnqueue ? 1 : 0);
        }

        public final String toString() {
            return "ThirdPartyNetworkConfig(enable=" + this.enable + ", monitorSampleRate=" + this.monitorSampleRate + ", backtraceSampleRate=" + this.backtraceSampleRate + ", pageStackSampleRate=" + this.pageStackSampleRate + ", allowedSchemes=" + this.allowedSchemes + ", enableTTNetRequestInterceptor=" + this.enableTTNetRequestInterceptor + ", enableSsHttpCallExecute=" + this.enableSsHttpCallExecute + ", enableSsHttpCallEnqueue=" + this.enableSsHttpCallEnqueue + ", enableRetrofitRequestBuilderBuild=" + this.enableRetrofitRequestBuilderBuild + ", enableSsCronetNewSsCall=" + this.enableSsCronetNewSsCall + ", enableUrlConnectionOnConnect=" + this.enableUrlConnectionOnConnect + ", enableOkhttpCallServerIntercept=" + this.enableOkhttpCallServerIntercept + ", enableOkhttpRequestBuilderBuild=" + this.enableOkhttpRequestBuilderBuild + ", enableOkhttpRealCallExecute=" + this.enableOkhttpRealCallExecute + ", enableOkhttpRealCallEnqueue=" + this.enableOkhttpRealCallEnqueue + ')';
        }

        public ThirdPartyNetworkConfig(boolean z, double d, double d2, double d3, List<String> list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
            this.enable = z;
            this.monitorSampleRate = d;
            this.backtraceSampleRate = d2;
            this.pageStackSampleRate = d3;
            this.allowedSchemes = list;
            this.enableTTNetRequestInterceptor = z2;
            this.enableSsHttpCallExecute = z3;
            this.enableSsHttpCallEnqueue = z4;
            this.enableRetrofitRequestBuilderBuild = z5;
            this.enableSsCronetNewSsCall = z6;
            this.enableUrlConnectionOnConnect = z7;
            this.enableOkhttpCallServerIntercept = z8;
            this.enableOkhttpRequestBuilderBuild = z9;
            this.enableOkhttpRealCallExecute = z10;
            this.enableOkhttpRealCallEnqueue = z11;
        }

        public ThirdPartyNetworkConfig(boolean z, double d, double d2, double d3, List list, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) == 0 ? d3 : 0.0d, (i & 16) != 0 ? C826270WbB.LIZ : list, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? false : z6, (i & 1024) != 0 ? false : z7, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z8, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z9, (i & 8192) != 0 ? false : z10, (i & 16384) != 0 ? false : z11);
        }
    }
}
