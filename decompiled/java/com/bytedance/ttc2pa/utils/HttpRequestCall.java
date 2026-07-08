package com.bytedance.ttc2pa.utils;

import X.C080U;
import X.C086I;
import X.C0X52;
import X.C1493620oyG;
import X.C1503950pEv;
import X.C1515120pWw;
import X.C2088908Gh;
import X.C2093608Ic;
import X.C2175508fh;
import X.C2188811AlT;
import android.util.Pair;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttc2pa.TTC2PA;
import com.bytedance.ttc2pa.TtC2paNetworkCaller;
import com.bytedance.ttc2pa.TtC2paNetworkResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class HttpRequestCall implements TtC2paNetworkCaller {
    public static final HttpRequestCall LIZ = new HttpRequestCall();

    public static TtC2paNetworkResponse LIZ(C0X52 c0x52) {
        String str;
        byte[] bArr = new byte[0];
        String str2 = "";
        if (!c0x52.LIZJ()) {
            str = "";
        } else {
            if (C086I.LIZIZ(c0x52.LIZ.LIZLLL)) {
                str = "";
            } else {
                str = "";
                for (C080U c080u : c0x52.LIZ.LIZLLL) {
                    if (u.LJIJI("Content-Type", c080u.LIZ, true) && !C2093608Ic.LJ(c080u.LIZIZ)) {
                        str = c080u.LIZIZ;
                    }
                }
            }
            try {
                C1503950pEv c1503950pEv = new C1503950pEv((int) ((TypedInput) c0x52.LIZIZ).length());
                byte[] bArr2 = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                InputStream inputStreamIn = ((TypedInput) c0x52.LIZIZ).in();
                while (true) {
                    int i = inputStreamIn.read(bArr2, 0, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                    if (i <= 0) {
                        break;
                    }
                    c1503950pEv.LIZ(bArr2, i);
                }
                int i2 = c1503950pEv.LIZIZ;
                bArr = new byte[i2];
                if (i2 > 0) {
                    System.arraycopy(c1503950pEv.LIZ, 0, bArr, 0, i2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return new TtC2paNetworkResponse(c0x52.LIZ.LIZIZ, th.toString(), str, new byte[0]);
            }
        }
        C2175508fh c2175508fh = c0x52.LIZ;
        long j = c2175508fh.LIZIZ;
        if (!C2093608Ic.LJ(c2175508fh.LJI)) {
            str2 = c0x52.LIZ.LJI;
        }
        return new TtC2paNetworkResponse(j, str2, str, bArr);
    }

    @Override // com.bytedance.ttc2pa.TtC2paNetworkCaller
    public final TtC2paNetworkResponse onRemoteSign(byte[] bArr) {
        TTC2PA.LIZ.getClass();
        return TTC2PA.LIZJ().onRemoteSign(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.ttc2pa.TtC2paNetworkResponse] */
    @Override // com.bytedance.ttc2pa.TtC2paNetworkCaller
    public final TtC2paNetworkResponse doPost(String str, Map<String, String> map, byte[] bArr, long j, boolean z) {
        int iLIZ = 0;
        if (C2093608Ic.LJ(str)) {
            return new TtC2paNetworkResponse(-1L, "URL empty", "", new byte[0]);
        }
        try {
            C1493620oyG c1493620oyG = new C1493620oyG();
            if (j > 0) {
                c1493620oyG.LIZJ = j;
                c1493620oyG.LJIIIIZZ = j;
                c1493620oyG.LIZLLL = j;
                c1493620oyG.LJ = j;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!C2093608Ic.LJ(key) && !C2093608Ic.LJ(value)) {
                    arrayList.add(new C080U(key, value));
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str, linkedHashMap);
            iLIZ = LIZ(((IC2paNetworkApi) C1515120pWw.LJIILIIL((String) pairLIZJ.first).LIZ(IC2paNetworkApi.class)).postBody(z, (String) pairLIZJ.second, new TypedByteArray("", bArr, new String[0]), arrayList, linkedHashMap, c1493620oyG).execute());
            return iLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("network request error, e:");
            sbLIZ.append(th);
            return new TtC2paNetworkResponse(-1L, C2188811AlT.LIZIZ(sbLIZ), "", new byte[iLIZ]);
        }
    }
}
