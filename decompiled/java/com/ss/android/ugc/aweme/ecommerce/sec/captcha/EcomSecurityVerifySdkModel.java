package com.ss.android.ugc.aweme.ecommerce.sec.captcha;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class EcomSecurityVerifySdkModel {

    @C09CT("delay_backup_duration")
    public final int delayBackupDuration;

    @C09CT("enable_oec_sdk")
    public final int enableOecSdk;

    @C09CT("event_matchers")
    public final List<EcomSecurityEventMatchersModel> eventMatchers;

    @C09CT("sampling_rates_of_keys")
    public final Map<String, Double> samplingRates;

    public EcomSecurityVerifySdkModel() {
        this(0, 0, null, null, 15, null);
    }

    public EcomSecurityVerifySdkModel(int i, int i2, List<EcomSecurityEventMatchersModel> list, Map<String, Double> map) {
        this.delayBackupDuration = i;
        this.enableOecSdk = i2;
        this.eventMatchers = list;
        this.samplingRates = map;
    }

    public EcomSecurityVerifySdkModel(int i, int i2, List list, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? C2097608Jq.LJ() : map);
    }
}
