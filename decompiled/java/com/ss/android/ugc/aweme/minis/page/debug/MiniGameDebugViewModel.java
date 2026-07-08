package com.ss.android.ugc.aweme.minis.page.debug;

import X.C1227904rF;
import X.C1395840mQY;
import X.C2187451AjH;
import X.C2188811AlT;
import X.EnumC2192711Arl;
import X.InterfaceC1386440mBO;
import android.app.Application;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisDebug;
import com.ss.android.ugc.aweme.minis.model.DebugResult;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class MiniGameDebugViewModel extends MinisViewModel {
    public MiniGameDebugViewModel(Application application) {
        super(application);
    }

    @Override // com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel
    public final void vQ2(SchemaParserData schemaParserData, InterfaceC1386440mBO interfaceC1386440mBO, LinkedHashMap<String, String> linkedHashMap, Function1<? super NetworkResponse<MinisMetaResp>, Unit> function1) {
        TiktokMinisDebug tiktokMinisDebug;
        EnumC2192711Arl enumC2192711Arl;
        String str;
        int i = C2187451AjH.LIZ;
        NetworkResponse<MinisMetaResp> networkResponseLIZIZ = C1395840mQY.LIZIZ(schemaParserData, 0);
        if (schemaParserData != null) {
            tiktokMinisDebug = schemaParserData.debugInfo;
        } else {
            tiktokMinisDebug = null;
        }
        DebugResult debugResult = new DebugResult(tiktokMinisDebug, -1, null);
        NetworkResponse<MinisMetaResp> networkResponse = new NetworkResponse<>(null, -1, false, debugResult, false, null, null);
        if (schemaParserData != null) {
            enumC2192711Arl = schemaParserData.minisStage;
        } else {
            enumC2192711Arl = null;
        }
        if (enumC2192711Arl != EnumC2192711Arl.MINIS_STAGE_DEBUG) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchLocalMinisDebugConfig, not debug, stage:");
            sbLIZ.append(enumC2192711Arl);
            C2188811AlT.LIZIZ(sbLIZ);
            AQ2(networkResponse);
            return;
        }
        TiktokMinisDebug tiktokMinisDebug2 = schemaParserData.debugInfo;
        if (tiktokMinisDebug2 != null && (str = tiktokMinisDebug2.localUrl) != null && str.length() != 0) {
            boolean zLIZ = C1395840mQY.LIZ(str);
            if (!zLIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fetchLocalMinisDebugConfig, isLocalIP:");
                sbLIZ2.append(zLIZ);
                sbLIZ2.append(", debugInfo:");
                sbLIZ2.append(schemaParserData.debugInfo);
                C2188811AlT.LIZIZ(sbLIZ2);
                AQ2(networkResponse);
                return;
            }
            MinisMetaResp minisMetaResp = networkResponseLIZIZ.data;
            if (minisMetaResp != null) {
                minisMetaResp.minisUrl = str;
            }
            debugResult.debugErrorCode = 0;
            debugResult.debugErrorReason = null;
            networkResponseLIZIZ.debugResult = debugResult;
            AQ2(networkResponseLIZIZ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchLocalMinisDebugConfig, setMinisData, response:");
            C1227904rF.LIZ.getClass();
            sbLIZ3.append(C1227904rF.LJI(networkResponseLIZIZ));
            C2188811AlT.LIZIZ(sbLIZ3);
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("fetchLocalMinisDebugConfig, localMinisSiteUrl invalid, debugInfo:");
        sbLIZ4.append(schemaParserData.debugInfo);
        C2188811AlT.LIZIZ(sbLIZ4);
        AQ2(networkResponse);
    }
}
