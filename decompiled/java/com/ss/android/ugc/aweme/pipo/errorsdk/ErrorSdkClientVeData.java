package com.ss.android.ugc.aweme.pipo.errorsdk;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ErrorSdkClientVeData {

    @C09CT("se_oe")
    public final Map<String, String> mappingSeOe;

    @C09CT("ve_infos")
    public final Map<String, List<ErrorActionResponse>> veInfos;

    @C09CT("version")
    public final String version;

    public ErrorSdkClientVeData() {
        this(null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorSdkClientVeData(String str, Map<String, String> map, Map<String, ? extends List<ErrorActionResponse>> map2) {
        this.version = str;
        this.mappingSeOe = map;
        this.veInfos = map2;
    }
}
