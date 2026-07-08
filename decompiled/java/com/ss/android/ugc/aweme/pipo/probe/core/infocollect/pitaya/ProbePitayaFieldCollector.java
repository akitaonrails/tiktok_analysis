package com.ss.android.ugc.aweme.pipo.probe.core.infocollect.pitaya;

import X.AnonymousClass0678;
import X.C01GW;
import X.C098200Yq;
import X.C189200o6;
import X.C202152147y;
import X.C2097608Jq;
import X.C2197108jB;
import X.C452501pT;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IFeatureSchema;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.probe.ab.PipoProbeSdkConfigSettings;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class ProbePitayaFieldCollector {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(160));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(322));

    public static void LIZIZ(final String str) {
        C01GW c01gw = LIZIZ;
        if (((IPitayaCore) c01gw.getValue()).isReady()) {
            AnonymousClass0678.LIZ("pitaya_init", C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "already_prepared")));
            ((IPitayaCore) c01gw.getValue()).queryPackage(str, new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.pipo.probe.core.infocollect.pitaya.ProbePitayaFieldCollector$prepare$1
                @Override // com.bytedance.pitaya.api.PTYPackageCallback
                public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                    String summary;
                    if (!z) {
                        Pair[] pairArr = new Pair[2];
                        pairArr[0] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "ready_to_download");
                        if (pTYError == null || (summary = pTYError.getSummary()) == null) {
                            summary = "unknown";
                        }
                        pairArr[1] = new Pair("error", summary);
                        AnonymousClass0678.LIZ("pitaya_init", C2097608Jq.LJIIJ(pairArr));
                        ((IPitayaCore) ProbePitayaFieldCollector.LIZIZ.getValue()).requestUpdate(str, new PTYRequestConfig(true, null), new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.pipo.probe.core.infocollect.pitaya.ProbePitayaFieldCollector$prepare$1$onResult$1
                            @Override // com.bytedance.pitaya.api.PTYPackageCallback
                            public void onResult(boolean z2, PTYError pTYError2, PTYPackageInfo pTYPackageInfo2) {
                                String summary2;
                                if (z2) {
                                    AnonymousClass0678.LIZ("pitaya_init", C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "ready_after_download")));
                                    return;
                                }
                                Pair[] pairArr2 = new Pair[2];
                                pairArr2[0] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "fail_to_download");
                                if (pTYError2 == null || (summary2 = pTYError2.getSummary()) == null) {
                                    summary2 = "unknown";
                                }
                                pairArr2[1] = new Pair("error", summary2);
                                AnonymousClass0678.LIZ("pitaya_init", C2097608Jq.LJIIJ(pairArr2));
                            }
                        });
                        return;
                    }
                    AnonymousClass0678.LIZ("pitaya_init", C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "ready_without_download")));
                }
            });
        }
    }

    public static C202152147y LIZ(String str, String str2) {
        Map<String, Object> next;
        Object obj;
        String str3;
        IFeatureSchema iFeatureSchemaSharedFeatureSchema;
        JSONObject jSONObjectLIZIZ;
        PipoProbeSdkConfigSettings.PipoProbeSdkConfigModel pipoProbeSdkConfigModelLIZ = PipoProbeSdkConfigSettings.LIZ();
        Iterator<Map<String, Object>> it2 = pipoProbeSdkConfigModelLIZ.byEntrance.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.get("entrance"), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map<String, Object> map = next;
        if (map != null) {
            obj = map.get("pitaya_biz");
        } else {
            obj = null;
        }
        if (!(obj instanceof String) || (str3 = (String) obj) == null) {
            str3 = pipoProbeSdkConfigModelLIZ.common.pitayaBiz;
        }
        if (str3.length() == 0) {
            return null;
        }
        try {
            Object obj2 = "_";
            IFeatureCore iFeatureCore = (IFeatureCore) LIZ.getValue();
            if (iFeatureCore != null && (iFeatureSchemaSharedFeatureSchema = iFeatureCore.sharedFeatureSchema()) != null && (jSONObjectLIZIZ = iFeatureSchemaSharedFeatureSchema.LIZIZ(str3, Collections.singletonList(str2), null)) != null) {
                obj2 = jSONObjectLIZIZ;
            } else {
                AnonymousClass0678.LIZ("pitaya_collect", C2097608Jq.LJIIJ(new Pair("error", "feature not found")));
            }
            return new C202152147y(str2, obj2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                Pair[] pairArr = new Pair[1];
                String message = thM5exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                pairArr[0] = new Pair("error", message);
                AnonymousClass0678.LIZ("pitaya_collect", C2097608Jq.LJIIJ(pairArr));
                return null;
            }
            throw new C2197108jB();
        }
    }
}
