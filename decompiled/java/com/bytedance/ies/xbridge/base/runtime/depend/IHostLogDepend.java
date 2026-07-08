package com.bytedance.ies.xbridge.base.runtime.depend;

import X.C1059860dge;
import X.C1064330dnr;
import X.C1064350dnt;
import X.EnumC1059790dgX;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public interface IHostLogDepend {
    Unit customReportJSBInfo(C1064350dnt c1064350dnt);

    void handleReportADLog(C1059860dge c1059860dge, String str, C1064330dnr c1064330dnr, IReportADLogResultCallback iReportADLogResultCallback, EnumC1059790dgX enumC1059790dgX);

    void onEventV3Map(C1059860dge c1059860dge, String str, Map<String, String> map);

    void putCommonParams(Map<String, String> map, boolean z);

    Unit reportJSBError(C1059860dge c1059860dge, Map<String, ? extends Object> map);

    Unit reportJSBFetchError(C1059860dge c1059860dge, Map<String, ? extends Object> map);
}
