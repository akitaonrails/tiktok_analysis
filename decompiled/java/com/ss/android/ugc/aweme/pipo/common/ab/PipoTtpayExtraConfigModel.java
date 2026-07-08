package com.ss.android.ugc.aweme.pipo.common.ab;

import X.C09CT;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoTtpayExtraConfigModel {

    @C09CT("landing_img")
    public final Map<String, List<String>> landingImg;

    @C09CT("landing_lottie")
    public final Map<String, List<String>> landingLottie;

    @C09CT("os_check")
    public final PipoTtpayOsCheckModel osCheck;

    public PipoTtpayExtraConfigModel() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PipoTtpayExtraConfigModel(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, PipoTtpayOsCheckModel pipoTtpayOsCheckModel) {
        this.landingLottie = map;
        this.landingImg = map2;
        this.osCheck = pipoTtpayOsCheckModel;
    }
}
