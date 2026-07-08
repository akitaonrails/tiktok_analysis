package com.ss.android.ugc.aweme.localservice.live.service;

import X.C098200Yq;
import X.C189200o6;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.live.ILSLivePrepareService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class LSLivePrepareService implements ILSLivePrepareService {
    @Override // com.ss.android.ugc.aweme.localservice.live.ILSLivePrepareService
    public final EnterRoomConfig LIZ(EnterRoomConfig enterRoomConfig, String str) {
        Object c098200Yq;
        int i;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (enterRoomConfig != null) {
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                    if (roomsData != null) {
                        if (Intrinsics.LJFF(jSONObject.optString("ttls_bag_auto_route"), "1")) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        roomsData.ttlsAutoOpenBag = i;
                    }
                    EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                    if (roomsData2 != null) {
                        String strOptString = jSONObject.optString("ttls_anchor_product_id");
                        if (strOptString == null) {
                            strOptString = "";
                        }
                        roomsData2.ttlsBagAutoAnchorProductId = strOptString;
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        return enterRoomConfig;
    }
}
