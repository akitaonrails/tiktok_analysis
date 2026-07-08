package com.ss.android.ugc.aweme.trace;

import X.C0VGA;
import X.C2188811AlT;
import X.C807000VlC;
import X.C807040VlG;
import X.C807090VlL;
import X.C807140VlQ;
import X.C807160VlS;
import X.C807180VlU;
import X.C807280Vle;
import X.EnumC807060VlI;
import X.InterfaceC794700VFk;
import X.InterfaceC794770VFr;
import X.InterfaceC807030VlF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class AwemeTraceLogAdapter implements IAwemeTraceLogAdapter {
    public final C807040VlG LIZ = new C807040VlG();

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final String LJ() {
        return "traceparent";
    }

    public static boolean LJIIIIZZ() {
        return Intrinsics.LJFF(C0VGA.LIZ().globalEnable, Boolean.TRUE);
    }

    public static JSONObject LJII(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys;
        int iIntValue;
        Object objOpt;
        if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
            JSONObject jSONObject2 = new JSONObject();
            Integer num = C0VGA.LIZ().unsampledSingleParamMaxSize;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 100;
            }
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && (objOpt = jSONObject.opt(next)) != null) {
                    if (!C0VGA.LJ() && objOpt.toString().length() > iIntValue) {
                        jSONObject2.put(next, "length over limit");
                    } else {
                        jSONObject2.put(next, objOpt);
                    }
                }
            }
            return jSONObject2;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final String LIZ(String str) {
        InterfaceC807030VlF interfaceC807030VlF;
        String traceId;
        if (LJIIIIZZ() && str != null && str.length() != 0) {
            C807160VlS c807160VlS = C0VGA.LIZ.get(str);
            Object obj = null;
            if (c807160VlS != null) {
                obj = c807160VlS.LIZLLL;
            }
            if ((obj instanceof InterfaceC807030VlF) && (interfaceC807030VlF = (InterfaceC807030VlF) obj) != null && (traceId = interfaceC807030VlF.getTraceId()) != null) {
                return traceId;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final String LJFF(String str) {
        InterfaceC794700VFk interfaceC794700VFk;
        String strLIZIZ;
        if (LJIIIIZZ() && str != null && str.length() != 0) {
            C807040VlG c807040VlG = this.LIZ;
            c807040VlG.getClass();
            if (C0VGA.LIZLLL() && C0VGA.LJFF()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unsampled_");
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            C807090VlL c807090VlLLIZIZ = C0VGA.LIZIZ(str);
            if (c807090VlLLIZIZ != null) {
                c807040VlG.LIZ.getClass();
                Object obj = c807090VlLLIZIZ.LJFF;
                if ((obj instanceof InterfaceC794770VFr) && (interfaceC794700VFk = (InterfaceC794700VFk) obj) != null && (strLIZIZ = interfaceC794700VFk.LIZIZ()) != null) {
                    return strLIZIZ;
                }
                return "";
            }
            return "";
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0197  */
    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r11, org.json.JSONObject r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.trace.AwemeTraceLogAdapter.LIZLLL(java.lang.String, org.json.JSONObject):void");
    }

    public final boolean LJI(String str, JSONObject jSONObject) {
        String strLJFF = LJFF(str);
        if (strLJFF.length() == 0) {
            return false;
        }
        try {
            jSONObject.put("traceparent", strLJFF);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZIZ(JSONObject jSONObject, String str, boolean z) throws JSONException {
        String strOptString;
        JSONObject jSONObjectLJII;
        if (LJIIIIZZ()) {
            C807000VlC c807000VlC = C807000VlC.LIZ;
            List<String> list = C0VGA.LIZ().logEventBlacklist;
            c807000VlC.getClass();
            if (C807000VlC.LIZJ(str, list) || jSONObject == null || (strOptString = jSONObject.optString("traceparent")) == null || !LJI(strOptString, jSONObject)) {
                return;
            }
            C807280Vle c807280Vle = C807280Vle.LIZIZ;
            EnumC807060VlI enumC807060VlI = EnumC807060VlI.SLARDAR_EVENT_LOG;
            C807180VlU c807180VlU = new C807180VlU(strOptString);
            c807180VlU.LJII = z;
            c807180VlU.LJI = str;
            if (C0VGA.LIZLLL()) {
                jSONObjectLJII = LJII(jSONObject);
            } else {
                jSONObjectLJII = null;
            }
            c807180VlU.LIZJ = jSONObjectLJII;
            c807280Vle.LIZJ(enumC807060VlI, c807180VlU);
        }
    }

    @Override // com.ss.android.ugc.aweme.trace.IAwemeTraceLogAdapter
    public final void LIZJ(int i, String str, String str2, long j, String str3) throws JSONException {
        if (LJIIIIZZ() && str != null && str.length() != 0) {
            C807280Vle c807280Vle = C807280Vle.LIZIZ;
            EnumC807060VlI enumC807060VlI = EnumC807060VlI.SLARDAR_API_LOG;
            C807140VlQ c807140VlQ = new C807140VlQ(str);
            c807140VlQ.LJI = str2;
            c807140VlQ.LJII = i;
            c807140VlQ.LJIIIIZZ = j;
            c807140VlQ.LJIIIZ = str3;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("x-tt-logid", c807140VlQ.LJIIIZ);
            c807140VlQ.LIZJ = jSONObject;
            c807280Vle.LJIIIIZZ(enumC807060VlI, c807140VlQ);
        }
    }
}
