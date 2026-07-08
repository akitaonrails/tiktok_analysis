package com.bytedance.sdk.xbridge.runtime.depend;

import X.C1064320dnq;
import X.EnumC1063300dmC;
import X.InterfaceC1064360dnu;
import X.InterfaceC634840OvC;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes17.dex */
public interface IHostLogDepend {
    void handleReportADLog(InterfaceC634840OvC interfaceC634840OvC, String str, C1064320dnq c1064320dnq, InterfaceC1064360dnu interfaceC1064360dnu, EnumC1063300dmC enumC1063300dmC);

    void onEventV3Map(InterfaceC634840OvC interfaceC634840OvC, String str, Map<String, String> map, boolean z);

    void putCommonParams(Map<String, String> map, boolean z);

    Unit reportJSBFetchError(InterfaceC634840OvC interfaceC634840OvC, Map<String, ? extends Object> map);
}
