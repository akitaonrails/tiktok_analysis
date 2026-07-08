package com.ss.android.ugc.aweme.minis.page.debug;

import X.C11S5;
import X.C1395840mQY;
import X.C1701940uOG;
import X.C2187451AjH;
import X.C786410Ut5;
import X.InterfaceC1386440mBO;
import X.InterfaceC19474811He;
import Y.ARunnableS90S0200000_21;
import android.app.Application;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisDebug;
import com.ss.android.ugc.aweme.minis.model.DebugResult;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.page.debug.MinisDebugViewModel;
import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisDebugViewModel extends MinisViewModel {
    public MinisDebugViewModel(Application application) {
        super(application);
    }

    @Override // com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel
    public final void vQ2(final SchemaParserData schemaParserData, InterfaceC1386440mBO interfaceC1386440mBO, LinkedHashMap<String, String> linkedHashMap, Function1<? super NetworkResponse<MinisMetaResp>, Unit> function1) {
        TiktokMinisDebug tiktokMinisDebug;
        String str;
        String str2;
        int i = C2187451AjH.LIZ;
        MinisConfigSettings.Debug debug = MinisConfigSettings.LIZ().debug;
        if (debug != null && debug.fetchMetaWithDebugMetaUpdateJsb) {
            NetworkResponse<MinisMetaResp> networkResponseLIZIZ = C1395840mQY.LIZIZ(schemaParserData, -1);
            if (schemaParserData != null && (tiktokMinisDebug = schemaParserData.debugInfo) != null && (str = tiktokMinisDebug.localUrl) != null && str.length() != 0) {
                TiktokMinisDebug tiktokMinisDebug2 = schemaParserData.debugInfo;
                if (tiktokMinisDebug2 != null) {
                    str2 = tiktokMinisDebug2.localUrl;
                } else {
                    str2 = null;
                }
                if (C1395840mQY.LIZ(str2)) {
                    C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS90S0200000_21(schemaParserData, this, 16));
                    return;
                } else {
                    AQ2(networkResponseLIZIZ);
                    return;
                }
            }
            AQ2(networkResponseLIZIZ);
            return;
        }
        this.LL.LJ(schemaParserData, linkedHashMap).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<NetworkResponse<MinisMetaResp>>() { // from class: X.0mQV
            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchMetaData, onError:");
                sbLIZ.append(th);
                C2188811AlT.LIZIZ(sbLIZ);
                this.LL.AQ2(new NetworkResponse<>(null, -1, false, null, false, null, null));
            }

            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                int i2 = C2187451AjH.LIZ;
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(NetworkResponse<MinisMetaResp> networkResponse) {
                TiktokMinisDebug tiktokMinisDebug3;
                EnumC2192711Arl enumC2192711Arl;
                String str3;
                NetworkResponse<MinisMetaResp> networkResponse2 = networkResponse;
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchMetaData, onSuccess, data:");
                sbLIZ.append(networkResponse2.data);
                sbLIZ.append(", dataSourceFromDiskCache:");
                sbLIZ.append(networkResponse2.dataSourceFromDiskCache);
                C2188811AlT.LIZIZ(sbLIZ);
                MinisDebugViewModel minisDebugViewModel = this.LL;
                SchemaParserData schemaParserData2 = schemaParserData;
                minisDebugViewModel.getClass();
                if (schemaParserData2 != null) {
                    tiktokMinisDebug3 = schemaParserData2.debugInfo;
                } else {
                    tiktokMinisDebug3 = null;
                }
                DebugResult debugResult = new DebugResult(tiktokMinisDebug3, -1, null);
                NetworkResponse<MinisMetaResp> networkResponse3 = new NetworkResponse<>(null, -1, false, debugResult, false, null, null);
                if (schemaParserData2 != null) {
                    enumC2192711Arl = schemaParserData2.minisStage;
                } else {
                    enumC2192711Arl = null;
                }
                if (enumC2192711Arl != EnumC2192711Arl.MINIS_STAGE_DEBUG) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fetchLocalMinisDebugConfig, not debug, stage:");
                    sbLIZ2.append(enumC2192711Arl);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    minisDebugViewModel.AQ2(networkResponse3);
                    return;
                }
                TiktokMinisDebug tiktokMinisDebug4 = schemaParserData2.debugInfo;
                if (tiktokMinisDebug4 != null && (str3 = tiktokMinisDebug4.localUrl) != null && str3.length() != 0) {
                    MinisMetaResp minisMetaResp = networkResponse2.data;
                    if (minisMetaResp != null) {
                        minisMetaResp.minisUrl = str3;
                    }
                    debugResult.debugErrorCode = 0;
                    debugResult.debugErrorReason = null;
                    networkResponse2.debugResult = debugResult;
                    minisDebugViewModel.AQ2(networkResponse2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("fetchLocalMinisDebugConfig, setMinisData, response:");
                    C1227904rF.LIZ.getClass();
                    sbLIZ3.append(C1227904rF.LJI(networkResponse2));
                    C2188811AlT.LIZIZ(sbLIZ3);
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("fetchLocalMinisDebugConfig, localMinisSiteUrl invalid, debugInfo:");
                sbLIZ4.append(schemaParserData2.debugInfo);
                C2188811AlT.LIZIZ(sbLIZ4);
                minisDebugViewModel.AQ2(networkResponse3);
            }
        });
    }
}
