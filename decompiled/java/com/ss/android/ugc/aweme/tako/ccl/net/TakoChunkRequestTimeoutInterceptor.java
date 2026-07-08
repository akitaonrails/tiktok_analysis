package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C123100dR;
import X.C13BV;
import X.C1503760pEc;
import X.C15438062q;
import X.C1697810uHb;
import X.InterfaceC1904907d9;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.experiment.TakoDomainSwitchInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.experiment.TakoDomainSwitchModel;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class TakoChunkRequestTimeoutInterceptor implements InterfaceC1904907d9 {
    public final List<String> LL = C1697810uHb.LJIIJJI("1", "8", "9", "16");
    public final List<String> LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public TakoChunkRequestTimeoutInterceptor() {
        ?? arrayList;
        List<TakoDomainSwitchInfo> list;
        TakoDomainSwitchModel takoDomainSwitchModel = C1503760pEc.LIZ.LIZ.LIZ;
        if (takoDomainSwitchModel == null || (list = takoDomainSwitchModel.items) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (TakoDomainSwitchInfo takoDomainSwitchInfo : list) {
                TakoDomainSwitchInfo takoDomainSwitchInfo2 = takoDomainSwitchInfo;
                if (takoDomainSwitchInfo2.op > 0 && C123100dR.LIZ(takoDomainSwitchInfo2.domain) && (takoDomainSwitchInfo2.intervalTimeout > 0 || takoDomainSwitchInfo2.totalTimeout > 0)) {
                    arrayList2.add(takoDomainSwitchInfo);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((TakoDomainSwitchInfo) it2.next()).op));
            }
        }
        this.LLILLJJLI = arrayList;
    }

    public final Map<String, String> LIZ(Request request) {
        String string;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String strDecode = "";
        if (request != null) {
            try {
                try {
                    TypedOutput body = request.getBody();
                    if (body != null) {
                        body.writeTo(byteArrayOutputStream);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    string = "";
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw th;
                }
            }
        }
        string = byteArrayOutputStream.toString();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            strDecode = URLDecoder.decode(string, StandardCharsets.UTF_8.name());
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (C123100dR.LIZ(strDecode)) {
                Iterator it2 = a0.LJJLIIIJILLIZJL(strDecode, new String[]{"&"}, 0, 6).iterator();
                while (it2.hasNext()) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                    if (!listLJJLIIIJILLIZJL.isEmpty()) {
                        linkedHashMap.put(listLJJLIIIJILLIZJL.get(0), listLJJLIIIJILLIZJL.get(1));
                    }
                }
            }
        } catch (Exception e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    @Override // X.InterfaceC1904907d9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X52<?> intercept(X.InterfaceC841770X0l r12) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ccl.net.TakoChunkRequestTimeoutInterceptor.intercept(X.0X0l):X.0X52");
    }
}
