package com.bytedance.ttnet.diagnosis;

import X.C1490440ot8;
import X.C1493430oxx;
import X.C1493630oyH;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class TTNetDiagnosisService {
    public static final Map<Integer, String> sTypeStringMap;

    static {
        HashMap map = new HashMap();
        sTypeStringMap = map;
        map.put(0, "DNS_RESOLVE_TARGET");
        map.put(1, "RACE_TARGETS");
        map.put(2, "ACCELERATE_TARGET");
        map.put(3, "DIAGNOSE_TARGET");
        map.put(4, "DIAGNOSE_V2_TARGET");
        map.put(5, "RAW_DETECT_TARGETS");
    }

    public static C1493630oyH getCronetHttpClient() {
        if (C1493430oxx.LIZ()) {
            return C1493630oyH.LIZLLL(TTNetInit.getTTNetDepend().getContext());
        }
        throw new UnsupportedOperationException("Cronet is not enabled");
    }

    public static boolean isOneTargetRequestType(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i != 5) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Illegal request type: ");
                        sbLIZ.append(i);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void reportUserLog(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                if (getCronetHttpClient() != null) {
                    C1493630oyH.LIZIZ();
                    C1493630oyH.LIZJ.reportNetDiagnosisUserLog(str);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String requestTypeToString(int i) {
        return sTypeStringMap.get(Integer.valueOf(i));
    }

    public static boolean isValidNetDetect(int i, long j) {
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return true;
                }
                if (i != 5) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Illegal request type: ");
                    sbLIZ.append(i);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                if (j == 1 || j == 2 || j == 64) {
                    return true;
                }
                return false;
            }
        }
        if (((-1) & j) != 0 && (j & 0) == 0) {
            return true;
        }
        return false;
    }

    public static IDiagnosisRequest createRequest(int i, List<String> list, int i2, int i3) {
        if (!isOneTargetRequestType(i)) {
            if (isValidNetDetect(i, i2)) {
                if (i != 1 && i != 5) {
                    return null;
                }
                return new C1490440ot8(i, list, i2, 0, i3);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal netDetectType: ");
            sbLIZ.append(i2);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Type ");
        sbLIZ2.append(requestTypeToString(i));
        sbLIZ2.append(" of request should be created with only one target.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static IDiagnosisRequest createRequest(int i, String str, int i2, int i3) {
        return createRequest(i, str, i2, 0, i3);
    }

    public static IDiagnosisRequest createRequest(int i, String str, int i2, int i3, int i4) {
        if (isOneTargetRequestType(i)) {
            if (isValidNetDetect(i, i2)) {
                if (i != 0 && i != 2 && i != 3 && i != 4) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                return new C1490440ot8(i, arrayList, i2, i3, i4);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal netDetectType: ");
            sbLIZ.append(i2);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Type ");
        sbLIZ2.append(requestTypeToString(i));
        sbLIZ2.append(" of request should be created with multiple targets.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
