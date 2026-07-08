package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ShutdownConfig {

    @C09CT("auto_replace_http")
    public final boolean autoReplaceHttp;

    @C09CT("control_webview_with_no_url")
    public final boolean controlWebviewWithNoUrl;

    @C09CT("cpp_fuse_upload_sample_rate")
    public final double cppFuseUploadSampleRate;

    @C09CT("enable_domain_cache")
    public final boolean enableDomainCache;

    @C09CT("fuse_configs")
    public final List<FuseConfig> fuseConfigs;

    @C09CT("fuse_upload_sample_rate")
    public final double fuseUploadSampleRate;

    @C09CT("hybrid_allow_list_action")
    public final String hybridAllowListAction;

    @C09CT("modify_configs")
    public final List<ModifyConfig> modifyConfigs;

    @C09CT("modify_upload_sample_rate")
    public final double modifyUploadSampleRate;

    @C09CT("native_allow_list_action")
    public final String nativeAllowListAction;

    @C09CT("one_party_domains")
    public final Set<String> onePartyDomains;

    @C09CT("regression_domains")
    public final Set<String> regressionDomains;

    @C09CT("report_stack")
    public final boolean reportStack;

    @C09CT("third_party_domains")
    public final Set<String> thirdPartyDomains;

    @C09CT("url_replace")
    public final boolean urlReplace;

    public ShutdownConfig() {
        this(0.0d, 0.0d, 0.0d, null, null, null, null, null, null, null, false, false, false, false, false, 32767, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShutdownConfig)) {
            return false;
        }
        ShutdownConfig shutdownConfig = (ShutdownConfig) obj;
        return Double.compare(this.fuseUploadSampleRate, shutdownConfig.fuseUploadSampleRate) == 0 && Double.compare(this.cppFuseUploadSampleRate, shutdownConfig.cppFuseUploadSampleRate) == 0 && Double.compare(this.modifyUploadSampleRate, shutdownConfig.modifyUploadSampleRate) == 0 && Intrinsics.LJFF(this.fuseConfigs, shutdownConfig.fuseConfigs) && Intrinsics.LJFF(this.modifyConfigs, shutdownConfig.modifyConfigs) && Intrinsics.LJFF(this.nativeAllowListAction, shutdownConfig.nativeAllowListAction) && Intrinsics.LJFF(this.hybridAllowListAction, shutdownConfig.hybridAllowListAction) && Intrinsics.LJFF(this.onePartyDomains, shutdownConfig.onePartyDomains) && Intrinsics.LJFF(this.thirdPartyDomains, shutdownConfig.thirdPartyDomains) && Intrinsics.LJFF(this.regressionDomains, shutdownConfig.regressionDomains) && this.autoReplaceHttp == shutdownConfig.autoReplaceHttp && this.enableDomainCache == shutdownConfig.enableDomainCache && this.urlReplace == shutdownConfig.urlReplace && this.reportStack == shutdownConfig.reportStack && this.controlWebviewWithNoUrl == shutdownConfig.controlWebviewWithNoUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final int hashCode() {
        int iX2 = ((((((((((((((((((C786410Ut5.X2(this.fuseUploadSampleRate) * 31) + C786410Ut5.X2(this.cppFuseUploadSampleRate)) * 31) + C786410Ut5.X2(this.modifyUploadSampleRate)) * 31) + this.fuseConfigs.hashCode()) * 31) + this.modifyConfigs.hashCode()) * 31) + this.nativeAllowListAction.hashCode()) * 31) + this.hybridAllowListAction.hashCode()) * 31) + this.onePartyDomains.hashCode()) * 31) + this.thirdPartyDomains.hashCode()) * 31) + this.regressionDomains.hashCode()) * 31;
        boolean z = this.autoReplaceHttp;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iX2 + r0) * 31;
        boolean z2 = this.enableDomainCache;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (i + r02) * 31;
        boolean z3 = this.urlReplace;
        ?? r03 = z3;
        if (z3) {
            r03 = 1;
        }
        int i3 = (i2 + r03) * 31;
        boolean z4 = this.reportStack;
        ?? r04 = z4;
        if (z4) {
            r04 = 1;
        }
        return ((i3 + r04) * 31) + (this.controlWebviewWithNoUrl ? 1 : 0);
    }

    public final String toString() {
        return "ShutdownConfig(fuseUploadSampleRate=" + this.fuseUploadSampleRate + ", cppFuseUploadSampleRate=" + this.cppFuseUploadSampleRate + ", modifyUploadSampleRate=" + this.modifyUploadSampleRate + ", fuseConfigs=" + this.fuseConfigs + ", modifyConfigs=" + this.modifyConfigs + ", nativeAllowListAction=" + this.nativeAllowListAction + ", hybridAllowListAction=" + this.hybridAllowListAction + ", onePartyDomains=" + this.onePartyDomains + ", thirdPartyDomains=" + this.thirdPartyDomains + ", regressionDomains=" + this.regressionDomains + ", autoReplaceHttp=" + this.autoReplaceHttp + ", enableDomainCache=" + this.enableDomainCache + ", urlReplace=" + this.urlReplace + ", reportStack=" + this.reportStack + ", controlWebviewWithNoUrl=" + this.controlWebviewWithNoUrl + ')';
    }

    public ShutdownConfig(double d, double d2, double d3, List<FuseConfig> list, List<ModifyConfig> list2, String str, String str2, Set<String> set, Set<String> set2, Set<String> set3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.fuseUploadSampleRate = d;
        this.cppFuseUploadSampleRate = d2;
        this.modifyUploadSampleRate = d3;
        this.fuseConfigs = list;
        this.modifyConfigs = list2;
        this.nativeAllowListAction = str;
        this.hybridAllowListAction = str2;
        this.onePartyDomains = set;
        this.thirdPartyDomains = set2;
        this.regressionDomains = set3;
        this.autoReplaceHttp = z;
        this.enableDomainCache = z2;
        this.urlReplace = z3;
        this.reportStack = z4;
        this.controlWebviewWithNoUrl = z5;
    }

    public ShutdownConfig(double d, double d2, double d3, List list, List list2, String str, String str2, Set set, Set set2, Set set3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.25d : d, (i & 2) == 0 ? d2 : 0.25d, (i & 4) != 0 ? 1.0d : d3, (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? C13BV.INSTANCE : list2, (i & 32) != 0 ? "unable" : str, (i & 64) == 0 ? str2 : "unable", (i & 128) != 0 ? new LinkedHashSet() : set, (i & 256) != 0 ? new LinkedHashSet() : set2, (i & 512) != 0 ? new LinkedHashSet() : set3, (i & 1024) != 0 ? true : z, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? true : z3, (i & 8192) != 0 ? false : z4, (i & 16384) == 0 ? z5 : false);
    }
}
