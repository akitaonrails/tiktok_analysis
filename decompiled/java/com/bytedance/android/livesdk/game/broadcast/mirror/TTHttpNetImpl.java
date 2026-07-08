package com.bytedance.android.livesdk.game.broadcast.mirror;

import X.AbstractC842530X3j;
import X.C080U;
import X.C0X0P;
import X.C0X52;
import X.C0X9S;
import X.C1515120pWw;
import X.C20441214yg;
import X.C2188811AlT;
import X.InterfaceC1485405rg;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import X.InterfaceC820680WHi;
import com.byted.cast.common.api.IHttpNetWork;
import com.byted.cast.common.api.Response;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class TTHttpNetImpl implements IHttpNetWork {
    public final ByteCastNetService LIZ = (ByteCastNetService) C1515120pWw.LJIILIIL("https://bytecast.tiktokv.com/").LIZ(ByteCastNetService.class);

    public interface ByteCastNetService {
        @InterfaceC1501160pAQ
        C0X9S<String> get(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC820680WHi boolean z);

        @InterfaceC1501170pAR
        C0X9S<String> post(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1485405rg AbstractC842530X3j abstractC842530X3j, @InterfaceC820680WHi boolean z);
    }

    public final String LIZ(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            } else {
                return sb.toString().trim();
            }
        }
    }

    public final Response doGet(String str, Map<String, String> map) {
        String strLIZ;
        String simpleName = TTHttpNetImpl.class.getSimpleName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doGet:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(simpleName, C2188811AlT.LIZIZ(sbLIZ));
        ByteCastNetService byteCastNetService = this.LIZ;
        if (map == null) {
            map = Collections.emptyMap();
        }
        C0X9S<String> c0x9s = byteCastNetService.get(str, map, true);
        try {
            C0X52<String> c0x52Execute = c0x9s.execute();
            HashMap map2 = new HashMap();
            for (C080U c080u : c0x52Execute.LIZ.LIZLLL) {
                map2.put(c080u.LIZ, c080u.LIZIZ);
            }
            if (c0x52Execute.LIZJ()) {
                strLIZ = c0x52Execute.LIZIZ;
            } else {
                strLIZ = LIZ(c0x52Execute.LIZJ.in());
            }
            Response response = new Response(map2, strLIZ, c0x52Execute.LIZ.LIZIZ, "");
            c0x9s.cancel();
            return response;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (c0x9s != null) {
                c0x9s.cancel();
            }
            throw th;
        }
    }

    public final Response doPost(String str, String str2, Map<String, String> map) {
        String strLIZ;
        String simpleName = TTHttpNetImpl.class.getSimpleName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doPost:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(simpleName, C2188811AlT.LIZIZ(sbLIZ));
        ByteCastNetService byteCastNetService = this.LIZ;
        if (map == null) {
            map = Collections.emptyMap();
        }
        C0X9S<String> c0x9sPost = byteCastNetService.post(str, map, AbstractC842530X3j.LIZJ(C0X0P.LIZJ("application/json"), str2), true);
        try {
            C0X52<String> c0x52Execute = c0x9sPost.execute();
            HashMap map2 = new HashMap();
            for (C080U c080u : c0x52Execute.LIZ.LIZLLL) {
                map2.put(c080u.LIZ, c080u.LIZIZ);
            }
            if (c0x52Execute.LIZJ()) {
                strLIZ = c0x52Execute.LIZIZ;
            } else {
                strLIZ = LIZ(c0x52Execute.LIZJ.in());
            }
            Response response = new Response(map2, strLIZ, c0x52Execute.LIZ.LIZIZ, "");
            c0x9sPost.cancel();
            return response;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (c0x9sPost != null) {
                c0x9sPost.cancel();
            }
            throw th;
        }
    }
}
