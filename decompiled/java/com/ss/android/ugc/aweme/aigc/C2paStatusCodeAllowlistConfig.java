package com.ss.android.ugc.aweme.aigc;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class C2paStatusCodeAllowlistConfig {

    @C09CT("aigc_digital_source_type_list")
    public final List<String> aigcDigitalSourceTypeList;

    @C09CT("fatal_error")
    public final List<String> bypassFatalError;

    @C09CT("remote_cert_host")
    public final String remoteCertHost;

    @C09CT("remote_cert_path")
    public final String remoteCertPath;

    @C09CT("remote_sign_path")
    public final String remoteSignPath;

    @C09CT("validation_status_success")
    public final List<String> successValidationStatus;

    @C09CT("tsa_host")
    public final String tsaHost;

    @C09CT("write_timeout")
    public final long writeTimeOut;

    public C2paStatusCodeAllowlistConfig() {
        this(null, null, null, null, null, null, null, 0L, 255, null);
    }

    public C2paStatusCodeAllowlistConfig(List<String> list, List<String> list2, List<String> list3, String str, String str2, String str3, String str4, long j) {
        this.bypassFatalError = list;
        this.successValidationStatus = list2;
        this.aigcDigitalSourceTypeList = list3;
        this.remoteCertHost = str;
        this.remoteCertPath = str2;
        this.tsaHost = str3;
        this.remoteSignPath = str4;
        this.writeTimeOut = j;
    }

    public C2paStatusCodeAllowlistConfig(List list, List list2, List list3, String str, String str2, String str3, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? "c2pa-cloud-server.tiktokv.com" : str, (i & 16) != 0 ? "/device/cert" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "/c2pa/sign" : str4, (i & 128) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j);
    }
}
