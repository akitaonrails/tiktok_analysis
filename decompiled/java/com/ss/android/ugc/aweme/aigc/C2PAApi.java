package com.ss.android.ugc.aweme.aigc;

import X.C080U;
import X.C0CHQ;
import X.C0X52;
import X.C0X9S;
import X.C123100dR;
import X.C140P;
import X.C1503950pEv;
import X.C201948140c;
import X.C2093608Ic;
import X.C2175508fh;
import X.C2188811AlT;
import X.InterfaceC1445350niP;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC2175608fi;
import X.InterfaceC2177008fw;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public final class C2PAApi {
    public static final Api LIZ = (Api) C0CHQ.LIZ().getNetworkService().createDefaultRetrofit(Api.class);
    public static final Api LIZIZ;

    /* JADX INFO: loaded from: classes5.dex */
    public interface Api {
        @InterfaceC1501170pAR("{path}")
        @InterfaceC1501310pAf({"Content-Type: application/json"})
        C0X9S<TypedInput> c2paSign(@InterfaceC1501060pAG(encode = true, value = "path") String str, @InterfaceC1485405rg TypedOutput typedOutput);

        @InterfaceC1501160pAQ("{path}")
        C0X9S<TypedInput> doGet(@InterfaceC1501060pAG(encode = true, value = "path") String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2, @InterfaceC2177008fw Object obj);
    }

    static {
        InterfaceC1445350niP networkService = C0CHQ.LIZ().getNetworkService();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C140P.LIZ().remoteCertHost);
        LIZIZ = (Api) networkService.createRetrofit(C2188811AlT.LIZIZ(sbLIZ), true, Api.class);
    }

    public static C201948140c LIZ(C0X52 c0x52) {
        String str;
        byte[] bArr = new byte[0];
        String str2 = "";
        if (!c0x52.LIZJ()) {
            str = "";
        } else {
            List<C080U> list = c0x52.LIZ.LIZLLL;
            if (list == null || list.isEmpty()) {
                str = "";
            } else {
                str = "";
                for (C080U c080u : c0x52.LIZ.LIZLLL) {
                    if (u.LJIJI("Content-Type", c080u.LIZ, true) && C123100dR.LIZ(c080u.LIZIZ)) {
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
                return new C201948140c(c0x52.LIZ.LIZIZ, th.toString(), str, new byte[0]);
            }
        }
        C2175508fh c2175508fh = c0x52.LIZ;
        long j = c2175508fh.LIZIZ;
        if (!C2093608Ic.LJ(c2175508fh.LJI)) {
            str2 = c0x52.LIZ.LJI;
        }
        return new C201948140c(j, str2, str, bArr);
    }
}
