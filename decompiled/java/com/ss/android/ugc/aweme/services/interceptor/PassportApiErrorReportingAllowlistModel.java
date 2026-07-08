package com.ss.android.ugc.aweme.services.interceptor;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class PassportApiErrorReportingAllowlistModel {
    public static final int $stable = 8;

    @C09CT("error_code_allowlist")
    public final List<String> allowedErrorList;

    public PassportApiErrorReportingAllowlistModel() {
        this(C1697810uHb.LJIIJJI("-3005", "-1005", "1", "4", "6", "7", "10", "1009", "1011", "1033", "1091", "1202", "1203", "1349", "1364", "1450", "1466", "2035", "56004"));
    }

    public PassportApiErrorReportingAllowlistModel(List<String> list) {
        this.allowedErrorList = list;
    }
}
